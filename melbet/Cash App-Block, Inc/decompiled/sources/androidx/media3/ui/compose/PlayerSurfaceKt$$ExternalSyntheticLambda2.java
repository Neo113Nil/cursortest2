package androidx.media3.ui.compose;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.SimpleDropShadowElement;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.shadow.Shadow;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ChromeSystemIconColor;
import app.cash.local.viewmodels.KeyValue;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.views.brand.profile.LocalBrandLocationRowKt;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.wallet.AddRemoveStateDialogModel;
import app.cash.molecule.PlatformKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzie;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewModel;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewPagerViewModel;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.mooncake.components.MooncakeLargeIcon;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.LoadingIndicatorPosition;
import com.squareup.cash.offers.viewmodels.OffersHomeViewModelV2;
import com.squareup.cash.offers.views.home.OfferTileKt;
import com.squareup.cash.pools.viewmodels.PoolCategory;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.shopping.viewmodels.PaykitInfoToastViewModel;
import com.squareup.cash.shopping.views.ShopErrorKt;
import com.squareup.cash.support.viewmodels.SupportDisputeTrackerViewModel;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.util.Strings;
import com.stripe.android.model.parsers.TokenJsonParser;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.collections.immutable.ImmutableList;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes3.dex */
public final /* synthetic */ class PlayerSurfaceKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ int f$3;

    public /* synthetic */ PlayerSurfaceKt$$ExternalSyntheticLambda2(AddRemoveStateDialogModel addRemoveStateDialogModel, int i, int i2, Icons icons) {
        this.$r8$classId = 4;
        this.f$0 = addRemoveStateDialogModel;
        this.f$2 = i;
        this.f$3 = i2;
        this.f$1 = icons;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Modifier.Companion companion;
        int i = this.$r8$classId;
        int i2 = this.f$3;
        int i3 = this.f$2;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                PlayerSurfaceKt.PlayerSurface((ExoPlayer) obj4, (Modifier) obj3, i3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                ChromeConfigKt.ChromeConfig((ChromeSystemIconColor) obj4, (Boolean) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), i2);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                LocalBrandLocationRowKt.ProfileAvatar((LocalBrandProfileViewModel.Fulfillment.InStore) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), i2);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                LocalMapKt.KeyValueRow((Modifier) obj3, (KeyValue) obj4, (Composer) obj, Updater.updateChangedFlags(i3 | 1), i2);
                return Unit.INSTANCE;
            case 4:
                AddRemoveStateDialogModel addRemoveStateDialogModel = (AddRemoveStateDialogModel) obj4;
                Icons icons = (Icons) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
                Applier applier = gapComposer.applier;
                if (shouldExecute) {
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion2, 16.0f);
                    BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
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
                    Modifier m290width3ABfNKs = SizeKt.m290width3ABfNKs(companion2, 260.0f);
                    Strings.getSizes(gapComposer).getClass();
                    Object obj5 = DefaultSizes.border.entries;
                    Modifier then = m290width3ABfNKs.then(new SimpleDropShadowElement(RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f), new Shadow(12.0f, Color.m675copywmQWz5c$default(0.16f, Strings.getColors(gapComposer).base.constantBlack, 14), RecyclerView.DECELERATION_RATE, (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), RecyclerView.DECELERATION_RATE, 48)));
                    Strings.getSizes(gapComposer).getClass();
                    Modifier clip = ClipKt.clip(then, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
                    long j = Strings.getColors(gapComposer).component.modal.background;
                    RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, j, rectangleShapeKt$RectangleShape$1);
                    long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(0.2f, Strings.getColors(gapComposer).semantic.text.standard, 14);
                    Strings.getSizes(gapComposer).getClass();
                    Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(ImageKt.m178borderxT4_qwU(m177backgroundbw27NRU, 1.0f, m675copywmQWz5c$default, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), 32.0f, 36.0f, 32.0f, 24.0f);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m301paddingqDBjuR0);
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
                    String str = addRemoveStateDialogModel.locationArtwork;
                    if (str == null) {
                        gapComposer.startReplaceGroup(-2003405876);
                        gapComposer.end(false);
                        companion = companion2;
                    } else {
                        gapComposer.startReplaceGroup(-2003405875);
                        companion = companion2;
                        Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 10.0f, 7), 80.0f, 96.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m287sizeVpY3zN4);
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
                        Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(ImageKt.m178borderxT4_qwU(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m287sizeVpY3zN4(companion, 64.0f, 80.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), LocalViewsKt.toComposeColor(addRemoveStateDialogModel.backgroundColor, gapComposer, 0), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), 1.0f, Color.m675copywmQWz5c$default(0.1f, Strings.getColors(gapComposer).semantic.text.standard, 14), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), RecyclerView.DECELERATION_RATE, 10.0f, 1);
                        BiasAlignment biasAlignment2 = Alignment.Companion.Center;
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        LocalMapKt.LocalAsyncImage(boxScopeInstance.align(m300paddingVpY3zN4$default, biasAlignment2), null, str, ContentScale.Companion.Fit, biasAlignment2, null, null, gapComposer, 27648, 98);
                        Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(boxScopeInstance.align(companion, Alignment.Companion.TopEnd), 28.0f);
                        RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
                        Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(ImageKt.m177backgroundbw27NRU(ClipKt.clip(m285size3ABfNKs, roundedCornerShape), Strings.getColors(gapComposer).component.button.standard.background.f163default, rectangleShapeKt$RectangleShape$1), 2.0f, Color.m675copywmQWz5c$default(0.1f, Strings.getColors(gapComposer).semantic.text.standard, 14), roundedCornerShape);
                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment2, false);
                        int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m178borderxT4_qwU);
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
                        Trace.m1191Iconww6aTOc(icons, (String) null, SizeKt.m285size3ABfNKs(companion, 12.0f), Strings.getColors(gapComposer).semantic.icon.standard, gapComposer, 432, 0);
                        Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, true, false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7), Strings.getTypography(gapComposer).sectionTitle, (TextLineBalancing) null, Room.stringResource(gapComposer, i3), (Map) null, (Function1) null, false);
                    Room.m1165Text25TpFw(0, 0, 0, 3, 48, 0, 3824, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, SizeKt.fillMaxWidth(companion, 1.0f), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, i2), (Map) null, (Function1) null, false);
                    gapComposer.end(true);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).intValue();
                ModalKt.Segments((ImmutableList) obj4, i3, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                ListOrderedKt.ListOrderedStandard((Modifier) obj3, (ImmutableList) obj4, (Composer) obj, Updater.updateChangedFlags(1 | i3), i2);
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).intValue();
                zzie.HandleStateRestoration(i3, (EducationStoryViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).intValue();
                TokenJsonParser.EducationStoryViewPagerContent(i3, (EducationStoryViewPagerViewModel) obj4, (ColorModel) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                SharedUIKt.InstalledAppletTileHeader((InstalledAppletTileHeaderModel) obj4, (Function2) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i3), i2);
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                SharedUIKt.AppletTileRow((Modifier) obj3, (Function3) obj4, (Composer) obj, Updater.updateChangedFlags(1 | i3), i2);
                return Unit.INSTANCE;
            case 11:
                ((Integer) obj2).getClass();
                TransactorKt.LoadingPlaceholder((Modifier) obj3, (LoadingIndicatorPosition) obj4, (Composer) obj, Updater.updateChangedFlags(1 | i3), i2);
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                KeypadKt.MooncakeLargeIcon((MooncakeLargeIcon.Icon) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i3), i2);
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).intValue();
                OfferTileKt.OffersSection((OffersHomeViewModelV2.Loaded.OffersSection) obj4, i3, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i2));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                PoolToastKt.NoPoolsPlaceholder((PoolCategory) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i3), i2);
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ShopErrorKt.CashAppPayInfoToast((Modifier) obj3, (PaykitInfoToastViewModel) obj4, (Composer) obj, Updater.updateChangedFlags(1 | i3), i2);
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                ScreenshotReviewViewKt.DisputesTracker((SupportDisputeTrackerViewModel) obj4, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i3), i2);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                UtilsKt.CompactRender((CardSchemeViewModel.Module.Accessory.Button) obj4, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1 | i3), i2);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ PlayerSurfaceKt$$ExternalSyntheticLambda2(int i, Object obj, Object obj2, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$2 = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = i2;
    }

    public /* synthetic */ PlayerSurfaceKt$$ExternalSyntheticLambda2(Modifier modifier, Object obj, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$1 = modifier;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$3 = i2;
    }

    public /* synthetic */ PlayerSurfaceKt$$ExternalSyntheticLambda2(int i, int i2, int i3, Object obj, Function1 function1) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = function1;
        this.f$3 = i2;
    }

    public /* synthetic */ PlayerSurfaceKt$$ExternalSyntheticLambda2(Object obj, Object obj2, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = i;
        this.f$3 = i2;
    }
}
