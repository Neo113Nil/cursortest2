package com.squareup.cash.card.onboarding;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.PointF;
import androidx.activity.result.PickVisualMediaRequestKt;
import androidx.camera.core.AspectRatio;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransitionImpl;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.DerivedSnapshotState;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.AndroidPath;
import androidx.compose.ui.graphics.AndroidPathEffect;
import androidx.compose.ui.graphics.AndroidPathMeasure;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.CanvasDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.vector.PathParserKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.LayoutNodeDrawScope;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.emoji2.text.MetadataRepo;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import androidx.paging.PageFetcher$flow$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.molecule.MoleculeKt$immediateClockFlow$1$1$1;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.Extras;
import com.google.zxing.Result;
import com.plaid.internal.EnumC0170g;
import com.squareup.cardcustomizations.signature.PatternStateListener;
import com.squareup.cardcustomizations.signature.SavedSignature;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cardcustomizations.stampview.InitialStampsData;
import com.squareup.cardcustomizations.stampview.PatternStampState;
import com.squareup.cardcustomizations.stampview.StampState;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.views.SignatureViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda1;
import com.squareup.cash.borrow.views.LoanDetailsSheetKt$$ExternalSyntheticLambda14;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda1;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda15;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda1;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.music.views.TrackRowKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.presenters.OffersAnalyticsKt;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.wallet.views.HeroCardViewKt$$ExternalSyntheticLambda28;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.TouchData;
import com.squareup.protos.franklin.common.Stamp;
import com.squareup.util.Strings;
import com.squareup.wire.GrpcMethod;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.ClosedFloatRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes6.dex */
public abstract class CardStudioViewV2Kt {
    public static final /* synthetic */ int $r8$clinit = 0;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Orientation orientation = Orientation.PORTRAIT;
                iArr[2] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Orientation orientation2 = Orientation.PORTRAIT;
                iArr[1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[CardTheme.Gradient.values().length];
            try {
                iArr2[CardTheme.Gradient.DIAGONAL_DARK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[CardTheme.Gradient.DIAGONAL_LIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[CardTheme.BackgroundImage.values().length];
            try {
                iArr3[CardTheme.BackgroundImage.HOOD_BY_AIR.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[CardTheme.BackgroundImage.HUNDRED_THIEVES.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[CardTheme.BackgroundImage.METAL_OIL_SLICK.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[CardTheme.BackgroundImage.METAL_BLACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[CardTheme.BackgroundImage.SHANTELL_MARTIN.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[CardTheme.BackgroundImage.DREAM.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[CardTheme.BackgroundImage.MOOD.ordinal()] = 7;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[CardTheme.BackgroundImage.GLITTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[CardTheme.BackgroundImage.TORTOISE.ordinal()] = 9;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr3[CardTheme.BackgroundImage.BRAT.ordinal()] = 10;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    static {
        Float valueOf = Float.valueOf(2023.0f);
        Float valueOf2 = Float.valueOf(1276.0f);
        Float valueOf3 = Float.valueOf(RecyclerView.DECELERATION_RATE);
        TouchData.Point point = new TouchData.Point(valueOf3, valueOf3, 1L, null, 8, null);
        Float valueOf4 = Float.valueOf(505.75f);
        Float valueOf5 = Float.valueOf(319.0f);
        TouchData.Point point2 = new TouchData.Point(valueOf4, valueOf5, 2L, null, 8, null);
        Float valueOf6 = Float.valueOf(1011.5f);
        Float valueOf7 = Float.valueOf(638.0f);
        TouchData.Point point3 = new TouchData.Point(valueOf6, valueOf7, 3L, null, 8, null);
        Float valueOf8 = Float.valueOf(1517.25f);
        Float valueOf9 = Float.valueOf(957.0f);
        TouchData.Point point4 = new TouchData.Point(valueOf8, valueOf9, 4L, null, 8, null);
        TouchData.Point point5 = new TouchData.Point(valueOf, valueOf2, 5L, null, 8, null);
        Float valueOf10 = Float.valueOf(2528.75f);
        Float valueOf11 = Float.valueOf(1595.0f);
        TouchData touchData = new TouchData(valueOf, valueOf2, CollectionsKt__CollectionsKt.listOf((Object[]) new TouchData.Stroke[]{new TouchData.Stroke(CollectionsKt__CollectionsKt.listOf((Object[]) new TouchData.Point[]{point, point2, point3, point4, point5, new TouchData.Point(valueOf10, valueOf11, 6L, null, 8, null)}), null, 2, null), new TouchData.Stroke(CollectionsKt__CollectionsKt.listOf((Object[]) new TouchData.Point[]{new TouchData.Point(valueOf, valueOf3, 7L, null, 8, null), new TouchData.Point(valueOf8, valueOf5, 8L, null, 8, null), new TouchData.Point(valueOf6, valueOf7, 9L, null, 8, null), new TouchData.Point(valueOf4, valueOf9, 10L, null, 8, null), new TouchData.Point(valueOf3, valueOf2, 11L, null, 8, null), new TouchData.Point(Float.valueOf(-505.75f), valueOf11, 12L, null, 8, null)}), null, 2, null)}), (List) null, 24);
        CardTheme cardTheme = CardStudioViewKt.BLACK_CARD_THEME;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        new CardStudioViewModelV2.Content("$Mando", true, true, true, cardTheme, StyledCardViewModelKt.toPortraitCustomizationDetails(touchData, emptyMap), null, 1984);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x08a4  */
    /* JADX WARN: Removed duplicated region for block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0899  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Type inference failed for: r3v50, types: [androidx.compose.ui.Modifier] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CardStudioV2Content(Modifier modifier, Flow flow, final CardStudioViewModelV2.Content content, final Function1 function1, Composer composer, int i, int i2) {
        int i3;
        Flow flow2;
        int i4;
        int i5;
        Flow flow3;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        float f;
        final int i6;
        Object obj;
        Applier applier;
        Object obj2;
        BiasAlignment biasAlignment;
        Object obj3;
        State state;
        boolean z;
        Object obj4;
        CardStudioViewModelV2.CustomizationMode.DRAW draw;
        float f2;
        Object obj5;
        Result result;
        Object obj6;
        Object navHostKt$NavHost$33$1;
        SnapshotStateList snapshotStateList;
        StampResult stampResult;
        MutableState mutableState;
        MutableState mutableState2;
        MetadataRepo metadataRepo;
        MutableState mutableState3;
        int i7;
        int i8;
        SnapshotStateList snapshotStateList2;
        CardStudioViewModelV2.CustomizationMode customizationMode;
        PatternStampState patternStampState;
        MutableState mutableState4;
        StampState stampState;
        Object moleculeKt$immediateClockFlow$1$1$1;
        StampState stampState2;
        final SnapshotStateList snapshotStateList3;
        Function1 function12;
        boolean z2;
        Object obj7;
        CardStudioViewModelV2.CustomizationMode.DEFAULT r54;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        BiasAlignment biasAlignment2;
        CardStudioViewModelV2.CustomizationMode.STAMP stamp;
        BiasAlignment biasAlignment3;
        CardStudioViewModelV2.CustomizationMode.DRAW draw2;
        boolean z3;
        StampState stampState3;
        PatternStampState patternStampState2;
        float f3;
        GapComposer gapComposer2;
        float f4;
        GapComposer gapComposer3;
        boolean z4;
        GapComposer gapComposer4;
        float f5;
        float f6;
        BiasAlignment biasAlignment4 = Alignment.Companion.BottomStart;
        BiasAlignment biasAlignment5 = Alignment.Companion.BottomCenter;
        BiasAlignment biasAlignment6 = Alignment.Companion.TopCenter;
        GapComposer gapComposer5 = (GapComposer) composer;
        gapComposer5.startRestartGroup(717989704);
        Applier applier2 = gapComposer5.applier;
        if ((i & 6) == 0) {
            i3 = (gapComposer5.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            flow2 = flow;
            if (gapComposer5.changedInstance(flow2)) {
                i4 = 32;
                i5 = i3 | i4 | (!gapComposer5.changedInstance(content) ? 256 : 128);
                if ((i & 3072) == 0) {
                    i5 |= gapComposer5.changedInstance(function1) ? 2048 : 1024;
                }
                if (gapComposer5.shouldExecute(i5 & 1, (i5 & 1171) == 1170)) {
                    gapComposer5.skipToGroupEnd();
                    flow3 = flow2;
                    gapComposer = gapComposer5;
                } else {
                    gapComposer5.startDefaults();
                    if ((i & 1) != 0 && !gapComposer5.getDefaultsInvalid()) {
                        gapComposer5.skipToGroupEnd();
                        if ((i2 & 2) != 0) {
                            i5 &= -113;
                        }
                    } else if ((i2 & 2) != 0) {
                        i5 &= -113;
                        flow2 = EmptyFlow.INSTANCE;
                    }
                    Flow flow4 = flow2;
                    gapComposer5.endDefaults();
                    Orientation orientation = content.orientation;
                    CardStudioViewModelV2.CustomizationMode customizationMode2 = content.customizationMode;
                    int ordinal = orientation.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            f6 = -270.0f;
                        } else {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            f6 = -90.0f;
                        }
                        f = f6;
                    } else {
                        f = RecyclerView.DECELERATION_RATE;
                    }
                    Object rememberedValue = gapComposer5.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    Object obj8 = rememberedValue;
                    if (rememberedValue == neverEqualPolicy) {
                        ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer5.updateRememberedValue(mutableStateOf$default);
                        obj8 = mutableStateOf$default;
                    }
                    MutableState mutableState5 = (MutableState) obj8;
                    Object rememberedValue2 = gapComposer5.rememberedValue();
                    Object obj9 = rememberedValue2;
                    if (rememberedValue2 == neverEqualPolicy) {
                        ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(Boolean.TRUE);
                        gapComposer5.updateRememberedValue(mutableStateOf$default2);
                        obj9 = mutableStateOf$default2;
                    }
                    MutableState mutableState6 = (MutableState) obj9;
                    Object rememberedValue3 = gapComposer5.rememberedValue();
                    Object obj10 = rememberedValue3;
                    if (rememberedValue3 == neverEqualPolicy) {
                        SnapshotStateList snapshotStateList4 = new SnapshotStateList();
                        gapComposer5.updateRememberedValue(snapshotStateList4);
                        obj10 = snapshotStateList4;
                    }
                    SnapshotStateList snapshotStateList5 = (SnapshotStateList) obj10;
                    Object rememberedValue4 = gapComposer5.rememberedValue();
                    Object obj11 = rememberedValue4;
                    if (rememberedValue4 == neverEqualPolicy) {
                        SnapshotStateList snapshotStateList6 = new SnapshotStateList();
                        gapComposer5.updateRememberedValue(snapshotStateList6);
                        obj11 = snapshotStateList6;
                    }
                    final SnapshotStateList snapshotStateList7 = (SnapshotStateList) obj11;
                    Object rememberedValue5 = gapComposer5.rememberedValue();
                    Object obj12 = rememberedValue5;
                    if (rememberedValue5 == neverEqualPolicy) {
                        ParcelableSnapshotMutableState mutableStateOf$default3 = Updater.mutableStateOf$default(Float.valueOf(RecyclerView.DECELERATION_RATE));
                        gapComposer5.updateRememberedValue(mutableStateOf$default3);
                        obj12 = mutableStateOf$default3;
                    }
                    MutableState mutableState7 = (MutableState) obj12;
                    boolean changedInstance = gapComposer5.changedInstance(content);
                    Object rememberedValue6 = gapComposer5.rememberedValue();
                    if (changedInstance || rememberedValue6 == neverEqualPolicy) {
                        i6 = 0;
                        Function0 function0 = new Function0() { // from class: com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                CustomizationDetails customizationDetails;
                                CustomizationDetails customizationDetails2;
                                int i9 = i6;
                                ArrayList arrayList = null;
                                CardStudioViewModelV2.Content content2 = content;
                                switch (i9) {
                                    case 0:
                                        if (!content2.isShowingCustomization || (customizationDetails = content2.customizationDetails) == null) {
                                            return null;
                                        }
                                        float f7 = customizationDetails.width;
                                        float f8 = customizationDetails.height;
                                        List list = customizationDetails.strokes;
                                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            List<TouchData.Point> list2 = ((TouchData.Stroke) it.next()).points;
                                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                            for (TouchData.Point point : list2) {
                                                Float f9 = point.x_coordinate;
                                                f9.getClass();
                                                float floatValue = f9.floatValue();
                                                Float f10 = point.y_coordinate;
                                                f10.getClass();
                                                arrayList3.add(new float[]{floatValue, f10.floatValue()});
                                            }
                                            arrayList2.add((float[][]) arrayList3.toArray(new float[0][]));
                                        }
                                        return new SavedSignature(f7, f8, (float[][][]) arrayList2.toArray(new float[0][][]));
                                    default:
                                        if (content2.isShowingCustomization && (customizationDetails2 = content2.customizationDetails) != null) {
                                            List<StampDetails> list3 = customizationDetails2.stamps;
                                            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                                            for (StampDetails stampDetails : list3) {
                                                float f11 = customizationDetails2.width;
                                                float f12 = customizationDetails2.height;
                                                String str = stampDetails.stamp.name;
                                                str.getClass();
                                                Stamp stamp2 = stampDetails.stamp;
                                                String str2 = stamp2.svg;
                                                str2.getClass();
                                                com.squareup.cardcustomizations.stampview.Stamp stamp3 = new com.squareup.cardcustomizations.stampview.Stamp(str, str2);
                                                TouchData.StampCustomization stampCustomization = stampDetails.customization;
                                                Float f13 = stampCustomization.width;
                                                f13.getClass();
                                                float floatValue2 = f13.floatValue();
                                                Float f14 = stampCustomization.height;
                                                f14.getClass();
                                                float floatValue3 = f14.floatValue();
                                                TouchData.Point point2 = stampCustomization.center;
                                                point2.getClass();
                                                Float f15 = point2.x_coordinate;
                                                f15.getClass();
                                                float floatValue4 = f15.floatValue();
                                                TouchData.Point point3 = stampCustomization.center;
                                                point3.getClass();
                                                Float f16 = point3.y_coordinate;
                                                f16.getClass();
                                                PointF pointF = new PointF(floatValue4, f16.floatValue());
                                                Float f17 = stampCustomization.rotation;
                                                f17.getClass();
                                                float floatValue5 = f17.floatValue();
                                                stamp2.min_scale.getClass();
                                                arrayList.add(new InitialStampsData(f11, f12, stamp3, floatValue2, floatValue3, pointF, floatValue5, r10.intValue()));
                                            }
                                        }
                                        return arrayList;
                                }
                            }
                        };
                        gapComposer5.updateRememberedValue(function0);
                        obj = function0;
                    } else {
                        i6 = 0;
                        obj = rememberedValue6;
                    }
                    SignatureState rememberSignatureState = AspectRatio.rememberSignatureState((Function0) obj, gapComposer5, i6);
                    final int i9 = 1;
                    SignatureState rememberSignatureState2 = AspectRatio.rememberSignatureState(null, gapComposer5, 1);
                    boolean changedInstance2 = gapComposer5.changedInstance(content);
                    Object rememberedValue7 = gapComposer5.rememberedValue();
                    Object obj13 = rememberedValue7;
                    if (changedInstance2 || rememberedValue7 == neverEqualPolicy) {
                        Function0 function02 = new Function0() { // from class: com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                CustomizationDetails customizationDetails;
                                CustomizationDetails customizationDetails2;
                                int i92 = i9;
                                ArrayList arrayList = null;
                                CardStudioViewModelV2.Content content2 = content;
                                switch (i92) {
                                    case 0:
                                        if (!content2.isShowingCustomization || (customizationDetails = content2.customizationDetails) == null) {
                                            return null;
                                        }
                                        float f7 = customizationDetails.width;
                                        float f8 = customizationDetails.height;
                                        List list = customizationDetails.strokes;
                                        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                        Iterator it = list.iterator();
                                        while (it.hasNext()) {
                                            List<TouchData.Point> list2 = ((TouchData.Stroke) it.next()).points;
                                            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                                            for (TouchData.Point point : list2) {
                                                Float f9 = point.x_coordinate;
                                                f9.getClass();
                                                float floatValue = f9.floatValue();
                                                Float f10 = point.y_coordinate;
                                                f10.getClass();
                                                arrayList3.add(new float[]{floatValue, f10.floatValue()});
                                            }
                                            arrayList2.add((float[][]) arrayList3.toArray(new float[0][]));
                                        }
                                        return new SavedSignature(f7, f8, (float[][][]) arrayList2.toArray(new float[0][][]));
                                    default:
                                        if (content2.isShowingCustomization && (customizationDetails2 = content2.customizationDetails) != null) {
                                            List<StampDetails> list3 = customizationDetails2.stamps;
                                            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                                            for (StampDetails stampDetails : list3) {
                                                float f11 = customizationDetails2.width;
                                                float f12 = customizationDetails2.height;
                                                String str = stampDetails.stamp.name;
                                                str.getClass();
                                                Stamp stamp2 = stampDetails.stamp;
                                                String str2 = stamp2.svg;
                                                str2.getClass();
                                                com.squareup.cardcustomizations.stampview.Stamp stamp3 = new com.squareup.cardcustomizations.stampview.Stamp(str, str2);
                                                TouchData.StampCustomization stampCustomization = stampDetails.customization;
                                                Float f13 = stampCustomization.width;
                                                f13.getClass();
                                                float floatValue2 = f13.floatValue();
                                                Float f14 = stampCustomization.height;
                                                f14.getClass();
                                                float floatValue3 = f14.floatValue();
                                                TouchData.Point point2 = stampCustomization.center;
                                                point2.getClass();
                                                Float f15 = point2.x_coordinate;
                                                f15.getClass();
                                                float floatValue4 = f15.floatValue();
                                                TouchData.Point point3 = stampCustomization.center;
                                                point3.getClass();
                                                Float f16 = point3.y_coordinate;
                                                f16.getClass();
                                                PointF pointF = new PointF(floatValue4, f16.floatValue());
                                                Float f17 = stampCustomization.rotation;
                                                f17.getClass();
                                                float floatValue5 = f17.floatValue();
                                                stamp2.min_scale.getClass();
                                                arrayList.add(new InitialStampsData(f11, f12, stamp3, floatValue2, floatValue3, pointF, floatValue5, r10.intValue()));
                                            }
                                        }
                                        return arrayList;
                                }
                            }
                        };
                        gapComposer5.updateRememberedValue(function02);
                        obj13 = function02;
                    }
                    final StampState rememberStampState = PickVisualMediaRequestKt.rememberStampState((Function0) obj13, gapComposer5);
                    Object rememberedValue8 = gapComposer5.rememberedValue();
                    if (rememberedValue8 == neverEqualPolicy) {
                        applier = applier2;
                        PatternStampState patternStampState3 = new PatternStampState(8);
                        gapComposer5.updateRememberedValue(patternStampState3);
                        obj2 = patternStampState3;
                    } else {
                        applier = applier2;
                        obj2 = rememberedValue8;
                    }
                    final PatternStampState patternStampState4 = (PatternStampState) obj2;
                    Object rememberedValue9 = gapComposer5.rememberedValue();
                    Object obj14 = rememberedValue9;
                    if (rememberedValue9 == neverEqualPolicy) {
                        ParcelableSnapshotMutableState mutableStateOf$default4 = Updater.mutableStateOf$default(Boolean.FALSE);
                        gapComposer5.updateRememberedValue(mutableStateOf$default4);
                        obj14 = mutableStateOf$default4;
                    }
                    MutableState mutableState8 = (MutableState) obj14;
                    Object rememberedValue10 = gapComposer5.rememberedValue();
                    Object obj15 = rememberedValue10;
                    if (rememberedValue10 == neverEqualPolicy) {
                        Boolean valueOf = Boolean.valueOf(content.isShowingCashtag);
                        gapComposer5.updateRememberedValue(valueOf);
                        obj15 = valueOf;
                    }
                    final boolean booleanValue = ((Boolean) obj15).booleanValue();
                    Object rememberedValue11 = gapComposer5.rememberedValue();
                    if (rememberedValue11 == neverEqualPolicy) {
                        biasAlignment = biasAlignment6;
                        final int i10 = 0;
                        DerivedSnapshotState derivedStateOf = Updater.derivedStateOf(new Function0() { // from class: com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i11 = i10;
                                PatternStampState patternStampState5 = patternStampState4;
                                StampState stampState4 = rememberStampState;
                                switch (i11) {
                                    case 0:
                                        return Boolean.valueOf((stampState4.getMovingStamp() == null && patternStampState5.getMovingStamps().isEmpty()) ? false : true);
                                    default:
                                        if (stampState4.getMovingStamp() != null) {
                                            r1 = ((Boolean) stampState4.trashBinAtTop$delegate.getValue()).booleanValue();
                                        } else if (!patternStampState5.getMovingStamps().isEmpty()) {
                                            r1 = ((Boolean) patternStampState5.trashBinAtTop$delegate.getValue()).booleanValue();
                                        }
                                        return Boolean.valueOf(r1);
                                }
                            }
                        });
                        gapComposer5.updateRememberedValue(derivedStateOf);
                        obj3 = derivedStateOf;
                    } else {
                        biasAlignment = biasAlignment6;
                        obj3 = rememberedValue11;
                    }
                    State state2 = (State) obj3;
                    Object rememberedValue12 = gapComposer5.rememberedValue();
                    if (rememberedValue12 == neverEqualPolicy) {
                        state = state2;
                        z = true;
                        final boolean z5 = true ? 1 : 0;
                        DerivedSnapshotState derivedStateOf2 = Updater.derivedStateOf(new Function0() { // from class: com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda15
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i11 = z5;
                                PatternStampState patternStampState5 = patternStampState4;
                                StampState stampState4 = rememberStampState;
                                switch (i11) {
                                    case 0:
                                        return Boolean.valueOf((stampState4.getMovingStamp() == null && patternStampState5.getMovingStamps().isEmpty()) ? false : true);
                                    default:
                                        if (stampState4.getMovingStamp() != null) {
                                            r1 = ((Boolean) stampState4.trashBinAtTop$delegate.getValue()).booleanValue();
                                        } else if (!patternStampState5.getMovingStamps().isEmpty()) {
                                            r1 = ((Boolean) patternStampState5.trashBinAtTop$delegate.getValue()).booleanValue();
                                        }
                                        return Boolean.valueOf(r1);
                                }
                            }
                        });
                        gapComposer5.updateRememberedValue(derivedStateOf2);
                        obj4 = derivedStateOf2;
                    } else {
                        state = state2;
                        z = true;
                        obj4 = rememberedValue12;
                    }
                    State state3 = (State) obj4;
                    CardStudioViewModelV2.CustomizationMode.DRAW draw3 = CardStudioViewModelV2.CustomizationMode.DRAW.INSTANCE;
                    if (Intrinsics.areEqual(customizationMode2, draw3)) {
                        rememberSignatureState.setEnabled(z);
                        rememberStampState.setEnabled(false);
                        patternStampState4.setEnabled(false);
                        draw = draw3;
                    } else {
                        rememberSignatureState.setEnabled(false);
                        boolean z6 = customizationMode2 instanceof CardStudioViewModelV2$CustomizationMode$Pattern$STAMP;
                        draw = draw3;
                        rememberStampState.setEnabled(!z6);
                        patternStampState4.setEnabled(z6);
                    }
                    if (customizationMode2 instanceof CardStudioViewModelV2$CustomizationMode$Pattern$STAMP) {
                        Float f7 = content.cardTheme.pattern_grid_alpha;
                        f2 = f7 != null ? f7.floatValue() : 0.15f;
                    } else {
                        f2 = 1.25f;
                    }
                    float f8 = f2;
                    TweenSpec tween$default = AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 0, null, 6);
                    boolean changedInstance3 = gapComposer5.changedInstance(content) | gapComposer5.changedInstance(patternStampState4);
                    Object rememberedValue13 = gapComposer5.rememberedValue();
                    Object obj16 = rememberedValue13;
                    if (changedInstance3 || rememberedValue13 == neverEqualPolicy) {
                        BorrowHomeKt$$ExternalSyntheticLambda1 borrowHomeKt$$ExternalSyntheticLambda1 = new BorrowHomeKt$$ExternalSyntheticLambda1(11, content, patternStampState4);
                        gapComposer5.updateRememberedValue(borrowHomeKt$$ExternalSyntheticLambda1);
                        obj16 = borrowHomeKt$$ExternalSyntheticLambda1;
                    }
                    State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(f8, tween$default, "Customization enablement animation", (Function1) obj16, gapComposer5, 3120, 4);
                    Object rememberedValue14 = gapComposer5.rememberedValue();
                    if (rememberedValue14 == neverEqualPolicy) {
                        ParcelableSnapshotMutableState mutableStateOf$default5 = Updater.mutableStateOf$default(new PointF(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE));
                        gapComposer5.updateRememberedValue(mutableStateOf$default5);
                        obj5 = mutableStateOf$default5;
                    } else {
                        obj5 = rememberedValue14;
                    }
                    MutableState mutableState9 = (MutableState) obj5;
                    MetadataRepo metadataRepo2 = new MetadataRepo(mutableState5, content, snapshotStateList5, rememberSignatureState);
                    Result result2 = new Result(24, mutableState5, mutableState6);
                    Object rememberedValue15 = gapComposer5.rememberedValue();
                    if (rememberedValue15 == neverEqualPolicy) {
                        result = result2;
                        DrawerViewKt$$ExternalSyntheticLambda2 drawerViewKt$$ExternalSyntheticLambda2 = new DrawerViewKt$$ExternalSyntheticLambda2(1, mutableState8);
                        gapComposer5.updateRememberedValue(drawerViewKt$$ExternalSyntheticLambda2);
                        obj6 = drawerViewKt$$ExternalSyntheticLambda2;
                    } else {
                        result = result2;
                        obj6 = rememberedValue15;
                    }
                    Function0 function03 = (Function0) obj6;
                    rememberStampState.getClass();
                    function03.getClass();
                    rememberStampState.onStampsChanged = function03;
                    boolean changedInstance4 = gapComposer5.changedInstance(patternStampState4);
                    Object rememberedValue16 = gapComposer5.rememberedValue();
                    Object obj17 = rememberedValue16;
                    if (changedInstance4 || rememberedValue16 == neverEqualPolicy) {
                        CaptureCheckFaceKt$$ExternalSyntheticLambda15 captureCheckFaceKt$$ExternalSyntheticLambda15 = new CaptureCheckFaceKt$$ExternalSyntheticLambda15(15, snapshotStateList7, patternStampState4);
                        gapComposer5.updateRememberedValue(captureCheckFaceKt$$ExternalSyntheticLambda15);
                        obj17 = captureCheckFaceKt$$ExternalSyntheticLambda15;
                    }
                    Function0 function04 = (Function0) obj17;
                    patternStampState4.getClass();
                    function04.getClass();
                    patternStampState4.onStampsChanged = function04;
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = rememberStampState.hasTrashBin$delegate;
                    Boolean bool = Boolean.TRUE;
                    parcelableSnapshotMutableState.setValue(bool);
                    patternStampState4.hasTrashBin$delegate.setValue(bool);
                    boolean changedInstance5 = gapComposer5.changedInstance(patternStampState4) | gapComposer5.changedInstance(rememberStampState);
                    Object rememberedValue17 = gapComposer5.rememberedValue();
                    Object obj18 = rememberedValue17;
                    if (changedInstance5 || rememberedValue17 == neverEqualPolicy) {
                        PatternStateListener patternStateListener = new PatternStateListener() { // from class: com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda20
                            @Override // com.squareup.cardcustomizations.signature.PatternStateListener
                            public final Pair onPatternCommitted(SignatureState signatureState, PatternStampState patternStampState5) {
                                signatureState.getClass();
                                int uniqueStamps = PatternStampState.this.uniqueStamps();
                                rememberStampState.commitPatternStamp(patternStampState5);
                                snapshotStateList7.clear();
                                return new Pair(0, Integer.valueOf(uniqueStamps));
                            }
                        };
                        gapComposer5.updateRememberedValue(patternStateListener);
                        obj18 = patternStateListener;
                    }
                    PatternStateListener patternStateListener2 = (PatternStateListener) obj18;
                    StampResult stampResult2 = content.pendingStampResult;
                    int i11 = i5 & 7168;
                    boolean changedInstance6 = gapComposer5.changedInstance(content) | gapComposer5.changedInstance(patternStampState4) | gapComposer5.changedInstance(rememberStampState) | (i11 == 2048);
                    Object rememberedValue18 = gapComposer5.rememberedValue();
                    if (changedInstance6 || rememberedValue18 == neverEqualPolicy) {
                        snapshotStateList = snapshotStateList7;
                        stampResult = stampResult2;
                        mutableState = mutableState5;
                        mutableState2 = mutableState8;
                        metadataRepo = metadataRepo2;
                        mutableState3 = mutableState6;
                        i7 = 2048;
                        i8 = i11;
                        snapshotStateList2 = snapshotStateList5;
                        customizationMode = customizationMode2;
                        navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(content, patternStampState4, function1, mutableState9, mutableState7, rememberStampState, (Continuation) null, 4);
                        patternStampState = patternStampState4;
                        mutableState4 = mutableState9;
                        stampState = rememberStampState;
                        gapComposer5.updateRememberedValue(navHostKt$NavHost$33$1);
                    } else {
                        mutableState = mutableState5;
                        snapshotStateList2 = snapshotStateList5;
                        mutableState4 = mutableState9;
                        mutableState3 = mutableState6;
                        snapshotStateList = snapshotStateList7;
                        patternStampState = patternStampState4;
                        mutableState2 = mutableState8;
                        metadataRepo = metadataRepo2;
                        i7 = 2048;
                        i8 = i11;
                        stampState = rememberStampState;
                        stampResult = stampResult2;
                        navHostKt$NavHost$33$1 = rememberedValue18;
                        customizationMode = customizationMode2;
                    }
                    Updater.LaunchedEffect(gapComposer5, stampResult, (Function2) navHostKt$NavHost$33$1);
                    Boolean valueOf2 = Boolean.valueOf(content.pendingClearAll);
                    boolean changedInstance7 = gapComposer5.changedInstance(content) | gapComposer5.changedInstance(rememberSignatureState) | gapComposer5.changedInstance(stampState) | (i8 == i7);
                    Object rememberedValue19 = gapComposer5.rememberedValue();
                    if (changedInstance7 || rememberedValue19 == neverEqualPolicy) {
                        SnapshotStateList snapshotStateList8 = snapshotStateList2;
                        moleculeKt$immediateClockFlow$1$1$1 = new MoleculeKt$immediateClockFlow$1$1$1(content, rememberSignatureState, stampState, snapshotStateList8, function1, null, 10);
                        stampState2 = stampState;
                        snapshotStateList3 = snapshotStateList8;
                        function12 = function1;
                        gapComposer5.updateRememberedValue(moleculeKt$immediateClockFlow$1$1$1);
                    } else {
                        moleculeKt$immediateClockFlow$1$1$1 = rememberedValue19;
                        stampState2 = stampState;
                        snapshotStateList3 = snapshotStateList2;
                        function12 = function1;
                    }
                    Updater.LaunchedEffect(gapComposer5, valueOf2, (Function2) moleculeKt$immediateClockFlow$1$1$1);
                    boolean changedInstance8 = (i8 == i7) | gapComposer5.changedInstance(rememberSignatureState) | gapComposer5.changedInstance(stampState2);
                    Object rememberedValue20 = gapComposer5.rememberedValue();
                    if (changedInstance8 || rememberedValue20 == neverEqualPolicy) {
                        z2 = true;
                        CardStudioViewKt$$ExternalSyntheticLambda12 cardStudioViewKt$$ExternalSyntheticLambda12 = new CardStudioViewKt$$ExternalSyntheticLambda12(function12, rememberSignatureState, stampState2, 1);
                        gapComposer5.updateRememberedValue(cardStudioViewKt$$ExternalSyntheticLambda12);
                        obj7 = cardStudioViewKt$$ExternalSyntheticLambda12;
                    } else {
                        z2 = true;
                        obj7 = rememberedValue20;
                    }
                    Updater.DisposableEffect(function12, (Function1) obj7, gapComposer5);
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(modifier, Strings.getColors(gapComposer5).semantic.background.f1047app, ColorKt.RectangleShape);
                    BiasAlignment biasAlignment7 = Alignment.Companion.TopStart;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment7, false);
                    int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, m177backgroundbw27NRU);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer5.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer5, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
                    Integer valueOf3 = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer5, valueOf3, composeUiNode$Companion$SetModifier$16);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    boolean z7 = z2;
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer5, materializeModifier, composeUiNode$Companion$SetModifier$17);
                    CardStudioViewModelV2.CustomizationMode.DEFAULT r2 = CardStudioViewModelV2.CustomizationMode.DEFAULT.INSTANCE;
                    boolean areEqual = Intrinsics.areEqual(customizationMode, r2);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    CardStudioViewModelV2.CustomizationMode.STAMP stamp2 = CardStudioViewModelV2.CustomizationMode.STAMP.INSTANCE;
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (areEqual || Intrinsics.areEqual(customizationMode, stamp2)) {
                        r54 = r2;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                        composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$14;
                        biasAlignment2 = biasAlignment7;
                        stamp = stamp2;
                        final SnapshotStateList snapshotStateList9 = snapshotStateList;
                        biasAlignment3 = biasAlignment;
                        draw2 = draw;
                        z3 = false;
                        stampState3 = stampState2;
                        patternStampState2 = patternStampState;
                        gapComposer5.startReplaceGroup(-1204942383);
                        final MutableState mutableState10 = mutableState2;
                        final float f9 = f;
                        f3 = f9;
                        AnimatedContentKt.AnimatedVisibility(!CardStudioV2Content$lambda$18(state), boxScopeInstance.align(companion, biasAlignment3), EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(150, 0, null, 6), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(150, 0, null, 6), 2), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-1300218082, new Function3() { // from class: com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda22
                            @Override // kotlin.jvm.functions.Function3
                            public final Object invoke(Object obj19, Object obj20, Object obj21) {
                                Function1 function13;
                                ((Integer) obj21).getClass();
                                ((AnimatedVisibilityScope) obj19).getClass();
                                GapComposer gapComposer6 = (GapComposer) ((Composer) obj20);
                                ((DefaultSizes) gapComposer6.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                DefaultSizes.spacing.getClass();
                                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(Modifier.Companion.$$INSTANCE, 16.0f);
                                NavigationType navigationType = NavigationType.CLOSE;
                                CardStudioViewModelV2.Content content2 = CardStudioViewModelV2.Content.this;
                                boolean changedInstance9 = gapComposer6.changedInstance(content2);
                                Function1 function14 = function1;
                                boolean changed = changedInstance9 | gapComposer6.changed(function14);
                                Object rememberedValue21 = gapComposer6.rememberedValue();
                                if (changed || rememberedValue21 == Composer.Companion.Empty) {
                                    CardStudioViewV2Kt$$ExternalSyntheticLambda27 cardStudioViewV2Kt$$ExternalSyntheticLambda27 = new CardStudioViewV2Kt$$ExternalSyntheticLambda27(snapshotStateList3, snapshotStateList9, content2, booleanValue, function14, mutableState10);
                                    function13 = function14;
                                    gapComposer6.updateRememberedValue(cardStudioViewV2Kt$$ExternalSyntheticLambda27);
                                    rememberedValue21 = cardStudioViewV2Kt$$ExternalSyntheticLambda27;
                                } else {
                                    function13 = function14;
                                }
                                DBUtil.TitleBarSub((String) null, navigationType, m298padding3ABfNKs, (DynamicColorConfiguration) null, (Function0) rememberedValue21, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-1352305891, new CardStudioViewV2Kt$$ExternalSyntheticLambda7(function13, f9, 1), gapComposer6), gapComposer6, 1572918, 40);
                                return Unit.INSTANCE;
                            }
                        }, gapComposer5), (Composer) gapComposer5, 200064, 16);
                        gapComposer2 = gapComposer5;
                        gapComposer2.end(false);
                    } else {
                        biasAlignment2 = biasAlignment7;
                        CardStudioViewModelV2.CustomizationMode.DRAW draw4 = draw;
                        if (!Intrinsics.areEqual(customizationMode, draw4) && !(customizationMode instanceof CardStudioViewModelV2$CustomizationMode$Pattern$STAMP)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer5, -1978533265, false);
                        }
                        gapComposer5.startReplaceGroup(-1203669802);
                        draw2 = draw4;
                        biasAlignment3 = biasAlignment;
                        Modifier align = boxScopeInstance.align(companion, biasAlignment3);
                        boolean z8 = !CardStudioV2Content$lambda$18(state);
                        stampState3 = stampState2;
                        stamp = stamp2;
                        EnterTransitionImpl fadeIn$default = EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(150, 0, null, 6), 2);
                        ExitTransitionImpl fadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(150, 0, null, 6), 2);
                        z3 = false;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$16;
                        composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$14;
                        PatternStampState patternStampState5 = patternStampState;
                        r54 = r2;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        HomeViewKt$$ExternalSyntheticLambda0 homeViewKt$$ExternalSyntheticLambda0 = new HomeViewKt$$ExternalSyntheticLambda0(customizationMode instanceof CardStudioViewModelV2$CustomizationMode$Pattern$STAMP, snapshotStateList, snapshotStateList3, patternStateListener2, rememberSignatureState2, patternStampState5, function1, content);
                        patternStampState2 = patternStampState5;
                        AnimatedContentKt.AnimatedVisibility(z8, align, fadeIn$default, fadeOut$default, (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(128821639, homeViewKt$$ExternalSyntheticLambda0, gapComposer5), (Composer) gapComposer5, 200064, 16);
                        gapComposer5.end(false);
                        gapComposer2 = gapComposer5;
                        f3 = f;
                    }
                    GapComposer gapComposer6 = gapComposer2;
                    float f10 = f3;
                    BiasAlignment biasAlignment8 = biasAlignment2;
                    CardStudioViewModelV2.CustomizationMode.DRAW draw5 = draw2;
                    StampState stampState4 = stampState3;
                    BiasAlignment biasAlignment9 = biasAlignment3;
                    OffsetKt.BoxWithConstraints(boxScopeInstance.align(OffsetKt.aspectRatio(0.6307464f, SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 24.0f, RecyclerView.DECELERATION_RATE, 2), z3), Alignment.Companion.Center), null, false, Expect_jvmKt.rememberComposableLambda(-1475963356, new CardStudioViewV2Kt$$ExternalSyntheticLambda6(content, patternStampState2, stampState4, animateFloatAsState, metadataRepo, rememberSignatureState, result, mutableState4, mutableState7, flow4, mutableState, state), gapComposer6), gapComposer6, 3072, 6);
                    if (Intrinsics.areEqual(customizationMode, r54) || Intrinsics.areEqual(customizationMode, stamp)) {
                        GapComposer gapComposer7 = gapComposer6;
                        BiasAlignment biasAlignment10 = biasAlignment5;
                        MutableState mutableState11 = mutableState3;
                        gapComposer7.startReplaceGroup(-1193568359);
                        Modifier modifier2 = companion;
                        AnimatedContentKt.AnimatedVisibility(!CardStudioV2Content$lambda$18(state), boxScopeInstance.align(companion, biasAlignment4), EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(150, 0, null, 6), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(150, 0, null, 6), 2), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-421825067, new CardStudioViewV2Kt$$ExternalSyntheticLambda7(f10, function1), gapComposer7), (Composer) gapComposer7, 200064, 16);
                        AnimatedContentKt.AnimatedVisibility(!((Boolean) state.getValue()).booleanValue(), boxScopeInstance.align(modifier2, Alignment.Companion.BottomEnd), EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(150, 0, null, 6), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(150, 0, null, 6), 2), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(1879219788, new CardStudioViewV2Kt$$ExternalSyntheticLambda8(f10, rememberSignatureState, stampState4, function1), gapComposer7), (Composer) gapComposer7, 200064, 16);
                        if (CardStudioV2Content$lambda$20(state3)) {
                            biasAlignment10 = biasAlignment9;
                        }
                        Modifier align2 = boxScopeInstance.align(modifier2, biasAlignment10);
                        if (((Boolean) state3.getValue()).booleanValue()) {
                            gapComposer7.startReplaceGroup(-1978055660);
                            Strings.getSizes(gapComposer7).getClass();
                            DefaultSizes.spacing.getClass();
                            gapComposer7.end(false);
                            f4 = 16.0f;
                        } else {
                            gapComposer7.startReplaceGroup(-1978055216);
                            gapComposer7.end(false);
                            f4 = 0.0f;
                        }
                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(align2, RecyclerView.DECELERATION_RATE, f4, RecyclerView.DECELERATION_RATE, ((Boolean) state3.getValue()).booleanValue() ? 0.0f : 24.0f, 5);
                        if (((Boolean) state3.getValue()).booleanValue()) {
                            modifier2 = SpacerKt.statusBarsPadding(modifier2);
                        }
                        AnimatedContentKt.AnimatedVisibility(((Boolean) state.getValue()).booleanValue(), m302paddingqDBjuR0$default.then(modifier2), EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(150, 0, null, 6), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(150, 0, null, 6), 2), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-272263347, new HeroCardViewKt$$ExternalSyntheticLambda28(3, mutableState11), gapComposer7), (Composer) gapComposer7, 200064, 16);
                        gapComposer7.end(false);
                        gapComposer3 = gapComposer7;
                    } else if (Intrinsics.areEqual(customizationMode, draw5)) {
                        gapComposer6.startReplaceGroup(-1189763791);
                        Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(boxScopeInstance.align(companion, biasAlignment5), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment8, false);
                        int hashCode2 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer6.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer6, m302paddingqDBjuR0$default2);
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer6.startReusableNode();
                        if (gapComposer6.inserting) {
                            gapComposer6.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer6.useNode();
                        }
                        Updater.m576setimpl(gapComposer6, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$13);
                        Updater.m576setimpl(gapComposer6, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$1);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer6, composeUiNode$Companion$SetModifier$12, gapComposer6, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer6, materializeModifier2, composeUiNode$Companion$SetModifier$17);
                        Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(Strings.getColors(gapComposer6).component.button.prominent.icon.f161default, ArcadeThemeKt.LocalIconColor), Expect_jvmKt.rememberComposableLambda(1702463212, new TrackRowKt$$ExternalSyntheticLambda0(f10, 2), gapComposer6), gapComposer6, 56);
                        gapComposer6.end(z7);
                        gapComposer6.end(false);
                        gapComposer4 = gapComposer6;
                        z4 = z7;
                        gapComposer4.end(z4);
                        flow3 = flow4;
                        gapComposer = gapComposer4;
                    } else {
                        Modifier.Companion companion2 = companion;
                        BiasAlignment biasAlignment11 = biasAlignment5;
                        if (!(customizationMode instanceof CardStudioViewModelV2$CustomizationMode$Pattern$STAMP)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer6, -1978163959, false);
                        }
                        gapComposer6.startReplaceGroup(-1188857816);
                        Modifier align3 = boxScopeInstance.align(companion2, biasAlignment4);
                        boolean CardStudioV2Content$lambda$18 = CardStudioV2Content$lambda$18(state) ^ z7;
                        EnterTransitionImpl fadeIn$default2 = EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(150, 0, null, 6), 2);
                        ExitTransitionImpl fadeOut$default2 = EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(150, 0, null, 6), 2);
                        ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1807786013, new MusicViewKt$$ExternalSyntheticLambda4(f10, function1, content), gapComposer6);
                        GapComposer gapComposer8 = gapComposer6;
                        AnimatedContentKt.AnimatedVisibility(CardStudioV2Content$lambda$18, align3, fadeIn$default2, fadeOut$default2, (String) null, (Function3) rememberComposableLambda, (Composer) gapComposer8, 200064, 16);
                        if (CardStudioV2Content$lambda$20(state3)) {
                            biasAlignment11 = biasAlignment9;
                        }
                        Modifier align4 = boxScopeInstance.align(companion2, biasAlignment11);
                        if (((Boolean) state3.getValue()).booleanValue()) {
                            gapComposer8.startReplaceGroup(-1977928972);
                            Strings.getSizes(gapComposer8).getClass();
                            DefaultSizes.spacing.getClass();
                            gapComposer8.end(false);
                            f5 = 16.0f;
                        } else {
                            gapComposer8.startReplaceGroup(-1977928528);
                            gapComposer8.end(false);
                            f5 = 0.0f;
                        }
                        Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(align4, RecyclerView.DECELERATION_RATE, f5, RecyclerView.DECELERATION_RATE, ((Boolean) state3.getValue()).booleanValue() ? 0.0f : 24.0f, 5);
                        if (((Boolean) state3.getValue()).booleanValue()) {
                            companion2 = SpacerKt.statusBarsPadding(companion2);
                        }
                        AnimatedContentKt.AnimatedVisibility(((Boolean) state.getValue()).booleanValue(), m302paddingqDBjuR0$default3.then(companion2), EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(150, 0, null, 6), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(150, 0, null, 6), 2), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(1203734228, new HeroCardViewKt$$ExternalSyntheticLambda28(2, mutableState3), gapComposer8), (Composer) gapComposer8, 200064, 16);
                        gapComposer8.end(false);
                        gapComposer3 = gapComposer8;
                    }
                    z4 = true;
                    gapComposer4 = gapComposer3;
                    gapComposer4.end(z4);
                    flow3 = flow4;
                    gapComposer = gapComposer4;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                    endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(modifier, flow3, content, function1, i, i2, 16);
                    return;
                }
                return;
            }
        } else {
            flow2 = flow;
        }
        i4 = 16;
        i5 = i3 | i4 | (!gapComposer5.changedInstance(content) ? 256 : 128);
        if ((i & 3072) == 0) {
        }
        if (gapComposer5.shouldExecute(i5 & 1, (i5 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final boolean CardStudioV2Content$lambda$18(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final boolean CardStudioV2Content$lambda$20(State state) {
        return ((Boolean) state.getValue()).booleanValue();
    }

    public static final void CardStudioViewV2(CardStudioViewModelV2 cardStudioViewModelV2, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        cardStudioViewModelV2.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-847299042);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(cardStudioViewModelV2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            function12 = function1;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1888399539, new AvatarsKt$$ExternalSyntheticLambda4(cardStudioViewModelV2, coroutineScope, mutableSharedFlow, function12, (MutableState) rememberedValue3, 15), gapComposer), gapComposer, 3072, 7);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(cardStudioViewModelV2, function12, i, 13);
        }
    }

    public static final void LoadingContent(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1446482695);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LoanDetailsSheetKt$$ExternalSyntheticLambda14(i, 28);
        }
    }

    /* renamed from: PatternGrid-nBX6wN0, reason: not valid java name */
    public static final void m3433PatternGridnBX6wN0(final float f, final float f2, final float f3, final float f4, final long j, final long j2, Composer composer, final int i) {
        int i2;
        Modifier modifier;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1294655328);
        int i3 = i | (gapComposer.changed(f) ? 4 : 2) | (gapComposer.changed(f2) ? 32 : 16) | (gapComposer.changed(f3) ? 256 : 128) | (gapComposer.changed(f4) ? 2048 : 1024) | (gapComposer.changed(j) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(j2) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i3 & 1, (599187 & i3) != 599186)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Object obj = DefaultSizes.border.annotationsMap;
            final float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(1.0f, gapComposer);
            float f5 = 0.00525f * f;
            final AndroidPathEffect androidPathEffect = new AndroidPathEffect(new DashPathEffect(new float[]{f5, f5}, RecyclerView.DECELERATION_RATE));
            ClosedFloatRange closedFloatRange = new ClosedFloatRange(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new PageFetcher$flow$1.AnonymousClass1(2, null, 15);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState produceState = Updater.produceState(gapComposer, closedFloatRange, (Function2) rememberedValue);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(9);
                ArrayList arrayList = (ArrayList) workLauncherImpl.processor;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    workLauncherImpl.processor = arrayList;
                } else {
                    arrayList.clear();
                }
                workLauncherImpl.pathStringToNodes("M1.5 18.0002C2.83333 17.0002 6.7 16.1002 11.5 20.5002C17.5 26.0002 26 34.6 30.5 31C35 27.4 31.0101 17.8103 28 10.5C24.5 2 30.5 -0.832986 40 5.5001C47.5001 10.5 49.5 5.50003 49 2", arrayList);
                AndroidPath Path = AndroidPath_androidKt.Path();
                ArrayList arrayList2 = (ArrayList) workLauncherImpl.processor;
                rememberedValue2 = arrayList2 != null ? PathParserKt.toPath(arrayList2, Path) : AndroidPath_androidKt.Path();
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            final AndroidPath androidPath = (AndroidPath) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                AndroidPathMeasure PathMeasure = OffersAnalyticsKt.PathMeasure();
                PathMeasure.setPath(androidPath);
                rememberedValue3 = Updater.derivedStateOf(new CardStudioViewKt$$ExternalSyntheticLambda87(PathMeasure, PathMeasure.internalPathMeasure.getLength(), produceState, 1));
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            final State state = (State) rememberedValue3;
            Modifier clip = ClipKt.clip(SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f), RoundedCornerShapeKt.RoundedCornerShape(0.058f * f2));
            boolean changedInstance = gapComposer.changedInstance(androidPath) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | ((i3 & 112) == 32) | ((i3 & 14) == 4) | ((458752 & i3) == 131072) | gapComposer.changed(m3477toPx8Feqmps) | gapComposer.changedInstance(androidPathEffect) | ((i3 & 57344) == 16384);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                i2 = 0;
                modifier = clip;
                Function1 function1 = new Function1() { // from class: com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda41
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        float min;
                        CacheDrawScope cacheDrawScope = (CacheDrawScope) obj2;
                        cacheDrawScope.getClass();
                        long m634getSizeNHjbRc = AndroidPath.this.getBounds().m634getSizeNHjbRc();
                        final float f6 = f3;
                        long floatToRawIntBits = Float.floatToRawIntBits(f6);
                        final float f7 = f4;
                        min = Math.min(Float.intBitsToFloat((int) (r4 >> 32)) / Float.intBitsToFloat((int) (m634getSizeNHjbRc >> 32)), Float.intBitsToFloat((int) (((floatToRawIntBits << 32) | (Float.floatToRawIntBits(f7) & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax)) / Float.intBitsToFloat((int) (m634getSizeNHjbRc & BodyPartID.bodyIdMax)));
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(min) << 32) | (Float.floatToRawIntBits(min) & BodyPartID.bodyIdMax);
                        int i4 = ScaleFactor.$r8$clinit;
                        final float min2 = Math.min(Float.intBitsToFloat((int) (floatToRawIntBits2 >> 32)), Float.intBitsToFloat((int) (floatToRawIntBits2 & BodyPartID.bodyIdMax)));
                        final float f8 = f2;
                        final float f9 = f;
                        final long j3 = j2;
                        final float f10 = m3477toPx8Feqmps;
                        final AndroidPathEffect androidPathEffect2 = androidPathEffect;
                        final long j4 = j;
                        final State state2 = state;
                        return cacheDrawScope.onDrawWithContent(new Function1() { // from class: com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda50
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                CanvasDrawScope canvasDrawScope;
                                long j5;
                                CardStudioViewV2Kt$$ExternalSyntheticLambda50 cardStudioViewV2Kt$$ExternalSyntheticLambda50 = this;
                                long j6 = j4;
                                State state3 = state2;
                                LayoutNodeDrawScope layoutNodeDrawScope = (LayoutNodeDrawScope) obj3;
                                layoutNodeDrawScope.getClass();
                                CanvasDrawScope canvasDrawScope2 = layoutNodeDrawScope.canvasDrawScope;
                                layoutNodeDrawScope.drawContent();
                                float f11 = f8;
                                float f12 = f6;
                                int roundToInt = MathKt__MathJVMKt.roundToInt((float) Math.ceil(f11 / f12));
                                float f13 = f9;
                                float f14 = f7;
                                int roundToInt2 = MathKt__MathJVMKt.roundToInt((float) Math.ceil(f13 / f14));
                                int i5 = 0;
                                while (i5 < roundToInt2) {
                                    float f15 = i5 * f14;
                                    float f16 = f15 + f14;
                                    long floatToRawIntBits3 = (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(f16) & BodyPartID.bodyIdMax);
                                    long j7 = j6;
                                    float f17 = f11;
                                    long floatToRawIntBits4 = (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f16) & BodyPartID.bodyIdMax);
                                    int i6 = i5;
                                    long j8 = j3;
                                    float f18 = f10;
                                    AndroidPathEffect androidPathEffect3 = androidPathEffect2;
                                    layoutNodeDrawScope.mo729drawLineNGM6Ib0(j8, floatToRawIntBits3, floatToRawIntBits4, (r23 & 8) != 0 ? 0.0f : f18, (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : androidPathEffect3, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                                    int i7 = roundToInt + 1;
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        float f19 = ((i8 * f12) - (i6 % 2 == 0 ? 0.0f : f12 / 2.0f)) + f12;
                                        int i9 = i7;
                                        int i10 = i8;
                                        layoutNodeDrawScope.mo729drawLineNGM6Ib0(j8, (Float.floatToRawIntBits(f19) << 32) | (Float.floatToRawIntBits(f15) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(f19) << 32) | (Float.floatToRawIntBits(f16) & BodyPartID.bodyIdMax), (r23 & 8) != 0 ? 0.0f : f18, (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : androidPathEffect3, (r23 & 64) != 0 ? 1.0f : RecyclerView.DECELERATION_RATE);
                                        float f20 = f19 - (0.75f * f12);
                                        float f21 = (0.25f * f14) + f15;
                                        ((Extras.Key) canvasDrawScope2.drawContext.path).translate(f20, f21);
                                        float f22 = min2 / 2.0f;
                                        try {
                                            GrpcMethod grpcMethod = canvasDrawScope2.drawContext;
                                            float f23 = f12;
                                            int i11 = roundToInt2;
                                            long m3999getSizeNHjbRc = grpcMethod.m3999getSizeNHjbRc();
                                            grpcMethod.getCanvas().save();
                                            try {
                                                float f24 = f17;
                                                ((Extras.Key) grpcMethod.path).m1437scale0AR0LA0(f22, f22, 0L);
                                                float f25 = f14;
                                                long j9 = j7;
                                                long j10 = j8;
                                                j5 = m3999getSizeNHjbRc;
                                                LayoutNodeDrawScope layoutNodeDrawScope2 = layoutNodeDrawScope;
                                                canvasDrawScope = canvasDrawScope2;
                                                try {
                                                    DrawScope.m745drawPathLG529CI$default(layoutNodeDrawScope2, (AndroidPath) state3.getValue(), j9, RecyclerView.DECELERATION_RATE, new Stroke(f18, RecyclerView.DECELERATION_RATE, 1, 0, null, 26), 52);
                                                    try {
                                                        grpcMethod.getCanvas().restore();
                                                        grpcMethod.m4000setSizeuvyYCjk(j5);
                                                        ((Extras.Key) canvasDrawScope.drawContext.path).translate(-f20, -f21);
                                                        layoutNodeDrawScope = layoutNodeDrawScope2;
                                                        canvasDrawScope2 = canvasDrawScope;
                                                        roundToInt2 = i11;
                                                        j8 = j10;
                                                        f12 = f23;
                                                        f14 = f25;
                                                        j7 = j9;
                                                        f17 = f24;
                                                        i8 = i10 + 1;
                                                        i7 = i9;
                                                        cardStudioViewV2Kt$$ExternalSyntheticLambda50 = this;
                                                    } catch (Throwable th) {
                                                        th = th;
                                                        ((Extras.Key) canvasDrawScope.drawContext.path).translate(-f20, -f21);
                                                        throw th;
                                                    }
                                                } catch (Throwable th2) {
                                                    th = th2;
                                                    grpcMethod.getCanvas().restore();
                                                    grpcMethod.m4000setSizeuvyYCjk(j5);
                                                    throw th;
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                canvasDrawScope = canvasDrawScope2;
                                                j5 = m3999getSizeNHjbRc;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                            canvasDrawScope = canvasDrawScope2;
                                        }
                                    }
                                    j6 = j7;
                                    i5 = i6 + 1;
                                    layoutNodeDrawScope = layoutNodeDrawScope;
                                    canvasDrawScope2 = canvasDrawScope2;
                                    cardStudioViewV2Kt$$ExternalSyntheticLambda50 = this;
                                    f11 = f17;
                                }
                                return Unit.INSTANCE;
                            }
                        });
                    }
                };
                gapComposer.updateRememberedValue(function1);
                rememberedValue4 = function1;
            } else {
                modifier = clip;
                i2 = 0;
            }
            BoxKt.Box(ClipKt.drawWithCache(modifier, (Function1) rememberedValue4), gapComposer, i2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(f, f2, f3, f4, j, j2, i) { // from class: com.squareup.cash.card.onboarding.CardStudioViewV2Kt$$ExternalSyntheticLambda42
                public final /* synthetic */ float f$0;
                public final /* synthetic */ float f$1;
                public final /* synthetic */ float f$2;
                public final /* synthetic */ float f$3;
                public final /* synthetic */ long f$4;
                public final /* synthetic */ long f$5;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1572865);
                    CardStudioViewV2Kt.m3433PatternGridnBX6wN0(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj2, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void ThemedCardV2(Modifier modifier, CardStudioViewModelV2.Content content, Flow flow, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1785607597);
        int i2 = (gapComposer.changedInstance(content) ? 32 : 16) | i | (gapComposer.changedInstance(flow) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            OffsetKt.BoxWithConstraints(modifier, null, false, Expect_jvmKt.rememberComposableLambda(706592023, new SectionKt$$ExternalSyntheticLambda2(15, content.cardTheme, flow, (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext)), gapComposer), gapComposer, 3078, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CashCardKt$$ExternalSyntheticLambda1(modifier, content, flow, i, 6);
        }
    }

    public static final void TrashBin(boolean z, Composer composer, int i) {
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-560340857);
        int i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            if (z) {
                gapComposer.startReplaceGroup(1423536697);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.component.button.destructive.prominent.background.f151default;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1423639896);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.component.button.destructive.prominent.background.disabled;
                gapComposer.end(false);
            }
            State m153animateColorAsStateeuL9pac = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(j, AnimatableKt.tween$default(200, 0, null, 6), "Trash Bin Color", gapComposer, 432, 8);
            Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors3 == null) {
                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j2 = colors3.component.button.destructive.prominent.icon.f152default;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 52.0f), RoundedCornerShapeKt.CircleShape), ((Color) m153animateColorAsStateeuL9pac.getValue()).value, ColorKt.RectangleShape);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Updater.CompositionLocalProvider(Recorder$$ExternalSyntheticOutline2.m(j2, ArcadeThemeKt.LocalIconColor), CanvasKt.lambda$1189572097, gapComposer, 56);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SignatureViewKt$$ExternalSyntheticLambda2(i, 3, z);
        }
    }
}
