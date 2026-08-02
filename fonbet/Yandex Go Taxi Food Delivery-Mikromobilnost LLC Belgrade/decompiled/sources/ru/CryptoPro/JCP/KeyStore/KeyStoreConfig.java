package ru.CryptoPro.JCP.KeyStore;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;
import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.KeyStore.HDImage.FloppyStore;
import ru.CryptoPro.JCP.KeyStore.HDImage.HDImageStore;
import ru.CryptoPro.JCP.tools.ClassConfig;
import ru.CryptoPro.JCSP.KeyStore.KeyStoreConfigBase;

/* loaded from: classes4.dex */
public class KeyStoreConfig extends ClassConfig {
    public static final KeyStoreConfig d = new KeyStoreConfig(KeyStoreConfig.class, "StoreConfig_class_Store", HDImageStore.class.getName() + "," + FloppyStore.class.getName(), KeyStoreConfigBase.EXC_INVALID_CONFIG);
    public static final HashMap e = new HashMap();

    public static KeyStoreConfig getConfig() {
        return d;
    }

    public static Map getKeyStoreMap() {
        return e;
    }

    public static Vector getNames() {
        Vector vector;
        HashMap hashMap = e;
        synchronized (hashMap) {
            try {
                hashMap.clear();
                vector = new Vector(0);
                KeyStoreConfig keyStoreConfig = d;
                Iterator it = keyStoreConfig.convert(keyStoreConfig.getCurrent()).iterator();
                while (it.hasNext()) {
                    JCPKeyStore jCPKeyStore = (JCPKeyStore) it.next();
                    if (jCPKeyStore.getName() != null) {
                        vector.add(jCPKeyStore.getName());
                        e.put(jCPKeyStore.getClass().getName(), jCPKeyStore.getName());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return vector;
    }

    public static void registerStore(Map map) {
        HashMap hashMap = e;
        synchronized (hashMap) {
            try {
                hashMap.clear();
                KeyStoreConfig keyStoreConfig = d;
                Iterator it = keyStoreConfig.convert(keyStoreConfig.getCurrent()).iterator();
                StringBuffer stringBuffer = new StringBuffer(100);
                while (it.hasNext()) {
                    JCPKeyStore jCPKeyStore = (JCPKeyStore) it.next();
                    if (jCPKeyStore.getName() != null) {
                        stringBuffer.delete(0, stringBuffer.length());
                        stringBuffer.append(JCP.KEY_STORE_PREFIX);
                        stringBuffer.append(jCPKeyStore.getName());
                        map.put(stringBuffer.toString(), jCPKeyStore.getClass().getName());
                        e.put(jCPKeyStore.getClass().getName(), jCPKeyStore.getName());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void registerStoreWithoutLogger(Map map) {
        HashMap hashMap = e;
        synchronized (hashMap) {
            try {
                hashMap.clear();
                KeyStoreConfig keyStoreConfig = d;
                Iterator it = keyStoreConfig.convert(keyStoreConfig.getCurrentWithoutLogger()).iterator();
                StringBuffer stringBuffer = new StringBuffer(100);
                while (it.hasNext()) {
                    JCPKeyStore jCPKeyStore = (JCPKeyStore) it.next();
                    if (jCPKeyStore.getName() != null) {
                        stringBuffer.delete(0, stringBuffer.length());
                        stringBuffer.append(JCP.KEY_STORE_PREFIX);
                        stringBuffer.append(jCPKeyStore.getName());
                        map.put(stringBuffer.toString(), jCPKeyStore.getClass().getName());
                        e.put(jCPKeyStore.getClass().getName(), jCPKeyStore.getName());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.CryptoPro.JCP.tools.ClassConfig
    public boolean isValid(Class cls) {
        return JCPKeyStore.class.isAssignableFrom(cls);
    }
}
