package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class g4c {
    public static final g4c a;
    public static final g4c b;
    public static final /* synthetic */ g4c[] c;

    static {
        g4c g4cVar = new g4c("LEFT", 0);
        a = g4cVar;
        g4c g4cVar2 = new g4c("RIGHT", 1);
        b = g4cVar2;
        c = new g4c[]{g4cVar, g4cVar2, new g4c("BOTTOM", 2), new g4c("TOP", 3)};
    }

    public static g4c valueOf(String str) {
        return (g4c) Enum.valueOf(g4c.class, str);
    }

    public static g4c[] values() {
        return (g4c[]) c.clone();
    }
}
