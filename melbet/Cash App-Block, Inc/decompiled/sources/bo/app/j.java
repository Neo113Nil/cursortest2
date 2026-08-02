package bo.app;

/* loaded from: classes3.dex */
public abstract class j {
    public final n9 a;
    public final Long b;

    public j(d9 d9Var, n9 n9Var) {
        d9Var.getClass();
        n9Var.getClass();
        this.a = n9Var;
        String str = (String) n9Var.b.get("retry-after");
        this.b = str != null ? com.braze.support.h.a(str) : null;
    }
}
