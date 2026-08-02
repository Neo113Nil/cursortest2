package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes3.dex */
public final class mzh extends fgq implements Serializable {
    public final MessageDigest h;
    public final int i;
    public final boolean j;
    public final String k;

    public mzh(String str, int i, String str2) {
        str2.getClass();
        this.k = str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            this.h = messageDigest;
            int digestLength = messageDigest.getDigestLength();
            boolean z = false;
            o2g.K("bytes (%s) must be >= 4 and < %s", i >= 4 && i <= digestLength, i, digestLength);
            this.i = i;
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
            }
            this.j = z;
        } catch (NoSuchAlgorithmException e) {
            xq0.w(e);
            throw null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final String toString() {
        return this.k;
    }

    public Object writeReplace() {
        return new lzh(this.h.getAlgorithm(), this.i, this.k);
    }

    public mzh() {
        boolean z;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            this.h = messageDigest;
            this.i = messageDigest.getDigestLength();
            this.k = "Hashing.sha256()";
            try {
                messageDigest.clone();
                z = true;
            } catch (CloneNotSupportedException unused) {
                z = false;
            }
            this.j = z;
        } catch (NoSuchAlgorithmException e) {
            xq0.w(e);
            throw null;
        }
    }
}
