package com.fillr.browsersdk.tls.asn1;

import android.text.TextUtils;
import java.nio.charset.Charset;

/* loaded from: classes4.dex */
public final class ASN1UtfString extends ASN1Value {
    public static final Charset UTF8 = Charset.forName("UTF-8");
    public final String text;

    public ASN1UtfString(String str) {
        super(ASN1Type.UTF_STRING);
        this.text = str;
    }

    @Override // com.fillr.browsersdk.tls.asn1.ASN1Value
    public final byte[] getPayload() {
        String str = this.text;
        return TextUtils.isEmpty(str) ? new byte[0] : str.getBytes(UTF8);
    }
}
