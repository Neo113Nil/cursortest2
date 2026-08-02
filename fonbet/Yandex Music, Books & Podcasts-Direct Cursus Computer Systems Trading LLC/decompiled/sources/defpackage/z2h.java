package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class z2h {
    public static final z2h a;
    public static final z2h b;
    public static final /* synthetic */ z2h[] c;

    static {
        z2h z2hVar = new z2h("SyncedScroll", 0);
        a = z2hVar;
        z2h z2hVar2 = new z2h("UserScroll", 1);
        b = z2hVar2;
        c = new z2h[]{z2hVar, z2hVar2};
    }

    public static z2h valueOf(String str) {
        return (z2h) Enum.valueOf(z2h.class, str);
    }

    public static z2h[] values() {
        return (z2h[]) c.clone();
    }
}
