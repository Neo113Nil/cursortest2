package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class o4l {
    public static final o4l a;
    public static final o4l b;
    public static final /* synthetic */ o4l[] c;

    static {
        o4l o4lVar = new o4l("Forward", 0);
        a = o4lVar;
        o4l o4lVar2 = new o4l("Backward", 1);
        b = o4lVar2;
        c = new o4l[]{o4lVar, o4lVar2};
    }

    public static o4l valueOf(String str) {
        return (o4l) Enum.valueOf(o4l.class, str);
    }

    public static o4l[] values() {
        return (o4l[]) c.clone();
    }
}
