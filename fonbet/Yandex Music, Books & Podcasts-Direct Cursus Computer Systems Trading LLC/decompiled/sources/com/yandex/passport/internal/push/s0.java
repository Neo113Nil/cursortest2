package com.yandex.passport.internal.push;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.metrica.push.common.CoreConstants;
import com.yandex.passport.api.v2;
import com.yandex.passport.data.network.s9;
import com.yandex.passport.data.network.u9;
import com.yandex.passport.data.network.v9;
import com.yandex.passport.data.network.x9;
import com.yandex.passport.internal.report.bf;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.ua;
import com.yandex.passport.internal.report.ve;
import com.yandex.passport.internal.report.wa;
import com.yandex.passport.internal.report.ze;
import defpackage.b6e;
import defpackage.cg6;
import defpackage.ern;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.s9f;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.IOException;
import java.lang.reflect.Field;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;

/* loaded from: classes4.dex */
public final class s0 {
    public final u9 a;
    public final x9 b;
    public final com.yandex.passport.internal.database.e c;
    public final v0 d;
    public final com.yandex.passport.internal.util.k e;
    public final com.yandex.passport.internal.storage.m f;
    public final com.yandex.passport.internal.flags.i g;
    public final com.yandex.passport.internal.report.reporters.w0 h;
    public final com.yandex.passport.internal.network.mappers.b i;

    public s0(u9 u9Var, x9 x9Var, com.yandex.passport.internal.database.e eVar, v0 v0Var, com.yandex.passport.internal.util.k kVar, com.yandex.passport.internal.storage.m mVar, com.yandex.passport.internal.flags.i iVar, com.yandex.passport.internal.report.reporters.w0 w0Var, com.yandex.passport.internal.network.mappers.b bVar) {
        u9Var.getClass();
        x9Var.getClass();
        eVar.getClass();
        v0Var.getClass();
        kVar.getClass();
        mVar.getClass();
        iVar.getClass();
        w0Var.getClass();
        bVar.getClass();
        this.a = u9Var;
        this.b = x9Var;
        this.c = eVar;
        this.d = v0Var;
        this.e = kVar;
        this.f = mVar;
        this.g = iVar;
        this.h = w0Var;
        this.i = bVar;
    }

    public final void a(com.yandex.passport.common.core.f fVar, boolean z) {
        fVar.getClass();
        com.yandex.passport.internal.storage.m mVar = this.f;
        mVar.getClass();
        com.yandex.passport.internal.storage.e eVar = new com.yandex.passport.internal.storage.e(mVar, fVar);
        eVar.b.setValue(eVar, com.yandex.passport.internal.storage.e.d[1], Boolean.valueOf(z));
    }

