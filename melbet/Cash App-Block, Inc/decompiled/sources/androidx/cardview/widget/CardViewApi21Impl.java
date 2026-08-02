package androidx.cardview.widget;

import android.content.Context;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts$PickMultipleVisualMedia;
import androidx.activity.result.contract.ActivityResultContracts$RequestPermission;
import androidx.activity.result.contract.ActivityResultContracts$TakePicture;
import androidx.camera.video.Recorder;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.video.internal.utils.StorageUtil;
import androidx.cardview.widget.CardViewApi21Impl;
import androidx.collection.internal.Lock;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.EasingFunctionsKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.material3.MenuItemColors;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
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
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.LinearGradient;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
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
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import androidx.work.impl.WorkLauncherImpl;
import app.cash.broadway.ui.compose.ChromeConfigKt$$ExternalSyntheticLambda5;
import app.cash.broadway.ui.compose.UiScope;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.local.views.map.LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda18;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.j1$$ExternalSyntheticLambda14;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.request.ImageRequest;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda25;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaco;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.views.applet.BitcoinHomeViewKt$HandleScrollEvents$1$1;
import com.squareup.cash.blockers.views.SelectionViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$FrameRenderer$5$1$1$1$1;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.maps.views.ClusterItemKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.HypeWelcomeUIKt$$ExternalSyntheticLambda1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda14;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda21;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda9;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.moneybot.viewmodels.chat.ChatFooterViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.ChatFooterViewModel$Attachment$ImageAttachment;
import com.squareup.cash.moneybot.viewmodels.chat.MessageViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.moneybot.views.card.InsightChartKt$$ExternalSyntheticLambda19;
import com.squareup.cash.moneybot.views.chat.EmptyChatKt;
import com.squareup.cash.moneybot.views.chat.MoneybotLoadedContentKt$$ExternalSyntheticLambda2;
import com.squareup.cash.moneybot.views.chat.MoneybotLoadedContentKt$$ExternalSyntheticLambda40;
import com.squareup.cash.moneybot.views.chat.MoneybotLoadedContentKt$ChatContent$4$1;
import com.squareup.cash.moneybot.views.chat.MoneybotLoadedContentKt$scrollToBottom$1;
import com.squareup.cash.moneybot.views.chat.MoneybotLoadedContentKt$scrollToPosition$1;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt$$ExternalSyntheticLambda8;
import com.squareup.cash.moneybot.widgets.ComposerInputStatus;
import com.squareup.cash.moneybot.widgets.ComposerKt;
import com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda14;
import com.squareup.cash.moneybot.widgets.ComposerState;
import com.squareup.cash.moneybot.widgets.FloatingChatInputState;
import com.squareup.cash.moneybot.widgets.FloatingChatInputStatus;
import com.squareup.cash.moneybot.widgets.KeyboardState;
import com.squareup.cash.moneybot.widgets.UtilsKt;
import com.squareup.cash.moneybot.widgets.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.mri.android.RealMRIFactory$sign$2;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.FakeOverlayLayerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda19;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda2;
import com.squareup.cash.profile.views.personal.PersonalInfoViewKt$$ExternalSyntheticLambda9;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda1;
import com.squareup.cash.work.views.shift.ShiftDetailViewKt$$ExternalSyntheticLambda19;
import com.squareup.cash.work.webview.views.WorkWebViewKt$$ExternalSyntheticLambda5;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.apache.commons.imaging.formats.tiff.constants.GpsTagConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.commonmark.internal.util.LinkScanner;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public abstract class CardViewApi21Impl {
    public static final void AttachmentMenuItem(int i, Composer composer, Icons icons, String str, Function0 function0) {
        Icons icons2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1027172134);
        int i2 = i | (gapComposer.changed(str) ? 4 : 2) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 10.0f, RecyclerView.DECELERATION_RATE, 2);
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            icons2 = icons;
            AndroidMenu_androidKt.DropdownMenuItem(Expect_jvmKt.rememberComposableLambda(-1630314154, new ShiftDetailViewKt$$ExternalSyntheticLambda19(2, icons2, str), gapComposer), function0, ClipKt.clip(m300paddingVpY3zN4$default, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(24.0f)), null, null, false, new MenuItemColors(Strings.getColors(gapComposer).semantic.text.standard, Strings.getColors(gapComposer).semantic.icon.standard, Strings.getColors(gapComposer).semantic.icon.standard, Strings.getColors(gapComposer).semantic.text.disabled, Strings.getColors(gapComposer).semantic.icon.disabled, Strings.getColors(gapComposer).semantic.icon.disabled), new PaddingValuesImpl(14.0f, 12.0f, 14.0f, 12.0f), gapComposer, ((i2 >> 3) & 112) | 12582918, EnumC0170g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_DARK_APPEARANCE_VALUE);
        } else {
            icons2 = icons;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MusicViewKt$$ExternalSyntheticLambda5((Object) str, (Object) icons2, (Object) function0, i, 15);
        }
    }

    public static final void AttachmentThumbnail(ChatFooterViewModel$Attachment$ImageAttachment chatFooterViewModel$Attachment$ImageAttachment, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1135399674);
        Applier applier = gapComposer2.applier;
        int i2 = (gapComposer2.changedInstance(chatFooterViewModel$Attachment$ImageAttachment) ? 4 : 2) | i | (gapComposer2.changedInstance(function0) ? 32 : 16);
        if (!gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        } else {
            if (chatFooterViewModel$Attachment$ImageAttachment == null) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            String str = chatFooterViewModel$Attachment$ImageAttachment.uri;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                gapComposer2.startReplaceGroup(1824521521);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new CashMapViewKt$$ExternalSyntheticLambda2(20, mutableState);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                zzaco.FullscreenImageViewer(48, gapComposer2, str, (Function0) rememberedValue2);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(1824605128);
                gapComposer2.end(false);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 78.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, m285size3ABfNKs);
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
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            ImageRequest.Builder builder = new ImageRequest.Builder((Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext));
            builder.data = str;
            ImageRequest build = builder.build();
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Modifier clip = ClipKt.clip(boxScopeInstance.matchParentSize(), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f));
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CashMapViewKt$$ExternalSyntheticLambda2(21, mutableState);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            AsyncImageKt.m1438AsyncImage10Xjiaw(build, null, ImageKt.m183clickableoSLSa3U$default(clip, false, null, null, (Function0) rememberedValue3, 15), null, ContentScale.Companion.Crop, null, gapComposer2, 1572912, 1976);
            Modifier clip2 = ClipKt.clip(OffsetKt.m272offsetVpY3zN4(boxScopeInstance.align(SizeKt.m285size3ABfNKs(companion, 16.0f), Alignment.Companion.TopEnd), -4.0f, 4.0f), RoundedCornerShapeKt.CircleShape);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(ImageKt.m177backgroundbw27NRU(clip2, colors.semantic.background.f1047app, ColorKt.RectangleShape), false, null, null, function0, 15);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, m183clickableoSLSa3U$default);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            Icons icons = Icons.Failed16;
            String stringResource = Room.stringResource(gapComposer2, R.string.moneybot_remove_attachment_content_description);
            Modifier m285size3ABfNKs2 = SizeKt.m285size3ABfNKs(companion, 10.0f);
            Colors colors2 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Trace.m1191Iconww6aTOc(icons, stringResource, m285size3ABfNKs2, colors2.semantic.icon.standard, gapComposer2, 390, 0);
            gapComposer = gapComposer2;
            gapComposer.end(true);
            gapComposer.end(true);
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new FakeOverlayLayerKt$$ExternalSyntheticLambda0(chatFooterViewModel$Attachment$ImageAttachment, function0, i, 4);
        }
    }

    public static final void AutoScrollIcon(int i, Composer composer, Modifier modifier, Function0 function0) {
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-643105778);
        int i2 = (gapComposer.changed(modifier) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        int i3 = 6;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String stringResource = Room.stringResource(gapComposer, R.string.moneybot_scroll_arrow_button_content_description);
            boolean changed = gapComposer.changed(stringResource);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ClusterItemKt$$ExternalSyntheticLambda3(stringResource, 13);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
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
            Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 32.0f);
            Strings.getSizes(gapComposer).getClass();
            Object obj = DefaultSizes.border.entries;
            Modifier clip = ClipKt.clip(m285size3ABfNKs, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f));
            long j = Strings.getColors(gapComposer).semantic.border.subtle;
            Strings.getSizes(gapComposer).getClass();
            function02 = function0;
            StorageUtil.ButtonIcon(Icons.CaretDown16, stringResource, function02, ImageKt.m177backgroundbw27NRU(ImageKt.m178borderxT4_qwU(clip, 1.0f, j, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(9999.0f)), Strings.getColors(gapComposer).semantic.background.f1047app, ColorKt.RectangleShape), false, null, gapComposer, ((i2 << 3) & 896) | 6, 48);
            gapComposer.end(true);
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda14(modifier, function02, i, i3);
        }
    }

    public static final void ChatContent(MoneybotChatViewModel.Content.Chat chat, LazyListState lazyListState, int i, boolean z, Function1 function1, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i2) {
        int i3;
        ComposableLambdaImpl composableLambdaImpl2;
        GapComposer gapComposer;
        int i4;
        String str;
        Object moneybotChatPresenter$models$6$1;
        Boolean bool;
        int i5;
        int i6;
        int i7;
        NeverEqualPolicy neverEqualPolicy;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        List list;
        String str2;
        MutableState mutableState;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2;
        int i8;
        int i9;
        NeverEqualPolicy neverEqualPolicy2;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3;
        MutableState mutableState2;
        int i10;
        int i11 = i;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1324165814);
        if ((i2 & 6) == 0) {
            i3 = (gapComposer2.changedInstance(chat) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= gapComposer2.changed(lazyListState) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(i11) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= gapComposer2.changed(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= gapComposer2.changedInstance(function1) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i2) == 0) {
            i3 |= gapComposer2.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (gapComposer2.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
            int mo230roundToPx0680j_4 = density.mo230roundToPx0680j_4(40.0f);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy3) {
                rememberedValue = Boxes$$ExternalSyntheticOutline1.m(mo230roundToPx0680j_4, gapComposer2);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = (ParcelableSnapshotMutableIntState) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy3) {
                rememberedValue2 = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState3 = (MutableState) rememberedValue2;
            String str3 = chat.sessionId;
            List list2 = chat.messages;
            boolean changed = gapComposer2.changed(str3);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed || rememberedValue3 == neverEqualPolicy3) {
                rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState4 = (MutableState) rememberedValue3;
            boolean changed2 = gapComposer2.changed(str3);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue4 == neverEqualPolicy3) {
                rememberedValue4 = Boxes$$ExternalSyntheticOutline1.m(-1, gapComposer2);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState5 = (ParcelableSnapshotMutableIntState) rememberedValue4;
            boolean changed3 = gapComposer2.changed(str3);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue5 == neverEqualPolicy3) {
                rememberedValue5 = Boxes$$ExternalSyntheticOutline1.m(-1, gapComposer2);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState6 = (ParcelableSnapshotMutableIntState) rememberedValue5;
            boolean changed4 = gapComposer2.changed(str3);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changed4 || rememberedValue6 == neverEqualPolicy3) {
                rememberedValue6 = Updater.mutableStateOf$default(Boolean.TRUE);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            MutableState mutableState5 = (MutableState) rememberedValue6;
            boolean changed5 = gapComposer2.changed(mutableState5);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (changed5 || rememberedValue7 == neverEqualPolicy3) {
                i4 = mo230roundToPx0680j_4;
                rememberedValue7 = new CashMapViewKt$$ExternalSyntheticLambda2(17, mutableState5);
                gapComposer2.updateRememberedValue(rememberedValue7);
            } else {
                i4 = mo230roundToPx0680j_4;
            }
            int i12 = (i3 >> 3) & 14;
            TrackBottomPositionReachedEffect(lazyListState, (Function0) rememberedValue7, gapComposer2, i12);
            boolean changed6 = gapComposer2.changed(mutableState5);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (changed6 || rememberedValue8 == neverEqualPolicy3) {
                str = str3;
                rememberedValue8 = new MoneyTabUIKt$$ExternalSyntheticLambda9(11, mutableState5);
                gapComposer2.updateRememberedValue(rememberedValue8);
            } else {
                str = str3;
            }
            UpdateBottomPositionOnUserInteractionEffect(lazyListState, (Function1) rememberedValue8, gapComposer2, i12);
            int i13 = i3 & 896;
            MaintainBottomOnInsetGrowthEffect(lazyListState, ((Boolean) mutableState5.getValue()).booleanValue(), i11, gapComposer2, i12 | i13);
            Boolean valueOf = Boolean.valueOf(!list2.isEmpty());
            boolean changedInstance = gapComposer2.changedInstance(chat) | gapComposer2.changed(mutableState4);
            int i14 = i3 & 112;
            int i15 = i3;
            boolean changed7 = (i14 == 32) | changedInstance | gapComposer2.changed(mutableState5) | gapComposer2.changed(parcelableSnapshotMutableIntState5) | gapComposer2.changed(parcelableSnapshotMutableIntState6);
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (changed7 || rememberedValue9 == neverEqualPolicy3) {
                bool = valueOf;
                i5 = i13;
                i6 = i4;
                i7 = i15;
                neverEqualPolicy = neverEqualPolicy3;
                parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState6;
                list = list2;
                str2 = str;
                mutableState = mutableState4;
                moneybotChatPresenter$models$6$1 = new MoneybotChatPresenter$models$6$1(chat, lazyListState, mutableState, mutableState5, parcelableSnapshotMutableIntState5, parcelableSnapshotMutableIntState, null, 17);
                parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState5;
                gapComposer2.updateRememberedValue(moneybotChatPresenter$models$6$1);
            } else {
                bool = valueOf;
                moneybotChatPresenter$models$6$1 = rememberedValue9;
                i5 = i13;
                neverEqualPolicy = neverEqualPolicy3;
                parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState5;
                i6 = i4;
                i7 = i15;
                parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState6;
                list = list2;
                str2 = str;
                mutableState = mutableState4;
            }
            Updater.LaunchedEffect(bool, str2, (Function2) moneybotChatPresenter$models$6$1, gapComposer2);
            int latestUserMessageIndex = latestUserMessageIndex(list);
            boolean hasActiveResponseAfterLatestUserMessage = hasActiveResponseAfterLatestUserMessage(chat);
            Integer valueOf2 = Integer.valueOf(latestUserMessageIndex);
            Integer valueOf3 = Integer.valueOf(list.size());
            Boolean valueOf4 = Boolean.valueOf(chat.processingIndicator != null);
            Boolean valueOf5 = Boolean.valueOf(hasActiveResponseAfterLatestUserMessage);
            Boolean valueOf6 = Boolean.valueOf(z);
            Integer valueOf7 = Integer.valueOf(i);
            Boolean bool2 = (Boolean) mutableState.getValue();
            bool2.getClass();
            Object[] objArr = {valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, bool2};
            boolean changedInstance2 = gapComposer2.changedInstance(chat) | gapComposer2.changed(mutableState) | gapComposer2.changed(latestUserMessageIndex) | gapComposer2.changed(parcelableSnapshotMutableIntState2) | gapComposer2.changed(parcelableSnapshotMutableIntState) | ((i7 & 7168) == 2048) | gapComposer2.changed(i6) | gapComposer2.changed(hasActiveResponseAfterLatestUserMessage) | (i14 == 32) | (i5 == 256);
            Object rememberedValue10 = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy4 = neverEqualPolicy;
            if (changedInstance2 || rememberedValue10 == neverEqualPolicy4) {
                i8 = i14;
                i9 = i7;
                neverEqualPolicy2 = neverEqualPolicy4;
                parcelableSnapshotMutableIntState3 = parcelableSnapshotMutableIntState4;
                mutableState2 = mutableState3;
                gapComposer = gapComposer2;
                i10 = i6;
                MoneybotLoadedContentKt$ChatContent$4$1 moneybotLoadedContentKt$ChatContent$4$1 = new MoneybotLoadedContentKt$ChatContent$4$1(chat, latestUserMessageIndex, z, hasActiveResponseAfterLatestUserMessage, lazyListState, i, mutableState, parcelableSnapshotMutableIntState2, parcelableSnapshotMutableIntState, i10, parcelableSnapshotMutableIntState3, mutableState2, null);
                i11 = i;
                gapComposer.updateRememberedValue(moneybotLoadedContentKt$ChatContent$4$1);
                rememberedValue10 = moneybotLoadedContentKt$ChatContent$4$1;
            } else {
                i9 = i7;
                i8 = i14;
                neverEqualPolicy2 = neverEqualPolicy4;
                parcelableSnapshotMutableIntState3 = parcelableSnapshotMutableIntState4;
                mutableState2 = mutableState3;
                gapComposer = gapComposer2;
                i10 = i6;
                i11 = i;
            }
            Updater.LaunchedEffect(objArr, (Function2) rememberedValue10, gapComposer);
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Integer num = (Integer) mutableState2.getValue();
            float mo233toDpu2uoSUM = density.mo233toDpu2uoSUM(Math.max(i11, parcelableSnapshotMutableIntState3.getIntValue() + (num != null ? num.intValue() : i11)));
            int i16 = i9 << 3;
            RuntimeHelpersKt.m135MoneybotMessageListhGBTI10(fillMaxSize, chat, lazyListState, mo233toDpu2uoSUM, function1, gapComposer, (i16 & 896) | (i16 & 112) | 6 | (i9 & 57344));
            Object rememberedValue11 = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy5 = neverEqualPolicy2;
            if (rememberedValue11 == neverEqualPolicy5) {
                rememberedValue11 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
                gapComposer.updateRememberedValue(rememberedValue11);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue11;
            boolean changedInstance3 = gapComposer.changedInstance(coroutineScope) | gapComposer.changed(i10) | (i8 == 32);
            Object rememberedValue12 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue12 == neverEqualPolicy5) {
                j1$$ExternalSyntheticLambda14 j1__externalsyntheticlambda14 = new j1$$ExternalSyntheticLambda14(coroutineScope, lazyListState, i10, parcelableSnapshotMutableIntState3, mutableState2, 3);
                gapComposer.updateRememberedValue(j1__externalsyntheticlambda14);
                rememberedValue12 = j1__externalsyntheticlambda14;
            }
            composableLambdaImpl2 = composableLambdaImpl;
            composableLambdaImpl2.invoke((Function0) rememberedValue12, gapComposer, Integer.valueOf((i9 >> 12) & 112));
        } else {
            composableLambdaImpl2 = composableLambdaImpl;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(chat, lazyListState, i11, z, function1, composableLambdaImpl2, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ChatInput(final boolean z, final boolean z2, final DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, final String str, String str2, KeyboardState keyboardState, List list, final boolean z3, boolean z4, final boolean z5, final boolean z6, final String str3, Function1 function1, final Function1 function12, final Function1 function13, final Function1 function14, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        KeyboardState keyboardState2;
        final String str4;
        boolean z7;
        final Function1 function15;
        GapComposer gapComposer;
        List list2;
        String str5;
        Function1 function16;
        ManagedActivityResultLauncher managedActivityResultLauncher;
        MutableState mutableState;
        LinearGradient m132linearGradientmHitzGk;
        boolean z8;
        MutableState mutableState2;
        boolean z9;
        Function0 function0;
        ComposableLambdaImpl composableLambdaImpl;
        ComposableLambdaImpl composableLambdaImpl2;
        int i5;
        Float valueOf = Float.valueOf(1.0f);
        Float valueOf2 = Float.valueOf(RecyclerView.DECELERATION_RATE);
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1525914699);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i3 = i | (gapComposer2.changed(z) ? 4 : 2);
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(z2) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer2.changed(delegatingSoftwareKeyboardController) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer2.changed(str) ? 2048 : 1024;
        }
        int i6 = i & 24576;
        int i7 = PKIFailureInfo.certRevoked;
        if (i6 == 0) {
            i3 |= gapComposer2.changed(str2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i3 |= gapComposer2.changed(keyboardState.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= gapComposer2.changedInstance(list) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i) == 0) {
            i3 |= gapComposer2.changed(z3) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i3 |= gapComposer2.changed(z4) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i3 |= gapComposer2.changed(z5) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i8 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (gapComposer2.changed(z6) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= gapComposer2.changed(str3) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i4 |= gapComposer2.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= gapComposer2.changedInstance(function12) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            if (gapComposer2.changedInstance(function13)) {
                i7 = 16384;
            }
            i4 |= i7;
        }
        if ((i2 & 196608) == 0) {
            i4 |= gapComposer2.changedInstance(function14) ? 131072 : 65536;
        }
        int i9 = i4;
        int i10 = 1;
        if (gapComposer2.shouldExecute(i8 & 1, ((i8 & 306783379) == 306783378 && (74899 & i9) == 74898) ? false : true)) {
            Context context = (Context) gapComposer2.consume(AndroidCompositionLocals_androidKt.LocalContext);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState3 = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(null);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState4 = (MutableState) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState5 = (MutableState) rememberedValue3;
            ActivityResultContracts$TakePicture activityResultContracts$TakePicture = new ActivityResultContracts$TakePicture();
            int i11 = i9 & 896;
            boolean changedInstance = (i11 == 256) | gapComposer2.changedInstance(context);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new MoneyTabUIKt$$ExternalSyntheticLambda39(4, function1, context, mutableState4);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            ManagedActivityResultLauncher rememberLauncherForActivityResult = LinkScanner.rememberLauncherForActivityResult(activityResultContracts$TakePicture, (Function1) rememberedValue4, gapComposer2);
            ActivityResultContracts$RequestPermission activityResultContracts$RequestPermission = new ActivityResultContracts$RequestPermission();
            boolean changedInstance2 = gapComposer2.changedInstance(rememberLauncherForActivityResult);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new MoneyTabUIKt$$ExternalSyntheticLambda39(5, mutableState5, mutableState4, rememberLauncherForActivityResult);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            ManagedActivityResultLauncher rememberLauncherForActivityResult2 = LinkScanner.rememberLauncherForActivityResult(activityResultContracts$RequestPermission, (Function1) rememberedValue5, gapComposer2);
            boolean changedInstance3 = ((i9 & 112) == 32) | gapComposer2.changedInstance(context) | (i11 == 256) | gapComposer2.changedInstance(rememberLauncherForActivityResult) | gapComposer2.changedInstance(rememberLauncherForActivityResult2);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changedInstance3 || rememberedValue6 == neverEqualPolicy) {
                rememberedValue6 = new GLSceneScope$FrameRenderer$5$1$1$1$1(str3, context, function1, rememberLauncherForActivityResult, rememberLauncherForActivityResult2, mutableState4, mutableState5, null, 3);
                str5 = str3;
                function16 = function1;
                gapComposer2.updateRememberedValue(rememberedValue6);
            } else {
                str5 = str3;
                function16 = function1;
            }
            Updater.LaunchedEffect(gapComposer2, str5, (Function2) rememberedValue6);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (rememberedValue7 == neverEqualPolicy) {
                rememberedValue7 = new ActivityResultContracts$PickMultipleVisualMedia();
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            ActivityResultContracts$PickMultipleVisualMedia activityResultContracts$PickMultipleVisualMedia = (ActivityResultContracts$PickMultipleVisualMedia) rememberedValue7;
            boolean changedInstance4 = (i11 == 256) | gapComposer2.changedInstance(context);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (changedInstance4 || rememberedValue8 == neverEqualPolicy) {
                rememberedValue8 = new MusicViewKt$$ExternalSyntheticLambda6(context, function16);
                gapComposer2.updateRememberedValue(rememberedValue8);
            }
            ManagedActivityResultLauncher rememberLauncherForActivityResult3 = LinkScanner.rememberLauncherForActivityResult(activityResultContracts$PickMultipleVisualMedia, (Function1) rememberedValue8, gapComposer2);
            if (keyboardState == KeyboardState.Open && z3) {
                gapComposer2.startReplaceGroup(593974861);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                Colors colors = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                Pair pair = new Pair(valueOf2, new Color(Color.m675copywmQWz5c$default(RecyclerView.DECELERATION_RATE, colors.semantic.background.f1047app, 14)));
                Colors colors2 = (Colors) gapComposer2.consume(staticProvidableCompositionLocal);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                m132linearGradientmHitzGk = Lock.m132linearGradientmHitzGk((Pair[]) Arrays.copyOf(r2, new Pair[]{pair, new Pair(valueOf, new Color(colors2.semantic.background.f1047app))}.length), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax));
                gapComposer2.end(false);
                managedActivityResultLauncher = rememberLauncherForActivityResult3;
                z8 = false;
                mutableState = mutableState3;
            } else {
                gapComposer2.startReplaceGroup(594151344);
                managedActivityResultLauncher = rememberLauncherForActivityResult3;
                mutableState = mutableState3;
                m132linearGradientmHitzGk = Lock.m132linearGradientmHitzGk((Pair[]) Arrays.copyOf(r1, new Pair[]{new Pair(valueOf2, new Color(Color.m675copywmQWz5c$default(RecyclerView.DECELERATION_RATE, Strings.getColors(gapComposer2).semantic.background.f1047app, 14))), new Pair(Float.valueOf(0.48f), new Color(Strings.getColors(gapComposer2).semantic.background.f1047app)), new Pair(valueOf, new Color(Strings.getColors(gapComposer2).semantic.background.f1047app))}.length), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) & BodyPartID.bodyIdMax), (Float.floatToRawIntBits(RecyclerView.DECELERATION_RATE) << 32) | (Float.floatToRawIntBits(Float.POSITIVE_INFINITY) & BodyPartID.bodyIdMax));
                z8 = false;
                gapComposer2.end(false);
            }
            Colors colors3 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors3 == null) {
                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, z8);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(z8);
            }
            long j = colors3.semantic.text.danger;
            RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(26.0f);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(companion, 2.0f, j, m340RoundedCornerShape0680j_4);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            boolean z10 = (i9 & 57344) == 16384;
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (z10 || rememberedValue9 == neverEqualPolicy) {
                rememberedValue9 = new UtilsKt$$ExternalSyntheticLambda0(17, function13);
                gapComposer2.updateRememberedValue(rememberedValue9);
            }
            Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(fillMaxWidth, (Function1) rememberedValue9);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            ManagedActivityResultLauncher managedActivityResultLauncher2 = managedActivityResultLauncher;
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, onGloballyPositioned);
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
            Integer valueOf3 = Integer.valueOf(hashCode);
            MutableState mutableState6 = mutableState;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer2, valueOf3, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$14);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, companion);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            BoxKt.Box(ImageKt.background$default(BoxScopeInstance.INSTANCE.matchParentSize(), m132linearGradientmHitzGk, null, 6), gapComposer2, 0);
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 12.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer2, 0);
            int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, m300paddingVpY3zN4$default);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            fillMaxWidth2.getClass();
            function14.getClass();
            Modifier onGloballyPositioned2 = ValueInsets.onGloballyPositioned(fillMaxWidth2, new UtilsKt$$ExternalSyntheticLambda0(0, function14));
            if (z4) {
                onGloballyPositioned2 = onGloballyPositioned2.then(m178borderxT4_qwU);
            }
            final Modifier modifier = onGloballyPositioned2;
            boolean z11 = i11 == 256;
            Object rememberedValue10 = gapComposer2.rememberedValue();
            int i12 = 18;
            if (z11 || rememberedValue10 == neverEqualPolicy) {
                function15 = function1;
                rememberedValue10 = new UtilsKt$$ExternalSyntheticLambda0(i12, function15);
                gapComposer2.updateRememberedValue(rememberedValue10);
            } else {
                function15 = function1;
            }
            final Function1 function17 = (Function1) rememberedValue10;
            boolean z12 = i11 == 256;
            Object rememberedValue11 = gapComposer2.rememberedValue();
            int i13 = 9;
            if (z12 || rememberedValue11 == neverEqualPolicy) {
                rememberedValue11 = new MoneyTabUIKt$$ExternalSyntheticLambda21(i13, function15);
                gapComposer2.updateRememberedValue(rememberedValue11);
            }
            final Function0 function02 = (Function0) rememberedValue11;
            boolean z13 = (i11 == 256) | ((i9 & 7168) == 2048);
            Object rememberedValue12 = gapComposer2.rememberedValue();
            if (z13 || rememberedValue12 == neverEqualPolicy) {
                rememberedValue12 = new PersonalInfoViewKt$$ExternalSyntheticLambda9(function12, function15, 2);
                gapComposer2.updateRememberedValue(rememberedValue12);
            }
            final Function1 function18 = (Function1) rememberedValue12;
            if (z6) {
                gapComposer2.startReplaceGroup(830990434);
                keyboardState2 = keyboardState;
                gapComposer = gapComposer2;
                UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(-984129861, new Function3() { // from class: com.squareup.cash.moneybot.views.chat.MoneybotLoadedContentKt$$ExternalSyntheticLambda34
                    @Override // kotlin.jvm.functions.Function3
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        UiScope uiScope = (UiScope) obj;
                        Composer composer2 = (Composer) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        uiScope.getClass();
                        if ((intValue & 6) == 0) {
                            intValue |= ((GapComposer) composer2).changed(uiScope) ? 4 : 2;
                        }
                        GapComposer gapComposer3 = (GapComposer) composer2;
                        if (gapComposer3.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                            ComposerKt.Composer(Modifier.this, ComposerState.EXPANDED, z ? ComposerInputStatus.READY : ComposerInputStatus.ACTIVE, false, z2, false, delegatingSoftwareKeyboardController, str, uiScope, uiScope, null, function17, function02, function18, gapComposer3, ((intValue << 24) & 234881024) | 48 | ((intValue << 27) & 1879048192), 0, IptcConstants.IMAGE_RESOURCE_BLOCK_PIXEL_ASPECT_RATIO);
                        } else {
                            gapComposer3.skipToGroupEnd();
                        }
                        return Unit.INSTANCE;
                    }
                }, gapComposer), gapComposer, 6);
                i5 = 0;
                gapComposer.end(false);
                list2 = list;
            } else {
                keyboardState2 = keyboardState;
                gapComposer = gapComposer2;
                gapComposer.startReplaceGroup(831744385);
                FloatingChatInputState floatingChatInputState = FloatingChatInputState.EXPANDED;
                FloatingChatInputStatus floatingChatInputStatus = z ? FloatingChatInputStatus.READY : FloatingChatInputStatus.ACTIVE;
                List list3 = list;
                boolean z14 = !list3.isEmpty();
                if (z5) {
                    gapComposer.startReplaceGroup(832189111);
                    Object rememberedValue13 = gapComposer.rememberedValue();
                    if (rememberedValue13 == neverEqualPolicy) {
                        mutableState2 = mutableState6;
                        rememberedValue13 = new CashMapViewKt$$ExternalSyntheticLambda2(i12, mutableState2);
                        gapComposer.updateRememberedValue(rememberedValue13);
                    } else {
                        mutableState2 = mutableState6;
                    }
                    z9 = false;
                    gapComposer.end(false);
                    function0 = (Function0) rememberedValue13;
                } else {
                    mutableState2 = mutableState6;
                    z9 = false;
                    gapComposer.startReplaceGroup(832271199);
                    gapComposer.end(false);
                    function0 = null;
                }
                if (z5) {
                    gapComposer.startReplaceGroup(832447837);
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1179363454, new MusicViewKt$$ExternalSyntheticLambda5(14, mutableState2, function15, managedActivityResultLauncher2), gapComposer);
                    gapComposer.end(z9);
                    composableLambdaImpl = rememberComposableLambda;
                } else {
                    gapComposer.startReplaceGroup(834246271);
                    gapComposer.end(z9);
                    composableLambdaImpl = null;
                }
                if (list3.isEmpty()) {
                    list2 = list;
                    gapComposer.startReplaceGroup(834639103);
                    gapComposer.end(z9);
                    composableLambdaImpl2 = null;
                } else {
                    gapComposer.startReplaceGroup(834374425);
                    list2 = list;
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1587347706, new SelectionViewKt$$ExternalSyntheticLambda6(list2, function15), gapComposer);
                    gapComposer.end(z9);
                    composableLambdaImpl2 = rememberComposableLambda2;
                }
                int i14 = i8 << 9;
                UtilsKt.FloatingChatInput(modifier, floatingChatInputState, floatingChatInputStatus, false, z2, delegatingSoftwareKeyboardController, str, z14, function0, composableLambdaImpl, composableLambdaImpl2, function17, function02, function18, gapComposer, (i14 & 57344) | 48 | (458752 & i14) | (i14 & 3670016));
                i5 = 0;
                gapComposer.end(false);
            }
            DBUtil.SpacerWithinSectionMedium(6, i5, gapComposer, ImageKt.m177backgroundbw27NRU(companion, Color.Transparent, ColorKt.RectangleShape));
            boolean z15 = ((keyboardState2 == KeyboardState.Closed || keyboardState2 == KeyboardState.AnimatingOut) && (str2 != null || z4)) ? 1 : i5;
            str4 = str2;
            z7 = z4;
            AnimatedContentKt.AnimatedVisibility(ColumnScopeInstance.INSTANCE, z15, null, null, null, null, Expect_jvmKt.rememberComposableLambda(-2014552171, new WorkWebViewKt$$ExternalSyntheticLambda5(z7, str4, function15, i10), gapComposer), gapComposer, 1572870, 30);
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, true, true);
        } else {
            keyboardState2 = keyboardState;
            str4 = str2;
            z7 = z4;
            function15 = function1;
            gapComposer = gapComposer2;
            list2 = list;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final boolean z16 = z7;
            final List list4 = list2;
            final KeyboardState keyboardState3 = keyboardState2;
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.moneybot.views.chat.MoneybotLoadedContentKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                    CardViewApi21Impl.ChatInput(z, z2, delegatingSoftwareKeyboardController, str, str4, keyboardState3, list4, z3, z16, z5, z6, str3, function15, function12, function13, function14, (Composer) obj, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void Disclosure(Modifier modifier, String str, boolean z, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        long j;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1175843820);
        int i2 = i | (gapComposer2.changed(str) ? 32 : 16) | (gapComposer2.changed(z) ? 256 : 128) | (gapComposer2.changedInstance(function1) ? 2048 : 1024);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            if (z) {
                gapComposer2.startReplaceGroup(190229561);
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors.semantic.text.danger;
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(190288089);
                Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                j = colors2.semantic.text.subtle;
                gapComposer2.end(false);
            }
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
            TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelXSmall;
            boolean z2 = (i2 & 7168) == 2048;
            Object rememberedValue = gapComposer2.rememberedValue();
            if (z2 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new NfcNotAvailableKt$$ExternalSyntheticLambda0(18, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue, m302paddingqDBjuR0$default, textStyle, j, null, null, null, 0, 0, 3, gapComposer, (i2 >> 3) & 14, 992);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeViewKt$$ExternalSyntheticLambda0(modifier, str, z, function1, i, 22);
        }
    }

    public static final void ErrorToast(MoneybotChatViewModel.Content.ToastMessage toastMessage, Composer composer, int i) {
        int i2;
        Icons icons;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1166710203);
        int i3 = 2;
        int i4 = (gapComposer.changed(toastMessage.ordinal()) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 3) != 2)) {
            switch (toastMessage.ordinal()) {
                case 0:
                    i2 = R.string.moneybot_cancel_message_error;
                    break;
                case 1:
                    i2 = R.string.moneybot_send_message_error;
                    break;
                case 2:
                    i2 = R.string.moneybot_network_error;
                    break;
                case 3:
                    i2 = R.string.moneybot_feedback_submitted;
                    break;
                case 4:
                    i2 = R.string.moneybot_refresh_error;
                    break;
                case 5:
                    i2 = R.string.moneybot_pin_succeeded;
                    break;
                case 6:
                    i2 = R.string.moneybot_pin_failed;
                    break;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
            }
            switch (toastMessage.ordinal()) {
                case 0:
                    icons = Icons.FailedFill24;
                    break;
                case 1:
                    icons = Icons.FailedFill24;
                    break;
                case 2:
                    icons = Icons.AlertOffline24;
                    break;
                case 3:
                    icons = Icons.CheckFill24;
                    break;
                case 4:
                    icons = Icons.FailedFill24;
                    break;
                case 5:
                    icons = Icons.CheckFill24;
                    break;
                case 6:
                    icons = Icons.FailedFill24;
                    break;
                default:
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
            }
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new InsightChartKt$$ExternalSyntheticLambda19(7);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ModalKt.m3381ToastBAHpl2s(SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue), null, Room.stringResource(gapComposer, i2), Expect_jvmKt.rememberComposableLambda(625325636, new PoolToastKt$$ExternalSyntheticLambda2(icons, i3), gapComposer), null, null, null, gapComposer, 3072, 498);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SuggestionUiKt$$ExternalSyntheticLambda8(toastMessage, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0312  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Footer(final ChatFooterViewModel chatFooterViewModel, final KeyboardState keyboardState, final Modifier modifier, final boolean z, boolean z2, boolean z3, boolean z4, final boolean z5, LazyListState lazyListState, final Function1 function1, final Function1 function12, final Function1 function13, final Function1 function14, Function0 function0, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        boolean z6;
        int i5;
        boolean z7;
        LazyListState lazyListState2;
        int i6;
        int i7;
        GapComposer gapComposer;
        final boolean z8;
        final Function0 function02;
        final LazyListState lazyListState3;
        final boolean z9;
        RecomposeScopeImpl endRestartGroup;
        LazyListState lazyListState4;
        GapComposer gapComposer2;
        boolean z10;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(709331556);
        int i8 = i | (gapComposer3.changedInstance(chatFooterViewModel) ? 4 : 2) | (gapComposer3.changed(keyboardState.ordinal()) ? 32 : 16) | (gapComposer3.changed(modifier) ? 256 : 128) | (gapComposer3.changed(z) ? 2048 : 1024);
        int i9 = i3 & 16;
        if (i9 != 0) {
            i4 = i8 | 24576;
        } else {
            i4 = i8 | (gapComposer3.changed(z2) ? 16384 : PKIFailureInfo.certRevoked);
        }
        int i10 = i3 & 32;
        if (i10 != 0) {
            i5 = i4 | 196608;
            z6 = z3;
        } else {
            z6 = z3;
            i5 = i4 | (gapComposer3.changed(z6) ? PKIFailureInfo.unsupportedVersion : 65536);
        }
        int i11 = i3 & 64;
        if (i11 != 0) {
            i5 |= 1572864;
            z7 = z4;
        } else {
            z7 = z4;
            if ((i & 1572864) == 0) {
                i5 |= gapComposer3.changed(z7) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
        }
        int i12 = i5 | (gapComposer3.changed(z5) ? 8388608 : 4194304);
        int i13 = i3 & 256;
        if (i13 != 0) {
            i6 = i12 | 100663296;
            lazyListState2 = lazyListState;
        } else {
            lazyListState2 = lazyListState;
            i6 = i12 | (gapComposer3.changed(lazyListState2) ? 67108864 : 33554432);
        }
        if ((i2 & 6) == 0) {
            i7 = i2 | (gapComposer3.changedInstance(function12) ? 4 : 2);
        } else {
            i7 = i2;
        }
        int i14 = i6;
        if ((i2 & 48) == 0) {
            i7 |= gapComposer3.changedInstance(function13) ? 32 : 16;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i7 |= gapComposer3.changedInstance(function14) ? 256 : 128;
        }
        int i15 = i7;
        int i16 = i3 & PKIFailureInfo.certRevoked;
        if (i16 != 0) {
            i15 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i15 |= gapComposer3.changedInstance(function0) ? 2048 : 1024;
            if (gapComposer3.shouldExecute(i14 & 1, (i14 & 306783379) == 306783378 || (i15 & 1171) != 1170)) {
                gapComposer = gapComposer3;
                gapComposer.skipToGroupEnd();
                z8 = z2;
                function02 = function0;
                lazyListState3 = lazyListState2;
                z9 = z6;
            } else {
                boolean z11 = i9 != 0 ? false : z2;
                boolean z12 = i10 != 0 ? true : z6;
                if (i11 != 0) {
                    z7 = false;
                }
                LazyListState lazyListState5 = i13 != 0 ? null : lazyListState2;
                Function0 function03 = i16 != 0 ? null : function0;
                Object rememberedValue = gapComposer3.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer3);
                    gapComposer3.updateRememberedValue(rememberedValue);
                }
                CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer3.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
                int i17 = i14 >> 6;
                boolean z13 = z12;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, modifier);
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
                Updater.m576setimpl(gapComposer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1767254079, new MusicViewKt$$ExternalSyntheticLambda5(16, function03, coroutineScope, lazyListState5), gapComposer3);
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                if (z13) {
                    gapComposer3.startReplaceGroup(-1736703860);
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.CenterHorizontally;
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    lazyListState4 = lazyListState5;
                    AnimatedContentKt.AnimatedVisibility(columnScopeInstance, z11, columnScopeInstance.align(companion, horizontal), EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(150, 0, null, 6), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(120, 0, EasingFunctionsKt.EaseOut, 2), 2), null, Expect_jvmKt.rememberComposableLambda(1258538459, new OverlayKt$$ExternalSyntheticLambda0(rememberComposableLambda, 23), gapComposer3), gapComposer3, 1575942 | ((i14 >> 9) & 112), 16);
                    z10 = z11;
                    gapComposer2 = gapComposer3;
                    gapComposer2.end(false);
                } else {
                    lazyListState4 = lazyListState5;
                    gapComposer2 = gapComposer3;
                    z10 = z11;
                    gapComposer2.startReplaceGroup(-1736283562);
                    rememberComposableLambda.invoke((Object) gapComposer2, (Object) 6);
                    gapComposer2.end(false);
                }
                List list = chatFooterViewModel.slashCommandMatches;
                int i18 = i15 & 896;
                boolean z14 = i18 == 256;
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (z14 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new UtilsKt$$ExternalSyntheticLambda0(16, function14);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                ((DefaultSizes) gapComposer2.consume(staticProvidableCompositionLocal)).getClass();
                ListOrderedKt.SlashCommandMenu(0, gapComposer2, SpacerKt.m302paddingqDBjuR0$default(m300paddingVpY3zN4$default, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 8.0f, 7), list, (Function1) rememberedValue2);
                MoneybotChatViewModel.Content.ToastMessage toastMessage = chatFooterViewModel.toastMessage;
                if (toastMessage == null) {
                    gapComposer2.startReplaceGroup(-1735855422);
                } else {
                    gapComposer2.startReplaceGroup(-1735855421);
                    ErrorToast(toastMessage, gapComposer2, 0);
                }
                gapComposer2.end(false);
                GapComposer gapComposer4 = gapComposer2;
                ChatInput(chatFooterViewModel.enableSubmission, z, delegatingSoftwareKeyboardController, chatFooterViewModel.restoreInputText, chatFooterViewModel.persistentDisclosure, keyboardState, chatFooterViewModel.pendingAttachments, z7, chatFooterViewModel.hasPreambleOverride, z5, chatFooterViewModel.useComposer, chatFooterViewModel.cameraCapturePath, function14, function13, function1, function12, gapComposer4, (i17 & 112) | ((i14 << 12) & 458752) | ((i14 << 3) & 29360128) | ((i14 << 6) & 1879048192), i18 | ((i15 << 6) & 7168) | 24576 | ((i15 << 15) & 458752));
                gapComposer = gapComposer4;
                gapComposer.end(true);
                lazyListState3 = lazyListState4;
                z9 = z13;
                function02 = function03;
                z8 = z10;
            }
            final boolean z15 = z7;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new Function2() { // from class: com.squareup.cash.moneybot.views.chat.MoneybotLoadedContentKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                        int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                        CardViewApi21Impl.Footer(ChatFooterViewModel.this, keyboardState, modifier, z, z8, z9, z15, z5, lazyListState3, function1, function12, function13, function14, function02, (Composer) obj, updateChangedFlags, updateChangedFlags2, i3);
                        return Unit.INSTANCE;
                    }
                };
                return;
            }
            return;
        }
        if (gapComposer3.shouldExecute(i14 & 1, (i14 & 306783379) == 306783378 || (i15 & 1171) != 1170)) {
        }
        final boolean z152 = z7;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void MaintainBottomOnInsetGrowthEffect(LazyListState lazyListState, boolean z, int i, Composer composer, int i2) {
        int i3;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1743848176);
        if ((i2 & 6) == 0) {
            i3 = (gapComposer.changed(lazyListState) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            z2 = z;
            i3 |= gapComposer.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i2 & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(i) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Boxes$$ExternalSyntheticOutline1.m(i, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue;
            Integer valueOf = Integer.valueOf(i);
            Boolean valueOf2 = Boolean.valueOf(z2);
            boolean z3 = ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z3 || rememberedValue2 == neverEqualPolicy) {
                DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new DataStoreImpl$readDataAndUpdateCache$4(i, z2, lazyListState, parcelableSnapshotMutableIntState, (Continuation) null);
                gapComposer.updateRememberedValue(dataStoreImpl$readDataAndUpdateCache$4);
                rememberedValue2 = dataStoreImpl$readDataAndUpdateCache$4;
            }
            Updater.LaunchedEffect(valueOf, valueOf2, (Function2) rememberedValue2, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ChromeConfigKt$$ExternalSyntheticLambda5(lazyListState, z, i, i2, 2);
        }
    }

    public static final void MoneybotLoadedContent(MoneybotChatViewModel.Content content, Function1 function1, final boolean z, boolean z2, boolean z3, final Function0 function0, Composer composer, int i) {
        int i2;
        boolean z4;
        int i3;
        boolean z5;
        content.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1209219335);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(z3) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((i & 196608) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        int i4 = i2;
        if (gapComposer.shouldExecute(i4 & 1, (74899 & i4) != 74898)) {
            final FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer.consume(CompositionLocalsKt.LocalFocusManager);
            final DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (rememberedValue == obj) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            KeyboardState rememberKeyboardState = UtilsKt.rememberKeyboardState(gapComposer);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = Boxes$$ExternalSyntheticOutline1.m(-1, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj) {
                rememberedValue3 = Boxes$$ExternalSyntheticOutline1.m(-1, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = (ParcelableSnapshotMutableIntState) rememberedValue3;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == obj) {
                rememberedValue4 = Boxes$$ExternalSyntheticOutline1.m(-1, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = (ParcelableSnapshotMutableIntState) rememberedValue4;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (rememberedValue5 == obj) {
                rememberedValue5 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState4 = (ParcelableSnapshotMutableIntState) rememberedValue5;
            int i5 = i4 & 112;
            boolean changed = gapComposer.changed(rememberKeyboardState.ordinal()) | (i5 == 32);
            Object rememberedValue6 = gapComposer.rememberedValue();
            Continuation continuation = null;
            if (changed || rememberedValue6 == obj) {
                rememberedValue6 = new GenieViewKt$GenieView$1$1(rememberKeyboardState, function1, continuation, 18);
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            Updater.LaunchedEffect(gapComposer, rememberKeyboardState, (Function2) rememberedValue6);
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (rememberedValue7 == obj) {
                rememberedValue7 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState5 = (ParcelableSnapshotMutableIntState) rememberedValue7;
            int intValue = parcelableSnapshotMutableIntState5.getIntValue();
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            AndroidWindowInsets androidWindowInsets = Arrangement$End$1.current(gapComposer).ime;
            int i6 = intValue + androidWindowInsets.getInsets$foundation_layout().bottom;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (rememberedValue8 == obj) {
                rememberedValue8 = new MusicViewKt$$ExternalSyntheticLambda6(10, parcelableSnapshotMutableIntState4, parcelableSnapshotMutableIntState3);
                gapComposer.updateRememberedValue(rememberedValue8);
            }
            Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(fillMaxSize, (Function1) rememberedValue8);
            Boolean valueOf = Boolean.valueOf(z);
            boolean changedInstance = ((i4 & 896) == 256) | ((458752 & i4) == 131072) | gapComposer.changedInstance(focusOwnerImpl) | gapComposer.changed(delegatingSoftwareKeyboardController);
            Object rememberedValue9 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue9 == obj) {
                rememberedValue9 = new PointerInputEventHandler() { // from class: com.squareup.cash.moneybot.views.chat.MoneybotLoadedContentKt$MoneybotLoadedContent$4$1
                    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
                    public final Object invoke(PointerInputScope pointerInputScope, Continuation continuation2) {
                        Object detectTapGestures$default = TapGestureDetectorKt.detectTapGestures$default(pointerInputScope, null, null, new UserJavascriptInterfaceBase$$ExternalSyntheticLambda25(z, function0, focusOwnerImpl, delegatingSoftwareKeyboardController, 12), continuation2, 7);
                        return detectTapGestures$default == CoroutineSingletons.COROUTINE_SUSPENDED ? detectTapGestures$default : Unit.INSTANCE;
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue9);
            }
            Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(onGloballyPositioned, valueOf, (PointerInputEventHandler) rememberedValue9);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, pointerInput);
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
            if (content instanceof MoneybotChatViewModel.Content.Chat) {
                gapComposer.startReplaceGroup(-1990018390);
                MoneybotChatViewModel.Content.Chat chat = (MoneybotChatViewModel.Content.Chat) content;
                List list = chat.messages;
                String str = chat.sessionId;
                Object[] objArr = {str};
                WorkLauncherImpl workLauncherImpl = LazyListState.Saver;
                boolean changedInstance2 = gapComposer.changedInstance(content);
                Object rememberedValue10 = gapComposer.rememberedValue();
                int i7 = 9;
                if (changedInstance2 || rememberedValue10 == obj) {
                    rememberedValue10 = new MoneyTabUIKt$$ExternalSyntheticLambda5(content, i7);
                    gapComposer.updateRememberedValue(rememberedValue10);
                }
                LazyListState lazyListState = (LazyListState) SaverKt.m581rememberSaveable(objArr, (Saver) workLauncherImpl, (Function0) rememberedValue10, (Composer) gapComposer, 0);
                boolean changedInstance3 = gapComposer.changedInstance(content) | gapComposer.changed(lazyListState) | (i5 == 32);
                Object rememberedValue11 = gapComposer.rememberedValue();
                if (changedInstance3 || rememberedValue11 == obj) {
                    i3 = -1;
                    RealMRIFactory$sign$2 realMRIFactory$sign$2 = new RealMRIFactory$sign$2(content, lazyListState, function1, null, 3);
                    gapComposer.updateRememberedValue(realMRIFactory$sign$2);
                    rememberedValue11 = realMRIFactory$sign$2;
                } else {
                    i3 = -1;
                }
                Updater.LaunchedEffect(str, lazyListState, (Function2) rememberedValue11, gapComposer);
                boolean changed2 = gapComposer.changed(list.size()) | gapComposer.changed(lazyListState);
                Object rememberedValue12 = gapComposer.rememberedValue();
                if (changed2 || rememberedValue12 == obj) {
                    rememberedValue12 = Updater.derivedStateOf(new MoneybotLoadedContentKt$$ExternalSyntheticLambda2(lazyListState, content));
                    gapComposer.updateRememberedValue(rememberedValue12);
                }
                State state = (State) rememberedValue12;
                boolean changed3 = gapComposer.changed(chat.processingIndicator) | gapComposer.changed(lazyListState);
                Object rememberedValue13 = gapComposer.rememberedValue();
                if (changed3 || rememberedValue13 == obj) {
                    rememberedValue13 = Updater.derivedStateOf(new MoneybotLoadedContentKt$$ExternalSyntheticLambda2(content, lazyListState));
                    gapComposer.updateRememberedValue(rememberedValue13);
                }
                State state2 = (State) rememberedValue13;
                int intValue2 = parcelableSnapshotMutableIntState3.getIntValue();
                int intValue3 = parcelableSnapshotMutableIntState4.getIntValue();
                int intValue4 = parcelableSnapshotMutableIntState2.getIntValue();
                if (intValue2 != i3 && intValue3 > 0 && intValue4 != i3) {
                    i6 = intValue3 - RangesKt___RangesKt.coerceIn(intValue4 - intValue2, 0, intValue3);
                }
                if (((Boolean) state.getValue()).booleanValue() && !((Boolean) state2.getValue()).booleanValue()) {
                    MessageViewModel messageViewModel = (MessageViewModel) CollectionsKt.lastOrNull(list);
                    if (!(messageViewModel instanceof MessageViewModel.UserMessageViewModel) || !((MessageViewModel.UserMessageViewModel) messageViewModel).isPending) {
                        z5 = true;
                        z4 = true;
                        ChatContent(chat, lazyListState, i6, z5, function1, Expect_jvmKt.rememberComposableLambda(-872949432, new TabToolbarsKt$$ExternalSyntheticLambda1(content, rememberKeyboardState, z5, z2, lazyListState, function1, parcelableSnapshotMutableIntState5, parcelableSnapshotMutableIntState2, mutableState), gapComposer), gapComposer, (i4 & 14) | 196608 | (57344 & (i4 << 9)));
                        gapComposer.end(false);
                    }
                }
                z5 = false;
                z4 = true;
                ChatContent(chat, lazyListState, i6, z5, function1, Expect_jvmKt.rememberComposableLambda(-872949432, new TabToolbarsKt$$ExternalSyntheticLambda1(content, rememberKeyboardState, z5, z2, lazyListState, function1, parcelableSnapshotMutableIntState5, parcelableSnapshotMutableIntState2, mutableState), gapComposer), gapComposer, (i4 & 14) | 196608 | (57344 & (i4 << 9)));
                gapComposer.end(false);
            } else {
                if (!(content instanceof MoneybotChatViewModel.Content.Empty)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1736921174, false);
                }
                gapComposer.startReplaceGroup(-1985858469);
                MoneybotChatViewModel.Content.Empty empty = (MoneybotChatViewModel.Content.Empty) content;
                EmptyChatKt.EmptyChat(empty, ((Boolean) mutableState.getValue()).booleanValue(), SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxSize(companion, 1.0f), 12.0f, RecyclerView.DECELERATION_RATE, 2), rememberKeyboardState, i6, parcelableSnapshotMutableIntState.getIntValue(), z3, function1, gapComposer, ((i4 << 18) & 29360128) | (i4 & 14) | MLKEMEngine.KyberPolyBytes | ((i4 << 6) & 3670016));
                ChatFooterViewModel chatFooterViewModel = empty.footer;
                boolean z6 = rememberKeyboardState == KeyboardState.Open || empty.requestKeyboardFocus;
                Modifier align = BoxScopeInstance.INSTANCE.align(SpacerKt.imePadding(SizeKt.fillMaxWidth(companion, 1.0f)), Alignment.Companion.BottomCenter);
                boolean z7 = empty.showImageAttachmentButton;
                Object rememberedValue14 = gapComposer.rememberedValue();
                if (rememberedValue14 == obj) {
                    rememberedValue14 = new MoneyTabUIKt$$ExternalSyntheticLambda14(20, parcelableSnapshotMutableIntState5);
                    gapComposer.updateRememberedValue(rememberedValue14);
                }
                Function1 function12 = (Function1) rememberedValue14;
                Object rememberedValue15 = gapComposer.rememberedValue();
                if (rememberedValue15 == obj) {
                    rememberedValue15 = new MoneyTabUIKt$$ExternalSyntheticLambda14(21, parcelableSnapshotMutableIntState);
                    gapComposer.updateRememberedValue(rememberedValue15);
                }
                Function1 function13 = (Function1) rememberedValue15;
                Object rememberedValue16 = gapComposer.rememberedValue();
                if (rememberedValue16 == obj) {
                    rememberedValue16 = new MoneyTabUIKt$$ExternalSyntheticLambda9(13, mutableState);
                    gapComposer.updateRememberedValue(rememberedValue16);
                }
                gapComposer = gapComposer;
                Footer(chatFooterViewModel, rememberKeyboardState, align, z6, false, false, true, z7, null, function12, function13, (Function1) rememberedValue16, function1, null, gapComposer, 806879232, ((i4 << 3) & 896) | 54, 8496);
                gapComposer.end(false);
                z4 = true;
            }
            gapComposer.end(z4);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MainPaymentViewKt$$ExternalSyntheticLambda19(content, function1, z, z2, z3, function0, i);
        }
    }

    public static final void PendingAttachmentsRow(List list, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1673543946);
        int i2 = 4;
        int i3 = (gapComposer.changedInstance(list) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier scroll$default = ImageKt.scroll$default(SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), ImageKt.rememberScrollState(gapComposer), true, false);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(scroll$default, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 8.0f, 5);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Top, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-1571414632);
            int i4 = 0;
            for (Object obj : list) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                ChatFooterViewModel$Attachment$ImageAttachment chatFooterViewModel$Attachment$ImageAttachment = (ChatFooterViewModel$Attachment$ImageAttachment) obj;
                boolean changed = ((i3 & 112) == 32) | gapComposer.changed(i4);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new TabContentViewKt$$ExternalSyntheticLambda18(i4, 9, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                AttachmentThumbnail(chatFooterViewModel$Attachment$ImageAttachment, (Function0) rememberedValue, gapComposer, 0);
                i4 = i5;
            }
            gapComposer.end(false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SelectionViewKt$$ExternalSyntheticLambda6(list, function1, i, i2);
        }
    }

    public static final void TrackBottomPositionReachedEffect(LazyListState lazyListState, Function0 function0, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-651756603);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(lazyListState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Unit unit = Unit.INSTANCE;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MusicPresenter$models$2$1(lazyListState, function0, null, 21);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new HypeWelcomeUIKt$$ExternalSyntheticLambda1(lazyListState, function0, i, 15);
        }
    }

    public static final void UpdateBottomPositionOnUserInteractionEffect(LazyListState lazyListState, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-846783514);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(lazyListState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            MutableInteractionSourceImpl mutableInteractionSourceImpl = lazyListState.internalInteractionSource;
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BitcoinHomeViewKt$HandleScrollEvents$1$1(lazyListState, function1, (Continuation) null);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, mutableInteractionSourceImpl, (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MoneybotLoadedContentKt$$ExternalSyntheticLambda40(lazyListState, function1, i, i3);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
    
        if (androidx.compose.runtime.Updater.getMonotonicFrameClock(r1.getContext()).withFrameNanos(r1, r0) == r2) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00e9, code lost:
    
        if (scrollToPosition(r11, r9, r8, r10, r1) == r2) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0096 -> B:18:0x0099). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$scrollToBottom(LazyListState lazyListState, boolean z, ContinuationImpl continuationImpl) {
        MoneybotLoadedContentKt$scrollToBottom$1 moneybotLoadedContentKt$scrollToBottom$1;
        int i;
        int i2;
        boolean z2;
        LazyListState lazyListState2;
        int i3;
        boolean z3;
        int i4;
        int i5;
        Object obj;
        if (continuationImpl instanceof MoneybotLoadedContentKt$scrollToBottom$1) {
            moneybotLoadedContentKt$scrollToBottom$1 = (MoneybotLoadedContentKt$scrollToBottom$1) continuationImpl;
            int i6 = moneybotLoadedContentKt$scrollToBottom$1.label;
            if ((i6 & PKIFailureInfo.systemUnavail) != 0) {
                moneybotLoadedContentKt$scrollToBottom$1.label = i6 - PKIFailureInfo.systemUnavail;
                Object obj2 = moneybotLoadedContentKt$scrollToBottom$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = moneybotLoadedContentKt$scrollToBottom$1.label;
                int i7 = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    i2 = lazyListState.getLayoutInfo().totalItemsCount - 1;
                    if (i2 < 0) {
                        i2 = 0;
                    }
                    moneybotLoadedContentKt$scrollToBottom$1.L$0 = lazyListState;
                    moneybotLoadedContentKt$scrollToBottom$1.Z$0 = z;
                    moneybotLoadedContentKt$scrollToBottom$1.I$0 = i2;
                    moneybotLoadedContentKt$scrollToBottom$1.label = 1;
                    if (lazyListState.scrollToItem(i2, 0, moneybotLoadedContentKt$scrollToBottom$1) != coroutineSingletons) {
                        z2 = z;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = moneybotLoadedContentKt$scrollToBottom$1.I$2;
                    i4 = moneybotLoadedContentKt$scrollToBottom$1.I$1;
                    i3 = moneybotLoadedContentKt$scrollToBottom$1.I$0;
                    z3 = moneybotLoadedContentKt$scrollToBottom$1.Z$0;
                    lazyListState2 = moneybotLoadedContentKt$scrollToBottom$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    i5++;
                    if (i5 < i4) {
                        InsightChartKt$$ExternalSyntheticLambda19 insightChartKt$$ExternalSyntheticLambda19 = new InsightChartKt$$ExternalSyntheticLambda19(8);
                        moneybotLoadedContentKt$scrollToBottom$1.L$0 = lazyListState2;
                        moneybotLoadedContentKt$scrollToBottom$1.Z$0 = z3;
                        moneybotLoadedContentKt$scrollToBottom$1.I$0 = i3;
                        moneybotLoadedContentKt$scrollToBottom$1.I$1 = i4;
                        moneybotLoadedContentKt$scrollToBottom$1.I$2 = i5;
                        moneybotLoadedContentKt$scrollToBottom$1.label = 2;
                    } else {
                        Iterator it = lazyListState2.getLayoutInfo().visibleItemsInfo.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (((LazyListMeasuredItem) obj).index == i3) {
                                break;
                            }
                        }
                        LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) obj;
                        if (lazyListMeasuredItem != null) {
                            int m310getViewportSizeYbymL2g = lazyListMeasuredItem.size - (((int) (lazyListState2.getLayoutInfo().m310getViewportSizeYbymL2g() & BodyPartID.bodyIdMax)) - lazyListState2.getLayoutInfo().afterContentPadding);
                            if (m310getViewportSizeYbymL2g >= 0) {
                                i7 = m310getViewportSizeYbymL2g;
                            }
                        }
                        moneybotLoadedContentKt$scrollToBottom$1.L$0 = null;
                        moneybotLoadedContentKt$scrollToBottom$1.Z$0 = z3;
                        moneybotLoadedContentKt$scrollToBottom$1.I$0 = i3;
                        moneybotLoadedContentKt$scrollToBottom$1.I$1 = i7;
                        moneybotLoadedContentKt$scrollToBottom$1.label = 3;
                    }
                    return coroutineSingletons;
                }
                int i8 = moneybotLoadedContentKt$scrollToBottom$1.I$0;
                z2 = moneybotLoadedContentKt$scrollToBottom$1.Z$0;
                LazyListState lazyListState3 = moneybotLoadedContentKt$scrollToBottom$1.L$0;
                SafeTrace.throwOnFailure(obj2);
                i2 = i8;
                lazyListState = lazyListState3;
                lazyListState2 = lazyListState;
                i3 = i2;
                z3 = z2;
                i4 = 3;
                i5 = 0;
                if (i5 < i4) {
                }
                return coroutineSingletons;
            }
        }
        moneybotLoadedContentKt$scrollToBottom$1 = new MoneybotLoadedContentKt$scrollToBottom$1(continuationImpl);
        Object obj22 = moneybotLoadedContentKt$scrollToBottom$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = moneybotLoadedContentKt$scrollToBottom$1.label;
        int i72 = 0;
        if (i != 0) {
        }
        lazyListState2 = lazyListState;
        i3 = i2;
        z3 = z2;
        i4 = 3;
        i5 = 0;
        if (i5 < i4) {
        }
        return coroutineSingletons2;
    }

    public static final Object access$scrollToTopIfNeeded(LazyListState lazyListState, int i, MoneybotLoadedContentKt$ChatContent$4$1 moneybotLoadedContentKt$ChatContent$4$1) {
        Object scrollToPosition;
        return (!(lazyListState.scrollPosition.index$delegate.getIntValue() == i && lazyListState.scrollPosition.scrollOffset$delegate.getIntValue() == 0) && (scrollToPosition = scrollToPosition(lazyListState, i, 0, false, moneybotLoadedContentKt$ChatContent$4$1)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? scrollToPosition : Unit.INSTANCE;
    }

    public static final AvatarEntry addCash(GapComposer gapComposer) {
        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
        if (colors == null) {
            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
        } else {
            gapComposer.startReplaceGroup(-1762997739);
            gapComposer.end(false);
        }
        return new AvatarEntry(GpsTagConstants.GPS_TAG_GPS_STATUS_VALUE_MEASUREMENT_IN_PROGRESS, colors.semantic.background.brand, null, new AvatarImage.LocalIcon(Icons.CurrencyUsd24, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
    }

    public static final boolean hasActiveResponseAfterLatestUserMessage(MoneybotChatViewModel.Content.Chat chat) {
        List list = chat.messages;
        int latestUserMessageIndex = latestUserMessageIndex(list);
        if (latestUserMessageIndex < 0) {
            return false;
        }
        Object obj = list.get(latestUserMessageIndex);
        obj.getClass();
        if (!((MessageViewModel.UserMessageViewModel) obj).isPending && chat.processingIndicator == null) {
            List<MessageViewModel> drop = CollectionsKt.drop(list, latestUserMessageIndex + 1);
            if ((drop instanceof Collection) && drop.isEmpty()) {
                return false;
            }
            for (MessageViewModel messageViewModel : drop) {
                if (!(messageViewModel instanceof MessageViewModel.MoneybotMessageViewModel) || ((MessageViewModel.MoneybotMessageViewModel) messageViewModel).isFinal) {
                }
            }
            return false;
        }
        return true;
    }

    public static final int latestUserMessageIndex(List list) {
        ListIterator listIterator = list.listIterator(list.size());
        while (listIterator.hasPrevious()) {
            if (((MessageViewModel) listIterator.previous()) instanceof MessageViewModel.UserMessageViewModel) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bd, code lost:
    
        if (androidx.compose.runtime.Updater.getMonotonicFrameClock(r13.getContext()).withFrameNanos(r13, r15) == r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x013a, code lost:
    
        if (r3 > r8) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0150, code lost:
    
        if (r0.animateScrollToItem(r1, r8, r11) == r2) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x015c, code lost:
    
        if (r0.scrollToItem(r1, r8, r11) == r2) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00bd -> B:22:0x00c1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object scrollToPosition(LazyListState lazyListState, int i, int i2, boolean z, ContinuationImpl continuationImpl) {
        MoneybotLoadedContentKt$scrollToPosition$1 moneybotLoadedContentKt$scrollToPosition$1;
        int i3;
        LazyListState lazyListState2;
        int i4;
        boolean z2;
        MoneybotLoadedContentKt$scrollToPosition$1 moneybotLoadedContentKt$scrollToPosition$12;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        MoneybotLoadedContentKt$scrollToPosition$1 moneybotLoadedContentKt$scrollToPosition$13;
        boolean z3;
        int i10;
        Iterator it;
        Object obj;
        LazyListMeasuredItem lazyListMeasuredItem;
        int i11;
        if (continuationImpl instanceof MoneybotLoadedContentKt$scrollToPosition$1) {
            moneybotLoadedContentKt$scrollToPosition$1 = (MoneybotLoadedContentKt$scrollToPosition$1) continuationImpl;
            int i12 = moneybotLoadedContentKt$scrollToPosition$1.label;
            if ((i12 & PKIFailureInfo.systemUnavail) != 0) {
                moneybotLoadedContentKt$scrollToPosition$1.label = i12 - PKIFailureInfo.systemUnavail;
                Object obj2 = moneybotLoadedContentKt$scrollToPosition$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = moneybotLoadedContentKt$scrollToPosition$1.label;
                int i13 = 0;
                if (i3 != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    lazyListState2 = lazyListState;
                    i4 = i2;
                    z2 = z;
                    moneybotLoadedContentKt$scrollToPosition$12 = moneybotLoadedContentKt$scrollToPosition$1;
                    i5 = 0;
                    i6 = i;
                    if (i5 < 5) {
                    }
                    it = lazyListState2.getLayoutInfo().visibleItemsInfo.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                        }
                    }
                    lazyListMeasuredItem = (LazyListMeasuredItem) obj;
                    if (lazyListMeasuredItem != null) {
                    }
                    i11 = i4;
                    moneybotLoadedContentKt$scrollToPosition$12.L$0 = null;
                    moneybotLoadedContentKt$scrollToPosition$12.I$0 = i6;
                    moneybotLoadedContentKt$scrollToPosition$12.I$1 = i4;
                    moneybotLoadedContentKt$scrollToPosition$12.Z$0 = z2;
                    moneybotLoadedContentKt$scrollToPosition$12.I$2 = i11;
                    if (z2) {
                    }
                    return coroutineSingletons;
                }
                if (i3 == 1) {
                    int i14 = moneybotLoadedContentKt$scrollToPosition$1.I$2;
                    boolean z4 = moneybotLoadedContentKt$scrollToPosition$1.Z$0;
                    i7 = moneybotLoadedContentKt$scrollToPosition$1.I$1;
                    int i15 = moneybotLoadedContentKt$scrollToPosition$1.I$0;
                    LazyListState lazyListState3 = moneybotLoadedContentKt$scrollToPosition$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    i8 = i14;
                    i9 = 0;
                    lazyListState2 = lazyListState3;
                    moneybotLoadedContentKt$scrollToPosition$13 = moneybotLoadedContentKt$scrollToPosition$1;
                    i6 = i15;
                    z3 = z4;
                    i10 = 3;
                    if (i9 < i10) {
                    }
                } else {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            SafeTrace.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        if (i3 == 4) {
                            SafeTrace.throwOnFailure(obj2);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i9 = moneybotLoadedContentKt$scrollToPosition$1.I$4;
                    i10 = moneybotLoadedContentKt$scrollToPosition$1.I$3;
                    int i16 = moneybotLoadedContentKt$scrollToPosition$1.I$2;
                    z3 = moneybotLoadedContentKt$scrollToPosition$1.Z$0;
                    int i17 = moneybotLoadedContentKt$scrollToPosition$1.I$1;
                    int i18 = moneybotLoadedContentKt$scrollToPosition$1.I$0;
                    LazyListState lazyListState4 = moneybotLoadedContentKt$scrollToPosition$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                    moneybotLoadedContentKt$scrollToPosition$13 = moneybotLoadedContentKt$scrollToPosition$1;
                    i6 = i18;
                    i8 = i16;
                    i7 = i17;
                    lazyListState2 = lazyListState4;
                    i9++;
                    if (i9 < i10) {
                        if (lazyListState2.scrollPosition.index$delegate.getIntValue() != i6 || lazyListState2.scrollPosition.scrollOffset$delegate.getIntValue() != i7) {
                            List list = lazyListState2.getLayoutInfo().visibleItemsInfo;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator it2 = list.iterator();
                                while (it2.hasNext()) {
                                    if (((LazyListMeasuredItem) it2.next()).index == i6) {
                                        break;
                                    }
                                }
                            }
                            z2 = z3;
                            i13 = 0;
                            i5 = i8 + 1;
                            i4 = i7;
                            moneybotLoadedContentKt$scrollToPosition$12 = moneybotLoadedContentKt$scrollToPosition$13;
                            if (i5 < 5) {
                                moneybotLoadedContentKt$scrollToPosition$12.L$0 = lazyListState2;
                                moneybotLoadedContentKt$scrollToPosition$12.I$0 = i6;
                                moneybotLoadedContentKt$scrollToPosition$12.I$1 = i4;
                                moneybotLoadedContentKt$scrollToPosition$12.Z$0 = z2;
                                moneybotLoadedContentKt$scrollToPosition$12.I$2 = i5;
                                moneybotLoadedContentKt$scrollToPosition$12.label = 1;
                                if (lazyListState2.scrollToItem(i6, i13, moneybotLoadedContentKt$scrollToPosition$12) != coroutineSingletons) {
                                    int i19 = i5;
                                    int i20 = i6;
                                    MoneybotLoadedContentKt$scrollToPosition$1 moneybotLoadedContentKt$scrollToPosition$14 = moneybotLoadedContentKt$scrollToPosition$12;
                                    i7 = i4;
                                    i8 = i19;
                                    i9 = i13;
                                    lazyListState2 = lazyListState2;
                                    moneybotLoadedContentKt$scrollToPosition$13 = moneybotLoadedContentKt$scrollToPosition$14;
                                    i6 = i20;
                                    z3 = z2;
                                    i10 = 3;
                                    if (i9 < i10) {
                                        InsightChartKt$$ExternalSyntheticLambda19 insightChartKt$$ExternalSyntheticLambda19 = new InsightChartKt$$ExternalSyntheticLambda19(9);
                                        moneybotLoadedContentKt$scrollToPosition$13.L$0 = lazyListState2;
                                        moneybotLoadedContentKt$scrollToPosition$13.I$0 = i6;
                                        moneybotLoadedContentKt$scrollToPosition$13.I$1 = i7;
                                        moneybotLoadedContentKt$scrollToPosition$13.Z$0 = z3;
                                        moneybotLoadedContentKt$scrollToPosition$13.I$2 = i8;
                                        moneybotLoadedContentKt$scrollToPosition$13.I$3 = i10;
                                        moneybotLoadedContentKt$scrollToPosition$13.I$4 = i9;
                                        moneybotLoadedContentKt$scrollToPosition$13.label = 2;
                                    }
                                }
                                return coroutineSingletons;
                            }
                            it = lazyListState2.getLayoutInfo().visibleItemsInfo.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    obj = null;
                                    break;
                                }
                                obj = it.next();
                                if (((LazyListMeasuredItem) obj).index == i6) {
                                    break;
                                }
                            }
                            lazyListMeasuredItem = (LazyListMeasuredItem) obj;
                            if (lazyListMeasuredItem != null) {
                                int i21 = lazyListMeasuredItem.size - 1;
                                i11 = i21 < 0 ? 0 : i21;
                            }
                            i11 = i4;
                            moneybotLoadedContentKt$scrollToPosition$12.L$0 = null;
                            moneybotLoadedContentKt$scrollToPosition$12.I$0 = i6;
                            moneybotLoadedContentKt$scrollToPosition$12.I$1 = i4;
                            moneybotLoadedContentKt$scrollToPosition$12.Z$0 = z2;
                            moneybotLoadedContentKt$scrollToPosition$12.I$2 = i11;
                            if (z2) {
                                moneybotLoadedContentKt$scrollToPosition$12.label = 3;
                            } else {
                                moneybotLoadedContentKt$scrollToPosition$12.label = 4;
                            }
                            return coroutineSingletons;
                        }
                        i4 = i7;
                        z2 = z3;
                        moneybotLoadedContentKt$scrollToPosition$12 = moneybotLoadedContentKt$scrollToPosition$13;
                        it = lazyListState2.getLayoutInfo().visibleItemsInfo.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                            }
                        }
                        lazyListMeasuredItem = (LazyListMeasuredItem) obj;
                        if (lazyListMeasuredItem != null) {
                        }
                        i11 = i4;
                        moneybotLoadedContentKt$scrollToPosition$12.L$0 = null;
                        moneybotLoadedContentKt$scrollToPosition$12.I$0 = i6;
                        moneybotLoadedContentKt$scrollToPosition$12.I$1 = i4;
                        moneybotLoadedContentKt$scrollToPosition$12.Z$0 = z2;
                        moneybotLoadedContentKt$scrollToPosition$12.I$2 = i11;
                        if (z2) {
                        }
                        return coroutineSingletons;
                    }
                }
            }
        }
        moneybotLoadedContentKt$scrollToPosition$1 = new MoneybotLoadedContentKt$scrollToPosition$1(continuationImpl);
        Object obj22 = moneybotLoadedContentKt$scrollToPosition$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = moneybotLoadedContentKt$scrollToPosition$1.label;
        int i132 = 0;
        if (i3 != 0) {
        }
    }

    public static void setMaxElevation(Recorder.AnonymousClass1 anonymousClass1, float f) {
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) anonymousClass1.val$videoEncoderSession;
        CardView cardView = (CardView) anonymousClass1.this$0;
        boolean z = cardView.mCompatPadding;
        boolean z2 = cardView.mPreventCornerOverlap;
        if (f != roundRectDrawable.mPadding || roundRectDrawable.mInsetForPadding != z || roundRectDrawable.mInsetForRadius != z2) {
            roundRectDrawable.mPadding = f;
            roundRectDrawable.mInsetForPadding = z;
            roundRectDrawable.mInsetForRadius = z2;
            roundRectDrawable.updateBounds(null);
            roundRectDrawable.invalidateSelf();
        }
        updatePadding(anonymousClass1);
    }

    public static void updatePadding(Recorder.AnonymousClass1 anonymousClass1) {
        float f;
        float f2;
        CardView cardView = (CardView) anonymousClass1.this$0;
        if (!cardView.mCompatPadding) {
            anonymousClass1.setShadowPadding(0, 0, 0, 0);
            return;
        }
        RoundRectDrawable roundRectDrawable = (RoundRectDrawable) anonymousClass1.val$videoEncoderSession;
        float f3 = roundRectDrawable.mPadding;
        float f4 = roundRectDrawable.mRadius;
        if (cardView.mPreventCornerOverlap) {
            f = (float) (((1.0d - RoundRectDrawableWithShadow.COS_45) * f4) + f3);
        } else {
            int i = RoundRectDrawableWithShadow.$r8$clinit;
            f = f3;
        }
        int ceil = (int) Math.ceil(f);
        if (((CardView) anonymousClass1.this$0).mPreventCornerOverlap) {
            f2 = (float) (((1.0d - RoundRectDrawableWithShadow.COS_45) * f4) + (f3 * 1.5f));
        } else {
            f2 = f3 * 1.5f;
        }
        int ceil2 = (int) Math.ceil(f2);
        anonymousClass1.setShadowPadding(ceil, ceil2, ceil, ceil2);
    }
}
