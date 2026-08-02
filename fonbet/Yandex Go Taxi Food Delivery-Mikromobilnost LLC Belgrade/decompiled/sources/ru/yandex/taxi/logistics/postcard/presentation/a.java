package ru.yandex.taxi.logistics.postcard.presentation;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes9.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;

    public a(vpr vprVar, c cVar) {
        this.a = vprVar;
        this.b = cVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        if (r7.emit(r9, r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PostcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1 postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1;
        Object obj2;
        int i;
        vpr vprVar;
        if (continuation instanceof PostcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1) {
            postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1 = (PostcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                obj2 = postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.L$0 = null;
                    postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.L$1 = null;
                    postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.L$2 = null;
                    vpr vprVar2 = this.a;
                    postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.L$3 = vprVar2;
                    postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.L$4 = null;
                    postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.L$5 = null;
                    postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.label = 1;
                    Object a = c.a(this.b, (List) obj, postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1);
                    if (a != coroutineSingletons) {
                        obj2 = a;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.L$3;
                kotlin.b.b(obj2);
                if (obj2 != null) {
                    postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.L$0 = null;
                    postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.L$1 = null;
                    postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.L$2 = null;
                    postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.L$3 = null;
                    postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.L$4 = null;
                    postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.L$5 = null;
                    postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.label = 2;
                }
                return zy11.a;
            }
        }
        postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1 = new PostcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1(this, continuation);
        obj2 = postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = postcardController$getNavCommandFlow$lambda$0$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        if (obj2 != null) {
        }
        return zy11.a;
    }
}
