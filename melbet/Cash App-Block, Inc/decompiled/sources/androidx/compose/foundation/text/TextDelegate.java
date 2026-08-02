package androidx.compose.foundation.text;

import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.BundleKt;
import coil3.ComponentRegistry;
import java.util.List;

/* loaded from: classes3.dex */
public final class TextDelegate {
    public final Density density;
    public final FontFamilyResolverImpl fontFamilyResolver;
    public LayoutDirection intrinsicsLayoutDirection;
    public final int maxLines = Integer.MAX_VALUE;
    public final int minLines = 1;
    public final int overflow = 1;
    public ComponentRegistry.Builder paragraphIntrinsics;
    public final List placeholders;
    public final boolean softWrap;
    public final TextStyle style;
    public final AnnotatedString text;

    public TextDelegate(AnnotatedString annotatedString, TextStyle textStyle, boolean z, Density density, FontFamilyResolverImpl fontFamilyResolverImpl, List list) {
        this.text = annotatedString;
        this.style = textStyle;
        this.softWrap = z;
        this.density = density;
        this.fontFamilyResolver = fontFamilyResolverImpl;
        this.placeholders = list;
    }

    public final void layoutIntrinsics(LayoutDirection layoutDirection) {
        ComponentRegistry.Builder builder = this.paragraphIntrinsics;
        if (builder == null || layoutDirection != this.intrinsicsLayoutDirection || builder.getHasStaleResolvedFonts()) {
            this.intrinsicsLayoutDirection = layoutDirection;
            builder = new ComponentRegistry.Builder(this.text, BundleKt.resolveDefaults(this.style, layoutDirection), this.placeholders, this.density, this.fontFamilyResolver);
        }
        this.paragraphIntrinsics = builder;
    }
}
