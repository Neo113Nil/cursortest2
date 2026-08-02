package ru.yandex.taxi.preorder.source.domain;

import com.yandex.go.zone.model.Zone;
import defpackage.evu0;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pfb;
import defpackage.qv10;
import defpackage.unr0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.domain.CheckForEmptyTariffsInteractor$validateTariffsFlow$2", f = "CheckForEmptyTariffsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class CheckForEmptyTariffsInteractor$validateTariffsFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ pfb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CheckForEmptyTariffsInteractor$validateTariffsFlow$2(pfb pfbVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = pfbVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CheckForEmptyTariffsInteractor$validateTariffsFlow$2 checkForEmptyTariffsInteractor$validateTariffsFlow$2 = new CheckForEmptyTariffsInteractor$validateTariffsFlow$2(this.this$0, continuation);
        checkForEmptyTariffsInteractor$validateTariffsFlow$2.Z$0 = ((Boolean) obj).booleanValue();
        return checkForEmptyTariffsInteractor$validateTariffsFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        CheckForEmptyTariffsInteractor$validateTariffsFlow$2 checkForEmptyTariffsInteractor$validateTariffsFlow$2 = (CheckForEmptyTariffsInteractor$validateTariffsFlow$2) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        checkForEmptyTariffsInteractor$validateTariffsFlow$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (z) {
            pfb pfbVar = this.this$0;
            if (pfbVar.c.g() == null) {
                jst.e.x(new IllegalStateException("Missing source address"), "Call onTariffsInfo without source address");
            } else {
                String str = pfbVar.b.a.Q;
                Zone c = pfbVar.b.c();
                String str2 = c != null ? c.a : null;
                if (str == null || evu0.J(str)) {
                    qv10.C(new Object[]{str2}, 1, "NoTariffsInTariffsInfo.%s", jst.e);
                } else {
                    unr0.D(new Object[]{str2}, 1, "NoTariffsInTariffsInfo.%s", jst.e, new IllegalStateException("No tariffs found for zone_mode:".concat(str)));
                }
            }
        }
        return zy11.a;
    }
}
