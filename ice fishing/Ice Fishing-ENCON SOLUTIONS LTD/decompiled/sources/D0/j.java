package D0;

import J1.h;
import androidx.lifecycle.j;
import com.google.android.gms.tasks.Task;
import java.util.ArrayDeque;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final Object f224a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f225b;

    /* renamed from: c, reason: collision with root package name */
    public Object f226c;

    public j() {
        this.f224a = new Object();
    }

    public void a(double d2, double d3) {
        boolean z2 = this.f225b;
        double[] dArr = (double[]) this.f224a;
        double d4 = 1.0d;
        if (!z2) {
            d4 = 1.0d / (((dArr[7] * d3) + (dArr[3] * d2)) + dArr[15]);
        }
        double d5 = ((dArr[4] * d3) + (dArr[0] * d2) + dArr[12]) * d4;
        double d6 = ((dArr[5] * d3) + (dArr[1] * d2) + dArr[13]) * d4;
        double[] dArr2 = (double[]) this.f226c;
        if (d5 < dArr2[0]) {
            dArr2[0] = d5;
        } else if (d5 > dArr2[1]) {
            dArr2[1] = d5;
        }
        if (d6 < dArr2[2]) {
            dArr2[2] = d6;
        } else if (d6 > dArr2[3]) {
            dArr2[3] = d6;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.j, java.lang.Object] */
    public void b() {
        ?? r02 = this.f224a;
        androidx.lifecycle.l b2 = r02.b();
        if (b2.f2476c != androidx.lifecycle.e.f2466b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        b2.a(new Q.a(0, r02));
        final J1.h hVar = (J1.h) this.f226c;
        hVar.getClass();
        if (hVar.f866a) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        b2.a(new androidx.lifecycle.i() { // from class: Q.b
            @Override // androidx.lifecycle.i
            public final void a(j jVar, androidx.lifecycle.d dVar) {
                h this$0 = h.this;
                i.e(this$0, "this$0");
            }
        });
        hVar.f866a = true;
        this.f225b = true;
    }

    public void c(i iVar) {
        synchronized (this.f224a) {
            try {
                if (((ArrayDeque) this.f226c) == null) {
                    this.f226c = new ArrayDeque();
                }
                ((ArrayDeque) this.f226c).add(iVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d(Task task) {
        i iVar;
        synchronized (this.f224a) {
            if (((ArrayDeque) this.f226c) != null && !this.f225b) {
                this.f225b = true;
                while (true) {
                    synchronized (this.f224a) {
                        try {
                            iVar = (i) ((ArrayDeque) this.f226c).poll();
                            if (iVar == null) {
                                this.f225b = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    iVar.a(task);
                }
            }
        }
    }

    public j(Q.d dVar) {
        this.f224a = dVar;
        this.f226c = new J1.h(1);
    }

    public j(boolean z2, double[] dArr, double[] dArr2) {
        this.f225b = z2;
        this.f224a = dArr;
        this.f226c = dArr2;
    }
}
