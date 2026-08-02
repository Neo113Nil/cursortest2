package com.yandex.passport.internal.usecase;

import com.yandex.passport.data.network.kb;
import com.yandex.passport.data.network.ob;
import com.yandex.passport.data.network.pb;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.tc;
import com.yandex.passport.internal.report.uc;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;
import java.util.Locale;

/* loaded from: classes4.dex */
public final class l2 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.common.ui.lang.b b;
    public final pb c;
    public final com.yandex.passport.internal.report.reporters.e1 d;
    public final com.yandex.passport.internal.network.mappers.b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.common.ui.lang.b bVar, pb pbVar, com.yandex.passport.internal.report.reporters.e1 e1Var, com.yandex.passport.internal.network.mappers.b bVar2) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        bVar.getClass();
        pbVar.getClass();
        e1Var.getClass();
        bVar2.getClass();
        this.b = bVar;
        this.c = pbVar;
        this.d = e1Var;
        this.e = bVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable u(l2 l2Var, j2 j2Var, cg6 cg6Var) {
        k2 k2Var;
        int i;
        Object obj;
        Throwable a;
        if (cg6Var instanceof k2) {
            k2Var = (k2) cg6Var;
            int i2 = k2Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k2Var.n = i2 - Integer.MIN_VALUE;
                Object obj2 = k2Var.l;
                nm6 nm6Var = nm6.a;
                i = k2Var.n;
                boolean z = false;
                if (i != 0) {
                    qgg.h0(obj2);
                    com.yandex.passport.internal.report.reporters.e1 e1Var = l2Var.d;
                    String str = j2Var.b;
                    e1Var.getClass();
                    e1Var.n(tc.d, new ff(str, 14));
                    pb pbVar = l2Var.c;
                    com.yandex.passport.internal.network.mappers.b bVar = l2Var.e;
                    com.yandex.passport.common.core.b bVar2 = j2Var.a;
                    bVar.getClass();
                    com.yandex.passport.data.models.g a2 = com.yandex.passport.internal.network.mappers.b.a(bVar2);
                    String str2 = j2Var.b;
                    Locale b = ((com.yandex.passport.internal.ui.lang.a) l2Var.b).b();
                    int i3 = com.yandex.passport.common.ui.lang.a.a;
                    String language = b.getLanguage();
                    language.getClass();
                    kb kbVar = new kb(a2, str2, language);
                    k2Var.j = l2Var;
                    k2Var.k = j2Var;
                    k2Var.n = 1;
                    obj2 = pbVar.g(kbVar, k2Var);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j2Var = k2Var.k;
                    l2Var = k2Var.j;
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    try {
                        r7o r7oVar = z7o.b;
                        ob obVar = (ob) obj;
                        com.yandex.passport.internal.report.reporters.e1 e1Var2 = l2Var.d;
                        String str3 = obVar.b;
                        if (str3 == null) {
                            str3 = "not received";
                        }
                        String str4 = j2Var.b;
                        e1Var2.getClass();
                        e1Var2.n(uc.d, new ff(str4, 14), new com.yandex.passport.internal.report.f(str3, 26, z));
                        obj = obVar.b;
                        if (obj == null) {
                            Locale b2 = ((com.yandex.passport.internal.ui.lang.a) l2Var.b).b();
                            int i4 = com.yandex.passport.common.ui.lang.a.a;
                            obj = b2.getLanguage();
                            obj.getClass();
                        }
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        obj = new t7o(th);
                    }
                }
                a = z7o.a(obj);
                if (a != null) {
                    com.yandex.passport.internal.report.reporters.e1 e1Var3 = l2Var.d;
                    String str5 = j2Var.b;
                    String valueOf = String.valueOf(a.getMessage());
                    e1Var3.getClass();
                    e1Var3.n(uc.d, new ff(str5, 14), new com.yandex.passport.internal.report.a(valueOf, 28));
                }
                return new z7o(obj);
            }
        }
        k2Var = new k2(l2Var, cg6Var);
        Object obj22 = k2Var.l;
        nm6 nm6Var2 = nm6.a;
        i = k2Var.n;
        boolean z2 = false;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        a = z7o.a(obj);
        if (a != null) {
        }
        return new z7o(obj);
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final Object x(Object obj, rhw rhwVar) {
        return u(this, (j2) obj, rhwVar);
    }
}
