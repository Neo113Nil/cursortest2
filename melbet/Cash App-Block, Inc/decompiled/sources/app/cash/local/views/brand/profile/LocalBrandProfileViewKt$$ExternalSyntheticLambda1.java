package app.cash.local.views.brand.profile;

import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.viewmodels.LocalBottomModalViewModel;
import app.cash.local.viewmodels.LocalBrandBannerModel;
import app.cash.local.viewmodels.LocalBrandProfileSectionViewModel;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.viewmodels.sheet.MapDecisionSheetModel;
import app.cash.local.viewmodels.toasts.ToastData;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldScopeInstance;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalBrandProfileViewKt$$ExternalSyntheticLambda1 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalBrandProfileViewModel f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ LocalBrandProfileViewKt$$ExternalSyntheticLambda1(LocalBrandProfileViewModel localBrandProfileViewModel, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = localBrandProfileViewModel;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        float f;
        GapComposer gapComposer;
        Composer composer;
        GapComposer gapComposer2;
        Composer composer2;
        int i = this.$r8$classId;
        Function1 function1 = this.f$1;
        LocalBrandProfileViewModel localBrandProfileViewModel = this.f$0;
        switch (i) {
            case 0:
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer3 = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer3).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Modifier padding = SpacerKt.padding(Modifier.Companion.$$INSTANCE, paddingValues);
                    MapDecisionSheetModel mapDecisionSheetModel = ((LocalBrandProfileViewModel.Content) localBrandProfileViewModel).mapDecisionSheet;
                    mapDecisionSheetModel.getClass();
                    LocalBrandLocationRowKt.LocalBrandLocationMapDecisionSheet(padding, mapDecisionSheetModel, function1, gapComposer3, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                Modifier modifier = (Modifier) obj;
                Composer composer4 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                modifier.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer4).changed(modifier) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    LocalAddBrandsViewKt.LocalBrandProfileComposeUi(modifier, this.f$0, false, this.f$1, gapComposer4, intValue2 & 14, 4);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                Composer composer5 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((CollapsingToolbarScaffoldScopeInstance) obj).getClass();
                ScrollState rememberScrollState = ImageKt.rememberScrollState(composer5);
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion, rememberScrollState, false, 14);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer5, 0);
                GapComposer gapComposer5 = (GapComposer) composer5;
                int hashCode = Long.hashCode(gapComposer5.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer5.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer5, verticalScroll$default);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer6.startReusableNode();
                if (gapComposer6.inserting) {
                    gapComposer6.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer6.useNode();
                }
                Updater.m576setimpl(composer5, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer5, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer5, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer5, materializeModifier, ComposeUiNode.Companion.SetModifier);
                float f2 = 16.0f;
                ModalKt.HorizontalDivider(0, 0, composer5, SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 24.0f));
                LocalBrandProfileViewModel.Content content = (LocalBrandProfileViewModel.Content) localBrandProfileViewModel;
                LocalBrandLocationRowKt.LocalProfileLocationFulfillmentRow(content, function1, composer5, 0);
                ModalKt.HorizontalDivider(0, 0, composer5, SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 24.0f));
                gapComposer6.startReplaceGroup(-1479317844);
                List list = content.sections;
                int size = list.size();
                int i2 = 0;
                while (i2 < size) {
                    LocalBrandProfileSectionViewModel localBrandProfileSectionViewModel = (LocalBrandProfileSectionViewModel) list.get(i2);
                    if (i2 > 0) {
                        gapComposer6.startReplaceGroup(457133774);
                        float f3 = f2;
                        GapComposer gapComposer7 = gapComposer6;
                        f = f2;
                        gapComposer = gapComposer7;
                        ModalKt.HorizontalDivider(6, 0, composer5, SpacerKt.m302paddingqDBjuR0$default(companion, f, RecyclerView.DECELERATION_RATE, f3, 24.0f, 2));
                        gapComposer.end(false);
                    } else {
                        GapComposer gapComposer8 = gapComposer6;
                        f = f2;
                        gapComposer = gapComposer8;
                        gapComposer.startReplaceGroup(457287534);
                        gapComposer.end(false);
                    }
                    LocalBrandLocationRowKt.LocalBrandProfileSectionView(localBrandProfileSectionViewModel, function1, composer5, 6);
                    i2++;
                    float f4 = f;
                    gapComposer6 = gapComposer;
                    f2 = f4;
                }
                GapComposer gapComposer9 = gapComposer6;
                gapComposer9.end(false);
                SpacerKt.Spacer(composer5, SizeKt.m277height3ABfNKs(companion, 84.0f));
                gapComposer9.end(true);
                return Unit.INSTANCE;
            default:
                Composer composer6 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer6, 0);
                GapComposer gapComposer10 = (GapComposer) composer6;
                int hashCode2 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer10.currentCompositionLocalScope();
                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                Modifier materializeModifier2 = PlatformKt.materializeModifier(composer6, companion2);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer11 = (GapComposer) composer6;
                if (gapComposer11.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer11.startReusableNode();
                if (gapComposer11.inserting) {
                    gapComposer11.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer11.useNode();
                }
                Updater.m576setimpl(composer6, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer6, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer6, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer6, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer6, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                LocalBrandProfileViewModel.Content content2 = (LocalBrandProfileViewModel.Content) localBrandProfileViewModel;
                boolean z = content2.showOfferAppliedToast;
                Function1 function12 = this.f$1;
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (z) {
                    gapComposer11.startReplaceGroup(1803059500);
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion2, 16.0f);
                    String stringResource = Room.stringResource(composer6, R.string.local_views_coupon_applied_at_checkout_toast);
                    ComposableLambdaImpl composableLambdaImpl = LocalBrandLocationRowKt.lambda$597848072;
                    boolean changed = gapComposer11.changed(function12);
                    Object rememberedValue = gapComposer11.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(12, function12);
                        gapComposer11.updateRememberedValue(rememberedValue);
                    }
                    Function0 function0 = (Function0) rememberedValue;
                    Duration.Companion companion3 = Duration.Companion;
                    gapComposer2 = gapComposer11;
                    ModalKt.m3381ToastBAHpl2s(m298padding3ABfNKs, "offer_applied_toast", stringResource, composableLambdaImpl, null, function0, new Duration(DurationKt.toDuration(3, DurationUnit.SECONDS)), composer6, 3126, EnumC0170g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE);
                    composer = composer6;
                    gapComposer2.end(false);
                } else {
                    composer = composer6;
                    gapComposer2 = gapComposer11;
                    gapComposer2.startReplaceGroup(1803459276);
                    gapComposer2.end(false);
                }
                String str = content2.invalidCouponToast;
                if (str == null) {
                    gapComposer2.startReplaceGroup(1803507263);
                    gapComposer2.end(false);
                    composer2 = composer;
                } else {
                    gapComposer2.startReplaceGroup(1803507264);
                    Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(companion2, 16.0f);
                    String stringResource2 = Room.stringResource(R.string.local_views_invalid_coupon_toast, new Object[]{str}, composer);
                    boolean changed2 = gapComposer2.changed(function12);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(13, function12);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Duration.Companion companion4 = Duration.Companion;
                    composer2 = composer;
                    ModalKt.m3381ToastBAHpl2s(m298padding3ABfNKs2, "invalid_coupon_toast", stringResource2, null, null, (Function0) rememberedValue2, new Duration(DurationKt.toDuration(3, DurationUnit.SECONDS)), composer2, 54, EnumC0170g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_DARK_APPEARANCE_VALUE);
                    gapComposer2.end(false);
                }
                ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
                ToastData toastData = content2.showToastData;
                Duration.Companion companion5 = Duration.Companion;
                Composer composer7 = composer2;
                LocalMapKt.m1318DismissableToastTnuy9kA(m302paddingqDBjuR0$default, toastData, null, new Duration(DurationKt.toDuration(10, DurationUnit.SECONDS)), composer7, 0);
                Composer composer8 = composer7;
                LocalBrandBannerModel localBrandBannerModel = content2.banner;
                if (localBrandBannerModel == null) {
                    gapComposer2.startReplaceGroup(1804092450);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(1804092451);
                    LocalMapKt.LocalBrandBanner(SpacerKt.m301paddingqDBjuR0(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 16.0f, 16.0f), localBrandBannerModel, function12, composer8, 6);
                    gapComposer2.end(false);
                }
                gapComposer2.startReplaceGroup(473846854);
                List list2 = content2.modals;
                int size2 = list2.size();
                int i3 = 0;
                while (i3 < size2) {
                    LocalBottomModalViewModel localBottomModalViewModel = (LocalBottomModalViewModel) list2.get(i3);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Composer composer9 = composer8;
                    LocalMapKt.LocalBottomModal(SpacerKt.m300paddingVpY3zN4$default(ImageKt.m177backgroundbw27NRU(companion2, colors.semantic.background.f1047app, ColorKt.RectangleShape), 16.0f, RecyclerView.DECELERATION_RATE, 2), localBottomModalViewModel, function12, i3, composer9, 0, 0);
                    i3++;
                    composer8 = composer9;
                }
                gapComposer2.end(false);
                gapComposer2.end(true);
                return Unit.INSTANCE;
        }
    }
}
