package androidx.core.view;

import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import coil3.Extras;
import coil3.memory.MemoryCacheService;
import com.squareup.util.Strings;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class WindowInsetsControllerCompat {
    public final Strings mImpl;

    /* loaded from: classes3.dex */
    public final class Impl26 extends Strings {
        public final MemoryCacheService mSoftwareKeyboardControllerCompat;
        public final Window mWindow;

        public Impl26(Window window, MemoryCacheService memoryCacheService) {
            this.mWindow = window;
            this.mSoftwareKeyboardControllerCompat = memoryCacheService;
        }

        @Override // com.squareup.util.Strings
        public final void hide(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    if (i2 == 1) {
                        setSystemUiFlag(4);
                    } else if (i2 == 2) {
                        setSystemUiFlag(2);
                    } else if (i2 == 8) {
                        ((Extras.Key) this.mSoftwareKeyboardControllerCompat.imageLoader).hide();
                    }
                }
            }
        }

        @Override // com.squareup.util.Strings
        public final boolean isAppearanceLightStatusBars() {
            return (this.mWindow.getDecorView().getSystemUiVisibility() & PKIFailureInfo.certRevoked) != 0;
        }

        @Override // com.squareup.util.Strings
        public final void setAppearanceLightNavigationBars(boolean z) {
            if (!z) {
                unsetSystemUiFlag(16);
                return;
            }
            Window window = this.mWindow;
            window.clearFlags(134217728);
            window.addFlags(PKIFailureInfo.systemUnavail);
            setSystemUiFlag(16);
        }

        @Override // com.squareup.util.Strings
        public final void setAppearanceLightStatusBars(boolean z) {
            if (!z) {
                unsetSystemUiFlag(PKIFailureInfo.certRevoked);
                return;
            }
            Window window = this.mWindow;
            window.clearFlags(67108864);
            window.addFlags(PKIFailureInfo.systemUnavail);
            setSystemUiFlag(PKIFailureInfo.certRevoked);
        }

        public final void setSystemUiFlag(int i) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        @Override // com.squareup.util.Strings
        public final void show(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    if (i2 == 1) {
                        unsetSystemUiFlag(4);
                        this.mWindow.clearFlags(1024);
                    } else if (i2 == 2) {
                        unsetSystemUiFlag(2);
                    } else if (i2 == 8) {
                        ((Extras.Key) this.mSoftwareKeyboardControllerCompat.imageLoader).show();
                    }
                }
            }
        }

        public final void unsetSystemUiFlag(int i) {
            View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }
    }

    /* loaded from: classes3.dex */
    public abstract class Impl31 extends Impl30 {
    }

    public WindowInsetsControllerCompat(Window window, View view) {
        MemoryCacheService memoryCacheService = new MemoryCacheService(view);
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.mImpl = new Impl35(window, memoryCacheService);
        } else if (i >= 30) {
            this.mImpl = new Impl30(window, memoryCacheService);
        } else {
            this.mImpl = new Impl26(window, memoryCacheService);
        }
    }

    public final void setAppearanceLightStatusBars(boolean z) {
        this.mImpl.setAppearanceLightStatusBars(z);
    }

    /* loaded from: classes3.dex */
    public final class Impl35 extends Impl31 {
        public Impl35(Window window, MemoryCacheService memoryCacheService) {
            super(window, memoryCacheService);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, com.squareup.util.Strings
        public final boolean isAppearanceLightStatusBars() {
            return (this.mInsetsController.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, com.squareup.util.Strings
        public final void setAppearanceLightNavigationBars(boolean z) {
            this.mInsetsController.setSystemBarsAppearance(z ? 16 : 0, 16);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl30, com.squareup.util.Strings
        public final void setAppearanceLightStatusBars(boolean z) {
            this.mInsetsController.setSystemBarsAppearance(z ? 8 : 0, 8);
        }

        public Impl35(WindowInsetsController windowInsetsController, MemoryCacheService memoryCacheService) {
            super(windowInsetsController, memoryCacheService);
        }
    }

    public class Impl30 extends Strings {
        public final WindowInsetsController mInsetsController;
        public final MemoryCacheService mSoftwareKeyboardControllerCompat;
        public final Window mWindow;

        public Impl30(Window window, MemoryCacheService memoryCacheService) {
            this(window.getInsetsController(), memoryCacheService);
            this.mWindow = window;
        }

        @Override // com.squareup.util.Strings
        public final void hide(int i) {
            if ((i & 8) != 0) {
                ((Extras.Key) this.mSoftwareKeyboardControllerCompat.imageLoader).hide();
            }
            this.mInsetsController.hide(i & (-9));
        }

        @Override // com.squareup.util.Strings
        public boolean isAppearanceLightStatusBars() {
            Window window = this.mWindow;
            if (window == null) {
                this.mInsetsController.setSystemBarsAppearance(0, 0);
                if ((this.mInsetsController.getSystemBarsAppearance() & 8) != 0) {
                    return true;
                }
            } else if ((window.getDecorView().getSystemUiVisibility() & PKIFailureInfo.certRevoked) != 0) {
                return true;
            }
            return false;
        }

        public final void setAppearanceLight(int i, int i2, boolean z) {
            Window window = this.mWindow;
            if (window == null) {
                WindowInsetsController windowInsetsController = this.mInsetsController;
                if (z) {
                    windowInsetsController.setSystemBarsAppearance(i2, i2);
                    return;
                } else {
                    windowInsetsController.setSystemBarsAppearance(0, i2);
                    return;
                }
            }
            if (z) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
            } else {
                View decorView2 = window.getDecorView();
                decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
            }
        }

        @Override // com.squareup.util.Strings
        public void setAppearanceLightNavigationBars(boolean z) {
            setAppearanceLight(16, 16, z);
        }

        @Override // com.squareup.util.Strings
        public void setAppearanceLightStatusBars(boolean z) {
            setAppearanceLight(PKIFailureInfo.certRevoked, 8, z);
        }

        @Override // com.squareup.util.Strings
        public final void show(int i) {
            if ((i & 8) != 0) {
                ((Extras.Key) this.mSoftwareKeyboardControllerCompat.imageLoader).show();
            }
            this.mInsetsController.show(i & (-9));
        }

        public Impl30(WindowInsetsController windowInsetsController, MemoryCacheService memoryCacheService) {
            this.mInsetsController = windowInsetsController;
            this.mSoftwareKeyboardControllerCompat = memoryCacheService;
        }
    }

    public WindowInsetsControllerCompat(WindowInsetsController windowInsetsController) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.mImpl = new Impl35(windowInsetsController, new MemoryCacheService(windowInsetsController));
        } else {
            this.mImpl = new Impl30(windowInsetsController, new MemoryCacheService(windowInsetsController));
        }
    }
}
