package androidx.core.os;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.Trace;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArraySet;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.compose.foundation.layout.BoxWithConstraintsScopeImpl;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.text.BasicTextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.CompositionImpl;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.Recomposer$join$2;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.snapshots.Snapshot$Companion$$ExternalSyntheticLambda0;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.ShadowKt;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.graphics.drawscope.Fill;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.AnnotatedStringKt;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.ParagraphStyleKt;
import androidx.compose.ui.text.PlatformParagraphStyle;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.SpanStyleKt;
import androidx.compose.ui.text.TextPainterKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.intl.PlatformLocaleKt;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.BaselineShiftKt;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextDrawStyleKt;
import androidx.compose.ui.text.style.TextForegroundStyle;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextGeometricTransformKt;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextIndentKt;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.text.style.TextOverflow;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.TextUnit;
import androidx.compose.ui.unit.TextUnitType;
import androidx.concurrent.futures.CallbackToFutureAdapter$Completer;
import androidx.concurrent.futures.CallbackToFutureAdapter$SafeFuture;
import androidx.concurrent.futures.ResolvableFuture;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BundleKt;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactionExecutor;
import androidx.room.TransactorKt;
import androidx.room.coroutines.FlowUtil$createFlow$$inlined$map$1;
import androidx.savedstate.SavedStateReaderKt;
import androidx.work.Data;
import androidx.work.SystemClock;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.GatedFrameClock;
import app.cash.molecule.MoleculeKt$$ExternalSyntheticLambda1;
import app.cash.molecule.MoleculeKt$$ExternalSyntheticLambda2;
import app.cash.molecule.PlatformKt;
import app.cash.molecule.RecompositionMode;
import app.cash.molecule.SnapshotNotifier;
import app.cash.molecule.UnitApplier;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.passcode.backend.RealAppLockState;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import app.cash.trifle.Trifle;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.RealImageLoader$execute$2;
import coil3.size.SizeKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.button.ButtonValues;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.presenters.BalanceHomePresenter;
import com.squareup.cash.banking.presenters.DemandDepositAccountFormatter;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.treehouse.TreehouseFlows;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.keystore.AttestedKeyMetrics$MetroFactory;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.payments.presenters.PaymentConfigurationPresenter;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.storage.ActiveStorageLinkFlowKt$activeStorageLinkFlow$1;
import com.squareup.cash.storage.RealSessionedLink;
import com.squareup.cash.storage.RealSessionedLinkStore;
import com.squareup.cash.storage.SandboxingAnalyticsLogger;
import com.squareup.cash.storage.SessionLinkChangeEvent;
import com.squareup.cash.storage.SessionManagerKt$launchStorageLinkStateMachine$2;
import com.squareup.cash.storage.SessionedLink$Store;
import com.squareup.cash.storage.StorageLinkState;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda5;
import com.squareup.cash.util.cache.Cache;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.contour.constraints.Constraint;
import com.squareup.preferences.PreferenceFlow$flow$1;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.wire.ByteArrayProtoReader32;
import com.squareup.workflow1.WorkflowIdentifier;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharingStarted;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.HttpUrl;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.PapaEvent;
import papa.SafeTrace;
import papa.internal.ViewTreeObservers$$ExternalSyntheticLambda3;
import timber.log.Timber;

/* loaded from: classes.dex */
public abstract class BundleKt {
    public static Trifle zza;
    public static Boolean zzf;
    public static Boolean zzg;
    public static Boolean zzj;
    public static Boolean zzl;

