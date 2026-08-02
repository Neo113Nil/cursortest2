package ru.CryptoPro.JCP.pref;

import defpackage.ny61;
import defpackage.q3x;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Vector;
import java.util.prefs.BackingStoreException;
import java.util.prefs.InvalidPreferencesFormatException;
import java.util.prefs.NodeChangeListener;
import java.util.prefs.PreferenceChangeListener;
import java.util.prefs.Preferences;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.params.OID;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.Platform;

/* loaded from: classes4.dex */
public class JCPPref {
    public static final boolean b;
    public static final boolean c;
    public Preferences a;

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r1 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004e, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0055, code lost:
    
        if (r1 != null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r4 == null) goto L35;
     */
    static {
        Process process;
        boolean z = true;
        if (Platform.isMacOS()) {
            InputStream inputStream = null;
            try {
                process = Runtime.getRuntime().exec("id -u");
            } catch (Exception unused) {
                process = null;
            } catch (Throwable th) {
                th = th;
                process = null;
            }
            try {
                if (process.waitFor() == 0) {
                    inputStream = process.getInputStream();
                    String readLine = new BufferedReader(new InputStreamReader(inputStream)).readLine();
                    if (readLine != null) {
                        JCPLogger.info("user: ".concat(readLine));
                        if (!readLine.equals("0")) {
                            if (!readLine.equalsIgnoreCase("root")) {
                                z = false;
                            }
                        }
                    }
                }
            } catch (Exception unused2) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused3) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (IOException unused4) {
                    }
                }
                if (process == null) {
                    throw th;
                }
                process.destroy();
                throw th;
            }
        }
        b = z;
        c = GetProperty.getBooleanProperty("use_jcp_filesystem_pref_factory", false);
        process.destroy();
        b = z;
        c = GetProperty.getBooleanProperty("use_jcp_filesystem_pref_factory", false);
    }

    public JCPPref(boolean z, Class cls) {
        Preferences node;
        boolean z2 = c;
        if (z) {
            Preferences userRoot = (Platform.isAndroid && z2) ? q3x.a.userRoot() : Preferences.userRoot();
            if (cls.isArray()) {
                ny61.g("Arrays have no associated preferences node");
                throw null;
            }
            node = userRoot.node(a(cls.getName()));
        } else {
            Preferences systemRoot = (Platform.isAndroid && z2) ? q3x.a.systemRoot() : Preferences.systemRoot();
            if (cls.isArray()) {
                ny61.g("Arrays have no associated preferences node");
                throw null;
            }
            node = systemRoot.node(a(cls.getName()));
        }
        this.a = node;
    }

    public static String a(String str) {
        String str2 = new String(str);
        int lastIndexOf = str2.lastIndexOf(46);
        if (lastIndexOf < 0) {
            return "/<unnamed>";
        }
        return "/" + str2.substring(0, lastIndexOf).replace('.', '/');
    }

    public static JCPPref getUser(Class cls) {
        return new JCPPref(true, cls);
    }

    public static void importPreferences(InputStream inputStream) throws IOException, InvalidPreferencesFormatException {
        Preferences.importPreferences(inputStream);
    }

    public String absolutePath() {
        return this.a.absolutePath();
    }

    public void addNodeChangeListener(NodeChangeListener nodeChangeListener) {
        this.a.addNodeChangeListener(nodeChangeListener);
    }

    public void addPreferenceChangeListener(PreferenceChangeListener preferenceChangeListener) {
        this.a.addPreferenceChangeListener(preferenceChangeListener);
    }

    public String[] childrenNames() throws BackingStoreException {
        Preferences preferences = this.a;
        preferences.sync();
        return preferences.childrenNames();
    }

    public void clear(String str) throws BackingStoreException {
        this.a.sync();
        String[] keys = keys();
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].startsWith(str)) {
                remove(keys[i].substring(str.length()));
            }
        }
    }

    public void exportNode(OutputStream outputStream) throws IOException, BackingStoreException {
        Preferences preferences = this.a;
        preferences.sync();
        preferences.exportNode(outputStream);
    }

    public void exportSubtree(OutputStream outputStream) throws IOException, BackingStoreException {
        Preferences preferences = this.a;
        preferences.sync();
        preferences.exportSubtree(outputStream);
    }

    public void flush() throws BackingStoreException {
        Preferences preferences = this.a;
        preferences.sync();
        preferences.flush();
    }

    public String get(String str, String str2) {
        Preferences preferences = this.a;
        String str3 = preferences.get(str, str2);
        JCPLogger.pref(preferences, str, str3);
        return str3;
    }

    public boolean getBoolean(String str, boolean z) {
        Preferences preferences = this.a;
        boolean z2 = preferences.getBoolean(str, z);
        JCPLogger.pref(preferences, str, Boolean.valueOf(z2));
        return z2;
    }

    public byte[] getByteArray(String str, byte[] bArr) {
        Preferences preferences = this.a;
        byte[] byteArray = preferences.getByteArray(str, bArr);
        JCPLogger.pref(preferences, str, byteArray);
        return byteArray;
    }

    public byte[] getByteArraySilent(String str, byte[] bArr) {
        return this.a.getByteArray(str, bArr);
    }

    public double getDouble(String str, double d) {
        Preferences preferences = this.a;
        double d2 = preferences.getDouble(str, d);
        JCPLogger.pref(preferences, str, new Double(d2));
        return d2;
    }

    public float getFloat(String str, float f) {
        Preferences preferences = this.a;
        float f2 = preferences.getFloat(str, f);
        JCPLogger.pref(preferences, str, new Float(f2));
        return f2;
    }

    public int getInt(String str, int i) {
        Preferences preferences = this.a;
        int i2 = preferences.getInt(str, i);
        JCPLogger.pref(preferences, str, new Integer(i2));
        return i2;
    }

    public long getLong(String str, long j) {
        Preferences preferences = this.a;
        long j2 = preferences.getLong(str, j);
        JCPLogger.pref(preferences, str, new Long(j2));
        return j2;
    }

    public OID getOID(String str, OID oid) {
        Preferences preferences = this.a;
        String str2 = preferences.get("OID" + str, null);
        if (str2 == null) {
            JCPLogger.pref(preferences, str, oid);
            return oid;
        }
        JCPLogger.pref(preferences, str, str2);
        return new OID(str2);
    }

    public String getWithoutLogger(String str, String str2) {
        return this.a.get(str, str2);
    }

    public boolean isUserNode() {
        return this.a.isUserNode();
    }

    public boolean isWriteAvailable() {
        if (Platform.isMacOS()) {
            return b;
        }
        try {
            putInt("not_existing_key", 0);
            flush();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public String[] keys(String str) throws BackingStoreException {
        String[] keys = keys();
        Vector vector = new Vector(0);
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].startsWith(str)) {
                vector.add(keys[i]);
            }
        }
        String[] strArr = new String[vector.size()];
        for (int i2 = 0; i2 < vector.size(); i2++) {
            strArr[i2] = (String) vector.elementAt(i2);
        }
        return strArr;
    }

    public String name() {
        return this.a.name();
    }

    public Preferences node(String str) {
        return this.a.node(str);
    }

    public boolean nodeExists(String str) throws BackingStoreException {
        sync();
        return this.a.nodeExists(str);
    }

    public JCPPref parent() {
        Preferences parent = this.a.parent();
        JCPPref jCPPref = new JCPPref();
        jCPPref.a = parent;
        return jCPPref;
    }

    public void put(String str, String str2) {
        this.a.put(str, str2);
    }

    public void putBoolean(String str, boolean z) {
        this.a.putBoolean(str, z);
    }

    public void putByteArray(String str, byte[] bArr) {
        this.a.putByteArray(str, bArr);
    }

    public void putDouble(String str, double d) {
        this.a.putDouble(str, d);
    }

    public void putFloat(String str, float f) {
        this.a.putFloat(str, f);
    }

    public void putInt(String str, int i) {
        this.a.putInt(str, i);
    }

    public void putLong(String str, long j) {
        this.a.putLong(str, j);
    }

    public void putOID(String str, OID oid) {
        String oid2 = oid.toString();
        this.a.put("OID" + str, oid2);
    }

    public void remove(String str) {
        this.a.remove(str);
    }

    public void removeNode() throws BackingStoreException {
        Preferences preferences = this.a;
        preferences.sync();
        preferences.removeNode();
    }

    public void removeNodeChangeListener(NodeChangeListener nodeChangeListener) {
        this.a.removeNodeChangeListener(nodeChangeListener);
    }

    public void removePreferenceChangeListener(PreferenceChangeListener preferenceChangeListener) {
        this.a.removePreferenceChangeListener(preferenceChangeListener);
    }

    public void sync() throws BackingStoreException {
        this.a.sync();
    }

    public String toString() {
        return this.a.toString();
    }

    public static JCPPref getUser(String str) {
        return new JCPPref(str, true);
    }

    public void clear() throws BackingStoreException {
        Preferences preferences = this.a;
        preferences.sync();
        preferences.clear();
    }

    public String[] keys() throws BackingStoreException {
        return this.a.keys();
    }

    public JCPPref(String str) {
        this(str, false);
    }

    public JCPPref(String str, boolean z) {
        Preferences node;
        boolean z2 = c;
        if (z) {
            node = ((Platform.isAndroid && z2) ? q3x.a.userRoot() : Preferences.userRoot()).node(a(str));
        } else {
            node = ((Platform.isAndroid && z2) ? q3x.a.systemRoot() : Preferences.systemRoot()).node(a(str));
        }
        this.a = node;
    }

    public JCPPref(Class cls) {
        this(false, cls);
    }
}
