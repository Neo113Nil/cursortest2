package ru.yandex.taxi.cashback.sdk;

import com.yandex.plus.ui.core.theme.PlusTheme;
import defpackage.ikd0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.theme.ThemeType;

/* loaded from: classes9.dex */
public final class r implements vpr {
    public final /* synthetic */ vpr a;

    public r(vpr vprVar, t tVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PlusSdkDataRepository$special$$inlined$map$1$2$1 plusSdkDataRepository$special$$inlined$map$1$2$1;
        int i;
        PlusTheme plusTheme;
        if (continuation instanceof PlusSdkDataRepository$special$$inlined$map$1$2$1) {
            plusSdkDataRepository$special$$inlined$map$1$2$1 = (PlusSdkDataRepository$special$$inlined$map$1$2$1) continuation;
            int i2 = plusSdkDataRepository$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusSdkDataRepository$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = plusSdkDataRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusSdkDataRepository$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i3 = ikd0.a[((ThemeType) obj).ordinal()];
                    if (i3 == 1) {
                        plusTheme = PlusTheme.LIGHT;
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        plusTheme = PlusTheme.DARK;
                    }
                    plusSdkDataRepository$special$$inlined$map$1$2$1.L$0 = null;
                    plusSdkDataRepository$special$$inlined$map$1$2$1.L$1 = null;
                    plusSdkDataRepository$special$$inlined$map$1$2$1.L$2 = null;
                    plusSdkDataRepository$special$$inlined$map$1$2$1.L$3 = null;
                    plusSdkDataRepository$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(plusTheme, plusSdkDataRepository$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        plusSdkDataRepository$special$$inlined$map$1$2$1 = new PlusSdkDataRepository$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = plusSdkDataRepository$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusSdkDataRepository$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
