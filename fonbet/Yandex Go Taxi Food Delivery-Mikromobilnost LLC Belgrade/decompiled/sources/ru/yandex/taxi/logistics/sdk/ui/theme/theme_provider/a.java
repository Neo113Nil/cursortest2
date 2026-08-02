package ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider;

import defpackage.el51;
import defpackage.fl51;
import defpackage.hwy0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes5.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ fl51 b;
    public final /* synthetic */ hwy0 c;
    public final /* synthetic */ fl51 w;

    public a(vpr vprVar, fl51 fl51Var, hwy0 hwy0Var, fl51 fl51Var2) {
        this.a = vprVar;
        this.b = fl51Var;
        this.c = hwy0Var;
        this.w = fl51Var2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ThemeProvider$getColorsFlow$$inlined$map$1$2$1 themeProvider$getColorsFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ThemeProvider$getColorsFlow$$inlined$map$1$2$1) {
            themeProvider$getColorsFlow$$inlined$map$1$2$1 = (ThemeProvider$getColorsFlow$$inlined$map$1$2$1) continuation;
            int i2 = themeProvider$getColorsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                themeProvider$getColorsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = themeProvider$getColorsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = themeProvider$getColorsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    hwy0 hwy0Var = this.c;
                    el51 a = booleanValue ? hwy0.a(hwy0Var, this.b) : hwy0.a(hwy0Var, this.w);
                    themeProvider$getColorsFlow$$inlined$map$1$2$1.L$0 = null;
                    themeProvider$getColorsFlow$$inlined$map$1$2$1.L$1 = null;
                    themeProvider$getColorsFlow$$inlined$map$1$2$1.L$2 = null;
                    themeProvider$getColorsFlow$$inlined$map$1$2$1.L$3 = null;
                    themeProvider$getColorsFlow$$inlined$map$1$2$1.I$0 = 0;
                    themeProvider$getColorsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, themeProvider$getColorsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return zy11.a;
            }
        }
        themeProvider$getColorsFlow$$inlined$map$1$2$1 = new ThemeProvider$getColorsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = themeProvider$getColorsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = themeProvider$getColorsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
