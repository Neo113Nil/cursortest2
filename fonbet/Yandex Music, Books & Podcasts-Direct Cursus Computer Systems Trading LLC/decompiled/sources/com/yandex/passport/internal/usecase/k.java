package com.yandex.passport.internal.usecase;

import android.content.SharedPreferences;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.xq0;
import defpackage.z7o;
import java.io.Serializable;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class k extends com.yandex.passport.common.domain.a {
    public final com.yandex.passport.internal.config.l b;
    public final com.yandex.passport.internal.config.g c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.internal.config.l lVar, com.yandex.passport.internal.config.g gVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        aVar.getClass();
        lVar.getClass();
        gVar.getClass();
        this.b = lVar;
        this.c = gVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(9:5|6|7|(1:(3:10|11|12)(2:27|28))(7:29|30|31|32|(2:34|(2:36|(1:38)))|40|(0))|13|14|15|(1:17)|(3:20|21|22)(2:24|25)))|49|6|7|(0)(0)|13|14|15|(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0030, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009a, code lost:
    
        r10 = defpackage.z7o.b;
        r10 = new defpackage.t7o(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a1, code lost:
    
        r9 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0035, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a4, code lost:
    
        r10 = defpackage.z7o.b;
        r10 = new defpackage.t7o(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0032, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a3, code lost:
    
        throw r9;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085 A[Catch: all -> 0x0030, Exception -> 0x008b, TRY_LEAVE, TryCatch #1 {all -> 0x0030, blocks: (B:11:0x002a, B:13:0x0072, B:15:0x007d, B:17:0x0085, B:20:0x008d, B:24:0x0092, B:25:0x0099, B:30:0x0040, B:32:0x0051, B:34:0x0059, B:36:0x0063), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[Catch: all -> 0x0030, CancellationException -> 0x0032, wis -> 0x0035, TRY_ENTER, TryCatch #1 {all -> 0x0030, blocks: (B:11:0x002a, B:13:0x0072, B:15:0x007d, B:17:0x0085, B:20:0x008d, B:24:0x0092, B:25:0x0099, B:30:0x0040, B:32:0x0051, B:34:0x0059, B:36:0x0063), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0092 A[Catch: all -> 0x0030, CancellationException -> 0x0032, wis -> 0x0035, TryCatch #1 {all -> 0x0030, blocks: (B:11:0x002a, B:13:0x0072, B:15:0x007d, B:17:0x0085, B:20:0x008d, B:24:0x0092, B:25:0x0099, B:30:0x0040, B:32:0x0051, B:34:0x0059, B:36:0x0063), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063 A[Catch: all -> 0x0030, CancellationException -> 0x0032, wis -> 0x0035, TRY_ENTER, TryCatch #1 {all -> 0x0030, blocks: (B:11:0x002a, B:13:0x0072, B:15:0x007d, B:17:0x0085, B:20:0x008d, B:24:0x0092, B:25:0x0099, B:30:0x0040, B:32:0x0051, B:34:0x0059, B:36:0x0063), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(i iVar, cg6 cg6Var) {
        j jVar;
        int i;
        String str;
        com.yandex.passport.internal.config.f fVar;
        String str2;
        SharedPreferences a;
        SharedPreferences a2;
        if (cg6Var instanceof j) {
            jVar = (j) cg6Var;
            int i2 = jVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.n = i2 - Integer.MIN_VALUE;
                Object obj = jVar.l;
                nm6 nm6Var = nm6.a;
                i = jVar.n;
                str = null;
                com.yandex.passport.internal.config.g gVar = this.c;
                if (i != 0) {
                    qgg.h0(obj);
                    r7o r7oVar = z7o.b;
                    long j = iVar.b;
                    com.yandex.passport.common.core.b bVar = iVar.a;
                    fVar = new com.yandex.passport.internal.config.f(j);
                    gVar.getClass();
                    bVar.getClass();
                    try {
                        a = gVar.a.a(bVar);
                    } catch (Exception unused) {
                    }
                    if (a != null) {
                        str2 = a.getString(fVar.a, null);
                        if (str2 == null) {
                            com.yandex.passport.internal.config.l lVar = this.b;
                            jVar.j = iVar;
                            jVar.k = fVar;
                            jVar.n = 1;
                            if (lVar.g(bVar, jVar) == nm6Var) {
                                return nm6Var;
                            }
                        }
                    }
                    str2 = null;
                    if (str2 == null) {
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    com.yandex.passport.internal.config.f fVar2 = jVar.k;
                    i iVar2 = jVar.j;
                    qgg.h0(obj);
                    fVar = fVar2;
                    iVar = iVar2;
                }
                com.yandex.passport.common.core.b bVar2 = iVar.a;
                gVar.getClass();
                bVar2.getClass();
                fVar.getClass();
                a2 = gVar.a.a(bVar2);
                if (a2 != null) {
                    str = a2.getString(fVar.a, null);
                }
                if (str != null) {
                    throw new IllegalStateException("location id for query not found");
                }
                Object obj2 = Unit.a;
                r7o r7oVar2 = z7o.b;
                return new z7o(obj2);
            }
        }
        jVar = new j(this, cg6Var);
        Object obj3 = jVar.l;
        nm6 nm6Var2 = nm6.a;
        i = jVar.n;
        str = null;
        com.yandex.passport.internal.config.g gVar2 = this.c;
        if (i != 0) {
        }
        com.yandex.passport.common.core.b bVar22 = iVar.a;
        gVar2.getClass();
        bVar22.getClass();
        fVar.getClass();
        a2 = gVar2.a.a(bVar22);
        if (a2 != null) {
        }
        if (str != null) {
        }
    }
}
