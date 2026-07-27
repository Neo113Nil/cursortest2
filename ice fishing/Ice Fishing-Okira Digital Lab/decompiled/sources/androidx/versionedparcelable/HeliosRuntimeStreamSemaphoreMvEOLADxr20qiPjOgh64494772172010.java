package androidx.versionedparcelable;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Layout;
import android.text.style.LeadingMarginSpan;

/* compiled from: r8-map-id-30b448d4aea92b7ca08aa98ecb87d6bc49bf391f2fd37f06e0a9b205a292647a */
/* loaded from: classes.dex */
public final class HeliosRuntimeStreamSemaphoreMvEOLADxr20qiPjOgh64494772172010 implements LeadingMarginSpan {
    @Override // android.text.style.LeadingMarginSpan
    public final void drawLeadingMargin(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, boolean z, Layout layout) {
        int lineForOffset;
        if (layout == null || paint == null || (lineForOffset = layout.getLineForOffset(i6)) != layout.getLineCount() - 1) {
            return;
        }
        ThreadLocal threadLocal = KryptonFlowMiddlewareCryptographyDfDjn7R2Z1qijIDqlm71510751065434.ObsidianEngineAlgorithmBinaryVTE4hXGvz1xtAgnOMB37574137692800;
        if (layout.getEllipsisCount(lineForOffset) > 0) {
            float CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927 = KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927(layout, lineForOffset, paint) + KryptonFlowStaticInjectionPV4lXh9ffrgFgYPPPd42535495641289.PhotonFrameFilterJITAeT2SDHL9pSK7KtI7w36828414417036(layout, lineForOffset, paint);
            if (CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927 == 0.0f) {
                return;
            }
            canvas.getClass();
            canvas.translate(CosmicForgeBinaryTreeBinaryU8A2vaX9upfIaxNx3r99356828111927, 0.0f);
        }
    }

    @Override // android.text.style.LeadingMarginSpan
    public final int getLeadingMargin(boolean z) {
        return 0;
    }
}
