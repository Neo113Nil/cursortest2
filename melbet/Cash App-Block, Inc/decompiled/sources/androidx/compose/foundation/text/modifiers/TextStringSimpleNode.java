package androidx.compose.foundation.text.modifiers;

import android.os.Trace;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.modifiers.TextStringSimpleNode;
import androidx.compose.material.ButtonKt$$ExternalSyntheticLambda2;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.AccessibilityAction;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.AndroidParagraph;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.ParagraphIntrinsics;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.android.TextLayout;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import coil3.ComponentRegistry;
import coil3.compose.ConstraintsSizeResolver$$ExternalSyntheticLambda0;
import coil3.size.DimensionKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KProperty;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final class TextStringSimpleNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public ParagraphLayoutCache _layoutCache;
    public HashMap baselineCache;
    public FontFamilyResolverImpl fontFamilyResolver;
    public int maxLines;
    public int minLines;
    public int overflow;
    public ColorProducer overrideColor;
    public TextStyle resolvedInheritedStyle;
    public TextStringSimpleNode$$ExternalSyntheticLambda0 semanticsTextLayoutResult;
    public boolean softWrap;
    public TextStyle style;
    public String text;
    public TextSubstitutionValue textSubstitution;

    public final class TextSubstitutionValue {
        public boolean isShowingSubstitution = false;
        public ParagraphLayoutCache layoutCache = null;
        public final String original;
        public String substitution;

        public TextSubstitutionValue(String str, String str2) {
            this.original = str;
            this.substitution = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TextSubstitutionValue)) {
                return false;
            }
            TextSubstitutionValue textSubstitutionValue = (TextSubstitutionValue) obj;
            return Intrinsics.areEqual(this.original, textSubstitutionValue.original) && Intrinsics.areEqual(this.substitution, textSubstitutionValue.substitution) && this.isShowingSubstitution == textSubstitutionValue.isShowingSubstitution && Intrinsics.areEqual(this.layoutCache, textSubstitutionValue.layoutCache);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.original.hashCode() * 31, 31, this.substitution), 31, this.isShowingSubstitution);
            ParagraphLayoutCache paragraphLayoutCache = this.layoutCache;
            return m + (paragraphLayoutCache == null ? 0 : paragraphLayoutCache.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TextSubstitution(layoutCache=");
            sb.append(this.layoutCache);
            sb.append(", isShowingSubstitution=");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.isShowingSubstitution, ')');
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.foundation.text.modifiers.TextStringSimpleNode$$ExternalSyntheticLambda0] */
    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TextStringSimpleNode$$ExternalSyntheticLambda0 textStringSimpleNode$$ExternalSyntheticLambda0 = this.semanticsTextLayoutResult;
        TextStringSimpleNode$$ExternalSyntheticLambda0 textStringSimpleNode$$ExternalSyntheticLambda02 = textStringSimpleNode$$ExternalSyntheticLambda0;
        if (textStringSimpleNode$$ExternalSyntheticLambda0 == null) {
            final int i = 0;
            ?? r0 = new Function1(this) { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$$ExternalSyntheticLambda0
                public final /* synthetic */ TextStringSimpleNode f$0;

                {
                    this.f$0 = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:27:0x0121  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x0128  */
                @Override // kotlin.jvm.functions.Function1
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    Density density;
                    TextLayoutResult textLayoutResult;
                    int i2 = i;
                    TextStringSimpleNode textStringSimpleNode = this.f$0;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            ParagraphLayoutCache layoutCache = textStringSimpleNode.getLayoutCache();
                            TextStyle textStyle = textStringSimpleNode.style;
                            ColorProducer colorProducer = textStringSimpleNode.overrideColor;
                            TextStyle m995mergedA7vx0o$default = TextStyle.m995mergedA7vx0o$default(textStyle, colorProducer != null ? colorProducer.mo501invoke0d7_KjU() : Color.Unspecified, 0L, null, null, 0L, null, 0, 0L, 16777214);
                            LayoutDirection layoutDirection = layoutCache.intrinsicsLayoutDirection;
                            TextLayoutResult textLayoutResult2 = null;
                            if (layoutDirection != null && (density = layoutCache.density) != null) {
                                AnnotatedString annotatedString = new AnnotatedString(layoutCache.text);
                                if (layoutCache.paragraph != null && layoutCache.paragraphIntrinsics != null) {
                                    long j = layoutCache.prevConstraints & (-8589934589L);
                                    EmptyList emptyList = EmptyList.INSTANCE;
                                    int i3 = layoutCache.maxLines;
                                    boolean z = layoutCache.softWrap;
                                    int i4 = layoutCache.overflow;
                                    FontFamilyResolverImpl fontFamilyResolverImpl = layoutCache.fontFamilyResolver;
                                    textLayoutResult = new TextLayoutResult(new TextLayoutInput(annotatedString, m995mergedA7vx0o$default, emptyList, i3, z, i4, density, layoutDirection, fontFamilyResolverImpl, j), new MultiParagraph(new ComponentRegistry.Builder(annotatedString, m995mergedA7vx0o$default, (List) emptyList, density, fontFamilyResolverImpl), j, layoutCache.maxLines, layoutCache.overflow), layoutCache.layoutSize);
                                    if (textLayoutResult != null) {
                                        list.add(textLayoutResult);
                                        textLayoutResult2 = textLayoutResult;
                                    }
                                    return Boolean.valueOf(textLayoutResult2 != null);
                                }
                            }
                            textLayoutResult = null;
                            if (textLayoutResult != null) {
                            }
                            return Boolean.valueOf(textLayoutResult2 != null);
                        case 1:
                            String str = ((AnnotatedString) obj).text;
                            TextStringSimpleNode.TextSubstitutionValue textSubstitutionValue = textStringSimpleNode.textSubstitution;
                            if (textSubstitutionValue == null) {
                                TextStringSimpleNode.TextSubstitutionValue textSubstitutionValue2 = new TextStringSimpleNode.TextSubstitutionValue(textStringSimpleNode.text, str);
                                ParagraphLayoutCache paragraphLayoutCache = new ParagraphLayoutCache(str, textStringSimpleNode.style, textStringSimpleNode.fontFamilyResolver, textStringSimpleNode.overflow, textStringSimpleNode.softWrap, textStringSimpleNode.maxLines, textStringSimpleNode.minLines);
                                paragraphLayoutCache.setDensity$foundation(textStringSimpleNode.getLayoutCache().density);
                                textSubstitutionValue2.layoutCache = paragraphLayoutCache;
                                textStringSimpleNode.textSubstitution = textSubstitutionValue2;
                            } else if (!Intrinsics.areEqual(str, textSubstitutionValue.substitution)) {
                                textSubstitutionValue.substitution = str;
                                ParagraphLayoutCache paragraphLayoutCache2 = textSubstitutionValue.layoutCache;
                                if (paragraphLayoutCache2 != null) {
                                    paragraphLayoutCache2.m433updateL6sJoHM(str, textStringSimpleNode.style, textStringSimpleNode.fontFamilyResolver, textStringSimpleNode.overflow, textStringSimpleNode.softWrap, textStringSimpleNode.maxLines, textStringSimpleNode.minLines);
                                }
                            }
                            DepthSortedSetKt.requireLayoutNode(textStringSimpleNode).invalidateSemantics$ui();
                            DepthSortedSetKt.requireLayoutNode(textStringSimpleNode).invalidateMeasurements$ui();
                            DepthSortedSetKt.invalidateDraw(textStringSimpleNode);
                            return Boolean.TRUE;
                        default:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            TextStringSimpleNode.TextSubstitutionValue textSubstitutionValue3 = textStringSimpleNode.textSubstitution;
                            if (textSubstitutionValue3 == null) {
                                r2 = false;
                            } else {
                                textSubstitutionValue3.isShowingSubstitution = booleanValue;
                                DepthSortedSetKt.requireLayoutNode(textStringSimpleNode).invalidateSemantics$ui();
                                DepthSortedSetKt.requireLayoutNode(textStringSimpleNode).invalidateMeasurements$ui();
                                DepthSortedSetKt.invalidateDraw(textStringSimpleNode);
                            }
                            return Boolean.valueOf(r2);
                    }
                }
            };
            this.semanticsTextLayoutResult = r0;
            textStringSimpleNode$$ExternalSyntheticLambda02 = r0;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, new AnnotatedString(this.text));
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            boolean z = textSubstitutionValue.isShowingSubstitution;
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.IsShowingTextSubstitution;
            KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
            KProperty kProperty = kPropertyArr[17];
            semanticsPropertyReceiver.set(semanticsPropertyKey, Boolean.valueOf(z));
            AnnotatedString annotatedString = new AnnotatedString(textSubstitutionValue.substitution);
            SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.TextSubstitution;
            KProperty kProperty2 = kPropertyArr[16];
            semanticsPropertyReceiver.set(semanticsPropertyKey2, annotatedString);
        }
        final int i2 = 1;
        semanticsPropertyReceiver.set(SemanticsActions.SetTextSubstitution, new AccessibilityAction(null, new Function1(this) { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$$ExternalSyntheticLambda0
            public final /* synthetic */ TextStringSimpleNode f$0;

            {
                this.f$0 = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0121  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0128  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                Density density;
                TextLayoutResult textLayoutResult;
                int i22 = i2;
                TextStringSimpleNode textStringSimpleNode = this.f$0;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        ParagraphLayoutCache layoutCache = textStringSimpleNode.getLayoutCache();
                        TextStyle textStyle = textStringSimpleNode.style;
                        ColorProducer colorProducer = textStringSimpleNode.overrideColor;
                        TextStyle m995mergedA7vx0o$default = TextStyle.m995mergedA7vx0o$default(textStyle, colorProducer != null ? colorProducer.mo501invoke0d7_KjU() : Color.Unspecified, 0L, null, null, 0L, null, 0, 0L, 16777214);
                        LayoutDirection layoutDirection = layoutCache.intrinsicsLayoutDirection;
                        TextLayoutResult textLayoutResult2 = null;
                        if (layoutDirection != null && (density = layoutCache.density) != null) {
                            AnnotatedString annotatedString2 = new AnnotatedString(layoutCache.text);
                            if (layoutCache.paragraph != null && layoutCache.paragraphIntrinsics != null) {
                                long j = layoutCache.prevConstraints & (-8589934589L);
                                EmptyList emptyList = EmptyList.INSTANCE;
                                int i3 = layoutCache.maxLines;
                                boolean z2 = layoutCache.softWrap;
                                int i4 = layoutCache.overflow;
                                FontFamilyResolverImpl fontFamilyResolverImpl = layoutCache.fontFamilyResolver;
                                textLayoutResult = new TextLayoutResult(new TextLayoutInput(annotatedString2, m995mergedA7vx0o$default, emptyList, i3, z2, i4, density, layoutDirection, fontFamilyResolverImpl, j), new MultiParagraph(new ComponentRegistry.Builder(annotatedString2, m995mergedA7vx0o$default, (List) emptyList, density, fontFamilyResolverImpl), j, layoutCache.maxLines, layoutCache.overflow), layoutCache.layoutSize);
                                if (textLayoutResult != null) {
                                    list.add(textLayoutResult);
                                    textLayoutResult2 = textLayoutResult;
                                }
                                return Boolean.valueOf(textLayoutResult2 != null);
                            }
                        }
                        textLayoutResult = null;
                        if (textLayoutResult != null) {
                        }
                        return Boolean.valueOf(textLayoutResult2 != null);
                    case 1:
                        String str = ((AnnotatedString) obj).text;
                        TextStringSimpleNode.TextSubstitutionValue textSubstitutionValue2 = textStringSimpleNode.textSubstitution;
                        if (textSubstitutionValue2 == null) {
                            TextStringSimpleNode.TextSubstitutionValue textSubstitutionValue22 = new TextStringSimpleNode.TextSubstitutionValue(textStringSimpleNode.text, str);
                            ParagraphLayoutCache paragraphLayoutCache = new ParagraphLayoutCache(str, textStringSimpleNode.style, textStringSimpleNode.fontFamilyResolver, textStringSimpleNode.overflow, textStringSimpleNode.softWrap, textStringSimpleNode.maxLines, textStringSimpleNode.minLines);
                            paragraphLayoutCache.setDensity$foundation(textStringSimpleNode.getLayoutCache().density);
                            textSubstitutionValue22.layoutCache = paragraphLayoutCache;
                            textStringSimpleNode.textSubstitution = textSubstitutionValue22;
                        } else if (!Intrinsics.areEqual(str, textSubstitutionValue2.substitution)) {
                            textSubstitutionValue2.substitution = str;
                            ParagraphLayoutCache paragraphLayoutCache2 = textSubstitutionValue2.layoutCache;
                            if (paragraphLayoutCache2 != null) {
                                paragraphLayoutCache2.m433updateL6sJoHM(str, textStringSimpleNode.style, textStringSimpleNode.fontFamilyResolver, textStringSimpleNode.overflow, textStringSimpleNode.softWrap, textStringSimpleNode.maxLines, textStringSimpleNode.minLines);
                            }
                        }
                        DepthSortedSetKt.requireLayoutNode(textStringSimpleNode).invalidateSemantics$ui();
                        DepthSortedSetKt.requireLayoutNode(textStringSimpleNode).invalidateMeasurements$ui();
                        DepthSortedSetKt.invalidateDraw(textStringSimpleNode);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        TextStringSimpleNode.TextSubstitutionValue textSubstitutionValue3 = textStringSimpleNode.textSubstitution;
                        if (textSubstitutionValue3 == null) {
                            r2 = false;
                        } else {
                            textSubstitutionValue3.isShowingSubstitution = booleanValue;
                            DepthSortedSetKt.requireLayoutNode(textStringSimpleNode).invalidateSemantics$ui();
                            DepthSortedSetKt.requireLayoutNode(textStringSimpleNode).invalidateMeasurements$ui();
                            DepthSortedSetKt.invalidateDraw(textStringSimpleNode);
                        }
                        return Boolean.valueOf(r2);
                }
            }
        }));
        final int i3 = 2;
        semanticsPropertyReceiver.set(SemanticsActions.ShowTextSubstitution, new AccessibilityAction(null, new Function1(this) { // from class: androidx.compose.foundation.text.modifiers.TextStringSimpleNode$$ExternalSyntheticLambda0
            public final /* synthetic */ TextStringSimpleNode f$0;

            {
                this.f$0 = this;
            }

            /* JADX WARN: Removed duplicated region for block: B:27:0x0121  */
            /* JADX WARN: Removed duplicated region for block: B:29:0x0128  */
            @Override // kotlin.jvm.functions.Function1
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invoke(Object obj) {
                Density density;
                TextLayoutResult textLayoutResult;
                int i22 = i3;
                TextStringSimpleNode textStringSimpleNode = this.f$0;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        ParagraphLayoutCache layoutCache = textStringSimpleNode.getLayoutCache();
                        TextStyle textStyle = textStringSimpleNode.style;
                        ColorProducer colorProducer = textStringSimpleNode.overrideColor;
                        TextStyle m995mergedA7vx0o$default = TextStyle.m995mergedA7vx0o$default(textStyle, colorProducer != null ? colorProducer.mo501invoke0d7_KjU() : Color.Unspecified, 0L, null, null, 0L, null, 0, 0L, 16777214);
                        LayoutDirection layoutDirection = layoutCache.intrinsicsLayoutDirection;
                        TextLayoutResult textLayoutResult2 = null;
                        if (layoutDirection != null && (density = layoutCache.density) != null) {
                            AnnotatedString annotatedString2 = new AnnotatedString(layoutCache.text);
                            if (layoutCache.paragraph != null && layoutCache.paragraphIntrinsics != null) {
                                long j = layoutCache.prevConstraints & (-8589934589L);
                                EmptyList emptyList = EmptyList.INSTANCE;
                                int i32 = layoutCache.maxLines;
                                boolean z2 = layoutCache.softWrap;
                                int i4 = layoutCache.overflow;
                                FontFamilyResolverImpl fontFamilyResolverImpl = layoutCache.fontFamilyResolver;
                                textLayoutResult = new TextLayoutResult(new TextLayoutInput(annotatedString2, m995mergedA7vx0o$default, emptyList, i32, z2, i4, density, layoutDirection, fontFamilyResolverImpl, j), new MultiParagraph(new ComponentRegistry.Builder(annotatedString2, m995mergedA7vx0o$default, (List) emptyList, density, fontFamilyResolverImpl), j, layoutCache.maxLines, layoutCache.overflow), layoutCache.layoutSize);
                                if (textLayoutResult != null) {
                                    list.add(textLayoutResult);
                                    textLayoutResult2 = textLayoutResult;
                                }
                                return Boolean.valueOf(textLayoutResult2 != null);
                            }
                        }
                        textLayoutResult = null;
                        if (textLayoutResult != null) {
                        }
                        return Boolean.valueOf(textLayoutResult2 != null);
                    case 1:
                        String str = ((AnnotatedString) obj).text;
                        TextStringSimpleNode.TextSubstitutionValue textSubstitutionValue2 = textStringSimpleNode.textSubstitution;
                        if (textSubstitutionValue2 == null) {
                            TextStringSimpleNode.TextSubstitutionValue textSubstitutionValue22 = new TextStringSimpleNode.TextSubstitutionValue(textStringSimpleNode.text, str);
                            ParagraphLayoutCache paragraphLayoutCache = new ParagraphLayoutCache(str, textStringSimpleNode.style, textStringSimpleNode.fontFamilyResolver, textStringSimpleNode.overflow, textStringSimpleNode.softWrap, textStringSimpleNode.maxLines, textStringSimpleNode.minLines);
                            paragraphLayoutCache.setDensity$foundation(textStringSimpleNode.getLayoutCache().density);
                            textSubstitutionValue22.layoutCache = paragraphLayoutCache;
                            textStringSimpleNode.textSubstitution = textSubstitutionValue22;
                        } else if (!Intrinsics.areEqual(str, textSubstitutionValue2.substitution)) {
                            textSubstitutionValue2.substitution = str;
                            ParagraphLayoutCache paragraphLayoutCache2 = textSubstitutionValue2.layoutCache;
                            if (paragraphLayoutCache2 != null) {
                                paragraphLayoutCache2.m433updateL6sJoHM(str, textStringSimpleNode.style, textStringSimpleNode.fontFamilyResolver, textStringSimpleNode.overflow, textStringSimpleNode.softWrap, textStringSimpleNode.maxLines, textStringSimpleNode.minLines);
                            }
                        }
                        DepthSortedSetKt.requireLayoutNode(textStringSimpleNode).invalidateSemantics$ui();
                        DepthSortedSetKt.requireLayoutNode(textStringSimpleNode).invalidateMeasurements$ui();
                        DepthSortedSetKt.invalidateDraw(textStringSimpleNode);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        TextStringSimpleNode.TextSubstitutionValue textSubstitutionValue3 = textStringSimpleNode.textSubstitution;
                        if (textSubstitutionValue3 == null) {
                            r2 = false;
                        } else {
                            textSubstitutionValue3.isShowingSubstitution = booleanValue;
                            DepthSortedSetKt.requireLayoutNode(textStringSimpleNode).invalidateSemantics$ui();
                            DepthSortedSetKt.requireLayoutNode(textStringSimpleNode).invalidateMeasurements$ui();
                            DepthSortedSetKt.invalidateDraw(textStringSimpleNode);
                        }
                        return Boolean.valueOf(r2);
                }
            }
        }));
        semanticsPropertyReceiver.set(SemanticsActions.ClearTextSubstitution, new AccessibilityAction(null, new Worker$$ExternalSyntheticLambda0(this, 1)));
        semanticsPropertyReceiver.set(SemanticsActions.GetTextLayoutResult, new AccessibilityAction(null, textStringSimpleNode$$ExternalSyntheticLambda02));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0016, code lost:
    
        if (r0 != null) goto L15;
     */
    @Override // androidx.compose.ui.node.DrawModifierNode
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        ParagraphLayoutCache layoutCache;
        if (!isAttached()) {
            return;
        }
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            if (!textSubstitutionValue.isShowingSubstitution) {
                textSubstitutionValue = null;
            }
            if (textSubstitutionValue != null) {
                layoutCache = textSubstitutionValue.layoutCache;
            }
        }
        layoutCache = getLayoutCache();
        AndroidParagraph androidParagraph = layoutCache.paragraph;
        if (androidParagraph == null) {
            InlineClassHelperKt.throwIllegalArgumentExceptionForNullCheck("Internal Error: ParagraphLayoutCache could not provide a Paragraph during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: (layoutCache=" + this._layoutCache + ", textSubstitution=" + this.textSubstitution + ')');
            OptionalProvider$$ExternalSyntheticLambda0.m$1();
            return;
        }
        Canvas canvas = layoutNodeDrawScope.canvasDrawScope.drawContext.getCanvas();
        boolean z = layoutCache.didOverflow;
        if (z) {
            float f = (int) (layoutCache.layoutSize & BodyPartID.bodyIdMax);
            canvas.save();
            canvas.mo648clipRectN_I0leg(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, (int) (r3 >> 32), f, 1);
        }
        try {
            m435resolveInheritedStyleuwmK9pY(2);
            TextStyle textStyle = this.resolvedInheritedStyle;
            if (textStyle == null) {
                textStyle = this.style;
            }
            SpanStyle spanStyle = textStyle.spanStyle;
            TextDecoration textDecoration = spanStyle.textDecoration;
            if (textDecoration == null) {
                textDecoration = TextDecoration.None;
            }
            TextDecoration textDecoration2 = textDecoration;
            Shadow shadow = spanStyle.shadow;
            if (shadow == null) {
                shadow = Shadow.None;
            }
            Shadow shadow2 = shadow;
            DrawStyle drawStyle = spanStyle.drawStyle;
            if (drawStyle == null) {
                drawStyle = Fill.INSTANCE;
            }
            DrawStyle drawStyle2 = drawStyle;
            Brush brush = textStyle.getBrush();
            if (brush != null) {
                androidParagraph.m959painthn5TExg(canvas, brush, textStyle.spanStyle.textForegroundStyle.getAlpha(), shadow2, textDecoration2, drawStyle2);
            } else {
                ColorProducer colorProducer = this.overrideColor;
                long mo501invoke0d7_KjU = colorProducer != null ? colorProducer.mo501invoke0d7_KjU() : Color.Unspecified;
                if (mo501invoke0d7_KjU == 16) {
                    mo501invoke0d7_KjU = textStyle.m996getColor0d7_KjU() != 16 ? textStyle.m996getColor0d7_KjU() : Color.Black;
                }
                androidParagraph.m958paintLG529CI(canvas, mo501invoke0d7_KjU, shadow2, textDecoration2, drawStyle2, 3);
            }
            if (z) {
                canvas.restore();
            }
        } finally {
        }
    }

    public final ParagraphLayoutCache getLayoutCache() {
        TextStyle textStyle = this.resolvedInheritedStyle;
        if (textStyle == null) {
            textStyle = this.style;
        }
        TextStyle textStyle2 = textStyle;
        if (this._layoutCache == null) {
            this._layoutCache = new ParagraphLayoutCache(this.text, textStyle2, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
        }
        ParagraphLayoutCache paragraphLayoutCache = this._layoutCache;
        paragraphLayoutCache.getClass();
        return paragraphLayoutCache;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        if (r0 != null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ParagraphLayoutCache getLayoutCacheForMeasure(MeasureScope measureScope) {
        ParagraphLayoutCache layoutCache;
        if (m435resolveInheritedStyleuwmK9pY(1)) {
            TextStyle textStyle = this.resolvedInheritedStyle;
            if (textStyle == null) {
                textStyle = this.style;
            }
            getLayoutCache().m433updateL6sJoHM(this.text, textStyle, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines);
        }
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            if (!textSubstitutionValue.isShowingSubstitution) {
                textSubstitutionValue = null;
            }
            if (textSubstitutionValue != null) {
                layoutCache = textSubstitutionValue.layoutCache;
            }
        }
        layoutCache = getLayoutCache();
        layoutCache.setDensity$foundation(measureScope);
        return layoutCache;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCacheForMeasure((MeasureScope) intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return BasicTextKt.ceilToIntPx(getLayoutCacheForMeasure((MeasureScope) intrinsicMeasureScope).setLayoutDirection(intrinsicMeasureScope.getLayoutDirection()).getMaxIntrinsicWidth());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Trace.beginSection("TextStringSimpleNode::measure");
        try {
            ParagraphLayoutCache layoutCacheForMeasure = getLayoutCacheForMeasure(measureScope);
            boolean m432layoutWithConstraintsK40F9xA = layoutCacheForMeasure.m432layoutWithConstraintsK40F9xA(j, measureScope.getLayoutDirection());
            ParagraphIntrinsics paragraphIntrinsics = layoutCacheForMeasure.paragraphIntrinsics;
            if (paragraphIntrinsics != null) {
                paragraphIntrinsics.getHasStaleResolvedFonts();
            }
            AndroidParagraph androidParagraph = layoutCacheForMeasure.paragraph;
            androidParagraph.getClass();
            TextLayout textLayout = androidParagraph.layout;
            long j2 = layoutCacheForMeasure.layoutSize;
            if (m432layoutWithConstraintsK40F9xA) {
                DepthSortedSetKt.m864requireCoordinator64DMado(this, 2).invalidateLayer();
                HashMap hashMap = this.baselineCache;
                if (hashMap == null) {
                    hashMap = new HashMap(2);
                    this.baselineCache = hashMap;
                }
                hashMap.put(AlignmentLineKt.FirstBaseline, Integer.valueOf(Math.round(textLayout.getLineBaseline(0))));
                hashMap.put(AlignmentLineKt.LastBaseline, Integer.valueOf(Math.round(textLayout.getLineBaseline(textLayout.lineCount - 1))));
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & BodyPartID.bodyIdMax);
            Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(DimensionKt.m1465fitPrioritizingWidthZbe2FdA(i, i, i2, i2));
            HashMap hashMap2 = this.baselineCache;
            hashMap2.getClass();
            return measureScope.layout(i, i2, hashMap2, new ConstraintsSizeResolver$$ExternalSyntheticLambda0(mo833measureBRTryo0, 6));
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCacheForMeasure((MeasureScope) intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return BasicTextKt.ceilToIntPx(getLayoutCacheForMeasure((MeasureScope) intrinsicMeasureScope).setLayoutDirection(intrinsicMeasureScope.getLayoutDirection()).getMinIntrinsicWidth());
    }

    /* renamed from: resolveInheritedStyle-uwmK9pY, reason: not valid java name */
    public final boolean m435resolveInheritedStyleuwmK9pY(int i) {
        TextStyle textStyle = this.resolvedInheritedStyle;
        TextStyle textStyle2 = this.style;
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = textStyle2;
        DepthSortedSetKt.traverseAncestors(this, "StyleOuterNode", new ButtonKt$$ExternalSyntheticLambda2(4));
        this.resolvedInheritedStyle = (TextStyle) ref$ObjectRef.element;
        if (textStyle == null) {
            return false;
        }
        return !textStyle.equals(r0);
    }
}
