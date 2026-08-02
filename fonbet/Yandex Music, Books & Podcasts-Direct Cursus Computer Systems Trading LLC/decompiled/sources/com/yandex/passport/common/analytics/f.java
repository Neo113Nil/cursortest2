package com.yandex.passport.common.analytics;

import android.content.Context;
import android.provider.Settings;
import defpackage.cg6;
import defpackage.dv0;
import defpackage.gld;
import defpackage.gm5;
import defpackage.hld;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.tf6;
import defpackage.tyf;
import defpackage.wqr;
import defpackage.x97;
import defpackage.xq0;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class f {
    public final Context a;
    public final com.yandex.passport.common.coroutine.a b;
    public final gm5 c;

    public f(Context context, com.yandex.passport.common.coroutine.e eVar, com.yandex.passport.common.coroutine.a aVar) {
        this.a = context;
        this.b = aVar;
        kotlin.coroutines.g.a.getClass();
        tf6 e = gld.e(new wqr(null));
        this.c = hld.j();
        x97.y(e, null, null, new dv0(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, cg6 cg6Var) {
        d dVar;
        int i;
        if (cg6Var instanceof d) {
            dVar = (d) cg6Var;
            int i2 = dVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dVar.l = i2 - Integer.MIN_VALUE;
                Object obj = dVar.j;
                nm6 nm6Var = nm6.a;
                i = dVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    e eVar = new e(this, null, 0);
                    dVar.l = 1;
                    obj = tyf.L(j, eVar, dVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                b bVar = (b) obj;
                return bVar != null ? c() : bVar;
            }
        }
        dVar = new d(this, cg6Var);
        Object obj2 = dVar.j;
        nm6 nm6Var2 = nm6.a;
        i = dVar.l;
        if (i != 0) {
        }
        b bVar2 = (b) obj2;
        if (bVar2 != null) {
        }
    }

    public final b b() {
        gm5 gm5Var = this.c;
        gm5Var.getClass();
        Object obj = null;
        if (!gm5Var.b() && !gm5Var.isCancelled() && gm5Var.X()) {
            obj = gm5Var.C();
        }
        b bVar = (b) obj;
        return bVar == null ? c() : bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0017, code lost:
    
        if (r0 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final b c() {
        String string = Settings.Secure.getString(this.a.getContentResolver(), "android_id");
        if (string != null) {
            if (StringsKt.U(string)) {
                string = null;
            }
        }
        string = null;
        return new b(string, null);
    }
}
