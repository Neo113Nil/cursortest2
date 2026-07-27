package D;

/* renamed from: D.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0011l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ T0.a f226a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ E0.n f227b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ E0.p f228c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S f229d;

    public C0011l(T0.a aVar, E0.n nVar, E0.p pVar, S s2) {
        this.f226a = aVar;
        this.f227b = nVar;
        this.f228c = pVar;
        this.f229d = s2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:46:0x00d9, B:47:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:46:0x00d9, B:47:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [T0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0007h c0007h, x0.b bVar) {
        C0010k c0010k;
        int i2;
        S s2;
        T0.d dVar;
        E0.n nVar;
        E0.p pVar;
        D0.p pVar2;
        T0.a aVar;
        T0.a aVar2;
        S s3;
        Object obj;
        E0.p pVar3;
        try {
            if (bVar instanceof C0010k) {
                c0010k = (C0010k) bVar;
                int i3 = c0010k.f225o;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c0010k.f225o = i3 - Integer.MIN_VALUE;
                    Object obj2 = c0010k.f223m;
                    w0.a aVar3 = w0.a.f3076e;
                    i2 = c0010k.f225o;
                    if (i2 != 0) {
                        o.g.z(obj2);
                        c0010k.f218h = c0007h;
                        T0.a aVar4 = this.f226a;
                        c0010k.f219i = aVar4;
                        E0.n nVar2 = this.f227b;
                        c0010k.f220j = nVar2;
                        E0.p pVar4 = this.f228c;
                        c0010k.f221k = pVar4;
                        s2 = this.f229d;
                        c0010k.f222l = s2;
                        c0010k.f225o = 1;
                        dVar = (T0.d) aVar4;
                        if (dVar.c(c0010k) == aVar3) {
                            return aVar3;
                        }
                        nVar = nVar2;
                        pVar = pVar4;
                        pVar2 = c0007h;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj = c0010k.f220j;
                                pVar3 = (E0.p) c0010k.f219i;
                                aVar = (T0.a) c0010k.f218h;
                                try {
                                    o.g.z(obj2);
                                    pVar3.f313e = obj;
                                    pVar = pVar3;
                                    Object obj3 = pVar.f313e;
                                    ((T0.d) aVar).e(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    ((T0.d) aVar).e(null);
                                    throw th;
                                }
                            }
                            s3 = (S) c0010k.f220j;
                            pVar = (E0.p) c0010k.f219i;
                            aVar2 = (T0.a) c0010k.f218h;
                            try {
                                o.g.z(obj2);
                                if (!E0.i.a(obj2, pVar.f313e)) {
                                    aVar = aVar2;
                                    Object obj32 = pVar.f313e;
                                    ((T0.d) aVar).e(null);
                                    return obj32;
                                }
                                c0010k.f218h = aVar2;
                                c0010k.f219i = pVar;
                                c0010k.f220j = obj2;
                                c0010k.f225o = 3;
                                if (s3.i(obj2, false, c0010k) == aVar3) {
                                    return aVar3;
                                }
                                obj = obj2;
                                pVar3 = pVar;
                                aVar = aVar2;
                                pVar3.f313e = obj;
                                pVar = pVar3;
                                Object obj322 = pVar.f313e;
                                ((T0.d) aVar).e(null);
                                return obj322;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar = aVar2;
                                ((T0.d) aVar).e(null);
                                throw th;
                            }
                        }
                        S s4 = c0010k.f222l;
                        pVar = c0010k.f221k;
                        nVar = (E0.n) c0010k.f220j;
                        ?? r7 = (T0.a) c0010k.f219i;
                        D0.p pVar5 = (D0.p) c0010k.f218h;
                        o.g.z(obj2);
                        dVar = r7;
                        s2 = s4;
                        pVar2 = pVar5;
                    }
                    if (!nVar.f311e) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = pVar.f313e;
                    c0010k.f218h = dVar;
                    c0010k.f219i = pVar;
                    c0010k.f220j = s2;
                    c0010k.f221k = null;
                    c0010k.f222l = null;
                    c0010k.f225o = 2;
                    Object f2 = pVar2.f(obj4, c0010k);
                    if (f2 == aVar3) {
                        return aVar3;
                    }
                    aVar2 = dVar;
                    obj2 = f2;
                    s3 = s2;
                    if (!E0.i.a(obj2, pVar.f313e)) {
                    }
                }
            }
            if (!nVar.f311e) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = dVar;
            ((T0.d) aVar).e(null);
            throw th;
        }
        c0010k = new C0010k(this, bVar);
        Object obj22 = c0010k.f223m;
        w0.a aVar32 = w0.a.f3076e;
        i2 = c0010k.f225o;
        if (i2 != 0) {
        }
    }
}
