package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.provider.Settings;
import android.service.notification.StatusBarNotification;
import android.support.v4.app.INotificationSideChannel;
import android.util.Log;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Center$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnFirstVisibleElement;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.media3.ui.PlayerView;
import androidx.navigationevent.NavigationEvent_androidKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.AsyncImageKt;
import coil3.compose.LocalImageLoaderKt;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import com.google.mlkit.common.internal.zzc;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.promotionsreferrals.viewmodels.PromotionsReferralsHomeViewEvent;
import com.squareup.cash.promotionsreferrals.viewmodels.PromotionsReferralsHomeViewModel;
import com.squareup.cash.retro.views.RetroUiFactory$$ExternalSyntheticLambda3;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda7;
import com.squareup.protos.cash.ui.Image;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes.dex */
public final class NotificationManagerCompat {
    public static final String ACTION_BIND_SIDE_CHANNEL = "android.support.BIND_NOTIFICATION_SIDE_CHANNEL";
    private static final String CHECK_OP_NO_THROW = "checkOpNoThrow";
    public static final String EXTRA_USE_SIDE_CHANNEL = "android.support.useSideChannel";
    public static final int IMPORTANCE_DEFAULT = 3;
    public static final int IMPORTANCE_HIGH = 4;
    public static final int IMPORTANCE_LOW = 2;
    public static final int IMPORTANCE_MAX = 5;
    public static final int IMPORTANCE_MIN = 1;
    public static final int IMPORTANCE_NONE = 0;
    public static final int IMPORTANCE_UNSPECIFIED = -1000;
    public static final int INTERRUPTION_FILTER_ALARMS = 4;
    public static final int INTERRUPTION_FILTER_ALL = 1;
    public static final int INTERRUPTION_FILTER_NONE = 3;
    public static final int INTERRUPTION_FILTER_PRIORITY = 2;
    public static final int INTERRUPTION_FILTER_UNKNOWN = 0;
    private static final String OP_POST_NOTIFICATION = "OP_POST_NOTIFICATION";
    private static final String SETTING_ENABLED_NOTIFICATION_LISTENERS = "enabled_notification_listeners";
    private static final int SIDE_CHANNEL_RETRY_BASE_INTERVAL_MS = 1000;
    private static final int SIDE_CHANNEL_RETRY_MAX_COUNT = 6;
    private static final String TAG = "NotifManCompat";
    private static String sEnabledNotificationListeners;
    private static SideChannelManager sSideChannelManager;
    private final Context mContext;
    private final NotificationManager mNotificationManager;
    private static final Object sEnabledNotificationListenersLock = new Object();
    private static Set<String> sEnabledNotificationListenerPackages = new HashSet();
    private static final Object sLock = new Object();

