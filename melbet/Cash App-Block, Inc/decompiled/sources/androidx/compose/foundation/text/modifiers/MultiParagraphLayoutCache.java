package androidx.compose.foundation.text.modifiers;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.BundleKt;
import coil3.ComponentRegistry;
import coil3.size.SizeKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadn;
import java.util.List;
import kotlin.collections.EmptyList;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class MultiParagraphLayoutCache {
    public Density density;
    public FontFamilyResolverImpl fontFamilyResolver;
    public long historyFlag;
    public LayoutDirection intrinsicsLayoutDirection;
    public TextLayoutResult layoutCache;
    public MinLinesConstrainer mMinLinesConstrainer;
    public int maxLines;
    public int minLines;
    public int overflow;
    public ComponentRegistry.Builder paragraphIntrinsics;
    public List placeholders;
    public boolean softWrap;
    public TextStyle style;
    public AnnotatedString text;
    public long lastDensity = InlineDensity.Unspecified;
    public int cachedIntrinsicHeightInputWidth = -1;
    public int cachedIntrinsicHeight = -1;

    public MultiParagraphLayoutCache(AnnotatedString annotatedString, TextStyle textStyle, FontFamilyResolverImpl fontFamilyResolverImpl, int i, boolean z, int i2, int i3, List list) {
        this.text = annotatedString;
        this.fontFamilyResolver = fontFamilyResolverImpl;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.placeholders = list;
        this.style = textStyle;
    }

    public final int intrinsicHeight(int i, LayoutDirection layoutDirection) {
        int i2 = this.cachedIntrinsicHeightInputWidth;
        int i3 = this.cachedIntrinsicHeight;
        if (i == i2 && i2 != -1) {
            return i3;
        }
        long Constraints = ConstraintsKt.Constraints(0, i, 0, Integer.MAX_VALUE);
        if (this.minLines > 1) {
            MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
            TextStyle textStyle = this.style;
            Density density = this.density;
            density.getClass();
            MinLinesConstrainer from = zzadn.from(minLinesConstrainer, layoutDirection, textStyle, density, this.fontFamilyResolver);
            this.mMinLinesConstrainer = from;
            Constraints = from.m426coerceMinLinesOh53vG4$foundation(this.minLines, Constraints);
        }
        int ceilToIntPx = BasicTextKt.ceilToIntPx(m427layoutTextK40F9xA(Constraints, layoutDirection).height);
        int m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(Constraints);
        if (ceilToIntPx < m1026getMinHeightimpl) {
            ceilToIntPx = m1026getMinHeightimpl;
        }
        this.cachedIntrinsicHeightInputWidth = i;
        this.cachedIntrinsicHeight = ceilToIntPx;
        return ceilToIntPx;
    }

    /* renamed from: layoutText-K40F9xA, reason: not valid java name */
    public final MultiParagraph m427layoutTextK40F9xA(long j, LayoutDirection layoutDirection) {
        ComponentRegistry.Builder layoutDirection2 = setLayoutDirection(layoutDirection);
        long m1470finalConstraintstfFHcEY = SizeKt.m1470finalConstraintstfFHcEY(layoutDirection2.getMaxIntrinsicWidth(), this.overflow, j, this.softWrap);
        boolean z = this.softWrap;
        int i = this.overflow;
        int i2 = this.maxLines;
        return new MultiParagraph(layoutDirection2, m1470finalConstraintstfFHcEY, ((z || !(i == 2 || i == 4 || i == 5)) && i2 >= 1) ? i2 : 1, i);
    }

    /* renamed from: layoutWithConstraints-K40F9xA, reason: not valid java name */
    public final boolean m428layoutWithConstraintsK40F9xA(long j, LayoutDirection layoutDirection) {
        this.historyFlag = (this.historyFlag << 2) | 3;
        if (this.minLines > 1) {
            MinLinesConstrainer minLinesConstrainer = this.mMinLinesConstrainer;
            TextStyle textStyle = this.style;
            Density density = this.density;
            density.getClass();
            MinLinesConstrainer from = zzadn.from(minLinesConstrainer, layoutDirection, textStyle, density, this.fontFamilyResolver);
            this.mMinLinesConstrainer = from;
            j = from.m426coerceMinLinesOh53vG4$foundation(this.minLines, j);
        }
        TextLayoutResult textLayoutResult = this.layoutCache;
        if (textLayoutResult != null) {
            MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
            TextLayoutInput textLayoutInput = textLayoutResult.layoutInput;
            if (!multiParagraph.intrinsics.getHasStaleResolvedFonts()) {
                LayoutDirection layoutDirection2 = textLayoutInput.layoutDirection;
                long j2 = textLayoutInput.constraints;
                if (layoutDirection == layoutDirection2 && (Constraints.m1019equalsimpl0(j, j2) || (Constraints.m1025getMaxWidthimpl(j) == Constraints.m1025getMaxWidthimpl(j2) && Constraints.m1027getMinWidthimpl(j) == Constraints.m1027getMinWidthimpl(j2) && Constraints.m1024getMaxHeightimpl(j) >= multiParagraph.height && !multiParagraph.didExceedMaxLines))) {
                    TextLayoutResult textLayoutResult2 = this.layoutCache;
                    textLayoutResult2.getClass();
                    if (Constraints.m1019equalsimpl0(j, textLayoutResult2.layoutInput.constraints)) {
                        return false;
                    }
                    TextLayoutResult textLayoutResult3 = this.layoutCache;
                    textLayoutResult3.getClass();
                    this.layoutCache = m429textLayoutResultVKLhPVY(layoutDirection, j, textLayoutResult3.multiParagraph);
                    return true;
                }
            }
        }
        this.layoutCache = m429textLayoutResultVKLhPVY(layoutDirection, j, m427layoutTextK40F9xA(j, layoutDirection));
        return true;
    }

    public final void setDensity$foundation(Density density) {
        long j;
        Density density2 = this.density;
        if (density != null) {
            int i = InlineDensity.$r8$clinit;
            j = InlineDensity.m424constructorimpl(density.getDensity(), density.getFontScale());
        } else {
            j = InlineDensity.Unspecified;
        }
        if (density2 == null) {
            this.density = density;
            this.lastDensity = j;
        } else if (density == null || this.lastDensity != j) {
            this.density = density;
            this.lastDensity = j;
            this.historyFlag = (this.historyFlag << 2) | 1;
            this.paragraphIntrinsics = null;
            this.layoutCache = null;
            this.cachedIntrinsicHeight = -1;
            this.cachedIntrinsicHeightInputWidth = -1;
        }
    }

    public final ComponentRegistry.Builder setLayoutDirection(LayoutDirection layoutDirection) {
        ComponentRegistry.Builder builder = this.paragraphIntrinsics;
        if (builder == null || layoutDirection != this.intrinsicsLayoutDirection || builder.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            AnnotatedString annotatedString = this.text;
            TextStyle resolveDefaults = BundleKt.resolveDefaults(this.style, layoutDirection);
            Density density = this.density;
            density.getClass();
            FontFamilyResolverImpl fontFamilyResolverImpl = this.fontFamilyResolver;
            List list = this.placeholders;
            if (list == null) {
                list = EmptyList.INSTANCE;
            }
            builder = new ComponentRegistry.Builder(annotatedString, resolveDefaults, list, density, fontFamilyResolverImpl);
        }
        this.paragraphIntrinsics = builder;
        return builder;
    }

    /* renamed from: textLayoutResult-VKLhPVY, reason: not valid java name */
    public final TextLayoutResult m429textLayoutResultVKLhPVY(LayoutDirection layoutDirection, long j, MultiParagraph multiParagraph) {
        float min = Math.min(multiParagraph.intrinsics.getMaxIntrinsicWidth(), multiParagraph.width);
        AnnotatedString annotatedString = this.text;
        TextStyle textStyle = this.style;
        List list = this.placeholders;
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        int i = this.maxLines;
        boolean z = this.softWrap;
        int i2 = this.overflow;
        Density density = this.density;
        density.getClass();
        return new TextLayoutResult(new TextLayoutInput(annotatedString, textStyle, list, i, z, i2, density, layoutDirection, this.fontFamilyResolver, j), multiParagraph, ConstraintsKt.m1030constrain4WqzIAM(j, (BasicTextKt.ceilToIntPx(min) << 32) | (BasicTextKt.ceilToIntPx(multiParagraph.height) & BodyPartID.bodyIdMax)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MultiParagraphLayoutCache(textLayoutResult=");
        sb.append(this.layoutCache != null ? "<TextLayoutResult>" : "null");
        sb.append(", lastDensity=");
        sb.append((Object) InlineDensity.m425toStringimpl(this.lastDensity));
        sb.append(", history=");
        sb.append(this.historyFlag);
        sb.append(", constraints=");
        TextLayoutResult textLayoutResult = this.layoutCache;
        return Recorder$$ExternalSyntheticOutline1.m(sb, textLayoutResult != null ? new Constraints(textLayoutResult.layoutInput.constraints) : "null", ')');
    }

    /* renamed from: update-J2qo7bo, reason: not valid java name */
    public final void m430updateJ2qo7bo(AnnotatedString annotatedString, TextStyle textStyle, FontFamilyResolverImpl fontFamilyResolverImpl, int i, boolean z, int i2, int i3, List list) {
        this.text = annotatedString;
        boolean hasSameLayoutAffectingAttributes = textStyle.hasSameLayoutAffectingAttributes(this.style);
        this.style = textStyle;
        if (!hasSameLayoutAffectingAttributes) {
            this.historyFlag <<= 2;
            this.paragraphIntrinsics = null;
            this.layoutCache = null;
            this.cachedIntrinsicHeight = -1;
            this.cachedIntrinsicHeightInputWidth = -1;
        }
        this.fontFamilyResolver = fontFamilyResolverImpl;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.placeholders = list;
        this.historyFlag = (this.historyFlag << 2) | 2;
        this.paragraphIntrinsics = null;
        this.layoutCache = null;
        this.cachedIntrinsicHeight = -1;
        this.cachedIntrinsicHeightInputWidth = -1;
    }
}
