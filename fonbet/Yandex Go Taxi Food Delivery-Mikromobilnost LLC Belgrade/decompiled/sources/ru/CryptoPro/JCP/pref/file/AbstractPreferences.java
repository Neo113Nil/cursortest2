package ru.CryptoPro.JCP.pref.file;

import defpackage.ny61;
import defpackage.oyr;
import defpackage.unr0;
import defpackage.w511;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.EventObject;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Objects;
import java.util.StringTokenizer;
import java.util.TreeSet;
import java.util.prefs.BackingStoreException;
import java.util.prefs.NodeChangeEvent;
import java.util.prefs.NodeChangeListener;
import java.util.prefs.PreferenceChangeEvent;
import java.util.prefs.PreferenceChangeListener;
import java.util.prefs.Preferences;

/* loaded from: classes4.dex */
abstract class AbstractPreferences extends Preferences {
    public static final String[] i = new String[0];
    public static final AbstractPreferences[] j = new AbstractPreferences[0];
    public static final LinkedList k = new LinkedList();
    public static Thread l = null;
    public final String a;
    public final String b;
    public final AbstractPreferences c;
    public final AbstractPreferences d;
    protected boolean newNode = false;
    public final HashMap e = new HashMap();
    public boolean f = false;
    public PreferenceChangeListener[] g = new PreferenceChangeListener[0];
    public NodeChangeListener[] h = new NodeChangeListener[0];
    protected final Object lock = new Object();

