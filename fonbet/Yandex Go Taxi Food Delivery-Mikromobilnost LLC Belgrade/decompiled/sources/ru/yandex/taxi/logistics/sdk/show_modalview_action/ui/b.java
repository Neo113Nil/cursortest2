package ru.yandex.taxi.logistics.sdk.show_modalview_action.ui;

import defpackage.vpr;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class b implements vpr {
    public final /* synthetic */ c a;

    public b(c cVar) {
        this.a = cVar;
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0082 -> B:10:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object a(boolean r11, kotlin.coroutines.Continuation r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.ShowModalViewActionViewModel$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r12
            ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.ShowModalViewActionViewModel$1$1$emit$1 r0 = (ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.ShowModalViewActionViewModel$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.ShowModalViewActionViewModel$1$1$emit$1 r0 = new ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.ShowModalViewActionViewModel$1$1$emit$1
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r2 = r0.label
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L41
            if (r2 != r5) goto L3b
            int r10 = r0.I$0
            boolean r11 = r0.Z$0
            java.lang.Object r2 = r0.L$3
            i330 r2 = (defpackage.i330) r2
            java.lang.Object r2 = r0.L$2
            java.lang.Object r6 = r0.L$1
            ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.c r6 = (ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.c) r6
            java.lang.Object r7 = r0.L$0
            pz40 r7 = (defpackage.pz40) r7
            kotlin.b.b(r12)
            goto L85
        L3b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ny61.r(r10)
            return r3
        L41:
            kotlin.b.b(r12)
            ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.c r10 = r10.a
            kotlinx.coroutines.flow.r0 r12 = r10.z
            r6 = r10
            r7 = r12
            r10 = r4
        L4b:
            java.lang.Object r2 = r7.getValue()
            r12 = r2
            i330 r12 = (defpackage.i330) r12
            ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.state.a r12 = r6.w
            i030 r8 = r6.b
            lr20 r8 = r8.a
            r0.L$0 = r7
            r0.L$1 = r6
            r0.L$2 = r2
            r0.L$3 = r3
            r0.Z$0 = r11
            r0.I$0 = r10
            r0.I$1 = r4
            r0.label = r5
            boolean r9 = r8 instanceof defpackage.okg
            if (r9 == 0) goto L7a
            okg r8 = (defpackage.okg) r8
            java.lang.Object r12 = r12.b(r8, r11, r0)
            kotlin.coroutines.intrinsics.CoroutineSingletons r8 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            if (r12 != r8) goto L77
            goto L82
        L77:
            i330 r12 = (defpackage.i330) r12
            goto L82
        L7a:
            r12.getClass()
            boolean r12 = r8 instanceof defpackage.pkg
            if (r12 == 0) goto L92
            r12 = r3
        L82:
            if (r12 != r1) goto L85
            return r1
        L85:
            i330 r12 = (defpackage.i330) r12
            kotlinx.coroutines.flow.r0 r7 = (kotlinx.coroutines.flow.r0) r7
            boolean r12 = r7.k(r2, r12)
            if (r12 == 0) goto L4b
            zy11 r10 = defpackage.zy11.a
            return r10
        L92:
            defpackage.w511.b()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.yandex.taxi.logistics.sdk.show_modalview_action.ui.b.a(boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // defpackage.vpr
    public final /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
        return a(((Boolean) obj).booleanValue(), continuation);
    }
}
