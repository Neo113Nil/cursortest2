package ru.yandex.taxi.summary.topnotification.plus;

import com.yandex.go.zone.dto.objects.ServiceLevel;
import defpackage.m7x0;
import defpackage.mi31;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.r6d0;
import defpackage.zls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmi31;", "selectedTariff", "", "isSdkAvailable", "Lr6d0;", "<anonymous>", "(Lmi31;Z)Lr6d0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.topnotification.plus.PlusNotificationInteractor$notificationModelFlow$1", f = "PlusNotificationInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PlusNotificationInteractor$notificationModelFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusNotificationInteractor$notificationModelFlow$1(d dVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = dVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        PlusNotificationInteractor$notificationModelFlow$1 plusNotificationInteractor$notificationModelFlow$1 = new PlusNotificationInteractor$notificationModelFlow$1(this.this$0, (Continuation) obj3);
        plusNotificationInteractor$notificationModelFlow$1.L$0 = (mi31) obj;
        plusNotificationInteractor$notificationModelFlow$1.Z$0 = booleanValue;
        return plusNotificationInteractor$notificationModelFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mi31 mi31Var = (mi31) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        d dVar = this.this$0;
        r6d0 r6d0Var = r6d0.e;
        if (!z) {
            dVar.getClass();
            return r6d0Var;
        }
        if (!dVar.a.a.b && mi31Var != null) {
            pex0 pex0Var = mi31Var.a;
            Iterator it = pex0Var.S.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((ServiceLevel.Branding) next).c == ServiceLevel.Branding.Type.PLUS_PROMOTION) {
                    obj2 = next;
                    break;
                }
            }
            ServiceLevel.Branding branding = (ServiceLevel.Branding) obj2;
            if (branding != null) {
                String a = dVar.b.a(pex0Var.c(), branding.e, false, false);
                String str = branding.f;
                if (a != null && a.length() != 0) {
                    String str2 = branding.k;
                    if (str2 != null && str2.length() != 0) {
                        str2 = ((m7x0) dVar.c).a(str2);
                    }
                    return new r6d0(a, str, str2, true);
                }
            }
        }
        return r6d0Var;
    }
}
