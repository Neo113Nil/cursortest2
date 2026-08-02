package ru.CryptoPro.JCSP.params;

import java.security.Key;

/* loaded from: classes4.dex */
public class AddXSpec extends MulXSpec {
    private boolean a;

    public AddXSpec(Key key, Key key2) {
        super(key, key2);
        this.a = true;
    }

    @Override // ru.CryptoPro.JCSP.params.MulXSpec, java.security.Key
    public String getAlgorithm() {
        return "ADD_X";
    }

    public boolean isPlus() {
        return this.a;
    }

    public void minus() {
        this.a = false;
    }

    public void plus() {
        this.a = true;
    }

    public AddXSpec(Key key, byte[] bArr) {
        super(key, bArr);
        this.a = true;
    }
}
