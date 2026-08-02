package ru.CryptoPro.JCP.ASN.PKIXDVCS;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Boolean;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class PathProcInput extends Asn1Type {
    public PathProcInput_acceptablePolicySet acceptablePolicySet;
    public Asn1Boolean explicitPolicyReqd;
    public Asn1Boolean inhibitAnyPolicy;
    public Asn1Boolean inhibitPolicyMapping;

    public PathProcInput(PathProcInput_acceptablePolicySet pathProcInput_acceptablePolicySet) {
        this.acceptablePolicySet = pathProcInput_acceptablePolicySet;
        this.inhibitPolicyMapping = new Asn1Boolean(false);
        this.explicitPolicyReqd = new Asn1Boolean(false);
        this.inhibitAnyPolicy = new Asn1Boolean(false);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (!asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            quz.h(asn1BerDecodeBuffer);
            return;
        }
        PathProcInput_acceptablePolicySet pathProcInput_acceptablePolicySet = new PathProcInput_acceptablePolicySet();
        this.acceptablePolicySet = pathProcInput_acceptablePolicySet;
        pathProcInput_acceptablePolicySet.decode(asn1BerDecodeBuffer, true, intHolder.value);
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 1, intHolder, false)) {
            Asn1Boolean asn1Boolean = new Asn1Boolean();
            this.inhibitPolicyMapping = asn1Boolean;
            asn1Boolean.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 0, intHolder, true)) {
            Asn1Boolean asn1Boolean2 = new Asn1Boolean();
            this.explicitPolicyReqd = asn1Boolean2;
            asn1Boolean2.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 128, (short) 0, 1, intHolder, true)) {
            Asn1Boolean asn1Boolean3 = new Asn1Boolean();
            this.inhibitAnyPolicy = asn1Boolean3;
            asn1Boolean3.decode(asn1BerDecodeBuffer, false, intHolder.value);
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 32, 16) || peekTag.equals((short) 0, (short) 0, 1) || peekTag.equals((short) 128, (short) 0, 0) || peekTag.equals((short) 128, (short) 0, 1)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        if (this.inhibitAnyPolicy.equals(false)) {
            i = 0;
        } else {
            int encode = this.inhibitAnyPolicy.encode(asn1BerEncodeBuffer, false);
            i = asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 1, encode) + encode;
        }
        if (!this.explicitPolicyReqd.equals(false)) {
            int encode2 = this.explicitPolicyReqd.encode(asn1BerEncodeBuffer, false);
            i = i + encode2 + asn1BerEncodeBuffer.encodeTagAndLength((short) 128, (short) 0, 0, encode2);
        }
        if (!this.inhibitPolicyMapping.equals(false)) {
            i += this.inhibitPolicyMapping.encode(asn1BerEncodeBuffer, true);
        }
        int encode3 = this.acceptablePolicySet.encode(asn1BerEncodeBuffer, true) + i;
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode3) + encode3 : encode3;
    }

    public void init() {
        this.acceptablePolicySet = null;
        this.inhibitPolicyMapping = new Asn1Boolean(false);
        this.explicitPolicyReqd = new Asn1Boolean(false);
        this.inhibitAnyPolicy = new Asn1Boolean(false);
    }

    public PathProcInput(PathProcInput_acceptablePolicySet pathProcInput_acceptablePolicySet, Asn1Boolean asn1Boolean, Asn1Boolean asn1Boolean2, Asn1Boolean asn1Boolean3) {
        this.acceptablePolicySet = pathProcInput_acceptablePolicySet;
        this.inhibitPolicyMapping = asn1Boolean;
        this.explicitPolicyReqd = asn1Boolean2;
        this.inhibitAnyPolicy = asn1Boolean3;
    }

    public PathProcInput() {
        this.inhibitPolicyMapping = new Asn1Boolean(false);
        this.explicitPolicyReqd = new Asn1Boolean(false);
        this.inhibitAnyPolicy = new Asn1Boolean(false);
    }

    public PathProcInput(PathProcInput_acceptablePolicySet pathProcInput_acceptablePolicySet, boolean z, boolean z2, boolean z3) {
        this.acceptablePolicySet = pathProcInput_acceptablePolicySet;
        this.inhibitPolicyMapping = new Asn1Boolean(z);
        this.explicitPolicyReqd = new Asn1Boolean(z2);
        this.inhibitAnyPolicy = new Asn1Boolean(z3);
    }
}
