package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class r5d {
    public static final r5d a;
    public static final r5d b;
    public static final r5d c;
    public static final r5d d;
    public static final r5d e;
    public static final r5d f;
    public static final r5d g;
    public static final /* synthetic */ r5d[] h;

    static {
        r5d r5dVar = new r5d("IDLE", 0);
        a = r5dVar;
        r5d r5dVar2 = new r5d("EXO_PLAYER", 1);
        b = r5dVar2;
        r5d r5dVar3 = new r5d("CHROMECAST", 2);
        c = r5dVar3;
        r5d r5dVar4 = new r5d("VIDEO_CLIP", 3);
        d = r5dVar4;
        r5d r5dVar5 = new r5d("GLAGOL_CAST", 4);
        e = r5dVar5;
        r5d r5dVar6 = new r5d("YNISON_CAST", 5);
        f = r5dVar6;
        r5d r5dVar7 = new r5d("RELAY_CAST", 6);
        r5d r5dVar8 = new r5d("TEST", 7);
        g = r5dVar8;
        h = new r5d[]{r5dVar, r5dVar2, r5dVar3, r5dVar4, r5dVar5, r5dVar6, r5dVar7, r5dVar8};
    }

    public static r5d valueOf(String str) {
        return (r5d) Enum.valueOf(r5d.class, str);
    }

    public static r5d[] values() {
        return (r5d[]) h.clone();
    }
}
