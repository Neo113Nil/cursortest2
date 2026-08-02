package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b6h {
    public static final b6h a;
    public static final b6h b;
    public static final /* synthetic */ b6h[] c;

    static {
        b6h b6hVar = new b6h("Start", 0);
        a = b6hVar;
        b6h b6hVar2 = new b6h("End", 1);
        b = b6hVar2;
        c = new b6h[]{b6hVar, b6hVar2};
    }

    public static b6h valueOf(String str) {
        return (b6h) Enum.valueOf(b6h.class, str);
    }

    public static b6h[] values() {
        return (b6h[]) c.clone();
    }
}
