package androidx.tracing;

import android.content.Context;
import android.os.Build;
import android.text.InputFilter;
import android.text.method.TransformationMethod;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.ArrayMap;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ImageKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1;
import androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2;
import androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManagerImplApi34;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2;
import androidx.compose.foundation.text.input.internal.TextFieldDecoratorModifierNode$startInputSession$1$1$1;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda7;
import androidx.compose.runtime.AbstractApplier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.composer.gapbuffer.GapAnchor;
import androidx.compose.runtime.composer.gapbuffer.SlotTableKt;
import androidx.compose.runtime.composer.gapbuffer.SlotWriter;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.platform.AndroidPlatformTextInputSession;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.unit.Dp;
import androidx.concurrent.futures.AbstractResolvableFuture;
import androidx.core.os.BundleKt;
import androidx.core.view.WindowCompat$Api30Impl;
import androidx.core.view.WindowCompat$Api35Impl;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt$preferencesDataStore$1;
import androidx.datastore.preferences.PreferenceDataStoreSingletonDelegate;
import androidx.media3.exoplayer.MediaPeriodHolder;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TransactionExecutor;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import androidx.work.Configuration;
import androidx.work.Logger$LogcatLogger;
import androidx.work.SystemClock;
import androidx.work.WorkInfo;
import androidx.work.impl.CleanupCallback;
import androidx.work.impl.Migration_1_2;
import androidx.work.impl.Processor;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkLauncherImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.WorkManagerImplExtKt$WorkManagerImpl$1;
import androidx.work.impl.WorkMigration9To10;
import androidx.work.impl.WorkerWrapper;
import androidx.work.impl.constraints.trackers.Trackers;
import androidx.work.impl.model.DependencyDao_Impl;
import androidx.work.impl.model.WorkSpecDao_Impl;
import androidx.work.impl.utils.taskexecutor.WorkManagerTaskExecutor;
import app.cash.sqldelight.ExecutableQuery;
import app.cash.sqldelight.ExecutableQuery$$ExternalSyntheticLambda0;
import app.cash.sqldelight.async.coroutines.QueryExtensionsKt$awaitAsOne$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.memory.MemoryCacheService;
import com.bugsnag.android.JsonStream;
import com.bugsnag.android.ndk.OpaqueValue;
import com.google.crypto.tink.Parameters;
import com.google.crypto.tink.internal.LegacyProtoParameters;
import com.google.crypto.tink.internal.MutableSerializationRegistry;
import com.google.crypto.tink.internal.PrimitiveRegistry$$ExternalSyntheticLambda0;
import com.google.crypto.tink.internal.SerializationRegistry;
import com.google.crypto.tink.internal.Util;
import com.google.crypto.tink.mac.MacWrapper$$ExternalSyntheticLambda0;
import com.google.crypto.tink.proto.KeyTemplate;
import com.google.crypto.tink.shaded.protobuf.ExtensionRegistryLite;
import com.google.crypto.tink.util.Bytes;
import com.google.firebase.components.Component;
import com.google.firebase.components.Component$$ExternalSyntheticLambda0;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.firebase.datastorage.JavaDataStorage$$ExternalSyntheticLambda0;
import com.google.firebase.platforminfo.AutoValue_LibraryVersion;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.AlignmentLinesKt;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.IconKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.components.internal.UtilsKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.benefits.views.BenefitsHomeViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.bitcoin.presenters.BitcoinPresenterFactory;
import com.squareup.cash.cdf.UserJourneyName;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.FeatureFlagManagerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.featureflags.FeatureFlagManagerKt$selectClientSyncValue$$inlined$flatMapLatest$1;
import com.squareup.cash.featureflags.FeatureFlagManagerKt$valuesState$2;
import com.squareup.cash.featureflags.JsonFeatureFlags$MigratedSyncValuesFlag;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.mooncake.themes.AppThemePalettesKt;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.Theme;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.scrubbing.CardNumberKt;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.SyncValueType;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.util.coroutines.DerivedStateFlow;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.Charsets;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.scheduling.DefaultIoScheduler;
import kotlinx.coroutines.scheduling.DefaultScheduler;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.SafeTrace;