    /* loaded from: classes3.dex */
    public abstract class Api23Impl {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r14v0 */
        /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r14v3 */
        public static final void ActivePromotionSectionList(PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.ActivePromotionsSectionViewModel activePromotionsSectionViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
            Modifier modifier2;
            GapComposer gapComposer;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
            int i2;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
            BiasAlignment.Horizontal horizontal;
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
            float f;
            final Function1 function12;
            Object obj;
            Modifier then;
            boolean z;
            PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.ActivePromotionsSectionViewModel activePromotionsSectionViewModel2 = activePromotionsSectionViewModel;
            activePromotionsSectionViewModel2.getClass();
            function1.getClass();
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startRestartGroup(-1702493727);
            Applier applier = gapComposer2.applier;
            int i3 = i | (gapComposer2.changedInstance(activePromotionsSectionViewModel2) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
            boolean z2 = true;
            final boolean z3 = 0;
            if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer2, 0);
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth);
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
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer2, columnMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer2, valueOf, composeUiNode$Companion$SetModifier$16);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer2, materializeModifier, composeUiNode$Companion$SetModifier$17);
                String str = activePromotionsSectionViewModel2.titleText;
                if (str == null) {
                    gapComposer2.startReplaceGroup(-957084715);
                    gapComposer2.end(false);
                    i2 = i3;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                    horizontal = horizontal2;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                    f = 1.0f;
                } else {
                    gapComposer2.startReplaceGroup(-957084714);
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                    i2 = i3;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$17;
                    layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$15;
                    horizontal = horizontal2;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    f = 1.0f;
                    ViewfinderDefaults.SectionHeader(str, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer2, 0, 30);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
                    gapComposer2.end(false);
                }
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, f);
                ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer2, 0);
                int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth2);
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$13);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer2, composeUiNode$Companion$SetModifier$1, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer2, materializeModifier2, composeUiNode$Companion$SetModifier$12);
                gapComposer2.startReplaceGroup(340350406);
                activePromotionsSectionViewModel2 = activePromotionsSectionViewModel;
                Iterator it = activePromotionsSectionViewModel2.promotions.iterator();
                GapComposer gapComposer3 = gapComposer2;
                while (it.hasNext()) {
                    final PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.ActivePromotionsSectionViewModel.ActivePromotionViewModel activePromotionViewModel = (PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.ActivePromotionsSectionViewModel.ActivePromotionViewModel) it.next();
                    int i4 = i2 & 112;
                    boolean changedInstance = (i4 == 32 ? z2 : z3) | gapComposer3.changedInstance(activePromotionViewModel);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (changedInstance || rememberedValue == neverEqualPolicy) {
                        function12 = function1;
                        Function0 function0 = new Function0() { // from class: com.squareup.cash.promotionsreferrals.views.promotionHomeComponents.ActivePromotionSectionListKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i5 = z3;
                                PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.ActivePromotionsSectionViewModel.ActivePromotionViewModel activePromotionViewModel2 = activePromotionViewModel;
                                Function1 function13 = function12;
                                switch (i5) {
                                    case 0:
                                        PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.PromotionCampaignTokens promotionCampaignTokens = activePromotionViewModel2.tokens;
                                        function13.invoke(new PromotionsReferralsHomeViewEvent.PromotionItemViewed(promotionCampaignTokens.campaignToken, promotionCampaignTokens.campaignVariantToken, PromotionsReferralsHomeViewEvent.PromotionItemViewed.CurrentPromotionState.ACTIVE));
                                        break;
                                    default:
                                        String str2 = activePromotionViewModel2.actionUrl;
                                        PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.PromotionCampaignTokens promotionCampaignTokens2 = activePromotionViewModel2.tokens;
                                        function13.invoke(new PromotionsReferralsHomeViewEvent.ActivePromotionTapped(str2, promotionCampaignTokens2.campaignToken, promotionCampaignTokens2.campaignVariantToken));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer3.updateRememberedValue(function0);
                        obj = function0;
                    } else {
                        function12 = function1;
                        obj = rememberedValue;
                    }
                    then = companion.then(new OnFirstVisibleElement((Function0) obj));
                    zzd zzdVar = Icons.Companion;
                    String str2 = activePromotionViewModel.arcadeIcon;
                    zzdVar.getClass();
                    Icons icons = zzd.get(str2);
                    if (icons == null) {
                        icons = Icons.Giftcard32;
                    }
                    Icons icons2 = icons;
                    String str3 = activePromotionViewModel.titleText;
                    String str4 = activePromotionViewModel.subtitleText;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, z3);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(z3);
                    }
                    long j = colors.semantic.text.inverse;
                    Colors colors2 = (Colors) gapComposer3.consume(staticProvidableCompositionLocal);
                    Iterator it2 = it;
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    long j2 = colors2.semantic.icon.brand;
                    boolean changedInstance2 = (i4 == 32) | gapComposer3.changedInstance(activePromotionViewModel);
                    Object rememberedValue2 = gapComposer3.rememberedValue();
                    if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
                        z = true;
                        final boolean z4 = true ? 1 : 0;
                        rememberedValue2 = new Function0() { // from class: com.squareup.cash.promotionsreferrals.views.promotionHomeComponents.ActivePromotionSectionListKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i5 = z4;
                                PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.ActivePromotionsSectionViewModel.ActivePromotionViewModel activePromotionViewModel2 = activePromotionViewModel;
                                Function1 function13 = function12;
                                switch (i5) {
                                    case 0:
                                        PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.PromotionCampaignTokens promotionCampaignTokens = activePromotionViewModel2.tokens;
                                        function13.invoke(new PromotionsReferralsHomeViewEvent.PromotionItemViewed(promotionCampaignTokens.campaignToken, promotionCampaignTokens.campaignVariantToken, PromotionsReferralsHomeViewEvent.PromotionItemViewed.CurrentPromotionState.ACTIVE));
                                        break;
                                    default:
                                        String str22 = activePromotionViewModel2.actionUrl;
                                        PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.PromotionCampaignTokens promotionCampaignTokens2 = activePromotionViewModel2.tokens;
                                        function13.invoke(new PromotionsReferralsHomeViewEvent.ActivePromotionTapped(str22, promotionCampaignTokens2.campaignToken, promotionCampaignTokens2.campaignVariantToken));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer3.updateRememberedValue(rememberedValue2);
                    } else {
                        z = true;
                    }
                    GapComposer gapComposer4 = gapComposer3;
                    PendingIntentCompat.m1088PromotionItemnBX6wN0(0, 0, j, j2, gapComposer4, then, icons2, str3, str4, (Function0) rememberedValue2);
                    companion = companion;
                    z3 = 0;
                    z2 = z;
                    gapComposer3 = gapComposer4;
                    it = it2;
                }
                boolean z5 = z2;
                Boxes$$ExternalSyntheticOutline1.m(gapComposer3, z3, z5, z5);
                modifier2 = companion;
                gapComposer = gapComposer3;
            } else {
                gapComposer2.skipToGroupEnd();
                modifier2 = modifier;
                gapComposer = gapComposer2;
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3(modifier2, (Object) activePromotionsSectionViewModel2, function1, i, 2);
            }
        }

        public static List getActiveNotifications(NotificationManager notificationManager) {
            StatusBarNotification[] activeNotifications = notificationManager.getActiveNotifications();
            return activeNotifications == null ? new ArrayList() : Arrays.asList(activeNotifications);
        }

        public static List getDeepLinkSpecs() {
            return ClientRoute.DeprecatedViewEarningsTracker.deepLinkSpecs;
        }
    }

    /* loaded from: classes3.dex */
    public abstract class Api26Impl {
        /* JADX WARN: Multi-variable type inference failed */
        public static final void AvailablePromotionSectionList(PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.AvailablePromotionsSectionViewModel availablePromotionsSectionViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
            Function1 function12;
            Modifier modifier2;
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
            int i2;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
            BiasAlignment.Horizontal horizontal;
            final int i3;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
            float f;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13;
            Modifier.Companion companion;
            final Function1 function13;
            Modifier then;
            final int i4;
            PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.AvailablePromotionsSectionViewModel availablePromotionsSectionViewModel2 = availablePromotionsSectionViewModel;
            availablePromotionsSectionViewModel2.getClass();
            function1.getClass();
            GapComposer gapComposer = (GapComposer) composer;
            gapComposer.startRestartGroup(754149920);
            Applier applier = gapComposer.applier;
            int i5 = i | (gapComposer.changedInstance(availablePromotionsSectionViewModel2) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
            if (gapComposer.shouldExecute(i5 & 1, (i5 & 147) != 146)) {
                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer, 0);
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
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$14);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$15);
                Integer valueOf = Integer.valueOf(hashCode);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$16);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$17);
                String str = availablePromotionsSectionViewModel2.titleText;
                if (str == null) {
                    gapComposer.startReplaceGroup(-1731826934);
                    gapComposer.end(false);
                    i2 = i5;
                    i3 = 0;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                    horizontal = horizontal2;
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                    f = 1.0f;
                    companion = companion2;
                } else {
                    gapComposer.startReplaceGroup(-1731826933);
                    ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                    i2 = i5;
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$17;
                    horizontal = horizontal2;
                    i3 = 0;
                    composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                    f = 1.0f;
                    composeUiNode$Companion$SetModifier$13 = composeUiNode$Companion$SetModifier$16;
                    companion = companion2;
                    ViewfinderDefaults.SectionHeader(str, (Modifier) null, (String) null, (Function0) null, (String) null, gapComposer, 0, 30);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
                    gapComposer.end(false);
                }
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, f);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), horizontal, gapComposer, i3);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth2);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$14);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$1);
                gapComposer.startReplaceGroup(885166130);
                availablePromotionsSectionViewModel2 = availablePromotionsSectionViewModel;
                for (final PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.AvailablePromotionsSectionViewModel.AvailablePromotionViewModel availablePromotionViewModel : availablePromotionsSectionViewModel2.promotions) {
                    int i6 = i2 & 112;
                    int i7 = (gapComposer.changedInstance(availablePromotionViewModel) ? 1 : 0) | (i6 == 32 ? 1 : i3);
                    Object rememberedValue = gapComposer.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (i7 != 0 || rememberedValue == neverEqualPolicy) {
                        function13 = function1;
                        rememberedValue = new Function0() { // from class: com.squareup.cash.promotionsreferrals.views.promotionHomeComponents.AvailablePromotionSectionListKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i8 = i3;
                                PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.AvailablePromotionsSectionViewModel.AvailablePromotionViewModel availablePromotionViewModel2 = availablePromotionViewModel;
                                Function1 function14 = function13;
                                switch (i8) {
                                    case 0:
                                        PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.PromotionCampaignTokens promotionCampaignTokens = availablePromotionViewModel2.tokens;
                                        function14.invoke(new PromotionsReferralsHomeViewEvent.PromotionItemViewed(promotionCampaignTokens.campaignToken, promotionCampaignTokens.campaignVariantToken, PromotionsReferralsHomeViewEvent.PromotionItemViewed.CurrentPromotionState.AVAILABLE));
                                        break;
                                    default:
                                        String str2 = availablePromotionViewModel2.actionUrl;
                                        PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.PromotionCampaignTokens promotionCampaignTokens2 = availablePromotionViewModel2.tokens;
                                        function14.invoke(new PromotionsReferralsHomeViewEvent.AvailablePromotionTapped(str2, promotionCampaignTokens2.campaignToken, promotionCampaignTokens2.campaignVariantToken));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue);
                    } else {
                        function13 = function1;
                    }
                    then = companion.then(new OnFirstVisibleElement((Function0) rememberedValue));
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(then, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    String str2 = availablePromotionViewModel.titleText;
                    String str3 = availablePromotionViewModel.subtitleText;
                    String str4 = availablePromotionViewModel.callToActionText;
                    PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.RemoteImage.ImageUrl imageUrl = availablePromotionViewModel.image.url;
                    Image image = new Image(imageUrl.light, imageUrl.dark, 4);
                    boolean changedInstance = (i6 == 32) | gapComposer.changedInstance(availablePromotionViewModel);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        i4 = 1;
                        rememberedValue2 = new Function0() { // from class: com.squareup.cash.promotionsreferrals.views.promotionHomeComponents.AvailablePromotionSectionListKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i8 = i4;
                                PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.AvailablePromotionsSectionViewModel.AvailablePromotionViewModel availablePromotionViewModel2 = availablePromotionViewModel;
                                Function1 function14 = function13;
                                switch (i8) {
                                    case 0:
                                        PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.PromotionCampaignTokens promotionCampaignTokens = availablePromotionViewModel2.tokens;
                                        function14.invoke(new PromotionsReferralsHomeViewEvent.PromotionItemViewed(promotionCampaignTokens.campaignToken, promotionCampaignTokens.campaignVariantToken, PromotionsReferralsHomeViewEvent.PromotionItemViewed.CurrentPromotionState.AVAILABLE));
                                        break;
                                    default:
                                        String str22 = availablePromotionViewModel2.actionUrl;
                                        PromotionsReferralsHomeViewModel.Loaded.PromotionsListViewModel.PromotionCampaignTokens promotionCampaignTokens2 = availablePromotionViewModel2.tokens;
                                        function14.invoke(new PromotionsReferralsHomeViewEvent.AvailablePromotionTapped(str22, promotionCampaignTokens2.campaignToken, promotionCampaignTokens2.campaignVariantToken));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer.updateRememberedValue(rememberedValue2);
                    } else {
                        i4 = 1;
                    }
                    GapComposer gapComposer2 = gapComposer;
                    Api28Impl.CompactPromotionCard(m300paddingVpY3zN4$default, str2, str3, str4, image, (Function0) rememberedValue2, gapComposer2, 0, 416);
                    gapComposer = gapComposer2;
                    i3 = 0;
                }
                function12 = function1;
                Boxes$$ExternalSyntheticOutline1.m(gapComposer, (boolean) i3, true, true);
                modifier2 = companion;
            } else {
                function12 = function1;
                gapComposer.skipToGroupEnd();
                modifier2 = modifier;
            }
            RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new RetroUiFactory$$ExternalSyntheticLambda3(modifier2, (Object) availablePromotionsSectionViewModel2, function12, i, 3);
            }
        }

        public static void createNotificationChannel(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        public static void createNotificationChannelGroup(NotificationManager notificationManager, NotificationChannelGroup notificationChannelGroup) {
            notificationManager.createNotificationChannelGroup(notificationChannelGroup);
        }

        public static void createNotificationChannelGroups(NotificationManager notificationManager, List list) {
            notificationManager.createNotificationChannelGroups(list);
        }

        public static void createNotificationChannels(NotificationManager notificationManager, List list) {
            notificationManager.createNotificationChannels(list);
        }

        public static void deleteNotificationChannel(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        public static void deleteNotificationChannelGroup(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannelGroup(str);
        }

        public static List getDeepLinkSpecs() {
            return ClientRoute.DeprecatedViewGiftCardStore.deepLinkSpecs;
        }

        public static String getId(NotificationChannel notificationChannel) {
            return notificationChannel.getId();
        }

        public static NotificationChannel getNotificationChannel(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }

        public static List getNotificationChannelGroups(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannelGroups();
        }

        public static List getNotificationChannels(NotificationManager notificationManager) {
            return notificationManager.getNotificationChannels();
        }
    }

    /* loaded from: classes3.dex */
    public abstract class Api28Impl {
        public static final void CompactPromotionCard(Modifier modifier, String str, String str2, String str3, Image image, Function0 function0, Composer composer, int i, int i2) {
            Modifier modifier2;
            int i3;
            Modifier modifier3;
            GapComposer gapComposer;
            String str4;
            boolean z;
            str.getClass();
            GapComposer gapComposer2 = (GapComposer) composer;
            gapComposer2.startRestartGroup(-675020119);
            Applier applier = gapComposer2.applier;
            int i4 = i2 & 1;
            if (i4 != 0) {
                i3 = i | 6;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                i3 = (gapComposer2.changed(modifier2) ? 4 : 2) | i;
            }
            if ((i & 48) == 0) {
                i3 |= gapComposer2.changed(str) ? 32 : 16;
            }
            if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
                i3 |= gapComposer2.changed(str2) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= gapComposer2.changed(str3) ? 2048 : 1024;
            }
            int i5 = i3 | (gapComposer2.changedInstance(image) ? 16384 : PKIFailureInfo.certRevoked) | 196608;
            if ((1572864 & i) == 0) {
                i5 |= gapComposer2.changedInstance(function0) ? 1048576 : PKIFailureInfo.signerNotTrusted;
            }
            int i6 = i5 | 113246208;
            if (gapComposer2.shouldExecute(i6 & 1, (i6 & 38347923) != 38347922)) {
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier modifier4 = i4 != 0 ? companion : modifier2;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier4, 1.0f);
                Strings.getSizes(gapComposer2).getClass();
                Object obj = DefaultSizes.border.annotationsMap;
                SolidColor solidColor = new SolidColor(Strings.getColors(gapComposer2).semantic.border.subtle);
                Strings.getSizes(gapComposer2).getClass();
                Modifier m179borderziNgDLE = ImageKt.m179borderziNgDLE(fillMaxWidth, 1.0f, solidColor, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                Strings.getSizes(gapComposer2).getClass();
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(m179borderziNgDLE, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), Strings.getColors(gapComposer2).semantic.background.f1047app, ColorKt.RectangleShape);
                boolean z2 = function0 != null;
                boolean z3 = (i6 & 3670016) == 1048576;
                Object rememberedValue = gapComposer2.rememberedValue();
                if (z3 || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ToViewKt$$ExternalSyntheticLambda2(23, function0);
                    gapComposer = gapComposer2;
                    gapComposer.updateRememberedValue(rememberedValue);
                } else {
                    gapComposer = gapComposer2;
                }
                Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(m177backgroundbw27NRU, z2, null, null, (Function0) rememberedValue, 14);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m183clickableoSLSa3U$default);
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
                Modifier modifier5 = modifier4;
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
                Strings.getSizes(gapComposer).getClass();
                zzc zzcVar = DefaultSizes.spacing;
                zzcVar.getClass();
                Strings.getSizes(gapComposer).getClass();
                Strings.getSizes(gapComposer).getClass();
                Modifier m301paddingqDBjuR0 = SpacerKt.m301paddingqDBjuR0(companion, 20.0f, 16.0f, 16.0f, 16.0f);
                Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
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
                Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer, 48);
                int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, fillMaxWidth2);
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
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Modifier weight = rowScopeInstance.weight(1.0f, companion, true);
                Strings.getSizes(gapComposer).getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(weight, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, 11);
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
                int hashCode4 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                Recorder$$ExternalSyntheticOutline2.m(hashCode4, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(gapComposer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                GapComposer gapComposer3 = gapComposer;
                Room.m1165Text25TpFw(2, 2, 0, 0, ((i6 >> 3) & 14) | 1769472, 0, 3994, 0L, (Composer) gapComposer3, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer2 = gapComposer3;
                if (str2 == null || StringsKt.isBlank(str2)) {
                    gapComposer2.startReplaceGroup(-499469201);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-499899729);
                    Updater.CompositionLocalProvider(new ProvidedValue[]{ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(Strings.getTypography(gapComposer2).bodyMedium), re$$ExternalSyntheticOutline0.m(Strings.getColors(gapComposer2).semantic.text.subtle, ArcadeThemeKt.LocalTextColor)}, Expect_jvmKt.rememberComposableLambda(1585663320, new InfoSectionKt$$ExternalSyntheticLambda7(str2, 10), gapComposer2), gapComposer2, 56);
                    gapComposer2.end(false);
                }
                gapComposer2.end(true);
                gapComposer2.startReplaceGroup(181392226);
                if (Strings.getColors(gapComposer2).isLight) {
                    str4 = image.light_url;
                } else {
                    str4 = image.dark_url;
                    if (str4 == null || StringsKt.isBlank(str4)) {
                        str4 = null;
                    }
                    if (str4 == null) {
                        str4 = image.light_url;
                    }
                }
                if (str4 == null) {
                    gapComposer2.startReplaceGroup(1247817101);
                    gapComposer2.end(false);
                    z = true;
                } else {
                    gapComposer2.startReplaceGroup(1247817102);
                    RealImageLoader realImageLoader = (RealImageLoader) gapComposer2.consume(LocalImageLoaderKt.LocalImageLoader);
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 104.0f);
                    Strings.getSizes(gapComposer2).getClass();
                    z = true;
                    AsyncImageKt.m1441AsyncImagesKDTAoQ(str4, null, realImageLoader, ClipKt.clip(m285size3ABfNKs, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(8.0f)), null, ContentScale.Companion.FillBounds, null, gapComposer2, 12582960, 0, 3952);
                    gapComposer2 = gapComposer2;
                    gapComposer2.end(false);
                }
                gapComposer2.end(false);
                gapComposer2.end(z);
                if (str3 == null || StringsKt.isBlank(str3)) {
                    gapComposer2.startReplaceGroup(-722071051);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-723331883);
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                    Arrangement$Center$1 arrangement$Center$1 = SpacerKt.SpaceBetween;
                    BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                    RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$Center$1, vertical, gapComposer2, 54);
                    int hashCode5 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(gapComposer2, fillMaxWidth3);
                    gapComposer2.startReusableNode();
                    if (gapComposer2.inserting) {
                        gapComposer2.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer2.useNode();
                    }
                    Updater.m576setimpl(gapComposer2, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode5, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer2, materializeModifier5, composeUiNode$Companion$SetModifier$14);
                    if (str3 == null || StringsKt.isBlank(str3)) {
                        gapComposer2.startReplaceGroup(1819031286);
                        SpacerKt.Spacer(gapComposer2, rowScopeInstance.weight(1.0f, companion, z));
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(1818495823);
                        Strings.getSizes(gapComposer2).getClass();
                        zzcVar.getClass();
                        RowMeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(8.0f, z, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, gapComposer2, 48);
                        int hashCode6 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope6 = gapComposer2.currentCompositionLocalScope();
                        Modifier materializeModifier6 = PlatformKt.materializeModifier(gapComposer2, companion);
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
                        Updater.m576setimpl(gapComposer2, rowMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer2, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode6, gapComposer2, composeUiNode$Companion$SetModifier$13, gapComposer2, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer2, materializeModifier6, composeUiNode$Companion$SetModifier$14);
                        Room.m1165Text25TpFw(0, 0, 0, 0, (i6 >> 9) & 14, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, Strings.getTypography(gapComposer2).labelMedium, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4090, 0L, (Composer) gapComposer2, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer2).labelMedium, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 0, Strings.getTypography(gapComposer2).labelMedium.spanStyle.fontSize, null, null, 0, 16646143), (TextLineBalancing) null, "→", (Map) null, (Function1) null, false);
                        gapComposer2.end(z);
                        gapComposer2.end(false);
                    }
                    gapComposer2.startReplaceGroup(1819524372);
                    gapComposer2.end(false);
                    gapComposer2.end(z);
                    gapComposer2.end(false);
                }
                gapComposer2.end(z);
                gapComposer2.end(z);
                modifier3 = modifier5;
            } else {
                gapComposer2.skipToGroupEnd();
                modifier3 = modifier2;
            }
            RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(modifier3, str, str2, (Object) str3, (Object) image, function0, i, i2, 23);
            }
        }

        public static EmptyList getDeepLinkSpecs() {
            return ClientRoute.DeprecatedViewGroupDetails.deepLinkSpecs;
        }

        public static NotificationChannelGroup getNotificationChannelGroup(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannelGroup(str);
        }
    }

    /* loaded from: classes3.dex */
    public final class NotifyTask implements Task {
        public final int id;
        public final Notification notif;
        public final String packageName;
        public final String tag;

        public NotifyTask(String str, int i, String str2, Notification notification) {
            this.packageName = str;
            this.id = i;
            this.tag = str2;
            this.notif = notification;
        }

        public final void send(INotificationSideChannel iNotificationSideChannel) {
            String str = this.packageName;
            int i = this.id;
            String str2 = this.tag;
            Notification notification = this.notif;
            INotificationSideChannel.Stub.Proxy proxy = (INotificationSideChannel.Stub.Proxy) iNotificationSideChannel;
            proxy.getClass();
            Parcel obtain = Parcel.obtain();
            try {
                obtain.writeInterfaceToken(INotificationSideChannel.DESCRIPTOR);
                obtain.writeString(str);
                obtain.writeInt(i);
                obtain.writeString(str2);
                obtain.writeTypedObject(notification, 0);
                proxy.mRemote.transact(1, obtain, null, 1);
            } finally {
                obtain.recycle();
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
            sb.append(this.packageName);
            sb.append(", id:");
            sb.append(this.id);
            sb.append(", tag:");
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.tag, "]");
        }
    }

    /* loaded from: classes3.dex */
    public final class ServiceConnectedEvent {
        public final ComponentName componentName;
        public final IBinder iBinder;

        public ServiceConnectedEvent(ComponentName componentName, IBinder iBinder) {
            this.componentName = componentName;
            this.iBinder = iBinder;
        }
    }

    /* loaded from: classes3.dex */
    public final class SideChannelManager implements Handler.Callback, ServiceConnection {
        public final Context mContext;
        public final Handler mHandler;
        public final HashMap mRecordMap = new HashMap();
        public Set mCachedEnabledPackages = new HashSet();

        public final class ListenerRecord {
            public final ComponentName componentName;
            public INotificationSideChannel service;
            public boolean bound = false;
            public final ArrayDeque taskQueue = new ArrayDeque();
            public int retryCount = 0;

            public ListenerRecord(ComponentName componentName) {
                this.componentName = componentName;
            }
        }

        public SideChannelManager(Context context) {
            this.mContext = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            handlerThread.start();
            this.mHandler = new Handler(handlerThread.getLooper(), this);
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            int i = message.what;
            INotificationSideChannel iNotificationSideChannel = null;
            Context context = this.mContext;
            HashMap hashMap = this.mRecordMap;
            if (i == 0) {
                Task task = (Task) message.obj;
                Set<String> enabledListenerPackages = NotificationManagerCompat.getEnabledListenerPackages(context);
                if (!enabledListenerPackages.equals(this.mCachedEnabledPackages)) {
                    this.mCachedEnabledPackages = enabledListenerPackages;
                    List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(new Intent().setAction(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL), 0);
                    HashSet hashSet = new HashSet();
                    for (ResolveInfo resolveInfo : queryIntentServices) {
                        if (enabledListenerPackages.contains(resolveInfo.serviceInfo.packageName)) {
                            ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                            ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                            if (resolveInfo.serviceInfo.permission != null) {
                                Log.w(NotificationManagerCompat.TAG, "Permission present on component " + componentName + ", not adding listener record.");
                            } else {
                                hashSet.add(componentName);
                            }
                        }
                    }
                    Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        ComponentName componentName2 = (ComponentName) it.next();
                        if (!hashMap.containsKey(componentName2)) {
                            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                                Log.d(NotificationManagerCompat.TAG, "Adding listener record for " + componentName2);
                            }
                            hashMap.put(componentName2, new ListenerRecord(componentName2));
                        }
                    }
                    Iterator it2 = hashMap.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry entry = (Map.Entry) it2.next();
                        if (!hashSet.contains(entry.getKey())) {
                            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                                Log.d(NotificationManagerCompat.TAG, "Removing listener record for " + entry.getKey());
                            }
                            ListenerRecord listenerRecord = (ListenerRecord) entry.getValue();
                            if (listenerRecord.bound) {
                                context.unbindService(this);
                                listenerRecord.bound = false;
                            }
                            listenerRecord.service = null;
                            it2.remove();
                        }
                    }
                }
                for (ListenerRecord listenerRecord2 : hashMap.values()) {
                    listenerRecord2.taskQueue.add(task);
                    processListenerQueue(listenerRecord2);
                }
            } else if (i == 1) {
                ServiceConnectedEvent serviceConnectedEvent = (ServiceConnectedEvent) message.obj;
                ComponentName componentName3 = serviceConnectedEvent.componentName;
                IBinder iBinder = serviceConnectedEvent.iBinder;
                ListenerRecord listenerRecord3 = (ListenerRecord) hashMap.get(componentName3);
                if (listenerRecord3 != null) {
                    int i2 = INotificationSideChannel.Stub.$r8$clinit;
                    if (iBinder != null) {
                        IInterface queryLocalInterface = iBinder.queryLocalInterface(INotificationSideChannel.DESCRIPTOR);
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof INotificationSideChannel)) {
                            INotificationSideChannel.Stub.Proxy proxy = new INotificationSideChannel.Stub.Proxy();
                            proxy.mRemote = iBinder;
                            iNotificationSideChannel = proxy;
                        } else {
                            iNotificationSideChannel = (INotificationSideChannel) queryLocalInterface;
                        }
                    }
                    listenerRecord3.service = iNotificationSideChannel;
                    listenerRecord3.retryCount = 0;
                    processListenerQueue(listenerRecord3);
                    return true;
                }
            } else if (i == 2) {
                ListenerRecord listenerRecord4 = (ListenerRecord) hashMap.get((ComponentName) message.obj);
                if (listenerRecord4 != null) {
                    if (listenerRecord4.bound) {
                        context.unbindService(this);
                        listenerRecord4.bound = false;
                    }
                    listenerRecord4.service = null;
                    return true;
                }
            } else {
                if (i != 3) {
                    return false;
                }
                ListenerRecord listenerRecord5 = (ListenerRecord) hashMap.get((ComponentName) message.obj);
                if (listenerRecord5 != null) {
                    processListenerQueue(listenerRecord5);
                    return true;
                }
            }
            return true;
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Connected to service " + componentName);
            }
            this.mHandler.obtainMessage(1, new ServiceConnectedEvent(componentName, iBinder)).sendToTarget();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Disconnected from service " + componentName);
            }
            this.mHandler.obtainMessage(2, componentName).sendToTarget();
        }

        public final void processListenerQueue(ListenerRecord listenerRecord) {
            boolean z;
            ArrayDeque arrayDeque = listenerRecord.taskQueue;
            ComponentName componentName = listenerRecord.componentName;
            if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                Log.d(NotificationManagerCompat.TAG, "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            if (listenerRecord.bound) {
                z = true;
            } else {
                Intent component = new Intent(NotificationManagerCompat.ACTION_BIND_SIDE_CHANNEL).setComponent(componentName);
                Context context = this.mContext;
                boolean bindService = context.bindService(component, this, 33);
                listenerRecord.bound = bindService;
                if (bindService) {
                    listenerRecord.retryCount = 0;
                } else {
                    Log.w(NotificationManagerCompat.TAG, "Unable to bind to listener " + componentName);
                    context.unbindService(this);
                }
                z = listenerRecord.bound;
            }
            if (!z || listenerRecord.service == null) {
                scheduleListenerRetry(listenerRecord);
                return;
            }
            while (true) {
                Task task = (Task) arrayDeque.peek();
                if (task == null) {
                    break;
                }
                try {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Log.d(NotificationManagerCompat.TAG, "Sending task " + task);
                    }
                    ((NotifyTask) task).send(listenerRecord.service);
                    arrayDeque.remove();
                } catch (DeadObjectException unused) {
                    if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                        Log.d(NotificationManagerCompat.TAG, "Remote service has died: " + componentName);
                    }
                } catch (RemoteException e) {
                    Log.w(NotificationManagerCompat.TAG, "RemoteException communicating with " + componentName, e);
                }
            }
            if (arrayDeque.isEmpty()) {
                return;
            }
            scheduleListenerRetry(listenerRecord);
        }

        public final void queueTask(Task task) {
            this.mHandler.obtainMessage(0, task).sendToTarget();
        }

        public final void scheduleListenerRetry(ListenerRecord listenerRecord) {
            ComponentName componentName = listenerRecord.componentName;
            ArrayDeque arrayDeque = listenerRecord.taskQueue;
            Handler handler = this.mHandler;
            if (handler.hasMessages(3, componentName)) {
                return;
            }
            int i = listenerRecord.retryCount;
            int i2 = i + 1;
            listenerRecord.retryCount = i2;
            if (i2 <= 6) {
                int i3 = (1 << i) * 1000;
                if (Log.isLoggable(NotificationManagerCompat.TAG, 3)) {
                    Log.d(NotificationManagerCompat.TAG, "Scheduling retry for " + i3 + " ms");
                }
                handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
                return;
            }
            Log.w(NotificationManagerCompat.TAG, "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + listenerRecord.retryCount + " retries");
            arrayDeque.clear();
        }
    }

    /* loaded from: classes3.dex */
    public interface Task {
    }

    private NotificationManagerCompat(Context context) {
        this.mContext = context;
        this.mNotificationManager = (NotificationManager) context.getSystemService("notification");
    }

    public static NotificationManagerCompat from(Context context) {
        return new NotificationManagerCompat(context);
    }

    public static Set<String> getEnabledListenerPackages(Context context) {
        Set<String> set;
        String string2 = Settings.Secure.getString(context.getContentResolver(), SETTING_ENABLED_NOTIFICATION_LISTENERS);
        synchronized (sEnabledNotificationListenersLock) {
            if (string2 != null) {
                try {
                    if (!string2.equals(sEnabledNotificationListeners)) {
                        String[] split = string2.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String str : split) {
                            ComponentName unflattenFromString = ComponentName.unflattenFromString(str);
                            if (unflattenFromString != null) {
                                hashSet.add(unflattenFromString.getPackageName());
                            }
                        }
                        sEnabledNotificationListenerPackages = hashSet;
                        sEnabledNotificationListeners = string2;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            set = sEnabledNotificationListenerPackages;
        }
        return set;
    }

    private void pushSideChannelQueue(Task task) {
        synchronized (sLock) {
            try {
                if (sSideChannelManager == null) {
                    sSideChannelManager = new SideChannelManager(this.mContext.getApplicationContext());
                }
                sSideChannelManager.queueTask(task);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private static boolean useSideChannelForNotification(Notification notification) {
        Bundle extras = NotificationCompat.getExtras(notification);
        return extras != null && extras.getBoolean(EXTRA_USE_SIDE_CHANNEL);
    }

    public boolean areNotificationsEnabled() {
        return this.mNotificationManager.areNotificationsEnabled();
    }

    public boolean canPostPromotedNotifications() {
        if (Build.VERSION.SDK_INT >= 36) {
            return NavigationEvent_androidKt.canPostPromotedNotifications(this.mNotificationManager);
        }
        return false;
    }

    public boolean canUseFullScreenIntent() {
        return Build.VERSION.SDK_INT < 34 ? this.mContext.checkSelfPermission("android.permission.USE_FULL_SCREEN_INTENT") == 0 : PlayerView.Api34.canUseFullScreenIntent(this.mNotificationManager);
    }

    public void cancel(String str, int i) {
        this.mNotificationManager.cancel(str, i);
    }

    public void cancelAll() {
        this.mNotificationManager.cancelAll();
    }

    public void createNotificationChannel(NotificationChannelCompat notificationChannelCompat) {
        createNotificationChannel(notificationChannelCompat.getNotificationChannel());
    }

    public void createNotificationChannelGroup(NotificationChannelGroupCompat notificationChannelGroupCompat) {
        createNotificationChannelGroup(notificationChannelGroupCompat.getNotificationChannelGroup());
    }

    public void createNotificationChannelGroups(List<NotificationChannelGroup> list) {
        Api26Impl.createNotificationChannelGroups(this.mNotificationManager, list);
    }

    public void createNotificationChannelGroupsCompat(List<NotificationChannelGroupCompat> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<NotificationChannelGroupCompat> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getNotificationChannelGroup());
        }
        Api26Impl.createNotificationChannelGroups(this.mNotificationManager, arrayList);
    }

    public void createNotificationChannels(List<NotificationChannel> list) {
        Api26Impl.createNotificationChannels(this.mNotificationManager, list);
    }

    public void createNotificationChannelsCompat(List<NotificationChannelCompat> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<NotificationChannelCompat> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getNotificationChannel());
        }
        Api26Impl.createNotificationChannels(this.mNotificationManager, arrayList);
    }

    public void deleteNotificationChannel(String str) {
        Api26Impl.deleteNotificationChannel(this.mNotificationManager, str);
    }

    public void deleteNotificationChannelGroup(String str) {
        Api26Impl.deleteNotificationChannelGroup(this.mNotificationManager, str);
    }

    public void deleteUnlistedNotificationChannels(Collection<String> collection) {
        String parentChannelId;
        for (NotificationChannel notificationChannel : Api26Impl.getNotificationChannels(this.mNotificationManager)) {
            if (!collection.contains(Api26Impl.getId(notificationChannel))) {
                if (Build.VERSION.SDK_INT >= 30) {
                    parentChannelId = notificationChannel.getParentChannelId();
                    if (collection.contains(parentChannelId)) {
                    }
                }
                Api26Impl.deleteNotificationChannel(this.mNotificationManager, Api26Impl.getId(notificationChannel));
            }
        }
    }

    public List<StatusBarNotification> getActiveNotifications() {
        return Api23Impl.getActiveNotifications(this.mNotificationManager);
    }

    public int getCurrentInterruptionFilter() {
        return this.mNotificationManager.getCurrentInterruptionFilter();
    }

    public int getImportance() {
        return this.mNotificationManager.getImportance();
    }

    public NotificationChannel getNotificationChannel(String str, String str2) {
        return Build.VERSION.SDK_INT >= 30 ? WindowCompat$Api35Impl.getNotificationChannel(this.mNotificationManager, str, str2) : getNotificationChannel(str);
    }

    public NotificationChannelCompat getNotificationChannelCompat(String str) {
        NotificationChannel notificationChannel = getNotificationChannel(str);
        if (notificationChannel != null) {
            return new NotificationChannelCompat(notificationChannel);
        }
        return null;
    }

    public NotificationChannelGroup getNotificationChannelGroup(String str) {
        return Api28Impl.getNotificationChannelGroup(this.mNotificationManager, str);
    }

    public NotificationChannelGroupCompat getNotificationChannelGroupCompat(String str) {
        NotificationChannelGroup notificationChannelGroup = getNotificationChannelGroup(str);
        if (notificationChannelGroup != null) {
            return new NotificationChannelGroupCompat(notificationChannelGroup);
        }
        return null;
    }

    public List<NotificationChannelGroup> getNotificationChannelGroups() {
        return Api26Impl.getNotificationChannelGroups(this.mNotificationManager);
    }

    public List<NotificationChannelGroupCompat> getNotificationChannelGroupsCompat() {
        List<NotificationChannelGroup> notificationChannelGroups = getNotificationChannelGroups();
        if (notificationChannelGroups.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(notificationChannelGroups.size());
        Iterator<NotificationChannelGroup> it = notificationChannelGroups.iterator();
        while (it.hasNext()) {
            arrayList.add(new NotificationChannelGroupCompat(it.next()));
        }
        return arrayList;
    }

    public List<NotificationChannel> getNotificationChannels() {
        return Api26Impl.getNotificationChannels(this.mNotificationManager);
    }

    public List<NotificationChannelCompat> getNotificationChannelsCompat() {
        List<NotificationChannel> notificationChannels = getNotificationChannels();
        if (notificationChannels.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(notificationChannels.size());
        Iterator<NotificationChannel> it = notificationChannels.iterator();
        while (it.hasNext()) {
            arrayList.add(new NotificationChannelCompat(it.next()));
        }
        return arrayList;
    }

    public void notify(String str, int i, Notification notification) {
        if (!useSideChannelForNotification(notification)) {
            this.mNotificationManager.notify(str, i, notification);
        } else {
            pushSideChannelQueue(new NotifyTask(this.mContext.getPackageName(), i, str, notification));
            this.mNotificationManager.cancel(str, i);
        }
    }

    public void cancel(int i) {
        cancel(null, i);
    }

    public void createNotificationChannel(NotificationChannel notificationChannel) {
        Api26Impl.createNotificationChannel(this.mNotificationManager, notificationChannel);
    }

    public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup) {
        Api26Impl.createNotificationChannelGroup(this.mNotificationManager, notificationChannelGroup);
    }

    public NotificationChannelCompat getNotificationChannelCompat(String str, String str2) {
        NotificationChannel notificationChannel = getNotificationChannel(str, str2);
        if (notificationChannel != null) {
            return new NotificationChannelCompat(notificationChannel);
        }
        return null;
    }

    public NotificationManagerCompat(NotificationManager notificationManager, Context context) {
        this.mContext = context;
        this.mNotificationManager = notificationManager;
    }

    public NotificationChannel getNotificationChannel(String str) {
        return Api26Impl.getNotificationChannel(this.mNotificationManager, str);
    }

    public void notify(int i, Notification notification) {
        notify(null, i, notification);
    }

    public void notify(List<Object> list) {
        if (list.size() <= 0) {
            return;
        }
        JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(list.get(0));
        throw null;
    }
}
