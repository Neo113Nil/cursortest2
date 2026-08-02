package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class msu {
    public static final msu a;
    public static final msu b;
    public static final /* synthetic */ msu[] c;

    static {
        msu msuVar = new msu("Fallback", 0);
        a = msuVar;
        msu msuVar2 = new msu("Shader", 1);
        b = msuVar2;
        c = new msu[]{msuVar, msuVar2};
    }

    public static msu valueOf(String str) {
        return (msu) Enum.valueOf(msu.class, str);
    }

    public static msu[] values() {
        return (msu[]) c.clone();
    }
}
