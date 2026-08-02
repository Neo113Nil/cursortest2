package ru.yandex.video.m3.ui.debug.compose;

import defpackage.iy40;
import defpackage.mvg;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "ru.yandex.video.m3.ui.debug.compose.LineGraphKt$LineGraphPreview$1$1", f = "LineGraph.kt", l = {341}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class LineGraphKt$LineGraphPreview$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ iy40 $ts$delegate;
    final /* synthetic */ long $tsUpdateDelayMs;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LineGraphKt$LineGraphPreview$1$1(long j, iy40 iy40Var, Continuation<? super LineGraphKt$LineGraphPreview$1$1> continuation) {
        super(2, continuation);
        this.$tsUpdateDelayMs = j;
        this.$ts$delegate = iy40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        return new LineGraphKt$LineGraphPreview$1$1(this.$tsUpdateDelayMs, this.$ts$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(tse tseVar, Continuation<? super zy11> continuation) {
        return ((LineGraphKt$LineGraphPreview$1$1) create(tseVar, continuation)).invokeSuspend(zy11.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x001f -> B:5:0x0022). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            kotlin.b.b(r6)
            goto L22
        Ld:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ny61.r(r5)
            r5 = 0
            return r5
        L14:
            kotlin.b.b(r6)
        L17:
            long r3 = r5.$tsUpdateDelayMs
            r5.label = r2
            java.lang.Object r6 = kotlinx.coroutines.a.i(r3, r5)
            if (r6 != r0) goto L22
            return r0
        L22:
            iy40 r6 = r5.$ts$delegate
            long r3 = java.lang.System.currentTimeMillis()
            ru.yandex.video.m3.ui.debug.compose.LineGraphKt.access$LineGraphPreview$lambda$23(r6, r3)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.yandex.video.m3.ui.debug.compose.LineGraphKt$LineGraphPreview$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
