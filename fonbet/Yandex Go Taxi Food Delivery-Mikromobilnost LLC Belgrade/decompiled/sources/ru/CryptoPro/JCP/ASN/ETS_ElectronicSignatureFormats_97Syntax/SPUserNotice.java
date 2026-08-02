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
public class SPUserNotice extends Asn1Type {
    public DisplayText explicitText;
    public NoticeReference noticeRef;

    public SPUserNotice(NoticeReference noticeReference, DisplayText displayText) {
        this.noticeRef = noticeReference;
        this.explicitText = displayText;
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public void decode(Asn1BerDecodeBuffer asn1BerDecodeBuffer, boolean z, int i) throws Asn1Exception, IOException {
        if (z) {
            i = matchTag(asn1BerDecodeBuffer, Asn1Tag.SEQUENCE);
        }
        init();
        Asn1BerDecodeContext asn1BerDecodeContext = new Asn1BerDecodeContext(asn1BerDecodeBuffer, i);
        IntHolder intHolder = new IntHolder();
        if (asn1BerDecodeContext.matchElemTag((short) 0, (short) 32, 16, intHolder, false)) {
            NoticeReference noticeReference = new NoticeReference();
            this.noticeRef = noticeReference;
            noticeReference.decode(asn1BerDecodeBuffer, true, intHolder.value);
        }
        if (!asn1BerDecodeContext.expired()) {
            Asn1Tag peekTag = asn1BerDecodeBuffer.peekTag();
            if (peekTag.equals((short) 0, (short) 0, 12) || peekTag.equals((short) 0, (short) 0, 26) || peekTag.equals((short) 0, (short) 0, 30)) {
                DisplayText displayText = new DisplayText();
                this.explicitText = displayText;
                displayText.decode(asn1BerDecodeBuffer, true, intHolder.value);
            }
        }
        if (asn1BerDecodeContext.expired() || !asn1BerDecodeBuffer.peekTag().equals((short) 0, (short) 32, 16)) {
            return;
        }
        quz.g();
    }

    @Override // com.objsys.asn1j.runtime.Asn1Type, com.objsys.asn1j.runtime.Asn1TypeIF
    public int encode(Asn1BerEncodeBuffer asn1BerEncodeBuffer, boolean z) throws Asn1Exception {
        DisplayText displayText = this.explicitText;
        int encode = displayText != null ? displayText.encode(asn1BerEncodeBuffer, true) : 0;
        NoticeReference noticeReference = this.noticeRef;
        if (noticeReference != null) {
            encode += noticeReference.encode(asn1BerEncodeBuffer, true);
        }
        return z ? asn1BerEncodeBuffer.encodeTagAndLength(Asn1Tag.SEQUENCE, encode) + encode : encode;
    }

    public void init() {
        this.noticeRef = null;
        this.explicitText = null;
    }

    public SPUserNotice() {
    }
}
