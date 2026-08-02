package ru.CryptoPro.XAdES;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class cl_29 {
    public static final cl_29 a;
    public static final cl_29 b;
    public static final cl_29 c;
    private static final /* synthetic */ cl_29[] d;

    static {
        cl_29 cl_29Var = new cl_29("Unknown", 0);
        a = cl_29Var;
        cl_29 cl_29Var2 = new cl_29("ByKey", 1);
        b = cl_29Var2;
        cl_29 cl_29Var3 = new cl_29("ByName", 2);
        c = cl_29Var3;
        d = new cl_29[]{cl_29Var, cl_29Var2, cl_29Var3};
    }

    public static cl_29[] values() {
        return (cl_29[]) d.clone();
    }
}
