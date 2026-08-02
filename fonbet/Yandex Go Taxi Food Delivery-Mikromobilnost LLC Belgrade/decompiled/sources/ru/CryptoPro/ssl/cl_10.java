package ru.CryptoPro.ssl;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class cl_10 {
    public static final cl_10 a;
    public static final cl_10 b;
    public static final cl_10 c;
    private static final /* synthetic */ cl_10[] d;

    static {
        cl_10 cl_10Var = new cl_10("STREAM_CIPHER", 0);
        a = cl_10Var;
        cl_10 cl_10Var2 = new cl_10("BLOCK_CIPHER", 1);
        b = cl_10Var2;
        cl_10 cl_10Var3 = new cl_10("AEAD_CIPHER", 2);
        c = cl_10Var3;
        d = new cl_10[]{cl_10Var, cl_10Var2, cl_10Var3};
    }

    public static cl_10 a(String str) {
        return (cl_10) Enum.valueOf(cl_10.class, str);
    }

    public static cl_10[] a() {
        return (cl_10[]) d.clone();
    }
}
