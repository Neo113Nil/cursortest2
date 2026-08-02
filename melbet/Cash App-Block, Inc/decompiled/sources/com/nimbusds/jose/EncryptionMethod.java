package com.nimbusds.jose;

import java.util.Collection;
import java.util.LinkedHashSet;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes5.dex */
public final class EncryptionMethod extends Algorithm {
    public final int cekBitLength;
    public static final EncryptionMethod A128CBC_HS256 = new EncryptionMethod("A128CBC-HS256", 256);
    public static final EncryptionMethod A192CBC_HS384 = new EncryptionMethod("A192CBC-HS384", MLKEMEngine.KyberPolyBytes);
    public static final EncryptionMethod A256CBC_HS512 = new EncryptionMethod("A256CBC-HS512", 512);
    public static final EncryptionMethod A128CBC_HS256_DEPRECATED = new EncryptionMethod("A128CBC+HS256", 256);
    public static final EncryptionMethod A256CBC_HS512_DEPRECATED = new EncryptionMethod("A256CBC+HS512", 512);
    public static final EncryptionMethod A128GCM = new EncryptionMethod("A128GCM", 128);
    public static final EncryptionMethod A192GCM = new EncryptionMethod("A192GCM", 192);
    public static final EncryptionMethod A256GCM = new EncryptionMethod("A256GCM", 256);
    public static final EncryptionMethod XC20P = new EncryptionMethod("XC20P", 256);

    public final class Family extends LinkedHashSet {
        public static final Family AES_GCM;

        static {
            new Family(EncryptionMethod.A128CBC_HS256, EncryptionMethod.A192CBC_HS384, EncryptionMethod.A256CBC_HS512);
            AES_GCM = new Family(EncryptionMethod.A128GCM, EncryptionMethod.A192GCM, EncryptionMethod.A256GCM);
        }

        public Family(EncryptionMethod... encryptionMethodArr) {
            for (EncryptionMethod encryptionMethod : encryptionMethodArr) {
                super.add(encryptionMethod);
            }
        }

        @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean removeAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public final boolean retainAll(Collection collection) {
            throw new UnsupportedOperationException();
        }
    }

    public EncryptionMethod(String str, int i) {
        super(str);
        this.cekBitLength = i;
    }
}
