package defpackage;

import androidx.camera.core.ImageCaptureException;
import androidx.camera.core.internal.compat.quirk.ImageCaptureRotationOptionQuirk;
import androidx.camera.core.internal.utils.a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class z7x0 implements z9s {
    public final i4u b;
    public ycv c;
    public n9j0 w;
    public final ArrayList x;
    public final ArrayDeque a = new ArrayDeque();
    public boolean y = false;

    public z7x0(i4u i4uVar) {
        tob1.b();
        this.b = i4uVar;
        this.x = new ArrayList();
    }

    @Override // defpackage.z9s
    public final void a(aas aasVar) {
        geb1.f().execute(new x7x0(this, 0));
    }

    public final void b() {
        tob1.b();
        int i = 3;
        ImageCaptureException imageCaptureException = new ImageCaptureException(3, "Camera is closed.", null);
        ArrayDeque arrayDeque = this.a;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            b8x0 b8x0Var = (b8x0) it.next();
            b8x0Var.a().execute(new y7x0(i, b8x0Var, imageCaptureException));
        }
        arrayDeque.clear();
        Iterator it2 = new ArrayList(this.x).iterator();
        while (it2.hasNext()) {
            n9j0 n9j0Var = (n9j0) it2.next();
            n9j0Var.getClass();
            tob1.b();
            if (!n9j0Var.d.b.isDone()) {
                tob1.b();
                n9j0Var.g = true;
                o89 o89Var = n9j0Var.i;
                Objects.requireNonNull(o89Var);
                o89Var.cancel(true);
                n9j0Var.e.d(imageCaptureException);
                n9j0Var.f.b(null);
                tob1.b();
                b8x0 b8x0Var2 = n9j0Var.a;
                b8x0Var2.a().execute(new y7x0(i, b8x0Var2, imageCaptureException));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        b8x0 b8x0Var;
        p38 p38Var;
        uo7 uo7Var;
        iiv iivVar;
        tob1.b();
        if (this.w == null && !this.y) {
            ycv ycvVar = this.c;
            ycvVar.getClass();
            tob1.b();
            if (ycvVar.c.x() == 0 || (b8x0Var = (b8x0) this.a.poll()) == null) {
                return;
            }
            n9j0 n9j0Var = new n9j0(b8x0Var, this);
            int i = 0;
            int i2 = 1;
            d6z.y(null, !(this.w != null));
            this.w = n9j0Var;
            tob1.b();
            n9j0Var.c.b.c(new x7x0(this, i2), geb1.b());
            this.x.add(n9j0Var);
            tob1.b();
            n9j0Var.d.b.c(new y7x0(i, this, n9j0Var), geb1.b());
            ycv ycvVar2 = this.c;
            tob1.b();
            gl7 gl7Var = n9j0Var.c;
            ycvVar2.getClass();
            tob1.b();
            p38 p38Var2 = (p38) ycvVar2.a.g(x8v.w, new p38(Arrays.asList(new g48())));
            Objects.requireNonNull(p38Var2);
            int i3 = ycv.f;
            ycv.f = i3 + 1;
            w34 w34Var = ycvVar2.e;
            ArrayList arrayList = new ArrayList();
            String valueOf = String.valueOf(p38Var2.hashCode());
            List<g48> list = p38Var2.a;
            Objects.requireNonNull(list);
            for (g48 g48Var : list) {
                r38 r38Var = new r38();
                s38 s38Var = ycvVar2.b;
                int i4 = i;
                r38Var.c = s38Var.c;
                r38Var.c(s38Var.b);
                r38Var.a(b8x0Var.k());
                iiv iivVar2 = w34Var.c;
                int i5 = w34Var.g;
                ArrayList arrayList2 = w34Var.h;
                Objects.requireNonNull(iivVar2);
                r38Var.d(iivVar2);
                ycv ycvVar3 = ycvVar2;
                if (arrayList2.size() > 1 && (iivVar = w34Var.d) != null) {
                    r38Var.d(iivVar);
                }
                iiv iivVar3 = w34Var.e;
                boolean z = iivVar3 != null ? 1 : i4;
                if (z != 0) {
                    Objects.requireNonNull(iivVar3);
                    r38Var.d(iivVar3);
                }
                r38Var.d = z;
                if (a.c(i5) || i5 == 32) {
                    ycv.g.getClass();
                    if (((ImageCaptureRotationOptionQuirk) tbj.a.b(ImageCaptureRotationOptionQuirk.class)) != null) {
                        x34 x34Var = s38.i;
                    } else {
                        r38Var.b.w(s38.i, Integer.valueOf(b8x0Var.h()));
                    }
                    p38Var = p38Var2;
                    r38Var.b.w(s38.j, Integer.valueOf(((b8x0Var.f() != null ? 1 : i4) == 0 || !lw01.c(b8x0Var.c(), w34Var.f)) ? b8x0Var.e() : b8x0Var.b() == 0 ? 100 : 95));
                } else {
                    p38Var = p38Var2;
                }
                r38Var.c(g48Var.a.b);
                r38Var.g.a.put(valueOf, Integer.valueOf(i4));
                r38Var.g.a.put("CAPTURE_CONFIG_ID_KEY", Integer.valueOf(i3));
                r38Var.b(w34Var.a);
                if (arrayList2.size() > 1 && (uo7Var = w34Var.b) != null) {
                    r38Var.b(uo7Var);
                }
                arrayList.add(r38Var.e());
                i2 = 1;
                i = i4;
                ycvVar2 = ycvVar3;
                p38Var2 = p38Var;
            }
            boolean z2 = i;
            boolean z3 = i2;
            md6 md6Var = new md6(12, arrayList, n9j0Var);
            m6f0 m6f0Var = new m6f0(p38Var2, b8x0Var, n9j0Var, gl7Var, i3);
            ycv ycvVar4 = this.c;
            ycvVar4.getClass();
            tob1.b();
            ycvVar4.e.k.accept(m6f0Var);
            tob1.b();
            w8v w8vVar = (w8v) this.b.a;
            synchronized (w8vVar.r) {
                try {
                    if (w8vVar.r.get() == null) {
                        w8vVar.r.set(Integer.valueOf(w8vVar.J()));
                    }
                } finally {
                }
            }
            w8v w8vVar2 = (w8v) this.b.a;
            tob1.b();
            o89 n = ni91.n(w8vVar2.f().g(w8vVar2.q, w8vVar2.s, arrayList), new gym(new qir(16)), geb1.b());
            ni91.a(n, new hhs0(this, md6Var, z2, 21), geb1.f());
            tob1.b();
            if (n9j0Var.i != null) {
                z3 = z2 ? 1 : 0;
            }
            d6z.y("CaptureRequestFuture can only be set once.", z3);
            n9j0Var.i = n;
        }
    }
}
