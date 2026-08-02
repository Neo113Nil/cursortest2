package ru.yandex.taxi.tariffs.interactor;

import com.yandex.go.zone.model.Zone;
import defpackage.hbp0;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.xoe0;
import defpackage.yoe0;
import defpackage.zoe0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes10.dex */
public final class e implements vpr {
    public final /* synthetic */ f a;

    public e(f fVar) {
        this.a = fVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        Object value;
        Zone zone;
        hbp0 hbp0Var;
        yoe0 yoe0Var = (yoe0) obj;
        f fVar = this.a;
        r0 r0Var = fVar.h;
        do {
            value = r0Var.getValue();
            zoe0 zoe0Var = (zoe0) value;
            if (zoe0Var instanceof xoe0) {
                ((xoe0) zoe0Var).b.a(null);
            }
            zone = yoe0Var.a;
            hbp0Var = fVar.a.a;
            fVar.b.getClass();
        } while (!r0Var.k(value, new xoe0(yoe0Var.a, tje.N(hbp0Var, uyj.a, null, new TariffImagesPreloadInteractor$preloadImages$1(zone, fVar, null), 2))));
        return zy11.a;
    }
}
