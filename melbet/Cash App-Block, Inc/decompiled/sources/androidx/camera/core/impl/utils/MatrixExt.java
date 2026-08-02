package androidx.camera.core.impl.utils;

import android.opengl.Matrix;
import androidx.camera.core.impl.DynamicRanges;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.media3.extractor.mkv.Sniffer;
import androidx.recyclerview.widget.RecyclerView;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.appmessages.AppMessageImage;
import com.squareup.cash.appmessages.views.AppMessageImageView;
import com.squareup.cash.arcade.components.CopyCodeKt$$ExternalSyntheticLambda5;
import com.squareup.cash.arcade.treehouse.ChildrenList$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.genie.GenieViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.cash.ui.widget.text.BalancedLineTextView;
import com.squareup.contour.ContourLayout;
import com.squareup.contour.XInt;
import com.squareup.contour.YInt;
import com.squareup.wire.ByteArrayProtoReader32;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public abstract class MatrixExt {
    public static final void GenieNodeView(Node node, Modifier modifier, Composer composer, int i) {
        node.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(859588542);
        int i2 = (gapComposer.changedInstance(node) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            DynamicRanges.GenieInclusionGate(node.is_included, Expect_jvmKt.rememberComposableLambda(-1341795257, new GenieViewKt$$ExternalSyntheticLambda1(node, modifier, i3), gapComposer), gapComposer, 48);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(node, modifier, i, 11);
        }
    }

    public static final void layoutImage(ContourLayout contourLayout, final AppMessageImageView appMessageImageView) {
        final int i = 1;
        appMessageImageView.setMaxWidthResolver(new CopyCodeKt$$ExternalSyntheticLambda5(i));
        ByteArrayProtoReader32 centerHorizontallyTo = ContourLayout.centerHorizontallyTo(new CopyCodeKt$$ExternalSyntheticLambda5(3));
        final int i2 = 0;
        centerHorizontallyTo.widthOf(1, new Function1() { // from class: com.squareup.cash.appmessages.views.CommonLayoutKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                AppMessageImageView appMessageImageView2 = appMessageImageView;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i3) {
                    case 0:
                        layoutSpec.getClass();
                        return new XInt(appMessageImageView2.m2980computedWidthTENr5nQ(layoutSpec));
                    case 1:
                        int i4 = SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top;
                        Sniffer sniffer = appMessageImageView2.layoutHelper;
                        AppMessageImage appMessageImage = appMessageImageView2.imageMetadata;
                        int i5 = sniffer.peekLength;
                        if (!(appMessageImage instanceof AppMessageImage.Static.Inset) && !(appMessageImage instanceof AppMessageImage.Animated.Inset)) {
                            if (!(appMessageImage instanceof AppMessageImage.Static.Fill) && !(appMessageImage instanceof AppMessageImage.Animated.Fill)) {
                                if (!(appMessageImage instanceof AppMessageImage.Static.Fixed) && !(appMessageImage instanceof AppMessageImage.Animated.Fixed)) {
                                    if (appMessageImage != null) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                }
                            }
                            i5 = 0;
                        }
                        return new YInt(i4 + i5);
                    default:
                        layoutSpec.getClass();
                        return new YInt((int) (appMessageImageView2.assetHeight * (appMessageImageView2.m2980computedWidthTENr5nQ(layoutSpec) / appMessageImageView2.assetWidth)));
                }
            }
        });
        ByteArrayProtoReader32 byteArrayProtoReader32 = ContourLayout.topTo(new Function1() { // from class: com.squareup.cash.appmessages.views.CommonLayoutKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i;
                AppMessageImageView appMessageImageView2 = appMessageImageView;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i3) {
                    case 0:
                        layoutSpec.getClass();
                        return new XInt(appMessageImageView2.m2980computedWidthTENr5nQ(layoutSpec));
                    case 1:
                        int i4 = SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top;
                        Sniffer sniffer = appMessageImageView2.layoutHelper;
                        AppMessageImage appMessageImage = appMessageImageView2.imageMetadata;
                        int i5 = sniffer.peekLength;
                        if (!(appMessageImage instanceof AppMessageImage.Static.Inset) && !(appMessageImage instanceof AppMessageImage.Animated.Inset)) {
                            if (!(appMessageImage instanceof AppMessageImage.Static.Fill) && !(appMessageImage instanceof AppMessageImage.Animated.Fill)) {
                                if (!(appMessageImage instanceof AppMessageImage.Static.Fixed) && !(appMessageImage instanceof AppMessageImage.Animated.Fixed)) {
                                    if (appMessageImage != null) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                }
                            }
                            i5 = 0;
                        }
                        return new YInt(i4 + i5);
                    default:
                        layoutSpec.getClass();
                        return new YInt((int) (appMessageImageView2.assetHeight * (appMessageImageView2.m2980computedWidthTENr5nQ(layoutSpec) / appMessageImageView2.assetWidth)));
                }
            }
        });
        final int i3 = 2;
        byteArrayProtoReader32.heightOf(1, new Function1() { // from class: com.squareup.cash.appmessages.views.CommonLayoutKt$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i32 = i3;
                AppMessageImageView appMessageImageView2 = appMessageImageView;
                ContourLayout.LayoutSpec layoutSpec = (ContourLayout.LayoutSpec) obj;
                switch (i32) {
                    case 0:
                        layoutSpec.getClass();
                        return new XInt(appMessageImageView2.m2980computedWidthTENr5nQ(layoutSpec));
                    case 1:
                        int i4 = SVG$Unit$EnumUnboxingLocalUtility.m2977m(layoutSpec).top;
                        Sniffer sniffer = appMessageImageView2.layoutHelper;
                        AppMessageImage appMessageImage = appMessageImageView2.imageMetadata;
                        int i5 = sniffer.peekLength;
                        if (!(appMessageImage instanceof AppMessageImage.Static.Inset) && !(appMessageImage instanceof AppMessageImage.Animated.Inset)) {
                            if (!(appMessageImage instanceof AppMessageImage.Static.Fill) && !(appMessageImage instanceof AppMessageImage.Animated.Fill)) {
                                if (!(appMessageImage instanceof AppMessageImage.Static.Fixed) && !(appMessageImage instanceof AppMessageImage.Animated.Fixed)) {
                                    if (appMessageImage != null) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                }
                            }
                            i5 = 0;
                        }
                        return new YInt(i4 + i5);
                    default:
                        layoutSpec.getClass();
                        return new YInt((int) (appMessageImageView2.assetHeight * (appMessageImageView2.m2980computedWidthTENr5nQ(layoutSpec) / appMessageImageView2.assetWidth)));
                }
            }
        });
        ContourLayout.layoutBy$default(contourLayout, appMessageImageView, centerHorizontallyTo, byteArrayProtoReader32);
    }

    public static final void layoutSubtitle(ContourLayout contourLayout, BalancedLineTextView balancedLineTextView) {
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new ChildrenList$$ExternalSyntheticLambda0(contourLayout, 2));
        leftTo.rightTo(1, new ChildrenList$$ExternalSyntheticLambda0(contourLayout, 3));
        ContourLayout.layoutBy$default(contourLayout, balancedLineTextView, leftTo, contourLayout.emptyY());
    }

    public static final void layoutTitle(ContourLayout contourLayout, BalancedLineTextView balancedLineTextView) {
        ByteArrayProtoReader32 leftTo = ContourLayout.leftTo(new ChildrenList$$ExternalSyntheticLambda0(contourLayout, 4));
        leftTo.rightTo(1, new ChildrenList$$ExternalSyntheticLambda0(contourLayout, 5));
        ContourLayout.layoutBy$default(contourLayout, balancedLineTextView, leftTo, contourLayout.emptyY());
    }

    public static void preRotate(float f, float[] fArr) {
        Matrix.translateM(fArr, 0, 0.5f, 0.5f, RecyclerView.DECELERATION_RATE);
        Matrix.rotateM(fArr, 0, f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 1.0f);
        Matrix.translateM(fArr, 0, -0.5f, -0.5f, RecyclerView.DECELERATION_RATE);
    }

    public static void preVerticalFlip(float[] fArr) {
        Matrix.translateM(fArr, 0, RecyclerView.DECELERATION_RATE, 0.5f, RecyclerView.DECELERATION_RATE);
        Matrix.scaleM(fArr, 0, 1.0f, -1.0f, 1.0f);
        Matrix.translateM(fArr, 0, -0.0f, -0.5f, RecyclerView.DECELERATION_RATE);
    }
}
