package app.cash.local.views.brand.orders;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.DrawerKt$$ExternalSyntheticLambda1;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda4;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.Savers_androidKt$$ExternalSyntheticLambda0;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.primitives.GpsCoordinates;
import app.cash.local.primitives.OrderStatus;
import app.cash.local.primitives.OrderStatusKt;
import app.cash.local.viewmodels.KeyValue;
import app.cash.local.viewmodels.LocalCartSummaryLineViewModel;
import app.cash.local.viewmodels.LocalCheckoutOrderSummaryViewModel;
import app.cash.local.viewmodels.LocalOrderStatusViewModel;
import app.cash.local.viewmodels.ToolbarModel;
import app.cash.local.viewmodels.sheet.MapDecisionSheetModel;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import app.cash.local.views.brand.orders.LatLngSet;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda3;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda9;
import app.cash.local.views.internal.LocalMapKt$LocalMapUR9CgXA$$inlined$rememberCameraPositionState$1;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.internal.LocalViewsKt$$ExternalSyntheticLambda2;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.toolbar.LocalToolbarKt;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda3;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.treehouse.EventBridge$sendEvent$1;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_vision_barcode.zzuv;
import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.compose.CameraPositionState;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Fonts;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellActivityKt$$ExternalSyntheticLambda6;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackKt$spacedBetween$1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.protos.cash.local.client.v1.LocalFulfillment;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.math.Constants;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class LocalOrderStatusViewKt {
    public static final void BusinessHeader(Modifier modifier, LocalOrderStatusViewModel.Loaded.FulfillmentDetails fulfillmentDetails, AnnotatedString annotatedString, Function2 function2, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-653079255);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(fulfillmentDetails) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(annotatedString) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function2) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            AnnotatedString annotatedString2 = new AnnotatedString(fulfillmentDetails.getBrandName());
            AnnotatedString.Builder builder = new AnnotatedString.Builder();
            builder.append(fulfillmentDetails.getOrderSummary());
            ComposableLambdaImpl composableLambdaImpl = null;
            String str = annotatedString != null ? annotatedString.text : null;
            if (str != null && !StringsKt.isBlank(str)) {
                builder.append(" · ");
                annotatedString.getClass();
                builder.append(annotatedString);
            }
            AnnotatedString annotatedString3 = builder.toAnnotatedString();
            LocalImage brandImage = fulfillmentDetails.getBrandImage();
            if (brandImage == null) {
                gapComposer.startReplaceGroup(318281078);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(318281079);
                composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(590598089, new LocalViewsKt$$ExternalSyntheticLambda2(brandImage), gapComposer);
                gapComposer.end(false);
            }
            LocalMapKt.InfoEntry(modifier, annotatedString2, annotatedString3, composableLambdaImpl, function2, (Function0) null, gapComposer, (i2 & 14) | 196608 | ((i2 << 3) & 57344), 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(modifier, fulfillmentDetails, annotatedString, function2, i, 7);
        }
    }

    public static final void ClosedTabSuccessHeader(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1982109812);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Strings.getSizes(gapComposer).getClass();
            Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 32.0f, gapComposer);
            Trace.m1191Iconww6aTOc(Icons.CheckFill24, (String) null, (Modifier) null, Strings.getColors(gapComposer).semantic.icon.success, gapComposer, 54, 4);
            Request$Priority$EnumUnboxingLocalUtility.m(Strings.getSizes(gapComposer), companion, 32.0f, gapComposer);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.prominent, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).labelMedium, 0L, Room.getSp(20), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213), (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_order_status_tab_closed), (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.placeholder, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_order_status_thanks_dining), (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Savers_androidKt$$ExternalSyntheticLambda0(i, 27);
        }
    }

    public static final void CurbsideArrivalButton(final LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup.CurbsideArrivalAction curbsideArrivalAction, final Function1 function1, Composer composer, final int i) {
        int i2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(534513728);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(curbsideArrivalAction) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        final int i3 = 1;
        final int i4 = 0;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (curbsideArrivalAction == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    function2 = new Function2() { // from class: app.cash.local.views.brand.orders.LocalOrderStatusViewKt$$ExternalSyntheticLambda38
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).intValue();
                            switch (i5) {
                                case 0:
                                    LocalOrderStatusViewKt.CurbsideArrivalButton(curbsideArrivalAction, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                                default:
                                    LocalOrderStatusViewKt.CurbsideArrivalButton(curbsideArrivalAction, function1, composer2, Updater.updateChangedFlags(i | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            boolean equals = curbsideArrivalAction.equals(LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup.CurbsideArrivalAction.ImHere.INSTANCE);
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (equals) {
                gapComposer.startReplaceGroup(-2039718606);
                boolean z = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new DrawerKt$$ExternalSyntheticLambda1(function1, false, 23);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                CurbsideArrivalButton$CurbsideButton(m302paddingqDBjuR0$default, (Function0) rememberedValue, BrandPinsKt.f35lambda$1712474414, gapComposer, MLKEMEngine.KyberPolyBytes, 1);
                gapComposer.end(false);
            } else {
                int i5 = i2;
                if (curbsideArrivalAction.equals(LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup.CurbsideArrivalAction.Call.INSTANCE)) {
                    gapComposer.startReplaceGroup(-2039562831);
                    boolean z2 = (i5 & 112) == 32;
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (z2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new DrawerKt$$ExternalSyntheticLambda1(function1, false, 25);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    CurbsideArrivalButton$CurbsideButton(m302paddingqDBjuR0$default, (Function0) rememberedValue2, BrandPinsKt.f34lambda$1502284357, gapComposer, MLKEMEngine.KyberPolyBytes, 1);
                    gapComposer.end(false);
                } else if (curbsideArrivalAction.equals(LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup.CurbsideArrivalAction.Loading.INSTANCE)) {
                    gapComposer.startReplaceGroup(-2039397694);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new LocalMapKt$$ExternalSyntheticLambda3(21);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    CurbsideArrivalButton$CurbsideButton(m302paddingqDBjuR0$default, (Function0) rememberedValue3, BrandPinsKt.lambda$854143642, gapComposer, 432, 1);
                    gapComposer.end(false);
                } else {
                    if (!curbsideArrivalAction.equals(LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup.CurbsideArrivalAction.ArrivalConfirmed.INSTANCE)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1728365763, false);
                    }
                    gapComposer.startReplaceGroup(-2039273787);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new LocalMapKt$$ExternalSyntheticLambda3(22);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    CurbsideArrivalButton$CurbsideButton(m302paddingqDBjuR0$default, (Function0) rememberedValue4, BrandPinsKt.f32lambda$1084395655, gapComposer, 438, 0);
                    gapComposer.end(false);
                }
            }
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            function2 = new Function2() { // from class: app.cash.local.views.brand.orders.LocalOrderStatusViewKt$$ExternalSyntheticLambda38
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i3;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).intValue();
                    switch (i52) {
                        case 0:
                            LocalOrderStatusViewKt.CurbsideArrivalButton(curbsideArrivalAction, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                        default:
                            LocalOrderStatusViewKt.CurbsideArrivalButton(curbsideArrivalAction, function1, composer2, Updater.updateChangedFlags(i | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void CurbsideArrivalButton$CurbsideButton(Modifier modifier, Function0 function0, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        coil3.size.SizeKt.Button(function0, modifier, ButtonProminence.PROMINENT, false, (i2 & 1) != 0, null, Expect_jvmKt.rememberComposableLambda(667113223, new OverlayKt$$ExternalSyntheticLambda0(composableLambdaImpl, 1), composer), composer, ((i >> 3) & 14) | 1573296 | ((i << 12) & 57344), 40);
    }

    public static final void FulfillmentContent(LocalOrderStatusViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1439494910);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(ColumnScopeInstance.INSTANCE) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(loaded) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(false) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            int ordinal = loaded.displayMode.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(375148154);
                StandardFulfillmentView(loaded, function1, gapComposer, i2 & 8190);
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 375143942, false);
                }
                gapComposer.startReplaceGroup(375145528);
                InStoreOpenTabClosedView(loaded, function1, gapComposer, i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalOrderStatusViewKt$$ExternalSyntheticLambda13(loaded, function1, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0447  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x04b0  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0305  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FulfillmentDetailsView(LocalOrderStatusViewModel.Loaded.FulfillmentDetails fulfillmentDetails, String str, Function1 function1, Composer composer, int i) {
        int i2;
        LocalOrderStatusViewModel.Loaded.FulfillmentDetails fulfillmentDetails2;
        ComposableLambdaImpl composableLambdaImpl;
        OrderStatus orderStatus;
        ComposableLambdaImpl composableLambdaImpl2;
        LocalText estimatedCompletionLabel;
        AnnotatedString annotatedString;
        OrderStatus orderStatus2;
        String str2;
        ComposableLambdaImpl composableLambdaImpl3;
        boolean z;
        int i3;
        boolean z2;
        Modifier.Companion companion;
        int i4;
        float f;
        int i5;
        String str3;
        boolean z3;
        boolean z4;
        String instructions;
        int i6;
        ComposableLambdaImpl rememberComposableLambda;
        String str4;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-173006074);
        int i7 = i & 6;
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        if (i7 == 0) {
            i2 = (gapComposer.changed(columnScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(fulfillmentDetails) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        int i8 = i2;
        if (gapComposer.shouldExecute(i8 & 1, (i8 & 1171) != 1170)) {
            boolean z5 = fulfillmentDetails instanceof LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Delivery;
            LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Delivery delivery = z5 ? (LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Delivery) fulfillmentDetails : null;
            LocalFulfillment.DeliveryDetails.DeliveryCourierDriver deliveryCourierDriver = delivery != null ? delivery.courierDriver : null;
            if (fulfillmentDetails.getShowBrandPhoneIcon()) {
                if ((deliveryCourierDriver != null ? deliveryCourierDriver.phone_number_e164 : null) == null) {
                    gapComposer.startReplaceGroup(-62845342);
                    composableLambdaImpl = Expect_jvmKt.rememberComposableLambda(1675222731, new SwipeToDismissKt$$ExternalSyntheticLambda4(4, function1), gapComposer);
                    gapComposer.end(false);
                    orderStatus = fulfillmentDetails.getOrderStatus();
                    if ((orderStatus == null ? OrderStatusKt.getCompleted(orderStatus) : false) || str == null) {
                        gapComposer.startReplaceGroup(-61574838);
                        gapComposer.end(false);
                        composableLambdaImpl2 = null;
                    } else {
                        gapComposer.startReplaceGroup(-62129118);
                        composableLambdaImpl2 = Expect_jvmKt.rememberComposableLambda(-1816546936, new PoolCreateViewKt$$ExternalSyntheticLambda6(function1, str, 1), gapComposer);
                        gapComposer.end(false);
                    }
                    estimatedCompletionLabel = fulfillmentDetails.getEstimatedCompletionLabel();
                    if (estimatedCompletionLabel != null) {
                        gapComposer.startReplaceGroup(-61495448);
                        gapComposer.end(false);
                        annotatedString = null;
                    } else {
                        gapComposer.startReplaceGroup(1244942265);
                        annotatedString = LocalViewsKt.toAnnotatedString(estimatedCompletionLabel, gapComposer);
                        gapComposer.end(false);
                    }
                    if (annotatedString == null) {
                        OrderStatus orderStatus3 = fulfillmentDetails.getOrderStatus();
                        annotatedString = (orderStatus3 == null || (str4 = orderStatus3.currentStatusFulfillmentLabel) == null) ? null : new AnnotatedString(str4);
                    }
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    LocalFulfillment.DeliveryDetails.DeliveryCourierDriver deliveryCourierDriver2 = deliveryCourierDriver;
                    BusinessHeader(SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion2, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7), fulfillmentDetails, annotatedString, Expect_jvmKt.rememberComposableLambda(-1888515479, new CellActivityKt$$ExternalSyntheticLambda6(composableLambdaImpl, composableLambdaImpl2, 1), gapComposer), gapComposer, (i8 & 112) | 3078);
                    orderStatus2 = fulfillmentDetails.getOrderStatus();
                    if (orderStatus2 != null) {
                        gapComposer.startReplaceGroup(-61097005);
                    } else {
                        gapComposer.startReplaceGroup(-61097004);
                        BrandPinsKt.OrderStatusRow(columnScopeInstance, null, orderStatus2, gapComposer, i8 & 14, 1);
                    }
                    gapComposer.end(false);
                    str2 = deliveryCourierDriver2 == null ? deliveryCourierDriver2.name : null;
                    if (str2 != null) {
                        gapComposer.startReplaceGroup(-60973284);
                        gapComposer.end(false);
                        fulfillmentDetails2 = fulfillmentDetails;
                        i3 = 5;
                        z2 = false;
                        f = 1.0f;
                        companion = companion2;
                        z = z5;
                        gapComposer = gapComposer;
                        i4 = i8;
                    } else {
                        gapComposer.startReplaceGroup(-60973283);
                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                        String format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.local_views_fulfillment_your_courier)).format(new Object[]{str2});
                        format2.getClass();
                        String str5 = deliveryCourierDriver2.vehicle_description;
                        if (str5 == null) {
                            str5 = "";
                        }
                        if (deliveryCourierDriver2.phone_number_e164 != null) {
                            gapComposer.startReplaceGroup(1838147961);
                            composableLambdaImpl3 = Expect_jvmKt.rememberComposableLambda(632102344, new SwipeToDismissKt$$ExternalSyntheticLambda4(5, function1), gapComposer);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(1838765915);
                            gapComposer.end(false);
                            composableLambdaImpl3 = null;
                        }
                        ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1619719101, new HintHandler$$ExternalSyntheticLambda0(deliveryCourierDriver2, 28), gapComposer);
                        z = z5;
                        i3 = 5;
                        z2 = false;
                        companion = companion2;
                        gapComposer = gapComposer;
                        ComposableLambdaImpl composableLambdaImpl4 = composableLambdaImpl3;
                        i4 = i8;
                        f = 1.0f;
                        String str6 = str5;
                        fulfillmentDetails2 = fulfillmentDetails;
                        LocalMapKt.InfoEntry(fillMaxWidth, format2, str6, rememberComposableLambda2, composableLambdaImpl4, (Function0) null, gapComposer, 3078, 32);
                        gapComposer.end(false);
                    }
                    int i9 = (i4 >> 6) & 112;
                    FulfillmentMap(fulfillmentDetails2, function1, gapComposer, ((i4 >> 3) & 14) | i9);
                    if (z) {
                        i5 = i9;
                        if (!(fulfillmentDetails2 instanceof LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1245022464, z2);
                        }
                        gapComposer.startReplaceGroup(-58207928);
                        LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup pickup = (LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup) fulfillmentDetails2;
                        LocalMapKt.InfoEntry(SizeKt.fillMaxWidth(companion, 1.0f), Room.stringResource(gapComposer, R.string.local_views_fulfillment_pickup_from_title), CollectionsKt.joinToString$default(CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{pickup.brandName, pickup.pickupAddress}), "\n", null, null, 0, null, null, 62), (Function2) null, (Function2) null, (Function0) null, gapComposer, 6, 56);
                        gapComposer.end(z2);
                    } else {
                        gapComposer.startReplaceGroup(-58984881);
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, f);
                        LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Delivery delivery2 = (LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Delivery) fulfillmentDetails2;
                        OrderStatus orderStatus4 = delivery2.orderStatus;
                        String stringResource = Room.stringResource(gapComposer, (orderStatus4 == null || !OrderStatusKt.getCompleted(orderStatus4)) ? R.string.local_views_fulfillment_delivery_to_title : R.string.local_views_fulfillment_delivered_to_title);
                        String str7 = delivery2.deliveryAddress;
                        String str8 = delivery2.dropoffProofUrl;
                        if (str8 == null) {
                            gapComposer.startReplaceGroup(-58563468);
                            gapComposer.end(z2);
                            rememberComposableLambda = null;
                        } else {
                            gapComposer.startReplaceGroup(-58563467);
                            rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1536994378, new ToastKt$$ExternalSyntheticLambda1(str8, 1), gapComposer);
                            gapComposer.end(z2);
                        }
                        ComposableLambdaImpl composableLambdaImpl5 = rememberComposableLambda;
                        i5 = i9;
                        LocalMapKt.InfoEntry(fillMaxWidth2, stringResource, str7, (Function2) null, composableLambdaImpl5, (Function0) null, gapComposer, 6, 40);
                        gapComposer.end(z2);
                    }
                    boolean z6 = fulfillmentDetails2 instanceof LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup;
                    LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup pickup2 = !z6 ? (LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup) fulfillmentDetails2 : null;
                    str3 = pickup2 == null ? pickup2.vehicleDescription : null;
                    if (str3 != null) {
                        gapComposer.startReplaceGroup(-57923318);
                        gapComposer.end(z2);
                        z3 = z6;
                    } else {
                        gapComposer.startReplaceGroup(-57923317);
                        z3 = z6;
                        LocalMapKt.InfoEntry(SizeKt.fillMaxWidth(companion, 1.0f), Room.stringResource(gapComposer, R.string.local_views_vehicle_description_title), str3, (Function2) null, (Function2) null, (Function0) null, gapComposer, 6, 56);
                        gapComposer.end(z2);
                    }
                    if (fulfillmentDetails2.getIdVerificationRequired()) {
                        z4 = true;
                        gapComposer.startReplaceGroup(-56833636);
                        gapComposer.end(z2);
                    } else {
                        gapComposer.startReplaceGroup(-57658174);
                        Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 8.0f, 1);
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
                        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
                        Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        Modifier.Companion companion3 = companion;
                        Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 11), 16.0f);
                        Painter painter = Icons.IdGovernment16.painter(gapComposer);
                        long j = Strings.getColors(gapComposer).semantic.icon.warning;
                        GapComposer gapComposer2 = gapComposer;
                        companion = companion3;
                        ImageKt.Image(painter, null, m285size3ABfNKs, null, ContentScale.Companion.None, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, i3, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(i3))), gapComposer2, Painter.$stable | 25008, 40);
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        if (z) {
                            i6 = R.string.local_views_id_verification_required_delivery;
                        } else {
                            if (!z3) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return;
                            }
                            i6 = R.string.local_views_id_verification_required_pickup;
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer2).semantic.text.warning, (Composer) gapComposer2, (Modifier) layoutWeightElement, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).bodyXSmall, 0L, 0L, null, Fonts.CashSans, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183), (TextLineBalancing) null, Room.stringResource(gapComposer2, i6), (Map) null, (Function1) null, false);
                        gapComposer = gapComposer2;
                        z4 = true;
                        gapComposer.end(true);
                        gapComposer.end(z2);
                    }
                    instructions = fulfillmentDetails2.getInstructions();
                    if (instructions != null) {
                        gapComposer.startReplaceGroup(-56798142);
                        gapComposer.end(z2);
                    } else {
                        gapComposer.startReplaceGroup(-56798141);
                        Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                        AnnotatedString annotatedString2 = new AnnotatedString(Room.stringResource(gapComposer, R.string.local_views_instructions));
                        TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).helpText;
                        boolean z7 = (i4 & 7168) == 2048 ? z4 : z2;
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (z7 || rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new GestureNodeKt$$ExternalSyntheticLambda0(23, function1);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        LocalMapKt.InfoEntry(fillMaxWidth3, annotatedString2, zzuv.createHtmlAnnotatedString(instructions, textStyle, (Function1) rememberedValue, gapComposer), (Function2) null, (Function2) null, (Function0) null, gapComposer, 6, 56);
                        gapComposer.end(z2);
                    }
                    LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup pickup3 = !z3 ? (LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup) fulfillmentDetails2 : null;
                    CurbsideArrivalButton(pickup3 == null ? pickup3.curbsideArrivalAction : null, function1, gapComposer, i5);
                }
            }
            gapComposer.startReplaceGroup(-62291062);
            gapComposer.end(false);
            composableLambdaImpl = null;
            orderStatus = fulfillmentDetails.getOrderStatus();
            if (orderStatus == null ? OrderStatusKt.getCompleted(orderStatus) : false) {
            }
            gapComposer.startReplaceGroup(-61574838);
            gapComposer.end(false);
            composableLambdaImpl2 = null;
            estimatedCompletionLabel = fulfillmentDetails.getEstimatedCompletionLabel();
            if (estimatedCompletionLabel != null) {
            }
            if (annotatedString == null) {
            }
            Modifier.Companion companion22 = Modifier.Companion.$$INSTANCE;
            LocalFulfillment.DeliveryDetails.DeliveryCourierDriver deliveryCourierDriver22 = deliveryCourierDriver;
            BusinessHeader(SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion22, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7), fulfillmentDetails, annotatedString, Expect_jvmKt.rememberComposableLambda(-1888515479, new CellActivityKt$$ExternalSyntheticLambda6(composableLambdaImpl, composableLambdaImpl2, 1), gapComposer), gapComposer, (i8 & 112) | 3078);
            orderStatus2 = fulfillmentDetails.getOrderStatus();
            if (orderStatus2 != null) {
            }
            gapComposer.end(false);
            if (deliveryCourierDriver22 == null) {
            }
            if (str2 != null) {
            }
            int i92 = (i4 >> 6) & 112;
            FulfillmentMap(fulfillmentDetails2, function1, gapComposer, ((i4 >> 3) & 14) | i92);
            if (z) {
            }
            boolean z62 = fulfillmentDetails2 instanceof LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup;
            if (!z62) {
            }
            if (pickup2 == null) {
            }
            if (str3 != null) {
            }
            if (fulfillmentDetails2.getIdVerificationRequired()) {
            }
            instructions = fulfillmentDetails2.getInstructions();
            if (instructions != null) {
            }
            if (!z3) {
            }
            CurbsideArrivalButton(pickup3 == null ? pickup3.curbsideArrivalAction : null, function1, gapComposer, i5);
        } else {
            fulfillmentDetails2 = fulfillmentDetails;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8((Object) fulfillmentDetails2, (Object) str, function1, i, 21);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FulfillmentMap(LocalOrderStatusViewModel.Loaded.FulfillmentDetails fulfillmentDetails, Function1 function1, Composer composer, int i) {
        int i2;
        LatLngSet latLngSet;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-864218802);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(fulfillmentDetails) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            LatLngSet latLngSet2 = null;
            if (fulfillmentDetails instanceof LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Delivery) {
                GpsCoordinates gpsCoordinates = ((LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Delivery) fulfillmentDetails).deliveryCoordinates;
                if (gpsCoordinates != null) {
                    latLngSet = new LatLngSet(LocalMapKt.toLatLng(gpsCoordinates), LatLngSet.MarkerType.DELIVERY);
                    latLngSet2 = latLngSet;
                }
                if (latLngSet2 != null) {
                    gapComposer.startReplaceGroup(-1907978779);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1907978778);
                    OrderStatusGoogleMap(fulfillmentDetails, latLngSet2, function1, gapComposer, ((i2 << 3) & 896) | (i2 & 14));
                    gapComposer.end(false);
                }
            } else {
                if (!(fulfillmentDetails instanceof LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                GpsCoordinates gpsCoordinates2 = ((LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Pickup) fulfillmentDetails).pickupCoordinates;
                if (gpsCoordinates2 != null) {
                    latLngSet = new LatLngSet(LocalMapKt.toLatLng(gpsCoordinates2), LatLngSet.MarkerType.BRAND);
                    latLngSet2 = latLngSet;
                }
                if (latLngSet2 != null) {
                }
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(fulfillmentDetails, function1, i, 13);
        }
    }

    public static final void InStoreOpenTabClosedView(LocalOrderStatusViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1718208093);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(ColumnScopeInstance.INSTANCE) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(loaded) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ClosedTabSuccessHeader(gapComposer, 0);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, 8.0f, 5));
            BusinessHeader(SizeKt.fillMaxWidth(companion, 1.0f), loaded.fulfillmentDetails, null, null, gapComposer, 3462);
            FulfillmentMap(loaded.fulfillmentDetails, function1, gapComposer, (i3 >> 3) & 112);
            int i4 = i3 & 14;
            OrderDetailsView(loaded.orderDetails, Room.stringResource(gapComposer, R.string.local_views_order_status_closed_tab_details), loaded.paymentSource, Room.stringResource(gapComposer, R.string.local_views_order_status_payment_method), gapComposer, i4);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            ModalKt.HorizontalDivider(0, 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 32.0f, 1));
            OrderSummaryView(loaded, true, gapComposer, i4 | MLKEMEngine.KyberPolyBytes | (i3 & 112));
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalOrderStatusViewKt$$ExternalSyntheticLambda13(loaded, function1, i, 3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LocalOrderStatusLoadedView(LocalOrderStatusViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        int i3;
        LocalOrderStatusViewModel.Loaded loaded2;
        GapComposer gapComposer;
        float f;
        String str;
        Modifier.Companion companion;
        boolean z;
        GapComposer gapComposer2;
        GapComposer gapComposer3;
        GapComposer gapComposer4;
        int i4;
        GapComposer gapComposer5 = (GapComposer) composer;
        gapComposer5.startRestartGroup(1716053914);
        Applier applier = gapComposer5.applier;
        int i5 = i & 6;
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        if (i5 == 0) {
            i2 = (gapComposer5.changed(columnScopeInstance) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer5.changedInstance(loaded) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer5.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer5.changed(false) ? 2048 : 1024;
        }
        if (gapComposer5.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer5);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier weight = columnScopeInstance.weight(1.0f, ImageKt.verticalScroll$default(SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f), rememberScrollState, false, 14), true);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.Start, gapComposer5, 0);
            int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer5, weight);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer5.startReusableNode();
            if (gapComposer5.inserting) {
                gapComposer5.createNode(function0);
            } else {
                gapComposer5.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer5, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer5, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer5, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer5, materializeModifier, composeUiNode$Companion$SetModifier$14);
            FulfillmentContent(loaded, function1, gapComposer5, (i2 & 7168) | 6 | (i2 & 112) | (i2 & 896));
            gapComposer5.end(true);
            String str2 = loaded.localCashEarningsLabel;
            String str3 = loaded.loyaltyEarningsLabel;
            if (str2 == null && str3 == null) {
                gapComposer5.startReplaceGroup(-31393880);
                gapComposer5.end(false);
                i4 = 0;
                gapComposer4 = gapComposer5;
            } else {
                gapComposer5.startReplaceGroup(-32994906);
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion2, 1.0f), RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.CenterHorizontally, gapComposer5, 48);
                int hashCode2 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer5.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer5, m302paddingqDBjuR0$default);
                gapComposer5.startReusableNode();
                if (gapComposer5.inserting) {
                    gapComposer5.createNode(function0);
                } else {
                    gapComposer5.useNode();
                }
                Updater.m576setimpl(gapComposer5, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer5, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer5, composeUiNode$Companion$SetModifier$13, gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer5, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                if (str2 == null) {
                    gapComposer5.startReplaceGroup(-1376395236);
                    gapComposer5.end(false);
                    z = 0;
                    companion = companion2;
                    str = str2;
                    f = 8.0f;
                    gapComposer2 = gapComposer5;
                } else {
                    gapComposer5.startReplaceGroup(-1376395235);
                    Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m177backgroundbw27NRU(SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 6.0f, 7), Strings.getColors(gapComposer5).semantic.background.brand, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f)), 14.0f, 6.0f);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new AdaptiveStackKt$spacedBetween$1(6.0f), Alignment.Companion.CenterVertically, gapComposer5, 54);
                    int hashCode3 = Long.hashCode(gapComposer5.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer5.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer5, m299paddingVpY3zN4);
                    gapComposer5.startReusableNode();
                    if (gapComposer5.inserting) {
                        gapComposer5.createNode(function0);
                    } else {
                        gapComposer5.useNode();
                    }
                    Updater.m576setimpl(gapComposer5, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer5, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer5, composeUiNode$Companion$SetModifier$13, gapComposer5, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer5, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion2, 16.0f);
                    Painter painterResource = Countries.painterResource(R.drawable.local_views_cash_balance_icon, 0, gapComposer5);
                    long j = Strings.getColors(gapComposer5).base.constantWhite;
                    int i6 = Painter.$stable | 432;
                    Trace.m1190Iconww6aTOc(painterResource, (String) null, m285size3ABfNKs, j, gapComposer5, i6, 0);
                    Trace.m1190Iconww6aTOc(Icons.Like16.painter(gapComposer5), (String) null, SizeKt.m285size3ABfNKs(companion2, 16.0f), Strings.getColors(gapComposer5).base.constantWhite, gapComposer5, i6, 0);
                    gapComposer5.end(true);
                    f = 8.0f;
                    str = str2;
                    companion = companion2;
                    z = 0;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer5).semantic.text.success, (Composer) gapComposer5, (Modifier) null, Strings.getTypography(gapComposer5).listNumber, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    GapComposer gapComposer6 = gapComposer5;
                    gapComposer6.end(false);
                    gapComposer2 = gapComposer6;
                }
                if (str3 == null) {
                    gapComposer2.startReplaceGroup(-1375278833);
                    gapComposer2.end(z);
                    gapComposer3 = gapComposer2;
                } else {
                    gapComposer2.startReplaceGroup(-1375278832);
                    if (str != null) {
                        re$$ExternalSyntheticOutline0.m(gapComposer2, -1326857184, companion, f, gapComposer2);
                        gapComposer2.end(z);
                    } else {
                        gapComposer2.startReplaceGroup(-1326797602);
                        gapComposer2.end(z);
                    }
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(z);
                    }
                    GapComposer gapComposer7 = gapComposer2;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.success, (Composer) gapComposer7, (Modifier) null, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).listNumber, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                    GapComposer gapComposer8 = gapComposer7;
                    gapComposer8.end(z);
                    gapComposer3 = gapComposer8;
                }
                gapComposer3.end(true);
                gapComposer3.end(z);
                i4 = z;
                gapComposer4 = gapComposer3;
            }
            loaded2 = loaded;
            function12 = function1;
            DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(1659932188, new PagerDefaults$$ExternalSyntheticLambda0(20, loaded2, function12), gapComposer4), gapComposer4, 24960, 11);
            i3 = i4;
            gapComposer = gapComposer4;
        } else {
            function12 = function1;
            i3 = 0;
            loaded2 = loaded;
            gapComposer5.skipToGroupEnd();
            gapComposer = gapComposer5;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalOrderStatusViewKt$$ExternalSyntheticLambda13(loaded2, function12, i, i3);
        }
    }

    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean, int] */
    public static final void LocalOrderStatusView(Modifier modifier, LocalOrderStatusViewModel localOrderStatusViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        Function1 function12;
        Applier applier;
        boolean z;
        BiasAlignment biasAlignment;
        int i3;
        int i4;
        NeverEqualPolicy neverEqualPolicy;
        ?? r4;
        NeverEqualPolicy neverEqualPolicy2;
        Modifier.Companion companion;
        int i5;
        boolean z2;
        Function1 function13;
        int i6;
        LocalOrderStatusViewModel localOrderStatusViewModel2 = localOrderStatusViewModel;
        BiasAlignment biasAlignment2 = Alignment.Companion.Center;
        localOrderStatusViewModel2.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-641559964);
        Applier applier2 = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(localOrderStatusViewModel2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        int i7 = i2 | 3072;
        if (gapComposer.shouldExecute(i7 & 1, (i7 & 1171) != 1170)) {
            int i8 = i7 & 896;
            boolean z3 = i8 == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
            if (z3 || rememberedValue == neverEqualPolicy3) {
                rememberedValue = new DrawerKt$$ExternalSyntheticLambda1(function1, false, 24);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            boolean z4 = localOrderStatusViewModel2 instanceof LocalOrderStatusViewModel.Loaded;
            LocalOrderStatusViewModel.Loaded loaded = z4 ? (LocalOrderStatusViewModel.Loaded) localOrderStatusViewModel2 : null;
            MapDecisionSheetModel mapDecisionSheetModel = loaded != null ? loaded.mapDecisionSheetModel : null;
            if (mapDecisionSheetModel == null) {
                gapComposer.startReplaceGroup(-108118507);
                gapComposer.end(false);
                biasAlignment = biasAlignment2;
                applier = applier2;
                i3 = i7;
                i4 = i8;
                z = z4;
                r4 = 0;
                neverEqualPolicy = neverEqualPolicy3;
            } else {
                gapComposer.startReplaceGroup(-108118506);
                boolean z5 = i8 == 256;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z5 || rememberedValue2 == neverEqualPolicy3) {
                    rememberedValue2 = new DrawerKt$$ExternalSyntheticLambda1(function1, false, 28);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                applier = applier2;
                z = z4;
                biasAlignment = biasAlignment2;
                i3 = i7;
                i4 = i8;
                neverEqualPolicy = neverEqualPolicy3;
                r4 = 0;
                SheetKt.Sheet((Function0) rememberedValue2, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-1878591158, new PagerDefaults$$ExternalSyntheticLambda0(21, mapDecisionSheetModel, function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, r4);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            String stringResource = Room.stringResource(gapComposer, R.string.local_views_order_status_closed_tab_title);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier height = OffsetKt.height(SizeKt.fillMaxSize(companion2, 1.0f), IntrinsicSize.Max);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, r4);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, height);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            LocalOrderStatusViewModel.Loaded loaded2 = z ? (LocalOrderStatusViewModel.Loaded) localOrderStatusViewModel : null;
            if (loaded2 != null) {
                int ordinal = loaded2.displayMode.ordinal();
                if (ordinal == 0) {
                    OrderStatus orderStatus = loaded2.fulfillmentDetails.getOrderStatus();
                    if (orderStatus == null || (stringResource = orderStatus.currentStatusHeading) == null) {
                        stringResource = loaded2.title;
                    }
                } else if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
            } else {
                stringResource = null;
            }
            if (stringResource == null) {
                stringResource = "";
            }
            ToolbarModel toolbarModel = new ToolbarModel(stringResource);
            LocalOrderStatusViewModel.Loaded loaded3 = z ? (LocalOrderStatusViewModel.Loaded) localOrderStatusViewModel : null;
            NavigationType navigationType = (loaded3 == null || !loaded3.allowToolbarNavigation) ? NavigationType.NONE : NavigationType.CLOSE;
            boolean z6 = i4 == 256;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z6 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new DrawerKt$$ExternalSyntheticLambda1(function1, false, 29);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            GapComposer gapComposer2 = gapComposer;
            LocalToolbarKt.m1333LocalToolbarflo8M7A(companion2, toolbarModel, navigationType, (Function0) rememberedValue3, RecyclerView.DECELERATION_RATE, null, gapComposer2, 6, 104);
            gapComposer = gapComposer2;
            if (localOrderStatusViewModel.equals(LocalOrderStatusViewModel.Loading.INSTANCE)) {
                gapComposer.startReplaceGroup(-1105342519);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                if (1.0f <= 0.0d) {
                    InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                }
                Modifier then = fillMaxWidth.then(new LayoutWeightElement(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true));
                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, then);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                z2 = false;
                ProgressCircularKt.ProgressCircular(6, 0, gapComposer, SizeKt.m285size3ABfNKs(companion2, 32.0f));
                gapComposer.end(true);
                gapComposer.end(false);
                function12 = function1;
                neverEqualPolicy2 = neverEqualPolicy;
                companion = companion2;
                localOrderStatusViewModel2 = localOrderStatusViewModel;
                i5 = 3;
            } else {
                BiasAlignment biasAlignment3 = biasAlignment;
                if (localOrderStatusViewModel.equals(LocalOrderStatusViewModel.Error.INSTANCE)) {
                    gapComposer.startReplaceGroup(-1105121737);
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion2, 1.0f);
                    NeverEqualPolicy neverEqualPolicy4 = neverEqualPolicy;
                    if (1.0f <= 0.0d) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    Modifier then2 = fillMaxWidth2.then(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment3, false);
                    int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, then2);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(24.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterHorizontally, gapComposer, 54);
                    int hashCode5 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer, companion2);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier5, composeUiNode$Companion$SetModifier$14);
                    String stringResource2 = Room.stringResource(gapComposer, R.string.local_views_order_status_error);
                    TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, 0L, 0L, FontWeight.Medium, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    companion = companion2;
                    i5 = 3;
                    localOrderStatusViewModel2 = localOrderStatusViewModel;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
                    gapComposer = gapComposer;
                    boolean z7 = i4 == 256;
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    neverEqualPolicy2 = neverEqualPolicy4;
                    if (z7 || rememberedValue4 == neverEqualPolicy2) {
                        function13 = function1;
                        rememberedValue4 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(1, function13);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    } else {
                        function13 = function1;
                    }
                    function12 = function13;
                    coil3.size.SizeKt.Button((Function0) rememberedValue4, null, null, false, false, null, BrandPinsKt.lambda$1611443178, gapComposer, 1572864, 62);
                    z2 = false;
                    Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, true, false);
                } else {
                    function12 = function1;
                    neverEqualPolicy2 = neverEqualPolicy;
                    companion = companion2;
                    localOrderStatusViewModel2 = localOrderStatusViewModel;
                    i5 = 3;
                    if (!z) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -728392912, false);
                    }
                    gapComposer.startReplaceGroup(-728359440);
                    int i9 = i3;
                    LocalOrderStatusLoadedView((LocalOrderStatusViewModel.Loaded) localOrderStatusViewModel2, function12, gapComposer, (i9 & 7168) | 6 | (i9 & 112) | i4);
                    z2 = false;
                    gapComposer.end(false);
                }
            }
            if ((localOrderStatusViewModel2 instanceof LocalOrderStatusViewModel.Loading) || (localOrderStatusViewModel2 instanceof LocalOrderStatusViewModel.Error)) {
                gapComposer.startReplaceGroup(-1104049044);
                i6 = 2;
                GapComposer gapComposer3 = gapComposer;
                DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(-859005187, new BrandSheetViewKt$$ExternalSyntheticLambda6(2, function12), gapComposer), gapComposer3, 24960, 11);
                gapComposer = gapComposer3;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1103689630);
                gapComposer.end(z2);
                i6 = 2;
            }
            gapComposer.end(true);
            LocalOrderStatusViewModel.Loaded loaded4 = z ? (LocalOrderStatusViewModel.Loaded) localOrderStatusViewModel2 : null;
            if (loaded4 == null || !loaded4.showArrivalConfirmedToast) {
                gapComposer.startReplaceGroup(-1463813256);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1464225711);
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.TopCenter), RecyclerView.DECELERATION_RATE, 56.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                String stringResource3 = Room.stringResource(gapComposer, R.string.local_views_curbside_arrival_confirmed);
                String stringResource4 = Room.stringResource(gapComposer, R.string.local_views_curbside_arrival_confirmed_body);
                Duration.Companion companion3 = Duration.Companion;
                long duration = DurationKt.toDuration(i5, DurationUnit.SECONDS);
                boolean z8 = i4 == 256;
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (z8 || rememberedValue5 == neverEqualPolicy2) {
                    rememberedValue5 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(i6, function12);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                ModalKt.m3381ToastBAHpl2s(m302paddingqDBjuR0$default, null, stringResource3, BrandPinsKt.f36lambda$1807165284, stringResource4, (Function0) rememberedValue5, new Duration(duration), gapComposer, 3072, EnumC0170g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8((Object) modifier, (Object) localOrderStatusViewModel2, function12, i, 20);
        }
    }

    public static final void OrderDetailsView(String str, String str2, String str3, String str4, Composer composer, int i) {
        int i2;
        String str5;
        int i3;
        Modifier.Companion companion;
        float f;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1952642044);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changed(str) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            str5 = str2;
            i2 |= gapComposer.changed(str5) ? 256 : 128;
        } else {
            str5 = str2;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(str3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(str4) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9361) != 9360)) {
            String str6 = !StringsKt.isBlank(str) ? str : null;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (str6 == null) {
                gapComposer.startReplaceGroup(122279420);
                gapComposer.end(false);
                i3 = i2;
                f = 1.0f;
                companion = companion2;
            } else {
                gapComposer.startReplaceGroup(122279421);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                int i4 = ((i2 >> 3) & 112) | 6;
                i3 = i2;
                companion = companion2;
                String str7 = str5;
                f = 1.0f;
                LocalMapKt.InfoEntry(fillMaxWidth, str7, str6, (Function2) null, (Function2) null, (Function0) null, gapComposer, i4, 56);
                gapComposer.end(false);
            }
            String str8 = (str3 == null || StringsKt.isBlank(str3)) ? null : str3;
            if (str8 == null) {
                gapComposer.startReplaceGroup(122440155);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(122440156);
                LocalMapKt.InfoEntry(SizeKt.fillMaxWidth(companion, f), str4, str8, (Function2) null, (Function2) null, (Function0) null, gapComposer, ((i3 >> 9) & 112) | 6, 56);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(str, i, str2, str3, str4, 8);
        }
    }

    public static final void OrderStatusGoogleMap(final LocalOrderStatusViewModel.Loaded.FulfillmentDetails fulfillmentDetails, final LatLngSet latLngSet, final Function1 function1, Composer composer, final int i) {
        int i2;
        LocalOrderStatusViewModel.Loaded.FulfillmentDetails fulfillmentDetails2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GpsCoordinates gpsCoordinates;
        GpsCoordinates gpsCoordinates2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-296195303);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(fulfillmentDetails) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(latLngSet) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = fulfillmentDetails instanceof LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Delivery;
            LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Delivery delivery = z ? (LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Delivery) fulfillmentDetails : null;
            LatLngSet latLngSet2 = (delivery == null || (gpsCoordinates2 = delivery.brandSpotCoordinates) == null) ? null : new LatLngSet(LocalMapKt.toLatLng(gpsCoordinates2), LatLngSet.MarkerType.BRAND);
            LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Delivery delivery2 = z ? (LocalOrderStatusViewModel.Loaded.FulfillmentDetails.Delivery) fulfillmentDetails : null;
            List filterNotNull = ArraysKt___ArraysKt.filterNotNull(new LatLngSet[]{latLngSet, (delivery2 == null || (gpsCoordinates = delivery2.driverCoordinates) == null) ? null : new LatLngSet(LocalMapKt.toLatLng(gpsCoordinates), LatLngSet.MarkerType.DRIVER), latLngSet2});
            float f = ((ArrayList) filterNotNull).size() > 1 ? 1.53f : 3.07f;
            boolean booleanValue = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (booleanValue) {
                gapComposer.startReplaceGroup(-2090943115);
                Modifier clip = ClipKt.clip(OffsetKt.aspectRatio(f, SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, 8.0f, 5), 1.0f), false), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f));
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.subtle, ColorKt.RectangleShape), gapComposer, 0);
                gapComposer.end(false);
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i3 = 0;
                    function2 = new Function2() { // from class: app.cash.local.views.brand.orders.LocalOrderStatusViewKt$$ExternalSyntheticLambda33
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = i3;
                            int i5 = i;
                            Function1 function12 = function1;
                            LatLngSet latLngSet3 = latLngSet;
                            LocalOrderStatusViewModel.Loaded.FulfillmentDetails fulfillmentDetails3 = fulfillmentDetails;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    LocalOrderStatusViewKt.OrderStatusGoogleMap(fulfillmentDetails3, latLngSet3, function12, composer2, Updater.updateChangedFlags(i5 | 1));
                                    break;
                                default:
                                    LocalOrderStatusViewKt.OrderStatusGoogleMap(fulfillmentDetails3, latLngSet3, function12, composer2, Updater.updateChangedFlags(i5 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            fulfillmentDetails2 = fulfillmentDetails;
            gapComposer.startReplaceGroup(-2090677879);
            gapComposer.end(false);
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(filterNotNull, 10));
            Iterator it = filterNotNull.iterator();
            while (it.hasNext()) {
                arrayList.add(((LatLngSet) it.next()).latLng);
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(((LatLng) it2.next()).latitude));
                gapComposer = gapComposer;
            }
            GapComposer gapComposer2 = gapComposer;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                arrayList3.add(Double.valueOf(((LatLng) it3.next()).longitude));
            }
            double maxOrThrow = CollectionsKt.maxOrThrow(arrayList2);
            double minOrThrow = CollectionsKt.minOrThrow(arrayList2);
            double maxOrThrow2 = CollectionsKt.maxOrThrow(arrayList3);
            double minOrThrow2 = CollectionsKt.minOrThrow(arrayList3);
            double d = maxOrThrow - minOrThrow;
            double d2 = maxOrThrow2 - minOrThrow2;
            double d3 = f;
            CameraViewport cameraViewport = new CameraViewport(new LatLng((d / 2.0d) + minOrThrow, (d2 / 2.0d) + minOrThrow2), Math.min((float) ((Math.log(2.0d / Math.max((d2 / d3) / 360.0d, (d * d3) / 180.0d)) / Constants.LN2) - 0.699999988079071d), 16.0f));
            gapComposer = gapComposer2;
            CameraPositionState cameraPositionState = (CameraPositionState) SaverKt.m581rememberSaveable(new Object[0], (Saver) CameraPositionState.Saver, (Function0) new LocalMapKt$LocalMapUR9CgXA$$inlined$rememberCameraPositionState$1(1), (Composer) gapComposer, 0);
            boolean changedInstance = gapComposer.changedInstance(cameraPositionState) | gapComposer.changedInstance(cameraViewport);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new EventBridge$sendEvent$1(cameraPositionState, cameraViewport, null, 15);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, cameraViewport, (Function2) rememberedValue);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, 8.0f, 5);
            boolean z2 = (i2 & 896) == 256;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new DrawerKt$$ExternalSyntheticLambda1(function1, false, 22);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            LocalMapKt.m1320LocalMapContentAFY4PWA(m302paddingqDBjuR0$default, f, RecyclerView.DECELERATION_RATE, cameraPositionState, true, (Function0) rememberedValue2, Expect_jvmKt.rememberComposableLambda(556738032, new LocalMapKt$$ExternalSyntheticLambda9(10, fulfillmentDetails2, filterNotNull), gapComposer), gapComposer, 1601542, 4);
        } else {
            fulfillmentDetails2 = fulfillmentDetails;
            gapComposer.skipToGroupEnd();
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i4 = 1;
            final LocalOrderStatusViewModel.Loaded.FulfillmentDetails fulfillmentDetails3 = fulfillmentDetails2;
            function2 = new Function2() { // from class: app.cash.local.views.brand.orders.LocalOrderStatusViewKt$$ExternalSyntheticLambda33
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = i4;
                    int i5 = i;
                    Function1 function12 = function1;
                    LatLngSet latLngSet3 = latLngSet;
                    LocalOrderStatusViewModel.Loaded.FulfillmentDetails fulfillmentDetails32 = fulfillmentDetails3;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            LocalOrderStatusViewKt.OrderStatusGoogleMap(fulfillmentDetails32, latLngSet3, function12, composer2, Updater.updateChangedFlags(i5 | 1));
                            break;
                        default:
                            LocalOrderStatusViewKt.OrderStatusGoogleMap(fulfillmentDetails32, latLngSet3, function12, composer2, Updater.updateChangedFlags(i5 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void OrderSummaryView(LocalOrderStatusViewModel.Loaded loaded, boolean z, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1992450351);
        int i2 = (i & 48) == 0 ? (gapComposer.changedInstance(loaded) ? 32 : 16) | i : i;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            String stringResource = Room.stringResource(gapComposer, R.string.local_views_order_summary);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.standard;
            List list = loaded.selections;
            List list2 = loaded.extraLines;
            Iterator it = list.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                i3 += ((LocalOrderStatusViewModel.Loaded.Selection) it.next()).quantity;
            }
            List list3 = loaded.selections;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            Iterator it2 = list3.iterator();
            int i4 = 0;
            while (it2.hasNext()) {
                Object next = it2.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                LocalOrderStatusViewModel.Loaded.Selection selection = (LocalOrderStatusViewModel.Loaded.Selection) next;
                String str = selection.label;
                String str2 = selection.information;
                String str3 = selection.totalPriceFormatted;
                Iterator it3 = it2;
                int i6 = selection.quantity;
                List list4 = selection.slots;
                int i7 = i3;
                if ((64 & 128) != 0) {
                    list4 = EmptyList.INSTANCE;
                }
                arrayList.add(new LocalCartSummaryLineViewModel(i4, str, str2, str3, null, i6, null, list4));
                i4 = i5;
                it2 = it3;
                i3 = i7;
            }
            CheckoutTipSectionKt.m1302CheckoutOrderSummarySectionyrwZFoE(new LocalCheckoutOrderSummaryViewModel(i3, arrayList, null, z, 28), null, stringResource, null, j, gapComposer, 0, 10);
            List list5 = list2;
            if (list5.isEmpty()) {
                gapComposer.startReplaceGroup(641196307);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(640993536);
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                gapComposer.startReplaceGroup(1601775065);
                int size = list5.size();
                for (int i8 = 0; i8 < size; i8++) {
                    LocalMapKt.KeyValueRow(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, 7), (KeyValue) list2.get(i8), gapComposer, 6, 0);
                }
                Boxes$$ExternalSyntheticOutline1.m(gapComposer, false, true, false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda3(loaded, z, i, 2);
        }
    }

    public static final void StandardFulfillmentView(LocalOrderStatusViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1850591471);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(ColumnScopeInstance.INSTANCE) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(loaded) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(false) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            int i3 = i2 & 14;
            FulfillmentDetailsView(loaded.fulfillmentDetails, loaded.receiptUrl, function1, gapComposer, ((i2 << 3) & 7168) | i3);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            ModalKt.HorizontalDivider(6, 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 24.0f, 1));
            OrderSummaryView(loaded, false, gapComposer, ((i2 >> 3) & 896) | (i2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE));
            ModalKt.HorizontalDivider(6, 0, gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, 8.0f, 5));
            OrderDetailsView(loaded.orderDetails, Room.stringResource(gapComposer, R.string.local_views_order_status_details), loaded.paymentSource, Room.stringResource(gapComposer, R.string.local_views_order_status_payment_source), gapComposer, i3);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalOrderStatusViewKt$$ExternalSyntheticLambda13(loaded, function1, i, 2);
        }
    }

    public static final LayerDrawable layerWith(GradientDrawable gradientDrawable, Drawable drawable, int i, int i2, int i3, int i4) {
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawable, drawable});
        layerDrawable.setLayerSize(1, i3, i4);
        int i5 = (i - i3) / 2;
        int i6 = (i2 - i4) / 2;
        layerDrawable.setLayerInset(1, i5, i6, i5, i6);
        return layerDrawable;
    }
}
