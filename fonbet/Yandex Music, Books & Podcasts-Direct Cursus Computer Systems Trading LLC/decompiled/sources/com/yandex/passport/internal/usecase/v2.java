package com.yandex.passport.internal.usecase;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import defpackage.cg6;
import defpackage.mn7;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.uob;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import java.io.IOException;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class v2 extends com.yandex.passport.common.domain.a {
    public final Context b;
    public final com.yandex.passport.common.coroutine.a c;
    public final com.yandex.passport.data.network.v d;
    public final com.yandex.passport.internal.core.accounts.e e;
    public final com.yandex.passport.internal.core.accounts.a f;
    public final com.yandex.passport.internal.network.mappers.b g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(Context context, com.yandex.passport.common.coroutine.a aVar, com.yandex.passport.data.network.v vVar, com.yandex.passport.internal.core.accounts.e eVar, com.yandex.passport.internal.core.accounts.a aVar2, com.yandex.passport.internal.network.mappers.b bVar) {
        super(((com.yandex.passport.common.coroutine.b) aVar).c);
        context.getClass();
        aVar.getClass();
        vVar.getClass();
        eVar.getClass();
        aVar2.getClass();
        bVar.getClass();
        this.b = context;
        this.c = aVar;
        this.d = vVar;
        this.e = eVar;
        this.f = aVar2;
        this.g = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object u(v2 v2Var, byte[] bArr, cg6 cg6Var) {
        s2 s2Var;
        int i;
        Bitmap bitmap;
        int i2;
        if (cg6Var instanceof s2) {
            s2Var = (s2) cg6Var;
            int i3 = s2Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                s2Var.l = i3 - Integer.MIN_VALUE;
                Object obj = s2Var.j;
                nm6 nm6Var = nm6.a;
                i = s2Var.l;
                if (i != 0) {
                    qgg.h0(obj);
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
                    if (bArr.length > 7340032) {
                        int i4 = 1000;
                        if (decodeByteArray.getWidth() > decodeByteArray.getHeight()) {
                            i2 = (int) ((1000 / decodeByteArray.getWidth()) * decodeByteArray.getHeight());
                        } else {
                            i4 = (int) ((1000 / decodeByteArray.getHeight()) * decodeByteArray.getWidth());
                            i2 = 1000;
                        }
                        bitmap = Bitmap.createScaledBitmap(decodeByteArray, i4, i2, false);
                        bitmap.getClass();
                    } else {
                        decodeByteArray.getClass();
                        bitmap = decodeByteArray;
                    }
                    uob uobVar = ((com.yandex.passport.common.coroutine.b) v2Var.c).e;
                    com.yandex.passport.internal.storage.a aVar = new com.yandex.passport.internal.storage.a(bitmap, decodeByteArray, null, 29);
                    s2Var.l = 1;
                    obj = x97.V(uobVar, aVar, s2Var);
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
                obj.getClass();
                return obj;
            }
        }
        s2Var = new s2(v2Var, cg6Var);
        Object obj2 = s2Var.j;
        nm6 nm6Var2 = nm6.a;
        i = s2Var.l;
        if (i != 0) {
        }
        obj2.getClass();
        return obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007b A[Catch: SecurityException -> 0x008a, TRY_LEAVE, TryCatch #1 {SecurityException -> 0x008a, blocks: (B:13:0x0077, B:15:0x007b, B:19:0x008d, B:36:0x0068), top: B:35:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008d A[Catch: SecurityException -> 0x008a, TRY_ENTER, TRY_LEAVE, TryCatch #1 {SecurityException -> 0x008a, blocks: (B:13:0x0077, B:15:0x007b, B:19:0x008d, B:36:0x0068), top: B:35:0x0068 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // androidx.core.app.n0
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable x(r2 r2Var, cg6 cg6Var) {
        t2 t2Var;
        int i;
        SecurityException securityException;
        String str;
        mn7 mn7Var;
        v2 v2Var;
        com.yandex.passport.internal.l lVar;
        z7o z7oVar;
        if (cg6Var instanceof t2) {
            t2Var = (t2) cg6Var;
            int i2 = t2Var.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                t2Var.m = i2 - Integer.MIN_VALUE;
                Object obj = t2Var.k;
                nm6 nm6Var = nm6.a;
                i = t2Var.m;
                if (i != 0) {
                    qgg.h0(obj);
                    com.yandex.passport.internal.l e = this.e.a().e(r2Var.a);
                    if (e == null) {
                        r7o r7oVar = z7o.b;
                        return new z7o(new t7o(new com.yandex.passport.api.exception.b(r2Var.a)));
                    }
                    try {
                        str = r2Var.b;
                        mn7Var = ((com.yandex.passport.common.coroutine.b) this.c).d;
                        v2Var = this;
                    } catch (SecurityException e2) {
                        e = e2;
                    }
                    try {
                        u2 u2Var = new u2(v2Var, str, null, this, e);
                        t2Var.j = e;
                        t2Var.m = 1;
                        obj = x97.V(mn7Var, u2Var, t2Var);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                        lVar = e;
                    } catch (SecurityException e3) {
                        e = e3;
                        securityException = e;
                        r7o r7oVar2 = z7o.b;
                        return new z7o(new t7o(new IOException(securityException)));
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    lVar = t2Var.j;
                    try {
                        qgg.h0(obj);
                        v2Var = this;
                    } catch (SecurityException e4) {
                        securityException = e4;
                        r7o r7oVar22 = z7o.b;
                        return new z7o(new t7o(new IOException(securityException)));
                    }
                }
                z7oVar = (z7o) obj;
                if (z7oVar != null) {
                    r7o r7oVar3 = z7o.b;
                    return new z7o(new t7o(new IOException("Illegal url")));
                }
                Object obj2 = z7oVar.a;
                v2Var.f.a(lVar.g, true);
                return new z7o(obj2);
            }
        }
        t2Var = new t2(this, cg6Var);
        Object obj3 = t2Var.k;
        nm6 nm6Var2 = nm6.a;
        i = t2Var.m;
        if (i != 0) {
        }
        z7oVar = (z7o) obj3;
        if (z7oVar != null) {
        }
    }
}
