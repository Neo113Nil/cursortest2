package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class wff0 {
    public final h3y c;
    public final zq60 a = new zq60();
    public final zq60 b = new zq60();
    public final AtomicBoolean d = new AtomicBoolean();

    public wff0(h3y h3yVar) {
        this.c = h3yVar;
    }

    public final void a(vff0 vff0Var) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.b.b(vff0Var);
        } else {
            this.a.b(vff0Var);
        }
    }

    public final void b() {
        AtomicBoolean atomicBoolean = this.d;
        if (atomicBoolean.get()) {
            return;
        }
        final int i = 1;
        atomicBoolean.set(true);
        final int i2 = 0;
        new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: tff0
            public final /* synthetic */ wff0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                boolean z2;
                int i3 = i2;
                wff0 wff0Var = this.b;
                switch (i3) {
                    case 0:
                        zq60 zq60Var = wff0Var.b;
                        zq60Var.getClass();
                        zq60Var.b++;
                        ArrayList arrayList = zq60Var.a;
                        int size = arrayList.size();
                        int i4 = 0;
                        boolean z3 = false;
                        while (true) {
                            int i5 = i4;
                            while (i5 < size && arrayList.get(i5) == null) {
                                i5++;
                            }
                            if (i5 < size) {
                                z = true;
                            } else {
                                if (!z3) {
                                    zq60.a(zq60Var);
                                    z3 = true;
                                }
                                z = false;
                            }
                            if (!z) {
                                zq60Var.clear();
                                break;
                            } else {
                                while (i4 < size && arrayList.get(i4) == null) {
                                    i4++;
                                }
                                if (i4 >= size) {
                                    if (!z3) {
                                        zq60.a(zq60Var);
                                    }
                                    ny61.p();
                                    break;
                                } else {
                                    ((vff0) arrayList.get(i4)).b();
                                    i4++;
                                }
                            }
                        }
                    default:
                        zq60 zq60Var2 = wff0Var.a;
                        zq60Var2.getClass();
                        zq60Var2.b++;
                        ArrayList arrayList2 = zq60Var2.a;
                        int size2 = arrayList2.size();
                        int i6 = 0;
                        boolean z4 = false;
                        while (true) {
                            int i7 = i6;
                            while (i7 < size2 && arrayList2.get(i7) == null) {
                                i7++;
                            }
                            if (i7 < size2) {
                                z2 = true;
                            } else {
                                if (!z4) {
                                    zq60.a(zq60Var2);
                                    z4 = true;
                                }
                                z2 = false;
                            }
                            if (!z2) {
                                zq60Var2.clear();
                                break;
                            } else {
                                while (i6 < size2 && arrayList2.get(i6) == null) {
                                    i6++;
                                }
                                if (i6 >= size2) {
                                    if (!z4) {
                                        zq60.a(zq60Var2);
                                    }
                                    ny61.p();
                                    break;
                                } else {
                                    ((vff0) arrayList2.get(i6)).b();
                                    i6++;
                                }
                            }
                        }
                }
            }
        });
        new Handler((Looper) this.c.get()).post(new Runnable(this) { // from class: tff0
            public final /* synthetic */ wff0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean z;
                boolean z2;
                int i3 = i;
                wff0 wff0Var = this.b;
                switch (i3) {
                    case 0:
                        zq60 zq60Var = wff0Var.b;
                        zq60Var.getClass();
                        zq60Var.b++;
                        ArrayList arrayList = zq60Var.a;
                        int size = arrayList.size();
                        int i4 = 0;
                        boolean z3 = false;
                        while (true) {
                            int i5 = i4;
                            while (i5 < size && arrayList.get(i5) == null) {
                                i5++;
                            }
                            if (i5 < size) {
                                z = true;
                            } else {
                                if (!z3) {
                                    zq60.a(zq60Var);
                                    z3 = true;
                                }
                                z = false;
                            }
                            if (!z) {
                                zq60Var.clear();
                                break;
                            } else {
                                while (i4 < size && arrayList.get(i4) == null) {
                                    i4++;
                                }
                                if (i4 >= size) {
                                    if (!z3) {
                                        zq60.a(zq60Var);
                                    }
                                    ny61.p();
                                    break;
                                } else {
                                    ((vff0) arrayList.get(i4)).b();
                                    i4++;
                                }
                            }
                        }
                    default:
                        zq60 zq60Var2 = wff0Var.a;
                        zq60Var2.getClass();
                        zq60Var2.b++;
                        ArrayList arrayList2 = zq60Var2.a;
                        int size2 = arrayList2.size();
                        int i6 = 0;
                        boolean z4 = false;
                        while (true) {
                            int i7 = i6;
                            while (i7 < size2 && arrayList2.get(i7) == null) {
                                i7++;
                            }
                            if (i7 < size2) {
                                z2 = true;
                            } else {
                                if (!z4) {
                                    zq60.a(zq60Var2);
                                    z4 = true;
                                }
                                z2 = false;
                            }
                            if (!z2) {
                                zq60Var2.clear();
                                break;
                            } else {
                                while (i6 < size2 && arrayList2.get(i6) == null) {
                                    i6++;
                                }
                                if (i6 >= size2) {
                                    if (!z4) {
                                        zq60.a(zq60Var2);
                                    }
                                    ny61.p();
                                    break;
                                } else {
                                    ((vff0) arrayList2.get(i6)).b();
                                    i6++;
                                }
                            }
                        }
                }
            }
        });
    }

    public final void c(final vff0 vff0Var) {
        final int i = 0;
        new Handler(Looper.getMainLooper()).post(new Runnable(this) { // from class: uff0
            public final /* synthetic */ wff0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                vff0 vff0Var2 = vff0Var;
                wff0 wff0Var = this.b;
                switch (i2) {
                    case 0:
                        wff0Var.b.d(vff0Var2);
                        break;
                    default:
                        wff0Var.a.d(vff0Var2);
                        break;
                }
            }
        });
        final int i2 = 1;
        new Handler((Looper) this.c.get()).post(new Runnable(this) { // from class: uff0
            public final /* synthetic */ wff0 b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                vff0 vff0Var2 = vff0Var;
                wff0 wff0Var = this.b;
                switch (i22) {
                    case 0:
                        wff0Var.b.d(vff0Var2);
                        break;
                    default:
                        wff0Var.a.d(vff0Var2);
                        break;
                }
            }
        });
    }
}
