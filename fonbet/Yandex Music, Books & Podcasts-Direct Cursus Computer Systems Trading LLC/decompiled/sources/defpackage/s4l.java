package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class s4l {
    public static final s4l a;
    public static final s4l b;
    public static final s4l c;
    public static final s4l d;
    public static final s4l e;
    public static final /* synthetic */ s4l[] f;

    static {
        s4l s4lVar = new s4l("Login", 0);
        a = s4lVar;
        s4l s4lVar2 = new s4l("Pause", 1);
        b = s4lVar2;
        s4l s4lVar3 = new s4l("Foreground", 2);
        c = s4lVar3;
        s4l s4lVar4 = new s4l("Timeout", 3);
        d = s4lVar4;
        s4l s4lVar5 = new s4l("Network", 4);
        e = s4lVar5;
        f = new s4l[]{s4lVar, s4lVar2, s4lVar3, s4lVar4, s4lVar5};
    }

    public static s4l valueOf(String str) {
        return (s4l) Enum.valueOf(s4l.class, str);
    }

    public static s4l[] values() {
        return (s4l[]) f.clone();
    }
}
