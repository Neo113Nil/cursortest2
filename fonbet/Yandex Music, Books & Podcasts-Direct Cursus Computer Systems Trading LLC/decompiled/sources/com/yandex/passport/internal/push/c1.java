package com.yandex.passport.internal.push;

import android.content.Context;
import android.content.Intent;
import com.yandex.passport.api.v2;
import defpackage.cxb;
import defpackage.vq2;
import java.util.Arrays;
import kotlin.Pair;

/* loaded from: classes4.dex */
public final class c1 extends m0 {
    public final Context b;
    public final v2 c;
    public final String d;

    public c1(Context context, v2 v2Var, String str) {
        context.getClass();
        v2Var.getClass();
        this.b = context;
        this.c = v2Var;
        this.d = str;
    }

    @Override // com.yandex.passport.internal.push.m0
    public final Intent a() {
        int i = PassportPushRegistrationService.j;
        Context context = this.b;
        context.getClass();
        v2 v2Var = this.c;
        v2Var.getClass();
        return vq2.A(context, PassportPushRegistrationService.class, cxb.K((Pair[]) Arrays.copyOf(new Pair[]{new Pair("intent_type", "token_changed"), new Pair("platform", v2Var), new Pair("new_token", this.d)}, 3)));
    }

    @Override // com.yandex.passport.internal.push.m0
    public final x c() {
        return new w(this.c, this.d);
    }
}
