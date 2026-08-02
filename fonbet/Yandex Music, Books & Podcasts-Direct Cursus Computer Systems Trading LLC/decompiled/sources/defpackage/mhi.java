package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class mhi {
    public static final mhi a;
    public static final mhi b;
    public static final mhi c;
    public static final /* synthetic */ mhi[] d;

    static {
        mhi mhiVar = new mhi("NOT_SELECTED", 0);
        a = mhiVar;
        mhi mhiVar2 = new mhi("PLAYING", 1);
        b = mhiVar2;
        mhi mhiVar3 = new mhi("PAUSED", 2);
        c = mhiVar3;
        d = new mhi[]{mhiVar, mhiVar2, mhiVar3};
    }

    public static mhi valueOf(String str) {
        return (mhi) Enum.valueOf(mhi.class, str);
    }

    public static mhi[] values() {
        return (mhi[]) d.clone();
    }
}
