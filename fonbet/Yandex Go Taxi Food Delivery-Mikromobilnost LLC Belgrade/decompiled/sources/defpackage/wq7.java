package defpackage;

import android.util.Rational;
import androidx.camera.core.g;
import androidx.camera.view.PreviewView;
import androidx.fragment.app.FragmentActivity;
import java.io.File;
import java.io.OutputStream;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.a;

/* loaded from: classes13.dex */
public final class wq7 {
    public final FragmentActivity a;
    public final to7 b;
    public final sls c;
    public final sls d;
    public i5f0 e;
    public final o89 f;
    public tr7 g;
    public final i3y h;
    public final i3y i;
    public final i3y j;
    public final i3y k;
    public final i3y l;

    public wq7(FragmentActivity fragmentActivity, to7 to7Var, sls slsVar, sls slsVar2) {
        this.a = fragmentActivity;
        this.b = to7Var;
        this.c = slsVar;
        this.d = slsVar2;
        i5f0 i5f0Var = i5f0.b;
        o89 c = v5a1.c(fragmentActivity);
        this.f = c;
        c.c(new dn7(4, this), fragmentActivity.getMainExecutor());
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final int i = 0;
        this.h = a.b(lazyThreadSafetyMode, new sls(this) { // from class: uq7
            public final /* synthetic */ wq7 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                wq7 wq7Var = this.b;
                switch (i2) {
                    case 0:
                        g f = new pxe0().f();
                        f.J(((PreviewView) wq7Var.d.invoke()).getSurfaceProvider());
                        return f;
                    case 1:
                        sls slsVar3 = wq7Var.d;
                        PreviewView previewView = (PreviewView) slsVar3.invoke();
                        Rational rational = new Rational(previewView.getWidth(), previewView.getHeight());
                        int rotation = ((PreviewView) slsVar3.invoke()).getDisplay().getRotation();
                        xt31 xt31Var = new xt31();
                        xt31Var.a = 1;
                        xt31Var.b = rational;
                        xt31Var.c = rotation;
                        xt31Var.d = 0;
                        return xt31Var;
                    case 2:
                        aj21 aj21Var = new aj21();
                        aj21Var.a = (xt31) wq7Var.j.getValue();
                        aj21Var.a((g) wq7Var.h.getValue());
                        aj21Var.a((w8v) wq7Var.i.getValue());
                        return aj21Var.b();
                    default:
                        return new vq7(wq7Var);
                }
            }
        });
        final int i2 = 2;
        this.i = a.b(lazyThreadSafetyMode, new ij7(2));
        final int i3 = 1;
        this.j = a.b(lazyThreadSafetyMode, new sls(this) { // from class: uq7
            public final /* synthetic */ wq7 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                wq7 wq7Var = this.b;
                switch (i22) {
                    case 0:
                        g f = new pxe0().f();
                        f.J(((PreviewView) wq7Var.d.invoke()).getSurfaceProvider());
                        return f;
                    case 1:
                        sls slsVar3 = wq7Var.d;
                        PreviewView previewView = (PreviewView) slsVar3.invoke();
                        Rational rational = new Rational(previewView.getWidth(), previewView.getHeight());
                        int rotation = ((PreviewView) slsVar3.invoke()).getDisplay().getRotation();
                        xt31 xt31Var = new xt31();
                        xt31Var.a = 1;
                        xt31Var.b = rational;
                        xt31Var.c = rotation;
                        xt31Var.d = 0;
                        return xt31Var;
                    case 2:
                        aj21 aj21Var = new aj21();
                        aj21Var.a = (xt31) wq7Var.j.getValue();
                        aj21Var.a((g) wq7Var.h.getValue());
                        aj21Var.a((w8v) wq7Var.i.getValue());
                        return aj21Var.b();
                    default:
                        return new vq7(wq7Var);
                }
            }
        });
        this.k = a.b(lazyThreadSafetyMode, new sls(this) { // from class: uq7
            public final /* synthetic */ wq7 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                wq7 wq7Var = this.b;
                switch (i22) {
                    case 0:
                        g f = new pxe0().f();
                        f.J(((PreviewView) wq7Var.d.invoke()).getSurfaceProvider());
                        return f;
                    case 1:
                        sls slsVar3 = wq7Var.d;
                        PreviewView previewView = (PreviewView) slsVar3.invoke();
                        Rational rational = new Rational(previewView.getWidth(), previewView.getHeight());
                        int rotation = ((PreviewView) slsVar3.invoke()).getDisplay().getRotation();
                        xt31 xt31Var = new xt31();
                        xt31Var.a = 1;
                        xt31Var.b = rational;
                        xt31Var.c = rotation;
                        xt31Var.d = 0;
                        return xt31Var;
                    case 2:
                        aj21 aj21Var = new aj21();
                        aj21Var.a = (xt31) wq7Var.j.getValue();
                        aj21Var.a((g) wq7Var.h.getValue());
                        aj21Var.a((w8v) wq7Var.i.getValue());
                        return aj21Var.b();
                    default:
                        return new vq7(wq7Var);
                }
            }
        });
        final int i4 = 3;
        this.l = a.b(lazyThreadSafetyMode, new sls(this) { // from class: uq7
            public final /* synthetic */ wq7 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i4;
                wq7 wq7Var = this.b;
                switch (i22) {
                    case 0:
                        g f = new pxe0().f();
                        f.J(((PreviewView) wq7Var.d.invoke()).getSurfaceProvider());
                        return f;
                    case 1:
                        sls slsVar3 = wq7Var.d;
                        PreviewView previewView = (PreviewView) slsVar3.invoke();
                        Rational rational = new Rational(previewView.getWidth(), previewView.getHeight());
                        int rotation = ((PreviewView) slsVar3.invoke()).getDisplay().getRotation();
                        xt31 xt31Var = new xt31();
                        xt31Var.a = 1;
                        xt31Var.b = rational;
                        xt31Var.c = rotation;
                        xt31Var.d = 0;
                        return xt31Var;
                    case 2:
                        aj21 aj21Var = new aj21();
                        aj21Var.a = (xt31) wq7Var.j.getValue();
                        aj21Var.a((g) wq7Var.h.getValue());
                        aj21Var.a((w8v) wq7Var.i.getValue());
                        return aj21Var.b();
                    default:
                        return new vq7(wq7Var);
                }
            }
        });
    }

    public final void a(File file, boolean z) {
        r1s r1sVar = new r1s(file, (OutputStream) null, new s8v());
        i3y i3yVar = this.i;
        ((w8v) i3yVar.getValue()).M(z ? 1 : 2);
        ((w8v) i3yVar.getValue()).O(r1sVar, this.a.getMainExecutor(), (vq7) this.l.getValue());
    }

    public final void b(tr7 tr7Var) {
        if (jl40.l(this.g, tr7Var)) {
            return;
        }
        this.g = tr7Var;
        if (tr7Var != null) {
            try {
                i5f0 i5f0Var = this.e;
                if (i5f0Var == null) {
                    throw new IllegalStateException("Can't init camera without camera provider");
                }
                ws7 ws7Var = new ws7();
                int i = xq7.a[tr7Var.a.ordinal()];
                int i2 = 1;
                if (i != 1) {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i2 = 0;
                }
                ws7Var.b(i2);
                xs7 a = ws7Var.a();
                i5f0Var.g();
                i5f0Var.c((pey) this.c.invoke(), a, (bj21) this.k.getValue());
            } catch (Exception e) {
                this.b.b(e);
            }
        }
    }
}
