package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class x6l {
    public static final String q = f1d.g("SharedPlaybackCore:", "StateMachine");
    public e6l a;
    public e6l b;
    public final xdr c;
    public final xdr d;
    public final xdr e;
    public final xdr f;
    public final x0q g;
    public final x0q h;
    public final x0q i;
    public final x0q j;
    public final x0q k;
    public final x0q l;
    public w0l m;
    public boolean n;
    public Long o;
    public final qqi p;

    public x6l() {
        b6l b6lVar = b6l.a;
        this.a = b6lVar;
        this.b = b6lVar;
        xdr a = ydr.a(b6lVar);
        this.c = a;
        this.d = a;
        xdr a2 = ydr.a(b6lVar);
        this.e = a2;
        this.f = a2;
        x0q b = y0q.b(0, 0, null, 7);
        this.g = b;
        this.h = b;
        x0q b2 = y0q.b(0, 0, null, 7);
        this.i = b2;
        this.j = b2;
        x0q b3 = y0q.b(0, 0, null, 7);
        this.k = b3;
        this.l = b3;
        this.p = rqi.a();
    }

    public static d6l a(d6l d6lVar, gzk gzkVar, v0l v0lVar) {
        w0l w0lVar;
        n7q n7qVar = d6lVar.a;
        int ordinal = d6lVar.b.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            w0lVar = gzkVar.c ? w0l.b : w0l.a;
        } else {
            if (ordinal != 2) {
                b6e.s();
                return null;
            }
            w0lVar = gzkVar.c ? w0l.b : w0l.c;
        }
        return new d6l(n7qVar, w0lVar, v0lVar, gzkVar.d ? u0l.a : u0l.b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d6, code lost:
    
        if (r17.i.emit(r5, r3) == r4) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x015d, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x015b, code lost:
    
        if (r17.g.emit(r11, r3) == r4) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(gzk gzkVar, cg6 cg6Var) {
        o6l o6lVar;
        int i;
        boolean z;
        boolean z2;
        if (cg6Var instanceof o6l) {
            o6lVar = (o6l) cg6Var;
            int i2 = o6lVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o6lVar.l = i2 - Integer.MIN_VALUE;
                Object obj = o6lVar.j;
                nm6 nm6Var = nm6.a;
                i = o6lVar.l;
                boolean z3 = true;
                if (i != 0) {
                    qgg.h0(obj);
                    e6l e6lVar = this.b;
                    b6l b6lVar = b6l.a;
                    if (e6lVar.equals(b6lVar) || (e6lVar instanceof c6l)) {
                        z3 = false;
                    } else {
                        if (!(e6lVar instanceof d6l)) {
                            b6e.s();
                            return null;
                        }
                        if (this.m == null) {
                            e6l e6lVar2 = this.a;
                            if (!e6lVar2.equals(b6lVar)) {
                                if (e6lVar2 instanceof c6l) {
                                    this.m = ((c6l) e6lVar2).a;
                                    o(new c6l(w0l.a), true, false);
                                } else {
                                    if (!(e6lVar2 instanceof d6l)) {
                                        b6e.s();
                                        return null;
                                    }
                                    d6l d6lVar = (d6l) e6lVar2;
                                    this.m = d6lVar.b;
                                    o(d6l.a(d6lVar, null, w0l.a, v0l.a, 9), true, false);
                                }
                            }
                        }
                        int ordinal = gzkVar.b.ordinal();
                        if (ordinal == 0) {
                            d6l d6lVar2 = (d6l) e6lVar;
                            v0l v0lVar = v0l.a;
                            d6l a = a(d6lVar2, gzkVar, v0lVar);
                            o(a, true, true);
                            boolean z4 = a.b == w0l.b;
                            int ordinal2 = d6lVar2.b.ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 == 1) {
                                    z = false;
                                    z2 = d6lVar2.c != v0lVar && z && z4;
                                    boolean z5 = a.d != u0l.a;
                                    if (z2) {
                                        ssg.a(3, q, "preparePlayerEvents: emit on PlayerState.IDLE(playWhenReady=true)", null);
                                        ial ialVar = new ial(a.a, true, hln.c, z5, null);
                                        o6lVar.l = 1;
                                    }
                                } else if (ordinal2 != 2) {
                                    b6e.s();
                                    return null;
                                }
                            }
                            z = true;
                            if (d6lVar2.c != v0lVar) {
                            }
                            if (a.d != u0l.a) {
                            }
                            if (z2) {
                            }
                        } else if (ordinal == 1) {
                            o(a((d6l) e6lVar, gzkVar, v0l.b), true, true);
                        } else if (ordinal == 2) {
                            o(a((d6l) e6lVar, gzkVar, v0l.c), true, true);
                        } else if (ordinal == 3) {
                            o(a((d6l) e6lVar, gzkVar, v0l.d), true, true);
                        } else {
                            if (ordinal != 4 && ordinal != 5) {
                                b6e.s();
                                return null;
                            }
                            d6l d6lVar3 = (d6l) e6lVar;
                            v0l v0lVar2 = d6lVar3.c;
                            v0l v0lVar3 = v0l.a;
                            boolean z6 = v0lVar2 != v0lVar3;
                            d6l a2 = a(d6lVar3, gzkVar, v0lVar3);
                            o(a2, true, true);
                            if (z6) {
                                rcl rclVar = new rcl(a2.a.b(), gzkVar.b == tnl.e, true);
                                o6lVar.l = 2;
                            }
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Boolean.valueOf(z3);
            }
        }
        o6lVar = new o6l(this, cg6Var);
        Object obj2 = o6lVar.j;
        nm6 nm6Var2 = nm6.a;
        i = o6lVar.l;
        boolean z32 = true;
        if (i != 0) {
        }
        return Boolean.valueOf(z32);
    }

    public final boolean c(boolean z) {
        e6l e6lVar = z ? this.b : this.a;
        if (e6lVar.equals(b6l.a)) {
            return false;
        }
        if (e6lVar instanceof c6l) {
            int ordinal = ((c6l) e6lVar).a.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    o(new c6l(w0l.c), true, z);
                    return true;
                }
                if (ordinal != 2) {
                    b6e.s();
                    return false;
                }
            }
        } else {
            if (!(e6lVar instanceof d6l)) {
                b6e.s();
                return false;
            }
            d6l d6lVar = (d6l) e6lVar;
            int ordinal2 = d6lVar.b.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    o(d6l.a(d6lVar, null, w0l.c, null, 13), true, z);
                } else if (ordinal2 != 2) {
                    b6e.s();
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean d(boolean z, pmt pmtVar) {
        if (z) {
            int ordinal = pmtVar.ordinal();
            if (ordinal == 0) {
                this.n = false;
            } else if (ordinal == 1) {
                this.n = true;
            } else if (ordinal != 2) {
                b6e.s();
                return false;
            }
        }
        boolean z2 = pmtVar != pmt.a;
        e6l e6lVar = z ? this.b : this.a;
        if (e6lVar instanceof b6l) {
            return false;
        }
        if (!(e6lVar instanceof d6l)) {
            if (!(e6lVar instanceof c6l)) {
                b6e.s();
                return false;
            }
            int ordinal2 = ((c6l) e6lVar).a.ordinal();
            if (ordinal2 != 0 && ordinal2 != 1) {
                if (ordinal2 == 2) {
                    o(z2 ? new c6l(w0l.a) : new c6l(w0l.b), true, z);
                    return true;
                }
                b6e.s();
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0068 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:12:0x004c, B:14:0x0068, B:15:0x006f, B:17:0x0077, B:20:0x007c, B:23:0x0096, B:27:0x0081, B:28:0x0086, B:29:0x0087, B:31:0x008b, B:32:0x0090, B:33:0x008e, B:34:0x006d), top: B:11:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0081 A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:12:0x004c, B:14:0x0068, B:15:0x006f, B:17:0x0077, B:20:0x007c, B:23:0x0096, B:27:0x0081, B:28:0x0086, B:29:0x0087, B:31:0x008b, B:32:0x0090, B:33:0x008e, B:34:0x006d), top: B:11:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008b A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:12:0x004c, B:14:0x0068, B:15:0x006f, B:17:0x0077, B:20:0x007c, B:23:0x0096, B:27:0x0081, B:28:0x0086, B:29:0x0087, B:31:0x008b, B:32:0x0090, B:33:0x008e, B:34:0x006d), top: B:11:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008e A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:12:0x004c, B:14:0x0068, B:15:0x006f, B:17:0x0077, B:20:0x007c, B:23:0x0096, B:27:0x0081, B:28:0x0086, B:29:0x0087, B:31:0x008b, B:32:0x0090, B:33:0x008e, B:34:0x006d), top: B:11:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x006d A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:12:0x004c, B:14:0x0068, B:15:0x006f, B:17:0x0077, B:20:0x007c, B:23:0x0096, B:27:0x0081, B:28:0x0086, B:29:0x0087, B:31:0x008b, B:32:0x0090, B:33:0x008e, B:34:0x006d), top: B:11:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(boolean z, boolean z2, cg6 cg6Var) {
        p6l p6lVar;
        int i;
        qqi qqiVar;
        e6l e6lVar;
        try {
            if (cg6Var instanceof p6l) {
                p6lVar = (p6l) cg6Var;
                int i2 = p6lVar.o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    p6lVar.o = i2 - Integer.MIN_VALUE;
                    Object obj = p6lVar.m;
                    nm6 nm6Var = nm6.a;
                    i = p6lVar.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqi qqiVar2 = this.p;
                        p6lVar.l = qqiVar2;
                        p6lVar.j = z;
                        p6lVar.k = z2;
                        p6lVar.o = 1;
                        if (qqiVar2.a(p6lVar) == nm6Var) {
                            return nm6Var;
                        }
                        qqiVar = qqiVar2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = p6lVar.k;
                        z = p6lVar.j;
                        qqiVar = p6lVar.l;
                        qgg.h0(obj);
                    }
                    ssg.a(3, q, "onFirstQueuePreparing playWhenReady=" + z + " isSecondary=" + z2, null);
                    e6lVar = !z2 ? this.b : this.a;
                    if (!e6lVar.equals(b6l.a) && !(e6lVar instanceof c6l)) {
                        if (e6lVar instanceof d6l) {
                            throw new x7j();
                        }
                        Unit unit = Unit.a;
                        qqiVar.b(null);
                        return unit;
                    }
                    o(new c6l(!z ? w0l.b : w0l.a), true, z2);
                    Unit unit2 = Unit.a;
                    qqiVar.b(null);
                    return unit2;
                }
            }
            ssg.a(3, q, "onFirstQueuePreparing playWhenReady=" + z + " isSecondary=" + z2, null);
            if (!z2) {
            }
            if (!e6lVar.equals(b6l.a)) {
                if (e6lVar instanceof d6l) {
                }
            }
            o(new c6l(!z ? w0l.b : w0l.a), true, z2);
            Unit unit22 = Unit.a;
            qqiVar.b(null);
            return unit22;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        p6lVar = new p6l(this, cg6Var);
        Object obj2 = p6lVar.m;
        nm6 nm6Var2 = nm6.a;
        i = p6lVar.o;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004f, code lost:
    
        if (r9.a(r0) == r1) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Type inference failed for: r4v3, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(cg6 cg6Var) {
        q6l q6lVar;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        oqi oqiVar;
        Throwable th;
        x0q x0qVar;
        Unit unit;
        try {
            if (cg6Var instanceof q6l) {
                q6lVar = (q6l) cg6Var;
                int i3 = q6lVar.n;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    q6lVar.n = i3 - Integer.MIN_VALUE;
                    Object obj = q6lVar.l;
                    nm6Var = nm6.a;
                    i = q6lVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.p;
                        q6lVar.j = qqiVar;
                        i2 = 0;
                        q6lVar.k = 0;
                        q6lVar.n = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = q6lVar.j;
                            try {
                                qgg.h0(obj);
                                Unit unit2 = Unit.a;
                                oqiVar.b(null);
                                return unit2;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        i2 = q6lVar.k;
                        ?? r4 = q6lVar.j;
                        qgg.h0(obj);
                        qqiVar = r4;
                    }
                    x0qVar = this.k;
                    unit = Unit.a;
                    q6lVar.j = qqiVar;
                    q6lVar.k = i2;
                    q6lVar.n = 2;
                    if (x0qVar.emit(unit, q6lVar) != nm6Var) {
                        oqiVar = qqiVar;
                        Unit unit22 = Unit.a;
                        oqiVar.b(null);
                        return unit22;
                    }
                    return nm6Var;
                }
            }
            x0qVar = this.k;
            unit = Unit.a;
            q6lVar.j = qqiVar;
            q6lVar.k = i2;
            q6lVar.n = 2;
            if (x0qVar.emit(unit, q6lVar) != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            oqiVar = qqiVar;
            th = th3;
            oqiVar.b(null);
            throw th;
        }
        q6lVar = new q6l(this, cg6Var);
        Object obj2 = q6lVar.l;
        nm6Var = nm6.a;
        i = q6lVar.n;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c8, code lost:
    
        if (r0.emit(r5, r1) != r2) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae A[Catch: all -> 0x009c, TryCatch #2 {all -> 0x009c, blocks: (B:28:0x00a1, B:30:0x00ae, B:32:0x00b6, B:44:0x0071, B:46:0x0084), top: B:43:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084 A[Catch: all -> 0x009c, TryCatch #2 {all -> 0x009c, blocks: (B:28:0x00a1, B:30:0x00ae, B:32:0x00b6, B:44:0x0071, B:46:0x0084), top: B:43:0x0071 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r3v10, types: [oqi] */
    /* JADX WARN: Type inference failed for: r9v1, types: [oqi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(boolean z, cg6 cg6Var) {
        r6l r6lVar;
        int i;
        qqi qqiVar;
        int i2;
        boolean z2;
        int i3;
        qqi qqiVar2;
        Throwable th;
        oqi oqiVar;
        b6l b6lVar;
        try {
            if (cg6Var instanceof r6l) {
                r6lVar = (r6l) cg6Var;
                int i4 = r6lVar.p;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    r6lVar.p = i4 - Integer.MIN_VALUE;
                    Object obj = r6lVar.n;
                    nm6 nm6Var = nm6.a;
                    i = r6lVar.p;
                    int i5 = 0;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqiVar = this.p;
                        r6lVar.k = qqiVar;
                        r6lVar.j = z;
                        r6lVar.l = 0;
                        r6lVar.p = 1;
                        if (qqiVar.a(r6lVar) != nm6Var) {
                            i2 = 0;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = r6lVar.k;
                            try {
                                qgg.h0(obj);
                                Unit unit = Unit.a;
                                oqiVar.b(null);
                                return unit;
                            } catch (Throwable th2) {
                                th = th2;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        i5 = r6lVar.m;
                        i3 = r6lVar.l;
                        z2 = r6lVar.j;
                        ?? r3 = r6lVar.k;
                        try {
                            qgg.h0(obj);
                            qqiVar2 = r3;
                            qqiVar = qqiVar2;
                            i2 = i3;
                            z = z2;
                            b6lVar = b6l.a;
                            o(b6lVar, true, z);
                            if (this.a.equals(b6lVar) && this.b.equals(b6lVar)) {
                                x0q x0qVar = this.g;
                                jal jalVar = jal.a;
                                r6lVar.k = qqiVar;
                                r6lVar.j = z;
                                r6lVar.l = i2;
                                r6lVar.m = i5;
                                r6lVar.p = 3;
                            }
                            oqiVar = qqiVar;
                            Unit unit2 = Unit.a;
                            oqiVar.b(null);
                            return unit2;
                        } catch (Throwable th3) {
                            th = th3;
                            oqiVar = r3;
                            oqiVar.b(null);
                            throw th;
                        }
                    }
                    int i6 = r6lVar.l;
                    boolean z3 = r6lVar.j;
                    ?? r9 = r6lVar.k;
                    qgg.h0(obj);
                    i2 = i6;
                    z = z3;
                    qqiVar = r9;
                    ssg.a(3, q, "onLastQueueStop " + z, null);
                    if (z) {
                        r6lVar.k = qqiVar;
                        r6lVar.j = z;
                        r6lVar.l = i2;
                        r6lVar.m = 0;
                        r6lVar.p = 2;
                        if (n(r6lVar) == nm6Var) {
                            return nm6Var;
                        }
                        z2 = z;
                        i3 = i2;
                        qqiVar2 = qqiVar;
                        qqiVar = qqiVar2;
                        i2 = i3;
                        z = z2;
                    }
                    b6lVar = b6l.a;
                    o(b6lVar, true, z);
                    if (this.a.equals(b6lVar)) {
                        x0q x0qVar2 = this.g;
                        jal jalVar2 = jal.a;
                        r6lVar.k = qqiVar;
                        r6lVar.j = z;
                        r6lVar.l = i2;
                        r6lVar.m = i5;
                        r6lVar.p = 3;
                    }
                    oqiVar = qqiVar;
                    Unit unit22 = Unit.a;
                    oqiVar.b(null);
                    return unit22;
                }
            }
            ssg.a(3, q, "onLastQueueStop " + z, null);
            if (z) {
            }
            b6lVar = b6l.a;
            o(b6lVar, true, z);
            if (this.a.equals(b6lVar)) {
            }
            oqiVar = qqiVar;
            Unit unit222 = Unit.a;
            oqiVar.b(null);
            return unit222;
        } catch (Throwable th4) {
            qqi qqiVar3 = qqiVar;
            th = th4;
            oqiVar = qqiVar3;
            oqiVar.b(null);
            throw th;
        }
        r6lVar = new r6l(this, cg6Var);
        Object obj2 = r6lVar.n;
        nm6 nm6Var2 = nm6.a;
        i = r6lVar.p;
        int i52 = 0;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x01aa, code lost:
    
        if (r0.emit(r14, r3) == r4) goto L97;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:17:0x0038, B:18:0x01b3, B:24:0x00a5, B:26:0x00ad, B:28:0x00b7, B:31:0x00bd, B:33:0x00c1, B:42:0x00d5, B:43:0x00da, B:44:0x00db, B:47:0x00e7, B:49:0x00f2, B:52:0x0104, B:58:0x0119, B:59:0x0126, B:60:0x0133, B:61:0x0140, B:64:0x0155, B:69:0x0165, B:70:0x016a, B:72:0x016e, B:77:0x017b, B:81:0x0188, B:87:0x01ad, B:88:0x01b2), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0188 A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:17:0x0038, B:18:0x01b3, B:24:0x00a5, B:26:0x00ad, B:28:0x00b7, B:31:0x00bd, B:33:0x00c1, B:42:0x00d5, B:43:0x00da, B:44:0x00db, B:47:0x00e7, B:49:0x00f2, B:52:0x0104, B:58:0x0119, B:59:0x0126, B:60:0x0133, B:61:0x0140, B:64:0x0155, B:69:0x0165, B:70:0x016a, B:72:0x016e, B:77:0x017b, B:81:0x0188, B:87:0x01ad, B:88:0x01b2), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5, types: [int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r21v0, types: [x6l] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1, types: [oqi] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(gzk gzkVar, cg6 cg6Var) {
        s6l s6lVar;
        Object obj;
        nm6 nm6Var;
        int i;
        gzk gzkVar2;
        oqi oqiVar;
        int i2;
        oqi oqiVar2;
        ?? r13;
        int i3;
        boolean z;
        boolean z2;
        ?? r2 = "new playback event ";
        try {
            try {
                if (cg6Var instanceof s6l) {
                    s6lVar = (s6l) cg6Var;
                    int i4 = s6lVar.p;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        s6lVar.p = i4 - Integer.MIN_VALUE;
                        obj = s6lVar.n;
                        nm6Var = nm6.a;
                        i = s6lVar.p;
                        String str = q;
                        boolean z3 = true;
                        if (i != 0) {
                            qgg.h0(obj);
                            s6lVar.j = gzkVar;
                            qqi qqiVar = this.p;
                            s6lVar.k = qqiVar;
                            s6lVar.l = 0;
                            s6lVar.p = 1;
                            if (qqiVar.a(s6lVar) != nm6Var) {
                                gzkVar2 = gzkVar;
                                oqiVar = qqiVar;
                                i2 = 0;
                            }
                            return nm6Var;
                        }
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3 && i != 4) {
                                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                oqiVar2 = s6lVar.k;
                                qgg.h0(obj);
                                Unit unit = Unit.a;
                                oqiVar2.b(null);
                                return unit;
                            }
                            int i5 = s6lVar.m;
                            int i6 = s6lVar.l;
                            oqi oqiVar3 = s6lVar.k;
                            gzkVar2 = s6lVar.j;
                            qgg.h0(obj);
                            i3 = i5;
                            oqiVar2 = oqiVar3;
                            r13 = i6;
                            if (!((Boolean) obj).booleanValue()) {
                                e6l e6lVar = this.a;
                                if (!e6lVar.equals(b6l.a) && !(e6lVar instanceof c6l)) {
                                    if (!(e6lVar instanceof d6l)) {
                                        throw new x7j();
                                    }
                                    int ordinal = gzkVar2.b.ordinal();
                                    if (ordinal == 0) {
                                        v0l v0lVar = v0l.a;
                                        d6l a = a((d6l) e6lVar, gzkVar2, v0lVar);
                                        o(a, true, false);
                                        boolean z4 = a.b == w0l.b;
                                        int ordinal2 = ((d6l) e6lVar).b.ordinal();
                                        if (ordinal2 != 0) {
                                            if (ordinal2 == 1) {
                                                z = false;
                                                z2 = ((d6l) e6lVar).c != v0lVar && z && z4;
                                                boolean z5 = a.d != u0l.a;
                                                if (z2) {
                                                    ssg.a(3, str, "preparePlayerEvents: emit on PlayerState.IDLE(playWhenReady=true)", null);
                                                    x0q x0qVar = this.g;
                                                    ial ialVar = new ial(a.a, true, hln.c, z5, null);
                                                    s6lVar.j = null;
                                                    s6lVar.k = oqiVar2;
                                                    s6lVar.l = r13;
                                                    s6lVar.m = i3;
                                                    s6lVar.p = 3;
                                                }
                                            } else if (ordinal2 != 2) {
                                                throw new x7j();
                                            }
                                        }
                                        z = true;
                                        if (((d6l) e6lVar).c != v0lVar) {
                                        }
                                        if (a.d != u0l.a) {
                                        }
                                        if (z2) {
                                        }
                                    } else if (ordinal == 1) {
                                        o(a((d6l) e6lVar, gzkVar2, v0l.b), true, false);
                                    } else if (ordinal == 2) {
                                        o(a((d6l) e6lVar, gzkVar2, v0l.c), true, false);
                                    } else if (ordinal != 3) {
                                        if (ordinal != 4 && ordinal != 5) {
                                            throw new x7j();
                                        }
                                        v0l v0lVar2 = ((d6l) e6lVar).c;
                                        v0l v0lVar3 = v0l.a;
                                        boolean z6 = v0lVar2 != v0lVar3;
                                        d6l a2 = a((d6l) e6lVar, gzkVar2, v0lVar3);
                                        o(a2, true, false);
                                        if (z6) {
                                            x0q x0qVar2 = this.i;
                                            mwk b = a2.a.b();
                                            if (gzkVar2.b != tnl.e) {
                                                z3 = false;
                                            }
                                            rcl rclVar = new rcl(b, z3, false);
                                            s6lVar.j = null;
                                            s6lVar.k = oqiVar2;
                                            s6lVar.l = r13;
                                            s6lVar.m = i3;
                                            s6lVar.p = 4;
                                            if (x0qVar2.emit(rclVar, s6lVar) == nm6Var) {
                                                return nm6Var;
                                            }
                                        }
                                    } else {
                                        o(a((d6l) e6lVar, gzkVar2, v0l.d), true, false);
                                    }
                                }
                            }
                            Unit unit2 = Unit.a;
                            oqiVar2.b(null);
                            return unit2;
                        }
                        i2 = s6lVar.l;
                        oqiVar = s6lVar.k;
                        gzkVar2 = s6lVar.j;
                        qgg.h0(obj);
                        ssg.a(3, str, "new playback event " + gzkVar2, null);
                        s6lVar.j = gzkVar2;
                        s6lVar.k = oqiVar;
                        s6lVar.l = i2;
                        s6lVar.m = 0;
                        s6lVar.p = 2;
                        obj = b(gzkVar2, s6lVar);
                        if (obj != nm6Var) {
                            oqiVar2 = oqiVar;
                            r13 = i2;
                            i3 = 0;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                            Unit unit22 = Unit.a;
                            oqiVar2.b(null);
                            return unit22;
                        }
                        return nm6Var;
                    }
                }
                if (i != 0) {
                }
                ssg.a(3, str, "new playback event " + gzkVar2, null);
                s6lVar.j = gzkVar2;
                s6lVar.k = oqiVar;
                s6lVar.l = i2;
                s6lVar.m = 0;
                s6lVar.p = 2;
                obj = b(gzkVar2, s6lVar);
                if (obj != nm6Var) {
                }
                return nm6Var;
            } catch (Throwable th) {
                th = th;
                r2 = r13;
                r2.b(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r2.b(null);
            throw th;
        }
        s6lVar = new s6l(this, cg6Var);
        obj = s6lVar.n;
        nm6Var = nm6.a;
        i = s6lVar.p;
        String str2 = q;
        boolean z32 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v4, types: [oqi] */
    /* JADX WARN: Type inference failed for: r8v0, types: [x6l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(n7q n7qVar, cg6 cg6Var) {
        t6l t6lVar;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        Throwable th;
        oqi oqiVar;
        try {
            if (cg6Var instanceof t6l) {
                t6lVar = (t6l) cg6Var;
                int i3 = t6lVar.o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    t6lVar.o = i3 - Integer.MIN_VALUE;
                    Object obj = t6lVar.m;
                    nm6Var = nm6.a;
                    i = t6lVar.o;
                    if (i != 0) {
                        qgg.h0(obj);
                        t6lVar.j = n7qVar;
                        qqiVar = this.p;
                        t6lVar.k = qqiVar;
                        t6lVar.l = 0;
                        t6lVar.o = 1;
                        if (qqiVar.a(t6lVar) != nm6Var) {
                            i2 = 0;
                        }
                        return nm6Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        oqiVar = t6lVar.k;
                        try {
                            qgg.h0(obj);
                            Unit unit = Unit.a;
                            oqiVar.b(null);
                            return unit;
                        } catch (Throwable th2) {
                            th = th2;
                            oqiVar.b(null);
                            throw th;
                        }
                    }
                    int i4 = t6lVar.l;
                    ?? r2 = t6lVar.k;
                    n7q n7qVar2 = t6lVar.j;
                    qgg.h0(obj);
                    qqiVar = r2;
                    i2 = i4;
                    n7qVar = n7qVar2;
                    t6lVar.j = null;
                    t6lVar.k = qqiVar;
                    t6lVar.l = i2;
                    t6lVar.o = 2;
                    if (j(n7qVar, false, t6lVar) != nm6Var) {
                        oqiVar = qqiVar;
                        Unit unit2 = Unit.a;
                        oqiVar.b(null);
                        return unit2;
                    }
                    return nm6Var;
                }
            }
            t6lVar.j = null;
            t6lVar.k = qqiVar;
            t6lVar.l = i2;
            t6lVar.o = 2;
            if (j(n7qVar, false, t6lVar) != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            qqi qqiVar2 = qqiVar;
            th = th3;
            oqiVar = qqiVar2;
            oqiVar.b(null);
            throw th;
        }
        t6lVar = new t6l(this, cg6Var);
        Object obj2 = t6lVar.m;
        nm6Var = nm6.a;
        i = t6lVar.o;
        if (i != 0) {
        }
    }

    public final Object j(n7q n7qVar, boolean z, cg6 cg6Var) {
        String str = q;
        ssg.a(3, str, "new queue state " + n7qVar + " isSecondary=" + z, null);
        e6l e6lVar = z ? this.b : this.a;
        if (e6lVar.equals(b6l.a)) {
            dfi.r("Developer Error. QueueState received while playback is in Idle state, isSecondaryQueue=" + z, str);
        } else {
            boolean z2 = e6lVar instanceof c6l;
            x0q x0qVar = this.g;
            if (z2) {
                w0l w0lVar = ((c6l) e6lVar).a;
                o(new d6l(n7qVar, w0lVar, v0l.a, u0l.b), false, z);
                boolean z3 = w0lVar == w0l.b;
                ssg.a(3, str, hrg.t("preparePlayerEvents: emit on PreparingQueue(playWhenReady=", z3, ", isSecondary=", z, ")"), null);
                Object emit = x0qVar.emit(new ial(n7qVar, z3, hln.a, false, null), cg6Var);
                return emit == nm6.a ? emit : Unit.a;
            }
            if (!(e6lVar instanceof d6l)) {
                b6e.s();
                return null;
            }
            d6l d6lVar = (d6l) e6lVar;
            n7q n7qVar2 = d6lVar.a;
            d6l a = d6l.a(d6lVar, n7qVar, null, null, 14);
            boolean d = Intrinsics.d(n7qVar2.b(), n7qVar.b());
            hln hlnVar = !d ? hln.a : !Intrinsics.d(n7qVar2.a(), n7qVar.a()) ? hln.b : null;
            o(a, d, z);
            if (hlnVar != null) {
                boolean z4 = d6lVar.b == w0l.b;
                boolean z5 = d6lVar.d == u0l.a;
                ssg.a(3, str, hrg.t("preparePlayerEvents: emit on Ready(playWhenReady=", z4, ", isSecondary=", z, ")"), null);
                Object emit2 = x0qVar.emit(new ial(n7qVar, z4, hlnVar, z5, null), cg6Var);
                if (emit2 == nm6.a) {
                    return emit2;
                }
            }
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x005d, code lost:
    
        if (r13.a(r1) == r2) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0076 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r3v3, types: [oqi] */
    /* JADX WARN: Type inference failed for: r9v0, types: [x6l] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(n7q n7qVar, long j, cg6 cg6Var) {
        u6l u6lVar;
        nm6 nm6Var;
        int i;
        qqi qqiVar;
        int i2;
        oqi oqiVar;
        try {
            if (cg6Var instanceof u6l) {
                u6lVar = (u6l) cg6Var;
                int i3 = u6lVar.p;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    u6lVar.p = i3 - Integer.MIN_VALUE;
                    Object obj = u6lVar.n;
                    nm6Var = nm6.a;
                    i = u6lVar.p;
                    if (i != 0) {
                        qgg.h0(obj);
                        u6lVar.j = n7qVar;
                        qqiVar = this.p;
                        u6lVar.k = qqiVar;
                        u6lVar.l = j;
                        i2 = 0;
                        u6lVar.m = 0;
                        u6lVar.p = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            oqiVar = u6lVar.k;
                            try {
                                qgg.h0(obj);
                                Unit unit = Unit.a;
                                oqiVar.b(null);
                                return unit;
                            } catch (Throwable th) {
                                th = th;
                                oqiVar.b(null);
                                throw th;
                            }
                        }
                        int i4 = u6lVar.m;
                        j = u6lVar.l;
                        ?? r3 = u6lVar.k;
                        n7q n7qVar2 = u6lVar.j;
                        qgg.h0(obj);
                        qqiVar = r3;
                        i2 = i4;
                        n7qVar = n7qVar2;
                    }
                    ssg.a(3, q, "New secondary queue state " + n7qVar, null);
                    if (this.o == null) {
                        try {
                            this.o = new Long(j);
                        } catch (Throwable th2) {
                            th = th2;
                            oqiVar = qqiVar;
                            oqiVar.b(null);
                            throw th;
                        }
                    }
                    u6lVar.j = null;
                    u6lVar.k = qqiVar;
                    u6lVar.l = j;
                    u6lVar.m = i2;
                    u6lVar.p = 2;
                    if (j(n7qVar, true, u6lVar) != nm6Var) {
                        oqiVar = qqiVar;
                        Unit unit2 = Unit.a;
                        oqiVar.b(null);
                        return unit2;
                    }
                    return nm6Var;
                }
            }
            ssg.a(3, q, "New secondary queue state " + n7qVar, null);
            if (this.o == null) {
            }
            u6lVar.j = null;
            u6lVar.k = qqiVar;
            u6lVar.l = j;
            u6lVar.m = i2;
            u6lVar.p = 2;
            if (j(n7qVar, true, u6lVar) != nm6Var) {
            }
            return nm6Var;
        } catch (Throwable th3) {
            th = th3;
        }
        u6lVar = new u6l(this, cg6Var);
        Object obj2 = u6lVar.n;
        nm6Var = nm6.a;
        i = u6lVar.p;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0050 A[Catch: all -> 0x0055, TryCatch #0 {all -> 0x0055, blocks: (B:12:0x0042, B:14:0x0050, B:15:0x0057), top: B:11:0x0042 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(cg6 cg6Var) {
        v6l v6lVar;
        int i;
        qqi qqiVar;
        try {
            if (cg6Var instanceof v6l) {
                v6lVar = (v6l) cg6Var;
                int i2 = v6lVar.m;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    v6lVar.m = i2 - Integer.MIN_VALUE;
                    Object obj = v6lVar.k;
                    nm6 nm6Var = nm6.a;
                    i = v6lVar.m;
                    if (i != 0) {
                        qgg.h0(obj);
                        qqi qqiVar2 = this.p;
                        v6lVar.j = qqiVar2;
                        v6lVar.m = 1;
                        if (qqiVar2.a(v6lVar) == nm6Var) {
                            return nm6Var;
                        }
                        qqiVar = qqiVar2;
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqiVar = v6lVar.j;
                        qgg.h0(obj);
                    }
                    ssg.a(3, q, "onSuspendPlayback", null);
                    if (!c(true)) {
                        c(false);
                    }
                    Unit unit = Unit.a;
                    qqiVar.b(null);
                    return unit;
                }
            }
            ssg.a(3, q, "onSuspendPlayback", null);
            if (!c(true)) {
            }
            Unit unit2 = Unit.a;
            qqiVar.b(null);
            return unit2;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        v6lVar = new v6l(this, cg6Var);
        Object obj2 = v6lVar.k;
        nm6 nm6Var2 = nm6.a;
        i = v6lVar.m;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0061 A[Catch: all -> 0x0066, TryCatch #0 {all -> 0x0066, blocks: (B:12:0x0049, B:14:0x0061, B:15:0x0068), top: B:11:0x0049 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(pmt pmtVar, cg6 cg6Var) {
        w6l w6lVar;
        int i;
        qqi qqiVar;
        try {
            if (cg6Var instanceof w6l) {
                w6lVar = (w6l) cg6Var;
                int i2 = w6lVar.n;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    w6lVar.n = i2 - Integer.MIN_VALUE;
                    Object obj = w6lVar.l;
                    nm6 nm6Var = nm6.a;
                    i = w6lVar.n;
                    if (i != 0) {
                        qgg.h0(obj);
                        w6lVar.j = pmtVar;
                        qqiVar = this.p;
                        w6lVar.k = qqiVar;
                        w6lVar.n = 1;
                        if (qqiVar.a(w6lVar) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qqi qqiVar2 = w6lVar.k;
                        pmt pmtVar2 = w6lVar.j;
                        qgg.h0(obj);
                        qqiVar = qqiVar2;
                        pmtVar = pmtVar2;
                    }
                    ssg.a(3, q, "onUnsuspendPlayback, source=" + pmtVar, null);
                    if (!d(true, pmtVar)) {
                        d(false, pmtVar);
                    }
                    Unit unit = Unit.a;
                    qqiVar.b(null);
                    return unit;
                }
            }
            ssg.a(3, q, "onUnsuspendPlayback, source=" + pmtVar, null);
            if (!d(true, pmtVar)) {
            }
            Unit unit2 = Unit.a;
            qqiVar.b(null);
            return unit2;
        } catch (Throwable th) {
            qqiVar.b(null);
            throw th;
        }
        w6lVar = new w6l(this, cg6Var);
        Object obj2 = w6lVar.l;
        nm6 nm6Var2 = nm6.a;
        i = w6lVar.n;
        if (i != 0) {
        }
    }

    public final Object n(r6l r6lVar) {
        w0l w0lVar;
        boolean z = this.n;
        this.n = false;
        if (z) {
            w0lVar = w0l.a;
        } else {
            w0lVar = this.m;
            if (w0lVar == null) {
                w0lVar = w0l.a;
            }
        }
        this.m = null;
        e6l e6lVar = this.a;
        if (!e6lVar.equals(b6l.a)) {
            if (!(e6lVar instanceof c6l)) {
                if (!(e6lVar instanceof d6l)) {
                    b6e.s();
                    return null;
                }
                d6l d6lVar = (d6l) e6lVar;
                e6l e6lVar2 = this.b;
                d6l d6lVar2 = e6lVar2 instanceof d6l ? (d6l) e6lVar2 : null;
                d6l a = d6l.a(d6lVar, null, w0lVar, d6lVar2 != null ? d6lVar2.c : d6lVar.c, 9);
                o(a, true, false);
                Long l = this.o;
                this.o = null;
                Object emit = this.g.emit(new ial(a.a, a.b == w0l.b, hln.a, a.d == u0l.a, l), r6lVar);
                return emit == nm6.a ? emit : Unit.a;
            }
            o(new c6l(w0lVar), true, false);
        }
        return Unit.a;
    }

    public final void o(e6l e6lVar, boolean z, boolean z2) {
        ssg.a(3, q, "update state, newState = " + e6lVar + ", isSecondary=" + z2, null);
        if (z2) {
            this.b = e6lVar;
            if (z) {
                xdr xdrVar = this.e;
                xdrVar.getClass();
                xdrVar.m(null, e6lVar);
                return;
            }
            return;
        }
        this.a = e6lVar;
        if (z) {
            xdr xdrVar2 = this.c;
            xdrVar2.getClass();
            xdrVar2.m(null, e6lVar);
        }
    }
}
