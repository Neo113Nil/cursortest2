package ru.yandex.logistics.care.web_view.impl;

import androidx.compose.ui.input.pointer.f;
import defpackage.mvg;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.care.web_view.impl.CareWebViewLauncherImpl$BoxTouchBlocker$1$1$1", f = "CareWebViewLauncherImpl.kt", l = {MSException.ERROR_BUSY}, m = "invokeSuspend", v = 2)
/* loaded from: classes4.dex */
final class CareWebViewLauncherImpl$BoxTouchBlocker$1$1$1 extends RestrictedSuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CareWebViewLauncherImpl$BoxTouchBlocker$1$1$1 careWebViewLauncherImpl$BoxTouchBlocker$1$1$1 = new CareWebViewLauncherImpl$BoxTouchBlocker$1$1$1(2, continuation);
        careWebViewLauncherImpl$BoxTouchBlocker$1$1$1.L$0 = obj;
        return careWebViewLauncherImpl$BoxTouchBlocker$1$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CareWebViewLauncherImpl$BoxTouchBlocker$1$1$1) create((f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0038 A[LOOP:0: B:6:0x0032->B:8:0x0038, LOOP_END] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0025 -> B:5:0x0028). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.L$0
            androidx.compose.ui.input.pointer.f r0 = (androidx.compose.ui.input.pointer.f) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r4.label
            r3 = 1
            if (r2 == 0) goto L18
            if (r2 != r3) goto L11
            kotlin.b.b(r5)
            goto L28
        L11:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ny61.r(r4)
            r4 = 0
            return r4
        L18:
            kotlin.b.b(r5)
        L1b:
            androidx.compose.ui.input.pointer.PointerEventPass r5 = androidx.compose.ui.input.pointer.PointerEventPass.Main
            r4.L$0 = r0
            r4.label = r3
            java.lang.Object r5 = r0.a(r5, r4)
            if (r5 != r1) goto L28
            return r1
        L28:
            tvd0 r5 = (defpackage.tvd0) r5
            java.util.List r5 = r5.a
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.Iterator r5 = r5.iterator()
        L32:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L1b
            java.lang.Object r2 = r5.next()
            zvd0 r2 = (defpackage.zvd0) r2
            r2.a()
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.yandex.logistics.care.web_view.impl.CareWebViewLauncherImpl$BoxTouchBlocker$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
