package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a4d {
    public static final a4d a;
    public static final a4d b;
    public static final a4d c;
    public static final /* synthetic */ a4d[] d;

    static {
        a4d a4dVar = new a4d("NONE", 0);
        a = a4dVar;
        a4d a4dVar2 = new a4d("PAUSE_SENT", 1);
        b = a4dVar2;
        a4d a4dVar3 = new a4d("PLAY_SENT", 2);
        c = a4dVar3;
        d = new a4d[]{a4dVar, a4dVar2, a4dVar3};
    }

    public static a4d valueOf(String str) {
        return (a4d) Enum.valueOf(a4d.class, str);
    }

    public static a4d[] values() {
        return (a4d[]) d.clone();
    }
}
