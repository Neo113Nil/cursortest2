package ru.yandex.logistics.sdk.cargo_form.impl.ui;

import defpackage.mvg;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/f;", "Lzy11;", "<anonymous>", "(Landroidx/compose/ui/input/pointer/f;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.CargoFormScreen$CargoFormRoot$2$1$1", f = "CargoFormScreen.kt", l = {220}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class CargoFormScreen$CargoFormRoot$2$1$1 extends RestrictedSuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CargoFormScreen$CargoFormRoot$2$1$1(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CargoFormScreen$CargoFormRoot$2$1$1 cargoFormScreen$CargoFormRoot$2$1$1 = new CargoFormScreen$CargoFormRoot$2$1$1(this.this$0, continuation);
        cargoFormScreen$CargoFormRoot$2$1$1.L$0 = obj;
        return cargoFormScreen$CargoFormRoot$2$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CargoFormScreen$CargoFormRoot$2$1$1) create((androidx.compose.ui.input.pointer.f) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0027 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0025 -> B:5:0x0028). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.L$0
            androidx.compose.ui.input.pointer.f r0 = (androidx.compose.ui.input.pointer.f) r0
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r8.label
            r3 = 1
            if (r2 == 0) goto L18
            if (r2 != r3) goto L11
            kotlin.b.b(r9)
            goto L28
        L11:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ny61.r(r8)
            r8 = 0
            return r8
        L18:
            kotlin.b.b(r9)
        L1b:
            androidx.compose.ui.input.pointer.PointerEventPass r9 = androidx.compose.ui.input.pointer.PointerEventPass.Final
            r8.L$0 = r0
            r8.label = r3
            java.lang.Object r9 = r0.a(r9, r8)
            if (r9 != r1) goto L28
            return r1
        L28:
            tvd0 r9 = (defpackage.tvd0) r9
            java.util.List r9 = r9.a
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r2 = r9 instanceof java.util.Collection
            if (r2 == 0) goto L3c
            r2 = r9
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L3c
            goto L55
        L3c:
            java.util.Iterator r9 = r9.iterator()
        L40:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L55
            java.lang.Object r2 = r9.next()
            zvd0 r2 = (defpackage.zvd0) r2
            boolean r4 = r2.d
            if (r4 == 0) goto L1b
            boolean r2 = r2.h
            if (r2 != 0) goto L1b
            goto L40
        L55:
            ru.yandex.logistics.sdk.cargo_form.impl.ui.c r9 = r8.this$0
            ru.yandex.logistics.sdk.cargo_form.impl.popup.b r9 = r9.F
            gci0 r2 = r9.g
            n4u0 r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r2 = r2.iterator()
        L69:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L1b
            java.lang.Object r4 = r2.next()
            kae0 r4 = (defpackage.kae0) r4
            boolean r5 = r4.e
            if (r5 == 0) goto L69
            aas0 r5 = r9.b
            java.lang.String r4 = r4.a
            kotlinx.coroutines.flow.r0 r5 = r5.a
        L7f:
            java.lang.Object r6 = r5.getValue()
            r7 = r6
            java.util.Set r7 = (java.util.Set) r7
            java.util.LinkedHashSet r7 = defpackage.v4r0.i(r7, r4)
            boolean r6 = r5.k(r6, r7)
            if (r6 == 0) goto L7f
            goto L69
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.yandex.logistics.sdk.cargo_form.impl.ui.CargoFormScreen$CargoFormRoot$2$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
