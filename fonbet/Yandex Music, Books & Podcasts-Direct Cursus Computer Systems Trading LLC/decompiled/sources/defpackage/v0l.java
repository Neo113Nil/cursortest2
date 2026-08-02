package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class v0l {
    public static final v0l a;
    public static final v0l b;
    public static final v0l c;
    public static final v0l d;
    public static final /* synthetic */ v0l[] e;

    static {
        v0l v0lVar = new v0l("Idle", 0);
        a = v0lVar;
        v0l v0lVar2 = new v0l("Preparing", 1);
        b = v0lVar2;
        v0l v0lVar3 = new v0l("Buffering", 2);
        c = v0lVar3;
        v0l v0lVar4 = new v0l("Ready", 3);
        d = v0lVar4;
        e = new v0l[]{v0lVar, v0lVar2, v0lVar3, v0lVar4};
    }

    public static v0l valueOf(String str) {
        return (v0l) Enum.valueOf(v0l.class, str);
    }

    public static v0l[] values() {
        return (v0l[]) e.clone();
    }
}
