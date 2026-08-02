package ru.CryptoPro.ssl;

import com.samsung.android.sdk.samsungpay.v2.card.Card;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
final class cl_117 {
    public static final cl_117 a;
    public static final cl_117 b;
    public static final cl_117 c;
    public static final cl_117 d;
    private static final /* synthetic */ cl_117[] e;

    static {
        cl_117 cl_117Var = new cl_117("OK", 0);
        a = cl_117Var;
        cl_117 cl_117Var2 = new cl_117("INSENSITIVE", 1);
        b = cl_117Var2;
        cl_117 cl_117Var3 = new cl_117(Card.EXPIRED, 2);
        c = cl_117Var3;
        cl_117 cl_117Var4 = new cl_117("EXTENSION_MISMATCH", 3);
        d = cl_117Var4;
        e = new cl_117[]{cl_117Var, cl_117Var2, cl_117Var3, cl_117Var4};
    }

    public static cl_117 a(String str) {
        return (cl_117) Enum.valueOf(cl_117.class, str);
    }

    public static cl_117[] a() {
        return (cl_117[]) e.clone();
    }
}
