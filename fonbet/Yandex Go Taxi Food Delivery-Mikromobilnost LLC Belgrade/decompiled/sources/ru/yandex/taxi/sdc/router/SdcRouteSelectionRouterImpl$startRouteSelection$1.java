package ru.yandex.taxi.sdc.router;

import defpackage.g8e;
import defpackage.jst;
import defpackage.lmp0;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.ynv0;
import defpackage.zy11;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.sdc.router.SdcRouteSelectionRouterImpl$startRouteSelection$1", f = "SdcRouteSelectionRouterImpl.kt", l = {106, BuildConfig.API_LEVEL}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class SdcRouteSelectionRouterImpl$startRouteSelection$1 extends SuspendLambda implements wls {
    final /* synthetic */ lmp0 $destinationScreen;
    final /* synthetic */ ynv0 $origin;
    final /* synthetic */ lmp0 $sourceScreen;
    final /* synthetic */ String $tariffClass;
    final /* synthetic */ String $zoneMode;
    Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SdcRouteSelectionRouterImpl$startRouteSelection$1(e eVar, String str, String str2, lmp0 lmp0Var, lmp0 lmp0Var2, ynv0 ynv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$zoneMode = str;
        this.$tariffClass = str2;
        this.$sourceScreen = lmp0Var;
        this.$destinationScreen = lmp0Var2;
        this.$origin = ynv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SdcRouteSelectionRouterImpl$startRouteSelection$1(this.this$0, this.$zoneMode, this.$tariffClass, this.$sourceScreen, this.$destinationScreen, this.$origin, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SdcRouteSelectionRouterImpl$startRouteSelection$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        if (r13 == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0088, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r13 == r1) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zy11 zy11Var = zy11.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e eVar = this.this$0;
            eVar.b.d = false;
            eVar.g.a(this.$zoneMode);
            e eVar2 = this.this$0;
            String str = this.$zoneMode;
            String str2 = this.$tariffClass;
            eVar2.h.b = str;
            eVar2.h.a = str2;
            e eVar3 = this.this$0;
            String str3 = this.$tariffClass;
            this.label = 1;
            eVar3.getClass();
            obj = kotlinx.coroutines.a.w(5000L, new SdcRouteSelectionRouterImpl$waitSelfDrivingTariff$2(eVar3, str3, null), this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                this.this$0.l.g(zy11Var);
                this.this$0.b(this.$sourceScreen, this.$destinationScreen, false, this.$origin, this.$zoneMode);
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        if (((mi31) obj) == null) {
            xby.l(jst.e, "SDC:NO_TARIFF", null, null, g8e.o("Didn't find selfdriving tariff: ", this.$tariffClass), 6);
            return zy11Var;
        }
        pzt0 b = this.this$0.c.b(SelectionOrigin.SHORTCUT, this.$tariffClass, "", false);
        if (b != null) {
            this.L$0 = null;
            this.label = 2;
            obj = b.u0(this);
        }
        this.this$0.l.g(zy11Var);
        this.this$0.b(this.$sourceScreen, this.$destinationScreen, false, this.$origin, this.$zoneMode);
        return zy11Var;
    }
}
