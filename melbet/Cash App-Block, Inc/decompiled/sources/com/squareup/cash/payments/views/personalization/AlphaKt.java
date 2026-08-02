package com.squareup.cash.payments.views.personalization;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.icu.text.MessageFormat;
import android.media.AudioManager;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.animation.core.ArcSplineKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.DefaultTransformableState;
import androidx.compose.foundation.gestures.TransformableStateKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListIntervalContent$$ExternalSyntheticLambda1;
import androidx.compose.foundation.pager.DefaultPagerState;
import androidx.compose.foundation.pager.PagerDefaults;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScopeImpl;
import androidx.compose.foundation.pager.PagerSnapDistanceMaxPages;
import androidx.compose.foundation.pager.PagerState$scrollToPage$2;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.RippleKt;
import androidx.compose.material.RippleNodeFactory;
import androidx.compose.material.SnackbarHostKt$$ExternalSyntheticLambda3;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda2;
import androidx.compose.material3.AlertDialogKt$$ExternalSyntheticLambda1;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.ZIndexModifierKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.LightingColorFilter;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.drawscope.Stroke;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.LazyWindowInfo;
import androidx.compose.ui.platform.WindowInfo;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.window.AndroidPopup_androidKt;
import androidx.compose.ui.window.PopupProperties;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.local.views.cart.CreateCartErrorBannerKt$$ExternalSyntheticLambda3;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda17;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda30;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda4;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.molecule.PlatformKt;
import bo.app.h2$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.AsyncImagePainter;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ToastKt$$ExternalSyntheticLambda8;
import com.squareup.cash.arcade.components.ToastKt$Toast$7$1;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.input.SelectionCardKt$$ExternalSyntheticLambda5;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$FrameRenderer$5$1$1$1$1;
import com.squareup.cash.graphics.views.effect.TortoiseCardEffectKt;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.applets.common.views.LoadingBalanceAppletTileKt$$ExternalSyntheticLambda4;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda10;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda14;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda32;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda7;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.genie.TextViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda14;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mosaic.resources.api.v2.BackgroundEffect;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.presenters.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.viewmodels.Background;
import com.squareup.cash.payments.viewmodels.ConfirmRetryResourceDialog;
import com.squareup.cash.payments.viewmodels.Element;
import com.squareup.cash.payments.viewmodels.ExpressivePaymentDetailsModel;
import com.squareup.cash.payments.viewmodels.HeaderAvatar;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentRecipientViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentStickersViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentToolbarViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewModel;
import com.squareup.cash.payments.viewmodels.PreviewSticker;
import com.squareup.cash.payments.viewmodels.Sticker;
import com.squareup.cash.payments.viewmodels.Text;
import com.squareup.cash.payments.views.DissolveWipeContentKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.views.NoteRequiredViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.views.UtilKt;
import com.squareup.cash.payments.views.nearby.NearbyPayRequestViewKt$$ExternalSyntheticLambda34;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter$models$1$1;
import com.squareup.cash.pdf.view.PdfPreviewView$$ExternalSyntheticLambda1;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.applets.views.PoolsAppletTileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.pools.views.PoolDetailsViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.recipients.data.UtilsKt;
import com.squareup.cash.score.views.CalloutKt$$ExternalSyntheticLambda4;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda5;
import com.squareup.cash.score.views.ScoreHomeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda8;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.support.chat.views.input.InputAreaKt$$ExternalSyntheticLambda0;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import com.squareup.cash.treehouse.android.platform.LoadingScrimKt$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.SharedViewEventsKt;
import com.squareup.util.coroutines.BufferCountKt$bufferSkip$1;
import com.stripe.android.uicore.StripeThemeKt$$ExternalSyntheticLambda2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public abstract class AlphaKt {
    public static final ComposableLambdaImpl lambda$2054845835 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(14), false, 2054845835);

    /* renamed from: lambda$-1024976170, reason: not valid java name */
    public static final ComposableLambdaImpl f562lambda$1024976170 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(16), false, -1024976170);

    public static final void ActionButton(int i, Composer composer, Modifier modifier, String str, Function0 function0) {
        GapComposer gapComposer;
        Modifier modifier2;
        Icons icons = Icons.NavigationVolumeOn;
        function0.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1389106203);
        int i2 = i | 6 | (gapComposer2.changedInstance(function0) ? 32 : 16) | (gapComposer2.changed(str) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            modifier2 = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(modifier2, 40.0f);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ShadowKt.m591shadows4CzXII$default(m285size3ABfNKs, 12.0f, roundedCornerShape, false, 28), Color.White, roundedCornerShape);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
            }
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m182clickableO2vRcR0$default(m177backgroundbw27NRU, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m500rippleH2RKhps$default(32.0f, 4, 0L, false), false, null, null, function0, 28), 8.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer = gapComposer2;
            Trace.m1191Iconww6aTOc(icons, str, (Modifier) null, Color.Black, gapComposer, 3078 | ((i2 >> 6) & 112), 4);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ToViewKt$$ExternalSyntheticLambda1(modifier2, function0, str, i);
        }
    }

    public static final void ActionMenu(final Modifier modifier, final boolean z, final boolean z2, final boolean z3, final boolean z4, final boolean z5, final Function1 function1, Composer composer, final int i) {
        int i2;
        int i3;
        NeverEqualPolicy neverEqualPolicy;
        boolean z6;
        boolean z7;
        BlendModeColorFilter blendModeColorFilter;
        GapComposer gapComposer;
        BlendModeColorFilter blendModeColorFilter2;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-5893581);
        int i4 = i | (gapComposer2.changed(modifier) ? 4 : 2) | (gapComposer2.changed(z) ? 32 : 16) | (gapComposer2.changed(z2) ? 256 : 128) | (gapComposer2.changed(z3) ? 2048 : 1024) | (gapComposer2.changed(z4) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer2.changed(z5) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer2.changedInstance(function1) ? 1048576 : PKIFailureInfo.signerNotTrusted);
        if (gapComposer2.shouldExecute(i4 & 1, (599187 & i4) != 599186)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(24.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer2, 6);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier);
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
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (z3) {
                gapComposer2.startReplaceGroup(-884514618);
                boolean z8 = (i4 & 3670016) == 1048576;
                Object rememberedValue = gapComposer2.rememberedValue();
                if (z8 || rememberedValue == neverEqualPolicy2) {
                    rememberedValue = new ActionMenuKt$$ExternalSyntheticLambda0(0, function1);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                if (z) {
                    gapComposer = gapComposer2;
                    long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(0.2f, Color.Black, 14);
                    i2 = i4;
                    blendModeColorFilter2 = new BlendModeColorFilter(m675copywmQWz5c$default, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(m675copywmQWz5c$default), ColorKt.m693toAndroidBlendModes9anfk8(5)));
                } else {
                    i2 = i4;
                    gapComposer = gapComposer2;
                    blendModeColorFilter2 = null;
                }
                gapComposer2 = gapComposer;
                neverEqualPolicy = neverEqualPolicy2;
                i3 = 5;
                z6 = true;
                z7 = false;
                ActionButton(null, function0, R.drawable.text, blendModeColorFilter2, Room.stringResource(gapComposer2, R.string.add_text_content_desc_personalization), gapComposer2, 0);
                gapComposer2.end(false);
            } else {
                i2 = i4;
                i3 = 5;
                neverEqualPolicy = neverEqualPolicy2;
                z6 = true;
                z7 = false;
                gapComposer2.startReplaceGroup(-884146555);
                gapComposer2.end(false);
            }
            if (z5) {
                gapComposer2.startReplaceGroup(-884104984);
                boolean z9 = (i2 & 3670016) == 1048576 ? z6 : z7;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (z9 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ActionMenuKt$$ExternalSyntheticLambda0(17, function1);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                zzd zzdVar = Icons.Companion;
                ActionButton(MLKEMEngine.KyberPolyBytes, gapComposer2, null, Room.stringResource(gapComposer2, R.string.add_music_content_desc_personalization), (Function0) rememberedValue2);
                gapComposer2.end(z7);
            } else {
                gapComposer2.startReplaceGroup(-883800347);
                gapComposer2.end(z7);
            }
            if (z4) {
                gapComposer2.startReplaceGroup(-883754343);
                boolean z10 = (i2 & 3670016) == 1048576 ? z6 : z7;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (z10 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new ActionMenuKt$$ExternalSyntheticLambda0(18, function1);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                Function0 function02 = (Function0) rememberedValue3;
                if (z2) {
                    long m675copywmQWz5c$default2 = Color.m675copywmQWz5c$default(0.2f, Color.Black, 14);
                    blendModeColorFilter = new BlendModeColorFilter(m675copywmQWz5c$default2, i3, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(m675copywmQWz5c$default2), ColorKt.m693toAndroidBlendModes9anfk8(i3)));
                } else {
                    blendModeColorFilter = null;
                }
                ActionButton(null, function02, R.drawable.sticker, blendModeColorFilter, Room.stringResource(gapComposer2, R.string.add_sticker_content_desc_personalization), gapComposer2, 0);
                gapComposer2.end(z7);
            } else {
                gapComposer2.startReplaceGroup(-883373787);
                gapComposer2.end(z7);
            }
            gapComposer2.end(z6);
        } else {
            gapComposer2.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(z, z2, z3, z4, z5, function1, i) { // from class: com.squareup.cash.payments.views.personalization.ActionMenuKt$$ExternalSyntheticLambda3
                public final /* synthetic */ boolean f$1;
                public final /* synthetic */ boolean f$2;
                public final /* synthetic */ boolean f$3;
                public final /* synthetic */ boolean f$4;
                public final /* synthetic */ boolean f$5;
                public final /* synthetic */ Function1 f$6;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    AlphaKt.ActionMenu(Modifier.this, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void Alpha(Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1139731746);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            BoxKt.Box(ImageKt.m177backgroundbw27NRU(modifier, Color.m675copywmQWz5c$default(0.5f, Color.Black, 14), ColorKt.RectangleShape), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SnackbarHostKt$$ExternalSyntheticLambda3(modifier, i, 19, (byte) 0);
        }
    }

    /* renamed from: AmountView-eaDK9VM, reason: not valid java name */
    public static final void m3712AmountVieweaDK9VM(Modifier modifier, String str, long j, long j2, Composer composer, int i) {
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1004028695);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(j) ? 256 : 128) | (gapComposer.changed(j2) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Boxes$$ExternalSyntheticOutline1.m(140, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).keypadTotal, 0L, UtilKt.scaledSp(gapComposer, parcelableSnapshotMutableIntState.getIntValue()), null, null, Room.getSp(0.02d), null, 0L, null, null, null, 0, UtilKt.scaledSp(gapComposer, 100), null, null, 0, 16646013);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ClusterItemKt$$ExternalSyntheticLambda3(str, 26);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) rememberedValue2);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(clearAndSetSemantics, ((Density) gapComposer.consume(staticProvidableCompositionLocal)).mo233toDpu2uoSUM(60), RecyclerView.DECELERATION_RATE, 2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            int i3 = (i2 >> 3) & 14;
            Room.m1165Text25TpFw(0, 1, 0, 0, i3 | 1572864 | (i2 & 7168), 0, 4018, j2, (Composer) gapComposer, (Modifier) null, TextStyle.m994copyp1EtxEg$default(m994copyp1EtxEg$default, 0L, 0L, null, null, 0L, null, 0L, null, null, new Stroke(TextUnit.m1059getValueimpl(Room.pack(4294967296L, (parcelableSnapshotMutableIntState.getIntValue() * 0.25f) / ((Density) gapComposer.consume(staticProvidableCompositionLocal)).getFontScale())), RecyclerView.DECELERATION_RATE, 1, 1, null, 18), 0, 0L, null, null, 0, 16760831), (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda14(22, parcelableSnapshotMutableIntState);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Room.m1165Text25TpFw(0, 1, 0, 0, i3 | 1597440 | ((i2 << 3) & 7168), 0, 4002, j, (Composer) gapComposer, (Modifier) null, m994copyp1EtxEg$default, (TextLineBalancing) null, str, (Map) null, (Function1) rememberedValue3, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AmountViewKt$$ExternalSyntheticLambda2(modifier, str, j, j2, i, 0);
        }
    }

    public static final void BackgroundCarousel(int i, int i2, Composer composer, Modifier modifier, final List list, final Function1 function1) {
        GapComposer gapComposer;
        DefaultPagerState defaultPagerState;
        NeverEqualPolicy neverEqualPolicy;
        int i3;
        MutableState mutableState;
        function1.getClass();
        list.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-735346158);
        int i4 = i2 | (gapComposer2.changed(modifier) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changedInstance(list) ? 256 : 128) | (gapComposer2.changed(i) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            Object systemService = ((Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext)).getSystemService("audio");
            systemService.getClass();
            final AudioManager audioManager = (AudioManager) systemService;
            final PlatformHapticFeedback platformHapticFeedback = (PlatformHapticFeedback) gapComposer2.consume(CompositionLocalsKt.LocalHapticFeedback);
            boolean changedInstance = gapComposer2.changedInstance(list);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy2) {
                rememberedValue = new h2$$ExternalSyntheticLambda0(list, 10);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DefaultPagerState rememberPagerState = PagerStateKt.rememberPagerState(i, (Function0) rememberedValue, gapComposer2, ((i4 >> 9) & 14) | 48, 0);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy2) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy2) {
                rememberedValue3 = Updater.mutableStateOf$default(Boolean.TRUE);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState3 = (MutableState) rememberedValue3;
            int i5 = i4 & 7168;
            boolean changed = (i5 == 2048) | gapComposer2.changed(rememberPagerState) | ((i4 & 112) == 32);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed || rememberedValue4 == neverEqualPolicy2) {
                defaultPagerState = rememberPagerState;
                neverEqualPolicy = neverEqualPolicy2;
                BufferCountKt$bufferSkip$1 bufferCountKt$bufferSkip$1 = new BufferCountKt$bufferSkip$1(defaultPagerState, function1, i, mutableState3, mutableState2, null, 7);
                i3 = i;
                mutableState = mutableState3;
                gapComposer2.updateRememberedValue(bufferCountKt$bufferSkip$1);
                rememberedValue4 = bufferCountKt$bufferSkip$1;
            } else {
                neverEqualPolicy = neverEqualPolicy2;
                mutableState = mutableState3;
                i3 = i;
                defaultPagerState = rememberPagerState;
            }
            Updater.LaunchedEffect(gapComposer2, defaultPagerState, (Function2) rememberedValue4);
            Integer valueOf = Integer.valueOf(i3);
            boolean changed2 = gapComposer2.changed(defaultPagerState) | (i5 == 2048);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new PagerState$scrollToPage$2(defaultPagerState, i3, null, 3);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) rememberedValue5);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
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
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            DefaultPagerState defaultPagerState2 = defaultPagerState;
            final int i6 = i3;
            final MutableState mutableState4 = mutableState;
            gapComposer = gapComposer2;
            PagerKt.m328HorizontalPager8jOkeI(defaultPagerState2, null, SpacerKt.m295PaddingValuesYgX7TsA$default((((Configuration) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenWidthDp / 2.0f) - 40.0f, RecyclerView.DECELERATION_RATE, 2), null, 0, RecyclerView.DECELERATION_RATE, null, PagerDefaults.flingBehavior(defaultPagerState2, new PagerSnapDistanceMaxPages(10), AnimatableKt.spring$default(0.75f, 1500.0f, null, 4), gapComposer2, 3072, 20), ((Boolean) mutableState.getValue()).booleanValue(), null, null, null, Expect_jvmKt.rememberComposableLambda(-866051175, new Function4() { // from class: com.squareup.cash.payments.views.personalization.BackgroundCarouselKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function4
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    final int intValue = ((Integer) obj2).intValue();
                    Composer composer2 = (Composer) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    ((PagerScopeImpl) obj).getClass();
                    final int i7 = i6;
                    State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(i7 == intValue ? 1.2f : 1.0f, null, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(intValue, "image scale "), null, composer2, 0, 22);
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(companion, 80.0f, 84.0f);
                    float floatValue = ((Number) animateFloatAsState.getValue()).floatValue();
                    Modifier clip = ClipKt.clip(SpacerKt.m300paddingVpY3zN4$default(ScaleKt.scale(m287sizeVpY3zN4, floatValue, floatValue), 8.0f, RecyclerView.DECELERATION_RATE, 2), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    Object rememberedValue6 = gapComposer3.rememberedValue();
                    Applier applier = gapComposer3.applier;
                    Object obj5 = Composer.Companion.Empty;
                    if (rememberedValue6 == obj5) {
                        rememberedValue6 = Recorder$$ExternalSyntheticOutline2.m(gapComposer3);
                    }
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue6;
                    RippleNodeFactory m500rippleH2RKhps$default = RippleKt.m500rippleH2RKhps$default(RecyclerView.DECELERATION_RATE, 6, 0L, false);
                    final MutableState mutableState5 = mutableState4;
                    boolean booleanValue = ((Boolean) mutableState5.getValue()).booleanValue();
                    String stringResource = Room.stringResource(gapComposer3, R.string.personalized_payment_select_background_label);
                    boolean changed3 = gapComposer3.changed(i7) | ((((intValue2 & 112) ^ 48) > 32 && gapComposer3.changed(intValue)) || (intValue2 & 48) == 32);
                    final PlatformHapticFeedback platformHapticFeedback2 = platformHapticFeedback;
                    boolean changedInstance2 = changed3 | gapComposer3.changedInstance(platformHapticFeedback2);
                    final AudioManager audioManager2 = audioManager;
                    boolean changedInstance3 = changedInstance2 | gapComposer3.changedInstance(audioManager2);
                    final Function1 function12 = function1;
                    boolean changed4 = changedInstance3 | gapComposer3.changed(function12);
                    Object rememberedValue7 = gapComposer3.rememberedValue();
                    if (changed4 || rememberedValue7 == obj5) {
                        Function0 function0 = new Function0() { // from class: com.squareup.cash.payments.views.personalization.BackgroundCarouselKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i8 = i7;
                                int i9 = intValue;
                                mutableState5.setValue(Boolean.valueOf(i8 == i9));
                                platformHapticFeedback2.m769performHapticFeedbackCdsT49E(0);
                                audioManager2.playSoundEffect(0, 1.0f);
                                function12.invoke(Integer.valueOf(i9));
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer3.updateRememberedValue(function0);
                        rememberedValue7 = function0;
                    }
                    Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(clip, mutableInteractionSourceImpl, m500rippleH2RKhps$default, booleanValue, stringResource, null, (Function0) rememberedValue7, 16);
                    BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, m182clickableO2vRcR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer3.startReusableNode();
                    if (gapComposer3.inserting) {
                        gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer3.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf2 = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer3, valueOf2, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    List list2 = list;
                    AsyncImagePainter m1446rememberAsyncImagePainter19ie5dc = AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer3, ThemablesKt.urlForTheme(((Background) list2.get(intValue)).thumbnail, gapComposer3));
                    if (((AsyncImagePainter.State) Updater.collectAsState(m1446rememberAsyncImagePainter19ie5dc.state, null, gapComposer3, 1).getValue()) instanceof AsyncImagePainter.State.Success) {
                        gapComposer3.startReplaceGroup(2078554951);
                        String str = ((Background) list2.get(intValue)).accessibilityDescription;
                        if (str == null) {
                            gapComposer3.startReplaceGroup(-625681814);
                            str = new MessageFormat(Room.stringResource(gapComposer3, R.string.personalized_payment_background_content_description)).format(new Object[]{Integer.valueOf(intValue + 1)});
                            str.getClass();
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(-625683798);
                            gapComposer3.end(false);
                        }
                        ImageKt.Image(m1446rememberAsyncImagePainter19ie5dc, str, SizeKt.fillMaxSize(companion, 1.0f), null, ContentScale.Companion.FillBounds, RecyclerView.DECELERATION_RATE, null, gapComposer3, 24960, 104);
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(2078990067);
                        Color forTheme = ThemablesKt.forTheme(((Background) list2.get(intValue)).color, gapComposer3);
                        Modifier fillMaxSize = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, forTheme != null ? forTheme.value : Color.Black, ColorKt.RectangleShape), 1.0f);
                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode3 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer3, fillMaxSize);
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer3, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                        ProgressCircularKt.ProgressCircular(0, 0, gapComposer3, SizeKt.m285size3ABfNKs(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.Center), 20.0f));
                        gapComposer3.end(true);
                        gapComposer3.end(false);
                    }
                    gapComposer3.end(true);
                    return Unit.INSTANCE;
                }
            }, gapComposer2), gapComposer, 0, 24576, 15994);
            BoxKt.Box(ImageKt.m178borderxT4_qwU(ScaleKt.scale(SizeKt.m290width3ABfNKs(SizeKt.m277height3ABfNKs(BoxScopeInstance.INSTANCE.align(Modifier.Companion.$$INSTANCE, Alignment.Companion.Center), 86.0f), 66.0f), 1.2f, 1.2f), 2.0f, Color.White, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), gapComposer, 0);
            gapComposer.end(true);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CreateCartErrorBannerKt$$ExternalSyntheticLambda3(modifier, function1, list, i, i2);
        }
    }

    public static final void CustomContent(Modifier modifier, Function1 function1, PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu loadedPersonalizePaymentMenu, Composer composer, int i) {
        boolean z;
        Function1 function12 = function1;
        function12.getClass();
        loadedPersonalizePaymentMenu.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1921139271);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(function12) ? 32 : 16) | (gapComposer.changedInstance(loadedPersonalizePaymentMenu) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Set set = loadedPersonalizePaymentMenu.elementsBeingDragged;
            List<Element> list = loadedPersonalizePaymentMenu.personalization.elements;
            int i3 = 3;
            if (set.isEmpty()) {
                gapComposer.startReplaceGroup(351301667);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(350776000);
                Modifier align = BoxScopeInstance.INSTANCE.align(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 84.0f, 7), Alignment.Companion.BottomCenter);
                boolean z2 = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z2 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ProfileKt$$ExternalSyntheticLambda3(i3, function12);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(align, (Function1) rememberedValue);
                List list2 = list;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        if (((Element) it.next()).getProperties().isOnTopOfDelete) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                DeleteIcon(0, gapComposer, onGloballyPositioned, z);
                gapComposer.end(false);
            }
            gapComposer.startReplaceGroup(-819950136);
            for (Element element : list) {
                TransformableContent(null, function1, element, loadedPersonalizePaymentMenu.deleteTopY, loadedPersonalizePaymentMenu.allowTextEdit, Expect_jvmKt.rememberComposableLambda(-1795796448, new PoolToastKt$$ExternalSyntheticLambda0(28, element, loadedPersonalizePaymentMenu, function12), gapComposer), gapComposer, 1572870 | ((i2 << 3) & 896));
                function12 = function1;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1((Object) modifier, function1, (Object) loadedPersonalizePaymentMenu, i, 17);
        }
    }

    public static final void DeleteIcon(int i, Composer composer, Modifier modifier, boolean z) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(845303583);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changed(z) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(z ? 2.2f : 1.0f, null, "scale float", null, gapComposer, 3072, 22);
            State m153animateColorAsStateeuL9pac = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(z ? ColorKt.Color(4294920778L) : Color.White, null, "background color", gapComposer, MLKEMEngine.KyberPolyBytes, 10);
            State m153animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m153animateColorAsStateeuL9pac(z ? Color.White : Color.Black, null, "icon color", gapComposer, MLKEMEngine.KyberPolyBytes, 10);
            float floatValue = ((Number) animateFloatAsState.getValue()).floatValue();
            Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(SizeKt.m285size3ABfNKs(ScaleKt.scale(modifier, floatValue, floatValue), 40.0f), ((Color) m153animateColorAsStateeuL9pac.getValue()).value, RoundedCornerShapeKt.CircleShape), 8.0f);
            Painter painterResource = Countries.painterResource(R.drawable.delete_icon, 0, gapComposer);
            long j = ((Color) m153animateColorAsStateeuL9pac2.getValue()).value;
            ImageKt.Image(painterResource, Room.stringResource(gapComposer, R.string.delete_button_icon_description), m298padding3ABfNKs, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable, 56);
            gapComposer = gapComposer;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LoadingScrimKt$$ExternalSyntheticLambda1(modifier, z, i);
        }
    }

    public static final void EditStyleButton(int i, Composer composer, Modifier modifier, Function0 function0) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1549259289);
        int i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            TransparentButton(PlatformKt.withHaptics(function0, ((Haptics) gapComposer.consume(HapticsKt.LocalHaptics)).input.standard, gapComposer, i2 & 14, 0), SizeKt.m276defaultMinSizeVpY3zN4$default(modifier, RecyclerView.DECELERATION_RATE, 44.0f, 1), null, gapComposer, 3072);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda14(function0, modifier, i, 9);
        }
    }

    /* renamed from: ExpressiveAmountView-eaDK9VM, reason: not valid java name */
    public static final void m3713ExpressiveAmountVieweaDK9VM(Modifier modifier, String str, long j, long j2, Composer composer, int i) {
        str.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2066267495);
        int i2 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(j) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1947227620, new NearbyPayRequestViewKt$$ExternalSyntheticLambda34(modifier, str, j), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AmountViewKt$$ExternalSyntheticLambda2(modifier, str, j, j2, i, 1);
        }
    }

    public static final void ExpressiveDetailsRow(ExpressivePaymentDetailsModel expressivePaymentDetailsModel, Modifier modifier, Composer composer, int i) {
        ExpressivePaymentDetailsModel expressivePaymentDetailsModel2;
        Color m;
        AvatarSize avatarSize;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        long j;
        long j2;
        String m2;
        String format2;
        Recipient recipient;
        Recipient recipient2;
        Character ch;
        expressivePaymentDetailsModel.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(537489509);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(expressivePaymentDetailsModel) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m290width3ABfNKs = SizeKt.m290width3ABfNKs(SpacerKt.m300paddingVpY3zN4$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 2), 300.0f);
            Strings.getSizes(gapComposer).getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m290width3ABfNKs);
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
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$12);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$13);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$14);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$15);
            AvatarSize avatarSize2 = AvatarSize.Size48;
            HeaderAvatar headerAvatar = expressivePaymentDetailsModel.recipient;
            String str2 = expressivePaymentDetailsModel.note;
            com.squareup.protos.cash.ui.Color color = headerAvatar != null ? headerAvatar.monogramBackgroundColor : null;
            if (color == null) {
                gapComposer.startReplaceGroup(878005078);
                gapComposer.end(false);
                m = null;
            } else {
                m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -1495697909, color, gapComposer, false);
            }
            if (m == null) {
                gapComposer.startReplaceGroup(-1495695897);
                avatarSize = avatarSize2;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$12;
                j = Strings.getColors(gapComposer).semantic.background.subtle;
                gapComposer.end(false);
            } else {
                avatarSize = avatarSize2;
                composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$12;
                gapComposer.startReplaceGroup(-1495699152);
                gapComposer.end(false);
                j = m.value;
            }
            String valueOf2 = (headerAvatar == null || (ch = headerAvatar.monogram) == null) ? null : String.valueOf(ch.charValue());
            if (valueOf2 == null) {
                valueOf2 = "";
            }
            Image image = headerAvatar != null ? headerAvatar.photoImage : null;
            if (image == null) {
                gapComposer.startReplaceGroup(878230355);
                gapComposer.end(false);
                j2 = j;
                m2 = null;
            } else {
                j2 = j;
                m2 = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, -1495690642, image, gapComposer, false);
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = composeUiNode$Companion$SetModifier$1;
            TextViewKt.m3613AvatarB_rZmmc(avatarSize, valueOf2, j2, (String) null, (Modifier) null, (AvatarImage) (m2 != null ? new AvatarImage.Remote.Image(m2, false, null, 0L, new SheetKt$$ExternalSyntheticLambda8(m2, 12), 62) : null), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer, 3078, 0, 2000);
            gapComposer = gapComposer;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$16);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$14, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$15);
            expressivePaymentDetailsModel2 = expressivePaymentDetailsModel;
            if (expressivePaymentDetailsModel2.isSender) {
                gapComposer.startReplaceGroup(-822798029);
                if (headerAvatar != null && (recipient2 = headerAvatar.recipient) != null) {
                    str = recipient2.displayName;
                }
                format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.expressive_details_to)).format(new Object[]{str != null ? str : ""});
                format2.getClass();
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-822597583);
                if (headerAvatar != null && (recipient = headerAvatar.recipient) != null) {
                    str = recipient.displayName;
                }
                format2 = new MessageFormat(Room.stringResource(gapComposer, R.string.expressive_details_from)).format(new Object[]{str != null ? str : ""});
                format2.getClass();
                gapComposer.end(false);
            }
            String str3 = format2;
            TextStyle textStyle = Strings.getTypography(gapComposer).labelMedium;
            long j3 = Color.White;
            Room.m1165Text25TpFw(0, 1, 0, 0, 1575936, 0, 4018, j3, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
            if (StringsKt.isBlank(str2)) {
                gapComposer.startReplaceGroup(-822029353);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-822252305);
                String format3 = new MessageFormat(Room.stringResource(gapComposer, R.string.expressive_details_for)).format(new Object[]{str2});
                format3.getClass();
                Room.m1165Text25TpFw(0, 2, 0, 0, 1575936, 0, 4018, j3, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, format3, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            expressivePaymentDetailsModel2 = expressivePaymentDetailsModel;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewViewKt$$ExternalSyntheticLambda0(expressivePaymentDetailsModel2, modifier, i, 10);
        }
    }

    public static final void ExpressivePaymentsToolbar(final Modifier modifier, final Function0 function0, final Function1 function1, final boolean z, final boolean z2, final String str, final boolean z3, Composer composer, final int i) {
        int i2;
        boolean z4;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-162409044);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            z4 = z;
            i2 |= gapComposer.changed(z4) ? 2048 : 1024;
        } else {
            z4 = z;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(z2) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(str) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= gapComposer.changed(z3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new TouchRecorder(2);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-743531721, new InputAreaKt$$ExternalSyntheticLambda0(modifier, z3, function0, z2, (TouchRecorder) rememberedValue, function1, z4, str), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.payments.views.personalization.ExpressivePaymentsToolbarKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    AlphaKt.ExpressivePaymentsToolbar(Modifier.this, function0, function1, z, z2, str, z3, (Composer) obj, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void ExpressivePreview(Image image, com.squareup.protos.cash.ui.Color color, List list, String str, Function0 function0, Modifier modifier, com.squareup.protos.cash.ui.Color color2, List list2, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        com.squareup.protos.cash.ui.Color color3;
        int i4;
        List list3;
        int i5;
        com.squareup.protos.cash.ui.Color color4;
        List list4;
        image.getClass();
        list.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-982069828);
        int i6 = (gapComposer.changedInstance(image) ? 4 : 2) | i | (gapComposer.changedInstance(color) ? 32 : 16);
        if ((i & 3072) == 0) {
            i6 |= gapComposer.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i6 |= gapComposer.changedInstance(function0) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i7 = i2 & 32;
        if (i7 != 0) {
            i3 = i6 | 196608;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            i3 = i6 | (gapComposer.changed(modifier2) ? PKIFailureInfo.unsupportedVersion : 65536);
        }
        int i8 = i2 & 64;
        if (i8 != 0) {
            i4 = i3 | 1572864;
            color3 = color2;
        } else {
            color3 = color2;
            i4 = i3 | (gapComposer.changedInstance(color3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        }
        int i9 = i2 & 128;
        if (i9 != 0) {
            i5 = i4 | 12582912;
            list3 = list2;
        } else {
            list3 = list2;
            i5 = i4 | (gapComposer.changedInstance(list3) ? 8388608 : 4194304);
        }
        if (gapComposer.shouldExecute(i5 & 1, (4793363 & i5) != 4793362)) {
            if (i7 != 0) {
                modifier2 = Modifier.Companion.$$INSTANCE;
            }
            Color color5 = null;
            com.squareup.protos.cash.ui.Color color6 = i8 != 0 ? null : color3;
            List list5 = i9 != 0 ? EmptyList.INSTANCE : list3;
            if (color == null) {
                gapComposer.startReplaceGroup(475340763);
                gapComposer.end(false);
            } else {
                color5 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, 1123712230, color, gapComposer, false);
            }
            OffsetKt.BoxWithConstraints(ImageKt.m177backgroundbw27NRU(ClipKt.clip(OffsetKt.aspectRatio(2.0f, SizeKt.fillMaxWidth(modifier2, 1.0f), false), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), color5 != null ? color5.value : Color.Black, ColorKt.RectangleShape), null, false, Expect_jvmKt.rememberComposableLambda(1146098834, new SwipeToDismissKt$$ExternalSyntheticLambda2(function0, AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer, ThemablesKt.urlForTheme(image, gapComposer)), color6, str, list5, 13), gapComposer), gapComposer, 3072, 6);
            color4 = color6;
            list4 = list5;
        } else {
            gapComposer.skipToGroupEnd();
            color4 = color3;
            list4 = list3;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ToastKt$$ExternalSyntheticLambda8(image, color, list, str, function0, modifier2, color4, list4, i, i2);
        }
    }

    public static final void LoadingPersonalizePaymentView(Function0 function0, Function0 function02, Function0 function03, Modifier modifier, boolean z, PersonalizePaymentToolbarViewModel personalizePaymentToolbarViewModel, ConfirmRetryResourceDialog confirmRetryResourceDialog, Composer composer, int i) {
        Modifier modifier2;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1515132493);
        int i2 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | (gapComposer.changedInstance(function02) ? 32 : 16) | (gapComposer.changedInstance(function03) ? 256 : 128) | 3072 | (gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked) | (gapComposer.changedInstance(personalizePaymentToolbarViewModel) ? PKIFailureInfo.unsupportedVersion : 65536) | (gapComposer.changedInstance(confirmRetryResourceDialog) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i2 & 1, (599187 & i2) != 599186)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1352969592, new TooltipKt$$ExternalSyntheticLambda2(z, personalizePaymentToolbarViewModel, function0, confirmRetryResourceDialog, function02, function03), gapComposer), gapComposer, 3072, 7);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneyTabUIKt$$ExternalSyntheticLambda32(function0, function02, function03, modifier2, z, personalizePaymentToolbarViewModel, confirmRetryResourceDialog, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    public static final void PersonalizePayment(PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu loadedPersonalizePaymentMenu, Function1 function1, Composer composer, int i) {
        PersonalizePaymentViewModel.LoadedPersonalizePaymentMenu loadedPersonalizePaymentMenu2;
        Function1 function12;
        Text text;
        loadedPersonalizePaymentMenu.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(842603707);
        int i2 = (gapComposer.changedInstance(loadedPersonalizePaymentMenu) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Iterator it = loadedPersonalizePaymentMenu.personalization.elements.iterator();
            while (true) {
                if (!it.hasNext()) {
                    text = 0;
                    break;
                }
                text = it.next();
                Element element = (Element) text;
                if ((element instanceof Text) && ((Text) element).hasFocus) {
                    break;
                }
            }
            loadedPersonalizePaymentMenu2 = loadedPersonalizePaymentMenu;
            function12 = function1;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(632396944, new PoolGoalMetKt$$ExternalSyntheticLambda0(text instanceof Text ? text : null, function12, loadedPersonalizePaymentMenu2, delegatingSoftwareKeyboardController, 13), gapComposer), gapComposer, 3072, 7);
        } else {
            loadedPersonalizePaymentMenu2 = loadedPersonalizePaymentMenu;
            function12 = function1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewViewKt$$ExternalSyntheticLambda0(loadedPersonalizePaymentMenu2, function12, i, 13);
        }
    }

    /* renamed from: PersonalizePaymentBackground-cf5BqRc, reason: not valid java name */
    public static final void m3714PersonalizePaymentBackgroundcf5BqRc(Modifier modifier, String str, long j, List list, Composer composer, int i) {
        boolean z;
        boolean z2;
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1374566570);
        int i2 = i | (gapComposer.changed(str) ? 32 : 16) | (gapComposer.changed(j) ? 256 : 128) | (gapComposer.changedInstance(list) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            BackgroundEffect backgroundEffect = (BackgroundEffect) CollectionsKt.firstOrNull(list);
            int i3 = backgroundEffect == null ? -1 : PersonalizePaymentBackgroundKt$WhenMappings.$EnumSwitchMapping$0[backgroundEffect.ordinal()];
            if (i3 == 1) {
                gapComposer.startReplaceGroup(1891460388);
                QuickPayViewKt.m3703GlitterBackgroundFNF3uiM(i2 & IptcConstants.IMAGE_RESOURCE_BLOCK_QUICK_MASK_INFO, j, gapComposer, modifier, str);
                gapComposer.end(false);
            } else if (i3 != 2) {
                gapComposer.startReplaceGroup(-1494089849);
                AsyncImagePainter m1446rememberAsyncImagePainter19ie5dc = AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc((i2 >> 3) & 14, 30, gapComposer, str);
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(modifier, 1.0f), j, ColorKt.RectangleShape);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
                boolean z3 = ((AsyncImagePainter.State) Updater.collectAsState(m1446rememberAsyncImagePainter19ie5dc.state, null, gapComposer, 1).getValue()) instanceof AsyncImagePainter.State.Success;
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (z3) {
                    gapComposer.startReplaceGroup(1794688916);
                    z = true;
                    z2 = false;
                    ImageKt.Image(m1446rememberAsyncImagePainter19ie5dc, null, SizeKt.fillMaxSize(companion, 1.0f), null, ContentScale.Companion.Crop, RecyclerView.DECELERATION_RATE, null, gapComposer, 25008, 104);
                    gapComposer.end(false);
                } else {
                    z = true;
                    z2 = false;
                    gapComposer.startReplaceGroup(-773383766);
                    PersonalizedBackgroundLoadingIndicator(SizeKt.m285size3ABfNKs(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.Center), 32.0f), gapComposer, 0);
                    gapComposer.end(false);
                }
                gapComposer.end(z);
                gapComposer.end(z2);
            } else {
                gapComposer.startReplaceGroup(1891463965);
                TortoiseCardEffectKt.TortoiseBackground(6, 0, gapComposer, modifier);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TextViewKt$$ExternalSyntheticLambda0(modifier, str, j, list, i, 5);
        }
    }

    public static final void PersonalizePaymentButton(Modifier modifier, Function0 function0, boolean z, boolean z2, int i, Composer composer, int i2) {
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(215843064);
        int i3 = i2 | 6 | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changed(z) ? 256 : 128) | (gapComposer.changed(z2) ? 2048 : 1024) | (gapComposer.changed(i) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1895048003, new SelectionCardKt$$ExternalSyntheticLambda5(z2, z, function0, i), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LoadingBalanceAppletTileKt$$ExternalSyntheticLambda4(modifier2, function0, z, z2, i, i2);
        }
    }

    public static final void PersonalizePaymentRecipient(PersonalizePaymentRecipientViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        loaded.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1830045798);
        int i2 = (gapComposer.changedInstance(loaded) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1056441669, new PersonalizePaymentRecipientViewKt$$ExternalSyntheticLambda5(loaded, function1), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PersonalizePaymentRecipientViewKt$$ExternalSyntheticLambda5(loaded, function1, i);
        }
    }

    public static final void PersonalizePaymentRecipientView(PersonalizePaymentRecipientViewModel personalizePaymentRecipientViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        personalizePaymentRecipientViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2096885979);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(personalizePaymentRecipientViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(-1774705637, new PdfPreviewViewKt$$ExternalSyntheticLambda0(11, personalizePaymentRecipientViewModel, function1), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(personalizePaymentRecipientViewModel, function1, realImageLoader, i, 26);
        }
    }

    public static final void PersonalizePaymentStickers(Function1 function1, PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel2;
        RealImageLoader realImageLoader2;
        GapComposer gapComposer;
        function1.getClass();
        personalizePaymentStickersViewModel.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1103773431);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            personalizePaymentStickersViewModel2 = personalizePaymentStickersViewModel;
            i2 |= gapComposer2.changedInstance(personalizePaymentStickersViewModel2) ? 32 : 16;
        } else {
            personalizePaymentStickersViewModel2 = personalizePaymentStickersViewModel;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            realImageLoader2 = realImageLoader;
            i2 |= gapComposer2.changedInstance(realImageLoader2) ? 256 : 128;
        } else {
            realImageLoader2 = realImageLoader;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
            long m939getContainerSizeYbymL2g = ((LazyWindowInfo) ((WindowInfo) gapComposer2.consume(CompositionLocalsKt.LocalWindowInfo))).m939getContainerSizeYbymL2g();
            Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
            float mo233toDpu2uoSUM = density.mo233toDpu2uoSUM((int) (BodyPartID.bodyIdMax & m939getContainerSizeYbymL2g)) * 0.4f;
            float mo233toDpu2uoSUM2 = (density.mo233toDpu2uoSUM((int) (m939getContainerSizeYbymL2g >> 32)) / 3.0f) - 24.0f;
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ActionMenuKt$$ExternalSyntheticLambda0(25, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer2, 0, 1);
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-253540606, new LocalHomeGeoViewKt$$ExternalSyntheticLambda4(realImageLoader2, mo233toDpu2uoSUM, function1, personalizePaymentStickersViewModel2, context, mo233toDpu2uoSUM2), gapComposer2), gapComposer, 3072, 7);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(function1, (Object) personalizePaymentStickersViewModel, (Object) realImageLoader, i, 27);
        }
    }

    public static final void PersonalizePaymentTextField(Modifier modifier, Text text, Function1 function1, boolean z, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        Modifier wrapContentHeight;
        Object pdfPreviewPresenter$models$1$1;
        boolean z2;
        text.getClass();
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-71337242);
        int i2 = i | 6 | (gapComposer2.changedInstance(text) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128) | (gapComposer2.changed(z) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(new TextFieldValue(text.value, 0L, 6));
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer2.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer2);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue2;
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(false, gapComposer2, 1);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier zIndex = ZIndexModifierKt.zIndex(companion, Float.MAX_VALUE);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, zIndex);
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
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Alpha(SizeKt.fillMaxSize(companion, 1.0f), gapComposer2, 6);
            gapComposer2.startReplaceGroup(-684204112);
            wrapContentHeight = SizeKt.wrapContentHeight(SizeKt.fillMaxWidth(SharedViewEventsKt.shakeWith(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.BottomCenter), rememberShaker), 1.0f), Alignment.Companion.CenterVertically, (r2 & 2) == 0);
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(FocusTraversalKt.focusRequester(ImageKt.m177backgroundbw27NRU(SpacerKt.imePadding(SpacerKt.navigationBarsPadding(wrapContentHeight)), Color.m675copywmQWz5c$default(0.5f, Color.Black, 14), ColorKt.RectangleShape), focusRequester), RecyclerView.DECELERATION_RATE, 12.0f, 1);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 0, 7, (Boolean) null, 119);
            int i3 = i2 & 896;
            boolean changed = gapComposer2.changed(delegatingSoftwareKeyboardController) | (i3 == 256) | gapComposer2.changedInstance(text);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new MoneyTabUIKt$$ExternalSyntheticLambda39(27, delegatingSoftwareKeyboardController, function1, text);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            KeyboardActions keyboardActions = new KeyboardActions((Function1) rememberedValue3, null, null, 62);
            TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).sectionTitle, Color.White, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744446);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            SolidColor solidColor = new SolidColor(colors.component.button.prominent.background.f160default);
            TextFieldValue textFieldValue = (TextFieldValue) mutableState.getValue();
            boolean changedInstance = (i3 == 256) | gapComposer2.changedInstance(text);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new MoneyTabUIKt$$ExternalSyntheticLambda39(28, function1, text, mutableState);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Continuation continuation = null;
            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1) rememberedValue4, m300paddingVpY3zN4$default, false, m994copyp1EtxEg$default, keyboardOptions, keyboardActions, false, 2, 0, null, null, null, solidColor, null, gapComposer2, 806879232, 0, 48408);
            gapComposer = gapComposer2;
            if (z) {
                rememberShaker.shake();
                function1.invoke(PersonalizePaymentViewEvent.ResetShakeOnInvalidEntry.INSTANCE);
            }
            Unit unit = Unit.INSTANCE;
            boolean changedInstance2 = gapComposer.changedInstance(text);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                z2 = true;
                pdfPreviewPresenter$models$1$1 = new PdfPreviewPresenter$models$1$1(2, mutableState, text, focusRequester, continuation);
                gapComposer.updateRememberedValue(pdfPreviewPresenter$models$1$1);
            } else {
                pdfPreviewPresenter$models$1$1 = rememberedValue5;
                z2 = true;
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) pdfPreviewPresenter$models$1$1);
            gapComposer.end(false);
            gapComposer.end(z2);
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda0(modifier2, text, function1, z, i, 28);
        }
    }

    public static final void PersonalizePaymentView(PersonalizePaymentViewModel personalizePaymentViewModel, Function1 function1, RealImageLoader realImageLoader, Composer composer, int i) {
        int i2;
        personalizePaymentViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-424409336);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(personalizePaymentViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ActionMenuKt$$ExternalSyntheticLambda0(27, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            boolean z2 = i3 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ProfileKt$$ExternalSyntheticLambda3(6, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue2, gapComposer, 0);
            Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), Expect_jvmKt.rememberComposableLambda(769186760, new PdfPreviewViewKt$$ExternalSyntheticLambda0(12, personalizePaymentViewModel, function1), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(personalizePaymentViewModel, function1, realImageLoader, i, 28);
        }
    }

    public static final void PersonalizedBackgroundLoadingIndicator(Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-266673300);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        int i3 = 5;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            InfiniteTransition.TransitionAnimationState animateFloat = ArcSplineKt.animateFloat(ArcSplineKt.rememberInfiniteTransition(null, gapComposer, 1), RecyclerView.DECELERATION_RATE, 360.0f, AnimatableKt.m154infiniteRepeatable9IiC70o$default(AnimatableKt.tween$default(2000, 0, EasingKt.LinearEasing, 2), null, 6), null, gapComposer, 4536, 8);
            Modifier progressSemantics = CanvasKt.progressSemantics(modifier);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, progressSemantics);
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
            boolean changed = gapComposer.changed(animateFloat);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda10(animateFloat, 18);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(ColorKt.graphicsLayer(Modifier.Companion.$$INSTANCE, (Function1) rememberedValue), 60.0f);
            Painter painterResource = Countries.painterResource(2131231593, 0, gapComposer);
            long j = Color.White;
            ImageKt.Image(painterResource, null, m285size3ABfNKs, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 1572912, 56);
            gapComposer = gapComposer;
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScoreHomeKt$$ExternalSyntheticLambda4(modifier, i, i3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PersonalizedPaymentToolbar(final Modifier modifier, final Function0 function0, Function1 function1, final List list, boolean z, boolean z2, boolean z3, final boolean z4, String str, boolean z5, Composer composer, final int i, final int i2) {
        final Function1 function12;
        int i3;
        boolean z6;
        int i4;
        boolean z7;
        int i5;
        boolean z8;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        final String str2;
        final boolean z9;
        final boolean z10;
        final boolean z11;
        final boolean z12;
        RecomposeScopeImpl endRestartGroup;
        boolean z13;
        boolean z14;
        Function1 function13;
        boolean z15;
        boolean z16;
        function0.getClass();
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(357025844);
        int i13 = i | (gapComposer.changed(modifier) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 32 : 16);
        int i14 = i2 & 4;
        if (i14 != 0) {
            i3 = i13 | MLKEMEngine.KyberPolyBytes;
            function12 = function1;
        } else {
            function12 = function1;
            i3 = i13 | (gapComposer.changedInstance(function12) ? 256 : 128);
        }
        int i15 = i3 | (gapComposer.changedInstance(list) ? 2048 : 1024);
        int i16 = i2 & 16;
        if (i16 != 0) {
            i4 = i15 | 24576;
            z6 = z;
        } else {
            z6 = z;
            i4 = i15 | (gapComposer.changed(z6) ? 16384 : PKIFailureInfo.certRevoked);
        }
        int i17 = i2 & 32;
        if (i17 != 0) {
            i4 |= 196608;
        } else if ((i & 196608) == 0) {
            z7 = z2;
            i4 |= gapComposer.changed(z7) ? PKIFailureInfo.unsupportedVersion : 65536;
            i5 = i2 & 64;
            if (i5 == 0) {
                i6 = i4 | 1572864;
                z8 = z3;
            } else {
                z8 = z3;
                i6 = i4 | (gapComposer.changed(z8) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted);
            }
            int i18 = i6 | (!gapComposer.changed(z4) ? 8388608 : 4194304);
            i7 = i2 & 256;
            if (i7 == 0) {
                i8 = i18 | 100663296;
            } else {
                i8 = i18 | (gapComposer.changed(str) ? 67108864 : 33554432);
            }
            i9 = i2 & 512;
            if (i9 == 0) {
                i11 = i8 | 805306368;
                i10 = i9;
            } else {
                i10 = i9;
                i11 = i8 | (gapComposer.changed(z5) ? PKIFailureInfo.duplicateCertReq : 268435456);
            }
            i12 = i11;
            if (gapComposer.shouldExecute(i12 & 1, (i12 & 306783379) == 306783378)) {
                gapComposer.skipToGroupEnd();
                str2 = str;
                z9 = z6;
                z10 = z7;
                z11 = z8;
                z12 = z5;
            } else {
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (i14 != 0) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new PoolDetailsViewKt$$ExternalSyntheticLambda3(13);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    function12 = (Function1) rememberedValue;
                }
                boolean z17 = i16 != 0 ? true : z6;
                if (i17 != 0) {
                    z7 = false;
                }
                boolean z18 = i5 != 0 ? true : z8;
                String str3 = i7 != 0 ? null : str;
                boolean z19 = true;
                boolean z20 = i10 != 0 ? false : z5;
                if (z4) {
                    gapComposer.startReplaceGroup(1818299035);
                    if ((i12 & 896) != 256) {
                        z19 = false;
                    }
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (z19 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new ProfileKt$$ExternalSyntheticLambda3(7, function12);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    int i19 = (i12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i12 >> 3) & 7168);
                    int i20 = i12 >> 9;
                    String str4 = str3;
                    ExpressivePaymentsToolbar(modifier, function0, (Function1) rememberedValue2, z17, !z7, str4, z20, gapComposer, (i20 & 3670016) | i19 | (458752 & i20));
                    str3 = str4;
                    z13 = z20;
                    z14 = z17;
                    gapComposer.end(false);
                    function13 = function12;
                    z15 = z18;
                    z16 = z7;
                } else {
                    z13 = z20;
                    z14 = z17;
                    gapComposer.startReplaceGroup(1818676987);
                    function13 = function12;
                    z15 = z18;
                    z16 = z7;
                    ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-332315611, new InputAreaKt$$ExternalSyntheticLambda0(modifier, function0, z16, z15, list, z14, function13, str3), gapComposer), gapComposer, 3072, 7);
                    gapComposer.end(false);
                }
                z12 = z13;
                z10 = z16;
                z11 = z15;
                z9 = z14;
                function12 = function13;
                str2 = str3;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2() { // from class: com.squareup.cash.payments.views.personalization.PersonalizedPaymentToolbarKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        AlphaKt.PersonalizedPaymentToolbar(Modifier.this, function0, function12, list, z9, z10, z11, z4, str2, z12, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        z7 = z2;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        int i182 = i6 | (!gapComposer.changed(z4) ? 8388608 : 4194304);
        i7 = i2 & 256;
        if (i7 == 0) {
        }
        i9 = i2 & 512;
        if (i9 == 0) {
        }
        i12 = i11;
        if (gapComposer.shouldExecute(i12 & 1, (i12 & 306783379) == 306783378)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void ReceiptButton(int i, Composer composer, Modifier modifier, Function0 function0) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2078493284);
        int i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(586252145, new ComposerKt$$ExternalSyntheticLambda14(function0, modifier), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda14(function0, modifier, i, 11);
        }
    }

    public static final void RecipientsInformation(int i, Composer composer, Modifier modifier, List list) {
        String m;
        long j;
        Arrangement$End$1 arrangement$End$1 = SpacerKt.Start;
        BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1856756745);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changedInstance(list) ? 32 : 16) | i;
        boolean z = false;
        boolean z2 = true;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            int i3 = 48;
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, 48);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(1294683853);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                HeaderAvatar headerAvatar = (HeaderAvatar) it.next();
                boolean changedInstance = gapComposer.changedInstance(headerAvatar);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(headerAvatar, 17);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier clearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(companion, (Function1) rememberedValue);
                RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, gapComposer, i3);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, clearAndSetSemantics);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion, 4.0f, 8.0f);
                AvatarSize avatarSize = AvatarSize.Size32;
                Image image = headerAvatar.photoImage;
                if (image == null) {
                    gapComposer.startReplaceGroup(-1160963696);
                    gapComposer.end(z);
                    m = null;
                } else {
                    m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer, -1284376431, image, gapComposer, z);
                }
                AvatarImage.Remote.Image image2 = m != null ? new AvatarImage.Remote.Image(m, false, null, 0L, new SheetKt$$ExternalSyntheticLambda8(m, 15), 62) : null;
                String valueOf = String.valueOf(headerAvatar.monogram);
                Color m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer, -1284364146, headerAvatar.monogramBackgroundColor, gapComposer, z);
                if (m2 == null) {
                    gapComposer.startReplaceGroup(-1284362457);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, z);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(z);
                    }
                    j = colors.semantic.background.f1047app;
                    gapComposer.end(z);
                } else {
                    gapComposer.startReplaceGroup(-1284364968);
                    gapComposer.end(z);
                    j = m2.value;
                }
                GapComposer gapComposer2 = gapComposer;
                TextViewKt.Avatar(avatarSize, new AvatarEntry(valueOf, j, null, image2, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), m299paddingVpY3zN4, true, gapComposer2, 3462, 16);
                gapComposer = gapComposer2;
                Room.m1165Text25TpFw(0, 1, 0, 0, 1572912, 0, 4028, 0L, (Composer) gapComposer, SizeKt.wrapContentWidth$default(companion, null, 3), (TextStyle) null, (TextLineBalancing) null, headerAvatar.name, (Map) null, (Function1) null, false);
                gapComposer.end(true);
                z2 = true;
                arrangement$End$1 = arrangement$End$1;
                i3 = i3;
                z = false;
            }
            gapComposer.end(z);
            gapComposer.end(z2);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda17(modifier, list, i, 9);
        }
    }

    public static final void StickerOverlay(List list, float f, float f2, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1380504458);
        int i2 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changed(f) ? 32 : 16) | (gapComposer.changed(f2) ? 256 : 128);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            float f3 = f / 200.0f;
            float f4 = (f2 / f3) / 2.0f;
            float f5 = f * 0.25f;
            Iterator it = list.iterator();
            while (it.hasNext()) {
                PreviewSticker previewSticker = (PreviewSticker) it.next();
                gapComposer.startMovableGroup(-1262123729, Integer.valueOf(previewSticker.id));
                AsyncImagePainter m1446rememberAsyncImagePainter19ie5dc = AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(i3, 30, gapComposer, previewSticker.imageUrl);
                final float f6 = previewSticker.scaleFactor * f5;
                float mo232toDpu2uoSUM = ((Density) gapComposer.consume(CompositionLocalsKt.LocalDensity)).mo232toDpu2uoSUM(f6);
                final float f7 = (previewSticker.universalX + 100.0f) * f3;
                final float f8 = (f4 - previewSticker.universalY) * f3;
                String str = previewSticker.accessibilityDescription;
                Modifier zIndex = ZIndexModifierKt.zIndex(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, mo232toDpu2uoSUM), previewSticker.z);
                boolean changed = gapComposer.changed(f7) | gapComposer.changed(f6) | gapComposer.changed(f8);
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new Function1() { // from class: com.squareup.cash.payments.views.personalization.ExpressivePreviewKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ((Density) obj).getClass();
                            return new IntOffset((((int) (f8 - r0)) & BodyPartID.bodyIdMax) | (((int) (f7 - (f6 / 2.0f))) << 32));
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier offset = OffsetKt.offset(zIndex, (Function1) rememberedValue);
                boolean changedInstance = gapComposer.changedInstance(previewSticker);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new UtilsKt$$ExternalSyntheticLambda0(previewSticker, 15);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                ImageKt.Image(m1446rememberAsyncImagePainter19ie5dc, str, ColorKt.graphicsLayer(offset, (Function1) rememberedValue2), null, ContentScale.Companion.Fit, RecyclerView.DECELERATION_RATE, null, gapComposer, 24576, 104);
                gapComposer.end(false);
                i3 = 0;
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AlertDialogKt$$ExternalSyntheticLambda1(list, f, f2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4, types: [androidx.compose.runtime.internal.ComposableLambdaImpl] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer, java.lang.Object] */
    public static final void Tooltip(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, boolean z, Function0 function0, ComposableLambdaImpl composableLambdaImpl2, Composer composer, int i) {
        ComposableLambdaImpl composableLambdaImpl3;
        ComposableLambdaImpl composableLambdaImpl4;
        Modifier modifier2;
        ?? r9 = (GapComposer) composer;
        r9.startRestartGroup(-1555838338);
        int i2 = i | 6 | (r9.changed(z) ? 256 : 128) | (r9.changedInstance(function0) ? 2048 : 1024);
        int i3 = 1;
        if (r9.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z2 = (i2 & 896) == 256;
            Object rememberedValue = r9.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (z2 || rememberedValue == obj) {
                rememberedValue = Recorder$$ExternalSyntheticOutline1.m(z, (GapComposer) r9);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, r9, 0);
            int hashCode = Long.hashCode(r9.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = r9.currentCompositionLocalScope();
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(r9, companion);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (r9.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            r9.startReusableNode();
            if (r9.inserting) {
                r9.createNode(layoutNode$Companion$Constructor$1);
            } else {
                r9.useNode();
            }
            Updater.m576setimpl(r9, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(r9, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(r9, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(r9, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(r9, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ?? r15 = composableLambdaImpl;
            r15.invoke(r9, 6);
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                r9.startReplaceGroup(2080397169);
                TooltipPositionProvider tooltipPositionProvider = new TooltipPositionProvider((Density) r9.consume(CompositionLocalsKt.LocalDensity));
                PopupProperties popupProperties = new PopupProperties(false, 31);
                boolean changed = ((i2 & 7168) == 2048) | r9.changed(mutableState);
                Object rememberedValue2 = r9.rememberedValue();
                if (changed || rememberedValue2 == obj) {
                    rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda7(function0, mutableState, 4);
                    r9.updateRememberedValue(rememberedValue2);
                }
                composableLambdaImpl4 = composableLambdaImpl2;
                AndroidPopup_androidKt.Popup(tooltipPositionProvider, (Function0) rememberedValue2, popupProperties, Expect_jvmKt.rememberComposableLambda(2006680367, new StripeThemeKt$$ExternalSyntheticLambda2(composableLambdaImpl4, i3), r9), r9, 3456, 0);
                r9.end(false);
            } else {
                composableLambdaImpl4 = composableLambdaImpl2;
                r9.startReplaceGroup(2080657786);
                r9.end(false);
            }
            r9.end(true);
            modifier2 = companion;
            composableLambdaImpl3 = r15;
        } else {
            composableLambdaImpl3 = composableLambdaImpl;
            composableLambdaImpl4 = composableLambdaImpl2;
            r9.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = r9.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda30(modifier2, composableLambdaImpl3, z, function0, composableLambdaImpl4, i, 12);
        }
    }

    public static final void TooltipContent(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(151451925);
        Applier applier = gapComposer.applier;
        int i2 = 2;
        int i3 = (gapComposer.changedInstance(composableLambdaImpl) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 3) != 2)) {
            Context context = (Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(new Offset(0L));
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            int m694toArgb8_81llA = ColorKt.m694toArgb8_81llA(colors.component.modal.background);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                Drawable drawable = DimensionKt.getDrawable(context, R.drawable.ic_arrow);
                drawable.getClass();
                drawable.setTint(m694toArgb8_81llA);
                rememberedValue2 = UtilsKt.toBitmap$default(drawable, 7);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Bitmap bitmap = (Bitmap) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new TabToolbarsKt$$ExternalSyntheticLambda10(3, mutableState);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(companion, (Function1) rememberedValue3);
            boolean changedInstance = gapComposer.changedInstance(bitmap);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new OpenSourceKt$$ExternalSyntheticLambda11(11, bitmap, mutableState);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Modifier drawWithContent = ClipKt.drawWithContent(onGloballyPositioned, (Function1) rememberedValue4);
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(drawWithContent, colors2.component.modal.background, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f));
            BiasAlignment biasAlignment = Alignment.Companion.TopStart;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
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
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 14.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            composableLambdaImpl.invoke(gapComposer, Integer.valueOf(i3 & 14));
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new StripeThemeKt$$ExternalSyntheticLambda2(i, i2, composableLambdaImpl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3, types: [androidx.compose.runtime.internal.ComposableLambdaImpl] */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer, java.lang.Object] */
    public static final void TransformableContent(Modifier modifier, Function1 function1, Element element, final float f, boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        Function1 function12;
        Modifier modifier2;
        ComposableLambdaImpl composableLambdaImpl2;
        int i2;
        float f2;
        boolean z2;
        PlatformHapticFeedback platformHapticFeedback;
        Shaker shaker;
        float f3;
        Object obj;
        MutableFloatState mutableFloatState;
        MutableState mutableState;
        final MutableState mutableState2;
        MutableState mutableState3;
        MutableFloatState mutableFloatState2;
        Object obj2;
        final MutableState mutableState4;
        final MutableFloatState mutableFloatState3;
        final Shaker shaker2;
        float f4;
        Modifier m287sizeVpY3zN4;
        Modifier composed;
        boolean z3;
        final Element element2 = element;
        ComposableLambdaImpl composableLambdaImpl3 = composableLambdaImpl;
        function1.getClass();
        element2.getClass();
        ?? r15 = (GapComposer) composer;
        r15.startRestartGroup(-761485012);
        int i3 = i | 48;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= r15.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= r15.changedInstance(element2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= r15.changed(f) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i3 |= r15.changed(z) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= r15.changedInstance(composableLambdaImpl3) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if (r15.shouldExecute(i3 & 1, (599185 & i3) != 599184)) {
            PlatformHapticFeedback platformHapticFeedback2 = (PlatformHapticFeedback) r15.consume(CompositionLocalsKt.LocalHapticFeedback);
            Object rememberedValue = r15.rememberedValue();
            Continuation continuation = null;
            Object obj3 = Composer.Companion.Empty;
            if (rememberedValue == obj3) {
                rememberedValue = Updater.mutableStateOf$default(null);
                r15.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState5 = (MutableState) rememberedValue;
            boolean changed = r15.changed(element2.getId());
            Object rememberedValue2 = r15.rememberedValue();
            if (changed || rememberedValue2 == obj3) {
                rememberedValue2 = Updater.mutableStateOf$default(null);
                r15.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState6 = (MutableState) rememberedValue2;
            boolean changed2 = r15.changed(element2.getId()) | r15.changed(element2.getProperties().size);
            Object rememberedValue3 = r15.rememberedValue();
            if (changed2 || rememberedValue3 == obj3) {
                rememberedValue3 = Updater.mutableStateOf$default(new Offset((Float.floatToRawIntBits(element2.getProperties().position.x) << 32) | (Float.floatToRawIntBits(element2.getProperties().position.y) & BodyPartID.bodyIdMax)));
                r15.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState7 = (MutableState) rememberedValue3;
            boolean changed3 = r15.changed(element2.getId());
            Object rememberedValue4 = r15.rememberedValue();
            if (changed3 || rememberedValue4 == obj3) {
                rememberedValue4 = Recorder$$ExternalSyntheticOutline2.m(element2.getProperties().zoom.scale, (GapComposer) r15);
            }
            final MutableFloatState mutableFloatState4 = (MutableFloatState) rememberedValue4;
            boolean changed4 = r15.changed(element2.getId());
            Object rememberedValue5 = r15.rememberedValue();
            if (changed4 || rememberedValue5 == obj3) {
                rememberedValue5 = Recorder$$ExternalSyntheticOutline2.m(((ParcelableSnapshotMutableFloatState) mutableFloatState4).getFloatValue(), (GapComposer) r15);
            }
            MutableFloatState mutableFloatState5 = (MutableFloatState) rememberedValue5;
            float floatValue = ((ParcelableSnapshotMutableFloatState) mutableFloatState4).getFloatValue();
            Boolean bool = (Boolean) mutableState6.getValue();
            Boolean bool2 = Boolean.TRUE;
            float f5 = floatValue * (Intrinsics.areEqual(bool, bool2) ? 0.6f : 1.0f);
            boolean changed5 = r15.changed(element2.getId());
            Object rememberedValue6 = r15.rememberedValue();
            if (changed5 || rememberedValue6 == obj3) {
                rememberedValue6 = Recorder$$ExternalSyntheticOutline2.m(element2.getProperties().rotation.rotation, (GapComposer) r15);
            }
            MutableFloatState mutableFloatState6 = (MutableFloatState) rememberedValue6;
            float f6 = Intrinsics.areEqual((Boolean) mutableState6.getValue(), bool2) ? 0.5f : 1.0f;
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(false, r15, 1);
            Boolean bool3 = (Boolean) mutableState5.getValue();
            int i4 = i3 & 896;
            boolean changedInstance = (i4 == 256) | r15.changedInstance(element2) | r15.changed(mutableFloatState5) | r15.changed(mutableFloatState4) | r15.changed(mutableState7) | r15.changed(mutableFloatState6);
            Object rememberedValue7 = r15.rememberedValue();
            if (changedInstance || rememberedValue7 == obj3) {
                i2 = i3;
                f2 = f6;
                z2 = false;
                platformHapticFeedback = platformHapticFeedback2;
                shaker = rememberShaker;
                f3 = f5;
                obj = obj3;
                GLSceneScope$FrameRenderer$5$1$1$1$1 gLSceneScope$FrameRenderer$5$1$1$1$1 = new GLSceneScope$FrameRenderer$5$1$1$1$1(function1, element2, mutableState5, mutableFloatState4, mutableFloatState5, mutableState7, mutableFloatState6, null, 4);
                mutableFloatState4 = mutableFloatState4;
                mutableFloatState = mutableFloatState5;
                mutableFloatState6 = mutableFloatState6;
                mutableState = mutableState7;
                mutableState2 = mutableState5;
                r15.updateRememberedValue(gLSceneScope$FrameRenderer$5$1$1$1$1);
                rememberedValue7 = gLSceneScope$FrameRenderer$5$1$1$1$1;
            } else {
                mutableFloatState = mutableFloatState5;
                mutableState = mutableState7;
                obj = obj3;
                i2 = i3;
                f2 = f6;
                z2 = false;
                platformHapticFeedback = platformHapticFeedback2;
                shaker = rememberShaker;
                f3 = f5;
                mutableState2 = mutableState5;
            }
            Updater.LaunchedEffect((Composer) r15, bool3, (Function2) rememberedValue7);
            Boolean bool4 = (Boolean) mutableState6.getValue();
            boolean changed6 = r15.changed(mutableState6) | (i4 == 256 ? true : z2) | r15.changedInstance(element2);
            Object rememberedValue8 = r15.rememberedValue();
            if (changed6 || rememberedValue8 == obj) {
                mutableState3 = mutableState6;
                mutableFloatState2 = mutableFloatState6;
                AndroidFileSaver$save$2 androidFileSaver$save$2 = new AndroidFileSaver$save$2(function1, element2, mutableState3, continuation, 8);
                r15.updateRememberedValue(androidFileSaver$save$2);
                rememberedValue8 = androidFileSaver$save$2;
            } else {
                mutableState3 = mutableState6;
                mutableFloatState2 = mutableFloatState6;
            }
            Updater.LaunchedEffect((Composer) r15, bool4, (Function2) rememberedValue8);
            final PlatformHapticFeedback platformHapticFeedback3 = platformHapticFeedback;
            Shaker shaker3 = shaker;
            boolean changed7 = r15.changed(mutableFloatState) | r15.changed(mutableFloatState2) | r15.changedInstance(element2) | r15.changed(mutableFloatState4) | r15.changed(f3) | r15.changedInstance(platformHapticFeedback3) | r15.changedInstance(shaker3) | r15.changed(mutableState) | r15.changed(mutableState3) | ((i2 & 57344) == 16384 ? true : z2);
            Object rememberedValue9 = r15.rememberedValue();
            if (changed7 || rememberedValue9 == obj) {
                obj2 = obj;
                mutableState4 = mutableState;
                final MutableFloatState mutableFloatState7 = mutableFloatState;
                mutableFloatState3 = mutableFloatState2;
                final MutableState mutableState8 = mutableState3;
                shaker2 = shaker3;
                final float f7 = f3;
                function12 = function1;
                Function3 function3 = new Function3() { // from class: com.squareup.cash.payments.views.personalization.TransformableContentKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj4, Object obj5, Object obj6) {
                        float f8;
                        float floatValue2 = ((Float) obj4).floatValue();
                        Offset offset = (Offset) obj5;
                        float floatValue3 = ((Float) obj6).floatValue();
                        mutableState2.setValue(Boolean.TRUE);
                        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState = (ParcelableSnapshotMutableFloatState) mutableFloatState7;
                        parcelableSnapshotMutableFloatState.setFloatValue(parcelableSnapshotMutableFloatState.getFloatValue() * floatValue2);
                        ParcelableSnapshotMutableFloatState parcelableSnapshotMutableFloatState2 = (ParcelableSnapshotMutableFloatState) mutableFloatState3;
                        parcelableSnapshotMutableFloatState2.setFloatValue(parcelableSnapshotMutableFloatState2.getFloatValue() + floatValue3);
                        float floatValue4 = parcelableSnapshotMutableFloatState.getFloatValue();
                        Element element3 = Element.this;
                        boolean z4 = false;
                        if (element3.canZoom(floatValue4)) {
                            ((ParcelableSnapshotMutableFloatState) mutableFloatState4).setFloatValue(parcelableSnapshotMutableFloatState.getFloatValue());
                            f8 = f7;
                        } else {
                            platformHapticFeedback3.m769performHapticFeedbackCdsT49E(0);
                            shaker2.shake();
                            f8 = 1.0f;
                        }
                        MutableState mutableState9 = mutableState4;
                        long j = ((Offset) mutableState9.getValue()).packedValue;
                        long j2 = offset.packedValue;
                        double floatValue5 = (parcelableSnapshotMutableFloatState2.getFloatValue() * 3.141592653589793d) / 180.0d;
                        int i5 = (int) (j2 >> 32);
                        double cos = Math.cos(floatValue5) * Float.intBitsToFloat(i5);
                        int i6 = (int) (j2 & BodyPartID.bodyIdMax);
                        float sin = (float) (cos - (Math.sin(floatValue5) * Float.intBitsToFloat(i6)));
                        float cos2 = (float) ((Math.cos(floatValue5) * Float.intBitsToFloat(i6)) + (Math.sin(floatValue5) * Float.intBitsToFloat(i5)));
                        mutableState9.setValue(new Offset(Offset.m626plusMKHz9U(j, Offset.m627timestuRUvjQ((Float.floatToRawIntBits(cos2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(sin) << 32), f8))));
                        float f9 = f;
                        if (f9 > RecyclerView.DECELERATION_RATE && (Float.intBitsToFloat((int) (((Offset) mutableState9.getValue()).packedValue & BodyPartID.bodyIdMax)) + element3.getProperties().size.height) - f9 >= element3.getProperties().size.height / 2.0f) {
                            z4 = true;
                        }
                        mutableState8.setValue(Boolean.valueOf(z4));
                        return Unit.INSTANCE;
                    }
                };
                element2 = element2;
                f4 = f7;
                r15.updateRememberedValue(function3);
                rememberedValue9 = function3;
            } else {
                shaker2 = shaker3;
                obj2 = obj;
                mutableFloatState3 = mutableFloatState2;
                f4 = f3;
                function12 = function1;
                mutableState4 = mutableState;
            }
            Function3 function32 = (Function3) rememberedValue9;
            boolean changed8 = r15.changed(function32);
            Object rememberedValue10 = r15.rememberedValue();
            if (changed8 || rememberedValue10 == obj2) {
                rememberedValue10 = new LazyListIntervalContent$$ExternalSyntheticLambda1(function32, 1);
                r15.updateRememberedValue(rememberedValue10);
            }
            MutableState rememberUpdatedState = Updater.rememberUpdatedState((Function4) rememberedValue10, r15);
            Object rememberedValue11 = r15.rememberedValue();
            if (rememberedValue11 == obj2) {
                DefaultTransformableState defaultTransformableState = new DefaultTransformableState(new TransformableStateKt$$ExternalSyntheticLambda1(0, rememberUpdatedState));
                r15.updateRememberedValue(defaultTransformableState);
                rememberedValue11 = defaultTransformableState;
            }
            DefaultTransformableState defaultTransformableState2 = (DefaultTransformableState) rememberedValue11;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier zIndex = ZIndexModifierKt.zIndex(SharedViewEventsKt.shakeWith(companion, shaker2), element2.getProperties().position.z);
            boolean z4 = element2 instanceof Text;
            if (z4) {
                r15.startReplaceGroup(620533684);
                r15.end(false);
                m287sizeVpY3zN4 = companion;
            } else {
                r15.startReplaceGroup(620601419);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
                m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(companion, ((Density) r15.consume(staticProvidableCompositionLocal)).mo232toDpu2uoSUM(element2.getProperties().size.width), ((Density) r15.consume(staticProvidableCompositionLocal)).mo232toDpu2uoSUM(element2.getProperties().size.height));
                r15.end(false);
            }
            Modifier then = zIndex.then(m287sizeVpY3zN4);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = CompositionLocalsKt.LocalDensity;
            final float f8 = f4;
            Modifier m272offsetVpY3zN4 = OffsetKt.m272offsetVpY3zN4(then, ((Density) r15.consume(staticProvidableCompositionLocal2)).mo232toDpu2uoSUM(Float.intBitsToFloat((int) (((Offset) mutableState4.getValue()).packedValue >> 32))), ((Density) r15.consume(staticProvidableCompositionLocal2)).mo232toDpu2uoSUM(Float.intBitsToFloat((int) (((Offset) mutableState4.getValue()).packedValue & BodyPartID.bodyIdMax))));
            final float f9 = f2;
            boolean changed9 = r15.changed(f8) | r15.changed(mutableFloatState3) | r15.changed(f9);
            Object rememberedValue12 = r15.rememberedValue();
            if (changed9 || rememberedValue12 == obj2) {
                rememberedValue12 = new Function1() { // from class: com.squareup.cash.payments.views.personalization.TransformableContentKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj4) {
                        ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj4;
                        reusableGraphicsLayerScope.getClass();
                        float f10 = f8;
                        reusableGraphicsLayerScope.setScaleX(f10);
                        reusableGraphicsLayerScope.setScaleY(f10);
                        reusableGraphicsLayerScope.setRotationZ(((ParcelableSnapshotMutableFloatState) mutableFloatState3).getFloatValue());
                        reusableGraphicsLayerScope.setAlpha(f9);
                        return Unit.INSTANCE;
                    }
                };
                r15.updateRememberedValue(rememberedValue12);
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(m272offsetVpY3zN4, (Function1) rememberedValue12);
            if (z4 && ((Text) element2).isNote && !z) {
                r15.startReplaceGroup(621201300);
                z3 = false;
                r15.end(false);
                composed = companion;
            } else {
                r15.startReplaceGroup(621271949);
                int id = element2.getId();
                Object rememberedValue13 = r15.rememberedValue();
                int i5 = 14;
                if (rememberedValue13 == obj2) {
                    rememberedValue13 = new OverlayKt$$ExternalSyntheticLambda1(i5, mutableState2);
                    r15.updateRememberedValue(rememberedValue13);
                }
                Function0 function0 = (Function0) rememberedValue13;
                boolean changedInstance2 = r15.changedInstance(element2) | (i4 == 256);
                Object rememberedValue14 = r15.rememberedValue();
                if (changedInstance2 || rememberedValue14 == obj2) {
                    rememberedValue14 = new ProfileKt$$ExternalSyntheticLambda11(5, (Object) element2, function12);
                    r15.updateRememberedValue(rememberedValue14);
                }
                Function0 function02 = (Function0) rememberedValue14;
                Integer valueOf = Integer.valueOf(id);
                PoolDetailsViewKt$$ExternalSyntheticLambda3 poolDetailsViewKt$$ExternalSyntheticLambda3 = new PoolDetailsViewKt$$ExternalSyntheticLambda3(i5);
                defaultTransformableState2.getClass();
                function0.getClass();
                function02.getClass();
                composed = PlatformKt.composed(companion, new SwipeToDismissKt$$ExternalSyntheticLambda2(defaultTransformableState2, valueOf, function0, function02, poolDetailsViewKt$$ExternalSyntheticLambda3));
                z3 = false;
                r15.end(false);
            }
            Modifier then2 = graphicsLayer.then(composed);
            int i6 = (i2 >> 9) & 7168;
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, z3);
            int hashCode = Long.hashCode(r15.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = r15.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(r15, then2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (r15.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            r15.startReusableNode();
            if (r15.inserting) {
                r15.createNode(layoutNode$Companion$Constructor$1);
            } else {
                r15.useNode();
            }
            Updater.m576setimpl(r15, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(r15, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(r15, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(r15, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(r15, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ?? r13 = composableLambdaImpl;
            r13.invoke(BoxScopeInstance.INSTANCE, r15, Integer.valueOf(((i6 >> 6) & 112) | 6));
            r15.end(true);
            modifier2 = companion;
            composableLambdaImpl2 = r13;
        } else {
            function12 = function1;
            r15.skipToGroupEnd();
            modifier2 = modifier;
            composableLambdaImpl2 = composableLambdaImpl3;
        }
        RecomposeScopeImpl endRestartGroup = r15.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DissolveWipeContentKt$$ExternalSyntheticLambda1(modifier2, function12, element2, f, z, composableLambdaImpl2, i);
        }
    }

    public static final void TransformedContent(Modifier modifier, Element element, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        Modifier modifier2;
        Modifier m287sizeVpY3zN4;
        element.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1860561168);
        int i2 = i | 6 | (gapComposer.changedInstance(element) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            float f = element.getProperties().position.z;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier zIndex = ZIndexModifierKt.zIndex(companion, f);
            if (element instanceof Text) {
                gapComposer.startReplaceGroup(-1424555920);
                gapComposer.end(false);
                m287sizeVpY3zN4 = companion;
            } else {
                gapComposer.startReplaceGroup(-1424488185);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
                m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(companion, ((Density) gapComposer.consume(staticProvidableCompositionLocal)).mo232toDpu2uoSUM(element.getProperties().size.width), ((Density) gapComposer.consume(staticProvidableCompositionLocal)).mo232toDpu2uoSUM(element.getProperties().size.height));
                gapComposer.end(false);
            }
            Modifier then = zIndex.then(m287sizeVpY3zN4);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = CompositionLocalsKt.LocalDensity;
            Modifier m272offsetVpY3zN4 = OffsetKt.m272offsetVpY3zN4(then, ((Density) gapComposer.consume(staticProvidableCompositionLocal2)).mo232toDpu2uoSUM(element.getProperties().position.x), ((Density) gapComposer.consume(staticProvidableCompositionLocal2)).mo232toDpu2uoSUM(element.getProperties().position.y));
            boolean changedInstance = gapComposer.changedInstance(element);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new UtilsKt$$ExternalSyntheticLambda0(element, 18);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(m272offsetVpY3zN4, (Function1) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, graphicsLayer);
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
            Recorder$$ExternalSyntheticOutline2.m(6, composableLambdaImpl, gapComposer, true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1(modifier2, element, composableLambdaImpl, i, 21);
        }
    }

    public static final void TransparentButton(Function0 function0, Modifier modifier, Shape shape, Composer composer, int i) {
        Shape shape2;
        Shape m340RoundedCornerShape0680j_4;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-238108897);
        int i2 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | 128;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Object obj = DefaultSizes.border.entries;
                m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f);
            } else {
                gapComposer.skipToGroupEnd();
                m340RoundedCornerShape0680j_4 = shape;
            }
            gapComposer.endDefaults();
            Modifier clip = ClipKt.clip(modifier, m340RoundedCornerShape0680j_4);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(clip, colors.component.titleBar.button.background.transparent, ColorKt.RectangleShape);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(m177backgroundbw27NRU, (MutableInteractionSourceImpl) rememberedValue, com.squareup.cash.arcade.theme.RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 13), false, null, new Role(0), function0, 12);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m182clickableO2vRcR0$default);
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
            ComposableSingletons$ExpressivePreviewKt.lambda$912348762.invoke((Object) BoxScopeInstance.INSTANCE, (Object) gapComposer, (Object) 54);
            gapComposer.end(true);
            shape2 = m340RoundedCornerShape0680j_4;
        } else {
            gapComposer.skipToGroupEnd();
            shape2 = shape;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1(function0, modifier, shape2, i, 20);
        }
    }

    public static final void UiElement(Element element, Set set, Function1 function1, Composer composer, int i) {
        LightingColorFilter lightingColorFilter;
        element.getClass();
        set.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-643251706);
        int i2 = i | (gapComposer.changedInstance(element) ? 4 : 2) | (gapComposer.changedInstance(set) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = element instanceof Sticker;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(1032686130);
                Sticker sticker = (Sticker) element;
                AsyncImagePainter m1446rememberAsyncImagePainter19ie5dc = AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer, sticker.mainUrl);
                String str = sticker.accessibilityDescription;
                if (str == null) {
                    str = re$$ExternalSyntheticOutline0.m(gapComposer, 310411194, R.string.sticker_content_description, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(310410078);
                    gapComposer.end(false);
                }
                if (set.isEmpty() || set.contains(Integer.valueOf(sticker.id))) {
                    lightingColorFilter = null;
                } else {
                    long Color = ColorKt.Color(3289650);
                    long j = Color.Black;
                    lightingColorFilter = new LightingColorFilter(Color, j, new android.graphics.LightingColorFilter(ColorKt.m694toArgb8_81llA(Color), ColorKt.m694toArgb8_81llA(j)));
                }
                ImageKt.Image(m1446rememberAsyncImagePainter19ie5dc, str, SizeKt.m285size3ABfNKs(companion, 140.0f), null, ContentScale.Companion.FillBounds, RecyclerView.DECELERATION_RATE, lightingColorFilter, gapComposer, 24960, 40);
                gapComposer.end(false);
            } else {
                if (!(element instanceof Text)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 310407097, false);
                }
                gapComposer.startReplaceGroup(1033310904);
                float f = (set.isEmpty() || set.contains(Integer.valueOf(((Text) element).id))) ? 1.0f : 0.5f;
                Object rememberedValue = gapComposer.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.mutableStateOf$default(((Text) element).properties.size);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState = (MutableState) rememberedValue;
                boolean changedInstance = gapComposer.changedInstance(element) | ((i2 & 896) == 256);
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda39(29, function1, element, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Modifier positioned = UtilKt.positioned(companion, (Function1) rememberedValue2);
                Text text = (Text) element;
                float f2 = text.fontSize;
                String str2 = text.value;
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
                Density density = (Density) gapComposer.consume(staticProvidableCompositionLocal);
                long mo238toSp0xMU5do = density.mo238toSp0xMU5do(density.mo232toDpu2uoSUM(f2));
                Density density2 = (Density) gapComposer.consume(staticProvidableCompositionLocal);
                Room.m1165Text25TpFw(3, 0, 0, 3, 196608, 0, 3800, 0L, (Composer) gapComposer, positioned, TextStyle.m994copyp1EtxEg$default(textStyle, Color.m675copywmQWz5c$default(f, Color.White, 14), mo238toSp0xMU5do, null, null, 0L, null, 0L, null, new Shadow(Color.m675copywmQWz5c$default(f * 0.5f, Color.Black, 14), 2), null, 0, density2.mo238toSp0xMU5do(density2.mo232toDpu2uoSUM(f2)), null, null, 0, 16637948), (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1(element, set, function1, i, 19);
        }
    }

    public static final void ViewOnlyPersonalization(int i, Composer composer, Modifier modifier, List list, Function1 function1) {
        function1.getClass();
        list.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1188468863);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | (gapComposer.changedInstance(list) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Continuation continuation = null;
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState.getValue()).booleanValue() ? 1.0f : RecyclerView.DECELERATION_RATE, new TweenSpec(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, EasingFunctionsKt.EaseInCirc), "contentShowing", null, gapComposer, 3072, 20);
            Unit unit = Unit.INSTANCE;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new ToastKt$Toast$7$1(mutableState, continuation, 15);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
            Modifier alpha = androidx.compose.ui.draw.AlphaKt.alpha(modifier, ((Number) animateFloatAsState.getValue()).floatValue());
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, alpha);
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
            gapComposer.startReplaceGroup(-639219167);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Element element = (Element) it.next();
                TransformedContent(null, element, Expect_jvmKt.rememberComposableLambda(-1134138711, new PdfPreviewViewKt$$ExternalSyntheticLambda0(14, element, function1), gapComposer), gapComposer, MLKEMEngine.KyberPolyBytes);
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new InfoSectionKt$$ExternalSyntheticLambda5(modifier, function1, list, i);
        }
    }

    public static final void ActionButton(Modifier modifier, Function0 function0, int i, ColorFilter colorFilter, String str, Composer composer, int i2) {
        Modifier modifier2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(516244767);
        int i3 = i2 | 6 | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changed(i) ? 256 : 128) | (gapComposer.changed(colorFilter) ? 2048 : 1024) | (gapComposer.changed(str) ? 16384 : PKIFailureInfo.certRevoked);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 40.0f);
            RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(KeypadKt.m3658mooncakeShadowWMci_g0$default(m285size3ABfNKs, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0.4f, roundedCornerShape, 19), Color.White, roundedCornerShape);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            ImageKt.Image(Countries.painterResource(i, (i3 >> 6) & 14, gapComposer), str, SpacerKt.m298padding3ABfNKs(ImageKt.m182clickableO2vRcR0$default(m177backgroundbw27NRU, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m500rippleH2RKhps$default(32.0f, 4, 0L, false), false, null, null, function0, 28), 8.0f), null, null, RecyclerView.DECELERATION_RATE, colorFilter, gapComposer, Painter.$stable | ((i3 >> 9) & 112) | ((i3 << 9) & 3670016), 56);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CalloutKt$$ExternalSyntheticLambda4(modifier2, function0, i, colorFilter, str, i2);
        }
    }

    public static final void UiElement(Modifier modifier, Element element, Function1 function1, Composer composer, int i) {
        Modifier modifier2;
        element.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(219965269);
        int i2 = i | 6 | (gapComposer.changedInstance(element) ? 32 : 16) | (gapComposer.changedInstance(function1) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean z = element instanceof Sticker;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(-1134581178);
                Sticker sticker = (Sticker) element;
                AsyncImagePainter m1446rememberAsyncImagePainter19ie5dc = AsyncImageKt.m1446rememberAsyncImagePainter19ie5dc(0, 30, gapComposer, sticker.mainUrl);
                String str = sticker.accessibilityDescription;
                if (str == null) {
                    str = re$$ExternalSyntheticOutline0.m(gapComposer, 933236297, R.string.sticker_content_description, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(933235181);
                    gapComposer.end(false);
                }
                ImageKt.Image(m1446rememberAsyncImagePainter19ie5dc, str, SizeKt.m285size3ABfNKs(companion, 140.0f), null, ContentScale.Companion.FillBounds, RecyclerView.DECELERATION_RATE, null, gapComposer, 24960, 104);
                gapComposer.end(false);
                modifier2 = companion;
            } else if (element instanceof Text) {
                gapComposer.startReplaceGroup(-1134245944);
                boolean changedInstance = gapComposer.changedInstance(element) | ((i2 & 896) == 256);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new OpenSourceKt$$ExternalSyntheticLambda11(10, function1, element);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier positioned = UtilKt.positioned(companion, (Function1) rememberedValue);
                Text text = (Text) element;
                float f = text.fontSize;
                String str2 = text.value;
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
                Density density = (Density) gapComposer.consume(staticProvidableCompositionLocal);
                long mo238toSp0xMU5do = density.mo238toSp0xMU5do(density.mo232toDpu2uoSUM(f));
                Density density2 = (Density) gapComposer.consume(staticProvidableCompositionLocal);
                modifier2 = companion;
                Room.m1165Text25TpFw(3, 0, 0, 3, 199680, 0, 3792, Color.White, (Composer) gapComposer, positioned, TextStyle.m994copyp1EtxEg$default(textStyle, 0L, mo238toSp0xMU5do, null, null, 0L, null, 0L, null, new Shadow(Color.m675copywmQWz5c$default(0.5f, Color.Black, 14), 2), null, 0, density2.mo238toSp0xMU5do(density2.mo232toDpu2uoSUM(f)), null, null, 0, 16637949), (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer = gapComposer;
                gapComposer.end(false);
            } else {
                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 933231348, false);
            }
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1(modifier2, element, function1, i, 18);
        }
    }
}
