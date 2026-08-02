package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class yan {
    public static final yan a;
    public static final yan b;
    public static final /* synthetic */ yan[] c;

    static {
        yan yanVar = new yan("Primary", 0);
        a = yanVar;
        yan yanVar2 = new yan("Secondary", 1);
        b = yanVar2;
        c = new yan[]{yanVar, yanVar2};
    }

    public static yan valueOf(String str) {
        return (yan) Enum.valueOf(yan.class, str);
    }

    public static yan[] values() {
        return (yan[]) c.clone();
    }
}
