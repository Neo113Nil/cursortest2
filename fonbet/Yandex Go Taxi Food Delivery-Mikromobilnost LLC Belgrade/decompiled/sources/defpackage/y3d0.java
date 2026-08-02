package defpackage;

import android.content.Context;
import com.yandex.plus.core.config.Environment;
import com.yandex.plus.metrica.api.a;

/* loaded from: classes8.dex */
public final class y3d0 {
    public final Context a;
    public final Environment b;
    public final String c;
    public final String d;
    public final n4u0 e;
    public final e1d0 f;
    public final b5d0 g;
    public final lb7 h;
    public final am2 i;
    public final a j;

    public y3d0(Context context, Environment environment, String str, String str2, n4u0 n4u0Var, ru.yandex.taxi.plus.sdk.micro_widget.websdk.a aVar, b5d0 b5d0Var, lb7 lb7Var, am2 am2Var, a aVar2) {
        this.a = context;
        this.b = environment;
        this.c = str;
        this.d = str2;
        this.e = n4u0Var;
        this.f = aVar;
        this.g = b5d0Var;
        this.h = lb7Var;
        this.i = am2Var;
        this.j = aVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y3d0) {
            y3d0 y3d0Var = (y3d0) obj;
            if (jl40.l(this.a, y3d0Var.a) && this.b == y3d0Var.b && jl40.l(this.c, y3d0Var.c) && jl40.l(this.d, y3d0Var.d) && jl40.l(this.e, y3d0Var.e) && jl40.l(this.f, y3d0Var.f) && jl40.l(this.g, y3d0Var.g) && this.h == y3d0Var.h && this.i == y3d0Var.i && jl40.l(this.j, y3d0Var.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + unr0.b(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "RequiredDependencies(context=" + this.a + ", environment=" + this.b + ", serviceName=" + this.c + ", hostScheme=" + this.d + ", themeStateFlow=" + this.e + ", authAdapter=" + this.f + ", imageLoader=" + this.g + ", paySdkAdapterProvider=" + this.h + ", plusAcqAdapterProvider=" + this.i + ", metricaProvider=" + this.j + ')';
    }
}
