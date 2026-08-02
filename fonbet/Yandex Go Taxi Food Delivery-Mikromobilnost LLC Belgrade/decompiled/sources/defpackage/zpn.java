package defpackage;

import androidx.compose.runtime.d;
import androidx.compose.runtime.l;
import java.util.Arrays;
import kotlinx.coroutines.a;

/* loaded from: classes.dex */
public abstract class zpn {
    public static final j1k a = new j1k();

    public static final void a(Object obj, tls tlsVar, fid fidVar) {
        bts btsVar = (bts) fidVar;
        boolean k = btsVar.k(obj);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            Q = new h1k(tlsVar);
            btsVar.o0(Q);
        }
    }

    public static final void b(Object obj, Object obj2, tls tlsVar, fid fidVar) {
        bts btsVar = (bts) fidVar;
        boolean k = btsVar.k(obj) | btsVar.k(obj2);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            Q = new h1k(tlsVar);
            btsVar.o0(Q);
        }
    }

    public static final void c(Object obj, Object obj2, Object obj3, tls tlsVar, fid fidVar) {
        bts btsVar = (bts) fidVar;
        boolean k = btsVar.k(obj) | btsVar.k(obj2) | btsVar.k(obj3);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            Q = new h1k(tlsVar);
            btsVar.o0(Q);
        }
    }

    public static final void d(Object[] objArr, tls tlsVar, fid fidVar) {
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= ((bts) fidVar).k(obj);
        }
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (z || Q == did.a) {
            btsVar.o0(new h1k(tlsVar));
        }
    }

    public static final void e(fid fidVar, wls wlsVar, Object obj) {
        fse fseVar = ((bts) fidVar).R;
        bts btsVar = (bts) fidVar;
        boolean k = btsVar.k(obj);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            Q = new d(fseVar, wlsVar);
            btsVar.o0(Q);
        }
    }

    public static final void f(Object obj, Object obj2, wls wlsVar, fid fidVar) {
        fse fseVar = ((bts) fidVar).R;
        bts btsVar = (bts) fidVar;
        boolean k = btsVar.k(obj) | btsVar.k(obj2);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            Q = new d(fseVar, wlsVar);
            btsVar.o0(Q);
        }
    }

    public static final void g(Object obj, Object obj2, Object obj3, wls wlsVar, fid fidVar) {
        fse fseVar = ((bts) fidVar).R;
        bts btsVar = (bts) fidVar;
        boolean k = btsVar.k(obj) | btsVar.k(obj2) | btsVar.k(obj3);
        Object Q = btsVar.Q();
        if (k || Q == did.a) {
            Q = new d(fseVar, wlsVar);
            btsVar.o0(Q);
        }
    }

    public static final void h(Object[] objArr, wls wlsVar, fid fidVar) {
        fse fseVar = ((bts) fidVar).R;
        boolean z = false;
        for (Object obj : Arrays.copyOf(objArr, objArr.length)) {
            z |= ((bts) fidVar).k(obj);
        }
        bts btsVar = (bts) fidVar;
        Object Q = btsVar.Q();
        if (z || Q == did.a) {
            btsVar.o0(new d(fseVar, wlsVar));
        }
    }

    public static final void i(sls slsVar, fid fidVar) {
        wc70 wc70Var = ((bts) fidVar).M.b.a;
        wc70Var.d(ub70.c);
        rzo.U(wc70Var, 0, slsVar);
    }

    public static final tse j(fse fseVar, fid fidVar) {
        if (fseVar.get(seu.C) == null) {
            return new l(((bts) fidVar).R, fseVar);
        }
        s8x a2 = a.a();
        a2.T(new tzc(new IllegalArgumentException("CoroutineContext supplied to rememberCoroutineScope may not include a parent job"), false));
        return bvf0.a(a2);
    }
}
