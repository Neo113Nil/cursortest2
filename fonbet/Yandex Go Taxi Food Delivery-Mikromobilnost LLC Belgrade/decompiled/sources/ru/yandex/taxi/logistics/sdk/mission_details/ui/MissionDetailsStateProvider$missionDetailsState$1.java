package ru.yandex.taxi.logistics.sdk.mission_details.ui;

import defpackage.ak20;
import defpackage.b37;
import defpackage.ck20;
import defpackage.dk20;
import defpackage.e100;
import defpackage.ej20;
import defpackage.fj20;
import defpackage.gj20;
import defpackage.hj20;
import defpackage.kvi0;
import defpackage.l17;
import defpackage.lj20;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oh4;
import defpackage.ra90;
import defpackage.tcc;
import defpackage.tzg0;
import defpackage.w4v;
import defpackage.wzg0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llj20;", "missionDetails", "", "isDarkTheme", "Lak20;", "<anonymous>", "(Llj20;Z)Lak20;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.mission_details.ui.MissionDetailsStateProvider$missionDetailsState$1", f = "MissionDetailsStateProvider.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MissionDetailsStateProvider$missionDetailsState$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissionDetailsStateProvider$missionDetailsState$1(b bVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        MissionDetailsStateProvider$missionDetailsState$1 missionDetailsStateProvider$missionDetailsState$1 = new MissionDetailsStateProvider$missionDetailsState$1(this.this$0, (Continuation) obj3);
        missionDetailsStateProvider$missionDetailsState$1.L$0 = (lj20) obj;
        missionDetailsStateProvider$missionDetailsState$1.Z$0 = booleanValue;
        return missionDetailsStateProvider$missionDetailsState$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        gj20 gj20Var;
        Iterator it;
        String str;
        ra90 ra90Var;
        lj20 lj20Var = (lj20) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e100 e100Var = this.this$0.a;
        ck20 ck20Var = lj20Var.a;
        dk20 dk20Var = new dk20(((oh4) e100Var.w).a(ck20Var.a, z), e100Var.d(ck20Var.b, z), ck20Var.c, ck20Var.d);
        ej20 ej20Var = lj20Var.b;
        String str2 = ej20Var.a;
        String str3 = ej20Var.b;
        ArrayList arrayList = ej20Var.c;
        ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            gj20 gj20Var2 = (gj20) it2.next();
            String str4 = gj20Var2.a;
            w4v w4vVar = gj20Var2.b;
            if (w4vVar != null) {
                gj20Var = gj20Var2;
                it = it2;
                str = str4;
                ra90Var = oh4.b((oh4) e100Var.b, w4vVar, null, new kvi0(wzg0.ic_info_delivery), z, 2);
            } else {
                gj20Var = gj20Var2;
                it = it2;
                str = str4;
                ra90Var = null;
            }
            arrayList2.add(new hj20(str, ra90Var, gj20Var.c));
            it2 = it;
        }
        w4v w4vVar2 = ej20Var.d;
        fj20 fj20Var = new fj20(str2, str3, arrayList2, w4vVar2 != null ? oh4.b((oh4) e100Var.b, w4vVar2, null, new kvi0(tzg0.ic_discount), z, 2) : null);
        l17 l17Var = lj20Var.c;
        return new ak20(dk20Var, fj20Var, new b37(l17Var.a, l17Var.b));
    }
}
