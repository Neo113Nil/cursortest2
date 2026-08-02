package ru.yandex.taxi.map_common.map;

import com.yandex.mapkit.navigation.automotive.NavigationSerialization;
import defpackage.el00;
import defpackage.j24;
import defpackage.ny61;
import defpackage.t35;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes6.dex */
public final class a extends t35 {
    public final el00 d;

    public a(el00 el00Var) {
        this.d = el00Var;
    }

    @Override // defpackage.t35
    public final void c(j24 j24Var) {
        this.d.f(true, new AutomotiveNavigationHolder$requestCreation$1(j24Var, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(byte[] bArr, ContinuationImpl continuationImpl) {
        AutomotiveNavigationHolder$deserializeAutomotiveNavigation$1 automotiveNavigationHolder$deserializeAutomotiveNavigation$1;
        int i;
        if (continuationImpl instanceof AutomotiveNavigationHolder$deserializeAutomotiveNavigation$1) {
            automotiveNavigationHolder$deserializeAutomotiveNavigation$1 = (AutomotiveNavigationHolder$deserializeAutomotiveNavigation$1) continuationImpl;
            int i2 = automotiveNavigationHolder$deserializeAutomotiveNavigation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                automotiveNavigationHolder$deserializeAutomotiveNavigation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = automotiveNavigationHolder$deserializeAutomotiveNavigation$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = automotiveNavigationHolder$deserializeAutomotiveNavigation$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    automotiveNavigationHolder$deserializeAutomotiveNavigation$1.L$0 = bArr;
                    automotiveNavigationHolder$deserializeAutomotiveNavigation$1.label = 1;
                    if (a(automotiveNavigationHolder$deserializeAutomotiveNavigation$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bArr = (byte[]) automotiveNavigationHolder$deserializeAutomotiveNavigation$1.L$0;
                    kotlin.b.b(obj);
                }
                return NavigationSerialization.deserialize(bArr);
            }
        }
        automotiveNavigationHolder$deserializeAutomotiveNavigation$1 = new AutomotiveNavigationHolder$deserializeAutomotiveNavigation$1(this, continuationImpl);
        Object obj3 = automotiveNavigationHolder$deserializeAutomotiveNavigation$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = automotiveNavigationHolder$deserializeAutomotiveNavigation$1.label;
        if (i != 0) {
        }
        return NavigationSerialization.deserialize(bArr);
    }
}
