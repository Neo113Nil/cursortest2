package ru.yandex.logistics.care.ui;

import defpackage.ny61;
import defpackage.rl41;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Result;
import kotlin.collections.builders.MapBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes4.dex */
public final class g implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ MapBuilder b;

    public g(vpr vprVar, MapBuilder mapBuilder) {
        this.a = vprVar;
        this.b = mapBuilder;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CareWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1 careWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1;
        int i;
        if (continuation instanceof CareWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1) {
            careWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1 = (CareWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = careWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                careWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = careWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = careWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Object value = ((Result) obj).getValue();
                    if (value instanceof Result.Failure) {
                        value = null;
                    }
                    String str = (String) value;
                    rl41 rl41Var = str != null ? new rl41(str, this.b) : null;
                    if (rl41Var != null) {
                        careWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1.L$0 = null;
                        careWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1.L$1 = null;
                        careWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1.L$2 = null;
                        careWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1.L$3 = null;
                        careWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1.L$4 = null;
                        careWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1.I$0 = 0;
                        careWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(rl41Var, careWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
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
        careWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1 = new CareWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj22 = careWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = careWebViewViewModelImpl$createConfig$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
