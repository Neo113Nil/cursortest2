package ru.yandex.taxi.logistics.sdk.ui.component.icon;

import android.graphics.Bitmap;
import defpackage.a16;
import defpackage.dci;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pa90;
import defpackage.ra3;
import defpackage.sa3;
import defpackage.tse;
import defpackage.u92;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.ui.component.icon.AsyncPainter$loadImage$1", f = "AsyncPainter.kt", l = {101}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class AsyncPainter$loadImage$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $url;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AsyncPainter$loadImage$1(b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AsyncPainter$loadImage$1(this.this$0, this.$url, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AsyncPainter$loadImage$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        b bVar;
        Throwable th;
        Object failure;
        Throwable a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar2 = this.this$0;
            dci dciVar = (dci) bVar2.H.getValue();
            String str = this.$url;
            try {
                this.L$0 = null;
                this.L$1 = bVar2;
                this.I$0 = 0;
                this.label = 1;
                Object b = dciVar.b(str, this);
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
                bVar = bVar2;
                obj = b;
            } catch (Throwable th2) {
                bVar = bVar2;
                th = th2;
                failure = new Result.Failure(th);
                b bVar3 = this.this$0;
                a = Result.a(failure);
                Object obj2 = ra3.a;
                if (a == null) {
                }
                bVar.E.setValue(obj2);
                return zy11.a;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bVar = (b) this.L$1;
            try {
                kotlin.b.b(obj);
            } catch (Throwable th3) {
                th = th3;
                failure = new Result.Failure(th);
                b bVar32 = this.this$0;
                a = Result.a(failure);
                Object obj22 = ra3.a;
                if (a == null) {
                }
                bVar.E.setValue(obj22);
                return zy11.a;
            }
        }
        failure = (Bitmap) obj;
        b bVar322 = this.this$0;
        a = Result.a(failure);
        Object obj222 = ra3.a;
        if (a == null) {
            Bitmap bitmap = (Bitmap) failure;
            if (bitmap == null) {
                pa90 pa90Var = (pa90) bVar322.I.getValue();
                if (pa90Var != null) {
                    obj222 = new sa3(pa90Var);
                }
            } else {
                obj222 = new sa3(new a16(new u92(bitmap)));
            }
        } else {
            bVar322.z.invoke();
            pa90 pa90Var2 = (pa90) bVar322.I.getValue();
            if (pa90Var2 != null) {
                obj222 = new sa3(pa90Var2);
            }
        }
        bVar.E.setValue(obj222);
        return zy11.a;
    }
}
