package com.yandex.passport.internal.sloth.performers;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.yandex.passport.internal.sloth.credentialmanager.SaveCredentialManagerActivity;
import com.yandex.passport.sloth.command.data.q0;
import com.yandex.passport.sloth.command.s;
import com.yandex.passport.sloth.command.t;
import com.yandex.passport.sloth.command.v;
import com.yandex.passport.sloth.data.b0;
import com.yandex.passport.sloth.data.o0;
import defpackage.cg6;
import defpackage.l2b;
import defpackage.m2b;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.vq2;
import defpackage.xq0;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class n implements t {
    public final com.yandex.passport.internal.sloth.credentialmanager.d a;
    public final Context b;

    public n(com.yandex.passport.internal.sloth.credentialmanager.d dVar, Context context) {
        dVar.getClass();
        context.getClass();
        this.a = dVar;
        this.b = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // com.yandex.passport.sloth.command.t
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(com.yandex.passport.sloth.data.m mVar, q0 q0Var, cg6 cg6Var) {
        m mVar2;
        int i;
        v vVar = v.c;
        if (cg6Var instanceof m) {
            mVar2 = (m) cg6Var;
            int i2 = mVar2.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mVar2.l = i2 - Integer.MIN_VALUE;
                Object obj = mVar2.j;
                nm6 nm6Var = nm6.a;
                i = mVar2.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Context context = this.b;
                    if (!com.yandex.passport.common.util.a.b(context)) {
                        return new l2b(vVar);
                    }
                    String str = q0Var.a;
                    String str2 = q0Var.b;
                    if (StringsKt.U(str) || StringsKt.U(str2)) {
                        com.yandex.passport.sloth.command.d dVar = com.yandex.passport.sloth.command.d.b;
                        return dVar instanceof s ? new l2b(dVar) : new m2b(dVar);
                    }
                    com.yandex.passport.internal.sloth.credentialmanager.a aVar = new com.yandex.passport.internal.sloth.credentialmanager.a(str, str2, false);
                    if (Build.VERSION.SDK_INT >= 34) {
                        o0 o0Var = mVar.a;
                        if ((o0Var instanceof b0) && ((b0) o0Var).c.h) {
                            int i3 = SaveCredentialManagerActivity.a;
                            Bundle bundle = new Bundle();
                            bundle.putString("username_key", str);
                            bundle.putString("password_key", str2);
                            bundle.putBoolean("is_from_dialog_key", false);
                            Bundle bundle2 = new Bundle();
                            bundle2.putAll(new Bundle[]{bundle}[0]);
                            Intent A = vq2.A(context, SaveCredentialManagerActivity.class, bundle2);
                            A.addFlags(268435456);
                            context.startActivity(A);
                        }
                    } else {
                        com.yandex.passport.internal.sloth.credentialmanager.e eVar = com.yandex.passport.internal.sloth.credentialmanager.e.Login;
                        mVar2.l = 1;
                        if (this.a.c(aVar, eVar, mVar2) == nm6Var) {
                            return nm6Var;
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return new l2b(vVar);
            }
        }
        mVar2 = new m(this, cg6Var);
        Object obj2 = mVar2.j;
        nm6 nm6Var2 = nm6.a;
        i = mVar2.l;
        if (i != 0) {
        }
        return new l2b(vVar);
    }
}
