package yads;

import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import defpackage.a291;
import defpackage.bf71;
import defpackage.bz71;
import defpackage.dd71;
import defpackage.ek71;
import defpackage.ep71;
import defpackage.gp51;
import defpackage.odl;
import defpackage.oi61;
import defpackage.ov71;
import defpackage.rf71;
import defpackage.sno;
import defpackage.t571;
import defpackage.ty71;
import defpackage.ub81;
import defpackage.wa71;
import defpackage.wc71;
import defpackage.xrr;
import defpackage.yx61;
import java.util.List;

/* loaded from: classes7.dex */
public final class gn0 implements SurfaceHolder.Callback, TextureView.SurfaceTextureListener, bz71 {
    public final /* synthetic */ ek71 a;

    public gn0(ek71 ek71Var) {
        this.a = ek71Var;
    }

    public final void a(cs1 cs1Var) {
        ek71 ek71Var = this.a;
        oi61 oi61Var = ek71Var.a0;
        oi61Var.getClass();
        a291 a291Var = new a291(oi61Var);
        int i = 0;
        while (true) {
            bs1[] bs1VarArr = cs1Var.b;
            if (i >= bs1VarArr.length) {
                break;
            }
            bs1VarArr[i].a(a291Var);
            i++;
        }
        ek71Var.a0 = new oi61(a291Var);
        oi61 l = this.a.l();
        if (!l.equals(this.a.I)) {
            ek71 ek71Var2 = this.a;
            ek71Var2.I = l;
            ek71Var2.k.b(14, new gp51(11, this));
        }
        this.a.k.b(28, new gp51(12, cs1Var));
        this.a.k.a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        ek71 ek71Var = this.a;
        ek71Var.getClass();
        Surface surface = new Surface(surfaceTexture);
        ek71Var.f(surface);
        ek71Var.L = surface;
        this.a.c(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.f(null);
        this.a.c(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.c(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.c(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        ek71 ek71Var = this.a;
        if (ek71Var.O) {
            ek71Var.f(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ek71 ek71Var = this.a;
        if (ek71Var.O) {
            ek71Var.f(null);
        }
        this.a.c(0, 0);
    }

    public final void a(Object obj, long j) {
        ep71 ep71Var = this.a.p;
        wc71 A = ep71Var.A();
        ep71Var.y(A, 26, new gp51(A, obj, j));
        ek71 ek71Var = this.a;
        if (ek71Var.K == obj) {
            xrr xrrVar = ek71Var.k;
            xrrVar.b(26, new yx61(3));
            xrrVar.a();
        }
    }

    public final void a(boolean z) {
        ek71 ek71Var = this.a;
        if (ek71Var.W == z) {
            return;
        }
        ek71Var.W = z;
        xrr xrrVar = ek71Var.k;
        xrrVar.b(23, new sno(z, 2));
        xrrVar.a();
    }

    public final void a(List list) {
        xrr xrrVar = this.a.k;
        xrrVar.b(27, new odl(list));
        xrrVar.a();
    }

    public final void a(bf71 bf71Var) {
        this.a.getClass();
        xrr xrrVar = this.a.k;
        xrrVar.b(27, new gp51(14, bf71Var));
        xrrVar.a();
    }

    public final void a(ty71 ty71Var) {
        this.a.getClass();
        xrr xrrVar = this.a.k;
        xrrVar.b(25, new wa71(ty71Var));
        xrrVar.a();
    }

    public final /* synthetic */ void a(ub81 ub81Var) {
        ub81Var.t(this.a.I);
    }

    public final void a() {
        t571 t571Var = this.a.x;
        t571Var.getClass();
        AudioManager audioManager = t571Var.d;
        dd71 dd71Var = new dd71(0, rf71.a >= 28 ? audioManager.getStreamMinVolume(t571Var.g) : 0, audioManager.getStreamMaxVolume(t571Var.g));
        if (dd71Var.equals(this.a.Z)) {
            return;
        }
        ek71 ek71Var = this.a;
        ek71Var.Z = dd71Var;
        xrr xrrVar = ek71Var.k;
        xrrVar.b(29, new gp51(13, dd71Var));
        xrrVar.a();
    }

    public final void a(final boolean z, final int i) {
        xrr xrrVar = this.a.k;
        xrrVar.b(30, new ov71() { // from class: xa71
            @Override // defpackage.ov71
            public final void invoke(Object obj) {
                ((ub81) obj).d(z, i);
            }
        });
        xrrVar.a();
    }
}
