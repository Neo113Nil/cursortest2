package defpackage;

import com.yandex.go.image.internal.coil.utils.a;

/* loaded from: classes.dex */
public final class wt50 implements yt50 {
    public final qci0 a;
    public final oz50 b;

    public wt50(qci0 qci0Var, oz50 oz50Var) {
        this.a = qci0Var;
        this.b = oz50Var;
    }

    @Override // defpackage.yt50
    public final oz50 M0() {
        return this.b;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a.a(this.a);
    }
}
