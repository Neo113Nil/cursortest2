package O;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class B0 extends com.bumptech.glide.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2030a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Window f2031b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2032c;

    public B0(Window window, I0.j jVar) {
        this.f2031b = window;
        this.f2032c = jVar;
    }

    public void E(int i) {
        View decorView = this.f2031b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public void F(int i) {
        View decorView = this.f2031b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // com.bumptech.glide.f
    public final void j() {
        switch (this.f2030a) {
            case 0:
                for (int i = 1; i <= 256; i <<= 1) {
                    if ((2 & i) != 0) {
                        if (i == 1) {
                            E(4);
                        } else if (i == 2) {
                            E(2);
                        } else if (i == 8) {
                            ((F1.a) ((I0.j) this.f2032c).f1264u).p();
                        }
                    }
                }
                break;
            default:
                ((WindowInsetsController) this.f2032c).hide(2);
                break;
        }
    }

    @Override // com.bumptech.glide.f
    public void w(boolean z3) {
        switch (this.f2030a) {
            case 1:
                Window window = this.f2031b;
                if (!z3) {
                    if (window != null) {
                        View decorView = window.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
                    }
                    ((WindowInsetsController) this.f2032c).setSystemBarsAppearance(0, 16);
                    break;
                } else {
                    if (window != null) {
                        View decorView2 = window.getDecorView();
                        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
                    }
                    ((WindowInsetsController) this.f2032c).setSystemBarsAppearance(16, 16);
                    break;
                }
        }
    }

    @Override // com.bumptech.glide.f
    public final void x(boolean z3) {
        switch (this.f2030a) {
            case 0:
                if (!z3) {
                    F(8192);
                    break;
                } else {
                    Window window = this.f2031b;
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    E(8192);
                    break;
                }
            default:
                Window window2 = this.f2031b;
                if (!z3) {
                    if (window2 != null) {
                        View decorView = window2.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
                    }
                    ((WindowInsetsController) this.f2032c).setSystemBarsAppearance(0, 8);
                    break;
                } else {
                    if (window2 != null) {
                        View decorView2 = window2.getDecorView();
                        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
                    }
                    ((WindowInsetsController) this.f2032c).setSystemBarsAppearance(8, 8);
                    break;
                }
        }
    }

    @Override // com.bumptech.glide.f
    public final void y() {
        switch (this.f2030a) {
            case 0:
                F(4096);
                E(2048);
                break;
            default:
                ((WindowInsetsController) this.f2032c).setSystemBarsBehavior(1);
                break;
        }
    }

    public B0(WindowInsetsController windowInsetsController, I0.j jVar) {
        this.f2032c = windowInsetsController;
    }
}
