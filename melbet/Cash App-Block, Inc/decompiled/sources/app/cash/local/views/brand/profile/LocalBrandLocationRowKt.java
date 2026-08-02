package app.cash.local.views.brand.profile;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.utils.StorageUtil;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.ExitTransitionImpl;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.pager.PagerDefaults$$ExternalSyntheticLambda0;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.material.IconKt$$ExternalSyntheticLambda0;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda1;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda3;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.MotionDurationScale;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectionModeKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.media3.ui.compose.PlayerSurfaceKt$$ExternalSyntheticLambda2;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda6;
import app.cash.local.primitives.MenuHours;
import app.cash.local.primitives.MenuHoursKt;
import app.cash.local.viewmodels.BrandFollowViewModel;
import app.cash.local.viewmodels.LocalBrandDescriptionViewModel;
import app.cash.local.viewmodels.LocalBrandLocationAddressContentModel;
import app.cash.local.viewmodels.LocalBrandLocationFooterContentModel;
import app.cash.local.viewmodels.LocalBrandLocationHoursContentModel;
import app.cash.local.viewmodels.LocalBrandLocationMarketingMessagesContentModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuCarouselContentModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuContentModel;
import app.cash.local.viewmodels.LocalBrandLocationPhoneContentModel;
import app.cash.local.viewmodels.LocalBrandProfileSectionContent;
import app.cash.local.viewmodels.LocalBrandProfileSectionViewModel;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.viewmodels.LocationStatus;
import app.cash.local.viewmodels.PhoneRowModel;
import app.cash.local.viewmodels.internal.MenuSelectorOption;
import app.cash.local.viewmodels.sheet.MapDecisionSheetModel;
import app.cash.local.views.ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda0;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt$$ExternalSyntheticLambda16;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.local.views.cart.CartBannerViewKt$$ExternalSyntheticLambda2;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.home.LocalGeoSellerSheetStateKt;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda3;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda9;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.internal.dropdown.LocalDropdownItemKt;
import app.cash.local.views.internal.dropdown.LocalDropdownItemModel;
import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import app.cash.local.views.internal.menus.LocalMenuSelectorKt;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.map.LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1;
import app.cash.local.views.marketingmessages.MarketingMessageImageStyle;
import app.cash.local.views.marketingmessages.MarketingMessageKt;
import app.cash.local.views.sheet.LoyaltySheetKt;
import app.cash.molecule.PlatformKt;
import bo.app.n$$ExternalSyntheticLambda1;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.network.NetworkFetcher$fetch$2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.dynamite.zzg;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Fonts;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda41;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarKt;
import com.squareup.cash.common.composeui.ProgressMeter$CompletionBehavior;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.offers.presenters.RealOffersDetailsStateManager$states$1$1;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.work.views.SellerCardKt$$ExternalSyntheticLambda3;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.protos.cash.ui.Color;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.MotionKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt__MathJVMKt;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.JobKt;
import okhttp3.internal.Tags;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.InteractionResult;
import timber.log.Timber;

