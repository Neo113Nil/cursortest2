package com.yandex.passport.internal.usecase;

import android.net.Uri;
import com.yandex.passport.data.network.dc;
import com.yandex.passport.data.network.yb;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.vnj;
import defpackage.xq0;
import defpackage.yd5;
import defpackage.z7o;
import java.io.Closeable;
import java.io.InputStream;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class u2 extends aur implements Function2 {
    public Closeable j;
    public int k;
    public int l;
    public final /* synthetic */ v2 m;
    public final /* synthetic */ String n;
    public final /* synthetic */ v2 o;
    public final /* synthetic */ com.yandex.passport.internal.l p;
    public com.yandex.passport.data.network.v q;
    public com.yandex.passport.data.models.g r;
    public com.yandex.passport.common.account.a s;
    public int t;
    public long u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(v2 v2Var, String str, Continuation continuation, v2 v2Var2, com.yandex.passport.internal.l lVar) {
        super(2, continuation);
        this.m = v2Var;
        this.n = str;
        this.o = v2Var2;
        this.p = lVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        return new u2(this.m, this.n, continuation, this.o, this.p);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((u2) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c0, code lost:
    
        if (r0 == r3) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.yandex.passport.internal.l] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.Closeable] */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        InputStream inputStream;
        Throwable th;
        com.yandex.passport.data.network.v vVar;
        int i;
        Object u;
        com.yandex.passport.common.account.a aVar;
        InputStream inputStream2;
        com.yandex.passport.data.models.g gVar;
        long j;
        int i2;
        Object g;
        v2 v2Var = this.o;
        ?? r2 = this.p;
        nm6 nm6Var = nm6.a;
        int i3 = this.l;
        try {
            if (i3 == 0) {
                qgg.h0(obj);
                inputStream = this.m.b.getContentResolver().openInputStream(Uri.parse(this.n));
                if (inputStream == null) {
                    return null;
                }
                try {
                    byte[] N = vnj.N(inputStream);
                    vVar = v2Var.d;
                    com.yandex.passport.internal.network.mappers.b bVar = v2Var.g;
                    com.yandex.passport.common.core.b bVar2 = r2.b.a;
                    bVar.getClass();
                    com.yandex.passport.data.models.g a = com.yandex.passport.internal.network.mappers.b.a(bVar2);
                    long h = r2.h();
                    com.yandex.passport.common.account.a aVar2 = r2.d;
                    this.j = inputStream;
                    this.q = vVar;
                    this.r = a;
                    this.s = aVar2;
                    i = 0;
                    this.k = 0;
                    this.t = 0;
                    this.u = h;
                    this.l = 1;
                    u = v2.u(v2Var, N, this);
                    if (u != nm6Var) {
                        aVar = aVar2;
                        inputStream2 = inputStream;
                        gVar = a;
                        j = h;
                        i2 = 0;
                    }
                    return nm6Var;
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    throw th;
                }
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                Closeable closeable = this.j;
                qgg.h0(obj);
                g = obj;
                r2 = closeable;
                Object obj2 = ((z7o) g).a;
                if (!(obj2 instanceof t7o)) {
                    r7o r7oVar = z7o.b;
                    obj2 = new com.yandex.passport.common.url.b(((dc) obj2).b);
                }
                z7o z7oVar = new z7o(obj2);
                yd5.q(r2, null);
                return z7oVar;
            }
            long j2 = this.u;
            int i4 = this.t;
            int i5 = this.k;
            com.yandex.passport.common.account.a aVar3 = this.s;
            com.yandex.passport.data.models.g gVar2 = this.r;
            vVar = this.q;
            Closeable closeable2 = this.j;
            try {
                qgg.h0(obj);
                i = i4;
                gVar = gVar2;
                j = j2;
                u = obj;
                aVar = aVar3;
                i2 = i5;
                inputStream2 = closeable2;
            } catch (Throwable th3) {
                th = th3;
                inputStream = closeable2;
                try {
                    throw th;
                } catch (Throwable th4) {
                    yd5.q(inputStream, th);
                    throw th4;
                }
            }
            yb ybVar = new yb(gVar, j, aVar.d(), (byte[]) u);
            this.j = inputStream2;
            this.q = null;
            this.r = null;
            this.s = null;
            this.k = i2;
            this.t = i;
            this.u = j;
            this.l = 2;
            g = vVar.g(ybVar, this);
            r2 = inputStream2;
        } catch (Throwable th5) {
            th = th5;
            inputStream = r2;
        }
    }
}
