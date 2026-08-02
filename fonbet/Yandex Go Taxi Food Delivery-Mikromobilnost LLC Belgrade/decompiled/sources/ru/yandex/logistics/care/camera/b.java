package ru.yandex.logistics.care.camera;

import defpackage.as8;
import defpackage.bs8;
import defpackage.bvf0;
import defpackage.c06;
import defpackage.cx7;
import defpackage.do7;
import defpackage.ds31;
import defpackage.eci0;
import defpackage.eo7;
import defpackage.ffx;
import defpackage.fo7;
import defpackage.fzd;
import defpackage.gci0;
import defpackage.go7;
import defpackage.hh5;
import defpackage.ho7;
import defpackage.io7;
import defpackage.k5c;
import defpackage.ko7;
import defpackage.l4c;
import defpackage.lo7;
import defpackage.mo7;
import defpackage.ms8;
import defpackage.n4c;
import defpackage.n4u0;
import defpackage.ns8;
import defpackage.os8;
import defpackage.pr8;
import defpackage.ps8;
import defpackage.pzd;
import defpackage.pzt0;
import defpackage.qr8;
import defpackage.qs8;
import defpackage.qzd;
import defpackage.rr8;
import defpackage.rs8;
import defpackage.sr8;
import defpackage.tje;
import defpackage.tr8;
import defpackage.ts8;
import defpackage.ur8;
import defpackage.vr8;
import defpackage.w511;
import defpackage.wr8;
import defpackage.wsr0;
import defpackage.xr8;
import defpackage.xsr0;
import defpackage.yr8;
import defpackage.zr8;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.care.camera.data.BackgroundVisibility;
import ru.yandex.logistics.care.camera.di.Config$CameraControl;
import ru.yandex.logistics.care.camera.di.Config$CameraLens;
import ru.yandex.logistics.care.ui.n;

/* loaded from: classes4.dex */
public final class b extends ts8 {
    public int A;
    public boolean B;
    public pzt0 C;
    public final r0 D;
    public final gci0 E;
    public final r0 F;
    public final gci0 G;
    public final gci0 H;
    public final n0 I;
    public final eci0 J;
    public final qzd b;
    public final c06 c;
    public final hh5 w;
    public final ArrayList x = new ArrayList();
    public int y = 1;
    public List z;

    public b(qzd qzdVar, c06 c06Var, hh5 hh5Var) {
        this.b = qzdVar;
        this.c = c06Var;
        this.w = hh5Var;
        EmptyList emptyList = EmptyList.a;
        this.z = emptyList;
        r0 c = bvf0.c(new ms8(b0(), this.B, 0, emptyList));
        this.D = c;
        this.E = e.d(c);
        r0 c2 = bvf0.c(-1);
        this.F = c2;
        this.G = e.d(c2);
        m0 m0Var = new m0(c, c2, new CareCameraViewModelImpl$isBackgroundVisible$1(3, null));
        k5c a = ds31.a(this);
        xsr0.a.getClass();
        this.H = e.R(m0Var, a, wsr0.b, BackgroundVisibility.None);
        n0 c3 = ffx.c(0, 1, null, 5);
        this.I = c3;
        this.J = e.c(c3);
        fzd fzdVar = (fzd) qzdVar.b.get(this.y - 1);
        hh5Var.n(new do7(this.y, fzdVar.c, fzdVar.g));
        tje.N(ds31.a(this), null, null, new CareCameraViewModelImpl$1(this, null), 3);
        tje.N(ds31.a(this), null, null, new CareCameraViewModelImpl$2(this, null), 3);
    }

    @Override // defpackage.ts8
    public final eci0 W() {
        return this.J;
    }

    @Override // defpackage.ts8
    public final gci0 X() {
        return this.G;
    }

    @Override // defpackage.ts8
    public final n4u0 Y() {
        return this.E;
    }

    @Override // defpackage.ts8
    public final gci0 Z() {
        return this.H;
    }

