package ru.yandex.taxi.requirements.glued.interactor;

import defpackage.ah70;
import defpackage.bh70;
import defpackage.ejj0;
import defpackage.f6v;
import defpackage.gmw0;
import defpackage.h6v;
import defpackage.hkt;
import defpackage.hmw0;
import defpackage.jmw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.okt;
import defpackage.tcc;
import defpackage.tf70;
import defpackage.w511;
import defpackage.zg70;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.requirements.ui.selector.usual.OptionViewType;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lf6v;", "Lufx0;", "", "Ljmw0;", "supportedRequirementsIdentifiable", "Lzy11;", "<unused var>", "Lhkt;", "<anonymous>", "(Lru/yandex/taxi/requirements/utils/Identifiable;V)Lru/yandex/taxi/requirements/utils/Identifiable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.requirements.glued.interactor.GluedRequirementsInteractor$gluedRequirementsFlow$1", f = "GluedRequirementsInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class GluedRequirementsInteractor$gluedRequirementsFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GluedRequirementsInteractor$gluedRequirementsFlow$1(c cVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = cVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GluedRequirementsInteractor$gluedRequirementsFlow$1 gluedRequirementsInteractor$gluedRequirementsFlow$1 = new GluedRequirementsInteractor$gluedRequirementsFlow$1(this.this$0, (Continuation) obj3);
        gluedRequirementsInteractor$gluedRequirementsFlow$1.L$0 = (f6v) obj;
        return gluedRequirementsInteractor$gluedRequirementsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        bh70 ah70Var;
        OptionViewType optionViewType;
        f6v f6vVar = (f6v) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        c cVar = this.this$0;
        h6v h6vVar = f6vVar.a;
        List<jmw0> list = (List) f6vVar.b;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        for (jmw0 jmw0Var : list) {
            String str = jmw0Var.s().a;
            if (jmw0Var instanceof gmw0) {
                ah70Var = new zg70(cVar.c.a((gmw0) jmw0Var, cVar.b.c(jmw0Var)));
            } else {
                if (!(jmw0Var instanceof hmw0)) {
                    w511.b();
                    return null;
                }
                hmw0 hmw0Var = (hmw0) jmw0Var;
                List c = cVar.b.c(jmw0Var);
                HashMap hashMap = new HashMap();
                Iterator it = c.iterator();
                while (true) {
                    i = 1;
                    int i3 = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    String str2 = ((ejj0) it.next()).a;
                    Integer num = (Integer) hashMap.get(str2);
                    if (num != null) {
                        i3 = num.intValue();
                    }
                    hashMap.put(str2, Integer.valueOf(i3 + 1));
                }
                ArrayList<ejj0> arrayList2 = hmw0Var.j.c;
                ArrayList arrayList3 = new ArrayList(tcc.n(arrayList2, i2));
                for (ejj0 ejj0Var : arrayList2) {
                    Integer num2 = (Integer) hashMap.get(ejj0Var.a);
                    int intValue = num2 != null ? num2.intValue() : 0;
                    String str3 = ejj0Var.a;
                    String str4 = (String) ejj0Var.o.get(Integer.valueOf(intValue));
                    if (str4 == null) {
                        str4 = ejj0Var.b;
                    }
                    String str5 = str4;
                    String str6 = ejj0Var.c;
                    int i4 = okt.a[ejj0Var.f.ordinal()];
                    if (i4 == i) {
                        optionViewType = OptionViewType.SPINNER;
                    } else if (i4 == 2) {
                        optionViewType = OptionViewType.CHECKBOX;
                    } else {
                        if (i4 != 3) {
                            w511.b();
                            return null;
                        }
                        optionViewType = OptionViewType.RADIO;
                    }
                    arrayList3.add(new tf70(str3, str5, str6, optionViewType, intValue, ejj0Var.e));
                    i = 1;
                }
                ah70Var = new ah70(arrayList3);
            }
            arrayList.add(new hkt(jmw0Var.getName(), str, ah70Var));
            i2 = 10;
        }
        return new f6v(h6vVar, arrayList);
    }
}
