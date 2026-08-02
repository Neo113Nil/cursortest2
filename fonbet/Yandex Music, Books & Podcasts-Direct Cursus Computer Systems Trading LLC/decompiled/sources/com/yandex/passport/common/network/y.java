package com.yandex.passport.common.network;

import defpackage.eg7;
import defpackage.ff7;
import defpackage.ild;
import defpackage.j5m;
import defpackage.l1j;
import defpackage.l6b;
import defpackage.mhp;
import defpackage.p3d;
import defpackage.q5f;
import defpackage.s5f;
import defpackage.t9f;
import defpackage.tkr;
import defpackage.tq5;
import defpackage.w4f;
import defpackage.wq5;
import defpackage.x4f;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes4.dex */
public final /* synthetic */ class y implements p3d {
    public static final y a;

    @NotNull
    private static final mhp descriptor;

    static {
        y yVar = new y();
        a = yVar;
        j5m j5mVar = new j5m("com.yandex.passport.common.network.ResponseError.PhraseTraceErrorResponse", yVar, 4);
        j5mVar.k("status", false);
        j5mVar.k("phrase", true);
        j5mVar.k("trace", true);
        j5mVar.k(CommonUrlParts.REQUEST_ID, true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        tkr tkrVar = tkr.a;
        return new t9f[]{s5f.a, tkrVar, tkrVar, ff7.C(tkrVar)};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        q5f q5fVar;
        String str;
        String str2;
        String str3;
        eg7Var.getClass();
        mhp mhpVar = descriptor;
        tq5 c = eg7Var.c(mhpVar);
        q5f q5fVar2 = null;
        if (c.m()) {
            q5f q5fVar3 = (q5f) c.z(mhpVar, 0, s5f.a, null);
            String g = c.g(mhpVar, 1);
            String g2 = c.g(mhpVar, 2);
            q5fVar = q5fVar3;
            str3 = (String) c.n(mhpVar, 3, tkr.a, null);
            str2 = g2;
            str = g;
            i = 15;
        } else {
            boolean z = true;
            int i2 = 0;
            String str4 = null;
            String str5 = null;
            String str6 = null;
            while (z) {
                int w = c.w(mhpVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    q5fVar2 = (q5f) c.z(mhpVar, 0, s5f.a, q5fVar2);
                    i2 |= 1;
                } else if (w == 1) {
                    str4 = c.g(mhpVar, 1);
                    i2 |= 2;
                } else if (w == 2) {
                    str5 = c.g(mhpVar, 2);
                    i2 |= 4;
                } else {
                    if (w != 3) {
                        l1j.g(w);
                        return null;
                    }
                    str6 = (String) c.n(mhpVar, 3, tkr.a, str6);
                    i2 |= 8;
                }
            }
            i = i2;
            q5fVar = q5fVar2;
            str = str4;
            str2 = str5;
            str3 = str6;
        }
        c.b(mhpVar);
        return new a0(i, q5fVar, str, str2, str3);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0067, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r4, java.lang.String.valueOf(r9 != null ? defpackage.x4f.g(r9) : null)) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0040, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.d(r9, java.lang.String.valueOf(r1 != null ? defpackage.x4f.g(r1) : null)) == false) goto L11;
     */
    @Override // defpackage.t9f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(l6b l6bVar, Object obj) {
        a0 a0Var = (a0) obj;
        l6bVar.getClass();
        a0Var.getClass();
        mhp mhpVar = descriptor;
        wq5 c = l6bVar.c(mhpVar);
        s5f s5fVar = s5f.a;
        q5f q5fVar = a0Var.a;
        String str = a0Var.d;
        String str2 = a0Var.c;
        String str3 = a0Var.b;
        c.k(mhpVar, 0, s5fVar, q5fVar);
        if (!c.e(mhpVar)) {
            w4f w4fVar = (w4f) x4f.f(q5fVar).get("phrase");
        }
        c.p(mhpVar, 1, str3);
        if (!c.e(mhpVar)) {
            w4f w4fVar2 = (w4f) x4f.f(q5fVar).get("trace");
        }
        c.p(mhpVar, 2, str2);
        if (c.e(mhpVar) || str != null) {
            c.q(mhpVar, 3, tkr.a, str);
        }
        c.b(mhpVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
