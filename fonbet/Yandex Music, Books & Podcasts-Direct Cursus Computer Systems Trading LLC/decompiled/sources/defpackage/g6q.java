package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class g6q {
    public static final g6q a;
    public static final g6q b;
    public static final g6q c;
    public static final /* synthetic */ g6q[] d;

    static {
        g6q g6qVar = new g6q("None", 0);
        a = g6qVar;
        g6q g6qVar2 = new g6q("Disabled", 1);
        b = g6qVar2;
        g6q g6qVar3 = new g6q("LoudnessEnhancer", 2);
        g6q g6qVar4 = new g6q("DynamicProcessing", 3);
        g6q g6qVar5 = new g6q("AudioProcessor", 4);
        c = g6qVar5;
        d = new g6q[]{g6qVar, g6qVar2, g6qVar3, g6qVar4, g6qVar5};
    }

    public static g6q valueOf(String str) {
        return (g6q) Enum.valueOf(g6q.class, str);
    }

    public static g6q[] values() {
        return (g6q[]) d.clone();
    }
}
