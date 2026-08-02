package ru.yandex.taxi.am.internal;

import com.yandex.passport.api.PassportAutoLoginMode;
import com.yandex.passport.internal.entities.Filter;
import com.yandex.passport.internal.impl.o;
import com.yandex.passport.internal.properties.AutoLoginProperties;
import defpackage.ny61;
import defpackage.qz10;
import defpackage.s8o;
import defpackage.vo90;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class f {
    public final vo90 a;

    public f(vo90 vo90Var) {
        this.a = vo90Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(com.yandex.passport.api.g gVar, ContinuationImpl continuationImpl) {
        PassportAutoLoginInteractor$tryAutologin$1 passportAutoLoginInteractor$tryAutologin$1;
        int i;
        if (continuationImpl instanceof PassportAutoLoginInteractor$tryAutologin$1) {
            passportAutoLoginInteractor$tryAutologin$1 = (PassportAutoLoginInteractor$tryAutologin$1) continuationImpl;
            int i2 = passportAutoLoginInteractor$tryAutologin$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportAutoLoginInteractor$tryAutologin$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportAutoLoginInteractor$tryAutologin$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportAutoLoginInteractor$tryAutologin$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    vo90 vo90Var = this.a;
                    Filter a = vo90Var.c.a(new qz10(16));
                    AutoLoginProperties.a aVar = new AutoLoginProperties.a();
                    aVar.c(a);
                    aVar.e(vo90Var.b.a());
                    aVar.d(PassportAutoLoginMode.EXACTLY_ONE_ACCOUNT);
                    aVar.b();
                    ((o) gVar).o.f(aVar.a());
                    n0 n0Var = ((o) gVar).c;
                    passportAutoLoginInteractor$tryAutologin$1.L$0 = null;
                    passportAutoLoginInteractor$tryAutologin$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(n0Var, passportAutoLoginInteractor$tryAutologin$1);
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
                Object value = ((Result) obj).getValue();
                return value instanceof Result.Failure ? s8o.c((com.yandex.passport.api.i) value) : value;
            }
        }
        passportAutoLoginInteractor$tryAutologin$1 = new PassportAutoLoginInteractor$tryAutologin$1(this, continuationImpl);
        Object obj2 = passportAutoLoginInteractor$tryAutologin$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportAutoLoginInteractor$tryAutologin$1.label;
        if (i != 0) {
        }
        Object value2 = ((Result) obj2).getValue();
        if (value2 instanceof Result.Failure) {
        }
    }
}
