package com.yandex.passport.internal.rotation;

import android.content.Context;
import android.content.SharedPreferences;
import com.yandex.passport.internal.push.w0;
import com.yandex.passport.internal.report.a9;
import com.yandex.passport.internal.report.reporters.k0;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.z8;
import defpackage.btf;
import defpackage.c5b;
import defpackage.hav;
import defpackage.jyr;
import defpackage.qy0;
import defpackage.t9f;
import defpackage.w3f;
import defpackage.x3f;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes4.dex */
public final class h {
    public final k0 a;
    public final jyr b;
    public final jyr c;

    public h(Context context, k0 k0Var) {
        context.getClass();
        k0Var.getClass();
        this.a = k0Var;
        this.b = btf.b(new w0(2));
        this.c = btf.b(new hav(23, this, context));
    }

    public final List a() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.c.getValue();
        if (sharedPreferences == null) {
            k0 k0Var = this.a;
            k0Var.getClass();
            k0Var.p(a9.d);
            return c5b.a;
        }
        String string = sharedPreferences.getString("quarantine_master_token_list_key", null);
        if (string == null) {
            return c5b.a;
        }
        f fVar = g.Companion;
        fVar.getClass();
        w3f w3fVar = x3f.d;
        w3fVar.getClass();
        return (List) w3fVar.b(new qy0(fVar.serializer(), 0), string);
    }

    public final void b(g gVar) {
        gVar.getClass();
        ArrayList y0 = CollectionsKt.y0(a());
        y0.remove(gVar);
        c(y0);
        k0 k0Var = this.a;
        k0Var.getClass();
        k0Var.n(z8.d, new com.yandex.passport.internal.report.c(Long.valueOf(gVar.b.b)), new ve(gVar.a, 0));
    }

    public final void c(ArrayList arrayList) {
        SharedPreferences.Editor edit;
        SharedPreferences sharedPreferences = (SharedPreferences) this.c.getValue();
        if (sharedPreferences != null && (edit = sharedPreferences.edit()) != null) {
            f fVar = g.Companion;
            fVar.getClass();
            w3f w3fVar = x3f.d;
            t9f serializer = fVar.serializer();
            serializer.getClass();
            SharedPreferences.Editor putString = edit.putString("quarantine_master_token_list_key", w3fVar.c(new qy0(serializer, 0), arrayList));
            if (putString != null) {
                putString.apply();
                return;
            }
        }
        k0 k0Var = this.a;
        k0Var.getClass();
        k0Var.p(a9.d);
    }
}
