package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class iur extends xci implements pfm, jx7, ofm {
    public Object o;
    public Object p;
    public Object[] q;
    public PointerInputEventHandler r;
    public rar s;
    public ffm t = eur.a;
    public final eqi u;
    public final eqi v;
    public final eqi w;
    public ffm x;
    public long y;

    public iur(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.o = obj;
        this.p = obj2;
        this.q = objArr;
        this.r = pointerInputEventHandler;
        eqi eqiVar = new eqi(new hur[16]);
        this.u = eqiVar;
        this.v = eqiVar;
        this.w = new eqi(new hur[16]);
        this.y = 0L;
    }

    @Override // defpackage.ofm
    public final void C0() {
        U0();
    }

    @Override // defpackage.xci
    public final void L0() {
        U0();
    }

    public final Object S0(Function2 function2, Continuation continuation) {
        zt3 zt3Var = new zt3(1, qxe.b(continuation));
        zt3Var.s();
        hur hurVar = new hur(this, zt3Var);
        synchronized (this.v) {
            this.u.d(hurVar);
            cno cnoVar = new cno(qxe.b(qxe.a(hurVar, hurVar, function2)), nm6.a);
            r7o r7oVar = z7o.b;
            cnoVar.resumeWith(Unit.a);
        }
        zt3Var.u(new hxo(16, hurVar));
        return zt3Var.q();
    }

    public final void T0(ffm ffmVar, gfm gfmVar) {
        zt3 zt3Var;
        zt3 zt3Var2;
        synchronized (this.v) {
            eqi eqiVar = this.w;
            eqiVar.e(eqiVar.c, this.u);
        }
        try {
            int ordinal = gfmVar.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    eqi eqiVar2 = this.w;
                    int i = eqiVar2.c - 1;
                    Object[] objArr = eqiVar2.a;
                    if (i < objArr.length) {
                        while (i >= 0) {
                            hur hurVar = (hur) objArr[i];
                            if (gfmVar == hurVar.d && (zt3Var2 = hurVar.c) != null) {
                                hurVar.c = null;
                                r7o r7oVar = z7o.b;
                                zt3Var2.resumeWith(ffmVar);
                            }
                            i--;
                        }
                    }
                } else if (ordinal != 2) {
                }
            }
            eqi eqiVar3 = this.w;
            Object[] objArr2 = eqiVar3.a;
            int i2 = eqiVar3.c;
            for (int i3 = 0; i3 < i2; i3++) {
                hur hurVar2 = (hur) objArr2[i3];
                if (gfmVar == hurVar2.d && (zt3Var = hurVar2.c) != null) {
                    hurVar2.c = null;
                    r7o r7oVar2 = z7o.b;
                    zt3Var.resumeWith(ffmVar);
                }
            }
        } finally {
            this.w.i();
        }
    }

    public final void U0() {
        rar rarVar = this.s;
        if (rarVar != null) {
            rarVar.u(new oic("Pointer input was reset", 4));
            this.s = null;
        }
    }

    @Override // defpackage.ofm
    public final void Z() {
        ffm ffmVar = this.x;
        if (ffmVar == null) {
            return;
        }
        List list = ffmVar.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (((lfm) list.get(i)).d) {
                ArrayList arrayList = new ArrayList(list.size());
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    lfm lfmVar = (lfm) list.get(i2);
                    long j = lfmVar.a;
                    long j2 = lfmVar.c;
                    long j3 = lfmVar.b;
                    float f = lfmVar.e;
                    boolean z = lfmVar.d;
                    arrayList.add(new lfm(j, j3, j2, false, f, j3, j2, z, z, lfmVar.i, 0L));
                }
                ffm ffmVar2 = new ffm(arrayList, null);
                this.t = ffmVar2;
                T0(ffmVar2, gfm.a);
                T0(ffmVar2, gfm.b);
                T0(ffmVar2, gfm.c);
                this.x = null;
                return;
            }
        }
    }

    @Override // defpackage.sv7, defpackage.ofm
    public final void a() {
        U0();
    }

    @Override // defpackage.jx7
    public final float getDensity() {
        return bcx.F(this).y.getDensity();
    }

    @Override // defpackage.jx7
    public final float i0() {
        return bcx.F(this).y.i0();
    }

    @Override // defpackage.ofm
    public final void o(ffm ffmVar, gfm gfmVar, long j) {
        this.y = j;
        if (gfmVar == gfm.a) {
            this.t = ffmVar;
        }
        Continuation continuation = null;
        if (this.s == null) {
            this.s = x97.y(G0(), null, pm6.d, new glp(this, continuation, 19), 1);
        }
        T0(ffmVar, gfmVar);
        List list = ffmVar.a;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                ffmVar = null;
                break;
            } else if (!swf.B((lfm) list.get(i))) {
                break;
            } else {
                i++;
            }
        }
        this.x = ffmVar;
    }
}
