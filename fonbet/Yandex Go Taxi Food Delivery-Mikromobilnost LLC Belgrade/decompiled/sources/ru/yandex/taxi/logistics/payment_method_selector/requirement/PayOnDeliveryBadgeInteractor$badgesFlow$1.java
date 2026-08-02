package ru.yandex.taxi.logistics.payment_method_selector.requirement;

import defpackage.bdc;
import defpackage.dms;
import defpackage.mbx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.u290;
import defpackage.uti;
import defpackage.vt90;
import defpackage.wl4;
import defpackage.xng0;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.logistics.payment_method_selector.requirement.state.ToggleSource;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "isPayOnDeliveryChosen", "hasMultipoints", "isEnabled", "Lvt90;", "prohibitedData", "", "Lwl4;", "<anonymous>", "(ZZZLvt90;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.logistics.payment_method_selector.requirement.PayOnDeliveryBadgeInteractor$badgesFlow$1", f = "PayOnDeliveryBadgeInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PayOnDeliveryBadgeInteractor$badgesFlow$1 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    /* synthetic */ boolean Z$1;
    /* synthetic */ boolean Z$2;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PayOnDeliveryBadgeInteractor$badgesFlow$1(a aVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = aVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        boolean booleanValue3 = ((Boolean) obj3).booleanValue();
        PayOnDeliveryBadgeInteractor$badgesFlow$1 payOnDeliveryBadgeInteractor$badgesFlow$1 = new PayOnDeliveryBadgeInteractor$badgesFlow$1(this.this$0, (Continuation) obj5);
        payOnDeliveryBadgeInteractor$badgesFlow$1.Z$0 = booleanValue;
        payOnDeliveryBadgeInteractor$badgesFlow$1.Z$1 = booleanValue2;
        payOnDeliveryBadgeInteractor$badgesFlow$1.Z$2 = booleanValue3;
        payOnDeliveryBadgeInteractor$badgesFlow$1.L$0 = (vt90) obj4;
        return payOnDeliveryBadgeInteractor$badgesFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        boolean z2 = this.Z$1;
        boolean z3 = this.Z$2;
        vt90 vt90Var = (vt90) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        a aVar = this.this$0;
        boolean z4 = vt90Var.a;
        String str = vt90Var.b;
        EmptyList emptyList = EmptyList.a;
        if (!z3) {
            aVar.getClass();
            return emptyList;
        }
        uti a = aVar.a.a(z, ToggleSource.SUMMARY, z2, z4, str);
        if (a == null) {
            return emptyList;
        }
        ru.yandex.taxi.common_models.net.b bVar = FormattedText.Companion;
        FormattedText c = bVar.c(a.a);
        String str2 = a.b;
        FormattedText c2 = str2 != null ? bVar.c(str2) : FormattedText.c;
        String str3 = a.c;
        mbx0 mbx0Var = new mbx0(a.e, new u290(11, a), null, a.f, 4);
        String str4 = a.d;
        return Collections.singletonList(new wl4(null, c, c2, 0, str3, null, null, mbx0Var, str4 != null ? new FormattedText(Collections.singletonList(new FormattedText.e(str4, 14))) : FormattedText.c, null, new bdc(xng0.textMain), new bdc(xng0.textMinor), null, 81129));
    }
}
