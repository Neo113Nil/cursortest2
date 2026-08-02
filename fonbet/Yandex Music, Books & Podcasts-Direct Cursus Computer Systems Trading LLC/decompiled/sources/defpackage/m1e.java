package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class m1e implements rjc {
    public final /* synthetic */ int a;
    public final /* synthetic */ u1e b;

    public /* synthetic */ m1e(u1e u1eVar, int i) {
        this.a = i;
        this.b = u1eVar;
    }

    @Override // defpackage.rjc
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        u1e u1eVar = this.b;
        switch (i) {
            case 0:
                ((Boolean) obj).getClass();
                u1eVar.b();
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                xdr xdrVar = ((g9m) u1eVar.A.getValue()).m;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                break;
            case 2:
                if (((Boolean) obj).booleanValue()) {
                    ((kj5) ((lj5) ((c1e) u1eVar.s.getValue()).b.getValue())).b("home_landing_filter", new rea(14));
                } else {
                    ((kj5) ((lj5) ((c1e) u1eVar.s.getValue()).b.getValue())).a("home_landing_filter");
                }
                break;
            case 3:
                ou0 ou0Var = (ou0) obj;
                s2e s2eVar = u1eVar.C;
                if (s2eVar != null) {
                    if (ou0Var == ou0.c) {
                        s2eVar.j().setBackgroundResource(R.color.bg_primary_night);
                        s2eVar.t = s2eVar.e(R.color.bg_primary_night);
                        s2eVar.u = R.drawable.wave_animation_placeholder_dark;
                        s2eVar.r = s2eVar.e(R.color.bg_primary_night);
                        s2eVar.i().setColorSchemeColors(s2eVar.e(R.color.icon_primary_night));
                        s2eVar.i().setProgressBackgroundColorSchemeColor(s2eVar.e(R.color.bg_secondary_night));
                    } else {
                        s2eVar.j().setBackgroundResource(R.color.bg_primary_day);
                        s2eVar.t = s2eVar.e(R.color.bg_primary_day);
                        s2eVar.u = R.drawable.wave_animation_placeholder_light;
                        s2eVar.r = s2eVar.e(R.color.bg_primary_day);
                        s2eVar.i().setColorSchemeColors(s2eVar.e(R.color.icon_primary_day));
                        s2eVar.i().setProgressBackgroundColorSchemeColor(s2eVar.e(R.color.bg_secondary_day));
                    }
                }
                break;
            default:
                v3w.n(!((Boolean) obj).booleanValue(), u1eVar.K, null);
                break;
        }
        return Unit.a;
    }
}
