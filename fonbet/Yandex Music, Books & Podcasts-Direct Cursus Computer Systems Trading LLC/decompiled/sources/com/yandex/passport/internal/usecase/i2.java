package com.yandex.passport.internal.usecase;

import android.net.Uri;
import com.yandex.passport.data.network.db;
import com.yandex.passport.data.network.eb;
import com.yandex.passport.data.network.jb;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.u3;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class i2 extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.core.accounts.e b;
    public final jb c;
    public final com.yandex.passport.internal.network.mappers.b d;
    public final com.yandex.passport.internal.config.h e;
    public final com.yandex.passport.internal.report.reporters.v f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i2(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.core.accounts.e eVar, jb jbVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.internal.config.h hVar, com.yandex.passport.internal.report.reporters.v vVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        eVar.getClass();
        jbVar.getClass();
        bVar.getClass();
        hVar.getClass();
        vVar.getClass();
        this.b = eVar;
        this.c = jbVar;
        this.d = bVar;
        this.e = hVar;
        this.f = vVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(11:5|6|7|(1:(2:10|11)(2:30|31))(3:32|33|(2:35|(1:37))(2:38|39))|12|(6:14|15|(1:17)(1:22)|18|(1:20)|21)|23|24|(1:26)|27|28))|47|6|7|(0)(0)|12|(0)|23|24|(0)|27|28|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x003c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0154, code lost:
    
        r3 = defpackage.z7o.b;
        r3 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0151, code lost:
    
        r0 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0039, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0153, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0036, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x014a, code lost:
    
        r3 = defpackage.z7o.b;
        r3 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008a A[Catch: all -> 0x0036, CancellationException -> 0x0039, wis -> 0x003c, TRY_LEAVE, TryCatch #2 {wis -> 0x003c, CancellationException -> 0x0039, all -> 0x0036, blocks: (B:11:0x0032, B:12:0x0082, B:14:0x008a, B:17:0x00af, B:18:0x00ed, B:20:0x00f5, B:21:0x0110, B:22:0x00b8, B:23:0x013e, B:33:0x0048, B:35:0x0061, B:38:0x0144, B:39:0x0149), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(g2 g2Var, cg6 cg6Var) {
        h2 h2Var;
        int i;
        Throwable a;
        Object obj;
        Uri build;
        Uri uri;
        g2 g2Var2 = g2Var;
        if (cg6Var instanceof h2) {
            h2Var = (h2) cg6Var;
            int i2 = h2Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                h2Var.m = i2 - Integer.MIN_VALUE;
                Object obj2 = h2Var.k;
                nm6 nm6Var = nm6.a;
                i = h2Var.m;
                com.yandex.passport.internal.report.reporters.v vVar = this.f;
                if (i != 0) {
                    qgg.h0(obj2);
                    r7o r7oVar = z7o.b;
                    com.yandex.passport.common.core.f fVar = g2Var2.a;
                    String str = g2Var2.d;
                    String str2 = g2Var2.c;
                    vVar.B(fVar, g2Var2.b, str2, str);
                    com.yandex.passport.internal.l e = this.b.a().e(fVar);
                    if (e == null) {
                        throw new com.yandex.passport.api.exception.b(fVar);
                    }
                    jb jbVar = this.c;
                    com.yandex.passport.common.account.a aVar = e.d;
                    com.yandex.passport.internal.network.mappers.b bVar = this.d;
                    com.yandex.passport.common.core.b bVar2 = e.b.a;
                    bVar.getClass();
                    eb ebVar = new eb(aVar, com.yandex.passport.internal.network.mappers.b.a(bVar2), str2, str);
                    h2Var.j = g2Var2;
                    h2Var.m = 1;
                    obj2 = jbVar.g(ebVar, h2Var);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    g2Var2 = h2Var.j;
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    r7o r7oVar2 = z7o.b;
                    db dbVar = (db) obj;
                    com.yandex.passport.internal.report.reporters.v vVar2 = this.f;
                    com.yandex.passport.common.core.f fVar2 = g2Var2.a;
                    String str3 = g2Var2.c;
                    vVar2.C(fVar2, g2Var2.b, str3, dbVar.b, dbVar.c, dbVar.e);
                    com.yandex.passport.common.core.b bVar3 = g2Var2.a.a;
                    String str4 = dbVar.e;
                    com.yandex.passport.internal.config.h hVar = this.e;
                    if (str4 == null) {
                        uri = hVar.a(bVar3);
                        build = hVar.e(bVar3);
                    } else {
                        Uri build2 = new Uri.Builder().scheme("https").authority(str4).path("/1/bundle/biometrics/ebs").build();
                        build2.getClass();
                        build = new Uri.Builder().scheme("https").authority(str4).path("/servlets/api/v2").build();
                        build.getClass();
                        uri = build2;
                    }
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Build urls for EBS: consumerApiUri=" + uri + ", tibUri=" + build, 8);
                    }
                    String b = hVar.b(bVar3);
                    String uri2 = build.toString();
                    uri2.getClass();
                    String uri3 = uri.toString();
                    uri3.getClass();
                    obj = new com.yandex.passport.common.ebs.a(b, uri2, uri3, hVar.d(bVar3), dbVar.a, dbVar.b, dbVar.c, dbVar.d, str3);
                }
                qgg.h0(obj);
                Object obj3 = (com.yandex.passport.common.ebs.a) obj;
                a = z7o.a(obj3);
                if (a != null) {
                    com.yandex.passport.common.core.f fVar3 = g2Var2.a;
                    String str5 = g2Var2.b;
                    String str6 = g2Var2.c;
                    String message = a.getMessage();
                    vVar.getClass();
                    fVar3.getClass();
                    str5.getClass();
                    vVar.n(u3.d, new com.yandex.passport.internal.report.c(Long.valueOf(fVar3.b)), new com.yandex.passport.internal.report.a(str5, 8), new ff(str6, 13), new com.yandex.passport.internal.report.a(message, 27));
                }
                return new z7o(obj3);
            }
        }
        h2Var = new h2(this, cg6Var);
        Object obj22 = h2Var.k;
        nm6 nm6Var2 = nm6.a;
        i = h2Var.m;
        com.yandex.passport.internal.report.reporters.v vVar3 = this.f;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        qgg.h0(obj);
        Object obj32 = (com.yandex.passport.common.ebs.a) obj;
        a = z7o.a(obj32);
        if (a != null) {
        }
        return new z7o(obj32);
    }
}
