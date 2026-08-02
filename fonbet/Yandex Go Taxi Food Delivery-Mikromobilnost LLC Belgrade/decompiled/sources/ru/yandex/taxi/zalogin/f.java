package ru.yandex.taxi.zalogin;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes10.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;

    public f(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LinkAccountInteractor$subscribe$$inlined$filter$1$2$1 linkAccountInteractor$subscribe$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof LinkAccountInteractor$subscribe$$inlined$filter$1$2$1) {
            linkAccountInteractor$subscribe$$inlined$filter$1$2$1 = (LinkAccountInteractor$subscribe$$inlined$filter$1$2$1) continuation;
            int i2 = linkAccountInteractor$subscribe$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                linkAccountInteractor$subscribe$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = linkAccountInteractor$subscribe$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = linkAccountInteractor$subscribe$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((Boolean) obj).booleanValue()) {
                        linkAccountInteractor$subscribe$$inlined$filter$1$2$1.L$0 = null;
                        linkAccountInteractor$subscribe$$inlined$filter$1$2$1.L$1 = null;
                        linkAccountInteractor$subscribe$$inlined$filter$1$2$1.L$2 = null;
                        linkAccountInteractor$subscribe$$inlined$filter$1$2$1.L$3 = null;
                        linkAccountInteractor$subscribe$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, linkAccountInteractor$subscribe$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        linkAccountInteractor$subscribe$$inlined$filter$1$2$1 = new LinkAccountInteractor$subscribe$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = linkAccountInteractor$subscribe$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = linkAccountInteractor$subscribe$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
