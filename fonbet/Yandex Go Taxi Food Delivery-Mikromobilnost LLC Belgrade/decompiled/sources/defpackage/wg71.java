package defpackage;

/* loaded from: classes7.dex */
public final class wg71 {
    public final tu71 a;
    public final int[] b;

    public wg71(tu71 tu71Var, int[] iArr) {
        if (iArr.length == 0) {
            nba1.c("ETSDefinition", nba1.b("Empty tracks are not allowed", new IllegalArgumentException()));
        }
        this.a = tu71Var;
        this.b = iArr;
    }
}
