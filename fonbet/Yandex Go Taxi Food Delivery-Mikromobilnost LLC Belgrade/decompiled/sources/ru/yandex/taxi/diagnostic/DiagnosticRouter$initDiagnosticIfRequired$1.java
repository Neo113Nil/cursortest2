package ru.yandex.taxi.diagnostic;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qcj;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.design.ButtonComponent;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.diagnostic.DiagnosticRouter$initDiagnosticIfRequired$1", f = "DiagnosticRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class DiagnosticRouter$initDiagnosticIfRequired$1 extends SuspendLambda implements wls {
    final /* synthetic */ ViewGroup $contentFrame;
    final /* synthetic */ String $userId;
    int label;
    final /* synthetic */ qcj this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticRouter$initDiagnosticIfRequired$1(qcj qcjVar, ViewGroup viewGroup, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = qcjVar;
        this.$contentFrame = viewGroup;
        this.$userId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DiagnosticRouter$initDiagnosticIfRequired$1(this.this$0, this.$contentFrame, this.$userId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DiagnosticRouter$initDiagnosticIfRequired$1 diagnosticRouter$initDiagnosticIfRequired$1 = (DiagnosticRouter$initDiagnosticIfRequired$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        diagnosticRouter$initDiagnosticIfRequired$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        qcj qcjVar = this.this$0;
        ViewGroup viewGroup = this.$contentFrame;
        qcjVar.getClass();
        final ButtonComponent buttonComponent = new ButtonComponent(viewGroup.getContext(), null, 0, 6, null);
        buttonComponent.setVisibility(0);
        buttonComponent.setText(buttonComponent.getContext().getString(kyh0.send_diagnostic_report));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        int u = tje.u(8, buttonComponent.getContext());
        layoutParams.setMargins(u, u, u, u);
        layoutParams.gravity = 17;
        viewGroup.addView(buttonComponent, layoutParams);
        final qcj qcjVar2 = this.this$0;
        final String str = this.$userId;
        buttonComponent.setDebounceClickListener(new Runnable() { // from class: ru.yandex.taxi.diagnostic.c
            @Override // java.lang.Runnable
            public final void run() {
                qcj qcjVar3 = qcj.this;
                tje.N(qcjVar3.a, null, null, new DiagnosticRouter$initDiagnosticIfRequired$1$1$1(qcjVar3, str, null), 3);
                buttonComponent.setVisibility(8);
            }
        });
        return zy11.a;
    }
}
