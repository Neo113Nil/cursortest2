package ru.CryptoPro.JCPRequest.ca15.decoder;

import ru.CryptoPro.JCPRequest.ca15.status.CA15UserRegisterStatus;

/* loaded from: classes4.dex */
public class CA15UserIdentifier extends SimpleHTMLDecoder {
    public CA15UserRegisterStatus b;

    public CA15UserIdentifier(String str) {
        this.a = str;
    }

    public CA15UserRegisterStatus getStatus() {
        return this.b;
    }
}
