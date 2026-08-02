package ru.yandex.taxi.scooters.presentation.share_location.domain;

import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.vpr;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.preorder.source.userposition.e;

/* loaded from: classes6.dex */
public final class c implements vpr {
    public final /* synthetic */ d a;

    public c(d dVar) {
        this.a = dVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(List list, Continuation continuation) {
        ScootersShareLocationInteractor$sendLocationPeriodically$4$emit$1 scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1;
        int i;
        ru.yandex.taxi.scooters.presentation.share_location.data.b bVar;
        if (continuation instanceof ScootersShareLocationInteractor$sendLocationPeriodically$4$emit$1) {
            scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1 = (ScootersShareLocationInteractor$sendLocationPeriodically$4$emit$1) continuation;
            int i2 = scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = this.a;
                    ru.yandex.taxi.scooters.presentation.share_location.data.b bVar2 = dVar.e;
                    po21 po21Var = dVar.d;
                    scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1.L$0 = list;
                    scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1.L$1 = bVar2;
                    scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1.label = 1;
                    Object f = ((e) po21Var).f(scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1);
                    if (f != coroutineSingletons) {
                        obj = f;
                        bVar = bVar2;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                bVar = (ru.yandex.taxi.scooters.presentation.share_location.data.b) scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1.L$1;
                list = (List) scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1.L$0;
                kotlin.b.b(obj);
                scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1.L$0 = null;
                scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1.L$1 = null;
                scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1.label = 2;
                Object a = bVar.a((mo21) obj, list, scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1);
                return a != coroutineSingletons ? coroutineSingletons : a;
            }
        }
        scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1 = new ScootersShareLocationInteractor$sendLocationPeriodically$4$emit$1(this, continuation);
        Object obj2 = scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1.label;
        if (i != 0) {
        }
        scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1.L$0 = null;
        scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1.L$1 = null;
        scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1.label = 2;
        Object a2 = bVar.a((mo21) obj2, list, scootersShareLocationInteractor$sendLocationPeriodically$4$emit$1);
        if (a2 != coroutineSingletons2) {
        }
    }
}
