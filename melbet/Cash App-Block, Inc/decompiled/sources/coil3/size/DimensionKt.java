package coil3.size;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.view.PreviewView$1$$ExternalSyntheticLambda2;
import androidx.collection.ArraySet;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.MathUtilsKt;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.input.internal.selection.TextFieldMagnifierKt$WhenMappings;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SimpleLayoutKt;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda0;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.core.content.res.ColorStateListInflaterCompat;
import androidx.core.provider.FontRequest;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.PreferencesKt$edit$2;
import androidx.emoji2.text.ConcurrencyHelpers$$ExternalSyntheticLambda0;
import androidx.emoji2.text.EmojiCompat;
import androidx.emoji2.text.FontRequestEmojiCompatConfig;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda0;
import androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda7;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.Room;
import androidx.room.TransactionExecutor;
import androidx.room.util.DBUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.work.ListenableFutureKt$$ExternalSyntheticLambda0;
import app.cash.local.backend.MarkMarketingMessageAsViewed$MetroFactory;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.MarketingMessageData;
import app.cash.local.primitives.MarketingMessageOfferDetails;
import app.cash.molecule.MoleculeKt$$ExternalSyntheticLambda1;
import app.cash.molecule.MoleculeKt$$ExternalSyntheticLambda2;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.size.DimensionKt;
import com.bugsnag.android.Event;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahv;
import com.google.android.gms.internal.mlkit_vision_barcode.zztw;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ScaffoldState;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.input.InputFieldKt$$ExternalSyntheticLambda11;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.treehouse.ColorBindingsKt;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.cdf.session.SessionAttributeChange;
import com.squareup.cash.cdf.session.SessionTokenStatus;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackOrientation;
import com.squareup.cash.data.profile.documents.RealLegalDocumentManager$MetroFactory;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.fillr.real.FillrInitializer;
import com.squareup.cash.history.navigation.PaymentActionHandler;
import com.squareup.cash.keystore.AttestedKeyMetrics$MetroFactory;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.knot.backend.real.RealKnotLauncher;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.merchant.backend.real.RealMerchantProfileRepo$MetroFactory;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.mooncake.theming.ThemablesKt;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.session.backend.AuthenticatedState;
import com.squareup.cash.session.backend.NotInitiatedState;
import com.squareup.cash.session.backend.OnboardedAccountStatus;
import com.squareup.cash.session.backend.RealSessionManagerKt$sessionPref$$inlined$MoshiKeyValue$default$3;
import com.squareup.cash.session.backend.Session;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.session.backend.SwitchingState;
import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.storage.StorageLinkSerdeKt$StorageLinkKeyValue$$inlined$MoshiKeyValue$default$1;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.SharedPreferencesKeyValue;
import com.squareup.protos.cash.local.client.app.v1.MarketingMessage;
import com.squareup.protos.cash.local.client.app.v1.MarketingMessageBadge;
import com.squareup.protos.cash.local.client.app.v1.MarketingMessageContent;
import com.squareup.protos.cash.local.client.app.v1.MarketingMessageSubjectType;
import com.squareup.protos.cash.local.client.app.v1.MarketingMessageType;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.franklin.common.SessionStatus;
import com.squareup.util.android.CashBackupAgent;
import com.squareup.util.emojis.EmojiSupport$initialize$config$1;
import com.withpersona.sdk2.camera.CameraPropertiesKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.File;
import java.io.IOException;
import java.time.DateTimeException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TimeZone;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.CoroutineStart;
import net.idrnd.face.iad.capture.internal.f$$ExternalSyntheticLambda0;
import nl.dionsegijn.konfetti.KonfettiView;
import okhttp3.Cache;
import okhttp3.internal.http.StatusLine;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.apache.commons.imaging.formats.tiff.constants.TiffTagConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.xmlpull.v1.XmlPullParser;
import timber.log.Timber;

/* loaded from: classes.dex */
public abstract class DimensionKt {
    public static Context zza;
    public static Boolean zzb;

