package ru.yandex.taxi.requirements.glued.ui.image;

import defpackage.ejj0;
import defpackage.jmw0;
import defpackage.l58;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a$\u0012\u0004\u0012\u00020\u0005\u0012\u001a\u0012\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00070\u00060\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Ll58;", Constants.KEY_DATA, "Lzy11;", "<unused var>", "Lkotlin/Pair;", "", "", "Lru/yandex/taxi/requirements/glued/ui/image/OptionInfo;", "<anonymous>", "(Lru/yandex/taxi/requirements/glued/ui/image/CarInfo;V)Lkotlin/Pair;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.requirements.glued.ui.image.DefaultCarImageBinder$attach$optionImagesFlow$1", f = "DefaultCarImageBinder.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class DefaultCarImageBinder$attach$optionImagesFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultCarImageBinder$attach$optionImagesFlow$1(i iVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = iVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DefaultCarImageBinder$attach$optionImagesFlow$1 defaultCarImageBinder$attach$optionImagesFlow$1 = new DefaultCarImageBinder$attach$optionImagesFlow$1(this.this$0, (Continuation) obj3);
        defaultCarImageBinder$attach$optionImagesFlow$1.L$0 = (l58) obj;
        return defaultCarImageBinder$attach$optionImagesFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        l58 l58Var = (l58) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        String str = l58Var.a;
        i iVar = this.this$0;
        List list = l58Var.b;
        iVar.getClass();
        if (list.isEmpty()) {
            obj3 = EmptyList.a;
        } else {
            iVar.e.getClass();
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                ejj0 ejj0Var = (ejj0) kotlin.collections.a.R(((jmw0) obj2).s().c);
                if ((ejj0Var != null ? ejj0Var.i : null) != null) {
                    break;
                }
            }
            jmw0 jmw0Var = (jmw0) obj2;
            if (jmw0Var == null) {
                jmw0Var = (jmw0) list.get(0);
            }
            List<ejj0> c = iVar.d.c(jmw0Var);
            ArrayList arrayList = new ArrayList();
            for (ejj0 ejj0Var2 : c) {
                String a = iVar.c.a(ejj0Var2.i);
                Pair pair = (a == null || a.length() == 0) ? null : new Pair(ejj0Var2.a, a);
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            obj3 = arrayList;
        }
        return new Pair(str, obj3);
    }
}
