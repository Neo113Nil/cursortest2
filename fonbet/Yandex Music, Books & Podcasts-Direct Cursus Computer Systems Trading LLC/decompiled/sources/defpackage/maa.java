package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class maa {
    public static final maa a;
    public static final maa b;
    public static final maa c;
    public static final maa d;
    public static final /* synthetic */ maa[] e;

    static {
        maa maaVar = new maa("Play", 0);
        a = maaVar;
        maa maaVar2 = new maa("PreFetchPlayingTrack", 1);
        b = maaVar2;
        maa maaVar3 = new maa("PreFetch", 2);
        c = maaVar3;
        maa maaVar4 = new maa("Download", 3);
        d = maaVar4;
        e = new maa[]{maaVar, maaVar2, maaVar3, maaVar4};
    }

    public static maa valueOf(String str) {
        return (maa) Enum.valueOf(maa.class, str);
    }

    public static maa[] values() {
        return (maa[]) e.clone();
    }
}
