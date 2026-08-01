package X;

import a8.InterfaceC0447a;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0447a f3553a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f3554b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.r f3555c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D f3556d;

    public v(InterfaceC0447a interfaceC0447a, kotlin.jvm.internal.p pVar, kotlin.jvm.internal.r rVar, D d2) {
        this.f3553a = interfaceC0447a;
        this.f3554b = pVar;
        this.f3555c = rVar;
        this.f3556d = d2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d5, TRY_LEAVE, TryCatch #1 {all -> 0x00d5, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d8, B:46:0x00df), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d8 A[Catch: all -> 0x00d5, TRY_ENTER, TryCatch #1 {all -> 0x00d5, blocks: (B:40:0x0092, B:42:0x0096, B:45:0x00d8, B:46:0x00df), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [a8.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0412e c0412e, B7.c cVar) {
        u uVar;
        int i;
        D d2;
        a8.d dVar;
        kotlin.jvm.internal.p pVar;
        kotlin.jvm.internal.r rVar;
        I7.p pVar2;
        InterfaceC0447a interfaceC0447a;
        InterfaceC0447a interfaceC0447a2;
        D d9;
        Object obj;
        kotlin.jvm.internal.r rVar2;
        try {
            if (cVar instanceof u) {
                uVar = (u) cVar;
                int i6 = uVar.f3545A;
                if ((i6 & Integer.MIN_VALUE) != 0) {
                    uVar.f3545A = i6 - Integer.MIN_VALUE;
                    Object obj2 = uVar.f3551y;
                    A7.a aVar = A7.a.f58n;
                    i = uVar.f3545A;
                    if (i != 0) {
                        com.bumptech.glide.d.k(obj2);
                        uVar.f3546n = c0412e;
                        InterfaceC0447a interfaceC0447a3 = this.f3553a;
                        uVar.f3547u = interfaceC0447a3;
                        kotlin.jvm.internal.p pVar3 = this.f3554b;
                        uVar.f3548v = pVar3;
                        kotlin.jvm.internal.r rVar3 = this.f3555c;
                        uVar.f3549w = rVar3;
                        d2 = this.f3556d;
                        uVar.f3550x = d2;
                        uVar.f3545A = 1;
                        dVar = (a8.d) interfaceC0447a3;
                        if (dVar.c(uVar) != aVar) {
                            pVar = pVar3;
                            rVar = rVar3;
                            pVar2 = c0412e;
                        }
                        return aVar;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = uVar.f3548v;
                            rVar2 = (kotlin.jvm.internal.r) uVar.f3547u;
                            interfaceC0447a = (InterfaceC0447a) uVar.f3546n;
                            try {
                                com.bumptech.glide.d.k(obj2);
                                rVar2.f38717n = obj;
                                rVar = rVar2;
                                Object obj3 = rVar.f38717n;
                                ((a8.d) interfaceC0447a).d(null);
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                ((a8.d) interfaceC0447a).d(null);
                                throw th;
                            }
                        }
                        d9 = (D) uVar.f3548v;
                        rVar = (kotlin.jvm.internal.r) uVar.f3547u;
                        interfaceC0447a2 = (InterfaceC0447a) uVar.f3546n;
                        try {
                            com.bumptech.glide.d.k(obj2);
                            if (!kotlin.jvm.internal.h.a(obj2, rVar.f38717n)) {
                                interfaceC0447a = interfaceC0447a2;
                                Object obj32 = rVar.f38717n;
                                ((a8.d) interfaceC0447a).d(null);
                                return obj32;
                            }
                            uVar.f3546n = interfaceC0447a2;
                            uVar.f3547u = rVar;
                            uVar.f3548v = obj2;
                            uVar.f3545A = 3;
                            if (d9.j(obj2, uVar) != aVar) {
                                obj = obj2;
                                rVar2 = rVar;
                                interfaceC0447a = interfaceC0447a2;
                                rVar2.f38717n = obj;
                                rVar = rVar2;
                                Object obj322 = rVar.f38717n;
                                ((a8.d) interfaceC0447a).d(null);
                                return obj322;
                            }
                            return aVar;
                        } catch (Throwable th2) {
                            th = th2;
                            interfaceC0447a = interfaceC0447a2;
                            ((a8.d) interfaceC0447a).d(null);
                            throw th;
                        }
                    }
                    D d10 = uVar.f3550x;
                    rVar = uVar.f3549w;
                    pVar = (kotlin.jvm.internal.p) uVar.f3548v;
                    ?? r72 = (InterfaceC0447a) uVar.f3547u;
                    I7.p pVar4 = (I7.p) uVar.f3546n;
                    com.bumptech.glide.d.k(obj2);
                    d2 = d10;
                    pVar2 = pVar4;
                    dVar = r72;
                    if (!pVar.f38715n) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = rVar.f38717n;
                    uVar.f3546n = dVar;
                    uVar.f3547u = rVar;
                    uVar.f3548v = d2;
                    uVar.f3549w = null;
                    uVar.f3550x = null;
                    uVar.f3545A = 2;
                    Object invoke = pVar2.invoke(obj4, uVar);
                    if (invoke != aVar) {
                        interfaceC0447a2 = dVar;
                        obj2 = invoke;
                        d9 = d2;
                        if (!kotlin.jvm.internal.h.a(obj2, rVar.f38717n)) {
                        }
                    }
                    return aVar;
                }
            }
            if (!pVar.f38715n) {
            }
        } catch (Throwable th3) {
            th = th3;
            interfaceC0447a = dVar;
            ((a8.d) interfaceC0447a).d(null);
            throw th;
        }
        uVar = new u(this, cVar);
        Object obj22 = uVar.f3551y;
        A7.a aVar2 = A7.a.f58n;
        i = uVar.f3545A;
        if (i != 0) {
        }
    }
}
