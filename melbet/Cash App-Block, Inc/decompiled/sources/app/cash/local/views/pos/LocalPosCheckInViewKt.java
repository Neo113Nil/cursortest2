package app.cash.local.views.pos;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.local.viewmodels.ToolbarModel;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewModel;
import app.cash.local.viewmodels.pos.LocalPosCheckInViewModel;
import app.cash.local.viewmodels.pos.LocalPosLocalCashRedemptionViewModel;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt$$ExternalSyntheticLambda14;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import app.cash.local.views.map.LocalMapPinKt$$ExternalSyntheticLambda5;
import app.cash.local.views.pos.TransitionStep;
import app.cash.local.views.toolbar.LocalToolbarKt;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import app.cash.redwood.yoga.internal.Yoga$$ExternalSyntheticLambda0;
import bo.app.n$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import bo.app.xg$$ExternalSyntheticLambda9;
import coil3.compose.AsyncImageKt;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSender$submitBugReport$2;
import com.squareup.cash.account.components.AccountAvatarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.RadioKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.borrow.views.LoanDetailsSheetKt$$ExternalSyntheticLambda8;
import com.squareup.cash.common.composeui.ArcadeBannerCardKt$$ExternalSyntheticLambda4;
import com.squareup.cash.common.composeui.DensityUtilsKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.datefilterbar.views.DateFilterChipKt$$ExternalSyntheticLambda0;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda14;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda24;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$11$1;
import com.squareup.cash.wallet.views.WalletHomeViewKt$WalletHome$2$3$1;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.POSBrandOnboarding;
import com.squareup.util.Strings;
import com.squareup.util.compose.TransitionsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.text.Regex;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.slf4j.Marker;

