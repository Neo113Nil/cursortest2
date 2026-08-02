package defpackage;

import android.widget.AbsListView;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class aag implements AbsListView.OnScrollListener {
    public final b1o b;
    public final pv9 c;
    public final ni d;
    public int e;
    public int f;
    public int h;
    public int g = -1;
    public boolean i = true;
    public final qzc a = new qzc(6);

    public aag(b1o b1oVar, pv9 pv9Var, ni niVar) {
        this.b = b1oVar;
        this.c = pv9Var;
        this.d = niVar;
    }

    public final void a(int i, boolean z) {
        int min;
        int i2;
        if (this.i != z) {
            this.i = z;
            int i3 = 0;
            while (true) {
                qzc qzcVar = this.a;
                if (i3 >= ((ArrayDeque) qzcVar.b).size()) {
                    break;
                }
                ArrayDeque arrayDeque = (ArrayDeque) qzcVar.b;
                z9g z9gVar = (z9g) arrayDeque.poll();
                arrayDeque.offer(z9gVar);
                z9gVar.b = 0;
                z9gVar.a = 0;
                this.b.j(z9gVar);
                i3++;
            }
        }
        int i4 = (z ? 5 : -5) + i;
        if (i < i4) {
            i2 = Math.max(this.e, i);
            min = i4;
        } else {
            min = Math.min(this.f, i);
            i2 = i4;
        }
        int min2 = Math.min(this.h, min);
        int min3 = Math.min(this.h, Math.max(0, i2));
        pv9 pv9Var = this.c;
        if (i < i4) {
            for (int i5 = min3; i5 < min2; i5++) {
                b(pv9Var.v(i5), true);
            }
        } else {
            for (int i6 = min2 - 1; i6 >= min3; i6--) {
                b(pv9Var.v(i6), false);
            }
        }
        this.f = min3;
        this.e = min2;
    }

    public final void b(List list, boolean z) {
        int size = list.size();
        if (z) {
            for (int i = 0; i < size; i++) {
                c(list.get(i));
            }
            return;
        }
        for (int i2 = size - 1; i2 >= 0; i2--) {
            c(list.get(i2));
        }
    }

    public final void c(Object obj) {
        if (obj == null) {
            return;
        }
        int[] iArr = this.d.a;
        int[] copyOf = iArr == null ? null : Arrays.copyOf(iArr, iArr.length);
        if (copyOf == null) {
            return;
        }
        imh imhVar = (imh) obj;
        cr crVar = (cr) this.c.b;
        String str = imhVar.c;
        String str2 = imhVar.d;
        if (str == null) {
            str = cr.d(crVar, str2);
        }
        String str3 = imhVar.b;
        if (str3 == null) {
            str3 = cr.b(crVar, str2);
        }
        k0o N = crVar.N(str, str3);
        int i = copyOf[0];
        int i2 = copyOf[1];
        ArrayDeque arrayDeque = (ArrayDeque) this.a.b;
        z9g z9gVar = (z9g) arrayDeque.poll();
        arrayDeque.offer(z9gVar);
        z9gVar.b = i;
        z9gVar.a = i2;
        N.E(z9gVar, N);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        if (this.h == 0 && i3 == 0) {
            return;
        }
        this.h = i3;
        int i4 = this.g;
        if (i > i4) {
            a(i2 + i, true);
        } else if (i < i4) {
            a(i, false);
        }
        this.g = i;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
