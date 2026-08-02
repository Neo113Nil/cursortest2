package defpackage;

import androidx.compose.foundation.lazy.b;
import androidx.compose.ui.platform.j;
import kotlin.collections.a;
import ru.yandex.taxi.logistics.sdk.ui_models.common.YaTextStyle;

/* loaded from: classes5.dex */
public abstract class rx21 {
    public static final long a(ow91 ow91Var, fid fidVar) {
        if (ow91Var instanceof qj51) {
            bts btsVar = (bts) fidVar;
            btsVar.e0(2048281148);
            long d = ((el51) btsVar.m(gl51.a)).d();
            btsVar.t(false);
            return d;
        }
        if (ow91Var instanceof tj51) {
            bts btsVar2 = (bts) fidVar;
            btsVar2.e0(2048291389);
            long n = ((el51) btsVar2.m(gl51.a)).n();
            btsVar2.t(false);
            return n;
        }
        if (ow91Var instanceof uj51) {
            bts btsVar3 = (bts) fidVar;
            btsVar3.e0(2048293310);
            long o = ((el51) btsVar3.m(gl51.a)).o();
            btsVar3.t(false);
            return o;
        }
        if (ow91Var instanceof rj51) {
            bts btsVar4 = (bts) fidVar;
            btsVar4.e0(2048301950);
            long k = ((el51) btsVar4.m(gl51.a)).k();
            btsVar4.t(false);
            return k;
        }
        if (!(ow91Var instanceof sj51)) {
            throw unr0.y(2048278425, (bts) fidVar, false);
        }
        bts btsVar5 = (bts) fidVar;
        btsVar5.e0(2048310783);
        long m = ((el51) btsVar5.m(gl51.a)).m();
        btsVar5.t(false);
        return m;
    }

    public static final ety0 b(YaTextStyle yaTextStyle, fid fidVar) {
        switch (kx21.a[yaTextStyle.ordinal()]) {
            case 1:
                bts btsVar = (bts) fidVar;
                btsVar.e0(24991226);
                ety0 ety0Var = ((zm51) btsVar.m(an51.a)).a;
                btsVar.t(false);
                return ety0Var;
            case 2:
                bts btsVar2 = (bts) fidVar;
                btsVar2.e0(24993146);
                ety0 ety0Var2 = ((zm51) btsVar2.m(an51.a)).b;
                btsVar2.t(false);
                return ety0Var2;
            case 3:
                bts btsVar3 = (bts) fidVar;
                btsVar3.e0(24995066);
                ety0 ety0Var3 = ((zm51) btsVar3.m(an51.a)).c;
                btsVar3.t(false);
                return ety0Var3;
            case 4:
                bts btsVar4 = (bts) fidVar;
                btsVar4.e0(24996986);
                ety0 ety0Var4 = ((zm51) btsVar4.m(an51.a)).d;
                btsVar4.t(false);
                return ety0Var4;
            case 5:
                bts btsVar5 = (bts) fidVar;
                btsVar5.e0(24998873);
                ety0 ety0Var5 = ((zm51) btsVar5.m(an51.a)).e;
                btsVar5.t(false);
                return ety0Var5;
            case 6:
                bts btsVar6 = (bts) fidVar;
                btsVar6.e0(25000729);
                ety0 ety0Var6 = ((zm51) btsVar6.m(an51.a)).f;
                btsVar6.t(false);
                return ety0Var6;
            case 7:
                bts btsVar7 = (bts) fidVar;
                btsVar7.e0(25002684);
                ety0 ety0Var7 = ((zm51) btsVar7.m(an51.a)).g;
                btsVar7.t(false);
                return ety0Var7;
            case 8:
                bts btsVar8 = (bts) fidVar;
                btsVar8.e0(25004732);
                ety0 ety0Var8 = ((zm51) btsVar8.m(an51.a)).h;
                btsVar8.t(false);
                return ety0Var8;
            default:
                throw unr0.y(24989579, (bts) fidVar, false);
        }
    }

    public static f530 c(f530 f530Var, boolean z, tls tlsVar) {
        return z ? f530Var.k((f530) tlsVar.invoke(f530Var)) : f530Var;
    }

    public static final f530 d(f530 f530Var, Double d, ldc ldcVar) {
        if (ldcVar == null || d == null) {
            return f530Var;
        }
        return f530Var.k(bb1.i(c530.a, new pzy0(ldc.b(ldcVar.a, (float) d.doubleValue(), 0.0f, 0.0f, 0.0f, 14), 5)));
    }

    public static final float e(float f, fid fidVar) {
        return ((fwi) ((bts) fidVar).m(j.h)).w0(f);
    }

    public static final boolean f(b bVar) {
        n6y n6yVar = (n6y) a.b0(bVar.j().k);
        if (n6yVar == null) {
            return true;
        }
        t6y t6yVar = (t6y) n6yVar;
        return t6yVar.p + t6yVar.o <= bVar.j().m;
    }
}
