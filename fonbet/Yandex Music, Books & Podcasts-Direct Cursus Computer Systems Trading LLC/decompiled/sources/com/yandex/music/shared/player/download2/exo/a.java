package com.yandex.music.shared.player.download2.exo;

import android.net.Uri;
import com.yandex.music.shared.player.download2.DoNotRetryException;
import com.yandex.music.shared.player.download2.balancer.RebalancedException;
import com.yandex.music.shared.utils.assertions.Assertions;
import com.yandex.music.shared.utils.assertions.FailedAssertionException;
import defpackage.a4g;
import defpackage.bow;
import defpackage.cg6;
import defpackage.db7;
import defpackage.dfi;
import defpackage.dpt;
import defpackage.fob;
import defpackage.g7q;
import defpackage.j66;
import defpackage.kun;
import defpackage.lm4;
import defpackage.lxg;
import defpackage.mx7;
import defpackage.n9c;
import defpackage.nb7;
import defpackage.nm6;
import defpackage.obo;
import defpackage.oco;
import defpackage.pco;
import defpackage.pz0;
import defpackage.qco;
import defpackage.qgg;
import defpackage.rco;
import defpackage.rj7;
import defpackage.ssg;
import defpackage.t6t;
import defpackage.tao;
import defpackage.tco;
import defpackage.tlm;
import defpackage.tqn;
import defpackage.u75;
import defpackage.uco;
import defpackage.x7j;
import defpackage.xq0;
import defpackage.xwd;
import defpackage.ywd;
import defpackage.yzm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class a implements db7 {
    public final oco a;
    public final g7q b;
    public db7 c;
    public final obo d;
    public final List e;
    public final dpt f;
    public final ywd g;
    public final xwd h;
    public long i;
    public nb7 j;
    public nb7 k;
    public Long l;
    public boolean m;
    public boolean n;
    public Uri o;
    public Uri p;
    public boolean q;
    public boolean r;
    public boolean s;
    public boolean t;
    public final ArrayList u;
    public final String v;

    public a(oco ocoVar, g7q g7qVar, db7 db7Var, obo oboVar, List list, dpt dptVar, ywd ywdVar, xwd xwdVar) {
        list.getClass();
        this.a = ocoVar;
        this.b = g7qVar;
        this.c = db7Var;
        this.d = oboVar;
        this.e = list;
        this.f = dptVar;
        this.g = ywdVar;
        this.h = xwdVar;
        this.q = true;
        this.u = new ArrayList();
        this.v = dfi.c(System.identityHashCode(this), "RetryingBalancingDataSource HC(", ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v6, types: [f9f] */
    /* JADX WARN: Type inference failed for: r6v6, types: [mbo] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:58:0x010b -> B:10:0x0113). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(a aVar, nb7 nb7Var, rco rcoVar, cg6 cg6Var) {
        tco tcoVar;
        int i;
        lm4 lm4Var;
        tao taoVar;
        int i2;
        tqn tqnVar;
        obo oboVar;
        obo oboVar2;
        boolean z;
        int i3;
        int i4;
        if (cg6Var instanceof tco) {
            tcoVar = (tco) cg6Var;
            int i5 = tcoVar.u;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                tcoVar.u = i5 - Integer.MIN_VALUE;
                Object obj = tcoVar.s;
                nm6 nm6Var = nm6.a;
                i = tcoVar.u;
                if (i == 0) {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = tcoVar.r;
                    int i6 = tcoVar.q;
                    i4 = tcoVar.p;
                    tao taoVar2 = tcoVar.o;
                    ?? r5 = tcoVar.n;
                    ?? r6 = tcoVar.m;
                    obo oboVar3 = tcoVar.l;
                    tqn tqnVar2 = tcoVar.k;
                    rco rcoVar2 = tcoVar.j;
                    qgg.h0(obj);
                    int i7 = i6;
                    rcoVar = rcoVar2;
                    tqn tqnVar3 = tqnVar2;
                    obo oboVar4 = oboVar3;
                    obo oboVar5 = r6;
                    lm4 lm4Var2 = r5;
                    tqn tqnVar4 = tqnVar3;
                    z = ((Boolean) obj).booleanValue();
                    taoVar = taoVar2;
                    i2 = i7;
                    lm4Var = lm4Var2;
                    oboVar = oboVar5;
                    oboVar2 = oboVar4;
                    tqnVar = tqnVar4;
                    if (z) {
                        ((Function1) oboVar.d).invoke((ArrayList) taoVar.e);
                        rj7.f();
                        return null;
                    }
                    try {
                    } catch (DoNotRetryException e) {
                        throw e.a;
                    } catch (InterruptedException e2) {
                        throw e2;
                    } catch (RuntimeException e3) {
                        throw e3;
                    } catch (Exception e4) {
                        if (e4 instanceof IOException) {
                            j66.h0((IOException) e4);
                        }
                        Object C = bow.C(oboVar2.e, e4);
                        if (C == null) {
                            if (oboVar.a) {
                                Assertions.throwOrSkip("RetryCheckFail", new FailedAssertionException("Unexpected checked " + e4 + " caught, expected " + lm4Var.f(), e4));
                            }
                            throw e4;
                        }
                        tcoVar.j = rcoVar;
                        tcoVar.k = tqnVar;
                        tcoVar.l = oboVar2;
                        tcoVar.m = oboVar;
                        tcoVar.n = lm4Var;
                        tcoVar.o = taoVar;
                        tcoVar.p = i4;
                        tcoVar.q = i2;
                        tcoVar.r = i3;
                        tcoVar.u = 1;
                        Object m = taoVar.m(C, e4, tcoVar);
                        if (m == nm6Var) {
                            return nm6Var;
                        }
                        int i8 = i2;
                        taoVar2 = taoVar;
                        obj = m;
                        tqnVar3 = tqnVar;
                        oboVar4 = oboVar2;
                        oboVar5 = oboVar;
                        lm4Var2 = lm4Var;
                        i7 = i8;
                    }
                    if (!tqnVar.a) {
                        tqnVar.a = true;
                        if (rcoVar != null) {
                            if (rcoVar instanceof pco) {
                                throw ((pco) rcoVar).a;
                            }
                            if (rcoVar instanceof qco) {
                                throw aVar.z(((qco) rcoVar).a);
                            }
                            throw new x7j();
                        }
                    }
                    try {
                        aVar.i();
                        Long l = aVar.l;
                        l.getClass();
                        return l;
                    } catch (IOException e5) {
                        aVar.f(aVar.c, e5);
                        throw aVar.z(e5);
                    }
                }
                qgg.h0(obj);
                aVar.j = nb7Var;
                aVar.k = nb7Var;
                aVar.i = 0L;
                tqn tqnVar5 = new tqn();
                oco ocoVar = aVar.a;
                obo oboVar6 = aVar.d;
                g7q g7qVar = aVar.b;
                lm4Var = oboVar6.e;
                taoVar = new tao(oboVar6, new mx7(ocoVar.a, null, g7qVar));
                i2 = 0;
                tqnVar = tqnVar5;
                oboVar = oboVar6;
                oboVar2 = oboVar;
                z = true;
                i3 = 0;
                i4 = 0;
                if (z) {
                }
            }
        }
        tcoVar = new tco(aVar, cg6Var);
        Object obj2 = tcoVar.s;
        nm6 nm6Var2 = nm6.a;
        i = tcoVar.u;
        if (i == 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r11v3, types: [f9f] */
    /* JADX WARN: Type inference failed for: r12v4, types: [mbo] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0137 -> B:10:0x013a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(a aVar, byte[] bArr, int i, int i2, rco rcoVar, cg6 cg6Var) {
        uco ucoVar;
        int i3;
        tqn tqnVar;
        tao taoVar;
        obo oboVar;
        obo oboVar2;
        int i4;
        int i5;
        int i6;
        lm4 lm4Var;
        boolean z;
        int i7;
        int i8;
        rco rcoVar2;
        uco ucoVar2;
        byte[] bArr2;
        nm6 nm6Var;
        a aVar2 = aVar;
        if (cg6Var instanceof uco) {
            ucoVar = (uco) cg6Var;
            int i9 = ucoVar.x;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                ucoVar.x = i9 - Integer.MIN_VALUE;
                Object obj = ucoVar.v;
                nm6 nm6Var2 = nm6.a;
                i3 = ucoVar.x;
                if (i3 == 0) {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    int i10 = ucoVar.u;
                    int i11 = ucoVar.t;
                    int i12 = ucoVar.s;
                    int i13 = ucoVar.r;
                    int i14 = ucoVar.q;
                    tao taoVar2 = ucoVar.p;
                    ?? r11 = ucoVar.o;
                    ?? r12 = ucoVar.n;
                    obo oboVar3 = ucoVar.m;
                    tqn tqnVar2 = ucoVar.l;
                    rco rcoVar3 = ucoVar.k;
                    byte[] bArr3 = ucoVar.j;
                    qgg.h0(obj);
                    ucoVar2 = ucoVar;
                    bArr2 = bArr3;
                    i8 = i13;
                    i4 = i10;
                    i7 = i14;
                    i5 = i11;
                    rcoVar2 = rcoVar3;
                    tqnVar = tqnVar2;
                    oboVar2 = oboVar3;
                    oboVar = r12;
                    lm4Var = r11;
                    taoVar = taoVar2;
                    i6 = i12;
                    z = ((Boolean) obj).booleanValue();
                    aVar2 = aVar;
                    if (!z) {
                        ((Function1) oboVar.d).invoke((ArrayList) taoVar.e);
                        rj7.f();
                        return null;
                    }
                    try {
                        try {
                        } catch (Exception e) {
                            e = e;
                            nm6Var = nm6Var2;
                        }
                        if (!tqnVar.a) {
                            nm6Var = nm6Var2;
                            try {
                            } catch (Exception e2) {
                                e = e2;
                                if (e instanceof IOException) {
                                    j66.h0((IOException) e);
                                }
                                Object C = bow.C(oboVar2.e, e);
                                if (C == null) {
                                    if (oboVar.a) {
                                        Assertions.throwOrSkip("RetryCheckFail", new FailedAssertionException("Unexpected checked " + e + " caught, expected " + lm4Var.f(), e));
                                    }
                                    throw e;
                                }
                                ucoVar2.j = bArr2;
                                ucoVar2.k = rcoVar2;
                                ucoVar2.l = tqnVar;
                                ucoVar2.m = oboVar2;
                                ucoVar2.n = oboVar;
                                ucoVar2.o = lm4Var;
                                ucoVar2.p = taoVar;
                                ucoVar2.q = i7;
                                ucoVar2.r = i8;
                                ucoVar2.s = i6;
                                ucoVar2.t = i5;
                                ucoVar2.u = i4;
                                ucoVar2.x = 1;
                                obj = taoVar.m(C, e, ucoVar2);
                                nm6Var2 = nm6Var;
                                if (obj == nm6Var2) {
                                    return nm6Var2;
                                }
                                z = ((Boolean) obj).booleanValue();
                                aVar2 = aVar;
                                if (!z) {
                                }
                            }
                            tqnVar.a = true;
                            if (rcoVar2 != null) {
                                if (rcoVar2 instanceof pco) {
                                    throw ((pco) rcoVar2).a;
                                }
                                if (rcoVar2 instanceof qco) {
                                    throw aVar2.z(((qco) rcoVar2).a);
                                }
                                throw new x7j();
                            }
                        }
                        if (!aVar2.m) {
                            try {
                                aVar2.i();
                            } catch (IOException e3) {
                                aVar2.f(aVar2.c, e3);
                                throw aVar2.z(e3);
                            }
                        }
                        return new Integer(aVar2.j(bArr2, i7, i8));
                    } catch (DoNotRetryException e4) {
                        throw e4.a;
                    } catch (InterruptedException e5) {
                        throw e5;
                    } catch (RuntimeException e6) {
                        throw e6;
                    }
                }
                qgg.h0(obj);
                tqn tqnVar3 = new tqn();
                oco ocoVar = aVar2.a;
                obo oboVar4 = aVar2.d;
                g7q g7qVar = aVar2.b;
                lm4 lm4Var2 = oboVar4.e;
                tqnVar = tqnVar3;
                taoVar = new tao(oboVar4, new mx7(ocoVar.a, null, g7qVar));
                oboVar = oboVar4;
                oboVar2 = oboVar;
                i4 = 0;
                i5 = 0;
                i6 = 0;
                lm4Var = lm4Var2;
                z = true;
                i7 = i;
                i8 = i2;
                rcoVar2 = rcoVar;
                ucoVar2 = ucoVar;
                bArr2 = bArr;
                if (!z) {
                }
            }
        }
        ucoVar = new uco(aVar2, cg6Var);
        Object obj2 = ucoVar.v;
        nm6 nm6Var22 = nm6.a;
        i3 = ucoVar.x;
        if (i3 == 0) {
        }
    }

    @Override // defpackage.db7
    public final long a(nb7 nb7Var) {
        nb7Var.getClass();
        Continuation continuation = null;
        try {
            return k(nb7Var);
        } catch (DoNotRetryException e) {
            return ((Number) a4g.N(new kun(this, nb7Var, e, continuation, 5))).longValue();
        } catch (IOException e2) {
            return ((Number) a4g.N(new kun(this, nb7Var, e2, continuation, 4))).longValue();
        }
    }

    @Override // defpackage.db7
    public final Map b() {
        Map b = this.c.b();
        b.getClass();
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x009d  */
    @Override // defpackage.db7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void close() {
        boolean z;
        Iterator it;
        ArrayList arrayList = this.u;
        try {
            if (this.m) {
                nb7 nb7Var = this.j;
                if (nb7Var == null) {
                    Intrinsics.j("dataSpec");
                    throw null;
                }
                String scheme = nb7Var.a.getScheme();
                if (scheme == null) {
                    scheme = "file";
                }
                if (!StringsKt.M(scheme, "file", false)) {
                    String str = this.v;
                    nb7 nb7Var2 = this.k;
                    if (nb7Var2 == null) {
                        Intrinsics.j("nextOpenDataSpec");
                        throw null;
                    }
                    ssg.a(3, str, "closing with last dataSpec " + nb7Var2, null);
                }
                this.m = false;
                if (!this.t && this.s) {
                    z = false;
                    this.q = z;
                    this.c.close();
                    if (this.s && !this.t) {
                        it = arrayList.iterator();
                        while (it.hasNext()) {
                            t6t t6tVar = (t6t) it.next();
                            nb7 nb7Var3 = this.j;
                            if (nb7Var3 == null) {
                                Intrinsics.j("dataSpec");
                                throw null;
                            }
                            t6tVar.z(this, nb7Var3, true);
                        }
                    }
                }
                z = true;
                this.q = z;
                this.c.close();
                if (this.s) {
                    it = arrayList.iterator();
                    while (it.hasNext()) {
                    }
                }
            } else if (this.s && !this.t) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    t6t t6tVar2 = (t6t) it2.next();
                    nb7 nb7Var4 = this.j;
                    if (nb7Var4 == null) {
                        Intrinsics.j("dataSpec");
                        throw null;
                    }
                    t6tVar2.z(this, nb7Var4, true);
                }
            }
            this.l = null;
            this.q = true;
            this.r = false;
            this.s = false;
            this.t = false;
            this.n = false;
            this.i = 0L;
        } catch (Throwable th) {
            if (this.s && !this.t) {
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    t6t t6tVar3 = (t6t) it3.next();
                    nb7 nb7Var5 = this.j;
                    if (nb7Var5 == null) {
                        Intrinsics.j("dataSpec");
                        throw null;
                    }
                    t6tVar3.z(this, nb7Var5, true);
                }
            }
            this.l = null;
            this.q = true;
            this.r = false;
            this.s = false;
            this.t = false;
            this.n = false;
            this.i = 0L;
            throw th;
        }
    }

    public final void f(db7 db7Var, IOException iOException) {
        this.m = false;
        try {
            db7Var.close();
        } catch (IOException e) {
            fob.a(e, iOException);
            throw new DoNotRetryException(e);
        }
    }

    public final void g(nb7 nb7Var) {
        if (this.o == null) {
            Uri uri = nb7Var.a;
            uri.getClass();
            this.o = uri;
            Uri uri2 = nb7Var.a;
            uri2.getClass();
            this.p = uri2;
            if (this.c instanceof n9c) {
                return;
            }
            Uri uri3 = this.o;
            if (uri3 == null) {
                Intrinsics.j("originalUri");
                throw null;
            }
            dpt dptVar = this.f;
            ReentrantLock reentrantLock = dptVar.a;
            reentrantLock.lock();
            try {
                if (((Set) dptVar.b.get(uri3)) != null ? !r6.isEmpty() : false) {
                    Uri uri4 = this.o;
                    if (uri4 == null) {
                        Intrinsics.j("originalUri");
                        throw null;
                    }
                    List list = this.e;
                    list.getClass();
                    Uri c = dptVar.c(list, uri4, null);
                    if (c == null && (c = (Uri) CollectionsKt.Z(list)) == null && (c = this.o) == null) {
                        Intrinsics.j("originalUri");
                        throw null;
                    }
                    this.p = c;
                }
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    @Override // defpackage.db7
    public final Uri getUri() {
        return this.c.getUri();
    }

    public final void i() {
        String str;
        Uri uri = this.o;
        if (uri == null) {
            Intrinsics.j("originalUri");
            throw null;
        }
        Uri uri2 = this.p;
        if (uri2 == null) {
            Intrinsics.j("currentUri");
            throw null;
        }
        boolean equals = uri.equals(uri2);
        nb7 nb7Var = this.k;
        if (equals) {
            if (nb7Var == null) {
                Intrinsics.j("nextOpenDataSpec");
                throw null;
            }
            str = "nextOpenDataSpec";
        } else {
            if (nb7Var == null) {
                Intrinsics.j("nextOpenDataSpec");
                throw null;
            }
            Uri uri3 = this.p;
            if (uri3 == null) {
                Intrinsics.j("currentUri");
                throw null;
            }
            str = "nextOpenDataSpec";
            nb7Var = new nb7(uri3, nb7Var.b, nb7Var.c, nb7Var.d, nb7Var.e, nb7Var.f, nb7Var.g, nb7Var.h, nb7Var.i);
        }
        this.k = nb7Var.d(this.i);
        this.i = 0L;
        nb7 nb7Var2 = this.j;
        if (nb7Var2 == null) {
            Intrinsics.j("dataSpec");
            throw null;
        }
        String scheme = nb7Var2.a.getScheme();
        if (scheme == null) {
            scheme = "file";
        }
        boolean M = StringsKt.M(scheme, "file", false);
        String str2 = this.v;
        if (!M) {
            nb7 nb7Var3 = this.k;
            if (nb7Var3 == null) {
                Intrinsics.j(str);
                throw null;
            }
            ssg.a(3, str2, "opening " + nb7Var3, null);
        }
        this.m = true;
        db7 db7Var = this.c;
        nb7 nb7Var4 = this.k;
        if (nb7Var4 == null) {
            Intrinsics.j(str);
            throw null;
        }
        long a = db7Var.a(nb7Var4);
        nb7 nb7Var5 = this.j;
        if (nb7Var5 == null) {
            Intrinsics.j("dataSpec");
            throw null;
        }
        String scheme2 = nb7Var5.a.getScheme();
        if (scheme2 == null) {
            scheme2 = "file";
        }
        if (!StringsKt.M(scheme2, "file", false)) {
            ssg.a(3, str2, "opened with " + a + " content length and current content length of " + this.l, null);
        }
        nb7 nb7Var6 = this.k;
        if (nb7Var6 != null) {
            x(a, nb7Var6);
        } else {
            Intrinsics.j(str);
            throw null;
        }
    }

    public final int j(byte[] bArr, int i, int i2) {
        try {
            int read = this.c.read(bArr, i, i2);
            if (read == -1) {
                return read;
            }
            nb7 nb7Var = this.k;
            if (nb7Var == null) {
                Intrinsics.j("nextOpenDataSpec");
                throw null;
            }
            long j = nb7Var.g;
            if (j == -1 || read < j) {
                this.i += read;
                return read;
            }
            this.n = true;
            return read;
        } catch (IOException e) {
            f(this.c, e);
            if (this.n) {
                throw new DoNotRetryException(e);
            }
            throw z(e);
        }
    }

    public final long k(nb7 nb7Var) {
        int i = this.g.a;
        if (this.c instanceof n9c) {
            return p(nb7Var);
        }
        if (this.o != null) {
            return p(nb7Var);
        }
        if (i <= 0) {
            return p(nb7Var);
        }
        g(nb7Var);
        Uri uri = this.p;
        Continuation continuation = null;
        if (uri == null) {
            Intrinsics.j("currentUri");
            throw null;
        }
        Uri uri2 = this.o;
        if (uri2 == null) {
            Intrinsics.j("originalUri");
            throw null;
        }
        if (!uri.equals(uri2)) {
            return p(nb7Var);
        }
        pz0 pz0Var = new pz0(2);
        Uri uri3 = this.o;
        if (uri3 == null) {
            Intrinsics.j("originalUri");
            throw null;
        }
        pz0Var.b(uri3);
        List list = this.e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Uri uri4 = (Uri) obj;
            Uri uri5 = this.o;
            if (uri5 == null) {
                Intrinsics.j("originalUri");
                throw null;
            }
            if (!Intrinsics.d(uri4, uri5)) {
                arrayList.add(obj);
            }
        }
        pz0Var.c(CollectionsKt.q0(arrayList, i).toArray(new Uri[0]));
        ArrayList arrayList2 = pz0Var.a;
        List h = u75.h(arrayList2.toArray(new Uri[arrayList2.size()]));
        return h.size() <= 1 ? p(nb7Var) : ((Number) a4g.N(new kun(this, h, nb7Var, continuation, 6))).longValue();
    }

    public final long p(nb7 nb7Var) {
        this.j = nb7Var;
        this.k = nb7Var;
        this.i = 0L;
        g(nb7Var);
        try {
            i();
            Long l = this.l;
            l.getClass();
            return l.longValue();
        } catch (IOException e) {
            f(this.c, e);
            throw e;
        }
    }

    @Override // defpackage.db7
    public final void q(t6t t6tVar) {
        t6tVar.getClass();
        if (this.c instanceof n9c) {
            return;
        }
        this.u.add(t6tVar);
        this.c.q(new yzm(this, t6tVar));
    }

    @Override // defpackage.ma7
    public final int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        try {
            return j(bArr, i, i2);
        } catch (DoNotRetryException e) {
            return ((Number) a4g.N(new lxg(this, bArr, i, i2, e, null, 2))).intValue();
        } catch (IOException e2) {
            return ((Number) a4g.N(new lxg(this, bArr, i, i2, e2, null, 1))).intValue();
        }
    }

    public final void x(long j, nb7 nb7Var) {
        Long l = this.l;
        if (l == null) {
            this.l = Long.valueOf(j);
            return;
        }
        long longValue = l.longValue();
        long j2 = nb7Var.f;
        nb7 nb7Var2 = this.j;
        if (nb7Var2 == null) {
            Intrinsics.j("dataSpec");
            throw null;
        }
        long j3 = j2 - nb7Var2.f;
        if (j == longValue - j3 || j == nb7Var2.g) {
            return;
        }
        StringBuilder l2 = tlm.l(longValue, "initial content length = ", " with current position = ");
        l2.append(j3);
        l2.append(", new content length = ");
        l2.append(j);
        throw new DoNotRetryException(new RetryingBalancingDataSource$UpstreamLengthChangedException(l2.toString()));
    }

    public final IOException z(IOException iOException) {
        boolean z = iOException instanceof ConnectivityCheckHttpDataSource$NetworkNotAllowedException;
        if (!(this.c instanceof n9c)) {
            Uri uri = this.o;
            if (uri == null) {
                Intrinsics.j("originalUri");
                throw null;
            }
            Uri uri2 = this.p;
            if (uri2 == null) {
                Intrinsics.j("currentUri");
                throw null;
            }
            List list = this.e;
            list.getClass();
            Uri c = this.f.c(list, uri, uri2);
            if (c != null) {
                this.p = c;
                if (!z) {
                    return new RebalancedException(iOException);
                }
            }
        }
        return iOException;
    }
}
