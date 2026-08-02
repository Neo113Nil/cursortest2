package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class qmu {
    public static final qmu a;
    public static final qmu b;
    public static final qmu c;
    public static final qmu d;
    public static final /* synthetic */ qmu[] e;

    static {
        qmu qmuVar = new qmu("NOT_IN_PLAYER", 0);
        a = qmuVar;
        qmu qmuVar2 = new qmu("LAUNCHING", 1);
        b = qmuVar2;
        qmu qmuVar3 = new qmu("PLAYING", 2);
        c = qmuVar3;
        qmu qmuVar4 = new qmu("PAUSED", 3);
        d = qmuVar4;
        e = new qmu[]{qmuVar, qmuVar2, qmuVar3, qmuVar4};
    }

    public static qmu valueOf(String str) {
        return (qmu) Enum.valueOf(qmu.class, str);
    }

    public static qmu[] values() {
        return (qmu[]) e.clone();
    }

    public final boolean a() {
        return this == c || this == b;
    }
}
