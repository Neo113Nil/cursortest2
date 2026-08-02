package com.google.android.filament;

import android.view.ViewGroup;
import androidx.core.graphics.Insets;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.WindowInsetsCompat;
import androidx.media3.common.FlagSet;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.libraries.places.widget.internal.placedetails.photoviewer.PlacesLightboxActivity;
import kotlin.reflect.KProperty;

/* loaded from: classes6.dex */
public class Renderer {
    public FlagSet.Builder mClearOptions;
    public DisplayInfo mDisplayInfo;
    public long mNativeObject;

    private static native boolean nBeginFrame(long j, long j2, long j3);

    private static native void nEndFrame(long j);

    private static native void nRender(long j, long j2);

    private static native void nSetClearOptions(long j, float f, float f2, float f3, float f4, boolean z, boolean z2);

    private static native void nSetDisplayInfo(long j, float f);

    public final boolean beginFrame(SwapChain swapChain, long j) {
        long nativeObject = getNativeObject();
        long j2 = swapChain.mNativeObject;
        if (j2 != 0) {
            return nBeginFrame(nativeObject, j2, j);
        }
        a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed SwapChain");
        return false;
    }

    public final void endFrame() {
        nEndFrame(getNativeObject());
    }

    public final long getNativeObject() {
        long j = this.mNativeObject;
        if (j != 0) {
            return j;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Calling method on destroyed Renderer");
        return 0L;
    }

    public final void render(View view) {
        nRender(getNativeObject(), view.getNativeObject());
    }

    public final void setClearOptions(FlagSet.Builder builder) {
        this.mClearOptions = builder;
        long nativeObject = getNativeObject();
        float[] fArr = (float[]) builder.flags;
        nSetClearOptions(nativeObject, fArr[0], fArr[1], fArr[2], fArr[3], builder.buildCalled, true);
    }

    public final void setDisplayInfo(DisplayInfo displayInfo) {
        this.mDisplayInfo = displayInfo;
        nSetDisplayInfo(getNativeObject(), displayInfo.refreshRate);
    }

    /* loaded from: classes4.dex */
    public final class DisplayInfo implements OnApplyWindowInsetsListener {
        public final /* synthetic */ int $r8$classId;
        public float refreshRate;

        public DisplayInfo(int i) {
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    break;
                default:
                    this.refreshRate = 60.0f;
                    break;
            }
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(android.view.View view, WindowInsetsCompat windowInsetsCompat) {
            int i = this.$r8$classId;
            float f = this.refreshRate;
            switch (i) {
                case 2:
                    KProperty[] kPropertyArr = PlacesLightboxActivity.zza;
                    view.getClass();
                    Insets insets = windowInsetsCompat.mImpl.getInsets(519);
                    insets.getClass();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        break;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.setMarginStart((view.getLayoutDirection() == 1 ? insets.right : insets.left) + ((int) f));
                        view.setLayoutParams(marginLayoutParams);
                        break;
                    }
                case 3:
                    KProperty[] kPropertyArr2 = PlacesLightboxActivity.zza;
                    view.getClass();
                    Insets insets2 = windowInsetsCompat.mImpl.getInsets(519);
                    insets2.getClass();
                    ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                    if (layoutParams2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        break;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        marginLayoutParams2.setMarginEnd((view.getLayoutDirection() == 1 ? insets2.left : insets2.right) + ((int) f));
                        view.setLayoutParams(marginLayoutParams2);
                        break;
                    }
                default:
                    KProperty[] kPropertyArr3 = PlacesLightboxActivity.zza;
                    view.getClass();
                    Insets insets3 = windowInsetsCompat.mImpl.getInsets(519);
                    insets3.getClass();
                    int i2 = insets3.left;
                    int i3 = insets3.right;
                    ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                    if (layoutParams3 == null) {
                        a$$ExternalSyntheticBUOutline0.m$2("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                        break;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams3;
                        marginLayoutParams3.topMargin = insets3.top;
                        int i4 = (int) f;
                        marginLayoutParams3.setMarginStart((view.getLayoutDirection() == 1 ? i3 : i2) + i4);
                        if (view.getLayoutDirection() != 1) {
                            i2 = i3;
                        }
                        marginLayoutParams3.setMarginEnd(i2 + i4);
                        view.setLayoutParams(marginLayoutParams3);
                        break;
                    }
            }
            return null;
        }

        public /* synthetic */ DisplayInfo(PlacesLightboxActivity placesLightboxActivity, float f, int i) {
            this.$r8$classId = i;
            this.refreshRate = f;
        }
    }
}
