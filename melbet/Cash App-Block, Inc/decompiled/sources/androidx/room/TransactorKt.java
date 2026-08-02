package androidx.room;

import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import androidx.arch.core.executor.ArchTaskExecutor$$ExternalSyntheticLambda0;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.MutableIntList;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.BoundsTransform;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.MutatorMutex$mutate$2;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.contextmenu.internal.AndroidTextContextMenuToolbarProvider_androidKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.material3.ButtonKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.DatePickerKt$$ExternalSyntheticLambda8;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.GeometryUtilsKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.ResourceFont;
import androidx.datastore.core.DataMigrationInitializer$Companion$runMigrations$1;
import androidx.datastore.core.DataStoreImpl$InitDataStore$doRun$initData$1$api$1;
import androidx.datastore.core.SimpleActor;
import androidx.emoji2.text.MetadataRepo;
import androidx.media3.ui.compose.PlayerSurfaceKt$$ExternalSyntheticLambda2;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.utils.NetworkRequest28;
import androidx.work.impl.utils.NetworkRequestCompat;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda4;
import app.cash.molecule.PlatformKt;
import app.cash.sqldelight.Transacter;
import app.cash.sqldelight.TransacterImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.Extras;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda1;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.bugsnag.android.internal.BackgroundTaskService;
import com.bugsnag.android.internal.TaskType;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.cloudmessaging.zzv;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahj;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaho;
import com.google.android.gms.internal.mlkit_vision_barcode.zzba;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.zzw;
import com.google.crypto.tink.Parameters;
import com.google.firebase.messaging.GmsRpc;
import com.google.mlkit.vision.text.zzc;
import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.components.BadgePlacement;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionKt$$ExternalSyntheticLambda4;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.treehouse.NavBarBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda5;
import com.squareup.cash.clientroutes.AccountRequirement;
import com.squareup.cash.clientroutes.AuthenticationRequirement;
import com.squareup.cash.clientroutes.ClientRouteSpec;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.LoadableContentKt$$ExternalSyntheticLambda4;
import com.squareup.cash.mooncake.compose_ui.components.LoadingIndicatorPosition;
import com.squareup.cash.offers.db.OffersHomeQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.payments.presenters.PaymentsPresenterFactory;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda5;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.protos.franklin.api.Blockers;
import com.squareup.util.cash.RedactPatterns;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.internal.ImmutableList;
import com.squareup.wire.internal.MutableOnWriteList;
import com.stripe.android.model.parsers.WalletJsonParser;
import com.withpersona.sdk2.inquiry.network.dto.ui.components.QRCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.text.MatcherMatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import okio.Buffer;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;
import papa.internal.Perfs$$ExternalSyntheticLambda4;

