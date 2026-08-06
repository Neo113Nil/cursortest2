package D1;

import h1.C0239i;
import m1.EnumC0985a;
import n1.AbstractC0991b;

/* loaded from: classes.dex */
public final class c extends E1.f {

    /* renamed from: d, reason: collision with root package name */
    public final Z.i f243d;

    /* renamed from: e, reason: collision with root package name */
    public final Z.i f244e;

    public c(Z.i iVar, l1.i iVar2, int i2, int i3) {
        super(iVar2, i2, i3);
        this.f243d = iVar;
        this.f244e = iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // E1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(C1.r rVar, l1.d dVar) {
        b bVar;
        int i2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i3 = bVar.f242g;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bVar.f242g = i3 - Integer.MIN_VALUE;
                Object obj = bVar.f240e;
                EnumC0985a enumC0985a = EnumC0985a.f8194a;
                i2 = bVar.f242g;
                C0239i c0239i = C0239i.f3393a;
                if (i2 != 0) {
                    R1.l.F(obj);
                    bVar.f239d = rVar;
                    bVar.f242g = 1;
                    Object invoke = this.f243d.invoke(rVar, bVar);
                    if (invoke != enumC0985a) {
                        invoke = c0239i;
                    }
                    if (invoke == enumC0985a) {
                        return enumC0985a;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    rVar = bVar.f239d;
                    R1.l.F(obj);
                }
                if (((C1.q) rVar).f195d.s()) {
                    throw new IllegalStateException("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
                }
                return c0239i;
            }
        }
        bVar = new b(this, (AbstractC0991b) dVar);
        Object obj2 = bVar.f240e;
        EnumC0985a enumC0985a2 = EnumC0985a.f8194a;
        i2 = bVar.f242g;
        C0239i c0239i2 = C0239i.f3393a;
        if (i2 != 0) {
        }
        if (((C1.q) rVar).f195d.s()) {
        }
    }

    @Override // E1.f
    public final E1.f b(l1.i iVar, int i2, int i3) {
        return new c(this.f244e, iVar, i2, i3);
    }

    @Override // E1.f
    public final String toString() {
        return "block[" + this.f243d + "] -> " + super.toString();
    }
}
