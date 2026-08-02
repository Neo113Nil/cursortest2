package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.List;

/* loaded from: classes.dex */
public final class urb implements ccu, fy1, nds, c3i, SurfaceHolder.Callback, TextureView.SurfaceTextureListener {
    public final /* synthetic */ xrb a;

    public urb(xrb xrbVar) {
        this.a = xrbVar;
    }

    @Override // defpackage.ccu
    public final void A(ig7 ig7Var) {
        uj7 uj7Var = this.a.s;
        c80 Z = uj7Var.Z((uvh) uj7Var.d.f);
        uj7Var.d0(Z, 1020, new cj7(Z, ig7Var, 0));
    }

    @Override // defpackage.fy1
    public final void B(long j) {
        uj7 uj7Var = this.a.s;
        c80 c0 = uj7Var.c0();
        uj7Var.d0(c0, 1010, new gj7(c0, j));
    }

    @Override // defpackage.fy1
    public final void E(long j, long j2, String str) {
        uj7 uj7Var = this.a.s;
        c80 c0 = uj7Var.c0();
        uj7Var.d0(c0, 1008, new qj7(c0, str, j2, j, 0));
    }

    @Override // defpackage.ccu
    public final void F(ig7 ig7Var) {
        uj7 uj7Var = this.a.s;
        c80 c0 = uj7Var.c0();
        uj7Var.d0(c0, 1015, new cj7(c0, ig7Var, 3));
    }

    @Override // defpackage.ccu
    public final void G(int i, long j) {
        uj7 uj7Var = this.a.s;
        c80 Z = uj7Var.Z((uvh) uj7Var.d.f);
        uj7Var.d0(Z, 1018, new hj7(i, j, Z));
    }

    @Override // defpackage.ccu
    public final void I(dsc dscVar, tg7 tg7Var) {
        uj7 uj7Var = this.a.s;
        c80 c0 = uj7Var.c0();
        uj7Var.d0(c0, 1017, new jj7(c0, dscVar, tg7Var, 0));
    }

    @Override // defpackage.fy1
    public final void J(ig7 ig7Var) {
        uj7 uj7Var = this.a.s;
        c80 Z = uj7Var.Z((uvh) uj7Var.d.f);
        uj7Var.d0(Z, 1013, new cj7(Z, ig7Var, 2));
    }

    @Override // defpackage.fy1
    public final void M(Exception exc) {
        uj7 uj7Var = this.a.s;
        c80 c0 = uj7Var.c0();
        uj7Var.d0(c0, 1029, new ij7(c0, exc, 3));
    }

    @Override // defpackage.fy1
    public final void O(final int i, final long j, final long j2) {
        uj7 uj7Var = this.a.s;
        final c80 c0 = uj7Var.c0();
        uj7Var.d0(c0, 1011, new ycg() { // from class: ej7
            @Override // defpackage.ycg
            public final void invoke(Object obj) {
                ((d80) obj).b0(c80.this, i, j, j2);
            }
        });
    }

    @Override // defpackage.fy1
    public final void P(ig7 ig7Var) {
        uj7 uj7Var = this.a.s;
        c80 c0 = uj7Var.c0();
        uj7Var.d0(c0, 1007, new cj7(c0, ig7Var, 1));
    }

    @Override // defpackage.nds
    public final void a(List list) {
        this.a.m.f(27, new trb(list, 0));
    }

    @Override // defpackage.ccu
    public final void b(String str) {
        uj7 uj7Var = this.a.s;
        c80 c0 = uj7Var.c0();
        uj7Var.d0(c0, 1019, new lj7(c0, str, 1));
    }

    @Override // defpackage.fy1
    public final void d(String str) {
        uj7 uj7Var = this.a.s;
        c80 c0 = uj7Var.c0();
        uj7Var.d0(c0, 1012, new lj7(c0, str, 0));
    }

    @Override // defpackage.fy1
    public final void e(boolean z) {
        xrb xrbVar = this.a;
        if (xrbVar.a0 == z) {
            return;
        }
        xrbVar.a0 = z;
        xrbVar.m.f(23, new qrb(1, z));
    }

