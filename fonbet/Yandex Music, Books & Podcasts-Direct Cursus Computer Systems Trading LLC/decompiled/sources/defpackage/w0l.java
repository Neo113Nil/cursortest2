package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class w0l {
    public static final w0l a;
    public static final w0l b;
    public static final w0l c;
    public static final /* synthetic */ w0l[] d;

    static {
        w0l w0lVar = new w0l("NotPlaying", 0);
        a = w0lVar;
        w0l w0lVar2 = new w0l("PlayWhenReady", 1);
        b = w0lVar2;
        w0l w0lVar3 = new w0l("Suspended", 2);
        c = w0lVar3;
        d = new w0l[]{w0lVar, w0lVar2, w0lVar3};
    }

    public static w0l valueOf(String str) {
        return (w0l) Enum.valueOf(w0l.class, str);
    }

    public static w0l[] values() {
        return (w0l[]) d.clone();
    }
}