/* loaded from: classes.dex */
public abstract class TransactorKt {
    /* renamed from: -redactElements, reason: not valid java name */
    public static final LinkedHashMap m1170redactElements(Map map, ProtoAdapter protoAdapter) {
        map.getClass();
        protoAdapter.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), protoAdapter.redact(entry.getValue()));
        }
        return linkedHashMap;
    }

    public /* synthetic */ TransactorKt(BackgroundTaskService backgroundTaskService) {
        this(backgroundTaskService, TaskType.DEFAULT);
    }

    public static final void CustomAction(TitleBarActionScope titleBarActionScope, Modifier modifier, Badge badge, Function3 function3, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        Badge badge2;
        titleBarActionScope.getClass();
        function3.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2126369924);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 48;
            modifier2 = modifier;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 = (gapComposer.changed(modifier2) ? 32 : 16) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= (i & 512) == 0 ? gapComposer.changed(badge) : gapComposer.changedInstance(badge) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function3) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1169) != 1168)) {
            Modifier modifier3 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            Badge badge3 = i5 != 0 ? null : badge;
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SpacerKt.m300paddingVpY3zN4$default(modifier3, 12.0f, RecyclerView.DECELERATION_RATE, 2), 52.0f, RecyclerView.DECELERATION_RATE, 2);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new NavBarBinding$$ExternalSyntheticLambda2(19);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m279heightInVpY3zN4$default, true, (Function1) rememberedValue);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
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
            Room.BadgeAssetLayout(badge3, BadgePlacement.TitleBarCustom, null, false, Expect_jvmKt.rememberComposableLambda(-872173674, new ModalKt$$ExternalSyntheticLambda3(function3, 7), gapComposer), gapComposer, ((i3 >> 6) & 14) | 27696, 4);
            gapComposer.end(true);
            modifier2 = modifier3;
            badge2 = badge3;
        } else {
            gapComposer.skipToGroupEnd();
            badge2 = badge;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda5(titleBarActionScope, modifier2, badge2, function3, i, i2, 11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void IconAction(final TitleBarActionScope titleBarActionScope, Icons icons, String str, final Function0 function0, Modifier modifier, Function0 function02, Badge badge, ElementBoundsRegistry elementBoundsRegistry, ElementBoundsRegistry.Element element, SimpleActor simpleActor, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        Function0 function03;
        int i5;
        int i6;
        ElementBoundsRegistry elementBoundsRegistry2;
        int i7;
        int i8;
        int i9;
        int i10;
        Icons icons2;
        final String str2;
        final SimpleActor simpleActor2;
        final Function0 function04;
        GapComposer gapComposer;
        final ElementBoundsRegistry elementBoundsRegistry3;
        final Badge badge2;
        final ElementBoundsRegistry.Element element2;
        final boolean z2;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer2;
        Modifier modifier3;
        boolean z3;
        Modifier modifier4;
        titleBarActionScope.getClass();
        icons.getClass();
        str.getClass();
        function0.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1666424437);
        if ((i & 48) == 0) {
            i3 = (gapComposer3.changed(icons.ordinal()) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer3.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer3.changedInstance(function0) ? 2048 : 1024;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer3.changed(modifier2) ? 16384 : PKIFailureInfo.certRevoked;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                function03 = function02;
                i3 |= gapComposer3.changedInstance(function03) ? PKIFailureInfo.unsupportedVersion : 65536;
                i5 = i2 & 32;
                int i12 = 1572864;
                if (i5 == 0) {
                    if ((1572864 & i) == 0) {
                        i12 = (2097152 & i) == 0 ? gapComposer3.changed(badge) : gapComposer3.changedInstance(badge) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 12582912;
                    } else if ((12582912 & i) == 0) {
                        elementBoundsRegistry2 = elementBoundsRegistry;
                        i3 |= gapComposer3.changedInstance(elementBoundsRegistry2) ? 8388608 : 4194304;
                        i7 = i2 & 128;
                        int i13 = 100663296;
                        if (i7 == 0) {
                            if ((100663296 & i) == 0) {
                                i13 = gapComposer3.changed(element == null ? -1 : element.ordinal()) ? 67108864 : 33554432;
                            }
                            i8 = i2 & 256;
                            if (i8 == 0) {
                                i3 |= 805306368;
                            } else if ((i & 805306368) == 0) {
                                i3 |= gapComposer3.changedInstance(simpleActor) ? PKIFailureInfo.duplicateCertReq : 268435456;
                            }
                            i9 = i3;
                            i10 = i2 & 512;
                            if (gapComposer3.shouldExecute(i9 & 1, (i9 & 306783377) == 306783376 || ((i10 == 0 ? (char) 6 : gapComposer3.changed(z) ? (char) 4 : (char) 2) & 3) != 2)) {
                                icons2 = icons;
                                str2 = str;
                                gapComposer3.skipToGroupEnd();
                                simpleActor2 = simpleActor;
                                function04 = function03;
                                gapComposer = gapComposer3;
                                elementBoundsRegistry3 = elementBoundsRegistry2;
                                badge2 = badge;
                                element2 = element;
                                z2 = z;
                            } else {
                                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                                Modifier modifier5 = i11 != 0 ? companion : modifier2;
                                if (i4 != 0) {
                                    function03 = null;
                                }
                                Badge badge3 = i5 != 0 ? null : badge;
                                if (i6 != 0) {
                                    elementBoundsRegistry2 = null;
                                }
                                ElementBoundsRegistry.Element element3 = i7 != 0 ? null : element;
                                SimpleActor simpleActor3 = i8 != 0 ? null : simpleActor;
                                boolean z4 = i10 != 0 ? false : z;
                                BiasAlignment biasAlignment = Alignment.Companion.Center;
                                Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.m292widthInVpY3zN4$default(modifier5, 48.0f, RecyclerView.DECELERATION_RATE, 2), 52.0f, RecyclerView.DECELERATION_RATE, 2);
                                Object rememberedValue = gapComposer3.rememberedValue();
                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                if (rememberedValue == neverEqualPolicy) {
                                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer3);
                                }
                                Modifier modifier6 = modifier5;
                                Modifier m184combinedClickableauXiCPI$default = ImageKt.m184combinedClickableauXiCPI$default(m279heightInVpY3zN4$default, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer3, 432, 9), false, str, new Role(0), null, function03, PlatformKt.withHaptics(function0, null, gapComposer3, (i9 >> 9) & 14, 1), 420);
                                str2 = str;
                                Object rememberedValue2 = gapComposer3.rememberedValue();
                                int i14 = 18;
                                if (rememberedValue2 == neverEqualPolicy) {
                                    rememberedValue2 = new SvgDecoder$$ExternalSyntheticLambda0(i14);
                                    gapComposer2 = gapComposer3;
                                    gapComposer2.updateRememberedValue(rememberedValue2);
                                } else {
                                    gapComposer2 = gapComposer3;
                                }
                                Modifier semantics = SemanticsModifierKt.semantics(m184combinedClickableauXiCPI$default, true, (Function1) rememberedValue2);
                                if (elementBoundsRegistry2 != null && element3 != null) {
                                    if (element3 != ElementBoundsRegistry.Element.ToolbarMoneybotMenuItem) {
                                        modifier3 = WalletJsonParser.provideBounds(elementBoundsRegistry2, element3);
                                    } else if (z4) {
                                        modifier3 = WalletJsonParser.provideBounds(elementBoundsRegistry2, element3);
                                    }
                                    Modifier then = semantics.then(modifier3);
                                    if (simpleActor3 == null) {
                                        gapComposer2.startReplaceGroup(1078120497);
                                        SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) simpleActor3.consumeMessage;
                                        z3 = false;
                                        Object[] objArr = 0;
                                        SharedTransitionScope.SharedContentState rememberSharedContentState = sharedTransitionScope.rememberSharedContentState(simpleActor3.messageQueue, gapComposer2, 0);
                                        AnimatedVisibilityScope animatedVisibilityScope = (AnimatedVisibilityScope) simpleActor3.scope;
                                        Object rememberedValue3 = gapComposer2.rememberedValue();
                                        if (rememberedValue3 == neverEqualPolicy) {
                                            rememberedValue3 = new TitleBarActionKt$$ExternalSyntheticLambda4(objArr == true ? 1 : 0);
                                            gapComposer2.updateRememberedValue(rememberedValue3);
                                        }
                                        modifier4 = SharedTransitionScope.sharedBounds$default(sharedTransitionScope, companion, rememberSharedContentState, animatedVisibilityScope, null, null, (BoundsTransform) rememberedValue3, null, null, 1004);
                                        gapComposer2.end(false);
                                    } else {
                                        z3 = false;
                                        gapComposer2.startReplaceGroup(1078625301);
                                        gapComposer2.end(false);
                                        modifier4 = companion;
                                    }
                                    Modifier then2 = then.then(modifier4);
                                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z3);
                                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, then2);
                                    ComposeUiNode.Companion.getClass();
                                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                                    if (gapComposer2.applier != null) {
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
                                    icons2 = icons;
                                    Badge badge4 = badge3;
                                    Room.BadgeAssetLayout(badge4, BadgePlacement.TitleBarIcon, companion, false, Expect_jvmKt.rememberComposableLambda(620185913, new CashApp$$ExternalSyntheticLambda4(1, simpleActor3, icons2, str2), gapComposer2), gapComposer2, ((i9 >> 18) & 14) | 28080, 0);
                                    gapComposer2.end(true);
                                    function04 = function03;
                                    gapComposer = gapComposer2;
                                    elementBoundsRegistry3 = elementBoundsRegistry2;
                                    element2 = element3;
                                    simpleActor2 = simpleActor3;
                                    z2 = z4;
                                    modifier2 = modifier6;
                                    badge2 = badge4;
                                }
                                modifier3 = companion;
                                Modifier then3 = semantics.then(modifier3);
                                if (simpleActor3 == null) {
                                }
                                Modifier then22 = then3.then(modifier4);
                                MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z3);
                                int hashCode2 = Long.hashCode(gapComposer2.compositeKeyHashCode);
                                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer2.currentCompositionLocalScope();
                                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer2, then22);
                                ComposeUiNode.Companion.getClass();
                                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                                if (gapComposer2.applier != null) {
                                }
                            }
                            endRestartGroup = gapComposer.endRestartGroup();
                            if (endRestartGroup == null) {
                                final Icons icons3 = icons2;
                                endRestartGroup.block = new Function2() { // from class: com.squareup.cash.arcade.components.titlebar.TitleBarActionKt$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        ((Integer) obj2).getClass();
                                        int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                                        TransactorKt.IconAction(TitleBarActionScope.this, icons3, str2, function0, modifier2, function04, badge2, elementBoundsRegistry3, element2, simpleActor2, z2, (Composer) obj, updateChangedFlags, i2);
                                        return Unit.INSTANCE;
                                    }
                                };
                                return;
                            }
                            return;
                        }
                        i3 |= i13;
                        i8 = i2 & 256;
                        if (i8 == 0) {
                        }
                        i9 = i3;
                        i10 = i2 & 512;
                        if (gapComposer3.shouldExecute(i9 & 1, (i9 & 306783377) == 306783376 || ((i10 == 0 ? (char) 6 : gapComposer3.changed(z) ? (char) 4 : (char) 2) & 3) != 2)) {
                        }
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    elementBoundsRegistry2 = elementBoundsRegistry;
                    i7 = i2 & 128;
                    int i132 = 100663296;
                    if (i7 == 0) {
                    }
                    i3 |= i132;
                    i8 = i2 & 256;
                    if (i8 == 0) {
                    }
                    i9 = i3;
                    i10 = i2 & 512;
                    if (gapComposer3.shouldExecute(i9 & 1, (i9 & 306783377) == 306783376 || ((i10 == 0 ? (char) 6 : gapComposer3.changed(z) ? (char) 4 : (char) 2) & 3) != 2)) {
                    }
                    endRestartGroup = gapComposer.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i3 |= i12;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                elementBoundsRegistry2 = elementBoundsRegistry;
                i7 = i2 & 128;
                int i1322 = 100663296;
                if (i7 == 0) {
                }
                i3 |= i1322;
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                i9 = i3;
                i10 = i2 & 512;
                if (gapComposer3.shouldExecute(i9 & 1, (i9 & 306783377) == 306783376 || ((i10 == 0 ? (char) 6 : gapComposer3.changed(z) ? (char) 4 : (char) 2) & 3) != 2)) {
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            function03 = function02;
            i5 = i2 & 32;
            int i122 = 1572864;
            if (i5 == 0) {
            }
            i3 |= i122;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            elementBoundsRegistry2 = elementBoundsRegistry;
            i7 = i2 & 128;
            int i13222 = 100663296;
            if (i7 == 0) {
            }
            i3 |= i13222;
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            i9 = i3;
            i10 = i2 & 512;
            if (gapComposer3.shouldExecute(i9 & 1, (i9 & 306783377) == 306783376 || ((i10 == 0 ? (char) 6 : gapComposer3.changed(z) ? (char) 4 : (char) 2) & 3) != 2)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        function03 = function02;
        i5 = i2 & 32;
        int i1222 = 1572864;
        if (i5 == 0) {
        }
        i3 |= i1222;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        elementBoundsRegistry2 = elementBoundsRegistry;
        i7 = i2 & 128;
        int i132222 = 100663296;
        if (i7 == 0) {
        }
        i3 |= i132222;
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        i9 = i3;
        i10 = i2 & 512;
        if (gapComposer3.shouldExecute(i9 & 1, (i9 & 306783377) == 306783376 || ((i10 == 0 ? (char) 6 : gapComposer3.changed(z) ? (char) 4 : (char) 2) & 3) != 2)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadableContent(Object obj, boolean z, Modifier modifier, LoadingIndicatorPosition loadingIndicatorPosition, Function1 function1, Function3 function3, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        int i3;
        boolean z2;
        Modifier modifier2;
        int i4;
        Function1 function12;
        GapComposer gapComposer;
        LoadingIndicatorPosition loadingIndicatorPosition2;
        Function3 function32;
        Modifier modifier3;
        Function1 function13;
        RecomposeScopeImpl endRestartGroup;
        LoadingIndicatorPosition loadingIndicatorPosition3;
        Function1 function14;
        int i5;
        Function3 composableLambdaImpl2;
        Function1 function15;
        int i6;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(247133385);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer2.changed(obj) : gapComposer2.changedInstance(obj) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i3 |= gapComposer2.changed(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer2.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= gapComposer2.changed(loadingIndicatorPosition == null ? -1 : loadingIndicatorPosition.ordinal()) ? 2048 : 1024;
            }
            if ((i & 24576) != 0) {
                if ((i2 & 16) == 0) {
                    function12 = function1;
                    if (gapComposer2.changedInstance(function12)) {
                        i6 = 16384;
                        i3 |= i6;
                    }
                } else {
                    function12 = function1;
                }
                i6 = PKIFailureInfo.certRevoked;
                i3 |= i6;
            } else {
                function12 = function1;
            }
            if ((196608 & i) == 0) {
                i3 |= 65536;
            }
            if ((1572864 & i) == 0) {
                i3 |= gapComposer2.changedInstance(composableLambdaImpl) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
            }
            if (gapComposer2.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
                gapComposer = gapComposer2;
                gapComposer.skipToGroupEnd();
                loadingIndicatorPosition2 = loadingIndicatorPosition;
                function32 = function3;
                modifier3 = modifier2;
                function13 = function12;
            } else {
                gapComposer2.startDefaults();
                if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                    Modifier modifier4 = i7 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    loadingIndicatorPosition3 = i4 != 0 ? LoadingIndicatorPosition.CENTER : loadingIndicatorPosition;
                    if ((i2 & 16) != 0) {
                        function14 = new MainActivity$$ExternalSyntheticLambda5(9);
                        i3 &= -57345;
                    } else {
                        function14 = function12;
                    }
                    Modifier modifier5 = modifier4;
                    i5 = i3 & (-458753);
                    composableLambdaImpl2 = new ComposableLambdaImpl(new P2PListViewKt$$ExternalSyntheticLambda12(loadingIndicatorPosition3, 10), true, 673319550);
                    modifier3 = modifier5;
                    function15 = function14;
                } else {
                    gapComposer2.skipToGroupEnd();
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    i5 = i3 & (-458753);
                    modifier3 = modifier2;
                    function15 = function12;
                    loadingIndicatorPosition3 = loadingIndicatorPosition;
                    composableLambdaImpl2 = function3;
                }
                gapComposer2.endDefaults();
                Pair pair = new Pair(obj, Boolean.valueOf(z2));
                Object rememberedValue = gapComposer2.rememberedValue();
                int i8 = 6;
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new OffersHomeQueries$$ExternalSyntheticLambda1(i8);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                gapComposer = gapComposer2;
                AnimatedContentKt.AnimatedContent(pair, modifier3, function15, null, "LoadableContent", (Function1) rememberedValue, Expect_jvmKt.rememberComposableLambda(95403900, new LoadableContentKt$$ExternalSyntheticLambda4(composableLambdaImpl2, composableLambdaImpl, i5), gapComposer2), gapComposer, 1794048 | (i5 & 8) | ((i5 >> 3) & 112) | ((i5 >> 6) & 896), 8);
                function32 = composableLambdaImpl2;
                loadingIndicatorPosition2 = loadingIndicatorPosition3;
                function13 = function15;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new ButtonKt$$ExternalSyntheticLambda4(obj, z2, modifier3, loadingIndicatorPosition2, function13, function32, composableLambdaImpl, i, i2);
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i & 24576) != 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if (gapComposer2.shouldExecute(i3 & 1, (599187 & i3) == 599186)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void LoadingPlaceholder(Modifier modifier, LoadingIndicatorPosition loadingIndicatorPosition, Composer composer, int i, int i2) {
        Modifier modifier2;
        int i3;
        LoadingIndicatorPosition loadingIndicatorPosition2;
        Modifier modifier3;
        Modifier m302paddingqDBjuR0$default;
        BiasAlignment biasAlignment;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(154984849);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (gapComposer.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= gapComposer.changed(loadingIndicatorPosition == null ? -1 : loadingIndicatorPosition.ordinal()) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            Modifier modifier4 = i4 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
            LoadingIndicatorPosition loadingIndicatorPosition3 = i5 != 0 ? LoadingIndicatorPosition.CENTER : loadingIndicatorPosition;
            int ordinal = loadingIndicatorPosition3.ordinal();
            if (ordinal == 0) {
                m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(modifier4, 32.0f, 80.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12);
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                m302paddingqDBjuR0$default = modifier4;
            }
            int ordinal2 = loadingIndicatorPosition3.ordinal();
            if (ordinal2 == 0) {
                biasAlignment = Alignment.Companion.TopStart;
            } else {
                if (ordinal2 != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                biasAlignment = Alignment.Companion.Center;
            }
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ArcadeThemeKt.ArcadeTheme(null, null, null, KeypadKt.lambda$631649248, gapComposer, 3072, 7);
            gapComposer.end(true);
            modifier3 = modifier4;
            loadingIndicatorPosition2 = loadingIndicatorPosition3;
        } else {
            gapComposer.skipToGroupEnd();
            loadingIndicatorPosition2 = loadingIndicatorPosition;
            modifier3 = modifier2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PlayerSurfaceKt$$ExternalSyntheticLambda2(modifier3, (Object) loadingIndicatorPosition2, i, i2, 11);
        }
    }

    public static final void ProvideBasicTextContextMenu(Modifier modifier, ProvidableCompositionLocal providableCompositionLocal, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-714464401);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(providableCompositionLocal) ? 32 : 16;
        }
        int i3 = i & MLKEMEngine.KyberPolyBytes;
        ComposableLambdaImpl composableLambdaImpl2 = AndroidTextContextMenuToolbarProvider_androidKt.lambda$636288403;
        if (i3 == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 2048 : 1024;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = new ParcelableSnapshotMutableState(null, NeverEqualPolicy.INSTANCE);
                gapComposer.updateRememberedValue(parcelableSnapshotMutableState);
                rememberedValue = parcelableSnapshotMutableState;
            }
            BasicTextContextMenuProvider basicTextContextMenuProvider = basicTextContextMenuProvider(composableLambdaImpl2, gapComposer, (i2 >> 6) & 14);
            Updater.CompositionLocalProvider(providableCompositionLocal.defaultProvidedValue$runtime(basicTextContextMenuProvider), Expect_jvmKt.rememberComposableLambda(274270255, new DismissableToastKt$$ExternalSyntheticLambda4(modifier, (MutableState) rememberedValue, composableLambdaImpl, basicTextContextMenuProvider, 1), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DatePickerKt$$ExternalSyntheticLambda8(modifier, providableCompositionLocal, composableLambdaImpl, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0085 -> B:13:0x0065). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$runMigrations(List list, DataStoreImpl$InitDataStore$doRun$initData$1$api$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1, ContinuationImpl continuationImpl) {
        DataMigrationInitializer$Companion$runMigrations$1 dataMigrationInitializer$Companion$runMigrations$1;
        int i;
        List list2;
        Ref$ObjectRef ref$ObjectRef;
        Iterator it;
        Throwable th;
        if (continuationImpl instanceof DataMigrationInitializer$Companion$runMigrations$1) {
            dataMigrationInitializer$Companion$runMigrations$1 = (DataMigrationInitializer$Companion$runMigrations$1) continuationImpl;
            int i2 = dataMigrationInitializer$Companion$runMigrations$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                dataMigrationInitializer$Companion$runMigrations$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = dataMigrationInitializer$Companion$runMigrations$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataMigrationInitializer$Companion$runMigrations$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ArrayList arrayList = new ArrayList();
                    MutatorMutex$mutate$2 mutatorMutex$mutate$2 = new MutatorMutex$mutate$2(list, arrayList, (Continuation) null);
                    dataMigrationInitializer$Companion$runMigrations$1.L$0 = arrayList;
                    dataMigrationInitializer$Companion$runMigrations$1.label = 1;
                    if (dataStoreImpl$InitDataStore$doRun$initData$1$api$1.updateData(mutatorMutex$mutate$2, dataMigrationInitializer$Companion$runMigrations$1) == obj2) {
                        return obj2;
                    }
                    list2 = arrayList;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        it = dataMigrationInitializer$Companion$runMigrations$1.L$1;
                        ref$ObjectRef = (Ref$ObjectRef) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                        } catch (Throwable th2) {
                            Object obj3 = ref$ObjectRef.element;
                            if (obj3 == null) {
                                ref$ObjectRef.element = th2;
                            } else {
                                ExceptionsKt__ExceptionsKt.addSuppressed((Throwable) obj3, th2);
                            }
                        }
                        while (it.hasNext()) {
                            Function1 function1 = (Function1) it.next();
                            dataMigrationInitializer$Companion$runMigrations$1.L$0 = ref$ObjectRef;
                            dataMigrationInitializer$Companion$runMigrations$1.L$1 = it;
                            dataMigrationInitializer$Companion$runMigrations$1.label = 2;
                            if (function1.invoke(dataMigrationInitializer$Companion$runMigrations$1) == obj2) {
                                return obj2;
                            }
                        }
                        th = (Throwable) ref$ObjectRef.element;
                        if (th == null) {
                            return Unit.INSTANCE;
                        }
                        throw th;
                    }
                    list2 = (List) dataMigrationInitializer$Companion$runMigrations$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ref$ObjectRef = new Ref$ObjectRef();
                it = list2.iterator();
                while (it.hasNext()) {
                }
                th = (Throwable) ref$ObjectRef.element;
                if (th == null) {
                }
            }
        }
        dataMigrationInitializer$Companion$runMigrations$1 = new DataMigrationInitializer$Companion$runMigrations$1(continuationImpl);
        Object obj4 = dataMigrationInitializer$Companion$runMigrations$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataMigrationInitializer$Companion$runMigrations$1.label;
        if (i != 0) {
        }
        ref$ObjectRef = new Ref$ObjectRef();
        it = list2.iterator();
        while (it.hasNext()) {
        }
        th = (Throwable) ref$ObjectRef.element;
        if (th == null) {
        }
    }

    public static AccountRequirement accountRequirement(Uri uri, ClientRouteSpec clientRouteSpec) {
        uri.getClass();
        clientRouteSpec.getClass();
        AccountRequirement accountRequirement = clientRouteSpec.getAccountRequirement();
        String query = uri.getQuery();
        if (query == null) {
            query = "";
        }
        String str = (String) toQueryNamesAndValues$client_routes_android_release(query).get("account_requirement");
        if (str != null) {
            try {
                String upperCase = str.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                return new AccountRequirement(AccountRequirement.Value.valueOf(StringsKt__StringsJVMKt.replace$default(upperCase, "-", "_")), accountRequirement.getValueParameterName(), accountRequirement.getAccountIdentifierParameterName());
            } catch (IllegalArgumentException unused) {
            }
        }
        return accountRequirement;
    }

    /* renamed from: add-impl, reason: not valid java name */
    public static final void m1171addimpl(MutableIntList mutableIntList, int i) {
        if (mutableIntList._size == 0 || !(mutableIntList.get(0) == i || mutableIntList.get(mutableIntList._size - 1) == i)) {
            int i2 = mutableIntList._size;
            mutableIntList.add(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int i4 = mutableIntList.get(i3);
                if (i <= i4) {
                    break;
                }
                mutableIntList.set(i2, i4);
                i2 = i3;
            }
            mutableIntList.set(i2, i);
        }
    }

    public static AuthenticationRequirement authentication(Uri uri, ClientRouteSpec clientRouteSpec) {
        uri.getClass();
        clientRouteSpec.getClass();
        AuthenticationRequirement requiredAuthenticationState = clientRouteSpec.getRequiredAuthenticationState();
        String query = uri.getQuery();
        if (query == null) {
            query = "";
        }
        String str = (String) toQueryNamesAndValues$client_routes_android_release(query).get(BreadcrumbHelper.Category.AUTHENTICATION);
        if (str != null) {
            AuthenticationRequirement.Companion.getClass();
            AuthenticationRequirement ofQueryParamValue = zzc.ofQueryParamValue(str);
            if (ofQueryParamValue == AuthenticationRequirement.SIGNED_IN) {
                return ofQueryParamValue;
            }
        }
        return requiredAuthenticationState;
    }

    public static final BasicTextContextMenuProvider basicTextContextMenuProvider(ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        boolean z = (((i & 14) ^ 6) > 4 && ((GapComposer) composer).changed(composableLambdaImpl)) || (i & 6) == 4;
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (z || rememberedValue == neverEqualPolicy) {
            rememberedValue = new BasicTextContextMenuProvider(composableLambdaImpl);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        BasicTextContextMenuProvider basicTextContextMenuProvider = (BasicTextContextMenuProvider) rememberedValue;
        boolean changed = gapComposer.changed(basicTextContextMenuProvider);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new CashApp$$ExternalSyntheticLambda2(basicTextContextMenuProvider, 8);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.DisposableEffect(basicTextContextMenuProvider, (Function1) rememberedValue2, gapComposer);
        return basicTextContextMenuProvider;
    }

    public static final String blockerType(Blockers blockers) {
        blockers.getClass();
        if (blockers.address != null) {
            return "address";
        }
        if (blockers.alias_blocker != null) {
            return "alias_blocker";
        }
        if (blockers.amount_blocker != null) {
            return "amount_blocker";
        }
        if (blockers.card != null) {
            return "card";
        }
        if (blockers.card_customization != null) {
            return "card_customization";
        }
        if (blockers.cashtag != null) {
            return "cashtag";
        }
        if (blockers.check_deposit_blocker != null) {
            return "check_deposit_blocker";
        }
        if (blockers.confirm != null) {
            return "confirm";
        }
        if (blockers.contact_verification != null) {
            return "contact_verification";
        }
        if (blockers.disclosure != null) {
            return "disclosure";
        }
        if (blockers.email != null) {
            return "email";
        }
        if (blockers.email_verification != null) {
            return "email_verification";
        }
        if (blockers.file != null) {
            return "file";
        }
        if (blockers.fileset_upload_blocker != null) {
            return "fileset_upload_blocker";
        }
        if (blockers.form != null) {
            return "form";
        }
        if (blockers.google_pay_provisioning != null) {
            return "google_pay_provisioning";
        }
        if (blockers.cash_lite_google_pay_push_provisioning_blocker != null) {
            return "cash_lite_google_pay_push_provisioning_blocker";
        }
        if (blockers.identity_verification != null) {
            return "identity_verification";
        }
        if (blockers.instrument_selection_blocker != null) {
            return "instrument_selection_blocker";
        }
        if (blockers.instrument_verification != null) {
            return "instrument_verification";
        }
        if (blockers.invite_friends != null) {
            return "invite_friends";
        }
        if (blockers.name != null) {
            return "name";
        }
        if (blockers.paper_cash_deposit_blocker != null) {
            return "paper_cash_deposit";
        }
        if (blockers.retailer_map_blocker != null) {
            return "atm_retail_map";
        }
        if (blockers.passcode_creation != null) {
            return "passcode_creation";
        }
        if (blockers.passcode_verification != null) {
            return "passcode_verification";
        }
        if (blockers.pay_with_cash_authorization_blocker != null) {
            return "pay_with_cash_authorization_blocker";
        }
        if (blockers.status_interstitial_blocker != null) {
            return "status_interstitial_blocker";
        }
        if (blockers.phone_number != null) {
            return "phone_number";
        }
        if (blockers.phone_verification != null) {
            return "phone_verification";
        }
        if (blockers.qr_code != null) {
            return QRCode.f1509type;
        }
        if (blockers.resolve_merge != null) {
            return "resolve_merge";
        }
        if (blockers.reward_code != null) {
            return "reward_code";
        }
        if (blockers.scheduled_transaction != null) {
            return "scheduled_transaction";
        }
        if (blockers.selection != null) {
            return "selection";
        }
        if (blockers.select_sponsors_blocker != null) {
            return "select_sponsors";
        }
        if (blockers.select_dependents_blocker != null) {
            return "select_dependents";
        }
        if (blockers.signature != null) {
            return "signature";
        }
        if (blockers.google_pay_complete_provisioning_blocker != null) {
            return "google_pay_complete_provisioning_blocker";
        }
        if (blockers.tax_web_view_blocker != null) {
            return "tax_web_view_blocker";
        }
        if (blockers.password_creation_blocker != null) {
            return "password_creation_blocker";
        }
        if (blockers.password_verification_blocker != null) {
            return "password_verification_blocker";
        }
        if (blockers.persona_didv_blocker != null) {
            return "persona_didv_blocker";
        }
        if (blockers.activity_picker_blocker != null) {
            return "activity_picker_blocker";
        }
        if (blockers.webview_blocker != null) {
            return BreadcrumbHelper.Category.WEBVIEW;
        }
        if (blockers.multi_currency_amount_entry_blocker != null) {
            return "remittance_amount_entry";
        }
        if (blockers.multi_currency_payment_review_blocker != null) {
            return "remittance_payment_review";
        }
        if (blockers.overflow_option_picker_blocker != null) {
            return "overflow_option_picker";
        }
        if (blockers.clabe_entry_blocker != null) {
            return "clabe_entry_blocker";
        }
        if (blockers.treehouse_blocker != null) {
            return "treehouse_blocker";
        }
        if (blockers.recurring_payment_blocker != null) {
            return "recurring_payment_blocker";
        }
        if (blockers.credit_multi_step_loading_blocker != null) {
            return "credit_multi_step_loading_blocker";
        }
        if (blockers.credit_first_time_borrow_blocker != null) {
            return "credit_first_time_borrow_blocker";
        }
        if (blockers.investment_entity_selection_blocker != null) {
            return "investment_entity_selection_blocker";
        }
        if (blockers.onboarding_internal_route_blocker != null) {
            return "onboarding_internal_route_blocker";
        }
        if (blockers.sponsor_selection_details_blocker != null) {
            return "sponsor_selection_details_blocker";
        }
        if (blockers.payment_plan_data_blocker != null) {
            return "payment_plan_data_blocker";
        }
        if (blockers.select_payment_plan_blocker != null) {
            return "select_payment_plan_blocker";
        }
        if (blockers.set_paycheck_allocation_amount_blocker != null) {
            return "set_paycheck_allocation_amount_blocker";
        }
        if (blockers.balance_based_add_cash_pref_blocker != null) {
            return "balance_based_add_cash_pref_blocker";
        }
        if (blockers.gps_location_consent_blocker != null) {
            return "gps_location_consent_blocker";
        }
        if (blockers.multi_allocation_blocker != null) {
            return "multi_allocation_blocker";
        }
        if (blockers.cash_app_local_order_blocker != null) {
            return "cash_app_local_order_blocker";
        }
        if (blockers.three_ds_authentication_blocker != null) {
            return "three_ds_authentication_blocker";
        }
        if (blockers.transfer_option_selection_blocker != null) {
            return "transfer_option_selection_blocker";
        }
        if (blockers.atm_picker_amount_blocker != null) {
            return "atm_picker_amount_blocker";
        }
        if (blockers.prepurchase_cash_card_faq_blocker != null) {
            return "prepurchase_cash_card_faq_blocker";
        }
        if (blockers.instrument_selection_blocker_v3 != null) {
            return "instrument_selection_blocker_v3";
        }
        if (blockers.calendar_blocker != null) {
            return "calendar_blocker";
        }
        if (blockers.authorize_digital_wallet_payment_blocker != null) {
            return "authorize_digital_wallet_payment_blocker";
        }
        if (blockers.request_push_notifications_blocker != null) {
            return "request_push_notifications_blocker";
        }
        if (blockers.add_money_blocker != null) {
            return "add_money_blocker";
        }
        if (blockers.u13_celebration_blocker != null) {
            return "u13_celebration_blocker";
        }
        if (blockers.payment_device_customization_blocker != null) {
            return "payment_device_customization_blocker";
        }
        if (blockers.tag_confirmation_blocker != null) {
            return "tag_confirmation_blocker";
        }
        if (blockers.money_tab_booklet_blocker != null) {
            return "money_tab_booklet_blocker";
        }
        if (blockers.wireless_provider_list_blocker != null) {
            return "wireless_provider_list_blocker";
        }
        if (blockers.phone_plan_esim_check_blocker != null) {
            return "phone_plan_esim_check_blocker";
        }
        if (blockers.phone_plan_new_line_loading_blocker != null) {
            return "phone_plan_new_line_loading_blocker";
        }
        if (blockers.bitcoin_p2p_conversion_percentage_blocker != null) {
            return "bitcoin_p2p_conversion_percentage_blocker";
        }
        if (blockers.passkey_upsell_blocker != null) {
            return "passkey_upsell_blocker";
        }
        if (blockers.passkey_signature_blocker != null) {
            return "passkey_signature_blocker";
        }
        if (blockers.earner_enrollment_blocker != null) {
            return "earner_enrollment_blocker";
        }
        if (blockers.earner_enrollment_success_blocker != null) {
            return "earner_enrollment_success_blocker";
        }
        if (blockers.earner_upsell_blocker != null) {
            return "earner_upsell_blocker";
        }
        return null;
    }

    public static final LinkedHashSet byteArrayToSetOfTriggers(byte[] bArr) {
        bArr.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bArr.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int readInt = objectInputStream.readInt();
                    for (int i = 0; i < readInt; i++) {
                        Uri parse = Uri.parse(objectInputStream.readUTF());
                        boolean readBoolean = objectInputStream.readBoolean();
                        parse.getClass();
                        linkedHashSet.add(new Constraints.ContentUriTrigger(readBoolean, parse));
                    }
                    objectInputStream.close();
                } finally {
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            byteArrayInputStream.close();
            return linkedHashSet;
        } finally {
        }
    }

    public static void checkArgument(boolean z) {
        if (z) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
    }

    public static void checkArgumentInRange(int i, int i2, int i3, String str) {
        if (i < i2) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too low)");
        }
        if (i <= i3) {
            return;
        }
        Locale locale2 = Locale.US;
        throw new IllegalArgumentException(str + " is out of range of [" + i2 + ", " + i3 + "] (too high)");
    }

    public static void checkArgumentNonnegative(int i) {
        if (i >= 0) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
    }

    public static final void checkElementsNotNull(List list) {
        list.getClass();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (list.get(i) == null) {
                a$$ExternalSyntheticBUOutline0.m$2(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Element at index ", " is null"));
                return;
            }
        }
    }

    public static void checkNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$2(str);
    }

    public static void checkState(String str, boolean z) {
        if (z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1(str);
    }

    public static final int countNonNull(Serializable serializable, Serializable serializable2, Serializable serializable3, Serializable serializable4, Object... objArr) {
        int i = serializable != null ? 1 : 0;
        if (serializable2 != null) {
            i++;
        }
        if (serializable3 != null) {
            i++;
        }
        if (serializable4 != null) {
            i++;
        }
        for (Object obj : objArr) {
            if (obj != null) {
                i++;
            }
        }
        return i;
    }

    public static PaymentsPresenterFactory.MetroFactory create(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, InstanceFactory instanceFactory10, InstanceFactory instanceFactory11, InstanceFactory instanceFactory12, InstanceFactory instanceFactory13, InstanceFactory instanceFactory14, InstanceFactory instanceFactory15, InstanceFactory instanceFactory16, InstanceFactory instanceFactory17, InstanceFactory instanceFactory18, InstanceFactory instanceFactory19, InstanceFactory instanceFactory20, InstanceFactory instanceFactory21, InstanceFactory instanceFactory22, InstanceFactory instanceFactory23, InstanceFactory instanceFactory24, InstanceFactory instanceFactory25) {
        return new PaymentsPresenterFactory.MetroFactory(instanceFactory, instanceFactory2, instanceFactory3, instanceFactory4, instanceFactory5, instanceFactory6, instanceFactory7, instanceFactory8, instanceFactory9, instanceFactory10, instanceFactory11, instanceFactory12, instanceFactory13, instanceFactory14, instanceFactory15, instanceFactory16, instanceFactory17, instanceFactory18, instanceFactory19, instanceFactory20, instanceFactory21, instanceFactory22, instanceFactory23, instanceFactory24, instanceFactory25);
    }

    public static final Object decodeMessageOrMerge(ProtoAdapter protoAdapter, ProtoReader protoReader, Object obj) {
        protoAdapter.getClass();
        protoReader.getClass();
        if (obj == null) {
            return protoAdapter.decode(protoReader);
        }
        ByteString readBytes = protoReader.readBytes();
        Buffer buffer = new Buffer();
        protoAdapter.encode(buffer, obj);
        buffer.m4333write(readBytes);
        return protoAdapter.decode(buffer);
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m1172equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static final Object execSQL(PooledConnection pooledConnection, String str, ContinuationImpl continuationImpl) {
        Object usePrepared = pooledConnection.usePrepared(str, new TransactorKt$$ExternalSyntheticLambda0(0), continuationImpl);
        return usePrepared == CoroutineSingletons.COROUTINE_SUSPENDED ? usePrepared : Unit.INSTANCE;
    }

    public static final float fastCbrt(float f) {
        float intBitsToFloat = Float.intBitsToFloat(((int) ((Float.floatToRawIntBits(f) & 8589934591L) / 3)) + 709952852);
        float f2 = intBitsToFloat - ((intBitsToFloat - (f / (intBitsToFloat * intBitsToFloat))) * 0.33333334f);
        return f2 - ((f2 - (f / (f2 * f2))) * 0.33333334f);
    }

    public static final Object getOrNull(SemanticsConfiguration semanticsConfiguration, SemanticsPropertyKey semanticsPropertyKey) {
        Object obj = semanticsConfiguration.props.get(semanticsPropertyKey);
        if (obj == null) {
            return null;
        }
        return obj;
    }

    public static SharedPreferences getPreference(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static FrameworkSQLiteDatabase getWrappedDb(Extras.Key key, SQLiteDatabase sQLiteDatabase) {
        key.getClass();
        sQLiteDatabase.getClass();
        FrameworkSQLiteDatabase frameworkSQLiteDatabase = (FrameworkSQLiteDatabase) key.f61default;
        if (frameworkSQLiteDatabase != null && Intrinsics.areEqual(frameworkSQLiteDatabase.delegate, sQLiteDatabase)) {
            return frameworkSQLiteDatabase;
        }
        FrameworkSQLiteDatabase frameworkSQLiteDatabase2 = new FrameworkSQLiteDatabase(sQLiteDatabase);
        key.f61default = frameworkSQLiteDatabase2;
        return frameworkSQLiteDatabase2;
    }

    public static final Map immutableCopyOf(String str, Map map) {
        map.getClass();
        if (map.isEmpty()) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            return emptyMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        Set keySet = linkedHashMap.keySet();
        keySet.getClass();
        if (keySet.contains(null)) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) str.concat(".containsKey(null)"));
            return null;
        }
        Collection values = linkedHashMap.values();
        values.getClass();
        if (values.contains(null)) {
            Path$$ExternalSyntheticBUOutline0.m$1((Object) str.concat(".containsValue(null)"));
            return null;
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public static final Object immutableCopyOfStruct(Object obj, String str) {
        if (obj == null || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof String)) {
            return obj;
        }
        if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(immutableCopyOfStruct(it.next(), str));
            }
            List unmodifiableList = Collections.unmodifiableList(arrayList);
            unmodifiableList.getClass();
            return unmodifiableList;
        }
        if (!(obj instanceof Map)) {
            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m3m("struct value ", str, " must be a JSON type (null, Boolean, Double, String, List, or Map) but was "), Reflection.factory.getOrCreateKotlinClass(obj.getClass()), ": ", obj);
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            linkedHashMap.put(immutableCopyOfStruct(entry.getKey(), str), immutableCopyOfStruct(entry.getValue(), str));
        }
        Map unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        unmodifiableMap.getClass();
        return unmodifiableMap;
    }

    public static final BackoffPolicy intToBackoffPolicy(int i) {
        if (i == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (i == 1) {
            return BackoffPolicy.LINEAR;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Could not convert ", " to BackoffPolicy"));
        return null;
    }

    public static final NetworkType intToNetworkType(int i) {
        if (i == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (i == 1) {
            return NetworkType.CONNECTED;
        }
        if (i == 2) {
            return NetworkType.UNMETERED;
        }
        if (i == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (i == 4) {
            return NetworkType.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && i == 5) {
            return NetworkType.TEMPORARILY_UNMETERED;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Could not convert ", " to NetworkType"));
        return null;
    }

    public static final OutOfQuotaPolicy intToOutOfQuotaPolicy(int i) {
        if (i == 0) {
            return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (i == 1) {
            return OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Could not convert ", " to OutOfQuotaPolicy"));
        return null;
    }

    public static final WorkInfo.State intToState(int i) {
        if (i == 0) {
            return WorkInfo.State.ENQUEUED;
        }
        if (i == 1) {
            return WorkInfo.State.RUNNING;
        }
        if (i == 2) {
            return WorkInfo.State.SUCCEEDED;
        }
        if (i == 3) {
            return WorkInfo.State.FAILED;
        }
        if (i == 4) {
            return WorkInfo.State.BLOCKED;
        }
        if (i == 5) {
            return WorkInfo.State.CANCELLED;
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "Could not convert ", " to State"));
        return null;
    }

    /* renamed from: invoke-RGew2ao, reason: not valid java name */
    public static DynamicColorConfiguration m1173invokeRGew2ao(long j, long j2, long j3, Composer composer, int i) {
        long j4;
        long j5;
        long j6 = (i & 1) != 0 ? Color.Unspecified : j;
        long j7 = (i & 2) != 0 ? Color.Unspecified : j2;
        long j8 = (i & 4) != 0 ? Color.Unspecified : j3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(52408384);
        if (j6 == 16) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            j6 = colors.component.titleBar.text;
        }
        long j9 = j6;
        gapComposer.end(false);
        gapComposer.startReplaceGroup(52411176);
        if (j7 != 16) {
            j5 = j7;
            j4 = 16;
        } else {
            Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            j4 = 16;
            j5 = colors2.component.titleBar.icon.f218default;
        }
        gapComposer.end(false);
        gapComposer.startReplaceGroup(52415057);
        if (j7 == 16) {
            Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors3 == null) {
                colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            j7 = colors3.component.bottomNavigation.icon.selected;
        }
        long j10 = j7;
        gapComposer.end(false);
        gapComposer.startReplaceGroup(52419600);
        if (j8 == j4) {
            Colors colors4 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors4 == null) {
                colors4 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            j8 = colors4.component.bottomNavigation.icon.f147default;
        }
        long j11 = j8;
        gapComposer.end(false);
        return new DynamicColorConfiguration(j9, j5, j10, j11);
    }

    public static final int lerp(int i, int i2, float f) {
        return i + ((int) Math.round((i2 - i) * f));
    }

    public static String matchAccountIdentifier(Uri uri, AccountRequirement accountRequirement) {
        String str;
        uri.getClass();
        accountRequirement.getClass();
        String query = uri.getQuery();
        if (query == null) {
            query = "";
        }
        LinkedHashMap queryNamesAndValues$client_routes_android_release = toQueryNamesAndValues$client_routes_android_release(query);
        if (queryNamesAndValues$client_routes_android_release.size() == 0 || (str = (String) queryNamesAndValues$client_routes_android_release.get(accountRequirement.getAccountIdentifierParameterName())) == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public static Map matchWithAllParameters(Uri uri, String str, boolean z, List list) {
        String query;
        uri.getClass();
        str.getClass();
        list.getClass();
        String path = uri.getPath();
        if (path == null) {
            return null;
        }
        if (z && (query = uri.getQuery()) != null && !StringsKt.isBlank(query) && !StringsKt.contains((CharSequence) path, (CharSequence) "?", false)) {
            path = Recorder$$ExternalSyntheticOutline2.m(path, "?", uri.getQuery());
        }
        MatcherMatchResult matchEntire = new Regex(str).matchEntire(path);
        if (matchEntire == null) {
            return null;
        }
        List drop = CollectionsKt.drop(matchEntire.getGroupValues(), 1);
        if (drop.size() == list.size()) {
            return MapsKt__MapsKt.toMap(CollectionsKt.zip(list, drop));
        }
        if (drop.size() != 0) {
            return null;
        }
        String query2 = uri.getQuery();
        if (query2 == null) {
            query2 = "";
        }
        LinkedHashMap queryNamesAndValues$client_routes_android_release = toQueryNamesAndValues$client_routes_android_release(query2);
        if (queryNamesAndValues$client_routes_android_release.size() == 0 || !queryNamesAndValues$client_routes_android_release.keySet().containsAll(list)) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : queryNamesAndValues$client_routes_android_release.entrySet()) {
            if (list.contains(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public static final void missingRequiredFields(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int progressionLastElement = ProgressionUtilKt.getProgressionLastElement(0, objArr.length - 1, 2);
        String str = "";
        if (progressionLastElement >= 0) {
            while (true) {
                if (objArr[i] == null) {
                    if (sb.length() > 0) {
                        str = "s";
                    }
                    sb.append("\n  ");
                    sb.append(objArr[i + 1]);
                }
                if (i == progressionLastElement) {
                    break;
                } else {
                    i += 2;
                }
            }
        }
        throw new IllegalStateException(CameraSelector$$ExternalSyntheticOutline0.m("Required field", str, " not set:", sb.toString()));
    }

    public static final String redactUrl(String str) {
        str.getClass();
        return ((Regex) RedactPatterns.RAW_SOLANA_ADDRESS$delegate.getValue()).replace(((Regex) RedactPatterns.RAW_ETHEREUM_ADDRESS$delegate.getValue()).replace(((Regex) RedactPatterns.CAIP10_ADDRESS$delegate.getValue()).replace(((Regex) RedactPatterns.STABLECOIN_URI$delegate.getValue()).replace(((Regex) RedactPatterns.BITCOIN_PARTNER$delegate.getValue()).replace(((Regex) RedactPatterns.GEO_LOCATION$delegate.getValue()).replace(((Regex) RedactPatterns.ADDRESS_PARAM$delegate.getValue()).replace(((Regex) RedactPatterns.BITCOIN_INVOICE$delegate.getValue()).replace(((Regex) RedactPatterns.IPV6_ADDRESS$delegate.getValue()).replace(((Regex) RedactPatterns.IPV4_ADDRESS$delegate.getValue()).replace(((Regex) RedactPatterns.WEB_LOGIN_TOKEN$delegate.getValue()).replace(((Regex) RedactPatterns.CASHTAG_PARAM$delegate.getValue()).replace(((Regex) RedactPatterns.CASHTAG_PATH$delegate.getValue()).replace(((Regex) RedactPatterns.REWARD_CODES$delegate.getValue()).replace(((Regex) RedactPatterns.PAYMENT_TOKENS$delegate.getValue()).replace(str, new MainActivity$$ExternalSyntheticLambda5(28)), new Perfs$$ExternalSyntheticLambda4(10)), new Perfs$$ExternalSyntheticLambda4(11)), new Perfs$$ExternalSyntheticLambda4(12)), new Perfs$$ExternalSyntheticLambda4(13)), new MainActivity$$ExternalSyntheticLambda5(29)), new Perfs$$ExternalSyntheticLambda4(1)), new Perfs$$ExternalSyntheticLambda4(2)), new Perfs$$ExternalSyntheticLambda4(3)), new Perfs$$ExternalSyntheticLambda4(4)), new Perfs$$ExternalSyntheticLambda4(5)), new Perfs$$ExternalSyntheticLambda4(6)), new Perfs$$ExternalSyntheticLambda4(7)), new Perfs$$ExternalSyntheticLambda4(8)), new Perfs$$ExternalSyntheticLambda4(9));
    }

    public static final String sanitize(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (StringsKt.contains((CharSequence) ",[]{}\\", charAt, false)) {
                sb.append('\\');
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static void setProxyRetention(final Context context, GmsRpc gmsRpc, final boolean z) {
        zzw forException;
        SharedPreferences preference = getPreference(context);
        if (preference.contains("proxy_retention") && preference.getBoolean("proxy_retention", false) == z) {
            return;
        }
        Rpc rpc = gmsRpc.rpc;
        if (rpc.zzg.zza() >= 241100000) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("proxy_retention", z);
            forException = zzv.zzb(rpc.zzf).zzc(4, bundle);
        } else {
            forException = Room.forException(new IOException("SERVICE_NOT_AVAILABLE"));
        }
        forException.addOnSuccessListener(new ArchTaskExecutor$$ExternalSyntheticLambda0(1), new OnSuccessListener() { // from class: com.google.firebase.messaging.ProxyNotificationPreferences$$ExternalSyntheticLambda0
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                SharedPreferences.Editor edit = TransactorKt.getPreference(context).edit();
                edit.putBoolean("proxy_retention", z);
                edit.apply();
            }
        });
    }

    public static final int stateToInt(WorkInfo.State state) {
        state.getClass();
        int ordinal = state.ordinal();
        if (ordinal == 0) {
            return 0;
        }
        int i = 1;
        if (ordinal != 1) {
            i = 2;
            if (ordinal != 2) {
                i = 3;
                if (ordinal != 3) {
                    i = 4;
                    if (ordinal != 4) {
                        if (ordinal == 5) {
                            return 5;
                        }
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return 0;
                    }
                }
            }
        }
        return i;
    }

    public static boolean stringIsNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0044  */
    /* renamed from: synthesizeTypeface-FxwP2eA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m1174synthesizeTypefaceFxwP2eA(int i, Object obj, ResourceFont resourceFont, FontWeight fontWeight, int i2) {
        boolean z;
        boolean z2;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z3 = false;
        if ((i & 1) != 0 && !Intrinsics.areEqual(resourceFont.weight, fontWeight)) {
            FontWeight fontWeight2 = FontWeight.W400;
            if (fontWeight.compareTo(zzahj.getAndroidBold()) >= 0 && resourceFont.weight.compareTo(zzahj.getAndroidBold()) < 0) {
                z = true;
                z2 = (i & 2) == 0 && i2 != resourceFont.style;
                if (z2 && !z) {
                    return obj;
                }
                int i3 = !z ? fontWeight.weight : resourceFont.weight.weight;
                if (z2 ? resourceFont.style == 1 : i2 == 1) {
                    z3 = true;
                }
                return zzaho.create((Typeface) obj, i3, z3);
            }
        }
        z = false;
        if ((i & 2) == 0) {
        }
        if (z2) {
        }
        if (!z) {
        }
        if (z2) {
            z3 = true;
            return zzaho.create((Typeface) obj, i3, z3);
        }
        z3 = true;
        return zzaho.create((Typeface) obj, i3, z3);
    }

    /* renamed from: takeMax-impl, reason: not valid java name */
    public static final int m1175takeMaximpl(MutableIntList mutableIntList) {
        int i;
        int i2 = mutableIntList._size;
        int i3 = mutableIntList.get(0);
        while (mutableIntList._size != 0 && mutableIntList.get(0) == i3) {
            mutableIntList.set(0, mutableIntList.last());
            mutableIntList.removeAt(mutableIntList._size - 1);
            int i4 = mutableIntList._size;
            int i5 = i4 >>> 1;
            int i6 = 0;
            while (i6 < i5) {
                int i7 = mutableIntList.get(i6);
                int i8 = (i6 + 1) * 2;
                int i9 = i8 - 1;
                int i10 = mutableIntList.get(i9);
                if (i8 >= i4 || (i = mutableIntList.get(i8)) <= i10) {
                    if (i10 > i7) {
                        mutableIntList.set(i6, i10);
                        mutableIntList.set(i9, i7);
                        i6 = i9;
                    }
                } else if (i > i7) {
                    mutableIntList.set(i6, i);
                    mutableIntList.set(i8, i7);
                    i6 = i8;
                }
            }
        }
        return i3;
    }

    public static final Duration timeout(FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value) {
        Long longOrNull;
        featureFlag$StringFeatureFlag$Value.getClass();
        String str = featureFlag$StringFeatureFlag$Value.value;
        String str2 = featureFlag$StringFeatureFlag$Value.value;
        if (Intrinsics.areEqual(str, "DISABLED") || Intrinsics.areEqual(str2, "UNASSIGNED") || (longOrNull = StringsKt.toLongOrNull(str2)) == null) {
            return null;
        }
        Duration.Companion companion = Duration.Companion;
        return new Duration(DurationKt.toDuration(longOrNull.longValue(), DurationUnit.SECONDS));
    }

    public static final NetworkRequestCompat toNetworkRequest$work_runtime_release(byte[] bArr) {
        bArr.getClass();
        if (bArr.length == 0) {
            return new NetworkRequestCompat(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int readInt = objectInputStream.readInt();
                int[] iArr = new int[readInt];
                for (int i = 0; i < readInt; i++) {
                    iArr[i] = objectInputStream.readInt();
                }
                int readInt2 = objectInputStream.readInt();
                int[] iArr2 = new int[readInt2];
                for (int i2 = 0; i2 < readInt2; i2++) {
                    iArr2[i2] = objectInputStream.readInt();
                }
                NetworkRequestCompat createNetworkRequestCompat$work_runtime_release = NetworkRequest28.createNetworkRequestCompat$work_runtime_release(iArr2, iArr);
                objectInputStream.close();
                byteArrayInputStream.close();
                return createNetworkRequestCompat$work_runtime_release;
            } finally {
            }
        } finally {
        }
    }

    public static LinkedHashMap toQueryNamesAndValues$client_routes_android_release(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int i = 0;
        while (i <= str.length()) {
            int indexOf$default = StringsKt.indexOf$default((CharSequence) str, '&', i, false, 4);
            if (indexOf$default == -1) {
                indexOf$default = str.length();
            }
            int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str, '=', i, false, 4);
            i = indexOf$default + 1;
        }
        return linkedHashMap;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m1176toStringimpl(long j) {
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        int i2 = (int) (j & BodyPartID.bodyIdMax);
        if (intBitsToFloat == Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i)) + ", " + GeometryUtilsKt.toStringAsFixed(Float.intBitsToFloat(i2)) + ')';
    }

    public static Object transactionWithResult$default(Transacter transacter, Function1 function1) {
        TransacterImpl transacterImpl = (TransacterImpl) transacter;
        transacterImpl.getClass();
        return transacterImpl.transactionWithWrapper(function1);
    }

    public static void zza(int i, int i2) {
        String zzb;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                zzb = zzba.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
                    return;
                }
                zzb = zzba.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(zzb);
        }
    }

    public static void zze(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zzg(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zzg(i2, i3, "end index") : zzba.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void zzf(String str, boolean z) {
        if (z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1(str);
    }

    public static String zzg(int i, int i2, String str) {
        if (i < 0) {
            return zzba.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzba.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
        return null;
    }

    public abstract Integer getIdRequirementOrNull();

    public abstract Parameters getParameters();

    public abstract void onFailed(Throwable th);

    public abstract void onLoaded(MetadataRepo metadataRepo);

    public TransactorKt(BackgroundTaskService backgroundTaskService, TaskType taskType) {
    }

    public static void checkArgument(String str, boolean z) {
        if (z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3(str);
    }

    public static final float lerp(float f, float f2, float f3) {
        return (f3 * f2) + ((1.0f - f3) * f);
    }

    public static final int countNonNull(Object obj, Object obj2) {
        return (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0);
    }

    /* renamed from: -redactElements, reason: not valid java name */
    public static final ArrayList m1169redactElements(List list, ProtoAdapter protoAdapter) {
        list.getClass();
        protoAdapter.getClass();
        List list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(protoAdapter.redact(it.next()));
        }
        return arrayList;
    }

    public static final List immutableCopyOf(String str, List list) {
        list.getClass();
        if (!(list instanceof MutableOnWriteList)) {
            if (list == EmptyList.INSTANCE || (list instanceof ImmutableList)) {
                return list;
            }
            ImmutableList immutableList = new ImmutableList(list);
            if (!immutableList.contains(null)) {
                return immutableList;
            }
            Path$$ExternalSyntheticBUOutline0.m$1((Object) str.concat(".contains(null)"));
            return null;
        }
        a$$ExternalSyntheticBUOutline0.m$1();
        return null;
    }

    public static final void IconAction(TitleBarActionScope titleBarActionScope, Painter painter, String str, Function0 function0, Modifier modifier, Badge badge, Composer composer, int i, int i2) {
        int i3;
        String str2;
        Badge badge2 = badge;
        titleBarActionScope.getClass();
        painter.getClass();
        str.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1045535950);
        if ((i & 48) == 0) {
            i3 = ((i & 64) == 0 ? gapComposer.changed(painter) : gapComposer.changedInstance(painter) ? 32 : 16) | i;
        } else {
            i3 = i;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= gapComposer.changed(modifier) ? 16384 : PKIFailureInfo.certRevoked;
        }
        int i4 = 196608 | i3;
        int i5 = i2 & 32;
        if (i5 != 0) {
            i4 = 1769472 | i3;
        } else if ((1572864 & i) == 0) {
            i4 |= (2097152 & i) == 0 ? gapComposer.changed(badge2) : gapComposer.changedInstance(badge2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        int i6 = i4;
        if (gapComposer.shouldExecute(i6 & 1, (i6 & 599185) != 599184)) {
            Badge badge3 = i5 != 0 ? null : badge2;
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier m279heightInVpY3zN4$default = SizeKt.m279heightInVpY3zN4$default(SizeKt.m292widthInVpY3zN4$default(modifier, 48.0f, RecyclerView.DECELERATION_RATE, 2), 52.0f, RecyclerView.DECELERATION_RATE, 2);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            Modifier m184combinedClickableauXiCPI$default = ImageKt.m184combinedClickableauXiCPI$default(m279heightInVpY3zN4$default, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer, 432, 9), false, str, new Role(0), null, null, PlatformKt.withHaptics(function0, null, gapComposer, (i6 >> 9) & 14, 1), 420);
            str2 = str;
            Object rememberedValue2 = gapComposer.rememberedValue();
            int i7 = 18;
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new NavBarBinding$$ExternalSyntheticLambda2(i7);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Modifier semantics = SemanticsModifierKt.semantics(m184combinedClickableauXiCPI$default, true, (Function1) rememberedValue2);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, semantics);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier != null) {
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
                gapComposer = gapComposer;
                badge2 = badge3;
                Room.BadgeAssetLayout(badge2, BadgePlacement.TitleBarIcon, Modifier.Companion.$$INSTANCE, false, Expect_jvmKt.rememberComposableLambda(-1986226848, new BadgeKt$$ExternalSyntheticLambda2(8, painter, str2), gapComposer), gapComposer, ((i6 >> 18) & 14) | 28080, 0);
                gapComposer.end(true);
            } else {
                Updater.invalidApplier();
                throw null;
            }
        } else {
            str2 = str;
            gapComposer.skipToGroupEnd();
        }
        Badge badge4 = badge2;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(titleBarActionScope, painter, str2, function0, modifier, badge4, i, i2);
        }
    }
}
