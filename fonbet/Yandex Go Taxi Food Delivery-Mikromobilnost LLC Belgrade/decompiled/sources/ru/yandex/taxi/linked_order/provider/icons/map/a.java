package ru.yandex.taxi.linked_order.provider.icons.map;

import com.yandex.go.pin.api.widget.b;
import defpackage.bl00;
import defpackage.ny61;
import defpackage.yq00;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class a implements yq00 {
    public final b a;
    public bl00 b;

    public a(b bVar) {
        this.a = bVar;
    }

    @Override // defpackage.yq00
    public final Object a(Continuation continuation) {
        bl00 bl00Var = this.b;
        return bl00Var == null ? c((ContinuationImpl) continuation) : bl00Var;
    }

    @Override // defpackage.yq00
    public final Object b(Continuation continuation) {
        return a(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        AmbulanceMapPointImageProvider$loadDestinationIcon$1 ambulanceMapPointImageProvider$loadDestinationIcon$1;
        int i;
        if (continuationImpl instanceof AmbulanceMapPointImageProvider$loadDestinationIcon$1) {
            ambulanceMapPointImageProvider$loadDestinationIcon$1 = (AmbulanceMapPointImageProvider$loadDestinationIcon$1) continuationImpl;
            int i2 = ambulanceMapPointImageProvider$loadDestinationIcon$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ambulanceMapPointImageProvider$loadDestinationIcon$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ambulanceMapPointImageProvider$loadDestinationIcon$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ambulanceMapPointImageProvider$loadDestinationIcon$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ambulanceMapPointImageProvider$loadDestinationIcon$1.label = 1;
                    obj = this.a.b(ambulanceMapPointImageProvider$loadDestinationIcon$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                this.b = (bl00) obj;
                return obj;
            }
        }
        ambulanceMapPointImageProvider$loadDestinationIcon$1 = new AmbulanceMapPointImageProvider$loadDestinationIcon$1(this, continuationImpl);
        Object obj2 = ambulanceMapPointImageProvider$loadDestinationIcon$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ambulanceMapPointImageProvider$loadDestinationIcon$1.label;
        if (i != 0) {
        }
        this.b = (bl00) obj2;
        return obj2;
    }
}
