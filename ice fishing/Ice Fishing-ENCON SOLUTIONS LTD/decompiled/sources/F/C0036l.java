package F;

import m1.EnumC0985a;
import n1.AbstractC0991b;

/* renamed from: F.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0036l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ I1.a f517a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.n f518b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.p f519c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P f520d;

    public C0036l(I1.a aVar, kotlin.jvm.internal.n nVar, kotlin.jvm.internal.p pVar, P p2) {
        this.f517a = aVar;
        this.f518b = nVar;
        this.f519c = pVar;
        this.f520d = p2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b6 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:27:0x0050, B:28:0x00ae, B:30:0x00b6), top: B:26:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096 A[Catch: all -> 0x00d6, TRY_LEAVE, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:46:0x00d9, B:47:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9 A[Catch: all -> 0x00d6, TRY_ENTER, TryCatch #1 {all -> 0x00d6, blocks: (B:40:0x0092, B:42:0x0096, B:46:0x00d9, B:47:0x00e0), top: B:39:0x0092 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v2, types: [I1.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C0032h c0032h, AbstractC0991b abstractC0991b) {
        C0035k c0035k;
        int i2;
        P p2;
        I1.d dVar;
        kotlin.jvm.internal.n nVar;
        kotlin.jvm.internal.p pVar;
        t1.p pVar2;
        I1.a aVar;
        I1.a aVar2;
        P p3;
        Object obj;
        kotlin.jvm.internal.p pVar3;
        try {
            if (abstractC0991b instanceof C0035k) {
                c0035k = (C0035k) abstractC0991b;
                int i3 = c0035k.f515k;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    c0035k.f515k = i3 - Integer.MIN_VALUE;
                    Object obj2 = c0035k.f513i;
                    EnumC0985a enumC0985a = EnumC0985a.f8194a;
                    i2 = c0035k.f515k;
                    if (i2 != 0) {
                        R1.l.F(obj2);
                        c0035k.f508d = c0032h;
                        I1.a aVar3 = this.f517a;
                        c0035k.f509e = aVar3;
                        kotlin.jvm.internal.n nVar2 = this.f518b;
                        c0035k.f510f = nVar2;
                        kotlin.jvm.internal.p pVar4 = this.f519c;
                        c0035k.f511g = pVar4;
                        p2 = this.f520d;
                        c0035k.f512h = p2;
                        c0035k.f515k = 1;
                        dVar = (I1.d) aVar3;
                        if (dVar.c(c0035k) == enumC0985a) {
                            return enumC0985a;
                        }
                        nVar = nVar2;
                        pVar = pVar4;
                        pVar2 = c0032h;
                    } else {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                obj = c0035k.f510f;
                                pVar3 = (kotlin.jvm.internal.p) c0035k.f509e;
                                aVar = (I1.a) c0035k.f508d;
                                try {
                                    R1.l.F(obj2);
                                    pVar3.f8076a = obj;
                                    pVar = pVar3;
                                    Object obj3 = pVar.f8076a;
                                    ((I1.d) aVar).e(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    ((I1.d) aVar).e(null);
                                    throw th;
                                }
                            }
                            p3 = (P) c0035k.f510f;
                            pVar = (kotlin.jvm.internal.p) c0035k.f509e;
                            aVar2 = (I1.a) c0035k.f508d;
                            try {
                                R1.l.F(obj2);
                                if (!kotlin.jvm.internal.i.a(obj2, pVar.f8076a)) {
                                    aVar = aVar2;
                                    Object obj32 = pVar.f8076a;
                                    ((I1.d) aVar).e(null);
                                    return obj32;
                                }
                                c0035k.f508d = aVar2;
                                c0035k.f509e = pVar;
                                c0035k.f510f = obj2;
                                c0035k.f515k = 3;
                                if (p3.i(obj2, false, c0035k) == enumC0985a) {
                                    return enumC0985a;
                                }
                                obj = obj2;
                                pVar3 = pVar;
                                aVar = aVar2;
                                pVar3.f8076a = obj;
                                pVar = pVar3;
                                Object obj322 = pVar.f8076a;
                                ((I1.d) aVar).e(null);
                                return obj322;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar = aVar2;
                                ((I1.d) aVar).e(null);
                                throw th;
                            }
                        }
                        P p4 = c0035k.f512h;
                        pVar = c0035k.f511g;
                        nVar = (kotlin.jvm.internal.n) c0035k.f510f;
                        ?? r7 = (I1.a) c0035k.f509e;
                        t1.p pVar5 = (t1.p) c0035k.f508d;
                        R1.l.F(obj2);
                        dVar = r7;
                        p2 = p4;
                        pVar2 = pVar5;
                    }
                    if (!nVar.f8074a) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = pVar.f8076a;
                    c0035k.f508d = dVar;
                    c0035k.f509e = pVar;
                    c0035k.f510f = p2;
                    c0035k.f511g = null;
                    c0035k.f512h = null;
                    c0035k.f515k = 2;
                    Object invoke = pVar2.invoke(obj4, c0035k);
                    if (invoke == enumC0985a) {
                        return enumC0985a;
                    }
                    aVar2 = dVar;
                    obj2 = invoke;
                    p3 = p2;
                    if (!kotlin.jvm.internal.i.a(obj2, pVar.f8076a)) {
                    }
                }
            }
            if (!nVar.f8074a) {
            }
        } catch (Throwable th3) {
            th = th3;
            aVar = dVar;
            ((I1.d) aVar).e(null);
            throw th;
        }
        c0035k = new C0035k(this, abstractC0991b);
        Object obj22 = c0035k.f513i;
        EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
        i2 = c0035k.f515k;
        if (i2 != 0) {
        }
    }
}