    public static class EventDispatchThread extends Thread {
        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            LinkedList linkedList;
            int i;
            EventObject eventObject;
            PreferenceChangeListener[] preferenceChangeListenerArr;
            NodeChangeListener[] nodeChangeListenerArr;
            while (true) {
                synchronized (AbstractPreferences.k) {
                    while (true) {
                        try {
                            try {
                                linkedList = AbstractPreferences.k;
                                if (!linkedList.isEmpty()) {
                                    break;
                                } else {
                                    linkedList.wait();
                                }
                            } catch (InterruptedException unused) {
                                return;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    i = 0;
                    eventObject = (EventObject) linkedList.remove(0);
                }
                AbstractPreferences abstractPreferences = (AbstractPreferences) eventObject.getSource();
                if (eventObject instanceof PreferenceChangeEvent) {
                    PreferenceChangeEvent preferenceChangeEvent = (PreferenceChangeEvent) eventObject;
                    synchronized (abstractPreferences.lock) {
                        preferenceChangeListenerArr = abstractPreferences.g;
                    }
                    while (i < preferenceChangeListenerArr.length) {
                        preferenceChangeListenerArr[i].preferenceChange(preferenceChangeEvent);
                        i++;
                    }
                } else {
                    NodeChangeEvent nodeChangeEvent = (NodeChangeEvent) eventObject;
                    synchronized (abstractPreferences.lock) {
                        nodeChangeListenerArr = abstractPreferences.h;
                    }
                    if (nodeChangeEvent instanceof NodeAddedEvent) {
                        while (i < nodeChangeListenerArr.length) {
                            nodeChangeListenerArr[i].childAdded(nodeChangeEvent);
                            i++;
                        }
                    } else {
                        while (i < nodeChangeListenerArr.length) {
                            nodeChangeListenerArr[i].childRemoved(nodeChangeEvent);
                            i++;
                        }
                    }
                }
            }
        }
    }

    public class NodeAddedEvent extends NodeChangeEvent {
        private static final long serialVersionUID = -6743557530157328528L;

        public NodeAddedEvent(Preferences preferences, Preferences preferences2) {
            super(preferences, preferences2);
        }
    }

    public class NodeRemovedEvent extends NodeChangeEvent {
        private static final long serialVersionUID = 8735497392918824837L;

        public NodeRemovedEvent(Preferences preferences, Preferences preferences2) {
            super(preferences, preferences2);
        }
    }

    public AbstractPreferences(AbstractPreferences abstractPreferences, String str) {
        if (abstractPreferences == null) {
            if (!str.equals("")) {
                ny61.g(oyr.p("Root name '", str, "' must be \"\""));
                throw null;
            }
            this.b = "/";
            this.d = this;
        } else {
            if (str.indexOf(47) != -1) {
                ny61.g(oyr.p("Name '", str, "' contains '/'"));
                throw null;
            }
            if (str.equals("")) {
                ny61.g("Illegal name: empty string");
                throw null;
            }
            AbstractPreferences abstractPreferences2 = abstractPreferences.d;
            this.d = abstractPreferences2;
            this.b = abstractPreferences == abstractPreferences2 ? "/".concat(str) : unr0.r(new StringBuilder(), abstractPreferences.absolutePath(), "/", str);
        }
        this.a = str;
        this.c = abstractPreferences;
    }

    public static synchronized void g() {
        synchronized (AbstractPreferences.class) {
            if (l == null) {
                EventDispatchThread eventDispatchThread = new EventDispatchThread();
                l = eventDispatchThread;
                eventDispatchThread.setDaemon(true);
                l.start();
            }
        }
    }

    public final Preferences a(StringTokenizer stringTokenizer) {
        String nextToken = stringTokenizer.nextToken();
        if (nextToken.equals("/")) {
            ny61.g("Consecutive slashes in path");
            return null;
        }
        synchronized (this.lock) {
            try {
                AbstractPreferences abstractPreferences = (AbstractPreferences) this.e.get(nextToken);
                if (abstractPreferences == null) {
                    if (nextToken.length() > 80) {
                        throw new IllegalArgumentException("Node name " + nextToken + " too long");
                    }
                    abstractPreferences = childSpi(nextToken);
                    if (abstractPreferences.newNode && this.h.length != 0) {
                        LinkedList linkedList = k;
                        synchronized (linkedList) {
                            linkedList.add(new NodeAddedEvent(this, abstractPreferences));
                            linkedList.notify();
                        }
                    }
                    this.e.put(nextToken, abstractPreferences);
                }
                if (!stringTokenizer.hasMoreTokens()) {
                    return abstractPreferences;
                }
                stringTokenizer.nextToken();
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new IllegalArgumentException("Path ends with slash");
                }
                return abstractPreferences.a(stringTokenizer);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.prefs.Preferences
    public String absolutePath() {
        return this.b;
    }

    @Override // java.util.prefs.Preferences
    public void addNodeChangeListener(NodeChangeListener nodeChangeListener) {
        if (nodeChangeListener == null) {
            ny61.t("Change listener is null.");
            return;
        }
        synchronized (this.lock) {
            try {
                if (this.f) {
                    throw new IllegalStateException("Node has been removed.");
                }
                NodeChangeListener[] nodeChangeListenerArr = this.h;
                if (nodeChangeListenerArr == null) {
                    this.h = new NodeChangeListener[]{nodeChangeListener};
                } else {
                    NodeChangeListener[] nodeChangeListenerArr2 = new NodeChangeListener[nodeChangeListenerArr.length + 1];
                    this.h = nodeChangeListenerArr2;
                    System.arraycopy(nodeChangeListenerArr, 0, nodeChangeListenerArr2, 0, nodeChangeListenerArr.length);
                    this.h[nodeChangeListenerArr.length] = nodeChangeListener;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        g();
    }

    @Override // java.util.prefs.Preferences
    public void addPreferenceChangeListener(PreferenceChangeListener preferenceChangeListener) {
        if (preferenceChangeListener == null) {
            ny61.t("Change listener is null.");
            return;
        }
        synchronized (this.lock) {
            if (this.f) {
                throw new IllegalStateException("Node has been removed.");
            }
            PreferenceChangeListener[] preferenceChangeListenerArr = this.g;
            PreferenceChangeListener[] preferenceChangeListenerArr2 = new PreferenceChangeListener[preferenceChangeListenerArr.length + 1];
            this.g = preferenceChangeListenerArr2;
            System.arraycopy(preferenceChangeListenerArr, 0, preferenceChangeListenerArr2, 0, preferenceChangeListenerArr.length);
            this.g[preferenceChangeListenerArr.length] = preferenceChangeListener;
        }
        g();
    }

    public final void b(String str, String str2) {
        if (this.g.length != 0) {
            LinkedList linkedList = k;
            synchronized (linkedList) {
                linkedList.add(new PreferenceChangeEvent(this, str, str2));
                linkedList.notify();
            }
        }
    }

    public final boolean c(StringTokenizer stringTokenizer) {
        String nextToken = stringTokenizer.nextToken();
        if (nextToken.equals("/")) {
            ny61.g("Consecutive slashes in path");
            return false;
        }
        synchronized (this.lock) {
            try {
                AbstractPreferences abstractPreferences = (AbstractPreferences) this.e.get(nextToken);
                if (abstractPreferences == null) {
                    abstractPreferences = getChild(nextToken);
                }
                if (abstractPreferences == null) {
                    return false;
                }
                if (!stringTokenizer.hasMoreTokens()) {
                    return true;
                }
                stringTokenizer.nextToken();
                if (!stringTokenizer.hasMoreTokens()) {
                    throw new IllegalArgumentException("Path ends with slash");
                }
                return abstractPreferences.c(stringTokenizer);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AbstractPreferences[] cachedChildren() {
        return (AbstractPreferences[]) this.e.values().toArray(j);
    }

    public abstract AbstractPreferences childSpi(String str);

    @Override // java.util.prefs.Preferences
    public String[] childrenNames() throws BackingStoreException {
        String[] strArr;
        synchronized (this.lock) {
            try {
                if (this.f) {
                    throw new IllegalStateException("Node has been removed.");
                }
                TreeSet treeSet = new TreeSet(this.e.keySet());
                for (String str : childrenNamesSpi()) {
                    treeSet.add(str);
                }
                strArr = (String[]) treeSet.toArray(i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return strArr;
    }

    public abstract String[] childrenNamesSpi() throws BackingStoreException;

    @Override // java.util.prefs.Preferences
    public void clear() throws BackingStoreException {
        synchronized (this.lock) {
            try {
                for (String str : keys()) {
                    remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        HashMap hashMap;
        synchronized (this.lock) {
            try {
                if (this.f) {
                    throw new IllegalStateException("Node already removed.");
                }
                String[] childrenNamesSpi = childrenNamesSpi();
                int i2 = 0;
                while (true) {
                    int length = childrenNamesSpi.length;
                    hashMap = this.e;
                    if (i2 >= length) {
                        break;
                    }
                    if (!hashMap.containsKey(childrenNamesSpi[i2])) {
                        HashMap hashMap2 = this.e;
                        String str = childrenNamesSpi[i2];
                        hashMap2.put(str, childSpi(str));
                    }
                    i2++;
                }
                Iterator it = hashMap.values().iterator();
                while (it.hasNext()) {
                    try {
                        ((AbstractPreferences) it.next()).d();
                        it.remove();
                    } catch (BackingStoreException unused) {
                    }
                }
                removeNodeSpi();
                this.f = true;
                AbstractPreferences abstractPreferences = this.c;
                if (abstractPreferences.h.length != 0) {
                    LinkedList linkedList = k;
                    synchronized (linkedList) {
                        linkedList.add(abstractPreferences.new NodeRemovedEvent(abstractPreferences, this));
                        linkedList.notify();
                    }
                }
            } finally {
            }
        }
    }

    public final void e() {
        AbstractPreferences[] cachedChildren;
        synchronized (this.lock) {
            if (this.f) {
                throw new IllegalStateException("Node has been removed");
            }
            syncSpi();
            cachedChildren = cachedChildren();
        }
        for (AbstractPreferences abstractPreferences : cachedChildren) {
            abstractPreferences.e();
        }
    }

    @Override // java.util.prefs.Preferences
    public void exportNode(OutputStream outputStream) throws IOException, BackingStoreException {
        XmlSupport.d(outputStream, this, false);
    }

    @Override // java.util.prefs.Preferences
    public void exportSubtree(OutputStream outputStream) throws IOException, BackingStoreException {
        XmlSupport.d(outputStream, this, true);
    }

    public final void f() {
        synchronized (this.lock) {
            try {
                flushSpi();
                if (this.f) {
                    return;
                }
                for (AbstractPreferences abstractPreferences : cachedChildren()) {
                    abstractPreferences.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.prefs.Preferences
    public void flush() throws BackingStoreException {
        f();
    }

    public abstract void flushSpi() throws BackingStoreException;

    @Override // java.util.prefs.Preferences
    public String get(String str, String str2) {
        String str3 = null;
        if (str == null) {
            ny61.t("Null key");
            return null;
        }
        synchronized (this.lock) {
            if (this.f) {
                throw new IllegalStateException("Node has been removed.");
            }
            try {
                str3 = getSpi(str);
            } catch (Exception unused) {
            }
            if (str3 != null) {
                str2 = str3;
            }
        }
        return str2;
    }

    @Override // java.util.prefs.Preferences
    public boolean getBoolean(String str, boolean z) {
        String str2 = get(str, null);
        if (str2 != null) {
            if (str2.equalsIgnoreCase("true")) {
                return true;
            }
            if (str2.equalsIgnoreCase("false")) {
                return false;
            }
        }
        return z;
    }

    @Override // java.util.prefs.Preferences
    public byte[] getByteArray(String str, byte[] bArr) {
        String str2 = get(str, null);
        if (str2 != null) {
            try {
                return Base64.c(str2, false);
            } catch (RuntimeException unused) {
            }
        }
        return bArr;
    }

    public AbstractPreferences getChild(String str) throws BackingStoreException {
        synchronized (this.lock) {
            try {
                String[] childrenNames = childrenNames();
                for (int i2 = 0; i2 < childrenNames.length; i2++) {
                    if (childrenNames[i2].equals(str)) {
                        return childSpi(childrenNames[i2]);
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.prefs.Preferences
    public double getDouble(String str, double d) {
        try {
            String str2 = get(str, null);
            if (str2 != null) {
                return Double.parseDouble(str2);
            }
        } catch (NumberFormatException unused) {
        }
        return d;
    }

    @Override // java.util.prefs.Preferences
    public float getFloat(String str, float f) {
        try {
            String str2 = get(str, null);
            if (str2 != null) {
                return Float.parseFloat(str2);
            }
        } catch (NumberFormatException unused) {
        }
        return f;
    }

    @Override // java.util.prefs.Preferences
    public int getInt(String str, int i2) {
        try {
            String str2 = get(str, null);
            if (str2 != null) {
                return Integer.parseInt(str2);
            }
        } catch (NumberFormatException unused) {
        }
        return i2;
    }

    @Override // java.util.prefs.Preferences
    public long getLong(String str, long j2) {
        try {
            String str2 = get(str, null);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
        } catch (NumberFormatException unused) {
        }
        return j2;
    }

    public abstract String getSpi(String str);

    public boolean isRemoved() {
        boolean z;
        synchronized (this.lock) {
            z = this.f;
        }
        return z;
    }

    @Override // java.util.prefs.Preferences
    public boolean isUserNode() {
        return ((Boolean) AccessController.doPrivileged(new PrivilegedAction() { // from class: ru.CryptoPro.JCP.pref.file.AbstractPreferences.1
            @Override // java.security.PrivilegedAction
            public Boolean run() {
                return Boolean.valueOf(AbstractPreferences.this.d == Preferences.userRoot());
            }
        })).booleanValue();
    }

    @Override // java.util.prefs.Preferences
    public String[] keys() throws BackingStoreException {
        String[] keysSpi;
        synchronized (this.lock) {
            try {
                if (this.f) {
                    throw new IllegalStateException("Node has been removed.");
                }
                keysSpi = keysSpi();
            } catch (Throwable th) {
                throw th;
            }
        }
        return keysSpi;
    }

    public abstract String[] keysSpi() throws BackingStoreException;

    @Override // java.util.prefs.Preferences
    public String name() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.prefs.Preferences] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // java.util.prefs.Preferences
    public Preferences node(String str) {
        synchronized (this.lock) {
            try {
                if (this.f) {
                    throw new IllegalStateException("Node has been removed.");
                }
                ?? r4 = this;
                if (!str.equals("")) {
                    if (str.equals("/")) {
                        r4 = this.d;
                    } else {
                        if (str.charAt(0) == '/') {
                            return this.d.a(new StringTokenizer(str.substring(1), "/", true));
                        }
                        r4 = a(new StringTokenizer(str, "/", true));
                    }
                }
                return r4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.prefs.Preferences
    public boolean nodeExists(String str) throws BackingStoreException {
        synchronized (this.lock) {
            try {
                boolean equals = str.equals("");
                boolean z = this.f;
                if (equals) {
                    return !z;
                }
                if (z) {
                    throw new IllegalStateException("Node has been removed.");
                }
                if (str.equals("/")) {
                    return true;
                }
                if (str.charAt(0) == '/') {
                    return this.d.c(new StringTokenizer(str.substring(1), "/", true));
                }
                return c(new StringTokenizer(str, "/", true));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.prefs.Preferences
    public Preferences parent() {
        AbstractPreferences abstractPreferences;
        synchronized (this.lock) {
            try {
                if (this.f) {
                    throw new IllegalStateException("Node has been removed.");
                }
                abstractPreferences = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return abstractPreferences;
    }

    @Override // java.util.prefs.Preferences
    public void put(String str, String str2) {
        String concat;
        if (str == null || str2 == null) {
            throw null;
        }
        if (str.length() > 80) {
            concat = "Key too long: ".concat(str);
        } else {
            if (str2.length() <= 8192) {
                synchronized (this.lock) {
                    try {
                        if (this.f) {
                            throw new IllegalStateException("Node has been removed.");
                        }
                        putSpi(str, str2);
                        b(str, str2);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
            }
            concat = "Value too long: ".concat(str2);
        }
        ny61.g(concat);
    }

    @Override // java.util.prefs.Preferences
    public void putBoolean(String str, boolean z) {
        put(str, String.valueOf(z));
    }

    @Override // java.util.prefs.Preferences
    public void putByteArray(String str, byte[] bArr) {
        put(str, Base64.b(bArr, false));
    }

    @Override // java.util.prefs.Preferences
    public void putDouble(String str, double d) {
        put(str, Double.toString(d));
    }

    @Override // java.util.prefs.Preferences
    public void putFloat(String str, float f) {
        put(str, Float.toString(f));
    }

    @Override // java.util.prefs.Preferences
    public void putInt(String str, int i2) {
        put(str, Integer.toString(i2));
    }

    @Override // java.util.prefs.Preferences
    public void putLong(String str, long j2) {
        put(str, Long.toString(j2));
    }

    public abstract void putSpi(String str, String str2);

    @Override // java.util.prefs.Preferences
    public void remove(String str) {
        Objects.requireNonNull(str, "Specified key cannot be null");
        synchronized (this.lock) {
            try {
                if (this.f) {
                    throw new IllegalStateException("Node has been removed.");
                }
                removeSpi(str);
                b(str, null);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.util.prefs.Preferences
    public void removeNode() throws BackingStoreException {
        if (this == this.d) {
            w511.x("Can't remove the root!");
            return;
        }
        synchronized (this.c.lock) {
            d();
            this.c.e.remove(this.a);
        }
    }

    @Override // java.util.prefs.Preferences
    public void removeNodeChangeListener(NodeChangeListener nodeChangeListener) {
        NodeChangeListener[] nodeChangeListenerArr;
        synchronized (this.lock) {
            try {
                if (this.f) {
                    throw new IllegalStateException("Node has been removed.");
                }
                NodeChangeListener[] nodeChangeListenerArr2 = this.h;
                if (nodeChangeListenerArr2 == null || nodeChangeListenerArr2.length == 0) {
                    throw new IllegalArgumentException("Listener not registered.");
                }
                int i2 = 0;
                while (true) {
                    nodeChangeListenerArr = this.h;
                    if (i2 >= nodeChangeListenerArr.length || nodeChangeListenerArr[i2] == nodeChangeListener) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 == nodeChangeListenerArr.length) {
                    throw new IllegalArgumentException("Listener not registered.");
                }
                int length = nodeChangeListenerArr.length - 1;
                NodeChangeListener[] nodeChangeListenerArr3 = new NodeChangeListener[length];
                if (i2 != 0) {
                    System.arraycopy(nodeChangeListenerArr, 0, nodeChangeListenerArr3, 0, i2);
                }
                if (i2 != length) {
                    System.arraycopy(this.h, i2 + 1, nodeChangeListenerArr3, i2, length - i2);
                }
                this.h = nodeChangeListenerArr3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void removeNodeSpi() throws BackingStoreException;

    @Override // java.util.prefs.Preferences
    public void removePreferenceChangeListener(PreferenceChangeListener preferenceChangeListener) {
        synchronized (this.lock) {
            try {
                if (this.f) {
                    throw new IllegalStateException("Node has been removed.");
                }
                PreferenceChangeListener[] preferenceChangeListenerArr = this.g;
                if (preferenceChangeListenerArr == null || preferenceChangeListenerArr.length == 0) {
                    throw new IllegalArgumentException("Listener not registered.");
                }
                int length = preferenceChangeListenerArr.length - 1;
                PreferenceChangeListener[] preferenceChangeListenerArr2 = new PreferenceChangeListener[length];
                int i2 = 0;
                while (i2 < length) {
                    PreferenceChangeListener preferenceChangeListener2 = this.g[i2];
                    if (preferenceChangeListener2 == preferenceChangeListener) {
                        break;
                    }
                    preferenceChangeListenerArr2[i2] = preferenceChangeListener2;
                    i2++;
                }
                if (i2 == length && this.g[i2] != preferenceChangeListener) {
                    throw new IllegalArgumentException("Listener not registered.");
                }
                while (i2 < length) {
                    int i3 = i2 + 1;
                    preferenceChangeListenerArr2[i2] = this.g[i3];
                    i2 = i3;
                }
                this.g = preferenceChangeListenerArr2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void removeSpi(String str);

    @Override // java.util.prefs.Preferences
    public void sync() throws BackingStoreException {
        e();
    }

    public abstract void syncSpi() throws BackingStoreException;

    @Override // java.util.prefs.Preferences
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(isUserNode() ? "User" : "System");
        sb.append(" Preference Node: ");
        sb.append(absolutePath());
        return sb.toString();
    }
}
