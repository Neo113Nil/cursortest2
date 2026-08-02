package app.cash.redwood.layout.view;

import androidx.recyclerview.widget.RecyclerView;
import app.cash.arcade.protocol.host.redwoodlayout.FlexImpl;
import app.cash.arcade.protocol.host.redwoodlayout.GrowImpl;
import app.cash.arcade.protocol.host.redwoodlayout.HeightImpl;
import app.cash.arcade.protocol.host.redwoodlayout.HorizontalAlignmentImpl;
import app.cash.arcade.protocol.host.redwoodlayout.MarginImpl;
import app.cash.arcade.protocol.host.redwoodlayout.ShrinkImpl;
import app.cash.arcade.protocol.host.redwoodlayout.SizeImpl;
import app.cash.arcade.protocol.host.redwoodlayout.VerticalAlignmentImpl;
import app.cash.arcade.protocol.host.redwoodlayout.WidthImpl;
import app.cash.redwood.Modifier;
import app.cash.redwood.layout.api.CrossAxisAlignment;
import app.cash.redwood.ui.Density;
import app.cash.redwood.ui.Margin;
import app.cash.redwood.yoga.Node;
import app.cash.redwood.yoga.internal.YGNode;
import app.cash.redwood.yoga.internal.YGStyle;
import app.cash.redwood.yoga.internal.Yoga;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda0;
import app.cash.redwood.yoga.internal.detail.CompactValue;
import app.cash.redwood.yoga.internal.detail.Values;
import app.cash.redwood.yoga.internal.enums.YGAlign;
import app.cash.redwood.yoga.internal.enums.YGDimension;
import app.cash.redwood.yoga.internal.enums.YGEdge;
import app.cash.redwood.yoga.internal.enums.YGUnit;
import bo.app.yf$$ExternalSyntheticLambda10;
import com.squareup.cash.androidsvg.SVGAndroidRenderer;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.cashsuggest.api.Section;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Reflection;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class FlexboxHelpersKt {
    /* renamed from: applyModifier-nB0u8Lg, reason: not valid java name */
    public static final void m1358applyModifiernB0u8Lg(Node node, Modifier modifier, final double d) {
        int i;
        int i2;
        YGEdge yGEdge;
        int i3;
        YGAlign yGAlign;
        YGNode yGNode;
        YGStyle yGStyle;
        node.getClass();
        modifier.getClass();
        YGNode yGNode2 = node.f60native;
        boolean isDirty = yGNode2.isDirty();
        YGEdge yGEdge2 = YGEdge.YGEdgeStart;
        float margin = node.getMargin(yGEdge2);
        final Ref$FloatRef ref$FloatRef = new Ref$FloatRef();
        ref$FloatRef.element = Float.NaN;
        YGEdge yGEdge3 = YGEdge.YGEdgeEnd;
        float margin2 = node.getMargin(yGEdge3);
        final Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
        ref$FloatRef2.element = Float.NaN;
        YGEdge yGEdge4 = YGEdge.YGEdgeTop;
        float margin3 = node.getMargin(yGEdge4);
        final Ref$FloatRef ref$FloatRef3 = new Ref$FloatRef();
        ref$FloatRef3.element = Float.NaN;
        YGEdge yGEdge5 = YGEdge.YGEdgeBottom;
        float margin4 = node.getMargin(yGEdge5);
        final Ref$FloatRef ref$FloatRef4 = new Ref$FloatRef();
        ref$FloatRef4.element = Float.NaN;
        YGStyle yGStyle2 = yGNode2.style;
        YGStyle yGStyle3 = yGNode2.style;
        int ordinal = yGStyle2.alignSelf().ordinal();
        if (ordinal == 0) {
            i = 5;
            i2 = 5;
            yGEdge = yGEdge5;
        } else if (ordinal == 1) {
            i = 5;
            yGEdge = yGEdge5;
            i2 = 0;
        } else if (ordinal == 2) {
            i = 5;
            yGEdge = yGEdge5;
            i2 = 2;
        } else if (ordinal == 3) {
            i = 5;
            yGEdge = yGEdge5;
            i2 = 1;
        } else if (ordinal != 4) {
            i = 5;
            if (ordinal != 5) {
                Path$$ExternalSyntheticBUOutline0.m$2();
                return;
            } else {
                yGEdge = yGEdge5;
                i2 = 3;
            }
        } else {
            i = 5;
            yGEdge = yGEdge5;
            i2 = 4;
        }
        final Ref$IntRef ref$IntRef = new Ref$IntRef();
        ref$IntRef.element = i;
        Yoga yoga = Yoga.INSTANCE;
        Values values = yGStyle3.minDimensions;
        YGDimension yGDimension = YGDimension.YGDimensionWidth;
        int i4 = i2;
        float f = values.get(0).value;
        final Ref$FloatRef ref$FloatRef5 = new Ref$FloatRef();
        ref$FloatRef5.element = Float.NaN;
        float f2 = yGStyle3.maxDimensions.get(0).value;
        final Ref$FloatRef ref$FloatRef6 = new Ref$FloatRef();
        ref$FloatRef6.element = Float.NaN;
        float f3 = yGStyle3.minDimensions.get(1).value;
        final Ref$FloatRef ref$FloatRef7 = new Ref$FloatRef();
        ref$FloatRef7.element = Float.NaN;
        float f4 = yGStyle3.maxDimensions.get(1).value;
        final Ref$FloatRef ref$FloatRef8 = new Ref$FloatRef();
        ref$FloatRef8.element = Float.NaN;
        float f5 = Float.isNaN(yGStyle3.flexGrow) ? RecyclerView.DECELERATION_RATE : yGStyle3.flexGrow;
        YGEdge yGEdge6 = yGEdge;
        final Ref$FloatRef ref$FloatRef9 = new Ref$FloatRef();
        float f6 = Float.isNaN(yGStyle3.flexShrink) ? 0.0f : yGStyle3.flexShrink;
        final Ref$FloatRef ref$FloatRef10 = new Ref$FloatRef();
        float f7 = f5;
        CompactValue compactValue = yGStyle3.flexBasis;
        YGUnit yGUnit = (YGUnit) compactValue.payload_.fullPath;
        float f8 = f6;
        YGUnit yGUnit2 = YGUnit.YGUnitPercent;
        float f9 = yGUnit == yGUnit2 ? compactValue.convertToYgValue().value : -1.0f;
        final Ref$FloatRef ref$FloatRef11 = new Ref$FloatRef();
        ref$FloatRef11.element = -1.0f;
        float f10 = f9;
        modifier.forEachScoped(new Function1() { // from class: app.cash.redwood.layout.view.FlexboxHelpersKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Modifier.ScopedElement scopedElement = (Modifier.ScopedElement) obj;
                scopedElement.getClass();
                boolean z = scopedElement instanceof GrowImpl;
                Ref$FloatRef ref$FloatRef12 = Ref$FloatRef.this;
                if (z) {
                    ref$FloatRef12.element = (float) ((GrowImpl) scopedElement).value;
                } else {
                    boolean z2 = scopedElement instanceof ShrinkImpl;
                    Ref$FloatRef ref$FloatRef13 = ref$FloatRef10;
                    if (z2) {
                        ref$FloatRef13.element = (float) ((ShrinkImpl) scopedElement).value;
                    } else {
                        boolean z3 = scopedElement instanceof MarginImpl;
                        double d2 = d;
                        if (z3) {
                            Margin margin5 = ((MarginImpl) scopedElement).margin;
                            ref$FloatRef.element = (float) Density.m1401toPxmnpKzHI(d2, margin5.start);
                            ref$FloatRef2.element = (float) Density.m1401toPxmnpKzHI(d2, margin5.end);
                            ref$FloatRef3.element = (float) Density.m1401toPxmnpKzHI(d2, margin5.top);
                            ref$FloatRef4.element = (float) Density.m1401toPxmnpKzHI(d2, margin5.bottom);
                        } else {
                            boolean z4 = scopedElement instanceof HorizontalAlignmentImpl;
                            Ref$IntRef ref$IntRef2 = ref$IntRef;
                            if (z4) {
                                ref$IntRef2.element = FlexboxHelpersKt.m1359toAlignSelfnjEs0f8(((HorizontalAlignmentImpl) scopedElement).alignment);
                            } else if (scopedElement instanceof VerticalAlignmentImpl) {
                                ref$IntRef2.element = FlexboxHelpersKt.m1359toAlignSelfnjEs0f8(((VerticalAlignmentImpl) scopedElement).alignment);
                            } else {
                                boolean z5 = scopedElement instanceof WidthImpl;
                                Ref$FloatRef ref$FloatRef14 = ref$FloatRef5;
                                Ref$FloatRef ref$FloatRef15 = ref$FloatRef6;
                                if (z5) {
                                    float m1401toPxmnpKzHI = (float) Density.m1401toPxmnpKzHI(d2, ((WidthImpl) scopedElement).width);
                                    ref$FloatRef14.element = m1401toPxmnpKzHI;
                                    ref$FloatRef15.element = m1401toPxmnpKzHI;
                                } else {
                                    boolean z6 = scopedElement instanceof HeightImpl;
                                    Ref$FloatRef ref$FloatRef16 = ref$FloatRef7;
                                    Ref$FloatRef ref$FloatRef17 = ref$FloatRef8;
                                    if (z6) {
                                        float m1401toPxmnpKzHI2 = (float) Density.m1401toPxmnpKzHI(d2, ((HeightImpl) scopedElement).height);
                                        ref$FloatRef16.element = m1401toPxmnpKzHI2;
                                        ref$FloatRef17.element = m1401toPxmnpKzHI2;
                                    } else if (scopedElement instanceof SizeImpl) {
                                        SizeImpl sizeImpl = (SizeImpl) scopedElement;
                                        float m1401toPxmnpKzHI3 = (float) Density.m1401toPxmnpKzHI(d2, sizeImpl.width);
                                        ref$FloatRef14.element = m1401toPxmnpKzHI3;
                                        ref$FloatRef15.element = m1401toPxmnpKzHI3;
                                        float m1401toPxmnpKzHI4 = (float) Density.m1401toPxmnpKzHI(d2, sizeImpl.height);
                                        ref$FloatRef16.element = m1401toPxmnpKzHI4;
                                        ref$FloatRef17.element = m1401toPxmnpKzHI4;
                                    } else if (scopedElement instanceof FlexImpl) {
                                        double d3 = ((FlexImpl) scopedElement).value;
                                        if (d3 < 0.0d) {
                                            d3 = 0.0d;
                                        }
                                        float f11 = (float) d3;
                                        ref$FloatRef12.element = f11;
                                        ref$FloatRef13.element = 1.0f;
                                        float f12 = RecyclerView.DECELERATION_RATE;
                                        if (f11 <= RecyclerView.DECELERATION_RATE) {
                                            f12 = -1.0f;
                                        }
                                        ref$FloatRef11.element = f12;
                                    }
                                }
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        });
        if (neq(ref$FloatRef.element, margin)) {
            node.setMargin(yGEdge2, ref$FloatRef.element);
        }
        if (neq(ref$FloatRef2.element, margin2)) {
            node.setMargin(yGEdge3, ref$FloatRef2.element);
        }
        if (neq(ref$FloatRef3.element, margin3)) {
            node.setMargin(yGEdge4, ref$FloatRef3.element);
        }
        if (neq(ref$FloatRef4.element, margin4)) {
            node.setMargin(yGEdge6, ref$FloatRef4.element);
        }
        int i5 = ref$IntRef.element;
        if (i5 == i4) {
            yGNode = yGNode2;
            i3 = 5;
        } else {
            Yoga yoga2 = Yoga.INSTANCE;
            if (i5 == 0) {
                yGAlign = YGAlign.YGAlignFlexStart;
            } else if (i5 == 1) {
                yGAlign = YGAlign.YGAlignFlexEnd;
            } else if (i5 == 2) {
                yGAlign = YGAlign.YGAlignCenter;
            } else if (i5 == 3) {
                yGAlign = YGAlign.YGAlignBaseline;
            } else if (i5 == 4) {
                yGAlign = YGAlign.YGAlignStretch;
            } else {
                i3 = 5;
                if (i5 != 5) {
                    Path$$ExternalSyntheticBUOutline0.m$2();
                    return;
                } else {
                    yGAlign = YGAlign.YGAlignAuto;
                    yGNode = yGNode2;
                    Yoga.updateStyle(yGNode, Reflection.factory.getOrCreateKotlinClass(YGAlign.class), yGAlign, new yf$$ExternalSyntheticLambda10(6));
                }
            }
            i3 = 5;
            yGNode = yGNode2;
            Yoga.updateStyle(yGNode, Reflection.factory.getOrCreateKotlinClass(YGAlign.class), yGAlign, new yf$$ExternalSyntheticLambda10(6));
        }
        if (neq(ref$FloatRef5.element, f)) {
            float f11 = ref$FloatRef5.element;
            Yoga yoga3 = Yoga.INSTANCE;
            YGDimension yGDimension2 = YGDimension.YGDimensionWidth;
            YGUnit yGUnit3 = YGUnit.YGUnitUndefined;
            Yoga.updateStyleIndexed(yGNode, yGDimension2, f11, new Yoga$$ExternalSyntheticLambda0(28));
        }
        if (neq(ref$FloatRef6.element, f2)) {
            float f12 = ref$FloatRef6.element;
            yGNode.getClass();
            Yoga.updateStyleIndexed(yGNode, YGDimension.YGDimensionWidth, f12, new Yoga$$ExternalSyntheticLambda0(29));
        }
        if (neq(ref$FloatRef7.element, f3)) {
            float f13 = ref$FloatRef7.element;
            Yoga yoga4 = Yoga.INSTANCE;
            YGDimension yGDimension3 = YGDimension.YGDimensionHeight;
            YGUnit yGUnit4 = YGUnit.YGUnitUndefined;
            Yoga.updateStyleIndexed(yGNode, yGDimension3, f13, new Yoga$$ExternalSyntheticLambda0(27));
        }
        if (neq(ref$FloatRef8.element, f4)) {
            float f14 = ref$FloatRef8.element;
            yGNode.getClass();
            Yoga.updateStyleIndexed(yGNode, YGDimension.YGDimensionHeight, f14, new yf$$ExternalSyntheticLambda10(i3));
        }
        if (neq(ref$FloatRef9.element, f7)) {
            float f15 = ref$FloatRef9.element;
            yGStyle3.getClass();
            yGStyle = yGStyle3;
            if (f15 != yGStyle.flexGrow) {
                yGStyle.flexGrow = f15;
                yGNode.markDirtyAndPropogate();
            }
        } else {
            yGStyle = yGStyle3;
        }
        if (neq(ref$FloatRef10.element, f8)) {
            float f16 = ref$FloatRef10.element;
            yGStyle.getClass();
            if (f16 != yGStyle.flexShrink) {
                yGStyle.flexShrink = f16;
                yGNode.markDirtyAndPropogate();
            }
        }
        if (neq(ref$FloatRef11.element, f10)) {
            float f17 = ref$FloatRef11.element;
            if (f17 >= RecyclerView.DECELERATION_RATE) {
                CompactValue compactValue2 = (Float.isNaN(f17) || Float.isInfinite(f17)) ? new CompactValue() : Section.Content.of(f17, yGUnit2);
                yGStyle.getClass();
                CompactValue compactValue3 = yGStyle.flexBasis;
                compactValue3.getClass();
                SVGAndroidRenderer sVGAndroidRenderer = compactValue3.payload_;
                YGUnit yGUnit5 = (YGUnit) sVGAndroidRenderer.fullPath;
                SVGAndroidRenderer sVGAndroidRenderer2 = compactValue2.payload_;
                if (yGUnit5 != ((YGUnit) sVGAndroidRenderer2.fullPath) || sVGAndroidRenderer.dpi != sVGAndroidRenderer2.dpi) {
                    yGStyle.flexBasis = compactValue2;
                    yGNode.markDirtyAndPropogate();
                }
            } else {
                YGUnit yGUnit6 = YGUnit.YGUnitAuto;
                CompactValue compactValue4 = new CompactValue(new SVGAndroidRenderer(RecyclerView.DECELERATION_RATE, yGUnit6));
                yGStyle.getClass();
                CompactValue compactValue5 = yGStyle.flexBasis;
                compactValue5.getClass();
                SVGAndroidRenderer sVGAndroidRenderer3 = compactValue5.payload_;
                if (((YGUnit) sVGAndroidRenderer3.fullPath) != yGUnit6 || sVGAndroidRenderer3.dpi != RecyclerView.DECELERATION_RATE) {
                    yGStyle.flexBasis = compactValue4;
                    yGNode.markDirtyAndPropogate();
                }
            }
        }
        if (isDirty) {
            return;
        }
        yGNode.isDirty();
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewDocumentStockTaxForm.deepLinkSpecs;
    }

    public static final boolean neq(float f, float f2) {
        if (f == f2) {
            return false;
        }
        return f == f || f2 == f2;
    }

    /* renamed from: toAlignSelf-njEs0f8, reason: not valid java name */
    public static final int m1359toAlignSelfnjEs0f8(int i) {
        CrossAxisAlignment.Companion companion = CrossAxisAlignment.Companion;
        companion.getClass();
        if (i == 0) {
            return 0;
        }
        companion.getClass();
        if (i == 1) {
            return 2;
        }
        companion.getClass();
        if (i == 2) {
            return 1;
        }
        companion.getClass();
        if (i == 3) {
            return 4;
        }
        Path$$ExternalSyntheticBUOutline0.m$2();
        return 0;
    }
}
