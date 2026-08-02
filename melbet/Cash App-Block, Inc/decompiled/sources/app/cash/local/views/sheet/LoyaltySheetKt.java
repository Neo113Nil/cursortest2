package app.cash.local.views.sheet;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.constraintlayout.compose.ConstraintLayoutScope;
import androidx.constraintlayout.compose.ConstraintSetForInlineDsl;
import androidx.constraintlayout.compose.Measurer2;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.compose.NavHostKt$NavHost$33$1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuHours;
import app.cash.local.primitives.MenuHoursKt;
import app.cash.local.viewmodels.LocalBrandLocationsBottomSheetModel$Location;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.viewmodels.LocationStatus;
import app.cash.local.viewmodels.internal.MiniCardModel;
import app.cash.local.viewmodels.sheet.EducationalSheetModel;
import app.cash.local.viewmodels.sheet.EducationalSheetModelList;
import app.cash.local.viewmodels.sheet.LoyaltySheetModel;
import app.cash.local.viewmodels.sheet.MenuPickerSheetModel;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda9;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.internal.ProgressBarKt;
import app.cash.local.views.internal.dropdown.LocalDropdownItemKt;
import app.cash.local.views.internal.dropdown.LocalDropdownItemModel;
import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda0;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.views.ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1;
import app.cash.redwood.CombinedModifier$$ExternalSyntheticLambda0;
import bo.app.n3$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import coil3.compose.internal.UtilsKt$$ExternalSyntheticLambda0;
import coil3.size.SizeKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.mikepenz.markdown.compose.MarkdownKt$$ExternalSyntheticLambda2;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Fonts;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda14;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$3;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4;
import com.squareup.cash.profile.views.BadgeNameKt$$ExternalSyntheticLambda1;
import com.squareup.cash.sheet.PinnedKt;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.sheet.RealSheetState$peek$3;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.sheet.SheetPeekPosition$FixedHeight;
import com.squareup.cash.sheet.SheetPosition;
import com.squareup.cash.sheet.SheetStateKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda16;
import com.squareup.cash.tax.views.TaxAuthorizationView$Content$1$1;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalText;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.internal.Tags;
import okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes3.dex */
public abstract class LoyaltySheetKt {
    public static final ComposableLambdaImpl lambda$1951201603 = new ComposableLambdaImpl(new ComposableSingletons$PasscodeViewFactoryKt$$ExternalSyntheticLambda1(4), false, 1951201603);

