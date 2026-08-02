package androidx.compose.foundation.text.modifiers;

import android.os.Trace;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.FillNode$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode;
import androidx.compose.foundation.text.selection.MultiWidgetSelectionDelegate;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.foundation.text.selection.SelectionRegistrarImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorProducer;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
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
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamilyResolverImpl;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import coil3.Extras;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahv;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.wire.GrpcMethod;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes.dex */
public final class TextAnnotatedStringNode extends Modifier.Node implements LayoutModifierNode, DrawModifierNode, SemanticsModifierNode {
    public MultiParagraphLayoutCache _layoutCache;
    public Map baselineCache;
    public FontFamilyResolverImpl fontFamilyResolver;
    public int maxLines;
    public int minLines;
    public Function1 onPlaceholderLayout;
    public Function1 onShowTranslation;
    public Function1 onTextLayout;
    public int overflow;
    public ColorProducer overrideColor;
    public List placeholders;
    public SelectionController selectionController;
    public TextAnnotatedStringNode$$ExternalSyntheticLambda1 semanticsTextLayoutResult;
    public boolean softWrap;
    public TextStyle style;
    public AnnotatedString text;
    public TextSubstitutionValue textSubstitution;

    /* loaded from: classes3.dex */
    public final class TextSubstitutionValue {
        public boolean isShowingSubstitution = false;
        public MultiParagraphLayoutCache layoutCache = null;
        public final AnnotatedString original;
        public AnnotatedString substitution;

        public TextSubstitutionValue(AnnotatedString annotatedString, AnnotatedString annotatedString2) {
            this.original = annotatedString;
            this.substitution = annotatedString2;
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

        public final MultiParagraphLayoutCache getLayoutCache() {
            return this.layoutCache;
        }

        public final AnnotatedString getOriginal() {
            return this.original;
        }

        public final AnnotatedString getSubstitution() {
            return this.substitution;
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.substitution.hashCode() + (this.original.hashCode() * 31)) * 31, 31, this.isShowingSubstitution);
            MultiParagraphLayoutCache multiParagraphLayoutCache = this.layoutCache;
            return m + (multiParagraphLayoutCache == null ? 0 : multiParagraphLayoutCache.hashCode());
        }

        public final boolean isShowingSubstitution() {
            return this.isShowingSubstitution;
        }

        public final void setLayoutCache(MultiParagraphLayoutCache multiParagraphLayoutCache) {
            this.layoutCache = multiParagraphLayoutCache;
        }

        public final void setShowingSubstitution(boolean z) {
            this.isShowingSubstitution = z;
        }

        public final void setSubstitution(AnnotatedString annotatedString) {
            this.substitution = annotatedString;
        }

