package com.yandex.passport.internal.sloth.webauthn;

import android.os.Build;
import androidx.fragment.app.t;
import com.yandex.passport.internal.flags.i;
import com.yandex.passport.internal.flags.o;
import defpackage.avf;
import defpackage.bs6;
import defpackage.c3x;
import defpackage.cg6;
import defpackage.cs6;
import defpackage.ern;
import defpackage.h0n;
import defpackage.hq0;
import defpackage.knn;
import defpackage.n7d;
import defpackage.nm6;
import defpackage.o7d;
import defpackage.opi;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.s9f;
import defpackage.sg1;
import defpackage.t75;
import defpackage.t7o;
import defpackage.tad;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class c implements e {
    public static final /* synthetic */ s9f[] c;
    public final i a;
    public final knn b = avf.V();

    static {
        opi opiVar = new opi(c.class, "activity", "getActivity()Landroidx/fragment/app/FragmentActivity;", 0);
        ern.a.getClass();
        c = new s9f[]{opiVar};
    }

    public c(i iVar) {
        this.a = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063 A[Catch: Exception -> 0x0029, TryCatch #0 {Exception -> 0x0029, blocks: (B:10:0x0025, B:11:0x005b, B:13:0x0063, B:16:0x006a, B:23:0x0052), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a A[Catch: Exception -> 0x0029, TRY_LEAVE, TryCatch #0 {Exception -> 0x0029, blocks: (B:10:0x0025, B:11:0x005b, B:13:0x0063, B:16:0x006a, B:23:0x0052), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.yandex.passport.internal.sloth.webauthn.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, Continuation continuation) {
        b bVar;
        int i;
        c3x c3xVar;
        try {
            if (continuation instanceof b) {
                bVar = (b) continuation;
                int i2 = bVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = bVar.j;
                    nm6 nm6Var = nm6.a;
                    i = bVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        t tVar = (t) this.b.getValue(this, c[0]);
                        if (tVar == null) {
                            r7o r7oVar = z7o.b;
                            return new t7o(new IllegalStateException("Can't sign in without activity"));
                        }
                        n7d n7dVar = new n7d(t75.c(new tad(str)));
                        bVar.l = 1;
                        obj = sg1.d(tVar, n7dVar, bVar);
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
                    c3xVar = ((o7d) obj).a;
                    if (c3xVar instanceof h0n) {
                        r7o r7oVar2 = z7o.b;
                        return new t7o(new IllegalStateException("Error trying to authenticate"));
                    }
                    r7o r7oVar3 = z7o.b;
                    return ((h0n) c3xVar).j;
                }
            }
            if (i != 0) {
            }
            c3xVar = ((o7d) obj).a;
            if (c3xVar instanceof h0n) {
            }
        } catch (Exception e) {
            r7o r7oVar4 = z7o.b;
            return new t7o(e);
        }
        bVar = new b(this, (cg6) continuation);
        Object obj2 = bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = bVar.l;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.yandex.passport.internal.sloth.webauthn.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, Continuation continuation) {
        a aVar;
        int i;
        try {
            if (continuation instanceof a) {
                aVar = (a) continuation;
                int i2 = aVar.l;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.l = i2 - Integer.MIN_VALUE;
                    Object obj = aVar.j;
                    nm6 nm6Var = nm6.a;
                    i = aVar.l;
                    if (i != 0) {
                        qgg.h0(obj);
                        if (Build.VERSION.SDK_INT < 28) {
                            r7o r7oVar = z7o.b;
                            return new t7o(new IllegalStateException("Not supported"));
                        }
                        t tVar = (t) this.b.getValue(this, c[0]);
                        if (tVar == null) {
                            r7o r7oVar2 = z7o.b;
                            return new t7o(new IllegalStateException("Can't sign in without activity"));
                        }
                        sg1 sg1Var = new sg1(tVar, 1);
                        bs6 bs6Var = new bs6(str);
                        aVar.l = 1;
                        obj = sg1Var.c(tVar, bs6Var, aVar);
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
                    r7o r7oVar3 = z7o.b;
                    return ((cs6) obj).a;
                }
            }
            if (i != 0) {
            }
            obj.getClass();
            r7o r7oVar32 = z7o.b;
            return ((cs6) obj).a;
        } catch (Exception e) {
            r7o r7oVar4 = z7o.b;
            return new t7o(e);
        }
        aVar = new a(this, (cg6) continuation);
        Object obj2 = aVar.j;
        nm6 nm6Var2 = nm6.a;
        i = aVar.l;
    }

    @Override // com.yandex.passport.internal.sloth.webauthn.e
    public final Object c() {
        boolean z = ((Boolean) this.a.b(o.Q)).booleanValue() && Build.VERSION.SDK_INT >= 28;
        r7o r7oVar = z7o.b;
        return Boolean.valueOf(z);
    }

    @Override // com.yandex.passport.internal.sloth.webauthn.e
    public final void d(hq0 hq0Var) {
        this.b.setValue(this, c[0], hq0Var);
    }
}
