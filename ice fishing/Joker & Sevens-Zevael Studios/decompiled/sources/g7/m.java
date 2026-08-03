package g7;

import android.os.Parcel;
import java.util.ArrayDeque;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2548a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f2549b;

    /* renamed from: c, reason: collision with root package name */
    public Object f2550c;

    public m() {
        this.f2549b = new Object();
    }

    public void a(n6.a aVar, h hVar) {
        m7.g gVar = (m7.g) ((m7.g) this.f2550c).f4957h;
        gVar.getClass();
        r6.a aVar2 = (r6.a) ((r6.c) aVar).r();
        p6.k kVar = (p6.k) gVar.f4957h;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar2.f8791e);
        int i10 = y6.b.f8792a;
        if (kVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            kVar.writeToParcel(obtain, 0);
        }
        try {
            aVar2.f8790d.transact(1, obtain, null, 1);
            obtain.recycle();
            hVar.a(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public void b(l lVar) {
        synchronized (this.f2549b) {
            try {
                if (((ArrayDeque) this.f2550c) == null) {
                    this.f2550c = new ArrayDeque();
                }
                ((ArrayDeque) this.f2550c).add(lVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void c(o oVar) {
        l lVar;
        synchronized (this.f2549b) {
            if (((ArrayDeque) this.f2550c) != null && !this.f2548a) {
                this.f2548a = true;
                while (true) {
                    synchronized (this.f2549b) {
                        try {
                            lVar = (l) ((ArrayDeque) this.f2550c).poll();
                            if (lVar == null) {
                                this.f2548a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    lVar.a(oVar);
                }
            }
        }
    }

    public m(m7.g gVar, m6.d[] dVarArr, boolean z10) {
        this.f2550c = gVar;
        this.f2549b = dVarArr;
        boolean z11 = false;
        if (dVarArr != null && z10) {
            z11 = true;
        }
        this.f2548a = z11;
    }
}
