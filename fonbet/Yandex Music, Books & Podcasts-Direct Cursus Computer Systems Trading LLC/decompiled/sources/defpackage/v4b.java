package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class v4b implements dib {
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.pjc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(rjc rjcVar, Continuation continuation) {
        u4b u4bVar;
        int i;
        if (continuation instanceof u4b) {
            u4bVar = (u4b) continuation;
            int i2 = u4bVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u4bVar.l = i2 - Integer.MIN_VALUE;
                Object obj = u4bVar.j;
                nm6 nm6Var = nm6.a;
                i = u4bVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    u4bVar.l = 1;
                    if (new cno(qxe.b(u4bVar)).a() == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                rj7.f();
                return null;
            }
        }
        u4bVar = new u4b(this, continuation);
        Object obj2 = u4bVar.j;
        nm6 nm6Var2 = nm6.a;
        i = u4bVar.l;
        if (i != 0) {
        }
        rj7.f();
        return null;
    }
}
