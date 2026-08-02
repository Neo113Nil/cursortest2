package ru.yandex.taxi.yaplus;

import com.yandex.go.zone.dto.objects.Branding;
import com.yandex.go.zone.dto.objects.BrandingType;
import com.yandex.go.zone.model.Zone;
import defpackage.evu0;
import defpackage.k7x0;
import defpackage.lk51;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.rx2;
import defpackage.ul51;
import defpackage.vpr;
import defpackage.zy11;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.yaplus.YaPlusStatusRepository;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ e b;

    public c(vpr vprVar, e eVar) {
        this.a = vprVar;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        YaPlusProvider$plusInfoFlow$$inlined$map$1$2$1 yaPlusProvider$plusInfoFlow$$inlined$map$1$2$1;
        int i;
        String str;
        String str2;
        if (continuation instanceof YaPlusProvider$plusInfoFlow$$inlined$map$1$2$1) {
            yaPlusProvider$plusInfoFlow$$inlined$map$1$2$1 = (YaPlusProvider$plusInfoFlow$$inlined$map$1$2$1) continuation;
            int i2 = yaPlusProvider$plusInfoFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                yaPlusProvider$plusInfoFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = yaPlusProvider$plusInfoFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = yaPlusProvider$plusInfoFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar = this.a;
                    e eVar = this.b;
                    List<Branding> list = ((Zone) obj).D;
                    lk51 lk51Var = lk51.e;
                    ((ul51) eVar.f).getClass();
                    lk51 lk51Var2 = null;
                    EnumSet enumSet = null;
                    for (Branding branding : list) {
                        BrandingType brandingType = branding.a;
                        if (brandingType == BrandingType.YA_PLUS) {
                            k7x0 k7x0Var = eVar.c;
                            Branding.Profile profile = branding.e;
                            String a = (profile == null || (str2 = profile.c) == null) ? null : ((m7x0) k7x0Var).a(str2);
                            String a2 = (profile == null || (str = profile.d) == null) ? null : ((m7x0) k7x0Var).a(str);
                            lk51Var2 = (a == null || evu0.J(a) || a2 == null || evu0.J(a2)) ? null : new lk51(a, a2, profile.a, profile.b);
                        }
                        if (enumSet == null) {
                            enumSet = EnumSet.of(brandingType);
                        } else {
                            enumSet.add(brandingType);
                        }
                    }
                    if (lk51Var2 != null) {
                        ru.yandex.taxi.utils.c cVar = eVar.b;
                        cVar.b(lk51Var2.a);
                        cVar.b(lk51Var2.b);
                        eVar.g.a = YaPlusStatusRepository.JoinPlusStatus.GOT_PLUS;
                        rx2 rx2Var = eVar.e.a;
                        rx2Var.getClass();
                        rx2Var.a.a("Yandex.Plus.Status.Got", new HashMap(), 1, new HashMap());
                        r0 r0Var = eVar.i;
                        r0Var.getClass();
                        r0Var.m(null, lk51Var2);
                    } else {
                        eVar.g.a = YaPlusStatusRepository.JoinPlusStatus.NOT_JOINED;
                        r0 r0Var2 = eVar.i;
                        r0Var2.getClass();
                        r0Var2.m(null, lk51Var);
                    }
                    if (enumSet != null) {
                        eVar.j = enumSet;
                    }
                    if (lk51Var2 != null) {
                        lk51Var = lk51Var2;
                    }
                    yaPlusProvider$plusInfoFlow$$inlined$map$1$2$1.L$0 = null;
                    yaPlusProvider$plusInfoFlow$$inlined$map$1$2$1.L$1 = null;
                    yaPlusProvider$plusInfoFlow$$inlined$map$1$2$1.L$2 = null;
                    yaPlusProvider$plusInfoFlow$$inlined$map$1$2$1.L$3 = null;
                    yaPlusProvider$plusInfoFlow$$inlined$map$1$2$1.label = 1;
                    if (vprVar.emit(lk51Var, yaPlusProvider$plusInfoFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        yaPlusProvider$plusInfoFlow$$inlined$map$1$2$1 = new YaPlusProvider$plusInfoFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = yaPlusProvider$plusInfoFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = yaPlusProvider$plusInfoFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
