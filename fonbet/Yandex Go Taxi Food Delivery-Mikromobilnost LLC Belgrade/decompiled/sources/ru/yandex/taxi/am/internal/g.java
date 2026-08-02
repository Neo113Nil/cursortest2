package ru.yandex.taxi.am.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import com.yandex.passport.api.r;
import com.yandex.passport.internal.properties.PassportLogoutPropertiesImpl;
import defpackage.a60;
import defpackage.ep90;
import defpackage.ny61;
import defpackage.r40;
import defpackage.y50;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class g {
    public final Context a;
    public final y50 b;
    public final ru.yandex.taxi.activity.g c;
    public final com.yandex.passport.internal.autologin.ui.h d;

    public g(Context context, y50 y50Var, ru.yandex.taxi.activity.g gVar, ep90 ep90Var) {
        this.a = context;
        this.b = y50Var;
        this.c = gVar;
        this.d = new com.yandex.passport.internal.autologin.ui.h(ep90Var.a().t().a, 11);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(PassportLogoutPropertiesImpl passportLogoutPropertiesImpl, ContinuationImpl continuationImpl) {
        PassportLogoutRouter$launch$1 passportLogoutRouter$launch$1;
        int i;
        if (continuationImpl instanceof PassportLogoutRouter$launch$1) {
            passportLogoutRouter$launch$1 = (PassportLogoutRouter$launch$1) continuationImpl;
            int i2 = passportLogoutRouter$launch$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                passportLogoutRouter$launch$1.label = i2 - Integer.MIN_VALUE;
                Object obj = passportLogoutRouter$launch$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = passportLogoutRouter$launch$1.label;
                com.yandex.passport.internal.autologin.ui.h hVar = this.d;
                if (i != 0) {
                    kotlin.b.b(obj);
                    hVar.getClass();
                    Intent a = hVar.b.a(this.a, passportLogoutPropertiesImpl);
                    a60 a60Var = (a60) this.b;
                    a60Var.getClass();
                    try {
                        a60Var.e(130, a);
                    } catch (ActivityNotFoundException unused) {
                    }
                    passportLogoutRouter$launch$1.L$0 = null;
                    passportLogoutRouter$launch$1.label = 1;
                    obj = this.c.d(130, passportLogoutRouter$launch$1);
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
                r40 r40Var = (r40) obj;
                int i3 = r40Var.a;
                Intent intent = r40Var.c;
                hVar.getClass();
                return r.h(i3, intent);
            }
        }
        passportLogoutRouter$launch$1 = new PassportLogoutRouter$launch$1(this, continuationImpl);
        Object obj2 = passportLogoutRouter$launch$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = passportLogoutRouter$launch$1.label;
        com.yandex.passport.internal.autologin.ui.h hVar2 = this.d;
        if (i != 0) {
        }
        r40 r40Var2 = (r40) obj2;
        int i32 = r40Var2.a;
        Intent intent2 = r40Var2.c;
        hVar2.getClass();
        return r.h(i32, intent2);
    }
}
