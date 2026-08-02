package defpackage;

import com.yandex.xplat.common.YSError;
import com.yandex.xplat.common.c;

/* loaded from: classes14.dex */
public final class tyj0 {
    public final w40 a;
    public final YSError b;

    public tyj0(Object obj, YSError ySError) {
        this.a = ySError == null ? new w40(obj) : null;
        this.b = ySError;
    }

    public final Object a() {
        w40 w40Var = this.a;
        c.b(w40Var);
        return w40Var.a;
    }

    public final boolean b() {
        return this.b != null;
    }

    public final boolean c() {
        return this.b == null;
    }

    public final Object d() {
        if (!b()) {
            return a();
        }
        YSError ySError = this.b;
        c.b(ySError);
        throw ySError;
    }
}