    public final boolean b(com.yandex.passport.internal.l lVar, v2 v2Var, boolean z) {
        com.yandex.passport.common.time.a aVar;
        long b;
        com.yandex.passport.common.core.f fVar = lVar.b;
        v0 v0Var = this.d;
        com.yandex.passport.common.a aVar2 = v0Var.a;
        fVar.getClass();
        v2Var.getClass();
        v0.f.getClass();
        String b2 = t.b(fVar, v2Var);
        Long l = (Long) v0Var.a().a.get(b2);
        if (l != null) {
            b = com.yandex.passport.common.time.a.b(0L, 0L, 0L, l.longValue());
            aVar = new com.yandex.passport.common.time.a(b);
        } else {
            aVar = null;
        }
        boolean z2 = true;
        if (Intrinsics.d((Boolean) ((com.yandex.passport.internal.util.storage.a) v0Var.d.getValue(v0Var, v0.g[1])).a.get(b2), Boolean.valueOf(z)) && aVar != null) {
            long j = aVar.a;
            aVar2.getClass();
            if (Intrinsics.f(com.yandex.passport.common.a.a(), j) >= 0 && Intrinsics.f(com.yandex.passport.common.a.a(), j + v0Var.b) < 0) {
                z2 = false;
            }
        }
        com.yandex.passport.common.logger.b bVar = com.yandex.passport.common.logger.b.b;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(bVar, null, "canSubscribeNow() = " + z2, 10);
        }
        return z2;
    }

    public final boolean c(com.yandex.passport.common.core.f fVar) {
        fVar.getClass();
        com.yandex.passport.internal.storage.m mVar = this.f;
        mVar.getClass();
        com.yandex.passport.internal.storage.e eVar = new com.yandex.passport.internal.storage.e(mVar, fVar);
        return ((Boolean) eVar.b.getValue(eVar, com.yandex.passport.internal.storage.e.d[1])).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(com.yandex.passport.internal.l lVar, v2 v2Var, String str, boolean z, boolean z2, boolean z3, cg6 cg6Var) {
        p0 p0Var;
        int i;
        s0 s0Var;
        Object obj;
        boolean z4;
        int ordinal;
        if (cg6Var instanceof p0) {
            p0Var = (p0) cg6Var;
            int i2 = p0Var.p;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p0Var.p = i2 - Integer.MIN_VALUE;
                p0 p0Var2 = p0Var;
                Object obj2 = p0Var2.n;
                nm6 nm6Var = nm6.a;
                i = p0Var2.p;
                if (i != 0) {
                    qgg.h0(obj2);
                    p0Var2.j = lVar;
                    p0Var2.k = v2Var;
                    p0Var2.l = str;
                    p0Var2.m = z2;
                    p0Var2.p = 1;
                    s0Var = this;
                    Enum e = s0Var.e(lVar, v2Var, str, z, z2, z3, p0Var2);
                    if (e == nm6Var) {
                        return nm6Var;
                    }
                    obj = e;
                    z4 = z2;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z5 = p0Var2.m;
                    str = p0Var2.l;
                    v2Var = p0Var2.k;
                    com.yandex.passport.internal.l lVar2 = p0Var2.j;
                    qgg.h0(obj2);
                    z4 = z5;
                    lVar = lVar2;
                    obj = obj2;
                    s0Var = this;
                }
                ordinal = ((o0) obj).ordinal();
                v0 v0Var = s0Var.d;
                if (ordinal == 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return Unit.a;
                        }
                        b6e.s();
                        return null;
                    }
                    com.yandex.passport.common.core.f fVar = lVar.b;
                    long h = lVar.h();
                    v0Var.getClass();
                    fVar.getClass();
                    v2Var.getClass();
                    v0Var.b(fVar, v2Var, z4, h);
                    return Unit.a;
                }
                if (v2Var == v2.a) {
                    com.yandex.passport.common.core.f fVar2 = lVar.b;
                    s0Var.e.getClass();
                    String a = com.yandex.passport.internal.util.k.a(str);
                    t0 t0Var = new t0(fVar2, a);
                    com.yandex.passport.internal.database.e eVar = s0Var.c;
                    eVar.getClass();
                    if (!t0Var.equals(eVar.a(fVar2))) {
                        SQLiteDatabase writableDatabase = eVar.a.getWritableDatabase();
                        ContentValues contentValues = new ContentValues();
                        StringBuilder sb = new StringBuilder();
                        sb.append(fVar2.a.a);
                        sb.append(':');
                        sb.append(fVar2.b);
                        contentValues.put("uid", sb.toString());
                        contentValues.put("gcm_token_hash", a);
                        if (writableDatabase.insert("gcm_subscriptions", null, contentValues) == -1) {
                            com.yandex.passport.legacy.a.e(6, "insertSubscription: insert failed", null);
                        } else {
                            com.yandex.passport.legacy.a.e(3, "insertSubscription: done", null);
                        }
                    }
                }
                com.yandex.passport.common.core.f fVar3 = lVar.b;
                long h2 = lVar.h();
                v0Var.getClass();
                fVar3.getClass();
                v2Var.getClass();
                v0Var.b(fVar3, v2Var, z4, h2);
                return Unit.a;
            }
        }
        p0Var = new p0(this, cg6Var);
        p0 p0Var22 = p0Var;
        Object obj22 = p0Var22.n;
        nm6 nm6Var2 = nm6.a;
        i = p0Var22.p;
        if (i != 0) {
        }
        ordinal = ((o0) obj).ordinal();
        v0 v0Var2 = s0Var.d;
        if (ordinal == 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(13:5|6|7|(1:(1:10)(2:70|71))(2:72|(3:(2:98|(5:79|(1:(1:(1:83)(2:89|90))(1:91))(1:92)|84|85|(1:87)(1:88))(4:93|(1:95)|96|97))|77|(0)(0))(4:99|(2:101|(1:103))(2:104|(2:106|(1:108))(2:109|(2:111|(1:113))(2:114|(0)(0))))|77|(0)(0)))|11|12|(2:51|(4:53|(1:55)|56|(1:58)(2:59|60))(2:61|(2:63|64)(2:65|66)))(1:14)|15|(1:17)(1:50)|18|(2:20|(1:22)(1:48))(1:49)|23|(2:25|26)(4:28|(3:44|45|(1:47))(2:34|(2:36|(1:38))(2:41|(1:43)))|39|40)))|115|6|7|(0)(0)|11|12|(0)(0)|15|(0)(0)|18|(0)(0)|23|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0195, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b5, code lost:
    
        r4 = defpackage.z7o.b;
        r4 = new defpackage.t7o(r0);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0154 A[Catch: all -> 0x0195, TryCatch #0 {all -> 0x0195, blocks: (B:12:0x014d, B:51:0x0154, B:53:0x0158, B:56:0x0165, B:59:0x016b, B:60:0x0194, B:61:0x0197, B:63:0x019b, B:64:0x019d, B:65:0x019e, B:66:0x01b4), top: B:11:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum e(com.yandex.passport.internal.l lVar, v2 v2Var, String str, boolean z, boolean z2, boolean z3, cg6 cg6Var) {
        q0 q0Var;
        Object obj;
        int i;
        boolean b;
        String str2;
        String str3;
        ?? r13;
        char c;
        boolean z4;
        com.yandex.passport.internal.l lVar2;
        Throwable a;
        Object t7oVar;
        Throwable a2;
        v2 v2Var2 = v2Var;
        boolean z5 = z;
        boolean z6 = z2;
        if (cg6Var instanceof q0) {
            q0Var = (q0) cg6Var;
            int i2 = q0Var.q;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                q0Var.q = i2 - Integer.MIN_VALUE;
                q0 q0Var2 = q0Var;
                obj = q0Var2.o;
                nm6 nm6Var = nm6.a;
                i = q0Var2.q;
                if (i != 0) {
                    qgg.h0(obj);
                    if (((Boolean) this.g.b(com.yandex.passport.internal.flags.o.r)).booleanValue()) {
                        if (z5 || b(lVar, v2Var2, z6)) {
                            b = true;
                            if (b) {
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Can't subscribe now", 8);
                                }
                                return o0.c;
                            }
                            com.yandex.passport.common.core.b bVar = lVar.b.a;
                            this.i.getClass();
                            com.yandex.passport.data.models.g a3 = com.yandex.passport.internal.network.mappers.b.a(bVar);
                            long h = lVar.h();
                            com.yandex.passport.common.account.a aVar = lVar.d;
                            int ordinal = v2Var2.ordinal();
                            if (ordinal == 0) {
                                str2 = null;
                            } else if (ordinal == 1) {
                                str2 = CoreConstants.Transport.HMS;
                            } else {
                                if (ordinal != 2) {
                                    b6e.s();
                                    return null;
                                }
                                str2 = CoreConstants.Transport.RUSTORE;
                            }
                            str3 = "Can't cast ";
                            r13 = 1;
                            c = 2;
                            String str4 = str2;
                            z4 = z3;
                            s9 s9Var = new s9(a3, h, aVar, str, str4, z6, z4);
                            q0Var2.j = lVar;
                            q0Var2.k = v2Var2;
                            q0Var2.l = z5;
                            q0Var2.m = z6;
                            q0Var2.n = z4;
                            q0Var2.q = 1;
                            obj = this.a.g(s9Var, q0Var2);
                            if (obj == nm6Var) {
                                return nm6Var;
                            }
                            lVar2 = lVar;
                        }
                        b = false;
                        if (b) {
                        }
                    } else {
                        if (com.yandex.plus.pay.ui.core.b.B(lVar.b.a)) {
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.c, null, "Don't subscribe on team account " + lVar.i(), 8);
                            }
                        } else if (lVar.e.h == 10) {
                            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.c, null, "Don't subscribe on phonish account " + lVar.i(), 8);
                            }
                        } else if (c(lVar.b)) {
                            b = b(lVar, v2Var2, z6);
                            if (b) {
                            }
                        } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.c, null, "Don't subscribe after logout " + lVar.i(), 8);
                        }
                        b = false;
                        if (b) {
                        }
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z7 = q0Var2.n;
                    boolean z8 = q0Var2.m;
                    z5 = q0Var2.l;
                    v2 v2Var3 = q0Var2.k;
                    lVar2 = q0Var2.j;
                    qgg.h0(obj);
                    z4 = z7;
                    z6 = z8;
                    v2Var2 = v2Var3;
                    c = 2;
                    str3 = "Can't cast ";
                    r13 = 1;
                }
                r7o r7oVar = z7o.b;
                if (!(obj instanceof com.yandex.passport.data.models.q)) {
                    if (!(obj instanceof z7o)) {
                        if (obj instanceof Throwable) {
                            throw ((Throwable) obj);
                        }
                        Field declaredField = obj.getClass().getDeclaredField(Constants.KEY_EXCEPTION);
                        declaredField.setAccessible(r13);
                        Object obj2 = declaredField.get(obj);
                        obj2.getClass();
                        throw ((Throwable) obj2);
                    }
                    Object obj3 = ((z7o) obj).a;
                    qgg.h0(obj3);
                    if (!(obj3 instanceof com.yandex.passport.data.models.q)) {
                        obj3 = null;
                    }
                    com.yandex.passport.data.models.q qVar = (com.yandex.passport.data.models.q) obj3;
                    if (qVar == null) {
                        throw new ClassCastException(str3 + ((Object) z7o.b(((z7o) obj).a)) + " to " + ern.a(com.yandex.passport.data.models.q.class));
                    }
                    obj = qVar;
                }
                com.yandex.passport.common.core.f fVar = lVar2.b;
                com.yandex.passport.internal.report.reporters.w0 w0Var = this.h;
                w0Var.getClass();
                fVar.getClass();
                v2Var2.getClass();
                ua uaVar = ua.d;
                ff ffVar = new ff(fVar);
                ve veVar = new ve(v2Var2);
                bf bfVar = new bf(obj instanceof t7o ? ((com.yandex.passport.data.models.q) obj).a : obj);
                com.yandex.passport.internal.report.f fVar2 = new com.yandex.passport.internal.report.f(9, z5);
                ve veVar2 = new ve(16, z6);
                ff ffVar2 = new ff(25, z4);
                ze[] zeVarArr = new ze[6];
                zeVarArr[0] = ffVar;
                zeVarArr[r13] = veVar;
                zeVarArr[c] = bfVar;
                zeVarArr[3] = fVar2;
                zeVarArr[4] = veVar2;
                zeVarArr[5] = ffVar2;
                w0Var.n(uaVar, zeVarArr);
                a = z7o.a(obj);
                if (a != null) {
                    String str5 = ((com.yandex.passport.data.models.q) obj).a;
                    t7oVar = Intrinsics.d(str5, "ok") ? o0.a : new t7o(new com.yandex.passport.data.exceptions.h(str5));
                } else {
                    t7oVar = new t7o(a);
                }
                a2 = z7o.a(t7oVar);
                if (a2 != null) {
                    return (o0) t7oVar;
                }
                com.yandex.passport.internal.report.reporters.t tVar = com.yandex.passport.internal.report.reporters.t.b;
                if ((a2 instanceof IOException) || (a2 instanceof JSONException) || (a2 instanceof com.yandex.passport.data.exceptions.h)) {
                    com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error push subscriptions for account " + lVar2.i(), a2);
                    }
                } else if (a2 instanceof com.yandex.passport.common.exception.a) {
                    com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.b, null, "Invalid master token in account " + lVar2.i(), a2);
                    }
                } else {
                    com.yandex.passport.common.logger.d dVar3 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Unexpected error push subscriptions for account " + lVar2.i(), a2);
                    }
                }
                return o0.b;
            }
        }
        q0Var = new q0(this, cg6Var);
        q0 q0Var22 = q0Var;
        obj = q0Var22.o;
        nm6 nm6Var2 = nm6.a;
        i = q0Var22.q;
        if (i != 0) {
        }
        r7o r7oVar2 = z7o.b;
        if (!(obj instanceof com.yandex.passport.data.models.q)) {
        }
        com.yandex.passport.common.core.f fVar3 = lVar2.b;
        com.yandex.passport.internal.report.reporters.w0 w0Var2 = this.h;
        w0Var2.getClass();
        fVar3.getClass();
        v2Var2.getClass();
        ua uaVar2 = ua.d;
        ff ffVar3 = new ff(fVar3);
        ve veVar3 = new ve(v2Var2);
        bf bfVar2 = new bf(obj instanceof t7o ? ((com.yandex.passport.data.models.q) obj).a : obj);
        com.yandex.passport.internal.report.f fVar22 = new com.yandex.passport.internal.report.f(9, z5);
        ve veVar22 = new ve(16, z6);
        ff ffVar22 = new ff(25, z4);
        ze[] zeVarArr2 = new ze[6];
        zeVarArr2[0] = ffVar3;
        zeVarArr2[r13] = veVar3;
        zeVarArr2[c] = bfVar2;
        zeVarArr2[3] = fVar22;
        zeVarArr2[4] = veVar22;
        zeVarArr2[5] = ffVar22;
        w0Var2.n(uaVar2, zeVarArr2);
        a = z7o.a(obj);
        if (a != null) {
        }
        a2 = z7o.a(t7oVar);
        if (a2 != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0075, code lost:
    
        if (r6.a().a.get(com.yandex.passport.internal.push.t.b(r3, r2)) != null) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var, v2 v2Var, com.yandex.passport.common.core.f fVar) {
        r0 r0Var;
        int i;
        String str;
        char c;
        s0 s0Var;
        Object obj;
        Throwable a;
        Object t7oVar;
        Throwable a2;
        o0 o0Var;
        v2 v2Var2 = v2Var;
        com.yandex.passport.common.core.f fVar2 = fVar;
        if (cg6Var instanceof r0) {
            r0Var = (r0) cg6Var;
            int i2 = r0Var.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r0Var.o = i2 - Integer.MIN_VALUE;
                Object obj2 = r0Var.m;
                nm6 nm6Var = nm6.a;
                i = r0Var.o;
                if (i != 0) {
                    qgg.h0(obj2);
                    v2 v2Var3 = v2.a;
                    v0 v0Var = this.d;
                    if (v2Var2 != v2Var3 || this.c.a(fVar2) == null) {
                        v0Var.getClass();
                        fVar2.getClass();
                        v2Var2.getClass();
                        v0.f.getClass();
                    }
                    com.yandex.passport.common.core.b bVar = fVar2.a;
                    long j = fVar2.b;
                    this.i.getClass();
                    com.yandex.passport.data.models.g a3 = com.yandex.passport.internal.network.mappers.b.a(bVar);
                    String valueOf = String.valueOf(j);
                    int ordinal = v2Var2.ordinal();
                    if (ordinal == 0) {
                        str = null;
                    } else if (ordinal == 1) {
                        str = CoreConstants.Transport.HMS;
                    } else {
                        if (ordinal != 2) {
                            b6e.s();
                            return null;
                        }
                        str = CoreConstants.Transport.RUSTORE;
                    }
                    v0Var.getClass();
                    c = 2;
                    com.yandex.passport.internal.util.storage.a aVar = (com.yandex.passport.internal.util.storage.a) v0Var.e.getValue(v0Var, v0.g[2]);
                    StringBuilder sb = new StringBuilder();
                    sb.append(fVar2.a.a);
                    sb.append(':');
                    sb.append(j);
                    v9 v9Var = new v9(a3, valueOf, str, (Long) aVar.a.get(sb.toString()));
                    r0Var.j = fVar2;
                    r0Var.k = v2Var2;
                    r0Var.l = this;
                    r0Var.o = 1;
                    obj2 = this.b.g(v9Var, r0Var);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                    s0Var = this;
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    s0 s0Var2 = r0Var.l;
                    v2 v2Var4 = r0Var.k;
                    com.yandex.passport.common.core.f fVar3 = r0Var.j;
                    qgg.h0(obj2);
                    s0Var = s0Var2;
                    v2Var2 = v2Var4;
                    fVar2 = fVar3;
                    c = 2;
                }
                z7o z7oVar = (z7o) obj2;
                obj = z7oVar.a;
                com.yandex.passport.internal.report.reporters.w0 w0Var = s0Var.h;
                w0Var.getClass();
                fVar2.getClass();
                long j2 = fVar2.b;
                com.yandex.passport.common.core.b bVar2 = fVar2.a;
                v2Var2.getClass();
                wa waVar = wa.d;
                ff ffVar = new ff(fVar2);
                ve veVar = new ve(v2Var2);
                r7o r7oVar = z7o.b;
                if (!(obj instanceof t7o)) {
                    obj = ((com.yandex.passport.data.models.q) obj).a;
                }
                bf bfVar = new bf(obj);
                ze[] zeVarArr = new ze[3];
                zeVarArr[0] = ffVar;
                zeVarArr[1] = veVar;
                zeVarArr[c] = bfVar;
                w0Var.n(waVar, zeVarArr);
                Object obj3 = z7oVar.a;
                a = z7o.a(obj3);
                if (a != null) {
                    com.yandex.passport.data.models.q qVar = (com.yandex.passport.data.models.q) obj3;
                    t7oVar = Intrinsics.d(qVar.a, "ok") ? o0.a : new t7o(new com.yandex.passport.data.exceptions.h(qVar.a));
                } else {
                    t7oVar = new t7o(a);
                }
                a2 = z7o.a(t7oVar);
                if (a2 != null) {
                    o0Var = (o0) t7oVar;
                } else {
                    if ((a2 instanceof IOException) || (a2 instanceof JSONException) || (a2 instanceof com.yandex.passport.data.exceptions.h)) {
                        com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Error push subscriptions for account " + fVar2, a2);
                        }
                    } else {
                        com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "Unexpected error push subscriptions for account " + fVar2, a2);
                        }
                    }
                    o0Var = o0.b;
                }
                if (o0Var.equals(o0.a)) {
                    if (v2Var2 == v2.a) {
                        SQLiteDatabase readableDatabase = s0Var.c.a.getReadableDatabase();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(bVar2.a);
                        sb2.append(':');
                        sb2.append(j2);
                        readableDatabase.delete("gcm_subscriptions", "uid = ?", new String[]{sb2.toString()});
                    }
                    v0 v0Var2 = s0Var.d;
                    v0Var2.getClass();
                    v0.f.getClass();
                    String b = t.b(fVar2, v2Var2);
                    v0Var2.a().remove(b);
                    com.yandex.passport.internal.core.accounts.h hVar = v0Var2.d;
                    s9f[] s9fVarArr = v0.g;
                    ((com.yandex.passport.internal.util.storage.a) hVar.getValue(v0Var2, s9fVarArr[1])).remove(b);
                    com.yandex.passport.internal.util.storage.a aVar2 = (com.yandex.passport.internal.util.storage.a) v0Var2.e.getValue(v0Var2, s9fVarArr[c]);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(bVar2.a);
                    sb3.append(':');
                    sb3.append(j2);
                    aVar2.remove(sb3.toString());
                }
                return Unit.a;
            }
        }
        r0Var = new r0(this, cg6Var);
        Object obj22 = r0Var.m;
        nm6 nm6Var2 = nm6.a;
        i = r0Var.o;
        if (i != 0) {
        }
        z7o z7oVar2 = (z7o) obj22;
        obj = z7oVar2.a;
        com.yandex.passport.internal.report.reporters.w0 w0Var2 = s0Var.h;
        w0Var2.getClass();
        fVar2.getClass();
        long j22 = fVar2.b;
        com.yandex.passport.common.core.b bVar22 = fVar2.a;
        v2Var2.getClass();
        wa waVar2 = wa.d;
        ff ffVar2 = new ff(fVar2);
        ve veVar2 = new ve(v2Var2);
        r7o r7oVar2 = z7o.b;
        if (!(obj instanceof t7o)) {
        }
        bf bfVar2 = new bf(obj);
        ze[] zeVarArr2 = new ze[3];
        zeVarArr2[0] = ffVar2;
        zeVarArr2[1] = veVar2;
        zeVarArr2[c] = bfVar2;
        w0Var2.n(waVar2, zeVarArr2);
        Object obj32 = z7oVar2.a;
        a = z7o.a(obj32);
        if (a != null) {
        }
        a2 = z7o.a(t7oVar);
        if (a2 != null) {
        }
        if (o0Var.equals(o0.a)) {
        }
        return Unit.a;
    }
}
