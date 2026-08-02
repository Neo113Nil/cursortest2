package ru.CryptoPro.JCP.tools.CPVerify;

import defpackage.nzs;
import java.io.File;
import java.io.IOException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import ru.CryptoPro.JCP.pref.JCPPref;
import ru.CryptoPro.JCP.tools.JCPLogger;
import ru.CryptoPro.JCP.tools.LocalMutex;

/* loaded from: classes4.dex */
public class DigestStoreDefault implements DigestStore {
    public static final Object a;
    public static DigestStore b;

    /* renamed from: ru.CryptoPro.JCP.tools.CPVerify.DigestStoreDefault$2, reason: invalid class name */
    class AnonymousClass2 implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        public Object run() {
            JCPPref jCPPref = new JCPPref(DigestStoreDefault.class);
            if (jCPPref.getInt("DigestStoreDefaultCPVerify_class_WhatRepositoryKeyName", -1) != 0) {
                DigestStoreDefault.b = new DigestStoreReg();
                return null;
            }
            String str = jCPPref.get("DigestStoreDefaultCPVerify_class_WhatRepositoryFileKey", null);
            DigestStoreDefault.b = str != null ? new DigestStoreFile(new File(str)) : new DigestStoreReg();
            return str;
        }
    }

    /* renamed from: ru.CryptoPro.JCP.tools.CPVerify.DigestStoreDefault$3, reason: invalid class name */
    class AnonymousClass3 implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        public Object run() {
            return JCPPref.getUser(DigestStoreDefault.class).get("DigestStoreDefaultCPVerify_class_DefaultDirectoryForFiles", null);
        }
    }

    /* renamed from: ru.CryptoPro.JCP.tools.CPVerify.DigestStoreDefault$4, reason: invalid class name */
    class AnonymousClass4 implements PrivilegedAction {
        @Override // java.security.PrivilegedAction
        public Object run() {
            return JCPPref.getUser(DigestStoreDefault.class).get("DigestStoreDefaultCPVerify_class_DefaultDirectoryForRep", null);
        }
    }

    static {
        Object obj = new Object();
        a = obj;
        synchronized (obj) {
            AccessController.doPrivileged(new AnonymousClass2());
        }
    }

    public DigestStoreDefault() throws CPVerifyException {
        LocalMutex localMutex;
        synchronized (a) {
            try {
                try {
                    localMutex = a();
                    try {
                        AccessController.doPrivileged(new AnonymousClass2());
                        localMutex.unlock();
                    } catch (Throwable th) {
                        th = th;
                        if (localMutex != null) {
                            localMutex.unlock();
                        }
                        throw th;
                    }
                } catch (Exception e) {
                    JCPLogger.subThrown(e);
                    throw new CPVerifyException(0);
                }
            } catch (Throwable th2) {
                th = th2;
                localMutex = null;
            }
        }
    }

    public static LocalMutex a() {
        try {
            final LocalMutex localMutex = new LocalMutex("mutexfordefrep");
            AccessController.doPrivileged(new PrivilegedExceptionAction() { // from class: ru.CryptoPro.JCP.tools.CPVerify.DigestStoreDefault.1
                @Override // java.security.PrivilegedExceptionAction
                public Object run() throws Exception {
                    LocalMutex.this.lock();
                    return null;
                }
            });
            return localMutex;
        } catch (PrivilegedActionException unused) {
            throw new CPVerifyException(1);
        } catch (Exception unused2) {
            throw new CPVerifyException(0);
        }
    }

    public static DigestStore getCopy() {
        DigestStore digestStore;
        synchronized (a) {
            try {
                DigestStore digestStore2 = b;
                if (digestStore2 != null) {
                    if (digestStore2 instanceof DigestStoreFile) {
                        digestStore = new DigestStoreFile(((DigestStoreFile) digestStore2).getFile());
                    } else if (digestStore2 instanceof DigestStoreReg) {
                        digestStore = new DigestStoreReg();
                    }
                }
                digestStore = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return digestStore;
    }

    public static String getFileName() {
        String file;
        synchronized (a) {
            try {
                DigestStore digestStore = b;
                file = (digestStore == null || !(digestStore instanceof DigestStoreFile)) ? null : ((DigestStoreFile) digestStore).getFile().toString();
            } catch (Throwable th) {
                throw th;
            }
        }
        return file;
    }

    public static File getFilesDefaultDirectory() {
        File file;
        synchronized (a) {
            String str = (String) AccessController.doPrivileged(new AnonymousClass3());
            file = str == null ? null : new File(str);
        }
        return file;
    }

    public static File getRepDefaultDirectory() {
        File file;
        synchronized (a) {
            String str = (String) AccessController.doPrivileged(new AnonymousClass4());
            file = str == null ? null : new File(str);
        }
        return file;
    }

    public static boolean isFile() {
        boolean z;
        synchronized (a) {
            z = b instanceof DigestStoreFile;
        }
        return z;
    }

    public static boolean isPreferences() {
        boolean z;
        synchronized (a) {
            z = b instanceof DigestStoreReg;
        }
        return z;
    }

    public static boolean isWritable() {
        return nzs.u(DigestStoreDefault.class);
    }

    public static void setDefaultRep(DigestStore digestStore) throws CPVerifyException {
        if (digestStore instanceof DigestStoreFile) {
            setFileRep((DigestStoreFile) digestStore);
        } else if (digestStore instanceof DigestStoreReg) {
            setPreferences();
        }
    }

    public static void setFileName(String str) throws CPVerifyException {
        LocalMutex localMutex;
        synchronized (a) {
            try {
                try {
                    localMutex = a();
                    try {
                        JCPPref jCPPref = new JCPPref(DigestStoreDefault.class);
                        jCPPref.putInt("DigestStoreDefaultCPVerify_class_WhatRepositoryKeyName", 0);
                        jCPPref.put("DigestStoreDefaultCPVerify_class_WhatRepositoryFileKey", str);
                        b = new DigestStoreFile(new File(str));
                        localMutex.unlock();
                    } catch (Throwable th) {
                        th = th;
                        if (localMutex != null) {
                            localMutex.unlock();
                        }
                        throw th;
                    }
                } catch (Exception unused) {
                    throw new CPVerifyException(0);
                }
            } catch (Throwable th2) {
                th = th2;
                localMutex = null;
            }
        }
    }

    public static void setFileRep(DigestStoreFile digestStoreFile) throws CPVerifyException {
        try {
            setFileName(digestStoreFile.getFile().getCanonicalPath());
        } catch (IOException unused) {
            throw new CPVerifyException(0);
        }
    }

    public static void setFilesDefaultDirectory(File file) {
        synchronized (a) {
            try {
                JCPPref user = JCPPref.getUser(DigestStoreDefault.class);
                if (user.isWriteAvailable()) {
                    user.put("DigestStoreDefaultCPVerify_class_DefaultDirectoryForFiles", file.getAbsolutePath());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void setPreferences() throws CPVerifyException {
        LocalMutex localMutex;
        synchronized (a) {
            try {
                try {
                    localMutex = a();
                    try {
                        new JCPPref(DigestStoreDefault.class).putInt("DigestStoreDefaultCPVerify_class_WhatRepositoryKeyName", 1);
                        b = new DigestStoreReg();
                        localMutex.unlock();
                    } catch (Throwable th) {
                        th = th;
                        if (localMutex != null) {
                            localMutex.unlock();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    localMutex = null;
                }
            } catch (Exception unused) {
                throw new CPVerifyException(0);
            }
        }
    }

    public static void setRepDefaultDirectory(File file) {
        synchronized (a) {
            try {
                JCPPref user = JCPPref.getUser(DigestStoreDefault.class);
                if (user.isWriteAvailable()) {
                    user.put("DigestStoreDefaultCPVerify_class_DefaultDirectoryForRep", file.getAbsolutePath());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public boolean canRead() {
        boolean canRead;
        synchronized (a) {
            DigestStore digestStore = b;
            canRead = digestStore == null ? false : digestStore.canRead();
        }
        return canRead;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public boolean canWrite() {
        boolean canWrite;
        synchronized (a) {
            DigestStore digestStore = b;
            canWrite = digestStore == null ? false : digestStore.canWrite();
        }
        return canWrite;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public boolean deleteKey(String str) {
        boolean deleteKey;
        synchronized (a) {
            DigestStore digestStore = b;
            deleteKey = digestStore == null ? false : digestStore.deleteKey(str);
        }
        return deleteKey;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public byte[] getDigest(String str) {
        byte[] digest;
        synchronized (a) {
            DigestStore digestStore = b;
            digest = digestStore == null ? null : digestStore.getDigest(str);
        }
        return digest;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String getKeyValue(String str) {
        String keyValue;
        synchronized (a) {
            DigestStore digestStore = b;
            keyValue = digestStore == null ? null : digestStore.getKeyValue(str);
        }
        return keyValue;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String[] getKeys() {
        String[] keys;
        synchronized (a) {
            try {
                DigestStore digestStore = b;
                keys = digestStore == null ? new String[0] : digestStore.getKeys();
            } catch (Throwable th) {
                throw th;
            }
        }
        return keys;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String getStoreName() {
        String storeName;
        synchronized (a) {
            DigestStore digestStore = b;
            storeName = digestStore == null ? null : digestStore.getStoreName();
        }
        return storeName;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public boolean isExist() {
        boolean isExist;
        synchronized (a) {
            DigestStore digestStore = b;
            isExist = digestStore == null ? false : digestStore.isExist();
        }
        return isExist;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String[] readStore() throws CPVerifyException {
        LocalMutex localMutex;
        String[] readStore;
        synchronized (a) {
            try {
                if (b == null) {
                    throw new CPVerifyException(2);
                }
                try {
                    localMutex = a();
                    try {
                        readStore = b.readStore();
                        localMutex.unlock();
                    } catch (Throwable th) {
                        th = th;
                        if (localMutex != null) {
                            localMutex.unlock();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    localMutex = null;
                }
            } catch (Exception unused) {
                throw new CPVerifyException(0);
            }
        }
        return readStore;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public void resetStore() throws CPVerifyException {
        LocalMutex localMutex;
        synchronized (a) {
            try {
                if (b == null) {
                    throw new CPVerifyException(2);
                }
                try {
                    localMutex = a();
                    try {
                        b.resetStore();
                        localMutex.unlock();
                    } catch (Throwable th) {
                        th = th;
                        if (localMutex != null) {
                            localMutex.unlock();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    localMutex = null;
                }
            } catch (Exception unused) {
                throw new CPVerifyException(0);
            }
        }
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public String writeKey(String str, byte[] bArr) {
        String writeKey;
        synchronized (a) {
            DigestStore digestStore = b;
            writeKey = digestStore == null ? null : digestStore.writeKey(str, bArr);
        }
        return writeKey;
    }

    @Override // ru.CryptoPro.JCP.tools.CPVerify.DigestStore
    public void writeStore() throws CPVerifyException {
        LocalMutex localMutex;
        synchronized (a) {
            try {
                if (b == null) {
                    throw new CPVerifyException(2);
                }
                try {
                    localMutex = a();
                    try {
                        b.writeStore();
                        localMutex.unlock();
                    } catch (Throwable th) {
                        th = th;
                        if (localMutex != null) {
                            localMutex.unlock();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    localMutex = null;
                }
            } catch (Exception unused) {
                throw new CPVerifyException(0);
            }
        }
    }
}
