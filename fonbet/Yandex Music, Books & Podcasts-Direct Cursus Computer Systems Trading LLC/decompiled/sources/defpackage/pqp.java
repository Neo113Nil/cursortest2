package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class pqp extends bfu {
    public final jyr A;
    public final jyr B;
    public final jyr C;
    public final jyr D;
    public final jyr E;
    public final jyr F;
    public final jyr G;
    public final jyr H;
    public final x0q I;
    public final dkn J;
    public final jyr K;
    public final jyr L;
    public final jyr X;
    public final jyr Y;
    public final jyr Z;
    public final xdr k;
    public final xdr l;
    public final jyr m;
    public final jyr n;
    public final jyr o;
    public final jyr p;
    public final jyr q;
    public final jyr r;
    public final jyr s;
    public final jyr t;
    public final jyr u;
    public final jyr v;
    public final jyr v0;
    public final jyr w;
    public final jyr w0;
    public final jyr x;
    public final jyr y;
    public final jyr z;

    public pqp() {
        c5b c5bVar = c5b.a;
        this.k = ydr.a(c5bVar);
        this.l = ydr.a(c5bVar);
        bdt I = hag.I(qqp.class);
        l18 l18Var = l18.b;
        this.m = l18Var.b(I, true);
        this.n = l18Var.b(hag.I(t8q.class), true);
        this.o = l18Var.b(hag.I(n8q.class), true);
        final int i = 0;
        this.p = btf.b(new Function0(this) { // from class: fqp
            public final /* synthetic */ pqp b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = 22;
                boolean z = false;
                z = false;
                int i3 = 2;
                int i4 = 1;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                Object[] objArr7 = 0;
                Object[] objArr8 = 0;
                Object[] objArr9 = 0;
                Object[] objArr10 = 0;
                Object[] objArr11 = 0;
                Object[] objArr12 = 0;
                switch (i) {
                    case 0:
                        return (crt) this.b.G().c.getValue();
                    case 1:
                        this.b.G().getClass();
                        jyr jyrVar = t5j.e;
                        if (wyf.M()) {
                            l18 l18Var2 = l18.b;
                            bdt I2 = hag.I(byb.class);
                            qdc qdcVar = l18Var2.a;
                            qdcVar.getClass();
                            if (((o5v) ((byb) qdcVar.C(I2)).c(ern.a(o5v.class))).h()) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        pqp pqpVar = this.b;
                        return new clc(zsd.Q(((crt) pqpVar.p.getValue()).b(), ((z66) pqpVar.q.getValue()).e(), ((n8q) pqpVar.o.getValue()).b, new mqp(pqpVar, null)), new lqp(pqpVar, objArr == true ? 1 : 0, i3));
                    case 3:
                        pqp pqpVar2 = this.b;
                        return new clc(lg3.K(((d0q) pqpVar2.s.getValue()).e, ((j7q) pqpVar2.r.getValue()).e, ((t8q) pqpVar2.n.getValue()).d, ((syp) pqpVar2.t.getValue()).e, ((m8q) pqpVar2.u.getValue()).e, new r6o(pqpVar2, objArr3 == true ? 1 : 0, i4)), new lqp(pqpVar2, objArr2 == true ? 1 : 0, 3));
                    case 4:
                        pqp pqpVar3 = this.b;
                        return new clc(new u21(10, new clc(((dtt) pqpVar3.x.getValue()).g(pff.e), new lqp(pqpVar3, objArr6 == true ? 1 : 0, z ? 1 : 0)), ((ezb) pqpVar3.y.getValue()).d, new re7(pqpVar3, objArr5 == true ? 1 : 0, 6)), new lqp(pqpVar3, objArr4 == true ? 1 : 0, i4));
                    case 5:
                        return new clc(new p6o(((p8q) this.b.B.getValue()).c, 8), new jud(i3, i2, objArr7 == true ? 1 : 0));
                    case 6:
                        cqp cqpVar = (cqp) this.b.C.getValue();
                        return new clc(new xo2(zsd.M0(new clc(((agd) cqpVar.c.getValue()).d, new z21(i3, 25, objArr10 == true ? 1 : 0)), new cle((Continuation) (objArr9 == true ? 1 : 0), (Object) cqpVar, 19)), 5), new jud(i3, 23, objArr8 == true ? 1 : 0));
                    case 7:
                        return new clc(new p6o(((hyp) this.b.H.getValue()).e, 7), new jud(i3, 21, objArr11 == true ? 1 : 0));
                    case 8:
                        pqp pqpVar4 = this.b;
                        return new clc(new ail(22, ((r2q) pqpVar4.z.getValue()).e, pqpVar4), new jud(i3, 20, objArr12 == true ? 1 : 0));
                    case 9:
                        pqp pqpVar5 = this.b;
                        return ((wst) pqpVar5.v.getValue()).a(((frt) pqpVar5.w.getValue()).c());
                    case 10:
                        return this.b.G().d;
                    case 11:
                        pqp pqpVar6 = this.b;
                        Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                        PackageManager packageManager = ((Context) pqpVar6.D.getValue()).getPackageManager();
                        return Boolean.valueOf((packageManager != null ? packageManager.resolveActivity(intent, 0) : null) != null);
                    default:
                        this.b.G().getClass();
                        List h = u75.h("default", "off", "control");
                        l18 l18Var3 = l18.b;
                        bdt I3 = hag.I(byb.class);
                        l18Var3.a.getClass();
                        return Boolean.valueOf(!h.contains(((if2) ((byb) r1.C(I3)).b(if2.class)).b()));
                }
            }
        });
        this.q = l18Var.b(hag.I(z66.class), true);
        this.r = l18Var.b(hag.I(j7q.class), true);
        this.s = l18Var.b(hag.I(d0q.class), true);
        this.t = l18Var.b(hag.I(syp.class), true);
        this.u = l18Var.b(hag.I(m8q.class), true);
        this.v = l18Var.b(hag.I(wst.class), true);
        this.w = l18Var.b(hag.I(frt.class), true);
        final int i2 = 9;
        this.x = btf.b(new Function0(this) { // from class: fqp
            public final /* synthetic */ pqp b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = 22;
                boolean z = false;
                z = false;
                int i3 = 2;
                int i4 = 1;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                Object[] objArr7 = 0;
                Object[] objArr8 = 0;
                Object[] objArr9 = 0;
                Object[] objArr10 = 0;
                Object[] objArr11 = 0;
                Object[] objArr12 = 0;
                switch (i2) {
                    case 0:
                        return (crt) this.b.G().c.getValue();
                    case 1:
                        this.b.G().getClass();
                        jyr jyrVar = t5j.e;
                        if (wyf.M()) {
                            l18 l18Var2 = l18.b;
                            bdt I2 = hag.I(byb.class);
                            qdc qdcVar = l18Var2.a;
                            qdcVar.getClass();
                            if (((o5v) ((byb) qdcVar.C(I2)).c(ern.a(o5v.class))).h()) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        pqp pqpVar = this.b;
                        return new clc(zsd.Q(((crt) pqpVar.p.getValue()).b(), ((z66) pqpVar.q.getValue()).e(), ((n8q) pqpVar.o.getValue()).b, new mqp(pqpVar, null)), new lqp(pqpVar, objArr == true ? 1 : 0, i3));
                    case 3:
                        pqp pqpVar2 = this.b;
                        return new clc(lg3.K(((d0q) pqpVar2.s.getValue()).e, ((j7q) pqpVar2.r.getValue()).e, ((t8q) pqpVar2.n.getValue()).d, ((syp) pqpVar2.t.getValue()).e, ((m8q) pqpVar2.u.getValue()).e, new r6o(pqpVar2, objArr3 == true ? 1 : 0, i4)), new lqp(pqpVar2, objArr2 == true ? 1 : 0, 3));
                    case 4:
                        pqp pqpVar3 = this.b;
                        return new clc(new u21(10, new clc(((dtt) pqpVar3.x.getValue()).g(pff.e), new lqp(pqpVar3, objArr6 == true ? 1 : 0, z ? 1 : 0)), ((ezb) pqpVar3.y.getValue()).d, new re7(pqpVar3, objArr5 == true ? 1 : 0, 6)), new lqp(pqpVar3, objArr4 == true ? 1 : 0, i4));
                    case 5:
                        return new clc(new p6o(((p8q) this.b.B.getValue()).c, 8), new jud(i3, i22, objArr7 == true ? 1 : 0));
                    case 6:
                        cqp cqpVar = (cqp) this.b.C.getValue();
                        return new clc(new xo2(zsd.M0(new clc(((agd) cqpVar.c.getValue()).d, new z21(i3, 25, objArr10 == true ? 1 : 0)), new cle((Continuation) (objArr9 == true ? 1 : 0), (Object) cqpVar, 19)), 5), new jud(i3, 23, objArr8 == true ? 1 : 0));
                    case 7:
                        return new clc(new p6o(((hyp) this.b.H.getValue()).e, 7), new jud(i3, 21, objArr11 == true ? 1 : 0));
                    case 8:
                        pqp pqpVar4 = this.b;
                        return new clc(new ail(22, ((r2q) pqpVar4.z.getValue()).e, pqpVar4), new jud(i3, 20, objArr12 == true ? 1 : 0));
                    case 9:
                        pqp pqpVar5 = this.b;
                        return ((wst) pqpVar5.v.getValue()).a(((frt) pqpVar5.w.getValue()).c());
                    case 10:
                        return this.b.G().d;
                    case 11:
                        pqp pqpVar6 = this.b;
                        Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                        PackageManager packageManager = ((Context) pqpVar6.D.getValue()).getPackageManager();
                        return Boolean.valueOf((packageManager != null ? packageManager.resolveActivity(intent, 0) : null) != null);
                    default:
                        this.b.G().getClass();
                        List h = u75.h("default", "off", "control");
                        l18 l18Var3 = l18.b;
                        bdt I3 = hag.I(byb.class);
                        l18Var3.a.getClass();
                        return Boolean.valueOf(!h.contains(((if2) ((byb) r1.C(I3)).b(if2.class)).b()));
                }
            }
        });
        this.y = l18Var.b(hag.I(ezb.class), true);
        this.z = l18Var.b(hag.I(r2q.class), true);
        final int i3 = 10;
        this.A = btf.b(new Function0(this) { // from class: fqp
            public final /* synthetic */ pqp b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = 22;
                boolean z = false;
                z = false;
                int i32 = 2;
                int i4 = 1;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                Object[] objArr7 = 0;
                Object[] objArr8 = 0;
                Object[] objArr9 = 0;
                Object[] objArr10 = 0;
                Object[] objArr11 = 0;
                Object[] objArr12 = 0;
                switch (i3) {
                    case 0:
                        return (crt) this.b.G().c.getValue();
                    case 1:
                        this.b.G().getClass();
                        jyr jyrVar = t5j.e;
                        if (wyf.M()) {
                            l18 l18Var2 = l18.b;
                            bdt I2 = hag.I(byb.class);
                            qdc qdcVar = l18Var2.a;
                            qdcVar.getClass();
                            if (((o5v) ((byb) qdcVar.C(I2)).c(ern.a(o5v.class))).h()) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        pqp pqpVar = this.b;
                        return new clc(zsd.Q(((crt) pqpVar.p.getValue()).b(), ((z66) pqpVar.q.getValue()).e(), ((n8q) pqpVar.o.getValue()).b, new mqp(pqpVar, null)), new lqp(pqpVar, objArr == true ? 1 : 0, i32));
                    case 3:
                        pqp pqpVar2 = this.b;
                        return new clc(lg3.K(((d0q) pqpVar2.s.getValue()).e, ((j7q) pqpVar2.r.getValue()).e, ((t8q) pqpVar2.n.getValue()).d, ((syp) pqpVar2.t.getValue()).e, ((m8q) pqpVar2.u.getValue()).e, new r6o(pqpVar2, objArr3 == true ? 1 : 0, i4)), new lqp(pqpVar2, objArr2 == true ? 1 : 0, 3));
                    case 4:
                        pqp pqpVar3 = this.b;
                        return new clc(new u21(10, new clc(((dtt) pqpVar3.x.getValue()).g(pff.e), new lqp(pqpVar3, objArr6 == true ? 1 : 0, z ? 1 : 0)), ((ezb) pqpVar3.y.getValue()).d, new re7(pqpVar3, objArr5 == true ? 1 : 0, 6)), new lqp(pqpVar3, objArr4 == true ? 1 : 0, i4));
                    case 5:
                        return new clc(new p6o(((p8q) this.b.B.getValue()).c, 8), new jud(i32, i22, objArr7 == true ? 1 : 0));
                    case 6:
                        cqp cqpVar = (cqp) this.b.C.getValue();
                        return new clc(new xo2(zsd.M0(new clc(((agd) cqpVar.c.getValue()).d, new z21(i32, 25, objArr10 == true ? 1 : 0)), new cle((Continuation) (objArr9 == true ? 1 : 0), (Object) cqpVar, 19)), 5), new jud(i32, 23, objArr8 == true ? 1 : 0));
                    case 7:
                        return new clc(new p6o(((hyp) this.b.H.getValue()).e, 7), new jud(i32, 21, objArr11 == true ? 1 : 0));
                    case 8:
                        pqp pqpVar4 = this.b;
                        return new clc(new ail(22, ((r2q) pqpVar4.z.getValue()).e, pqpVar4), new jud(i32, 20, objArr12 == true ? 1 : 0));
                    case 9:
                        pqp pqpVar5 = this.b;
                        return ((wst) pqpVar5.v.getValue()).a(((frt) pqpVar5.w.getValue()).c());
                    case 10:
                        return this.b.G().d;
                    case 11:
                        pqp pqpVar6 = this.b;
                        Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                        PackageManager packageManager = ((Context) pqpVar6.D.getValue()).getPackageManager();
                        return Boolean.valueOf((packageManager != null ? packageManager.resolveActivity(intent, 0) : null) != null);
                    default:
                        this.b.G().getClass();
                        List h = u75.h("default", "off", "control");
                        l18 l18Var3 = l18.b;
                        bdt I3 = hag.I(byb.class);
                        l18Var3.a.getClass();
                        return Boolean.valueOf(!h.contains(((if2) ((byb) r1.C(I3)).b(if2.class)).b()));
                }
            }
        });
        this.B = l18Var.b(hag.I(p8q.class), true);
        this.C = btf.b(new qkp(6));
        this.D = l18Var.b(hag.I(Context.class), true);
        final int i4 = 11;
        this.E = btf.b(new Function0(this) { // from class: fqp
            public final /* synthetic */ pqp b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = 22;
                boolean z = false;
                z = false;
                int i32 = 2;
                int i42 = 1;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                Object[] objArr7 = 0;
                Object[] objArr8 = 0;
                Object[] objArr9 = 0;
                Object[] objArr10 = 0;
                Object[] objArr11 = 0;
                Object[] objArr12 = 0;
                switch (i4) {
                    case 0:
                        return (crt) this.b.G().c.getValue();
                    case 1:
                        this.b.G().getClass();
                        jyr jyrVar = t5j.e;
                        if (wyf.M()) {
                            l18 l18Var2 = l18.b;
                            bdt I2 = hag.I(byb.class);
                            qdc qdcVar = l18Var2.a;
                            qdcVar.getClass();
                            if (((o5v) ((byb) qdcVar.C(I2)).c(ern.a(o5v.class))).h()) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        pqp pqpVar = this.b;
                        return new clc(zsd.Q(((crt) pqpVar.p.getValue()).b(), ((z66) pqpVar.q.getValue()).e(), ((n8q) pqpVar.o.getValue()).b, new mqp(pqpVar, null)), new lqp(pqpVar, objArr == true ? 1 : 0, i32));
                    case 3:
                        pqp pqpVar2 = this.b;
                        return new clc(lg3.K(((d0q) pqpVar2.s.getValue()).e, ((j7q) pqpVar2.r.getValue()).e, ((t8q) pqpVar2.n.getValue()).d, ((syp) pqpVar2.t.getValue()).e, ((m8q) pqpVar2.u.getValue()).e, new r6o(pqpVar2, objArr3 == true ? 1 : 0, i42)), new lqp(pqpVar2, objArr2 == true ? 1 : 0, 3));
                    case 4:
                        pqp pqpVar3 = this.b;
                        return new clc(new u21(10, new clc(((dtt) pqpVar3.x.getValue()).g(pff.e), new lqp(pqpVar3, objArr6 == true ? 1 : 0, z ? 1 : 0)), ((ezb) pqpVar3.y.getValue()).d, new re7(pqpVar3, objArr5 == true ? 1 : 0, 6)), new lqp(pqpVar3, objArr4 == true ? 1 : 0, i42));
                    case 5:
                        return new clc(new p6o(((p8q) this.b.B.getValue()).c, 8), new jud(i32, i22, objArr7 == true ? 1 : 0));
                    case 6:
                        cqp cqpVar = (cqp) this.b.C.getValue();
                        return new clc(new xo2(zsd.M0(new clc(((agd) cqpVar.c.getValue()).d, new z21(i32, 25, objArr10 == true ? 1 : 0)), new cle((Continuation) (objArr9 == true ? 1 : 0), (Object) cqpVar, 19)), 5), new jud(i32, 23, objArr8 == true ? 1 : 0));
                    case 7:
                        return new clc(new p6o(((hyp) this.b.H.getValue()).e, 7), new jud(i32, 21, objArr11 == true ? 1 : 0));
                    case 8:
                        pqp pqpVar4 = this.b;
                        return new clc(new ail(22, ((r2q) pqpVar4.z.getValue()).e, pqpVar4), new jud(i32, 20, objArr12 == true ? 1 : 0));
                    case 9:
                        pqp pqpVar5 = this.b;
                        return ((wst) pqpVar5.v.getValue()).a(((frt) pqpVar5.w.getValue()).c());
                    case 10:
                        return this.b.G().d;
                    case 11:
                        pqp pqpVar6 = this.b;
                        Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                        PackageManager packageManager = ((Context) pqpVar6.D.getValue()).getPackageManager();
                        return Boolean.valueOf((packageManager != null ? packageManager.resolveActivity(intent, 0) : null) != null);
                    default:
                        this.b.G().getClass();
                        List h = u75.h("default", "off", "control");
                        l18 l18Var3 = l18.b;
                        bdt I3 = hag.I(byb.class);
                        l18Var3.a.getClass();
                        return Boolean.valueOf(!h.contains(((if2) ((byb) r1.C(I3)).b(if2.class)).b()));
                }
            }
        });
        final int i5 = 12;
        this.F = btf.b(new Function0(this) { // from class: fqp
            public final /* synthetic */ pqp b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = 22;
                boolean z = false;
                z = false;
                int i32 = 2;
                int i42 = 1;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                Object[] objArr7 = 0;
                Object[] objArr8 = 0;
                Object[] objArr9 = 0;
                Object[] objArr10 = 0;
                Object[] objArr11 = 0;
                Object[] objArr12 = 0;
                switch (i5) {
                    case 0:
                        return (crt) this.b.G().c.getValue();
                    case 1:
                        this.b.G().getClass();
                        jyr jyrVar = t5j.e;
                        if (wyf.M()) {
                            l18 l18Var2 = l18.b;
                            bdt I2 = hag.I(byb.class);
                            qdc qdcVar = l18Var2.a;
                            qdcVar.getClass();
                            if (((o5v) ((byb) qdcVar.C(I2)).c(ern.a(o5v.class))).h()) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        pqp pqpVar = this.b;
                        return new clc(zsd.Q(((crt) pqpVar.p.getValue()).b(), ((z66) pqpVar.q.getValue()).e(), ((n8q) pqpVar.o.getValue()).b, new mqp(pqpVar, null)), new lqp(pqpVar, objArr == true ? 1 : 0, i32));
                    case 3:
                        pqp pqpVar2 = this.b;
                        return new clc(lg3.K(((d0q) pqpVar2.s.getValue()).e, ((j7q) pqpVar2.r.getValue()).e, ((t8q) pqpVar2.n.getValue()).d, ((syp) pqpVar2.t.getValue()).e, ((m8q) pqpVar2.u.getValue()).e, new r6o(pqpVar2, objArr3 == true ? 1 : 0, i42)), new lqp(pqpVar2, objArr2 == true ? 1 : 0, 3));
                    case 4:
                        pqp pqpVar3 = this.b;
                        return new clc(new u21(10, new clc(((dtt) pqpVar3.x.getValue()).g(pff.e), new lqp(pqpVar3, objArr6 == true ? 1 : 0, z ? 1 : 0)), ((ezb) pqpVar3.y.getValue()).d, new re7(pqpVar3, objArr5 == true ? 1 : 0, 6)), new lqp(pqpVar3, objArr4 == true ? 1 : 0, i42));
                    case 5:
                        return new clc(new p6o(((p8q) this.b.B.getValue()).c, 8), new jud(i32, i22, objArr7 == true ? 1 : 0));
                    case 6:
                        cqp cqpVar = (cqp) this.b.C.getValue();
                        return new clc(new xo2(zsd.M0(new clc(((agd) cqpVar.c.getValue()).d, new z21(i32, 25, objArr10 == true ? 1 : 0)), new cle((Continuation) (objArr9 == true ? 1 : 0), (Object) cqpVar, 19)), 5), new jud(i32, 23, objArr8 == true ? 1 : 0));
                    case 7:
                        return new clc(new p6o(((hyp) this.b.H.getValue()).e, 7), new jud(i32, 21, objArr11 == true ? 1 : 0));
                    case 8:
                        pqp pqpVar4 = this.b;
                        return new clc(new ail(22, ((r2q) pqpVar4.z.getValue()).e, pqpVar4), new jud(i32, 20, objArr12 == true ? 1 : 0));
                    case 9:
                        pqp pqpVar5 = this.b;
                        return ((wst) pqpVar5.v.getValue()).a(((frt) pqpVar5.w.getValue()).c());
                    case 10:
                        return this.b.G().d;
                    case 11:
                        pqp pqpVar6 = this.b;
                        Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                        PackageManager packageManager = ((Context) pqpVar6.D.getValue()).getPackageManager();
                        return Boolean.valueOf((packageManager != null ? packageManager.resolveActivity(intent, 0) : null) != null);
                    default:
                        this.b.G().getClass();
                        List h = u75.h("default", "off", "control");
                        l18 l18Var3 = l18.b;
                        bdt I3 = hag.I(byb.class);
                        l18Var3.a.getClass();
                        return Boolean.valueOf(!h.contains(((if2) ((byb) r1.C(I3)).b(if2.class)).b()));
                }
            }
        });
        final int i6 = 1;
        this.G = btf.b(new Function0(this) { // from class: fqp
            public final /* synthetic */ pqp b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = 22;
                boolean z = false;
                z = false;
                int i32 = 2;
                int i42 = 1;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                Object[] objArr7 = 0;
                Object[] objArr8 = 0;
                Object[] objArr9 = 0;
                Object[] objArr10 = 0;
                Object[] objArr11 = 0;
                Object[] objArr12 = 0;
                switch (i6) {
                    case 0:
                        return (crt) this.b.G().c.getValue();
                    case 1:
                        this.b.G().getClass();
                        jyr jyrVar = t5j.e;
                        if (wyf.M()) {
                            l18 l18Var2 = l18.b;
                            bdt I2 = hag.I(byb.class);
                            qdc qdcVar = l18Var2.a;
                            qdcVar.getClass();
                            if (((o5v) ((byb) qdcVar.C(I2)).c(ern.a(o5v.class))).h()) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        pqp pqpVar = this.b;
                        return new clc(zsd.Q(((crt) pqpVar.p.getValue()).b(), ((z66) pqpVar.q.getValue()).e(), ((n8q) pqpVar.o.getValue()).b, new mqp(pqpVar, null)), new lqp(pqpVar, objArr == true ? 1 : 0, i32));
                    case 3:
                        pqp pqpVar2 = this.b;
                        return new clc(lg3.K(((d0q) pqpVar2.s.getValue()).e, ((j7q) pqpVar2.r.getValue()).e, ((t8q) pqpVar2.n.getValue()).d, ((syp) pqpVar2.t.getValue()).e, ((m8q) pqpVar2.u.getValue()).e, new r6o(pqpVar2, objArr3 == true ? 1 : 0, i42)), new lqp(pqpVar2, objArr2 == true ? 1 : 0, 3));
                    case 4:
                        pqp pqpVar3 = this.b;
                        return new clc(new u21(10, new clc(((dtt) pqpVar3.x.getValue()).g(pff.e), new lqp(pqpVar3, objArr6 == true ? 1 : 0, z ? 1 : 0)), ((ezb) pqpVar3.y.getValue()).d, new re7(pqpVar3, objArr5 == true ? 1 : 0, 6)), new lqp(pqpVar3, objArr4 == true ? 1 : 0, i42));
                    case 5:
                        return new clc(new p6o(((p8q) this.b.B.getValue()).c, 8), new jud(i32, i22, objArr7 == true ? 1 : 0));
                    case 6:
                        cqp cqpVar = (cqp) this.b.C.getValue();
                        return new clc(new xo2(zsd.M0(new clc(((agd) cqpVar.c.getValue()).d, new z21(i32, 25, objArr10 == true ? 1 : 0)), new cle((Continuation) (objArr9 == true ? 1 : 0), (Object) cqpVar, 19)), 5), new jud(i32, 23, objArr8 == true ? 1 : 0));
                    case 7:
                        return new clc(new p6o(((hyp) this.b.H.getValue()).e, 7), new jud(i32, 21, objArr11 == true ? 1 : 0));
                    case 8:
                        pqp pqpVar4 = this.b;
                        return new clc(new ail(22, ((r2q) pqpVar4.z.getValue()).e, pqpVar4), new jud(i32, 20, objArr12 == true ? 1 : 0));
                    case 9:
                        pqp pqpVar5 = this.b;
                        return ((wst) pqpVar5.v.getValue()).a(((frt) pqpVar5.w.getValue()).c());
                    case 10:
                        return this.b.G().d;
                    case 11:
                        pqp pqpVar6 = this.b;
                        Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                        PackageManager packageManager = ((Context) pqpVar6.D.getValue()).getPackageManager();
                        return Boolean.valueOf((packageManager != null ? packageManager.resolveActivity(intent, 0) : null) != null);
                    default:
                        this.b.G().getClass();
                        List h = u75.h("default", "off", "control");
                        l18 l18Var3 = l18.b;
                        bdt I3 = hag.I(byb.class);
                        l18Var3.a.getClass();
                        return Boolean.valueOf(!h.contains(((if2) ((byb) r1.C(I3)).b(if2.class)).b()));
                }
            }
        });
        this.H = l18Var.b(hag.I(hyp.class), true);
        x0q a = y0q.a(1, 1, oi3.b);
        this.I = a;
        this.J = new dkn(a);
        final int i7 = 2;
        this.K = btf.b(new Function0(this) { // from class: fqp
            public final /* synthetic */ pqp b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = 22;
                boolean z = false;
                z = false;
                int i32 = 2;
                int i42 = 1;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                Object[] objArr7 = 0;
                Object[] objArr8 = 0;
                Object[] objArr9 = 0;
                Object[] objArr10 = 0;
                Object[] objArr11 = 0;
                Object[] objArr12 = 0;
                switch (i7) {
                    case 0:
                        return (crt) this.b.G().c.getValue();
                    case 1:
                        this.b.G().getClass();
                        jyr jyrVar = t5j.e;
                        if (wyf.M()) {
                            l18 l18Var2 = l18.b;
                            bdt I2 = hag.I(byb.class);
                            qdc qdcVar = l18Var2.a;
                            qdcVar.getClass();
                            if (((o5v) ((byb) qdcVar.C(I2)).c(ern.a(o5v.class))).h()) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        pqp pqpVar = this.b;
                        return new clc(zsd.Q(((crt) pqpVar.p.getValue()).b(), ((z66) pqpVar.q.getValue()).e(), ((n8q) pqpVar.o.getValue()).b, new mqp(pqpVar, null)), new lqp(pqpVar, objArr == true ? 1 : 0, i32));
                    case 3:
                        pqp pqpVar2 = this.b;
                        return new clc(lg3.K(((d0q) pqpVar2.s.getValue()).e, ((j7q) pqpVar2.r.getValue()).e, ((t8q) pqpVar2.n.getValue()).d, ((syp) pqpVar2.t.getValue()).e, ((m8q) pqpVar2.u.getValue()).e, new r6o(pqpVar2, objArr3 == true ? 1 : 0, i42)), new lqp(pqpVar2, objArr2 == true ? 1 : 0, 3));
                    case 4:
                        pqp pqpVar3 = this.b;
                        return new clc(new u21(10, new clc(((dtt) pqpVar3.x.getValue()).g(pff.e), new lqp(pqpVar3, objArr6 == true ? 1 : 0, z ? 1 : 0)), ((ezb) pqpVar3.y.getValue()).d, new re7(pqpVar3, objArr5 == true ? 1 : 0, 6)), new lqp(pqpVar3, objArr4 == true ? 1 : 0, i42));
                    case 5:
                        return new clc(new p6o(((p8q) this.b.B.getValue()).c, 8), new jud(i32, i22, objArr7 == true ? 1 : 0));
                    case 6:
                        cqp cqpVar = (cqp) this.b.C.getValue();
                        return new clc(new xo2(zsd.M0(new clc(((agd) cqpVar.c.getValue()).d, new z21(i32, 25, objArr10 == true ? 1 : 0)), new cle((Continuation) (objArr9 == true ? 1 : 0), (Object) cqpVar, 19)), 5), new jud(i32, 23, objArr8 == true ? 1 : 0));
                    case 7:
                        return new clc(new p6o(((hyp) this.b.H.getValue()).e, 7), new jud(i32, 21, objArr11 == true ? 1 : 0));
                    case 8:
                        pqp pqpVar4 = this.b;
                        return new clc(new ail(22, ((r2q) pqpVar4.z.getValue()).e, pqpVar4), new jud(i32, 20, objArr12 == true ? 1 : 0));
                    case 9:
                        pqp pqpVar5 = this.b;
                        return ((wst) pqpVar5.v.getValue()).a(((frt) pqpVar5.w.getValue()).c());
                    case 10:
                        return this.b.G().d;
                    case 11:
                        pqp pqpVar6 = this.b;
                        Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                        PackageManager packageManager = ((Context) pqpVar6.D.getValue()).getPackageManager();
                        return Boolean.valueOf((packageManager != null ? packageManager.resolveActivity(intent, 0) : null) != null);
                    default:
                        this.b.G().getClass();
                        List h = u75.h("default", "off", "control");
                        l18 l18Var3 = l18.b;
                        bdt I3 = hag.I(byb.class);
                        l18Var3.a.getClass();
                        return Boolean.valueOf(!h.contains(((if2) ((byb) r1.C(I3)).b(if2.class)).b()));
                }
            }
        });
        final int i8 = 3;
        this.L = btf.b(new Function0(this) { // from class: fqp
            public final /* synthetic */ pqp b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = 22;
                boolean z = false;
                z = false;
                int i32 = 2;
                int i42 = 1;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                Object[] objArr7 = 0;
                Object[] objArr8 = 0;
                Object[] objArr9 = 0;
                Object[] objArr10 = 0;
                Object[] objArr11 = 0;
                Object[] objArr12 = 0;
                switch (i8) {
                    case 0:
                        return (crt) this.b.G().c.getValue();
                    case 1:
                        this.b.G().getClass();
                        jyr jyrVar = t5j.e;
                        if (wyf.M()) {
                            l18 l18Var2 = l18.b;
                            bdt I2 = hag.I(byb.class);
                            qdc qdcVar = l18Var2.a;
                            qdcVar.getClass();
                            if (((o5v) ((byb) qdcVar.C(I2)).c(ern.a(o5v.class))).h()) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        pqp pqpVar = this.b;
                        return new clc(zsd.Q(((crt) pqpVar.p.getValue()).b(), ((z66) pqpVar.q.getValue()).e(), ((n8q) pqpVar.o.getValue()).b, new mqp(pqpVar, null)), new lqp(pqpVar, objArr == true ? 1 : 0, i32));
                    case 3:
                        pqp pqpVar2 = this.b;
                        return new clc(lg3.K(((d0q) pqpVar2.s.getValue()).e, ((j7q) pqpVar2.r.getValue()).e, ((t8q) pqpVar2.n.getValue()).d, ((syp) pqpVar2.t.getValue()).e, ((m8q) pqpVar2.u.getValue()).e, new r6o(pqpVar2, objArr3 == true ? 1 : 0, i42)), new lqp(pqpVar2, objArr2 == true ? 1 : 0, 3));
                    case 4:
                        pqp pqpVar3 = this.b;
                        return new clc(new u21(10, new clc(((dtt) pqpVar3.x.getValue()).g(pff.e), new lqp(pqpVar3, objArr6 == true ? 1 : 0, z ? 1 : 0)), ((ezb) pqpVar3.y.getValue()).d, new re7(pqpVar3, objArr5 == true ? 1 : 0, 6)), new lqp(pqpVar3, objArr4 == true ? 1 : 0, i42));
                    case 5:
                        return new clc(new p6o(((p8q) this.b.B.getValue()).c, 8), new jud(i32, i22, objArr7 == true ? 1 : 0));
                    case 6:
                        cqp cqpVar = (cqp) this.b.C.getValue();
                        return new clc(new xo2(zsd.M0(new clc(((agd) cqpVar.c.getValue()).d, new z21(i32, 25, objArr10 == true ? 1 : 0)), new cle((Continuation) (objArr9 == true ? 1 : 0), (Object) cqpVar, 19)), 5), new jud(i32, 23, objArr8 == true ? 1 : 0));
                    case 7:
                        return new clc(new p6o(((hyp) this.b.H.getValue()).e, 7), new jud(i32, 21, objArr11 == true ? 1 : 0));
                    case 8:
                        pqp pqpVar4 = this.b;
                        return new clc(new ail(22, ((r2q) pqpVar4.z.getValue()).e, pqpVar4), new jud(i32, 20, objArr12 == true ? 1 : 0));
                    case 9:
                        pqp pqpVar5 = this.b;
                        return ((wst) pqpVar5.v.getValue()).a(((frt) pqpVar5.w.getValue()).c());
                    case 10:
                        return this.b.G().d;
                    case 11:
                        pqp pqpVar6 = this.b;
                        Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                        PackageManager packageManager = ((Context) pqpVar6.D.getValue()).getPackageManager();
                        return Boolean.valueOf((packageManager != null ? packageManager.resolveActivity(intent, 0) : null) != null);
                    default:
                        this.b.G().getClass();
                        List h = u75.h("default", "off", "control");
                        l18 l18Var3 = l18.b;
                        bdt I3 = hag.I(byb.class);
                        l18Var3.a.getClass();
                        return Boolean.valueOf(!h.contains(((if2) ((byb) r1.C(I3)).b(if2.class)).b()));
                }
            }
        });
        final int i9 = 4;
        this.X = btf.b(new Function0(this) { // from class: fqp
            public final /* synthetic */ pqp b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = 22;
                boolean z = false;
                z = false;
                int i32 = 2;
                int i42 = 1;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                Object[] objArr7 = 0;
                Object[] objArr8 = 0;
                Object[] objArr9 = 0;
                Object[] objArr10 = 0;
                Object[] objArr11 = 0;
                Object[] objArr12 = 0;
                switch (i9) {
                    case 0:
                        return (crt) this.b.G().c.getValue();
                    case 1:
                        this.b.G().getClass();
                        jyr jyrVar = t5j.e;
                        if (wyf.M()) {
                            l18 l18Var2 = l18.b;
                            bdt I2 = hag.I(byb.class);
                            qdc qdcVar = l18Var2.a;
                            qdcVar.getClass();
                            if (((o5v) ((byb) qdcVar.C(I2)).c(ern.a(o5v.class))).h()) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        pqp pqpVar = this.b;
                        return new clc(zsd.Q(((crt) pqpVar.p.getValue()).b(), ((z66) pqpVar.q.getValue()).e(), ((n8q) pqpVar.o.getValue()).b, new mqp(pqpVar, null)), new lqp(pqpVar, objArr == true ? 1 : 0, i32));
                    case 3:
                        pqp pqpVar2 = this.b;
                        return new clc(lg3.K(((d0q) pqpVar2.s.getValue()).e, ((j7q) pqpVar2.r.getValue()).e, ((t8q) pqpVar2.n.getValue()).d, ((syp) pqpVar2.t.getValue()).e, ((m8q) pqpVar2.u.getValue()).e, new r6o(pqpVar2, objArr3 == true ? 1 : 0, i42)), new lqp(pqpVar2, objArr2 == true ? 1 : 0, 3));
                    case 4:
                        pqp pqpVar3 = this.b;
                        return new clc(new u21(10, new clc(((dtt) pqpVar3.x.getValue()).g(pff.e), new lqp(pqpVar3, objArr6 == true ? 1 : 0, z ? 1 : 0)), ((ezb) pqpVar3.y.getValue()).d, new re7(pqpVar3, objArr5 == true ? 1 : 0, 6)), new lqp(pqpVar3, objArr4 == true ? 1 : 0, i42));
                    case 5:
                        return new clc(new p6o(((p8q) this.b.B.getValue()).c, 8), new jud(i32, i22, objArr7 == true ? 1 : 0));
                    case 6:
                        cqp cqpVar = (cqp) this.b.C.getValue();
                        return new clc(new xo2(zsd.M0(new clc(((agd) cqpVar.c.getValue()).d, new z21(i32, 25, objArr10 == true ? 1 : 0)), new cle((Continuation) (objArr9 == true ? 1 : 0), (Object) cqpVar, 19)), 5), new jud(i32, 23, objArr8 == true ? 1 : 0));
                    case 7:
                        return new clc(new p6o(((hyp) this.b.H.getValue()).e, 7), new jud(i32, 21, objArr11 == true ? 1 : 0));
                    case 8:
                        pqp pqpVar4 = this.b;
                        return new clc(new ail(22, ((r2q) pqpVar4.z.getValue()).e, pqpVar4), new jud(i32, 20, objArr12 == true ? 1 : 0));
                    case 9:
                        pqp pqpVar5 = this.b;
                        return ((wst) pqpVar5.v.getValue()).a(((frt) pqpVar5.w.getValue()).c());
                    case 10:
                        return this.b.G().d;
                    case 11:
                        pqp pqpVar6 = this.b;
                        Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                        PackageManager packageManager = ((Context) pqpVar6.D.getValue()).getPackageManager();
                        return Boolean.valueOf((packageManager != null ? packageManager.resolveActivity(intent, 0) : null) != null);
                    default:
                        this.b.G().getClass();
                        List h = u75.h("default", "off", "control");
                        l18 l18Var3 = l18.b;
                        bdt I3 = hag.I(byb.class);
                        l18Var3.a.getClass();
                        return Boolean.valueOf(!h.contains(((if2) ((byb) r1.C(I3)).b(if2.class)).b()));
                }
            }
        });
        final int i10 = 5;
        this.Y = btf.b(new Function0(this) { // from class: fqp
            public final /* synthetic */ pqp b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = 22;
                boolean z = false;
                z = false;
                int i32 = 2;
                int i42 = 1;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                Object[] objArr7 = 0;
                Object[] objArr8 = 0;
                Object[] objArr9 = 0;
                Object[] objArr10 = 0;
                Object[] objArr11 = 0;
                Object[] objArr12 = 0;
                switch (i10) {
                    case 0:
                        return (crt) this.b.G().c.getValue();
                    case 1:
                        this.b.G().getClass();
                        jyr jyrVar = t5j.e;
                        if (wyf.M()) {
                            l18 l18Var2 = l18.b;
                            bdt I2 = hag.I(byb.class);
                            qdc qdcVar = l18Var2.a;
                            qdcVar.getClass();
                            if (((o5v) ((byb) qdcVar.C(I2)).c(ern.a(o5v.class))).h()) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        pqp pqpVar = this.b;
                        return new clc(zsd.Q(((crt) pqpVar.p.getValue()).b(), ((z66) pqpVar.q.getValue()).e(), ((n8q) pqpVar.o.getValue()).b, new mqp(pqpVar, null)), new lqp(pqpVar, objArr == true ? 1 : 0, i32));
                    case 3:
                        pqp pqpVar2 = this.b;
                        return new clc(lg3.K(((d0q) pqpVar2.s.getValue()).e, ((j7q) pqpVar2.r.getValue()).e, ((t8q) pqpVar2.n.getValue()).d, ((syp) pqpVar2.t.getValue()).e, ((m8q) pqpVar2.u.getValue()).e, new r6o(pqpVar2, objArr3 == true ? 1 : 0, i42)), new lqp(pqpVar2, objArr2 == true ? 1 : 0, 3));
                    case 4:
                        pqp pqpVar3 = this.b;
                        return new clc(new u21(10, new clc(((dtt) pqpVar3.x.getValue()).g(pff.e), new lqp(pqpVar3, objArr6 == true ? 1 : 0, z ? 1 : 0)), ((ezb) pqpVar3.y.getValue()).d, new re7(pqpVar3, objArr5 == true ? 1 : 0, 6)), new lqp(pqpVar3, objArr4 == true ? 1 : 0, i42));
                    case 5:
                        return new clc(new p6o(((p8q) this.b.B.getValue()).c, 8), new jud(i32, i22, objArr7 == true ? 1 : 0));
                    case 6:
                        cqp cqpVar = (cqp) this.b.C.getValue();
                        return new clc(new xo2(zsd.M0(new clc(((agd) cqpVar.c.getValue()).d, new z21(i32, 25, objArr10 == true ? 1 : 0)), new cle((Continuation) (objArr9 == true ? 1 : 0), (Object) cqpVar, 19)), 5), new jud(i32, 23, objArr8 == true ? 1 : 0));
                    case 7:
                        return new clc(new p6o(((hyp) this.b.H.getValue()).e, 7), new jud(i32, 21, objArr11 == true ? 1 : 0));
                    case 8:
                        pqp pqpVar4 = this.b;
                        return new clc(new ail(22, ((r2q) pqpVar4.z.getValue()).e, pqpVar4), new jud(i32, 20, objArr12 == true ? 1 : 0));
                    case 9:
                        pqp pqpVar5 = this.b;
                        return ((wst) pqpVar5.v.getValue()).a(((frt) pqpVar5.w.getValue()).c());
                    case 10:
                        return this.b.G().d;
                    case 11:
                        pqp pqpVar6 = this.b;
                        Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                        PackageManager packageManager = ((Context) pqpVar6.D.getValue()).getPackageManager();
                        return Boolean.valueOf((packageManager != null ? packageManager.resolveActivity(intent, 0) : null) != null);
                    default:
                        this.b.G().getClass();
                        List h = u75.h("default", "off", "control");
                        l18 l18Var3 = l18.b;
                        bdt I3 = hag.I(byb.class);
                        l18Var3.a.getClass();
                        return Boolean.valueOf(!h.contains(((if2) ((byb) r1.C(I3)).b(if2.class)).b()));
                }
            }
        });
        final int i11 = 6;
        this.Z = btf.b(new Function0(this) { // from class: fqp
            public final /* synthetic */ pqp b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = 22;
                boolean z = false;
                z = false;
                int i32 = 2;
                int i42 = 1;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                Object[] objArr7 = 0;
                Object[] objArr8 = 0;
                Object[] objArr9 = 0;
                Object[] objArr10 = 0;
                Object[] objArr11 = 0;
                Object[] objArr12 = 0;
                switch (i11) {
                    case 0:
                        return (crt) this.b.G().c.getValue();
                    case 1:
                        this.b.G().getClass();
                        jyr jyrVar = t5j.e;
                        if (wyf.M()) {
                            l18 l18Var2 = l18.b;
                            bdt I2 = hag.I(byb.class);
                            qdc qdcVar = l18Var2.a;
                            qdcVar.getClass();
                            if (((o5v) ((byb) qdcVar.C(I2)).c(ern.a(o5v.class))).h()) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        pqp pqpVar = this.b;
                        return new clc(zsd.Q(((crt) pqpVar.p.getValue()).b(), ((z66) pqpVar.q.getValue()).e(), ((n8q) pqpVar.o.getValue()).b, new mqp(pqpVar, null)), new lqp(pqpVar, objArr == true ? 1 : 0, i32));
                    case 3:
                        pqp pqpVar2 = this.b;
                        return new clc(lg3.K(((d0q) pqpVar2.s.getValue()).e, ((j7q) pqpVar2.r.getValue()).e, ((t8q) pqpVar2.n.getValue()).d, ((syp) pqpVar2.t.getValue()).e, ((m8q) pqpVar2.u.getValue()).e, new r6o(pqpVar2, objArr3 == true ? 1 : 0, i42)), new lqp(pqpVar2, objArr2 == true ? 1 : 0, 3));
                    case 4:
                        pqp pqpVar3 = this.b;
                        return new clc(new u21(10, new clc(((dtt) pqpVar3.x.getValue()).g(pff.e), new lqp(pqpVar3, objArr6 == true ? 1 : 0, z ? 1 : 0)), ((ezb) pqpVar3.y.getValue()).d, new re7(pqpVar3, objArr5 == true ? 1 : 0, 6)), new lqp(pqpVar3, objArr4 == true ? 1 : 0, i42));
                    case 5:
                        return new clc(new p6o(((p8q) this.b.B.getValue()).c, 8), new jud(i32, i22, objArr7 == true ? 1 : 0));
                    case 6:
                        cqp cqpVar = (cqp) this.b.C.getValue();
                        return new clc(new xo2(zsd.M0(new clc(((agd) cqpVar.c.getValue()).d, new z21(i32, 25, objArr10 == true ? 1 : 0)), new cle((Continuation) (objArr9 == true ? 1 : 0), (Object) cqpVar, 19)), 5), new jud(i32, 23, objArr8 == true ? 1 : 0));
                    case 7:
                        return new clc(new p6o(((hyp) this.b.H.getValue()).e, 7), new jud(i32, 21, objArr11 == true ? 1 : 0));
                    case 8:
                        pqp pqpVar4 = this.b;
                        return new clc(new ail(22, ((r2q) pqpVar4.z.getValue()).e, pqpVar4), new jud(i32, 20, objArr12 == true ? 1 : 0));
                    case 9:
                        pqp pqpVar5 = this.b;
                        return ((wst) pqpVar5.v.getValue()).a(((frt) pqpVar5.w.getValue()).c());
                    case 10:
                        return this.b.G().d;
                    case 11:
                        pqp pqpVar6 = this.b;
                        Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                        PackageManager packageManager = ((Context) pqpVar6.D.getValue()).getPackageManager();
                        return Boolean.valueOf((packageManager != null ? packageManager.resolveActivity(intent, 0) : null) != null);
                    default:
                        this.b.G().getClass();
                        List h = u75.h("default", "off", "control");
                        l18 l18Var3 = l18.b;
                        bdt I3 = hag.I(byb.class);
                        l18Var3.a.getClass();
                        return Boolean.valueOf(!h.contains(((if2) ((byb) r1.C(I3)).b(if2.class)).b()));
                }
            }
        });
        final int i12 = 7;
        this.v0 = btf.b(new Function0(this) { // from class: fqp
            public final /* synthetic */ pqp b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = 22;
                boolean z = false;
                z = false;
                int i32 = 2;
                int i42 = 1;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                Object[] objArr7 = 0;
                Object[] objArr8 = 0;
                Object[] objArr9 = 0;
                Object[] objArr10 = 0;
                Object[] objArr11 = 0;
                Object[] objArr12 = 0;
                switch (i12) {
                    case 0:
                        return (crt) this.b.G().c.getValue();
                    case 1:
                        this.b.G().getClass();
                        jyr jyrVar = t5j.e;
                        if (wyf.M()) {
                            l18 l18Var2 = l18.b;
                            bdt I2 = hag.I(byb.class);
                            qdc qdcVar = l18Var2.a;
                            qdcVar.getClass();
                            if (((o5v) ((byb) qdcVar.C(I2)).c(ern.a(o5v.class))).h()) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        pqp pqpVar = this.b;
                        return new clc(zsd.Q(((crt) pqpVar.p.getValue()).b(), ((z66) pqpVar.q.getValue()).e(), ((n8q) pqpVar.o.getValue()).b, new mqp(pqpVar, null)), new lqp(pqpVar, objArr == true ? 1 : 0, i32));
                    case 3:
                        pqp pqpVar2 = this.b;
                        return new clc(lg3.K(((d0q) pqpVar2.s.getValue()).e, ((j7q) pqpVar2.r.getValue()).e, ((t8q) pqpVar2.n.getValue()).d, ((syp) pqpVar2.t.getValue()).e, ((m8q) pqpVar2.u.getValue()).e, new r6o(pqpVar2, objArr3 == true ? 1 : 0, i42)), new lqp(pqpVar2, objArr2 == true ? 1 : 0, 3));
                    case 4:
                        pqp pqpVar3 = this.b;
                        return new clc(new u21(10, new clc(((dtt) pqpVar3.x.getValue()).g(pff.e), new lqp(pqpVar3, objArr6 == true ? 1 : 0, z ? 1 : 0)), ((ezb) pqpVar3.y.getValue()).d, new re7(pqpVar3, objArr5 == true ? 1 : 0, 6)), new lqp(pqpVar3, objArr4 == true ? 1 : 0, i42));
                    case 5:
                        return new clc(new p6o(((p8q) this.b.B.getValue()).c, 8), new jud(i32, i22, objArr7 == true ? 1 : 0));
                    case 6:
                        cqp cqpVar = (cqp) this.b.C.getValue();
                        return new clc(new xo2(zsd.M0(new clc(((agd) cqpVar.c.getValue()).d, new z21(i32, 25, objArr10 == true ? 1 : 0)), new cle((Continuation) (objArr9 == true ? 1 : 0), (Object) cqpVar, 19)), 5), new jud(i32, 23, objArr8 == true ? 1 : 0));
                    case 7:
                        return new clc(new p6o(((hyp) this.b.H.getValue()).e, 7), new jud(i32, 21, objArr11 == true ? 1 : 0));
                    case 8:
                        pqp pqpVar4 = this.b;
                        return new clc(new ail(22, ((r2q) pqpVar4.z.getValue()).e, pqpVar4), new jud(i32, 20, objArr12 == true ? 1 : 0));
                    case 9:
                        pqp pqpVar5 = this.b;
                        return ((wst) pqpVar5.v.getValue()).a(((frt) pqpVar5.w.getValue()).c());
                    case 10:
                        return this.b.G().d;
                    case 11:
                        pqp pqpVar6 = this.b;
                        Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                        PackageManager packageManager = ((Context) pqpVar6.D.getValue()).getPackageManager();
                        return Boolean.valueOf((packageManager != null ? packageManager.resolveActivity(intent, 0) : null) != null);
                    default:
                        this.b.G().getClass();
                        List h = u75.h("default", "off", "control");
                        l18 l18Var3 = l18.b;
                        bdt I3 = hag.I(byb.class);
                        l18Var3.a.getClass();
                        return Boolean.valueOf(!h.contains(((if2) ((byb) r1.C(I3)).b(if2.class)).b()));
                }
            }
        });
        final int i13 = 8;
        this.w0 = btf.b(new Function0(this) { // from class: fqp
            public final /* synthetic */ pqp b;

            {
                this.b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = 22;
                boolean z = false;
                z = false;
                int i32 = 2;
                int i42 = 1;
                Object[] objArr = 0;
                Object[] objArr2 = 0;
                Object[] objArr3 = 0;
                Object[] objArr4 = 0;
                Object[] objArr5 = 0;
                Object[] objArr6 = 0;
                Object[] objArr7 = 0;
                Object[] objArr8 = 0;
                Object[] objArr9 = 0;
                Object[] objArr10 = 0;
                Object[] objArr11 = 0;
                Object[] objArr12 = 0;
                switch (i13) {
                    case 0:
                        return (crt) this.b.G().c.getValue();
                    case 1:
                        this.b.G().getClass();
                        jyr jyrVar = t5j.e;
                        if (wyf.M()) {
                            l18 l18Var2 = l18.b;
                            bdt I2 = hag.I(byb.class);
                            qdc qdcVar = l18Var2.a;
                            qdcVar.getClass();
                            if (((o5v) ((byb) qdcVar.C(I2)).c(ern.a(o5v.class))).h()) {
                                z = true;
                            }
                        }
                        return Boolean.valueOf(z);
                    case 2:
                        pqp pqpVar = this.b;
                        return new clc(zsd.Q(((crt) pqpVar.p.getValue()).b(), ((z66) pqpVar.q.getValue()).e(), ((n8q) pqpVar.o.getValue()).b, new mqp(pqpVar, null)), new lqp(pqpVar, objArr == true ? 1 : 0, i32));
                    case 3:
                        pqp pqpVar2 = this.b;
                        return new clc(lg3.K(((d0q) pqpVar2.s.getValue()).e, ((j7q) pqpVar2.r.getValue()).e, ((t8q) pqpVar2.n.getValue()).d, ((syp) pqpVar2.t.getValue()).e, ((m8q) pqpVar2.u.getValue()).e, new r6o(pqpVar2, objArr3 == true ? 1 : 0, i42)), new lqp(pqpVar2, objArr2 == true ? 1 : 0, 3));
                    case 4:
                        pqp pqpVar3 = this.b;
                        return new clc(new u21(10, new clc(((dtt) pqpVar3.x.getValue()).g(pff.e), new lqp(pqpVar3, objArr6 == true ? 1 : 0, z ? 1 : 0)), ((ezb) pqpVar3.y.getValue()).d, new re7(pqpVar3, objArr5 == true ? 1 : 0, 6)), new lqp(pqpVar3, objArr4 == true ? 1 : 0, i42));
                    case 5:
                        return new clc(new p6o(((p8q) this.b.B.getValue()).c, 8), new jud(i32, i22, objArr7 == true ? 1 : 0));
                    case 6:
                        cqp cqpVar = (cqp) this.b.C.getValue();
                        return new clc(new xo2(zsd.M0(new clc(((agd) cqpVar.c.getValue()).d, new z21(i32, 25, objArr10 == true ? 1 : 0)), new cle((Continuation) (objArr9 == true ? 1 : 0), (Object) cqpVar, 19)), 5), new jud(i32, 23, objArr8 == true ? 1 : 0));
                    case 7:
                        return new clc(new p6o(((hyp) this.b.H.getValue()).e, 7), new jud(i32, 21, objArr11 == true ? 1 : 0));
                    case 8:
                        pqp pqpVar4 = this.b;
                        return new clc(new ail(22, ((r2q) pqpVar4.z.getValue()).e, pqpVar4), new jud(i32, 20, objArr12 == true ? 1 : 0));
                    case 9:
                        pqp pqpVar5 = this.b;
                        return ((wst) pqpVar5.v.getValue()).a(((frt) pqpVar5.w.getValue()).c());
                    case 10:
                        return this.b.G().d;
                    case 11:
                        pqp pqpVar6 = this.b;
                        Intent intent = new Intent("android.media.action.DISPLAY_AUDIO_EFFECT_CONTROL_PANEL");
                        PackageManager packageManager = ((Context) pqpVar6.D.getValue()).getPackageManager();
                        return Boolean.valueOf((packageManager != null ? packageManager.resolveActivity(intent, 0) : null) != null);
                    default:
                        this.b.G().getClass();
                        List h = u75.h("default", "off", "control");
                        l18 l18Var3 = l18.b;
                        bdt I3 = hag.I(byb.class);
                        l18Var3.a.getClass();
                        return Boolean.valueOf(!h.contains(((if2) ((byb) r1.C(I3)).b(if2.class)).b()));
                }
            }
        });
        x97.y(ot0.F(this), null, null, new d7i(this, null, 18), 3);
    }

    public final qqp G() {
        return (qqp) this.m.getValue();
    }
}
