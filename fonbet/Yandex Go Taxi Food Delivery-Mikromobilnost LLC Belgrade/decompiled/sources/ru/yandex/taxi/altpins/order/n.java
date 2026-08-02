package ru.yandex.taxi.altpins.order;

import android.graphics.drawable.Drawable;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.vpr;
import defpackage.z641;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes5.dex */
public final class n implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ ThemeType c;

    public n(vpr vprVar, Ref$ObjectRef ref$ObjectRef, ThemeType themeType) {
        this.a = vprVar;
        this.b = ref$ObjectRef;
        this.c = themeType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WalkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$2$1 walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof WalkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$2$1) {
            walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$2$1 = (WalkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$2$1) continuation;
            int i2 = walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    OrderStatusInfo.AlternativeDestination.InfoBlock infoBlock = (OrderStatusInfo.AlternativeDestination.InfoBlock) obj;
                    Drawable drawable = (Drawable) this.b.element;
                    z641 z641Var = new z641(infoBlock, drawable != null ? pkf.g(drawable, "shadow", this.c) : null);
                    walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$2$1.L$0 = null;
                    walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$2$1.L$1 = null;
                    walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$2$1.L$2 = null;
                    walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$2$1.L$3 = null;
                    walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(z641Var, walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$2$1 = new WalkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$2$1(this, continuation);
        Object obj22 = walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkingInfoBlockInteractorImpl$stateFlow$lambda$0$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
