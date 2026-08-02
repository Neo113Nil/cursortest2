package defpackage;

import com.yandex.go.image.internal.coil.utils.a;

/* loaded from: classes.dex */
public final class xt50 implements yt50 {
    public final yp6 a;
    public final oz50 b;

    public xt50(yp6 yp6Var, oz50 oz50Var) {
        this.a = yp6Var;
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
