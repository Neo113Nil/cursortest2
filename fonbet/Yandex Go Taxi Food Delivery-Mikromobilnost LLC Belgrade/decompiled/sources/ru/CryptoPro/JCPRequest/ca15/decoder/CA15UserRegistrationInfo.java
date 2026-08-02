package ru.CryptoPro.JCPRequest.ca15.decoder;

import ru.CryptoPro.JCPRequest.ca15.status.CA15UserRegisterInfoStatus;

/* loaded from: classes4.dex */
public class CA15UserRegistrationInfo extends SimpleHTMLDecoder {
    public CA15UserRegisterInfoStatus b;

    public CA15UserRegistrationInfo(String str) {
        this.a = str;
    }

    public final String c(int i) {
        int i2;
        int indexOf;
        int indexOf2 = this.a.indexOf("value=\"", i);
        if (indexOf2 == -1 || (indexOf = this.a.indexOf("\"", (i2 = indexOf2 + 7))) == -1) {
            return null;
        }
        String substring = this.a.substring(i2, indexOf);
        this.a = this.a.substring(indexOf + 1);
        return substring;
    }

    public CA15UserRegisterInfoStatus getUserRegisterInfoStatus() {
        return this.b;
    }
}
