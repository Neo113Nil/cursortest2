package defpackage;

import com.yandex.go.dynamic.api.DynamicFeature;
import com.yandex.go.dynamic.impl.b;
import kotlin.a;

/* loaded from: classes.dex */
public final class x7n extends h55 {
    public final w030 D;
    public final i7n E;
    public final m7n F;
    public final p7n G;
    public final i3y H;

    public x7n(w030 w030Var, i7n i7nVar, m7n m7nVar, p7n p7nVar) {
        super(null);
        this.D = w030Var;
        this.E = i7nVar;
        this.F = m7nVar;
        this.G = p7nVar;
        this.H = a.a(new sbc(17, this));
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        u7n u7nVar = (u7n) obj;
        DynamicFeature dynamicFeature = u7nVar.a;
        ((b) this.E).getClass();
        d8n n = b.n(dynamicFeature);
        if (n instanceof b8n) {
            r(new d8(21, (b8n) n));
        } else if (n instanceof c8n) {
            r(new qu(9));
        } else {
            D((r7n) this.H.getValue(), u7nVar, new w7n(this));
        }
    }
}