/* loaded from: classes3.dex */
public abstract class LocalPosCheckInViewKt {
    public static final ComposableLambdaImpl lambda$122604360 = new ComposableLambdaImpl(new AccountAvatarKt$$ExternalSyntheticLambda1(7), false, 122604360);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15, types: [int] */
    /* JADX WARN: Type inference failed for: r8v17 */
    public static final void BrandCard(Modifier modifier, LocalPosBrandOnboardingViewModel.CardModel cardModel, boolean z, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, Composer composer, int i) {
        int i2;
        Color m;
        long j;
        long j2;
        ?? r8;
        LocalColor localColor;
        Color m2;
        long j3;
        boolean z2;
        long j4;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1980384188);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(cardModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(parcelableSnapshotMutableIntState) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            LocalPosBrandOnboardingViewModel.CardModel.LocalCashCard localCashCard = cardModel.localCashContent;
            LocalPosBrandOnboardingViewModel.CardModel.BrandCard brandCard = cardModel.brandCardContent;
            LocalColor localColor2 = cardModel.cardForegroundColor;
            gapComposer.startReplaceGroup(478703383);
            Modifier aspectRatio = OffsetKt.aspectRatio(0.8f, SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f), false);
            LocalColor localColor3 = cardModel.cardOutlineColor;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (localColor3 != null) {
                aspectRatio = aspectRatio.then(ImageKt.m178borderxT4_qwU(companion, 1.0f, LocalViewsKt.toComposeColor(localColor3, gapComposer, 0), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f)));
            }
            gapComposer.end(false);
            LocalColor localColor4 = cardModel.cardBackgroundColor;
            Color color = null;
            if (localColor4 == null) {
                gapComposer.startReplaceGroup(1955130805);
                gapComposer.end(false);
                m = null;
            } else {
                gapComposer.startReplaceGroup(478710732);
                m = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, LocalViewsKt.toComposeColor(localColor4, gapComposer, 0));
            }
            if (m == null) {
                gapComposer.startReplaceGroup(478713058);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors.semantic.background.subtle;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(478709958);
                gapComposer.end(false);
                j = m.value;
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(aspectRatio, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f));
            boolean z3 = (i2 & 7168) == 2048;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z3 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CachedPageEventFlow$$ExternalSyntheticLambda0(parcelableSnapshotMutableIntState, 29);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ValueInsets.onGloballyPositioned(m177backgroundbw27NRU, (Function1) rememberedValue), 24.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(z ? SpacerKt.Center : SpacerKt.Top, z ? horizontal : Alignment.Companion.Start, gapComposer, 0);
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
            if (z) {
                gapComposer.startReplaceGroup(323358614);
                LocalPosBrandOnboardingViewModel.CardModel.LocalCashCard localCashCard2 = cardModel.localCashContent;
                String str = localCashCard2 != null ? localCashCard2.localCashAmount : null;
                if (str == null) {
                    gapComposer.startReplaceGroup(323358613);
                    gapComposer.end(false);
                    z2 = false;
                } else {
                    gapComposer.startReplaceGroup(323358614);
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    TextStyle textStyle = Strings.getTypography(gapComposer).keypadTotal;
                    if (localColor2 == null) {
                        gapComposer.startReplaceGroup(-1848237656);
                        gapComposer.end(false);
                        localColor = localColor2;
                        m2 = null;
                    } else {
                        gapComposer.startReplaceGroup(-1583641223);
                        localColor = localColor2;
                        m2 = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, LocalViewsKt.toComposeColor(localColor, gapComposer, 0));
                    }
                    if (m2 == null) {
                        gapComposer.startReplaceGroup(-1583639087);
                        j3 = Strings.getColors(gapComposer).semantic.text.standard;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1583642001);
                        gapComposer.end(false);
                        j3 = m2.value;
                    }
                    LocalColor localColor5 = localColor;
                    z2 = false;
                    zzacn.m2012AutoScaleTextZLomxE(1, 3, 0, 1597488, MLKEMEngine.KyberPolyBytes, j3, Room.getSp(8), gapComposer, fillMaxWidth, textStyle, str, null);
                    String stringResource = Room.stringResource(gapComposer, R.string.local_views_pos_onboarding_local_cash_title);
                    TextStyle textStyle2 = Strings.getTypography(gapComposer).labelSmall;
                    if (localColor5 == null) {
                        gapComposer.startReplaceGroup(-1847841848);
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1583628455);
                        color = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, LocalViewsKt.toComposeColor(localColor5, gapComposer, 0));
                    }
                    Color color2 = color;
                    if (color2 == null) {
                        gapComposer.startReplaceGroup(-1583626767);
                        j4 = Strings.getColors(gapComposer).semantic.text.standard;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1583629247);
                        gapComposer.end(false);
                        j4 = color2.value;
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, j4, (Composer) gapComposer, (Modifier) companion, textStyle2, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                    gapComposer.end(false);
                }
                gapComposer.end(z2);
            } else {
                gapComposer.startReplaceGroup(324137861);
                gapComposer.startReplaceGroup(324137861);
                LocalImage localImage = brandCard.brandImage;
                String str2 = brandCard.brandName;
                TextStyle textStyle3 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelSmall;
                if (localColor2 == null) {
                    gapComposer.startReplaceGroup(973619393);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1215518912);
                    color = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, LocalViewsKt.toComposeColor(localColor2, gapComposer, 0));
                }
                Color color3 = color;
                if (color3 == null) {
                    gapComposer.startReplaceGroup(-1215517224);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j2 = colors2.semantic.text.standard;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1215519704);
                    gapComposer.end(false);
                    j2 = color3.value;
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, j2, (Composer) gapComposer, (Modifier) companion, textStyle3, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(new LayoutWeightElement(1.0f, true).then(new HorizontalAlignElement(horizontal)), RecyclerView.DECELERATION_RATE, 60.0f, 1);
                Float ratio = LocalViewsKt.getRatio(localImage);
                if (ratio != null) {
                    r8 = 0;
                    m300paddingVpY3zN4$default = m300paddingVpY3zN4$default.then(OffsetKt.aspectRatio(ratio.floatValue(), companion, false));
                } else {
                    r8 = 0;
                }
                boolean z4 = r8;
                ImageKt.Image(AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(r8, 30, gapComposer, LocalViewsKt.getThemedUrl(localImage, gapComposer)), null, SizeKt.fillMaxSize(m300paddingVpY3zN4$default, 1.0f), null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, null, gapComposer, 24624, 104);
                gapComposer = gapComposer;
                gapComposer.end(z4);
                gapComposer.end(z4);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34(modifier, cardModel, z, parcelableSnapshotMutableIntState, i, 3);
        }
    }

    /* renamed from: Coupon-RPmYEkk, reason: not valid java name */
    public static final void m1329CouponRPmYEkk(LocalPosLocalCashRedemptionViewModel.Coupon coupon, long j, Composer composer, int i) {
        Modifier.Companion companion;
        int i2;
        boolean z;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1389344427);
        Applier applier = gapComposer.applier;
        int i3 = i | (gapComposer.changedInstance(coupon) ? 4 : 2) | (gapComposer.changed(j) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(0.5f, j, 14);
            long m675copywmQWz5c$default2 = Color.m675copywmQWz5c$default(0.15f, j, 14);
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier clip = ClipKt.clip(companion2, m340RoundedCornerShape0680j_4);
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m178borderxT4_qwU(ImageKt.m177backgroundbw27NRU(clip, m675copywmQWz5c$default2, rectangleShapeKt$RectangleShape$1), 1.0f, m675copywmQWz5c$default, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), 24.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m298padding3ABfNKs);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            String str = null;
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
            LocalImage localImage = coupon.image;
            if (localImage == null) {
                gapComposer.startReplaceGroup(-1395629271);
            } else {
                gapComposer.startReplaceGroup(-1014851624);
                str = LocalViewsKt.getThemedUrl(localImage, gapComposer);
            }
            gapComposer.end(false);
            String str2 = str;
            LocalMapKt.LocalAsyncImage(ImageKt.m177backgroundbw27NRU(ClipKt.clip(SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11), 48.0f), RoundedCornerShapeKt.CircleShape), m675copywmQWz5c$default, rectangleShapeKt$RectangleShape$1), null, str2, ContentScale.Companion.Fit, null, null, Expect_jvmKt.rememberComposableLambda(-2110535503, new ArcadeBannerCardKt$$ExternalSyntheticLambda4(str2, j, 1), gapComposer), gapComposer, 1575936, 50);
            gapComposer = gapComposer;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, companion2);
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
            String str3 = coupon.title;
            if (str3 == null) {
                gapComposer.startReplaceGroup(1697350918);
                gapComposer.end(false);
                i2 = 1572912;
                z = false;
                companion = companion2;
            } else {
                gapComposer.startReplaceGroup(1697350919);
                companion = companion2;
                i2 = 1572912;
                z = false;
                Room.m1165Text25TpFw(0, 1, 0, 0, ((i3 << 6) & 7168) | 1572912, 0, 4016, j, (Composer) gapComposer, (Modifier) companion, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).labelMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            String str4 = coupon.code;
            if (str4 == null) {
                gapComposer.startReplaceGroup(1697582922);
                gapComposer.end(z);
            } else {
                gapComposer.startReplaceGroup(1697582923);
                Room.m1165Text25TpFw(0, 1, 0, 0, ((i3 << 6) & 7168) | i2, 0, 4016, j, (Composer) gapComposer, (Modifier) companion, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                gapComposer.end(z);
            }
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LoanDetailsSheetKt$$ExternalSyntheticLambda8(coupon, j, i, 1);
        }
    }

    public static final void LocalPosBrandOnboardingView(final Modifier modifier, LocalPosBrandOnboardingViewModel localPosBrandOnboardingViewModel, final Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        Object obj;
        final LocalPosBrandOnboardingViewModel localPosBrandOnboardingViewModel2 = localPosBrandOnboardingViewModel;
        modifier.getClass();
        localPosBrandOnboardingViewModel2.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1103623466);
        int i2 = i | (gapComposer2.changed(modifier) ? 4 : 2) | (gapComposer2.changedInstance(localPosBrandOnboardingViewModel2) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = localPosBrandOnboardingViewModel2 instanceof LocalPosBrandOnboardingViewModel.CardModel;
            LocalPosBrandOnboardingViewModel.CardModel cardModel = z ? (LocalPosBrandOnboardingViewModel.CardModel) localPosBrandOnboardingViewModel2 : null;
            LocalImage localImage = cardModel != null ? cardModel.brandCardContent.brandImage : null;
            if (localImage == null) {
                gapComposer2.startReplaceGroup(-71761566);
            } else {
                gapComposer2.startReplaceGroup(274779775);
                LocalViewsKt.preload(localImage, gapComposer2, 0);
            }
            gapComposer2.end(false);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                if (z) {
                    obj = new TransitionStep.InitialStep(((LocalPosBrandOnboardingViewModel.CardModel) localPosBrandOnboardingViewModel2).initialDelay);
                } else {
                    if (!(localPosBrandOnboardingViewModel2 instanceof LocalPosBrandOnboardingViewModel.LegalConsentModel)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return;
                    }
                    obj = TransitionStep.LegalConsentStep.INSTANCE;
                }
                rememberedValue = Updater.mutableStateOf$default(obj);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            final ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer2);
            MutableState rememberUpdatedState = Updater.rememberUpdatedState(function1, gapComposer2);
            boolean changed = gapComposer2.changed(rememberScrollState) | gapComposer2.changed(rememberUpdatedState);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == obj2) {
                rememberedValue2 = new WalletHomeViewKt$WalletHome$2$3$1(rememberScrollState, rememberUpdatedState, null, 1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer2, rememberScrollState, (Function2) rememberedValue2);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == obj2) {
                rememberedValue3 = Boxes$$ExternalSyntheticOutline1.m(9999, gapComposer2);
            }
            final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue3;
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (rememberedValue4 == obj2) {
                rememberedValue4 = Boxes$$ExternalSyntheticOutline1.m(9999, gapComposer2);
            }
            final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue4;
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (rememberedValue5 == obj2) {
                rememberedValue5 = Boxes$$ExternalSyntheticOutline1.m(9999, gapComposer2);
            }
            final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = (ParcelableSnapshotMutableIntState) rememberedValue5;
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (rememberedValue6 == obj2) {
                rememberedValue6 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            final CoroutineScope coroutineScope = (CoroutineScope) rememberedValue6;
            boolean changed2 = gapComposer2.changed(parcelableSnapshotMutableIntState.getIntValue()) | gapComposer2.changed(parcelableSnapshotMutableIntState3.getIntValue());
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue7 == obj2) {
                rememberedValue7 = AnimatableKt.Animatable((parcelableSnapshotMutableIntState3.getIntValue() + parcelableSnapshotMutableIntState.getIntValue() + 600) * (-1.0f), 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            final Animatable animatable = (Animatable) rememberedValue7;
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (rememberedValue8 == obj2) {
                rememberedValue8 = AnimatableKt.Animatable(1000.0f, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue8);
            }
            final Animatable animatable2 = (Animatable) rememberedValue8;
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (rememberedValue9 == obj2) {
                rememberedValue9 = AnimatableKt.Animatable(1000.0f, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue9);
            }
            final Animatable animatable3 = (Animatable) rememberedValue9;
            Object rememberedValue10 = gapComposer2.rememberedValue();
            if (rememberedValue10 == obj2) {
                rememberedValue10 = AnimatableKt.Animatable(1000.0f, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue10);
            }
            final Animatable animatable4 = (Animatable) rememberedValue10;
            Object rememberedValue11 = gapComposer2.rememberedValue();
            if (rememberedValue11 == obj2) {
                rememberedValue11 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue11);
            }
            final Animatable animatable5 = (Animatable) rememberedValue11;
            Object rememberedValue12 = gapComposer2.rememberedValue();
            if (rememberedValue12 == obj2) {
                rememberedValue12 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue12);
            }
            final Animatable animatable6 = (Animatable) rememberedValue12;
            Object rememberedValue13 = gapComposer2.rememberedValue();
            if (rememberedValue13 == obj2) {
                rememberedValue13 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue13);
            }
            final Animatable animatable7 = (Animatable) rememberedValue13;
            Object rememberedValue14 = gapComposer2.rememberedValue();
            if (rememberedValue14 == obj2) {
                rememberedValue14 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                gapComposer2.updateRememberedValue(rememberedValue14);
            }
            final Animatable animatable8 = (Animatable) rememberedValue14;
            localPosBrandOnboardingViewModel2 = localPosBrandOnboardingViewModel;
            Function3 function3 = new Function3() { // from class: app.cash.local.views.pos.LocalPosBrandOnboardingViewKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj3, Object obj4, Object obj5) {
                    Animatable animatable9;
                    Animatable animatable10;
                    Animatable animatable11;
                    Animatable animatable12;
                    Animatable animatable13;
                    Animatable animatable14;
                    Animatable animatable15;
                    Animatable animatable16;
                    boolean z2;
                    UiScope uiScope = (UiScope) obj3;
                    Composer composer2 = (Composer) obj4;
                    int intValue = ((Integer) obj5).intValue();
                    uiScope.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((GapComposer) composer2).changed(uiScope) ? 4 : 2;
                    }
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    boolean shouldExecute = gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18);
                    Applier applier = gapComposer3.applier;
                    if (shouldExecute) {
                        boolean isVisibleAndSettled = TransitionsKt.isVisibleAndSettled(uiScope.$$delegate_0.getTransition());
                        LocalPosBrandOnboardingViewModel localPosBrandOnboardingViewModel3 = LocalPosBrandOnboardingViewModel.this;
                        Animatable animatable17 = animatable;
                        Animatable animatable18 = animatable2;
                        Animatable animatable19 = animatable5;
                        Animatable animatable20 = animatable3;
                        Animatable animatable21 = animatable6;
                        Animatable animatable22 = animatable4;
                        Animatable animatable23 = animatable7;
                        Animatable animatable24 = animatable8;
                        Object obj6 = Composer.Companion.Empty;
                        if (isVisibleAndSettled) {
                            gapComposer3.startReplaceGroup(528484128);
                            MutableState mutableState2 = mutableState;
                            TransitionStep transitionStep = (TransitionStep) mutableState2.getValue();
                            boolean changedInstance = gapComposer3.changedInstance(localPosBrandOnboardingViewModel3);
                            Object obj7 = coroutineScope;
                            boolean changedInstance2 = changedInstance | gapComposer3.changedInstance(obj7) | gapComposer3.changedInstance(animatable17) | gapComposer3.changedInstance(animatable18) | gapComposer3.changedInstance(animatable19) | gapComposer3.changedInstance(animatable20) | gapComposer3.changedInstance(animatable21) | gapComposer3.changedInstance(animatable22) | gapComposer3.changedInstance(animatable23) | gapComposer3.changedInstance(animatable24);
                            Object rememberedValue15 = gapComposer3.rememberedValue();
                            if (changedInstance2 || rememberedValue15 == obj6) {
                                animatable9 = animatable17;
                                animatable10 = animatable18;
                                animatable11 = animatable19;
                                animatable12 = animatable20;
                                animatable13 = animatable21;
                                animatable16 = animatable24;
                                rememberedValue15 = new RealBugReportSender$submitBugReport$2(localPosBrandOnboardingViewModel3, mutableState2, obj7, animatable9, animatable10, animatable11, animatable12, animatable13, animatable22, animatable23, animatable16, null, 2);
                                animatable14 = animatable22;
                                animatable15 = animatable23;
                                gapComposer3.updateRememberedValue(rememberedValue15);
                            } else {
                                animatable9 = animatable17;
                                animatable10 = animatable18;
                                animatable11 = animatable19;
                                animatable12 = animatable20;
                                animatable13 = animatable21;
                                animatable14 = animatable22;
                                animatable15 = animatable23;
                                animatable16 = animatable24;
                            }
                            Updater.LaunchedEffect(gapComposer3, transitionStep, (Function2) rememberedValue15);
                            z2 = false;
                            gapComposer3.end(false);
                        } else {
                            animatable9 = animatable17;
                            animatable10 = animatable18;
                            animatable11 = animatable19;
                            animatable12 = animatable20;
                            animatable13 = animatable21;
                            animatable14 = animatable22;
                            animatable15 = animatable23;
                            animatable16 = animatable24;
                            z2 = false;
                            gapComposer3.startReplaceGroup(529692105);
                            gapComposer3.end(false);
                        }
                        Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, z2);
                        } else {
                            gapComposer3.startReplaceGroup(-1762997739);
                            gapComposer3.end(z2);
                        }
                        Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(modifier, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z2);
                        int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, fillMaxSize);
                        ComposeUiNode.Companion.getClass();
                        Function0 function0 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(function0);
                        } else {
                            gapComposer3.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                        Integer valueOf = Integer.valueOf(hashCode);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                        BiasAlignment biasAlignment = Alignment.Companion.TopCenter;
                        boolean changedInstance3 = gapComposer3.changedInstance(localPosBrandOnboardingViewModel3);
                        Object rememberedValue16 = gapComposer3.rememberedValue();
                        if (changedInstance3 || rememberedValue16 == obj6) {
                            rememberedValue16 = new xg$$ExternalSyntheticLambda9(localPosBrandOnboardingViewModel3, 1);
                            gapComposer3.updateRememberedValue(rememberedValue16);
                        }
                        Function1 function12 = (Function1) rememberedValue16;
                        Object rememberedValue17 = gapComposer3.rememberedValue();
                        if (rememberedValue17 == obj6) {
                            rememberedValue17 = new Yoga$$ExternalSyntheticLambda0(17);
                            gapComposer3.updateRememberedValue(rememberedValue17);
                        }
                        Function1 function13 = (Function1) rememberedValue17;
                        final ScrollState scrollState = rememberScrollState;
                        Animatable animatable25 = animatable15;
                        final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = parcelableSnapshotMutableIntState;
                        final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState5 = parcelableSnapshotMutableIntState2;
                        final ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState6 = parcelableSnapshotMutableIntState3;
                        final Function1 function14 = function1;
                        final Animatable animatable26 = animatable13;
                        final Animatable animatable27 = animatable12;
                        final Animatable animatable28 = animatable11;
                        final Animatable animatable29 = animatable10;
                        final Animatable animatable30 = animatable9;
                        final Animatable animatable31 = animatable16;
                        AnimatedContentKt.AnimatedContent(localPosBrandOnboardingViewModel3, null, function12, biasAlignment, null, function13, Expect_jvmKt.rememberComposableLambda(1080293359, new Function4() { // from class: app.cash.local.views.pos.LocalPosBrandOnboardingViewKt$$ExternalSyntheticLambda4
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r14v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
                            /* JADX WARN: Type inference failed for: r14v11, types: [androidx.compose.runtime.GapComposer] */
                            /* JADX WARN: Type inference failed for: r14v12, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
                            /* JADX WARN: Type inference failed for: r14v13, types: [androidx.compose.runtime.GapComposer] */
                            /* JADX WARN: Type inference failed for: r14v14 */
                            /* JADX WARN: Type inference failed for: r14v15 */
                            /* JADX WARN: Type inference failed for: r14v16 */
                            /* JADX WARN: Type inference failed for: r14v17 */
                            /* JADX WARN: Type inference failed for: r14v20 */
                            /* JADX WARN: Type inference failed for: r14v21 */
                            /* JADX WARN: Type inference failed for: r14v22 */
                            /* JADX WARN: Type inference failed for: r14v23 */
                            /* JADX WARN: Type inference failed for: r14v8, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
                            /* JADX WARN: Type inference failed for: r14v9, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
                            /* JADX WARN: Type inference failed for: r3v30 */
                            /* JADX WARN: Type inference failed for: r3v31, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r3v33 */
                            /* JADX WARN: Type inference failed for: r9v1 */
                            /* JADX WARN: Type inference failed for: r9v2, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r9v25, types: [androidx.compose.ui.Modifier] */
                            /* JADX WARN: Type inference failed for: r9v37 */
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj8, Object obj9, Object obj10, Object obj11) {
                                ?? r9;
                                char c;
                                float f;
                                String replace;
                                boolean z3;
                                GapComposer gapComposer4;
                                boolean z4;
                                GapComposer gapComposer5;
                                BiasAlignment.Horizontal horizontal;
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
                                String str;
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12;
                                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12;
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15;
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16;
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17;
                                Modifier.Companion companion;
                                LocalPosBrandOnboardingViewModel.CardModel cardModel2;
                                Arrangement$Top$1 arrangement$Top$1;
                                ?? r3;
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18;
                                Object obj12;
                                ?? r14;
                                int i3;
                                int i4;
                                int i5;
                                float f2;
                                Modifier.Companion companion2;
                                POSBrandOnboarding.HowItWorks.Row row;
                                Modifier.Companion companion3;
                                POSBrandOnboarding.HowItWorks.Row row2;
                                int i6;
                                ?? r142;
                                int i7;
                                float f3;
                                char c2;
                                ?? r143;
                                LocalPosBrandOnboardingViewModel localPosBrandOnboardingViewModel4 = (LocalPosBrandOnboardingViewModel) obj9;
                                int intValue2 = ((Integer) obj11).intValue();
                                ((AnimatedContentScopeImpl) obj8).getClass();
                                localPosBrandOnboardingViewModel4.getClass();
                                ?? r144 = (GapComposer) ((Composer) obj10);
                                r144.startReplaceGroup(-1220162359);
                                Applier applier2 = r144.applier;
                                boolean z5 = localPosBrandOnboardingViewModel4 instanceof LocalPosBrandOnboardingViewModel.CardModel;
                                Modifier.Companion companion4 = Modifier.Companion.$$INSTANCE;
                                Modifier verticalScroll$default = z5 ? ImageKt.verticalScroll$default(companion4, ScrollState.this, false, 14) : companion4;
                                boolean z6 = localPosBrandOnboardingViewModel4 instanceof LocalPosBrandOnboardingViewModel.LegalConsentModel;
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState7 = parcelableSnapshotMutableIntState4;
                                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState8 = parcelableSnapshotMutableIntState5;
                                if (z6) {
                                    Colors colors2 = (Colors) r144.consume(ArcadeThemeKt.LocalColors);
                                    if (colors2 == null) {
                                        colors2 = re$$ExternalSyntheticOutline0.m((GapComposer) r144, -1762997026, (GapComposer) r144, false);
                                    } else {
                                        r144.startReplaceGroup(-1762997739);
                                        r144.end(false);
                                    }
                                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(companion4, colors2.semantic.background.f1047app, ColorKt.RectangleShape);
                                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
                                    verticalScroll$default = verticalScroll$default.then(SpacerKt.m301paddingqDBjuR0(m177backgroundbw27NRU, 24.0f, ((Density) r144.consume(staticProvidableCompositionLocal)).mo233toDpu2uoSUM(parcelableSnapshotMutableIntState7.getIntValue()), 24.0f, ((Density) r144.consume(staticProvidableCompositionLocal)).mo233toDpu2uoSUM(parcelableSnapshotMutableIntState8.getIntValue())));
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                r144.end(r9);
                                Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
                                BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, r144, r9);
                                int hashCode2 = Long.hashCode(r144.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = r144.currentCompositionLocalScope();
                                Modifier materializeModifier2 = PlatformKt.materializeModifier(r144, verticalScroll$default);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                                if (applier2 == null) {
                                    Updater.invalidApplier();
                                    throw null;
                                }
                                r144.startReusableNode();
                                if (r144.inserting) {
                                    r144.createNode(layoutNode$Companion$Constructor$13);
                                } else {
                                    r144.useNode();
                                }
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = ComposeUiNode.Companion.SetMeasurePolicy;
                                Updater.m576setimpl(r144, columnMeasurePolicy, composeUiNode$Companion$SetModifier$19);
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$110 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                                Updater.m576setimpl(r144, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$110);
                                Integer valueOf2 = Integer.valueOf(hashCode2);
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$111 = ComposeUiNode.Companion.SetCompositeKeyHash;
                                Updater.m576setimpl(r144, valueOf2, composeUiNode$Companion$SetModifier$111);
                                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                                Updater.m575reconcileimpl(r144, ownerSnapshotObserver$onCommitAffectingLayout$13);
                                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$112 = ComposeUiNode.Companion.SetModifier;
                                Updater.m576setimpl(r144, materializeModifier2, composeUiNode$Companion$SetModifier$112);
                                Object obj13 = Composer.Companion.Empty;
                                if (z5) {
                                    r144.startReplaceGroup(2147035743);
                                    Animatable animatable32 = animatable31;
                                    boolean z7 = ((Number) animatable32.getValue()).floatValue() >= 90.0f;
                                    Modifier zIndex = ZIndexModifierKt.zIndex(companion4, 1.0f);
                                    Animatable animatable33 = animatable30;
                                    boolean changedInstance4 = r144.changedInstance(animatable33);
                                    Object rememberedValue18 = r144.rememberedValue();
                                    if (changedInstance4 || rememberedValue18 == obj13) {
                                        horizontal = horizontal2;
                                        rememberedValue18 = new RadioKt$$ExternalSyntheticLambda1(animatable33, 1);
                                        r144.updateRememberedValue(rememberedValue18);
                                    } else {
                                        horizontal = horizontal2;
                                    }
                                    Modifier offset = OffsetKt.offset(zIndex, (Function1) rememberedValue18);
                                    boolean changedInstance5 = r144.changedInstance(animatable32);
                                    Object rememberedValue19 = r144.rememberedValue();
                                    if (changedInstance5 || rememberedValue19 == obj13) {
                                        rememberedValue19 = new RadioKt$$ExternalSyntheticLambda1(animatable32, 2);
                                        r144.updateRememberedValue(rememberedValue19);
                                    }
                                    Modifier graphicsLayer = ColorKt.graphicsLayer(offset, (Function1) rememberedValue19);
                                    BiasAlignment biasAlignment2 = Alignment.Companion.TopStart;
                                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment2, false);
                                    boolean z8 = z7;
                                    int hashCode3 = Long.hashCode(r144.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = r144.currentCompositionLocalScope();
                                    Modifier materializeModifier3 = PlatformKt.materializeModifier(r144, graphicsLayer);
                                    r144.startReusableNode();
                                    if (r144.inserting) {
                                        r144.createNode(layoutNode$Companion$Constructor$13);
                                    } else {
                                        r144.useNode();
                                    }
                                    Updater.m576setimpl(r144, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$19);
                                    Updater.m576setimpl(r144, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$110);
                                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, (GapComposer) r144, composeUiNode$Companion$SetModifier$111, (GapComposer) r144, ownerSnapshotObserver$onCommitAffectingLayout$13);
                                    Updater.m576setimpl(r144, materializeModifier3, composeUiNode$Companion$SetModifier$112);
                                    boolean changed3 = r144.changed(z8);
                                    Object rememberedValue20 = r144.rememberedValue();
                                    if (changed3 || rememberedValue20 == obj13) {
                                        rememberedValue20 = new MoneyTabUIKt$$ExternalSyntheticLambda24(z8, 2);
                                        r144.updateRememberedValue(rememberedValue20);
                                    }
                                    Modifier graphicsLayer2 = ColorKt.graphicsLayer(companion4, (Function1) rememberedValue20);
                                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment2, false);
                                    int hashCode4 = Long.hashCode(r144.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = r144.currentCompositionLocalScope();
                                    Modifier materializeModifier4 = PlatformKt.materializeModifier(r144, graphicsLayer2);
                                    if (applier2 == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    r144.startReusableNode();
                                    if (r144.inserting) {
                                        r144.createNode(layoutNode$Companion$Constructor$13);
                                    } else {
                                        r144.useNode();
                                    }
                                    Updater.m576setimpl(r144, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$19);
                                    Updater.m576setimpl(r144, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$110);
                                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, (GapComposer) r144, composeUiNode$Companion$SetModifier$111, (GapComposer) r144, ownerSnapshotObserver$onCommitAffectingLayout$13);
                                    Updater.m576setimpl(r144, materializeModifier4, composeUiNode$Companion$SetModifier$112);
                                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = CompositionLocalsKt.LocalDensity;
                                    LocalPosBrandOnboardingViewModel.CardModel cardModel3 = (LocalPosBrandOnboardingViewModel.CardModel) localPosBrandOnboardingViewModel4;
                                    LocalPosCheckInViewKt.BrandCard(SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, ((Density) r144.consume(staticProvidableCompositionLocal2)).mo233toDpu2uoSUM(parcelableSnapshotMutableIntState7.getIntValue()), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), cardModel3, z8, parcelableSnapshotMutableIntState6, r144, (intValue2 & 112) | 3072);
                                    r144.end(true);
                                    r144.end(true);
                                    Animatable animatable34 = animatable29;
                                    boolean changedInstance6 = r144.changedInstance(animatable34);
                                    Object rememberedValue21 = r144.rememberedValue();
                                    if (changedInstance6 || rememberedValue21 == obj13) {
                                        rememberedValue21 = new RadioKt$$ExternalSyntheticLambda1(animatable34, 3);
                                        r144.updateRememberedValue(rememberedValue21);
                                    }
                                    Modifier alpha = AlphaKt.alpha(OffsetKt.offset(companion4, (Function1) rememberedValue21), ((Number) animatable28.getValue()).floatValue());
                                    MeasurePolicy maybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment2, false);
                                    int hashCode5 = Long.hashCode(r144.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = r144.currentCompositionLocalScope();
                                    Modifier materializeModifier5 = PlatformKt.materializeModifier(r144, alpha);
                                    if (applier2 == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    r144.startReusableNode();
                                    if (r144.inserting) {
                                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                                        r144.createNode(layoutNode$Companion$Constructor$1);
                                    } else {
                                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$13;
                                        r144.useNode();
                                    }
                                    Updater.m576setimpl(r144, maybeCachedBoxMeasurePolicy4, composeUiNode$Companion$SetModifier$19);
                                    Updater.m576setimpl(r144, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$110);
                                    Recorder$$ExternalSyntheticOutline2.m(hashCode5, (GapComposer) r144, composeUiNode$Companion$SetModifier$111, (GapComposer) r144, ownerSnapshotObserver$onCommitAffectingLayout$13);
                                    Updater.m576setimpl(r144, materializeModifier5, composeUiNode$Companion$SetModifier$112);
                                    if (z8) {
                                        LocalPosBrandOnboardingViewModel.CardModel.LocalCashCard localCashCard = cardModel3.localCashContent;
                                        str = localCashCard != null ? localCashCard.title : null;
                                    } else {
                                        str = cardModel3.title;
                                    }
                                    if (str == null) {
                                        r144.startReplaceGroup(878400233);
                                        r144.end(false);
                                        ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                                        composeUiNode$Companion$SetModifier$18 = composeUiNode$Companion$SetModifier$111;
                                        cardModel2 = cardModel3;
                                        r3 = 0;
                                        layoutNode$Companion$Constructor$12 = layoutNode$Companion$Constructor$1;
                                        composeUiNode$Companion$SetModifier$17 = composeUiNode$Companion$SetModifier$112;
                                        composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$110;
                                        composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$19;
                                        companion = companion4;
                                        obj12 = obj13;
                                        arrangement$Top$1 = arrangement$Top$12;
                                        r14 = r144;
                                    } else {
                                        r144.startReplaceGroup(878400234);
                                        Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(companion4, 24.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
                                        TextStyle textStyle = ((Typography) r144.consume(ArcadeThemeKt.LocalTypography)).headlineLarge;
                                        Colors colors3 = (Colors) r144.consume(ArcadeThemeKt.LocalColors);
                                        String str2 = str;
                                        if (colors3 == null) {
                                            colors3 = re$$ExternalSyntheticOutline0.m((GapComposer) r144, -1762997026, (GapComposer) r144, false);
                                        } else {
                                            r144.startReplaceGroup(-1762997739);
                                            r144.end(false);
                                        }
                                        layoutNode$Companion$Constructor$12 = layoutNode$Companion$Constructor$1;
                                        GapComposer gapComposer6 = r144;
                                        ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                                        composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$110;
                                        composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$19;
                                        composeUiNode$Companion$SetModifier$17 = composeUiNode$Companion$SetModifier$112;
                                        companion = companion4;
                                        cardModel2 = cardModel3;
                                        arrangement$Top$1 = arrangement$Top$12;
                                        r3 = 0;
                                        composeUiNode$Companion$SetModifier$18 = composeUiNode$Companion$SetModifier$111;
                                        obj12 = obj13;
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors3.semantic.text.standard, (Composer) gapComposer6, m302paddingqDBjuR0$default, textStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                        gapComposer6.end(false);
                                        r14 = gapComposer6;
                                    }
                                    r14.end(true);
                                    Animatable animatable35 = animatable27;
                                    boolean changedInstance7 = r14.changedInstance(animatable35);
                                    Object rememberedValue22 = r14.rememberedValue();
                                    if (changedInstance7 || rememberedValue22 == obj12) {
                                        rememberedValue22 = new RadioKt$$ExternalSyntheticLambda1(animatable35, 4);
                                        r14.updateRememberedValue(rememberedValue22);
                                    }
                                    Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(AlphaKt.alpha(OffsetKt.offset(companion, (Function1) rememberedValue22), ((Number) animatable26.getValue()).floatValue()), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, ((Density) r14.consume(staticProvidableCompositionLocal2)).mo233toDpu2uoSUM(parcelableSnapshotMutableIntState8.getIntValue()), 7);
                                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, r14, r3);
                                    int hashCode6 = Long.hashCode(r14.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope6 = r14.currentCompositionLocalScope();
                                    Modifier materializeModifier6 = PlatformKt.materializeModifier(r14, m302paddingqDBjuR0$default2);
                                    if (applier2 == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    r14.startReusableNode();
                                    if (r14.inserting) {
                                        r14.createNode(layoutNode$Companion$Constructor$12);
                                    } else {
                                        r14.useNode();
                                    }
                                    Updater.m576setimpl(r14, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$16);
                                    Updater.m576setimpl(r14, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$15);
                                    Recorder$$ExternalSyntheticOutline2.m(hashCode6, (GapComposer) r14, composeUiNode$Companion$SetModifier$18, (GapComposer) r14, ownerSnapshotObserver$onCommitAffectingLayout$12);
                                    Updater.m576setimpl(r14, materializeModifier6, composeUiNode$Companion$SetModifier$17);
                                    LocalPosBrandOnboardingViewModel.CardModel cardModel4 = cardModel2;
                                    String str3 = cardModel4.body;
                                    if (str3 == null) {
                                        r14.startReplaceGroup(648052316);
                                        r14.end(r3);
                                        i5 = -1762997739;
                                        i4 = 2;
                                    } else {
                                        r14.startReplaceGroup(648052317);
                                        Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 24.0f, RecyclerView.DECELERATION_RATE, 2);
                                        TextStyle textStyle2 = ((Typography) r14.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                                        Colors colors4 = (Colors) r14.consume(ArcadeThemeKt.LocalColors);
                                        if (colors4 == null) {
                                            colors4 = re$$ExternalSyntheticOutline0.m((GapComposer) r14, -1762997026, (GapComposer) r14, (boolean) r3);
                                            i3 = -1762997739;
                                        } else {
                                            i3 = -1762997739;
                                            r14.startReplaceGroup(-1762997739);
                                            r14.end(r3);
                                        }
                                        i4 = 2;
                                        i5 = i3;
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors4.semantic.text.placeholder, (Composer) r14, m300paddingVpY3zN4$default, textStyle2, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                                        r14.end(r3);
                                    }
                                    POSBrandOnboarding.HowItWorks howItWorks = cardModel4.howItWorks;
                                    if (howItWorks == null) {
                                        r14.startReplaceGroup(648449178);
                                        r14.end(r3);
                                        r143 = r14;
                                    } else {
                                        r14.startReplaceGroup(648449179);
                                        Modifier.Companion companion5 = companion;
                                        ModalKt.HorizontalDivider(6, r3, r14, SpacerKt.m300paddingVpY3zN4$default(SpacerKt.m302paddingqDBjuR0$default(companion5, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 24.0f, RecyclerView.DECELERATION_RATE, i4));
                                        String str4 = howItWorks.title;
                                        if (str4 == null) {
                                            r14.startReplaceGroup(-2043203127);
                                            r14.end(r3);
                                            companion2 = companion5;
                                            f2 = 24.0f;
                                        } else {
                                            r14.startReplaceGroup(-2043203126);
                                            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion5, 24.0f);
                                            TextStyle textStyle3 = ((Typography) r14.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                                            Colors colors5 = (Colors) r14.consume(ArcadeThemeKt.LocalColors);
                                            if (colors5 == null) {
                                                colors5 = re$$ExternalSyntheticOutline0.m((GapComposer) r14, -1762997026, (GapComposer) r14, (boolean) r3);
                                            } else {
                                                r14.startReplaceGroup(i5);
                                                r14.end(r3);
                                            }
                                            f2 = 24.0f;
                                            companion2 = companion5;
                                            Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors5.semantic.text.standard, (Composer) r14, m298padding3ABfNKs, textStyle3, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                                            r14.end(r3);
                                        }
                                        r14.startReplaceGroup(-394707125);
                                        List list = howItWorks.rows;
                                        int size = list.size();
                                        int i8 = r3;
                                        ?? r145 = r14;
                                        while (i8 < size) {
                                            POSBrandOnboarding.HowItWorks.Row row3 = (POSBrandOnboarding.HowItWorks.Row) list.get(i8);
                                            LocalImage localImage2 = row3.image;
                                            if (localImage2 == null) {
                                                r145.startReplaceGroup(-2107588903);
                                                r145.end(r3);
                                                i6 = i8;
                                                row2 = row3;
                                                r142 = r145;
                                            } else {
                                                r145.startReplaceGroup(-2107588902);
                                                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(companion2, f2, RecyclerView.DECELERATION_RATE, i4), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7), 64.0f);
                                                Float ratio = LocalViewsKt.getRatio(localImage2);
                                                if (ratio != null) {
                                                    ?? aspectRatio = OffsetKt.aspectRatio(ratio.floatValue(), companion2, r3);
                                                    row = row3;
                                                    companion3 = aspectRatio;
                                                } else {
                                                    row = row3;
                                                    companion3 = companion2;
                                                }
                                                Composer composer3 = r145;
                                                row2 = row;
                                                i6 = i8;
                                                LocalMapKt.LocalAsyncImage(m285size3ABfNKs, companion3, LocalViewsKt.getThemedUrl(localImage2, r145), ContentScale.Companion.Fit, Alignment.Companion.Center, null, null, composer3, 27654, 96);
                                                ?? r146 = composer3;
                                                r146.end(r3);
                                                r142 = r146;
                                            }
                                            String str5 = row2.title;
                                            if (str5 == null) {
                                                r142.startReplaceGroup(-2107049038);
                                                r142.end(r3);
                                                i7 = size;
                                            } else {
                                                r142.startReplaceGroup(-2107049037);
                                                Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(companion2, 24.0f, RecyclerView.DECELERATION_RATE, i4), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 4.0f, 7);
                                                TextStyle textStyle4 = ((Typography) r142.consume(ArcadeThemeKt.LocalTypography)).labelSmall;
                                                Colors colors6 = (Colors) r142.consume(ArcadeThemeKt.LocalColors);
                                                if (colors6 == null) {
                                                    colors6 = re$$ExternalSyntheticOutline0.m((GapComposer) r142, -1762997026, (GapComposer) r142, (boolean) r3);
                                                } else {
                                                    r142.startReplaceGroup(-1762997739);
                                                    r142.end(r3);
                                                }
                                                i7 = size;
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors6.semantic.text.standard, (Composer) r142, m302paddingqDBjuR0$default3, textStyle4, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                                                r142.end(r3);
                                            }
                                            String str6 = row2.body;
                                            if (str6 == null) {
                                                r142.startReplaceGroup(-2106657322);
                                                r142.end(r3);
                                                f3 = 24.0f;
                                            } else {
                                                r142.startReplaceGroup(-2106657321);
                                                Modifier m302paddingqDBjuR0$default4 = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(companion2, 24.0f, RecyclerView.DECELERATION_RATE, i4), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7);
                                                f3 = 24.0f;
                                                TextStyle textStyle5 = ((Typography) r142.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                                                Colors colors7 = (Colors) r142.consume(ArcadeThemeKt.LocalColors);
                                                if (colors7 == null) {
                                                    colors7 = re$$ExternalSyntheticOutline0.m((GapComposer) r142, -1762997026, (GapComposer) r142, (boolean) r3);
                                                    c2 = 51733;
                                                } else {
                                                    c2 = 51733;
                                                    r142.startReplaceGroup(-1762997739);
                                                    r142.end(r3);
                                                }
                                                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors7.semantic.text.subtle, (Composer) r142, m302paddingqDBjuR0$default4, textStyle5, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                                                r142.end(r3);
                                            }
                                            i8 = i6 + 1;
                                            f2 = f3;
                                            size = i7;
                                            r145 = r142;
                                        }
                                        r145.end(r3);
                                        r145.end(r3);
                                        r143 = r145;
                                    }
                                    r143.end(true);
                                    r143.end(r3);
                                    z4 = true;
                                    gapComposer5 = r143;
                                } else {
                                    if (!z6) {
                                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) r144, 1731826936, false);
                                    }
                                    r144.startReplaceGroup(-2143639727);
                                    LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Bottom, horizontal2, r144, 6);
                                    int hashCode7 = Long.hashCode(r144.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope7 = r144.currentCompositionLocalScope();
                                    Modifier materializeModifier7 = PlatformKt.materializeModifier(r144, layoutWeightElement);
                                    if (applier2 == null) {
                                        Updater.invalidApplier();
                                        throw null;
                                    }
                                    r144.startReusableNode();
                                    if (r144.inserting) {
                                        r144.createNode(layoutNode$Companion$Constructor$13);
                                    } else {
                                        r144.useNode();
                                    }
                                    Updater.m576setimpl(r144, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$19);
                                    Updater.m576setimpl(r144, currentCompositionLocalScope7, composeUiNode$Companion$SetModifier$110);
                                    Recorder$$ExternalSyntheticOutline2.m(hashCode7, (GapComposer) r144, composeUiNode$Companion$SetModifier$111, (GapComposer) r144, ownerSnapshotObserver$onCommitAffectingLayout$13);
                                    Updater.m576setimpl(r144, materializeModifier7, composeUiNode$Companion$SetModifier$112);
                                    POSBrandOnboarding.LegalConsent legalConsent = ((LocalPosBrandOnboardingViewModel.LegalConsentModel) localPosBrandOnboardingViewModel4).legalConsent;
                                    String str7 = legalConsent != null ? legalConsent.title : null;
                                    if (str7 == null) {
                                        r144.startReplaceGroup(-1318166384);
                                        r144.end(false);
                                        f = 1.0f;
                                    } else {
                                        r144.startReplaceGroup(-1318166383);
                                        Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion4, 1.0f);
                                        TextStyle textStyle6 = ((Typography) r144.consume(ArcadeThemeKt.LocalTypography)).headlineLarge;
                                        Colors colors8 = (Colors) r144.consume(ArcadeThemeKt.LocalColors);
                                        if (colors8 == null) {
                                            colors8 = re$$ExternalSyntheticOutline0.m((GapComposer) r144, -1762997026, (GapComposer) r144, false);
                                            c = 51733;
                                        } else {
                                            c = 51733;
                                            r144.startReplaceGroup(-1762997739);
                                            r144.end(false);
                                        }
                                        f = 1.0f;
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors8.semantic.text.standard, (Composer) r144, fillMaxWidth, textStyle6, (TextLineBalancing) null, str7, (Map) null, (Function1) null, false);
                                        r144.end(false);
                                    }
                                    SpacerKt.Spacer(r144, SizeKt.m277height3ABfNKs(companion4, 12.0f));
                                    String str8 = legalConsent != null ? legalConsent.fine_print : null;
                                    if (str8 == null) {
                                        r144.startReplaceGroup(-1317765802);
                                        z3 = false;
                                        r144.end(false);
                                        gapComposer4 = r144;
                                    } else {
                                        r144.startReplaceGroup(-1317765801);
                                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion4, f);
                                        float f4 = LocalViewsKt.CloseToWhiteBackgroundBorderWidth;
                                        replace = new Regex("^\\* ").replace(str8, Marker.ANY_MARKER);
                                        TextStyle textStyle7 = ((Typography) r144.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                                        Colors colors9 = (Colors) r144.consume(ArcadeThemeKt.LocalColors);
                                        if (colors9 == null) {
                                            colors9 = re$$ExternalSyntheticOutline0.m((GapComposer) r144, -1762997026, (GapComposer) r144, false);
                                        } else {
                                            r144.startReplaceGroup(-1762997739);
                                            r144.end(false);
                                        }
                                        long j = colors9.semantic.text.standard;
                                        Function1 function15 = function14;
                                        boolean changed4 = r144.changed(function15);
                                        Object rememberedValue23 = r144.rememberedValue();
                                        if (changed4 || rememberedValue23 == obj13) {
                                            rememberedValue23 = new SwipeToDismissKt$$ExternalSyntheticLambda4(8, function15);
                                            r144.updateRememberedValue(rememberedValue23);
                                        }
                                        LazyDslKt.m304MarkdownTextpCuZGqc(replace, (Function2) rememberedValue23, fillMaxWidth2, textStyle7, j, null, null, null, 0, 0, 0, r144, MLKEMEngine.KyberPolyBytes, 2016);
                                        GapComposer gapComposer7 = r144;
                                        z3 = false;
                                        re$$ExternalSyntheticOutline0.m(companion4, 12.0f, gapComposer7, false);
                                        gapComposer4 = gapComposer7;
                                    }
                                    z4 = true;
                                    gapComposer4.end(true);
                                    gapComposer4.end(z3);
                                    gapComposer5 = gapComposer4;
                                }
                                gapComposer5.end(z4);
                                return Unit.INSTANCE;
                            }
                        }, gapComposer3), gapComposer3, 1772544, 18);
                        Object rememberedValue18 = gapComposer3.rememberedValue();
                        if (rememberedValue18 == obj6) {
                            rememberedValue18 = new MoneyTabUIKt$$ExternalSyntheticLambda14(3, parcelableSnapshotMutableIntState4);
                            gapComposer3.updateRememberedValue(rememberedValue18);
                        }
                        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                        Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(companion, (Function1) rememberedValue18);
                        if (localPosBrandOnboardingViewModel3.getHideToolbar()) {
                            onGloballyPositioned = onGloballyPositioned.then(AlphaKt.alpha(companion, RecyclerView.DECELERATION_RATE));
                        }
                        ToolbarModel toolbarModel = new ToolbarModel("");
                        Modifier modifier2 = onGloballyPositioned;
                        NavigationType navigationType = NavigationType.CLOSE;
                        boolean changedInstance4 = gapComposer3.changedInstance(localPosBrandOnboardingViewModel3) | gapComposer3.changed(function14);
                        Object rememberedValue19 = gapComposer3.rememberedValue();
                        if (changedInstance4 || rememberedValue19 == obj6) {
                            rememberedValue19 = new n$$ExternalSyntheticLambda0(5, localPosBrandOnboardingViewModel3, function14);
                            gapComposer3.updateRememberedValue(rememberedValue19);
                        }
                        LocalToolbarKt.m1333LocalToolbarflo8M7A(modifier2, toolbarModel, navigationType, (Function0) rememberedValue19, RecyclerView.DECELERATION_RATE, null, gapComposer3, 196992, 72);
                        Modifier align = BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter);
                        boolean changedInstance5 = gapComposer3.changedInstance(animatable14);
                        Object rememberedValue20 = gapComposer3.rememberedValue();
                        if (changedInstance5 || rememberedValue20 == obj6) {
                            rememberedValue20 = new RadioKt$$ExternalSyntheticLambda1(animatable14, 5);
                            gapComposer3.updateRememberedValue(rememberedValue20);
                        }
                        Modifier alpha = AlphaKt.alpha(OffsetKt.offset(align, (Function1) rememberedValue20), ((Number) animatable25.getValue()).floatValue());
                        Object rememberedValue21 = gapComposer3.rememberedValue();
                        if (rememberedValue21 == obj6) {
                            rememberedValue21 = new MoneyTabUIKt$$ExternalSyntheticLambda14(4, parcelableSnapshotMutableIntState5);
                            gapComposer3.updateRememberedValue(rememberedValue21);
                        }
                        Modifier onGloballyPositioned2 = ValueInsets.onGloballyPositioned(alpha, (Function1) rememberedValue21);
                        MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                        int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, onGloballyPositioned2);
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(function0);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        LocalPosBrandOnboardingViewModel.CallToAction callToAction = localPosBrandOnboardingViewModel3.getCallToAction();
                        Object rememberedValue22 = gapComposer3.rememberedValue();
                        if (rememberedValue22 == obj6) {
                            rememberedValue22 = Updater.mutableStateOf$default(Boolean.FALSE);
                            gapComposer3.updateRememberedValue(rememberedValue22);
                        }
                        MutableState mutableState3 = (MutableState) rememberedValue22;
                        if (callToAction.style != LocalPosBrandOnboardingViewModel.CallToAction.Style.LABEL) {
                            mutableState3.setValue(Boolean.TRUE);
                        }
                        Object rememberedValue23 = gapComposer3.rememberedValue();
                        if (rememberedValue23 == obj6) {
                            rememberedValue23 = new DateInputKt$$ExternalSyntheticLambda5(21, mutableState3);
                            gapComposer3.updateRememberedValue(rememberedValue23);
                        }
                        AnimatedContentKt.AnimatedContent(callToAction, companion, (Function1) rememberedValue23, null, "bottom-switch", null, Expect_jvmKt.rememberComposableLambda(-1221430587, new SetPinViewKt$$ExternalSyntheticLambda4(1, function14), gapComposer3), gapComposer3, 1597872, 40);
                        gapComposer3.end(true);
                        gapComposer3.end(true);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            };
            gapComposer = gapComposer2;
            UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(1719532857, function3, gapComposer), gapComposer, 6);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalPosBrandOnboardingViewKt$$ExternalSyntheticLambda1(modifier, localPosBrandOnboardingViewModel2, function1, i);
        }
    }

    public static final void LocalPosCheckInView(Modifier modifier, LocalPosCheckInViewModel localPosCheckInViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1381680473);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(localPosCheckInViewModel) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128) | 3072;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(1634358026, new LocalViewFactory$$ExternalSyntheticLambda6(modifier, function1, localPosCheckInViewModel, 12), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalPosCheckInViewKt$$ExternalSyntheticLambda1(modifier, localPosCheckInViewModel, function1, i);
        }
    }

    public static final void LocalPosLocalCashRedemptionView(Modifier modifier, final LocalPosLocalCashRedemptionViewModel localPosLocalCashRedemptionViewModel, final Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer;
        LocalPosLocalCashRedemptionViewModel localPosLocalCashRedemptionViewModel2;
        Color m;
        long j;
        LocalColor localColor;
        modifier.getClass();
        localPosLocalCashRedemptionViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1822733333);
        int i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i | (gapComposer2.changedInstance(localPosLocalCashRedemptionViewModel) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128) | 3072;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            final MutableState mutableState = (MutableState) rememberedValue;
            LocalColor localColor2 = localPosLocalCashRedemptionViewModel.brandForegroundColor;
            if (localColor2 == null) {
                gapComposer2.startReplaceGroup(223142662);
                gapComposer2.end(false);
                m = null;
            } else {
                gapComposer2.startReplaceGroup(699934811);
                m = Recorder$$ExternalSyntheticOutline1.m(gapComposer2, false, LocalViewsKt.toComposeColor(localColor2, gapComposer2, 0));
            }
            if (m == null) {
                gapComposer2.startReplaceGroup(699936499);
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors.semantic.text.standard;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(699933988);
                gapComposer2.end(false);
                j = m.value;
            }
            final float m3477toPx8Feqmps = DensityUtilsKt.m3477toPx8Feqmps(264.0f, gapComposer2);
            final float m3477toPx8Feqmps2 = DensityUtilsKt.m3477toPx8Feqmps(102.0f, gapComposer2);
            gapComposer2.startReplaceGroup(699942722);
            Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
            LocalImage localImage = localPosLocalCashRedemptionViewModel.brandImage;
            if (localImage == null || (localColor = localImage.placeholder_color) == null) {
                localColor = localPosLocalCashRedemptionViewModel.brandBackgroundColor;
            }
            if (localColor != null) {
                fillMaxSize = fillMaxSize.then(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, LocalViewsKt.toComposeColor(localColor, gapComposer2, 0), ColorKt.RectangleShape));
            }
            gapComposer2.end(false);
            Modifier statusBarsPadding = SpacerKt.statusBarsPadding(fillMaxSize);
            BiasAlignment biasAlignment = Alignment.Companion.BottomCenter;
            final long j2 = j;
            function12 = function1;
            localPosLocalCashRedemptionViewModel2 = localPosLocalCashRedemptionViewModel;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1091771327, new Function3() { // from class: app.cash.local.views.pos.LocalPosLocalCashRedemptionViewKt$$ExternalSyntheticLambda0
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r9v4 */
                /* JADX WARN: Type inference failed for: r9v5, types: [int] */
                /* JADX WARN: Type inference failed for: r9v7 */
                @Override // kotlin.jvm.functions.Function3
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    boolean z;
                    LocalPosLocalCashRedemptionViewModel localPosLocalCashRedemptionViewModel3;
                    Modifier.Companion companion;
                    long j3;
                    MutableState mutableState2;
                    boolean z2;
                    BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    boxWithConstraintsScopeImpl.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                    }
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                        float m3477toPx8Feqmps3 = DensityUtilsKt.m3477toPx8Feqmps(boxWithConstraintsScopeImpl.m258getMaxHeightD9Ej5fM(), gapComposer3);
                        Object rememberedValue2 = gapComposer3.rememberedValue();
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (rememberedValue2 == neverEqualPolicy) {
                            rememberedValue2 = Updater.mutableStateOf$default(Float.valueOf(m3477toPx8Feqmps3));
                            gapComposer3.updateRememberedValue(rememberedValue2);
                        }
                        final MutableState mutableState3 = (MutableState) rememberedValue2;
                        boolean changed = gapComposer3.changed(((Number) mutableState3.getValue()).floatValue());
                        Object rememberedValue3 = gapComposer3.rememberedValue();
                        if (changed || rememberedValue3 == neverEqualPolicy) {
                            rememberedValue3 = Float.valueOf(Math.max((m3477toPx8Feqmps3 - m3477toPx8Feqmps) / 2.0f, (m3477toPx8Feqmps3 - (((Number) mutableState3.getValue()).floatValue() > m3477toPx8Feqmps3 ? m3477toPx8Feqmps3 : ((Number) mutableState3.getValue()).floatValue())) + m3477toPx8Feqmps2));
                            gapComposer3.updateRememberedValue(rememberedValue3);
                        }
                        float floatValue = ((Number) rememberedValue3).floatValue();
                        Object rememberedValue4 = gapComposer3.rememberedValue();
                        if (rememberedValue4 == neverEqualPolicy) {
                            rememberedValue4 = AnimatableKt.Animatable(RecyclerView.DECELERATION_RATE, 0.01f);
                            gapComposer3.updateRememberedValue(rememberedValue4);
                        }
                        Animatable animatable = (Animatable) rememberedValue4;
                        Unit unit = Unit.INSTANCE;
                        boolean changedInstance = gapComposer3.changedInstance(animatable);
                        Object rememberedValue5 = gapComposer3.rememberedValue();
                        MutableState mutableState4 = mutableState;
                        if (changedInstance || rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new Hero3DCardViewKt$InteractiveCard$11$1(animatable, mutableState4, null, 1);
                            gapComposer3.updateRememberedValue(rememberedValue5);
                        }
                        Updater.LaunchedEffect(gapComposer3, unit, (Function2) rememberedValue5);
                        LocalPosLocalCashRedemptionViewModel localPosLocalCashRedemptionViewModel4 = LocalPosLocalCashRedemptionViewModel.this;
                        boolean z3 = localPosLocalCashRedemptionViewModel4.canUnlink;
                        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                        long j4 = j2;
                        final Function1 function13 = function1;
                        if (z3) {
                            gapComposer3.startReplaceGroup(828563171);
                            Object rememberedValue6 = gapComposer3.rememberedValue();
                            if (rememberedValue6 == neverEqualPolicy) {
                                rememberedValue6 = Updater.mutableStateOf$default(Boolean.FALSE);
                                gapComposer3.updateRememberedValue(rememberedValue6);
                            }
                            MutableState mutableState5 = (MutableState) rememberedValue6;
                            Modifier alpha = AlphaKt.alpha(SpacerKt.m298padding3ABfNKs(BoxScopeInstance.INSTANCE.align(companion2, Alignment.Companion.TopEnd), 24.0f), ((Number) animatable.getValue()).floatValue());
                            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                            int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, alpha);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                            if (gapComposer3.applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer3.startReusableNode();
                            if (gapComposer3.inserting) {
                                gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer3.useNode();
                            }
                            Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion2, 32.0f);
                            Object rememberedValue7 = gapComposer3.rememberedValue();
                            if (rememberedValue7 == neverEqualPolicy) {
                                rememberedValue7 = new TabContentViewKt$$ExternalSyntheticLambda1(9, mutableState5);
                                gapComposer3.updateRememberedValue(rememberedValue7);
                            }
                            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(m285size3ABfNKs, false, null, null, (Function0) rememberedValue7, 15);
                            companion = companion2;
                            mutableState2 = mutableState4;
                            localPosLocalCashRedemptionViewModel3 = localPosLocalCashRedemptionViewModel4;
                            Trace.m1191Iconww6aTOc(Icons.NavigationMore, (String) null, m183clickableoSLSa3U$default, j4, gapComposer3, 54, 0);
                            boolean booleanValue = ((Boolean) mutableState5.getValue()).booleanValue();
                            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f);
                            long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(0.15f, j4, 14);
                            Object rememberedValue8 = gapComposer3.rememberedValue();
                            if (rememberedValue8 == neverEqualPolicy) {
                                rememberedValue8 = new TabContentViewKt$$ExternalSyntheticLambda1(10, mutableState5);
                                gapComposer3.updateRememberedValue(rememberedValue8);
                            }
                            j3 = j4;
                            AndroidMenu_androidKt.m516DropdownMenuIlH_yew(booleanValue, (Function0) rememberedValue8, null, 0L, null, null, m340RoundedCornerShape0680j_4, m675copywmQWz5c$default, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(-1477010233, new LocalAddBrandsViewKt$$ExternalSyntheticLambda14(1, j4, function13), gapComposer3), gapComposer3, 48, 1852);
                            gapComposer3 = gapComposer3;
                            gapComposer3.end(true);
                            z = false;
                            gapComposer3.end(false);
                        } else {
                            z = false;
                            localPosLocalCashRedemptionViewModel3 = localPosLocalCashRedemptionViewModel4;
                            companion = companion2;
                            j3 = j4;
                            mutableState2 = mutableState4;
                            gapComposer3.startReplaceGroup(829699073);
                            gapComposer3.end(false);
                        }
                        LocalImage localImage2 = localPosLocalCashRedemptionViewModel3.brandImage;
                        if (localImage2 == null) {
                            gapComposer3.startReplaceGroup(829736117);
                            gapComposer3.end(z);
                        } else {
                            gapComposer3.startReplaceGroup(829736118);
                            Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(companion, 64.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, ((Density) gapComposer3.consume(CompositionLocalsKt.LocalDensity)).mo232toDpu2uoSUM(floatValue), 7), 264.0f);
                            Float ratio = LocalViewsKt.getRatio(localImage2);
                            if (ratio != null) {
                                z2 = 0;
                                m285size3ABfNKs2 = m285size3ABfNKs2.then(OffsetKt.aspectRatio(ratio.floatValue(), companion, false));
                            } else {
                                z2 = 0;
                            }
                            GapComposer gapComposer4 = gapComposer3;
                            ImageKt.Image(AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(z2, 30, gapComposer3, LocalViewsKt.getThemedUrl(localImage2, gapComposer3)), null, m285size3ABfNKs2, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, null, gapComposer4, 24624, 104);
                            gapComposer3 = gapComposer4;
                            gapComposer3.end(z2);
                        }
                        Boolean bool = (Boolean) mutableState2.getValue();
                        bool.getClass();
                        BiasAlignment biasAlignment2 = Alignment.Companion.Center;
                        Object rememberedValue9 = gapComposer3.rememberedValue();
                        if (rememberedValue9 == neverEqualPolicy) {
                            rememberedValue9 = new DateInputKt$$ExternalSyntheticLambda5(23, mutableState2);
                            gapComposer3.updateRememberedValue(rememberedValue9);
                        }
                        final LocalPosLocalCashRedemptionViewModel localPosLocalCashRedemptionViewModel5 = localPosLocalCashRedemptionViewModel3;
                        final long j5 = j3;
                        AnimatedContentKt.AnimatedContent(bool, companion, (Function1) rememberedValue9, biasAlignment2, null, null, Expect_jvmKt.rememberComposableLambda(-2040198780, new Function4() { // from class: app.cash.local.views.pos.LocalPosLocalCashRedemptionViewKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function4
                            public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                boolean booleanValue2 = ((Boolean) obj5).booleanValue();
                                Composer composer3 = (Composer) obj6;
                                ((Integer) obj7).getClass();
                                ((AnimatedContentScopeImpl) obj4).getClass();
                                if (booleanValue2) {
                                    GapComposer gapComposer5 = (GapComposer) composer3;
                                    gapComposer5.startReplaceGroup(-1479594071);
                                    Object rememberedValue10 = gapComposer5.rememberedValue();
                                    if (rememberedValue10 == Composer.Companion.Empty) {
                                        rememberedValue10 = new DateInputKt$$ExternalSyntheticLambda5(22, mutableState3);
                                        gapComposer5.updateRememberedValue(rememberedValue10);
                                    }
                                    Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue10);
                                    LocalPosLocalCashRedemptionViewModel localPosLocalCashRedemptionViewModel6 = localPosLocalCashRedemptionViewModel5;
                                    LocalPosCheckInViewKt.m1330RedeemExplanationsW7UJKQ(onGloballyPositioned, j5, localPosLocalCashRedemptionViewModel6.localCashAmount, localPosLocalCashRedemptionViewModel6.coupons, function13, gapComposer5, 6);
                                    gapComposer5.end(false);
                                } else {
                                    GapComposer gapComposer6 = (GapComposer) composer3;
                                    gapComposer6.startReplaceGroup(-1479235618);
                                    gapComposer6.end(false);
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer3), gapComposer3, 1576368, 48);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            gapComposer = gapComposer2;
            OffsetKt.BoxWithConstraints(statusBarsPadding, biasAlignment, false, rememberComposableLambda, gapComposer, 3120, 4);
        } else {
            function12 = function1;
            gapComposer = gapComposer2;
            localPosLocalCashRedemptionViewModel2 = localPosLocalCashRedemptionViewModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalPosLocalCashRedemptionViewKt$$ExternalSyntheticLambda1(modifier, localPosLocalCashRedemptionViewModel2, function12, i);
        }
    }

    /* renamed from: RedeemExplanation-sW7UJKQ, reason: not valid java name */
    public static final void m1330RedeemExplanationsW7UJKQ(Modifier modifier, long j, String str, ArrayList arrayList, Function1 function1, Composer composer, int i) {
        ArrayList arrayList2;
        long j2;
        Function1 function12;
        modifier.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(825597787);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(j) ? 32 : 16) | (gapComposer.changed(str) ? 256 : 128) | (gapComposer.changedInstance(arrayList) ? 2048 : 1024) | (gapComposer.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
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
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 24.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(ImageKt.m178borderxT4_qwU(m302paddingqDBjuR0$default, 1.0f, Color.m675copywmQWz5c$default(0.2f, colors.base.constantWhite, 14), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), 8.0f, 4.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Center, Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            String upperCase = Room.stringResource(gapComposer, R.string.local_views_linked).toUpperCase(Locale.ROOT);
            upperCase.getClass();
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            int i3 = ((i2 << 6) & 7168) | 48;
            Room.m1165Text25TpFw(0, 0, 0, 0, i3, 0, 4080, j, (Composer) gapComposer, (Modifier) companion, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).labelXSmall, (TextLineBalancing) null, upperCase, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, 7);
            gapComposer.startReplaceGroup(-627007906);
            String str2 = str + '\n' + Room.stringResource(gapComposer, R.string.local_views_pos_buyer_flow_local_cash_title);
            gapComposer.end(false);
            Room.m1165Text25TpFw(0, 0, 0, 0, i3, 0, 4080, j, (Composer) gapComposer, m302paddingqDBjuR0$default2, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).headlineSmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
            Room.m1165Text25TpFw(0, 0, 0, 0, i3, 0, 4080, j, (Composer) gapComposer, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7), ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodyMedium, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_pos_buyer_flow_explanation), (Map) null, (Function1) null, false);
            j2 = j;
            gapComposer.end(true);
            PaddingValuesImpl paddingValuesImpl = new PaddingValuesImpl(24.0f, 8.0f, 24.0f, 8.0f);
            Arrangement$SpacedAligned arrangement$SpacedAligned = new Arrangement$SpacedAligned(16.0f, false, null);
            arrayList2 = arrayList;
            boolean changedInstance = gapComposer.changedInstance(arrayList2) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new LocalMapPinKt$$ExternalSyntheticLambda5(arrayList2, j2, 3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyRow(companion, null, paddingValuesImpl, arrangement$SpacedAligned, null, null, false, null, (Function1) rememberedValue, gapComposer, 24966, 490);
            function12 = function1;
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(-1329001245, new BrandSheetViewKt$$ExternalSyntheticLambda6(8, function12), gapComposer), gapComposer, 24582, 14);
            gapComposer.end(true);
        } else {
            arrayList2 = arrayList;
            j2 = j;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DateFilterChipKt$$ExternalSyntheticLambda0(modifier, j2, str, arrayList2, function12, i);
        }
    }
}
