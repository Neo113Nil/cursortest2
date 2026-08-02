package ru.yandex.taxi.address.base;

import defpackage.atd0;
import defpackage.g8e;
import defpackage.jst;
import defpackage.ny61;
import defpackage.po0;
import defpackage.qo0;
import defpackage.tpr;
import defpackage.w511;
import defpackage.wsd0;
import defpackage.xsd0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.search.suggest.i;

/* loaded from: classes5.dex */
public final class a implements xsd0 {
    public final atd0 a;

    public a(atd0 atd0Var) {
        this.a = atd0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.xsd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(wsd0 wsd0Var, Continuation continuation) {
        FinalSuggestRepeatRouter$launch$1 finalSuggestRepeatRouter$launch$1;
        int i;
        RoutePointType routePointType;
        if (continuation instanceof FinalSuggestRepeatRouter$launch$1) {
            finalSuggestRepeatRouter$launch$1 = (FinalSuggestRepeatRouter$launch$1) continuation;
            int i2 = finalSuggestRepeatRouter$launch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                finalSuggestRepeatRouter$launch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = finalSuggestRepeatRouter$launch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = finalSuggestRepeatRouter$launch$1.label;
                zy11 zy11Var = zy11.a;
                if (i == 0) {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                    return zy11Var;
                }
                b.b(obj);
                boolean z = wsd0Var instanceof qo0;
                qo0 qo0Var = z ? (qo0) wsd0Var : null;
                if (qo0Var == null && !(wsd0Var instanceof po0)) {
                    jst.e.r(g8e.o("FinalSuggestRepeatRouter can not handle action info ", wsd0Var.getClass().getCanonicalName()), new IllegalStateException());
                    return zy11Var;
                }
                zzs zzsVar = qo0Var != null ? qo0Var.e.j : null;
                if (zzsVar == null || !qo0Var.b.equals("addressCorrection")) {
                    zzsVar = wsd0Var.getPosition();
                }
                if (z) {
                    routePointType = ((qo0) wsd0Var).d;
                } else {
                    if (!(wsd0Var instanceof po0)) {
                        w511.t("Action ", wsd0Var, " is not supported as final suggest repeat action");
                        return null;
                    }
                    routePointType = ((po0) wsd0Var).d;
                }
                tpr p = ((i) this.a).p(zzsVar, routePointType, "addressCorrection");
                finalSuggestRepeatRouter$launch$1.L$0 = null;
                finalSuggestRepeatRouter$launch$1.L$1 = null;
                finalSuggestRepeatRouter$launch$1.L$2 = null;
                finalSuggestRepeatRouter$launch$1.L$3 = null;
                finalSuggestRepeatRouter$launch$1.label = 1;
                return e.y(p, finalSuggestRepeatRouter$launch$1) == coroutineSingletons ? coroutineSingletons : zy11Var;
            }
        }
        finalSuggestRepeatRouter$launch$1 = new FinalSuggestRepeatRouter$launch$1(this, (ContinuationImpl) continuation);
        Object obj2 = finalSuggestRepeatRouter$launch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = finalSuggestRepeatRouter$launch$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i == 0) {
        }
    }
}
