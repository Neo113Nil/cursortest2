package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class bij extends AtomicReference implements wjj {
    private static final long serialVersionUID = -4823716997131257941L;
    public final cij a;
    public final int b;

    public bij(cij cijVar, int i) {
        this.a = cijVar;
        this.b = i;
    }

    @Override // defpackage.wjj
    public final void b(ka8 ka8Var) {
        ra8.g(this, ka8Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001d, code lost:
    
        if (r4 == r2.length) goto L17;
     */
    @Override // defpackage.wjj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onComplete() {
        cij cijVar = this.a;
        int i = this.b;
        synchronized (cijVar) {
            try {
                Object[] objArr = cijVar.d;
                if (objArr == null) {
                    return;
                }
                boolean z = objArr[i] == null;
                if (!z) {
                    int i2 = cijVar.j + 1;
                    cijVar.j = i2;
                }
                cijVar.g = true;
                if (z) {
                    cijVar.b();
                }
                cijVar.e();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.wjj
    public final void onError(Throwable th) {
        cij cijVar = this.a;
        if (!cijVar.h.a(th)) {
            y5g.g0(th);
        } else {
            cijVar.b();
            cijVar.e();
        }
    }

    @Override // defpackage.wjj
    public final void onNext(Object obj) {
        boolean z;
        cij cijVar = this.a;
        int i = this.b;
        synchronized (cijVar) {
            try {
                Object[] objArr = cijVar.d;
                if (objArr == null) {
                    return;
                }
                Object obj2 = objArr[i];
                int i2 = cijVar.i;
                if (obj2 == null) {
                    i2++;
                    cijVar.i = i2;
                }
                objArr[i] = obj;
                if (i2 == objArr.length) {
                    cijVar.e.offer(objArr.clone());
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    cijVar.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
