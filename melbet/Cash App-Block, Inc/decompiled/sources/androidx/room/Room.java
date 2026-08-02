package androidx.room;

import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.database.SQLException;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.FocusInteractionKt$collectIsFocusedAsState$1$1;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.AndroidWindowInsets;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda7;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Recomposer$$ExternalSyntheticLambda4;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draganddrop.DragAndDropNode;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.InnerNodeCoordinator;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontVariation$Setting;
import androidx.compose.ui.text.font.FontVariation$Settings;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityImpl;
import androidx.compose.ui.unit.InlineClassHelperKt;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.RoomDatabase;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.work.ListenableFutureKt$$ExternalSyntheticLambda0;
import androidx.work.impl.model.WorkGenerationalId;
import androidx.work.impl.model.WorkSpec;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2;
import app.cash.cdp.integration.CashCdpConfigProvider;
import app.cash.cdp.integration.CdpModule$Companion$$ExternalSyntheticLambda1;
import app.cash.local.views.LocalViewFactory;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.backend.RealAppLockState;
import app.cash.redwood.treehouse.ZiplineCodeSession;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.memory.RealWeakMemoryCache;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.bugsnag.android.JsonStream;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.mlkit_common.zzu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzux;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.TaskExecutors;
import com.google.android.gms.tasks.zzi;
import com.google.android.gms.tasks.zzt;
import com.google.android.gms.tasks.zzw;
import com.google.common.util.concurrent.DirectExecutor;
import com.google.common.util.concurrent.FluentFuture;
import com.google.crypto.tink.internal.PrimitiveRegistry$$ExternalSyntheticLambda0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.firebase.messaging.ProxyNotificationInitializer$$ExternalSyntheticLambda0;
import com.google.maps.android.compose.MarkerKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.NavigationSideEffects;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.ActivityTabViewKt$$ExternalSyntheticLambda19;
import com.squareup.cash.appmessages.AppMessageSyncer;
import com.squareup.cash.appmessages.RealAppMessageManager;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda6;
import com.squareup.cash.arcade.components.BadgeKt$BadgeAssetLayout$3$1$1;
import com.squareup.cash.arcade.components.BadgeKt$BadgeAssetLayout$3$2$1;
import com.squareup.cash.arcade.components.BadgePlacement;
import com.squareup.cash.arcade.components.CheckboxKt$$ExternalSyntheticLambda6;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.text.TextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.common.moneyformatter.currency.Currency;
import com.squareup.cash.common.ui.ColorModelsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.google.pay.payments.real.RealGooglePayPaymentsClient;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.recipients.data.RealRecipientRepository;
import com.squareup.cash.support.screens.SupportScreens;
import com.squareup.cash.support.screenshot.AnalyticsUitlKt;
import com.squareup.cash.support.screenshot.OverlayState;
import com.squareup.cash.support.screenshot.RealScreenshotManager;
import com.squareup.cash.support.screenshot.ScreenshotEventReceiver;
import com.squareup.cash.support.screenshot.ScreenshotManager$ScreenshotResult;
import com.squareup.cash.support.screenshot.ScreenshotManager$ScreenshotState;
import com.squareup.cash.support.screenshot.ScreenshotViewEvent;
import com.squareup.cash.support.screenshot.ScreenshotViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.support.screenshot.ScreenshotViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.tax.views.TaxTooltipView$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.AlertBannerKt$$ExternalSyntheticLambda2;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda8;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.cash.util.RealDrawerOpener$MetroFactory;
import com.squareup.cash.video.views.ExoPlayerVideoView;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.cash.wallet.workers.CardAppletWorker;
import com.squareup.preferences.KeyValue;
import com.squareup.preferences.SharedPreferencesKeyValue;
import com.squareup.preferences.SharedPreferencesKeyValueKt$$ExternalSyntheticLambda0;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.ui.UiPayment;
import com.squareup.util.Strings;
import com.squareup.util.android.AndroidToaster;
import com.squareup.util.android.Toaster$Length;
import com.squareup.workflow1.ui.WorkflowLayout$start$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.enums.EnumEntriesList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.ArrayIterator;
import kotlin.jvm.internal.CallableReference;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KParameter$Kind;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.KTypesJvm;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.ReflectKCallable;
import kotlin.reflect.jvm.internal.ReflectKParameter;
import kotlin.reflect.jvm.internal.ReflectKProperty;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.Cache;
import okhttp3.ConnectionPool;
import okio.Buffer;
import okio.Path$$ExternalSyntheticBUOutline0;
import okio.Source;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.PapaEvent;

