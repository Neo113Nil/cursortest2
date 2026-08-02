package androidx.compose.foundation.text.modifiers;

import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.DensityImpl;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.BundleKt;
import com.squareup.util.Strings;

/* loaded from: classes3.dex */
public final class MinLinesConstrainer {
    public static MinLinesConstrainer last;
    public final DensityImpl density;
    public final FontFamilyResolverImpl fontFamilyResolver;
    public final TextStyle inputTextStyle;
    public final LayoutDirection layoutDirection;
    public float lineHeightCache = Float.NaN;
    public float oneLineHeightCache = Float.NaN;
    public final TextStyle resolvedStyle;

    public MinLinesConstrainer(LayoutDirection layoutDirection, TextStyle textStyle, DensityImpl densityImpl, FontFamilyResolverImpl fontFamilyResolverImpl) {
        this.layoutDirection = layoutDirection;
        this.inputTextStyle = textStyle;
        this.density = densityImpl;
        this.fontFamilyResolver = fontFamilyResolverImpl;
        this.resolvedStyle = BundleKt.resolveDefaults(textStyle, layoutDirection);
    }

    /* renamed from: coerceMinLines-Oh53vG4$foundation, reason: not valid java name */
    public final long m426coerceMinLinesOh53vG4$foundation(int i, long j) {
        int m1026getMinHeightimpl;
        float f = this.oneLineHeightCache;
        float f2 = this.lineHeightCache;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = MinLinesConstrainerKt.EmptyTextReplacement;
            long Constraints$default = ConstraintsKt.Constraints$default(0, 0, 0, 0, 15);
            TextStyle textStyle = this.resolvedStyle;
            DensityImpl densityImpl = this.density;
            float height = Strings.m3985ParagraphUl8oQg4$default(str, textStyle, Constraints$default, densityImpl, this.fontFamilyResolver, null, 1, 96).getHeight();
            float height2 = Strings.m3985ParagraphUl8oQg4$default(MinLinesConstrainerKt.TwoLineTextReplacement, this.resolvedStyle, ConstraintsKt.Constraints$default(0, 0, 0, 0, 15), densityImpl, this.fontFamilyResolver, null, 2, 96).getHeight() - height;
            this.oneLineHeightCache = height;
            this.lineHeightCache = height2;
            f2 = height2;
            f = height;
        }
        if (i != 1) {
            int round = Math.round((f2 * (i - 1)) + f);
            m1026getMinHeightimpl = round >= 0 ? round : 0;
            int m1024getMaxHeightimpl = Constraints.m1024getMaxHeightimpl(j);
            if (m1026getMinHeightimpl > m1024getMaxHeightimpl) {
                m1026getMinHeightimpl = m1024getMaxHeightimpl;
            }
        } else {
            m1026getMinHeightimpl = Constraints.m1026getMinHeightimpl(j);
        }
        return ConstraintsKt.Constraints(Constraints.m1027getMinWidthimpl(j), Constraints.m1025getMaxWidthimpl(j), m1026getMinHeightimpl, Constraints.m1024getMaxHeightimpl(j));
    }
}
