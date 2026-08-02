package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class elu {
    public static final elu a;
    public static final elu b;
    public static final elu c;
    public static final elu d;
    public static final elu e;
    public static final /* synthetic */ elu[] f;

    static {
        elu eluVar = new elu("ALBUM", 0);
        a = eluVar;
        elu eluVar2 = new elu("PLAYLIST", 1);
        b = eluVar2;
        elu eluVar3 = new elu("TRACK", 2);
        c = eluVar3;
        elu eluVar4 = new elu("ARTIST", 3);
        d = eluVar4;
        elu eluVar5 = new elu("CUSTOM", 4);
        e = eluVar5;
        f = new elu[]{eluVar, eluVar2, eluVar3, eluVar4, eluVar5};
    }

    public static elu valueOf(String str) {
        return (elu) Enum.valueOf(elu.class, str);
    }

    public static elu[] values() {
        return (elu[]) f.clone();
    }
}
