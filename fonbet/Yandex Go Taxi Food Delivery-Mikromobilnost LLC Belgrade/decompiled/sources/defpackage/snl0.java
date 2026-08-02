package defpackage;

import com.caverock.androidsvg.m;
import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class snl0 implements mml0 {
    public boolean A;
    public final ArrayList a;
    public float b;
    public float c;
    public tnl0 w;
    public boolean x;
    public boolean y;
    public int z;

    public snl0(m mVar, yi6 yi6Var) {
        ArrayList arrayList = new ArrayList();
        this.a = arrayList;
        this.w = null;
        this.x = false;
        this.y = true;
        this.z = -1;
        if (yi6Var == null) {
            return;
        }
        yi6Var.g(this);
        if (this.A) {
            this.w.b((tnl0) arrayList.get(this.z));
            arrayList.set(this.z, this.w);
            this.A = false;
        }
        tnl0 tnl0Var = this.w;
        if (tnl0Var != null) {
            arrayList.add(tnl0Var);
        }
    }

    @Override // defpackage.mml0
    public final void R(float f, float f2) {
        boolean z = this.A;
        ArrayList arrayList = this.a;
        if (z) {
            this.w.b((tnl0) arrayList.get(this.z));
            arrayList.set(this.z, this.w);
            this.A = false;
        }
        tnl0 tnl0Var = this.w;
        if (tnl0Var != null) {
            arrayList.add(tnl0Var);
        }
        this.b = f;
        this.c = f2;
        this.w = new tnl0(f, f2, 0.0f, 0.0f);
        this.z = arrayList.size();
    }

    @Override // defpackage.mml0
    public final void S(float f, float f2, float f3, float f4, float f5, boolean z, boolean z2) {
        this.x = true;
        this.y = false;
        tnl0 tnl0Var = this.w;
        m.a(tnl0Var.a, tnl0Var.b, f, f2, f3, z, z2, f4, f5, this);
        this.y = true;
        this.A = false;
    }

    @Override // defpackage.mml0
    public final void T(float f, float f2) {
        this.w.a(f, f2);
        this.a.add(this.w);
        tnl0 tnl0Var = this.w;
        this.w = new tnl0(f, f2, f - tnl0Var.a, f2 - tnl0Var.b);
        this.A = false;
    }

    @Override // defpackage.mml0
    public final void U(float f, float f2, float f3, float f4) {
        this.w.a(f, f2);
        this.a.add(this.w);
        this.w = new tnl0(f3, f4, f3 - f, f4 - f2);
        this.A = false;
    }

    @Override // defpackage.mml0
    public final void V(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.y || this.x) {
            this.w.a(f, f2);
            this.a.add(this.w);
            this.x = false;
        }
        this.w = new tnl0(f5, f6, f5 - f3, f6 - f4);
        this.A = false;
    }

    @Override // defpackage.mml0
    public final void close() {
        this.a.add(this.w);
        T(this.b, this.c);
        this.A = true;
    }
}
