package ru.CryptoPro.JCPRequest.ca15.decoder;

import java.util.Vector;

/* loaded from: classes4.dex */
public class CA15UserRegistrationTable extends SimpleHTMLDecoder {
    public final Vector b = new Vector();

    public CA15UserRegistrationTable(String str) {
        this.a = str;
    }

    public Vector getUserRegistrationFields() {
        return this.b;
    }
}
