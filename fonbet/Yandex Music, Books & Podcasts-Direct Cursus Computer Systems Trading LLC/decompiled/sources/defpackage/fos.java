package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;

/* loaded from: classes4.dex */
public final class fos {
    public final xdr a;
    public final y4s b;
    public final AtomicReference c;
    public gm5 d;
    public final ReentrantLock e;

    public fos() {
        xdr a = ydr.a(aos.a);
        this.a = a;
        this.b = new y4s(zsd.b0(new b56(a, 3)), 4);
        this.c = new AtomicReference(null);
        this.d = hld.j();
        this.e = new ReentrantLock();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(cg6 cg6Var) {
        cos cosVar;
        int i;
        if (cg6Var instanceof cos) {
            cosVar = (cos) cg6Var;
            int i2 = cosVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cosVar.l = i2 - Integer.MIN_VALUE;
                Object obj = cosVar.j;
                nm6 nm6Var = nm6.a;
                i = cosVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    ReentrantLock reentrantLock = this.e;
                    reentrantLock.lock();
                    try {
                        gm5 gm5Var = this.d;
                        reentrantLock.unlock();
                        cosVar.l = 1;
                        if (gm5Var.s(cosVar) == nm6Var) {
                            return nm6Var;
                        }
                    } catch (Throwable th) {
                        reentrantLock.unlock();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return this.c.get();
            }
        }
        cosVar = new cos(this, cg6Var);
        Object obj2 = cosVar.j;
        nm6 nm6Var2 = nm6.a;
        i = cosVar.l;
        if (i != 0) {
        }
        return this.c.get();
    }

    public final void b(String str) {
        ReentrantLock reentrantLock = this.e;
        reentrantLock.lock();
        try {
            xdr xdrVar = this.a;
            bos bosVar = new bos(str != null ? new mns(str) : null);
            xdrVar.getClass();
            xdrVar.m(null, bosVar);
            this.c.set(str != null ? new mns(str) : null);
            this.d.U(Unit.a);
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
