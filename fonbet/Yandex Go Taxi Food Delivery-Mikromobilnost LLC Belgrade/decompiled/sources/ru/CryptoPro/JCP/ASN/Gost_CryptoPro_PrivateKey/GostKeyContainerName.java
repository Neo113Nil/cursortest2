package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1IA5String;
import com.objsys.asn1j.runtime.Asn1OpenExt;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;

/* loaded from: classes4.dex */
public class GostKeyContainerName extends Asn1Type {
    static CharsetEncoder encoder = Charset.forName("cp1251").newEncoder();
    public Asn1IA5String containerName;
    public Asn1OpenExt extElem1;

    public GostKeyContainerName(String str) {
        this.containerName = new Asn1IA5String(str);
    }

    public static synchronized boolean isPureAscii(String str) {
        boolean canEncode;
        synchronized (GostKeyContainerName.class) {
            canEncode = encoder.canEncode(str);
        }
        return canEncode;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 22, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1IA5String asn1IA5String = new Asn1IA5String();
        this.containerName = asn1IA5String;
        asn1IA5String.decode(asn1BerDecodeBuffer, true, intHolder.value);
        this.containerName.encode(new Asn1BerEncodeBuffer());
        byte[] bytes = this.containerName.value.getBytes("ISO-8859-1");
        String str = new String(bytes, "UTF-8");
        if (!isPureAscii(str)) {
            str = new String(bytes, "cp1251");
        }
        this.containerName = new Asn1IA5String(str);
        if (asn1BerDecodeContext.expired()) {
            this.extElem1 = null;
        } else {
            if (asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 0, 22)) {
                quz.g();
                return;
            }
            this.extElem1 = new Asn1OpenExt();
            while (!asn1BerDecodeContext.expired()) {
                this.extElem1.decodeComponent(asn1BerDecodeBuffer);
            }
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        Asn1OpenExt asn1OpenExt = this.extElem1;
        int encode = asn1OpenExt != null ? asn1OpenExt.encode(asn1BerEncodeBuffer, false) : 0;
        try {
            byte[] bytes = this.containerName.value.getBytes("cp1251");
            int length = bytes.length;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(22);
            byteArrayOutputStream.write(length);
            try {
                byteArrayOutputStream.write(bytes);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int length2 = byteArray.length;
                asn1BerEncodeBuffer.copy(byteArray);
                int i = encode + length2;
                return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
            } catch (IOException e) {
                Asn1Exception asn1Exception = new Asn1Exception("Invalid i/o operation");
                asn1Exception.initCause(e);
                throw asn1Exception;
            }
        } catch (UnsupportedEncodingException e2) {
            Asn1Exception asn1Exception2 = new Asn1Exception("Invalid name encoding");
            asn1Exception2.initCause(e2);
            throw asn1Exception2;
        }
    }

    public void init() {
        this.containerName = null;
        this.extElem1 = null;
    }

    public GostKeyContainerName() {
    }
}