/* loaded from: classes.dex */
public abstract class Room {
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BadgeAssetLayout(Badge badge, BadgePlacement badgePlacement, Modifier modifier, boolean z, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        Badge badge2;
        BadgePlacement badgePlacement2;
        GapComposer gapComposer;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        boolean z3;
        BiasAlignment biasAlignment = Alignment.Companion.TopStart;
        badgePlacement.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(811017797);
        Applier applier = gapComposer2.applier;
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer2.changed(badge) : gapComposer2.changedInstance(badge) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer2.changed(badgePlacement) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                z2 = z;
                i3 |= gapComposer2.changed(z2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= gapComposer2.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
                }
                int i6 = 0;
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    if (i5 != 0) {
                        modifier2 = companion;
                    }
                    boolean z4 = i4 != 0 ? true : z2;
                    Density density = (Density) gapComposer2.consume(CompositionLocalsKt.LocalDensity);
                    if (badge == null) {
                        gapComposer2.startReplaceGroup(1840383394);
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier2);
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
                        Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                        Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                        Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                        Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                        composableLambdaImpl.invoke(gapComposer2, Integer.valueOf((i3 >> 12) & 14));
                        gapComposer2.end(true);
                        gapComposer2.end(false);
                        RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                        if (endRestartGroup2 != null) {
                            endRestartGroup2.block = new BadgeKt$$ExternalSyntheticLambda0(badge, badgePlacement, modifier2, z4, composableLambdaImpl, i, i2, 0);
                            return;
                        }
                        return;
                    }
                    badge2 = badge;
                    badgePlacement2 = badgePlacement;
                    boolean z5 = z4;
                    Modifier modifier4 = modifier2;
                    gapComposer2.startReplaceGroup(1840440093);
                    gapComposer2.end(false);
                    RealWeakMemoryCache realWeakMemoryCache = new RealWeakMemoryCache(1);
                    gapComposer2.startReplaceGroup(2038018829);
                    Object rememberedValue = gapComposer2.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = BadgeKt$BadgeAssetLayout$3$1$1.INSTANCE;
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Modifier semantics = SemanticsModifierKt.semantics(modifier4, z5, (Function1) rememberedValue);
                    boolean changedInstance = gapComposer2.changedInstance(badge2) | gapComposer2.changed(density) | gapComposer2.changed(badgePlacement2);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BadgeKt$BadgeAssetLayout$3$2$1(i6, badge2, density, badgePlacement2);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue2;
                    int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, semantics);
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
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer2, measurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Modifier m1458clippedOutlinewH6b6FI$default = RealWeakMemoryCache.m1458clippedOutlinewH6b6FI$default(realWeakMemoryCache, companion, null, 3);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                    int hashCode3 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer2, m1458clippedOutlinewH6b6FI$default);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    Recorder$$ExternalSyntheticOutline2.m(0, composableLambdaImpl, gapComposer2, true);
                    if (badge2 instanceof Badge.Small) {
                        gapComposer2.startReplaceGroup(503458341);
                        RoundedCornerShape roundedCornerShape = RoundedCornerShapeKt.CircleShape;
                        ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        Object obj = DefaultSizes.border.annotationsMap;
                        m1162BadgeSmallBaseorJrPs(6.0f, 6, gapComposer2, realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, roundedCornerShape, 2.0f));
                        z3 = false;
                        gapComposer2.end(false);
                        z2 = z5;
                        gapComposer = gapComposer2;
                    } else {
                        if (!(badge2 instanceof Badge.Large)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer2, 1540259825, false);
                        }
                        gapComposer2.startReplaceGroup(503688485);
                        RoundedCornerShape roundedCornerShape2 = RoundedCornerShapeKt.CircleShape;
                        ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                        Object obj2 = DefaultSizes.border.annotationsMap;
                        gapComposer = gapComposer2;
                        z2 = z5;
                        m1161BadgeLargeBase942rkJo((Badge.Large) badge2, ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).badgeLargeAsset, 16.0f, realWeakMemoryCache.m1459clippedOutlinewH6b6FI(companion, roundedCornerShape2, 2.0f), gapComposer, MLKEMEngine.KyberPolyBytes);
                        z3 = false;
                        gapComposer.end(false);
                    }
                    gapComposer.end(true);
                    gapComposer.end(z3);
                    modifier3 = modifier4;
                } else {
                    badge2 = badge;
                    badgePlacement2 = badgePlacement;
                    gapComposer = gapComposer2;
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                boolean z6 = z2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda0(badge2, badgePlacement2, modifier3, z6, composableLambdaImpl, i, i2, 1);
                    return;
                }
                return;
            }
            z2 = z;
            if ((i & 24576) == 0) {
            }
            int i62 = 0;
            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            }
            boolean z62 = z2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z2 = z;
        if ((i & 24576) == 0) {
        }
        int i622 = 0;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
        }
        boolean z622 = z2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void BadgeInline(Badge badge, Modifier modifier, Composer composer, int i) {
        badge.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1063663643);
        int i2 = (gapComposer.changed(badge) ? 4 : 2) | i | 48;
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            boolean z = badge instanceof Badge.Small;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(-665018601);
                m1162BadgeSmallBaseorJrPs(8.0f, 54, gapComposer, companion);
                gapComposer.end(false);
            } else {
                if (!(badge instanceof Badge.Large)) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -21453169, false);
                }
                gapComposer.startReplaceGroup(-664938807);
                m1161BadgeLargeBase942rkJo((Badge.Large) badge, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).badgeLargeInline, 20.0f, companion, gapComposer, (i2 & 14) | 3456);
                gapComposer.end(false);
            }
            modifier = companion;
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda2(badge, modifier, i, i3);
        }
    }

    /* renamed from: BadgeLargeBase-942rkJo, reason: not valid java name */
    public static final void m1161BadgeLargeBase942rkJo(Badge.Large large, TextStyle textStyle, float f, Modifier modifier, Composer composer, int i) {
        int i2;
        String m;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2004837192);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(large) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(textStyle) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changed(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changed(modifier) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            long count = large.getCount();
            if (0 > count || count >= 1000) {
                m = re$$ExternalSyntheticOutline0.m(gapComposer, -1791765177, R.string.badge_notifications_available_overflow, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1791768200);
                m = zzux.formattedResource(ModalKt.badge_notifications_available(Long.valueOf(large.getCount())), gapComposer);
                gapComposer.end(false);
            }
            String str = m;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = CompositionLocalsKt.LocalDensity;
            Updater.CompositionLocalProvider(staticProvidableCompositionLocal.defaultProvidedValue$runtime(new DensityImpl(((Density) gapComposer.consume(staticProvidableCompositionLocal)).getDensity(), 1.0f)), Expect_jvmKt.rememberComposableLambda(-1062086648, new SliderKt$$ExternalSyntheticLambda7(modifier, str, f, large, textStyle, 1), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda6(large, textStyle, f, modifier, i);
        }
    }

    /* renamed from: BadgeSmallBase--orJrPs, reason: not valid java name */
    public static final void m1162BadgeSmallBaseorJrPs(float f, int i, Composer composer, Modifier modifier) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1655862461);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(f) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(modifier) ? 32 : 16;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String stringResource = stringResource(gapComposer, R.string.badge_notification_available);
            boolean changed = gapComposer.changed(stringResource);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BadgeKt$$ExternalSyntheticLambda3(stringResource, i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(modifier, false, (Function1) rememberedValue);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            BoxKt.Box(SizeKt.m285size3ABfNKs(ImageKt.m177backgroundbw27NRU(semantics, colors.component.badge.background, RoundedCornerShapeKt.CircleShape), f), gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BadgeKt$$ExternalSyntheticLambda4(f, modifier, i, i3);
        }
    }

    public static final SharedPreferencesKeyValue BooleanKeyValue(final SharedPreferences sharedPreferences, final String str, final boolean z, boolean z2) {
        sharedPreferences.getClass();
        return new SharedPreferencesKeyValue(sharedPreferences, str, new SharedPreferencesKeyValue.Reader() { // from class: com.squareup.preferences.SharedPreferencesKeyValueKt$$ExternalSyntheticLambda2
            @Override // com.squareup.preferences.SharedPreferencesKeyValue.Reader
            public final Object read(SharedPreferencesKeyValue sharedPreferencesKeyValue) {
                sharedPreferencesKeyValue.getClass();
                return Boolean.valueOf(sharedPreferences.getBoolean(str, z));
            }
        }, new CdpModule$Companion$$ExternalSyntheticLambda1(str, 2), z2);
    }

    /* renamed from: Font-YpTlLL0$default, reason: not valid java name */
    public static ResourceFont m1163FontYpTlLL0$default(int i, FontWeight fontWeight, int i2) {
        return new ResourceFont(i, fontWeight, i2, new FontVariation$Settings(new FontVariation$Setting[0]));
    }

    public static SharedPreferencesKeyValue IntKeyValue$default(SharedPreferences sharedPreferences, String str) {
        return new SharedPreferencesKeyValue(sharedPreferences, str, new SharedPreferencesKeyValueKt$$ExternalSyntheticLambda0(sharedPreferences, str, 0), new CdpModule$Companion$$ExternalSyntheticLambda1(str, 1), false);
    }

    public static SharedPreferencesKeyValue LongKeyValue$default(SharedPreferences sharedPreferences, String str) {
        return new SharedPreferencesKeyValue(sharedPreferences, str, new SharedPreferencesKeyValueKt$$ExternalSyntheticLambda0(sharedPreferences, str, 1), new CdpModule$Companion$$ExternalSyntheticLambda1(str, 4), false);
    }

    public static final void ScreenshotControls(Function0 function0, Function0 function02, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(545219210);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i | (gapComposer.changedInstance(function02) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            AndroidWindowInsets androidWindowInsets = Arrangement$End$1.current(gapComposer).systemBars;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(OffsetKt.windowInsetsPadding(companion, androidWindowInsets), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
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
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.TopCenter), 16.0f, 12.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new AlertBannerKt$$ExternalSyntheticLambda2(5, function0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue, null, buttonProminence, false, false, null, AnalyticsUitlKt.lambda$2107090028, gapComposer, 1573248, 58);
            SpacerKt.Spacer(gapComposer, SizeKt.m290width3ABfNKs(companion, 16.0f));
            boolean z2 = (i2 & 112) == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new AlertBannerKt$$ExternalSyntheticLambda2(6, function02);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue2, null, null, false, false, null, AnalyticsUitlKt.f687lambda$271752349, gapComposer, 1572864, 62);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ActivityTabViewKt$$ExternalSyntheticLambda19(function0, function02, i, 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v5 */
    public static final void ScreenshotEffectOverlay(Bitmap bitmap, Function0 function0, Composer composer, int i) {
        Function0 function02;
        Throwable th;
        State state;
        ?? r13;
        Object obj;
        MutableState mutableState;
        bitmap.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2131104904);
        int i2 = (gapComposer.changedInstance(bitmap) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj2 = Composer.Companion.Empty;
            if (rememberedValue == obj2) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.TRUE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState2 = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == obj2) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState3 = (MutableState) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == obj2) {
                rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState4 = (MutableState) rememberedValue3;
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (rememberedValue4 == obj2) {
                rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState5 = (MutableState) rememberedValue4;
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState2.getValue()).booleanValue() ? 1.0f : 0.0f, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), null, null, gapComposer, 48, 28);
            State animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState5.getValue()).booleanValue() ? 0.0f : 1.0f, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), null, null, gapComposer, 48, 28);
            State animateFloatAsState3 = AnimateAsStateKt.animateFloatAsState(((Boolean) mutableState4.getValue()).booleanValue() ? 0.8f : 1.0f, AnimatableKt.tween$default(500, 0, null, 6), null, null, gapComposer, 48, 28);
            Unit unit = Unit.INSTANCE;
            boolean z = (i2 & 112) == 32;
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (z || rememberedValue5 == obj2) {
                th = null;
                state = animateFloatAsState2;
                r13 = 0;
                obj = obj2;
                mutableState = mutableState3;
                WorkflowLayout$start$1 workflowLayout$start$1 = new WorkflowLayout$start$1(function0, mutableState2, mutableState, mutableState4, mutableState5, null, 3);
                gapComposer.updateRememberedValue(workflowLayout$start$1);
                rememberedValue5 = workflowLayout$start$1;
            } else {
                state = animateFloatAsState2;
                obj = obj2;
                th = null;
                r13 = 0;
                mutableState = mutableState3;
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue5);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, (boolean) r13);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(r13);
            }
            long j = colors.component.ui.dimmer.background;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, j, rectangleShapeKt$RectangleShape$1);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, r13);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw th;
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
            if (((Number) animateFloatAsState.getValue()).floatValue() > RecyclerView.DECELERATION_RATE) {
                gapComposer.startReplaceGroup(1943213482);
                BoxKt.Box(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(companion, 1.0f), Color.m675copywmQWz5c$default(((Number) animateFloatAsState.getValue()).floatValue(), Color.White, 14), rectangleShapeKt$RectangleShape$1), gapComposer, r13);
                gapComposer.end(r13);
            } else {
                gapComposer.startReplaceGroup(1943299972);
                gapComposer.end(r13);
            }
            if (((Boolean) mutableState.getValue()).booleanValue()) {
                gapComposer.startReplaceGroup(1943362685);
                AndroidImageBitmap androidImageBitmap = new AndroidImageBitmap(bitmap);
                Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion, 1.0f);
                boolean changed = gapComposer.changed(state) | gapComposer.changed(animateFloatAsState3);
                Object rememberedValue6 = gapComposer.rememberedValue();
                if (changed || rememberedValue6 == obj) {
                    rememberedValue6 = new CheckboxKt$$ExternalSyntheticLambda6(state, animateFloatAsState3, 3);
                    gapComposer.updateRememberedValue(rememberedValue6);
                }
                function02 = function0;
                ImageKt.m176Image5hnEew(androidImageBitmap, null, ColorKt.graphicsLayer(fillMaxSize2, (Function1) rememberedValue6), null, null, gapComposer, 48, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
                gapComposer.end(r13);
            } else {
                function02 = function0;
                gapComposer.startReplaceGroup(1943646180);
                gapComposer.end(r13);
            }
            gapComposer.end(true);
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TaxTooltipView$$ExternalSyntheticLambda0(bitmap, function02, i, 4);
        }
    }

    public static final void ScreenshotOverlay(View view, RealScreenshotManager realScreenshotManager, final ScreenshotEventReceiver screenshotEventReceiver, AndroidToaster androidToaster, OverlayState overlayState, Composer composer, int i) {
        OverlayState overlayState2;
        boolean z;
        boolean z2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(10345422);
        final int i2 = 2;
        int i3 = i | (gapComposer.changedInstance(view) ? 4 : 2) | (gapComposer.changed(realScreenshotManager) ? 32 : 16) | (gapComposer.changedInstance(screenshotEventReceiver) ? 256 : 128) | (gapComposer.changedInstance(androidToaster) ? 2048 : 1024) | 24576;
        final int i4 = 1;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 9363) != 9362)) {
            overlayState2 = OverlayState.OVERLAY_HIDDEN;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = realScreenshotManager.screenshotState;
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Continuation continuation = null;
            MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(overlayState2);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            ScreenshotManager$ScreenshotState screenshotManager$ScreenshotState = (ScreenshotManager$ScreenshotState) collectAsState.getValue();
            OverlayState overlayState3 = (OverlayState) mutableState.getValue();
            boolean changed = gapComposer.changed(collectAsState);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new RealGcmRegistrar$unregister$2(collectAsState, mutableState, continuation, 25);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(screenshotManager$ScreenshotState, overlayState3, (Function2) rememberedValue3, gapComposer);
            final SupportScreens.ScreenshotScreen.ScreenshotArgs screenshotArgs = ((ScreenshotManager$ScreenshotState) collectAsState.getValue()).screenshotArgs;
            if (screenshotArgs == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new ScreenshotViewKt$$ExternalSyntheticLambda0(view, realScreenshotManager, screenshotEventReceiver, androidToaster, i);
                    return;
                }
                return;
            }
            int ordinal = ((OverlayState) mutableState.getValue()).ordinal();
            if (ordinal == 0) {
                final int i5 = 0;
                gapComposer.startReplaceGroup(-1036224235);
                view.setVisibility(0);
                boolean changedInstance = gapComposer.changedInstance(screenshotEventReceiver) | gapComposer.changedInstance(screenshotArgs);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new Function0() { // from class: com.squareup.cash.support.screenshot.ScreenshotViewKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i5) {
                                case 0:
                                    screenshotEventReceiver.sendEvent((ScreenshotViewEvent) new ScreenshotViewEvent.TakeScreenshot(screenshotArgs));
                                    break;
                                case 1:
                                    screenshotEventReceiver.sendEvent((ScreenshotViewEvent) new ScreenshotViewEvent.Done(screenshotArgs));
                                    break;
                                default:
                                    screenshotEventReceiver.sendEvent((ScreenshotViewEvent) new ScreenshotViewEvent.ScreenshotResultDisplayed(screenshotArgs));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue4);
                }
                Function0 function0 = (Function0) rememberedValue4;
                boolean changedInstance2 = gapComposer.changedInstance(screenshotEventReceiver) | gapComposer.changedInstance(screenshotArgs);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new Function0() { // from class: com.squareup.cash.support.screenshot.ScreenshotViewKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            switch (i4) {
                                case 0:
                                    screenshotEventReceiver.sendEvent((ScreenshotViewEvent) new ScreenshotViewEvent.TakeScreenshot(screenshotArgs));
                                    break;
                                case 1:
                                    screenshotEventReceiver.sendEvent((ScreenshotViewEvent) new ScreenshotViewEvent.Done(screenshotArgs));
                                    break;
                                default:
                                    screenshotEventReceiver.sendEvent((ScreenshotViewEvent) new ScreenshotViewEvent.ScreenshotResultDisplayed(screenshotArgs));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                ScreenshotControls(function0, (Function0) rememberedValue5, gapComposer, 0);
                gapComposer.end(false);
            } else if (ordinal == 1) {
                gapComposer.startReplaceGroup(-1035865720);
                view.setVisibility(0);
                ScreenshotManager$ScreenshotResult screenshotManager$ScreenshotResult = ((ScreenshotManager$ScreenshotState) collectAsState.getValue()).lastScreenshotResult;
                if (screenshotManager$ScreenshotResult instanceof ScreenshotManager$ScreenshotResult.Success) {
                    gapComposer.startReplaceGroup(-1035701327);
                    Bitmap screenshot = ((ScreenshotManager$ScreenshotResult.Success) screenshotManager$ScreenshotResult).getScreenshot();
                    boolean changedInstance3 = gapComposer.changedInstance(screenshotEventReceiver) | gapComposer.changedInstance(screenshotArgs);
                    Object rememberedValue6 = gapComposer.rememberedValue();
                    if (changedInstance3 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new Function0() { // from class: com.squareup.cash.support.screenshot.ScreenshotViewKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                switch (i2) {
                                    case 0:
                                        screenshotEventReceiver.sendEvent((ScreenshotViewEvent) new ScreenshotViewEvent.TakeScreenshot(screenshotArgs));
                                        break;
                                    case 1:
                                        screenshotEventReceiver.sendEvent((ScreenshotViewEvent) new ScreenshotViewEvent.Done(screenshotArgs));
                                        break;
                                    default:
                                        screenshotEventReceiver.sendEvent((ScreenshotViewEvent) new ScreenshotViewEvent.ScreenshotResultDisplayed(screenshotArgs));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue6);
                    }
                    ScreenshotEffectOverlay(screenshot, (Function0) rememberedValue6, gapComposer, 0);
                    gapComposer.end(false);
                    z = false;
                } else {
                    if (Intrinsics.areEqual(screenshotManager$ScreenshotResult, ScreenshotManager$ScreenshotResult.Prohibited.INSTANCE)) {
                        gapComposer.startReplaceGroup(-1035384321);
                        gapComposer.end(false);
                        String string2 = view.getContext().getString(R.string.support_screenshot_toast_screenshot_prohibited);
                        string2.getClass();
                        androidToaster.makeToast(string2, Toaster$Length.SHORT);
                        mutableState.setValue(OverlayState.SCREENSHOT_CONTROLS_DISPLAYED);
                        screenshotEventReceiver.sendEvent((ScreenshotViewEvent) new ScreenshotViewEvent.ScreenshotResultDisplayed(screenshotArgs));
                    } else if (Intrinsics.areEqual(screenshotManager$ScreenshotResult, ScreenshotManager$ScreenshotResult.Failed.INSTANCE)) {
                        gapComposer.startReplaceGroup(-1035023109);
                        gapComposer.end(false);
                        String string3 = view.getContext().getString(R.string.support_screenshot_toast_failed_to_take_screenshot);
                        string3.getClass();
                        androidToaster.makeToast(string3, Toaster$Length.SHORT);
                        mutableState.setValue(OverlayState.SCREENSHOT_CONTROLS_DISPLAYED);
                        screenshotEventReceiver.sendEvent((ScreenshotViewEvent) new ScreenshotViewEvent.ScreenshotResultDisplayed(screenshotArgs));
                    } else {
                        if (screenshotManager$ScreenshotResult != null) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1352061702, false);
                        }
                        gapComposer.startReplaceGroup(-1034703344);
                        z = false;
                        gapComposer.end(false);
                    }
                    z = false;
                }
                gapComposer.end(z);
            } else {
                if (ordinal != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1352046059, false);
                }
                gapComposer.startReplaceGroup(-1034612514);
                view.setVisibility(8);
                if (((ScreenshotManager$ScreenshotState) collectAsState.getValue()).isTakingScreenshot) {
                    gapComposer.startReplaceGroup(-1034538703);
                    boolean changedInstance4 = gapComposer.changedInstance(screenshotEventReceiver) | gapComposer.changedInstance(screenshotArgs);
                    Object rememberedValue7 = gapComposer.rememberedValue();
                    if (changedInstance4 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new MainActivity$$ExternalSyntheticLambda8(12, screenshotEventReceiver, screenshotArgs);
                        gapComposer.updateRememberedValue(rememberedValue7);
                    }
                    view.post((Runnable) rememberedValue7);
                    z2 = false;
                    gapComposer.end(false);
                } else {
                    z2 = false;
                    gapComposer.startReplaceGroup(-1034412812);
                    gapComposer.end(false);
                }
                gapComposer.end(z2);
            }
        } else {
            gapComposer.skipToGroupEnd();
            overlayState2 = overlayState;
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new ScreenshotViewKt$$ExternalSyntheticLambda5(view, realScreenshotManager, screenshotEventReceiver, androidToaster, overlayState2, i);
        }
    }

    public static final SharedPreferencesKeyValue SerDeKeyValue(final SharedPreferences sharedPreferences, final String str, final Function1 function1, Function1 function12, final Function0 function0, final KeyValue.OnDeserializationFailure onDeserializationFailure, boolean z) {
        sharedPreferences.getClass();
        onDeserializationFailure.getClass();
        return new SharedPreferencesKeyValue(sharedPreferences, str, new SharedPreferencesKeyValue.Reader() { // from class: com.squareup.preferences.SharedPreferencesKeyValueKt$$ExternalSyntheticLambda4
            @Override // com.squareup.preferences.SharedPreferencesKeyValue.Reader
            public final Object read(SharedPreferencesKeyValue sharedPreferencesKeyValue) {
                Function1 function13 = function1;
                sharedPreferencesKeyValue.getClass();
                Continuation continuation = null;
                String string2 = sharedPreferences.getString(str, null);
                Function0 function02 = function0;
                if (string2 != null) {
                    try {
                        Object invoke = function13.invoke(string2);
                        if (invoke != null) {
                            return invoke;
                        }
                    } catch (Throwable th) {
                        int ordinal = onDeserializationFailure.ordinal();
                        if (ordinal == 0) {
                            JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new ExoPlayerVideoView.AnonymousClass2(sharedPreferencesKeyValue, continuation, 20));
                            return function02.invoke();
                        }
                        if (ordinal == 1) {
                            throw th;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
                return function02.invoke();
            }
        }, new PrimitiveRegistry$$ExternalSyntheticLambda0(4, str, function12), z);
    }

    public static /* synthetic */ SharedPreferencesKeyValue SerDeKeyValue$default(SharedPreferences sharedPreferences, String str, Function1 function1, Function1 function12, Function0 function0, int i) {
        KeyValue.OnDeserializationFailure onDeserializationFailure = KeyValue.OnDeserializationFailure.Delete;
        if ((i & 32) != 0) {
            onDeserializationFailure = KeyValue.OnDeserializationFailure.Throw;
        }
        return SerDeKeyValue(sharedPreferences, str, function1, function12, function0, onDeserializationFailure, false);
    }

    public static final SharedPreferencesKeyValue StringKeyValue(SharedPreferences sharedPreferences, String str, String str2, boolean z) {
        sharedPreferences.getClass();
        str.getClass();
        return new SharedPreferencesKeyValue(sharedPreferences, str, new ListenableFutureKt$$ExternalSyntheticLambda0(sharedPreferences, str, str2), new CdpModule$Companion$$ExternalSyntheticLambda1(str, 3), z);
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a1  */
    /* renamed from: Text-2-5TpFw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1164Text25TpFw(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, Composer composer, Modifier modifier, AnnotatedString annotatedString, TextStyle textStyle, TextLineBalancing textLineBalancing, Map map, Function1 function1, boolean z) {
        int i8;
        Modifier modifier2;
        TextStyle textStyle2;
        int i9;
        long j2;
        int i10;
        Function1 function12;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        GapComposer gapComposer;
        int i24;
        int i25;
        int i26;
        Map map2;
        boolean z2;
        int i27;
        TextStyle textStyle3;
        Modifier modifier3;
        long j3;
        TextLineBalancing textLineBalancing2;
        RecomposeScopeImpl endRestartGroup;
        Modifier modifier4;
        TextStyle textStyle4;
        int i28;
        int i29;
        boolean z3;
        Map map3;
        int i30;
        long j4;
        int i31;
        int i32;
        TextLineBalancing textLineBalancing3;
        int i33;
        long m996getColor0d7_KjU;
        boolean z4;
        int i34;
        int i35;
        annotatedString.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-661294038);
        if ((i5 & 6) == 0) {
            i8 = (gapComposer2.changed(annotatedString) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        int i36 = i7 & 2;
        if (i36 != 0) {
            i8 |= 48;
        } else if ((i5 & 48) == 0) {
            modifier2 = modifier;
            i8 |= gapComposer2.changed(modifier2) ? 32 : 16;
            if ((i5 & MLKEMEngine.KyberPolyBytes) != 0) {
                if ((i7 & 4) == 0) {
                    textStyle2 = textStyle;
                    if (gapComposer2.changed(textStyle2)) {
                        i35 = 256;
                        i8 |= i35;
                    }
                } else {
                    textStyle2 = textStyle;
                }
                i35 = 128;
                i8 |= i35;
            } else {
                textStyle2 = textStyle;
            }
            i9 = i7 & 8;
            if (i9 == 0) {
                i8 |= 3072;
            } else if ((i5 & 3072) == 0) {
                j2 = j;
                i8 |= gapComposer2.changed(j2) ? 2048 : 1024;
                i10 = i7 & 16;
                if (i10 != 0) {
                    i8 |= 24576;
                } else if ((i5 & 24576) == 0) {
                    function12 = function1;
                    i8 |= gapComposer2.changedInstance(function12) ? 16384 : PKIFailureInfo.certRevoked;
                    i11 = i7 & 32;
                    if (i11 == 0) {
                        i8 |= 196608;
                        i12 = i;
                    } else {
                        i12 = i;
                        if ((i5 & 196608) == 0) {
                            i8 |= gapComposer2.changed(i12) ? PKIFailureInfo.unsupportedVersion : 65536;
                        }
                    }
                    i13 = i7 & 64;
                    if (i13 == 0) {
                        i8 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        i8 |= gapComposer2.changed(i2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    }
                    i14 = i7 & 128;
                    if (i14 == 0) {
                        i8 |= 12582912;
                    } else if ((i5 & 12582912) == 0) {
                        i15 = i8 | (gapComposer2.changed(i3) ? 8388608 : 4194304);
                        if ((i5 & 100663296) == 0) {
                            if ((i7 & 256) == 0 && gapComposer2.changed(i4)) {
                                i34 = 67108864;
                                i15 |= i34;
                            }
                            i34 = 33554432;
                            i15 |= i34;
                        }
                        i16 = i7 & 512;
                        if (i16 != 0) {
                            i15 |= 805306368;
                            i17 = i16;
                        } else if ((i5 & 805306368) == 0) {
                            i17 = i16;
                            i15 |= gapComposer2.changed(z) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        } else {
                            i17 = i16;
                        }
                        i18 = i15;
                        i19 = i7 & 1024;
                        if (i19 != 0) {
                            i21 = i6 | 6;
                            i20 = i19;
                        } else if ((i6 & 6) == 0) {
                            i20 = i19;
                            i21 = i6 | (gapComposer2.changed(textLineBalancing) ? 4 : 2);
                        } else {
                            i20 = i19;
                            i21 = i6;
                        }
                        i22 = i7 & 2048;
                        if (i22 != 0) {
                            i21 |= 48;
                        } else if ((i6 & 48) == 0) {
                            i23 = i22;
                            i21 |= gapComposer2.changedInstance(map) ? 32 : 16;
                            boolean z5 = false;
                            if (gapComposer2.shouldExecute(i18 & 1, (i18 & 306783379) == 306783378 || (i21 & 19) != 18)) {
                                gapComposer = gapComposer2;
                                gapComposer.skipToGroupEnd();
                                i24 = i2;
                                i25 = i3;
                                i26 = i4;
                                map2 = map;
                                z2 = z;
                                i27 = i12;
                                textStyle3 = textStyle2;
                                modifier3 = modifier2;
                                j3 = j2;
                                textLineBalancing2 = textLineBalancing;
                            } else {
                                gapComposer2.startDefaults();
                                int i37 = i5 & 1;
                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                if (i37 == 0 || gapComposer2.getDefaultsInvalid()) {
                                    modifier4 = i36 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                                    if ((i7 & 4) != 0) {
                                        textStyle4 = (TextStyle) gapComposer2.consume(ArcadeThemeKt.LocalTextStyle);
                                        if (textStyle4 == null) {
                                            gapComposer2.startReplaceGroup(-1100573765);
                                            textStyle4 = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                        } else {
                                            gapComposer2.startReplaceGroup(-1100574912);
                                        }
                                        gapComposer2.end(false);
                                        i18 &= -897;
                                    } else {
                                        textStyle4 = textStyle2;
                                    }
                                    long j5 = i9 != 0 ? Color.Unspecified : j2;
                                    if (i10 != 0) {
                                        Object rememberedValue = gapComposer2.rememberedValue();
                                        if (rememberedValue == neverEqualPolicy) {
                                            rememberedValue = new SvgDecoder$$ExternalSyntheticLambda0(17);
                                            gapComposer2.updateRememberedValue(rememberedValue);
                                        }
                                        function12 = (Function1) rememberedValue;
                                    }
                                    if (i11 != 0) {
                                        i12 = 2;
                                    }
                                    int i38 = i13 != 0 ? Integer.MAX_VALUE : i2;
                                    int i39 = i14 != 0 ? 1 : i3;
                                    if ((i7 & 256) != 0) {
                                        i28 = i18 & (-234881025);
                                        i29 = 0;
                                    } else {
                                        i28 = i18;
                                        i29 = i4;
                                    }
                                    z3 = i17 != 0 ? true : z;
                                    TextLineBalancing textLineBalancing4 = i20 != 0 ? null : textLineBalancing;
                                    if (i23 != 0) {
                                        EmptyMap emptyMap = EmptyMap.INSTANCE;
                                        emptyMap.getClass();
                                        j4 = j5;
                                        map3 = emptyMap;
                                        i30 = i12;
                                        i31 = i28;
                                        textLineBalancing3 = textLineBalancing4;
                                        i32 = i39;
                                    } else {
                                        map3 = map;
                                        i30 = i12;
                                        j4 = j5;
                                        i31 = i28;
                                        i32 = i39;
                                        textLineBalancing3 = textLineBalancing4;
                                    }
                                    i33 = i38;
                                } else {
                                    gapComposer2.skipToGroupEnd();
                                    if ((i7 & 4) != 0) {
                                        i18 &= -897;
                                    }
                                    if ((i7 & 256) != 0) {
                                        i18 &= -234881025;
                                    }
                                    i32 = i3;
                                    map3 = map;
                                    z3 = z;
                                    i30 = i12;
                                    modifier4 = modifier2;
                                    textStyle4 = textStyle2;
                                    j4 = j2;
                                    i33 = i2;
                                    textLineBalancing3 = textLineBalancing;
                                    i31 = i18;
                                    i29 = i4;
                                }
                                gapComposer2.endDefaults();
                                Object rememberedValue2 = gapComposer2.rememberedValue();
                                if (rememberedValue2 == neverEqualPolicy) {
                                    rememberedValue2 = new ArrayMap(3);
                                    gapComposer2.updateRememberedValue(rememberedValue2);
                                }
                                ArrayMap arrayMap = (ArrayMap) rememberedValue2;
                                boolean changedInstance = gapComposer2.changedInstance(arrayMap);
                                Object rememberedValue3 = gapComposer2.rememberedValue();
                                if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                                    rememberedValue3 = new ColorModelsKt$$ExternalSyntheticLambda0(arrayMap, 4);
                                    gapComposer2.updateRememberedValue(rememberedValue3);
                                }
                                Modifier layout = ValueInsets.layout(modifier4, (Function3) rememberedValue3);
                                gapComposer2.startReplaceGroup(151624944);
                                if (j4 != 16) {
                                    m996getColor0d7_KjU = j4;
                                } else {
                                    gapComposer2.startReplaceGroup(151625717);
                                    m996getColor0d7_KjU = textStyle4.m996getColor0d7_KjU();
                                    if (m996getColor0d7_KjU == 16) {
                                        gapComposer2.startReplaceGroup(1044898235);
                                        long j6 = ((Color) gapComposer2.consume(ArcadeThemeKt.LocalTextColor)).value;
                                        if (j6 == 16) {
                                            j6 = Strings.getColors(gapComposer2).semantic.text.standard;
                                        }
                                        m996getColor0d7_KjU = j6;
                                        z5 = false;
                                        gapComposer2.end(false);
                                    }
                                    gapComposer2.end(z5);
                                }
                                gapComposer2.end(z5);
                                TextAlign textAlign = new TextAlign(i29);
                                if (i29 == 0) {
                                    textAlign = null;
                                }
                                if (textAlign == null) {
                                    gapComposer2.startReplaceGroup(151644532);
                                    Object consume = gapComposer2.consume(ArcadeThemeKt.LocalTextAlign);
                                    textAlign = (TextAlign) (((TextAlign) consume).value != 0 ? consume : null);
                                    z4 = false;
                                } else {
                                    z4 = false;
                                    gapComposer2.startReplaceGroup(151641835);
                                }
                                gapComposer2.end(z4);
                                int i40 = textAlign != null ? textAlign.value : textStyle4.paragraphStyle.textAlign;
                                boolean changedInstance2 = gapComposer2.changedInstance(arrayMap) | ((57344 & i31) == 16384);
                                Object rememberedValue4 = gapComposer2.rememberedValue();
                                if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                                    rememberedValue4 = new Recomposer$$ExternalSyntheticLambda4(24, arrayMap, function12);
                                    gapComposer2.updateRememberedValue(rememberedValue4);
                                }
                                int i41 = i31 >> 3;
                                gapComposer = gapComposer2;
                                BundleKt.m1092FoundationTextPdH14aY(annotatedString, layout, textStyle4, m996getColor0d7_KjU, (Function1) rememberedValue4, i33, i32, z3, i40, textLineBalancing3, i30, map3, gapComposer, (i31 & 910) | (458752 & i41) | (i41 & 3670016) | (29360128 & (i31 >> 6)) | ((i21 << 27) & 1879048192), ((i31 >> 15) & 14) | (i21 & 112));
                                i26 = i29;
                                modifier3 = modifier4;
                                textStyle3 = textStyle4;
                                i24 = i33;
                                i25 = i32;
                                z2 = z3;
                                textLineBalancing2 = textLineBalancing3;
                                i27 = i30;
                                map2 = map3;
                                j3 = j4;
                            }
                            Function1 function13 = function12;
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                                endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(i27, i24, i25, i26, i5, i6, i7, 1, j3, modifier3, textStyle3, textLineBalancing2, annotatedString, map2, function13, z2);
                                return;
                            }
                            return;
                        }
                        i23 = i22;
                        boolean z52 = false;
                        if (gapComposer2.shouldExecute(i18 & 1, (i18 & 306783379) == 306783378 || (i21 & 19) != 18)) {
                        }
                        Function1 function132 = function12;
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    i15 = i8;
                    if ((i5 & 100663296) == 0) {
                    }
                    i16 = i7 & 512;
                    if (i16 != 0) {
                    }
                    i18 = i15;
                    i19 = i7 & 1024;
                    if (i19 != 0) {
                    }
                    i22 = i7 & 2048;
                    if (i22 != 0) {
                    }
                    i23 = i22;
                    boolean z522 = false;
                    if (gapComposer2.shouldExecute(i18 & 1, (i18 & 306783379) == 306783378 || (i21 & 19) != 18)) {
                    }
                    Function1 function1322 = function12;
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                function12 = function1;
                i11 = i7 & 32;
                if (i11 == 0) {
                }
                i13 = i7 & 64;
                if (i13 == 0) {
                }
                i14 = i7 & 128;
                if (i14 == 0) {
                }
                i15 = i8;
                if ((i5 & 100663296) == 0) {
                }
                i16 = i7 & 512;
                if (i16 != 0) {
                }
                i18 = i15;
                i19 = i7 & 1024;
                if (i19 != 0) {
                }
                i22 = i7 & 2048;
                if (i22 != 0) {
                }
                i23 = i22;
                boolean z5222 = false;
                if (gapComposer2.shouldExecute(i18 & 1, (i18 & 306783379) == 306783378 || (i21 & 19) != 18)) {
                }
                Function1 function13222 = function12;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            j2 = j;
            i10 = i7 & 16;
            if (i10 != 0) {
            }
            function12 = function1;
            i11 = i7 & 32;
            if (i11 == 0) {
            }
            i13 = i7 & 64;
            if (i13 == 0) {
            }
            i14 = i7 & 128;
            if (i14 == 0) {
            }
            i15 = i8;
            if ((i5 & 100663296) == 0) {
            }
            i16 = i7 & 512;
            if (i16 != 0) {
            }
            i18 = i15;
            i19 = i7 & 1024;
            if (i19 != 0) {
            }
            i22 = i7 & 2048;
            if (i22 != 0) {
            }
            i23 = i22;
            boolean z52222 = false;
            if (gapComposer2.shouldExecute(i18 & 1, (i18 & 306783379) == 306783378 || (i21 & 19) != 18)) {
            }
            Function1 function132222 = function12;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i5 & MLKEMEngine.KyberPolyBytes) != 0) {
        }
        i9 = i7 & 8;
        if (i9 == 0) {
        }
        j2 = j;
        i10 = i7 & 16;
        if (i10 != 0) {
        }
        function12 = function1;
        i11 = i7 & 32;
        if (i11 == 0) {
        }
        i13 = i7 & 64;
        if (i13 == 0) {
        }
        i14 = i7 & 128;
        if (i14 == 0) {
        }
        i15 = i8;
        if ((i5 & 100663296) == 0) {
        }
        i16 = i7 & 512;
        if (i16 != 0) {
        }
        i18 = i15;
        i19 = i7 & 1024;
        if (i19 != 0) {
        }
        i22 = i7 & 2048;
        if (i22 != 0) {
        }
        i23 = i22;
        boolean z522222 = false;
        if (gapComposer2.shouldExecute(i18 & 1, (i18 & 306783379) == 306783378 || (i21 & 19) != 18)) {
        }
        Function1 function1322222 = function12;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* renamed from: access$contains-Uv8p0NA, reason: not valid java name */
    public static final boolean m1166access$containsUv8p0NA(DragAndDropNode dragAndDropNode, long j) {
        if (!dragAndDropNode.getNode().isAttached()) {
            return false;
        }
        InnerNodeCoordinator innerNodeCoordinator = (InnerNodeCoordinator) DepthSortedSetKt.requireLayoutNode(dragAndDropNode).nodes.innerCoordinator;
        if (!innerNodeCoordinator.isAttached()) {
            return false;
        }
        long mo841localToRootMKHz9U = innerNodeCoordinator.mo841localToRootMKHz9U(0L);
        float intBitsToFloat = Float.intBitsToFloat((int) (mo841localToRootMKHz9U >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (mo841localToRootMKHz9U & BodyPartID.bodyIdMax));
        long j2 = dragAndDropNode.size;
        float f = ((int) (j2 >> 32)) + intBitsToFloat;
        float f2 = ((int) (j2 & BodyPartID.bodyIdMax)) + intBitsToFloat2;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f) {
            return false;
        }
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f2;
    }

    public static final GapAnchor asGapAnchor(GapAnchor gapAnchor) {
        if (gapAnchor == null) {
            gapAnchor = null;
        }
        if (gapAnchor != null) {
            return gapAnchor;
        }
        ComposerKt.composeRuntimeError("Inconsistent composition");
        OptionalProvider$$ExternalSyntheticLambda0.m$1();
        return null;
    }

    public static Object await(Task task, long j, TimeUnit timeUnit) {
        zzae.checkNotMainThread("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            a$$ExternalSyntheticBUOutline0.m$1("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        zzae.checkNotNull(task, "Task must not be null");
        zzae.checkNotNull(timeUnit, "TimeUnit must not be null");
        if (task.isComplete()) {
            return zza(task);
        }
        ConnectionPool connectionPool = new ConnectionPool(1, false);
        Executor executor = TaskExecutors.zza;
        task.addOnSuccessListener(executor, connectionPool);
        task.addOnFailureListener(executor, connectionPool);
        task.addOnCanceledListener(executor, connectionPool);
        if (((CountDownLatch) connectionPool.delegate).await(j, timeUnit)) {
            return zza(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static zzw call(Executor executor, Callable callable) {
        zzae.checkNotNull(executor, "Executor must not be null");
        zzw zzwVar = new zzw();
        executor.execute(new zzi(zzwVar, callable, false, 11));
        return zzwVar;
    }

    /* renamed from: checkArithmetic--R2X_6o, reason: not valid java name */
    public static final void m1167checkArithmeticR2X_6o(long j) {
        TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
        if ((j & 1095216660480L) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
    }

    /* renamed from: checkArithmetic-NB67dxo, reason: not valid java name */
    public static final void m1168checkArithmeticNB67dxo(long j, long j2) {
        TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
        if ((j & 1095216660480L) == 0 || (1095216660480L & j2) == 0) {
            InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for Unspecified type.");
        }
        if (TextUnitType.m1062equalsimpl0(TextUnit.m1058getTypeUIouoOA(j), TextUnit.m1058getTypeUIouoOA(j2))) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Cannot perform operation for " + ((Object) TextUnitType.m1063toStringimpl(TextUnit.m1058getTypeUIouoOA(j))) + " and " + ((Object) TextUnitType.m1063toStringimpl(TextUnit.m1058getTypeUIouoOA(j2))));
    }

    public static final MutableState collectIsPressedAsState(MutableInteractionSourceImpl mutableInteractionSourceImpl, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        int i2 = 1;
        boolean z = (((i & 14) ^ 6) > 4 && gapComposer.changed(mutableInteractionSourceImpl)) || (i & 6) == 4;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (z || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new FocusInteractionKt$collectIsFocusedAsState$1$1(mutableInteractionSourceImpl, mutableState, null, i2);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, mutableInteractionSourceImpl, (Function2) rememberedValue2);
        return mutableState;
    }

    public static PaymentConfigurationPresenter.MetroFactory create(RealRecipientRepository.MetroFactory metroFactory, DelegateFactory delegateFactory, LambdaProvider lambdaProvider, RealBadger2.MetroFactory metroFactory2, RealSessionFlags.MetroFactory metroFactory3, IntentLauncher.MetroFactory metroFactory4, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealGooglePayPaymentsClient.MetroFactory metroFactory5, CardAppletWorker.MetroFactory metroFactory6, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, RealDrawerOpener$MetroFactory realDrawerOpener$MetroFactory, RealSessionFlags.MetroFactory metroFactory7, DelegateFactory delegateFactory2, IntentLauncher.MetroFactory metroFactory8, NavigationSideEffects.MetroFactory metroFactory9, TreehouseFlows.MetroFactory metroFactory10, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, DoubleCheck doubleCheck5, RealBrazeManager.MetroFactory metroFactory11, RealAppLockState.MetroFactory metroFactory12, AppMessageSyncer.MetroFactory metroFactory13, InstanceFactory instanceFactory, DoubleCheck doubleCheck6, TemporaryStorage.MetroFactory metroFactory14, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, LambdaProvider lambdaProvider4, RealMessageSigner.MetroFactory metroFactory15, DoubleCheck doubleCheck7, DoubleCheck doubleCheck8, DoubleCheck doubleCheck9) {
        metroFactory.getClass();
        delegateFactory.getClass();
        lambdaProvider.getClass();
        metroFactory2.getClass();
        metroFactory3.getClass();
        metroFactory4.getClass();
        doubleCheck.getClass();
        doubleCheck2.getClass();
        metroFactory5.getClass();
        metroFactory6.getClass();
        walletUiFactory$MetroFactory.getClass();
        doubleCheck3.getClass();
        doubleCheck4.getClass();
        realDrawerOpener$MetroFactory.getClass();
        metroFactory7.getClass();
        delegateFactory2.getClass();
        metroFactory8.getClass();
        metroFactory10.getClass();
        arcadeModule$ProvideHapticVibratorMetroFactory.getClass();
        doubleCheck5.getClass();
        metroFactory11.getClass();
        metroFactory12.getClass();
        metroFactory13.getClass();
        doubleCheck6.getClass();
        metroFactory14.getClass();
        lambdaProvider2.getClass();
        lambdaProvider3.getClass();
        lambdaProvider4.getClass();
        metroFactory15.getClass();
        doubleCheck7.getClass();
        doubleCheck8.getClass();
        doubleCheck9.getClass();
        return new PaymentConfigurationPresenter.MetroFactory(metroFactory, delegateFactory, lambdaProvider, metroFactory2, metroFactory3, metroFactory4, doubleCheck, doubleCheck2, metroFactory5, metroFactory6, walletUiFactory$MetroFactory, doubleCheck3, doubleCheck4, realDrawerOpener$MetroFactory, metroFactory7, delegateFactory2, metroFactory8, metroFactory9, metroFactory10, arcadeModule$ProvideHapticVibratorMetroFactory, doubleCheck5, metroFactory11, metroFactory12, metroFactory13, instanceFactory, doubleCheck6, metroFactory14, lambdaProvider2, lambdaProvider3, lambdaProvider4, metroFactory15, doubleCheck7, doubleCheck8, doubleCheck9);
    }

    public static final File dataStoreFile(Context context, String str) {
        context.getClass();
        str.getClass();
        return new File(context.getApplicationContext().getFilesDir(), Recorder$$ExternalSyntheticOutline2.m("datastore/", str));
    }

    public static final RoomDatabase.Builder databaseBuilder(Context context, Class cls, String str) {
        context.getClass();
        if (StringsKt.isBlank(str)) {
            a$$ExternalSyntheticBUOutline0.m$3("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        if (!str.equals(":memory:")) {
            return new RoomDatabase.Builder(context, cls, str);
        }
        a$$ExternalSyntheticBUOutline0.m$3("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    public static final Object defaultEmptyArray(KType kType) {
        Class javaClass = PapaEvent.getJavaClass(KTypesJvm.getJvmErasure(kType));
        if (javaClass.isArray()) {
            Object newInstance = Array.newInstance(javaClass.getComponentType(), 0);
            newInstance.getClass();
            return newInstance;
        }
        throw new KotlinReflectionInternalError("Cannot instantiate the default empty array of type " + javaClass.getSimpleName() + ", because it is not an array type");
    }

    public static final void execSQL(SQLiteConnection sQLiteConnection, String str) {
        sQLiteConnection.getClass();
        SQLiteStatement prepare = sQLiteConnection.prepare(str);
        try {
            prepare.step();
            Cache.Companion.closeFinally(prepare, null);
        } finally {
        }
    }

    public static zzw forException(Exception exc) {
        zzw zzwVar = new zzw();
        zzwVar.zzc(exc);
        return zzwVar;
    }

    public static zzw forResult(Object obj) {
        zzw zzwVar = new zzw();
        zzwVar.zza(obj);
        return zzwVar;
    }

    public static final WorkGenerationalId generationalId(WorkSpec workSpec) {
        workSpec.getClass();
        return new WorkGenerationalId(workSpec.id, workSpec.generation);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x003e, code lost:
    
        if (r3 == false) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object getBoundReceiver(ReflectKCallable reflectKCallable) {
        Class inlineClass;
        reflectKCallable.getClass();
        Object rawBoundReceiver = reflectKCallable.getRawBoundReceiver();
        if (!(reflectKCallable instanceof ReflectKProperty) || !MarkerKt.isUnderlyingPropertyOfValueClass((ReflectKProperty) reflectKCallable)) {
            Iterator it = reflectKCallable.getAllParameters().iterator();
            boolean z = false;
            Object obj = null;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (((ReflectKParameter) next).getKind() != KParameter$Kind.VALUE) {
                        if (z) {
                            break;
                        }
                        z = true;
                        obj = next;
                    }
                }
            }
            obj = null;
            ReflectKParameter reflectKParameter = (ReflectKParameter) obj;
            KType type2 = reflectKParameter != null ? reflectKParameter.getType() : null;
            if (type2 != null && (inlineClass = MarkerKt.toInlineClass(type2)) != null) {
                return MarkerKt.getInlineClassUnboxMethod(inlineClass, reflectKCallable).invoke(rawBoundReceiver, null);
            }
        }
        return rawBoundReceiver;
    }

    public static final long getSp(double d) {
        return pack(4294967296L, (float) d);
    }

    public static final List getTokens(List list) {
        if (list == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = ((UiPayment) it.next()).token;
            if (str != null) {
                arrayList.add(str);
            }
        }
        return arrayList;
    }

    public static void initialize(Context context) {
        boolean z;
        Context applicationContext;
        PackageManager packageManager;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        if (TransactorKt.getPreference(context).getBoolean("proxy_notification_initialized", false)) {
            return;
        }
        try {
            applicationContext = context.getApplicationContext();
            packageManager = applicationContext.getPackageManager();
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(applicationContext.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("firebase_messaging_notification_delegation_enabled")) {
            z = applicationInfo.metaData.getBoolean("firebase_messaging_notification_delegation_enabled");
            new ProxyNotificationInitializer$$ExternalSyntheticLambda0(context, z, new TaskCompletionSource()).run();
        }
        z = true;
        new ProxyNotificationInitializer$$ExternalSyntheticLambda0(context, z, new TaskCompletionSource()).run();
    }

    public static final boolean isAnnotationConstructor(ReflectKCallable reflectKCallable) {
        reflectKCallable.getClass();
        return isConstructor(reflectKCallable) && reflectKCallable.getContainer().getJClass().isAnnotation();
    }

    public static final boolean isBound(ReflectKCallable reflectKCallable) {
        reflectKCallable.getClass();
        return reflectKCallable.getRawBoundReceiver() != CallableReference.NO_RECEIVER;
    }

    public static final boolean isConstructor(ReflectKCallable reflectKCallable) {
        reflectKCallable.getClass();
        return Intrinsics.areEqual(reflectKCallable.getName(), "<init>");
    }

    public static boolean isProxyNotificationEnabled(Context context) {
        if (Binder.getCallingUid() != context.getApplicationInfo().uid) {
            Log.e("FirebaseMessaging", "error retrieving notification delegate for package " + context.getPackageName());
            return false;
        }
        if (!"com.google.android.gms".equals(((NotificationManager) context.getSystemService(NotificationManager.class)).getNotificationDelegate())) {
            return false;
        }
        if (!Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        Log.d("FirebaseMessaging", "GMS core is set for proxying");
        return true;
    }

    public static Long jsonToLong(Object obj) {
        long longValue;
        if (obj != null) {
            if (obj instanceof Number) {
                return Long.valueOf(((Number) obj).longValue());
            }
            if (!(obj instanceof String)) {
                a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Cannot convert ", " to long", obj));
                return null;
            }
            if (((CharSequence) obj).length() != 0) {
                try {
                    return Long.decode((String) obj);
                } catch (NumberFormatException e) {
                    String str = (String) obj;
                    if (StringsKt__StringsJVMKt.startsWith(str, "0x", false)) {
                        if (str.length() != 18) {
                            throw e;
                        }
                        int length = str.length() - 2;
                        longValue = (Long.decode(str.substring(0, length)).longValue() << 8) | Long.parseLong(str.substring(length, str.length()), CharsKt.checkRadix(16));
                    } else {
                        if (str.length() < 19) {
                            throw e;
                        }
                        int length2 = str.length() - 3;
                        longValue = Long.decode(str.substring(length2, str.length())).longValue() + (Long.decode(str.substring(0, length2)).longValue() * 1000);
                    }
                    return Long.valueOf(longValue);
                }
            }
        }
        return null;
    }

    public static final long pack(long j, float f) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f) & BodyPartID.bodyIdMax);
        TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
        return floatToRawIntBits;
    }

    public static Executor rejectionPropagatingExecutor(final Executor executor, final FluentFuture.TrustedFuture trustedFuture) {
        executor.getClass();
        return executor == DirectExecutor.INSTANCE ? executor : new Executor() { // from class: com.google.common.util.concurrent.MoreExecutors$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                try {
                    executor.execute(runnable);
                } catch (RejectedExecutionException e) {
                    trustedFuture.setException(e);
                }
            }
        };
    }

    public static void requireNonNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$2(str);
    }

    public static byte[] serialize(JsonStream.Streamable streamable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            PrintWriter printWriter = new PrintWriter(byteArrayOutputStream);
            try {
                JsonStream jsonStream = new JsonStream(printWriter);
                try {
                    streamable.toStream(jsonStream);
                    jsonStream.close();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    printWriter.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static final String stringResource(int i, Object[] objArr, Composer composer) {
        return ((Resources) ((GapComposer) composer).consume(AndroidCompositionLocals_androidKt.LocalResources)).getString(i, Arrays.copyOf(objArr, objArr.length));
    }

    public static final void throwSQLiteException(int i, String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("Error code: " + i);
        sb.append(", message: ".concat(str));
        throw new SQLException(sb.toString());
    }

    public static final String toAnalyticsString(ApiResult.Failure failure) {
        if (failure instanceof ApiResult.Failure.HttpFailure) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(((ApiResult.Failure.HttpFailure) failure).code, "HttpFailure(code = ", ")");
        }
        if (failure instanceof ApiResult.Failure.NetworkFailure) {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NetworkFailure(message = ", ((ApiResult.Failure.NetworkFailure) failure).error.getMessage(), ")");
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    public static Currency toMultiplatformCurrency(CurrencyCode currencyCode) {
        Object obj;
        EnumEntriesList entries = Currency.getEntries();
        ArrayIterator m = CameraState$Type$EnumUnboxingLocalUtility.m(entries, entries);
        while (true) {
            if (!m.hasNext()) {
                obj = null;
                break;
            }
            obj = m.next();
            if (((Currency) obj).getNumericCode().getCode() == currencyCode.getValue()) {
                break;
            }
        }
        Currency currency = (Currency) obj;
        return currency == null ? Currency.USD : currency;
    }

    public static zzw whenAll(Task... taskArr) {
        if (taskArr.length == 0) {
            return forResult(null);
        }
        List<Task> asList = Arrays.asList(taskArr);
        if (asList == null || asList.isEmpty()) {
            return forResult(null);
        }
        Iterator it = asList.iterator();
        while (it.hasNext()) {
            if (((Task) it.next()) == null) {
                a$$ExternalSyntheticBUOutline0.m$2("null tasks are not accepted");
                return null;
            }
        }
        zzw zzwVar = new zzw();
        com.google.android.gms.tasks.zzae zzaeVar = new com.google.android.gms.tasks.zzae(asList.size(), zzwVar);
        for (Task task : asList) {
            zzt zztVar = TaskExecutors.zza;
            task.addOnSuccessListener(zztVar, zzaeVar);
            task.addOnFailureListener(zztVar, zzaeVar);
            task.addOnCanceledListener(zztVar, zzaeVar);
        }
        return zzwVar;
    }

    public static void zza(int i, int i2) {
        String zza;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zza = zzu.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
                    return;
                }
                zza = zzu.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(zza);
        }
    }

    public static void zzb(int i, int i2) {
        if (i < 0 || i > i2) {
            Path$$ExternalSyntheticBUOutline0.m(zzf(i, i2, "index"));
        }
    }

    public static void zzd(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zzf(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zzf(i2, i3, "end index") : zzu.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static String zzf(int i, int i2, String str) {
        if (i < 0) {
            return zzu.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzu.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
        return null;
    }

    public abstract Source decode(Buffer buffer);

    public ZiplineCodeSession getCodeSession() {
        return null;
    }

    public CoroutineScope getCodeUpdatesScope() {
        return null;
    }

    public void onFailed(Throwable th) {
    }

    public abstract void onInitialized();

    public static final long getSp(int i) {
        return pack(4294967296L, i);
    }

    public static final String stringResource(Composer composer, int i) {
        return ((Resources) ((GapComposer) composer).consume(AndroidCompositionLocals_androidKt.LocalResources)).getString(i);
    }

    public static Object zza(Task task) {
        if (task.isSuccessful()) {
            return task.getResult();
        }
        if (task.isCanceled()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.getException());
    }

    public static Object await(Task task) {
        zzae.checkNotMainThread("Must not be called on the main application thread");
        Looper myLooper = Looper.myLooper();
        if (myLooper != null && Objects.equals(myLooper.getThread().getName(), "GoogleApiHandler")) {
            a$$ExternalSyntheticBUOutline0.m$1("Must not be called on GoogleApiHandler thread.");
            return null;
        }
        zzae.checkNotNull(task, "Task must not be null");
        if (task.isComplete()) {
            return zza(task);
        }
        ConnectionPool connectionPool = new ConnectionPool(1, false);
        Executor executor = TaskExecutors.zza;
        task.addOnSuccessListener(executor, connectionPool);
        task.addOnFailureListener(executor, connectionPool);
        task.addOnCanceledListener(executor, connectionPool);
        ((CountDownLatch) connectionPool.delegate).await();
        return zza(task);
    }

    public static HomeViewPresenter.MetroFactory create(LambdaProvider lambdaProvider, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory, LocalViewFactory.MetroFactory metroFactory, RealGlobalConfigManager.MetroFactory metroFactory2, RealAppMessageManager.MetroFactory metroFactory3, CashCdpConfigProvider.MetroFactory metroFactory4, RealAppLockState.MetroFactory metroFactory5, RealSessionFlags.MetroFactory metroFactory6, TemporaryStorage.MetroFactory metroFactory7, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, RealMessageSigner.MetroFactory metroFactory8, DoubleCheck doubleCheck, TreehouseFlows.MetroFactory metroFactory9, TreehouseFlows.MetroFactory metroFactory10, InstanceFactory instanceFactory, LocalViewFactory.MetroFactory metroFactory11, TemporaryStorage.MetroFactory metroFactory12, DoubleCheck doubleCheck2, BreadcrumbListener.MetroFactory metroFactory13, RealAppLockState.MetroFactory metroFactory14, LambdaProvider lambdaProvider2) {
        lambdaProvider.getClass();
        arcadeModule$ProvideHapticVibratorMetroFactory.getClass();
        metroFactory.getClass();
        metroFactory2.getClass();
        metroFactory3.getClass();
        metroFactory4.getClass();
        metroFactory5.getClass();
        metroFactory6.getClass();
        metroFactory7.getClass();
        walletUiFactory$MetroFactory.getClass();
        metroFactory8.getClass();
        doubleCheck.getClass();
        metroFactory9.getClass();
        metroFactory11.getClass();
        metroFactory12.getClass();
        doubleCheck2.getClass();
        metroFactory13.getClass();
        metroFactory14.getClass();
        lambdaProvider2.getClass();
        return new HomeViewPresenter.MetroFactory(lambdaProvider, arcadeModule$ProvideHapticVibratorMetroFactory, metroFactory, metroFactory2, metroFactory3, metroFactory4, metroFactory5, metroFactory6, metroFactory7, walletUiFactory$MetroFactory, metroFactory8, doubleCheck, metroFactory9, metroFactory10, instanceFactory, metroFactory11, metroFactory12, doubleCheck2, metroFactory13, metroFactory14, lambdaProvider2);
    }

    /* JADX WARN: Removed duplicated region for block: B:116:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* renamed from: Text-2-5TpFw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1165Text25TpFw(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, Composer composer, Modifier modifier, TextStyle textStyle, TextLineBalancing textLineBalancing, String str, Map map, Function1 function1, boolean z) {
        int i8;
        Modifier modifier2;
        TextStyle textStyle2;
        int i9;
        long j2;
        int i10;
        Function1 function12;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        GapComposer gapComposer;
        TextStyle textStyle3;
        long j3;
        int i22;
        int i23;
        int i24;
        int i25;
        TextLineBalancing textLineBalancing2;
        boolean z2;
        Modifier modifier3;
        Function1 function13;
        Map map2;
        RecomposeScopeImpl endRestartGroup;
        TextStyle textStyle4;
        Modifier modifier4;
        TextLineBalancing textLineBalancing3;
        int i26;
        TextStyle textStyle5;
        int i27;
        Map map3;
        Function1 function14;
        int i28;
        boolean z3;
        int i29;
        long j4;
        int i30;
        int i31;
        int i32;
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(612848424);
        if ((i5 & 6) == 0) {
            i8 = (gapComposer2.changed(str) ? 4 : 2) | i5;
        } else {
            i8 = i5;
        }
        int i33 = i7 & 2;
        if (i33 != 0) {
            i8 |= 48;
        } else if ((i5 & 48) == 0) {
            modifier2 = modifier;
            i8 |= gapComposer2.changed(modifier2) ? 32 : 16;
            if ((i5 & MLKEMEngine.KyberPolyBytes) != 0) {
                if ((i7 & 4) == 0) {
                    textStyle2 = textStyle;
                    if (gapComposer2.changed(textStyle2)) {
                        i32 = 256;
                        i8 |= i32;
                    }
                } else {
                    textStyle2 = textStyle;
                }
                i32 = 128;
                i8 |= i32;
            } else {
                textStyle2 = textStyle;
            }
            i9 = i7 & 8;
            if (i9 == 0) {
                i8 |= 3072;
            } else if ((i5 & 3072) == 0) {
                j2 = j;
                i8 |= gapComposer2.changed(j2) ? 2048 : 1024;
                i10 = i7 & 16;
                if (i10 != 0) {
                    i8 |= 24576;
                } else if ((i5 & 24576) == 0) {
                    function12 = function1;
                    i8 |= gapComposer2.changedInstance(function12) ? 16384 : PKIFailureInfo.certRevoked;
                    i11 = i7 & 32;
                    if (i11 == 0) {
                        i8 |= 196608;
                    } else if ((i5 & 196608) == 0) {
                        i8 |= gapComposer2.changed(i) ? PKIFailureInfo.unsupportedVersion : 65536;
                    }
                    i12 = i7 & 64;
                    if (i12 == 0) {
                        i8 |= 1572864;
                    } else if ((i5 & 1572864) == 0) {
                        i8 |= gapComposer2.changed(i2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    }
                    i13 = i7 & 128;
                    if (i13 == 0) {
                        i8 |= 12582912;
                    } else if ((i5 & 12582912) == 0) {
                        i14 = i8 | (gapComposer2.changed(i3) ? 8388608 : 4194304);
                        if ((i5 & 100663296) == 0) {
                            if ((i7 & 256) == 0 && gapComposer2.changed(i4)) {
                                i31 = 67108864;
                                i14 |= i31;
                            }
                            i31 = 33554432;
                            i14 |= i31;
                        }
                        i15 = i7 & 512;
                        if (i15 != 0) {
                            i14 |= 805306368;
                            i16 = i15;
                        } else if ((i5 & 805306368) == 0) {
                            i16 = i15;
                            i14 |= gapComposer2.changed(z) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        } else {
                            i16 = i15;
                        }
                        i17 = i14;
                        i18 = i7 & 1024;
                        if (i18 != 0) {
                            i20 = 6;
                            i19 = i18;
                        } else if ((i6 & 6) == 0) {
                            i19 = i18;
                            i20 = i6 | (gapComposer2.changed(textLineBalancing) ? 4 : 2);
                        } else {
                            i19 = i18;
                            i20 = i6;
                        }
                        i21 = i20 | 48;
                        int i34 = 0;
                        if (gapComposer2.shouldExecute(i17 & 1, (i17 & 306783379) == 306783378 || (i21 & 19) != 18)) {
                            gapComposer2.startDefaults();
                            if ((i5 & 1) != 0 && !gapComposer2.getDefaultsInvalid()) {
                                gapComposer2.skipToGroupEnd();
                                if ((i7 & 4) != 0) {
                                    i17 &= -897;
                                }
                                if ((i7 & 256) != 0) {
                                    i17 &= -234881025;
                                }
                                i27 = i2;
                                i26 = i3;
                                textLineBalancing3 = textLineBalancing;
                                map3 = map;
                                z3 = z;
                                modifier4 = modifier2;
                                textStyle5 = textStyle2;
                                j4 = j2;
                                function14 = function12;
                                i28 = i21;
                                i30 = i;
                                i29 = i4;
                            } else {
                                Modifier modifier5 = i33 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                                if ((i7 & 4) != 0) {
                                    textStyle4 = (TextStyle) gapComposer2.consume(ArcadeThemeKt.LocalTextStyle);
                                    if (textStyle4 == null) {
                                        gapComposer2.startReplaceGroup(-1100573765);
                                        textStyle4 = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                                    } else {
                                        gapComposer2.startReplaceGroup(-1100574912);
                                    }
                                    gapComposer2.end(false);
                                    i17 &= -897;
                                } else {
                                    textStyle4 = textStyle2;
                                }
                                long j5 = i9 != 0 ? Color.Unspecified : j2;
                                if (i10 != 0) {
                                    Object rememberedValue = gapComposer2.rememberedValue();
                                    if (rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = new SvgDecoder$$ExternalSyntheticLambda0(16);
                                        gapComposer2.updateRememberedValue(rememberedValue);
                                    }
                                    function12 = (Function1) rememberedValue;
                                }
                                int i35 = i11 != 0 ? 2 : i;
                                int i36 = i12 != 0 ? Integer.MAX_VALUE : i2;
                                int i37 = i13 != 0 ? 1 : i3;
                                if ((i7 & 256) != 0) {
                                    i17 &= -234881025;
                                } else {
                                    i34 = i4;
                                }
                                boolean z4 = i16 == 0 ? z : true;
                                TextLineBalancing textLineBalancing4 = i19 != 0 ? null : textLineBalancing;
                                EmptyMap emptyMap = EmptyMap.INSTANCE;
                                emptyMap.getClass();
                                modifier4 = modifier5;
                                textLineBalancing3 = textLineBalancing4;
                                i26 = i37;
                                textStyle5 = textStyle4;
                                i27 = i36;
                                map3 = emptyMap;
                                function14 = function12;
                                i28 = i21;
                                z3 = z4;
                                i29 = i34;
                                j4 = j5;
                                i30 = i35;
                            }
                            gapComposer2.endDefaults();
                            gapComposer = gapComposer2;
                            m1164Text25TpFw(i30, i27, i26, i29, i17 & 2147483632, i28 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0, j4, gapComposer, modifier4, new AnnotatedString(str), textStyle5, textLineBalancing3, map3, function14, z3);
                            i22 = i30;
                            i23 = i27;
                            i24 = i26;
                            i25 = i29;
                            j3 = j4;
                            modifier3 = modifier4;
                            textStyle3 = textStyle5;
                            textLineBalancing2 = textLineBalancing3;
                            map2 = map3;
                            function13 = function14;
                            z2 = z3;
                        } else {
                            gapComposer = gapComposer2;
                            gapComposer.skipToGroupEnd();
                            textStyle3 = textStyle2;
                            j3 = j2;
                            i22 = i;
                            i23 = i2;
                            i24 = i3;
                            i25 = i4;
                            textLineBalancing2 = textLineBalancing;
                            z2 = z;
                            modifier3 = modifier2;
                            function13 = function12;
                            map2 = map;
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup != null) {
                            endRestartGroup.block = new TextKt$$ExternalSyntheticLambda1(i22, i23, i24, i25, i5, i6, i7, 0, j3, modifier3, textStyle3, textLineBalancing2, str, map2, function13, z2);
                            return;
                        }
                        return;
                    }
                    i14 = i8;
                    if ((i5 & 100663296) == 0) {
                    }
                    i15 = i7 & 512;
                    if (i15 != 0) {
                    }
                    i17 = i14;
                    i18 = i7 & 1024;
                    if (i18 != 0) {
                    }
                    i21 = i20 | 48;
                    int i342 = 0;
                    if (gapComposer2.shouldExecute(i17 & 1, (i17 & 306783379) == 306783378 || (i21 & 19) != 18)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                function12 = function1;
                i11 = i7 & 32;
                if (i11 == 0) {
                }
                i12 = i7 & 64;
                if (i12 == 0) {
                }
                i13 = i7 & 128;
                if (i13 == 0) {
                }
                i14 = i8;
                if ((i5 & 100663296) == 0) {
                }
                i15 = i7 & 512;
                if (i15 != 0) {
                }
                i17 = i14;
                i18 = i7 & 1024;
                if (i18 != 0) {
                }
                i21 = i20 | 48;
                int i3422 = 0;
                if (gapComposer2.shouldExecute(i17 & 1, (i17 & 306783379) == 306783378 || (i21 & 19) != 18)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            j2 = j;
            i10 = i7 & 16;
            if (i10 != 0) {
            }
            function12 = function1;
            i11 = i7 & 32;
            if (i11 == 0) {
            }
            i12 = i7 & 64;
            if (i12 == 0) {
            }
            i13 = i7 & 128;
            if (i13 == 0) {
            }
            i14 = i8;
            if ((i5 & 100663296) == 0) {
            }
            i15 = i7 & 512;
            if (i15 != 0) {
            }
            i17 = i14;
            i18 = i7 & 1024;
            if (i18 != 0) {
            }
            i21 = i20 | 48;
            int i34222 = 0;
            if (gapComposer2.shouldExecute(i17 & 1, (i17 & 306783379) == 306783378 || (i21 & 19) != 18)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i5 & MLKEMEngine.KyberPolyBytes) != 0) {
        }
        i9 = i7 & 8;
        if (i9 == 0) {
        }
        j2 = j;
        i10 = i7 & 16;
        if (i10 != 0) {
        }
        function12 = function1;
        i11 = i7 & 32;
        if (i11 == 0) {
        }
        i12 = i7 & 64;
        if (i12 == 0) {
        }
        i13 = i7 & 128;
        if (i13 == 0) {
        }
        i14 = i8;
        if ((i5 & 100663296) == 0) {
        }
        i15 = i7 & 512;
        if (i15 != 0) {
        }
        i17 = i14;
        i18 = i7 & 1024;
        if (i18 != 0) {
        }
        i21 = i20 | 48;
        int i342222 = 0;
        if (gapComposer2.shouldExecute(i17 & 1, (i17 & 306783379) == 306783378 || (i21 & 19) != 18)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
