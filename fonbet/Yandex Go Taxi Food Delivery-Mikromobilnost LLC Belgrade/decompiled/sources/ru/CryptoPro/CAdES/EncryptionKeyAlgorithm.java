package ru.CryptoPro.CAdES;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class EncryptionKeyAlgorithm {
    private static final /* synthetic */ EncryptionKeyAlgorithm[] a;
    public static final EncryptionKeyAlgorithm ekaDefault;
    public static final EncryptionKeyAlgorithm ekaKuznechik;
    public static final EncryptionKeyAlgorithm ekaKuznechikMac;
    public static final EncryptionKeyAlgorithm ekaMagma;
    public static final EncryptionKeyAlgorithm ekaMagmaMac;

    static {
        EncryptionKeyAlgorithm encryptionKeyAlgorithm = new EncryptionKeyAlgorithm("ekaDefault", 0);
        ekaDefault = encryptionKeyAlgorithm;
        EncryptionKeyAlgorithm encryptionKeyAlgorithm2 = new EncryptionKeyAlgorithm("ekaMagma", 1);
        ekaMagma = encryptionKeyAlgorithm2;
        EncryptionKeyAlgorithm encryptionKeyAlgorithm3 = new EncryptionKeyAlgorithm("ekaMagmaMac", 2);
        ekaMagmaMac = encryptionKeyAlgorithm3;
        EncryptionKeyAlgorithm encryptionKeyAlgorithm4 = new EncryptionKeyAlgorithm("ekaKuznechik", 3);
        ekaKuznechik = encryptionKeyAlgorithm4;
        EncryptionKeyAlgorithm encryptionKeyAlgorithm5 = new EncryptionKeyAlgorithm("ekaKuznechikMac", 4);
        ekaKuznechikMac = encryptionKeyAlgorithm5;
        a = new EncryptionKeyAlgorithm[]{encryptionKeyAlgorithm, encryptionKeyAlgorithm2, encryptionKeyAlgorithm3, encryptionKeyAlgorithm4, encryptionKeyAlgorithm5};
    }

    public static EncryptionKeyAlgorithm valueOf(String str) {
        return (EncryptionKeyAlgorithm) Enum.valueOf(EncryptionKeyAlgorithm.class, str);
    }

    public static EncryptionKeyAlgorithm[] values() {
        return (EncryptionKeyAlgorithm[]) a.clone();
    }
}
