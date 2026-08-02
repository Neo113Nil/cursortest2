package ru.CryptoPro.JCSP.CStructReader;

import defpackage.dy31;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes4.dex */
public class AuthInfoStructure extends AbstractStructReader {
    public static final int CRYPT_AUTH_INFO_ADMIN_IS_CONT = 2;
    public static final int CRYPT_AUTH_INFO_ADMIN_IS_PUK = 4;
    public static final int CRYPT_AUTH_INFO_CAN_CHANGE_AUTH = 32;
    public static final int CRYPT_AUTH_INFO_CAN_RESET_ADMIN = 64;
    public static final int CRYPT_AUTH_INFO_CAN_RESET_COUNTERS = 16;
    public static final int CRYPT_AUTH_INFO_CHANGE_WITH_VERIFY = 512;
    public static final int CRYPT_AUTH_INFO_COMMON_AUTH = 1024;
    public static final int CRYPT_AUTH_INFO_DEF_ADMIN = 1;
    public static final int CRYPT_AUTH_INFO_HARDWARE_RESET_ROOT_DEF = 256;
    public static final int CRYPT_AUTH_INFO_MAIN_CAN_NOT_CHANGE_ITSELF = 2048;
    public static final int CRYPT_AUTH_INFO_RESETS_COUNTERS = 8;
    public static final int CRYPT_AUTH_INFO_RESTORE_CONT_AFTER_FOLDER_OPEN = 128;
    public static final int CRYPT_AUTH_INFO_UNSUPPORTED_CHANGE_ADMIN = 4096;
    public static final int CRYPT_AUTH_INFO_UNSUPPORTED_CHANGE_PUK = 8192;
    private boolean b = false;
    private boolean c = false;
    public CIntReader auth_count = new CIntLEReader();
    public CIntReader flags = new CIntLEReader();
    CryptAuthInfoParamStructure a = new CryptAuthInfoParamStructure();

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void clear() {
        this.auth_count.clear();
        this.flags.clear();
        this.a.clear();
        this.c = false;
        this.b = false;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public int getAlign() {
        return this.auth_count.getAlign();
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifComplete() {
        return this.c;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public boolean ifInit() {
        return this.b;
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void read(InputStream inputStream) throws StructException {
        try {
            this.auth_count.read(inputStream);
            this.flags.read(inputStream);
            this.a.read(inputStream);
            if (inputStream.available() == 0) {
                this.c = true;
            }
            this.b = true;
        } catch (IOException e) {
            dy31.o(e);
        }
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void setAligned(int i) {
        this.auth_count.setAligned(i);
        this.flags.setAligned(i);
        this.a.setAligned(i);
    }

    @Override // ru.CryptoPro.JCSP.CStructReader.AbstractStructReader, ru.CryptoPro.JCSP.CStructReader.StructReaderInterface
    public void write(OutputStream outputStream) throws StructException {
        if (this.b) {
            this.auth_count.write(outputStream);
            this.flags.write(outputStream);
            this.a.write(outputStream);
        }
    }
}
