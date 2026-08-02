package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class evo {
    public static final evo a;
    public static final evo b;
    public static final /* synthetic */ evo[] c;

    static {
        evo evoVar = new evo("Player", 0);
        a = evoVar;
        evo evoVar2 = new evo("Queue", 1);
        b = evoVar2;
        c = new evo[]{evoVar, evoVar2};
    }

    public static evo valueOf(String str) {
        return (evo) Enum.valueOf(evo.class, str);
    }

    public static evo[] values() {
        return (evo[]) c.clone();
    }
}
