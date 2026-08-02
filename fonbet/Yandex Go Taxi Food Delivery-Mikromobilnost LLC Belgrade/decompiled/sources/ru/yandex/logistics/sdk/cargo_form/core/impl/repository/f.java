package ru.yandex.logistics.sdk.cargo_form.core.impl.repository;

import defpackage.j5s;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.logistics.sdk.ui.theme.theme_provider.ThemeStyle;

/* loaded from: classes5.dex */
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
        FormStyleRepositoryImpl$special$$inlined$map$1$2$1 formStyleRepositoryImpl$special$$inlined$map$1$2$1;
        int i;
        ThemeStyle themeStyle;
        if (continuation instanceof FormStyleRepositoryImpl$special$$inlined$map$1$2$1) {
            formStyleRepositoryImpl$special$$inlined$map$1$2$1 = (FormStyleRepositoryImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = formStyleRepositoryImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                formStyleRepositoryImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = formStyleRepositoryImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = formStyleRepositoryImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    j5s j5sVar = (j5s) obj;
                    if (j5sVar == null || (themeStyle = j5sVar.g) == null) {
                        themeStyle = ThemeStyle.DEFAULT;
                    }
                    formStyleRepositoryImpl$special$$inlined$map$1$2$1.L$0 = null;
                    formStyleRepositoryImpl$special$$inlined$map$1$2$1.L$1 = null;
                    formStyleRepositoryImpl$special$$inlined$map$1$2$1.L$2 = null;
                    formStyleRepositoryImpl$special$$inlined$map$1$2$1.L$3 = null;
                    formStyleRepositoryImpl$special$$inlined$map$1$2$1.I$0 = 0;
                    formStyleRepositoryImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(themeStyle, formStyleRepositoryImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        formStyleRepositoryImpl$special$$inlined$map$1$2$1 = new FormStyleRepositoryImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = formStyleRepositoryImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = formStyleRepositoryImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
