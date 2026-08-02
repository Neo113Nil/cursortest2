package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class c7h {
    public static final c7h a;
    public static final c7h b;
    public static final /* synthetic */ c7h[] c;

    static {
        c7h c7hVar = new c7h("SHOWN_ACTIVITY_REMAINED", 0);
        a = c7hVar;
        c7h c7hVar2 = new c7h("SHOWN_ACTIVITY_FINISHED", 1);
        b = c7hVar2;
        c = new c7h[]{c7hVar, c7hVar2};
    }

    public static c7h valueOf(String str) {
        return (c7h) Enum.valueOf(c7h.class, str);
    }

    public static c7h[] values() {
        return (c7h[]) c.clone();
    }
}
