package defpackage;

import androidx.compose.ui.platform.j;

/* loaded from: classes10.dex */
public abstract class tuz0 {
    public static final float a;

    static {
        cl91.o(16.0f, 8.0f);
        a = 200.0f;
    }

    public static lvz0 a(fid fidVar) {
        l690 l690Var = avz0.a;
        bts btsVar = (bts) fidVar;
        int f0 = ((fwi) btsVar.m(j.h)).f0(4.0f);
        long a2 = ((k651) btsVar.m(j.u)).a();
        boolean c = btsVar.c(f0) | btsVar.d(a2);
        Object Q = btsVar.Q();
        if (c || Q == did.a) {
            Q = new lvz0(f0, a2);
            btsVar.o0(Q);
        }
        return (lvz0) Q;
    }
}
