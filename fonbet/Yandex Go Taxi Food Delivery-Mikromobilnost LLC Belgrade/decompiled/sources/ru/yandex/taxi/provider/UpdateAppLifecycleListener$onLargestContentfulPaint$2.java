package ru.yandex.taxi.provider;

import android.app.Activity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.bh11;
import defpackage.c921;
import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rfw0;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.y631;
import defpackage.z631;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.widget.dialog.AlertDialog;
import ru.yandex.taxi.widget.dialog.UpdateDialog;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.provider.UpdateAppLifecycleListener$onLargestContentfulPaint$2", f = "UpdateAppLifecycleListener.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class UpdateAppLifecycleListener$onLargestContentfulPaint$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.provider.UpdateAppLifecycleListener$onLargestContentfulPaint$2$1", f = "UpdateAppLifecycleListener.kt", l = {62}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.provider.UpdateAppLifecycleListener$onLargestContentfulPaint$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ b this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(b bVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            Object[] objArr = 0;
            zy11 zy11Var = zy11.a;
            if (i == 0) {
                kotlin.b.b(obj);
                b bVar = this.this$0;
                if (bVar.e == null) {
                    c921 c921Var = (c921) bVar.a.get();
                    d dVar = new d(((ru.yandex.taxi.launch.c) c921Var.b.get()).b(), c921Var);
                    UpdateAppLifecycleListener$onLargestContentfulPaint$2$1$shouldUpdateDialog$1 updateAppLifecycleListener$onLargestContentfulPaint$2$1$shouldUpdateDialog$1 = new UpdateAppLifecycleListener$onLargestContentfulPaint$2$1$shouldUpdateDialog$1(2, null);
                    this.label = 1;
                    obj = e.x(dVar, updateAppLifecycleListener$onLargestContentfulPaint$2$1$shouldUpdateDialog$1, this);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            if (((Boolean) obj).booleanValue()) {
                b bVar2 = this.this$0;
                AlertDialog alertDialog = bVar2.e;
                if (alertDialog != null) {
                    alertDialog.dismiss();
                }
                rfw0 rfw0Var = bVar2.b;
                z631 a = ((y631) rfw0Var.b).a();
                UpdateDialog updateDialog = a != null ? new UpdateDialog((Activity) rfw0Var.a, a, objArr == true ? 1 : 0) : null;
                if (updateDialog != null) {
                    bVar2.e = updateDialog.setDismissListener(new bh11(7, bVar2)).show();
                } else {
                    xby.l(jst.e, "APP_UPDATE_DIALOG_ERROR", null, null, "Can't show UpdateDialog - probably no stores found", 6);
                }
                c921 c921Var2 = (c921) bVar2.a.get();
                c921Var2.f.q(c921Var2.a.d(), "key_last_show_timestamp");
            }
            return zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateAppLifecycleListener$onLargestContentfulPaint$2(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new UpdateAppLifecycleListener$onLargestContentfulPaint$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UpdateAppLifecycleListener$onLargestContentfulPaint$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            Lifecycle lifecycle = bVar.d;
            Lifecycle.State state = Lifecycle.State.RESUMED;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(bVar, null);
            this.label = 1;
            if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
