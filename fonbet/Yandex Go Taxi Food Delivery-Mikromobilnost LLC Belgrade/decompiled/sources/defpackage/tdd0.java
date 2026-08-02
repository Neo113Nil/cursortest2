package defpackage;

import android.content.Context;
import com.yandex.go.plus.api.model.PlusBrandType;
import com.yandex.go.plus.pay.presentation.b;
import com.yandex.plus.metrica.api.a;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.plus.sdk.Environment;

/* loaded from: classes13.dex */
public final class tdd0 implements v7p {
    public final xvf0 a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;
    public final xvf0 k;
    public final r5g l;
    public final xvf0 m;

    public tdd0(sdd0 sdd0Var, n3w n3wVar, xvf0 xvf0Var, r5g r5gVar, r5g r5gVar2, r5g r5gVar3, xvf0 xvf0Var2, xvf0 xvf0Var3, s5g s5gVar, r5g r5gVar4, xvf0 xvf0Var4, xvf0 xvf0Var5, r5g r5gVar5, r5g r5gVar6) {
        this.a = n3wVar;
        this.b = xvf0Var;
        this.c = r5gVar;
        this.d = r5gVar2;
        this.e = r5gVar3;
        this.f = xvf0Var2;
        this.g = xvf0Var3;
        this.h = s5gVar;
        this.i = r5gVar4;
        this.j = xvf0Var4;
        this.k = xvf0Var5;
        this.l = r5gVar5;
        this.m = r5gVar6;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        eed0 eed0Var = (eed0) this.a.get();
        PlusBrandType plusBrandType = (PlusBrandType) this.b.get();
        Context context = (Context) this.c.get();
        Environment environment = (Environment) this.f.get();
        p5z p5zVar = (p5z) this.g.get();
        OkHttpClient.a aVar = (OkHttpClient.a) this.h.get();
        gld0 gld0Var = (gld0) this.i.get();
        b bVar = (b) this.j.get();
        a aVar2 = (a) this.k.get();
        this.l.get();
        return new fbd0(context, environment, p5zVar, eed0Var.a, "5.89.0", gld0Var, aVar, aVar2, eed0Var.b, bVar, plusBrandType);
    }
}
