package defpackage;

import android.view.ViewGroup;
import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class ii0 implements eun, zdo, zie {
    public final boolean a;
    public final yk3 b;
    public final boolean c;
    public final float d;
    public final aqi e;
    public final aqi f;
    public final ViewGroup g;
    public ydo h;
    public final x6k i = szf.g0(null);
    public final x6k j = szf.g0(Boolean.TRUE);
    public long k = 0;
    public int l = -1;
    public final k5 m = new k5(4, this);

    public ii0(boolean z, float f, aqi aqiVar, aqi aqiVar2, ViewGroup viewGroup) {
        this.a = z;
        this.b = new yk3(new uv2(aqiVar2, 6), z);
        this.c = z;
        this.d = f;
        this.e = aqiVar;
        this.f = aqiVar2;
        this.g = viewGroup;
    }

    @Override // defpackage.zie
    public final void a(opf opfVar) {
        ou3 ou3Var = opfVar.a;
        this.k = ou3Var.e();
        float f = this.d;
        this.l = Float.isNaN(f) ? eeh.b(vdo.a(opfVar, this.c, ou3Var.e())) : ou3Var.L(f);
        long j = ((d85) this.e.getValue()).a;
        float f2 = ((udo) this.f.getValue()).d;
        opfVar.a();
        this.b.o(opfVar, Float.isNaN(f) ? vdo.a(opfVar, this.a, ou3Var.e()) : opfVar.n0(f), j);
        mu3 s = ou3Var.b.s();
        ((Boolean) this.j.getValue()).booleanValue();
        beo beoVar = (beo) this.i.getValue();
        if (beoVar != null) {
            beoVar.e(f2, this.l, ou3Var.e(), j);
            beoVar.draw(vd0.a(s));
        }
    }

    @Override // defpackage.zdo
    public final void a0() {
        this.i.setValue(null);
    }

    @Override // defpackage.eun
    public final void d() {
        ydo ydoVar = this.h;
        if (ydoVar != null) {
            a0();
            aeo aeoVar = ydoVar.d;
            beo beoVar = (beo) aeoVar.a.get(this);
            if (beoVar != null) {
                beoVar.c();
                LinkedHashMap linkedHashMap = aeoVar.a;
                beo beoVar2 = (beo) linkedHashMap.get(this);
                if (beoVar2 != null) {
                }
                linkedHashMap.remove(this);
                ydoVar.c.add(beoVar);
            }
        }
    }

    @Override // defpackage.eun
    public final void e() {
        ydo ydoVar = this.h;
        if (ydoVar != null) {
            a0();
            aeo aeoVar = ydoVar.d;
            beo beoVar = (beo) aeoVar.a.get(this);
            if (beoVar != null) {
                beoVar.c();
                LinkedHashMap linkedHashMap = aeoVar.a;
                beo beoVar2 = (beo) linkedHashMap.get(this);
                if (beoVar2 != null) {
                }
                linkedHashMap.remove(this);
                ydoVar.c.add(beoVar);
            }
        }
    }

    @Override // defpackage.eun
    public final void b() {
    }
}
