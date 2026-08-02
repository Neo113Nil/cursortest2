package androidx.compose.ui.text;

import androidx.collection.LruCache;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.os.BundleKt;
import coil3.ComponentRegistry;
import coil3.size.DimensionKt;
import com.squareup.wire.GrpcMethod;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class TextMeasurer {
    public final Density defaultDensity;
    public final FontFamilyResolverImpl defaultFontFamilyResolver;
    public final LayoutDirection defaultLayoutDirection;
    public final GrpcMethod textLayoutCache;

    public TextMeasurer(FontFamilyResolverImpl fontFamilyResolverImpl, Density density, LayoutDirection layoutDirection, int i) {
        GrpcMethod grpcMethod;
        this.defaultFontFamilyResolver = fontFamilyResolverImpl;
        this.defaultDensity = density;
        this.defaultLayoutDirection = layoutDirection;
        if (i > 0) {
            grpcMethod = new GrpcMethod();
            grpcMethod.path = i != 1 ? new LruCache(i) : null;
        } else {
            grpcMethod = null;
        }
        this.textLayoutCache = grpcMethod;
    }

    /* renamed from: measure-wNUYSr0$default, reason: not valid java name */
    public static TextLayoutResult m979measurewNUYSr0$default(TextMeasurer textMeasurer, String str, TextStyle textStyle, int i, long j, int i2) {
        if ((i2 & 16) != 0) {
            i = Integer.MAX_VALUE;
        }
        int i3 = i;
        long Constraints$default = (i2 & 32) != 0 ? ConstraintsKt.Constraints$default(0, 0, 0, 0, 15) : j;
        LayoutDirection layoutDirection = textMeasurer.defaultLayoutDirection;
        Density density = textMeasurer.defaultDensity;
        FontFamilyResolverImpl fontFamilyResolverImpl = textMeasurer.defaultFontFamilyResolver;
        textMeasurer.getClass();
        return m980measurexDpz5zY$default(textMeasurer, new AnnotatedString(str), textStyle, true, i3, Constraints$default, layoutDirection, density, fontFamilyResolverImpl, 32);
    }

    /* renamed from: measure-xDpz5zY$default, reason: not valid java name */
    public static TextLayoutResult m980measurexDpz5zY$default(TextMeasurer textMeasurer, AnnotatedString annotatedString, TextStyle textStyle, boolean z, int i, long j, LayoutDirection layoutDirection, Density density, FontFamilyResolverImpl fontFamilyResolverImpl, int i2) {
        TextLayoutResult textLayoutResult;
        boolean z2 = (i2 & 8) != 0 ? true : z;
        int i3 = Integer.MAX_VALUE;
        int i4 = (i2 & 16) != 0 ? Integer.MAX_VALUE : i;
        EmptyList emptyList = EmptyList.INSTANCE;
        LayoutDirection layoutDirection2 = (i2 & 128) != 0 ? textMeasurer.defaultLayoutDirection : layoutDirection;
        Density density2 = (i2 & 256) != 0 ? textMeasurer.defaultDensity : density;
        FontFamilyResolverImpl fontFamilyResolverImpl2 = (i2 & 512) != 0 ? textMeasurer.defaultFontFamilyResolver : fontFamilyResolverImpl;
        GrpcMethod grpcMethod = textMeasurer.textLayoutCache;
        int i5 = i4;
        TextLayoutInput textLayoutInput = new TextLayoutInput(annotatedString, textStyle, emptyList, i5, z2, 1, density2, layoutDirection2, fontFamilyResolverImpl2, j);
        TextLayoutResult textLayoutResult2 = null;
        if (grpcMethod != null) {
            CacheTextLayoutInput cacheTextLayoutInput = new CacheTextLayoutInput(textLayoutInput);
            LruCache lruCache = (LruCache) grpcMethod.path;
            if (lruCache != null) {
                textLayoutResult = (TextLayoutResult) lruCache.get(cacheTextLayoutInput);
            } else if (Intrinsics.areEqual((CacheTextLayoutInput) grpcMethod.requestAdapter, cacheTextLayoutInput)) {
                textLayoutResult = (TextLayoutResult) grpcMethod.responseAdapter;
            }
            if (textLayoutResult != null && !textLayoutResult.multiParagraph.intrinsics.getHasStaleResolvedFonts()) {
                textLayoutResult2 = textLayoutResult;
            }
        }
        if (textLayoutResult2 != null) {
            return new TextLayoutResult(textLayoutInput, textLayoutResult2.multiParagraph, ConstraintsKt.m1030constrain4WqzIAM(j, (((int) Math.ceil(r3.width)) << 32) | (((int) Math.ceil(r3.height)) & BodyPartID.bodyIdMax)));
        }
        ComponentRegistry.Builder builder = new ComponentRegistry.Builder(annotatedString, BundleKt.resolveDefaults(textStyle, layoutDirection2), (List) emptyList, density2, fontFamilyResolverImpl2);
        int m1027getMinWidthimpl = Constraints.m1027getMinWidthimpl(j);
        if (z2 && Constraints.m1021getHasBoundedWidthimpl(j)) {
            i3 = Constraints.m1025getMaxWidthimpl(j);
        }
        if (m1027getMinWidthimpl != i3) {
            i3 = RangesKt___RangesKt.coerceIn((int) Math.ceil(builder.getMaxIntrinsicWidth()), m1027getMinWidthimpl, i3);
        }
        TextLayoutResult textLayoutResult3 = new TextLayoutResult(textLayoutInput, new MultiParagraph(builder, DimensionKt.m1465fitPrioritizingWidthZbe2FdA(0, i3, 0, Constraints.m1024getMaxHeightimpl(j)), i5, 1), ConstraintsKt.m1030constrain4WqzIAM(j, (((int) Math.ceil(r6.height)) & BodyPartID.bodyIdMax) | (((int) Math.ceil(r6.width)) << 32)));
        if (grpcMethod != null) {
            LruCache lruCache2 = (LruCache) grpcMethod.path;
            if (lruCache2 != null) {
                lruCache2.put(new CacheTextLayoutInput(textLayoutInput), textLayoutResult3);
                return textLayoutResult3;
            }
            grpcMethod.requestAdapter = new CacheTextLayoutInput(textLayoutInput);
            grpcMethod.responseAdapter = textLayoutResult3;
        }
        return textLayoutResult3;
    }
}
