package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class mxm {
    public static final mxm a;
    public static final mxm b;
    public static final mxm c;
    public static final /* synthetic */ mxm[] d;

    static {
        mxm mxmVar = new mxm("Empty", 0);
        a = mxmVar;
        mxm mxmVar2 = new mxm("Promo", 1);
        b = mxmVar2;
        mxm mxmVar3 = new mxm("Logo", 2);
        c = mxmVar3;
        d = new mxm[]{mxmVar, mxmVar2, mxmVar3};
    }

    public static mxm valueOf(String str) {
        return (mxm) Enum.valueOf(mxm.class, str);
    }

    public static mxm[] values() {
        return (mxm[]) d.clone();
    }
}
