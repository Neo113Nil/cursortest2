package com.yandex.passport.data.network.core;

import androidx.core.app.n0;
import defpackage.cg6;
import defpackage.d0o;
import defpackage.l3o;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;

/* loaded from: classes4.dex */
public abstract class b extends n0 {
    public final com.yandex.passport.internal.network.b b;
    public final com.yandex.passport.common.domain.a c;
    public final e d;
    public final f e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.network.b bVar, com.yandex.passport.common.domain.a aVar2, e eVar, f fVar) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        eVar.getClass();
        fVar.getClass();
        this.b = bVar;
        this.c = aVar2;
        this.d = eVar;
        this.e = fVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:0|1|(2:3|(15:5|6|7|(1:(1:(10:11|12|13|14|(5:33|34|(1:36)|37|38)|16|(5:23|24|(1:26)|27|28)|18|(1:20)|21)(2:44|45))(2:46|47))(5:56|57|(1:59)|60|(2:62|54))|48|49|50|(1:52)|14|(0)|16|(0)|18|(0)|21))|72|6|7|(0)(0)|48|49|50|(0)|14|(0)|16|(0)|18|(0)|21|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00a8, code lost:
    
        if (r11 == r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0034, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00b5, code lost:
    
        r0 = defpackage.z7o.b;
        r11 = new defpackage.t7o(r11);
        r9 = r9;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0047, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008e, code lost:
    
        r2 = defpackage.z7o.b;
        r2 = new defpackage.t7o(r11);
        r9 = r9;
        r10 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0087, code lost:
    
        r11 = r10;
        r10 = r9;
        r9 = r11;
        r11 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x008c, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x008d, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0045, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0080, code lost:
    
        r2 = defpackage.z7o.b;
        r2 = new defpackage.t7o(r11);
        r9 = r9;
        r10 = r10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00fc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a A[Catch: all -> 0x0034, TRY_ENTER, TryCatch #0 {all -> 0x0034, blocks: (B:12:0x002f, B:13:0x00ab, B:52:0x009a), top: B:7:0x0025 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Serializable w(b bVar, Object obj, cg6 cg6Var) {
        a aVar;
        int i;
        Object obj2;
        b bVar2;
        b bVar3;
        t7o t7oVar;
        if (cg6Var instanceof a) {
            aVar = (a) cg6Var;
            int i2 = aVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aVar.n = i2 - Integer.MIN_VALUE;
                Object obj3 = aVar.l;
                nm6 nm6Var = nm6.a;
                i = aVar.n;
                if (i != 0) {
                    qgg.h0(obj3);
                    r7o r7oVar = z7o.b;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "transforming " + obj, 8);
                    }
                    d u = bVar.u();
                    aVar.j = bVar;
                    aVar.k = obj;
                    aVar.n = 1;
                    obj3 = u.a(obj, aVar);
                    bVar = bVar;
                    obj = obj;
                    if (obj3 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Object obj4 = aVar.k;
                        b bVar4 = aVar.j;
                        qgg.h0(obj3);
                        bVar = obj4;
                        obj = bVar4;
                        Object obj5 = ((z7o) obj3).a;
                        qgg.h0(obj5);
                        obj2 = (l3o) obj5;
                        bVar3 = bVar;
                        bVar2 = obj;
                        r7o r7oVar2 = z7o.b;
                        if (!(obj2 instanceof t7o)) {
                            try {
                                l3o l3oVar = (l3o) obj2;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "transforming " + l3oVar, 8);
                                }
                                com.yandex.passport.common.network.i g = bVar2.d.g(l3oVar);
                                bVar2.b.a(g, l3oVar.a);
                                t7oVar = g;
                            } catch (Throwable th) {
                                r7o r7oVar3 = z7o.b;
                                t7oVar = new t7o(th);
                            }
                            obj2 = t7oVar;
                        }
                        if (!(obj2 instanceof t7o)) {
                            try {
                                com.yandex.passport.common.network.i iVar = (com.yandex.passport.common.network.i) obj2;
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "transforming " + iVar, 8);
                                }
                                obj2 = bVar2.e.a(bVar3, iVar);
                            } catch (Throwable th2) {
                                r7o r7oVar4 = z7o.b;
                                obj2 = new t7o(th2);
                            }
                        }
                        z7o z7oVar = new z7o(obj2);
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Result is " + ((Object) z7o.b(obj2)), 8);
                        }
                        return z7oVar;
                    }
                    Object obj6 = aVar.k;
                    b bVar5 = aVar.j;
                    qgg.h0(obj3);
                    bVar = bVar5;
                    obj = obj6;
                }
                obj2 = (d0o) obj3;
                r7o r7oVar5 = z7o.b;
                b bVar6 = obj;
                b bVar7 = bVar;
                b bVar8 = bVar6;
                bVar3 = bVar8;
                bVar2 = bVar7;
                if (!(obj2 instanceof t7o)) {
                    com.yandex.passport.common.domain.a aVar2 = bVar7.c;
                    aVar.j = bVar7;
                    aVar.k = bVar8;
                    aVar.n = 2;
                    obj3 = aVar2.g((d0o) obj2, aVar);
                    bVar = bVar8;
                    obj = bVar7;
                }
                r7o r7oVar22 = z7o.b;
                if (!(obj2 instanceof t7o)) {
                }
                if (!(obj2 instanceof t7o)) {
                }
                z7o z7oVar2 = new z7o(obj2);
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                }
                return z7oVar2;
            }
        }
        aVar = new a(bVar, cg6Var);
        Object obj32 = aVar.l;
        nm6 nm6Var2 = nm6.a;
        i = aVar.n;
        if (i != 0) {
        }
        obj2 = (d0o) obj32;
        r7o r7oVar52 = z7o.b;
        b bVar62 = obj;
        b bVar72 = bVar;
        b bVar82 = bVar62;
        bVar3 = bVar82;
        bVar2 = bVar72;
        if (!(obj2 instanceof t7o)) {
        }
        r7o r7oVar222 = z7o.b;
        if (!(obj2 instanceof t7o)) {
        }
        if (!(obj2 instanceof t7o)) {
        }
        z7o z7oVar22 = new z7o(obj2);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
        }
        return z7oVar22;
    }

    public abstract d u();

    @Override // androidx.core.app.n0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public Object x(Object obj, rhw rhwVar) {
        return w(this, obj, rhwVar);
    }
}
