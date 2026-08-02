package O;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import i1.C4585b;

/* loaded from: classes.dex */
public class B0 extends com.bumptech.glide.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2118a = 0;

    /* renamed from: b, reason: collision with root package name */
    public Window f2119b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f2120c;

    public B0(Window window, C4585b c4585b) {
        this.f2119b = window;
        this.f2120c = c4585b;
    }

    public void A(int i) {
        View decorView = this.f2119b.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public void B(int i) {
        View decorView = this.f2119b.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    @Override // com.bumptech.glide.e
    public final void d() {
        switch (this.f2118a) {
            case 0:
                for (int i = 1; i <= 256; i <<= 1) {
                    if ((2 & i) != 0) {
                        if (i == 1) {
                            A(4);
                        } else if (i == 2) {
                            A(2);
                        } else if (i == 8) {
                            ((I0.j) ((C4585b) this.f2120c).f38152u).u();
                        }
                    }
                }
                break;
            default:
                ((WindowInsetsController) this.f2120c).hide(2);
                break;
        }
    }

    @Override // com.bumptech.glide.e
    public void i(boolean z6) {
        switch (this.f2118a) {
            case 1:
                Window window = this.f2119b;
                if (!z6) {
                    if (window != null) {
                        View decorView = window.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-17));
                    }
                    ((WindowInsetsController) this.f2120c).setSystemBarsAppearance(0, 16);
                    break;
                } else {
                    if (window != null) {
                        View decorView2 = window.getDecorView();
                        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 16);
                    }
                    ((WindowInsetsController) this.f2120c).setSystemBarsAppearance(16, 16);
                    break;
                }
        }
    }

    @Override // com.bumptech.glide.e
    public final void j(boolean z6) {
        switch (this.f2118a) {
            case 0:
                if (!z6) {
                    B(8192);
                    break;
                } else {
                    Window window = this.f2119b;
                    window.clearFlags(67108864);
                    window.addFlags(Integer.MIN_VALUE);
                    A(8192);
                    break;
                }
            default:
                Window window2 = this.f2119b;
                if (!z6) {
                    if (window2 != null) {
                        View decorView = window2.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() & (-8193));
                    }
                    ((WindowInsetsController) this.f2120c).setSystemBarsAppearance(0, 8);
                    break;
                } else {
                    if (window2 != null) {
                        View decorView2 = window2.getDecorView();
                        decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() | 8192);
                    }
                    ((WindowInsetsController) this.f2120c).setSystemBarsAppearance(8, 8);
                    break;
                }
        }
    }

    @Override // com.bumptech.glide.e
    public final void k() {
        switch (this.f2118a) {
            case 0:
                B(4096);
                A(2048);
                break;
            default:
                ((WindowInsetsController) this.f2120c).setSystemBarsBehavior(1);
                break;
        }
    }

    public B0(WindowInsetsController windowInsetsController, C4585b c4585b) {
        this.f2120c = windowInsetsController;
    }
}
