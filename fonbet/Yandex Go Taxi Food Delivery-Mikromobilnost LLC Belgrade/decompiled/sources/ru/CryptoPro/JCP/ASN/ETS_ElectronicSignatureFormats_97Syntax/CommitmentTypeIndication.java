package ru.CryptoPro.JCP.ASN.ETS_ElectronicSignatureFormats_97Syntax;

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
public class CommitmentTypeIndication extends Asn1Type {
    public CommitmentTypeIdentifier commitmentTypeId;
    public CommitmentTypeIndication_commitmentTypeQualifier commitmentTypeQualifier;

    public CommitmentTypeIndication(int[] iArr, CommitmentTypeIndication_commitmentTypeQualifier commitmentTypeIndication_commitmentTypeQualifier) {
        this.commitmentTypeId = new CommitmentTypeIdentifier(iArr);
        this.commitmentTypeQualifier = commitmentTypeIndication_commitmentTypeQualifier;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 6, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        CommitmentTypeIdentifier commitmentTypeIdentifier = new CommitmentTypeIdentifier();
        this.commitmentTypeId = commitmentTypeIdentifier;
        commitmentTypeIdentifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            CommitmentTypeIndication_commitmentTypeQualifier commitmentTypeIndication_commitmentTypeQualifier = new CommitmentTypeIndication_commitmentTypeQualifier();
            this.commitmentTypeQualifier = commitmentTypeIndication_commitmentTypeQualifier;
            commitmentTypeIndication_commitmentTypeQualifier.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 6) || peekTag.equals((short) 0, (short) 32, 16)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        CommitmentTypeIndication_commitmentTypeQualifier commitmentTypeIndication_commitmentTypeQualifier = this.commitmentTypeQualifier;
        int encode = this.commitmentTypeId.encode(asn1BerEncodeBuffer, true) + (commitmentTypeIndication_commitmentTypeQualifier != null ? commitmentTypeIndication_commitmentTypeQualifier.encode(asn1BerEncodeBuffer, true) : 0);
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.commitmentTypeId = null;
        this.commitmentTypeQualifier = null;
    }

    public CommitmentTypeIndication(CommitmentTypeIdentifier commitmentTypeIdentifier, CommitmentTypeIndication_commitmentTypeQualifier commitmentTypeIndication_commitmentTypeQualifier) {
        this.commitmentTypeId = commitmentTypeIdentifier;
        this.commitmentTypeQualifier = commitmentTypeIndication_commitmentTypeQualifier;
    }

    public CommitmentTypeIndication(CommitmentTypeIdentifier commitmentTypeIdentifier) {
        this.commitmentTypeId = commitmentTypeIdentifier;
    }

    public CommitmentTypeIndication() {
    }

    public CommitmentTypeIndication(int[] iArr) {
        this.commitmentTypeId = new CommitmentTypeIdentifier(iArr);
    }
}
