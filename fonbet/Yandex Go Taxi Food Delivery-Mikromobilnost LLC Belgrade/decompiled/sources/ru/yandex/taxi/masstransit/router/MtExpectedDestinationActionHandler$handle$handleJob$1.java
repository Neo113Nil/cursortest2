package ru.yandex.taxi.masstransit.router;

import com.yandex.go.flex.common.api.actions.GeoPoint;
import defpackage.atd0;
import defpackage.i2s0;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pi30;
import defpackage.pv0;
import defpackage.sjh;
import defpackage.t210;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.w131;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.router.MtExpectedDestinationActionHandler$handle$handleJob$1", f = "MtExpectedDestinationActionHandler.kt", l = {53, 61}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class MtExpectedDestinationActionHandler$handle$handleJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ t210 $action;
    final /* synthetic */ String $shortcutId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtExpectedDestinationActionHandler$handle$handleJob$1(t210 t210Var, d dVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$action = t210Var;
        this.this$0 = dVar;
        this.$shortcutId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        MtExpectedDestinationActionHandler$handle$handleJob$1 mtExpectedDestinationActionHandler$handle$handleJob$1 = new MtExpectedDestinationActionHandler$handle$handleJob$1(this.$action, this.this$0, this.$shortcutId, continuation);
        mtExpectedDestinationActionHandler$handle$handleJob$1.L$0 = obj;
        return mtExpectedDestinationActionHandler$handle$handleJob$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MtExpectedDestinationActionHandler$handle$handleJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00b6, code lost:
    
        if (r1 != r2) goto L21;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        zzs zzsVar;
        zzs zzsVar2;
        Object k0;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            GeoPoint geoPoint = this.$action.a;
            zzs zzsVar3 = new zzs(geoPoint.a, geoPoint.b, geoPoint.c, null, null, 24);
            i2s0 i2s0Var = this.this$0.y;
            String str = this.$shortcutId;
            LinkedHashMap linkedHashMap = i2s0Var.b;
            linkedHashMap.put(str, Boolean.TRUE);
            i2s0Var.a.i(new w131("superapp.forced_shimmering_shortcuts", i2s0.b(linkedHashMap)));
            if (this.this$0.x.a().a == null) {
                ru.yandex.taxi.masstransit.address.interactor.i iVar = this.this$0.z;
                this.L$0 = tseVar;
                this.L$1 = zzsVar3;
                this.label = 1;
                if (iVar.f(this) != coroutineSingletons) {
                    zzsVar2 = zzsVar3;
                }
                return coroutineSingletons;
            }
            zzsVar = zzsVar3;
            tpr c = atd0.c(this.this$0.c, zzsVar, RoutePointType.TRANSPORT_B, PositionInitAction.SUGGEST, null, null, null, 56);
            this.this$0.b.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            MtExpectedDestinationActionHandler$handle$handleJob$1$addressInfo$1 mtExpectedDestinationActionHandler$handle$handleJob$1$addressInfo$1 = new MtExpectedDestinationActionHandler$handle$handleJob$1$addressInfo$1(c, null);
            this.L$0 = tseVar;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 2;
            k0 = tje.k0(mdhVar, mtExpectedDestinationActionHandler$handle$handleJob$1$addressInfo$1, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                k0 = obj;
                pv0 pv0Var = (pv0) k0;
                d dVar = this.this$0;
                zy11 zy11Var = zy11.a;
                if (pv0Var == null) {
                    dVar.y.a(this.$shortcutId);
                    return zy11Var;
                }
                dVar.x.b(Collections.singletonList(pv0Var.a));
                this.this$0.w.a.r(new pi30(8));
                this.this$0.y.a(this.$shortcutId);
                return zy11Var;
            }
            zzsVar2 = (zzs) this.L$1;
            kotlin.b.b(obj);
        }
        zzsVar = zzsVar2;
        tpr c2 = atd0.c(this.this$0.c, zzsVar, RoutePointType.TRANSPORT_B, PositionInitAction.SUGGEST, null, null, null, 56);
        this.this$0.b.getClass();
        sjh sjhVar2 = uyj.a;
        mdh mdhVar2 = mdh.b;
        MtExpectedDestinationActionHandler$handle$handleJob$1$addressInfo$1 mtExpectedDestinationActionHandler$handle$handleJob$1$addressInfo$12 = new MtExpectedDestinationActionHandler$handle$handleJob$1$addressInfo$1(c2, null);
        this.L$0 = tseVar;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        k0 = tje.k0(mdhVar2, mtExpectedDestinationActionHandler$handle$handleJob$1$addressInfo$12, this);
    }
}
