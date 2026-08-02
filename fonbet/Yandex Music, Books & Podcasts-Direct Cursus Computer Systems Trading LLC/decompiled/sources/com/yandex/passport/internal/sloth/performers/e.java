package com.yandex.passport.internal.sloth.performers;

import android.content.Context;
import com.yandex.passport.sloth.command.t;
import com.yandex.passport.sloth.command.u;
import defpackage.l2b;
import defpackage.uah;
import kotlin.Pair;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class e implements t {
    public final Context a;

    public e(Context context) {
        context.getClass();
        this.a = context;
    }

    @Override // com.yandex.passport.sloth.command.t
    public final Object q(com.yandex.passport.sloth.data.m mVar, Object obj, com.yandex.passport.sloth.command.f fVar) {
        Context context = this.a;
        String a = com.yandex.passport.internal.util.n.a(context);
        if (a == null) {
            a = "";
        }
        return new l2b(new u(uah.p(new Pair[]{new Pair("phoneRegionCode", a), new Pair("mcc", JSONObject.numberToString(new Integer(context.getResources().getConfiguration().mcc)))})));
    }
}
