package com.yandex.passport.internal.smsretriever;

import android.content.Context;
import android.content.Intent;
import androidx.core.app.q;
import com.yandex.passport.internal.storage.m;
import defpackage.eo0;
import defpackage.h8s;
import defpackage.i5l;
import defpackage.i6c;
import defpackage.jp0;
import defpackage.nmd;
import defpackage.onx;
import defpackage.phg;
import defpackage.q5i;
import defpackage.s9f;
import defpackage.w8c;
import defpackage.x97;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
public final class b {
    public static final Pattern c = Pattern.compile("(\\d+)");
    public final Context a;
    public final m b;

    public b(Context context, m mVar) {
        this.a = context;
        this.b = mVar;
    }

    public final void a(String str, a aVar) {
        com.yandex.passport.legacy.a.e(3, "Sms code received: " + str, null);
        m mVar = this.b;
        jp0 jp0Var = mVar.f;
        s9f[] s9fVarArr = m.m;
        jp0Var.setValue(mVar, s9fVarArr[4], str);
        mVar.g.setValue(mVar, s9fVarArr[5], aVar.a);
        phg.a(this.a).c(new Intent("com.yandex.passport.internal.SMS_CODE_RECEIVED"));
    }

    public final void b() {
        w8c w8cVar = new w8c(this.a, null, w8c.m, eo0.M, nmd.c);
        q5i a = h8s.a();
        a.c = new i5l();
        a.d = new i6c[]{x97.l};
        a.b = 1567;
        onx c2 = w8cVar.c(1, a.c());
        c2.n(new q(10));
        c2.o(new q(11));
    }
}
