package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class a3h {
    public static final a3h a;
    public static final a3h b;
    public static final /* synthetic */ a3h[] c;

    static {
        a3h a3hVar = new a3h("All", 0);
        a = a3hVar;
        a3h a3hVar2 = new a3h("Interactive", 1);
        b = a3hVar2;
        c = new a3h[]{a3hVar, a3hVar2};
    }

    public static a3h valueOf(String str) {
        return (a3h) Enum.valueOf(a3h.class, str);
    }

    public static a3h[] values() {
        return (a3h[]) c.clone();
    }
}
