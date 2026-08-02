package ru.yandex.logistics.sdk.cargo_form.impl.photocomments;

import defpackage.e0l0;
import defpackage.jl40;
import defpackage.joa1;
import defpackage.mvg;
import defpackage.n1f;
import defpackage.ny61;
import defpackage.qv0;
import defpackage.scc;
import defpackage.wls;
import defpackage.yzj0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le0l0;", "route", "Lzy11;", "<anonymous>", "(Le0l0;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.photocomments.FormPhotocommentsAddressListener$listenForAddressChanges$2", f = "FormPhotocommentsAddressListener.kt", l = {25}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FormPhotocommentsAddressListener$listenForAddressChanges$2 extends SuspendLambda implements wls {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FormPhotocommentsAddressListener$listenForAddressChanges$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FormPhotocommentsAddressListener$listenForAddressChanges$2 formPhotocommentsAddressListener$listenForAddressChanges$2 = new FormPhotocommentsAddressListener$listenForAddressChanges$2(this.this$0, continuation);
        formPhotocommentsAddressListener$listenForAddressChanges$2.L$0 = obj;
        return formPhotocommentsAddressListener$listenForAddressChanges$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FormPhotocommentsAddressListener$listenForAddressChanges$2) create((e0l0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x008e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0083 -> B:5:0x0086). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        a aVar;
        int i;
        int i2;
        e0l0 e0l0Var = (e0l0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            kotlin.b.b(obj);
            List list = e0l0Var.a;
            a aVar2 = this.this$0;
            it = list.iterator();
            aVar = aVar2;
            i = 0;
            i2 = 0;
            if (it.hasNext()) {
            }
        } else {
            if (i3 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$2;
            int i4 = this.I$1;
            i2 = this.I$0;
            List list2 = (List) this.L$7;
            qv0 qv0Var = (qv0) this.L$5;
            it = (Iterator) this.L$3;
            aVar = (a) this.L$2;
            kotlin.b.b(obj);
            if (!jl40.l(list2, (List) obj)) {
                aVar.b.i(joa1.d(i), qv0Var.h);
            }
            i = i4;
            if (it.hasNext()) {
                Object next = it.next();
                i4 = i + 1;
                if (i < 0) {
                    scc.m();
                    throw null;
                }
                qv0Var = (qv0) next;
                yzj0 d = joa1.d(i);
                list2 = qv0Var.h;
                n1f j = aVar.b.j(d);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = aVar;
                this.L$3 = it;
                this.L$4 = null;
                this.L$5 = qv0Var;
                this.L$6 = null;
                this.L$7 = list2;
                this.I$0 = i2;
                this.I$1 = i4;
                this.I$2 = i;
                this.I$3 = 0;
                this.label = 1;
                obj = e.A(j, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
                if (!jl40.l(list2, (List) obj)) {
                }
                i = i4;
                if (it.hasNext()) {
                    return zy11.a;
                }
            }
        }
    }
}
