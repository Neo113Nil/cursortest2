package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class m80 {
    public static final m80 a;
    public static final m80 b;
    public static final m80 c;
    public static final m80 d;
    public static final m80 e;
    public static final m80 f;
    public static final /* synthetic */ m80[] g;

    static {
        m80 m80Var = new m80("ALBUM", 0);
        a = m80Var;
        m80 m80Var2 = new m80("ARTIST", 1);
        b = m80Var2;
        m80 m80Var3 = new m80("PLAYLIST", 2);
        c = m80Var3;
        m80 m80Var4 = new m80("WAVE", 3);
        d = m80Var4;
        m80 m80Var5 = new m80("QUERY_TO_VIBE", 4);
        e = m80Var5;
        m80 m80Var6 = new m80("TRACK", 5);
        f = m80Var6;
        g = new m80[]{m80Var, m80Var2, m80Var3, m80Var4, m80Var5, m80Var6};
    }

    public static m80 valueOf(String str) {
        return (m80) Enum.valueOf(m80.class, str);
    }

    public static m80[] values() {
        return (m80[]) g.clone();
    }
}
