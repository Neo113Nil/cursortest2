package ru.yandex.taxi.modal.popup.ui.model;

import defpackage.a8e0;
import defpackage.b8e0;
import defpackage.bvf0;
import defpackage.c8e0;
import defpackage.d8e0;
import defpackage.h8e0;
import defpackage.i8e0;
import defpackage.j8e0;
import defpackage.k8e0;
import defpackage.kbv;
import defpackage.l8e0;
import defpackage.m8e0;
import defpackage.mvg;
import defpackage.n8e0;
import defpackage.ny61;
import defpackage.o8e0;
import defpackage.obv;
import defpackage.qbv;
import defpackage.rcc;
import defpackage.scc;
import defpackage.tbv;
import defpackage.tcc;
import defpackage.tse;
import defpackage.u7e0;
import defpackage.v7e0;
import defpackage.w511;
import defpackage.w7e0;
import defpackage.wls;
import defpackage.x7e0;
import defpackage.y7e0;
import defpackage.z7e0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Ld8e0;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.modal.popup.ui.model.PopupDialogModalVOMapper$mapContentAdapterItems$2", f = "PopupDialogModalVOMapper.kt", l = {36}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class PopupDialogModalVOMapper$mapContentAdapterItems$2 extends SuspendLambda implements wls {
    final /* synthetic */ n8e0 $model;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupDialogModalVOMapper$mapContentAdapterItems$2(n8e0 n8e0Var, Continuation continuation, a aVar) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$model = n8e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PopupDialogModalVOMapper$mapContentAdapterItems$2(this.$model, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PopupDialogModalVOMapper$mapContentAdapterItems$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        z7e0 x7e0Var;
        d8e0 a8e0Var;
        Object n;
        d8e0 d8e0Var;
        Object v7e0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            n8e0 n8e0Var = this.$model;
            aVar.getClass();
            m8e0 m8e0Var = n8e0Var.e;
            String str = n8e0Var.b;
            String str2 = n8e0Var.d;
            j8e0 j8e0Var = n8e0Var.j;
            int length = m8e0Var.getUrl().length();
            kbv kbvVar = tbv.a;
            kbv qbvVar = length > 0 ? new qbv(m8e0Var.getUrl()) : m8e0Var.getTag().length() > 0 ? new obv(m8e0Var.getTag(), null, 2, 0) : kbvVar;
            if (qbvVar.equals(kbvVar)) {
                x7e0Var = y7e0.a;
            } else if (m8e0Var instanceof k8e0) {
                x7e0Var = new w7e0(qbvVar, ((k8e0) m8e0Var).c);
            } else {
                if (!(m8e0Var instanceof l8e0)) {
                    w511.b();
                    return null;
                }
                String str3 = ((l8e0) m8e0Var).c;
                if (str3.length() != 0) {
                    kbvVar = new obv(str3, null, 2, 0);
                }
                x7e0Var = new x7e0(qbvVar, kbvVar);
            }
            int i2 = o8e0.a[j8e0Var.a.ordinal()];
            if (i2 == 1) {
                a8e0Var = new a8e0(x7e0Var.a() + str + str2, x7e0Var, n8e0Var.b, n8e0Var.d, n8e0Var.c);
            } else {
                if (i2 != 2) {
                    w511.b();
                    return null;
                }
                a8e0Var = new b8e0(x7e0Var.a() + str + str2, x7e0Var.a(), str, str2);
            }
            a aVar2 = this.this$0;
            n8e0 n8e0Var2 = this.$model;
            this.L$0 = a8e0Var;
            this.label = 1;
            aVar2.getClass();
            n = bvf0.n(new PopupDialogModalVOMapper$mapBullets$2(n8e0Var2, null, aVar2), this);
            if (n == coroutineSingletons) {
                return coroutineSingletons;
            }
            d8e0Var = a8e0Var;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d8e0Var = (d8e0) this.L$0;
            b.b(obj);
            n = obj;
        }
        List list = (List) n;
        a aVar3 = this.this$0;
        n8e0 n8e0Var3 = this.$model;
        aVar3.getClass();
        i8e0 i8e0Var = (i8e0) kotlin.collections.a.R(n8e0Var3.i);
        List list2 = n8e0Var3.i;
        if (list2.size() == 1 && (i8e0Var instanceof h8e0)) {
            h8e0 h8e0Var = (h8e0) i8e0Var;
            String str4 = h8e0Var.a;
            v7e0Var = new c8e0(str4, n8e0Var3.a, str4, h8e0Var.b, h8e0Var.d, h8e0Var.e);
        } else {
            String title = ((i8e0) kotlin.collections.a.P(list2)).getTitle();
            List list3 = list2;
            ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
            int i3 = 0;
            for (Object obj2 : list3) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    scc.m();
                    throw null;
                }
                i8e0 i8e0Var2 = (i8e0) obj2;
                arrayList.add(new u7e0(i8e0Var2.getTitle(), n8e0Var3.a, i8e0Var2.getTitle(), i8e0Var2.getSubtitle(), i8e0Var2.a(), i3 == scc.f(list2), i8e0Var2.getAction()));
                i3 = i4;
            }
            v7e0Var = new v7e0(title, arrayList);
        }
        ListBuilder a = rcc.a();
        a.add(d8e0Var);
        a.addAll(list);
        a.add(v7e0Var);
        return a.j();
    }
}