    public static final void EducationalButton(Modifier modifier, EducationalSheetModel.Button button, int i, Function1 function1, boolean z, boolean z2, Composer composer, int i2) {
        button.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1104411942);
        int i3 = i2 | (gapComposer.changedInstance(button) ? 32 : 16) | (gapComposer.changed(i) ? 256 : 128) | (gapComposer.changedInstance(function1) ? 2048 : 1024) | (gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(z2) ? PKIFailureInfo.unsupportedVersion : 65536);
        int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1357159313, new EducationalSheetKt$$ExternalSyntheticLambda8(z2, modifier, button, i4), gapComposer);
            boolean changedInstance = ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | gapComposer.changedInstance(button);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new Http2Connection$$ExternalSyntheticLambda3(function1, i, button, 3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            EducationalSheetModel.Button.Style style = button.style;
            boolean z3 = button.enabled;
            int ordinal = style.ordinal();
            if (ordinal == 0) {
                gapComposer.startReplaceGroup(-2086178063);
                SizeKt.ButtonCta(function0, modifier, ButtonProminence.PROMINENT, false, !z && z3, null, rememberComposableLambda, gapComposer, 1573296, 40);
                gapComposer.end(false);
            } else {
                if (ordinal != 1) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -482939202, false);
                }
                gapComposer.startReplaceGroup(-2085963822);
                SizeKt.ButtonCta(function0, modifier, ButtonProminence.STANDARD, false, !z && z3, null, rememberComposableLambda, gapComposer, 1573296, 40);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EducationalSheetKt$$ExternalSyntheticLambda10(modifier, button, i, function1, z, z2, i2);
        }
    }

    public static final void EducationalHeroImage(Modifier modifier, EducationalSheetModel.Image.HeroImage heroImage, Composer composer, int i) {
        Modifier modifier2;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2012929072);
        int i2 = i | 48 | (gapComposer.changedInstance(heroImage) ? 256 : 128);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = heroImage.bleed;
            LocalImage localImage = heroImage.image;
            ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = ContentScale.Companion.FillWidth;
            Color color = null;
            modifier2 = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(836724674);
                gapComposer.startReplaceGroup(1689559457);
                float mo233toDpu2uoSUM = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo233toDpu2uoSUM((int) (((LazyWindowInfo) ((WindowInfo) gapComposer.consume(CompositionLocalsKt.LocalWindowInfo))).m939getContainerSizeYbymL2g() >> 32));
                gapComposer.end(false);
                if (1.0f <= 0.0d) {
                    InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                }
                Modifier m290width3ABfNKs = androidx.compose.foundation.layout.SizeKt.m290width3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentSize$default(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, 1), mo233toDpu2uoSUM);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m290width3ABfNKs);
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
                Modifier m290width3ABfNKs2 = androidx.compose.foundation.layout.SizeKt.m290width3ABfNKs(androidx.compose.foundation.layout.SizeKt.wrapContentWidth$default(modifier2, null, 1), mo233toDpu2uoSUM);
                Float ratio = LocalViewsKt.getRatio(localImage);
                if (ratio != null) {
                    m290width3ABfNKs2 = m290width3ABfNKs2.then(OffsetKt.aspectRatio(ratio.floatValue(), modifier2, false));
                }
                LocalColor localColor = localImage.placeholder_color;
                if (localColor == null) {
                    gapComposer.startReplaceGroup(492169090);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(847160415);
                    color = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, LocalViewsKt.toComposeColor(localColor, gapComposer, 0));
                }
                if (color != null) {
                    m290width3ABfNKs2 = m290width3ABfNKs2.then(ImageKt.m177backgroundbw27NRU(modifier2, color.value, ColorKt.RectangleShape));
                }
                LocalMapKt.LocalAsyncImage(m290width3ABfNKs2, null, LocalViewsKt.getThemedUrl(localImage, gapComposer), contentScale$Companion$Fit$1, null, null, null, gapComposer, 3072, 114);
                gapComposer.end(true);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(837416501);
                Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifier2, 1.0f);
                Float ratio2 = LocalViewsKt.getRatio(localImage);
                if (ratio2 != null) {
                    fillMaxWidth = fillMaxWidth.then(OffsetKt.aspectRatio(ratio2.floatValue(), modifier2, false));
                }
                Modifier modifier3 = fillMaxWidth;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                Object obj = DefaultSizes.border.entries;
                Modifier clip = ClipKt.clip(m302paddingqDBjuR0$default, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                LocalColor localColor2 = localImage.placeholder_color;
                if (localColor2 == null) {
                    gapComposer.startReplaceGroup(837749409);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1689592160);
                    color = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, LocalViewsKt.toComposeColor(localColor2, gapComposer, 0));
                }
                if (color == null) {
                    gapComposer.startReplaceGroup(1689594486);
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
                    gapComposer.startReplaceGroup(1689591262);
                    gapComposer.end(false);
                    j = color.value;
                }
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                LocalMapKt.LocalAsyncImage(ImageKt.m177backgroundbw27NRU(clip, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), null, LocalViewsKt.getThemedUrl(localImage, gapComposer), contentScale$Companion$Fit$1, null, null, null, gapComposer, 3072, 114);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuPickerSheetKt$$ExternalSyntheticLambda4(modifier2, heroImage, i, i3);
        }
    }

    public static final void EducationalMiniCard(Modifier modifier, MiniCardModel miniCardModel, Composer composer, int i) {
        Modifier modifier2;
        String str;
        long j;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(269738991);
        int i2 = i | 6 | (gapComposer.changedInstance(miniCardModel) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            LocalImage localImage = miniCardModel.image;
            Color color = null;
            if (localImage == null) {
                gapComposer.startReplaceGroup(-89297527);
                gapComposer.end(false);
                str = null;
            } else {
                gapComposer.startReplaceGroup(1521140088);
                String themedUrl = LocalViewsKt.getThemedUrl(localImage, gapComposer);
                gapComposer.end(false);
                str = themedUrl;
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            modifier2 = companion;
            Modifier m277height3ABfNKs = androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(androidx.compose.foundation.layout.SizeKt.m290width3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 6.0f, 7), 60.0f), 72.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(ImageKt.m177backgroundbw27NRU(m277height3ABfNKs, colors.semantic.background.f1047app, RoundedCornerShapeKt.m342RoundedCornerShapea9UjIt4$default(RecyclerView.DECELERATION_RATE, 12.0f, 13)), RecyclerView.DECELERATION_RATE, 8.0f, 8.0f, RecyclerView.DECELERATION_RATE, 9);
            LocalColor localColor = miniCardModel.color;
            if (localColor == null) {
                gapComposer.startReplaceGroup(-88905470);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1521152735);
                color = Recorder$$ExternalSyntheticOutline1.m(gapComposer, false, LocalViewsKt.toComposeColor(localColor, gapComposer, 0));
            }
            if (color == null) {
                gapComposer.startReplaceGroup(1521154613);
                Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.background.subtle;
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1521152381);
                gapComposer.end(false);
                j = color.value;
            }
            LocalMapKt.LocalAsyncImage(Request$Priority$EnumUnboxingLocalUtility.m(12.0f, m302paddingqDBjuR0$default, j, 4.0f), null, str, ContentScale.Companion.Fit, null, null, null, gapComposer, 3072, 114);
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalMapKt$$ExternalSyntheticLambda9(modifier2, miniCardModel, i, 29);
        }
    }

    public static final void EducationalSheetColumn(Modifier modifier, EducationalSheetModelList educationalSheetModelList, Function1 function1, RealSheetState realSheetState, Composer composer, int i) {
        int i2;
        RealSheetState realSheetState2;
        GapComposer gapComposer;
        int i3;
        Object navHostKt$NavHost$33$1;
        NeverEqualPolicy neverEqualPolicy;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        Integer num;
        DefaultPagerState defaultPagerState;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        MutableState mutableState;
        EducationalSheetModelList educationalSheetModelList2;
        Modifier.Companion companion;
        Object n3__externalsyntheticlambda0;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        int i4;
        NeverEqualPolicy neverEqualPolicy2;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2;
        int i5;
        EducationalSheetModelList educationalSheetModelList3;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        String str;
        Modifier wrapContentHeight;
        int i6;
        Modifier.Companion companion2;
        int i7;
        int i8;
        BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
        educationalSheetModelList.getClass();
        function1.getClass();
        realSheetState.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1520643557);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(educationalSheetModelList) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(realSheetState) ? 2048 : 1024;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy3) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            if (realSheetState.getSettledPosition() == SheetPosition.Expanded) {
                mutableState2.setValue(Boolean.TRUE);
            }
            List list = educationalSheetModelList.sheets;
            Continuation continuation = null;
            if (!((EducationalSheetModel) CollectionsKt.first(list)).forceExpansion || ((Boolean) mutableState2.getValue()).booleanValue()) {
                gapComposer2.startReplaceGroup(-1822393155);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-1822445049);
                Unit unit = Unit.INSTANCE;
                boolean z = (i2 & 7168) == 2048;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (z || rememberedValue2 == neverEqualPolicy3) {
                    rememberedValue2 = new RealSheetState$peek$3(realSheetState, continuation, 7);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue2);
                gapComposer2.end(false);
            }
            if (((Boolean) mutableState2.getValue()).booleanValue()) {
                gapComposer2.startReplaceGroup(-1822365875);
                Unit unit2 = Unit.INSTANCE;
                boolean z2 = (i2 & 896) == 256;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (z2 || rememberedValue3 == neverEqualPolicy3) {
                    rememberedValue3 = new TaxAuthorizationView$Content$1$1(function1, (Continuation) null, 1);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                Updater.LaunchedEffect(gapComposer2, unit2, (Function2) rememberedValue3);
                i3 = 0;
                gapComposer2.end(false);
            } else {
                i3 = 0;
                gapComposer2.startReplaceGroup(-1822288995);
                gapComposer2.end(false);
            }
            Modifier testTag = TestTagKt.testTag(modifier, "EducationalSheetTestTag");
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.Start, gapComposer2, i3);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, testTag);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer2.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$16);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$17);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$18);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$19);
            boolean changedInstance = gapComposer2.changedInstance(educationalSheetModelList);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy3) {
                rememberedValue4 = new Worker$$ExternalSyntheticLambda0(educationalSheetModelList, 28);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            DefaultPagerState rememberPagerState = PagerStateKt.rememberPagerState(0, (Function0) rememberedValue4, gapComposer2, 0, 3);
            boolean changed = gapComposer2.changed((EducationalSheetModel) CollectionsKt.first(list));
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed || rememberedValue5 == neverEqualPolicy3) {
                rememberedValue5 = Updater.mutableStateOf$default(((EducationalSheetModel) CollectionsKt.first(list)).primaryButton);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState3 = (MutableState) rememberedValue5;
            Object rememberedValue6 = gapComposer2.rememberedValue();
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = (ParcelableSnapshotMutableIntState) (rememberedValue6 == neverEqualPolicy3 ? Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2) : rememberedValue6);
            int i9 = i2;
            boolean changedInstance2 = gapComposer2.changedInstance(educationalSheetModelList) | ((i2 & 896) == 256);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue7 == neverEqualPolicy3) {
                rememberedValue7 = new UtilsKt$$ExternalSyntheticLambda0(5, function1, educationalSheetModelList, parcelableSnapshotMutableIntState3);
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            Function1 function12 = (Function1) rememberedValue7;
            Integer valueOf2 = Integer.valueOf(parcelableSnapshotMutableIntState3.getIntValue());
            boolean changed2 = gapComposer2.changed(function12) | gapComposer2.changed(mutableState3) | gapComposer2.changedInstance(educationalSheetModelList) | gapComposer2.changed(rememberPagerState);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue8 == neverEqualPolicy3) {
                neverEqualPolicy = neverEqualPolicy3;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$19;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$18;
                num = valueOf2;
                navHostKt$NavHost$33$1 = new NavHostKt$NavHost$33$1(function12, educationalSheetModelList, rememberPagerState, parcelableSnapshotMutableIntState3, mutableState3, (Continuation) null, 2);
                defaultPagerState = rememberPagerState;
                parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState3;
                mutableState = mutableState3;
                function12 = function12;
                educationalSheetModelList2 = educationalSheetModelList;
                gapComposer2.updateRememberedValue(navHostKt$NavHost$33$1);
            } else {
                parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState3;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                mutableState = mutableState3;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$19;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$18;
                educationalSheetModelList2 = educationalSheetModelList;
                neverEqualPolicy = neverEqualPolicy3;
                navHostKt$NavHost$33$1 = rememberedValue8;
                defaultPagerState = rememberPagerState;
                num = valueOf2;
            }
            Updater.LaunchedEffect(gapComposer2, num, (Function2) navHostKt$NavHost$33$1);
            boolean z3 = educationalSheetModelList2.showProgressBar;
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            if (z3) {
                gapComposer2.startReplaceGroup(1271382897);
                companion = companion3;
                ProgressBarKt.ProgressBar(list.size(), parcelableSnapshotMutableIntState.getIntValue(), 0, gapComposer2, Request$Priority$EnumUnboxingLocalUtility.m(horizontal, SpacerKt.m302paddingqDBjuR0$default(companion3, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14.0f, 7)));
                gapComposer2.end(false);
            } else {
                companion = companion3;
                gapComposer2.startReplaceGroup(1271568401);
                SpacerKt.Spacer(gapComposer2, androidx.compose.foundation.layout.SizeKt.fillMaxWidth(androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion, 17.0f), 1.0f));
                gapComposer2.end(false);
            }
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (rememberedValue9 == neverEqualPolicy) {
                rememberedValue9 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue9);
            }
            MutableState mutableState4 = (MutableState) rememberedValue9;
            Object rememberedValue10 = gapComposer2.rememberedValue();
            if (rememberedValue10 == neverEqualPolicy) {
                rememberedValue10 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue10);
            }
            MutableState mutableState5 = (MutableState) rememberedValue10;
            mutableState5.setValue(Boolean.valueOf(((Boolean) mutableState5.getValue()).booleanValue() || (((Boolean) mutableState2.getValue()).booleanValue() && !((Boolean) mutableState4.getValue()).booleanValue())));
            boolean z4 = !((Boolean) mutableState5.getValue()).booleanValue() && ((EducationalSheetModel) CollectionsKt.first(list)).requiresFullScroll && ((Boolean) mutableState4.getValue()).booleanValue();
            LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
            Function1 function13 = function12;
            Modifier.Companion companion4 = companion;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1929639242, new TabToolbarsKt$$ExternalSyntheticLambda16(educationalSheetModelList2, realSheetState, mutableState4, function13, 1), gapComposer2);
            NeverEqualPolicy neverEqualPolicy4 = neverEqualPolicy;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$110 = composeUiNode$Companion$SetModifier$1;
            MutableState mutableState6 = mutableState;
            PagerKt.m330VerticalPager8jOkeI(defaultPagerState, layoutWeightElement, null, null, null, null, false, null, null, null, rememberComposableLambda, gapComposer2, 100663296);
            Object rememberedValue11 = gapComposer2.rememberedValue();
            if (rememberedValue11 == neverEqualPolicy4) {
                rememberedValue11 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer2);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = (ParcelableSnapshotMutableIntState) rememberedValue11;
            String str2 = ((EducationalSheetModel) CollectionsKt.first(list)).expandNudgeText;
            Modifier pinned = PinnedKt.pinned(companion4, realSheetState);
            int i10 = i9 & 7168;
            boolean changed3 = gapComposer2.changed(str2) | (i10 == 2048);
            Object rememberedValue12 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue12 == neverEqualPolicy4) {
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$110;
                i4 = i10;
                neverEqualPolicy2 = neverEqualPolicy4;
                parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState4;
                i5 = 3;
                educationalSheetModelList3 = educationalSheetModelList;
                composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$16;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                n3__externalsyntheticlambda0 = new n3$$ExternalSyntheticLambda0(str2, realSheetState, mutableState2, parcelableSnapshotMutableIntState2, 14);
                str = str2;
                gapComposer2.updateRememberedValue(n3__externalsyntheticlambda0);
            } else {
                i4 = i10;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$110;
                n3__externalsyntheticlambda0 = rememberedValue12;
                neverEqualPolicy2 = neverEqualPolicy4;
                parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState4;
                str = str2;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                i5 = 3;
                educationalSheetModelList3 = educationalSheetModelList;
                composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$16;
            }
            Modifier offset = OffsetKt.offset(pinned, (Function1) n3__externalsyntheticlambda0);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 48);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, offset);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$14);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$111 = composeUiNode$Companion$SetModifier$13;
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ownerSnapshotObserver$onCommitAffectingLayout$1;
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$111, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$13);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$12);
            wrapContentHeight = androidx.compose.foundation.layout.SizeKt.wrapContentHeight(companion4, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(wrapContentHeight, 1.0f);
            EducationalSheetModel.Button button = (EducationalSheetModel.Button) mutableState6.getValue();
            int intValue = parcelableSnapshotMutableIntState.getIntValue();
            boolean z5 = educationalSheetModelList3.workingAsync;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$112 = composeUiNode$Companion$SetModifier$15;
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState5 = parcelableSnapshotMutableIntState2;
            gapComposer = gapComposer2;
            realSheetState2 = realSheetState;
            NeverEqualPolicy neverEqualPolicy5 = neverEqualPolicy2;
            EducationalButton(fillMaxWidth, button, intValue, function13, z4, z5, gapComposer, 6);
            Object rememberedValue13 = gapComposer.rememberedValue();
            if (rememberedValue13 == neverEqualPolicy5) {
                rememberedValue13 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue13);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue13;
            gapComposer.startReplaceGroup(468265874);
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
            if (str == null || ((Boolean) mutableState2.getValue()).booleanValue()) {
                i6 = i4;
                companion2 = companion4;
                i7 = 2048;
            } else {
                Object rememberedValue14 = gapComposer.rememberedValue();
                if (rememberedValue14 == neverEqualPolicy5) {
                    rememberedValue14 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue14;
                i6 = i4;
                i7 = 2048;
                boolean changed4 = gapComposer.changed(function13) | gapComposer.changedInstance(coroutineScope) | (i6 == 2048);
                Object rememberedValue15 = gapComposer.rememberedValue();
                if (changed4 || rememberedValue15 == neverEqualPolicy5) {
                    rememberedValue15 = new EducationalSheetKt$$ExternalSyntheticLambda4(function13, coroutineScope, realSheetState2);
                    gapComposer.updateRememberedValue(rememberedValue15);
                }
                companion2 = companion4;
                m302paddingqDBjuR0$default = m302paddingqDBjuR0$default.then(ImageKt.m182clickableO2vRcR0$default(companion4, mutableInteractionSourceImpl, null, false, null, null, (Function0) rememberedValue15, 28));
            }
            gapComposer.end(false);
            Object rememberedValue16 = gapComposer.rememberedValue();
            if (rememberedValue16 == neverEqualPolicy5) {
                i8 = 5;
                rememberedValue16 = new MoneyTabUIKt$$ExternalSyntheticLambda14(5, parcelableSnapshotMutableIntState5);
                gapComposer.updateRememberedValue(rememberedValue16);
            } else {
                i8 = 5;
            }
            Modifier onSizeChanged = RulerKt.onSizeChanged(m302paddingqDBjuR0$default, (Function1) rememberedValue16);
            boolean z6 = i6 == i7;
            Object rememberedValue17 = gapComposer.rememberedValue();
            if (z6 || rememberedValue17 == neverEqualPolicy5) {
                rememberedValue17 = new CombinedModifier$$ExternalSyntheticLambda0(2, realSheetState2, mutableState2);
                gapComposer.updateRememberedValue(rememberedValue17);
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(onSizeChanged, (Function1) rememberedValue17);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, graphicsLayer);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$112);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$14);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$111, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$13);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$12);
            if (str != null) {
                gapComposer.startReplaceGroup(-280378770);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).linkMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                Modifier m285size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(companion2, 16.0f);
                Painter painter = Icons.Collapse24.painter(gapComposer);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j = colors.semantic.icon.prominent;
                ImageKt.Image(painter, null, m285size3ABfNKs, null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, i8, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(i8))), gapComposer, Painter.$stable | 25008, 40);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-279990092);
                Room.m1165Text25TpFw(0, 0, 0, 0, 54, 0, 4088, 0L, (Composer) gapComposer, AlphaKt.alpha(companion2, RecyclerView.DECELERATION_RATE), ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).linkMedium, (TextLineBalancing) null, "", (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(true);
            SpacerKt.Spacer(gapComposer, androidx.compose.foundation.layout.SizeKt.m277height3ABfNKs(companion2, 32.0f));
            gapComposer.end(true);
        } else {
            realSheetState2 = realSheetState;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda0(modifier, educationalSheetModelList, function1, realSheetState2, i, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EducationalText(Modifier modifier, EducationalSheetModel.Text text, int i, Function1 function1, Composer composer, int i2, int i3) {
        int i4;
        Modifier modifier2;
        Function1 function12;
        int i5;
        GapComposer gapComposer;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        TextStyle textStyle;
        EducationalSheetModel.Text.Style style = text.style;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1068284492);
        int i6 = i2 & 6;
        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
        if (i6 == 0) {
            i4 = (gapComposer2.changed(columnScopeInstance) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 1;
        if (i7 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer2.changed(modifier2) ? 32 : 16;
            if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
                i4 |= gapComposer2.changedInstance(text) ? 256 : 128;
            }
            if ((i2 & 3072) == 0) {
                i4 |= gapComposer2.changed(i) ? 2048 : 1024;
            }
            if ((i2 & 24576) != 0) {
                function12 = function1;
                i4 |= gapComposer2.changedInstance(function12) ? 16384 : PKIFailureInfo.certRevoked;
            } else {
                function12 = function1;
            }
            i5 = i4;
            if (gapComposer2.shouldExecute(i5 & 1, (i5 & 9363) == 9362)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
            } else {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (i7 != 0) {
                    modifier2 = companion;
                }
                int ordinal = style.ordinal();
                if (ordinal == 0) {
                    gapComposer2.startReplaceGroup(124220368);
                    textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).hero;
                    gapComposer2.end(false);
                } else if (ordinal == 1) {
                    gapComposer2.startReplaceGroup(124223641);
                    textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).keypadNumbers;
                    gapComposer2.end(false);
                } else if (ordinal == 2) {
                    gapComposer2.startReplaceGroup(124225269);
                    textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                    gapComposer2.end(false);
                } else if (ordinal == 3) {
                    gapComposer2.startReplaceGroup(124222006);
                    textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyMedium;
                    gapComposer2.end(false);
                } else if (ordinal == 4) {
                    gapComposer2.startReplaceGroup(124229261);
                    textStyle = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall, 0L, 0L, null, Fonts.CashSans, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183);
                    gapComposer2.end(false);
                } else {
                    if (ordinal != 5) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 124218882, false);
                    }
                    gapComposer2.startReplaceGroup(124227158);
                    textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
                    gapComposer2.end(false);
                }
                modifier3 = modifier2;
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(550713627, new EducationalSheetKt$$ExternalSyntheticLambda18(modifier3, text, function12, i, textStyle, 0), gapComposer2);
                if (style == EducationalSheetModel.Text.Style.BRANDED_FOOTNOTE) {
                    gapComposer2.startReplaceGroup(-443175196);
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion);
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
                    Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    Modifier m285size3ABfNKs = androidx.compose.foundation.layout.SizeKt.m285size3ABfNKs(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 6.0f, 7), 16.0f);
                    Painter painter = Icons.CashAppCustomer16.painter(gapComposer2);
                    Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    long j = colors.semantic.icon.standard;
                    ImageKt.Image(painter, null, m285size3ABfNKs, null, ContentScale.Companion.None, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable | 25008, 40);
                    gapComposer = gapComposer2;
                    Recorder$$ExternalSyntheticOutline1.m(54, rememberComposableLambda, columnScopeInstance, gapComposer, true);
                    gapComposer.end(false);
                } else {
                    gapComposer = gapComposer2;
                    gapComposer.startReplaceGroup(-442843837);
                    Recorder$$ExternalSyntheticOutline1.m((i5 & 14) | 48, rememberComposableLambda, columnScopeInstance, gapComposer, false);
                }
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new BadgeNameKt$$ExternalSyntheticLambda1(modifier3, text, i, function1, i2, i3, 3);
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
        }
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) != 0) {
        }
        i5 = i4;
        if (gapComposer2.shouldExecute(i5 & 1, (i5 & 9363) == 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void EducationalTiledHeroImage(Modifier modifier, EducationalSheetModel.Image.TiledHeroImage tiledHeroImage, int i, Function1 function1, Composer composer, int i2, int i3) {
        Modifier modifier2;
        int i4;
        Function1 function12;
        Modifier wrapContentHeight;
        ConstraintLayoutScope constraintLayoutScope;
        MutableState mutableState;
        ConstraintSetForInlineDsl constraintSetForInlineDsl;
        MutableState mutableState2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(651611744);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            modifier2 = modifier;
        } else if ((i2 & 6) == 0) {
            modifier2 = modifier;
            i4 = (gapComposer.changed(modifier2) ? 4 : 2) | i2;
        } else {
            modifier2 = modifier;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer.changedInstance(tiledHeroImage) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            function12 = function1;
            i4 |= gapComposer.changedInstance(function12) ? 2048 : 1024;
        } else {
            function12 = function1;
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            Modifier modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            String themedUrl = LocalViewsKt.getThemedUrl(tiledHeroImage.heroImage, gapComposer);
            wrapContentHeight = androidx.compose.foundation.layout.SizeKt.wrapContentHeight(SpacerKt.m300paddingVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifier3, 1.0f), RecyclerView.DECELERATION_RATE, 18.0f, 1), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            gapComposer.startReplaceGroup(-1003410150);
            gapComposer.startReplaceGroup(212064437);
            gapComposer.end(false);
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = new Measurer2(density);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Measurer2 measurer2 = (Measurer2) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = new ConstraintLayoutScope();
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            ConstraintLayoutScope constraintLayoutScope2 = (ConstraintLayoutScope) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState3 = (MutableState) rememberedValue3;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = new ConstraintSetForInlineDsl(constraintLayoutScope2);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            ConstraintSetForInlineDsl constraintSetForInlineDsl2 = (ConstraintSetForInlineDsl) rememberedValue4;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == obj) {
                Object parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(Unit.INSTANCE, NeverEqualPolicy.INSTANCE);
                gapComposer.updateRememberedValue(parcelableSnapshotMutableState);
                rememberedValue5 = parcelableSnapshotMutableState;
            }
            MutableState mutableState4 = (MutableState) rememberedValue5;
            boolean changedInstance = gapComposer.changedInstance(measurer2) | gapComposer.changed(EnumC0170g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue6 == obj) {
                rememberedValue6 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$2(mutableState4, measurer2, constraintSetForInlineDsl2, mutableState3, 1);
                constraintLayoutScope = constraintLayoutScope2;
                mutableState = mutableState4;
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState2 = mutableState3;
                gapComposer.updateRememberedValue(rememberedValue6);
            } else {
                constraintLayoutScope = constraintLayoutScope2;
                mutableState = mutableState4;
                constraintSetForInlineDsl = constraintSetForInlineDsl2;
                mutableState2 = mutableState3;
            }
            MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue6;
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (rememberedValue7 == obj) {
                rememberedValue7 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$3(mutableState2, constraintSetForInlineDsl, 1);
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            Function0 function0 = (Function0) rememberedValue7;
            boolean changedInstance2 = gapComposer.changedInstance(measurer2);
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue8 == obj) {
                rememberedValue8 = new QuickPayViewKt$QuickPay$lambda$4$0$$inlined$ConstraintLayout$4(measurer2, 1);
                gapComposer.updateRememberedValue(rememberedValue8);
            }
            RulerKt.MultiMeasureLayout(SemanticsModifierKt.semantics(wrapContentHeight, false, (Function1) rememberedValue8), Expect_jvmKt.rememberComposableLambda(1200550679, new AnimatedVisibilityKt$AnimatedVisibility$13(mutableState, constraintLayoutScope, function0, tiledHeroImage, themedUrl, function12, i), gapComposer), measurePolicy, gapComposer, 48);
            gapComposer.end(false);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeNameKt$$ExternalSyntheticLambda1(modifier2, tiledHeroImage, i, function1, i2, i3, 2);
        }
    }

    /* renamed from: FulfillmentOptionsMenu-IBZr-mw, reason: not valid java name */
    public static final void m1331FulfillmentOptionsMenuIBZrmw(Modifier modifier, final Function1 function1, final LocalBrandProfileViewModel.FulfillmentOptionsMenuModel fulfillmentOptionsMenuModel, final long j, Composer composer, final int i) {
        Function1 function12;
        LocalBrandProfileViewModel.FulfillmentOptionsMenuModel fulfillmentOptionsMenuModel2;
        final Modifier modifier2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        Modifier modifier3;
        int i2;
        boolean z;
        boolean z2 = fulfillmentOptionsMenuModel.canGetDirections;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-918022341);
        int i3 = i | 6 | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(fulfillmentOptionsMenuModel) ? 256 : 128) | (gapComposer.changed(false) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                modifier3 = Modifier.Companion.$$INSTANCE;
            } else {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier;
            }
            gapComposer.endDefaults();
            boolean z3 = fulfillmentOptionsMenuModel.canResetFulfillmentToAsap;
            boolean z4 = fulfillmentOptionsMenuModel.canScheduleOrder;
            boolean z5 = fulfillmentOptionsMenuModel.canChangeTable;
            boolean z6 = fulfillmentOptionsMenuModel.canChangeFulfillment;
            if (!z2 && !z6 && !z5 && !z4 && !z3) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    final int i4 = 0;
                    function2 = new Function2(modifier4, function1, fulfillmentOptionsMenuModel, j, i, i4) { // from class: app.cash.local.views.sheet.FulfillmentOptionsMenuKt$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ Modifier f$0;
                        public final /* synthetic */ Function1 f$1;
                        public final /* synthetic */ LocalBrandProfileViewModel.FulfillmentOptionsMenuModel f$2;
                        public final /* synthetic */ long f$3;

                        {
                            this.$r8$classId = i4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.$r8$classId) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags = Updater.updateChangedFlags(3073);
                                    LoyaltySheetKt.m1331FulfillmentOptionsMenuIBZrmw(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int updateChangedFlags2 = Updater.updateChangedFlags(3073);
                                    LoyaltySheetKt.m1331FulfillmentOptionsMenuIBZrmw(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags2);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            function12 = function1;
            fulfillmentOptionsMenuModel2 = fulfillmentOptionsMenuModel;
            Modifier modifier5 = modifier3;
            boolean z7 = (i3 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z7 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda1(4, function12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function1 function13 = (Function1) rememberedValue;
            gapComposer.startReplaceGroup(-1751157857);
            ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
            if (z2) {
                gapComposer.startReplaceGroup(235895275);
                String stringResource = Room.stringResource(gapComposer, R.string.local_views_more_options_get_directions);
                LocalDropdownItemModel.IconState.WithIcon withIcon = new LocalDropdownItemModel.IconState.WithIcon(Icons.Map24);
                boolean changed = gapComposer.changed(function13);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new BrandSheetViewKt$$ExternalSyntheticLambda0(14, function13);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                i2 = i3;
                createListBuilder.add(new LocalDropdownItemModel(stringResource, withIcon, (Function0) rememberedValue2, 2));
                gapComposer.end(false);
            } else {
                i2 = i3;
                gapComposer.startReplaceGroup(236160511);
                gapComposer.end(false);
            }
            if (z6) {
                gapComposer.startReplaceGroup(236209801);
                String str = fulfillmentOptionsMenuModel2.changeFulfillmentLabel;
                LocalDropdownItemModel.IconState.WithIcon withIcon2 = new LocalDropdownItemModel.IconState.WithIcon(Icons.Location24);
                boolean changed2 = gapComposer.changed(function13);
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new BrandSheetViewKt$$ExternalSyntheticLambda0(15, function13);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                createListBuilder.add(new LocalDropdownItemModel(str, withIcon2, (Function0) rememberedValue3, 2));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(236446207);
                gapComposer.end(false);
            }
            if (z4) {
                gapComposer.startReplaceGroup(236492304);
                String stringResource2 = Room.stringResource(gapComposer, R.string.local_views_schedule_order);
                LocalDropdownItemModel.IconState.WithIcon withIcon3 = new LocalDropdownItemModel.IconState.WithIcon(Icons.Date24);
                boolean changed3 = gapComposer.changed(function13);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changed3 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new BrandSheetViewKt$$ExternalSyntheticLambda0(16, function13);
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                createListBuilder.add(new LocalDropdownItemModel(stringResource2, withIcon3, (Function0) rememberedValue4, 2));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(236752735);
                gapComposer.end(false);
            }
            if (z5) {
                gapComposer.startReplaceGroup(236797034);
                String stringResource3 = Room.stringResource(gapComposer, R.string.local_views_change_table);
                LocalDropdownItemModel.IconState.WithIcon withIcon4 = new LocalDropdownItemModel.IconState.WithIcon(Icons.NavigationScanQr);
                boolean changed4 = gapComposer.changed(function13);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changed4 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new BrandSheetViewKt$$ExternalSyntheticLambda0(17, function13);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                createListBuilder.add(new LocalDropdownItemModel(stringResource3, withIcon4, (Function0) rememberedValue5, 2));
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(237063231);
                gapComposer.end(false);
            }
            if (z3) {
                gapComposer.startReplaceGroup(237117636);
                String str2 = fulfillmentOptionsMenuModel2.resetFulfillmentToAsapLabel;
                LocalDropdownItemModel.IconState.WithIcon withIcon5 = new LocalDropdownItemModel.IconState.WithIcon(Icons.Fast24);
                boolean changed5 = gapComposer.changed(function13);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (changed5 || rememberedValue6 == neverEqualPolicy) {
                    rememberedValue6 = new BrandSheetViewKt$$ExternalSyntheticLambda0(18, function13);
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                createListBuilder.add(new LocalDropdownItemModel(str2, withIcon5, (Function0) rememberedValue6, 2));
                z = false;
                gapComposer.end(false);
            } else {
                z = false;
                gapComposer.startReplaceGroup(237358847);
                gapComposer.end(false);
            }
            ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            gapComposer.end(z);
            LocalDropdownItemKt.m1326LocalDropdownMenu4kj_NE(androidx.compose.foundation.layout.SizeKt.m279heightInVpY3zN4$default(androidx.compose.foundation.layout.SizeKt.m292widthInVpY3zN4$default(modifier5, 60.0f, RecyclerView.DECELERATION_RATE, 2), 32.0f, RecyclerView.DECELERATION_RATE, 2), lambda$1951201603, Tags.toImmutableList(build), j, false, false, false, gapComposer, 3120 | (3670016 & (i2 << 6)), 48);
            modifier2 = modifier5;
        } else {
            function12 = function1;
            fulfillmentOptionsMenuModel2 = fulfillmentOptionsMenuModel;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i5 = 1;
            final Function1 function14 = function12;
            final LocalBrandProfileViewModel.FulfillmentOptionsMenuModel fulfillmentOptionsMenuModel3 = fulfillmentOptionsMenuModel2;
            function2 = new Function2(modifier2, function14, fulfillmentOptionsMenuModel3, j, i, i5) { // from class: app.cash.local.views.sheet.FulfillmentOptionsMenuKt$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ Modifier f$0;
                public final /* synthetic */ Function1 f$1;
                public final /* synthetic */ LocalBrandProfileViewModel.FulfillmentOptionsMenuModel f$2;
                public final /* synthetic */ long f$3;

                {
                    this.$r8$classId = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.$r8$classId) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int updateChangedFlags = Updater.updateChangedFlags(3073);
                            LoyaltySheetKt.m1331FulfillmentOptionsMenuIBZrmw(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int updateChangedFlags2 = Updater.updateChangedFlags(3073);
                            LoyaltySheetKt.m1331FulfillmentOptionsMenuIBZrmw(this.f$0, this.f$1, this.f$2, this.f$3, (Composer) obj, updateChangedFlags2);
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void FulfillmentPickupLocationRow(Modifier modifier, LocalBrandLocationsBottomSheetModel$Location localBrandLocationsBottomSheetModel$Location, boolean z, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(815105378);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(localBrandLocationsBottomSheetModel$Location) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifier, 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
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
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.prominent, (Composer) gapComposer, (Modifier) new HorizontalAlignElement(horizontal), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyMedium, 0L, 0L, new FontWeight(700), null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211), (TextLineBalancing) null, localBrandLocationsBottomSheetModel$Location.name, (Map) null, (Function1) null, false);
            m1332LocalBrandLocationStatusRowdrOMvmE(null, localBrandLocationsBottomSheetModel$Location.status, gapComposer, 0);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) new HorizontalAlignElement(horizontal), Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, localBrandLocationsBottomSheetModel$Location.address, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            LocalMapKt.LocalRadio(z, new VerticalAlignElement(Alignment.Companion.CenterVertically), null, false, null, gapComposer, (i2 >> 6) & 14, 28);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(modifier, localBrandLocationsBottomSheetModel$Location, z, i, 4);
        }
    }

    /* renamed from: LocalBrandLocationStatusRow-drOMvmE, reason: not valid java name */
    public static final void m1332LocalBrandLocationStatusRowdrOMvmE(Modifier modifier, LocationStatus locationStatus, Composer composer, int i) {
        Modifier modifier2;
        long j;
        AnnotatedString annotatedString;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1182685901);
        Applier applier = gapComposer.applier;
        int i2 = i | 6 | (gapComposer.changedInstance(locationStatus) ? 32 : 16) | 3456;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
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
            gapComposer.startReplaceGroup(-598371819);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodySmall, 0L, 0L, new FontWeight(500), null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211);
            gapComposer.end(false);
            gapComposer.startReplaceGroup(-1369564947);
            if ((locationStatus instanceof LocationStatus.Unknown) || (locationStatus instanceof LocationStatus.Open)) {
                gapComposer.startReplaceGroup(-598365894);
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
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -598368843, false);
                }
                gapComposer.startReplaceGroup(-598362471);
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j = colors2.semantic.text.danger;
                gapComposer.end(false);
            }
            gapComposer.end(false);
            Room.m1165Text25TpFw(2, 1, 0, 0, 1769472, 0, 3986, j, (Composer) gapComposer, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, label, (Map) null, (Function1) null, false);
            LocalText estimatedWaitTime = locationStatus.getEstimatedWaitTime();
            if (estimatedWaitTime == null) {
                gapComposer.startReplaceGroup(-1369242021);
                gapComposer.end(false);
                annotatedString = null;
            } else {
                gapComposer.startReplaceGroup(-598358426);
                annotatedString = LocalViewsKt.toAnnotatedString(estimatedWaitTime, gapComposer);
                gapComposer.end(false);
            }
            if (annotatedString == null) {
                String description = locationStatus.getDescription();
                annotatedString = description != null ? new AnnotatedString(description) : null;
            }
            if (annotatedString == null) {
                gapComposer.startReplaceGroup(-1369152834);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1369152833);
                AnnotatedString.Builder builder = new AnnotatedString.Builder();
                if (!StringsKt.isBlank(locationStatus.getLabel())) {
                    builder.append(" · ");
                }
                builder.append(annotatedString);
                AnnotatedString annotatedString2 = builder.toAnnotatedString();
                gapComposer.startReplaceGroup(1662950552);
                TextStyle textStyle = ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).bodySmall;
                gapComposer.end(false);
                gapComposer.startReplaceGroup(1662953013);
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                long j2 = colors3.semantic.text.subtle;
                gapComposer.end(false);
                Room.m1164Text25TpFw(2, 1, 0, 0, 1769472, 0, 3986, j2, (Composer) gapComposer, (Modifier) null, annotatedString2, textStyle, (TextLineBalancing) null, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuPickerSheetKt$$ExternalSyntheticLambda4(modifier2, locationStatus, i, 2);
        }
    }

    public static final void LocalShortlinkSheet(EducationalSheetModelList educationalSheetModelList, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2093179981);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(educationalSheetModelList) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            RealSheetState rememberSheetState = SheetStateKt.rememberSheetState(null, gapComposer, 0, 1);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
            boolean z = (i3 & 112) == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == obj) {
                rememberedValue2 = new LocalShortlinkSheetKt$$ExternalSyntheticLambda0(function1, parcelableSnapshotMutableIntState, 0);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Function1 function12 = (Function1) rememberedValue2;
            SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight = new SheetPeekPosition$FixedHeight(6, 500.0f, false);
            boolean changed = gapComposer.changed(function12);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed || rememberedValue3 == obj) {
                rememberedValue3 = new LocalShortlinkSheetKt$$ExternalSyntheticLambda1(function12, parcelableSnapshotMutableIntState, 0);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            SheetKt.Sheet((Function0) rememberedValue3, null, rememberSheetState, sheetPeekPosition$FixedHeight, null, false, null, Expect_jvmKt.rememberComposableLambda(223836106, new LocalViewFactory$$ExternalSyntheticLambda6(educationalSheetModelList, function12, rememberSheetState), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(educationalSheetModelList, function1, modifier2, i, 12);
        }
    }

    public static final void LoyaltySheet(Modifier modifier, LoyaltySheetModel loyaltySheetModel, Function1 function1, Composer composer, int i) {
        int i2;
        loyaltySheetModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1352202882);
        if ((i & 48) == 0) {
            i2 = (gapComposer.changedInstance(loyaltySheetModel) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
            RealSheetState rememberSheetState = SheetStateKt.rememberSheetState(null, gapComposer, 0, 1);
            boolean z = (i2 & 896) == 256;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandSheetViewKt$$ExternalSyntheticLambda0(19, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SheetKt.Sheet((Function0) rememberedValue, null, rememberSheetState, null, null, false, null, Expect_jvmKt.rememberComposableLambda(-1108868647, new BrandSheetViewKt$$ExternalSyntheticLambda1(7, (Object) loyaltySheetModel, (Object) function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(i, 13, modifier2, loyaltySheetModel, function1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v14 */
    public static final void MenuPickerRow(LocationMenu.Menu menu, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer;
        boolean z;
        ?? r12;
        Function0 function02 = function0;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1649031660);
        Applier applier = gapComposer2.applier;
        int i2 = (gapComposer2.changedInstance(menu) ? 4 : 2) | i | (gapComposer2.changedInstance(function02) ? 32 : 16);
        int i3 = 0;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = androidx.compose.foundation.layout.SizeKt.fillMaxWidth(companion, 1.0f);
            Strings.getSizes(gapComposer2).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier clip = ClipKt.clip(fillMaxWidth, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
            String str = menu.token;
            MenuHours menuHours = menu.hours;
            boolean changed = gapComposer2.changed(str);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m182clickableO2vRcR0$default(clip, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer2, 48, 13), false, null, null, function02, 28), 16.0f);
            BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, vertical, gapComposer2, 48);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m298padding3ABfNKs);
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
            LayoutWeightElement m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14, 1.0f, true);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m);
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
            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer2, 54);
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
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer2).component.button.subtle.text.f168default, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).button, (TextLineBalancing) null, menu.name, (Map) null, (Function1) null, false);
            if (MenuHoursKt.isNullOrAvailableNow(menuHours)) {
                z = true;
                r12 = 0;
                gapComposer2.startReplaceGroup(-1822800780);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-1822959655);
                r12 = 0;
                z = true;
                Trace.m1191Iconww6aTOc(Icons.Time16, (String) null, (Modifier) null, Strings.getColors(gapComposer2).semantic.icon.extraSubtle, gapComposer2, 54, 4);
                gapComposer2.end(false);
            }
            gapComposer2.end(z);
            if (menuHours == null) {
                gapComposer2.startReplaceGroup(669945154);
                gapComposer2.end(r12);
            } else {
                gapComposer2.startReplaceGroup(669945155);
                LocalMenuHoursViewKt.LocalMenuHoursView(SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 2.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), menuHours, null, gapComposer2, 6, 4);
                gapComposer2.end(r12);
            }
            gapComposer2.end(z);
            Painter painterResource = Countries.painterResource(R.drawable.local_views_right_arrow, r12, gapComposer2);
            long j = Strings.getColors(gapComposer2).semantic.icon.prominent;
            i3 = r12;
            function02 = function0;
            ImageKt.Image(painterResource, null, null, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer2, Painter.$stable | 48, 60);
            GapComposer gapComposer3 = gapComposer2;
            gapComposer3.end(z);
            gapComposer = gapComposer3;
        } else {
            gapComposer2.skipToGroupEnd();
            gapComposer = gapComposer2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuPickerSheetKt$$ExternalSyntheticLambda4(menu, function02, i, i3);
        }
    }

    public static final void MenuPickerSheet(Modifier modifier, MenuPickerSheetModel menuPickerSheetModel, Function1 function1, Composer composer, int i) {
        menuPickerSheetModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-291604307);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(menuPickerSheetModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            RealSheetState rememberSheetState = SheetStateKt.rememberSheetState(null, gapComposer, 0, 1);
            boolean z = false;
            SheetPeekPosition$FixedHeight sheetPeekPosition$FixedHeight = new SheetPeekPosition$FixedHeight(6, 450.0f, false);
            if ((i2 & 896) == 256) {
                z = true;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BrandSheetViewKt$$ExternalSyntheticLambda0(21, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            SheetKt.Sheet((Function0) rememberedValue, null, rememberSheetState, sheetPeekPosition$FixedHeight, null, false, null, Expect_jvmKt.rememberComposableLambda(289194806, new BrandSheetViewKt$$ExternalSyntheticLambda1(menuPickerSheetModel, function1), gapComposer), gapComposer, 100663296, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_CONFIRMED_VALUE);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MarkdownKt$$ExternalSyntheticLambda2(i, 14, modifier2, menuPickerSheetModel, function1);
        }
    }

    public static final List localImages(EducationalSheetModel.Content content) {
        content.getClass();
        if (!(content instanceof EducationalSheetModel.Image)) {
            return EmptyList.INSTANCE;
        }
        EducationalSheetModel.Image image = (EducationalSheetModel.Image) content;
        if (image instanceof EducationalSheetModel.Image.HeroImage) {
            return CollectionsKt__CollectionsJVMKt.listOf(((EducationalSheetModel.Image.HeroImage) content).image);
        }
        if (image instanceof EducationalSheetModel.Image.MiniCard) {
            return CollectionsKt__CollectionsKt.listOfNotNull(((EducationalSheetModel.Image.MiniCard) content).model.image);
        }
        if (image instanceof EducationalSheetModel.Image.TiledHeroImage) {
            EducationalSheetModel.Image.TiledHeroImage tiledHeroImage = (EducationalSheetModel.Image.TiledHeroImage) content;
            return CollectionsKt__CollectionsKt.listOf((Object[]) new LocalImage[]{tiledHeroImage.heroImage, tiledHeroImage.tileImage});
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final void preloadImages(EducationalSheetModelList educationalSheetModelList, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1217297694);
        int i2 = (i & 6) == 0 ? (gapComposer.changedInstance(educationalSheetModelList) ? 4 : 2) | i : i;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            List<EducationalSheetModel> list = educationalSheetModelList.sheets;
            ArrayList arrayList = new ArrayList();
            for (EducationalSheetModel educationalSheetModel : list) {
                educationalSheetModel.getClass();
                ArrayList arrayList2 = educationalSheetModel.visibleContents;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(localImages((EducationalSheetModel.Content) it.next()), arrayList3);
                }
                ArrayList arrayList4 = educationalSheetModel.collapsedContents;
                ArrayList arrayList5 = new ArrayList();
                Iterator it2 = arrayList4.iterator();
                while (it2.hasNext()) {
                    CollectionsKt__MutableCollectionsKt.addAll(localImages((EducationalSheetModel.Content) it2.next()), arrayList5);
                }
                CollectionsKt__MutableCollectionsKt.addAll(CollectionsKt.plus((Iterable) arrayList5, (Collection) arrayList3), arrayList);
            }
            Iterator it3 = CollectionsKt.toList(CollectionsKt.toMutableSet(arrayList)).iterator();
            while (it3.hasNext()) {
                LocalViewsKt.preload((LocalImage) it3.next(), gapComposer, 0);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(educationalSheetModelList, i, i3);
        }
    }
}
