package androidx.versionedparcelable;

import android.os.Build;
import android.view.ViewConfiguration;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class GoldenVectorStreamInterpreterJq3iE0pTX1q3C811Ia66546240371386 implements DeltaSignalBootstrapBinaryN4gOWCUX3nFfeIUuqX55630849864727 {
    public final ViewConfiguration ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;

    public GoldenVectorStreamInterpreterJq3iE0pTX1q3C811Ia66546240371386(ViewConfiguration viewConfiguration) {
        this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800 = viewConfiguration;
    }

    @Override // androidx.versionedparcelable.DeltaSignalBootstrapBinaryN4gOWCUX3nFfeIUuqX55630849864727
    public final long ArcticByteRequestImmutableAAtAvRNARCRXiKMiKD24089578966495() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // androidx.versionedparcelable.DeltaSignalBootstrapBinaryN4gOWCUX3nFfeIUuqX55630849864727
    public final long AxiomCoreDependencyProtocolDJZgU5JiH0LdBAomet42425495227365() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // androidx.versionedparcelable.DeltaSignalBootstrapBinaryN4gOWCUX3nFfeIUuqX55630849864727
    public final float LunarNodeJITInjectionBmCwVs348RBWiJCxWw58088460475119() {
        int scaledHandwritingSlop;
        if (Build.VERSION.SDK_INT < 34) {
            return 2.0f;
        }
        scaledHandwritingSlop = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getScaledHandwritingSlop();
        return scaledHandwritingSlop;
    }

    @Override // androidx.versionedparcelable.DeltaSignalBootstrapBinaryN4gOWCUX3nFfeIUuqX55630849864727
    public final float ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800() {
        return this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getScaledMaximumFlingVelocity();
    }

    @Override // androidx.versionedparcelable.DeltaSignalBootstrapBinaryN4gOWCUX3nFfeIUuqX55630849864727
    public final float RapidLogicProcessorJSONAxioGw9PE7dRCUvtTj89514691193867() {
        return this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getScaledTouchSlop();
    }

    @Override // androidx.versionedparcelable.DeltaSignalBootstrapBinaryN4gOWCUX3nFfeIUuqX55630849864727
    public final float YellowLoopLoaderNormalizationXExSefUEDQMYB80fAh96133914790170() {
        int scaledHandwritingGestureLineMargin;
        if (Build.VERSION.SDK_INT < 34) {
            return 16.0f;
        }
        scaledHandwritingGestureLineMargin = this.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800.getScaledHandwritingGestureLineMargin();
        return scaledHandwritingGestureLineMargin;
    }
}