/* loaded from: classes3.dex */
public abstract class LocalBrandLocationRowKt {
    public static final ComposableLambdaImpl lambda$1925360258 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(3), false, 1925360258);
    public static final ComposableLambdaImpl lambda$76185853 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(4), false, 76185853);
    public static final ComposableLambdaImpl lambda$1655515488 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(5), false, 1655515488);
    public static final ComposableLambdaImpl lambda$638752601 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(6), false, 638752601);
    public static final ComposableLambdaImpl lambda$597848072 = new ComposableLambdaImpl(new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda6(7), false, 597848072);
    public static final ComposableLambdaImpl lambda$85541028 = new ComposableLambdaImpl(new ComposableSingletons$LocalViewFactoryKt$$ExternalSyntheticLambda0(27), false, 85541028);

    public static final void AddRemoveButton(BrandFollowViewModel brandFollowViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        ButtonProminence buttonProminence;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-393315810);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(brandFollowViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        boolean z2 = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier m292widthInVpY3zN4$default = SizeKt.m292widthInVpY3zN4$default(Modifier.Companion.$$INSTANCE, 64.0f, RecyclerView.DECELERATION_RATE, 2);
            BrandFollowViewModel.Add add = BrandFollowViewModel.Add.INSTANCE;
            boolean areEqual = Intrinsics.areEqual(brandFollowViewModel, add);
            BrandFollowViewModel.Removing removing = BrandFollowViewModel.Removing.INSTANCE;
            BrandFollowViewModel.Remove remove = BrandFollowViewModel.Remove.INSTANCE;
            BrandFollowViewModel.None none = BrandFollowViewModel.None.INSTANCE;
            BrandFollowViewModel.Adding adding = BrandFollowViewModel.Adding.INSTANCE;
            if (areEqual || Intrinsics.areEqual(brandFollowViewModel, adding)) {
                buttonProminence = ButtonProminence.PROMINENT;
            } else {
                if (!Intrinsics.areEqual(brandFollowViewModel, none) && !Intrinsics.areEqual(brandFollowViewModel, remove) && !Intrinsics.areEqual(brandFollowViewModel, removing)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                buttonProminence = ButtonProminence.STANDARD;
            }
            if (Intrinsics.areEqual(brandFollowViewModel, add) || Intrinsics.areEqual(brandFollowViewModel, remove)) {
                z = false;
                z2 = true;
            } else {
                if (!Intrinsics.areEqual(brandFollowViewModel, none) && !Intrinsics.areEqual(brandFollowViewModel, adding) && !Intrinsics.areEqual(brandFollowViewModel, removing)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                z = false;
            }
            if ((i2 & 112) == 32) {
                z = true;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(20, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue, m292widthInVpY3zN4$default, buttonProminence, false, z2, null, Expect_jvmKt.rememberComposableLambda(1860489766, new SliderDefaults$$ExternalSyntheticLambda3(brandFollowViewModel, 12), gapComposer), gapComposer, 1572912, 40);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(brandFollowViewModel, function1, i, 14);
        }
    }

    public static final void AnimatedCheckedInHeaderContent(String str, String str2, LocalBrandProfileViewModel.Fulfillment.InStore inStore, CheckedInHeaderAnimationValues checkedInHeaderAnimationValues, Modifier modifier, Composer composer, int i) {
        String str3;
        int i2;
        String str4;
        CheckedInHeaderAnimationValues checkedInHeaderAnimationValues2 = checkedInHeaderAnimationValues;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1680570930);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            str3 = str;
            i2 = (gapComposer.changed(str3) ? 4 : 2) | i;
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            str4 = str2;
            i2 |= gapComposer.changed(str4) ? 32 : 16;
        } else {
            str4 = str2;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(inStore) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(checkedInHeaderAnimationValues2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i3 = i2;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            float f = checkedInHeaderAnimationValues2.textColumnBaseOffsetY + checkedInHeaderAnimationValues2.textColumnOffsetY;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            CheckedInHeaderTextColumn(str3, str4, checkedInHeaderAnimationValues2, ZIndexModifierKt.zIndex(OffsetKt.m272offsetVpY3zN4(companion, RecyclerView.DECELERATION_RATE, f), 1.0f), gapComposer, ((i3 >> 3) & 896) | (i3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE));
            checkedInHeaderAnimationValues2 = checkedInHeaderAnimationValues2;
            Modifier zIndex = ZIndexModifierKt.zIndex(BoxScopeInstance.INSTANCE.matchParentSize(), 2.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, zIndex);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier m273offsetVpY3zN4$default = OffsetKt.m273offsetVpY3zN4$default(companion, checkedInHeaderAnimationValues2.avatarOffsetX, RecyclerView.DECELERATION_RATE, 2);
            float f2 = checkedInHeaderAnimationValues2.avatarScale;
            ProfileAvatar(inStore, AlphaKt.alpha(ScaleKt.scale(m273offsetVpY3zN4$default, f2, f2), checkedInHeaderAnimationValues2.avatarAlpha), gapComposer, (i3 >> 6) & 14, 0);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(str, str2, inStore, checkedInHeaderAnimationValues2, modifier, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x02af, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r6, r5.hoursFormatted) == false) goto L82;
     */
    /* JADX WARN: Removed duplicated region for block: B:66:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CategoryEntryRow(LocalBrandLocationMenuContentModel.Menu menu, LocalBrandLocationMenuContentModel.Entry entry, Function1 function1, Composer composer, int i) {
        LocalBrandLocationMenuContentModel.Menu menu2;
        GapComposer gapComposer;
        String str;
        MenuHours menuHours;
        LocalBrandLocationMenuContentModel.Entry entry2 = entry;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1636031962);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(menu) ? 4 : 2) | (gapComposer2.changedInstance(entry2) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f);
            boolean z = MenuHoursKt.isNullOrAvailableNow(menu != null ? menu.hours : null) && !MenuHoursKt.isNullOrAvailableNow(entry2.hours);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 8.0f, RecyclerView.DECELERATION_RATE, 2);
            Strings.getSizes(gapComposer2).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier clip = ClipKt.clip(m300paddingVpY3zN4$default, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f));
            boolean changed = gapComposer2.changed(entry2.token);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
            RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer2, 48, 13);
            boolean changedInstance = ((i2 & 896) == 256) | gapComposer2.changedInstance(menu) | gapComposer2.changedInstance(entry2);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new n$$ExternalSyntheticLambda1(19, function1, menu, entry2);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m182clickableO2vRcR0$default(clip, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, null, null, (Function0) rememberedValue2, 28), 8.0f, 12.0f);
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m299paddingVpY3zN4);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier clip2 = ClipKt.clip(ImageKt.m177backgroundbw27NRU(OffsetKt.aspectRatio(1.0f, SizeKt.m285size3ABfNKs(companion, 48.0f), false), Strings.getColors(gapComposer2).semantic.background.subtle, m340RoundedCornerShape0680j_4), m340RoundedCornerShape0680j_4);
            LocalImage localImage = entry2.image;
            if (localImage == null) {
                gapComposer2.startReplaceGroup(722535926);
                gapComposer2.end(false);
                str = null;
            } else {
                gapComposer2.startReplaceGroup(577496939);
                String themedUrl = LocalViewsKt.getThemedUrl(localImage, gapComposer2);
                gapComposer2.end(false);
                str = themedUrl;
            }
            LocalMapKt.LocalAsyncImage(clip2, null, str, ContentScale.Companion.Crop, null, null, lambda$1655515488, gapComposer2, 1575936, 50);
            SpacerKt.Spacer(gapComposer2, SizeKt.m290width3ABfNKs(companion, 16.0f));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.Start, gapComposer2, 6);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer2, 48);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, companion);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            entry2 = entry;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.prominent, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).labelMedium, (TextLineBalancing) null, entry2.label, (Map) null, (Function1) null, false);
            GapComposer gapComposer3 = gapComposer2;
            if (z) {
                gapComposer3.startReplaceGroup(-54644457);
                SpacerKt.Spacer(gapComposer3, SizeKt.m290width3ABfNKs(companion, 4.0f));
                Trace.m1191Iconww6aTOc(Icons.Time16, (String) null, (Modifier) null, Strings.getColors(gapComposer3).semantic.icon.extraSubtle, gapComposer3, 54, 4);
                gapComposer3.end(false);
            } else {
                gapComposer3.startReplaceGroup(-54426310);
                gapComposer3.end(false);
            }
            gapComposer3.end(true);
            MenuHours menuHours2 = entry2.hours;
            if (menuHours2 != null) {
                menu2 = menu;
                if (!z) {
                    MenuHours menuHours3 = menu != null ? menu2.hours : null;
                    String str2 = menuHours2.hoursFormatted;
                    if (str2 != null) {
                        if ((menuHours3 != null ? menuHours3.hoursFormatted : null) != null) {
                        }
                    }
                }
                menuHours = menuHours2;
                if (menuHours != null) {
                    gapComposer3.startReplaceGroup(1996090811);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.startReplaceGroup(1996090812);
                    LocalMenuHoursViewKt.LocalMenuHoursView(null, menuHours, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer3).bodyXSmall, 0L, Room.getSp(12), null, Fonts.CashSans, Room.getSp(0.12d), null, 0L, null, null, null, 0, Room.getSp(12), null, null, 0, 16645981), gapComposer3, 0, 1);
                    gapComposer3 = gapComposer3;
                    gapComposer3.end(false);
                }
                gapComposer3.end(true);
                SpacerKt.Spacer(gapComposer3, new LayoutWeightElement(1.0f, true));
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 24.0f);
                Painter painterResource = Countries.painterResource(R.drawable.local_views_right_arrow, 0, gapComposer3);
                long j = Strings.getColors(gapComposer3).semantic.text.prominent;
                GapComposer gapComposer4 = gapComposer3;
                ImageKt.Image(painterResource, null, m285size3ABfNKs, null, ContentScale.Companion.None, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer4, Painter.$stable | 25008, 40);
                gapComposer = gapComposer4;
                gapComposer.end(true);
            } else {
                menu2 = menu;
            }
            menuHours = null;
            if (menuHours != null) {
            }
            gapComposer3.end(true);
            SpacerKt.Spacer(gapComposer3, new LayoutWeightElement(1.0f, true));
            Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 24.0f);
            Painter painterResource2 = Countries.painterResource(R.drawable.local_views_right_arrow, 0, gapComposer3);
            long j2 = Strings.getColors(gapComposer3).semantic.text.prominent;
            GapComposer gapComposer42 = gapComposer3;
            ImageKt.Image(painterResource2, null, m285size3ABfNKs2, null, ContentScale.Companion.None, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer42, Painter.$stable | 25008, 40);
            gapComposer = gapComposer42;
            gapComposer.end(true);
        } else {
            menu2 = menu;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuKt$$ExternalSyntheticLambda1(menu2, entry2, function1, i, 24);
        }
    }

    public static final void CheckedInButton(Modifier modifier, CheckedInSheetAnimationStage checkedInSheetAnimationStage, Function0 function0, Composer composer, int i) {
        int i2;
        CheckedInSheetAnimationStage checkedInSheetAnimationStage2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1418896729);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(checkedInSheetAnimationStage.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            checkedInSheetAnimationStage2 = checkedInSheetAnimationStage;
            boolean isAtLeast = isAtLeast(checkedInSheetAnimationStage2, CheckedInSheetAnimationStage.ButtonVisible);
            TweenSpec tween$default = AnimatableKt.tween$default(500, 0, EasingFunctionsKt.EaseOutCubic, 2);
            AnimatedContentKt.AnimatedVisibility(isAtLeast, modifier, EnterExitTransitionKt.fadeIn$default(tween$default, 2).plus(EnterExitTransitionKt.m147scaleInL8ZKhE$default(tween$default, 0.95f, 4)), (ExitTransitionImpl) null, "checked_in_cta_entrance", (Function3) Expect_jvmKt.rememberComposableLambda(-71810353, new DismissableToastKt$$ExternalSyntheticLambda3(i3, function0), gapComposer), (Composer) gapComposer, ((i2 << 3) & 112) | 221184, 8);
        } else {
            checkedInSheetAnimationStage2 = checkedInSheetAnimationStage;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8(modifier, checkedInSheetAnimationStage2, function0, i, 22);
        }
    }

    public static final void CheckedInHeader(final LocalBrandProfileViewModel.Fulfillment.InStore inStore, final CheckedInSheetAnimationStage checkedInSheetAnimationStage, final boolean z, Composer composer, final int i) {
        int i2;
        Object m;
        InteractionResult interactionResult;
        Object m2;
        Object m3;
        Transition.TransitionAnimationState transitionAnimationState;
        boolean z2;
        Object m4;
        boolean z3;
        Object m5;
        Object m6;
        Density density;
        float f;
        Dp dp;
        float f2;
        Object m7;
        Density density2;
        float mo233toDpu2uoSUM;
        Transition.TransitionAnimationState transitionAnimationState2;
        Dp dp2;
        float mo233toDpu2uoSUM2;
        boolean z4;
        Object m8;
        Modifier.Companion companion;
        Modifier clearAndSetSemantics;
        boolean z5;
        Snapshot currentThreadSnapshot;
        Function1 readObserver;
        Snapshot makeCurrentNonObservable;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1253896999);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(inStore) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(checkedInSheetAnimationStage.ordinal()) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        int i3 = i2;
        boolean z6 = false;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            String stringResource = Room.stringResource(gapComposer, R.string.local_views_checked_in_title);
            String str = inStore.title;
            String stringResource2 = Room.stringResource(gapComposer, R.string.local_views_in_store_for_here);
            stringResource2.getClass();
            String format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.local_views_checked_in_subtitle)).format(new Object[]{str, stringResource2});
            format2.getClass();
            stringResource.getClass();
            String format3 = new MessageFormat(Room.stringResource(gapComposer, R.string.local_views_checked_in_header_content_description)).format(new Object[]{stringResource, format2});
            format3.getClass();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (!z) {
                gapComposer.startReplaceGroup(1515553602);
                boolean changed = gapComposer.changed(format3);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new IconKt$$ExternalSyntheticLambda0(format3, 24);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                m1315SettledCheckedInHeaderLayoutTN_CM5M(stringResource, format2, inStore, SemanticsModifierKt.semantics(companion2, true, (Function1) rememberedValue), gapComposer, (i3 << 9) & 7168);
                gapComposer.end(false);
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2() { // from class: app.cash.local.views.brand.profile.LocalBrandLocationCheckedInSheetKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = i4;
                            int i6 = i;
                            boolean z7 = z;
                            CheckedInSheetAnimationStage checkedInSheetAnimationStage2 = checkedInSheetAnimationStage;
                            LocalBrandProfileViewModel.Fulfillment.InStore inStore2 = inStore;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    LocalBrandLocationRowKt.CheckedInHeader(inStore2, checkedInSheetAnimationStage2, z7, composer2, Updater.updateChangedFlags(i6 | 1));
                                    break;
                                default:
                                    LocalBrandLocationRowKt.CheckedInHeader(inStore2, checkedInSheetAnimationStage2, z7, composer2, Updater.updateChangedFlags(i6 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            gapComposer.startReplaceGroup(1515854395);
            gapComposer.end(false);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CheckedInHeaderMeasurements();
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            final CheckedInHeaderMeasurements checkedInHeaderMeasurements = (CheckedInHeaderMeasurements) rememberedValue2;
            Density density3 = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            Transition updateTransition = AnimatableKt.updateTransition(checkedInSheetAnimationStage, "checked_in_sheet", gapComposer, ((i3 >> 3) & 14) | 48, 0);
            InteractionResult interactionResult2 = updateTransition.transitionState;
            TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.FloatToVector;
            if (updateTransition.isSeeking()) {
                m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, 1666827533, false, interactionResult2);
            } else {
                gapComposer.startReplaceGroup(1666573488);
                boolean changed2 = gapComposer.changed(updateTransition);
                m = gapComposer.rememberedValue();
                if (changed2 || m == neverEqualPolicy) {
                    currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState = interactionResult2.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        gapComposer.updateRememberedValue(currentState);
                        m = currentState;
                    } finally {
                    }
                }
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(-1780854982);
            CheckedInSheetAnimationStage checkedInSheetAnimationStage2 = CheckedInSheetAnimationStage.AvatarVisible;
            float f3 = isAtLeast((CheckedInSheetAnimationStage) m, checkedInSheetAnimationStage2) ? 1.0f : RecyclerView.DECELERATION_RATE;
            gapComposer.end(false);
            Float valueOf = Float.valueOf(f3);
            boolean changed3 = gapComposer.changed(updateTransition);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 11));
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            CheckedInSheetAnimationStage checkedInSheetAnimationStage3 = (CheckedInSheetAnimationStage) ((State) rememberedValue3).getValue();
            gapComposer.startReplaceGroup(-1780854982);
            float f4 = isAtLeast(checkedInSheetAnimationStage3, checkedInSheetAnimationStage2) ? 1.0f : RecyclerView.DECELERATION_RATE;
            gapComposer.end(false);
            Float valueOf2 = Float.valueOf(f4);
            boolean changed4 = gapComposer.changed(updateTransition);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed4 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 12));
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            ((Transition.Segment) ((State) rememberedValue4).getValue()).getClass();
            gapComposer.startReplaceGroup(1004441178);
            TweenSpec tween$default = AnimatableKt.tween$default(500, 0, null, 6);
            gapComposer.end(false);
            Transition.TransitionAnimationState createTransitionAnimation = AnimatableKt.createTransitionAnimation(updateTransition, valueOf, valueOf2, tween$default, twoWayConverterImpl, gapComposer, 196608);
            if (updateTransition.isSeeking()) {
                interactionResult = interactionResult2;
                m2 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, 1666827533, false, interactionResult);
            } else {
                gapComposer.startReplaceGroup(1666573488);
                boolean changed5 = gapComposer.changed(updateTransition);
                m2 = gapComposer.rememberedValue();
                if (changed5 || m2 == neverEqualPolicy) {
                    currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState2 = interactionResult2.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        gapComposer.updateRememberedValue(currentState2);
                        m2 = currentState2;
                    } finally {
                    }
                }
                gapComposer.end(false);
                interactionResult = interactionResult2;
            }
            gapComposer.startReplaceGroup(1677913550);
            float f5 = isAtLeast((CheckedInSheetAnimationStage) m2, checkedInSheetAnimationStage2) ? 1.0f : 0.4f;
            gapComposer.end(false);
            Float valueOf3 = Float.valueOf(f5);
            boolean changed6 = gapComposer.changed(updateTransition);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changed6 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 13));
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            CheckedInSheetAnimationStage checkedInSheetAnimationStage4 = (CheckedInSheetAnimationStage) ((State) rememberedValue5).getValue();
            gapComposer.startReplaceGroup(1677913550);
            float f6 = isAtLeast(checkedInSheetAnimationStage4, checkedInSheetAnimationStage2) ? 1.0f : 0.4f;
            gapComposer.end(false);
            Float valueOf4 = Float.valueOf(f6);
            boolean changed7 = gapComposer.changed(updateTransition);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changed7 || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 14));
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            ((Transition.Segment) ((State) rememberedValue6).getValue()).getClass();
            gapComposer.startReplaceGroup(168242414);
            CubicBezierEasing cubicBezierEasing = EasingFunctionsKt.EaseOutCubic;
            TweenSpec tween$default2 = AnimatableKt.tween$default(500, 0, cubicBezierEasing, 2);
            gapComposer.end(false);
            Transition.TransitionAnimationState createTransitionAnimation2 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf3, valueOf4, tween$default2, twoWayConverterImpl, gapComposer, 196608);
            if (updateTransition.isSeeking()) {
                m3 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, 1666827533, false, interactionResult);
            } else {
                gapComposer.startReplaceGroup(1666573488);
                boolean changed8 = gapComposer.changed(updateTransition);
                m3 = gapComposer.rememberedValue();
                if (changed8 || m3 == neverEqualPolicy) {
                    currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState3 = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        gapComposer.updateRememberedValue(currentState3);
                        m3 = currentState3;
                        z6 = false;
                    } finally {
                    }
                }
                gapComposer.end(z6);
            }
            gapComposer.startReplaceGroup(173105191);
            CheckedInSheetAnimationStage checkedInSheetAnimationStage5 = CheckedInSheetAnimationStage.TitleVisible;
            float f7 = isAtLeast((CheckedInSheetAnimationStage) m3, checkedInSheetAnimationStage5) ? 1.0f : RecyclerView.DECELERATION_RATE;
            gapComposer.end(z6);
            Float valueOf5 = Float.valueOf(f7);
            boolean changed9 = gapComposer.changed(updateTransition);
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (changed9 || rememberedValue7 == neverEqualPolicy) {
                rememberedValue7 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 15));
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            CheckedInSheetAnimationStage checkedInSheetAnimationStage6 = (CheckedInSheetAnimationStage) ((State) rememberedValue7).getValue();
            gapComposer.startReplaceGroup(173105191);
            float f8 = isAtLeast(checkedInSheetAnimationStage6, checkedInSheetAnimationStage5) ? 1.0f : RecyclerView.DECELERATION_RATE;
            gapComposer.end(false);
            Float valueOf6 = Float.valueOf(f8);
            boolean changed10 = gapComposer.changed(updateTransition);
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (changed10 || rememberedValue8 == neverEqualPolicy) {
                rememberedValue8 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 16));
                gapComposer.updateRememberedValue(rememberedValue8);
            }
            ((Transition.Segment) ((State) rememberedValue8).getValue()).getClass();
            gapComposer.startReplaceGroup(1094237447);
            TweenSpec tween$default3 = AnimatableKt.tween$default(450, 0, null, 6);
            gapComposer.end(false);
            Transition.TransitionAnimationState createTransitionAnimation3 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf5, valueOf6, tween$default3, twoWayConverterImpl, gapComposer, 196608);
            TwoWayConverterImpl twoWayConverterImpl2 = AnimatableKt.DpToVector;
            if (updateTransition.isSeeking()) {
                transitionAnimationState = createTransitionAnimation3;
                z2 = false;
                m4 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, 1666827533, false, interactionResult);
            } else {
                gapComposer.startReplaceGroup(1666573488);
                boolean changed11 = gapComposer.changed(updateTransition);
                m4 = gapComposer.rememberedValue();
                if (changed11 || m4 == neverEqualPolicy) {
                    currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                    transitionAnimationState = createTransitionAnimation3;
                    try {
                        Object currentState4 = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        gapComposer.updateRememberedValue(currentState4);
                        m4 = currentState4;
                    } finally {
                    }
                } else {
                    transitionAnimationState = createTransitionAnimation3;
                }
                z2 = false;
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(863516785);
            Dp m9 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, z2, isAtLeast((CheckedInSheetAnimationStage) m4, checkedInSheetAnimationStage5) ? RecyclerView.DECELERATION_RATE : 4.0f);
            boolean changed12 = gapComposer.changed(updateTransition);
            Object rememberedValue9 = gapComposer.rememberedValue();
            if (changed12 || rememberedValue9 == neverEqualPolicy) {
                rememberedValue9 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 3));
                gapComposer.updateRememberedValue(rememberedValue9);
            }
            CheckedInSheetAnimationStage checkedInSheetAnimationStage7 = (CheckedInSheetAnimationStage) ((State) rememberedValue9).getValue();
            gapComposer.startReplaceGroup(863516785);
            Dp m10 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, false, isAtLeast(checkedInSheetAnimationStage7, checkedInSheetAnimationStage5) ? RecyclerView.DECELERATION_RATE : 4.0f);
            boolean changed13 = gapComposer.changed(updateTransition);
            Object rememberedValue10 = gapComposer.rememberedValue();
            if (changed13 || rememberedValue10 == neverEqualPolicy) {
                rememberedValue10 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 4));
                gapComposer.updateRememberedValue(rememberedValue10);
            }
            ((Transition.Segment) ((State) rememberedValue10).getValue()).getClass();
            gapComposer.startReplaceGroup(1677765923);
            TweenSpec tween$default4 = AnimatableKt.tween$default(450, 0, cubicBezierEasing, 2);
            gapComposer.end(false);
            Transition.TransitionAnimationState transitionAnimationState3 = transitionAnimationState;
            Transition.TransitionAnimationState createTransitionAnimation4 = AnimatableKt.createTransitionAnimation(updateTransition, m9, m10, tween$default4, twoWayConverterImpl2, gapComposer, 196608);
            if (updateTransition.isSeeking()) {
                z3 = false;
                m5 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, 1666827533, false, interactionResult);
            } else {
                gapComposer.startReplaceGroup(1666573488);
                boolean changed14 = gapComposer.changed(updateTransition);
                m5 = gapComposer.rememberedValue();
                if (changed14 || m5 == neverEqualPolicy) {
                    currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState5 = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        gapComposer.updateRememberedValue(currentState5);
                        m5 = currentState5;
                    } finally {
                    }
                }
                z3 = false;
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(-970407111);
            CheckedInSheetAnimationStage checkedInSheetAnimationStage8 = CheckedInSheetAnimationStage.SubtitleVisible;
            float f9 = isAtLeast((CheckedInSheetAnimationStage) m5, checkedInSheetAnimationStage8) ? 1.0f : RecyclerView.DECELERATION_RATE;
            gapComposer.end(z3);
            Float valueOf7 = Float.valueOf(f9);
            boolean changed15 = gapComposer.changed(updateTransition);
            Object rememberedValue11 = gapComposer.rememberedValue();
            if (changed15 || rememberedValue11 == neverEqualPolicy) {
                rememberedValue11 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 17));
                gapComposer.updateRememberedValue(rememberedValue11);
            }
            CheckedInSheetAnimationStage checkedInSheetAnimationStage9 = (CheckedInSheetAnimationStage) ((State) rememberedValue11).getValue();
            gapComposer.startReplaceGroup(-970407111);
            float f10 = isAtLeast(checkedInSheetAnimationStage9, checkedInSheetAnimationStage8) ? 1.0f : RecyclerView.DECELERATION_RATE;
            gapComposer.end(false);
            Float valueOf8 = Float.valueOf(f10);
            boolean changed16 = gapComposer.changed(updateTransition);
            Object rememberedValue12 = gapComposer.rememberedValue();
            if (changed16 || rememberedValue12 == neverEqualPolicy) {
                rememberedValue12 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 18));
                gapComposer.updateRememberedValue(rememberedValue12);
            }
            ((Transition.Segment) ((State) rememberedValue12).getValue()).getClass();
            gapComposer.startReplaceGroup(-65422759);
            TweenSpec tween$default5 = AnimatableKt.tween$default(450, 0, null, 6);
            gapComposer.end(false);
            Transition.TransitionAnimationState createTransitionAnimation5 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf7, valueOf8, tween$default5, twoWayConverterImpl, gapComposer, 196608);
            if (updateTransition.isSeeking()) {
                m6 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, 1666827533, false, interactionResult);
            } else {
                gapComposer.startReplaceGroup(1666573488);
                boolean changed17 = gapComposer.changed(updateTransition);
                m6 = gapComposer.rememberedValue();
                if (changed17 || m6 == neverEqualPolicy) {
                    currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState6 = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        gapComposer.updateRememberedValue(currentState6);
                        m6 = currentState6;
                    } finally {
                    }
                }
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(1488993921);
            CheckedInSheetAnimationStage checkedInSheetAnimationStage10 = CheckedInSheetAnimationStage.AvatarSlid;
            if (isAtLeast((CheckedInSheetAnimationStage) m6, checkedInSheetAnimationStage10)) {
                density = density3;
                f = density.mo233toDpu2uoSUM((density.mo230roundToPx0680j_4(16.0f) + ((int) (checkedInHeaderMeasurements.m1312getTextColumnSizeYbymL2g() >> 32))) / 2);
            } else {
                density = density3;
                f = RecyclerView.DECELERATION_RATE;
            }
            Dp m11 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, false, f);
            boolean changed18 = gapComposer.changed(updateTransition);
            Object rememberedValue13 = gapComposer.rememberedValue();
            if (changed18 || rememberedValue13 == neverEqualPolicy) {
                rememberedValue13 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 5));
                gapComposer.updateRememberedValue(rememberedValue13);
            }
            CheckedInSheetAnimationStage checkedInSheetAnimationStage11 = (CheckedInSheetAnimationStage) ((State) rememberedValue13).getValue();
            gapComposer.startReplaceGroup(1488993921);
            if (isAtLeast(checkedInSheetAnimationStage11, checkedInSheetAnimationStage10)) {
                dp = m11;
                f2 = density.mo233toDpu2uoSUM((density.mo230roundToPx0680j_4(16.0f) + ((int) (checkedInHeaderMeasurements.m1312getTextColumnSizeYbymL2g() >> 32))) / 2);
            } else {
                dp = m11;
                f2 = RecyclerView.DECELERATION_RATE;
            }
            Dp m12 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, false, f2);
            boolean changed19 = gapComposer.changed(updateTransition);
            Object rememberedValue14 = gapComposer.rememberedValue();
            if (changed19 || rememberedValue14 == neverEqualPolicy) {
                rememberedValue14 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 6));
                gapComposer.updateRememberedValue(rememberedValue14);
            }
            ((Transition.Segment) ((State) rememberedValue14).getValue()).getClass();
            gapComposer.startReplaceGroup(960913423);
            SpringSpec spring$default = AnimatableKt.spring$default(0.85f, 200.0f, null, 4);
            gapComposer.end(false);
            Density density4 = density;
            Transition.TransitionAnimationState createTransitionAnimation6 = AnimatableKt.createTransitionAnimation(updateTransition, dp, m12, spring$default, twoWayConverterImpl2, gapComposer, 196608);
            if (updateTransition.isSeeking()) {
                m7 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, 1666827533, false, interactionResult);
            } else {
                gapComposer.startReplaceGroup(1666573488);
                boolean changed20 = gapComposer.changed(updateTransition);
                m7 = gapComposer.rememberedValue();
                if (changed20 || m7 == neverEqualPolicy) {
                    currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState7 = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        gapComposer.updateRememberedValue(currentState7);
                        m7 = currentState7;
                    } finally {
                    }
                }
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(63179242);
            if (isAtLeast((CheckedInSheetAnimationStage) m7, checkedInSheetAnimationStage8)) {
                density2 = density4;
                mo233toDpu2uoSUM = RecyclerView.DECELERATION_RATE;
            } else {
                density2 = density4;
                mo233toDpu2uoSUM = density2.mo233toDpu2uoSUM(((((int) (((IntSize) checkedInHeaderMeasurements.headerSize$delegate.getValue()).packedValue & BodyPartID.bodyIdMax)) - ((int) (((IntSize) checkedInHeaderMeasurements.titleSize$delegate.getValue()).packedValue & BodyPartID.bodyIdMax))) / 2) - ((((int) (((IntSize) checkedInHeaderMeasurements.headerSize$delegate.getValue()).packedValue & BodyPartID.bodyIdMax)) - ((int) (checkedInHeaderMeasurements.m1312getTextColumnSizeYbymL2g() & BodyPartID.bodyIdMax))) / 2));
            }
            Dp m13 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, false, mo233toDpu2uoSUM);
            boolean changed21 = gapComposer.changed(updateTransition);
            Object rememberedValue15 = gapComposer.rememberedValue();
            if (changed21 || rememberedValue15 == neverEqualPolicy) {
                rememberedValue15 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 7));
                gapComposer.updateRememberedValue(rememberedValue15);
            }
            CheckedInSheetAnimationStage checkedInSheetAnimationStage12 = (CheckedInSheetAnimationStage) ((State) rememberedValue15).getValue();
            gapComposer.startReplaceGroup(63179242);
            if (isAtLeast(checkedInSheetAnimationStage12, checkedInSheetAnimationStage8)) {
                transitionAnimationState2 = createTransitionAnimation6;
                dp2 = m13;
                mo233toDpu2uoSUM2 = RecyclerView.DECELERATION_RATE;
            } else {
                transitionAnimationState2 = createTransitionAnimation6;
                dp2 = m13;
                mo233toDpu2uoSUM2 = density2.mo233toDpu2uoSUM(((((int) (((IntSize) checkedInHeaderMeasurements.headerSize$delegate.getValue()).packedValue & BodyPartID.bodyIdMax)) - ((int) (((IntSize) checkedInHeaderMeasurements.titleSize$delegate.getValue()).packedValue & BodyPartID.bodyIdMax))) / 2) - ((((int) (((IntSize) checkedInHeaderMeasurements.headerSize$delegate.getValue()).packedValue & BodyPartID.bodyIdMax)) - ((int) (checkedInHeaderMeasurements.m1312getTextColumnSizeYbymL2g() & BodyPartID.bodyIdMax))) / 2));
            }
            Dp m14 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, false, mo233toDpu2uoSUM2);
            boolean changed22 = gapComposer.changed(updateTransition);
            Object rememberedValue16 = gapComposer.rememberedValue();
            if (changed22 || rememberedValue16 == neverEqualPolicy) {
                rememberedValue16 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 8));
                gapComposer.updateRememberedValue(rememberedValue16);
            }
            ((Transition.Segment) ((State) rememberedValue16).getValue()).getClass();
            gapComposer.startReplaceGroup(170046584);
            TweenSpec tween$default6 = AnimatableKt.tween$default(450, 0, cubicBezierEasing, 2);
            gapComposer.end(false);
            Transition.TransitionAnimationState createTransitionAnimation7 = AnimatableKt.createTransitionAnimation(updateTransition, dp2, m14, tween$default6, twoWayConverterImpl2, gapComposer, 196608);
            if (updateTransition.isSeeking()) {
                z4 = false;
                m8 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, 1666827533, false, interactionResult);
            } else {
                gapComposer.startReplaceGroup(1666573488);
                boolean changed23 = gapComposer.changed(updateTransition);
                m8 = gapComposer.rememberedValue();
                if (changed23 || m8 == neverEqualPolicy) {
                    currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                    readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                    try {
                        Object currentState8 = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        gapComposer.updateRememberedValue(currentState8);
                        m8 = currentState8;
                    } finally {
                    }
                }
                gapComposer.end(false);
                z4 = false;
            }
            gapComposer.startReplaceGroup(-1898745313);
            Dp m15 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, z4, isAtLeast((CheckedInSheetAnimationStage) m8, checkedInSheetAnimationStage8) ? RecyclerView.DECELERATION_RATE : 8.0f);
            boolean changed24 = gapComposer.changed(updateTransition);
            Object rememberedValue17 = gapComposer.rememberedValue();
            if (changed24 || rememberedValue17 == neverEqualPolicy) {
                rememberedValue17 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 9));
                gapComposer.updateRememberedValue(rememberedValue17);
            }
            CheckedInSheetAnimationStage checkedInSheetAnimationStage13 = (CheckedInSheetAnimationStage) ((State) rememberedValue17).getValue();
            gapComposer.startReplaceGroup(-1898745313);
            Dp m16 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, false, isAtLeast(checkedInSheetAnimationStage13, checkedInSheetAnimationStage8) ? RecyclerView.DECELERATION_RATE : 8.0f);
            boolean changed25 = gapComposer.changed(updateTransition);
            Object rememberedValue18 = gapComposer.rememberedValue();
            if (changed25 || rememberedValue18 == neverEqualPolicy) {
                rememberedValue18 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$1(updateTransition, 10));
                gapComposer.updateRememberedValue(rememberedValue18);
            }
            ((Transition.Segment) ((State) rememberedValue18).getValue()).getClass();
            gapComposer.startReplaceGroup(1717004333);
            TweenSpec tween$default7 = AnimatableKt.tween$default(450, 0, cubicBezierEasing, 2);
            gapComposer.end(false);
            Transition.TransitionAnimationState createTransitionAnimation8 = AnimatableKt.createTransitionAnimation(updateTransition, m15, m16, tween$default7, twoWayConverterImpl2, gapComposer, 196608);
            float mo233toDpu2uoSUM3 = density2.mo233toDpu2uoSUM((((int) (((IntSize) checkedInHeaderMeasurements.headerSize$delegate.getValue()).packedValue & BodyPartID.bodyIdMax)) - ((int) (checkedInHeaderMeasurements.m1312getTextColumnSizeYbymL2g() & BodyPartID.bodyIdMax))) / 2);
            float mo233toDpu2uoSUM4 = density2.mo233toDpu2uoSUM((int) (((IntSize) checkedInHeaderMeasurements.titleSize$delegate.getValue()).packedValue >> 32));
            CheckedInHeaderAnimationValues checkedInHeaderAnimationValues = new CheckedInHeaderAnimationValues(((Number) transitionAnimationState3.value$delegate.getValue()).floatValue(), ((Dp) createTransitionAnimation4.value$delegate.getValue()).value, mo233toDpu2uoSUM4, ((Dp) RangesKt___RangesKt.coerceIn(new Dp(((Dp) transitionAnimationState2.value$delegate.getValue()).value + density2.mo233toDpu2uoSUM((density2.mo230roundToPx0680j_4(16.0f) + ((int) (checkedInHeaderMeasurements.m1312getTextColumnSizeYbymL2g() >> 32))) / 2)), new Dp(RecyclerView.DECELERATION_RATE), new Dp(mo233toDpu2uoSUM4))).value, ((Number) createTransitionAnimation5.value$delegate.getValue()).floatValue(), ((Dp) createTransitionAnimation8.value$delegate.getValue()).value, mo233toDpu2uoSUM3, ((Dp) createTransitionAnimation7.value$delegate.getValue()).value, ((Number) createTransitionAnimation.value$delegate.getValue()).floatValue(), ((Number) createTransitionAnimation2.value$delegate.getValue()).floatValue(), ((Dp) transitionAnimationState2.value$delegate.getValue()).value);
            String str2 = isAtLeast(checkedInSheetAnimationStage, CheckedInSheetAnimationStage.Ready) ? format3 : null;
            if (str2 != null) {
                gapComposer.startReplaceGroup(1516510262);
                boolean changed26 = gapComposer.changed(str2);
                Object rememberedValue19 = gapComposer.rememberedValue();
                if (changed26 || rememberedValue19 == neverEqualPolicy) {
                    rememberedValue19 = new IconKt$$ExternalSyntheticLambda0(str2, 25);
                    gapComposer.updateRememberedValue(rememberedValue19);
                }
                companion = companion2;
                clearAndSetSemantics = SemanticsModifierKt.semantics(companion, true, (Function1) rememberedValue19);
                z5 = false;
                gapComposer.end(false);
            } else {
                companion = companion2;
                gapComposer.startReplaceGroup(1516676329);
                Object rememberedValue20 = gapComposer.rememberedValue();
                if (rememberedValue20 == neverEqualPolicy) {
                    rememberedValue20 = new LocationMenu$$ExternalSyntheticLambda6(12);
                    gapComposer.updateRememberedValue(rememberedValue20);
                }
                clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue20);
                z5 = false;
                gapComposer.end(false);
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, z5);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
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
            Modifier alpha = AlphaKt.alpha(companion, RecyclerView.DECELERATION_RATE);
            Object rememberedValue21 = gapComposer.rememberedValue();
            if (rememberedValue21 == neverEqualPolicy) {
                rememberedValue21 = new LocationMenu$$ExternalSyntheticLambda6(13);
                gapComposer.updateRememberedValue(rememberedValue21);
            }
            Modifier clearAndSetSemantics2 = SemanticsModifierKt.clearAndSetSemantics(alpha, (Function1) rememberedValue21);
            boolean changed27 = gapComposer.changed(checkedInHeaderMeasurements);
            Object rememberedValue22 = gapComposer.rememberedValue();
            if (changed27 || rememberedValue22 == neverEqualPolicy) {
                final int i5 = 0;
                rememberedValue22 = new Function1() { // from class: app.cash.local.views.brand.profile.LocalBrandLocationCheckedInSheetKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i6 = i5;
                        CheckedInHeaderMeasurements checkedInHeaderMeasurements2 = checkedInHeaderMeasurements;
                        IntSize intSize = (IntSize) obj;
                        switch (i6) {
                            case 0:
                                checkedInHeaderMeasurements2.headerSize$delegate.setValue(new IntSize(intSize.packedValue));
                                break;
                            case 1:
                                checkedInHeaderMeasurements2.textColumnSize$delegate.setValue(new IntSize(intSize.packedValue));
                                break;
                            case 2:
                                checkedInHeaderMeasurements2.titleSize$delegate.setValue(new IntSize(intSize.packedValue));
                                break;
                            default:
                                checkedInHeaderMeasurements2.avatarSize$delegate.setValue(new IntSize(intSize.packedValue));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue22);
            }
            Modifier onSizeChanged = RulerKt.onSizeChanged(clearAndSetSemantics2, (Function1) rememberedValue22);
            boolean changed28 = gapComposer.changed(checkedInHeaderMeasurements);
            Object rememberedValue23 = gapComposer.rememberedValue();
            if (changed28 || rememberedValue23 == neverEqualPolicy) {
                final int i6 = 1;
                rememberedValue23 = new Function1() { // from class: app.cash.local.views.brand.profile.LocalBrandLocationCheckedInSheetKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i62 = i6;
                        CheckedInHeaderMeasurements checkedInHeaderMeasurements2 = checkedInHeaderMeasurements;
                        IntSize intSize = (IntSize) obj;
                        switch (i62) {
                            case 0:
                                checkedInHeaderMeasurements2.headerSize$delegate.setValue(new IntSize(intSize.packedValue));
                                break;
                            case 1:
                                checkedInHeaderMeasurements2.textColumnSize$delegate.setValue(new IntSize(intSize.packedValue));
                                break;
                            case 2:
                                checkedInHeaderMeasurements2.titleSize$delegate.setValue(new IntSize(intSize.packedValue));
                                break;
                            default:
                                checkedInHeaderMeasurements2.avatarSize$delegate.setValue(new IntSize(intSize.packedValue));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue23);
            }
            Function1 function1 = (Function1) rememberedValue23;
            boolean changed29 = gapComposer.changed(checkedInHeaderMeasurements);
            Object rememberedValue24 = gapComposer.rememberedValue();
            if (changed29 || rememberedValue24 == neverEqualPolicy) {
                final int i7 = 2;
                rememberedValue24 = new Function1() { // from class: app.cash.local.views.brand.profile.LocalBrandLocationCheckedInSheetKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i62 = i7;
                        CheckedInHeaderMeasurements checkedInHeaderMeasurements2 = checkedInHeaderMeasurements;
                        IntSize intSize = (IntSize) obj;
                        switch (i62) {
                            case 0:
                                checkedInHeaderMeasurements2.headerSize$delegate.setValue(new IntSize(intSize.packedValue));
                                break;
                            case 1:
                                checkedInHeaderMeasurements2.textColumnSize$delegate.setValue(new IntSize(intSize.packedValue));
                                break;
                            case 2:
                                checkedInHeaderMeasurements2.titleSize$delegate.setValue(new IntSize(intSize.packedValue));
                                break;
                            default:
                                checkedInHeaderMeasurements2.avatarSize$delegate.setValue(new IntSize(intSize.packedValue));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue24);
            }
            Function1 function12 = (Function1) rememberedValue24;
            boolean changed30 = gapComposer.changed(checkedInHeaderMeasurements);
            Object rememberedValue25 = gapComposer.rememberedValue();
            if (changed30 || rememberedValue25 == neverEqualPolicy) {
                final int i8 = 3;
                rememberedValue25 = new Function1() { // from class: app.cash.local.views.brand.profile.LocalBrandLocationCheckedInSheetKt$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        int i62 = i8;
                        CheckedInHeaderMeasurements checkedInHeaderMeasurements2 = checkedInHeaderMeasurements;
                        IntSize intSize = (IntSize) obj;
                        switch (i62) {
                            case 0:
                                checkedInHeaderMeasurements2.headerSize$delegate.setValue(new IntSize(intSize.packedValue));
                                break;
                            case 1:
                                checkedInHeaderMeasurements2.textColumnSize$delegate.setValue(new IntSize(intSize.packedValue));
                                break;
                            case 2:
                                checkedInHeaderMeasurements2.titleSize$delegate.setValue(new IntSize(intSize.packedValue));
                                break;
                            default:
                                checkedInHeaderMeasurements2.avatarSize$delegate.setValue(new IntSize(intSize.packedValue));
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue25);
            }
            m1313FinalCheckedInHeaderLayoutAFY4PWA(stringResource, format2, onSizeChanged, function1, function12, (Function1) rememberedValue25, gapComposer, 0);
            gapComposer = gapComposer;
            AnimatedCheckedInHeaderContent(stringResource, format2, inStore, checkedInHeaderAnimationValues, BoxScopeInstance.INSTANCE.matchParentSize(), gapComposer, (i3 << 6) & 896);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i9 = 1;
            endRestartGroup2.block = new Function2() { // from class: app.cash.local.views.brand.profile.LocalBrandLocationCheckedInSheetKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i52 = i9;
                    int i62 = i;
                    boolean z7 = z;
                    CheckedInSheetAnimationStage checkedInSheetAnimationStage22 = checkedInSheetAnimationStage;
                    LocalBrandProfileViewModel.Fulfillment.InStore inStore2 = inStore;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i52) {
                        case 0:
                            LocalBrandLocationRowKt.CheckedInHeader(inStore2, checkedInSheetAnimationStage22, z7, composer2, Updater.updateChangedFlags(i62 | 1));
                            break;
                        default:
                            LocalBrandLocationRowKt.CheckedInHeader(inStore2, checkedInSheetAnimationStage22, z7, composer2, Updater.updateChangedFlags(i62 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void CheckedInHeaderTextColumn(String str, String str2, CheckedInHeaderAnimationValues checkedInHeaderAnimationValues, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-864946431);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(checkedInHeaderAnimationValues) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(modifier) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            float f = checkedInHeaderAnimationValues.titleOffsetY;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier alpha = AlphaKt.alpha(ClipKt.clipToBounds(SizeKt.m290width3ABfNKs(OffsetKt.m273offsetVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, f, 1), checkedInHeaderAnimationValues.titleRevealWidth)), checkedInHeaderAnimationValues.titleAlpha);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int i3 = i2;
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, alpha);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(0, 0, 0, 0, i3 & 14, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SizeKt.m284requiredWidth3ABfNKs(companion, checkedInHeaderAnimationValues.titleWidth), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).header, 0L, 0L, FontWeight.Normal, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211), (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            Room.m1165Text25TpFw(0, 2, 0, 3, ((i3 >> 3) & 14) | 1572864, 0, 3760, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, AlphaKt.alpha(OffsetKt.m273offsetVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, checkedInHeaderAnimationValues.subtitleOffsetY, 1), checkedInHeaderAnimationValues.subtitleAlpha), Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(str, str2, checkedInHeaderAnimationValues, modifier, i, 10);
        }
    }

    public static final void DropdownAnchor(int i, Composer composer, String str, Function0 function0, boolean z) {
        String str2;
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1514810775);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (gapComposer2.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function0) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 8.0f, RecyclerView.DECELERATION_RATE, 2);
            Strings.getSizes(gapComposer2).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier clip = ClipKt.clip(m300paddingVpY3zN4$default, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f));
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m182clickableO2vRcR0$default(clip, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer2, 48, 13), z, null, null, function0, 24), 8.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer2, 54);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m298padding3ABfNKs);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 1, 0, 0, (i2 & 14) | 1572864, 0, 4018, Strings.getColors(gapComposer2).semantic.text.prominent, (Composer) gapComposer2, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).labelMedium, 0L, Room.getSp(20), null, null, 0L, null, 0L, null, null, null, 0, Room.getSp(20), null, null, 0, 16646141), (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            if (z) {
                gapComposer.startReplaceGroup(-1471989890);
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 16.0f);
                Painter painter = Icons.CaretDown16.painter(gapComposer);
                long j = Strings.getColors(gapComposer).semantic.icon.extraSubtle;
                ImageKt.Image(painter, null, m285size3ABfNKs, null, ContentScale.Companion.None, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 25008, 40);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1471729273);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckoutTipSectionKt$$ExternalSyntheticLambda16(str, z, function0, i, 1);
        }
    }

    /* renamed from: FinalCheckedInHeaderLayout-AFY4PWA, reason: not valid java name */
    public static final void m1313FinalCheckedInHeaderLayoutAFY4PWA(String str, String str2, Modifier modifier, Function1 function1, Function1 function12, Function1 function13, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-319370004);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changed(str) ? 4 : 2) | (gapComposer2.changed(str2) ? 32 : 16) | (gapComposer2.changed(16.0f) ? 256 : 128) | (gapComposer2.changed(modifier) ? 2048 : 1024) | (gapComposer2.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changedInstance(function12) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changedInstance(function13) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 599187) != 599186)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier onSizeChanged = RulerKt.onSizeChanged(companion, function1);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, onSizeChanged);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4080, Strings.getColors(gapComposer2).semantic.text.standard, (Composer) gapComposer2, RulerKt.onSizeChanged(companion, function12), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).header, 0L, 0L, FontWeight.Normal, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211), (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 2, 0, 3, ((i2 >> 3) & 14) | 1572864, 0, 3762, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).bodySmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 16.0f));
            SpacerKt.Spacer(gapComposer, RulerKt.onSizeChanged(SizeKt.m285size3ABfNKs(companion, AvatarSize.Size48.size), function13));
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SwipeToDismissKt$$ExternalSyntheticLambda3(str, str2, modifier, function1, function12, function13, i);
        }
    }

    public static final void LocalBrandDescriptionView(Modifier modifier, LocalBrandDescriptionViewModel localBrandDescriptionViewModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2022451344);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(localBrandDescriptionViewModel) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 20.0f, 2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
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
            String stringResource = Room.stringResource(gapComposer, R.string.local_views_about);
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, 0L, 0L, new FontWeight(400), null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.disabled, (Composer) gapComposer, (Modifier) companion, m994copyp1EtxEg$default, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
            SimpleLayoutKt.SelectionContainer(null, Expect_jvmKt.rememberComposableLambda(1357960461, new HintHandler$$ExternalSyntheticLambda0(localBrandDescriptionViewModel, 29), gapComposer), gapComposer, 48, 1);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(modifier, localBrandDescriptionViewModel, i, 11);
        }
    }

    public static final void LocalBrandLocationAddressView(Modifier modifier, LocalBrandLocationAddressContentModel localBrandLocationAddressContentModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-2135003458);
        Applier applier = gapComposer2.applier;
        int i2 = i | (gapComposer2.changedInstance(localBrandLocationAddressContentModel) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(3, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ImageKt.m183clickableoSLSa3U$default(modifier, false, null, null, (Function0) rememberedValue, 15), 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 20.0f, 2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer2, 54);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer2).semantic.text.disabled, (Composer) gapComposer2, (Modifier) companion, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).labelMedium, 0L, 0L, new FontWeight(400), null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211), (TextLineBalancing) null, localBrandLocationAddressContentModel.addressLabel, (Map) null, (Function1) null, false);
            SimpleLayoutKt.SelectionContainer(null, Expect_jvmKt.rememberComposableLambda(198236385, new CartBannerViewKt$$ExternalSyntheticLambda2(localBrandLocationAddressContentModel, 1), gapComposer2), gapComposer2, 48, 1);
            gapComposer2.end(true);
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7), 24.0f);
            Painter painter = Icons.Location24.painter(gapComposer2);
            long j = Strings.getColors(gapComposer2).semantic.icon.extraSubtle;
            ImageKt.Image(painter, null, m285size3ABfNKs, null, ContentScale.Companion.None, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable | 25008, 40);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuKt$$ExternalSyntheticLambda1(modifier, localBrandLocationAddressContentModel, function1, i, 22);
        }
    }

    public static final void LocalBrandLocationCheckedInSheet(Modifier modifier, LocalBrandProfileViewModel.Fulfillment.InStore inStore, Function0 function0, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(123396184);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        }
        int i5 = i3 | (gapComposer.changedInstance(inStore) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if ((i & 3072) == 0) {
            i5 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        int i6 = 1;
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 1171) != 1170)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (i4 != 0) {
                modifier2 = companion;
            }
            boolean booleanValue = ((Boolean) gapComposer.consume(InspectionModeKt.LocalInspectionMode)).booleanValue() ? false : ((Boolean) MotionKt.produceAnimationsEnabled(gapComposer).getValue()).booleanValue();
            boolean changed = gapComposer.changed(booleanValue);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(booleanValue ? CheckedInSheetAnimationStage.Loading : CheckedInSheetAnimationStage.Ready);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Boolean valueOf = Boolean.valueOf(booleanValue);
            boolean changed2 = gapComposer.changed(booleanValue) | gapComposer.changed(mutableState);
            Object rememberedValue2 = gapComposer.rememberedValue();
            Continuation continuation = null;
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new RealOffersDetailsStateManager$states$1$1(booleanValue, mutableState, continuation, i6);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue2);
            CheckedInSheetAnimationStage checkedInSheetAnimationStage = (CheckedInSheetAnimationStage) mutableState.getValue();
            Modifier animateContentSize$default = AnimatedContentKt.animateContentSize$default(SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(modifier2, 1.0f), 24.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, 52.0f, RecyclerView.DECELERATION_RATE, 24.0f, 5), AnimatableKt.tween$default(500, 0, EasingFunctionsKt.EaseOutCubic, 2), 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, animateContentSize$default);
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
            int i7 = i5 >> 3;
            CheckedInHeader(inStore, checkedInSheetAnimationStage, booleanValue, gapComposer, i7 & 14);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            Request$Priority$EnumUnboxingLocalUtility.m(DefaultSizes.spacing, companion, 64.0f, gapComposer);
            CheckedInButton(SizeKt.fillMaxWidth(companion, 1.0f), checkedInSheetAnimationStage, function0, gapComposer, (i7 & 896) | 6);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier3 = modifier2;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(modifier3, inStore, function0, i, i2, 2);
        }
    }

    public static final void LocalBrandLocationFooterView(LocalBrandLocationFooterContentModel localBrandLocationFooterContentModel, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1646798091);
        int i2 = i | (gapComposer.changedInstance(localBrandLocationFooterContentModel) ? 4 : 2);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 20.0f, 2);
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
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 6.0f, 7), 16.0f);
            Painter painter = Icons.CashAppCustomer16.painter(gapComposer);
            long j = Strings.getColors(gapComposer).semantic.icon.standard;
            ImageKt.Image(painter, null, m285size3ABfNKs, null, ContentScale.Companion.None, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 25008, 40);
            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) companion, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyXSmall, 0L, 0L, null, Fonts.CashSans, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183), (TextLineBalancing) null, localBrandLocationFooterContentModel.text, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            SimpleLayoutKt.SelectionContainer(null, Expect_jvmKt.rememberComposableLambda(2089946514, new LocalBrandLocationFooterViewKt$$ExternalSyntheticLambda0(localBrandLocationFooterContentModel), gapComposer), gapComposer, 48, 1);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalBrandLocationFooterViewKt$$ExternalSyntheticLambda0(localBrandLocationFooterContentModel, i);
        }
    }

    public static final void LocalBrandLocationHoursView(LocalBrandLocationHoursContentModel localBrandLocationHoursContentModel, Function1 function1, Composer composer, int i) {
        char c;
        Object immutableList;
        long j;
        Modifier.Companion companion;
        BiasAlignment.Horizontal horizontal;
        Arrangement$Top$1 arrangement$Top$1;
        Arrangement$End$1 arrangement$End$1;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        LocalBrandLocationHoursContentModel.Entry entry;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        int i2;
        List list;
        int i3;
        boolean z;
        boolean z2;
        char c2;
        FontWeight fontWeight;
        char c3;
        FontWeight fontWeight2;
        char c4;
        boolean z3;
        List list2 = localBrandLocationHoursContentModel.dropdownOptions;
        BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
        Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
        Arrangement$End$1 arrangement$End$12 = SpacerKt.Start;
        BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1746618722);
        Applier applier = gapComposer.applier;
        int i4 = i | (gapComposer.changedInstance(localBrandLocationHoursContentModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            LocationStatus locationStatus = localBrandLocationHoursContentModel.status;
            boolean changed = gapComposer.changed(list2);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                List list3 = list2;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (Iterator it = list3.iterator(); it.hasNext(); it = it) {
                    LocalBrandLocationHoursContentModel.DropdownOption dropdownOption = (LocalBrandLocationHoursContentModel.DropdownOption) it.next();
                    arrayList.add(new LocalDropdownItemModel(dropdownOption.title, (LocalDropdownItemModel.IconState) null, new StatusRunnable$$ExternalSyntheticLambda1(26, function1, dropdownOption), 6));
                }
                c = ' ';
                immutableList = Tags.toImmutableList(arrayList);
                gapComposer.updateRememberedValue(immutableList);
            } else {
                immutableList = rememberedValue;
                c = ' ';
            }
            ImmutableList immutableList2 = (ImmutableList) immutableList;
            LocalDropdownItemKt.m1326LocalDropdownMenu4kj_NE(null, Expect_jvmKt.rememberComposableLambda(-856334486, new LocalViewFactory$$ExternalSyntheticLambda4(3, localBrandLocationHoursContentModel, immutableList2), gapComposer), immutableList2, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(20.0f) << c), false, false, false, gapComposer, 3120, 49);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion2, 16.0f));
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$12, vertical, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String label = locationStatus.getLabel();
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).labelMedium, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 0, Room.getSp(20), null, null, 0, 16646143);
            if (locationStatus instanceof LocationStatus.Unknown) {
                gapComposer.startReplaceGroup(1719119597);
                j = Strings.getColors(gapComposer).component.button.prominent.background.f160default;
                gapComposer.end(false);
            } else if (locationStatus instanceof LocationStatus.Open) {
                gapComposer.startReplaceGroup(1719121581);
                j = Strings.getColors(gapComposer).semantic.text.success;
                gapComposer.end(false);
            } else {
                if (!(locationStatus instanceof LocationStatus.Closed) && !(locationStatus instanceof LocationStatus.TemporarilyDisabled)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1719116574, false);
                }
                gapComposer.startReplaceGroup(1719124717);
                j = Strings.getColors(gapComposer).semantic.text.warning;
                gapComposer.end(false);
            }
            Modifier.Companion companion3 = companion2;
            float f = 16.0f;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, j, (Composer) gapComposer, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, label, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            String description = locationStatus.getDescription();
            if (description == null) {
                gapComposer.startReplaceGroup(1753322505);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1753322506);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.disabled, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).labelMedium, 0L, 0L, new FontWeight(400), null, 0L, null, 0L, null, null, null, 0, Room.getSp(20), null, null, 0, 16646139), (TextLineBalancing) null, (!StringsKt.isBlank(locationStatus.getLabel()) ? " · " : "").concat(description), (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.startReplaceGroup(-831561154);
            List list4 = localBrandLocationHoursContentModel.entries;
            int size = list4.size();
            int i5 = 0;
            while (i5 < size) {
                LocalBrandLocationHoursContentModel.Entry entry2 = (LocalBrandLocationHoursContentModel.Entry) list4.get(i5);
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion3, f, 2.0f);
                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$12, Alignment.Companion.Top, gapComposer, 0);
                List list5 = list4;
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$13);
                } else {
                    gapComposer.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$15);
                Integer valueOf = Integer.valueOf(hashCode2);
                int i6 = size;
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$16);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                int i7 = i5;
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$17);
                String str = entry2.start;
                String str2 = entry2.startExtra;
                boolean z4 = entry2.highlight;
                if (str != null) {
                    gapComposer.startReplaceGroup(1313553327);
                    arrangement$End$1 = arrangement$End$12;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer, 0);
                    horizontal = horizontal2;
                    arrangement$Top$1 = arrangement$Top$12;
                    int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, companion3);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$15);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$16, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$17);
                    String str3 = entry2.start;
                    str3.getClass();
                    TextStyle textStyle = Strings.getTypography(gapComposer).bodyMedium;
                    if (z4) {
                        fontWeight2 = new FontWeight(500);
                        c4 = 400;
                    } else {
                        c4 = 400;
                        fontWeight2 = new FontWeight(400);
                    }
                    TextStyle m994copyp1EtxEg$default2 = TextStyle.m994copyp1EtxEg$default(textStyle, 0L, 0L, fontWeight2, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211);
                    GapComposer gapComposer2 = gapComposer;
                    i3 = i7;
                    z = z4;
                    entry = entry2;
                    list = list5;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                    i2 = i6;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    companion = companion3;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                    z2 = true;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.prominent, (Composer) gapComposer2, (Modifier) null, m994copyp1EtxEg$default2, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                    gapComposer = gapComposer2;
                    if (str2 != null) {
                        gapComposer.startReplaceGroup(-1109684741);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.warning, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyXSmall, 0L, 0L, null, Fonts.CashSans, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183), (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                        gapComposer = gapComposer;
                        z3 = false;
                        gapComposer.end(false);
                    } else {
                        z3 = false;
                        gapComposer.startReplaceGroup(-1109453140);
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                    gapComposer.end(z3);
                } else {
                    companion = companion3;
                    horizontal = horizontal2;
                    arrangement$Top$1 = arrangement$Top$12;
                    arrangement$End$1 = arrangement$End$12;
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                    entry = entry2;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                    i2 = i6;
                    list = list5;
                    i3 = i7;
                    z = z4;
                    z2 = true;
                    gapComposer.startReplaceGroup(1314151069);
                    gapComposer.end(false);
                }
                SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, z2));
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(new VerticalAlignElement(vertical), 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                BiasAlignment.Horizontal horizontal3 = horizontal;
                Arrangement$Top$1 arrangement$Top$13 = arrangement$Top$1;
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$13, horizontal3, gapComposer, 0);
                int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$13);
                Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$1, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$12);
                gapComposer.startReplaceGroup(972798005);
                List list6 = entry.ends;
                int size2 = list6.size();
                int i8 = 0;
                while (i8 < size2) {
                    String str4 = (String) list6.get(i8);
                    HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(Alignment.Companion.End);
                    TextStyle textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    if (z) {
                        c2 = 500;
                        fontWeight = new FontWeight(500);
                        c3 = 400;
                    } else {
                        c2 = 500;
                        c3 = 400;
                        fontWeight = new FontWeight(400);
                    }
                    TextStyle m994copyp1EtxEg$default3 = TextStyle.m994copyp1EtxEg$default(textStyle2, 0L, 0L, fontWeight, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    GapComposer gapComposer3 = gapComposer;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, colors.semantic.text.prominent, (Composer) gapComposer3, (Modifier) horizontalAlignElement, m994copyp1EtxEg$default3, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                    gapComposer = gapComposer3;
                    i8++;
                    horizontal3 = horizontal3;
                    arrangement$Top$13 = arrangement$Top$13;
                }
                Arrangement$Top$1 arrangement$Top$14 = arrangement$Top$13;
                gapComposer.end(false);
                gapComposer.end(z2);
                gapComposer.end(z2);
                size = i2;
                i5 = i3 + 1;
                arrangement$End$12 = arrangement$End$1;
                horizontal2 = horizontal3;
                f = 16.0f;
                arrangement$Top$12 = arrangement$Top$14;
                companion3 = companion;
                list4 = list;
            }
            Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, false, companion3, 20.0f, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(localBrandLocationHoursContentModel, function1, i, 12);
        }
    }

    public static final void LocalBrandLocationLoyaltyView(Modifier modifier, LocalBrandProfileViewModel.LoyaltyModel loyaltyModel, Composer composer, int i) {
        float f;
        Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
        BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
        modifier.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-288802481);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(loyaltyModel) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, 7);
            float f2 = 12.0f;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7);
            Modifier.Companion companion2 = companion;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.prominent, (Composer) gapComposer, (Modifier) Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14, 1.0f, true), Strings.getTypography(gapComposer).sectionTitle, (TextLineBalancing) null, loyaltyModel.title, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, loyaltyModel.currentPoints, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            gapComposer.startReplaceGroup(1209624027);
            ArrayList arrayList = loyaltyModel.tiers;
            int i3 = 0;
            for (int size = arrayList.size(); i3 < size; size = size) {
                LocalBrandProfileViewModel.LoyaltyModel.Tier tier = (LocalBrandProfileViewModel.LoyaltyModel.Tier) arrayList.get(i3);
                float f3 = f2;
                Modifier.Companion companion3 = companion2;
                Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f3, 7);
                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 48);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default3);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                Float f4 = tier.percentComplete;
                if (f4 == null || Intrinsics.areEqual(f4, RecyclerView.DECELERATION_RATE)) {
                    f = 1.0f;
                    f4 = Float.valueOf(RecyclerView.DECELERATION_RATE);
                } else {
                    f = 1.0f;
                    if (f4.floatValue() >= 1.0f) {
                        f4 = Float.valueOf(1.0f);
                    } else if (f4.floatValue() < 0.05f) {
                        f4 = Float.valueOf(0.05f);
                    } else if (f4.floatValue() > 0.95f) {
                        f4 = Float.valueOf(0.95f);
                    }
                }
                GapComposer gapComposer2 = gapComposer;
                VisibleKt.m3497ProgressMeterUV7SVM(f4.floatValue(), Strings.getColors(gapComposer).semantic.icon.prominent, 2.0f, SizeKt.m287sizeVpY3zN4(companion3, 20.0f, 20.0f), 0L, RecyclerView.DECELERATION_RATE, 0L, ProgressMeter$CompletionBehavior.NONE, null, null, null, null, null, gapComposer2, 12583296, 0, 8048);
                gapComposer = gapComposer2;
                f2 = f3;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, Request$Priority$EnumUnboxingLocalUtility.m(f, SpacerKt.m302paddingqDBjuR0$default(companion3, f2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), true), Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, tier.label, (Map) null, (Function1) null, false);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, tier.pointsNeeded, (Map) null, (Function1) null, false);
                gapComposer.end(true);
                i3++;
                companion2 = companion3;
                arrangement$End$1 = arrangement$End$1;
                arrayList = arrayList;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(modifier, loyaltyModel, i, 13);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v21 */
    public static final void LocalBrandLocationMapDecisionSheet(Modifier modifier, MapDecisionSheetModel mapDecisionSheetModel, Function1 function1, Composer composer, int i) {
        Function1 function12;
        boolean z;
        int i2;
        float f;
        Modifier.Companion companion;
        int i3;
        ?? r3;
        int i4;
        mapDecisionSheetModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-204209011);
        int i5 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(mapDecisionSheetModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(SizeKt.fillMaxWidth(modifier, 1.0f), 24.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
            String str = mapDecisionSheetModel.name;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (str == null) {
                gapComposer.startReplaceGroup(-643883132);
                gapComposer.end(false);
                z = false;
                i2 = -1762997026;
            } else {
                gapComposer.startReplaceGroup(-643883131);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                z = false;
                i2 = -1762997026;
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.subtle, (Composer) gapComposer, (Modifier) companion2, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            String str2 = mapDecisionSheetModel.address;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-643662536);
                gapComposer.end(z);
                f = 0.0f;
                companion = companion2;
                i3 = 1;
            } else {
                gapComposer.startReplaceGroup(-643662535);
                TextStyle textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, i2, gapComposer, z);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(z);
                }
                f = 0.0f;
                Room.m1165Text25TpFw(2, 1, 0, 0, 1769520, 0, 3984, colors2.semantic.text.subtle, (Composer) gapComposer, (Modifier) companion2, textStyle2, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                companion = companion2;
                i3 = 1;
                ModalKt.HorizontalDivider(6, 0, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, RecyclerView.DECELERATION_RATE, 12.0f, 1));
                gapComposer.end(false);
            }
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, f, 24.0f, i3);
            int i6 = i5 & 896;
            int i7 = i6 == 256 ? i3 : 0;
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (i7 != 0 || rememberedValue == obj) {
                rememberedValue = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(4, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion3 = companion;
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.prominent, (Composer) gapComposer, ImageKt.m183clickableoSLSa3U$default(m300paddingVpY3zN4$default, false, null, null, (Function0) rememberedValue, 15), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).labelMedium, 0L, Room.getSp(18), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213), (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_open_google_maps), (Map) null, (Function1) null, false);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7);
            boolean z2 = i6 == 256;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == obj) {
                rememberedValue2 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(5, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.prominent, (Composer) gapComposer, ImageKt.m183clickableoSLSa3U$default(m302paddingqDBjuR0$default, false, null, null, (Function0) rememberedValue2, 15), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).labelMedium, 0L, Room.getSp(18), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213), (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_copy_address), (Map) null, (Function1) null, false);
            if (mapDecisionSheetModel.copyPhone) {
                gapComposer.startReplaceGroup(-642697505);
                Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(companion3, RecyclerView.DECELERATION_RATE, 24.0f, 1);
                boolean z3 = i6 == 256;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (z3 || rememberedValue3 == obj) {
                    rememberedValue3 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(6, function1);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                r3 = 1;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.prominent, (Composer) gapComposer, ImageKt.m183clickableoSLSa3U$default(m300paddingVpY3zN4$default2, false, null, null, (Function0) rememberedValue3, 15), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).labelMedium, 0L, Room.getSp(18), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213), (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_copy_phone), (Map) null, (Function1) null, false);
                i4 = 0;
                gapComposer.end(false);
            } else {
                r3 = 1;
                i4 = 0;
                gapComposer.startReplaceGroup(-642403253);
                gapComposer.end(false);
            }
            ModalKt.HorizontalDivider(6, i4, gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion3, RecyclerView.DECELERATION_RATE, 12.0f, r3));
            Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(companion3, RecyclerView.DECELERATION_RATE, 12.0f, r3);
            int i8 = i6 == 256 ? r3 : i4;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (i8 != 0 || rememberedValue4 == obj) {
                function12 = function1;
                rememberedValue4 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(7, function12);
                gapComposer.updateRememberedValue(rememberedValue4);
            } else {
                function12 = function1;
            }
            Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, ImageKt.m183clickableoSLSa3U$default(m300paddingVpY3zN4$default3, false, null, null, (Function0) rememberedValue4, 15), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyMedium, 0L, Room.getSp(18), null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777213), (TextLineBalancing) null, "Cancel", (Map) null, (Function1) null, false);
            gapComposer.end(r3);
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuKt$$ExternalSyntheticLambda1(modifier, mapDecisionSheetModel, function12, i, 23);
        }
    }

    public static final void LocalBrandLocationMarketingMessagesView(LocalBrandLocationMarketingMessagesContentModel localBrandLocationMarketingMessagesContentModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        ArrayList arrayList;
        Object obj;
        RowScopeInstance rowScopeInstance;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-22891012);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(localBrandLocationMarketingMessagesContentModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(modifier) ? 256 : 128;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            int i3 = i2;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.Bottom, gapComposer2, 54);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
            gapComposer2.startReusableNode();
            Modifier.Companion companion2 = companion;
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).semantic.text.prominent, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).sectionTitle, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.local_views_messages), (Map) null, (Function1) null, false);
            boolean z = localBrandLocationMarketingMessagesContentModel.showAllVisible;
            ArrayList arrayList2 = localBrandLocationMarketingMessagesContentModel.entries;
            Object obj2 = Composer.Companion.Empty;
            if (z) {
                gapComposer2.startReplaceGroup(-94487798);
                Role role = new Role(0);
                boolean z2 = (i3 & 112) == 32;
                Object rememberedValue = gapComposer2.rememberedValue();
                if (z2 || rememberedValue == obj2) {
                    rememberedValue = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(8, function1);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion2, false, null, role, (Function0) rememberedValue, 11);
                companion2 = companion2;
                arrayList = arrayList2;
                obj = obj2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, m183clickableoSLSa3U$default, Strings.getTypography(gapComposer2).bodySmall, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.local_views_show_all), (Map) null, (Function1) null, false);
                gapComposer2.end(false);
            } else {
                arrayList = arrayList2;
                obj = obj2;
                gapComposer2.startReplaceGroup(-94181952);
                gapComposer2.end(false);
            }
            gapComposer2.end(true);
            Modifier.Companion companion3 = companion2;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer2, 6);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, m302paddingqDBjuR0$default);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            gapComposer2.startReplaceGroup(999546935);
            Iterator it = CollectionsKt.take(arrayList, 2).iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                rowScopeInstance = RowScopeInstance.INSTANCE;
                if (!hasNext) {
                    break;
                }
                LocalBrandLocationMarketingMessagesContentModel.Entry entry = (LocalBrandLocationMarketingMessagesContentModel.Entry) it.next();
                Modifier weight = rowScopeInstance.weight(1.0f, companion3, true);
                Role role2 = new Role(0);
                boolean changedInstance = gapComposer2.changedInstance(entry) | ((i3 & 112) == 32);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changedInstance || rememberedValue2 == obj) {
                    rememberedValue2 = new StatusRunnable$$ExternalSyntheticLambda1(27, function1, entry);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                GapComposer gapComposer3 = gapComposer2;
                MarketingMessageKt.MarketingMessageImage(ImageKt.m183clickableoSLSa3U$default(weight, false, null, role2, (Function0) rememberedValue2, 11), entry.brandColor, entry.image, entry.message, entry.badge, MarketingMessageImageStyle.COMPACT, gapComposer3, 196608, 0);
                gapComposer2 = gapComposer3;
            }
            gapComposer = gapComposer2;
            gapComposer.end(false);
            if (arrayList.size() == 1) {
                gapComposer.startReplaceGroup(921693834);
                SpacerKt.Spacer(gapComposer, rowScopeInstance.weight(1.0f, companion3, true));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(921737079);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8(localBrandLocationMarketingMessagesContentModel, function1, modifier, i);
        }
    }

    public static final void LocalBrandLocationMenuCarouselView(LocalBrandLocationMenuCarouselContentModel localBrandLocationMenuCarouselContentModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2108044406);
        int i2 = (gapComposer.changedInstance(localBrandLocationMenuCarouselContentModel) ? 32 : 16) | i | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 6.0f, 7);
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3));
            PaddingValuesImpl m297PaddingValuesa9UjIt4$default = SpacerKt.m297PaddingValuesa9UjIt4$default(12.0f, RecyclerView.DECELERATION_RATE, 12.0f, 16.0f, 2);
            boolean changedInstance = gapComposer.changedInstance(localBrandLocationMenuCarouselContentModel) | ((i2 & 896) == 256);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new RealBadger2$$ExternalSyntheticLambda0(17, localBrandLocationMenuCarouselContentModel, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyRow(m302paddingqDBjuR0$default, null, m297PaddingValuesa9UjIt4$default, arrangement$SpacedAligned, null, null, false, null, (Function1) rememberedValue, gapComposer, 24966, 490);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(localBrandLocationMenuCarouselContentModel, function1, i, 14);
        }
    }

    public static final void LocalBrandLocationMenuView(LocalBrandLocationMenuContentModel localBrandLocationMenuContentModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        LocalBrandLocationMenuContentModel.Menu menu;
        Object obj;
        Modifier.Companion companion;
        Object obj2;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1095377418);
        int i2 = i | (gapComposer2.changedInstance(localBrandLocationMenuContentModel) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            boolean z = localBrandLocationMenuContentModel.showMenuSelector;
            Object obj3 = localBrandLocationMenuContentModel.menus;
            LocalBrandLocationMenuContentModel.Menu menu2 = localBrandLocationMenuContentModel.selectedMenu;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Object obj4 = Composer.Companion.Empty;
            if (z) {
                gapComposer2.startReplaceGroup(-772661556);
                boolean changed = gapComposer2.changed(obj3);
                Object rememberedValue = gapComposer2.rememberedValue();
                Object obj5 = rememberedValue;
                if (changed || rememberedValue == obj4) {
                    ArrayList arrayList = new ArrayList();
                    for (LocalBrandLocationMenuContentModel.Menu menu3 : (Iterable) obj3) {
                        String str = menu3.token;
                        MenuSelectorOption menuSelectorOption = str != null ? new MenuSelectorOption(str, menu3.name, menu3.hours) : null;
                        if (menuSelectorOption != null) {
                            arrayList.add(menuSelectorOption);
                        }
                    }
                    gapComposer2.updateRememberedValue(arrayList);
                    obj5 = arrayList;
                }
                List list = (List) obj5;
                boolean z2 = list.size() > 1;
                boolean changed2 = gapComposer2.changed(menu2);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue2 == obj4) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str2 = ((MenuSelectorOption) obj2).token;
                        String str3 = menu2 != null ? menu2.token : null;
                        if (str3 == null ? false : Intrinsics.areEqual(str2, str3)) {
                            break;
                        }
                    }
                    rememberedValue2 = (MenuSelectorOption) obj2;
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                MenuSelectorOption menuSelectorOption2 = (MenuSelectorOption) rememberedValue2;
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion2, z2 ? 8.0f : 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                boolean z3 = (i2 & 896) == 256;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (z3 || rememberedValue3 == obj4) {
                    rememberedValue3 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(9, function1);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                companion = companion2;
                menu = menu2;
                obj = obj4;
                LocalMenuSelectorKt.LocalMenuSelector(m302paddingqDBjuR0$default, menuSelectorOption2, list, false, (Function0) rememberedValue3, true, gapComposer2, 196608, 8);
                re$$ExternalSyntheticOutline0.m(companion, 12.0f, gapComposer2, false);
            } else {
                menu = menu2;
                obj = obj4;
                companion = companion2;
                gapComposer2.startReplaceGroup(-771942728);
                gapComposer2.end(false);
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(function0);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer2.startReplaceGroup(-260957756);
            List list2 = menu != null ? menu.entries : null;
            if (list2 == null) {
                list2 = EmptyList.INSTANCE;
            }
            List list3 = list2;
            int size = list3.size();
            for (int i3 = 0; i3 < size; i3++) {
                LocalBrandLocationMenuContentModel.Entry entry = (LocalBrandLocationMenuContentModel.Entry) list3.get(i3);
                if (i3 > 0) {
                    gapComposer2.startReplaceGroup(-206967285);
                    ModalKt.HorizontalDivider(6, 0, gapComposer2, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2));
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-206886561);
                    gapComposer2.end(false);
                }
                CategoryEntryRow(menu, entry, function1, gapComposer2, i2 & 896);
            }
            gapComposer2.end(false);
            gapComposer2.end(true);
            Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, 16.0f, 16.0f, 24.0f);
            boolean changedInstance = gapComposer2.changedInstance(localBrandLocationMenuContentModel) | ((i2 & 896) == 256);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue4 == obj) {
                rememberedValue4 = new StatusRunnable$$ExternalSyntheticLambda1(28, function1, localBrandLocationMenuContentModel);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            coil3.size.SizeKt.Button((Function0) rememberedValue4, m301paddingqDBjuR0, null, false, false, null, lambda$76185853, gapComposer2, 1572864, 60);
            gapComposer = gapComposer2;
        } else {
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(localBrandLocationMenuContentModel, function1, i, 15);
        }
    }

    /* renamed from: LocalBrandLocationStatusRow-et4H-rQ, reason: not valid java name */
    public static final void m1314LocalBrandLocationStatusRowet4HrQ(Modifier modifier, LocationStatus locationStatus, TextStyle textStyle, Composer composer, int i, int i2) {
        TextStyle textStyle2;
        int i3;
        TextStyle textStyle3;
        Modifier modifier2;
        TextStyle textStyle4;
        long j;
        TextStyle textStyle5;
        locationStatus.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1002378764);
        Applier applier = gapComposer.applier;
        int i4 = i | 6 | (gapComposer.changedInstance(locationStatus) ? 32 : 16);
        int i5 = i4 | MLKEMEngine.KyberPolyBytes;
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 = i4 | 3456;
            textStyle2 = textStyle;
        } else {
            textStyle2 = textStyle;
            i3 = i5 | (gapComposer.changed(textStyle2) ? 2048 : 1024);
        }
        int i7 = i3 | 24576;
        if (gapComposer.shouldExecute(i7 & 1, (i7 & 9363) != 9362)) {
            if (i6 != 0) {
                textStyle2 = null;
            }
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            String label = locationStatus.getLabel();
            if (textStyle2 == null) {
                gapComposer.startReplaceGroup(1065376136);
                TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall, 0L, 0L, new FontWeight(500), null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211);
                gapComposer.end(false);
                textStyle4 = m994copyp1EtxEg$default;
            } else {
                gapComposer.startReplaceGroup(1065374710);
                gapComposer.end(false);
                textStyle4 = textStyle2;
            }
            gapComposer.startReplaceGroup(-1332985863);
            if ((locationStatus instanceof LocationStatus.Unknown) || (locationStatus instanceof LocationStatus.Open)) {
                gapComposer.startReplaceGroup(1065382061);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.text.success;
                gapComposer.end(false);
            } else {
                if (!(locationStatus instanceof LocationStatus.Closed) && !(locationStatus instanceof LocationStatus.TemporarilyDisabled)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1065379113, false);
                }
                gapComposer.startReplaceGroup(1065385485);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.text.warning;
                gapComposer.end(false);
            }
            long j2 = j;
            gapComposer.end(false);
            Room.m1165Text25TpFw(2, 1, 0, 0, 1769472, 0, 3986, j2, (Composer) gapComposer, (Modifier) null, textStyle4, (TextLineBalancing) null, label, (Map) null, (Function1) null, false);
            String description = locationStatus.getDescription();
            if (description == null || StringsKt.isBlank(description)) {
                gapComposer.startReplaceGroup(-1332325284);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1332628247);
                String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(!StringsKt.isBlank(locationStatus.getLabel()) ? " · " : "", locationStatus.getDescription());
                if (textStyle2 == null) {
                    gapComposer.startReplaceGroup(1065395055);
                    TextStyle textStyle6 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                    gapComposer.end(false);
                    textStyle5 = textStyle6;
                } else {
                    gapComposer.startReplaceGroup(1065393939);
                    gapComposer.end(false);
                    textStyle5 = textStyle2;
                }
                gapComposer.startReplaceGroup(1065397452);
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j3 = colors3.semantic.text.subtle;
                gapComposer.end(false);
                Room.m1165Text25TpFw(2, 1, 0, 0, 1769472, 0, 3986, j3, (Composer) gapComposer, (Modifier) null, textStyle5, (TextLineBalancing) null, m$1, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.startReplaceGroup(1454232576);
            gapComposer.end(false);
            gapComposer.end(true);
            textStyle3 = textStyle2;
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            textStyle3 = textStyle2;
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8(modifier2, locationStatus, textStyle3, i, i2);
        }
    }

    public static final void LocalBrandProfileCollapsedToolbar(Modifier modifier, float f, float f2, String str, LocalBrandProfileViewModel.MoreOptionsMenuModel moreOptionsMenuModel, Function1 function1, Composer composer, int i) {
        int i2;
        float f3;
        str.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2054003249);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(f) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            f3 = f2;
            i2 |= gapComposer.changed(f3) ? 256 : 128;
        } else {
            f3 = f2;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(moreOptionsMenuModel) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= gapComposer.changed(false) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SpacerKt.m302paddingqDBjuR0$default(SpacerKt.statusBarsPadding(ImageKt.m177backgroundbw27NRU(modifier, Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape)), RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 52.0f, RecyclerView.DECELERATION_RATE, 2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m279heightInVpY3zN4$default);
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
            RealSheetState realSheetState = (RealSheetState) gapComposer.consume(LocalGeoSellerSheetStateKt.LocalGeoSellerSheetState);
            AnimatedContentKt.AnimatedVisibility(realSheetState == null || realSheetState.getExpandProgress() >= 0.99f, (Modifier) null, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), (String) null, (Function3) Expect_jvmKt.rememberComposableLambda(-60941037, new BrandSheetViewKt$$ExternalSyntheticLambda6(3, function1), gapComposer), (Composer) gapComposer, 200064, 18);
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Room.m1165Text25TpFw(0, 1, 0, 3, ((i2 >> 9) & 14) | 1572864, 0, 3760, Strings.getColors(gapComposer).semantic.text.prominent, (Composer) gapComposer, AlphaKt.alpha(SpacerKt.m300paddingVpY3zN4$default(boxScopeInstance.align(companion, biasAlignment), 60.0f, RecyclerView.DECELERATION_RATE, 2), f < 0.1f ? 0.0f : f), Strings.getTypography(gapComposer).titleBarPageTitle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer = gapComposer;
            ToolbarActions(boxScopeInstance.align(companion, Alignment.Companion.CenterEnd), f, f3, moreOptionsMenuModel, function1, gapComposer, (i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION) | ((i2 >> 3) & 7168) | (57344 & (i2 >> 6)) | (i2 & 458752));
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SellerCardKt$$ExternalSyntheticLambda3(modifier, f, f2, str, moreOptionsMenuModel, function1, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    public static final void LocalBrandProfileSectionView(LocalBrandProfileSectionViewModel localBrandProfileSectionViewModel, Function1 function1, Composer composer, int i) {
        Function1 function12;
        int i2;
        Modifier.Companion companion;
        ?? r2;
        localBrandProfileSectionViewModel.getClass();
        String str = localBrandProfileSectionViewModel.title;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(238669720);
        int i3 = i | (gapComposer.changedInstance(localBrandProfileSectionViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (str != null) {
                gapComposer.startReplaceGroup(2038930776);
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion2, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
                str.getClass();
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                i2 = i3;
                companion = companion2;
                r2 = 0;
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.prominent, (Composer) gapComposer, m300paddingVpY3zN4$default, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                re$$ExternalSyntheticOutline0.m(companion, 12.0f, gapComposer, false);
            } else {
                i2 = i3;
                companion = companion2;
                r2 = 0;
                gapComposer.startReplaceGroup(2039194090);
                gapComposer.end(false);
            }
            LocalBrandProfileSectionContent localBrandProfileSectionContent = localBrandProfileSectionViewModel.content;
            if (localBrandProfileSectionContent instanceof LocalBrandLocationAddressContentModel) {
                gapComposer.startReplaceGroup(1728351582);
                function12 = function1;
                LocalBrandLocationAddressView(SizeKt.fillMaxWidth(companion, 1.0f), (LocalBrandLocationAddressContentModel) localBrandProfileSectionContent, function12, gapComposer, (i2 & 896) | 6);
                gapComposer.end(r2);
            } else {
                function12 = function1;
                int i4 = i2;
                if (localBrandProfileSectionContent instanceof LocalBrandLocationHoursContentModel) {
                    gapComposer.startReplaceGroup(1728357527);
                    LocalBrandLocationHoursView((LocalBrandLocationHoursContentModel) localBrandProfileSectionContent, function12, gapComposer, i4 & 910);
                    gapComposer.end(r2);
                } else if (localBrandProfileSectionContent instanceof LocalBrandLocationMenuContentModel) {
                    gapComposer.startReplaceGroup(1728361238);
                    LocalBrandLocationMenuView((LocalBrandLocationMenuContentModel) localBrandProfileSectionContent, function12, gapComposer, i4 & 910);
                    gapComposer.end(r2);
                } else if (localBrandProfileSectionContent instanceof LocalBrandLocationPhoneContentModel) {
                    gapComposer.startReplaceGroup(1728365152);
                    LocalBrandLocationPhoneContentModel localBrandLocationPhoneContentModel = (LocalBrandLocationPhoneContentModel) localBrandProfileSectionContent;
                    LocalMapKt.LocalPhoneRow(SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 20.0f, 2), new PhoneRowModel(localBrandLocationPhoneContentModel.phoneNumberLabel, localBrandLocationPhoneContentModel.phoneNumber), function12, gapComposer, ((i4 << 3) & 7168) | 390);
                    gapComposer.end(r2);
                } else if (localBrandProfileSectionContent instanceof LocalBrandLocationFooterContentModel) {
                    gapComposer.startReplaceGroup(1728374949);
                    LocalBrandLocationFooterView((LocalBrandLocationFooterContentModel) localBrandProfileSectionContent, gapComposer, r2);
                    gapComposer.end(r2);
                } else if (localBrandProfileSectionContent instanceof LocalBrandLocationMenuCarouselContentModel) {
                    gapComposer.startReplaceGroup(1728378366);
                    LocalBrandLocationMenuCarouselView((LocalBrandLocationMenuCarouselContentModel) localBrandProfileSectionContent, function12, gapComposer, i4 & 910);
                    gapComposer.end(r2);
                } else if (localBrandProfileSectionContent instanceof LocalBrandLocationMarketingMessagesContentModel) {
                    gapComposer.startReplaceGroup(1728382829);
                    LocalBrandLocationMarketingMessagesView((LocalBrandLocationMarketingMessagesContentModel) localBrandProfileSectionContent, function12, SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 24.0f, 2), gapComposer, ((i4 >> 3) & 112) | MLKEMEngine.KyberPolyBytes);
                    gapComposer.end(r2);
                } else {
                    Modifier.Companion companion3 = companion;
                    if (localBrandProfileSectionContent instanceof LocalBrandProfileViewModel.LoyaltyModel) {
                        gapComposer.startReplaceGroup(1728390439);
                        LocalBrandLocationLoyaltyView(SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion3, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 10), (LocalBrandProfileViewModel.LoyaltyModel) localBrandProfileSectionContent, gapComposer, 6);
                        gapComposer.end(r2);
                    } else {
                        if (!(localBrandProfileSectionContent instanceof LocalBrandDescriptionViewModel)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1728350115, (boolean) r2);
                        }
                        gapComposer.startReplaceGroup(1728396518);
                        LocalBrandDescriptionView(SizeKt.fillMaxWidth(companion3, 1.0f), (LocalBrandDescriptionViewModel) localBrandProfileSectionContent, gapComposer, 6);
                        gapComposer.end(r2);
                    }
                }
            }
        } else {
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(localBrandProfileSectionViewModel, function12, i, 16);
        }
    }

    public static final void LocalBrandProfileSheet(boolean z, Function0 function0, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(517298823);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i3 = 18;
            if (z) {
                gapComposer.startReplaceGroup(506752229);
                Updater.CompositionLocalProvider(SheetKt.LocalSheetInOverlayLayer.defaultProvidedValue$runtime(Boolean.TRUE), Expect_jvmKt.rememberComposableLambda(-601742260, new LocalMapKt$$ExternalSyntheticLambda9(i3, function0, composableLambdaImpl), gapComposer), gapComposer, 56);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(506904532);
                SheetKt.Sheet(function0, null, null, null, null, false, null, composableLambdaImpl, gapComposer, ((i2 >> 3) & 14) | ((i2 << 18) & 234881024), EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalBrandProfileViewKt$$ExternalSyntheticLambda10(z, function0, composableLambdaImpl, i, 0);
        }
    }

    public static final void LocalBrandProfileView(Modifier modifier, LocalBrandProfileViewModel localBrandProfileViewModel, boolean z, Function1 function1, Composer composer, int i) {
        int i2;
        localBrandProfileViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1228081524);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(localBrandProfileViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        int i3 = 0;
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (!(localBrandProfileViewModel instanceof LocalBrandProfileViewModel.Content)) {
                Handlers$$ExternalSyntheticBUOutline0.m(localBrandProfileViewModel, "LocalBrandProfileView doesn't support ");
                return;
            }
            LocalBrandProfileViewModel.Content content = (LocalBrandProfileViewModel.Content) localBrandProfileViewModel;
            LocalBrandProfileViewModel.Fulfillment fulfillment = content.fulfillment;
            LocalBrandProfileViewModel.Fulfillment.InStore inStore = fulfillment instanceof LocalBrandProfileViewModel.Fulfillment.InStore ? (LocalBrandProfileViewModel.Fulfillment.InStore) fulfillment : null;
            MapDecisionSheetModel mapDecisionSheetModel = content.mapDecisionSheet;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (mapDecisionSheetModel != null) {
                gapComposer.startReplaceGroup(-1244879085);
                boolean z2 = (i2 & 7168) == 2048;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z2 || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(11, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                LocalBrandProfileSheet(z, (Function0) rememberedValue, Expect_jvmKt.rememberComposableLambda(2083627784, new LocalBrandProfileViewKt$$ExternalSyntheticLambda1(localBrandProfileViewModel, function1, i3), gapComposer), gapComposer, ((i2 >> 6) & 14) | MLKEMEngine.KyberPolyBytes);
                gapComposer.end(false);
            } else if (!content.showCheckedInSheet || inStore == null) {
                gapComposer.startReplaceGroup(-1244082602);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1244460399);
                boolean z3 = (i2 & 7168) == 2048;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z3 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(15, function1);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                LocalBrandProfileSheet(z, (Function0) rememberedValue2, Expect_jvmKt.rememberComposableLambda(1314890865, new PagerDefaults$$ExternalSyntheticLambda0(23, inStore, function1), gapComposer), gapComposer, ((i2 >> 6) & 14) | MLKEMEngine.KyberPolyBytes);
                gapComposer.end(false);
            }
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(modifier, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxSize);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier wrapContentWidth$default = SizeKt.wrapContentWidth$default(columnScopeInstance.weight(1.0f, companion, true), null, 3);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopCenter, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, wrapContentWidth$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            int i4 = 2;
            LocalMapKt.m1317CollapsingHeaderScaffold_trzpw(SizeKt.fillMaxSize(companion, 1.0f), Expect_jvmKt.rememberComposableLambda(935533517, new LocalViewFactory$$ExternalSyntheticLambda4(4, localBrandProfileViewModel, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(941208964, new CartBannerViewKt$$ExternalSyntheticLambda2(localBrandProfileViewModel, i4), gapComposer), Expect_jvmKt.rememberComposableLambda(1184103265, new LocalBrandProfileViewKt$$ExternalSyntheticLambda1(localBrandProfileViewModel, function1, i4), gapComposer), CollapsingToolbarKt.rememberCollapsingToolbarScaffoldState(gapComposer), gapComposer, 25014);
            Modifier align = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter);
            Unit unit = Unit.INSTANCE;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = LocalBrandProfileViewKt$LocalBrandProfileView$6$1$4$1.INSTANCE;
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(align, unit, (PointerInputEventHandler) rememberedValue3);
            RealSheetState realSheetState = (RealSheetState) gapComposer.consume(LocalGeoSellerSheetStateKt.LocalGeoSellerSheetState);
            AnimatedContentKt.AnimatedVisibility(columnScopeInstance, realSheetState == null || realSheetState.getExpandProgress() >= 0.99f, pointerInput, EnterExitTransitionKt.fadeIn$default(null, 3), EnterExitTransitionKt.fadeOut$default(null, 3), null, Expect_jvmKt.rememberComposableLambda(-122360608, new LocalBrandProfileViewKt$$ExternalSyntheticLambda1(localBrandProfileViewModel, function1, 3), gapComposer), gapComposer, 1600518, 16);
            gapComposer = gapComposer;
            gapComposer.end(true);
            gapComposer.end(true);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(modifier, localBrandProfileViewModel, z, function1, i, 2);
        }
    }

    public static final void LocalProfileLocationFulfillmentRow(LocalBrandProfileViewModel.Content content, Function1 function1, Composer composer, int i) {
        Modifier.Companion companion;
        boolean z;
        boolean z2;
        LocalText localText;
        String str;
        String str2;
        Function1 function12 = function1;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-858151178);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changedInstance(content) ? 4 : 2) | i | (gapComposer.changedInstance(function12) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, companion2);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14, 1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Center, Alignment.Companion.Start, gapComposer, 6);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m);
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
            LocationStatus locationStatus = content.locationStatus;
            LocalBrandProfileViewModel.Fulfillment fulfillment = content.fulfillment;
            boolean z3 = fulfillment instanceof LocalBrandProfileViewModel.Fulfillment.InStore;
            if (z3) {
                gapComposer.startReplaceGroup(-316658824);
                z2 = true;
                z = false;
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyMedium, 0L, 0L, new FontWeight(500), null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211), (TextLineBalancing) null, ((LocalBrandProfileViewModel.Fulfillment.InStore) fulfillment).title, (Map) null, (Function1) null, false);
                companion = companion2;
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion2, 16.0f, 2.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8), Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_in_store_for_here), (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                companion = companion2;
                if (fulfillment instanceof LocalBrandProfileViewModel.Fulfillment.Configured) {
                    gapComposer.startReplaceGroup(-316029617);
                    if ((locationStatus instanceof LocationStatus.TemporarilyDisabled) || (locationStatus instanceof LocationStatus.Closed) || (localText = ((LocalBrandProfileViewModel.Fulfillment.Configured) fulfillment).getEstimatedCompletionTime()) == null || (str2 = localText.text) == null || StringsKt.isBlank(str2)) {
                        localText = null;
                    }
                    LocalBrandProfileViewModel.Fulfillment.Delivery delivery = fulfillment instanceof LocalBrandProfileViewModel.Fulfillment.Delivery ? (LocalBrandProfileViewModel.Fulfillment.Delivery) fulfillment : null;
                    String str3 = delivery != null ? delivery.freeDeliveryThresholdLabel : null;
                    TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyMedium, 0L, 0L, new FontWeight(500), null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211);
                    if (str3 != null) {
                        gapComposer.startReplaceGroup(-315581946);
                        if (localText == null || (str = localText.text) == null) {
                            str = str3;
                        }
                        if (localText == null) {
                            str3 = null;
                        }
                        LocalMapKt.m1316AnimatedAlternatingTextuDo3WH8(str, str3, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), Strings.getColors(gapComposer).semantic.text.standard, m994copyp1EtxEg$default, gapComposer, MLKEMEngine.KyberPolyBytes);
                        gapComposer.end(false);
                        z = false;
                        z2 = true;
                    } else if (localText != null) {
                        gapComposer.startReplaceGroup(-315192741);
                        z = false;
                        z2 = true;
                        Room.m1164Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), LocalViewsKt.toAnnotatedString(localText, gapComposer), m994copyp1EtxEg$default, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                        gapComposer = gapComposer;
                        gapComposer.end(false);
                    } else {
                        z = false;
                        z2 = true;
                        gapComposer.startReplaceGroup(-314941114);
                        gapComposer.end(false);
                    }
                    gapComposer.end(z);
                } else {
                    z = false;
                    z2 = true;
                    gapComposer.startReplaceGroup(-1257084480);
                    gapComposer.end(false);
                }
            }
            if (z3) {
                gapComposer.startReplaceGroup(-313726906);
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(-314830134);
                String stringResource = Room.stringResource(gapComposer, R.string.local_views_in_store_for_here);
                if (fulfillment instanceof LocalBrandProfileViewModel.Fulfillment.Configured) {
                    stringResource = ((LocalBrandProfileViewModel.Fulfillment.Configured) fulfillment).getAddress();
                } else if (!z3) {
                    stringResource = null;
                }
                String label = z3 ? null : locationStatus.getLabel();
                GapComposer gapComposer2 = gapComposer;
                coil3.size.SizeKt.AdaptiveStack(SpacerKt.m302paddingqDBjuR0$default(companion, 16.0f, 2.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8), null, null, null, null, null, Expect_jvmKt.rememberComposableLambda(1143226512, new PagerDefaults$$ExternalSyntheticLambda0(22, new FulfillmentRowSecondaryLine(stringResource, label, (stringResource == null || label == null) ? "" : ((locationStatus instanceof LocationStatus.Open) || (locationStatus instanceof LocationStatus.Closed)) ? " · " : " "), locationStatus), gapComposer), gapComposer2, 1572870, 62);
                gapComposer = gapComposer2;
                gapComposer.end(z);
            }
            gapComposer.end(z2);
            function12 = function1;
            LoyaltySheetKt.m1331FulfillmentOptionsMenuIBZrmw(null, function12, content.fulfillmentOptionsMenuModel, (Float.floatToRawIntBits(-16.0f) << 32) | (Float.floatToRawIntBits(8.0f) & BodyPartID.bodyIdMax), gapComposer, (i2 & 112) | 3072);
            gapComposer.end(z2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(content, function12, i, 17);
        }
    }

    public static final void MoreOptionsDropdownMenu(Modifier modifier, Function1 function1, LocalBrandProfileViewModel.MoreOptionsMenuModel moreOptionsMenuModel, Composer composer, int i, int i2) {
        int i3;
        ListBuilder listBuilder;
        boolean z;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(73414812);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(moreOptionsMenuModel) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= gapComposer.changed(false) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z2 = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new GestureNodeKt$$ExternalSyntheticLambda0(24, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function12 = (Function1) rememberedValue;
            gapComposer.startReplaceGroup(1832175514);
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            BrandFollowViewModel brandFollowViewModel = moreOptionsMenuModel.addRemoveState;
            if (Intrinsics.areEqual(brandFollowViewModel, BrandFollowViewModel.None.INSTANCE)) {
                gapComposer.startReplaceGroup(419010440);
                gapComposer.end(false);
                listBuilder = createListBuilder;
            } else {
                boolean areEqual = Intrinsics.areEqual(brandFollowViewModel, BrandFollowViewModel.Add.INSTANCE);
                LocalDropdownItemModel.IconState iconState = LocalDropdownItemModel.IconState.Loading.INSTANCE;
                if (areEqual || Intrinsics.areEqual(brandFollowViewModel, BrandFollowViewModel.Adding.INSTANCE)) {
                    listBuilder = createListBuilder;
                    gapComposer.startReplaceGroup(104471137);
                    String stringResource = Room.stringResource(gapComposer, R.string.local_views_add);
                    if (!(brandFollowViewModel instanceof BrandFollowViewModel.Adding)) {
                        iconState = new LocalDropdownItemModel.IconState.WithIcon(Icons.AddFill24);
                    }
                    boolean changed = gapComposer.changed(function12);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(16, function12);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    listBuilder.add(new LocalDropdownItemModel(stringResource, iconState, (Function0) rememberedValue2, 2));
                    gapComposer.end(false);
                } else {
                    if (!Intrinsics.areEqual(brandFollowViewModel, BrandFollowViewModel.Remove.INSTANCE) && !Intrinsics.areEqual(brandFollowViewModel, BrandFollowViewModel.Removing.INSTANCE)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 419009349, false);
                    }
                    gapComposer.startReplaceGroup(104836410);
                    String stringResource2 = Room.stringResource(gapComposer, R.string.local_views_remove);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Colors.Semantic.Text text = colors.semantic.text;
                    listBuilder = createListBuilder;
                    Color color = new Color(text.danger);
                    if (brandFollowViewModel instanceof BrandFollowViewModel.Removing) {
                        gapComposer.startReplaceGroup(105095725);
                    } else {
                        gapComposer.startReplaceGroup(105155276);
                        Icons icons = Icons.SubtractOutline24;
                        Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        iconState = new LocalDropdownItemModel.IconState.WithIcon(icons, new Color(colors2.semantic.icon.danger));
                    }
                    gapComposer.end(false);
                    boolean changed2 = gapComposer.changed(function12);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(17, function12);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    listBuilder.add(new LocalDropdownItemModel(stringResource2, color, iconState, (Function0) rememberedValue3));
                    gapComposer.end(false);
                }
            }
            if (moreOptionsMenuModel.showShareProfileOption) {
                gapComposer.startReplaceGroup(105548387);
                String stringResource3 = Room.stringResource(gapComposer, R.string.local_views_more_options_share_profile);
                LocalDropdownItemModel.IconState.WithIcon withIcon = new LocalDropdownItemModel.IconState.WithIcon(Icons.ShareAndroid24);
                boolean changed3 = gapComposer.changed(function12);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed3 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(18, function12);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                listBuilder.add(new LocalDropdownItemModel(stringResource3, withIcon, (Function0) rememberedValue4, 2));
                z = false;
                gapComposer.end(false);
            } else {
                z = false;
                gapComposer.startReplaceGroup(105820350);
                gapComposer.end(false);
            }
            ListBuilder build = CollectionsKt__CollectionsJVMKt.build(listBuilder);
            gapComposer.end(z);
            LocalDropdownItemKt.m1326LocalDropdownMenu4kj_NE(SizeKt.m279heightInVpY3zN4$default(SizeKt.m292widthInVpY3zN4$default(modifier, 48.0f, RecyclerView.DECELERATION_RATE, 2), 52.0f, RecyclerView.DECELERATION_RATE, 2), lambda$85541028, Tags.toImmutableList(build), 0L, false, true, false, gapComposer, ((i3 << 9) & 3670016) | 196656, 24);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(modifier, function1, moreOptionsMenuModel, i, i2, 3);
        }
    }

    public static final void MoreOptionsInlineView(Modifier modifier, Function1 function1, LocalBrandProfileViewModel.MoreOptionsMenuModel moreOptionsMenuModel, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-855771392);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(moreOptionsMenuModel) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            BrandFollowViewModel brandFollowViewModel = moreOptionsMenuModel.addRemoveState;
            if (Intrinsics.areEqual(brandFollowViewModel, BrandFollowViewModel.None.INSTANCE)) {
                gapComposer.startReplaceGroup(-1715085282);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1715163123);
                AddRemoveButton(brandFollowViewModel, function1, gapComposer, i2 & 112);
                gapComposer.end(false);
            }
            if (moreOptionsMenuModel.showShareProfileOption) {
                gapComposer.startReplaceGroup(-1715012742);
                Icons icons = Icons.ShareAndroid24;
                String stringResource = Room.stringResource(gapComposer, R.string.local_views_more_options_share_profile);
                boolean z = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(19, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                StorageUtil.ButtonIcon(icons, stringResource, (Function0) rememberedValue, null, false, null, gapComposer, 6, 56);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1714824386);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8(modifier, function1, moreOptionsMenuModel, i, 25);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00c8, code lost:
    
        if (r10 != null) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ca, code lost:
    
        r10 = r10.srgb;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00cd, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00dc, code lost:
    
        if (r10 != null) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ProfileAvatar(LocalBrandProfileViewModel.Fulfillment.InStore inStore, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        Color.ModeVariant modeVariant;
        String str;
        String str2;
        Integer safeParseColor;
        int i4;
        androidx.compose.ui.graphics.Color color;
        long j;
        long j2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1245960322);
        if ((i & 6) == 0) {
            i3 = i | (gapComposer.changedInstance(inStore) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 32 : 16;
            int i6 = 1;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) == 18)) {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                String str3 = inStore.customerProfilePhotoUrl;
                if (str3 == null || StringsKt.isBlank(str3)) {
                    str3 = null;
                }
                Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
                Modifier modifier5 = modifier4;
                AvatarSize avatarSize = AvatarSize.Size48;
                int mo230roundToPx0680j_4 = density.mo230roundToPx0680j_4(avatarSize.size);
                String str4 = inStore.customerProfileMonogram;
                if (str4 == null) {
                    str4 = "";
                }
                if (str3 != null) {
                    gapComposer.startReplaceGroup(1296982525);
                    gapComposer.end(false);
                    j2 = androidx.compose.ui.graphics.Color.Transparent;
                    i4 = mo230roundToPx0680j_4;
                } else {
                    gapComposer.startReplaceGroup(1297035783);
                    com.squareup.protos.cash.ui.Color color2 = inStore.customerProfileBackgroundColor;
                    if (color2 == null) {
                        gapComposer.startReplaceGroup(1297076175);
                        gapComposer.end(false);
                        i4 = mo230roundToPx0680j_4;
                        color = null;
                    } else {
                        gapComposer.startReplaceGroup(-927990158);
                        float f = LocalViewsKt.CloseToWhiteBackgroundBorderWidth;
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        if (colors.isLight) {
                            modeVariant = color2.light;
                        } else {
                            Color.ModeVariant modeVariant2 = color2.dark;
                            if (modeVariant2 == null || (str = modeVariant2.srgb) == null) {
                                modeVariant = color2.light;
                            } else {
                                str2 = str;
                            }
                        }
                        if (str2 == null) {
                            gapComposer.startReplaceGroup(-1078676783);
                            gapComposer.end(false);
                            safeParseColor = null;
                        } else {
                            gapComposer.startReplaceGroup(1350677296);
                            Timber.Forest forest = Timber.Forest;
                            Object rememberedValue = gapComposer.rememberedValue();
                            if (rememberedValue == Composer.Companion.Empty) {
                                NetworkFetcher$fetch$2 networkFetcher$fetch$2 = new NetworkFetcher$fetch$2(1, forest, Timber.Forest.class, "e", "e(Ljava/lang/Throwable;)V", 0, 11);
                                gapComposer.updateRememberedValue(networkFetcher$fetch$2);
                                rememberedValue = networkFetcher$fetch$2;
                            }
                            safeParseColor = com.squareup.util.android.StringsKt.safeParseColor(str2, (Function1) ((KFunction) rememberedValue));
                            gapComposer.end(false);
                        }
                        if (safeParseColor != null) {
                            i4 = mo230roundToPx0680j_4;
                            color = new androidx.compose.ui.graphics.Color(ColorKt.Color(safeParseColor.intValue()));
                        } else {
                            i4 = mo230roundToPx0680j_4;
                            color = null;
                        }
                        gapComposer.end(false);
                    }
                    if (color == null) {
                        gapComposer.startReplaceGroup(-927987958);
                        Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j = colors2.semantic.background.standard;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-927991461);
                        gapComposer.end(false);
                        j = color.value;
                    }
                    j2 = j;
                    gapComposer.end(false);
                }
                TextViewKt.m3613AvatarB_rZmmc(avatarSize, str4, j2, (String) null, modifier5, (AvatarImage) (str3 != null ? new AvatarImage.Remote.Image(str3, false, null, 0L, new ClusterItemKt$$ExternalSyntheticLambda1(str3, i4, i6), 54) : null), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer, ((i3 << 9) & 57344) | 3078, 0, 1984);
                modifier3 = modifier5;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new PlayerSurfaceKt$$ExternalSyntheticLambda2(inStore, modifier3, i, i2, 2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        int i62 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) == 18)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: SettledCheckedInHeaderLayout-TN_CM5M, reason: not valid java name */
    public static final void m1315SettledCheckedInHeaderLayoutTN_CM5M(String str, String str2, LocalBrandProfileViewModel.Fulfillment.InStore inStore, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1415690214);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(str2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(16.0f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(inStore) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion);
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
            int i3 = i2;
            Room.m1165Text25TpFw(0, 0, 0, 0, i2 & 14, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).header, 0L, 0L, FontWeight.Normal, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211), (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 2, 0, 3, ((i3 >> 3) & 14) | 1572864, 0, 3762, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 16.0f));
            ProfileAvatar(inStore, null, gapComposer, (i3 >> 9) & 14, 2);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(str, str2, inStore, modifier, i, 9);
        }
    }

    public static final void ToolbarActions(Modifier modifier, float f, float f2, LocalBrandProfileViewModel.MoreOptionsMenuModel moreOptionsMenuModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1594007075);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(f) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(moreOptionsMenuModel) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(false) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            float f3 = f2 < 0.1f ? RecyclerView.DECELERATION_RATE : f2;
            float f4 = f < 0.1f ? RecyclerView.DECELERATION_RATE : f;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.CenterEnd, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            int i3 = (i2 >> 12) & 112;
            int i4 = i2 >> 3;
            int i5 = i3 | (i4 & 896);
            MoreOptionsInlineView(ZIndexModifierKt.zIndex(AlphaKt.alpha(SpacerKt.m300paddingVpY3zN4$default(companion, 8.0f, RecyclerView.DECELERATION_RATE, 2), f3), f3 >= f4 ? 1.0f : RecyclerView.DECELERATION_RATE), function1, moreOptionsMenuModel, gapComposer, i5);
            MoreOptionsDropdownMenu(ZIndexModifierKt.zIndex(AlphaKt.alpha(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), f4), f4 < f3 ? 0.0f : 1.0f), function1, moreOptionsMenuModel, gapComposer, (i4 & 7168) | i5, 0);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PaymentDeviceCustomizationViewKt$$ExternalSyntheticLambda41(modifier, f, f2, moreOptionsMenuModel, function1, i, 1);
        }
    }

    public static final Object access$delayWithMotionScale(long j, RealOffersDetailsStateManager$states$1$1 realOffersDetailsStateManager$states$1$1) {
        Object delay;
        MotionDurationScale motionDurationScale = (MotionDurationScale) realOffersDetailsStateManager$states$1$1.getContext().get(Alignment.Companion.$$INSTANCE);
        float scaleFactor = motionDurationScale != null ? motionDurationScale.getScaleFactor() : 1.0f;
        return (scaleFactor != RecyclerView.DECELERATION_RATE && (delay = JobKt.delay(MathKt__MathJVMKt.roundToLong((double) (((float) j) * scaleFactor)), realOffersDetailsStateManager$states$1$1)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? delay : Unit.INSTANCE;
    }

    public static final boolean isAtLeast(CheckedInSheetAnimationStage checkedInSheetAnimationStage, CheckedInSheetAnimationStage checkedInSheetAnimationStage2) {
        return checkedInSheetAnimationStage.ordinal() >= checkedInSheetAnimationStage2.ordinal();
    }
}
