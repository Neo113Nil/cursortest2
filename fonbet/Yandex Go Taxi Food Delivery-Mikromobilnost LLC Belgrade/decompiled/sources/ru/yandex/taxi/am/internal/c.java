package ru.yandex.taxi.am.internal;

import defpackage.bd90;
import defpackage.fgb0;
import defpackage.im51;
import defpackage.jc4;
import defpackage.no90;
import defpackage.ny61;
import defpackage.rx3;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.am.k;

/* loaded from: classes9.dex */
public final class c {
    public final k a;
    public final no90 b;
    public final fgb0 c;
    public final jc4 d;

    public c(k kVar, no90 no90Var, fgb0 fgb0Var, jc4 jc4Var, im51 im51Var) {
        this.a = kVar;
        this.b = no90Var;
        this.c = fgb0Var;
        this.d = jc4Var;
        im51Var.getClass();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(boolean z, ContinuationImpl continuationImpl) {
        LoginIntentFactory$createLoginIntent$1 loginIntentFactory$createLoginIntent$1;
        int i;
        boolean booleanValue;
        if (continuationImpl instanceof LoginIntentFactory$createLoginIntent$1) {
            loginIntentFactory$createLoginIntent$1 = (LoginIntentFactory$createLoginIntent$1) continuationImpl;
            int i2 = loginIntentFactory$createLoginIntent$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loginIntentFactory$createLoginIntent$1.label = i2 - Integer.MIN_VALUE;
                Object obj = loginIntentFactory$createLoginIntent$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loginIntentFactory$createLoginIntent$1.label;
                String str = null;
                if (i != 0) {
                    kotlin.b.b(obj);
                    loginIntentFactory$createLoginIntent$1.L$0 = null;
                    loginIntentFactory$createLoginIntent$1.Z$0 = z;
                    loginIntentFactory$createLoginIntent$1.label = 1;
                    this.c.getClass();
                    obj = Boolean.TRUE;
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = loginIntentFactory$createLoginIntent$1.Z$0;
                    str = (String) loginIntentFactory$createLoginIntent$1.L$0;
                    kotlin.b.b(obj);
                }
                boolean z2 = z;
                String str2 = str;
                booleanValue = ((Boolean) obj).booleanValue();
                jc4 jc4Var = this.d;
                if (!booleanValue) {
                    jc4Var.getClass();
                    jc4Var.a.a("LOGIN: create login intent for lite account", new HashMap(), 1, new HashMap());
                    return this.b.a(0L, false, z2, str2);
                }
                if (!this.a.Mg()) {
                    jc4Var.getClass();
                    jc4Var.a.a("LOGIN: create login intent", new HashMap(), 1, new HashMap());
                    return this.b.a(0L, true, z2, str2);
                }
                jc4Var.getClass();
                jc4Var.a.a("LOGIN: create login intent for phonish account", new HashMap(), 1, new HashMap());
                no90 no90Var = this.b;
                com.yandex.passport.internal.autologin.ui.h b = no90Var.f.b();
                return b.b.i(no90Var.a, no90Var.c.b(no90Var.e.a(new bd90(8)), new rx3(no90Var, str2, z2, 9)));
            }
        }
        loginIntentFactory$createLoginIntent$1 = new LoginIntentFactory$createLoginIntent$1(this, continuationImpl);
        Object obj3 = loginIntentFactory$createLoginIntent$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loginIntentFactory$createLoginIntent$1.label;
        String str3 = null;
        if (i != 0) {
        }
        boolean z22 = z;
        String str22 = str3;
        booleanValue = ((Boolean) obj3).booleanValue();
        jc4 jc4Var2 = this.d;
        if (!booleanValue) {
        }
    }
}
