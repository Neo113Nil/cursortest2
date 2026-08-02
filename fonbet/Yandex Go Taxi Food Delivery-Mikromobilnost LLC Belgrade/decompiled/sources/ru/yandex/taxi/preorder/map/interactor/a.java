package ru.yandex.taxi.preorder.map.interactor;

import android.content.Context;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import defpackage.azi;
import defpackage.bzi;
import defpackage.czi;
import defpackage.fnx0;
import defpackage.kb5;
import defpackage.pex0;
import defpackage.t7s;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.uze0;
import defpackage.w511;
import defpackage.wiq0;
import defpackage.wyi;
import java.util.Calendar;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.tariffs.model.PriceUpdate$PriceLoadingState;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class a {
    public final Context a;
    public final tt2 b;
    public final wiq0 c;
    public final uze0 d;
    public final bzi e;
    public final wyi f;

    public a(Context context, tt2 tt2Var, wiq0 wiq0Var, uze0 uze0Var, bzi bziVar, wyi wyiVar) {
        this.a = context;
        this.b = tt2Var;
        this.c = wiq0Var;
        this.d = uze0Var;
        this.e = bziVar;
        this.f = wyiVar;
    }

    public final String a(PriceUpdate$PriceLoadingState priceUpdate$PriceLoadingState, fnx0 fnx0Var) {
        pex0 m;
        kb5 kb5Var;
        bzi bziVar = this.e;
        if (((azi) bziVar.a.b()).b) {
            int i = priceUpdate$PriceLoadingState == null ? -1 : czi.a[priceUpdate$PriceLoadingState.ordinal()];
            if (i != -1) {
                wyi wyiVar = this.f;
                if (i == 1) {
                    wyiVar.c = null;
                    return bziVar.b;
                }
                if (i != 2 && i != 3) {
                    if (i != 4) {
                        w511.b();
                        return null;
                    }
                    if (((fnx0Var == null || (kb5Var = fnx0Var.e) == null) ? null : kb5Var.d) == TariffOrderFlow.TAXI_FLOW && (m = ((k) this.c).m()) != null) {
                        int ceil = (int) Math.ceil(m.r.b / 60.0f);
                        Integer valueOf = Integer.valueOf(ceil);
                        if (ceil <= 0) {
                            valueOf = null;
                        }
                        if (valueOf != null) {
                            int intValue = valueOf.intValue();
                            int i2 = m.h.a;
                            Integer valueOf2 = Integer.valueOf(i2);
                            if (i2 <= 0) {
                                valueOf2 = null;
                            }
                            if (valueOf2 != null) {
                                int intValue2 = valueOf2.intValue();
                                Calendar calendar = Calendar.getInstance();
                                calendar.add(12, intValue + intValue2 + ((azi) bziVar.a.b()).f);
                                String c = t7s.c(this.a, calendar, 1);
                                wyiVar.c = c;
                                return c;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }

    public final tpr b() {
        n nVar = new n(new m0(((k) this.d).j.a(), ((k) this.c).j.b(), new DestinationArrivalTimePinInteractor$getArrivalTimeChangeFlow$1(this, null)), new DestinationArrivalTimePinInteractor$getArrivalTimeChangeFlow$2(this, null));
        this.b.getClass();
        return e.F(nVar, uyj.a);
    }
}