        public final String toString() {
            return "TextSubstitutionValue(original=" + ((Object) this.original) + ", substitution=" + ((Object) this.substitution) + ", isShowingSubstitution=" + this.isShowingSubstitution + ", layoutCache=" + this.layoutCache + ')';
        }
    }

    public TextAnnotatedStringNode(AnnotatedString annotatedString, TextStyle textStyle, FontFamilyResolverImpl fontFamilyResolverImpl, Function1 function1, int i, boolean z, int i2, int i3, List list, Function1 function12, SelectionController selectionController, ColorProducer colorProducer, Function1 function13) {
        this.text = annotatedString;
        this.style = textStyle;
        this.fontFamilyResolver = fontFamilyResolverImpl;
        this.onTextLayout = function1;
        this.overflow = i;
        this.softWrap = z;
        this.maxLines = i2;
        this.minLines = i3;
        this.placeholders = list;
        this.onPlaceholderLayout = function12;
        this.selectionController = selectionController;
        this.overrideColor = colorProducer;
        this.onShowTranslation = function13;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$$ExternalSyntheticLambda1] */
    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public final void applySemantics(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        TextAnnotatedStringNode$$ExternalSyntheticLambda1 textAnnotatedStringNode$$ExternalSyntheticLambda1 = this.semanticsTextLayoutResult;
        TextAnnotatedStringNode$$ExternalSyntheticLambda1 textAnnotatedStringNode$$ExternalSyntheticLambda12 = textAnnotatedStringNode$$ExternalSyntheticLambda1;
        if (textAnnotatedStringNode$$ExternalSyntheticLambda1 == null) {
            final int i = 0;
            ?? r0 = new Function1(this) { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$$ExternalSyntheticLambda1
                public final /* synthetic */ TextAnnotatedStringNode f$0;

                {
                    this.f$0 = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    TextLayoutResult textLayoutResult;
                    boolean z;
                    int i2 = i;
                    TextAnnotatedStringNode textAnnotatedStringNode = this.f$0;
                    switch (i2) {
                        case 0:
                            List list = (List) obj;
                            TextLayoutResult textLayoutResult2 = textAnnotatedStringNode.getLayoutCache().layoutCache;
                            if (textLayoutResult2 != null) {
                                TextLayoutInput textLayoutInput = textLayoutResult2.layoutInput;
                                AnnotatedString annotatedString = textLayoutInput.text;
                                TextStyle textStyle = textAnnotatedStringNode.style;
                                ColorProducer colorProducer = textAnnotatedStringNode.overrideColor;
                                textLayoutResult = new TextLayoutResult(new TextLayoutInput(annotatedString, TextStyle.m995mergedA7vx0o$default(textStyle, colorProducer != null ? colorProducer.mo501invoke0d7_KjU() : Color.Unspecified, 0L, null, null, 0L, null, 0, 0L, 16777214), textLayoutInput.placeholders, textLayoutInput.maxLines, textLayoutInput.softWrap, textLayoutInput.overflow, textLayoutInput.density, textLayoutInput.layoutDirection, textLayoutInput.fontFamilyResolver, textLayoutInput.constraints), textLayoutResult2.multiParagraph, textLayoutResult2.size);
                                list.add(textLayoutResult);
                            } else {
                                textLayoutResult = null;
                            }
                            return Boolean.valueOf(textLayoutResult != null);
                        case 1:
                            AnnotatedString annotatedString2 = (AnnotatedString) obj;
                            TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue = textAnnotatedStringNode.textSubstitution;
                            if (textSubstitutionValue == null) {
                                TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue2 = new TextAnnotatedStringNode.TextSubstitutionValue(textAnnotatedStringNode.text, annotatedString2);
                                MultiParagraphLayoutCache multiParagraphLayoutCache = new MultiParagraphLayoutCache(annotatedString2, textAnnotatedStringNode.style, textAnnotatedStringNode.fontFamilyResolver, textAnnotatedStringNode.overflow, textAnnotatedStringNode.softWrap, textAnnotatedStringNode.maxLines, textAnnotatedStringNode.minLines, EmptyList.INSTANCE);
                                multiParagraphLayoutCache.setDensity$foundation(textAnnotatedStringNode.getLayoutCache().density);
                                textSubstitutionValue2.setLayoutCache(multiParagraphLayoutCache);
                                textAnnotatedStringNode.textSubstitution = textSubstitutionValue2;
                            } else if (!Intrinsics.areEqual(annotatedString2, textSubstitutionValue.getSubstitution())) {
                                textSubstitutionValue.setSubstitution(annotatedString2);
                                MultiParagraphLayoutCache layoutCache = textSubstitutionValue.getLayoutCache();
                                if (layoutCache != null) {
                                    layoutCache.m430updateJ2qo7bo(annotatedString2, textAnnotatedStringNode.style, textAnnotatedStringNode.fontFamilyResolver, textAnnotatedStringNode.overflow, textAnnotatedStringNode.softWrap, textAnnotatedStringNode.maxLines, textAnnotatedStringNode.minLines, EmptyList.INSTANCE);
                                }
                            }
                            DepthSortedSetKt.requireLayoutNode(textAnnotatedStringNode).invalidateSemantics$ui();
                            DepthSortedSetKt.requireLayoutNode(textAnnotatedStringNode).invalidateMeasurements$ui();
                            DepthSortedSetKt.invalidateDraw(textAnnotatedStringNode);
                            return Boolean.TRUE;
                        default:
                            boolean booleanValue = ((Boolean) obj).booleanValue();
                            TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue3 = textAnnotatedStringNode.textSubstitution;
                            if (textSubstitutionValue3 == null) {
                                z = false;
                            } else {
                                Function1 function1 = textAnnotatedStringNode.onShowTranslation;
                                if (function1 != null) {
                                    function1.invoke(textSubstitutionValue3);
                                }
                                TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue4 = textAnnotatedStringNode.textSubstitution;
                                if (textSubstitutionValue4 != null) {
                                    textSubstitutionValue4.setShowingSubstitution(booleanValue);
                                }
                                DepthSortedSetKt.requireLayoutNode(textAnnotatedStringNode).invalidateSemantics$ui();
                                DepthSortedSetKt.requireLayoutNode(textAnnotatedStringNode).invalidateMeasurements$ui();
                                DepthSortedSetKt.invalidateDraw(textAnnotatedStringNode);
                                z = true;
                            }
                            return Boolean.valueOf(z);
                    }
                }
            };
            this.semanticsTextLayoutResult = r0;
            textAnnotatedStringNode$$ExternalSyntheticLambda12 = r0;
        }
        SemanticsPropertiesKt.setText(semanticsPropertyReceiver, this.text);
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null) {
            AnnotatedString substitution = textSubstitutionValue.getSubstitution();
            SemanticsPropertyKey semanticsPropertyKey = SemanticsProperties.TextSubstitution;
            KProperty[] kPropertyArr = SemanticsPropertiesKt.$$delegatedProperties;
            KProperty kProperty = kPropertyArr[16];
            semanticsPropertyReceiver.set(semanticsPropertyKey, substitution);
            boolean isShowingSubstitution = textSubstitutionValue.isShowingSubstitution();
            SemanticsPropertyKey semanticsPropertyKey2 = SemanticsProperties.IsShowingTextSubstitution;
            KProperty kProperty2 = kPropertyArr[17];
            semanticsPropertyReceiver.set(semanticsPropertyKey2, Boolean.valueOf(isShowingSubstitution));
        }
        final int i2 = 1;
        semanticsPropertyReceiver.set(SemanticsActions.SetTextSubstitution, new AccessibilityAction(null, new Function1(this) { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$$ExternalSyntheticLambda1
            public final /* synthetic */ TextAnnotatedStringNode f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TextLayoutResult textLayoutResult;
                boolean z;
                int i22 = i2;
                TextAnnotatedStringNode textAnnotatedStringNode = this.f$0;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        TextLayoutResult textLayoutResult2 = textAnnotatedStringNode.getLayoutCache().layoutCache;
                        if (textLayoutResult2 != null) {
                            TextLayoutInput textLayoutInput = textLayoutResult2.layoutInput;
                            AnnotatedString annotatedString = textLayoutInput.text;
                            TextStyle textStyle = textAnnotatedStringNode.style;
                            ColorProducer colorProducer = textAnnotatedStringNode.overrideColor;
                            textLayoutResult = new TextLayoutResult(new TextLayoutInput(annotatedString, TextStyle.m995mergedA7vx0o$default(textStyle, colorProducer != null ? colorProducer.mo501invoke0d7_KjU() : Color.Unspecified, 0L, null, null, 0L, null, 0, 0L, 16777214), textLayoutInput.placeholders, textLayoutInput.maxLines, textLayoutInput.softWrap, textLayoutInput.overflow, textLayoutInput.density, textLayoutInput.layoutDirection, textLayoutInput.fontFamilyResolver, textLayoutInput.constraints), textLayoutResult2.multiParagraph, textLayoutResult2.size);
                            list.add(textLayoutResult);
                        } else {
                            textLayoutResult = null;
                        }
                        return Boolean.valueOf(textLayoutResult != null);
                    case 1:
                        AnnotatedString annotatedString2 = (AnnotatedString) obj;
                        TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue2 = textAnnotatedStringNode.textSubstitution;
                        if (textSubstitutionValue2 == null) {
                            TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue22 = new TextAnnotatedStringNode.TextSubstitutionValue(textAnnotatedStringNode.text, annotatedString2);
                            MultiParagraphLayoutCache multiParagraphLayoutCache = new MultiParagraphLayoutCache(annotatedString2, textAnnotatedStringNode.style, textAnnotatedStringNode.fontFamilyResolver, textAnnotatedStringNode.overflow, textAnnotatedStringNode.softWrap, textAnnotatedStringNode.maxLines, textAnnotatedStringNode.minLines, EmptyList.INSTANCE);
                            multiParagraphLayoutCache.setDensity$foundation(textAnnotatedStringNode.getLayoutCache().density);
                            textSubstitutionValue22.setLayoutCache(multiParagraphLayoutCache);
                            textAnnotatedStringNode.textSubstitution = textSubstitutionValue22;
                        } else if (!Intrinsics.areEqual(annotatedString2, textSubstitutionValue2.getSubstitution())) {
                            textSubstitutionValue2.setSubstitution(annotatedString2);
                            MultiParagraphLayoutCache layoutCache = textSubstitutionValue2.getLayoutCache();
                            if (layoutCache != null) {
                                layoutCache.m430updateJ2qo7bo(annotatedString2, textAnnotatedStringNode.style, textAnnotatedStringNode.fontFamilyResolver, textAnnotatedStringNode.overflow, textAnnotatedStringNode.softWrap, textAnnotatedStringNode.maxLines, textAnnotatedStringNode.minLines, EmptyList.INSTANCE);
                            }
                        }
                        DepthSortedSetKt.requireLayoutNode(textAnnotatedStringNode).invalidateSemantics$ui();
                        DepthSortedSetKt.requireLayoutNode(textAnnotatedStringNode).invalidateMeasurements$ui();
                        DepthSortedSetKt.invalidateDraw(textAnnotatedStringNode);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue3 = textAnnotatedStringNode.textSubstitution;
                        if (textSubstitutionValue3 == null) {
                            z = false;
                        } else {
                            Function1 function1 = textAnnotatedStringNode.onShowTranslation;
                            if (function1 != null) {
                                function1.invoke(textSubstitutionValue3);
                            }
                            TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue4 = textAnnotatedStringNode.textSubstitution;
                            if (textSubstitutionValue4 != null) {
                                textSubstitutionValue4.setShowingSubstitution(booleanValue);
                            }
                            DepthSortedSetKt.requireLayoutNode(textAnnotatedStringNode).invalidateSemantics$ui();
                            DepthSortedSetKt.requireLayoutNode(textAnnotatedStringNode).invalidateMeasurements$ui();
                            DepthSortedSetKt.invalidateDraw(textAnnotatedStringNode);
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        final int i3 = 2;
        semanticsPropertyReceiver.set(SemanticsActions.ShowTextSubstitution, new AccessibilityAction(null, new Function1(this) { // from class: androidx.compose.foundation.text.modifiers.TextAnnotatedStringNode$$ExternalSyntheticLambda1
            public final /* synthetic */ TextAnnotatedStringNode f$0;

            {
                this.f$0 = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                TextLayoutResult textLayoutResult;
                boolean z;
                int i22 = i3;
                TextAnnotatedStringNode textAnnotatedStringNode = this.f$0;
                switch (i22) {
                    case 0:
                        List list = (List) obj;
                        TextLayoutResult textLayoutResult2 = textAnnotatedStringNode.getLayoutCache().layoutCache;
                        if (textLayoutResult2 != null) {
                            TextLayoutInput textLayoutInput = textLayoutResult2.layoutInput;
                            AnnotatedString annotatedString = textLayoutInput.text;
                            TextStyle textStyle = textAnnotatedStringNode.style;
                            ColorProducer colorProducer = textAnnotatedStringNode.overrideColor;
                            textLayoutResult = new TextLayoutResult(new TextLayoutInput(annotatedString, TextStyle.m995mergedA7vx0o$default(textStyle, colorProducer != null ? colorProducer.mo501invoke0d7_KjU() : Color.Unspecified, 0L, null, null, 0L, null, 0, 0L, 16777214), textLayoutInput.placeholders, textLayoutInput.maxLines, textLayoutInput.softWrap, textLayoutInput.overflow, textLayoutInput.density, textLayoutInput.layoutDirection, textLayoutInput.fontFamilyResolver, textLayoutInput.constraints), textLayoutResult2.multiParagraph, textLayoutResult2.size);
                            list.add(textLayoutResult);
                        } else {
                            textLayoutResult = null;
                        }
                        return Boolean.valueOf(textLayoutResult != null);
                    case 1:
                        AnnotatedString annotatedString2 = (AnnotatedString) obj;
                        TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue2 = textAnnotatedStringNode.textSubstitution;
                        if (textSubstitutionValue2 == null) {
                            TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue22 = new TextAnnotatedStringNode.TextSubstitutionValue(textAnnotatedStringNode.text, annotatedString2);
                            MultiParagraphLayoutCache multiParagraphLayoutCache = new MultiParagraphLayoutCache(annotatedString2, textAnnotatedStringNode.style, textAnnotatedStringNode.fontFamilyResolver, textAnnotatedStringNode.overflow, textAnnotatedStringNode.softWrap, textAnnotatedStringNode.maxLines, textAnnotatedStringNode.minLines, EmptyList.INSTANCE);
                            multiParagraphLayoutCache.setDensity$foundation(textAnnotatedStringNode.getLayoutCache().density);
                            textSubstitutionValue22.setLayoutCache(multiParagraphLayoutCache);
                            textAnnotatedStringNode.textSubstitution = textSubstitutionValue22;
                        } else if (!Intrinsics.areEqual(annotatedString2, textSubstitutionValue2.getSubstitution())) {
                            textSubstitutionValue2.setSubstitution(annotatedString2);
                            MultiParagraphLayoutCache layoutCache = textSubstitutionValue2.getLayoutCache();
                            if (layoutCache != null) {
                                layoutCache.m430updateJ2qo7bo(annotatedString2, textAnnotatedStringNode.style, textAnnotatedStringNode.fontFamilyResolver, textAnnotatedStringNode.overflow, textAnnotatedStringNode.softWrap, textAnnotatedStringNode.maxLines, textAnnotatedStringNode.minLines, EmptyList.INSTANCE);
                            }
                        }
                        DepthSortedSetKt.requireLayoutNode(textAnnotatedStringNode).invalidateSemantics$ui();
                        DepthSortedSetKt.requireLayoutNode(textAnnotatedStringNode).invalidateMeasurements$ui();
                        DepthSortedSetKt.invalidateDraw(textAnnotatedStringNode);
                        return Boolean.TRUE;
                    default:
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue3 = textAnnotatedStringNode.textSubstitution;
                        if (textSubstitutionValue3 == null) {
                            z = false;
                        } else {
                            Function1 function1 = textAnnotatedStringNode.onShowTranslation;
                            if (function1 != null) {
                                function1.invoke(textSubstitutionValue3);
                            }
                            TextAnnotatedStringNode.TextSubstitutionValue textSubstitutionValue4 = textAnnotatedStringNode.textSubstitution;
                            if (textSubstitutionValue4 != null) {
                                textSubstitutionValue4.setShowingSubstitution(booleanValue);
                            }
                            DepthSortedSetKt.requireLayoutNode(textAnnotatedStringNode).invalidateSemantics$ui();
                            DepthSortedSetKt.requireLayoutNode(textAnnotatedStringNode).invalidateMeasurements$ui();
                            DepthSortedSetKt.invalidateDraw(textAnnotatedStringNode);
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        }));
        semanticsPropertyReceiver.set(SemanticsActions.ClearTextSubstitution, new AccessibilityAction(null, new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 10)));
        semanticsPropertyReceiver.set(SemanticsActions.GetTextLayoutResult, new AccessibilityAction(null, textAnnotatedStringNode$$ExternalSyntheticLambda12));
    }

    public final void doInvalidations(boolean z, boolean z2, boolean z3, boolean z4) {
        if (z2 || z3 || z4) {
            getLayoutCache().m430updateJ2qo7bo(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
        }
        if (isAttached()) {
            if (z2 || (z && this.semanticsTextLayoutResult != null)) {
                DepthSortedSetKt.requireLayoutNode(this).invalidateSemantics$ui();
            }
            if (z2 || z3 || z4) {
                DepthSortedSetKt.requireLayoutNode(this).invalidateMeasurements$ui();
                DepthSortedSetKt.invalidateDraw(this);
            }
            if (z) {
                DepthSortedSetKt.invalidateDraw(this);
            }
        }
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public final void draw(LayoutNodeDrawScope layoutNodeDrawScope) {
        boolean z;
        List list;
        Selection selection;
        GrpcMethod grpcMethod;
        long j;
        CanvasDrawScope canvasDrawScope = layoutNodeDrawScope.canvasDrawScope;
        if (!isAttached()) {
            return;
        }
        SelectionController selectionController = this.selectionController;
        if (selectionController != null && (selection = (Selection) ((SelectionRegistrarImpl) selectionController.selectionRegistrar).getSubselections().get(selectionController.selectableId)) != null) {
            int offset = !selection.getHandlesCrossed() ? selection.getStart().getOffset() : selection.getEnd().getOffset();
            int offset2 = !selection.getHandlesCrossed() ? selection.getEnd().getOffset() : selection.getStart().getOffset();
            if (offset != offset2) {
                MultiWidgetSelectionDelegate multiWidgetSelectionDelegate = selectionController.selectable;
                int lastVisibleOffset = multiWidgetSelectionDelegate != null ? multiWidgetSelectionDelegate.getLastVisibleOffset() : 0;
                if (offset > lastVisibleOffset) {
                    offset = lastVisibleOffset;
                }
                if (offset2 > lastVisibleOffset) {
                    offset2 = lastVisibleOffset;
                }
                AndroidPath pathForRange = selectionController.params.getPathForRange(offset, offset2);
                if (pathForRange != null) {
                    if (selectionController.params.getShouldClip()) {
                        float intBitsToFloat = Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (canvasDrawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                        GrpcMethod grpcMethod2 = canvasDrawScope.drawContext;
                        long m3999getSizeNHjbRc = grpcMethod2.m3999getSizeNHjbRc();
                        grpcMethod2.getCanvas().save();
                        try {
                            ((Extras.Key) grpcMethod2.path).m1435clipRectN_I0leg(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, intBitsToFloat, intBitsToFloat2, 1);
                            grpcMethod = grpcMethod2;
                            try {
                                j = m3999getSizeNHjbRc;
                            } catch (Throwable th) {
                                th = th;
                                j = m3999getSizeNHjbRc;
                                Recorder$$ExternalSyntheticOutline2.m(grpcMethod, j);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            grpcMethod = grpcMethod2;
                        }
                        try {
                            DrawScope.m745drawPathLG529CI$default(layoutNodeDrawScope, pathForRange, selectionController.backgroundSelectionColor, RecyclerView.DECELERATION_RATE, null, 60);
                            Recorder$$ExternalSyntheticOutline2.m(grpcMethod, j);
                        } catch (Throwable th3) {
                            th = th3;
                            Recorder$$ExternalSyntheticOutline2.m(grpcMethod, j);
                            throw th;
                        }
                    } else {
                        DrawScope.m745drawPathLG529CI$default(layoutNodeDrawScope, pathForRange, selectionController.backgroundSelectionColor, RecyclerView.DECELERATION_RATE, null, 60);
                    }
                }
            }
        }
        Canvas canvas = canvasDrawScope.drawContext.getCanvas();
        MultiParagraphLayoutCache layoutCache = getLayoutCache(layoutNodeDrawScope);
        TextLayoutResult textLayoutResult = layoutCache.layoutCache;
        if (textLayoutResult == null) {
            OptionalProvider$$ExternalSyntheticLambda0.m$1(layoutCache, "Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: ");
            return;
        }
        MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
        boolean z2 = textLayoutResult.getHasVisualOverflow() && this.overflow != 3;
        if (z2) {
            long j2 = textLayoutResult.size;
            Rect m1180Recttz77jQw = DBUtil.m1180Recttz77jQw(0L, (Float.floatToRawIntBits((int) (j2 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j2 & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax));
            canvas.save();
            Canvas.m672clipRectmtrdDE$default(canvas, m1180Recttz77jQw);
        }
        try {
            TextStyle textStyle = this.style;
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
                try {
                    zzahv.m2021drawMultiParagraph7AXcY_I(multiParagraph, canvas, brush, this.style.spanStyle.textForegroundStyle.getAlpha(), shadow2, textDecoration2, drawStyle2);
                    canvas = canvas;
                    z = true;
                } catch (Throwable th4) {
                    th = th4;
                    canvas = canvas;
                    if (z2) {
                        canvas.restore();
                    }
                    throw th;
                }
            } else {
                ColorProducer colorProducer = this.overrideColor;
                long mo501invoke0d7_KjU = colorProducer != null ? colorProducer.mo501invoke0d7_KjU() : Color.Unspecified;
                if (mo501invoke0d7_KjU == 16) {
                    mo501invoke0d7_KjU = this.style.m996getColor0d7_KjU() != 16 ? this.style.m996getColor0d7_KjU() : Color.Black;
                }
                z = true;
                MultiParagraph.m964paintLG529CI$default(multiParagraph, canvas, mo501invoke0d7_KjU, shadow2, textDecoration2, drawStyle2, 32);
            }
            if (z2) {
                canvas.restore();
            }
            TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
            if (((textSubstitutionValue == null || textSubstitutionValue.isShowingSubstitution() != z) ? BundleKt.hasLinks(this.text) : false) || !((list = this.placeholders) == null || list.isEmpty())) {
                layoutNodeDrawScope.drawContent();
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final MultiParagraphLayoutCache getLayoutCache() {
        if (this._layoutCache == null) {
            this._layoutCache = new MultiParagraphLayoutCache(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders);
        }
        MultiParagraphLayoutCache multiParagraphLayoutCache = this._layoutCache;
        multiParagraphLayoutCache.getClass();
        return multiParagraphLayoutCache;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public final boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return BasicTextKt.ceilToIntPx(getLayoutCache(intrinsicMeasureScope).setLayoutDirection(intrinsicMeasureScope.getLayoutDirection()).getMaxIntrinsicWidth());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    /* renamed from: measure-3p2s80s */
    public final MeasureResult mo144measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        Trace.beginSection("TextAnnotatedStringNode:measure");
        try {
            MultiParagraphLayoutCache layoutCache = getLayoutCache(measureScope);
            boolean m428layoutWithConstraintsK40F9xA = layoutCache.m428layoutWithConstraintsK40F9xA(j, measureScope.getLayoutDirection());
            TextLayoutResult textLayoutResult = layoutCache.layoutCache;
            if (textLayoutResult == null) {
                throw new IllegalStateException("Internal Error: MultiParagraphLayoutCache could not provide TextLayoutResult during the draw phase. Please report this bug on the official Issue Tracker with the following diagnostic information: " + layoutCache);
            }
            long j2 = textLayoutResult.size;
            textLayoutResult.multiParagraph.intrinsics.getHasStaleResolvedFonts();
            if (m428layoutWithConstraintsK40F9xA) {
                DepthSortedSetKt.m864requireCoordinator64DMado(this, 2).invalidateLayer();
                Function1 function1 = this.onTextLayout;
                if (function1 != null) {
                    function1.invoke(textLayoutResult);
                }
                SelectionController selectionController = this.selectionController;
                if (selectionController != null) {
                    TextLayoutResult textLayoutResult2 = selectionController.params.getTextLayoutResult();
                    if (textLayoutResult2 != null && !Intrinsics.areEqual(textLayoutResult2.layoutInput.text, textLayoutResult.layoutInput.text)) {
                        ((SelectionRegistrarImpl) selectionController.selectionRegistrar).notifySelectableChange(selectionController.selectableId);
                    }
                    selectionController.params = StaticTextSelectionParams.copy$default(selectionController.params, null, textLayoutResult, 1);
                }
                Map map = this.baselineCache;
                if (map == null) {
                    map = new LinkedHashMap(2);
                }
                map.put(AlignmentLineKt.FirstBaseline, Integer.valueOf(Math.round(textLayoutResult.firstBaseline)));
                map.put(AlignmentLineKt.LastBaseline, Integer.valueOf(Math.round(textLayoutResult.lastBaseline)));
                this.baselineCache = map;
            }
            Function1 function12 = this.onPlaceholderLayout;
            if (function12 != null) {
                function12.invoke(textLayoutResult.placeholderRects);
            }
            int i = (int) (j2 >> 32);
            int i2 = (int) (j2 & BodyPartID.bodyIdMax);
            Placeable mo833measureBRTryo0 = measurable.mo833measureBRTryo0(DimensionKt.m1465fitPrioritizingWidthZbe2FdA(i, i, i2, i2));
            Map map2 = this.baselineCache;
            map2.getClass();
            return measureScope.layout(i, i2, map2, new FillNode$$ExternalSyntheticLambda0(mo833measureBRTryo0, 7));
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return getLayoutCache(intrinsicMeasureScope).intrinsicHeight(i, intrinsicMeasureScope.getLayoutDirection());
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public final int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i) {
        return BasicTextKt.ceilToIntPx(getLayoutCache(intrinsicMeasureScope).setLayoutDirection(intrinsicMeasureScope.getLayoutDirection()).getMinIntrinsicWidth());
    }

    public final boolean updateCallbacks(Function1 function1, Function1 function12, SelectionController selectionController, Function1 function13) {
        boolean z;
        if (this.onTextLayout != function1) {
            this.onTextLayout = function1;
            z = true;
        } else {
            z = false;
        }
        if (this.onPlaceholderLayout != function12) {
            this.onPlaceholderLayout = function12;
            z = true;
        }
        if (!Intrinsics.areEqual(this.selectionController, selectionController)) {
            this.selectionController = selectionController;
            z = true;
        }
        if (this.onShowTranslation == function13) {
            return z;
        }
        this.onShowTranslation = function13;
        return true;
    }

    /* renamed from: updateLayoutRelatedArgs-y0k-MQk, reason: not valid java name */
    public final boolean m434updateLayoutRelatedArgsy0kMQk(TextStyle textStyle, List list, int i, int i2, boolean z, FontFamilyResolverImpl fontFamilyResolverImpl, int i3) {
        boolean z2 = !this.style.hasSameLayoutAffectingAttributes(textStyle);
        this.style = textStyle;
        if (!Intrinsics.areEqual(this.placeholders, list)) {
            this.placeholders = list;
            z2 = true;
        }
        if (this.minLines != i) {
            this.minLines = i;
            z2 = true;
        }
        if (this.maxLines != i2) {
            this.maxLines = i2;
            z2 = true;
        }
        if (this.softWrap != z) {
            this.softWrap = z;
            z2 = true;
        }
        if (!Intrinsics.areEqual(this.fontFamilyResolver, fontFamilyResolverImpl)) {
            this.fontFamilyResolver = fontFamilyResolverImpl;
            z2 = true;
        }
        if (this.overflow == i3) {
            return z2;
        }
        this.overflow = i3;
        return true;
    }

    public final boolean updateText$foundation(AnnotatedString annotatedString) {
        boolean areEqual = Intrinsics.areEqual(this.text.text, annotatedString.text);
        boolean z = (areEqual && Intrinsics.areEqual(this.text.annotations, annotatedString.annotations)) ? false : true;
        if (z) {
            this.text = annotatedString;
        }
        if (!areEqual) {
            this.textSubstitution = null;
        }
        return z;
    }

    public final MultiParagraphLayoutCache getLayoutCache(Density density) {
        MultiParagraphLayoutCache layoutCache;
        TextSubstitutionValue textSubstitutionValue = this.textSubstitution;
        if (textSubstitutionValue != null && textSubstitutionValue.isShowingSubstitution() && (layoutCache = textSubstitutionValue.getLayoutCache()) != null) {
            layoutCache.setDensity$foundation(density);
            return layoutCache;
        }
        MultiParagraphLayoutCache layoutCache2 = getLayoutCache();
        layoutCache2.setDensity$foundation(density);
        return layoutCache2;
    }
}
