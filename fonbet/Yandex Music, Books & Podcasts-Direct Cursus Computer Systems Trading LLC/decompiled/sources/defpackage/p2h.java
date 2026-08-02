package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class p2h {
    public static final p2h a;
    public static final p2h b;
    public static final /* synthetic */ p2h[] c;

    /* JADX INFO: Fake field, exist only in values array */
    p2h EF0;

    static {
        p2h p2hVar = new p2h("FULL_SCREEN", 0);
        p2h p2hVar2 = new p2h("WITH_CONTROLS", 1);
        a = p2hVar2;
        p2h p2hVar3 = new p2h("HIDDEN", 2);
        b = p2hVar3;
        c = new p2h[]{p2hVar, p2hVar2, p2hVar3};
    }

    public static p2h valueOf(String str) {
        return (p2h) Enum.valueOf(p2h.class, str);
    }

    public static p2h[] values() {
        return (p2h[]) c.clone();
    }
}
