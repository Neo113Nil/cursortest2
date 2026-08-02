package defpackage;

import android.os.Handler;
import android.util.SparseIntArray;
import androidx.media3.exoplayer.trackselection.a;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class b9w {
    public static final /* synthetic */ int n = 0;
    public final xzi a;
    public final wvh b;
    public final ct7 c;
    public final SparseIntArray d;
    public final Handler e;
    public final ris f;
    public boolean g;
    public rnm h;
    public a9w i;
    public yvs[] j;
    public qah[] k;
    public List[][] l;
    public List[][] m;

    static {
        a aVar = a.y0;
        aVar.getClass();
        us7 us7Var = new us7(aVar);
        us7Var.C = true;
        us7Var.J = false;
        new a(us7Var);
    }

    public b9w(onh onhVar, wvh wvhVar, xzi xziVar, ct7 ct7Var, yk2 yk2Var) {
        onhVar.b.getClass();
        this.b = wvhVar;
        this.c = ct7Var;
        this.a = xziVar;
        this.d = new SparseIntArray();
        ct7Var.a = new tiu(6);
        ct7Var.b = yk2Var;
        this.e = dvt.q(null);
        this.f = new ris();
    }

    public static void a(b9w b9wVar) {
        ct7 ct7Var = b9wVar.c;
        b9wVar.i.getClass();
        b9wVar.i.i.getClass();
        b9wVar.i.h.getClass();
        int length = b9wVar.i.i.length;
        xzi xziVar = b9wVar.a;
        int length2 = ((at2[]) xziVar.a).length;
        b9wVar.l = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
        b9wVar.m = (List[][]) Array.newInstance((Class<?>) List.class, length, length2);
        for (int i = 0; i < length; i++) {
            for (int i2 = 0; i2 < length2; i2++) {
                b9wVar.l[i][i2] = new ArrayList();
                b9wVar.m[i][i2] = Collections.unmodifiableList(b9wVar.l[i][i2]);
            }
        }
        b9wVar.j = new yvs[length];
        b9wVar.k = new qah[length];
        for (int i3 = 0; i3 < length; i3++) {
            b9wVar.j[i3] = b9wVar.i.i[i3].m();
            SparseIntArray sparseIntArray = b9wVar.d;
            at2[] at2VarArr = (at2[]) xziVar.a;
            at2[] at2VarArr2 = new at2[at2VarArr.length];
            for (int i4 = 0; i4 < at2VarArr.length; i4++) {
                at2 at2Var = at2VarArr[i4];
                at2Var.getClass();
                at2VarArr2[i4] = at2Var;
            }
            c1t i5 = ct7Var.i(at2VarArr2, b9wVar.j[i3], new uvh(b9wVar.i.h.l(i3)), b9wVar.i.h);
            for (int i6 = 0; i6 < i5.b; i6++) {
                zsb zsbVar = ((zsb[]) i5.d)[i6];
                if (zsbVar != null) {
                    List list = b9wVar.l[i3][i6];
                    int i7 = 0;
                    while (true) {
                        if (i7 >= list.size()) {
                            list.add(zsbVar);
                            break;
                        }
                        zsb zsbVar2 = (zsb) list.get(i7);
                        if (zsbVar2.n().equals(zsbVar.n())) {
                            sparseIntArray.clear();
                            for (int i8 = 0; i8 < zsbVar2.length(); i8++) {
                                sparseIntArray.put(zsbVar2.f(i8), 0);
                            }
                            for (int i9 = 0; i9 < zsbVar.length(); i9++) {
                                sparseIntArray.put(zsbVar.f(i9), 0);
                            }
                            int[] iArr = new int[sparseIntArray.size()];
                            for (int i10 = 0; i10 < sparseIntArray.size(); i10++) {
                                iArr[i10] = sparseIntArray.keyAt(i10);
                            }
                            list.set(i7, new mgc(0, zsbVar2.n(), iArr));
                        } else {
                            i7++;
                        }
                    }
                }
            }
            qah qahVar = (qah) i5.f;
            ct7Var.c = qahVar;
            qah[] qahVarArr = b9wVar.k;
            qahVar.getClass();
            qahVarArr[i3] = qahVar;
        }
        b9wVar.g = true;
        Handler handler = b9wVar.e;
        handler.getClass();
        handler.post(new bhp(26, b9wVar));
    }

    public final Object b() {
        if (this.b == null) {
            return null;
        }
        vq1.A(this.g);
        if (this.i.h.o() > 0) {
            return this.i.h.m(0, this.f, 0L).d;
        }
        return null;
    }

    public final void c() {
        xs7 xs7Var;
        a9w a9wVar = this.i;
        if (a9wVar != null && !a9wVar.j) {
            a9wVar.j = true;
            a9wVar.g.sendEmptyMessage(4);
        }
        ct7 ct7Var = this.c;
        ct7Var.getClass();
        if (dvt.a >= 32 && (xs7Var = ct7Var.h) != null) {
            xs7Var.d();
        }
        ct7Var.a = null;
        ct7Var.b = null;
        for (at2 at2Var : (at2[]) this.a.a) {
            vq1.A(at2Var.h == 0);
            at2Var.x();
        }
    }
}