    @Override // defpackage.fy1
    public final void f(Exception exc) {
        uj7 uj7Var = this.a.s;
        c80 c0 = uj7Var.c0();
        uj7Var.d0(c0, 1014, new ij7(c0, exc, 1));
    }

    @Override // defpackage.ccu
    public final void g(long j, long j2, String str) {
        uj7 uj7Var = this.a.s;
        c80 c0 = uj7Var.c0();
        uj7Var.d0(c0, 1016, new qj7(c0, str, j2, j, 1));
    }

    @Override // defpackage.c3i
    public final void h(u2i u2iVar) {
        xrb xrbVar = this.a;
        bdg bdgVar = xrbVar.m;
        eoh a = xrbVar.k0.a();
        int i = 0;
        while (true) {
            n2i[] n2iVarArr = u2iVar.a;
            if (i >= n2iVarArr.length) {
                break;
            }
            n2iVarArr[i].populateMediaMetadata(a);
            i++;
        }
        xrbVar.k0 = new hoh(a);
        hoh k1 = xrbVar.k1();
        if (!k1.equals(xrbVar.O)) {
            xrbVar.O = k1;
            bdgVar.c(14, new g3a(6, this));
        }
        bdgVar.c(28, new g3a(7, u2iVar));
        bdgVar.b();
    }

    @Override // defpackage.ccu
    public final void i(Exception exc) {
        uj7 uj7Var = this.a.s;
        c80 c0 = uj7Var.c0();
        uj7Var.d0(c0, 1030, new ij7(c0, exc, 2));
    }

    @Override // defpackage.ccu
    public final void j(long j, Object obj) {
        xrb xrbVar = this.a;
        uj7 uj7Var = xrbVar.s;
        c80 c0 = uj7Var.c0();
        uj7Var.d0(c0, 26, new v13(c0, obj, j));
        if (xrbVar.Q == obj) {
            xrbVar.m.f(26, new xla(26));
        }
    }

    @Override // defpackage.ccu
    public final void k(tcu tcuVar) {
        xrb xrbVar = this.a;
        xrbVar.j0 = tcuVar;
        xrbVar.m.f(25, new g3a(4, tcuVar));
    }

    @Override // defpackage.nds
    public final void l(sv6 sv6Var) {
        xrb xrbVar = this.a;
        xrbVar.b0 = sv6Var;
        xrbVar.m.f(27, new g3a(5, sv6Var));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        xrb xrbVar = this.a;
        xrbVar.H1(surface);
        xrbVar.R = surface;
        xrbVar.y1(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        xrb xrbVar = this.a;
        xrbVar.H1(null);
        xrbVar.y1(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.y1(i, i2);
    }

    @Override // defpackage.fy1
    public final void r(z9 z9Var) {
        uj7 uj7Var = this.a.s;
        c80 c0 = uj7Var.c0();
        uj7Var.d0(c0, 1031, new kj7(c0, z9Var, 0));
    }

    @Override // defpackage.fy1
    public final void s(z9 z9Var) {
        uj7 uj7Var = this.a.s;
        c80 c0 = uj7Var.c0();
        uj7Var.d0(c0, 1032, new kj7(c0, z9Var, 1));
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.y1(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        xrb xrbVar = this.a;
        if (xrbVar.U) {
            xrbVar.H1(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        xrb xrbVar = this.a;
        if (xrbVar.U) {
            xrbVar.H1(null);
        }
        xrbVar.y1(0, 0);
    }

    @Override // defpackage.fy1
    public final void y(dsc dscVar, tg7 tg7Var) {
        uj7 uj7Var = this.a.s;
        c80 c0 = uj7Var.c0();
        uj7Var.d0(c0, 1009, new jj7(c0, dscVar, tg7Var, 1));
    }

    @Override // defpackage.ccu
    public final void z(int i, long j) {
        uj7 uj7Var = this.a.s;
        c80 Z = uj7Var.Z((uvh) uj7Var.d.f);
        uj7Var.d0(Z, 1021, new gj7(i, j, Z));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
