package ru.CryptoPro.JCSP.KeyStore;

import defpackage.jy4;
import defpackage.vno;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import ru.CryptoPro.JCP.Util.GetProperty;
import ru.CryptoPro.JCP.tools.ActionTools;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.ClassConfig;
import ru.CryptoPro.JCSP.JCSP;
import ru.CryptoPro.JCSP.JCSPLogger;
import ru.CryptoPro.JCSP.MSCAPI.ReaderInfo;
import ru.CryptoPro.JCSP.MSCAPI.cl_7;

/* loaded from: classes4.dex */
public abstract class KeyStoreConfigBase {
    public static final String EXC_INVALID_CONFIG = "Invalid store configuration";
    public static final String STORE_PACKAGE = "ru.CryptoPro.JCSP.KeyStore.stores.";
    private static final boolean g = GetProperty.getBooleanProperty("use_key_store_config_cache", false);
    private String b = "";
    private final Vector c = new Vector();
    private final Vector d = new Vector();
    private final Vector e = new Vector();
    private final Object f = new Object();
    protected final List a = new ArrayList();

    public KeyStoreConfigBase() {
        a(a(), 20);
        load();
    }

    private static String a(List list) {
        if (!JCSPLogger.isFinerEnabled()) {
            return " [] ";
        }
        StringBuffer stringBuffer = new StringBuffer("[");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cl_7 cl_7Var = (cl_7) it.next();
            stringBuffer.append("[name: ");
            stringBuffer.append(cl_7Var.a);
            stringBuffer.append(", type: ");
            stringBuffer.append(cl_7Var.b);
            stringBuffer.append("], ");
        }
        stringBuffer.append("]");
        return stringBuffer.toString();
    }

    public static AbstractCollection convert(String str) {
        return a(str, new boolean[]{true});
    }

    private Vector e() {
        Vector vector;
        synchronized (this.f) {
            vector = this.e;
        }
        return vector;
    }

    public static List getProviders(int i) {
        KeyStoreConfigBase keyStoreConfigEDDSA;
        if (KeyStoreConfig.getSupportedProviderTypes().contains(Integer.valueOf(i))) {
            keyStoreConfigEDDSA = KeyStoreConfig.getInstance();
        } else if (KeyStoreConfigRSA.getSupportedProviderTypes().contains(Integer.valueOf(i))) {
            keyStoreConfigEDDSA = KeyStoreConfigRSA.getInstance();
        } else if (KeyStoreConfigECDSA.getSupportedProviderTypes().contains(Integer.valueOf(i))) {
            keyStoreConfigEDDSA = KeyStoreConfigECDSA.getInstance();
        } else {
            if (!KeyStoreConfigEDDSA.getSupportedProviderTypes().contains(Integer.valueOf(i))) {
                return Collections.EMPTY_LIST;
            }
            keyStoreConfigEDDSA = KeyStoreConfigEDDSA.getInstance();
        }
        return keyStoreConfigEDDSA.a(i);
    }

    public abstract int a();

    public abstract List b();

    public abstract int c();

    /* JADX WARN: Removed duplicated region for block: B:110:0x0358 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:4:0x0006, B:6:0x0017, B:8:0x001f, B:10:0x0030, B:11:0x0049, B:13:0x004f, B:15:0x005b, B:16:0x0077, B:29:0x007f, B:18:0x0098, B:20:0x00b2, B:21:0x00d2, B:23:0x00d8, B:25:0x00e4, B:30:0x00ed, B:32:0x00fa, B:36:0x0102, B:38:0x010a, B:40:0x0117, B:42:0x0133, B:43:0x0164, B:45:0x016a, B:46:0x016e, B:48:0x0174, B:50:0x0185, B:53:0x0188, B:55:0x018e, B:56:0x01a6, B:57:0x01cd, B:58:0x01d3, B:60:0x01d9, B:62:0x01e9, B:63:0x020a, B:65:0x0220, B:66:0x0259, B:67:0x025d, B:69:0x0263, B:71:0x026f, B:72:0x0283, B:103:0x028b, B:74:0x02a1, B:75:0x02a7, B:77:0x02ad, B:80:0x02bd, B:82:0x02c3, B:83:0x02dc, B:88:0x02e6, B:90:0x02fb, B:91:0x0300, B:93:0x031f, B:94:0x033b, B:100:0x0341, B:108:0x0350, B:110:0x0358, B:111:0x035d, B:113:0x0361, B:115:0x0372, B:117:0x0378, B:118:0x037e, B:119:0x01ae, B:121:0x01b4, B:122:0x0383, B:124:0x0389, B:125:0x03af), top: B:3:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0361 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:4:0x0006, B:6:0x0017, B:8:0x001f, B:10:0x0030, B:11:0x0049, B:13:0x004f, B:15:0x005b, B:16:0x0077, B:29:0x007f, B:18:0x0098, B:20:0x00b2, B:21:0x00d2, B:23:0x00d8, B:25:0x00e4, B:30:0x00ed, B:32:0x00fa, B:36:0x0102, B:38:0x010a, B:40:0x0117, B:42:0x0133, B:43:0x0164, B:45:0x016a, B:46:0x016e, B:48:0x0174, B:50:0x0185, B:53:0x0188, B:55:0x018e, B:56:0x01a6, B:57:0x01cd, B:58:0x01d3, B:60:0x01d9, B:62:0x01e9, B:63:0x020a, B:65:0x0220, B:66:0x0259, B:67:0x025d, B:69:0x0263, B:71:0x026f, B:72:0x0283, B:103:0x028b, B:74:0x02a1, B:75:0x02a7, B:77:0x02ad, B:80:0x02bd, B:82:0x02c3, B:83:0x02dc, B:88:0x02e6, B:90:0x02fb, B:91:0x0300, B:93:0x031f, B:94:0x033b, B:100:0x0341, B:108:0x0350, B:110:0x0358, B:111:0x035d, B:113:0x0361, B:115:0x0372, B:117:0x0378, B:118:0x037e, B:119:0x01ae, B:121:0x01b4, B:122:0x0383, B:124:0x0389, B:125:0x03af), top: B:3:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01d9 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:4:0x0006, B:6:0x0017, B:8:0x001f, B:10:0x0030, B:11:0x0049, B:13:0x004f, B:15:0x005b, B:16:0x0077, B:29:0x007f, B:18:0x0098, B:20:0x00b2, B:21:0x00d2, B:23:0x00d8, B:25:0x00e4, B:30:0x00ed, B:32:0x00fa, B:36:0x0102, B:38:0x010a, B:40:0x0117, B:42:0x0133, B:43:0x0164, B:45:0x016a, B:46:0x016e, B:48:0x0174, B:50:0x0185, B:53:0x0188, B:55:0x018e, B:56:0x01a6, B:57:0x01cd, B:58:0x01d3, B:60:0x01d9, B:62:0x01e9, B:63:0x020a, B:65:0x0220, B:66:0x0259, B:67:0x025d, B:69:0x0263, B:71:0x026f, B:72:0x0283, B:103:0x028b, B:74:0x02a1, B:75:0x02a7, B:77:0x02ad, B:80:0x02bd, B:82:0x02c3, B:83:0x02dc, B:88:0x02e6, B:90:0x02fb, B:91:0x0300, B:93:0x031f, B:94:0x033b, B:100:0x0341, B:108:0x0350, B:110:0x0358, B:111:0x035d, B:113:0x0361, B:115:0x0372, B:117:0x0378, B:118:0x037e, B:119:0x01ae, B:121:0x01b4, B:122:0x0383, B:124:0x0389, B:125:0x03af), top: B:3:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void d() {
        StringBuilder sb;
        JCSPLogger.subEnter();
        synchronized (this.f) {
            try {
                long currentTimeMillis = System.currentTimeMillis();
                String str = this.b;
                List b = b();
                boolean z = true;
                Integer[] numArr = null;
                if (g) {
                    if (this.b.isEmpty()) {
                        Vector vector = (Vector) new KeyStoreConfigSerializer(getClass()).deserialize();
                        if (vector != null) {
                            this.d.addAll(vector);
                            numArr = (Integer[]) b.toArray(new Integer[0]);
                            HashSet hashSet = new HashSet();
                            Iterator it = this.d.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                ReaderInfo readerInfo = (ReaderInfo) it.next();
                                if (JCSPLogger.isFinerEnabled()) {
                                    JCSPLogger.finer("Registering reader " + readerInfo.getReaderName());
                                }
                                if (this.c.isEmpty()) {
                                    JCSPLogger.fine("Reader configuration is full! Cannot register reader " + readerInfo.getReaderName());
                                    break;
                                }
                                String str2 = (String) this.c.firstElement();
                                this.c.remove(0);
                                e().add(str2);
                                if (JCSPLogger.isFinerEnabled()) {
                                    JCSPLogger.finer("Updating class configuration with reader " + readerInfo.getReaderName() + " exposed as " + str2);
                                }
                                str = !str.isEmpty() ? str.concat(",").concat(str2) : str2;
                                hashSet.addAll(readerInfo.getProviders());
                            }
                            this.a.addAll(hashSet);
                            this.b = str;
                            if (JCSPLogger.isFinerEnabled()) {
                                JCSPLogger.finer("Registering of readers completed.");
                            }
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (this.a.isEmpty()) {
                        numArr = (Integer[]) b.toArray(new Integer[0]);
                        for (Integer num : numArr) {
                            int intValue = num.intValue();
                            ActionTools.ActionResult executeWithTime = ActionTools.executeWithTime(new vno(intValue, 2));
                            List list = (List) executeWithTime.getResult();
                            if (JCSPLogger.isFineEnabled()) {
                                JCSPLogger.fine("Found providers with type " + intValue + " is " + list.size() + Extension.O_BRAKE_SPACE + executeWithTime.getTime() + " ms).");
                            }
                            if (!list.isEmpty()) {
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    this.a.add(new cl_7((String) it2.next(), intValue));
                                }
                            }
                        }
                        if (JCSPLogger.isFinerEnabled()) {
                            sb = new StringBuilder();
                            sb.append("Following providers ");
                            sb.append(a(this.a));
                            sb.append(" have been saved to cache.");
                            JCSPLogger.finer(sb.toString());
                        }
                        for (cl_7 cl_7Var : this.a) {
                            int i = cl_7Var.b;
                            String str3 = cl_7Var.a;
                            if (JCSPLogger.isFinerEnabled()) {
                                JCSPLogger.finer("Finding all readers of the provider " + str3 + " with type " + i + "...");
                            }
                            ActionTools.ActionResult executeWithTime2 = ActionTools.executeWithTime(new jy4(str3, i, 7));
                            Vector vector2 = (Vector) executeWithTime2.getResult();
                            if (JCSPLogger.isFineEnabled()) {
                                JCSPLogger.fine("Found readers of the provider " + str3 + " with type " + i + " is " + vector2.size() + Extension.O_BRAKE_SPACE + executeWithTime2.getTime() + " ms).");
                            }
                            Iterator it3 = vector2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    String str4 = (String) it3.next();
                                    if (JCSPLogger.isFinerEnabled()) {
                                        JCSPLogger.finer("Registering reader " + str4);
                                    }
                                    if (this.c.isEmpty()) {
                                        JCSPLogger.fine("Reader configuration is full! Cannot register reader " + str4);
                                        break;
                                    }
                                    Iterator it4 = this.d.iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            ReaderInfo readerInfo2 = (ReaderInfo) it4.next();
                                            if (readerInfo2.getReaderName().equalsIgnoreCase(str4)) {
                                                if (JCSPLogger.isFinerEnabled()) {
                                                    JCSPLogger.finer("Reader " + str4 + " already exists in the configuration cache.");
                                                }
                                                readerInfo2.addProvider(new cl_7(str3, i));
                                            }
                                        } else {
                                            ReaderInfo readerInfo3 = new ReaderInfo(str4, -1, Collections.singletonList(new cl_7(str3, i)));
                                            if (JCSPLogger.isFinerEnabled()) {
                                                JCSPLogger.finer("Adding reader information...");
                                            }
                                            this.d.add(readerInfo3);
                                            String str5 = (String) this.c.firstElement();
                                            this.c.remove(0);
                                            e().add(str5);
                                            if (JCSPLogger.isFinerEnabled()) {
                                                JCSPLogger.finer("Updating class configuration with reader " + str4 + " exposed as " + str5);
                                            }
                                            str = !str.isEmpty() ? str.concat(",").concat(str5) : str5;
                                        }
                                    }
                                }
                            }
                        }
                        this.b = str;
                        if (JCSPLogger.isFinerEnabled()) {
                            JCSPLogger.finer("Registering of readers completed.");
                        }
                        if (g) {
                            if (!new KeyStoreConfigSerializer(getClass()).serialize(this.d)) {
                                JCSPLogger.warning("Cache enabled but saving readers to cache failed.");
                            } else if (JCSPLogger.isFinerEnabled()) {
                                JCSPLogger.finer("Readers have been cached.");
                            }
                        }
                    } else {
                        if (JCSPLogger.isFinerEnabled()) {
                            sb = new StringBuilder();
                            sb.append("Following providers ");
                            sb.append(a(this.a));
                            sb.append(" have been taken from cache.");
                            JCSPLogger.finer(sb.toString());
                        }
                        while (r4.hasNext()) {
                        }
                        this.b = str;
                        if (JCSPLogger.isFinerEnabled()) {
                        }
                        if (g) {
                        }
                    }
                }
                long currentTimeMillis2 = System.currentTimeMillis();
                if (numArr != null) {
                    JCSPLogger.info("% CSP providers and readers for types " + Arrays.toString(numArr) + " have been loaded (" + (currentTimeMillis2 - currentTimeMillis) + " ms).");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        JCSPLogger.subExit();
    }

    public String defKeyStorePrefix(String str) {
        if (str == null) {
            str = defaultKeyStoreName();
        }
        return MetaCSPStore.makePrefix(str);
    }

    public String defaultKeyStoreName() {
        String readerName;
        synchronized (this.f) {
            try {
                int c = c();
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= this.d.size()) {
                        i2 = -1;
                        break;
                    }
                    ReaderInfo readerInfo = (ReaderInfo) this.d.get(i2);
                    if (readerInfo.getReaderName().equals(JCSP.REG_STORE_NAME) && readerInfo.containsProviderType(c)) {
                        break;
                    }
                    i2++;
                }
                if (i2 == -1) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= this.d.size()) {
                            break;
                        }
                        ReaderInfo readerInfo2 = (ReaderInfo) this.d.get(i3);
                        if (readerInfo2.getReaderName().equals("HDIMAGE") && readerInfo2.containsProviderType(c)) {
                            i2 = i3;
                            break;
                        }
                        i3++;
                    }
                }
                if (i2 != -1) {
                    i = i2;
                }
                readerName = i < this.d.size() ? ((ReaderInfo) this.d.get(i)).getReaderName() : "not available";
            } catch (Throwable th) {
                throw th;
            }
        }
        return readerName;
    }

    public String getCurrent() {
        String str;
        synchronized (this.f) {
            str = this.b;
        }
        return str;
    }

    public abstract String getDefaultKeyStorePrefix();

    public CSPStore getHDImage() {
        CSPStore cSPStore;
        synchronized (this.f) {
            try {
                int c = c();
                int i = 0;
                int i2 = 0;
                while (true) {
                    if (i2 >= this.d.size()) {
                        i2 = -1;
                        break;
                    }
                    ReaderInfo readerInfo = (ReaderInfo) this.d.get(i2);
                    if (readerInfo.getReaderName().equals("HDIMAGE") && readerInfo.containsProviderType(c)) {
                        break;
                    }
                    i2++;
                }
                if (i2 != -1) {
                    i = i2;
                }
                cSPStore = null;
                if (i < e().size()) {
                    Iterator it = convert((String) e().get(i)).iterator();
                    while (it.hasNext()) {
                        cSPStore = (CSPStore) it.next();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cSPStore;
    }

    public ReaderInfo getMyWord(Class cls) {
        ReaderInfo readerInfo;
        synchronized (this.f) {
            try {
                if (a(cls)) {
                    for (int i = 0; i < e().size(); i++) {
                        if (((String) e().get(i)).equals(cls.getName())) {
                            readerInfo = (ReaderInfo) this.d.get(i);
                            break;
                        }
                    }
                }
                readerInfo = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return readerInfo;
    }

    public Vector getNames() {
        Vector vector = new Vector(2);
        synchronized (this.f) {
            try {
                Iterator it = convert(this.b).iterator();
                while (it.hasNext()) {
                    vector.add(((CSPStore) it.next()).getName());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vector;
    }

    public Vector getReaders() {
        Vector vector;
        synchronized (this.f) {
            vector = this.d;
        }
        return vector;
    }

    public abstract void load();

    private static Object a(String str) {
        Class<?> cls;
        Throwable e;
        try {
            cls = Class.forName(str, false, ClassConfig.class.getClassLoader());
        } catch (ClassNotFoundException e2) {
            JCSPLogger.warningFormat("{0}: {1}", EXC_INVALID_CONFIG, str);
            JCSPLogger.thrown(e2);
            cls = null;
        }
        if (cls == null || !a(cls)) {
            e = new Exception("Class not found or invalid");
        } else {
            try {
                return cls.newInstance();
            } catch (IllegalAccessException | InstantiationException e3) {
                e = e3;
            }
        }
        JCSPLogger.thrown(EXC_INVALID_CONFIG, e);
        return null;
    }

    private static AbstractCollection a(String str, boolean[] zArr) {
        String[] split = str.split(",");
        Vector vector = new Vector();
        for (String str2 : split) {
            try {
                Object a = a(str2);
                if (a != null) {
                    vector.add(a);
                } else {
                    zArr[0] = false;
                }
            } catch (Throwable th) {
                JCSPLogger.subThrown(th);
                zArr[0] = false;
            }
        }
        return vector;
    }

    public List a(int i) {
        ArrayList arrayList = new ArrayList();
        for (cl_7 cl_7Var : this.a) {
            if (i == cl_7Var.b) {
                arrayList.add(cl_7Var.a);
            }
        }
        return arrayList;
    }

    public void a(int i, int i2) {
        for (int i3 = i; i3 < i + i2; i3++) {
            this.c.add("ru.CryptoPro.JCSP.KeyStore.stores.JCSPStore".concat(String.format("%03d", Integer.valueOf(i3))));
        }
    }

    private static boolean a(Class cls) {
        return CSPStore.class.isAssignableFrom(cls);
    }
}
