package X;

import a8.InterfaceC0451a;

/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0451a f3715a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f3716b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.r f3717c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D f3718d;

    public v(InterfaceC0451a interfaceC0451a, kotlin.jvm.internal.p pVar, kotlin.jvm.internal.r rVar, D d9) {
        this.f3715a = interfaceC0451a;
        this.f3716b = pVar;
        this.f3717c = rVar;
        this.f3718d = d9;
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
    public final Object a(C0416e c0416e, B7.c cVar) {
        u uVar;
        int i;
        D d9;
        a8.d dVar;
        kotlin.jvm.internal.p pVar;
        kotlin.jvm.internal.r rVar;
        I7.p pVar2;
        InterfaceC0451a interfaceC0451a;
        InterfaceC0451a interfaceC0451a2;
        D d10;
        Object obj;
        kotlin.jvm.internal.r rVar2;
        try {
            if (cVar instanceof u) {
                uVar = (u) cVar;
                int i4 = uVar.f3707A;
                if ((i4 & Integer.MIN_VALUE) != 0) {
                    uVar.f3707A = i4 - Integer.MIN_VALUE;
                    Object obj2 = uVar.f3713y;
                    A7.a aVar = A7.a.f215n;
                    i = uVar.f3707A;
                    if (i != 0) {
                        Q3.b.s(obj2);
                        uVar.f3708n = c0416e;
                        InterfaceC0451a interfaceC0451a3 = this.f3715a;
                        uVar.f3709u = interfaceC0451a3;
                        kotlin.jvm.internal.p pVar3 = this.f3716b;
                        uVar.f3710v = pVar3;
                        kotlin.jvm.internal.r rVar3 = this.f3717c;
                        uVar.f3711w = rVar3;
                        d9 = this.f3718d;
                        uVar.f3712x = d9;
                        uVar.f3707A = 1;
                        dVar = (a8.d) interfaceC0451a3;
                        if (dVar.c(uVar) != aVar) {
                            pVar = pVar3;
                            rVar = rVar3;
                            pVar2 = c0416e;
                        }
                        return aVar;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            obj = uVar.f3710v;
                            rVar2 = (kotlin.jvm.internal.r) uVar.f3709u;
                            interfaceC0451a = (InterfaceC0451a) uVar.f3708n;
                            try {
                                Q3.b.s(obj2);
                                rVar2.f38644n = obj;
                                rVar = rVar2;
                                Object obj3 = rVar.f38644n;
                                ((a8.d) interfaceC0451a).d(null);
                                return obj3;
                            } catch (Throwable th) {
                                th = th;
                                ((a8.d) interfaceC0451a).d(null);
                                throw th;
                            }
                        }
                        d10 = (D) uVar.f3710v;
                        rVar = (kotlin.jvm.internal.r) uVar.f3709u;
                        interfaceC0451a2 = (InterfaceC0451a) uVar.f3708n;
                        try {
                            Q3.b.s(obj2);
                            if (!kotlin.jvm.internal.h.a(obj2, rVar.f38644n)) {
                                interfaceC0451a = interfaceC0451a2;
                                Object obj32 = rVar.f38644n;
                                ((a8.d) interfaceC0451a).d(null);
                                return obj32;
                            }
                            uVar.f3708n = interfaceC0451a2;
                            uVar.f3709u = rVar;
                            uVar.f3710v = obj2;
                            uVar.f3707A = 3;
                            if (d10.j(obj2, uVar) != aVar) {
                                obj = obj2;
                                rVar2 = rVar;
                                interfaceC0451a = interfaceC0451a2;
                                rVar2.f38644n = obj;
                                rVar = rVar2;
                                Object obj322 = rVar.f38644n;
                                ((a8.d) interfaceC0451a).d(null);
                                return obj322;
                            }
                            return aVar;
                        } catch (Throwable th2) {
                            th = th2;
                            interfaceC0451a = interfaceC0451a2;
                            ((a8.d) interfaceC0451a).d(null);
                            throw th;
                        }
                    }
                    D d11 = uVar.f3712x;
                    rVar = uVar.f3711w;
                    pVar = (kotlin.jvm.internal.p) uVar.f3710v;
                    ?? r72 = (InterfaceC0451a) uVar.f3709u;
                    I7.p pVar4 = (I7.p) uVar.f3708n;
                    Q3.b.s(obj2);
                    d9 = d11;
                    pVar2 = pVar4;
                    dVar = r72;
                    if (!pVar.f38642n) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = rVar.f38644n;
                    uVar.f3708n = dVar;
                    uVar.f3709u = rVar;
                    uVar.f3710v = d9;
                    uVar.f3711w = null;
                    uVar.f3712x = null;
                    uVar.f3707A = 2;
                    Object invoke = pVar2.invoke(obj4, uVar);
                    if (invoke != aVar) {
                        interfaceC0451a2 = dVar;
                        obj2 = invoke;
                        d10 = d9;
                        if (!kotlin.jvm.internal.h.a(obj2, rVar.f38644n)) {
                        }
                    }
                    return aVar;
                }
            }
            if (!pVar.f38642n) {
            }
        } catch (Throwable th3) {
            th = th3;
            interfaceC0451a = dVar;
            ((a8.d) interfaceC0451a).d(null);
            throw th;
        }
        uVar = new u(this, cVar);
        Object obj22 = uVar.f3713y;
        A7.a aVar2 = A7.a.f215n;
        i = uVar.f3707A;
        if (i != 0) {
        }
    }
}