    @Override // defpackage.ts8
    public final void a0(bs8 bs8Var) {
        pzd pzdVar;
        File file;
        if (bs8Var.equals(yr8.a)) {
            return;
        }
        boolean z = bs8Var instanceof zr8;
        qzd qzdVar = this.b;
        hh5 hh5Var = this.w;
        r0 r0Var = this.D;
        if (z) {
            fzd fzdVar = (fzd) qzdVar.b.get(this.y - 1);
            int i = this.y;
            String str = fzdVar.c;
            Config$CameraLens config$CameraLens = fzdVar.g;
            zr8 zr8Var = (zr8) bs8Var;
            String str2 = zr8Var.b ? "auto" : "manual";
            pzd pzdVar2 = fzdVar.h;
            hh5Var.n(new mo7(i, str, config$CameraLens, str2, pzdVar2 != null ? Integer.valueOf(pzdVar2.a) : null));
            hh5Var.n(new ko7(this.y, fzdVar.c, fzdVar.g));
            os8 os8Var = new os8(zr8Var.a, b0());
            r0Var.getClass();
            r0Var.m(null, os8Var);
            return;
        }
        if (bs8Var.equals(as8.a)) {
            rs8 rs8Var = (rs8) r0Var.getValue();
            if (rs8Var instanceof ms8) {
                ms8 ms8Var = (ms8) rs8Var;
                boolean z2 = !ms8Var.b;
                this.B = z2;
                ms8 b = ms8.b(ms8Var, z2, 0, null, 13);
                r0Var.getClass();
                r0Var.m(null, b);
                return;
            }
            return;
        }
        if (bs8Var.equals(xr8.a)) {
            rs8 rs8Var2 = (rs8) r0Var.getValue();
            if (!(rs8Var2 instanceof ms8) || this.z.size() <= 1) {
                return;
            }
            int size = (this.A + 1) % this.z.size();
            this.A = size;
            ms8 b2 = ms8.b((ms8) rs8Var2, false, size, null, 11);
            r0Var.getClass();
            r0Var.m(null, b2);
            return;
        }
        if (bs8Var instanceof qr8) {
            List list = ((qr8) bs8Var).a;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                float f = ((ns8) obj).a;
                if (0.45f <= f && f <= 1.05f) {
                    arrayList.add(obj);
                }
            }
            boolean equals = arrayList.equals(this.z);
            this.z = arrayList;
            if (!equals) {
                Iterator it = arrayList.iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    } else if (((ns8) it.next()).a == 1.0f) {
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i2 < 0) {
                    i2 = 0;
                }
                this.A = i2;
            }
            rs8 rs8Var3 = (rs8) r0Var.getValue();
            if (rs8Var3 instanceof ms8) {
                ms8 b3 = ms8.b((ms8) rs8Var3, false, this.A, this.z, 3);
                r0Var.getClass();
                r0Var.m(null, b3);
                return;
            }
            return;
        }
        boolean z3 = bs8Var instanceof pr8;
        c06 c06Var = this.c;
        if (z3) {
            ((cx7) c06Var.b).invoke(new n4c(((n) c06Var.a).i, false));
            return;
        }
        if (bs8Var.equals(sr8.a)) {
            fzd fzdVar2 = (fzd) qzdVar.b.get(this.y - 1);
            hh5Var.n(new ho7(this.y, fzdVar2.c, fzdVar2.g));
            ((cx7) c06Var.b).invoke(new l4c(((n) c06Var.a).i));
            return;
        }
        if (bs8Var.equals(ur8.a)) {
            Object value = r0Var.getValue();
            os8 os8Var2 = value instanceof os8 ? (os8) value : null;
            if (os8Var2 != null && (file = os8Var2.a) != null) {
                file.delete();
            }
            fzd fzdVar3 = (fzd) qzdVar.b.get(this.y - 1);
            hh5Var.n(new lo7(this.y, fzdVar3.c, fzdVar3.g));
            ms8 ms8Var2 = new ms8(b0(), this.B, this.A, this.z);
            r0Var.getClass();
            r0Var.m(null, ms8Var2);
            return;
        }
        if (bs8Var.equals(tr8.a)) {
            rs8 rs8Var4 = (rs8) r0Var.getValue();
            if (rs8Var4 instanceof os8) {
                File file2 = ((os8) rs8Var4).a;
                this.x.add(file2);
                ArrayList arrayList2 = qzdVar.b;
                ArrayList arrayList3 = qzdVar.b;
                fzd fzdVar4 = (fzd) arrayList2.get(this.y - 1);
                hh5Var.n(new io7(this.y, fzdVar4.c, fzdVar4.g));
                ((n) c06Var.a).e(file2, fzdVar4);
                if (this.y >= arrayList3.size()) {
                    ((n) c06Var.a).d();
                    return;
                }
                int i3 = this.y;
                this.y = i3 + 1;
                fzd fzdVar5 = (fzd) arrayList3.get(i3);
                hh5Var.n(new do7(this.y, fzdVar5.c, fzdVar5.g));
                ms8 ms8Var3 = new ms8(b0(), this.B, this.A, this.z);
                r0Var.getClass();
                r0Var.m(null, ms8Var3);
                return;
            }
            return;
        }
        if (bs8Var.equals(vr8.a)) {
            fzd fzdVar6 = (fzd) qzdVar.b.get(this.y - 1);
            int i4 = this.y;
            String str3 = fzdVar6.c;
            Config$CameraLens config$CameraLens2 = fzdVar6.g;
            hh5Var.n(new go7(i4, str3, config$CameraLens2));
            hh5Var.n(new fo7(this.y, fzdVar6.c, config$CameraLens2));
            return;
        }
        if (bs8Var.equals(rr8.a)) {
            fzd fzdVar7 = (fzd) qzdVar.b.get(this.y - 1);
            hh5Var.n(new eo7(this.y, fzdVar7.c, fzdVar7.g));
            return;
        }
        if (!bs8Var.equals(wr8.a)) {
            w511.b();
            return;
        }
        Object value2 = r0Var.getValue();
        ms8 ms8Var4 = value2 instanceof ms8 ? (ms8) value2 : null;
        if (ms8Var4 == null || (pzdVar = ms8Var4.a.g) == null) {
            return;
        }
        int max = Math.max(1, pzdVar.a);
        pzt0 pzt0Var = this.C;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        Integer valueOf = Integer.valueOf(max);
        r0 r0Var2 = this.F;
        r0Var2.getClass();
        r0Var2.m(null, valueOf);
        this.C = tje.N(ds31.a(this), null, null, new CareCameraViewModelImpl$startSelfTimer$1(max, this, null), 3);
    }

    public final qs8 b0() {
        fzd fzdVar = (fzd) this.b.b.get(this.y - 1);
        String str = fzdVar.a;
        ArrayList arrayList = fzdVar.e;
        return new qs8(arrayList.contains(Config$CameraControl.LensSelector), arrayList.contains(Config$CameraControl.Flash), fzdVar.f, str != null ? new ps8(str, fzdVar.b) : null, fzdVar.d, fzdVar.g, fzdVar.h, fzdVar.i);
    }
}
