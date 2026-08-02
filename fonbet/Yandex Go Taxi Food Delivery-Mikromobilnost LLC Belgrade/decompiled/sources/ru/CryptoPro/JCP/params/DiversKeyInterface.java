package ru.CryptoPro.JCP.params;

import java.security.InvalidKeyException;
import javax.crypto.SecretKey;

/* loaded from: classes4.dex */
public interface DiversKeyInterface extends Cloneable {
    Object clone() throws CloneNotSupportedException;

    SecretKey diversKeyByBlob(int i, DiversKeyBase diversKeyBase) throws InvalidKeyException;

    SecretKey diversKeyByBlob(String str, DiversKeyBase diversKeyBase) throws InvalidKeyException;
}
