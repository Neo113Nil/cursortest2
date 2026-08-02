package com.google.android.gms.internal.common;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.SharedTransitionScope$skipToLookaheadSize$1;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.VerticalAlignElement;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.DatePickerDefaults$$ExternalSyntheticLambda1;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda10;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.RulerKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda34;
import app.cash.local.views.map.LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8;
import app.cash.molecule.PlatformKt;
import app.cash.zipline.loader.internal.fetcher.FetcherKt;
import array.SortOrder;
import bo.app.c7$$ExternalSyntheticLambda6;
import bo.app.j1$$ExternalSyntheticLambda14;
import bo.app.l2$$ExternalSyntheticLambda7;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.Extras;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.request.ImageRequest;
import coil3.request.ImageRequestsKt;
import coil3.request.ImageRequests_androidKt;
import coil3.transition.CrossfadeTransition;
import coil3.transition.Transition;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.dynamite.zzg;
import com.google.android.gms.internal.common.zzj;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.appmessages.views.sheet.RealEmbeddedTreehouseContent$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.booklet.ui.BookletGridKt$$ExternalSyntheticLambda2;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractTapButton;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewModel;
import com.squareup.cash.earnings.views.home.EarningsHeaderKt$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda14;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.ComposeUtilsKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypography;
import com.squareup.cash.mooncake.compose_ui.MooncakeTypographyKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda6;
import com.squareup.cash.savings.views.SavingsScreenHeaderKt$$ExternalSyntheticLambda18;
import com.squareup.cash.transfers.views.WithdrawView$$ExternalSyntheticLambda11;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.cash.work.views.pay.PayHistoryListViewKt$PayHistoryListContent$1$1;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import com.squareup.protos.cash.discover.api.app.v1.model.Button$Content$Text;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage$PrimaryContent$HeroImage;
import com.squareup.protos.cash.discover.api.app.v1.model.HeroImage;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.stripe.android.GooglePayJsonFactory;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncher$BillingAddressConfig;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.InteractionResult;

