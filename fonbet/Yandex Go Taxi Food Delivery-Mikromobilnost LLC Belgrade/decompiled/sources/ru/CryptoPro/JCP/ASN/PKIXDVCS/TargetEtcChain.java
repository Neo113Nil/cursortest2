package ru.CryptoPro.JCP.ASN.PKIXDVCS;

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
public class TargetEtcChain extends Asn1Type {
    public TargetEtcChain_chain chain;
    public PathProcInput pathProcInput;
    public CertEtcToken target;

    public TargetEtcChain(CertEtcToken certEtcToken, TargetEtcChain_chain targetEtcChain_chain, PathProcInput pathProcInput) {
        this.target = certEtcToken;
        this.chain = targetEtcChain_chain;
        this.pathProcInput = pathProcInput;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.expired()) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (!peekTag.equals((short) 0, (short) 32, 16) && !peekTag.equals((short) 128, (short) 32, 0) && !peekTag.equals((short) 128, (short) 32, 1) && !peekTag.equals((short) 128, (short) 32, 2) && !peekTag.equals((short) 128, (short) 32, 3) && !peekTag.equals((short) 128, (short) 32, 4) && !peekTag.equals((short) 128, (short) 32, 5) && !peekTag.equals((short) 128, (short) 32, 6) && !peekTag.equals((short) 128, (short) 32, 7) && !peekTag.equals((short) 128, (short) 32, 8)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        CertEtcToken certEtcToken = new CertEtcToken();
        this.target = certEtcToken;
        certEtcToken.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            TargetEtcChain_chain targetEtcChain_chain = new TargetEtcChain_chain();
            this.chain = targetEtcChain_chain;
            targetEtcChain_chain.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 32, 0, intHolder, true)) {
            PathProcInput pathProcInput = new PathProcInput();
            this.pathProcInput = pathProcInput;
            pathProcInput.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag2 = asn1BerDecodeBuffer.peekTag();
        if (peekTag2.equals((short) 0, (short) 32, 16) || peekTag2.equals((short) 128, (short) 32, 0)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        PathProcInput pathProcInput = this.pathProcInput;
        int i = 0;
        if (pathProcInput != null) {
            int encode = pathProcInput.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 32, 0, encode) + encode;
        }
        TargetEtcChain_chain targetEtcChain_chain = this.chain;
        if (targetEtcChain_chain != null) {
            i += targetEtcChain_chain.encode(asn1BerEncodeBuffer, true);
        }
        int encode2 = this.target.encode(asn1BerEncodeBuffer, true) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode2) + encode2 : encode2;
    }

    public void init() {
        this.target = null;
        this.chain = null;
        this.pathProcInput = null;
    }

    public TargetEtcChain() {
    }

    public TargetEtcChain(CertEtcToken certEtcToken) {
        this.target = certEtcToken;
    }
}
