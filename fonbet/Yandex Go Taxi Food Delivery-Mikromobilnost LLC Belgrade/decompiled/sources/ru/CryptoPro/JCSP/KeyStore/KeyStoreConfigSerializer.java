package ru.CryptoPro.JCSP.KeyStore;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.prefs.BackingStoreException;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCSP.JCSPLogger;

/* loaded from: classes4.dex */
public class KeyStoreConfigSerializer {
    private final String a;
    private final JCPPref b;

    public KeyStoreConfigSerializer(Class cls) {
        this.a = "cache_".concat(cls.getSimpleName());
        this.b = JCPPref.getUser(cls);
    }

    private boolean a() {
        try {
            this.b.remove(this.a);
            this.b.flush();
            return true;
        } catch (BackingStoreException e) {
            JCSPLogger.thrown("Error while deleting preference: ", e);
            return false;
        }
    }

    public static boolean cleanAll() {
        Class[] clsArr = {KeyStoreConfig.class, KeyStoreConfigRSA.class, KeyStoreConfigECDSA.class, KeyStoreConfigEDDSA.class};
        boolean z = true;
        for (int i = 0; i < 4; i++) {
            Class cls = clsArr[i];
            z &= new KeyStoreConfigSerializer(cls).a();
            if (!z) {
                PrintStream printStream = System.out;
                cls.getSimpleName();
                printStream.getClass();
            }
        }
        return z;
    }

    public static void main(String[] strArr) {
        System.out.getClass();
        if (cleanAll()) {
            System.out.getClass();
        }
    }

    public Object deserialize() {
        String str;
        byte[] byteArray = this.b.getByteArray(this.a, null);
        if (byteArray != null) {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray);
                try {
                    ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        Object readObject = objectInputStream.readObject();
                        objectInputStream.close();
                        byteArrayInputStream.close();
                        return readObject;
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                e = e;
                str = "Error while reading data: ";
                JCSPLogger.thrown(str, e);
                return null;
            } catch (ClassNotFoundException e2) {
                e = e2;
                str = "Class not found: ";
                JCSPLogger.thrown(str, e);
                return null;
            } catch (Exception e3) {
                e = e3;
                str = "Error occurred: ";
                JCSPLogger.thrown(str, e);
                return null;
            }
        }
        return null;
    }

    public boolean serialize(Object obj) {
        String str;
        if (obj == null) {
            return false;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream.writeObject(obj);
                    this.b.putByteArray(this.a, byteArrayOutputStream.toByteArray());
                    this.b.flush();
                    objectOutputStream.close();
                    byteArrayOutputStream.close();
                    return true;
                } finally {
                }
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            e = e;
            str = "Error while writing data: ";
            JCSPLogger.thrown(str, e);
            return false;
        } catch (BackingStoreException e2) {
            e = e2;
            str = "Error while storing preference: ";
            JCSPLogger.thrown(str, e);
            return false;
        } catch (Exception e3) {
            e = e3;
            str = "Error occurred: ";
            JCSPLogger.thrown(str, e);
            return false;
        }
    }
}