    /* renamed from: DpSize-YgX7TsA, reason: not valid java name */
    public static final long m1091DpSizeYgX7TsA(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32);
    }

    /* renamed from: FoundationText-PdH14aY, reason: not valid java name */
    public static final void m1092FoundationTextPdH14aY(final AnnotatedString annotatedString, final Modifier modifier, final TextStyle textStyle, final long j, final Function1 function1, final int i, final int i2, final boolean z, final int i3, final TextLineBalancing textLineBalancing, final int i4, final Map map, Composer composer, final int i5, final int i6) {
        int i7;
        Modifier modifier2;
        TextStyle textStyle2;
        Function1 function12;
        int i8;
        int access$packBytes;
        annotatedString.getClass();
        textStyle.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1095519413);
        if ((i5 & 6) == 0) {
            i7 = (gapComposer.changed(annotatedString) ? 4 : 2) | i5;
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            modifier2 = modifier;
            i7 |= gapComposer.changed(modifier2) ? 32 : 16;
        } else {
            modifier2 = modifier;
        }
        if ((i5 & MLKEMEngine.KyberPolyBytes) == 0) {
            textStyle2 = textStyle;
            i7 |= gapComposer.changed(textStyle2) ? 256 : 128;
        } else {
            textStyle2 = textStyle;
        }
        if ((i5 & 3072) == 0) {
            i7 |= gapComposer.changed(j) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            function12 = function1;
            i7 |= gapComposer.changedInstance(function12) ? 16384 : PKIFailureInfo.certRevoked;
        } else {
            function12 = function1;
        }
        if ((196608 & i5) == 0) {
            i7 |= gapComposer.changed(i) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if ((i5 & 1572864) == 0) {
            i7 |= gapComposer.changed(i2) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((i5 & 12582912) == 0) {
            i7 |= gapComposer.changed(z) ? 8388608 : 4194304;
        }
        if ((i5 & 100663296) == 0) {
            i7 |= gapComposer.changed(i3) ? 67108864 : 33554432;
        }
        if ((i5 & 805306368) == 0) {
            i7 |= gapComposer.changed(textLineBalancing) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        int i9 = i7;
        if ((i6 & 6) == 0) {
            i8 = i6 | (gapComposer.changed(i4) ? 4 : 2);
        } else {
            i8 = i6;
        }
        if ((i6 & 48) == 0) {
            i8 |= gapComposer.changedInstance(map) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i9 & 1, ((i9 & 306783379) == 306783378 && (i8 & 19) == 18) ? false : true)) {
            gapComposer.startDefaults();
            if ((i5 & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            final TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(textStyle2, j, 0L, null, null, 0L, null, 0L, null, null, null, i3, 0L, null, new LineHeightStyle(LineHeightStyle.Alignment.Center, 0, 0), 0, 15695870);
            if (textLineBalancing == null) {
                gapComposer.startReplaceGroup(838321858);
                int i10 = i9 << 3;
                BasicTextKt.m346BasicTextCL7eQgs(annotatedString, modifier2, m994copyp1EtxEg$default, function12, i4, z, i, i2, map, null, gapComposer, ((i9 >> 3) & 7168) | (i9 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i8 << 12) & 57344) | (458752 & (i9 >> 6)) | (3670016 & i10) | (29360128 & i10) | ((i8 << 21) & 234881024), 1536);
                gapComposer.end(false);
            } else if (textLineBalancing.preferredLineCount == 1) {
                gapComposer.startReplaceGroup(838852733);
                access$packBytes = TextOverflow.access$packBytes(3, (r5 >> 8) & 255, (m994copyp1EtxEg$default.paragraphStyle.lineBreak >> 16) & 255);
                int i11 = i9 << 3;
                BasicTextKt.m346BasicTextCL7eQgs(annotatedString, modifier, TextStyle.m994copyp1EtxEg$default(m994copyp1EtxEg$default, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, access$packBytes, 14680063), function1, i4, z, i, i2, map, null, gapComposer, (29360128 & i11) | (i9 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i9 >> 3) & 7168) | ((i8 << 12) & 57344) | ((i9 >> 6) & 458752) | (3670016 & i11) | ((i8 << 21) & 234881024), 1536);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(839248076);
                if (i4 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$3("When line balancing is enabled, only TextOverflow.Visible is supported");
                    return;
                } else {
                    OffsetKt.BoxWithConstraints(modifier, null, true, Expect_jvmKt.rememberComposableLambda(2146951057, new Function3() { // from class: com.squareup.cash.composeUi.foundation.text.FoundationTextKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function3
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            BoxWithConstraintsScopeImpl boxWithConstraintsScopeImpl = (BoxWithConstraintsScopeImpl) obj;
                            Composer composer2 = (Composer) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            boxWithConstraintsScopeImpl.getClass();
                            if ((intValue & 6) == 0) {
                                intValue |= ((GapComposer) composer2).changed(boxWithConstraintsScopeImpl) ? 4 : 2;
                            }
                            GapComposer gapComposer2 = (GapComposer) composer2;
                            if (gapComposer2.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                                BasicTextKt.m346BasicTextCL7eQgs(WorkflowIdentifier.Companion.doBalancing(annotatedString, Constraints.m1025getMaxWidthimpl(boxWithConstraintsScopeImpl.m257getConstraintsmsEJaDk()), TextLineBalancing.this.preferredLineCount, textStyle, gapComposer2), null, m994copyp1EtxEg$default, function1, i4, z, i, i2, map, null, gapComposer2, 0, 1538);
                            } else {
                                gapComposer2.skipToGroupEnd();
                            }
                            return Unit.INSTANCE;
                        }
                    }, gapComposer), gapComposer, ((i9 >> 3) & 14) | 3456, 2);
                    gapComposer.end(false);
                }
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.composeUi.foundation.text.FoundationTextKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i5 | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i6);
                    BundleKt.m1092FoundationTextPdH14aY(AnnotatedString.this, modifier, textStyle, j, function1, i, i2, z, i3, textLineBalancing, i4, map, (Composer) obj, updateChangedFlags, updateChangedFlags2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object activeStorageLinkFlow(CoroutineScope coroutineScope, SessionManager sessionManager, CoroutineContext coroutineContext, SandboxingAnalyticsLogger sandboxingAnalyticsLogger, SessionedLink$Store sessionedLink$Store, ContinuationImpl continuationImpl) {
        ActiveStorageLinkFlowKt$activeStorageLinkFlow$1 activeStorageLinkFlowKt$activeStorageLinkFlow$1;
        int i;
        if (continuationImpl instanceof ActiveStorageLinkFlowKt$activeStorageLinkFlow$1) {
            activeStorageLinkFlowKt$activeStorageLinkFlow$1 = (ActiveStorageLinkFlowKt$activeStorageLinkFlow$1) continuationImpl;
            int i2 = activeStorageLinkFlowKt$activeStorageLinkFlow$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                activeStorageLinkFlowKt$activeStorageLinkFlow$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = activeStorageLinkFlowKt$activeStorageLinkFlow$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = activeStorageLinkFlowKt$activeStorageLinkFlow$1.label;
                int i3 = 3;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    activeStorageLinkFlowKt$activeStorageLinkFlow$1.L$0 = coroutineScope;
                    activeStorageLinkFlowKt$activeStorageLinkFlow$1.L$3 = sandboxingAnalyticsLogger;
                    activeStorageLinkFlowKt$activeStorageLinkFlow$1.label = 1;
                    SessionLinkChangeEvent.ColdStart coldStart = new SessionLinkChangeEvent.ColdStart(PlatformKt.activeAccountTokenOrNull(sessionManager));
                    RealSessionedLinkStore realSessionedLinkStore = (RealSessionedLinkStore) sessionedLink$Store;
                    realSessionedLinkStore.getClass();
                    RealSessionedLink realSessionedLink = (RealSessionedLink) TransactorKt.transactionWithResult$default(realSessionedLinkStore.storageLinkQueries, new ViewTreeObservers$$ExternalSyntheticLambda3(10, realSessionedLinkStore, coldStart));
                    StorageLinkState storageLinkState = new StorageLinkState(realSessionedLink.getActiveLink(), coldStart);
                    obj = FlowKt.stateIn(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new AppLockMonitor$special$$inlined$map$2(new FlowUtil$createFlow$$inlined$map$1(new Pair(PlatformKt.getCurrentSessionState(sessionManager), storageLinkState), sessionManager.getSessionState(), new SessionManagerKt$launchStorageLinkStateMachine$2(realSessionedLink, null)), 15), new Recomposer$join$2(2, continuation, 11), i3), JobKt.plus(coroutineContext, coroutineScope), SharingStarted.Companion.Eagerly, storageLinkState);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sandboxingAnalyticsLogger = activeStorageLinkFlowKt$activeStorageLinkFlow$1.L$3;
                    coroutineScope = activeStorageLinkFlowKt$activeStorageLinkFlow$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                StateFlow stateFlow = (StateFlow) obj;
                int i4 = 5;
                JobKt.launch$default(coroutineScope, null, null, new PreferenceFlow$flow$1(stateFlow, sandboxingAnalyticsLogger, continuation, i4), 3);
                DerivedStateFlow mapState = StateFlowKt.mapState(stateFlow, new MainActivity$$ExternalSyntheticLambda5(19));
                JobKt.launch$default(coroutineScope, null, null, new Cache.AnonymousClass1(mapState, continuation, i4), 3);
                return mapState;
            }
        }
        activeStorageLinkFlowKt$activeStorageLinkFlow$1 = new ActiveStorageLinkFlowKt$activeStorageLinkFlow$1(continuationImpl);
        Object obj3 = activeStorageLinkFlowKt$activeStorageLinkFlow$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = activeStorageLinkFlowKt$activeStorageLinkFlow$1.label;
        int i32 = 3;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        StateFlow stateFlow2 = (StateFlow) obj3;
        int i42 = 5;
        JobKt.launch$default(coroutineScope, null, null, new PreferenceFlow$flow$1(stateFlow2, sandboxingAnalyticsLogger, continuation2, i42), 3);
        DerivedStateFlow mapState2 = StateFlowKt.mapState(stateFlow2, new MainActivity$$ExternalSyntheticLambda5(19));
        JobKt.launch$default(coroutineScope, null, null, new Cache.AnonymousClass1(mapState2, continuation2, i42), 3);
        return mapState2;
    }

    public static final Bundle bundleOf(Pair... pairArr) {
        Bundle bundle = new Bundle(pairArr.length);
        for (Pair pair : pairArr) {
            String str = (String) pair.first;
            Object obj = pair.second;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                componentType.getClass();
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        Drop$$ExternalSyntheticBUOutline0.m(34, componentType.getCanonicalName(), " for key \"", str, "Illegal value array type ");
                        return null;
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    Drop$$ExternalSyntheticBUOutline0.m(34, obj.getClass().getCanonicalName(), " for key \"", str, "Illegal value type ");
                    return null;
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    public static final void checkElementIndex$runtime(int i, int i2) {
        if (i < 0 || i >= i2) {
            Path$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("index: ", i, i2, ", size: "));
        }
    }

    public static void checkNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$2(str);
    }

    public static final void checkPositionIndex$runtime(int i, int i2) {
        if (i < 0 || i > i2) {
            Path$$ExternalSyntheticBUOutline0.m(Recorder$$ExternalSyntheticOutline2.m("index: ", i, i2, ", size: "));
        }
    }

    public static final void checkRangeIndexes$runtime(int i, int i2, int i3) {
        if (i < 0 || i2 > i3) {
            Path$$ExternalSyntheticBUOutline0.m(i3, Recorder$$ExternalSyntheticOutline2.m107m(i, i2, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i <= i2) {
                return;
            }
            a$$ExternalSyntheticBUOutline0.m$3(Recorder$$ExternalSyntheticOutline2.m("fromIndex: ", i, i2, " > toIndex: "));
        }
    }

    public static ButtonValues compact(Composer composer) {
        return new ButtonValues(m1091DpSizeYgX7TsA(48.0f, 32.0f), 4.0f, new PaddingValuesImpl(16.0f, 4.0f, 16.0f, 4.0f), TextStyle.m994copyp1EtxEg$default(((Typography) ((GapComposer) composer).consume(ArcadeThemeKt.LocalTypography)).buttonCompact, 0L, 0L, null, null, 0L, new BaselineShift(0.12f), 0L, null, null, null, 3, 0L, null, null, 0, 16744191), ButtonValues.ClipType.Pill.INSTANCE);
    }

    /* renamed from: contains-impl, reason: not valid java name */
    public static final boolean m1093containsimpl(Bundle bundle, String str) {
        str.getClass();
        return bundle.containsKey(str);
    }

    public static PaymentConfigurationPresenter.MetroFactory create(WalletUiFactory$MetroFactory walletUiFactory$MetroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, IntentLauncher.MetroFactory metroFactory, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck5, DoubleCheck doubleCheck6, InstanceFactory instanceFactory, DoubleCheck doubleCheck7, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory, WalletUiFactory$MetroFactory walletUiFactory$MetroFactory2, RealKeyStoreProvider.MetroFactory metroFactory2, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, RealMessageSigner.MetroFactory metroFactory3, AttestedKeyMetrics$MetroFactory attestedKeyMetrics$MetroFactory, DoubleCheck doubleCheck8, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory2, LambdaProvider lambdaProvider4, DoubleCheck doubleCheck9, DoubleCheck doubleCheck10, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, InstanceFactory instanceFactory10, InstanceFactory instanceFactory11, LambdaProvider lambdaProvider5) {
        walletUiFactory$MetroFactory.getClass();
        lambdaProvider.getClass();
        doubleCheck.getClass();
        doubleCheck2.getClass();
        doubleCheck3.getClass();
        doubleCheck4.getClass();
        metroFactory.getClass();
        lambdaProvider2.getClass();
        lambdaProvider3.getClass();
        doubleCheck5.getClass();
        doubleCheck6.getClass();
        doubleCheck7.getClass();
        broadwayModule$ProvideBroadwayMetroFactory.getClass();
        walletUiFactory$MetroFactory2.getClass();
        metroFactory2.getClass();
        instanceFactory2.getClass();
        instanceFactory7.getClass();
        metroFactory3.getClass();
        attestedKeyMetrics$MetroFactory.getClass();
        doubleCheck8.getClass();
        broadwayModule$ProvideBroadwayMetroFactory2.getClass();
        lambdaProvider4.getClass();
        doubleCheck9.getClass();
        doubleCheck10.getClass();
        instanceFactory8.getClass();
        instanceFactory10.getClass();
        lambdaProvider5.getClass();
        return new PaymentConfigurationPresenter.MetroFactory(walletUiFactory$MetroFactory, lambdaProvider, doubleCheck, doubleCheck2, doubleCheck3, doubleCheck4, metroFactory, lambdaProvider2, lambdaProvider3, doubleCheck5, doubleCheck6, instanceFactory, doubleCheck7, broadwayModule$ProvideBroadwayMetroFactory, walletUiFactory$MetroFactory2, metroFactory2, instanceFactory2, instanceFactory3, instanceFactory4, instanceFactory5, instanceFactory6, instanceFactory7, metroFactory3, attestedKeyMetrics$MetroFactory, doubleCheck8, broadwayModule$ProvideBroadwayMetroFactory2, lambdaProvider4, doubleCheck9, doubleCheck10, instanceFactory8, instanceFactory9, instanceFactory10, instanceFactory11, lambdaProvider5);
    }

    public static ViewModel createViewModel(Class cls) {
        cls.getClass();
        try {
            Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            if (!java.lang.reflect.Modifier.isPublic(declaredConstructor.getModifiers())) {
                OptionalProvider$$ExternalSyntheticLambda0.m$1(Boxes$$ExternalSyntheticOutline1.m(cls, "Cannot create an instance of "));
                return null;
            }
            try {
                Object newInstance = declaredConstructor.newInstance(null);
                newInstance.getClass();
                return (ViewModel) newInstance;
            } catch (IllegalAccessException e) {
                OptionalProvider$$ExternalSyntheticLambda0.m(Boxes$$ExternalSyntheticOutline1.m(cls, "Cannot create an instance of "), (Throwable) e);
                return null;
            } catch (InstantiationException e2) {
                OptionalProvider$$ExternalSyntheticLambda0.m(Boxes$$ExternalSyntheticOutline1.m(cls, "Cannot create an instance of "), (Throwable) e2);
                return null;
            }
        } catch (NoSuchMethodException e3) {
            OptionalProvider$$ExternalSyntheticLambda0.m(Boxes$$ExternalSyntheticOutline1.m(cls, "Cannot create an instance of "), (Throwable) e3);
            return null;
        }
    }

    public static ButtonValues cta(Composer composer) {
        return new ButtonValues(m1091DpSizeYgX7TsA(48.0f, 52.0f), 8.0f, new PaddingValuesImpl(24.0f, 14.0f, 24.0f, 14.0f), TextStyle.m994copyp1EtxEg$default(((Typography) ((GapComposer) composer).consume(ArcadeThemeKt.LocalTypography)).button, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744447), ButtonValues.ClipType.Pill.INSTANCE);
    }

    /* renamed from: default, reason: not valid java name */
    public static ButtonValues m1094default(Composer composer) {
        return new ButtonValues(m1091DpSizeYgX7TsA(48.0f, 44.0f), 8.0f, new PaddingValuesImpl(24.0f, 10.0f, 24.0f, 10.0f), TextStyle.m994copyp1EtxEg$default(((Typography) ((GapComposer) composer).consume(ArcadeThemeKt.LocalTypography)).button, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744447), ButtonValues.ClipType.Pill.INSTANCE);
    }

    /* renamed from: getInt-impl, reason: not valid java name */
    public static final int m1095getIntimpl(Bundle bundle, String str) {
        int i = bundle.getInt(str, PKIFailureInfo.systemUnavail);
        if (i != Integer.MIN_VALUE || bundle.getInt(str, Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw null;
    }

    public static final ViewParent getParentOrViewTreeDisjointParent(View view) {
        view.getClass();
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(R.id.view_tree_disjoint_parent);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    /* renamed from: getSavedState-impl, reason: not valid java name */
    public static final Bundle m1096getSavedStateimpl(Bundle bundle, String str) {
        str.getClass();
        Bundle bundle2 = bundle.getBundle(str);
        if (bundle2 != null) {
            return bundle2;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw null;
    }

    /* renamed from: getSavedStateList-impl, reason: not valid java name */
    public static final ArrayList m1097getSavedStateListimpl(Bundle bundle, String str) {
        ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 34 ? BundleCompat$Api33Impl.getParcelableArrayList(bundle, str, PapaEvent.getJavaClass(Reflection.factory.getOrCreateKotlinClass(Bundle.class))) : bundle.getParcelableArrayList(str);
        if (parcelableArrayList != null) {
            return parcelableArrayList;
        }
        SavedStateReaderKt.keyOrValueNotFoundError(str);
        throw null;
    }

    public static final boolean hasLinks(AnnotatedString annotatedString) {
        int length = annotatedString.text.length();
        List list = annotatedString.annotations;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnnotatedString.Range range = (AnnotatedString.Range) list.get(i);
                if ((range.item instanceof LinkAnnotation) && AnnotatedStringKt.intersect(0, length, range.start, range.end)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final Long httpStatusCode(ApiResult.Failure failure) {
        if (failure == null || !(failure instanceof ApiResult.Failure.HttpFailure)) {
            return null;
        }
        return Long.valueOf(((ApiResult.Failure.HttpFailure) failure).code);
    }

    public static final int indexOf(ArraySet arraySet, Object obj, int i) {
        int i2 = arraySet._size;
        if (i2 == 0) {
            return -1;
        }
        try {
            int binarySearch = ContainerHelpersKt.binarySearch(i2, i, arraySet.hashes);
            if (binarySearch < 0 || Intrinsics.areEqual(obj, arraySet.f847array[binarySearch])) {
                return binarySearch;
            }
            int i3 = binarySearch + 1;
            while (i3 < i2 && arraySet.hashes[i3] == i) {
                if (Intrinsics.areEqual(obj, arraySet.f847array[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = binarySearch - 1; i4 >= 0 && arraySet.hashes[i4] == i; i4--) {
                if (Intrinsics.areEqual(obj, arraySet.f847array[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (IndexOutOfBoundsException unused) {
            Drop$$ExternalSyntheticBUOutline0.m$1();
            return 0;
        }
    }

    /* renamed from: isNull-impl, reason: not valid java name */
    public static final boolean m1098isNullimpl(Bundle bundle, String str) {
        str.getClass();
        return m1093containsimpl(bundle, str) && bundle.get(str) == null;
    }

    public static final boolean isOnboarding(Screen screen) {
        BlockersData blockersData;
        BlockersData.Flow flow = null;
        BlockersScreens blockersScreens = screen instanceof BlockersScreens ? (BlockersScreens) screen : null;
        if (blockersScreens != null && (blockersData = blockersScreens.getBlockersData()) != null) {
            flow = blockersData.flow;
        }
        return flow == BlockersData.Flow.ONBOARDING;
    }

    public static final boolean isRetryable(ApiResult.Failure failure) {
        failure.getClass();
        if (failure instanceof ApiResult.Failure.NetworkFailure) {
            return true;
        }
        if (failure instanceof ApiResult.Failure.HttpFailure) {
            return isRetryableCode((ApiResult.Failure.HttpFailure) failure);
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return false;
    }

    public static final boolean isRetryableCode(ApiResult.Failure.HttpFailure httpFailure) {
        httpFailure.getClass();
        int i = httpFailure.code;
        if (i != 429) {
            return 500 <= i && i < 600;
        }
        return true;
    }

    public static final boolean isSpanish(Locale locale) {
        locale.getClass();
        return Intrinsics.areEqual(locale.getLanguage(), "es");
    }

    public static boolean isWearableWithoutPlayStore(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (zzf == null) {
            zzf = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        zzf.booleanValue();
        if (zzg == null) {
            zzg = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return zzg.booleanValue() && Build.VERSION.SDK_INT >= 30;
    }

    public static final void launchMolecule(CoroutineScope coroutineScope, RecompositionMode recompositionMode, Function1 function1, CoroutineContext coroutineContext, SnapshotNotifier snapshotNotifier, Function2 function2) {
        CoroutineContext coroutineContext2;
        coroutineScope.getClass();
        coroutineContext.getClass();
        int ordinal = recompositionMode.ordinal();
        if (ordinal == 0) {
            coroutineContext2 = EmptyCoroutineContext.INSTANCE;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            coroutineContext2 = new GatedFrameClock(coroutineContext, coroutineScope);
        }
        CoroutineContext plus = coroutineScope.getCoroutineContext().plus(coroutineContext).plus(coroutineContext2);
        Recomposer recomposer = new Recomposer(plus);
        CompositionImpl compositionImpl = new CompositionImpl(recomposer, UnitApplier.INSTANCE);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        JobKt.launch(coroutineScope, plus, CoroutineStart.UNDISPATCHED, new DataStoreImpl$data$1(recomposer, compositionImpl, ref$ObjectRef, null, 16));
        int ordinal2 = snapshotNotifier.ordinal();
        int i = 0;
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
            MoleculeKt$$ExternalSyntheticLambda1 moleculeKt$$ExternalSyntheticLambda1 = new MoleculeKt$$ExternalSyntheticLambda1(i, new Ref$BooleanRef(), coroutineScope, plus);
            synchronized (SnapshotKt.lock) {
                SnapshotKt.globalWriteObservers = CollectionsKt.plus((Collection) SnapshotKt.globalWriteObservers, (Object) moleculeKt$$ExternalSyntheticLambda1);
            }
            SnapshotKt.advanceGlobalSnapshot(SnapshotKt.emptyLambda);
            ref$ObjectRef.element = new Snapshot$Companion$$ExternalSyntheticLambda0(moleculeKt$$ExternalSyntheticLambda1, i);
        }
        compositionImpl.setContent(new ComposableLambdaImpl(new MoleculeKt$$ExternalSyntheticLambda2(i, function1, function2), true, -17548624));
    }

    public static StateFlow launchMolecule$default(CoroutineScope coroutineScope, RecompositionMode recompositionMode, CoroutineName coroutineName, Function2 function2, int i) {
        CoroutineContext coroutineContext = coroutineName;
        if ((i & 2) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        SnapshotNotifier defaultSnapshotNotifier = PlatformKt.defaultSnapshotNotifier();
        coroutineScope.getClass();
        coroutineContext2.getClass();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        launchMolecule(coroutineScope, recompositionMode, new CashApp$$ExternalSyntheticLambda2(ref$ObjectRef, 22), coroutineContext2, defaultSnapshotNotifier, function2);
        Object obj = ref$ObjectRef.element;
        obj.getClass();
        return (StateFlow) obj;
    }

    public static final Data.Builder launchOperation(final SystemClock systemClock, final String str, TransactionExecutor transactionExecutor, final Function0 function0) {
        systemClock.getClass();
        transactionExecutor.getClass();
        final MutableLiveData mutableLiveData = new MutableLiveData(Data.Builder.IN_PROGRESS);
        final CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer = new CallbackToFutureAdapter$Completer();
        callbackToFutureAdapter$Completer.cancellationFuture = new ResolvableFuture();
        CallbackToFutureAdapter$SafeFuture callbackToFutureAdapter$SafeFuture = new CallbackToFutureAdapter$SafeFuture(callbackToFutureAdapter$Completer);
        callbackToFutureAdapter$Completer.future = callbackToFutureAdapter$SafeFuture;
        callbackToFutureAdapter$Completer.tag = JsonLogicResult$Success$$ExternalSyntheticOutline0.class;
        try {
            transactionExecutor.execute(new Runnable() { // from class: androidx.work.OperationKt$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    String str2 = str;
                    Function0 function02 = function0;
                    MutableLiveData mutableLiveData2 = mutableLiveData;
                    CallbackToFutureAdapter$Completer callbackToFutureAdapter$Completer2 = callbackToFutureAdapter$Completer;
                    SystemClock.this.getClass();
                    boolean isEnabled = Trace.isEnabled();
                    if (isEnabled) {
                        try {
                            Trace.beginSection(androidx.tracing.Trace.truncatedTraceSectionLabel(str2));
                        } finally {
                            if (isEnabled) {
                                Trace.endSection();
                            }
                        }
                    }
                    try {
                        function02.invoke();
                        Operation$State$SUCCESS operation$State$SUCCESS = Data.Builder.SUCCESS;
                        mutableLiveData2.postValue(operation$State$SUCCESS);
                        callbackToFutureAdapter$Completer2.set(operation$State$SUCCESS);
                    } catch (Throwable th) {
                        mutableLiveData2.postValue(new SizeKt(th) { // from class: androidx.work.Operation$State$FAILURE
                            public final Throwable mThrowable;

                            {
                                super(13);
                                this.mThrowable = th;
                            }

                            @Override // coil3.size.SizeKt
                            public final String toString() {
                                return "FAILURE (" + this.mThrowable.getMessage() + ")";
                            }
                        });
                        callbackToFutureAdapter$Completer2.setException(th);
                    }
                }
            });
            Unit unit = Unit.INSTANCE;
            if (unit != null) {
                callbackToFutureAdapter$Completer.tag = unit;
            }
        } catch (Exception e) {
            callbackToFutureAdapter$SafeFuture.setException(e);
        }
        Data.Builder builder = new Data.Builder();
        builder.values = callbackToFutureAdapter$SafeFuture;
        return builder;
    }

    public static final TextStyle lerp(TextStyle textStyle, TextStyle textStyle2, float f) {
        long j;
        TextGeometricTransform textGeometricTransform;
        FontWeight fontWeight;
        FontStyle fontStyle;
        Shadow lerp;
        SpanStyle spanStyle = textStyle.spanStyle;
        SpanStyle spanStyle2 = textStyle2.spanStyle;
        TextForegroundStyle textForegroundStyle = SpanStyleKt.DefaultColorForegroundStyle;
        TextForegroundStyle lerp2 = TextDrawStyleKt.lerp(spanStyle.textForegroundStyle, spanStyle2.textForegroundStyle, f);
        FontFamily fontFamily = (FontFamily) SpanStyleKt.lerpDiscrete(spanStyle.fontFamily, spanStyle2.fontFamily, f);
        long m975lerpTextUnitInheritableC3pnCVY = SpanStyleKt.m975lerpTextUnitInheritableC3pnCVY(f, spanStyle.fontSize, spanStyle2.fontSize);
        FontWeight fontWeight2 = spanStyle.fontWeight;
        if (fontWeight2 == null) {
            fontWeight2 = FontWeight.Normal;
        }
        FontWeight fontWeight3 = spanStyle2.fontWeight;
        if (fontWeight3 == null) {
            fontWeight3 = FontWeight.Normal;
        }
        FontWeight lerp3 = FontWeightKt.lerp(fontWeight2, fontWeight3, f);
        FontStyle fontStyle2 = (FontStyle) SpanStyleKt.lerpDiscrete(spanStyle.fontStyle, spanStyle2.fontStyle, f);
        FontSynthesis fontSynthesis = (FontSynthesis) SpanStyleKt.lerpDiscrete(spanStyle.fontSynthesis, spanStyle2.fontSynthesis, f);
        String str = (String) SpanStyleKt.lerpDiscrete(spanStyle.fontFeatureSettings, spanStyle2.fontFeatureSettings, f);
        long m975lerpTextUnitInheritableC3pnCVY2 = SpanStyleKt.m975lerpTextUnitInheritableC3pnCVY(f, spanStyle.letterSpacing, spanStyle2.letterSpacing);
        BaselineShift baselineShift = spanStyle.baselineShift;
        float f2 = baselineShift != null ? baselineShift.multiplier : RecyclerView.DECELERATION_RATE;
        BaselineShift baselineShift2 = spanStyle2.baselineShift;
        float m1006lerpjWV1Mfo = BaselineShiftKt.m1006lerpjWV1Mfo(f2, baselineShift2 != null ? baselineShift2.multiplier : RecyclerView.DECELERATION_RATE, f);
        TextGeometricTransform textGeometricTransform2 = spanStyle.textGeometricTransform;
        TextGeometricTransform textGeometricTransform3 = TextGeometricTransform.None;
        if (textGeometricTransform2 == null) {
            textGeometricTransform2 = textGeometricTransform3;
        }
        TextGeometricTransform textGeometricTransform4 = spanStyle2.textGeometricTransform;
        if (textGeometricTransform4 == null) {
            textGeometricTransform4 = textGeometricTransform3;
        }
        TextGeometricTransform lerp4 = TextGeometricTransformKt.lerp(textGeometricTransform2, textGeometricTransform4, f);
        LocaleList localeList = (LocaleList) SpanStyleKt.lerpDiscrete(spanStyle.localeList, spanStyle2.localeList, f);
        long m689lerpjxsXWHM = ColorKt.m689lerpjxsXWHM(f, spanStyle.background, spanStyle2.background);
        TextDecoration textDecoration = (TextDecoration) SpanStyleKt.lerpDiscrete(spanStyle.textDecoration, spanStyle2.textDecoration, f);
        Shadow shadow = spanStyle.shadow;
        Shadow shadow2 = spanStyle2.shadow;
        PlatformParagraphStyle platformParagraphStyle = null;
        if (shadow == null && shadow2 == null) {
            j = m689lerpjxsXWHM;
            textGeometricTransform = lerp4;
            fontWeight = lerp3;
            fontStyle = fontStyle2;
            lerp = null;
        } else {
            j = m689lerpjxsXWHM;
            if (shadow == null) {
                shadow2.getClass();
                textGeometricTransform = lerp4;
                fontWeight = lerp3;
                lerp = ShadowKt.lerp(new Shadow(shadow2.blurRadius, Color.m675copywmQWz5c$default(RecyclerView.DECELERATION_RATE, shadow2.color, 14), shadow2.offset), shadow2, f);
                fontStyle = fontStyle2;
            } else {
                textGeometricTransform = lerp4;
                fontWeight = lerp3;
                if (shadow2 == null) {
                    fontStyle = fontStyle2;
                    lerp = ShadowKt.lerp(shadow, new Shadow(shadow.blurRadius, Color.m675copywmQWz5c$default(RecyclerView.DECELERATION_RATE, shadow.color, 14), shadow.offset), f);
                } else {
                    fontStyle = fontStyle2;
                    lerp = ShadowKt.lerp(shadow, shadow2, f);
                }
            }
        }
        PlatformSpanStyle platformSpanStyle = spanStyle.platformStyle;
        PlatformSpanStyle platformSpanStyle2 = spanStyle2.platformStyle;
        if (platformSpanStyle == null && platformSpanStyle2 == null) {
            platformSpanStyle = null;
        } else if (platformSpanStyle == null) {
            platformSpanStyle = PlatformSpanStyle.Default;
        }
        SpanStyle spanStyle3 = new SpanStyle(lerp2, m975lerpTextUnitInheritableC3pnCVY, fontWeight, fontStyle, fontSynthesis, fontFamily, str, m975lerpTextUnitInheritableC3pnCVY2, new BaselineShift(m1006lerpjWV1Mfo), textGeometricTransform, localeList, j, textDecoration, lerp, platformSpanStyle, (DrawStyle) SpanStyleKt.lerpDiscrete(spanStyle.drawStyle, spanStyle2.drawStyle, f));
        ParagraphStyle paragraphStyle = textStyle.paragraphStyle;
        ParagraphStyle paragraphStyle2 = textStyle2.paragraphStyle;
        int i = ParagraphStyleKt.$r8$clinit;
        int i2 = ((TextAlign) SpanStyleKt.lerpDiscrete(new TextAlign(paragraphStyle.textAlign), new TextAlign(paragraphStyle2.textAlign), f)).value;
        int i3 = ((TextDirection) SpanStyleKt.lerpDiscrete(new TextDirection(paragraphStyle.textDirection), new TextDirection(paragraphStyle2.textDirection), f)).value;
        long m975lerpTextUnitInheritableC3pnCVY3 = SpanStyleKt.m975lerpTextUnitInheritableC3pnCVY(f, paragraphStyle.lineHeight, paragraphStyle2.lineHeight);
        TextIndent textIndent = paragraphStyle.textIndent;
        if (textIndent == null) {
            textIndent = TextIndent.None;
        }
        TextIndent textIndent2 = paragraphStyle2.textIndent;
        if (textIndent2 == null) {
            textIndent2 = TextIndent.None;
        }
        TextIndent lerp5 = TextIndentKt.lerp(textIndent, textIndent2, f);
        PlatformParagraphStyle platformParagraphStyle2 = paragraphStyle.platformStyle;
        PlatformParagraphStyle platformParagraphStyle3 = paragraphStyle2.platformStyle;
        if (platformParagraphStyle2 != null || platformParagraphStyle3 != null) {
            PlatformParagraphStyle platformParagraphStyle4 = PlatformParagraphStyle.Default;
            if (platformParagraphStyle2 == null) {
                platformParagraphStyle2 = platformParagraphStyle4;
            }
            if (platformParagraphStyle3 == null) {
                platformParagraphStyle3 = platformParagraphStyle4;
            }
            platformParagraphStyle = TextPainterKt.lerp(platformParagraphStyle2, platformParagraphStyle3, f);
        }
        return new TextStyle(spanStyle3, new ParagraphStyle(i2, i3, m975lerpTextUnitInheritableC3pnCVY3, lerp5, platformParagraphStyle, (LineHeightStyle) SpanStyleKt.lerpDiscrete(paragraphStyle.lineHeightStyle, paragraphStyle2.lineHeightStyle, f), ((LineBreak) SpanStyleKt.lerpDiscrete(new LineBreak(paragraphStyle.lineBreak), new LineBreak(paragraphStyle2.lineBreak), f)).mask, ((Hyphens) SpanStyleKt.lerpDiscrete(new Hyphens(paragraphStyle.hyphens), new Hyphens(paragraphStyle2.hyphens), f)).value, (TextMotion) SpanStyleKt.lerpDiscrete(paragraphStyle.textMotion, paragraphStyle2.textMotion, f)));
    }

    public static void logAndReturnNull(String str) {
        Timber.Forest.w("Skipping passkey credential with missing required field: ".concat(str), new Object[0]);
    }

    public static ButtonValues modal(Composer composer) {
        return new ButtonValues(m1091DpSizeYgX7TsA(48.0f, 56.0f), 8.0f, new PaddingValuesImpl(24.0f, 16.0f, 24.0f, 16.0f), TextStyle.m994copyp1EtxEg$default(((Typography) ((GapComposer) composer).consume(ArcadeThemeKt.LocalTypography)).button, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744447), ButtonValues.ClipType.Rectangle.INSTANCE);
    }

    public static Flow moleculeFlow$default(Function2 function2) {
        RecompositionMode recompositionMode = RecompositionMode.ContextClock;
        return new SafeFlow(new RealImageLoader$execute$2(PlatformKt.defaultSnapshotNotifier(), function2, (Continuation) null, 16));
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x011b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final TextStyle resolveDefaults(TextStyle textStyle, LayoutDirection layoutDirection) {
        long j;
        TextIndent textIndent;
        int i;
        int i2;
        TextMotion textMotion;
        SpanStyle spanStyle = textStyle.spanStyle;
        TextForegroundStyle textForegroundStyle = SpanStyleKt.DefaultColorForegroundStyle;
        TextForegroundStyle textForegroundStyle2 = spanStyle.textForegroundStyle;
        if (textForegroundStyle2.equals(TextForegroundStyle.Unspecified.INSTANCE)) {
            textForegroundStyle2 = SpanStyleKt.DefaultColorForegroundStyle;
        }
        TextForegroundStyle textForegroundStyle3 = textForegroundStyle2;
        long j2 = spanStyle.fontSize;
        TextUnitType[] textUnitTypeArr = TextUnit.TextUnitTypes;
        if ((j2 & 1095216660480L) == 0) {
            j2 = SpanStyleKt.DefaultFontSize;
        }
        long j3 = j2;
        FontWeight fontWeight = spanStyle.fontWeight;
        if (fontWeight == null) {
            fontWeight = FontWeight.Normal;
        }
        FontWeight fontWeight2 = fontWeight;
        FontStyle fontStyle = spanStyle.fontStyle;
        FontStyle fontStyle2 = new FontStyle(fontStyle != null ? fontStyle.value : 0);
        FontSynthesis fontSynthesis = spanStyle.fontSynthesis;
        FontSynthesis fontSynthesis2 = new FontSynthesis(fontSynthesis != null ? fontSynthesis.value : 65535);
        FontFamily fontFamily = spanStyle.fontFamily;
        if (fontFamily == null) {
            fontFamily = FontFamily.Default;
        }
        FontFamily fontFamily2 = fontFamily;
        String str = spanStyle.fontFeatureSettings;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        long j4 = spanStyle.letterSpacing;
        if ((j4 & 1095216660480L) == 0) {
            j4 = SpanStyleKt.DefaultLetterSpacing;
        }
        long j5 = j4;
        BaselineShift baselineShift = spanStyle.baselineShift;
        float f = RecyclerView.DECELERATION_RATE;
        float f2 = baselineShift != null ? baselineShift.multiplier : 0.0f;
        if (!Float.isNaN(f2)) {
            f = f2;
        }
        BaselineShift baselineShift2 = new BaselineShift(f);
        TextGeometricTransform textGeometricTransform = spanStyle.textGeometricTransform;
        if (textGeometricTransform == null) {
            textGeometricTransform = TextGeometricTransform.None;
        }
        TextGeometricTransform textGeometricTransform2 = textGeometricTransform;
        LocaleList localeList = spanStyle.localeList;
        if (localeList == null) {
            LocaleList localeList2 = LocaleList.Empty;
            localeList = PlatformLocaleKt.platformLocaleDelegate.getCurrent();
        }
        LocaleList localeList3 = localeList;
        long j6 = spanStyle.background;
        if (j6 == 16) {
            j6 = SpanStyleKt.DefaultBackgroundColor;
        }
        long j7 = j6;
        TextDecoration textDecoration = spanStyle.textDecoration;
        if (textDecoration == null) {
            textDecoration = TextDecoration.None;
        }
        TextDecoration textDecoration2 = textDecoration;
        Shadow shadow = spanStyle.shadow;
        if (shadow == null) {
            shadow = Shadow.None;
        }
        Shadow shadow2 = shadow;
        PlatformSpanStyle platformSpanStyle = spanStyle.platformStyle;
        DrawStyle drawStyle = spanStyle.drawStyle;
        if (drawStyle == null) {
            drawStyle = Fill.INSTANCE;
        }
        SpanStyle spanStyle2 = new SpanStyle(textForegroundStyle3, j3, fontWeight2, fontStyle2, fontSynthesis2, fontFamily2, str2, j5, baselineShift2, textGeometricTransform2, localeList3, j7, textDecoration2, shadow2, platformSpanStyle, drawStyle);
        ParagraphStyle paragraphStyle = textStyle.paragraphStyle;
        int i3 = ParagraphStyleKt.$r8$clinit;
        int i4 = paragraphStyle.textAlign;
        int i5 = 5;
        if (i4 == 0) {
            i4 = 5;
        }
        int i6 = paragraphStyle.textDirection;
        if (i6 != 3) {
            if (i6 == 0) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal == 0) {
                    i6 = 1;
                } else {
                    if (ordinal != 1) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    i5 = 2;
                }
            }
            j = paragraphStyle.lineHeight;
            if ((j & 1095216660480L) == 0) {
                j = ParagraphStyleKt.DefaultLineHeight;
            }
            textIndent = paragraphStyle.textIndent;
            if (textIndent == null) {
                textIndent = TextIndent.None;
            }
            PlatformParagraphStyle platformParagraphStyle = paragraphStyle.platformStyle;
            LineHeightStyle lineHeightStyle = paragraphStyle.lineHeightStyle;
            i = paragraphStyle.lineBreak;
            int i7 = LineBreak.Simple;
            if (i == 0) {
                i = LineBreak.Simple;
            }
            i2 = paragraphStyle.hyphens;
            if (i2 == 0) {
                i2 = 1;
            }
            textMotion = paragraphStyle.textMotion;
            if (textMotion == null) {
                textMotion = TextMotion.Static;
            }
            return new TextStyle(spanStyle2, new ParagraphStyle(i4, i6, j, textIndent, platformParagraphStyle, lineHeightStyle, i, i2, textMotion), textStyle.platformStyle);
        }
        int ordinal2 = layoutDirection.ordinal();
        if (ordinal2 == 0) {
            i5 = 4;
        } else if (ordinal2 != 1) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        i6 = i5;
        j = paragraphStyle.lineHeight;
        if ((j & 1095216660480L) == 0) {
        }
        textIndent = paragraphStyle.textIndent;
        if (textIndent == null) {
        }
        PlatformParagraphStyle platformParagraphStyle2 = paragraphStyle.platformStyle;
        LineHeightStyle lineHeightStyle2 = paragraphStyle.lineHeightStyle;
        i = paragraphStyle.lineBreak;
        int i72 = LineBreak.Simple;
        if (i == 0) {
        }
        i2 = paragraphStyle.hyphens;
        if (i2 == 0) {
        }
        textMotion = paragraphStyle.textMotion;
        if (textMotion == null) {
        }
        return new TextStyle(spanStyle2, new ParagraphStyle(i4, i6, j, textIndent, platformParagraphStyle2, lineHeightStyle2, i, i2, textMotion), textStyle.platformStyle);
    }

    public static final void setTypeface(TextView textView, int i) {
        textView.setTypeface(ResourcesCompat.getFont(textView.getContext(), i));
    }

    public static int smear(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int smearedHash(Object obj) {
        return smear(obj == null ? 0 : obj.hashCode());
    }

    public static final HttpUrl toHttpUrl(String str) {
        str.getClass();
        HttpUrl.Builder builder = new HttpUrl.Builder();
        builder.parse$okhttp(null, str);
        return builder.build();
    }

    public static final List toImmutableList(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? Collections.unmodifiableList(new ArrayList(list)) : Collections.singletonList(CollectionsKt.first(list)) : EmptyList.INSTANCE;
    }

    public static final Map toImmutableMap(Map map) {
        int size = map.size();
        if (size == 0) {
            EmptyMap emptyMap = EmptyMap.INSTANCE;
            emptyMap.getClass();
            return emptyMap;
        }
        if (size != 1) {
            return Collections.unmodifiableMap(new LinkedHashMap(map));
        }
        Map.Entry entry = (Map.Entry) CollectionsKt.first(map.entrySet());
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static ByteArrayProtoReader32 widthOfFloat$default(ByteArrayProtoReader32 byteArrayProtoReader32, Function1 function1) {
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(1);
        Constraint constraint = (Constraint) byteArrayProtoReader32.protoReader;
        constraint.setMode(1);
        constraint.lambda = new CacheDrawScope$onDrawBehind$1(2, function1);
        byteArrayProtoReader32.pushedLimit = 0;
        return byteArrayProtoReader32;
    }

    public abstract boolean contains$ui(Extras.Key key);

    public abstract String decodeUtf8(byte[] bArr, int i, int i2);

    public abstract int encodeUtf8(String str, byte[] bArr, int i, int i2);

    public abstract Object get$ui(Extras.Key key);

    public static BalanceHomePresenter.MetroFactory create(DemandDepositAccountFormatter.MetroFactory metroFactory, LambdaProvider lambdaProvider, InstanceFactory instanceFactory, DoubleCheck doubleCheck, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck2, RealSessionFlags.MetroFactory metroFactory2, TemporaryStorage.MetroFactory metroFactory3, RealAppLockState.MetroFactory metroFactory4, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, DoubleCheck doubleCheck3, TreehouseFlows.MetroFactory metroFactory5, DoubleCheck doubleCheck4, RealMessageSigner.MetroFactory metroFactory6, InstanceFactory instanceFactory4, DoubleCheck doubleCheck5, InstanceFactory instanceFactory5, RealPasscodeFlowStarter.MetroFactory metroFactory7, DoubleCheck doubleCheck6) {
        metroFactory.getClass();
        lambdaProvider.getClass();
        instanceFactory.getClass();
        doubleCheck.getClass();
        lambdaProvider2.getClass();
        doubleCheck2.getClass();
        metroFactory2.getClass();
        metroFactory3.getClass();
        metroFactory4.getClass();
        instanceFactory3.getClass();
        doubleCheck3.getClass();
        metroFactory5.getClass();
        doubleCheck4.getClass();
        metroFactory6.getClass();
        instanceFactory4.getClass();
        doubleCheck5.getClass();
        instanceFactory5.getClass();
        metroFactory7.getClass();
        doubleCheck6.getClass();
        return new BalanceHomePresenter.MetroFactory(metroFactory, lambdaProvider, instanceFactory, doubleCheck, lambdaProvider2, doubleCheck2, metroFactory2, metroFactory3, metroFactory4, instanceFactory2, instanceFactory3, doubleCheck3, metroFactory5, doubleCheck4, metroFactory6, instanceFactory4, doubleCheck5, instanceFactory5, metroFactory7, doubleCheck6);
    }
}
