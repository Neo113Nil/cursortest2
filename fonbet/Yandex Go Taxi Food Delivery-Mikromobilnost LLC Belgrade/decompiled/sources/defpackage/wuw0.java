package defpackage;

import android.content.Context;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import ru.yandex.taxi.surge.interactor.r;
import ru.yandex.taxi.surge.repository.a;

/* loaded from: classes6.dex */
public final class wuw0 extends ad5 {
    public final r A;
    public final a B;
    public final wiq0 C;
    public final quw0 D;
    public final tj60 E;
    public final xcv0 F;
    public final Context x;
    public final rye0 y;
    public final l7s0 z;

    public wuw0(Context context, rye0 rye0Var, l7s0 l7s0Var, r rVar, a aVar, wiq0 wiq0Var, quw0 quw0Var, tj60 tj60Var, xcv0 xcv0Var) {
        super(vuw0.class);
        this.x = context;
        this.y = rye0Var;
        this.z = l7s0Var;
        this.A = rVar;
        this.B = aVar;
        this.C = wiq0Var;
        this.D = quw0Var;
        this.E = tj60Var;
        this.F = xcv0Var;
    }

    public static final wt60 Kg(wuw0 wuw0Var) {
        pex0 m = ((k) wuw0Var.C).m();
        if (m == null) {
            return null;
        }
        is60 is60Var = m.J0.b;
        String str = m.b;
        wu1 wu1Var = m.O;
        return new wt60(is60Var, str, wu1Var != null ? wu1Var.a() : null);
    }
}
