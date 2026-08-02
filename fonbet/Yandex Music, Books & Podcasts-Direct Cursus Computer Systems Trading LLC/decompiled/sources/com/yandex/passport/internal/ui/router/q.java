package com.yandex.passport.internal.ui.router;

import android.content.Intent;
import android.os.Bundle;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import defpackage.bfu;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.x0q;
import defpackage.xq0;
import defpackage.y0q;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class q extends bfu {
    public final com.yandex.passport.internal.flags.i k;
    public final PassportProcessGlobalComponent l;
    public final x0q m;

    public q(com.yandex.passport.internal.flags.i iVar) {
        iVar.getClass();
        this.k = iVar;
        this.l = com.yandex.passport.internal.di.a.a();
        this.m = y0q.b(0, 0, null, 7);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0090, code lost:
    
        if (r3.emit(com.yandex.passport.internal.ui.router.l.a, r0) == r1) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0092, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007b, code lost:
    
        if (r3.emit(r6, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Intent intent, boolean z, cg6 cg6Var) {
        p pVar;
        int i;
        Unit unit;
        c0 c0Var;
        String string;
        if (cg6Var instanceof p) {
            pVar = (p) cg6Var;
            int i2 = pVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pVar.m = i2 - Integer.MIN_VALUE;
                Object obj = pVar.k;
                nm6 nm6Var = nm6.a;
                i = pVar.m;
                x0q x0qVar = this.m;
                if (i != 0) {
                    qgg.h0(obj);
                    if (intent != null) {
                        Bundle extras = intent.getExtras();
                        unit = null;
                        if (extras != null) {
                            try {
                                string = extras.getString("ROAD_SIGN_EXTRA", null);
                            } catch (IllegalArgumentException unused) {
                            }
                            if (string != null) {
                                c0Var = c0.valueOf(string);
                                if (c0Var != null) {
                                    if (!z || !((Boolean) this.k.b(com.yandex.passport.internal.flags.o.A0)).booleanValue()) {
                                        o oVar = new o(c0Var, extras, extras.getString("CORRECTION_EXTRA", null));
                                        pVar.j = z;
                                        pVar.m = 1;
                                    }
                                }
                            }
                            c0Var = null;
                            if (c0Var != null) {
                            }
                        }
                        if (unit != null) {
                            return Unit.a;
                        }
                    }
                    pVar.j = z;
                    pVar.m = 2;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z = pVar.j;
                    qgg.h0(obj);
                }
                unit = Unit.a;
                if (unit != null) {
                }
                pVar.j = z;
                pVar.m = 2;
            }
        }
        pVar = new p(this, cg6Var);
        Object obj2 = pVar.k;
        nm6 nm6Var2 = nm6.a;
        i = pVar.m;
        x0q x0qVar2 = this.m;
        if (i != 0) {
        }
        unit = Unit.a;
        if (unit != null) {
        }
        pVar.j = z;
        pVar.m = 2;
    }
}
