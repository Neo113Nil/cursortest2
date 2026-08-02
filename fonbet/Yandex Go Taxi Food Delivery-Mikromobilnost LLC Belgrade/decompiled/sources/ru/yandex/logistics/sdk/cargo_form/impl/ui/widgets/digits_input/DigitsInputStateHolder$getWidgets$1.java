package ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.digits_input;

import defpackage.ekj;
import defpackage.fkj;
import defpackage.gkj;
import defpackage.hkj;
import defpackage.j6s;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tjj;
import defpackage.tky0;
import defpackage.w511;
import defpackage.xjj;
import defpackage.zls;
import defpackage.zy11;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.CurrencySymbolAnchor;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ltjj;", "coreWidget", "Lj6s;", ClidProvider.STATE, "", "Ln351;", "<anonymous>", "(Ltjj;Lj6s;)Ljava/util/List;"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.digits_input.DigitsInputStateHolder$getWidgets$1", f = "DigitsInputStateHolder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DigitsInputStateHolder$getWidgets$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DigitsInputStateHolder$getWidgets$1(b bVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DigitsInputStateHolder$getWidgets$1 digitsInputStateHolder$getWidgets$1 = new DigitsInputStateHolder$getWidgets$1(this.this$0, (Continuation) obj3);
        digitsInputStateHolder$getWidgets$1.L$0 = (tjj) obj;
        digitsInputStateHolder$getWidgets$1.L$1 = (j6s) obj2;
        return digitsInputStateHolder$getWidgets$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ekj ekjVar;
        tjj tjjVar = (tjj) this.L$0;
        j6s j6sVar = (j6s) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (tjjVar == null || this.this$0.d.C(tjjVar)) {
            return EmptyList.a;
        }
        this.this$0.c.getClass();
        Object obj2 = j6sVar.a.get(tjjVar.b);
        String str = obj2 instanceof String ? (String) obj2 : null;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        hkj hkjVar = tjjVar.c;
        if (hkjVar instanceof fkj) {
            fkj fkjVar = (fkj) hkjVar;
            ekjVar = new ekj(fkjVar.a, fkjVar.b);
        } else {
            if (!(hkjVar instanceof gkj)) {
                w511.b();
                return null;
            }
            ekjVar = new ekj(null, CurrencySymbolAnchor.TRAILING);
        }
        return Collections.singletonList(new xjj(str2, tjjVar.d, ekjVar, new tky0(tjjVar.b, true, null, tjjVar.a, null), tjjVar.e));
    }
}
