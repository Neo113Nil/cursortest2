package com.yandex.passport.internal.di.module;

import com.yandex.passport.internal.ui.sloth.ebs.o1;
import defpackage.rzm;

/* loaded from: classes4.dex */
public final class c implements rzm {
    public final /* synthetic */ int a;
    public final a b;

    public /* synthetic */ c(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        int i = this.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.getClass();
                return "7.54.1";
            default:
                o1 o1Var = new o1();
                aVar.getClass();
                try {
                    Object invoke = Class.forName("com.yandex.passport.biometric.api.PassportBiometricFactory").getMethod("createPassportEbsApi", null).invoke(null, null);
                    invoke.getClass();
                    return (com.yandex.passport.common.ebs.k) invoke;
                } catch (Exception unused) {
                    return o1Var;
                }
        }
    }
}
