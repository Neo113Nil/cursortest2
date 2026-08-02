package ru.CryptoPro.JCP.KeyStore;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import java.io.IOException;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.CProKeyHeader;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.GostKeyContainer;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.GostKeyContainerName;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.GostPrivateKeys;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey.GostPrivateMasks;
import ru.CryptoPro.JCP.tools.JCPLogger;

/* loaded from: classes4.dex */
public final class ContainerEncoder {
    public static final int KEYCOPY_MAIN = 0;
    public static final int KEYCOPY_RESERVED = 1;
    public static final String MSG_IGNORE_EXCEPTION = "Exception ignored";
    public final ContainerReaderInterface a;
    public static final int[] b = {0, 3};
    public static final String[] KEYNAMES = {"masks.key", "primary.key", "header.key", "masks2.key", "primary2.key", "name.key"};
    public static final boolean[] DEFAULT_RIGHTS = {true, true, false, true, true, false};

    public ContainerEncoder(ContainerReaderInterface containerReaderInterface) {
        this.a = containerReaderInterface;
    }

    public ContainerReaderInterface getReader() {
        return this.a;
    }

    public boolean isHeaderExist() {
        try {
            byte[] readFile = this.a.readFile(2, 0, 10);
            if (readFile.length >= 10) {
                if (readFile[0] == Asn1Tag.SEQUENCE.mIDCode + 32) {
                    return true;
                }
            }
            return false;
        } catch (IOException e) {
            JCPLogger.fine(MSG_IGNORE_EXCEPTION, (Throwable) e);
            return false;
        }
    }

    public GostKeyContainer readHeaderV2() throws IOException, Asn1Exception {
        GostKeyContainer gostKeyContainer = new GostKeyContainer();
        gostKeyContainer.decode(new Asn1BerDecodeBuffer(this.a.readFile(2, 0, -1)));
        return gostKeyContainer;
    }

    public CProKeyHeader readHeaderV4() throws IOException, Asn1Exception {
        CProKeyHeader cProKeyHeader = new CProKeyHeader();
        cProKeyHeader.decode(new Asn1BerDecodeBuffer(this.a.readFile(2, 0, -1)));
        return cProKeyHeader;
    }

    public GostPrivateMasks readMasks(int i) throws IOException, Asn1Exception {
        GostPrivateMasks gostPrivateMasks = new GostPrivateMasks();
        Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(this.a.readFile(b[i], 0, -1));
        try {
            gostPrivateMasks.decode(asn1BerDecodeBuffer);
            return gostPrivateMasks;
        } finally {
            asn1BerDecodeBuffer.reset();
        }
    }

    public GostKeyContainerName readName() {
        try {
            GostKeyContainerName gostKeyContainerName = new GostKeyContainerName();
            Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(this.a.readFile(5, 0, -1));
            gostKeyContainerName.decode(asn1BerDecodeBuffer);
            asn1BerDecodeBuffer.reset();
            return gostKeyContainerName;
        } catch (Asn1Exception | IOException e) {
            JCPLogger.fine(MSG_IGNORE_EXCEPTION, e);
            return null;
        }
    }

    public GostPrivateKeys readPrimary(int i) throws IOException, Asn1Exception {
        GostPrivateKeys gostPrivateKeys = new GostPrivateKeys();
        Asn1BerDecodeBuffer asn1BerDecodeBuffer = new Asn1BerDecodeBuffer(this.a.readFile(b[i] + 1, 0, -1));
        try {
            gostPrivateKeys.decode(asn1BerDecodeBuffer);
            return gostPrivateKeys;
        } finally {
            asn1BerDecodeBuffer.reset();
        }
    }

    public void storeHeaderV2(GostKeyContainer gostKeyContainer) throws IOException, Asn1Exception {
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        gostKeyContainer.encode(asn1BerEncodeBuffer);
        this.a.storeFile(2, asn1BerEncodeBuffer.getMsgCopy(), false);
    }

    public void storeHeaderV4(CProKeyHeader cProKeyHeader) throws IOException, Asn1Exception {
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        cProKeyHeader.encode(asn1BerEncodeBuffer);
        this.a.storeFile(2, asn1BerEncodeBuffer.getMsgCopy(), false);
    }

    public void storeMasks(GostPrivateMasks gostPrivateMasks, int i) throws IOException, Asn1Exception {
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        gostPrivateMasks.encode(asn1BerEncodeBuffer);
        this.a.storeFile(b[i], asn1BerEncodeBuffer.getMsgCopy(), true);
    }

    public void storeName(GostKeyContainerName gostKeyContainerName) throws IOException, Asn1Exception {
        if (gostKeyContainerName != null) {
            Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
            gostKeyContainerName.encode(asn1BerEncodeBuffer);
            this.a.storeFile(5, asn1BerEncodeBuffer.getMsgCopy(), false);
        }
    }

    public void storePrimary(GostPrivateKeys gostPrivateKeys, int i) throws IOException, Asn1Exception {
        Asn1BerEncodeBuffer asn1BerEncodeBuffer = new Asn1BerEncodeBuffer();
        gostPrivateKeys.encode(asn1BerEncodeBuffer);
        this.a.storeFile(b[i] + 1, asn1BerEncodeBuffer.getMsgCopy(), true);
    }

    public String toString() {
        return this.a.toString();
    }
}
