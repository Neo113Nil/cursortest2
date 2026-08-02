package ru.yandex.taxi.themes;

import defpackage.mo21;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiThemeChangeInteractor$locationUpdatesFlow$$inlined$map$1$2$1 taxiThemeChangeInteractor$locationUpdatesFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof TaxiThemeChangeInteractor$locationUpdatesFlow$$inlined$map$1$2$1) {
            taxiThemeChangeInteractor$locationUpdatesFlow$$inlined$map$1$2$1 = (TaxiThemeChangeInteractor$locationUpdatesFlow$$inlined$map$1$2$1) continuation;
            int i2 = taxiThemeChangeInteractor$locationUpdatesFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiThemeChangeInteractor$locationUpdatesFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiThemeChangeInteractor$locationUpdatesFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiThemeChangeInteractor$locationUpdatesFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    zzs a = ((mo21) obj).a();
                    taxiThemeChangeInteractor$locationUpdatesFlow$$inlined$map$1$2$1.L$0 = null;
                    taxiThemeChangeInteractor$locationUpdatesFlow$$inlined$map$1$2$1.L$1 = null;
                    taxiThemeChangeInteractor$locationUpdatesFlow$$inlined$map$1$2$1.L$2 = null;
                    taxiThemeChangeInteractor$locationUpdatesFlow$$inlined$map$1$2$1.L$3 = null;
                    taxiThemeChangeInteractor$locationUpdatesFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, taxiThemeChangeInteractor$locationUpdatesFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        taxiThemeChangeInteractor$locationUpdatesFlow$$inlined$map$1$2$1 = new TaxiThemeChangeInteractor$locationUpdatesFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiThemeChangeInteractor$locationUpdatesFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiThemeChangeInteractor$locationUpdatesFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
