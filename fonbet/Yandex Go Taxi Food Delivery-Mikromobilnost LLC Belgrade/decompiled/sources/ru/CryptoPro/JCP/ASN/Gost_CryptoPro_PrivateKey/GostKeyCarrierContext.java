package ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class GostKeyCarrierContext extends Asn1Type {
    public GostKeyContainer container;
    public GostPrivateMasks masks;
    public GostPrivateKeys master;
    public GostKeyContainerName name;

    public GostKeyCarrierContext(GostKeyContainerName gostKeyContainerName, GostPrivateMasks gostPrivateMasks, GostPrivateKeys gostPrivateKeys, GostKeyContainer gostKeyContainer) {
        this.name = gostKeyContainerName;
        this.masks = gostPrivateMasks;
        this.master = gostPrivateKeys;
        this.container = gostKeyContainer;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            GostKeyContainerName gostKeyContainerName = new GostKeyContainerName();
            this.name = gostKeyContainerName;
            gostKeyContainerName.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 1, intHolder, true)) {
            GostPrivateMasks gostPrivateMasks = new GostPrivateMasks();
            this.masks = gostPrivateMasks;
            gostPrivateMasks.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 2, intHolder, true)) {
            GostPrivateKeys gostPrivateKeys = new GostPrivateKeys();
            this.master = gostPrivateKeys;
            gostPrivateKeys.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 3, intHolder, true)) {
            GostKeyContainer gostKeyContainer = new GostKeyContainer();
            this.container = gostKeyContainer;
            gostKeyContainer.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 128, (short) 32, 0) || peekTag.equals((short) 128, (short) 32, 1) || peekTag.equals((short) 128, (short) 32, 2) || peekTag.equals((short) 128, (short) 32, 3)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        GostKeyContainer gostKeyContainer = this.container;
        if (gostKeyContainer != null) {
            int encode = gostKeyContainer.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 3, encode) + encode;
        } else {
            i = 0;
        }
        GostPrivateKeys gostPrivateKeys = this.master;
        if (gostPrivateKeys != null) {
            int encode2 = gostPrivateKeys.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 2, encode2);
        }
        GostPrivateMasks gostPrivateMasks = this.masks;
        if (gostPrivateMasks != null) {
            int encode3 = gostPrivateMasks.encode(asn1BerEncodeBuffer, false);
            i = i + encode3 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 1, encode3);
        }
        GostKeyContainerName gostKeyContainerName = this.name;
        if (gostKeyContainerName != null) {
            int encode4 = gostKeyContainerName.encode(asn1BerEncodeBuffer, false);
            i = i + encode4 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode4);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public void init() {
        this.name = null;
        this.masks = null;
        this.master = null;
        this.container = null;
    }

    public GostKeyCarrierContext() {
    }
}