/* loaded from: classes6.dex */
public abstract class zzj {
    /* JADX WARN: Removed duplicated region for block: B:47:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a9  */
    /* renamed from: Button-8V94_ZQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m2002Button8V94_ZQ(Button button, long j, DetailsPageInteractTapButton.DetailsPageButtonLocation detailsPageButtonLocation, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        Modifier modifier2;
        GapComposer gapComposer;
        String str;
        String str2;
        String str3;
        Object l2__externalsyntheticlambda7;
        int i3;
        Function0 function0;
        int ordinal;
        MooncakePillButton.Size size;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-152385669);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(button) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changed(j) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(detailsPageButtonLocation.ordinal()) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            modifier2 = modifier;
            i2 |= gapComposer2.changed(modifier2) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            modifier2 = modifier;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            FetcherKt fetcherKt = button.content;
            if (fetcherKt != null) {
                Button$Content$Text button$Content$Text = fetcherKt instanceof Button$Content$Text ? (Button$Content$Text) fetcherKt : null;
                if (button$Content$Text != null) {
                    str = button$Content$Text.value;
                    if (str == null) {
                        str = "";
                    }
                    str2 = button.action_url;
                    if (str2 != null) {
                        gapComposer2.startReplaceGroup(59262620);
                        gapComposer2.end(false);
                        str3 = str;
                        i3 = 1;
                        function0 = null;
                    } else {
                        gapComposer2.startReplaceGroup(59262621);
                        boolean changed = ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | gapComposer2.changed(str2) | gapComposer2.changed(str);
                        Object rememberedValue = gapComposer2.rememberedValue();
                        if (changed || rememberedValue == Composer.Companion.Empty) {
                            str3 = str;
                            i3 = 1;
                            l2__externalsyntheticlambda7 = new l2$$ExternalSyntheticLambda7(function1, str2, str3, detailsPageButtonLocation, 24);
                            gapComposer2.updateRememberedValue(l2__externalsyntheticlambda7);
                        } else {
                            String str4 = str;
                            l2__externalsyntheticlambda7 = rememberedValue;
                            str3 = str4;
                            i3 = 1;
                        }
                        gapComposer2.end(false);
                        function0 = (Function0) l2__externalsyntheticlambda7;
                    }
                    Button.ButtonSize buttonSize = button.button_size;
                    buttonSize.getClass();
                    ordinal = buttonSize.ordinal();
                    if (ordinal != 0) {
                        size = MooncakePillButton.Size.SMALL;
                    } else {
                        if (ordinal != i3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        size = MooncakePillButton.Size.LARGE;
                    }
                    gapComposer = gapComposer2;
                    KeypadKt.m3640ButtonGFipHI0(str3, function0, modifier2, null, size, null, new Color(j), false, 0, null, null, gapComposer, ((i2 >> 6) & 896) | ((i2 << 15) & 3670016), 0, 4008);
                }
            }
            str = null;
            if (str == null) {
            }
            str2 = button.action_url;
            if (str2 != null) {
            }
            Button.ButtonSize buttonSize2 = button.button_size;
            buttonSize2.getClass();
            ordinal = buttonSize2.ordinal();
            if (ordinal != 0) {
            }
            gapComposer = gapComposer2;
            KeypadKt.m3640ButtonGFipHI0(str3, function0, modifier2, null, size, null, new Color(j), false, 0, null, null, gapComposer, ((i2 >> 6) & 896) | ((i2 << 15) & 3670016), 0, 4008);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerDefaults$$ExternalSyntheticLambda1(button, j, detailsPageButtonLocation, function1, modifier, i);
        }
    }

    public static final void ButtonBar(DetailsPage detailsPage, boolean z, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        float f;
        Modifier.Companion companion;
        int i3;
        long j;
        Modifier.Companion companion2;
        Color composeColor;
        long j2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-731660800);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(detailsPage) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(z) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(modifier) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            Color color = null;
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
            DetailsPageInteractTapButton.DetailsPageButtonLocation detailsPageButtonLocation = z ? DetailsPageInteractTapButton.DetailsPageButtonLocation.HERO_CONTENT : DetailsPageInteractTapButton.DetailsPageButtonLocation.TREEHOUSE_CONTENT;
            Button button = detailsPage.primary_button_footer;
            if (button == null || z) {
                button = null;
            }
            Button button2 = button == null ? detailsPage.primary_button : button;
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            if (button2 != null) {
                gapComposer.startReplaceGroup(-456411292);
                gapComposer.startReplaceGroup(-1123100671);
                if (z || button != null) {
                    companion2 = companion3;
                    gapComposer.startReplaceGroup(-456334753);
                    com.squareup.protos.cash.ui.Color color2 = button2.background_color;
                    if (color2 == null) {
                        gapComposer.startReplaceGroup(-456305273);
                        gapComposer.end(false);
                        composeColor = null;
                    } else {
                        gapComposer.startReplaceGroup(-1123098182);
                        composeColor = ComposeUtilsKt.toComposeColor(color2, gapComposer);
                        gapComposer.end(false);
                    }
                    if (composeColor == null) {
                        gapComposer.startReplaceGroup(-1123096777);
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j2 = colors.base.constantWhite;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1123099133);
                        gapComposer.end(false);
                        j2 = composeColor.value;
                    }
                    gapComposer.end(false);
                } else if (ImageKt.isSystemInDarkTheme(gapComposer)) {
                    gapComposer.startReplaceGroup(-456204739);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    companion2 = companion3;
                    j2 = colors2.base.constantWhite;
                    gapComposer.end(false);
                } else {
                    companion2 = companion3;
                    gapComposer.startReplaceGroup(-456140259);
                    Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j2 = colors3.base.constantBlack;
                    gapComposer.end(false);
                }
                gapComposer.end(false);
                companion = companion2;
                long j3 = j2;
                i3 = -1762997739;
                Button button3 = button2;
                f = 1.0f;
                m2002Button8V94_ZQ(button3, j3, detailsPageButtonLocation, function1, SpacerKt.m302paddingqDBjuR0$default(SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 64.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, 10.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), gapComposer, ((i2 << 3) & 7168) | 24576);
                gapComposer.end(false);
            } else {
                f = 1.0f;
                companion = companion3;
                i3 = -1762997739;
                gapComposer.startReplaceGroup(-455838536);
                gapComposer.end(false);
            }
            Button button4 = detailsPage.secondary_button_footer;
            if (button4 == null || z) {
                button4 = null;
            }
            Button button5 = button4 == null ? detailsPage.secondary_button : button4;
            if (button5 != null) {
                gapComposer.startReplaceGroup(-455623520);
                gapComposer.startReplaceGroup(-1123075261);
                if (z || button4 != null) {
                    gapComposer.startReplaceGroup(-455544687);
                    com.squareup.protos.cash.ui.Color color3 = button5.background_color;
                    if (color3 == null) {
                        gapComposer.startReplaceGroup(-455513657);
                    } else {
                        gapComposer.startReplaceGroup(-1123072646);
                        color = ComposeUtilsKt.toComposeColor(color3, gapComposer);
                    }
                    gapComposer.end(false);
                    Color color4 = color;
                    if (color4 == null) {
                        gapComposer.startReplaceGroup(-1123070857);
                        Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors4 == null) {
                            colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(i3);
                            gapComposer.end(false);
                        }
                        j = colors4.base.constantWhite;
                        gapComposer.end(false);
                    } else {
                        gapComposer.startReplaceGroup(-1123073647);
                        gapComposer.end(false);
                        j = color4.value;
                    }
                    gapComposer.end(false);
                } else if (ImageKt.isSystemInDarkTheme(gapComposer)) {
                    gapComposer.startReplaceGroup(-455401436);
                    Colors colors5 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(i3);
                        gapComposer.end(false);
                    }
                    j = colors5.base.grey10;
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-455343900);
                    Colors colors6 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(i3);
                        gapComposer.end(false);
                    }
                    j = colors6.base.grey90;
                    gapComposer.end(false);
                }
                gapComposer.end(false);
                m2002Button8V94_ZQ(button5, j, detailsPageButtonLocation, function1, SpacerKt.m302paddingqDBjuR0$default(SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(companion, f), 64.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, 10.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), gapComposer, ((i2 << 3) & 7168) | 24576);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-455046920);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda34((Object) detailsPage, z, function1, (Object) modifier, i, 13);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0737  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Content(UiScope uiScope, PromotionDetailsViewModel.Loaded loaded, PromotionDetailsViewModel.DetailsPageData.DetailsPageV1 detailsPageV1, Function1 function1, Function0 function0, String str, RealImageLoader realImageLoader, CashTreehouseLayout cashTreehouseLayout, Composer composer, int i) {
        PromotionDetailsViewModel.Loaded loaded2;
        PromotionDetailsViewModel.DetailsPageData.DetailsPageV1 detailsPageV12;
        CashTreehouseLayout cashTreehouseLayout2;
        GapComposer gapComposer;
        int i2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        int i3;
        NeverEqualPolicy neverEqualPolicy;
        StaticProvidableCompositionLocal staticProvidableCompositionLocal;
        int i4;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ScrollState scrollState;
        Modifier.Companion companion;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        SharedTransitionScope sharedTransitionScope;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        Modifier.Companion companion2;
        GapComposer gapComposer2;
        int i5;
        int i6;
        long j;
        State state;
        DetailsPage detailsPage;
        int i7;
        BoxScopeInstance boxScopeInstance;
        Color composeColor;
        boolean z;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12;
        long j2;
        Colors colors;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16;
        boolean z2;
        long j3;
        long j4;
        Modifier renderInSharedTransitionScopeOverlay;
        Icons icons;
        int i8;
        GapComposer gapComposer3;
        float f;
        Modifier modifier;
        DetailsPage detailsPage2;
        NeverEqualPolicy neverEqualPolicy2;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3;
        Object rememberedValue;
        boolean changed;
        Object rememberedValue2;
        Modifier renderInSharedTransitionScopeOverlay2;
        boolean z3;
        Colors colors2;
        DetailsPage detailsPage3 = detailsPageV1.details;
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startRestartGroup(356882501);
        Applier applier = gapComposer4.applier;
        int i9 = i | (gapComposer4.changed(uiScope) ? 4 : 2) | (gapComposer4.changedInstance(loaded) ? 32 : 16) | (gapComposer4.changedInstance(detailsPageV1) ? 256 : 128) | (gapComposer4.changedInstance(function1) ? 2048 : 1024) | (gapComposer4.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer4.changed(str) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer4.changedInstance(realImageLoader) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted) | (gapComposer4.changedInstance(cashTreehouseLayout) ? 8388608 : 4194304);
        if (gapComposer4.shouldExecute(i9 & 1, (i9 & 4793491) != 4793490)) {
            Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(SpacerKt.navigationBarsPadding(companion3), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, fillMaxSize);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer4.startReusableNode();
            if (gapComposer4.inserting) {
                gapComposer4.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer4.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$17);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$18);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$19 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer4, valueOf, composeUiNode$Companion$SetModifier$19);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$13 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$13);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$110 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer4, materializeModifier, composeUiNode$Companion$SetModifier$110);
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer4);
            Object rememberedValue3 = gapComposer4.rememberedValue();
            NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
            if (rememberedValue3 == neverEqualPolicy3) {
                i2 = 0;
                rememberedValue3 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer4);
            } else {
                i2 = 0;
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = (ParcelableSnapshotMutableIntState) rememberedValue3;
            Object rememberedValue4 = gapComposer4.rememberedValue();
            if (rememberedValue4 == neverEqualPolicy3) {
                rememberedValue4 = Boxes$$ExternalSyntheticOutline1.m(i2, gapComposer4);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState5 = (ParcelableSnapshotMutableIntState) rememberedValue4;
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            AndroidWindowInsets androidWindowInsets = Arrangement$End$1.current(gapComposer4).navigationBars;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = CompositionLocalsKt.LocalDensity;
            int i10 = androidWindowInsets.getInsets$foundation_layout().bottom;
            Object rememberedValue5 = gapComposer4.rememberedValue();
            if (rememberedValue5 == neverEqualPolicy3) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$19;
                i3 = i9;
                staticProvidableCompositionLocal = staticProvidableCompositionLocal2;
                i4 = i10;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                scrollState = rememberScrollState;
                neverEqualPolicy = neverEqualPolicy3;
                companion = companion3;
                parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState5;
                rememberedValue5 = Updater.derivedStateOf(new j1$$ExternalSyntheticLambda14(i4, detailsPageV1, scrollState, parcelableSnapshotMutableIntState, parcelableSnapshotMutableIntState4, 2));
                gapComposer4.updateRememberedValue(rememberedValue5);
            } else {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$19;
                i3 = i9;
                neverEqualPolicy = neverEqualPolicy3;
                staticProvidableCompositionLocal = staticProvidableCompositionLocal2;
                i4 = i10;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$13;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                scrollState = rememberScrollState;
                companion = companion3;
                parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState5;
            }
            final State state2 = (State) rememberedValue5;
            SharedTransitionScope sharedTransitionScope2 = uiScope.$$delegate_1;
            if (sharedTransitionScope2.isTransitionActive() || str == null || parcelableSnapshotMutableIntState4.getIntValue() != 0) {
                sharedTransitionScope = sharedTransitionScope2;
                parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                companion2 = companion;
                gapComposer2 = gapComposer4;
                gapComposer2.startReplaceGroup(-128160508);
                gapComposer2.end(false);
                i5 = 0;
            } else {
                gapComposer4.startReplaceGroup(-128130624);
                sharedTransitionScope = sharedTransitionScope2;
                parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState;
                TweenSpec tween$default = AnimatableKt.tween$default(500, 0, null, 6);
                SpringSpec springSpec = AnimateAsStateKt.defaultAnimation;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$17;
                companion2 = companion;
                gapComposer2 = gapComposer4;
                i5 = ((Number) AnimateAsStateKt.animateValueAsState(30, AnimatableKt.IntToVector, tween$default, null, "offsetY", null, gapComposer4, 24966, 8).getValue()).intValue();
                gapComposer2.end(false);
            }
            Object rememberedValue6 = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy4 = neverEqualPolicy;
            if (rememberedValue6 == neverEqualPolicy4) {
                rememberedValue6 = Updater.derivedStateOf(new NavHostKt$$ExternalSyntheticLambda8(state2, 24));
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            State state3 = (State) rememberedValue6;
            Boolean bool = (Boolean) state3.getValue();
            bool.getClass();
            int i11 = i3;
            int i12 = i11 & 7168;
            boolean z4 = i12 == 2048;
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (z4 || rememberedValue7 == neverEqualPolicy4) {
                i6 = i12;
                rememberedValue7 = new PayHistoryListViewKt$PayHistoryListContent$1$1(function1, state3, null, 2);
                gapComposer2.updateRememberedValue(rememberedValue7);
            } else {
                i6 = i12;
            }
            Updater.LaunchedEffect(gapComposer2, bool, (Function2) rememberedValue7);
            final long j5 = Strings.getColors(gapComposer2).component.ui.divider.border;
            Modifier zIndex = ZIndexModifierKt.zIndex(SizeKt.fillMaxWidth(companion2, 1.0f), 1.0f);
            BiasAlignment biasAlignment = Alignment.Companion.TopCenter;
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            Modifier align = boxScopeInstance2.align(zIndex, biasAlignment);
            boolean changed2 = gapComposer2.changed(j5) | gapComposer2.changed(scrollState) | gapComposer2.changed(i4);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue8 == neverEqualPolicy4) {
                final int i13 = i4;
                final ScrollState scrollState2 = scrollState;
                rememberedValue8 = new Function1() { // from class: com.squareup.cash.discover.promotiondetails.views.PromotionDetailsViewKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        DrawScope drawScope = (DrawScope) obj;
                        drawScope.getClass();
                        float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                        float f2 = RecyclerView.DECELERATION_RATE;
                        long floatToRawIntBits = (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(intBitsToFloat) & BodyPartID.bodyIdMax);
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32));
                        float intBitsToFloat3 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax));
                        long floatToRawIntBits2 = (Float.floatToRawIntBits(intBitsToFloat3) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat2) << 32);
                        float mo236toPx0680j_4 = drawScope.mo236toPx0680j_4(1.0f);
                        if (scrollState2.value$delegate.getIntValue() > i13) {
                            f2 = ((Number) state2.getValue()).floatValue();
                        }
                        drawScope.mo729drawLineNGM6Ib0(j5, floatToRawIntBits, floatToRawIntBits2, (r23 & 8) != 0 ? 0.0f : mo236toPx0680j_4, (r23 & 16) != 0 ? 0 : 0, (r23 & 32) != 0 ? null : null, (r23 & 64) != 0 ? 1.0f : f2);
                        return Unit.INSTANCE;
                    }
                };
                j = j5;
                state = state2;
                gapComposer2.updateRememberedValue(rememberedValue8);
            } else {
                j = j5;
                state = state2;
            }
            Modifier drawBehind = ClipKt.drawBehind(align, (Function1) rememberedValue8);
            int i14 = i4;
            long j6 = Strings.getColors(gapComposer2).semantic.background.f1047app;
            State state4 = state;
            boolean z5 = loaded.isBooklet;
            long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(!z5 ? ((Number) state4.getValue()).floatValue() : 1.0f, j6, 14);
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(drawBehind, m675copywmQWz5c$default, rectangleShapeKt$RectangleShape$1);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer2, 0);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m177backgroundbw27NRU);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, composeUiNode$Companion$SetModifier$13);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$111 = composeUiNode$Companion$SetModifier$12;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$111);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$112 = composeUiNode$Companion$SetModifier$1;
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$14 = ownerSnapshotObserver$onCommitAffectingLayout$1;
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$112, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$14);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$110);
            int i15 = i11 >> 3;
            int i16 = i15 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
            if (z5) {
                gapComposer2.startReplaceGroup(-881891484);
                gapComposer2.end(false);
                ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$14;
                detailsPage = detailsPage3;
                i7 = i16;
                j2 = Color.Transparent;
                boxScopeInstance = boxScopeInstance2;
            } else {
                gapComposer2.startReplaceGroup(-881849789);
                detailsPage = detailsPage3;
                i7 = i16;
                Button button = detailsPage.primary_button;
                com.squareup.protos.cash.ui.Color color = button != null ? button.background_color : null;
                if (color == null) {
                    gapComposer2.startReplaceGroup(-881797586);
                    gapComposer2.end(false);
                    boxScopeInstance = boxScopeInstance2;
                    z = false;
                    composeColor = null;
                } else {
                    boxScopeInstance = boxScopeInstance2;
                    gapComposer2.startReplaceGroup(-1691013069);
                    composeColor = ComposeUtilsKt.toComposeColor(color, gapComposer2);
                    z = false;
                    gapComposer2.end(false);
                }
                if (composeColor == null) {
                    gapComposer2.startReplaceGroup(-1691011002);
                    Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z);
                    } else {
                        colors = colors3;
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(z);
                    }
                    ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$14;
                    j2 = colors.semantic.background.f1047app;
                    gapComposer2.end(z);
                } else {
                    ownerSnapshotObserver$onCommitAffectingLayout$12 = ownerSnapshotObserver$onCommitAffectingLayout$14;
                    gapComposer2.startReplaceGroup(-1691014753);
                    gapComposer2.end(z);
                    j2 = composeColor.value;
                }
                gapComposer2.end(z);
            }
            if (z5) {
                gapComposer2.startReplaceGroup(-560417490);
                Colors colors4 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$110;
                if (colors4 == null) {
                    z3 = false;
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    z3 = false;
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                    colors2 = colors4;
                }
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$111;
                composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$112;
                j3 = colors2.semantic.icon.standard;
                gapComposer2.end(z3);
            } else {
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$111;
                composeUiNode$Companion$SetModifier$15 = composeUiNode$Companion$SetModifier$112;
                composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$110;
                gapComposer2.startReplaceGroup(-560352669);
                boolean changed3 = gapComposer2.changed(j2);
                Object rememberedValue9 = gapComposer2.rememberedValue();
                if (changed3 || rememberedValue9 == neverEqualPolicy4) {
                    rememberedValue9 = Float.valueOf(ColorKt.m690luminance8_81llA(j2));
                    gapComposer2.updateRememberedValue(rememberedValue9);
                }
                if (((Number) rememberedValue9).floatValue() >= 0.5d) {
                    gapComposer2.startReplaceGroup(-560207372);
                    Colors colors5 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    z2 = false;
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    j3 = colors5.base.constantBlack;
                    gapComposer2.end(false);
                } else {
                    z2 = false;
                    gapComposer2.startReplaceGroup(-560125036);
                    Colors colors6 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    j3 = colors6.base.constantWhite;
                    gapComposer2.end(false);
                }
                gapComposer2.end(z2);
            }
            Icons icons2 = Icons.NavigationClose;
            float floatValue = ((Number) state4.getValue()).floatValue();
            long j7 = j3;
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.statusBarsPadding(companion2), 8.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
            boolean changed4 = gapComposer2.changed(i5);
            Object rememberedValue10 = gapComposer2.rememberedValue();
            if (changed4 || rememberedValue10 == neverEqualPolicy4) {
                j4 = j2;
                rememberedValue10 = new DatePickerKt$$ExternalSyntheticLambda10(i5, 9);
                gapComposer2.updateRememberedValue(rememberedValue10);
            } else {
                j4 = j2;
            }
            renderInSharedTransitionScopeOverlay = uiScope.renderInSharedTransitionScopeOverlay(OffsetKt.offset(m302paddingqDBjuR0$default, (Function1) rememberedValue10), new SharedTransitionScope$skipToLookaheadSize$1(uiScope, 1));
            if (sharedTransitionScope.isTransitionActive()) {
                icons = icons2;
                i8 = i5;
                gapComposer3 = gapComposer2;
                f = floatValue;
                modifier = AnimatedVisibilityScope.animateEnterExit$default(uiScope, companion2, EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(0, 200, null, 5), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(0, 0, null, 7), 2), 4);
            } else {
                icons = icons2;
                i8 = i5;
                gapComposer3 = gapComposer2;
                f = floatValue;
                modifier = companion2;
            }
            BoxScopeInstance boxScopeInstance3 = boxScopeInstance;
            GapComposer gapComposer5 = gapComposer3;
            long j8 = j4;
            int i17 = i8;
            m2004ImageButtonY0xEhic(icons, f, j7, j8, function0, renderInSharedTransitionScopeOverlay.then(modifier), gapComposer5, (i11 & 57344) | 6);
            gapComposer = gapComposer5;
            String str2 = detailsPage.header_bar_title;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            long m675copywmQWz5c$default2 = Color.m675copywmQWz5c$default(((Number) state4.getValue()).floatValue(), Strings.getCurrentTextColor(gapComposer), 14);
            MooncakeTypography mooncakeTypography = (MooncakeTypography) gapComposer.consume(MooncakeTypographyKt.LocalTypography);
            if (mooncakeTypography == null) {
                mooncakeTypography = ((Boolean) gapComposer.consume(ArcadeThemeKt.LocalArcadeThemeSet)).booleanValue() ? MooncakeTypographyKt.ArcadeCompatMooncakeTypography : MooncakeTypographyKt.DefaultTypography;
            }
            KeypadKt.m3651TextPdH14aY(2, 0, 3, 2, 196608, 6, 2768, m675copywmQWz5c$default2, (Composer) gapComposer, Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SpacerKt.m300paddingVpY3zN4$default(SpacerKt.statusBarsPadding(companion2), RecyclerView.DECELERATION_RATE, 8.0f, 1), true).then(new VerticalAlignElement(Alignment.Companion.CenterVertically)), mooncakeTypography.mainTitle, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
            Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.statusBarsPadding(companion2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, RecyclerView.DECELERATION_RATE, 11);
            boolean changed5 = gapComposer.changed(i17);
            Object rememberedValue11 = gapComposer.rememberedValue();
            if (changed5 || rememberedValue11 == neverEqualPolicy4) {
                rememberedValue11 = new DatePickerKt$$ExternalSyntheticLambda10(i17, 10);
                gapComposer.updateRememberedValue(rememberedValue11);
            }
            Modifier offset = OffsetKt.offset(m302paddingqDBjuR0$default2, (Function1) rememberedValue11);
            if (detailsPage.share_sheet != null) {
                gapComposer.startReplaceGroup(-381120556);
                Icons icons3 = Icons.NavigationShareAndroid;
                float floatValue2 = ((Number) state4.getValue()).floatValue();
                detailsPage2 = detailsPage;
                int i18 = i6;
                boolean z6 = i18 == 2048;
                Object rememberedValue12 = gapComposer.rememberedValue();
                if (z6 || rememberedValue12 == neverEqualPolicy4) {
                    i6 = i18;
                    rememberedValue12 = new EarningsHeaderKt$$ExternalSyntheticLambda2(27, function1);
                    gapComposer.updateRememberedValue(rememberedValue12);
                } else {
                    i6 = i18;
                }
                Function0 function02 = (Function0) rememberedValue12;
                renderInSharedTransitionScopeOverlay2 = uiScope.renderInSharedTransitionScopeOverlay(offset, new SharedTransitionScope$skipToLookaheadSize$1(uiScope, 1));
                m2004ImageButtonY0xEhic(icons3, floatValue2, j7, j8, function02, renderInSharedTransitionScopeOverlay2.then(sharedTransitionScope.isTransitionActive() ? AnimatedVisibilityScope.animateEnterExit$default(uiScope, companion2, null, null, 7) : companion2), gapComposer, 6);
                gapComposer.end(false);
            } else {
                detailsPage2 = detailsPage;
                gapComposer.startReplaceGroup(-380525790);
                SpacerKt.Spacer(gapComposer, SizeKt.m285size3ABfNKs(offset, 64.0f));
                gapComposer.end(false);
            }
            gapComposer.end(true);
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion2, 1.0f), Strings.getColors(gapComposer).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), scrollState, !uiScope.$$delegate_0.getTransition().isRunning(), 12);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$13);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$14);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$15, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$16);
            float f2 = i17;
            Object rememberedValue13 = gapComposer.rememberedValue();
            if (rememberedValue13 == neverEqualPolicy4) {
                rememberedValue13 = new MoneyTabUIKt$$ExternalSyntheticLambda14(14, parcelableSnapshotMutableIntState4);
                gapComposer.updateRememberedValue(rememberedValue13);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState6 = parcelableSnapshotMutableIntState2;
            m2003HeroImageGHTll3U(uiScope, loaded, detailsPageV1, function1, f2, str, realImageLoader, RulerKt.onSizeChanged(companion2, (Function1) rememberedValue13), gapComposer, (i11 & 14) | 12582912 | (i11 & 112) | (i11 & 896) | i6 | (458752 & i11) | (3670016 & i11));
            loaded2 = loaded;
            detailsPageV12 = detailsPageV1;
            int i19 = CashTreehouseLayout.$r8$clinit;
            int i20 = 15;
            cashTreehouseLayout2 = cashTreehouseLayout;
            TreehouseContent(loaded2, detailsPageV12, cashTreehouseLayout2, gapComposer, i7 | 512 | ((i11 >> 15) & 896));
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion2, 1.0f), ((Density) gapComposer.consume(staticProvidableCompositionLocal)).mo233toDpu2uoSUM(parcelableSnapshotMutableIntState6.getIntValue())));
            gapComposer.end(true);
            if (detailsPage2.primary_button != null) {
                gapComposer.startReplaceGroup(-123245489);
                DetailsPage detailsPage4 = detailsPageV12.details;
                Modifier align2 = boxScopeInstance3.align(companion2, Alignment.Companion.BottomCenter);
                boolean changed6 = gapComposer.changed(i14);
                Object rememberedValue14 = gapComposer.rememberedValue();
                if (changed6) {
                    neverEqualPolicy2 = neverEqualPolicy4;
                } else {
                    neverEqualPolicy2 = neverEqualPolicy4;
                    if (rememberedValue14 != neverEqualPolicy2) {
                        parcelableSnapshotMutableIntState3 = parcelableSnapshotMutableIntState6;
                        Modifier graphicsLayer = ColorKt.graphicsLayer(align2, (Function1) rememberedValue14);
                        rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == neverEqualPolicy2) {
                            rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda14(i20, parcelableSnapshotMutableIntState3);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        Modifier onSizeChanged = RulerKt.onSizeChanged(graphicsLayer, (Function1) rememberedValue);
                        long j9 = j;
                        changed = gapComposer.changed(j9);
                        rememberedValue2 = gapComposer.rememberedValue();
                        if (!changed || rememberedValue2 == neverEqualPolicy2) {
                            rememberedValue2 = new c7$$ExternalSyntheticLambda6(j9, 11);
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        ButtonBar(detailsPage4, false, function1, SpacerKt.m301paddingqDBjuR0(ImageKt.m177backgroundbw27NRU(ClipKt.drawBehind(onSizeChanged, (Function1) rememberedValue2), Strings.getColors(gapComposer).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 20.0f, 14.0f, 20.0f, 24.0f), gapComposer, (i15 & 896) | 48);
                        gapComposer.end(false);
                    }
                }
                parcelableSnapshotMutableIntState3 = parcelableSnapshotMutableIntState6;
                rememberedValue14 = new PoolGoalMetKt$$ExternalSyntheticLambda6(i14, parcelableSnapshotMutableIntState3, state4, 16);
                gapComposer.updateRememberedValue(rememberedValue14);
                Modifier graphicsLayer2 = ColorKt.graphicsLayer(align2, (Function1) rememberedValue14);
                rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy2) {
                }
                Modifier onSizeChanged2 = RulerKt.onSizeChanged(graphicsLayer2, (Function1) rememberedValue);
                long j92 = j;
                changed = gapComposer.changed(j92);
                rememberedValue2 = gapComposer.rememberedValue();
                if (!changed) {
                }
                rememberedValue2 = new c7$$ExternalSyntheticLambda6(j92, 11);
                gapComposer.updateRememberedValue(rememberedValue2);
                ButtonBar(detailsPage4, false, function1, SpacerKt.m301paddingqDBjuR0(ImageKt.m177backgroundbw27NRU(ClipKt.drawBehind(onSizeChanged2, (Function1) rememberedValue2), Strings.getColors(gapComposer).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), 20.0f, 14.0f, 20.0f, 24.0f), gapComposer, (i15 & 896) | 48);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-122407497);
                gapComposer.end(false);
            }
            gapComposer.end(true);
        } else {
            loaded2 = loaded;
            detailsPageV12 = detailsPageV1;
            cashTreehouseLayout2 = cashTreehouseLayout;
            gapComposer = gapComposer4;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DateInputKt$$ExternalSyntheticLambda1(uiScope, loaded2, detailsPageV12, function1, function0, str, realImageLoader, cashTreehouseLayout2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v57 */
    /* renamed from: HeroImage-GHTll3U, reason: not valid java name */
    public static final void m2003HeroImageGHTll3U(final UiScope uiScope, PromotionDetailsViewModel.Loaded loaded, PromotionDetailsViewModel.DetailsPageData.DetailsPageV1 detailsPageV1, Function1 function1, float f, String str, RealImageLoader realImageLoader, Modifier modifier, Composer composer, int i) {
        float f2;
        GapComposer gapComposer;
        Color composeColor;
        float f3;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
        Text text;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14;
        SortOrder sortOrder;
        Modifier.Companion companion;
        boolean z;
        int i2;
        GapComposer gapComposer2;
        BiasAlignment.Horizontal horizontal;
        Arrangement$Top$1 arrangement$Top$1;
        int i3;
        Modifier.Companion companion2;
        Modifier fillMaxWidth;
        Modifier renderInSharedTransitionScopeOverlay;
        Modifier.Companion companion3;
        Text text2;
        GapComposer gapComposer3;
        Modifier.Companion companion4;
        boolean z2;
        boolean z3;
        HeroImage hero_image;
        HeroImage hero_image2;
        HeroImage hero_image3;
        DetailsPage detailsPage = detailsPageV1.details;
        GapComposer gapComposer4 = (GapComposer) composer;
        gapComposer4.startRestartGroup(141954345);
        Applier applier = gapComposer4.applier;
        int i4 = i | (gapComposer4.changed(uiScope) ? 4 : 2) | (gapComposer4.changedInstance(detailsPageV1) ? 256 : 128) | (gapComposer4.changedInstance(function1) ? 2048 : 1024) | (gapComposer4.changed(f) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer4.changed(str) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer4.changedInstance(realImageLoader) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer4.shouldExecute(i4 & 1, (i4 & 4793475) != 4793474)) {
            SortOrder sortOrder2 = detailsPage.primary_content;
            boolean z4 = ((sortOrder2 == null || (hero_image3 = getHero_image(sortOrder2)) == null) ? null : hero_image3.placement) == HeroImage.HeroImagePlacement.HERO_IMAGE_PLACEMENT_CENTER;
            DetailsPage.TextPlacement textPlacement = detailsPage.text_placement;
            Text text3 = detailsPage.eyebrow;
            SortOrder sortOrder3 = detailsPage.primary_content;
            boolean z5 = textPlacement == DetailsPage.TextPlacement.TEXT_PLACEMENT_TOP_CENTER;
            SortOrder sortOrder4 = detailsPage.primary_content;
            com.squareup.protos.cash.ui.Color color = (sortOrder4 == null || (hero_image2 = getHero_image(sortOrder4)) == null) ? null : hero_image2.background_color;
            if (color == null) {
                gapComposer4.startReplaceGroup(-1580309880);
                gapComposer4.end(false);
                composeColor = null;
            } else {
                gapComposer4.startReplaceGroup(-1020809063);
                composeColor = ComposeUtilsKt.toComposeColor(color, gapComposer4);
                gapComposer4.end(false);
            }
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(composeColor != null ? ImageKt.m177backgroundbw27NRU(modifier, composeColor.value, ColorKt.RectangleShape) : modifier, 1.0f);
            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer4, fillMaxWidth2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer4.startReusableNode();
            if (gapComposer4.inserting) {
                gapComposer4.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer4.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$15);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$16);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer4, valueOf, composeUiNode$Companion$SetModifier$17);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer4, materializeModifier, composeUiNode$Companion$SetModifier$18);
            Modifier.Companion companion5 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion5, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode2 = Long.hashCode(gapComposer4.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer4.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer4, fillMaxWidth3);
            gapComposer4.startReusableNode();
            if (gapComposer4.inserting) {
                gapComposer4.createNode(layoutNode$Companion$Constructor$12);
            } else {
                gapComposer4.useNode();
            }
            Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$15);
            Updater.m576setimpl(gapComposer4, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$16);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer4, composeUiNode$Companion$SetModifier$17, gapComposer4, ownerSnapshotObserver$onCommitAffectingLayout$12);
            Updater.m576setimpl(gapComposer4, materializeModifier2, composeUiNode$Companion$SetModifier$18);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = AndroidCompositionLocals_androidKt.LocalContext;
            int i5 = ((Context) gapComposer4.consume(staticProvidableCompositionLocal)).getResources().getDisplayMetrics().heightPixels;
            if (sortOrder3 == null || (hero_image = getHero_image(sortOrder3)) == null) {
                f3 = RecyclerView.DECELERATION_RATE;
            } else {
                Double d = hero_image.screen_fill_percent;
                f3 = d != null ? (float) d.doubleValue() : 1.0f;
            }
            SpacerKt.Spacer(gapComposer4, SizeKt.m280requiredHeight3ABfNKs(SpacerKt.statusBarsPadding(companion5), ((Density) gapComposer4.consume(CompositionLocalsKt.LocalDensity)).mo233toDpu2uoSUM(i5) * f3));
            HeroImage hero_image4 = sortOrder3 != null ? getHero_image(sortOrder3) : null;
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            if (hero_image4 == null || z4) {
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                GapComposer gapComposer5 = gapComposer4;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                text = text3;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$17;
                sortOrder = sortOrder3;
                companion = companion5;
                z = 0;
                i2 = 12582960;
                gapComposer5.startReplaceGroup(-1850427315);
                gapComposer5.end(false);
                gapComposer2 = gapComposer5;
            } else {
                gapComposer4.startReplaceGroup(-1851262672);
                ImageRequest.Builder builder = new ImageRequest.Builder((Context) gapComposer4.consume(staticProvidableCompositionLocal));
                sortOrder3.getClass();
                HeroImage hero_image5 = getHero_image(sortOrder3);
                hero_image5.getClass();
                builder.data = hero_image5.image;
                boolean z6 = str == null;
                Extras.Key key = ImageRequestsKt.transformationsKey;
                int i6 = z6 ? 200 : 0;
                Extras.Key key2 = ImageRequests_androidKt.transitionFactoryKey;
                i2 = 12582960;
                builder.getExtras().set(ImageRequests_androidKt.transitionFactoryKey, i6 > 0 ? new CrossfadeTransition.Factory(i6) : Transition.Factory.NONE);
                final int i7 = 0;
                companion = companion5;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$18;
                sortOrder = sortOrder3;
                ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                text = text3;
                composeUiNode$Companion$SetModifier$14 = composeUiNode$Companion$SetModifier$17;
                z = 0;
                AsyncImageKt.m1441AsyncImagesKDTAoQ(builder.build(), null, realImageLoader, thenIfSharedEnter(boxScopeInstance.matchParentSize(), uiScope, str, new Function4() { // from class: com.squareup.cash.discover.promotiondetails.views.PromotionDetailsViewKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function4
                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                        int i8 = i7;
                        UiScope uiScope2 = (UiScope) obj;
                        final String str2 = (String) obj2;
                        Composer composer2 = (Composer) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        switch (i8) {
                            case 0:
                                uiScope2.getClass();
                                str2.getClass();
                                GapComposer gapComposer6 = (GapComposer) composer2;
                                gapComposer6.startReplaceGroup(-452131611);
                                Modifier sharedElement$default = SharedTransitionScope.sharedElement$default(uiScope2, Modifier.Companion.$$INSTANCE, uiScope2.rememberSharedContentState(new Object(str2) { // from class: com.squareup.cash.sharedElements.PromotionDetailsSharedKey$Image
                                    public final String id;

                                    {
                                        str2.getClass();
                                        this.id = str2;
                                    }

                                    public final boolean equals(Object obj5) {
                                        if (this == obj5) {
                                            return true;
                                        }
                                        return (obj5 instanceof PromotionDetailsSharedKey$Image) && Intrinsics.areEqual(this.id, ((PromotionDetailsSharedKey$Image) obj5).id);
                                    }

                                    public final int hashCode() {
                                        return this.id.hashCode();
                                    }

                                    public final String toString() {
                                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Image(id=", this.id, ")");
                                    }
                                }, gapComposer6, (intValue << 3) & 112), uiScope, null, zzj.overlayClip(uiScope2, gapComposer6), 60);
                                gapComposer6.end(false);
                                return sharedElement$default;
                            default:
                                uiScope2.getClass();
                                str2.getClass();
                                GapComposer gapComposer7 = (GapComposer) composer2;
                                gapComposer7.startReplaceGroup(466251149);
                                Modifier sharedElement$default2 = SharedTransitionScope.sharedElement$default(uiScope2, Modifier.Companion.$$INSTANCE, uiScope2.rememberSharedContentState(new Object(str2) { // from class: com.squareup.cash.sharedElements.PromotionDetailsSharedKey$Image
                                    public final String id;

                                    {
                                        str2.getClass();
                                        this.id = str2;
                                    }

                                    public final boolean equals(Object obj5) {
                                        if (this == obj5) {
                                            return true;
                                        }
                                        return (obj5 instanceof PromotionDetailsSharedKey$Image) && Intrinsics.areEqual(this.id, ((PromotionDetailsSharedKey$Image) obj5).id);
                                    }

                                    public final int hashCode() {
                                        return this.id.hashCode();
                                    }

                                    public final String toString() {
                                        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Image(id=", this.id, ")");
                                    }
                                }, gapComposer7, (intValue << 3) & 112), uiScope, null, zzj.overlayClip(uiScope2, gapComposer7), 60);
                                gapComposer7.end(false);
                                return sharedElement$default2;
                        }
                    }
                }, gapComposer4, ((i4 << 3) & 112) | ((i4 >> 9) & 896)), null, ContentScale.Companion.Crop, null, gapComposer4, ((i4 >> 12) & 896) | 12582960, 0, 3952);
                GapComposer gapComposer6 = gapComposer4;
                gapComposer6.end(false);
                gapComposer2 = gapComposer6;
            }
            gapComposer2.end(true);
            if (z5) {
                horizontal = Alignment.Companion.CenterHorizontally;
                arrangement$Top$1 = SpacerKt.Top;
                i3 = 3;
            } else {
                horizontal = Alignment.Companion.Start;
                arrangement$Top$1 = SpacerKt.Bottom;
                i3 = 5;
            }
            if ((sortOrder != null ? getHero_image(sortOrder) : null) != null) {
                fillMaxWidth = boxScopeInstance.matchParentSize();
                companion2 = companion;
            } else {
                companion2 = companion;
                fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
            }
            renderInSharedTransitionScopeOverlay = uiScope.renderInSharedTransitionScopeOverlay(SpacerKt.statusBarsPadding(fillMaxWidth), new SharedTransitionScope$skipToLookaheadSize$1(uiScope, 1));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, z);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, renderInSharedTransitionScopeOverlay);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$14, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$12);
            if (z5) {
                re$$ExternalSyntheticOutline0.m(gapComposer2, -1661996158, companion2, 56.0f, gapComposer2);
                gapComposer2.end(z);
            } else {
                gapComposer2.startReplaceGroup(-1661939459);
                gapComposer2.end(z);
            }
            if (text == null) {
                gapComposer2.startReplaceGroup(-1661908429);
                gapComposer2.end(z);
                text2 = text;
                gapComposer3 = gapComposer2;
                companion3 = companion2;
            } else {
                gapComposer2.startReplaceGroup(-1661908428);
                companion3 = companion2;
                Text text4 = text;
                Composer composer2 = gapComposer2;
                zzai.m2001MooncakeDiscoverTextsSOGCe0(SpacerKt.m302paddingqDBjuR0$default(companion3, 20.0f, 8.0f, 20.0f, RecyclerView.DECELERATION_RATE, 8), text4, null, 0L, null, 0, 0, i3, null, composer2, 0);
                text2 = text4;
                GapComposer gapComposer7 = composer2;
                gapComposer7.end(z);
                gapComposer3 = gapComposer7;
            }
            Text text5 = detailsPage.headline;
            if (text5 == null) {
                gapComposer3.startReplaceGroup(-1661684237);
                gapComposer3.end(z);
            } else {
                gapComposer3.startReplaceGroup(-1661684236);
                zzai.m2001MooncakeDiscoverTextsSOGCe0(SpacerKt.m302paddingqDBjuR0$default(companion3, 20.0f, 8.0f, 20.0f, RecyclerView.DECELERATION_RATE, 8), text5, null, 0L, null, 0, 0, i3, null, gapComposer3, 0);
                gapComposer3.end(z);
            }
            Text text6 = detailsPage.subheadline;
            if (text6 == null) {
                gapComposer3.startReplaceGroup(-1661457069);
                gapComposer3.end(z);
                companion4 = companion3;
            } else {
                gapComposer3.startReplaceGroup(-1661457068);
                companion4 = companion3;
                zzai.m2001MooncakeDiscoverTextsSOGCe0(SpacerKt.m302paddingqDBjuR0$default(companion3, 20.0f, 8.0f, 20.0f, RecyclerView.DECELERATION_RATE, 8), text6, null, 0L, null, 0, 0, i3, null, gapComposer3, 0);
                gapComposer3.end(z);
            }
            HeroImage hero_image6 = sortOrder != null ? getHero_image(sortOrder) : null;
            if (hero_image6 == null) {
                gapComposer3.startReplaceGroup(-1661173388);
                gapComposer3.end(z);
                f2 = f;
                z3 = true;
            } else {
                gapComposer3.startReplaceGroup(-1661173387);
                if (z4) {
                    gapComposer3.startReplaceGroup(1558850688);
                    final int i8 = 1;
                    z3 = true;
                    z2 = z;
                    AsyncImageKt.m1441AsyncImagesKDTAoQ(hero_image6.image, null, realImageLoader, thenIfSharedEnter(Request$Priority$EnumUnboxingLocalUtility.m(1.0f, SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion4, 1.0f), RecyclerView.DECELERATION_RATE, 8.0f, 1), true), uiScope, str, new Function4() { // from class: com.squareup.cash.discover.promotiondetails.views.PromotionDetailsViewKt$$ExternalSyntheticLambda16
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i82 = i8;
                            UiScope uiScope2 = (UiScope) obj;
                            final String str2 = (String) obj2;
                            Composer composer22 = (Composer) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            switch (i82) {
                                case 0:
                                    uiScope2.getClass();
                                    str2.getClass();
                                    GapComposer gapComposer62 = (GapComposer) composer22;
                                    gapComposer62.startReplaceGroup(-452131611);
                                    Modifier sharedElement$default = SharedTransitionScope.sharedElement$default(uiScope2, Modifier.Companion.$$INSTANCE, uiScope2.rememberSharedContentState(new Object(str2) { // from class: com.squareup.cash.sharedElements.PromotionDetailsSharedKey$Image
                                        public final String id;

                                        {
                                            str2.getClass();
                                            this.id = str2;
                                        }

                                        public final boolean equals(Object obj5) {
                                            if (this == obj5) {
                                                return true;
                                            }
                                            return (obj5 instanceof PromotionDetailsSharedKey$Image) && Intrinsics.areEqual(this.id, ((PromotionDetailsSharedKey$Image) obj5).id);
                                        }

                                        public final int hashCode() {
                                            return this.id.hashCode();
                                        }

                                        public final String toString() {
                                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Image(id=", this.id, ")");
                                        }
                                    }, gapComposer62, (intValue << 3) & 112), uiScope, null, zzj.overlayClip(uiScope2, gapComposer62), 60);
                                    gapComposer62.end(false);
                                    return sharedElement$default;
                                default:
                                    uiScope2.getClass();
                                    str2.getClass();
                                    GapComposer gapComposer72 = (GapComposer) composer22;
                                    gapComposer72.startReplaceGroup(466251149);
                                    Modifier sharedElement$default2 = SharedTransitionScope.sharedElement$default(uiScope2, Modifier.Companion.$$INSTANCE, uiScope2.rememberSharedContentState(new Object(str2) { // from class: com.squareup.cash.sharedElements.PromotionDetailsSharedKey$Image
                                        public final String id;

                                        {
                                            str2.getClass();
                                            this.id = str2;
                                        }

                                        public final boolean equals(Object obj5) {
                                            if (this == obj5) {
                                                return true;
                                            }
                                            return (obj5 instanceof PromotionDetailsSharedKey$Image) && Intrinsics.areEqual(this.id, ((PromotionDetailsSharedKey$Image) obj5).id);
                                        }

                                        public final int hashCode() {
                                            return this.id.hashCode();
                                        }

                                        public final String toString() {
                                            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Image(id=", this.id, ")");
                                        }
                                    }, gapComposer72, (intValue << 3) & 112), uiScope, null, zzj.overlayClip(uiScope2, gapComposer72), 60);
                                    gapComposer72.end(false);
                                    return sharedElement$default2;
                            }
                        }
                    }, gapComposer3, ((i4 << 3) & 112) | ((i4 >> 9) & 896)), null, ContentScale.Companion.Fit, null, gapComposer3, ((i4 >> 12) & 896) | i2, 0, 3952);
                    gapComposer3.end(z2);
                } else {
                    z2 = z;
                    z3 = true;
                    gapComposer3.startReplaceGroup(1559558232);
                    if (text2 == null && detailsPage.primary_button == null && detailsPage.secondary_button == null) {
                        gapComposer3.startReplaceGroup(1559778952);
                        gapComposer3.end(z2);
                    } else {
                        re$$ExternalSyntheticOutline0.m(gapComposer3, 1559714565, companion4, 20.0f, gapComposer3);
                        gapComposer3.end(z2);
                    }
                    gapComposer3.end(z2);
                }
                f2 = f;
                ButtonBar(detailsPage, true, function1, SpacerKt.m302paddingqDBjuR0$default(OffsetKt.m273offsetVpY3zN4$default(companion4, RecyclerView.DECELERATION_RATE, f2, z3 ? 1 : 0).then(uiScope.$$delegate_1.isTransitionActive() ? AnimatedVisibilityScope.animateEnterExit$default(uiScope, companion4, null, null, 7) : companion4), 20.0f, RecyclerView.DECELERATION_RATE, 20.0f, 24.0f, 2), gapComposer3, ((i4 >> 3) & 896) | 48);
                gapComposer3.end(z2);
            }
            gapComposer3.end(z3);
            gapComposer3.end(z3);
            gapComposer = gapComposer3;
        } else {
            f2 = f;
            gapComposer4.skipToGroupEnd();
            gapComposer = gapComposer4;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new WithdrawView$$ExternalSyntheticLambda11(uiScope, loaded, detailsPageV1, function1, f2, str, realImageLoader, modifier, i);
        }
    }

    /* renamed from: ImageButton-Y0xEhic, reason: not valid java name */
    public static final void m2004ImageButtonY0xEhic(Icons icons, float f, long j, long j2, Function0 function0, Modifier modifier, Composer composer, int i) {
        Icons icons2;
        long j3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1299855818);
        int i2 = i | (gapComposer.changed(f) ? 32 : 16) | (gapComposer.changed(j) ? 256 : 128) | (gapComposer.changed(j2) ? 2048 : 1024) | (gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changed(modifier) ? PKIFailureInfo.unsupportedVersion : 65536);
        if (gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            if (Color.m676equalsimpl0(j2, Color.Transparent)) {
                gapComposer.startReplaceGroup(579951835);
                gapComposer.end(false);
                j3 = j2;
            } else {
                gapComposer.startReplaceGroup(579785458);
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                j3 = zzr.m2005lerpColorsjxsXWHM(f, j2, colors.semantic.background.f1047app);
                gapComposer.end(false);
            }
            Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long m2005lerpColorsjxsXWHM = zzr.m2005lerpColorsjxsXWHM(f, j, colors2.semantic.icon.standard);
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(ImageKt.m177backgroundbw27NRU(KeypadKt.m3658mooncakeShadowWMci_g0$default(SizeKt.m285size3ABfNKs(SpacerKt.m298padding3ABfNKs(modifier, 12.0f), 44.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, (1.0f - f) * 0.06f, RoundedCornerShapeKt.CircleShape, 19), j3, ColorKt.RectangleShape), false, null, null, function0, 15);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m183clickableoSLSa3U$default);
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
            icons2 = icons;
            ImageKt.Image(Countries.painterResource(icons2.drawableRes, 0, gapComposer), null, null, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(m2005lerpColorsjxsXWHM, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(m2005lerpColorsjxsXWHM), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 48, 60);
            gapComposer.end(true);
        } else {
            icons2 = icons;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SavingsScreenHeaderKt$$ExternalSyntheticLambda18(icons2, f, j, j2, function0, modifier, i);
        }
    }

    public static final void PromotionDetailsUi(PromotionDetailsViewModel promotionDetailsViewModel, Function1 function1, RealImageLoader realImageLoader, CashTreehouseLayout cashTreehouseLayout, Composer composer, int i) {
        int i2;
        promotionDetailsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-195124516);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(promotionDetailsViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? gapComposer.changed(cashTreehouseLayout) : gapComposer.changedInstance(cashTreehouseLayout) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(-614984231, new ComposeDialogKt$$ExternalSyntheticLambda12(function1, promotionDetailsViewModel, realImageLoader, cashTreehouseLayout, 28), gapComposer), gapComposer, 6);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BookletGridKt$$ExternalSyntheticLambda2(promotionDetailsViewModel, function1, realImageLoader, cashTreehouseLayout, i, 28);
        }
    }

    public static final void TreehouseContent(final PromotionDetailsViewModel.Loaded loaded, final PromotionDetailsViewModel.DetailsPageData.DetailsPageV1 detailsPageV1, final CashTreehouseLayout cashTreehouseLayout, Composer composer, final int i) {
        int i2;
        PromotionDetailsViewModel.DetailsPageData.DetailsPageV1 detailsPageV12;
        CashTreehouseLayout cashTreehouseLayout2;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        String str;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1023931415);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(detailsPageV1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer2.changed(cashTreehouseLayout) : gapComposer2.changedInstance(cashTreehouseLayout) ? 256 : 128;
        }
        int i4 = i2;
        boolean z = false;
        int i5 = 1;
        if (!gapComposer2.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
            detailsPageV12 = detailsPageV1;
            cashTreehouseLayout2 = cashTreehouseLayout;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        } else {
            if (cashTreehouseLayout == null) {
                endRestartGroup = gapComposer2.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i6 = 0;
                    function2 = new Function2() { // from class: com.squareup.cash.discover.promotiondetails.views.PromotionDetailsViewKt$$ExternalSyntheticLambda19
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i7 = i6;
                            int i8 = i;
                            CashTreehouseLayout cashTreehouseLayout3 = cashTreehouseLayout;
                            PromotionDetailsViewModel.DetailsPageData.DetailsPageV1 detailsPageV13 = detailsPageV1;
                            PromotionDetailsViewModel.Loaded loaded2 = loaded;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i7) {
                                case 0:
                                    zzj.TreehouseContent(loaded2, detailsPageV13, cashTreehouseLayout3, composer2, Updater.updateChangedFlags(i8 | 1));
                                    break;
                                default:
                                    zzj.TreehouseContent(loaded2, detailsPageV13, cashTreehouseLayout3, composer2, Updater.updateChangedFlags(i8 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            detailsPageV12 = detailsPageV1;
            String str2 = detailsPageV12.details.treehouse_path;
            int i7 = i4 & 896;
            boolean changed = gapComposer2.changed(str2) | (i7 == 256 || ((i4 & 512) != 0 && gapComposer2.changedInstance(cashTreehouseLayout))) | gapComposer2.changedInstance(loaded);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                str = str2;
                GLSceneScopeProvider$SceneScope$2$1$1 gLSceneScopeProvider$SceneScope$2$1$1 = new GLSceneScopeProvider$SceneScope$2$1$1(str, cashTreehouseLayout, loaded, (Continuation) null, 5);
                cashTreehouseLayout2 = cashTreehouseLayout;
                gapComposer2.updateRememberedValue(gLSceneScopeProvider$SceneScope$2$1$1);
                rememberedValue = gLSceneScopeProvider$SceneScope$2$1$1;
            } else {
                str = str2;
                cashTreehouseLayout2 = cashTreehouseLayout;
            }
            Updater.LaunchedEffect(gapComposer2, str, (Function2) rememberedValue);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f);
            boolean z2 = i7 == 256 || ((i4 & 512) != 0 && gapComposer2.changedInstance(cashTreehouseLayout2));
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new RealEmbeddedTreehouseContent$$ExternalSyntheticLambda1(cashTreehouseLayout2, i5);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            Function1 function1 = (Function1) rememberedValue2;
            boolean z3 = i7 == 256 || ((i4 & 512) != 0 && gapComposer2.changedInstance(cashTreehouseLayout2));
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (z3 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new RealEmbeddedTreehouseContent$$ExternalSyntheticLambda1(cashTreehouseLayout2, i3);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            Function1 function12 = (Function1) rememberedValue3;
            if (i7 == 256 || ((i4 & 512) != 0 && gapComposer2.changedInstance(cashTreehouseLayout2))) {
                z = true;
            }
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (z || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new RealEmbeddedTreehouseContent$$ExternalSyntheticLambda1(cashTreehouseLayout2, 3);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            gapComposer = gapComposer2;
            AndroidView_androidKt.AndroidView(function1, fillMaxWidth, null, function12, (Function1) rememberedValue4, gapComposer, 48, 4);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i8 = 1;
            final PromotionDetailsViewModel.DetailsPageData.DetailsPageV1 detailsPageV13 = detailsPageV12;
            final CashTreehouseLayout cashTreehouseLayout3 = cashTreehouseLayout2;
            function2 = new Function2() { // from class: com.squareup.cash.discover.promotiondetails.views.PromotionDetailsViewKt$$ExternalSyntheticLambda19
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i72 = i8;
                    int i82 = i;
                    CashTreehouseLayout cashTreehouseLayout32 = cashTreehouseLayout3;
                    PromotionDetailsViewModel.DetailsPageData.DetailsPageV1 detailsPageV132 = detailsPageV13;
                    PromotionDetailsViewModel.Loaded loaded2 = loaded;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i72) {
                        case 0:
                            zzj.TreehouseContent(loaded2, detailsPageV132, cashTreehouseLayout32, composer2, Updater.updateChangedFlags(i82 | 1));
                            break;
                        default:
                            zzj.TreehouseContent(loaded2, detailsPageV132, cashTreehouseLayout32, composer2, Updater.updateChangedFlags(i82 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final GooglePayJsonFactory.BillingAddressParameters convert(GooglePayPaymentMethodLauncher$BillingAddressConfig googlePayPaymentMethodLauncher$BillingAddressConfig) {
        GooglePayJsonFactory.BillingAddressParameters.Format format2;
        googlePayPaymentMethodLauncher$BillingAddressConfig.getClass();
        boolean z = googlePayPaymentMethodLauncher$BillingAddressConfig.isRequired;
        int ordinal = googlePayPaymentMethodLauncher$BillingAddressConfig.f1436format.ordinal();
        if (ordinal == 0) {
            format2 = GooglePayJsonFactory.BillingAddressParameters.Format.Min;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            format2 = GooglePayJsonFactory.BillingAddressParameters.Format.Full;
        }
        return new GooglePayJsonFactory.BillingAddressParameters(z, format2, googlePayPaymentMethodLauncher$BillingAddressConfig.isPhoneNumberRequired);
    }

    public static final HeroImage getHero_image(SortOrder sortOrder) {
        DetailsPage$PrimaryContent$HeroImage detailsPage$PrimaryContent$HeroImage = sortOrder instanceof DetailsPage$PrimaryContent$HeroImage ? (DetailsPage$PrimaryContent$HeroImage) sortOrder : null;
        if (detailsPage$PrimaryContent$HeroImage != null) {
            return detailsPage$PrimaryContent$HeroImage.value;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00fc A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final SharedTransitionScope.OverlayClip overlayClip(UiScope uiScope, GapComposer gapComposer) {
        Object m;
        float f;
        boolean changed;
        Object rememberedValue;
        int ordinal;
        float f2;
        boolean changed2;
        Object rememberedValue2;
        androidx.compose.animation.core.Transition transition = uiScope.$$delegate_0.getTransition();
        TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.DpToVector;
        boolean isSeeking = transition.isSeeking();
        InteractionResult interactionResult = transition.transitionState;
        Object obj = Composer.Companion.Empty;
        if (isSeeking) {
            m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, 1666827533, false, interactionResult);
        } else {
            gapComposer.startReplaceGroup(1666573488);
            boolean changed3 = gapComposer.changed(transition);
            m = gapComposer.rememberedValue();
            if (changed3 || m == obj) {
                Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                try {
                    Object currentState = interactionResult.getCurrentState();
                    zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    gapComposer.updateRememberedValue(currentState);
                    m = currentState;
                } catch (Throwable th) {
                    zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                    throw th;
                }
            }
            gapComposer.end(false);
        }
        gapComposer.startReplaceGroup(-483101383);
        int ordinal2 = ((EnterExitState) m).ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                gapComposer.startReplaceGroup(-403955333);
                gapComposer.end(false);
                f = RecyclerView.DECELERATION_RATE;
                Dp m2 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, false, f);
                changed = gapComposer.changed(transition);
                rememberedValue = gapComposer.rememberedValue();
                int i = 6;
                if (!changed || rememberedValue == obj) {
                    rememberedValue = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(transition, i));
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                EnterExitState enterExitState = (EnterExitState) ((State) rememberedValue).getValue();
                gapComposer.startReplaceGroup(-483101383);
                ordinal = enterExitState.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        gapComposer.startReplaceGroup(-403955333);
                        gapComposer.end(false);
                        f2 = RecyclerView.DECELERATION_RATE;
                        Dp m3 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, false, f2);
                        changed2 = gapComposer.changed(transition);
                        rememberedValue2 = gapComposer.rememberedValue();
                        if (!changed2 || rememberedValue2 == obj) {
                            rememberedValue2 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(transition, 7));
                            gapComposer.updateRememberedValue(rememberedValue2);
                        }
                        ((Transition.Segment) ((State) rememberedValue2).getValue()).getClass();
                        gapComposer.startReplaceGroup(1279976669);
                        TweenSpec tween$default = AnimatableKt.tween$default(600, 0, null, 6);
                        gapComposer.end(false);
                        return uiScope.$$delegate_1.OverlayClip(RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(((Dp) AnimatableKt.createTransitionAnimation(transition, m2, m3, tween$default, twoWayConverterImpl, gapComposer, 0).value$delegate.getValue()).value));
                    }
                    if (ordinal != 2) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -403960529, false);
                    }
                }
                gapComposer.startReplaceGroup(-403956865);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Object obj2 = DefaultSizes.border.entries;
                gapComposer.end(false);
                f2 = 16.0f;
                Dp m32 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, false, f2);
                changed2 = gapComposer.changed(transition);
                rememberedValue2 = gapComposer.rememberedValue();
                if (!changed2) {
                }
                rememberedValue2 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(transition, 7));
                gapComposer.updateRememberedValue(rememberedValue2);
                ((Transition.Segment) ((State) rememberedValue2).getValue()).getClass();
                gapComposer.startReplaceGroup(1279976669);
                TweenSpec tween$default2 = AnimatableKt.tween$default(600, 0, null, 6);
                gapComposer.end(false);
                return uiScope.$$delegate_1.OverlayClip(RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(((Dp) AnimatableKt.createTransitionAnimation(transition, m2, m32, tween$default2, twoWayConverterImpl, gapComposer, 0).value$delegate.getValue()).value));
            }
            if (ordinal2 != 2) {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -403960529, false);
            }
        }
        gapComposer.startReplaceGroup(-403956865);
        ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
        Object obj3 = DefaultSizes.border.entries;
        gapComposer.end(false);
        f = 16.0f;
        Dp m22 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, false, f);
        changed = gapComposer.changed(transition);
        rememberedValue = gapComposer.rememberedValue();
        int i2 = 6;
        if (!changed) {
        }
        rememberedValue = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(transition, i2));
        gapComposer.updateRememberedValue(rememberedValue);
        EnterExitState enterExitState2 = (EnterExitState) ((State) rememberedValue).getValue();
        gapComposer.startReplaceGroup(-483101383);
        ordinal = enterExitState2.ordinal();
        if (ordinal != 0) {
        }
        gapComposer.startReplaceGroup(-403956865);
        ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
        Object obj22 = DefaultSizes.border.entries;
        gapComposer.end(false);
        f2 = 16.0f;
        Dp m322 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, false, f2);
        changed2 = gapComposer.changed(transition);
        rememberedValue2 = gapComposer.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(transition, 7));
        gapComposer.updateRememberedValue(rememberedValue2);
        ((Transition.Segment) ((State) rememberedValue2).getValue()).getClass();
        gapComposer.startReplaceGroup(1279976669);
        TweenSpec tween$default22 = AnimatableKt.tween$default(600, 0, null, 6);
        gapComposer.end(false);
        return uiScope.$$delegate_1.OverlayClip(RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(((Dp) AnimatableKt.createTransitionAnimation(transition, m22, m322, tween$default22, twoWayConverterImpl, gapComposer, 0).value$delegate.getValue()).value));
    }

    public static final Modifier thenIfSharedEnter(Modifier modifier, UiScope uiScope, String str, Function4 function4, Composer composer, int i) {
        Modifier modifier2;
        if (str == null || uiScope.$$delegate_0.getTransition().targetState$delegate.getValue() == EnterExitState.PostExit) {
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startReplaceGroup(-1864184121);
            gapComposer.end(false);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startReplaceGroup(-1864234000);
            modifier2 = (Modifier) function4.invoke(uiScope, str, gapComposer2, Integer.valueOf((i >> 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO));
            gapComposer2.end(false);
        }
        return modifier.then(modifier2);
    }

    public static Object zzc(Class cls, String str, zbc... zbcVarArr) {
        int length = zbcVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i = 0; i < zbcVarArr.length; i++) {
            zbc zbcVar = zbcVarArr[i];
            zbcVar.getClass();
            clsArr[i] = (Class) zbcVar.zba;
            objArr[i] = zbcVarArr[i].zbb;
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }
}
