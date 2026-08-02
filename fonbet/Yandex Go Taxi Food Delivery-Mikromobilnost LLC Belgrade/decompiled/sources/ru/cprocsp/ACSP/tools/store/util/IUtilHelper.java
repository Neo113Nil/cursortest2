package ru.cprocsp.ACSP.tools.store.util;

import java.util.HashMap;
import java.util.Map;
import ru.CryptoPro.JCSP.support.BKSTrustStore;

/* loaded from: classes4.dex */
public interface IUtilHelper {
    public static final int RESULT_SAVE_ERROR = 3;
    public static final int RESULT_SAVE_ERROR_NEW_PFX_PASSWORD_REQUIRED = 8;
    public static final int RESULT_SAVE_ERROR_NO_KEY_CERT = 5;
    public static final int RESULT_SAVE_ERROR_WRONG_PFX_PASSWORD = 7;
    public static final int RESULT_SAVE_OK = 0;
    public static final int RESULT_SAVE_OK_ROOT_CERT_NOT_SAVED_TO_STORE = 6;
    public static final String RUTOKEN = "rutoken";
    public static final String STORAGE_FILE_ADDRESS_BOOK = "address_book";
    public static final String STORAGE_FILE_CRL = "crl";
    public static final String STORAGE_FILE_INTERMEDIATE = "intermediate";
    public static final String STORAGE_FILE_TRUST = "cacerts";
    public static final char[] STORAGE_PASSWORD = BKSTrustStore.STORAGE_PASSWORD;
    public static final Map<StorageType, String> certStorageFileList = new HashMap<StorageType, String>() { // from class: ru.cprocsp.ACSP.tools.store.util.IUtilHelper.1
        {
            put(StorageType.stIntermediate, "intermediate");
            put(StorageType.stTrust, "cacerts");
            put(StorageType.stAddressBook, IUtilHelper.STORAGE_FILE_ADDRESS_BOOK);
        }
    };

    public enum StorageType {
        stTrust,
        stIntermediate,
        stAddressBook,
        stNone,
        stPersonal
    }
}
