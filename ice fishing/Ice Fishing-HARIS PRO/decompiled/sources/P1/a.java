package P1;

import java.util.Arrays;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public c[] f911a;

    /* renamed from: b, reason: collision with root package name */
    public int f912b;

    /* renamed from: c, reason: collision with root package name */
    public int f913c;

    public final c b() {
        c cVar;
        synchronized (this) {
            try {
                c[] cVarArr = this.f911a;
                if (cVarArr == null) {
                    cVarArr = d();
                    this.f911a = cVarArr;
                } else if (this.f912b >= cVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(cVarArr, cVarArr.length * 2);
                    D1.i.d(copyOf, "copyOf(this, newSize)");
                    this.f911a = (c[]) copyOf;
                    cVarArr = (c[]) copyOf;
                }
                int i = this.f913c;
                do {
                    cVar = cVarArr[i];
                    if (cVar == null) {
                        cVar = c();
                        cVarArr[i] = cVar;
                    }
                    i++;
                    if (i >= cVarArr.length) {
                        i = 0;
                    }
                } while (!cVar.a(this));
                this.f913c = i;
                this.f912b++;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public abstract c c();

    public abstract c[] d();

    public final void e(c cVar) {
        int i;
        v1.d[] b2;
        synchronized (this) {
            try {
                int i2 = this.f912b - 1;
                this.f912b = i2;
                if (i2 == 0) {
                    this.f913c = 0;
                }
                D1.i.c(cVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b2 = cVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (v1.d dVar : b2) {
            if (dVar != null) {
                dVar.b(t1.i.f4388c);
            }
        }
    }
}
