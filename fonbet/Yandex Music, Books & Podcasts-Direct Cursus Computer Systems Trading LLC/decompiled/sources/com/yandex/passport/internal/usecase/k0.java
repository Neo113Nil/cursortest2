package com.yandex.passport.internal.usecase;

import android.net.Uri;
import android.os.Build;
import com.yandex.passport.data.network.k3;
import com.yandex.passport.data.network.p3;
import com.yandex.passport.data.network.s3;
import com.yandex.passport.data.network.t3;
import defpackage.avf;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k0 extends com.yandex.passport.common.domain.a {
    public final t3 b;
    public final com.yandex.passport.internal.network.d c;
    public final v d;
    public final s0 e;
    public final com.yandex.passport.common.common.a f;
    public final com.yandex.passport.internal.network.mappers.b g;
    public final String h;
    public final String i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(com.yandex.passport.common.coroutine.a aVar, t3 t3Var, com.yandex.passport.internal.network.d dVar, v vVar, s0 s0Var, com.yandex.passport.common.common.a aVar2, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        t3Var.getClass();
        dVar.getClass();
        vVar.getClass();
        s0Var.getClass();
        aVar2.getClass();
        bVar.getClass();
        this.b = t3Var;
        this.c = dVar;
        this.d = vVar;
        this.e = s0Var;
        this.f = aVar2;
        this.g = bVar;
        this.h = String.valueOf(Build.VERSION.SDK_INT);
        this.i = "7.54.1";
    }

    public static i0 u(p3 p3Var) {
        String str = p3Var.a;
        List list = p3Var.b;
        if (Intrinsics.d(str, "ALLOW")) {
            return !list.isEmpty() ? new g0(((s3) CollectionsKt.Q(list)).a) : h0.a;
        }
        if (Intrinsics.d(str, "DENY")) {
            return new f0(false);
        }
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.e, null, "Unknown challenge.action = " + str, 8);
        }
        return new f0(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(1:(1:(9:12|13|14|15|(1:17)|18|19|20|21)(2:24|25))(6:26|27|28|(4:30|(1:32)|33|(2:37|38))|39|(1:41)(7:44|15|(0)|18|19|20|21)))(1:45))(1:59)|46|(2:48|(1:50))|51|(4:53|(2:55|(2:57|43)(5:58|28|(0)|39|(0)(0)))|18|19)|20|21))|65|6|7|(0)(0)|46|(0)|51|(0)|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0171, code lost:
    
        if (r2 == r5) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0069, code lost:
    
        if (r2 == r5) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0053, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0198, code lost:
    
        r2 = defpackage.z7o.b;
        r2 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x003b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x017c, code lost:
    
        r2 = defpackage.z7o.b;
        r0 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x018d A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:15:0x0187, B:17:0x018d, B:18:0x0193, B:64:0x017c, B:27:0x004e, B:28:0x00c2, B:30:0x00cc, B:32:0x00d6, B:33:0x00dd, B:35:0x00e1, B:37:0x00e5, B:39:0x00ef, B:53:0x0098, B:55:0x00a1, B:12:0x0036, B:13:0x0174, B:41:0x00f3), top: B:7:0x002e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc A[Catch: all -> 0x0053, TryCatch #0 {all -> 0x0053, blocks: (B:15:0x0187, B:17:0x018d, B:18:0x0193, B:64:0x017c, B:27:0x004e, B:28:0x00c2, B:30:0x00cc, B:32:0x00d6, B:33:0x00dd, B:35:0x00e1, B:37:0x00e5, B:39:0x00ef, B:53:0x0098, B:55:0x00a1, B:12:0x0036, B:13:0x0174, B:41:0x00f3), top: B:7:0x002e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f3 A[Catch: all -> 0x003b, TRY_ENTER, TryCatch #1 {all -> 0x003b, blocks: (B:12:0x0036, B:13:0x0174, B:41:0x00f3), top: B:7:0x002e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0098 A[Catch: all -> 0x0053, TRY_ENTER, TryCatch #0 {all -> 0x0053, blocks: (B:15:0x0187, B:17:0x018d, B:18:0x0193, B:64:0x017c, B:27:0x004e, B:28:0x00c2, B:30:0x00cc, B:32:0x00d6, B:33:0x00dd, B:35:0x00e1, B:37:0x00e5, B:39:0x00ef, B:53:0x0098, B:55:0x00a1, B:12:0x0036, B:13:0x0174, B:41:0x00f3), top: B:7:0x002e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    @Override // androidx.core.app.n0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(com.yandex.passport.common.core.f fVar, Continuation continuation) {
        j0 j0Var;
        int i;
        Object t7oVar;
        Throwable a;
        com.yandex.passport.internal.l lVar;
        int i2;
        int i3;
        com.yandex.passport.common.core.f fVar2;
        int i4;
        Object obj;
        Throwable a2;
        com.yandex.passport.common.core.f fVar3 = fVar;
        com.yandex.passport.common.common.a aVar = this.f;
        if (continuation instanceof j0) {
            j0Var = (j0) continuation;
            int i5 = j0Var.q;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                j0Var.q = i5 - Integer.MIN_VALUE;
                Object obj2 = j0Var.o;
                nm6 nm6Var = nm6.a;
                i = j0Var.q;
                Object obj3 = h0.a;
                if (i != 0) {
                    qgg.h0(obj2);
                    j0Var.j = fVar3;
                    j0Var.q = 1;
                    obj2 = this.d.g(fVar3, j0Var);
                } else if (i == 1) {
                    fVar3 = j0Var.j;
                    qgg.h0(obj2);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj2);
                        Object t7oVar2 = ((z7o) obj2).a;
                        qgg.h0(t7oVar2);
                        obj3 = t7oVar2;
                        r7o r7oVar = z7o.b;
                        if (!(obj3 instanceof t7o)) {
                            obj3 = u((p3) obj3);
                        }
                        qgg.h0(obj3);
                        t7oVar = obj3;
                        return new z7o(t7oVar);
                    }
                    i4 = j0Var.n;
                    i2 = j0Var.m;
                    i3 = j0Var.l;
                    lVar = j0Var.k;
                    fVar2 = j0Var.j;
                    qgg.h0(obj2);
                    obj = ((z7o) obj2).a;
                    a2 = z7o.a(obj);
                    if (a2 != null) {
                        com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Can't get client token", a2);
                        }
                        if ((a2 instanceof com.yandex.passport.common.exception.a) || (a2 instanceof com.yandex.passport.api.exception.b)) {
                            return new z7o(avf.u(obj3));
                        }
                    }
                    if (!(obj instanceof t7o)) {
                        obj3 = obj;
                        r7o r7oVar2 = z7o.b;
                        if (!(obj3 instanceof t7o)) {
                        }
                        qgg.h0(obj3);
                        t7oVar = obj3;
                        return new z7o(t7oVar);
                    }
                    t3 t3Var = this.b;
                    com.yandex.passport.internal.network.mappers.b bVar = this.g;
                    com.yandex.passport.common.core.b bVar2 = fVar2.a;
                    bVar.getClass();
                    com.yandex.passport.data.models.g a3 = com.yandex.passport.internal.network.mappers.b.a(bVar2);
                    long h = lVar.h();
                    String str = this.h;
                    String a4 = ((com.yandex.passport.internal.common.d) aVar).a();
                    String b = ((com.yandex.passport.internal.common.d) aVar).b();
                    String str2 = this.i;
                    String valueOf = String.valueOf(fVar2.b);
                    Uri build = Uri.parse(((com.yandex.passport.internal.network.h) this.c).g(fVar2.a, Long.valueOf(lVar.h()), null)).buildUpon().appendEncodedPath("closewebview").build();
                    com.yandex.passport.common.url.b.Companion.getClass();
                    k3 k3Var = new k3(a3, h, str, a4, b, str2, valueOf, com.yandex.passport.common.url.a.a(build), ((com.yandex.passport.internal.entities.e) obj).a);
                    j0Var.j = null;
                    j0Var.k = null;
                    j0Var.l = i3;
                    j0Var.m = i2;
                    j0Var.n = i4;
                    j0Var.q = 3;
                    obj2 = t3Var.g(k3Var, j0Var);
                }
                t7oVar = ((z7o) obj2).a;
                a = z7o.a(t7oVar);
                if (a != null) {
                    com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Can't find suitable master account for uid: " + fVar3, a);
                    }
                }
                if (!(t7oVar instanceof t7o)) {
                    lVar = (com.yandex.passport.internal.l) t7oVar;
                    if (lVar.e.x) {
                        s0 s0Var = this.e;
                        o0 o0Var = new o0(lVar, (com.yandex.passport.internal.credentials.f) null, 6);
                        j0Var.j = fVar3;
                        j0Var.k = lVar;
                        j0Var.l = 0;
                        j0Var.m = 0;
                        j0Var.n = 0;
                        j0Var.q = 2;
                        obj2 = s0Var.g(o0Var, j0Var);
                        if (obj2 == nm6Var) {
                            return nm6Var;
                        }
                        i2 = 0;
                        i3 = 0;
                        fVar2 = fVar3;
                        i4 = 0;
                        obj = ((z7o) obj2).a;
                        a2 = z7o.a(obj);
                        if (a2 != null) {
                        }
                        if (!(obj instanceof t7o)) {
                        }
                    }
                    qgg.h0(obj3);
                    t7oVar = obj3;
                }
                return new z7o(t7oVar);
            }
        }
        j0Var = new j0(this, (cg6) continuation);
        Object obj22 = j0Var.o;
        nm6 nm6Var2 = nm6.a;
        i = j0Var.q;
        Object obj32 = h0.a;
        if (i != 0) {
        }
        t7oVar = ((z7o) obj22).a;
        a = z7o.a(t7oVar);
        if (a != null) {
        }
        if (!(t7oVar instanceof t7o)) {
        }
        return new z7o(t7oVar);
    }
}
