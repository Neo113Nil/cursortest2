package ru.yandex.taxi.favorites.edit.presenter;

import defpackage.cgp;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oln;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.favorites.edit.presenter.EditExisting$removeAddress$1", f = "EditExisting.kt", l = {255}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class EditExisting$removeAddress$1 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ oln this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EditExisting$removeAddress$1(oln olnVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = olnVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EditExisting$removeAddress$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EditExisting$removeAddress$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        oln olnVar;
        oln olnVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                oln olnVar3 = this.this$0;
                try {
                    olnVar3.f.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    EditExisting$removeAddress$1$1$1 editExisting$removeAddress$1$1$1 = new EditExisting$removeAddress$1$1$1(olnVar3, null);
                    this.L$0 = olnVar3;
                    this.L$1 = olnVar3;
                    this.label = 1;
                    if (tje.k0(mdhVar, editExisting$removeAddress$1$1$1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    olnVar2 = olnVar3;
                    olnVar = olnVar2;
                } catch (Throwable th) {
                    th = th;
                    olnVar = olnVar3;
                    cgp cgpVar = (cgp) olnVar.a.Dg();
                    cgpVar.stopLoading();
                    cgpVar.stopDeleteLoading();
                    cgpVar.handleDeleteError(th);
                    return zy11.a;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                olnVar = (oln) this.L$1;
                olnVar2 = (oln) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th2) {
                    th = th2;
                    cgp cgpVar2 = (cgp) olnVar.a.Dg();
                    cgpVar2.stopLoading();
                    cgpVar2.stopDeleteLoading();
                    cgpVar2.handleDeleteError(th);
                    return zy11.a;
                }
            }
            cgp cgpVar3 = (cgp) olnVar2.a.Dg();
            cgpVar3.onAddressRemoved(olnVar2.b);
            cgpVar3.stopDeleteLoading();
            return zy11.a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
