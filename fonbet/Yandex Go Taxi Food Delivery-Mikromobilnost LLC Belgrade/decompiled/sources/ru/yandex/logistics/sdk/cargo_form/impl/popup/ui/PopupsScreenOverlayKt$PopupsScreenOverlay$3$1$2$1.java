package ru.yandex.logistics.sdk.cargo_form.impl.popup.ui;

import defpackage.l3t0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r8e0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.popup.ui.PopupsScreenOverlayKt$PopupsScreenOverlay$3$1$2$1", f = "PopupsScreenOverlay.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class PopupsScreenOverlayKt$PopupsScreenOverlay$3$1$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ l3t0 $entries;
    final /* synthetic */ r8e0 $entry;
    final /* synthetic */ String $id;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PopupsScreenOverlayKt$PopupsScreenOverlay$3$1$2$1(r8e0 r8e0Var, l3t0 l3t0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.$entry = r8e0Var;
        this.$entries = l3t0Var;
        this.$id = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PopupsScreenOverlayKt$PopupsScreenOverlay$3$1$2$1(this.$entry, this.$entries, this.$id, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PopupsScreenOverlayKt$PopupsScreenOverlay$3$1$2$1 popupsScreenOverlayKt$PopupsScreenOverlay$3$1$2$1 = (PopupsScreenOverlayKt$PopupsScreenOverlay$3$1$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        popupsScreenOverlayKt$PopupsScreenOverlay$3$1$2$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (this.$entry.b.a() && !((Boolean) this.$entry.b.b.getValue()).booleanValue()) {
            this.$entries.remove(this.$id);
        }
        return zy11.a;
    }
}