    public static final void BaseButtonCtaGroup(Modifier modifier, boolean z, Function3 function3, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1864245497);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= gapComposer.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(androidx.compose.foundation.layout.SizeKt.fillMaxWidth(modifier, 1.0f));
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
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
            if (((ScaffoldState) gapComposer.consume(ScreenScaffoldKt.LocalScaffoldState)) != null ? false : z2) {
                gapComposer.startReplaceGroup(-453948834);
                ModalKt.HorizontalDivider(0, 1, gapComposer, null);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-453917121);
                gapComposer.end(false);
            }
            float f = ((Dp) gapComposer.consume(ArcadeThemeKt.LocalScreenMargin)).value;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion, f, 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int i3 = i2;
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            if (function3 != null) {
                gapComposer.startReplaceGroup(-181089587);
                ProvidedValue defaultProvidedValue$runtime = ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTextColor;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Updater.CompositionLocalProvider(new ProvidedValue[]{defaultProvidedValue$runtime, re$$ExternalSyntheticOutline0.m(colors.semantic.text.subtle, staticProvidableCompositionLocal), ArcadeThemeKt.LocalTextAlign.defaultProvidedValue$runtime(new TextAlign(3))}, Expect_jvmKt.rememberComposableLambda(819833170, new InputFieldKt$$ExternalSyntheticLambda11(function3, 1), gapComposer), gapComposer, 56);
                re$$ExternalSyntheticOutline0.m(companion, 32.0f, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-180774379);
                gapComposer.end(false);
            }
            composableLambdaImpl.invoke(gapComposer, Integer.valueOf((i3 >> 9) & 14));
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ButtonCtaGroupKt$$ExternalSyntheticLambda4(modifier, z, function3, composableLambdaImpl, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ButtonCtaGroup(Modifier modifier, boolean z, ButtonCtaGroupOrientation buttonCtaGroupOrientation, Function3 function3, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        int i4;
        int i5;
        Function3 function32;
        ButtonCtaGroupOrientation buttonCtaGroupOrientation2;
        Modifier modifier3;
        Function3 function33;
        boolean z2;
        RecomposeScopeImpl endRestartGroup;
        AdaptiveStackOrientation adaptiveStackOrientation;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1197755940);
        int i6 = i2 & 1;
        int i7 = 2;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= gapComposer.changed(z) ? 32 : 16;
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= MLKEMEngine.KyberPolyBytes;
            } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer.changed(buttonCtaGroupOrientation == null ? -1 : buttonCtaGroupOrientation.ordinal()) ? 256 : 128;
            }
            i5 = i2 & 8;
            if (i5 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                function32 = function3;
                i3 |= gapComposer.changedInstance(function32) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= gapComposer.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
                }
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                    Modifier modifier4 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    boolean z3 = i8 != 0 ? false : z;
                    ButtonCtaGroupOrientation buttonCtaGroupOrientation3 = i4 != 0 ? ButtonCtaGroupOrientation.VERTICAL : buttonCtaGroupOrientation;
                    Function3 function34 = i5 != 0 ? null : function32;
                    int ordinal = buttonCtaGroupOrientation3.ordinal();
                    if (ordinal == 0) {
                        adaptiveStackOrientation = AdaptiveStackOrientation.Auto;
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return;
                        }
                        adaptiveStackOrientation = AdaptiveStackOrientation.ForcedVertical;
                    }
                    BaseButtonCtaGroup(modifier4, z3, function34, Expect_jvmKt.rememberComposableLambda(1648680450, new MoleculeKt$$ExternalSyntheticLambda2(i7, adaptiveStackOrientation, composableLambdaImpl), gapComposer), gapComposer, (i3 & 14) | 3072 | (i3 & 112) | ((i3 >> 3) & 896));
                    buttonCtaGroupOrientation2 = buttonCtaGroupOrientation3;
                    modifier3 = modifier4;
                    z2 = z3;
                    function33 = function34;
                } else {
                    gapComposer.skipToGroupEnd();
                    buttonCtaGroupOrientation2 = buttonCtaGroupOrientation;
                    modifier3 = modifier2;
                    function33 = function32;
                    z2 = z;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda0(modifier3, z2, buttonCtaGroupOrientation2, function33, composableLambdaImpl, i, i2);
                    return;
                }
                return;
            }
            function32 = function3;
            if ((i & 24576) == 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        function32 = function3;
        if ((i & 24576) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void Dimension(int i) {
        if (i > 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("px must be > 0.");
    }

    public static final void LifecycleResumeEffect(Object obj, LifecycleOwner lifecycleOwner, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1220373486);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 16;
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                lifecycleOwner = (LifecycleOwner) gapComposer.consume(LocalLifecycleOwnerKt.LocalLifecycleOwner);
            } else {
                gapComposer.skipToGroupEnd();
            }
            int i4 = i3 & (-113);
            gapComposer.endDefaults();
            boolean changed = gapComposer.changed(obj) | gapComposer.changed(lifecycleOwner);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new LifecycleResumePauseEffectScope(lifecycleOwner.getLifecycle());
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LifecycleResumeEffectImpl(lifecycleOwner, (LifecycleResumePauseEffectScope) rememberedValue, function1, gapComposer, i4 & 896);
        } else {
            gapComposer.skipToGroupEnd();
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleEffectKt$$ExternalSyntheticLambda0(obj, lifecycleOwner2, function1, i, 0);
        }
    }

    public static final void LifecycleResumeEffectImpl(LifecycleOwner lifecycleOwner, LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(912823238);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(lifecycleOwner) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(lifecycleResumePauseEffectScope) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean changedInstance = gapComposer.changedInstance(lifecycleResumePauseEffectScope) | ((i2 & 896) == 256) | gapComposer.changedInstance(lifecycleOwner);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MenuKt$$ExternalSyntheticLambda0(22, lifecycleOwner, lifecycleResumePauseEffectScope, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(lifecycleOwner, lifecycleResumePauseEffectScope, (Function1) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8((Object) lifecycleOwner, (Object) lifecycleResumePauseEffectScope, function1, i, 11);
        }
    }

    public static final void LifecycleStartEffect(final Boolean bool, final Object obj, LifecycleOwner lifecycleOwner, final Function1 function1, Composer composer, final int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(696924721);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(bool) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(obj) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            gapComposer.startDefaults();
            if ((i & 1) == 0 || gapComposer.getDefaultsInvalid()) {
                lifecycleOwner = (LifecycleOwner) gapComposer.consume(LocalLifecycleOwnerKt.LocalLifecycleOwner);
            } else {
                gapComposer.skipToGroupEnd();
            }
            int i3 = i2 & (-897);
            gapComposer.endDefaults();
            boolean changed = gapComposer.changed(bool) | gapComposer.changed(obj) | gapComposer.changed(lifecycleOwner);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new LifecycleStartStopEffectScope(lifecycleOwner.getLifecycle());
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LifecycleStartEffectImpl(lifecycleOwner, (LifecycleStartStopEffectScope) rememberedValue, function1, gapComposer, (i3 >> 3) & 896);
        } else {
            gapComposer.skipToGroupEnd();
        }
        final LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    DimensionKt.LifecycleStartEffect(bool, obj, lifecycleOwner2, function1, (Composer) obj2, Updater.updateChangedFlags(i | 1));
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void LifecycleStartEffectImpl(LifecycleOwner lifecycleOwner, LifecycleStartStopEffectScope lifecycleStartStopEffectScope, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(228371534);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(lifecycleOwner) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(lifecycleStartStopEffectScope) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean changedInstance = gapComposer.changedInstance(lifecycleStartStopEffectScope) | ((i2 & 896) == 256) | gapComposer.changedInstance(lifecycleOwner);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MoleculeKt$$ExternalSyntheticLambda1(i3, lifecycleOwner, lifecycleStartStopEffectScope, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.DisposableEffect(lifecycleOwner, lifecycleStartStopEffectScope, (Function1) rememberedValue, gapComposer);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleEffectKt$$ExternalSyntheticLambda7(lifecycleOwner, lifecycleStartStopEffectScope, function1, i, 0);
        }
    }

    public static final long Size(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void access$addMetadata(Event event, Map map) {
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                    event.addMetadata(str, (String) entry2.getKey(), entry2.getValue());
                }
            }
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-hUlJWOE, reason: not valid java name */
    public static final long m1463calculateSelectionMagnifierCenterAndroidhUlJWOE(TransformedTextFieldState transformedTextFieldState, TextFieldSelectionState textFieldSelectionState, TextLayoutState textLayoutState, long j) {
        long j2;
        long m419getHandleDragPositionF1C5BW0 = textFieldSelectionState.m419getHandleDragPositionF1C5BW0();
        if ((9223372034707292159L & m419getHandleDragPositionF1C5BW0) != 9205357640488583168L && transformedTextFieldState.getVisualText().text.length() != 0) {
            long j3 = transformedTextFieldState.getVisualText().selection;
            Handle draggingHandle = textFieldSelectionState.getDraggingHandle();
            int i = draggingHandle == null ? -1 : TextFieldMagnifierKt$WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
            if (i != -1) {
                if (i == 1 || i == 2) {
                    int i2 = TextRange.$r8$clinit;
                    j2 = j3 >> 32;
                } else {
                    if (i != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return 0L;
                    }
                    int i3 = TextRange.$r8$clinit;
                    j2 = j3 & BodyPartID.bodyIdMax;
                }
                int i4 = (int) j2;
                TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
                if (layoutResult != null) {
                    MultiParagraph multiParagraph = layoutResult.multiParagraph;
                    float intBitsToFloat = Float.intBitsToFloat((int) (m419getHandleDragPositionF1C5BW0 >> 32));
                    int lineForOffset = multiParagraph.getLineForOffset(i4);
                    float lineLeft = layoutResult.getLineLeft(lineForOffset);
                    float lineRight = layoutResult.getLineRight(lineForOffset);
                    float coerceIn = RangesKt___RangesKt.coerceIn(intBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
                    if (IntSize.m1055equalsimpl0(j, 0L) || Math.abs(intBitsToFloat - coerceIn) <= ((int) (j >> 32)) / 2) {
                        float lineTop = multiParagraph.getLineTop(lineForOffset);
                        long floatToRawIntBits = (Float.floatToRawIntBits(((multiParagraph.getLineBottom(lineForOffset) - lineTop) / 2.0f) + lineTop) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(coerceIn) << 32);
                        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
                        if (textLayoutNodeCoordinates != null) {
                            if (!textLayoutNodeCoordinates.isAttached()) {
                                textLayoutNodeCoordinates = null;
                            }
                            if (textLayoutNodeCoordinates != null) {
                                floatToRawIntBits = MathUtilsKt.m394coerceIn3MmeM6k(floatToRawIntBits, SimpleLayoutKt.visibleBounds(textLayoutNodeCoordinates));
                            }
                        }
                        return MathUtilsKt.m398fromTextLayoutToCoreUv8p0NA(textLayoutState, floatToRawIntBits);
                    }
                }
            }
        }
        return 9205357640488583168L;
    }

    public static void checkNonnegative(int i, String str) {
        if (i >= 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3(Boxes$$ExternalSyntheticOutline1.m(i, str, " cannot be negative but was: "));
    }

    public static MarketingMessageData create(MarketingMessage marketingMessage, boolean z) {
        String str;
        String str2;
        LocalColor localColor;
        LocalColor localColor2;
        String str3;
        String str4;
        marketingMessage.getClass();
        List list = MarketingMessageData.SUPPORTED_TYPES;
        MarketingMessageType marketingMessageType = marketingMessage.f1303type;
        MarketingMessageContent marketingMessageContent = marketingMessage.content;
        if (CollectionsKt.contains(list, marketingMessageType)) {
            String str5 = (marketingMessageContent == null || (str4 = marketingMessageContent.subtitle) == null || StringsKt.isBlank(str4)) ? null : str4;
            LocalImage localImage = marketingMessageContent != null ? marketingMessageContent.image : null;
            Long l = marketingMessage.starts_at_ms;
            if (l != null) {
                long longValue = l.longValue();
                String str6 = marketingMessage.story_token;
                if (str6 != null && (str = marketingMessage.subject_token) != null) {
                    if (marketingMessage.subject_type != MarketingMessageSubjectType.MARKETING_MESSAGE_SUBJECT_TYPE_BRAND) {
                        str = null;
                    }
                    if (str != null && (str2 = marketingMessage.cashtag) != null && (localColor = marketingMessage.background_color) != null && (localColor2 = marketingMessage.foreground_color) != null) {
                        LocalImage localImage2 = marketingMessage.logo;
                        MarketingMessageBadge marketingMessageBadge = marketingMessage.badge;
                        MarketingMessageData.Badge badge = z ? (marketingMessageBadge == null || (str3 = marketingMessageBadge.text) == null) ? null : new MarketingMessageData.Badge(!Intrinsics.areEqual(marketingMessageBadge.viewed, Boolean.FALSE), str3) : null;
                        MarketingMessageOfferDetails create = zztw.create(marketingMessageContent != null ? marketingMessageContent.offer : null);
                        try {
                            Instant ofEpochMilli = Instant.ofEpochMilli(longValue);
                            ofEpochMilli.getClass();
                            return new MarketingMessageData(str6, str5, localImage, str2, ofEpochMilli, localColor, localColor2, new BrandSpot(str, null), localImage2, create, badge);
                        } catch (DateTimeException unused) {
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final Object edit(DataStore dataStore, Function2 function2, SuspendLambda suspendLambda) {
        return dataStore.updateData(new PreferencesKt$edit$2(function2, null, 0), suspendLambda);
    }

    public static final long elapsedRealtimeDuration(AndroidClock androidClock) {
        androidClock.getClass();
        Duration.Companion companion = Duration.Companion;
        return DurationKt.toDuration(androidClock.elapsedRealtime(), DurationUnit.MILLISECONDS);
    }

    public static final CallbackToFutureAdapter$SafeFuture executeAsync(TransactionExecutor transactionExecutor, String str, Function0 function0) {
        transactionExecutor.getClass();
        return DBUtil.getFuture(new PreviewView$1$$ExternalSyntheticLambda2(6, transactionExecutor, str, function0));
    }

    /* renamed from: fitPrioritizingHeight-Zbe2FdA, reason: not valid java name */
    public static long m1464fitPrioritizingHeightZbe2FdA(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int min = Math.min(i3, 262142);
        int min2 = i4 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i4, 262142);
        int i6 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = JpegConstants.COM_MARKER;
            } else if (i6 < 65535) {
                i5 = TiffTagConstants.COMPRESSION_VALUE_NEXT;
            } else {
                if (i6 >= 262143) {
                    ConstraintsKt.throwInvalidConstraintsSizeException(i6);
                    OptionalProvider$$ExternalSyntheticLambda0.m$1();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return ConstraintsKt.Constraints(Math.min(i5, i), i2 != Integer.MAX_VALUE ? Math.min(i5, i2) : Integer.MAX_VALUE, min, min2);
    }

    /* renamed from: fitPrioritizingWidth-Zbe2FdA, reason: not valid java name */
    public static long m1465fitPrioritizingWidthZbe2FdA(int i, int i2, int i3, int i4) {
        int i5 = 262142;
        int min = Math.min(i, 262142);
        int min2 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i2, 262142);
        int i6 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i6 >= 8191) {
            if (i6 < 32767) {
                i5 = JpegConstants.COM_MARKER;
            } else if (i6 < 65535) {
                i5 = TiffTagConstants.COMPRESSION_VALUE_NEXT;
            } else {
                if (i6 >= 262143) {
                    ConstraintsKt.throwInvalidConstraintsSizeException(i6);
                    OptionalProvider$$ExternalSyntheticLambda0.m$1();
                    return 0L;
                }
                i5 = 8190;
            }
        }
        return ConstraintsKt.Constraints(min, min2, Math.min(i5, i3), i4 != Integer.MAX_VALUE ? Math.min(i5, i4) : Integer.MAX_VALUE);
    }

    public static final Integer forTheme(ColorModel colorModel, ThemeInfo themeInfo) {
        colorModel.getClass();
        themeInfo.getClass();
        Colors colors = themeInfo.arcadeColors;
        ColorPalette colorPalette = themeInfo.colorPalette;
        if (colorModel instanceof ColorModel.Accented) {
            return ThemablesKt.forTheme(((ColorModel.Accented) colorModel).getColor(), themeInfo);
        }
        if (colorModel.equals(ColorModel.CashGreen.INSTANCE)) {
            return Integer.valueOf(colorPalette.green);
        }
        if (colorModel.equals(ColorModel.Bitcoin.INSTANCE)) {
            colorPalette.getClass();
            return -16722689;
        }
        if (colorModel.equals(ColorModel.Investing.INSTANCE)) {
            return Integer.valueOf(colorPalette.investing);
        }
        if (colorModel.equals(ColorModel.PrimaryButtonBackground.INSTANCE)) {
            return Integer.valueOf(colorPalette.primaryButtonBackground);
        }
        if (colorModel.equals(ColorModel.GiftCard.INSTANCE)) {
            return Integer.valueOf(colorPalette.green);
        }
        if (colorModel.equals(ColorModel.Error.INSTANCE)) {
            return Integer.valueOf(colorPalette.error);
        }
        if (colorModel.equals(ColorModel.Background.INSTANCE)) {
            return Integer.valueOf(colorPalette.background);
        }
        if (colorModel.equals(ColorModel.SecondaryLabel.INSTANCE)) {
            return Integer.valueOf(colorPalette.secondaryLabel);
        }
        if (colorModel.equals(ColorModel.Icon.INSTANCE)) {
            return Integer.valueOf(colorPalette.icon);
        }
        if (colorModel.equals(ColorModel.SecondaryButtonBackground.INSTANCE)) {
            return Integer.valueOf(colorPalette.secondaryButtonBackground);
        }
        if (colorModel.equals(ColorModel.Warning.INSTANCE)) {
            return Integer.valueOf(colorPalette.warning);
        }
        if (colorModel instanceof ColorModel.Arcade) {
            return Integer.valueOf(ColorKt.m694toArgb8_81llA(ColorBindingsKt.getColorById(colors, ((ColorModel.Arcade) colorModel).getToken())));
        }
        if (colorModel.equals(ColorModel.BaseWhite.INSTANCE)) {
            return Integer.valueOf(ColorKt.m694toArgb8_81llA(colors.base.constantWhite));
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* renamed from: getCenter-uvyYCjk, reason: not valid java name */
    public static final long m1466getCenteruvyYCjk(long j) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) / 2.0f;
        return (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    public static Drawable getDrawable(Context context, int i) {
        return ResourceManagerInternal.get().getDrawable(context, i);
    }

    public static ColorStateList getNamedColorStateList(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
        if (hasAttribute(xmlPullParser, "tint")) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(1, typedValue);
            int i = typedValue.type;
            if (i != 2) {
                return (i < 28 || i > 31) ? ColorStateListInflaterCompat.inflate(typedArray.getResources(), typedArray.getResourceId(1, 0), theme) : ColorStateList.valueOf(typedValue.data);
            }
            f$$ExternalSyntheticLambda0.m((Object) typedValue, "Failed to resolve attribute at index 1: ");
        }
        return null;
    }

    public static StatusLine getNamedComplexColor(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        StatusLine statusLine;
        if (hasAttribute(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new StatusLine((Shader) null, (ColorStateList) null, typedValue.data);
            }
            try {
                statusLine = StatusLine.createFromXml(typedArray.getResources(), typedArray.getResourceId(i, 0), theme);
            } catch (Exception e) {
                Log.e("ComplexColorCompat", "Failed to inflate ComplexColor.", e);
                statusLine = null;
            }
            if (statusLine != null) {
                return statusLine;
            }
        }
        return new StatusLine((Shader) null, (ColorStateList) null, 0);
    }

    public static int getNamedInt(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i, int i2) {
        return !hasAttribute(xmlPullParser, str) ? i2 : typedArray.getInt(i, i2);
    }

    public static final int getSafeDayOfMonth(LocalDate localDate) {
        localDate.getClass();
        ZoneId systemDefault = ZoneId.systemDefault();
        Instant instant = localDate.atStartOfDay(systemDefault).toInstant();
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(systemDefault));
        calendar.setTime(Date.from(instant));
        return calendar.get(5);
    }

    public static final int getTotalChangedRows(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT changes()");
        try {
            prepare.step();
            int i = (int) prepare.getLong(0);
            Cache.Companion.closeFinally(prepare, null);
            return i;
        } finally {
        }
    }

    public static boolean hasAttribute(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static final int indexSegment(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final void initialize(Context context) {
        context.getClass();
        FontRequestEmojiCompatConfig fontRequestEmojiCompatConfig = new FontRequestEmojiCompatConfig(context, new FontRequest());
        KonfettiView.TimerIntegration timerIntegration = new KonfettiView.TimerIntegration();
        FontRequestEmojiCompatConfig.FontRequestMetadataLoader fontRequestMetadataLoader = (FontRequestEmojiCompatConfig.FontRequestMetadataLoader) fontRequestEmojiCompatConfig.mMetadataLoader;
        synchronized (fontRequestMetadataLoader.mLock) {
            fontRequestMetadataLoader.mRetryPolicy = timerIntegration;
        }
        fontRequestEmojiCompatConfig.mReplaceAll = true;
        EmojiSupport$initialize$config$1 emojiSupport$initialize$config$1 = new EmojiSupport$initialize$config$1();
        Handler createAsync = Handler.createAsync(Looper.getMainLooper());
        Objects.requireNonNull(createAsync);
        ConcurrencyHelpers$$ExternalSyntheticLambda0 concurrencyHelpers$$ExternalSyntheticLambda0 = new ConcurrencyHelpers$$ExternalSyntheticLambda0(createAsync, 0);
        if (fontRequestEmojiCompatConfig.mInitCallbacks == null) {
            fontRequestEmojiCompatConfig.mInitCallbacks = new ArraySet(0);
        }
        fontRequestEmojiCompatConfig.mInitCallbacks.add(new EmojiCompat.InitWithExecutor(concurrencyHelpers$$ExternalSyntheticLambda0, emojiSupport$initialize$config$1));
        EmojiCompat.init(fontRequestEmojiCompatConfig);
    }

    public static synchronized boolean isInstantApp(Context context) {
        Boolean bool;
        synchronized (DimensionKt.class) {
            Context applicationContext = context.getApplicationContext();
            Context context2 = zza;
            if (context2 != null && (bool = zzb) != null && context2 == applicationContext) {
                return bool.booleanValue();
            }
            zzb = null;
            Boolean valueOf = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
            zzb = valueOf;
            zza = applicationContext;
            return valueOf.booleanValue();
        }
    }

    public static final boolean isStableSignIn(SessionState sessionState, SessionState sessionState2) {
        sessionState.getClass();
        sessionState2.getClass();
        SessionState.Authenticated authenticated = sessionState instanceof SessionState.Authenticated ? (SessionState.Authenticated) sessionState : null;
        SessionState.Authenticated authenticated2 = sessionState2 instanceof SessionState.Authenticated ? (SessionState.Authenticated) sessionState2 : null;
        if (authenticated != null && authenticated2 != null) {
            AuthenticatedState authenticatedState = (AuthenticatedState) authenticated;
            AuthenticatedState authenticatedState2 = (AuthenticatedState) authenticated2;
            if (Intrinsics.areEqual(authenticatedState.getAppToken(), authenticatedState2.getAppToken()) && Intrinsics.areEqual(authenticatedState.getAccountToken(), authenticatedState2.getAccountToken())) {
                return true;
            }
        }
        return false;
    }

    public static CallbackToFutureAdapter$SafeFuture launchFuture$default(CoroutineContext coroutineContext, Function2 function2) {
        CoroutineStart coroutineStart = CoroutineStart.DEFAULT;
        coroutineContext.getClass();
        return DBUtil.getFuture(new ListenableFutureKt$$ExternalSyntheticLambda0(coroutineContext, coroutineStart, function2));
    }

    public static final LocalDate millisToLocalDate(long j, TimeZone timeZone) {
        timeZone.getClass();
        LocalDate localDate = ZonedDateTime.ofInstant(Instant.ofEpochMilli(j), ZoneId.of(timeZone.getID())).toLocalDate();
        localDate.getClass();
        return localDate;
    }

    public static final Instant now(AndroidClock androidClock) {
        androidClock.getClass();
        Instant ofEpochMilli = Instant.ofEpochMilli(androidClock.millis());
        ofEpochMilli.getClass();
        return ofEpochMilli;
    }

    public static final LocalDate nowLocalDate(AndroidClock androidClock) {
        androidClock.getClass();
        return millisToLocalDate(androidClock.millis(), androidClock.timeZone());
    }

    public static final Instant nowSeconds(AndroidClock androidClock) {
        Instant ofEpochSecond = Instant.ofEpochSecond(androidClock.millis() / 1000);
        ofEpochSecond.getClass();
        return ofEpochSecond;
    }

    public static TypedArray obtainAttributes(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static final OnboardedAccountStatus onboardedAccountStatus(String str, boolean z) {
        return (!z || str == null) ? OnboardedAccountStatus.NotOnboarded.INSTANCE : new OnboardedAccountStatus.Onboarded(str);
    }

    /* renamed from: overrideButtonPrimaryBackground-WkMS-hQ$default, reason: not valid java name */
    public static Colors m1467overrideButtonPrimaryBackgroundWkMShQ$default(Colors colors, long j) {
        long m675copywmQWz5c$default = Color.m675copywmQWz5c$default(0.3f, j, 14);
        colors.getClass();
        Colors.Component component = colors.component;
        Colors.Component.Button button = component.button;
        Colors.Component.Button.Prominent prominent = button.prominent;
        Colors.Component.Button.Prominent.Background m3113copyjRlVdoo$default = Colors.Component.Button.Prominent.Background.m3113copyjRlVdoo$default(prominent.background, j, m675copywmQWz5c$default, 0L, 12);
        Colors.Component.Button.Prominent.Icon icon = prominent.icon;
        Colors.Component.Button.Prominent.Text text = prominent.text;
        icon.getClass();
        text.getClass();
        return Colors.copy$default(colors, Colors.Component.copy$default(component, null, Colors.Component.Button.copy$default(button, new Colors.Component.Button.Prominent(m3113copyjRlVdoo$default, icon, text), null, 13), null, null, null, null, null, 134217719), null, 55);
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void paint(Canvas canvas, TextLayoutResult textLayoutResult) {
        Canvas canvas2;
        Throwable th;
        Brush brush;
        TextForegroundStyle.Unspecified unspecified;
        MultiParagraph multiParagraph = textLayoutResult.multiParagraph;
        boolean hasVisualOverflow = textLayoutResult.getHasVisualOverflow();
        TextLayoutInput textLayoutInput = textLayoutResult.layoutInput;
        boolean z = hasVisualOverflow && textLayoutInput.overflow != 3;
        if (z) {
            float f = (int) (textLayoutResult.size >> 32);
            Rect m1180Recttz77jQw = DBUtil.m1180Recttz77jQw(0L, (Float.floatToRawIntBits((int) (r3 & BodyPartID.bodyIdMax)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32));
            canvas.save();
            Canvas.m672clipRectmtrdDE$default(canvas, m1180Recttz77jQw);
        }
        SpanStyle spanStyle = textLayoutInput.style.spanStyle;
        TextDecoration textDecoration = spanStyle.textDecoration;
        TextForegroundStyle textForegroundStyle = spanStyle.textForegroundStyle;
        if (textDecoration == null) {
            textDecoration = TextDecoration.None;
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.shadow;
        if (shadow == null) {
            shadow = Shadow.None;
        }
        Shadow shadow2 = shadow;
        DrawStyle drawStyle = spanStyle.drawStyle;
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        DrawStyle drawStyle2 = drawStyle;
        try {
            brush = textForegroundStyle.getBrush();
            unspecified = TextForegroundStyle.Unspecified.INSTANCE;
        } catch (Throwable th2) {
            th = th2;
            canvas2 = canvas;
        }
        try {
            if (brush != null) {
                float alpha = textForegroundStyle != unspecified ? textForegroundStyle.getAlpha() : 1.0f;
                canvas2 = canvas;
                try {
                    zzahv.m2021drawMultiParagraph7AXcY_I(multiParagraph, canvas2, brush, alpha, shadow2, textDecoration2, drawStyle2);
                    canvas2 = canvas2;
                } catch (Throwable th3) {
                    th = th3;
                    th = th;
                    if (!z) {
                    }
                }
            } else {
                long mo1007getColor0d7_KjU = textForegroundStyle != unspecified ? textForegroundStyle.mo1007getColor0d7_KjU() : Color.Black;
                canvas2 = canvas;
                try {
                    MultiParagraph.m964paintLG529CI$default(multiParagraph, canvas2, mo1007getColor0d7_KjU, shadow2, textDecoration2, drawStyle2, 32);
                } catch (Throwable th4) {
                    th = th4;
                    th = th;
                    if (!z) {
                        throw th;
                    }
                    canvas2.restore();
                    throw th;
                }
            }
            if (z) {
                canvas2.restore();
            }
        } catch (Throwable th5) {
            th = th5;
            canvas2 = canvas;
            if (!z) {
            }
        }
    }

    public static final String resolveHintText(AndroidStringManager androidStringManager, BlockersScreens.RegisterAliasScreen registerAliasScreen, boolean z, boolean z2, BlockersScreens.RegisterAliasScreen.Mode mode) {
        mode.getClass();
        BlockersScreens.RegisterAliasScreen.Mode mode2 = BlockersScreens.RegisterAliasScreen.Mode.SIGN_IN;
        int i = R.string.blockers_register_sms_hint;
        if (mode == mode2 && z) {
            return androidStringManager.get(R.string.blockers_register_sms_hint);
        }
        String str = registerAliasScreen.inputHint;
        if (str == null) {
            int ordinal = mode.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    str = registerAliasScreen.emailInputHint;
                } else if (ordinal != 2 && ordinal != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            }
            str = registerAliasScreen.smsInputHint;
        }
        if (str != null) {
            return str;
        }
        int ordinal2 = mode.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                i = R.string.blockers_register_email_hint;
            } else if (ordinal2 != 2) {
                if (ordinal2 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            }
            return androidStringManager.get(i);
        }
        if (!z2) {
            i = R.string.blockers_sign_in_hint;
        }
        return androidStringManager.get(i);
    }

    public static final String resolveTitleText(AndroidStringManager androidStringManager, BlockersScreens.RegisterAliasScreen registerAliasScreen, boolean z, boolean z2, BlockersScreens.RegisterAliasScreen.Mode mode) {
        mode.getClass();
        BlockersScreens.RegisterAliasScreen.Mode mode2 = BlockersScreens.RegisterAliasScreen.Mode.SIGN_IN;
        int i = R.string.blockers_mooncake_sign_in_title_sms;
        if (mode == mode2 && z) {
            return androidStringManager.get(R.string.blockers_mooncake_sign_in_title_sms);
        }
        Redacted redacted = registerAliasScreen.title;
        String str = redacted != null ? (String) redacted.getValue() : null;
        if (str != null && str.length() > 0) {
            return str;
        }
        if (z2) {
            int ordinal = mode.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    i = R.string.blockers_mooncake_sign_in_title_email;
                } else if (ordinal != 2 && ordinal != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            }
        } else {
            int ordinal2 = mode.ordinal();
            if (ordinal2 != 0) {
                if (ordinal2 == 1) {
                    i = R.string.blockers_register_email_title;
                } else if (ordinal2 == 2) {
                    i = R.string.blockers_register_sms_title;
                } else if (ordinal2 != 3) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            }
            i = R.string.blockers_mooncake_sign_in_title;
        }
        return androidStringManager.get(i);
    }

    public static final SharedPreferencesKeyValue sessionPref(SharedPreferences sharedPreferences, Moshi moshi) {
        sharedPreferences.getClass();
        moshi.getClass();
        KeyValue.OnDeserializationFailure onDeserializationFailure = KeyValue.OnDeserializationFailure.Throw;
        JsonAdapter adapter = moshi.adapter(Session.class, Util.NO_ANNOTATIONS, null);
        return Room.SerDeKeyValue(sharedPreferences, "session", new StorageLinkSerdeKt$StorageLinkKeyValue$$inlined$MoshiKeyValue$default$1(adapter, 7), new StorageLinkSerdeKt$StorageLinkKeyValue$$inlined$MoshiKeyValue$default$1(adapter, 8), new RealSessionManagerKt$sessionPref$$inlined$MoshiKeyValue$default$3(), onDeserializationFailure, true);
    }

    public static final SessionAttributeChange toCdfSessionAttributeChange(String str, String str2) {
        return (str != null || str2 == null) ? (str == null || str2 != null) ? !Intrinsics.areEqual(str, str2) ? SessionAttributeChange.CHANGED : SessionAttributeChange.NONE : SessionAttributeChange.DELETED : SessionAttributeChange.SET;
    }

    public static final com.squareup.cash.cdf.session.SessionState toCdfSessionState(SessionState sessionState) {
        if (sessionState instanceof SwitchingState) {
            return com.squareup.cash.cdf.session.SessionState.SWITCHING;
        }
        if (sessionState instanceof SessionState.Authenticated) {
            return com.squareup.cash.cdf.session.SessionState.AUTHENTICATED;
        }
        if (sessionState instanceof SessionState.Initiated) {
            return com.squareup.cash.cdf.session.SessionState.INITIATED;
        }
        if (sessionState instanceof NotInitiatedState) {
            return com.squareup.cash.cdf.session.SessionState.NOT_INITIATED;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static final SessionTokenStatus toCdfSessionTokenStatus(SessionStatus sessionStatus) {
        sessionStatus.getClass();
        int ordinal = sessionStatus.ordinal();
        if (ordinal == 0) {
            return SessionTokenStatus.PARTIAL;
        }
        if (ordinal == 1) {
            return SessionTokenStatus.FULL;
        }
        if (ordinal == 2) {
            return SessionTokenStatus.ANONYMOUS;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static Object withBackupFile(Context context, Function1 function1) {
        Object invoke;
        try {
            synchronized (CashBackupAgent.lock) {
                invoke = function1.invoke(new File(context.getFilesDir(), "backup_tag"));
            }
            return invoke;
        } catch (IOException e) {
            Timber.Forest.i(BalanceFeedKt$$ExternalSyntheticOutline0.m("Failed to access backup tag with error ", e), new Object[0]);
            return null;
        }
    }

    /* renamed from: withTint-4WTKRHQ, reason: not valid java name */
    public static final Colors m1468withTint4WTKRHQ(Colors colors, long j) {
        colors.getClass();
        return Color.m676equalsimpl0(j, Color.Unspecified) ? colors : colors.isLight ? ColorsLightKt.m3376createLightmxwnekA$default(1, j) : ColorsDarkKt.m3375createDarkmxwnekA$default(1, j);
    }

    public static void zza(int i, int i2) {
        String zza2;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zza2 = CameraPropertiesKt.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
                    return;
                }
                zza2 = CameraPropertiesKt.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(zza2);
        }
    }

    public static void zzc(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zze(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zze(i2, i3, "end index") : CameraPropertiesKt.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String zze(int i, int i2, String str) {
        if (i < 0) {
            return CameraPropertiesKt.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return CameraPropertiesKt.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
        return null;
    }

    public GmsClient buildClient(Context context, Looper looper, Reward$Adapter reward$Adapter, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        return buildClient$1(context, looper, reward$Adapter, obj, connectionCallbacks, onConnectionFailedListener);
    }

    public GmsClient buildClient$1(Context context, Looper looper, Reward$Adapter reward$Adapter, Object obj, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        throw new UnsupportedOperationException("buildClient must be implemented");
    }

    public abstract String decodeUtf8(byte[] bArr, int i, int i2);

    public abstract int encodeUtf8(String str, byte[] bArr, int i, int i2);

    public List getImpliedScopes() {
        return Collections.EMPTY_LIST;
    }

    public abstract int partialIsValidUtf8(byte[] bArr, int i, int i2);

    public static HomeViewPresenter.MetroFactory create(LambdaProvider lambdaProvider, RealMerchantProfileRepo$MetroFactory realMerchantProfileRepo$MetroFactory, RealLegalDocumentManager$MetroFactory realLegalDocumentManager$MetroFactory, RealKnotLauncher.MetroFactory metroFactory, RealKeyStoreProvider.MetroFactory metroFactory2, RealMerchantProfileRepo$MetroFactory realMerchantProfileRepo$MetroFactory2, RealBrazeManager.MetroFactory metroFactory3, DoubleCheck doubleCheck, IntentLauncher.MetroFactory metroFactory4, BreadcrumbListener.MetroFactory metroFactory5, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, RealSessionFlags.MetroFactory metroFactory6, RealMerchantProfileRepo$MetroFactory realMerchantProfileRepo$MetroFactory3, LambdaProvider lambdaProvider2, MarkMarketingMessageAsViewed$MetroFactory markMarketingMessageAsViewed$MetroFactory, DoubleCheck doubleCheck5, AndroidFileSaver.MetroFactory metroFactory7, InstanceFactory instanceFactory) {
        lambdaProvider.getClass();
        metroFactory.getClass();
        metroFactory2.getClass();
        metroFactory3.getClass();
        doubleCheck.getClass();
        metroFactory4.getClass();
        metroFactory5.getClass();
        arcadeModule$ProvideHapticVibratorMetroFactory.getClass();
        doubleCheck2.getClass();
        doubleCheck3.getClass();
        doubleCheck4.getClass();
        metroFactory6.getClass();
        lambdaProvider2.getClass();
        doubleCheck5.getClass();
        instanceFactory.getClass();
        return new HomeViewPresenter.MetroFactory(lambdaProvider, realMerchantProfileRepo$MetroFactory, realLegalDocumentManager$MetroFactory, metroFactory, metroFactory2, realMerchantProfileRepo$MetroFactory2, metroFactory3, doubleCheck, metroFactory4, metroFactory5, arcadeModule$ProvideHapticVibratorMetroFactory, doubleCheck2, doubleCheck3, doubleCheck4, metroFactory6, realMerchantProfileRepo$MetroFactory3, lambdaProvider2, markMarketingMessageAsViewed$MetroFactory, doubleCheck5, metroFactory7, instanceFactory);
    }

    public static PaymentActionHandler.MetroFactory create(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, LambdaProvider lambdaProvider, RealMessageSigner.MetroFactory metroFactory, RealMessageSigner.MetroFactory metroFactory2, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory2, DoubleCheck doubleCheck5, InstanceFactory instanceFactory3, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, RealMessageSigner.MetroFactory metroFactory3, AttestedKeyMetrics$MetroFactory attestedKeyMetrics$MetroFactory, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, DoubleCheck doubleCheck6, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, DoubleCheck doubleCheck7, AttestedKeyMetrics$MetroFactory attestedKeyMetrics$MetroFactory2, FillrInitializer.MetroFactory metroFactory4, AttestedKeyMetrics$MetroFactory attestedKeyMetrics$MetroFactory3) {
        instanceFactory.getClass();
        instanceFactory2.getClass();
        walletUiFactory$MetroFactory.getClass();
        lambdaProvider.getClass();
        metroFactory.getClass();
        metroFactory2.getClass();
        doubleCheck.getClass();
        doubleCheck2.getClass();
        doubleCheck3.getClass();
        doubleCheck4.getClass();
        walletUiFactory$MetroFactory2.getClass();
        doubleCheck5.getClass();
        instanceFactory3.getClass();
        lambdaProvider2.getClass();
        lambdaProvider3.getClass();
        metroFactory3.getClass();
        attestedKeyMetrics$MetroFactory.getClass();
        broadwayModule$ProvideBroadwayMetroFactory.getClass();
        doubleCheck6.getClass();
        doubleCheck7.getClass();
        attestedKeyMetrics$MetroFactory2.getClass();
        metroFactory4.getClass();
        attestedKeyMetrics$MetroFactory3.getClass();
        return new PaymentActionHandler.MetroFactory(instanceFactory, instanceFactory2, walletUiFactory$MetroFactory, lambdaProvider, metroFactory, metroFactory2, doubleCheck, doubleCheck2, doubleCheck3, doubleCheck4, walletUiFactory$MetroFactory2, doubleCheck5, instanceFactory3, lambdaProvider2, lambdaProvider3, metroFactory3, attestedKeyMetrics$MetroFactory, broadwayModule$ProvideBroadwayMetroFactory, doubleCheck6, instanceFactory4, instanceFactory5, doubleCheck7, attestedKeyMetrics$MetroFactory2, metroFactory4, attestedKeyMetrics$MetroFactory3);
    }

    public static final void LifecycleStartEffect(Object obj, LifecycleOwner lifecycleOwner, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1408314671);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            } else {
                lifecycleOwner = (LifecycleOwner) gapComposer.consume(LocalLifecycleOwnerKt.LocalLifecycleOwner);
            }
            int i3 = i2 & (-113);
            gapComposer.endDefaults();
            boolean changed = gapComposer.changed(obj) | gapComposer.changed(lifecycleOwner);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new LifecycleStartStopEffectScope(lifecycleOwner.getLifecycle());
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LifecycleStartEffectImpl(lifecycleOwner, (LifecycleStartStopEffectScope) rememberedValue, function1, gapComposer, i3 & 896);
        } else {
            gapComposer.skipToGroupEnd();
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleEffectKt$$ExternalSyntheticLambda0(obj, lifecycleOwner2, function1, i, 1);
        }
    }
}
