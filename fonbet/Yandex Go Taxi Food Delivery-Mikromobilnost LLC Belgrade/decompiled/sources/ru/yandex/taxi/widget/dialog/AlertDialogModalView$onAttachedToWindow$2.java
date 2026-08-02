package ru.yandex.taxi.widget.dialog;

import android.graphics.Bitmap;
import defpackage.c4v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pfv;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.utils.d;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.widget.dialog.AlertDialogModalView$onAttachedToWindow$2", f = "AlertDialogModalView.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
public final class AlertDialogModalView$onAttachedToWindow$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ AlertDialogModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogModalView$onAttachedToWindow$2(AlertDialogModalView alertDialogModalView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = alertDialogModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AlertDialogModalView$onAttachedToWindow$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AlertDialogModalView$onAttachedToWindow$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        d dVar;
        String str;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            dVar = this.this$0.iconLoader;
            str = this.this$0.iconTag;
            c4v c4vVar = new c4v(str, (String) null, 2);
            this.label = 1;
            a = dVar.a(c4vVar, pfv.a, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            a = ((Result) obj).getValue();
        }
        Bitmap bitmap = (Bitmap) (a instanceof Result.Failure ? null : a);
        if (bitmap != null) {
            this.this$0.setupIcon(bitmap);
        }
        return zy11.a;
    }
}