/* loaded from: classes.dex */
public abstract class Trace {
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0063  */
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1190Iconww6aTOc(Painter painter, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long j2;
        Modifier modifier3;
        long j3;
        RecomposeScopeImpl endRestartGroup;
        long j4;
        painter.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(426066180);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? gapComposer.changed(painter) : gapComposer.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
                j2 = j;
            } else {
                j2 = j;
                if ((i & 3072) == 0) {
                    i3 |= gapComposer.changed(j2) ? 2048 : 1024;
                }
            }
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
                gapComposer.skipToGroupEnd();
                modifier3 = modifier2;
                j3 = j2;
            } else {
                Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                long j5 = i4 != 0 ? Color.Unspecified : j2;
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new ArrayMap(1);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier recordVerticalCenter = AlignmentLinesKt.recordVerticalCenter(modifier4, AlignmentLinesKt.FirstLineCenter, (ArrayMap) rememberedValue);
                gapComposer.startReplaceGroup(1427717268);
                if (j5 != 16) {
                    j4 = j5;
                } else {
                    gapComposer.startReplaceGroup(1427718684);
                    j4 = ((Color) gapComposer.consume(ArcadeThemeKt.LocalIconColor)).value;
                    if (j4 == 16) {
                        Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                        } else {
                            gapComposer.startReplaceGroup(-1762997739);
                            gapComposer.end(false);
                        }
                        j4 = colors.semantic.icon.standard;
                    }
                    gapComposer.end(false);
                }
                gapComposer.end(false);
                ImageKt.Image(painter, str, recordVerticalCenter, null, null, RecyclerView.DECELERATION_RATE, UtilsKt.m3398tintFilter8_81llA(j4), gapComposer, Painter.$stable | (i3 & 14) | (i3 & 112), 56);
                modifier3 = modifier4;
                j3 = j5;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new IconKt$$ExternalSyntheticLambda0(painter, str, modifier3, j3, i, i2, 1);
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) == 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final long Offset(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final SemanticsNode SemanticsNode(LayoutNode layoutNode, boolean z) {
        NodeChain nodeChain = layoutNode.nodes;
        Object obj = null;
        if ((((Modifier.Node) nodeChain.head).getAggregateChildKindSet$ui() & 8) != 0) {
            Modifier.Node node = (Modifier.Node) nodeChain.head;
            loop0: while (true) {
                if (node == null) {
                    break;
                }
                if ((node.getKindSet$ui() & 8) != 0) {
                    Modifier.Node node2 = node;
                    MutableVector mutableVector = null;
                    while (node2 != null) {
                        if (node2 instanceof SemanticsModifierNode) {
                            obj = node2;
                            break loop0;
                        }
                        if ((node2.getKindSet$ui() & 8) != 0 && (node2 instanceof DelegatingNode)) {
                            int i = 0;
                            for (Modifier.Node node3 = ((DelegatingNode) node2).delegate; node3 != null; node3 = node3.getChild$ui()) {
                                if ((node3.getKindSet$ui() & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        node2 = node3;
                                    } else {
                                        if (mutableVector == null) {
                                            mutableVector = new MutableVector(0, new Modifier.Node[16]);
                                        }
                                        if (node2 != null) {
                                            mutableVector.add(node2);
                                            node2 = null;
                                        }
                                        mutableVector.add(node3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        node2 = DepthSortedSetKt.access$pop(mutableVector);
                    }
                }
                if ((node.getAggregateChildKindSet$ui() & 8) == 0) {
                    break;
                }
                node = node.getChild$ui();
            }
        }
        obj.getClass();
        Modifier.Node node4 = ((Modifier.Node) ((SemanticsModifierNode) obj)).getNode();
        SemanticsConfiguration semanticsConfiguration = layoutNode.getSemanticsConfiguration();
        if (semanticsConfiguration == null) {
            semanticsConfiguration = new SemanticsConfiguration();
        }
        return new SemanticsNode(node4, z, layoutNode, semanticsConfiguration);
    }

    public static final void TitleBarCore(Modifier modifier, DynamicColorConfiguration dynamicColorConfiguration, Function3 function3, Function3 function32, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1326426284);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changed(dynamicColorConfiguration) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function32) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(composableLambdaImpl) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            Updater.CompositionLocalProvider(new ProvidedValue[]{Recorder$$ExternalSyntheticOutline2.m(dynamicColorConfiguration.titleBarIcon, ArcadeThemeKt.LocalIconColor), re$$ExternalSyntheticOutline0.m(dynamicColorConfiguration.titleBarText, ArcadeThemeKt.LocalTextColor)}, Expect_jvmKt.rememberComposableLambda(-1423705452, new SliderKt$$ExternalSyntheticLambda7(modifier, function3, ((Dp) gapComposer.consume(ArcadeThemeKt.LocalScreenMargin)).value, function32, composableLambdaImpl, 2), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(modifier, dynamicColorConfiguration, function3, function32, composableLambdaImpl, i, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object awaitAsOne(ExecutableQuery executableQuery, ContinuationImpl continuationImpl) {
        QueryExtensionsKt$awaitAsOne$1 queryExtensionsKt$awaitAsOne$1;
        Object obj;
        int i;
        if (continuationImpl instanceof QueryExtensionsKt$awaitAsOne$1) {
            queryExtensionsKt$awaitAsOne$1 = (QueryExtensionsKt$awaitAsOne$1) continuationImpl;
            int i2 = queryExtensionsKt$awaitAsOne$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                queryExtensionsKt$awaitAsOne$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = queryExtensionsKt$awaitAsOne$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = queryExtensionsKt$awaitAsOne$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    queryExtensionsKt$awaitAsOne$1.L$0 = executableQuery;
                    queryExtensionsKt$awaitAsOne$1.label = 1;
                    obj = executableQuery.execute(new ExecutableQuery$$ExternalSyntheticLambda0(executableQuery, 3)).await(queryExtensionsKt$awaitAsOne$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    executableQuery = queryExtensionsKt$awaitAsOne$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (obj == null) {
                    return obj;
                }
                throw new NullPointerException("ResultSet returned null for " + executableQuery);
            }
        }
        queryExtensionsKt$awaitAsOne$1 = new QueryExtensionsKt$awaitAsOne$1(continuationImpl);
        obj = queryExtensionsKt$awaitAsOne$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = queryExtensionsKt$awaitAsOne$1.label;
        if (i != 0) {
        }
        if (obj == null) {
        }
    }

    public static String badPositionIndex(int i, int i2, String str) {
        if (i < 0) {
            return DBUtil.lenientFormat("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return DBUtil.lenientFormat("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
        return null;
    }

    public static final void beginAsyncSection(String str, int i) {
        str.getClass();
        android.os.Trace.beginAsyncSection(truncatedTraceSectionLabel(str), i);
    }

    public static final void cancel(WorkManagerImpl workManagerImpl, String str) {
        WorkerWrapper cleanUpWorkerUnsafe;
        WorkDatabase workDatabase = workManagerImpl.mWorkDatabase;
        workDatabase.getClass();
        WorkSpecDao_Impl workSpecDao = workDatabase.workSpecDao();
        DependencyDao_Impl dependencyDao = workDatabase.dependencyDao();
        ArrayList mutableListOf = CollectionsKt__CollectionsKt.mutableListOf(str);
        while (!mutableListOf.isEmpty()) {
            String str2 = (String) CollectionsKt__MutableCollectionsKt.removeLast(mutableListOf);
            WorkInfo.State state = workSpecDao.getState(str2);
            if (state != WorkInfo.State.SUCCEEDED && state != WorkInfo.State.FAILED) {
                ((Number) DBUtil.performBlocking(workSpecDao.__db, false, true, new ImageKt$$ExternalSyntheticLambda0(str2, 8))).intValue();
            }
            mutableListOf.addAll(dependencyDao.getDependentWorkIds(str2));
        }
        Processor processor = workManagerImpl.mProcessor;
        processor.getClass();
        synchronized (processor.mLock) {
            Logger$LogcatLogger.get().debug(Processor.TAG, "Processor cancelling " + str);
            processor.mCancelledIds.add(str);
            cleanUpWorkerUnsafe = processor.cleanUpWorkerUnsafe(str);
        }
        Processor.interrupt(str, cleanUpWorkerUnsafe, 1);
        Iterator it = workManagerImpl.mSchedulers.iterator();
        while (it.hasNext()) {
            ((Scheduler) it.next()).cancel(str);
        }
    }

    public static void checkArgument(int i, int i2, String str, boolean z) {
        if (z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3(DBUtil.lenientFormat(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void checkElementIndex(int i, int i2) {
        String lenientFormat;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                lenientFormat = DBUtil.lenientFormat("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "negative size: "));
                    return;
                }
                lenientFormat = DBUtil.lenientFormat("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(lenientFormat);
        }
    }

    public static void checkNotNull(String str, Object obj, Object obj2) {
        if (obj != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$2(DBUtil.lenientFormat(str, obj2));
    }

    public static void checkPositionIndex(int i, int i2) {
        if (i < 0 || i > i2) {
            Path$$ExternalSyntheticBUOutline0.m(badPositionIndex(i, i2, "index"));
        }
    }

    public static void checkPositionIndexes(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? badPositionIndex(i, i3, "start index") : (i2 < 0 || i2 > i3) ? badPositionIndex(i2, i3, "end index") : DBUtil.lenientFormat("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    public static void checkState(String str, int i, boolean z) {
        if (z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1(DBUtil.lenientFormat(str, Integer.valueOf(i)));
    }

    public static BitcoinPresenterFactory.MetroFactory create(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, InstanceFactory instanceFactory10, InstanceFactory instanceFactory11, InstanceFactory instanceFactory12, InstanceFactory instanceFactory13, InstanceFactory instanceFactory14, InstanceFactory instanceFactory15, InstanceFactory instanceFactory16, InstanceFactory instanceFactory17, InstanceFactory instanceFactory18, InstanceFactory instanceFactory19, InstanceFactory instanceFactory20, InstanceFactory instanceFactory21, InstanceFactory instanceFactory22, InstanceFactory instanceFactory23, InstanceFactory instanceFactory24, InstanceFactory instanceFactory25, InstanceFactory instanceFactory26, InstanceFactory instanceFactory27, InstanceFactory instanceFactory28, InstanceFactory instanceFactory29, InstanceFactory instanceFactory30, InstanceFactory instanceFactory31, InstanceFactory instanceFactory32, InstanceFactory instanceFactory33, InstanceFactory instanceFactory34, InstanceFactory instanceFactory35, InstanceFactory instanceFactory36, InstanceFactory instanceFactory37) {
        instanceFactory2.getClass();
        instanceFactory10.getClass();
        instanceFactory36.getClass();
        return new BitcoinPresenterFactory.MetroFactory(instanceFactory, (Provider) instanceFactory2, instanceFactory3, instanceFactory4, instanceFactory5, instanceFactory6, instanceFactory7, instanceFactory8, instanceFactory9, (Provider) instanceFactory10, instanceFactory11, instanceFactory12, instanceFactory13, instanceFactory14, instanceFactory15, instanceFactory16, instanceFactory17, instanceFactory18, instanceFactory19, instanceFactory20, instanceFactory21, instanceFactory22, instanceFactory23, instanceFactory24, instanceFactory25, instanceFactory26, instanceFactory27, instanceFactory28, instanceFactory29, instanceFactory30, instanceFactory31, instanceFactory32, instanceFactory33, instanceFactory34, instanceFactory35, (Provider) instanceFactory36, instanceFactory37);
    }

    public static final WorkManagerImpl createWorkManager(Context context, Configuration configuration) {
        RoomDatabase.Builder databaseBuilder;
        context.getClass();
        WorkManagerTaskExecutor workManagerTaskExecutor = new WorkManagerTaskExecutor(configuration.taskExecutor);
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        TransactionExecutor transactionExecutor = workManagerTaskExecutor.mBackgroundExecutor;
        transactionExecutor.getClass();
        SystemClock systemClock = configuration.clock;
        boolean z = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        systemClock.getClass();
        int i = 2;
        if (z) {
            databaseBuilder = new RoomDatabase.Builder(applicationContext, WorkDatabase.class, null);
            databaseBuilder.allowMainThreadQueries = true;
        } else {
            databaseBuilder = Room.databaseBuilder(applicationContext, WorkDatabase.class, "androidx.work.workdb");
            databaseBuilder.supportOpenHelperFactory = new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(applicationContext, i);
        }
        databaseBuilder.queryExecutor = transactionExecutor;
        databaseBuilder.callbacks.add(new CleanupCallback(systemClock));
        databaseBuilder.addMigrations(Migration_1_2.INSTANCE);
        databaseBuilder.addMigrations(new WorkMigration9To10(applicationContext, 2, 3));
        databaseBuilder.addMigrations(Migration_1_2.INSTANCE$5);
        databaseBuilder.addMigrations(Migration_1_2.INSTANCE$6);
        databaseBuilder.addMigrations(new WorkMigration9To10(applicationContext, 5, 6));
        databaseBuilder.addMigrations(Migration_1_2.INSTANCE$7);
        databaseBuilder.addMigrations(Migration_1_2.INSTANCE$8);
        databaseBuilder.addMigrations(Migration_1_2.INSTANCE$9);
        databaseBuilder.addMigrations(new WorkMigration9To10(applicationContext));
        databaseBuilder.addMigrations(new WorkMigration9To10(applicationContext, 10, 11));
        databaseBuilder.addMigrations(Migration_1_2.INSTANCE$1);
        databaseBuilder.addMigrations(Migration_1_2.INSTANCE$2);
        databaseBuilder.addMigrations(Migration_1_2.INSTANCE$3);
        databaseBuilder.addMigrations(Migration_1_2.INSTANCE$4);
        databaseBuilder.addMigrations(new WorkMigration9To10(applicationContext, 21, 22));
        databaseBuilder.requireMigration = false;
        databaseBuilder.allowDestructiveMigrationOnDowngrade = true;
        databaseBuilder.allowDestructiveMigrationForAllTables = true;
        WorkDatabase workDatabase = (WorkDatabase) databaseBuilder.build();
        Context applicationContext2 = context.getApplicationContext();
        applicationContext2.getClass();
        Trackers trackers = new Trackers(applicationContext2, workManagerTaskExecutor);
        Processor processor = new Processor(context.getApplicationContext(), configuration, workManagerTaskExecutor, workDatabase);
        return new WorkManagerImpl(context.getApplicationContext(), configuration, workManagerTaskExecutor, workDatabase, (List) WorkManagerImplExtKt$WorkManagerImpl$1.INSTANCE.invoke(context, configuration, workManagerTaskExecutor, workDatabase, trackers, processor), processor, trackers);
    }

    public static final void endAsyncSection(String str, int i) {
        str.getClass();
        android.os.Trace.endAsyncSection(truncatedTraceSectionLabel(str), i);
    }

    public static Component fromContext(String str, MacWrapper$$ExternalSyntheticLambda0 macWrapper$$ExternalSyntheticLambda0) {
        Component.Builder builder = Component.builder(AutoValue_LibraryVersion.class);
        builder.f1004type = 1;
        builder.add(Dependency.required(Context.class));
        builder.factory = new PrimitiveRegistry$$ExternalSyntheticLambda0(1, str, macWrapper$$ExternalSyntheticLambda0);
        return builder.build();
    }

    public static List generateNextBlockers(ScenarioPlan scenarioPlan, RequestContext requestContext) {
        List<BlockerDescriptor> list;
        if (scenarioPlan == null || (list = scenarioPlan.blocker_descriptors) == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            BlockerDescriptor blockerDescriptor = (BlockerDescriptor) obj;
            if (requestContext == null || !requestContext.skipped_blockers.contains(blockerDescriptor)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((BlockerDescriptor) next).blocker != null) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    public static final OnBackPressedDispatcherOwner get(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = tag instanceof OnBackPressedDispatcherOwner ? (OnBackPressedDispatcherOwner) tag : null;
            if (onBackPressedDispatcherOwner != null) {
                return onBackPressedDispatcherOwner;
            }
            Object parentOrViewTreeDisjointParent = BundleKt.getParentOrViewTreeDisjointParent(view);
            view = parentOrViewTreeDisjointParent instanceof View ? (View) parentOrViewTreeDisjointParent : null;
        }
        return null;
    }

    /* renamed from: lerp-Wko1d7g, reason: not valid java name */
    public static final long m1192lerpWko1d7g(float f, long j, long j2) {
        float lerp = TransactorKt.lerp(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j2 >> 32)), f);
        float lerp2 = TransactorKt.lerp(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (j2 & BodyPartID.bodyIdMax)), f);
        return (Float.floatToRawIntBits(lerp) << 32) | (Float.floatToRawIntBits(lerp2) & BodyPartID.bodyIdMax);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
    
        if (r2.length < 64) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0039, code lost:
    
        return r7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object makeSafe(Object obj) {
        if ((obj instanceof Boolean) || (obj instanceof Number)) {
            return obj;
        }
        boolean z = obj instanceof String;
        if (z) {
            String str = (String) obj;
            if (str.length() < 64) {
                int i = 0;
                while (true) {
                    if (i >= str.length()) {
                        break;
                    }
                    if (str.charAt(i) <= 127) {
                        i++;
                    } else {
                        byte[] bytes = str.getBytes(Charsets.UTF_8);
                        bytes.getClass();
                    }
                }
            }
        }
        if (!z && !(obj instanceof Map) && !(obj instanceof Collection) && !(obj instanceof Object[])) {
            return null;
        }
        StringWriter stringWriter = new StringWriter(256);
        try {
            new JsonStream(stringWriter).value(obj, false);
            stringWriter.close();
            return new OpaqueValue(stringWriter.toString());
        } finally {
        }
    }

    public static final ThemeInfo moonCakeDark(Context context) {
        return new ThemeInfo(Theme.MooncakeDark, AppThemePalettesKt.darkThemePalette, ColorsDarkKt.colorsDark);
    }

    public static final ThemeInfo moonCakeLight(Context context) {
        context.getClass();
        return new ThemeInfo(Theme.MooncakeLight, AppThemePalettesKt.lightThemePalette, ColorsLightKt.colorsLight);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List moveGroup(SlotWriter slotWriter, int i, SlotWriter slotWriter2, boolean z, boolean z2, boolean z3) {
        EmptyList emptyList;
        boolean z4;
        int i2;
        int i3;
        int groupSize = slotWriter.groupSize(i);
        int i4 = i + groupSize;
        int dataIndex = slotWriter.dataIndex(i);
        int dataIndex2 = slotWriter.dataIndex(i4);
        int i5 = dataIndex2 - dataIndex;
        boolean z5 = i >= 0 && (slotWriter.groups[(slotWriter.groupIndexToAddress(i) * 5) + 1] & 201326592) != 0;
        slotWriter2.insertGroups(groupSize);
        slotWriter2.insertSlots(i5, slotWriter2.currentGroup);
        if (slotWriter.groupGapStart < i4) {
            slotWriter.moveGroupGapTo(i4);
        }
        if (slotWriter.slotsGapStart < dataIndex2) {
            slotWriter.moveSlotGapTo(dataIndex2, i4);
        }
        int[] iArr = slotWriter2.groups;
        int i6 = slotWriter2.currentGroup;
        int i7 = i6 * 5;
        ArraysKt___ArraysJvmKt.copyInto(i7, slotWriter.groups, i * 5, i4 * 5, iArr);
        Object[] objArr = slotWriter2.slots;
        int i8 = slotWriter2.currentSlot;
        System.arraycopy(slotWriter.slots, dataIndex, objArr, i8, i5);
        int i9 = slotWriter2.parent;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + groupSize;
        int dataIndex3 = i8 - slotWriter2.dataIndex(i6, iArr);
        int i12 = slotWriter2.slotsGapOwner;
        int i13 = slotWriter2.slotsGapLen;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int dataIndex4 = slotWriter2.dataIndex(i15, iArr) + dataIndex3;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = slotWriter2.slotsGapStart;
            }
            iArr2[(i15 * 5) + 4] = SlotWriter.dataIndexToDataAnchor(dataIndex4, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        slotWriter2.slotsGapOwner = i14;
        int access$locationOf = SlotTableKt.access$locationOf(slotWriter.anchors, i, slotWriter.getSize$runtime());
        int access$locationOf2 = SlotTableKt.access$locationOf(slotWriter.anchors, i4, slotWriter.getSize$runtime());
        if (access$locationOf < access$locationOf2) {
            ArrayList arrayList = slotWriter.anchors;
            ArrayList arrayList2 = new ArrayList(access$locationOf2 - access$locationOf);
            for (int i17 = access$locationOf; i17 < access$locationOf2; i17++) {
                GapAnchor gapAnchor = (GapAnchor) arrayList.get(i17);
                gapAnchor.location += i10;
                arrayList2.add(gapAnchor);
            }
            slotWriter2.anchors.addAll(SlotTableKt.access$locationOf(slotWriter2.anchors, slotWriter2.currentGroup, slotWriter2.getSize$runtime()), arrayList2);
            arrayList.subList(access$locationOf, access$locationOf2).clear();
            emptyList = arrayList2;
        } else {
            emptyList = EmptyList.INSTANCE;
        }
        EmptyList emptyList2 = emptyList;
        if (!emptyList2.isEmpty()) {
            HashMap hashMap = slotWriter.sourceInformationMap;
            HashMap hashMap2 = slotWriter2.sourceInformationMap;
            if (hashMap != null && hashMap2 != null) {
                int size = emptyList2.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = slotWriter2.parent;
        slotWriter2.sourceInformationOf$runtime(i9);
        int parent = slotWriter.parent(i, slotWriter.groups);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = parent >= 0;
            if (z7) {
                slotWriter.startGroup();
                slotWriter.advanceBy(parent - slotWriter.currentGroup);
                slotWriter.startGroup();
            }
            slotWriter.advanceBy(i - slotWriter.currentGroup);
            boolean removeGroup = slotWriter.removeGroup();
            if (z7) {
                slotWriter.skipToGroupEnd();
                slotWriter.endGroup();
                slotWriter.skipToGroupEnd();
                slotWriter.endGroup();
            }
            z4 = removeGroup;
        } else {
            boolean removeGroups = slotWriter.removeGroups(i, groupSize);
            slotWriter.removeSlots(dataIndex, i5, i - 1);
            z4 = removeGroups;
        }
        if (z4) {
            ComposerKt.composeImmediateRuntimeError("Unexpectedly removed anchors");
        }
        int i20 = slotWriter2.nodeCount;
        int i21 = iArr3[i7 + 1];
        slotWriter2.nodeCount = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            slotWriter2.currentGroup = i11;
            slotWriter2.currentSlot = i8 + i5;
        }
        if (z6) {
            slotWriter2.updateContainsMark(i9);
        }
        return emptyList;
    }

    public static Parameters parse(byte[] bArr) {
        try {
            KeyTemplate parseFrom = KeyTemplate.parseFrom(bArr, ExtensionRegistryLite.getEmptyRegistry());
            MutableSerializationRegistry mutableSerializationRegistry = MutableSerializationRegistry.GLOBAL_INSTANCE;
            Bytes checkedToBytesFromPrintableAscii = Util.checkedToBytesFromPrintableAscii(parseFrom.getTypeUrl());
            WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(parseFrom, checkedToBytesFromPrintableAscii);
            SerializationRegistry serializationRegistry = (SerializationRegistry) mutableSerializationRegistry.registry.get();
            serializationRegistry.getClass();
            return !serializationRegistry.parametersParserMap.containsKey(new SerializationRegistry.ParserIndex(WorkLauncherImpl.class, checkedToBytesFromPrintableAscii)) ? new LegacyProtoParameters(workLauncherImpl) : mutableSerializationRegistry.parseParameters(workLauncherImpl);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void platformSpecificTextInputSession(AndroidPlatformTextInputSession androidPlatformTextInputSession, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ImeOptions imeOptions, TextFieldDecoratorModifierNode$startInputSession$1$1$1 textFieldDecoratorModifierNode$startInputSession$1$1$1, TextFieldDecoratorModifierNode$$ExternalSyntheticLambda1 textFieldDecoratorModifierNode$$ExternalSyntheticLambda1, MutableSharedFlow mutableSharedFlow, ViewConfiguration viewConfiguration, TextFieldDecoratorModifierNode$$ExternalSyntheticLambda2 textFieldDecoratorModifierNode$$ExternalSyntheticLambda2, ContinuationImpl continuationImpl) {
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$1;
        int i;
        if (continuationImpl instanceof AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1) {
            androidTextInputSession_androidKt$platformSpecificTextInputSession$1 = (AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1) continuationImpl;
            int i2 = androidTextInputSession_androidKt$platformSpecificTextInputSession$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                androidTextInputSession_androidKt$platformSpecificTextInputSession$1.label = i2 - PKIFailureInfo.systemUnavail;
                AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$12 = androidTextInputSession_androidKt$platformSpecificTextInputSession$1;
                Object obj = androidTextInputSession_androidKt$platformSpecificTextInputSession$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidTextInputSession_androidKt$platformSpecificTextInputSession$12.label;
                if (i == 0) {
                    if (i == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    View view = androidPlatformTextInputSession.view;
                    WorkLauncherImpl composeInputMethodManagerImplApi34 = Build.VERSION.SDK_INT >= 34 ? new ComposeInputMethodManagerImplApi34(view) : new WorkLauncherImpl(view);
                    androidTextInputSession_androidKt$platformSpecificTextInputSession$12.label = 1;
                    platformSpecificTextInputSession(androidPlatformTextInputSession, transformedTextFieldState, textLayoutState, imeOptions, textFieldDecoratorModifierNode$startInputSession$1$1$1, textFieldDecoratorModifierNode$$ExternalSyntheticLambda1, composeInputMethodManagerImplApi34, mutableSharedFlow, viewConfiguration, textFieldDecoratorModifierNode$$ExternalSyntheticLambda2, androidTextInputSession_androidKt$platformSpecificTextInputSession$12);
                    return;
                }
            }
        }
        androidTextInputSession_androidKt$platformSpecificTextInputSession$1 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1(continuationImpl);
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 androidTextInputSession_androidKt$platformSpecificTextInputSession$122 = androidTextInputSession_androidKt$platformSpecificTextInputSession$1;
        Object obj2 = androidTextInputSession_androidKt$platformSpecificTextInputSession$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidTextInputSession_androidKt$platformSpecificTextInputSession$122.label;
        if (i == 0) {
        }
    }

    public static PreferenceDataStoreSingletonDelegate preferencesDataStore$default(String str, MemoryCacheService memoryCacheService, JavaDataStorage$$ExternalSyntheticLambda0 javaDataStorage$$ExternalSyntheticLambda0, int i) {
        if ((i & 2) != 0) {
            memoryCacheService = null;
        }
        Function1 function1 = javaDataStorage$$ExternalSyntheticLambda0;
        if ((i & 4) != 0) {
            function1 = PreferenceDataStoreDelegateKt$preferencesDataStore$1.INSTANCE;
        }
        DefaultScheduler defaultScheduler = Dispatchers.Default;
        return new PreferenceDataStoreSingletonDelegate(str, memoryCacheService, function1, JobKt.CoroutineScope(DefaultIoScheduler.INSTANCE.plus(JobKt.SupervisorJob$default())));
    }

    public static final Object runBlockingUninterruptible(Function2 function2) {
        Thread.interrupted();
        return JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new RealGcmRegistrar$unregister$2(function2, (Continuation) null, 4));
    }

    public static final ChannelFlowTransformLatest selectClientSyncValues(FeatureFlagManager featureFlagManager, SyncValueType syncValueType, Flow flow, Flow flow2) {
        featureFlagManager.getClass();
        flow2.getClass();
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        return FlowKt.transformLatest(realFeatureFlagManager.peekValues(JsonFeatureFlags$MigratedSyncValuesFlag.INSTANCE), new FeatureFlagManagerKt$selectClientSyncValue$$inlined$flatMapLatest$1(null, syncValueType, flow2, realFeatureFlagManager, flow));
    }

    public static byte[] serialize(Parameters parameters) {
        return parameters instanceof LegacyProtoParameters ? ((KeyTemplate) ((LegacyProtoParameters) parameters).serialization.workTaskExecutor).toByteArray() : ((KeyTemplate) ((WorkLauncherImpl) MutableSerializationRegistry.GLOBAL_INSTANCE.serializeParameters(parameters)).workTaskExecutor).toByteArray();
    }

    public static void setDecorFitsSystemWindows(Window window, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 35) {
            WindowCompat$Api35Impl.setDecorFitsSystemWindows(window, z);
        } else if (i >= 30) {
            WindowCompat$Api30Impl.setDecorFitsSystemWindows(window, z);
        } else {
            CardNumberKt.setDecorFitsSystemWindows(window, z);
        }
    }

    public static final ThemeInfo taxesStyle(ThemeInfo themeInfo) {
        themeInfo.getClass();
        ColorPalette colorPalette = themeInfo.colorPalette;
        ColorPalette copy$default = ColorPalette.copy$default(colorPalette, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, colorPalette.taxesTooltipBackground, 0, -1, -1, 234881023);
        Theme theme = themeInfo.theme;
        Colors colors = themeInfo.arcadeColors;
        colors.getClass();
        return new ThemeInfo(theme, copy$default, colors);
    }

    public static final ThemeInfo themeInfoWithArcadeColors(Context context) {
        ColorPalette withArcadeValues;
        Colors colors;
        context.getClass();
        Theme theme = ThemeHelpersKt.findThemeInfo(context).theme;
        Theme theme2 = ThemeHelpersKt.findThemeInfo(context).theme;
        int ordinal = theme.ordinal();
        if (ordinal == 0) {
            withArcadeValues = AppThemePalettesKt.withArcadeValues(AppThemePalettesKt.lightThemePalette, ColorsLightKt.colorsLight);
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            withArcadeValues = AppThemePalettesKt.withArcadeValues(AppThemePalettesKt.darkThemePalette, ColorsDarkKt.colorsDark);
        }
        int ordinal2 = theme.ordinal();
        if (ordinal2 == 0) {
            colors = ColorsLightKt.colorsLight;
        } else {
            if (ordinal2 != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            colors = ColorsDarkKt.colorsDark;
        }
        return new ThemeInfo(theme2, withArcadeValues, colors);
    }

    public static final UserJourney$Name toUserJourneyName(UserJourneyName userJourneyName) {
        userJourneyName.getClass();
        switch (userJourneyName.ordinal()) {
            case 0:
                return UserJourney$Name.ADD_MONEY;
            case 1:
                return UserJourney$Name.BITCOIN_BUY;
            case 2:
                return UserJourney$Name.BITCOIN_SELL;
            case 3:
                return UserJourney$Name.CONTROL_SPENDING;
            case 4:
                return UserJourney$Name.IDENTITY_VERIFICATION;
            case 5:
                return UserJourney$Name.INITIATE_DISPUTE_CLAIM;
            case 6:
                return UserJourney$Name.LINK_INSTRUMENT;
            case 7:
                return UserJourney$Name.LOGIN;
            case 8:
                return UserJourney$Name.MINT_PRODUCT_DETAIL;
            case 9:
                return UserJourney$Name.MINT_TAG_LOCK;
            case 10:
                return UserJourney$Name.MONEYBOT_CHAT;
            case 11:
                return UserJourney$Name.NEARBY_PAYMENT;
            case 12:
                return UserJourney$Name.NEIGHBORHOODS_CREATE_ORDER;
            case 13:
                return UserJourney$Name.OPEN_THE_APP;
            case 14:
                return UserJourney$Name.REQUEST_MONEY;
            case 15:
                return UserJourney$Name.SAM_ACCOUNT_LINKING;
            case 16:
                return UserJourney$Name.SAVINGS_TRANSFER_IN;
            case 17:
                return UserJourney$Name.SAVINGS_TRANSFER_OUT;
            case 18:
                return UserJourney$Name.SEND_MONEY;
            case 19:
                return UserJourney$Name.SEND_MONEY_OON;
            case 20:
                return UserJourney$Name.STOCK_BUY;
            case 21:
                return UserJourney$Name.STOCK_SALE;
            case 22:
                return UserJourney$Name.TEEN_LED_SPONSORSHIP_REQUEST;
            case 23:
                return UserJourney$Name.VIEW_PAPER_MONEY_DEPOSIT_BARCODE;
            case 24:
                return UserJourney$Name.WITHDRAW_MONEY;
            default:
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }

    public static String truncatedTraceSectionLabel(String str) {
        String str2 = str.length() <= 127 ? str : null;
        return str2 == null ? str.substring(0, 127) : str2;
    }

    public static final DerivedStateFlow valuesState(FeatureFlagManager featureFlagManager, AbstractApplier abstractApplier) {
        featureFlagManager.getClass();
        abstractApplier.getClass();
        int i = 0;
        FeatureFlagManagerKt$$ExternalSyntheticLambda0 featureFlagManagerKt$$ExternalSyntheticLambda0 = new FeatureFlagManagerKt$$ExternalSyntheticLambda0(featureFlagManager, abstractApplier, i);
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        return new DerivedStateFlow(featureFlagManagerKt$$ExternalSyntheticLambda0, new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new FeatureFlagManagerKt$valuesState$2(realFeatureFlagManager, abstractApplier, null, i), realFeatureFlagManager.peekValues(abstractApplier)));
    }

    public static final DerivedStateFlow valuesStateExperiment(FeatureFlagManager featureFlagManager, AbstractApplier abstractApplier) {
        featureFlagManager.getClass();
        abstractApplier.getClass();
        int i = 1;
        FeatureFlagManagerKt$$ExternalSyntheticLambda0 featureFlagManagerKt$$ExternalSyntheticLambda0 = new FeatureFlagManagerKt$$ExternalSyntheticLambda0(featureFlagManager, abstractApplier, i);
        RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) featureFlagManager;
        return new DerivedStateFlow(featureFlagManagerKt$$ExternalSyntheticLambda0, new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new FeatureFlagManagerKt$valuesState$2(realFeatureFlagManager, abstractApplier, null, i), realFeatureFlagManager.values(abstractApplier)));
    }

    public static void zza(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                a$$ExternalSyntheticBUOutline0.m$2(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "at index "));
                return;
            }
        }
    }

    public abstract boolean casListeners(AbstractResolvableFuture abstractResolvableFuture, AbstractResolvableFuture.Listener listener, AbstractResolvableFuture.Listener listener2);

    public abstract boolean casValue(AbstractResolvableFuture abstractResolvableFuture, Object obj, Object obj2);

    public abstract boolean casWaiters(AbstractResolvableFuture abstractResolvableFuture, AbstractResolvableFuture.Waiter waiter, AbstractResolvableFuture.Waiter waiter2);

    public abstract InputFilter[] getFilters(InputFilter[] inputFilterArr);

    public abstract boolean isEnabled();

    public abstract void putNext(AbstractResolvableFuture.Waiter waiter, AbstractResolvableFuture.Waiter waiter2);

    public abstract void putThread(AbstractResolvableFuture.Waiter waiter, Thread thread);

    public abstract void setAllCaps(boolean z);

    public abstract void setEnabled(boolean z);

    public abstract TransformationMethod wrapTransformationMethod(TransformationMethod transformationMethod);

    public static void checkNotNull(Object obj, String str) {
        if (obj != null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$2(str);
    }

    public static void checkNotNull(MediaPeriodHolder mediaPeriodHolder) {
        mediaPeriodHolder.getClass();
    }

    public static void checkState(String str, boolean z) {
        if (z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1(str);
    }

    public static void checkState(boolean z) {
        if (z) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m();
    }

    public static void checkState(String str, Object obj, boolean z) {
        if (z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1(DBUtil.lenientFormat(str, obj));
    }

    public static void checkArgument(String str, boolean z) {
        if (z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3(str);
    }

    public static void checkArgument(String str, int i, boolean z) {
        if (z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3(DBUtil.lenientFormat(str, Integer.valueOf(i)));
    }

    public static void checkArgument(long j, String str, boolean z) {
        if (z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3(DBUtil.lenientFormat(str, Long.valueOf(j)));
    }

    public static void checkArgument(String str, Object obj, boolean z) {
        if (z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3(DBUtil.lenientFormat(str, obj));
    }

    public static void checkArgument(boolean z) {
        if (z) {
            return;
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
    }

    public static void checkArgument(boolean z, String str, Object obj, Serializable serializable) {
        if (z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3(DBUtil.lenientFormat(str, obj, serializable));
    }

    public static void checkArgument(boolean z, String str, Number number, Number number2, Number number3) {
        if (z) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3(DBUtil.lenientFormat(str, number, number2, number3));
    }

    public static Component create(String str, String str2) {
        AutoValue_LibraryVersion autoValue_LibraryVersion = new AutoValue_LibraryVersion(str, str2);
        Component.Builder builder = Component.builder(AutoValue_LibraryVersion.class);
        builder.f1004type = 1;
        builder.factory = new Component$$ExternalSyntheticLambda0(autoValue_LibraryVersion, 0);
        return builder.build();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void platformSpecificTextInputSession(AndroidPlatformTextInputSession androidPlatformTextInputSession, TransformedTextFieldState transformedTextFieldState, TextLayoutState textLayoutState, ImeOptions imeOptions, Function1 function1, Function0 function0, WorkLauncherImpl workLauncherImpl, MutableSharedFlow mutableSharedFlow, ViewConfiguration viewConfiguration, Function1 function12, ContinuationImpl continuationImpl) {
        AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2 androidTextInputSession_androidKt$platformSpecificTextInputSession$2;
        int i;
        if (continuationImpl instanceof AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2) {
            androidTextInputSession_androidKt$platformSpecificTextInputSession$2 = (AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2) continuationImpl;
            int i2 = androidTextInputSession_androidKt$platformSpecificTextInputSession$2.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                androidTextInputSession_androidKt$platformSpecificTextInputSession$2.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = androidTextInputSession_androidKt$platformSpecificTextInputSession$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidTextInputSession_androidKt$platformSpecificTextInputSession$2.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3 androidTextInputSession_androidKt$platformSpecificTextInputSession$3 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3(mutableSharedFlow, transformedTextFieldState, textLayoutState, workLauncherImpl, androidPlatformTextInputSession, imeOptions, function1, function0, viewConfiguration, function12, null);
                    androidTextInputSession_androidKt$platformSpecificTextInputSession$2.label = 1;
                    if (JobKt.coroutineScope(androidTextInputSession_androidKt$platformSpecificTextInputSession$3, androidTextInputSession_androidKt$platformSpecificTextInputSession$2) == coroutineSingletons) {
                        return;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                OptionalProvider$$ExternalSyntheticLambda0.m$1();
            }
        }
        androidTextInputSession_androidKt$platformSpecificTextInputSession$2 = new AndroidTextInputSession_androidKt$platformSpecificTextInputSession$2(continuationImpl);
        Object obj2 = androidTextInputSession_androidKt$platformSpecificTextInputSession$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidTextInputSession_androidKt$platformSpecificTextInputSession$2.label;
        if (i != 0) {
        }
        OptionalProvider$$ExternalSyntheticLambda0.m$1();
    }

    public static final void TitleBarCore(String str, Modifier modifier, DynamicColorConfiguration dynamicColorConfiguration, Function3 function3, Function3 function32, Composer composer, int i) {
        GapComposer gapComposer;
        DynamicColorConfiguration dynamicColorConfiguration2;
        GapComposer gapComposer2;
        int i2;
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startRestartGroup(-1297858087);
        int i3 = 4;
        int i4 = i | (gapComposer3.changed(str) ? 4 : 2) | (gapComposer3.changed(modifier) ? 32 : 16) | 128 | (gapComposer3.changedInstance(function3) ? 2048 : 1024);
        if (gapComposer3.shouldExecute(i4 & 1, (i4 & 9363) != 9362)) {
            gapComposer3.startDefaults();
            if ((i & 1) != 0 && !gapComposer3.getDefaultsInvalid()) {
                gapComposer3.skipToGroupEnd();
                i2 = i4 & (-897);
                dynamicColorConfiguration2 = dynamicColorConfiguration;
                gapComposer2 = gapComposer3;
            } else {
                gapComposer2 = gapComposer3;
                i2 = i4 & (-897);
                dynamicColorConfiguration2 = TransactorKt.m1173invokeRGew2ao(0L, 0L, 0L, gapComposer2, 7);
            }
            gapComposer2.endDefaults();
            int i5 = i2 >> 3;
            GapComposer gapComposer4 = gapComposer2;
            TitleBarCore(modifier, dynamicColorConfiguration2, function3, function32, Expect_jvmKt.rememberComposableLambda(-1008048805, new BenefitsHomeViewKt$$ExternalSyntheticLambda5(str, i3), gapComposer2), gapComposer4, (i5 & 896) | (i5 & 14) | 24576 | 3072);
            gapComposer = gapComposer4;
        } else {
            gapComposer = gapComposer3;
            gapComposer.skipToGroupEnd();
            dynamicColorConfiguration2 = dynamicColorConfiguration;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new AvatarsKt$$ExternalSyntheticLambda4(str, modifier, dynamicColorConfiguration2, function3, function32, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0059  */
    /* renamed from: Icon-ww6aTOc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m1191Iconww6aTOc(Icons icons, String str, Modifier modifier, long j, Composer composer, int i, int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        long j2;
        Modifier modifier3;
        RecomposeScopeImpl endRestartGroup;
        icons.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-29612973);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changed(icons.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= gapComposer.changed(str) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i3 |= gapComposer.changed(modifier2) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                j2 = j;
                i3 |= gapComposer.changed(j2) ? 2048 : 1024;
                if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
                    Modifier modifier4 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                    long j3 = i4 != 0 ? Color.Unspecified : j2;
                    m1190Iconww6aTOc(icons.painter(gapComposer), str, modifier4, j3, gapComposer, Painter.$stable | (i3 & 112) | (i3 & 896) | (i3 & 7168), 0);
                    modifier3 = modifier4;
                    j2 = j3;
                } else {
                    gapComposer.skipToGroupEnd();
                    modifier3 = modifier2;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new IconKt$$ExternalSyntheticLambda0(icons, str, modifier3, j2, i, i2, 0);
                    return;
                }
                return;
            }
            j2 = j;
            if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        j2 = j;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }
}
