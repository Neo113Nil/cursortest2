package ru.CryptoPro.JCP.ASN.CertificateExtensions;

import com.objsys.asn1j.runtime.Asn1BerDecodeBuffer;
import com.objsys.asn1j.runtime.Asn1BerDecodeContext;
import com.objsys.asn1j.runtime.Asn1BerEncodeBuffer;
import com.objsys.asn1j.runtime.Asn1Boolean;
import com.objsys.asn1j.runtime.Asn1ConsVioException;
import com.objsys.asn1j.runtime.Asn1Exception;
import com.objsys.asn1j.runtime.Asn1Integer;
import com.objsys.asn1j.runtime.Asn1Tag;
import com.objsys.asn1j.runtime.Asn1Type;
import com.objsys.asn1j.runtime.IntHolder;
import defpackage.quz;
import java.io.IOException;

/* loaded from: classes4.dex */
public class BasicConstraintsSyntax extends Asn1Type {
    public Asn1Boolean cA;
    public Asn1Integer pathLenConstraint;

    public BasicConstraintsSyntax(boolean z, long j) {
        this.cA = new Asn1Boolean(z);
        this.pathLenConstraint = new Asn1Integer(j);
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 1, intHolder, false)) {
            Asn1Boolean asn1Boolean = new Asn1Boolean();
            this.cA = asn1Boolean;
            asn1Boolean.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 0, 2, intHolder, false)) {
            Asn1Integer asn1Integer = new Asn1Integer();
            this.pathLenConstraint = asn1Integer;
            asn1Integer.decode(asn1BerDecodeBuffer, true, intHolder.value);
            if (this.pathLenConstraint.value < 0) {
                throw new Asn1ConsVioException("pathLenConstraint.value", this.pathLenConstraint.value);
            }
        }
        if (asn1BerDecodeContext.expired()) {
            return;
        }
        Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
        if (peekTag.equals((short) 0, (short) 0, 1) || peekTag.equals((short) 0, (short) 0, 2)) {
            quz.g();
        }
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        int i;
        Asn1Integer asn1Integer = this.pathLenConstraint;
        if (asn1Integer == null) {
            i = 0;
        } else {
            if (asn1Integer.value < 0) {
                throw new Asn1ConsVioException("pathLenConstraint.value", this.pathLenConstraint.value);
            }
            i = asn1Integer.encode(asn1BerEncodeBuffer, true);
        }
        if (!this.cA.equals(false)) {
            i += this.cA.encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, i) + i : i;
    }

    public void init() {
        this.cA = new Asn1Boolean(false);
        this.pathLenConstraint = null;
    }

    public BasicConstraintsSyntax(Asn1Boolean asn1Boolean, Asn1Integer asn1Integer) {
        this.cA = asn1Boolean;
        this.pathLenConstraint = asn1Integer;
    }

    public BasicConstraintsSyntax() {
        this.cA = new Asn1Boolean(false);
    }
}
