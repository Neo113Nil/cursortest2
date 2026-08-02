package androidx.core.view;

import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import androidx.core.graphics.Insets;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.ViewCompat;
import androidx.room.util.DBUtil;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class WindowInsetsCompat {
    public static final WindowInsetsCompat CONSUMED;
    public final Impl mImpl;

    /* loaded from: classes3.dex */
    public class BuilderImpl35 extends BuilderImpl34 {
        public BuilderImpl35(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            windowInsetsCompat.mImpl.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void initTypeBoundingRects(WindowInsetsCompat windowInsetsCompat) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl34, androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setInsets(int i, Insets insets) {
            super.setInsets(i, insets);
        }
    }

    public class Impl {
        public static final WindowInsetsCompat CONSUMED;
        public final WindowInsetsCompat mHost;

        static {
            int i = Build.VERSION.SDK_INT;
            CONSUMED = (i >= 36 ? new BuilderImpl36() : i >= 35 ? new BuilderImpl35() : i >= 34 ? new BuilderImpl34() : i >= 31 ? new BuilderImpl31() : i >= 30 ? new BuilderImpl30() : new BuilderImpl29()).build().mImpl.consumeDisplayCutout().mImpl.consumeStableInsets().mImpl.consumeSystemWindowInsets();
        }

        public Impl(WindowInsetsCompat windowInsetsCompat) {
            this.mHost = windowInsetsCompat;
        }

        public WindowInsetsCompat consumeDisplayCutout() {
            return this.mHost;
        }

        public WindowInsetsCompat consumeStableInsets() {
            return this.mHost;
        }

        public WindowInsetsCompat consumeSystemWindowInsets() {
            return this.mHost;
        }

        public void copyRootViewBounds(View view) {
        }

        public void copyWindowDataInto(WindowInsetsCompat windowInsetsCompat) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl)) {
                return false;
            }
            Impl impl = (Impl) obj;
            return isRound() == impl.isRound() && isConsumed() == impl.isConsumed() && Objects.equals(getSystemWindowInsets(), impl.getSystemWindowInsets()) && Objects.equals(getStableInsets(), impl.getStableInsets()) && Objects.equals(getDisplayCutout(), impl.getDisplayCutout());
        }

        public List<Rect> getBoundingRects(int i) {
            return Collections.EMPTY_LIST;
        }

        public List<Rect> getBoundingRectsIgnoringVisibility(int i) {
            return Collections.EMPTY_LIST;
        }

        public DisplayCutoutCompat getDisplayCutout() {
            return null;
        }

        public Insets getInsets(int i) {
            return Insets.NONE;
        }

        public Insets getInsetsIgnoringVisibility(int i) {
            if ((i & 8) == 0) {
                return Insets.NONE;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Unable to query the maximum insets for IME");
            return null;
        }

        public Insets getMandatorySystemGestureInsets() {
            return getSystemWindowInsets();
        }

        public Insets getStableInsets() {
            return Insets.NONE;
        }

        public Insets getSystemGestureInsets() {
            return getSystemWindowInsets();
        }

        public Insets getSystemWindowInsets() {
            return Insets.NONE;
        }

        public Insets getTappableElementInsets() {
            return getSystemWindowInsets();
        }

        public int hashCode() {
            return Objects.hash(Boolean.valueOf(isRound()), Boolean.valueOf(isConsumed()), getSystemWindowInsets(), getStableInsets(), getDisplayCutout());
        }

        public void initDisplayShape(View view) {
        }

        public void initTypeBoundingRectsMaps() {
        }

        public WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            return CONSUMED;
        }

        public boolean isConsumed() {
            return false;
        }

        public boolean isRound() {
            return false;
        }

        public boolean isVisible(int i) {
            return true;
        }

        public void setDisplayShape(DisplayShapeCompat displayShapeCompat) {
        }

        public void setOverriddenInsets(Insets[] insetsArr) {
        }

        public void setRootViewData(Insets insets) {
        }

        public void setRootWindowInsets(WindowInsetsCompat windowInsetsCompat) {
        }

        public void setSystemUiVisibility(int i) {
        }

        public void setTypeBoundingRectsMap(Rect[][] rectArr) {
        }

        public void setTypeMaxBoundingRectsMap(Rect[][] rectArr) {
        }
    }

    /* loaded from: classes3.dex */
    public abstract class TypeImpl30 {
        public static int toPlatformType(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    public abstract class TypeImpl34 {
        public static int toPlatformType(int i) {
            int statusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 512; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        statusBars = WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        statusBars = WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        statusBars = WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        statusBars = WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        statusBars = WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        statusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        statusBars = WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        statusBars = WindowInsets.Type.displayCutout();
                    } else if (i3 == 512) {
                        statusBars = WindowInsets.Type.systemOverlays();
                    }
                    i2 |= statusBars;
                }
            }
            return i2;
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            CONSUMED = Impl34.CONSUMED;
        } else if (i >= 30) {
            CONSUMED = Impl30.CONSUMED;
        } else {
            CONSUMED = Impl.CONSUMED;
        }
    }

    public WindowInsetsCompat(WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat == null) {
            this.mImpl = new Impl(this);
            return;
        }
        Impl impl = windowInsetsCompat.mImpl;
        int i = Build.VERSION.SDK_INT;
        if (i >= 35 && (impl instanceof Impl35)) {
            this.mImpl = new Impl35(this, (Impl35) impl);
        } else if (i >= 34 && (impl instanceof Impl34)) {
            this.mImpl = new Impl34(this, (Impl34) impl);
        } else if (i >= 31 && (impl instanceof Impl31)) {
            this.mImpl = new Impl31(this, (Impl31) impl);
        } else if (i >= 30 && (impl instanceof Impl30)) {
            this.mImpl = new Impl30(this, (Impl30) impl);
        } else if (impl instanceof Impl29) {
            this.mImpl = new Impl29(this, (Impl29) impl);
        } else if (impl instanceof Impl28) {
            this.mImpl = new Impl28(this, (Impl28) impl);
        } else if (impl instanceof Impl21) {
            this.mImpl = new Impl21(this, (Impl21) impl);
        } else if (impl instanceof Impl20) {
            this.mImpl = new Impl20(this, (Impl20) impl);
        } else {
            this.mImpl = new Impl(this);
        }
        impl.copyWindowDataInto(this);
    }

    public static Insets insetInsets(Insets insets, int i, int i2, int i3, int i4) {
        int max = Math.max(0, insets.left - i);
        int max2 = Math.max(0, insets.top - i2);
        int max3 = Math.max(0, insets.right - i3);
        int max4 = Math.max(0, insets.bottom - i4);
        return (max == i && max2 == i2 && max3 == i3 && max4 == i4) ? insets : Insets.of(max, max2, max3, max4);
    }

    public static WindowInsetsCompat toWindowInsetsCompat(WindowInsets windowInsets, View view) {
        windowInsets.getClass();
        WindowInsetsCompat windowInsetsCompat = new WindowInsetsCompat(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
            WindowInsetsCompat rootWindowInsets = ViewCompat.Api23Impl.getRootWindowInsets(view);
            Impl impl = windowInsetsCompat.mImpl;
            impl.setRootWindowInsets(rootWindowInsets);
            View rootView = view.getRootView();
            impl.copyRootViewBounds(rootView);
            impl.initDisplayShape(rootView);
            impl.initTypeBoundingRectsMaps();
            impl.setSystemUiVisibility(view.getWindowSystemUiVisibility());
        }
        return windowInsetsCompat;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WindowInsetsCompat) {
            return Objects.equals(this.mImpl, ((WindowInsetsCompat) obj).mImpl);
        }
        return false;
    }

    public final int getSystemWindowInsetBottom() {
        return this.mImpl.getSystemWindowInsets().bottom;
    }

    public final int getSystemWindowInsetLeft() {
        return this.mImpl.getSystemWindowInsets().left;
    }

    public final int getSystemWindowInsetRight() {
        return this.mImpl.getSystemWindowInsets().right;
    }

    public final int getSystemWindowInsetTop() {
        return this.mImpl.getSystemWindowInsets().top;
    }

    public final int hashCode() {
        Impl impl = this.mImpl;
        if (impl == null) {
            return 0;
        }
        return impl.hashCode();
    }

    public final WindowInsetsCompat replaceSystemWindowInsets(int i, int i2, int i3, int i4) {
        int i5 = Build.VERSION.SDK_INT;
        BuilderImpl builderImpl36 = i5 >= 36 ? new BuilderImpl36(this) : i5 >= 35 ? new BuilderImpl35(this) : i5 >= 34 ? new BuilderImpl34(this) : i5 >= 31 ? new BuilderImpl31(this) : i5 >= 30 ? new BuilderImpl30(this) : new BuilderImpl29(this);
        builderImpl36.setSystemWindowInsets(Insets.of(i, i2, i3, i4));
        return builderImpl36.build();
    }

    public final WindowInsets toWindowInsets() {
        Impl impl = this.mImpl;
        if (impl instanceof Impl20) {
            return ((Impl20) impl).mPlatformInsets;
        }
        return null;
    }

    public class BuilderImpl30 extends BuilderImpl29 {
        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setInsets(int i, Insets insets) {
            this.mPlatBuilder.setInsets(TypeImpl30.toPlatformType(i), insets.toPlatformInsets());
        }

        public BuilderImpl30(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    public class BuilderImpl31 extends BuilderImpl30 {
        public BuilderImpl31(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    public class BuilderImpl34 extends BuilderImpl31 {
        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl30, androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setInsets(int i, Insets insets) {
            this.mPlatBuilder.setInsets(TypeImpl34.toPlatformType(i), insets.toPlatformInsets());
        }

        public BuilderImpl34(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    /* loaded from: classes3.dex */
    public final class BuilderImpl36 extends BuilderImpl35 {
        public BuilderImpl36(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }
    }

    public class Impl28 extends Impl21 {
        public Impl28(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat consumeDisplayCutout() {
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeDisplayCutout(), null);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Impl28)) {
                return false;
            }
            Impl28 impl28 = (Impl28) obj;
            return Objects.equals(this.mPlatformInsets, impl28.mPlatformInsets) && Objects.equals(this.mRootViewVisibleInsets, impl28.mRootViewVisibleInsets) && Impl20.systemBarVisibilityEquals(this.mSystemUiVisibility, impl28.mSystemUiVisibility);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public DisplayCutoutCompat getDisplayCutout() {
            DisplayCutout displayCutout = this.mPlatformInsets.getDisplayCutout();
            if (displayCutout == null) {
                return null;
            }
            return new DisplayCutoutCompat(displayCutout);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
            return this.mPlatformInsets.hashCode();
        }

        public Impl28(WindowInsetsCompat windowInsetsCompat, Impl28 impl28) {
            super(windowInsetsCompat, impl28);
        }
    }

    public class Impl30 extends Impl29 {
        public static final WindowInsetsCompat CONSUMED;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            CONSUMED = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, null);
        }

        public Impl30(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public final void copyRootViewBounds(View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsets(int i) {
            return Insets.toCompatInsets(this.mPlatformInsets.getInsets(TypeImpl30.toPlatformType(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsetsIgnoringVisibility(int i) {
            return Insets.toCompatInsets(this.mPlatformInsets.getInsetsIgnoringVisibility(TypeImpl30.toPlatformType(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int i) {
            return this.mPlatformInsets.isVisible(TypeImpl30.toPlatformType(i));
        }

        public Impl30(WindowInsetsCompat windowInsetsCompat, Impl30 impl30) {
            super(windowInsetsCompat, impl30);
        }
    }

    public class Impl31 extends Impl30 {
        public Impl31(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        public Impl31(WindowInsetsCompat windowInsetsCompat, Impl31 impl31) {
            super(windowInsetsCompat, impl31);
        }
    }

    public class Impl34 extends Impl31 {
        public static final WindowInsetsCompat CONSUMED;

        static {
            WindowInsets windowInsets;
            windowInsets = WindowInsets.CONSUMED;
            CONSUMED = WindowInsetsCompat.toWindowInsetsCompat(windowInsets, null);
        }

        public Impl34(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsets(int i) {
            return Insets.toCompatInsets(this.mPlatformInsets.getInsets(TypeImpl34.toPlatformType(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsetsIgnoringVisibility(int i) {
            return Insets.toCompatInsets(this.mPlatformInsets.getInsetsIgnoringVisibility(TypeImpl34.toPlatformType(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public void initDisplayShape(View view) {
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl30, androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int i) {
            return this.mPlatformInsets.isVisible(TypeImpl34.toPlatformType(i));
        }

        public Impl34(WindowInsetsCompat windowInsetsCompat, Impl34 impl34) {
            super(windowInsetsCompat, impl34);
        }
    }

    /* loaded from: classes3.dex */
    public final class Impl35 extends Impl34 {
        public Impl35(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public List<Rect> getBoundingRects(int i) {
            return this.mPlatformInsets.getBoundingRects(TypeImpl34.toPlatformType(i));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public List<Rect> getBoundingRectsIgnoringVisibility(int i) {
            return this.mPlatformInsets.getBoundingRectsIgnoringVisibility(TypeImpl34.toPlatformType(i));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public void initTypeBoundingRectsMaps() {
        }

        public Impl35(WindowInsetsCompat windowInsetsCompat, Impl35 impl35) {
            super(windowInsetsCompat, impl35);
        }
    }

    public class Impl21 extends Impl20 {
        public Insets mStableInsets;

        public Impl21(WindowInsetsCompat windowInsetsCompat, Impl21 impl21) {
            super(windowInsetsCompat, impl21);
            this.mStableInsets = null;
            this.mStableInsets = impl21.mStableInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat consumeStableInsets() {
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeStableInsets(), null);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat consumeSystemWindowInsets() {
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeSystemWindowInsets(), null);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public final Insets getStableInsets() {
            if (this.mStableInsets == null) {
                WindowInsets windowInsets = this.mPlatformInsets;
                this.mStableInsets = Insets.of(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
            }
            return this.mStableInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean isConsumed() {
            return this.mPlatformInsets.isConsumed();
        }

        public Impl21(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.mStableInsets = null;
        }
    }

    public class Impl29 extends Impl28 {
        public Insets mMandatorySystemGestureInsets;
        public Insets mSystemGestureInsets;
        public Insets mTappableElementInsets;

        public Impl29(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.mSystemGestureInsets = null;
            this.mMandatorySystemGestureInsets = null;
            this.mTappableElementInsets = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets getMandatorySystemGestureInsets() {
            if (this.mMandatorySystemGestureInsets == null) {
                this.mMandatorySystemGestureInsets = Insets.toCompatInsets(this.mPlatformInsets.getMandatorySystemGestureInsets());
            }
            return this.mMandatorySystemGestureInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets getSystemGestureInsets() {
            if (this.mSystemGestureInsets == null) {
                this.mSystemGestureInsets = Insets.toCompatInsets(this.mPlatformInsets.getSystemGestureInsets());
            }
            return this.mSystemGestureInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets getTappableElementInsets() {
            if (this.mTappableElementInsets == null) {
                this.mTappableElementInsets = Insets.toCompatInsets(this.mPlatformInsets.getTappableElementInsets());
            }
            return this.mTappableElementInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            return WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.inset(i, i2, i3, i4), null);
        }

        public Impl29(WindowInsetsCompat windowInsetsCompat, Impl29 impl29) {
            super(windowInsetsCompat, impl29);
            this.mSystemGestureInsets = null;
            this.mMandatorySystemGestureInsets = null;
            this.mTappableElementInsets = null;
        }
    }

    public abstract class BuilderImpl {
        public final WindowInsetsCompat mInsets;
        public Insets[] mInsetsTypeMask;
        public final Rect[][] mTypeBoundingRectsMap;
        public final Rect[][] mTypeMaxBoundingRectsMap;

        public BuilderImpl(WindowInsetsCompat windowInsetsCompat) {
            this.mTypeBoundingRectsMap = new Rect[10][];
            this.mTypeMaxBoundingRectsMap = new Rect[10][];
            this.mInsets = windowInsetsCompat;
            initTypeBoundingRects(windowInsetsCompat);
        }

        public final void applyInsetTypes() {
            Insets[] insetsArr = this.mInsetsTypeMask;
            if (insetsArr != null) {
                Insets insets = insetsArr[0];
                Insets insets2 = insetsArr[1];
                WindowInsetsCompat windowInsetsCompat = this.mInsets;
                if (insets2 == null) {
                    insets2 = windowInsetsCompat.mImpl.getInsets(2);
                }
                if (insets == null) {
                    insets = windowInsetsCompat.mImpl.getInsets(1);
                }
                setSystemWindowInsets(Insets.max(insets, insets2));
                Insets insets3 = this.mInsetsTypeMask[DBUtil.indexOf(16)];
                if (insets3 != null) {
                    setSystemGestureInsets(insets3);
                }
                Insets insets4 = this.mInsetsTypeMask[DBUtil.indexOf(32)];
                if (insets4 != null) {
                    setMandatorySystemGestureInsets(insets4);
                }
                Insets insets5 = this.mInsetsTypeMask[DBUtil.indexOf(64)];
                if (insets5 != null) {
                    setTappableElementInsets(insets5);
                }
            }
        }

        public abstract WindowInsetsCompat build();

        public void initTypeBoundingRects(WindowInsetsCompat windowInsetsCompat) {
            for (int i = 1; i <= 512; i <<= 1) {
                List<Rect> boundingRects = windowInsetsCompat.mImpl.getBoundingRects(i);
                int indexOf = DBUtil.indexOf(i);
                this.mTypeBoundingRectsMap[indexOf] = (Rect[]) boundingRects.toArray(new Rect[boundingRects.size()]);
                if (i != 8) {
                    List<Rect> boundingRectsIgnoringVisibility = windowInsetsCompat.mImpl.getBoundingRectsIgnoringVisibility(i);
                    this.mTypeMaxBoundingRectsMap[indexOf] = (Rect[]) boundingRectsIgnoringVisibility.toArray(new Rect[boundingRectsIgnoringVisibility.size()]);
                }
            }
        }

        public void setInsets(int i, Insets insets) {
            if (this.mInsetsTypeMask == null) {
                this.mInsetsTypeMask = new Insets[10];
            }
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.mInsetsTypeMask[DBUtil.indexOf(i2)] = insets;
                }
            }
        }

        public abstract void setMandatorySystemGestureInsets(Insets insets);

        public abstract void setStableInsets(Insets insets);

        public abstract void setSystemGestureInsets(Insets insets);

        public abstract void setSystemWindowInsets(Insets insets);

        public abstract void setTappableElementInsets(Insets insets);

        public BuilderImpl() {
            this(new WindowInsetsCompat((WindowInsetsCompat) null));
        }
    }

    public class Impl20 extends Impl {
        public static Class sAttachInfoClass = null;
        public static Field sAttachInfoField = null;
        public static Method sGetViewRootImplMethod = null;
        public static Field sVisibleInsetsField = null;
        public static boolean sVisibleRectReflectionFetched = false;
        public DisplayShapeCompat mDisplayShapeCompat;
        public Insets[] mOverriddenInsets;
        public final WindowInsets mPlatformInsets;
        public int mRootViewHeight;
        public Insets mRootViewVisibleInsets;
        public int mRootViewWidth;
        public WindowInsetsCompat mRootWindowInsets;
        public int mSystemUiVisibility;
        public Insets mSystemWindowInsets;
        public Rect[][] mTypeBoundingRectsMap;
        public Rect[][] mTypeMaxBoundingRectsMap;

        public Impl20(WindowInsetsCompat windowInsetsCompat, WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.mSystemWindowInsets = null;
            this.mTypeBoundingRectsMap = new Rect[10][];
            this.mTypeMaxBoundingRectsMap = new Rect[10][];
            this.mPlatformInsets = windowInsets;
        }

        private DisplayShapeCompat createDisplayShape(View view) {
            Display display;
            if (view == null || (display = view.getDisplay()) == null) {
                return null;
            }
            Point point = new Point();
            display.getRealSize(point);
            if (this.mHost.mImpl.isRound()) {
                return DisplayShapeCompat.create(point.x, point.y, 0, 0, 0, 0, true);
            }
            RoundedCornerCompat roundedCorner = DisplayCompat.getRoundedCorner(display, 0);
            RoundedCornerCompat roundedCorner2 = DisplayCompat.getRoundedCorner(display, 1);
            RoundedCornerCompat roundedCorner3 = DisplayCompat.getRoundedCorner(display, 2);
            RoundedCornerCompat roundedCorner4 = DisplayCompat.getRoundedCorner(display, 3);
            return DisplayShapeCompat.create(point.x, point.y, roundedCorner != null ? roundedCorner.getRadius() : 0, roundedCorner2 != null ? roundedCorner2.getRadius() : 0, roundedCorner3 != null ? roundedCorner3.getRadius() : 0, roundedCorner4 != null ? roundedCorner4.getRadius() : 0, false);
        }

        private static List<Rect> getBoundingRects(Rect[][] rectArr, int i) {
            Rect[] rectArr2;
            Rect[] rectArr3 = null;
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0 && (rectArr2 = rectArr[DBUtil.indexOf(i2)]) != null) {
                    if (rectArr3 == null) {
                        rectArr3 = rectArr2;
                    } else {
                        Rect[] rectArr4 = new Rect[rectArr3.length + rectArr2.length];
                        System.arraycopy(rectArr3, 0, rectArr4, 0, rectArr3.length);
                        System.arraycopy(rectArr2, 0, rectArr4, rectArr3.length, rectArr2.length);
                        rectArr3 = rectArr4;
                    }
                }
            }
            return rectArr3 == null ? Collections.EMPTY_LIST : Arrays.asList(rectArr3);
        }

        private Rect[] getBoundingRectsFromInsets(Insets insets) {
            ArrayList arrayList = new ArrayList();
            int i = insets.left;
            int i2 = insets.bottom;
            int i3 = insets.right;
            int i4 = insets.top;
            if (i != 0) {
                arrayList.add(new Rect(0, 0, insets.left, this.mRootViewHeight));
            }
            if (i4 != 0) {
                arrayList.add(new Rect(0, 0, this.mRootViewWidth, i4));
            }
            if (i3 != 0) {
                int i5 = this.mRootViewWidth;
                arrayList.add(new Rect(i5 - i3, 0, i5, this.mRootViewHeight));
            }
            if (i2 != 0) {
                int i6 = this.mRootViewHeight;
                arrayList.add(new Rect(0, i6 - i2, this.mRootViewWidth, i6));
            }
            return (Rect[]) arrayList.toArray(new Rect[arrayList.size()]);
        }

        private Insets getInsets(int i, boolean z) {
            Insets insets = Insets.NONE;
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0) {
                    insets = Insets.max(insets, getInsetsForType(i2, z));
                }
            }
            return insets;
        }

        private Insets getRootStableInsets() {
            WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
            return windowInsetsCompat != null ? windowInsetsCompat.mImpl.getStableInsets() : Insets.NONE;
        }

        private Insets getVisibleInsets(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                a$$ExternalSyntheticBUOutline0.m("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
                return null;
            }
            if (!sVisibleRectReflectionFetched) {
                loadReflectionField();
            }
            Method method = sGetViewRootImplMethod;
            if (method != null && sAttachInfoClass != null && sVisibleInsetsField != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) sVisibleInsetsField.get(sAttachInfoField.get(invoke));
                    if (rect != null) {
                        return Insets.of(rect.left, rect.top, rect.right, rect.bottom);
                    }
                    return null;
                } catch (ReflectiveOperationException e) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        private static void loadReflectionField() {
            try {
                sGetViewRootImplMethod = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                sAttachInfoClass = cls;
                sVisibleInsetsField = cls.getDeclaredField("mVisibleInsets");
                sAttachInfoField = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                sVisibleInsetsField.setAccessible(true);
                sAttachInfoField.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            sVisibleRectReflectionFetched = true;
        }

        public static boolean systemBarVisibilityEquals(int i, int i2) {
            return (i & 6) == (i2 & 6);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void copyRootViewBounds(View view) {
            this.mRootViewWidth = view.getWidth();
            this.mRootViewHeight = view.getHeight();
            Insets visibleInsets = getVisibleInsets(view);
            if (visibleInsets == null) {
                visibleInsets = Insets.NONE;
            }
            setRootViewData(visibleInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void copyWindowDataInto(WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.mImpl.setRootWindowInsets(this.mRootWindowInsets);
            Insets insets = this.mRootViewVisibleInsets;
            Impl impl = windowInsetsCompat.mImpl;
            impl.setRootViewData(insets);
            impl.setSystemUiVisibility(this.mSystemUiVisibility);
            impl.setDisplayShape(this.mDisplayShapeCompat);
            impl.setTypeBoundingRectsMap(this.mTypeBoundingRectsMap);
            impl.setTypeMaxBoundingRectsMap(this.mTypeMaxBoundingRectsMap);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            Impl20 impl20 = (Impl20) obj;
            return Objects.equals(this.mRootViewVisibleInsets, impl20.mRootViewVisibleInsets) && systemBarVisibilityEquals(this.mSystemUiVisibility, impl20.mSystemUiVisibility);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public List<Rect> getBoundingRectsIgnoringVisibility(int i) {
            return getBoundingRects(this.mTypeMaxBoundingRectsMap, i);
        }

        public Insets getInsetsForType(int i, boolean z) {
            Insets stableInsets;
            int i2;
            Insets insets = Insets.NONE;
            if (i != 1) {
                if (i != 2) {
                    if (i == 8) {
                        Insets[] insetsArr = this.mOverriddenInsets;
                        stableInsets = insetsArr != null ? insetsArr[DBUtil.indexOf(8)] : null;
                        if (stableInsets != null) {
                            return stableInsets;
                        }
                        Insets systemWindowInsets = getSystemWindowInsets();
                        Insets rootStableInsets = getRootStableInsets();
                        int i3 = systemWindowInsets.bottom;
                        if (i3 > rootStableInsets.bottom) {
                            return Insets.of(0, 0, 0, i3);
                        }
                        Insets insets2 = this.mRootViewVisibleInsets;
                        if (insets2 != null && !insets2.equals(insets) && (i2 = this.mRootViewVisibleInsets.bottom) > rootStableInsets.bottom) {
                            return Insets.of(0, 0, 0, i2);
                        }
                    } else {
                        if (i == 16) {
                            return getSystemGestureInsets();
                        }
                        if (i == 32) {
                            return getMandatorySystemGestureInsets();
                        }
                        if (i == 64) {
                            return getTappableElementInsets();
                        }
                        if (i == 128) {
                            WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
                            DisplayCutoutCompat displayCutout = windowInsetsCompat != null ? windowInsetsCompat.mImpl.getDisplayCutout() : getDisplayCutout();
                            if (displayCutout != null) {
                                DisplayCutout displayCutout2 = displayCutout.mDisplayCutout;
                                return Insets.of(DisplayCutoutCompat.Api28Impl.getSafeInsetLeft(displayCutout2), DisplayCutoutCompat.Api28Impl.getSafeInsetTop(displayCutout2), DisplayCutoutCompat.Api28Impl.getSafeInsetRight(displayCutout2), DisplayCutoutCompat.Api28Impl.getSafeInsetBottom(displayCutout2));
                            }
                        }
                    }
                } else {
                    if (z) {
                        Insets rootStableInsets2 = getRootStableInsets();
                        Insets stableInsets2 = getStableInsets();
                        return Insets.of(Math.max(rootStableInsets2.left, stableInsets2.left), 0, Math.max(rootStableInsets2.right, stableInsets2.right), Math.max(rootStableInsets2.bottom, stableInsets2.bottom));
                    }
                    if ((this.mSystemUiVisibility & 2) == 0) {
                        Insets systemWindowInsets2 = getSystemWindowInsets();
                        WindowInsetsCompat windowInsetsCompat2 = this.mRootWindowInsets;
                        stableInsets = windowInsetsCompat2 != null ? windowInsetsCompat2.mImpl.getStableInsets() : null;
                        int i4 = systemWindowInsets2.bottom;
                        if (stableInsets != null) {
                            i4 = Math.min(i4, stableInsets.bottom);
                        }
                        return Insets.of(systemWindowInsets2.left, 0, systemWindowInsets2.right, i4);
                    }
                }
            } else {
                if (z) {
                    return Insets.of(0, Math.max(getRootStableInsets().top, getSystemWindowInsets().top), 0, 0);
                }
                if ((this.mSystemUiVisibility & 4) == 0) {
                    return Insets.of(0, getSystemWindowInsets().top, 0, 0);
                }
            }
            return insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsetsIgnoringVisibility(int i) {
            return getInsets(i, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public final Insets getSystemWindowInsets() {
            if (this.mSystemWindowInsets == null) {
                WindowInsets windowInsets = this.mPlatformInsets;
                this.mSystemWindowInsets = Insets.of(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
            }
            return this.mSystemWindowInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void initDisplayShape(View view) {
            this.mDisplayShapeCompat = createDisplayShape(view);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void initTypeBoundingRectsMaps() {
            for (int i = 1; i <= 512; i <<= 1) {
                int indexOf = DBUtil.indexOf(i);
                this.mTypeBoundingRectsMap[indexOf] = getBoundingRectsFromInsets(getInsets(i));
                if (i != 8) {
                    this.mTypeMaxBoundingRectsMap[indexOf] = getBoundingRectsFromInsets(getInsetsIgnoringVisibility(i));
                }
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets, null);
            int i5 = Build.VERSION.SDK_INT;
            BuilderImpl builderImpl36 = i5 >= 36 ? new BuilderImpl36(windowInsetsCompat) : i5 >= 35 ? new BuilderImpl35(windowInsetsCompat) : i5 >= 34 ? new BuilderImpl34(windowInsetsCompat) : i5 >= 31 ? new BuilderImpl31(windowInsetsCompat) : i5 >= 30 ? new BuilderImpl30(windowInsetsCompat) : new BuilderImpl29(windowInsetsCompat);
            builderImpl36.setSystemWindowInsets(WindowInsetsCompat.insetInsets(getSystemWindowInsets(), i, i2, i3, i4));
            builderImpl36.setStableInsets(WindowInsetsCompat.insetInsets(getStableInsets(), i, i2, i3, i4));
            return builderImpl36.build();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean isRound() {
            return this.mPlatformInsets.isRound();
        }

        public boolean isTypeVisible(int i) {
            if (i != 1 && i != 2) {
                if (i == 4) {
                    return false;
                }
                if (i != 8 && i != 128) {
                    return true;
                }
            }
            return !getInsetsForType(i, false).equals(Insets.NONE);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int i) {
            for (int i2 = 1; i2 <= 512; i2 <<= 1) {
                if ((i & i2) != 0 && !isTypeVisible(i2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setDisplayShape(DisplayShapeCompat displayShapeCompat) {
            this.mDisplayShapeCompat = displayShapeCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setOverriddenInsets(Insets[] insetsArr) {
            this.mOverriddenInsets = insetsArr;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setRootViewData(Insets insets) {
            this.mRootViewVisibleInsets = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setRootWindowInsets(WindowInsetsCompat windowInsetsCompat) {
            this.mRootWindowInsets = windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setSystemUiVisibility(int i) {
            this.mSystemUiVisibility = i;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setTypeBoundingRectsMap(Rect[][] rectArr) {
            Objects.requireNonNull(rectArr);
            this.mTypeBoundingRectsMap = (Rect[][]) rectArr.clone();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setTypeMaxBoundingRectsMap(Rect[][] rectArr) {
            Objects.requireNonNull(rectArr);
            this.mTypeMaxBoundingRectsMap = (Rect[][]) rectArr.clone();
        }

        public Impl20(WindowInsetsCompat windowInsetsCompat, Impl20 impl20) {
            this(windowInsetsCompat, new WindowInsets(impl20.mPlatformInsets));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public Insets getInsets(int i) {
            return getInsets(i, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public List<Rect> getBoundingRects(int i) {
            return getBoundingRects(this.mTypeBoundingRectsMap, i);
        }
    }

    public class BuilderImpl29 extends BuilderImpl {
        public final WindowInsets.Builder mPlatBuilder;

        public BuilderImpl29(WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            this.mPlatBuilder = windowInsets != null ? new WindowInsets.Builder(windowInsets) : new WindowInsets.Builder();
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public WindowInsetsCompat build() {
            applyInsetTypes();
            WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.toWindowInsetsCompat(this.mPlatBuilder.build(), null);
            Insets[] insetsArr = this.mInsetsTypeMask;
            Impl impl = windowInsetsCompat.mImpl;
            impl.setOverriddenInsets(insetsArr);
            impl.setDisplayShape(null);
            impl.setTypeBoundingRectsMap(this.mTypeBoundingRectsMap);
            impl.setTypeMaxBoundingRectsMap(this.mTypeMaxBoundingRectsMap);
            return windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setMandatorySystemGestureInsets(Insets insets) {
            this.mPlatBuilder.setMandatorySystemGestureInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setStableInsets(Insets insets) {
            this.mPlatBuilder.setStableInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setSystemGestureInsets(Insets insets) {
            this.mPlatBuilder.setSystemGestureInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setSystemWindowInsets(Insets insets) {
            this.mPlatBuilder.setSystemWindowInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        public void setTappableElementInsets(Insets insets) {
            this.mPlatBuilder.setTappableElementInsets(insets.toPlatformInsets());
        }

        public BuilderImpl29() {
            this.mPlatBuilder = new WindowInsets.Builder();
        }
    }

    public WindowInsetsCompat(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            this.mImpl = new Impl35(this, windowInsets);
            return;
        }
        if (i >= 34) {
            this.mImpl = new Impl34(this, windowInsets);
            return;
        }
        if (i >= 31) {
            this.mImpl = new Impl31(this, windowInsets);
        } else if (i >= 30) {
            this.mImpl = new Impl30(this, windowInsets);
        } else {
            this.mImpl = new Impl29(this, windowInsets);
        }
    }
}
