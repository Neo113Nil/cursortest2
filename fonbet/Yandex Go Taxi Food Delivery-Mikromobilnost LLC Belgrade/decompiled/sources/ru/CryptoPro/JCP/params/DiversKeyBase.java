package ru.CryptoPro.JCP.params;

import java.security.Key;
import java.security.spec.KeySpec;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public abstract class DiversKeyBase implements KeySpec, SecretKey {
    protected static final ResourceBundle a = ResourceBundle.getBundle("ru.CryptoPro.JCP.Key.resources.key", Locale.getDefault());
    protected static final String b = "BadDiversAlg";
    protected static final String c = "BadDiversData";
    private static final String f = "ru.CryptoPro.JCP.Key.resources.key";
    protected final Key d;
    protected int e;

    public DiversKeyBase(Key key) {
        this.d = key;
    }

    public int getDiversType() {
        return this.e;
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return null;
    }

    @Override // java.security.Key
    public String getFormat() {
        return "RAW";
    }

    public Key getKey() {
        return this.d;
    }
}
