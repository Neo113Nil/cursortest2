package app.cash.molecule;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Layout;
import android.util.AttributeSet;
import android.widget.TextView;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterMapKt;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$1;
import androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$1;
import androidx.compose.foundation.gestures.ScrollExtensionsKt$scrollBy$2;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.relocation.BringIntoViewRequesterImpl;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material.SwipeableState$animateInternalToOffset$2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.ComposedModifier;
import androidx.compose.ui.ComposedModifierKt$materializeImpl$1;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.CacheDrawScope$onDrawBehind$1;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatingNode;
import androidx.compose.ui.node.DepthSortedSetKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.TailModifierNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.relocation.BringIntoViewModifierNode;
import androidx.compose.ui.text.android.TextLayout_androidKt;
import androidx.compose.ui.text.android.style.IndentationFixSpan_androidKt$WhenMappings;
import androidx.compose.ui.unit.Density;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.BundleKt;
import androidx.core.os.LocaleListCompat;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.glance.layout.SpacerKt$Spacer$3;
import androidx.lifecycle.compose.LifecycleEffectKt$$ExternalSyntheticLambda7;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.TransactorKt;
import androidx.savedstate.SavedStateWriterKt;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.WorkDatabasePathHelperKt;
import app.cash.api.ApiResult;
import app.cash.badging.backend.Badger;
import app.cash.badging.backend.RealBadger2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda3;
import coil3.size.DimensionKt;
import com.bugsnag.android.internal.BackgroundTaskServiceKt$$ExternalSyntheticLambda0;
import com.bugsnag.android.internal.TaskType;
import com.datadog.android.Datadog$getInstance$1$1;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.api.DelayStrategy;
import com.squareup.cash.api.UtilsKt$retryWhenRetryable$1;
import com.squareup.cash.arcade.Haptics;
import com.squareup.cash.arcade.HapticsKt;
import com.squareup.cash.arcade.MotionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.arcade.components.haptic.HapticVibratorKt;
import com.squareup.cash.arcade.components.haptic.RealHapticVibrator;
import com.squareup.cash.arcade.internalflags.InternalArcadeFlags;
import com.squareup.cash.arcade.internalflags.LocalInternalArcadeFlagsKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BankingDialogKt$$ExternalSyntheticLambda5;
import com.squareup.cash.blockers.viewmodels.RegisterAliasViewModel;
import com.squareup.cash.blockers.views.RegisterAliasViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.blockers.views.SwitchToEmailState;
import com.squareup.cash.boost.backend.RealBoostSelector;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.braze.RealBrazeManager$$ExternalSyntheticLambda0;
import com.squareup.cash.db.SessionQueries;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.gcl.RealMarketAttributesProvider;
import com.squareup.cash.keystore.RealKeyStoreProvider;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.localization.RealLocaleAssetProvider$MetroFactory;
import com.squareup.cash.money.presenters.MoneyTabPresenter;
import com.squareup.cash.money.views.MoneyUiFactory;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.session.backend.AuthenticatedState;
import com.squareup.cash.session.backend.NotInitiatedState;
import com.squareup.cash.session.backend.OnboardedAccountStatus;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionManagerKt$special$$inlined$filterIsInstance$1;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.session.backend.SetupTeardownRunner$run$2;
import com.squareup.cash.storage.RealSandboxer;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda0;
import com.squareup.cash.storage.RealSandboxer$$ExternalSyntheticLambda1;
import com.squareup.cash.storage.RealStorageLinkerKt$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.BreadcrumbListener;
import com.squareup.cash.ui.BroadwayModule$ProvideBroadwayMetroFactory;
import com.squareup.cash.ui.MainActivity$$ExternalSyntheticLambda5;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import com.squareup.contour.constraints.Constraint;
import com.squareup.wire.ByteArrayProtoReader32;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.IntArrayProtoAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.FilesKt__UtilsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.reflect.KClass;
import kotlin.sequences.FilteringSequence;
import kotlin.sequences.FilteringSequence$iterator$1;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import okio.FileSystem;
import okio.JvmSystemFileSystem;
import okio.Path;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import papa.internal.LaunchTracker$$ExternalSyntheticLambda0;
import timber.log.Timber;

/* loaded from: classes.dex */
public abstract class PlatformKt {
    public static String zza;
    public static Boolean zzc;

    public static final void RegisterAlias(Function1 function1, RegisterAliasViewModel registerAliasViewModel, Modifier modifier, Composer composer, int i) {
        int i2;
        RegisterAliasViewModel registerAliasViewModel2;
        GapComposer gapComposer;
        Modifier modifier2;
        TextFieldState textFieldState;
        MutableState mutableState;
        Object setupTeardownRunner$run$2;
        Continuation continuation;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-80995775);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(registerAliasViewModel) ? 32 : 16;
        }
        int i3 = i2 | 3456;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            boolean changedInstance = gapComposer2.changedInstance(registerAliasViewModel);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == obj) {
                rememberedValue = new RealBrazeManager$$ExternalSyntheticLambda0(registerAliasViewModel, 7);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            TextFieldState textFieldState2 = (TextFieldState) SaverKt.m581rememberSaveable(objArr, (Saver) TextFieldState.Saver.INSTANCE, (Function0) rememberedValue, (Composer) gapComposer2, 0);
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer2.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = new TouchRecorder();
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            TouchRecorder touchRecorder = (TouchRecorder) rememberedValue2;
            Object[] objArr2 = {textFieldState2.getValue$foundation().text.toString()};
            boolean changedInstance2 = gapComposer2.changedInstance(registerAliasViewModel) | gapComposer2.changed(textFieldState2);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue3 == obj) {
                rememberedValue3 = new ComponentRegistry$Builder$$ExternalSyntheticLambda3(17, registerAliasViewModel, textFieldState2);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState2 = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue3, gapComposer2, 0);
            Boolean bool = (Boolean) mutableState2.getValue();
            bool.getClass();
            boolean changed = gapComposer2.changed(mutableState2);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            int i4 = 14;
            Continuation continuation2 = null;
            if (changed || rememberedValue4 == obj) {
                rememberedValue4 = new RealGcmRegistrar$unregister$2(mutableState2, continuation2, i4);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            MutableState produceState = Updater.produceState(false, bool, (Function2) rememberedValue4, gapComposer2, (i3 >> 9) & 14);
            RegisterAliasViewModel.Mode mode = registerAliasViewModel.mode;
            boolean changed2 = gapComposer2.changed(mode.ordinal());
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changed2 || rememberedValue5 == obj) {
                rememberedValue5 = Updater.mutableStateOf$default(new KeyboardOptions(0, (Boolean) null, mode == RegisterAliasViewModel.Mode.EMAIL ? 6 : 4, 2, (Boolean) null, 115));
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState3 = (MutableState) rememberedValue5;
            String str = registerAliasViewModel.prefillCountryCode;
            boolean changedInstance3 = gapComposer2.changedInstance(registerAliasViewModel) | gapComposer2.changed(textFieldState2);
            Object rememberedValue6 = gapComposer2.rememberedValue();
            if (changedInstance3 || rememberedValue6 == obj) {
                rememberedValue6 = new RealGcmRegistrar$unregister$2(registerAliasViewModel, textFieldState2, continuation2, 13);
                gapComposer2.updateRememberedValue(rememberedValue6);
            }
            Updater.LaunchedEffect(null, null, str, (Function2) rememberedValue6, gapComposer2);
            Object rememberedValue7 = gapComposer2.rememberedValue();
            if (rememberedValue7 == obj) {
                rememberedValue7 = Updater.mutableStateOf$default(SwitchToEmailState.Handled.INSTANCE);
                gapComposer2.updateRememberedValue(rememberedValue7);
            }
            MutableState mutableState4 = (MutableState) rememberedValue7;
            boolean changedInstance4 = gapComposer2.changedInstance(registerAliasViewModel) | gapComposer2.changed(textFieldState2);
            Object rememberedValue8 = gapComposer2.rememberedValue();
            if (changedInstance4 || rememberedValue8 == obj) {
                textFieldState = textFieldState2;
                mutableState = mutableState4;
                continuation = null;
                setupTeardownRunner$run$2 = new SetupTeardownRunner$run$2(textFieldState, mutableState, registerAliasViewModel, continuation, 2);
                gapComposer2.updateRememberedValue(setupTeardownRunner$run$2);
            } else {
                textFieldState = textFieldState2;
                mutableState = mutableState4;
                setupTeardownRunner$run$2 = rememberedValue8;
                continuation = null;
            }
            Updater.LaunchedEffect(gapComposer2, mode, (Function2) setupTeardownRunner$run$2);
            Object rememberedValue9 = gapComposer2.rememberedValue();
            if (rememberedValue9 == obj) {
                rememberedValue9 = new BringIntoViewRequesterImpl();
                gapComposer2.updateRememberedValue(rememberedValue9);
            }
            BringIntoViewRequesterImpl bringIntoViewRequesterImpl = (BringIntoViewRequesterImpl) rememberedValue9;
            Boolean bool2 = (Boolean) produceState.getValue();
            bool2.getClass();
            boolean changed3 = gapComposer2.changed(produceState) | gapComposer2.changedInstance(bringIntoViewRequesterImpl);
            Object rememberedValue10 = gapComposer2.rememberedValue();
            if (changed3 || rememberedValue10 == obj) {
                rememberedValue10 = new RealBoostSelector.AnonymousClass1(bringIntoViewRequesterImpl, produceState, continuation, 2);
                gapComposer2.updateRememberedValue(rememberedValue10);
            }
            Updater.LaunchedEffect(gapComposer2, bool2, (Function2) rememberedValue10);
            registerAliasViewModel2 = registerAliasViewModel;
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(921733900, new RegisterAliasViewKt$$ExternalSyntheticLambda2(bringIntoViewRequesterImpl, textFieldState, mutableState, mutableState3, produceState, mutableState2, delegatingSoftwareKeyboardController, registerAliasViewModel2, touchRecorder, function1), gapComposer2), gapComposer, 3072, 7);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            registerAliasViewModel2 = registerAliasViewModel;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LifecycleEffectKt$$ExternalSyntheticLambda7(function1, registerAliasViewModel2, modifier2, i);
        }
    }

    public static final String activeAccountToken(SessionManager sessionManager) {
        sessionManager.getClass();
        String activeAccountTokenOrNull = activeAccountTokenOrNull(sessionManager);
        if (activeAccountTokenOrNull != null) {
            return activeAccountTokenOrNull;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Required value was null.");
        return null;
    }

    public static final String activeAccountTokenOrNull(SessionManager sessionManager) {
        sessionManager.getClass();
        SessionState currentSessionState = getCurrentSessionState(sessionManager);
        SessionState.Authenticated authenticated = currentSessionState instanceof SessionState.Authenticated ? (SessionState.Authenticated) currentSessionState : null;
        if (authenticated != null) {
            return ((AuthenticatedState) authenticated).getAccountToken();
        }
        return null;
    }

    /* renamed from: add-impl, reason: not valid java name */
    public static final void m1338addimpl(MutableScatterMap mutableScatterMap, Object obj, Object obj2) {
        int findInsertIndex = mutableScatterMap.findInsertIndex(obj);
        boolean z = findInsertIndex < 0;
        Object obj3 = z ? null : mutableScatterMap.values[findInsertIndex];
        if (obj3 != null) {
            if (obj3 instanceof MutableScatterSet) {
                ((MutableScatterSet) obj3).add(obj2);
            } else if (obj3 != obj2) {
                MutableScatterSet mutableScatterSet = new MutableScatterSet();
                mutableScatterSet.add(obj3);
                mutableScatterSet.add(obj2);
                obj2 = mutableScatterSet;
            }
            obj2 = obj3;
        }
        if (!z) {
            mutableScatterMap.values[findInsertIndex] = obj2;
            return;
        }
        int i = ~findInsertIndex;
        mutableScatterMap.keys[i] = obj;
        mutableScatterMap.values[i] = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object animateScrollBy(ScrollableState scrollableState, float f, AnimationSpec animationSpec, Continuation continuation) {
        ScrollExtensionsKt$animateScrollBy$1 scrollExtensionsKt$animateScrollBy$1;
        int i;
        Ref$FloatRef ref$FloatRef;
        if (continuation instanceof ScrollExtensionsKt$animateScrollBy$1) {
            scrollExtensionsKt$animateScrollBy$1 = (ScrollExtensionsKt$animateScrollBy$1) continuation;
            int i2 = scrollExtensionsKt$animateScrollBy$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                scrollExtensionsKt$animateScrollBy$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = scrollExtensionsKt$animateScrollBy$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scrollExtensionsKt$animateScrollBy$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    Function2 swipeableState$animateInternalToOffset$2 = new SwipeableState$animateInternalToOffset$2(f, animationSpec, ref$FloatRef2, (Continuation) null);
                    scrollExtensionsKt$animateScrollBy$1.L$0 = ref$FloatRef2;
                    scrollExtensionsKt$animateScrollBy$1.label = 1;
                    if (scrollableState.scroll(MutatePriority.Default, swipeableState$animateInternalToOffset$2, scrollExtensionsKt$animateScrollBy$1) == obj2) {
                        return obj2;
                    }
                    ref$FloatRef = ref$FloatRef2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$FloatRef = scrollExtensionsKt$animateScrollBy$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return new Float(ref$FloatRef.element);
            }
        }
        scrollExtensionsKt$animateScrollBy$1 = new ScrollExtensionsKt$animateScrollBy$1(continuation);
        Object obj3 = scrollExtensionsKt$animateScrollBy$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scrollExtensionsKt$animateScrollBy$1.label;
        if (i != 0) {
        }
        return new Float(ref$FloatRef.element);
    }

    public static final String appTokenOrNull(SessionManager sessionManager) {
        sessionManager.getClass();
        SessionState currentSessionState = getCurrentSessionState(sessionManager);
        if (currentSessionState instanceof NotInitiatedState) {
            return ((NotInitiatedState) currentSessionState).appToken;
        }
        if (currentSessionState instanceof SessionState.Initiated) {
            return ((SessionState.Initiated) currentSessionState).getAppToken();
        }
        return null;
    }

    public static final Object bringIntoView(DelegatableNode delegatableNode, Function0 function0, ContinuationImpl continuationImpl) {
        Object obj;
        NodeCoordinator requireLayoutCoordinates;
        Object bringIntoView;
        NodeChain nodeChain;
        if (!delegatableNode.getNode().isAttached()) {
            return Unit.INSTANCE;
        }
        if (!delegatableNode.getNode().isAttached()) {
            InlineClassHelperKt.throwIllegalStateException("visitAncestors called on an unattached node");
        }
        Modifier.Node parent$ui = delegatableNode.getNode().getParent$ui();
        LayoutNode requireLayoutNode = DepthSortedSetKt.requireLayoutNode(delegatableNode);
        loop0: while (true) {
            obj = null;
            if (requireLayoutNode == null) {
                break;
            }
            if ((((Modifier.Node) requireLayoutNode.nodes.head).getAggregateChildKindSet$ui() & PKIFailureInfo.signerNotTrusted) != 0) {
                while (parent$ui != null) {
                    if ((parent$ui.getKindSet$ui() & PKIFailureInfo.signerNotTrusted) != 0) {
                        Modifier.Node node = parent$ui;
                        MutableVector mutableVector = null;
                        while (node != null) {
                            if (node instanceof BringIntoViewModifierNode) {
                                obj = node;
                                break loop0;
                            }
                            if ((node.getKindSet$ui() & PKIFailureInfo.signerNotTrusted) != 0 && (node instanceof DelegatingNode)) {
                                int i = 0;
                                for (Modifier.Node node2 = ((DelegatingNode) node).delegate; node2 != null; node2 = node2.getChild$ui()) {
                                    if ((node2.getKindSet$ui() & PKIFailureInfo.signerNotTrusted) != 0) {
                                        i++;
                                        if (i == 1) {
                                            node = node2;
                                        } else {
                                            if (mutableVector == null) {
                                                mutableVector = new MutableVector(0, new Modifier.Node[16]);
                                            }
                                            if (node != null) {
                                                mutableVector.add(node);
                                                node = null;
                                            }
                                            mutableVector.add(node2);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            node = DepthSortedSetKt.access$pop(mutableVector);
                        }
                    }
                    parent$ui = parent$ui.getParent$ui();
                }
            }
            requireLayoutNode = requireLayoutNode.getParent$ui();
            parent$ui = (requireLayoutNode == null || (nodeChain = requireLayoutNode.nodes) == null) ? null : (TailModifierNode) nodeChain.tail;
        }
        BringIntoViewModifierNode bringIntoViewModifierNode = (BringIntoViewModifierNode) obj;
        return (bringIntoViewModifierNode != null && (bringIntoView = bringIntoViewModifierNode.bringIntoView((requireLayoutCoordinates = DepthSortedSetKt.requireLayoutCoordinates(delegatableNode)), new Datadog$getInstance$1$1(5, function0, requireLayoutCoordinates), continuationImpl)) == CoroutineSingletons.COROUTINE_SUSPENDED) ? bringIntoView : Unit.INSTANCE;
    }

    public static void checkElementsNotNull(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                a$$ExternalSyntheticBUOutline0.m$2(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i2, "at index "));
                return;
            }
        }
    }

    public static final IntArrayProtoAdapter commonWrapper(ProtoAdapter protoAdapter, String str) {
        FieldEncoding fieldEncoding = FieldEncoding.VARINT;
        KClass type2 = protoAdapter.getType();
        Syntax syntax = Syntax.PROTO_2;
        return new IntArrayProtoAdapter(str, protoAdapter, type2, protoAdapter.getIdentity());
    }

    public static final Modifier composed(Modifier modifier, Function3 function3) {
        return modifier.then(new ComposedModifier(function3));
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static MutableScatterMap m1339constructorimpl$default() {
        long[] jArr = ScatterMapKt.EmptyGroup;
        return new MutableScatterMap();
    }

    public static MoneyTabPresenter.MetroFactory create(InstanceFactory instanceFactory, RealBrazeManager.MetroFactory metroFactory, RealLocaleAssetProvider$MetroFactory realLocaleAssetProvider$MetroFactory, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, DoubleCheck doubleCheck3, DoubleCheck doubleCheck4, DoubleCheck doubleCheck5, LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck6, DoubleCheck doubleCheck7, Provider provider, DoubleCheck doubleCheck8, InstanceFactory instanceFactory2, DoubleCheck doubleCheck9, RealMessageSigner.MetroFactory metroFactory2, RealKeyStoreProvider.MetroFactory metroFactory3, DoubleCheck doubleCheck10, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck11, DoubleCheck doubleCheck12, LambdaProvider lambdaProvider4, LambdaProvider lambdaProvider5) {
        instanceFactory.getClass();
        doubleCheck.getClass();
        doubleCheck2.getClass();
        doubleCheck3.getClass();
        doubleCheck4.getClass();
        doubleCheck5.getClass();
        lambdaProvider.getClass();
        lambdaProvider2.getClass();
        doubleCheck6.getClass();
        doubleCheck7.getClass();
        provider.getClass();
        doubleCheck8.getClass();
        instanceFactory2.getClass();
        doubleCheck9.getClass();
        metroFactory2.getClass();
        metroFactory3.getClass();
        doubleCheck10.getClass();
        lambdaProvider3.getClass();
        doubleCheck11.getClass();
        doubleCheck12.getClass();
        lambdaProvider4.getClass();
        lambdaProvider5.getClass();
        return new MoneyTabPresenter.MetroFactory(instanceFactory, metroFactory, realLocaleAssetProvider$MetroFactory, doubleCheck, doubleCheck2, doubleCheck3, doubleCheck4, doubleCheck5, lambdaProvider, lambdaProvider2, doubleCheck6, doubleCheck7, provider, doubleCheck8, instanceFactory2, doubleCheck9, metroFactory2, metroFactory3, doubleCheck10, lambdaProvider3, doubleCheck11, doubleCheck12, lambdaProvider4, lambdaProvider5);
    }

    public static final ThreadPoolExecutor createExecutor(String str, TaskType taskType, boolean z) {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue(128);
        BackgroundTaskServiceKt$$ExternalSyntheticLambda0 backgroundTaskServiceKt$$ExternalSyntheticLambda0 = new BackgroundTaskServiceKt$$ExternalSyntheticLambda0(str, 0, taskType);
        return new ThreadPoolExecutor(z ? 1 : 0, 1, 30L, TimeUnit.SECONDS, linkedBlockingQueue, backgroundTaskServiceKt$$ExternalSyntheticLambda0);
    }

    public static final SnapshotNotifier defaultSnapshotNotifier() {
        Object failure;
        String property = System.getProperty("app.cash.molecule.snapshotNotifier");
        if (property != null) {
            try {
                Result.Companion companion = Result.Companion;
                failure = SnapshotNotifier.valueOf(property);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.Companion;
                failure = new Result.Failure(th);
            }
            if (failure instanceof Result.Failure) {
                failure = null;
            }
            SnapshotNotifier snapshotNotifier = (SnapshotNotifier) failure;
            if (snapshotNotifier != null) {
                return snapshotNotifier;
            }
        }
        return SnapshotNotifier.WhileActive;
    }

    public static final SessionState getCurrentSessionState(SessionManager sessionManager) {
        sessionManager.getClass();
        return (SessionState) sessionManager.getSessionState().getValue();
    }

    public static int getDimensionPixelSize$default(Context context) {
        context.getClass();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, new int[]{R.attr.actionBarSize});
        obtainStyledAttributes.getClass();
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    public static final Drawable getDrawableCompat(Context context, int i, Integer num) {
        context.getClass();
        Drawable drawable = DimensionKt.getDrawable(context, i);
        if (drawable == null) {
            return null;
        }
        if (num != null) {
            drawable.mutate().setTint(num.intValue());
        }
        return drawable;
    }

    public static final float getEllipsizedLeftPadding(Layout layout, int i, Paint paint) {
        float lineLeft = layout.getLineLeft(i);
        ThreadLocal threadLocal = TextLayout_androidKt.SharedTextAndroidCanvas;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= RecyclerView.DECELERATION_RATE) {
            return RecyclerView.DECELERATION_RATE;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : IndentationFixSpan_androidKt$WhenMappings.$EnumSwitchMapping$0[paragraphAlignment.ordinal()]) == 1) {
            return Recorder$$ExternalSyntheticOutline2.m(layout.getWidth(), measureText, 2.0f, Math.abs(lineLeft));
        }
        return (layout.getWidth() - measureText) + Math.abs(lineLeft);
    }

    public static final float getEllipsizedRightPadding(Layout layout, int i, Paint paint) {
        float width;
        float width2;
        ThreadLocal threadLocal = TextLayout_androidKt.SharedTextAndroidCanvas;
        if (layout.getEllipsisCount(i) <= 0) {
            return RecyclerView.DECELERATION_RATE;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return RecyclerView.DECELERATION_RATE;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? IndentationFixSpan_androidKt$WhenMappings.$EnumSwitchMapping$0[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static final Typeface getFont(Context context, int i) {
        context.getClass();
        return ResourcesCompat.getFont(context, i);
    }

    public static LocaleListCompat getLocales(Configuration configuration) {
        return LocaleListCompat.wrap(configuration.getLocales());
    }

    public static final SessionManagerKt$special$$inlined$filterIsInstance$1 getOnAuthenticated(SessionManager sessionManager) {
        return new SessionManagerKt$special$$inlined$filterIsInstance$1(FlowKt.distinctUntilChangedBy$FlowKt__DistinctKt(sessionManager.getSessionState(), new MainActivity$$ExternalSyntheticLambda5(18), FlowKt.defaultAreEquivalent), 0);
    }

    public static final Object getOrDefault(MutablePreferences mutablePreferences, Preferences.Key key, Serializable serializable) {
        mutablePreferences.getClass();
        key.getClass();
        Object obj = mutablePreferences.get(key);
        return obj == null ? serializable : obj;
    }

    public static final boolean hasOnboardedAccount(SessionManager sessionManager) {
        sessionManager.getClass();
        return sessionManager.getOnboardedAccountStatus().getValue() instanceof OnboardedAccountStatus.Onboarded;
    }

    public static ByteArrayProtoReader32 heightOfFloat$default(ByteArrayProtoReader32 byteArrayProtoReader32, Function1 function1) {
        CameraSelector$$ExternalSyntheticOutline0.checkNotZero(1);
        Constraint constraint = (Constraint) byteArrayProtoReader32.protoReader;
        constraint.setMode(1);
        constraint.lambda = new CacheDrawScope$onDrawBehind$1(4, function1);
        return byteArrayProtoReader32;
    }

    public static final boolean isAuthenticated(SessionManager sessionManager) {
        sessionManager.getClass();
        return getCurrentSessionState(sessionManager) instanceof SessionState.Authenticated;
    }

    public static final Modifier materializeImpl(Composer composer, Modifier modifier) {
        if (modifier.all(ComposedModifierKt$materializeImpl$1.INSTANCE)) {
            return modifier;
        }
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceableGroup(1219399079);
        Modifier modifier2 = (Modifier) modifier.foldIn(Modifier.Companion.$$INSTANCE, new SpacerKt$Spacer$3(gapComposer, 1));
        gapComposer.end(false);
        return modifier2;
    }

    public static final Modifier materializeModifier(Composer composer, Modifier modifier) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(439770924);
        Modifier materializeImpl = materializeImpl(gapComposer, modifier);
        gapComposer.end(false);
        return materializeImpl;
    }

    public static final void migrateDatabase(Context context) {
        String str;
        String[] strArr;
        String str2;
        String str3;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            Logger$LogcatLogger logger$LogcatLogger = Logger$LogcatLogger.get();
            str = WorkDatabasePathHelperKt.TAG;
            logger$LogcatLogger.debug(str, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            strArr = WorkDatabasePathHelperKt.DATABASE_EXTRA_FILES;
            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(strArr.length);
            if (mapCapacity < 16) {
                mapCapacity = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
            for (String str4 : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str4), new File(noBackupFilesDir.getPath() + str4));
            }
            for (Map.Entry entry : MapsKt__MapsKt.plus(linkedHashMap, new Pair(databasePath2, noBackupFilesDir)).entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        Logger$LogcatLogger logger$LogcatLogger2 = Logger$LogcatLogger.get();
                        str3 = WorkDatabasePathHelperKt.TAG;
                        logger$LogcatLogger2.warning(str3, "Over-writing contents of " + file2);
                    }
                    String str5 = file.renameTo(file2) ? "Migrated " + file + "to " + file2 : "Renaming " + file + " to " + file2 + " failed";
                    Logger$LogcatLogger logger$LogcatLogger3 = Logger$LogcatLogger.get();
                    str2 = WorkDatabasePathHelperKt.TAG;
                    logger$LogcatLogger3.debug(str2, str5);
                }
            }
        }
    }

    /* renamed from: plus-Nv-tHpc, reason: not valid java name */
    public static final long m1340plusNvtHpc(long j, long j2) {
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax)) + ((int) (j2 & BodyPartID.bodyIdMax));
        return (Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & BodyPartID.bodyIdMax);
    }

    public static final ContentTransform push(Density density, final boolean z, float f) {
        density.getClass();
        final int mo230roundToPx0680j_4 = density.mo230roundToPx0680j_4(30.0f);
        CubicBezierEasing cubicBezierEasing = EasingKt.FastOutSlowInEasing;
        final int i = 0;
        final int i2 = 1;
        return new ContentTransform(EnterExitTransitionKt.slideInHorizontally(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, cubicBezierEasing, 2), new Function1() { // from class: com.squareup.cash.core.transitions.PushKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i2;
                int i4 = mo230roundToPx0680j_4;
                boolean z2 = z;
                ((Integer) obj).intValue();
                switch (i3) {
                    case 0:
                        if (z2) {
                            i4 = -i4;
                        }
                        return Integer.valueOf(i4);
                    default:
                        if (!z2) {
                            i4 = -i4;
                        }
                        return Integer.valueOf(i4);
                }
            }
        }).plus(EnterExitTransitionKt.fadeIn$default(new TweenSpec(EnumC0170g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, 105, EasingKt.LinearOutSlowInEasing), 2)), EnterExitTransitionKt.slideOutHorizontally(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, cubicBezierEasing, 2), new Function1() { // from class: com.squareup.cash.core.transitions.PushKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                int i3 = i;
                int i4 = mo230roundToPx0680j_4;
                boolean z2 = z;
                ((Integer) obj).intValue();
                switch (i3) {
                    case 0:
                        if (z2) {
                            i4 = -i4;
                        }
                        return Integer.valueOf(i4);
                    default:
                        if (!z2) {
                            i4 = -i4;
                        }
                        return Integer.valueOf(i4);
                }
            }
        }).plus(EnterExitTransitionKt.fadeOut$default(new TweenSpec(105, 0, EasingKt.FastOutLinearInEasing), 2)), f, 8);
    }

    /* renamed from: putStringList-impl, reason: not valid java name */
    public static final void m1341putStringListimpl(Bundle bundle, String str, List list) {
        list.getClass();
        bundle.putStringArrayList(str, SavedStateWriterKt.toArrayListUnsafe(list));
    }

    public static final Function0 rememberHapticTrigger(Haptics.VibrationEffectFactory vibrationEffectFactory, Composer composer, int i) {
        if ((i & 1) != 0) {
            vibrationEffectFactory = ((Haptics) ((GapComposer) composer).consume(HapticsKt.LocalHaptics)).input.subtle;
        }
        GapComposer gapComposer = (GapComposer) composer;
        boolean z = ((InternalArcadeFlags) Updater.collectAsState((StateFlow) gapComposer.consume(LocalInternalArcadeFlagsKt.LocalInternalArcadeFlags), null, gapComposer, 1).getValue()).hapticsImprovementsEnabled;
        RealHapticVibrator realHapticVibrator = (RealHapticVibrator) gapComposer.consume(HapticVibratorKt.LocalHapticVibrator);
        boolean changed = gapComposer.changed(z) | gapComposer.changed(vibrationEffectFactory) | gapComposer.changed(realHapticVibrator);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = z ? new BankingDialogKt$$ExternalSyntheticLambda5(10, realHapticVibrator, vibrationEffectFactory) : new MotionKt$$ExternalSyntheticLambda0(24);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (Function0) rememberedValue;
    }

    /* renamed from: remove-impl, reason: not valid java name */
    public static final boolean m1342removeimpl(MutableScatterMap mutableScatterMap, Object obj, Object obj2) {
        Object obj3 = mutableScatterMap.get(obj);
        if (obj3 == null) {
            return false;
        }
        if (!(obj3 instanceof MutableScatterSet)) {
            if (!obj3.equals(obj2)) {
                return false;
            }
            mutableScatterMap.remove(obj);
            return true;
        }
        MutableScatterSet mutableScatterSet = (MutableScatterSet) obj3;
        boolean remove = mutableScatterSet.remove(obj2);
        if (remove && mutableScatterSet.isEmpty()) {
            mutableScatterMap.remove(obj);
        }
        return remove;
    }

    /* renamed from: removeScope-impl, reason: not valid java name */
    public static final void m1343removeScopeimpl(MutableScatterMap mutableScatterMap, Object obj) {
        boolean z;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        Object obj2 = mutableScatterMap.keys[i4];
                        Object obj3 = mutableScatterMap.values[i4];
                        if (obj3 instanceof MutableScatterSet) {
                            MutableScatterSet mutableScatterSet = (MutableScatterSet) obj3;
                            mutableScatterSet.remove(obj);
                            z = mutableScatterSet.isEmpty();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            mutableScatterMap.removeValueAt(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0097 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00c6 -> B:17:0x00ca). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00cf -> B:18:0x00d3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object retryWhenRetryable(int i, DelayStrategy delayStrategy, Function1 function1, Continuation continuation) {
        UtilsKt$retryWhenRetryable$1 utilsKt$retryWhenRetryable$1;
        int i2;
        Function1 function12;
        int i3;
        UtilsKt$retryWhenRetryable$1 utilsKt$retryWhenRetryable$12;
        int i4;
        int i5;
        DelayStrategy delayStrategy2;
        DelayStrategy delayStrategy3;
        Function1 function13;
        int i6;
        int i7;
        int i8;
        int i9;
        ApiResult apiResult;
        if (continuation instanceof UtilsKt$retryWhenRetryable$1) {
            utilsKt$retryWhenRetryable$1 = (UtilsKt$retryWhenRetryable$1) continuation;
            int i10 = utilsKt$retryWhenRetryable$1.label;
            if ((i10 & PKIFailureInfo.systemUnavail) != 0) {
                utilsKt$retryWhenRetryable$1.label = i10 - PKIFailureInfo.systemUnavail;
                Object obj = utilsKt$retryWhenRetryable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = utilsKt$retryWhenRetryable$1.label;
                int i11 = 0;
                int i12 = 1;
                if (i2 != 0) {
                    SafeTrace.throwOnFailure(obj);
                    function12 = function1;
                    i3 = i - 1;
                    utilsKt$retryWhenRetryable$12 = utilsKt$retryWhenRetryable$1;
                    i4 = 0;
                    i5 = i;
                    delayStrategy2 = delayStrategy;
                    if (i4 >= i3) {
                    }
                    return coroutineSingletons;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return obj;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i9 = utilsKt$retryWhenRetryable$1.I$2;
                    i3 = utilsKt$retryWhenRetryable$1.I$1;
                    int i13 = utilsKt$retryWhenRetryable$1.I$0;
                    Function1 function14 = utilsKt$retryWhenRetryable$1.L$1;
                    DelayStrategy delayStrategy4 = utilsKt$retryWhenRetryable$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    int i14 = 1;
                    i5 = i13;
                    function13 = function14;
                    utilsKt$retryWhenRetryable$12 = utilsKt$retryWhenRetryable$1;
                    delayStrategy2 = delayStrategy4;
                    i4 = i9 + 1;
                    function12 = function13;
                    i12 = i14;
                    i11 = 0;
                    if (i4 >= i3) {
                        utilsKt$retryWhenRetryable$12.L$0 = delayStrategy2;
                        utilsKt$retryWhenRetryable$12.L$1 = function12;
                        utilsKt$retryWhenRetryable$12.I$0 = i5;
                        utilsKt$retryWhenRetryable$12.I$1 = i3;
                        utilsKt$retryWhenRetryable$12.I$2 = i4;
                        utilsKt$retryWhenRetryable$12.I$3 = i4;
                        utilsKt$retryWhenRetryable$12.I$4 = i11;
                        utilsKt$retryWhenRetryable$12.label = i12;
                        Object invoke = function12.invoke(utilsKt$retryWhenRetryable$12);
                        if (invoke != coroutineSingletons) {
                            i6 = i5;
                            obj = invoke;
                            delayStrategy3 = delayStrategy2;
                            function13 = function12;
                            utilsKt$retryWhenRetryable$1 = utilsKt$retryWhenRetryable$12;
                            i9 = i4;
                            i7 = i3;
                            i8 = i11;
                            apiResult = (ApiResult) obj;
                            if (apiResult instanceof ApiResult.Success) {
                                return apiResult;
                            }
                            if (!(apiResult instanceof ApiResult.Failure)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            if (!BundleKt.isRetryable((ApiResult.Failure) apiResult)) {
                                return apiResult;
                            }
                            Duration mo2979nextDelayLV8wdWc = delayStrategy3.mo2979nextDelayLV8wdWc(i4);
                            i14 = i12;
                            if (mo2979nextDelayLV8wdWc != null) {
                                long j = mo2979nextDelayLV8wdWc.rawValue;
                                utilsKt$retryWhenRetryable$1.L$0 = delayStrategy3;
                                utilsKt$retryWhenRetryable$1.L$1 = function13;
                                utilsKt$retryWhenRetryable$1.I$0 = i6;
                                utilsKt$retryWhenRetryable$1.I$1 = i7;
                                utilsKt$retryWhenRetryable$1.I$2 = i9;
                                utilsKt$retryWhenRetryable$1.I$3 = i4;
                                utilsKt$retryWhenRetryable$1.I$4 = i8;
                                utilsKt$retryWhenRetryable$1.label = 2;
                                if (JobKt.m4182delayVtjQ1oo(j, utilsKt$retryWhenRetryable$1) != coroutineSingletons) {
                                    i3 = i7;
                                    i13 = i6;
                                    function14 = function13;
                                    delayStrategy4 = delayStrategy3;
                                    i5 = i13;
                                    function13 = function14;
                                    utilsKt$retryWhenRetryable$12 = utilsKt$retryWhenRetryable$1;
                                    delayStrategy2 = delayStrategy4;
                                    i4 = i9 + 1;
                                    function12 = function13;
                                    i12 = i14;
                                    i11 = 0;
                                    if (i4 >= i3) {
                                        utilsKt$retryWhenRetryable$12.L$0 = null;
                                        utilsKt$retryWhenRetryable$12.L$1 = null;
                                        utilsKt$retryWhenRetryable$12.I$0 = i5;
                                        utilsKt$retryWhenRetryable$12.label = 3;
                                        Object invoke2 = function12.invoke(utilsKt$retryWhenRetryable$12);
                                        if (invoke2 != coroutineSingletons) {
                                            return invoke2;
                                        }
                                    }
                                }
                            } else {
                                i3 = i7;
                                i5 = i6;
                                utilsKt$retryWhenRetryable$12 = utilsKt$retryWhenRetryable$1;
                                delayStrategy2 = delayStrategy3;
                                i4 = i9 + 1;
                                function12 = function13;
                                i12 = i14;
                                i11 = 0;
                                if (i4 >= i3) {
                                }
                            }
                        }
                    }
                    return coroutineSingletons;
                }
                int i15 = utilsKt$retryWhenRetryable$1.I$4;
                int i16 = utilsKt$retryWhenRetryable$1.I$3;
                int i17 = utilsKt$retryWhenRetryable$1.I$2;
                int i18 = utilsKt$retryWhenRetryable$1.I$1;
                i6 = utilsKt$retryWhenRetryable$1.I$0;
                function13 = utilsKt$retryWhenRetryable$1.L$1;
                delayStrategy3 = utilsKt$retryWhenRetryable$1.L$0;
                SafeTrace.throwOnFailure(obj);
                i8 = i15;
                i9 = i17;
                i7 = i18;
                i4 = i16;
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                }
            }
        }
        utilsKt$retryWhenRetryable$1 = new UtilsKt$retryWhenRetryable$1(continuation);
        Object obj2 = utilsKt$retryWhenRetryable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = utilsKt$retryWhenRetryable$1.label;
        int i112 = 0;
        int i122 = 1;
        if (i2 != 0) {
        }
    }

    public static /* synthetic */ Object retryWhenRetryable$default(DelayStrategy.Backoff backoff, Function1 function1, Continuation continuation, int i) {
        DelayStrategy delayStrategy = backoff;
        if ((i & 2) != 0) {
            Duration.Companion companion = Duration.Companion;
            delayStrategy = new DelayStrategy.Stable(DurationKt.toDuration(0, DurationUnit.SECONDS));
        }
        return retryWhenRetryable(3, delayStrategy, function1, continuation);
    }

    /* renamed from: round-k-4lQ0M, reason: not valid java name */
    public static final long m1344roundk4lQ0M(long j) {
        return (Math.round(Float.intBitsToFloat((int) (j & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (Math.round(Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object scrollBy(ScrollableState scrollableState, float f, ContinuationImpl continuationImpl) {
        ScrollExtensionsKt$scrollBy$1 scrollExtensionsKt$scrollBy$1;
        int i;
        Ref$FloatRef ref$FloatRef;
        if (continuationImpl instanceof ScrollExtensionsKt$scrollBy$1) {
            scrollExtensionsKt$scrollBy$1 = (ScrollExtensionsKt$scrollBy$1) continuationImpl;
            int i2 = scrollExtensionsKt$scrollBy$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                scrollExtensionsKt$scrollBy$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = scrollExtensionsKt$scrollBy$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scrollExtensionsKt$scrollBy$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                    Function2 scrollExtensionsKt$scrollBy$2 = new ScrollExtensionsKt$scrollBy$2(ref$FloatRef2, f, null);
                    scrollExtensionsKt$scrollBy$1.L$0 = ref$FloatRef2;
                    scrollExtensionsKt$scrollBy$1.label = 1;
                    if (scrollableState.scroll(MutatePriority.Default, scrollExtensionsKt$scrollBy$2, scrollExtensionsKt$scrollBy$1) == obj2) {
                        return obj2;
                    }
                    ref$FloatRef = ref$FloatRef2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$FloatRef = scrollExtensionsKt$scrollBy$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                return new Float(ref$FloatRef.element);
            }
        }
        scrollExtensionsKt$scrollBy$1 = new ScrollExtensionsKt$scrollBy$1(continuationImpl);
        Object obj3 = scrollExtensionsKt$scrollBy$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scrollExtensionsKt$scrollBy$1.label;
        if (i != 0) {
        }
        return new Float(ref$FloatRef.element);
    }

    public static void setLineHeight(TextView textView, int i) {
        TransactorKt.checkArgumentNonnegative(i);
        if (i != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i - r0, 1.0f);
        }
    }

    public static final int vacuum(SessionQueries sessionQueries, RealSandboxer realSandboxer) {
        sessionQueries.getClass();
        int i = 0;
        Set set = (Set) TransactorKt.transactionWithResult$default(sessionQueries, new RealStorageLinkerKt$$ExternalSyntheticLambda0(sessionQueries, i));
        List allActiveStorageLinks = realSandboxer.getAllActiveStorageLinks();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allActiveStorageLinks) {
            if (!set.contains(Long.valueOf(((Number) obj).longValue()))) {
                arrayList.add(obj);
            }
        }
        List list = CollectionsKt.toList(arrayList);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            long longValue = ((Number) it.next()).longValue();
            Timber.Forest.d("Deleting sandboxed storage with guid %d", Long.valueOf(longValue));
            JvmSystemFileSystem jvmSystemFileSystem = FileSystem.SYSTEM;
            String valueOf = String.valueOf(longValue);
            Context context = realSandboxer.baseContext;
            File cacheDir = context.getCacheDir();
            cacheDir.getClass();
            FilesKt__UtilsKt.deleteRecursively(FilesKt__UtilsKt.resolve(cacheDir, valueOf));
            File filesDir = context.getFilesDir();
            filesDir.getClass();
            FilesKt__UtilsKt.deleteRecursively(FilesKt__UtilsKt.resolve(filesDir, valueOf));
            File parentFile = context.getDatabasePath("dummy").getParentFile();
            parentFile.getClass();
            FilesKt__UtilsKt.deleteRecursively(FilesKt__UtilsKt.resolve(parentFile, valueOf));
            String str = Path.DIRECTORY_SEPARATOR;
            File dataDir = context.getDataDir();
            dataDir.getClass();
            Path path = Path.Companion.get(FilesKt__UtilsKt.resolve(dataDir, "shared_prefs"), false);
            jvmSystemFileSystem.getClass();
            FilteringSequence$iterator$1 filteringSequence$iterator$1 = new FilteringSequence$iterator$1(SequencesKt___SequencesKt.filter(new FilteringSequence(jvmSystemFileSystem.listRecursively(path), false, new RealSandboxer$$ExternalSyntheticLambda0(path, i)), new RealSandboxer$$ExternalSyntheticLambda1(valueOf, i)));
            while (filteringSequence$iterator$1.hasNext()) {
                jvmSystemFileSystem.delete((Path) filteringSequence$iterator$1.next());
            }
        }
        return list.size();
    }

    public static final Function0 withHaptics(Function0 function0, Haptics.VibrationEffectFactory vibrationEffectFactory, Composer composer, int i, int i2) {
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1098554033);
        boolean z = true;
        if ((i2 & 1) != 0) {
            vibrationEffectFactory = ((Haptics) gapComposer.consume(HapticsKt.LocalHaptics)).input.subtle;
        }
        if (!((InternalArcadeFlags) Updater.collectAsState((StateFlow) gapComposer.consume(LocalInternalArcadeFlagsKt.LocalInternalArcadeFlags), null, gapComposer, 1).getValue()).hapticsImprovementsEnabled) {
            gapComposer.startReplaceGroup(627949246);
            gapComposer.end(false);
            gapComposer.end(false);
            return function0;
        }
        gapComposer.startReplaceGroup(627829245);
        RealHapticVibrator realHapticVibrator = (RealHapticVibrator) gapComposer.consume(HapticVibratorKt.LocalHapticVibrator);
        boolean changedInstance = gapComposer.changedInstance(realHapticVibrator) | gapComposer.changedInstance(vibrationEffectFactory);
        if ((((i & 14) ^ 6) <= 4 || !gapComposer.changed(function0)) && (i & 6) != 4) {
            z = false;
        }
        boolean z2 = changedInstance | z;
        Object rememberedValue = gapComposer.rememberedValue();
        if (z2 || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new LaunchTracker$$ExternalSyntheticLambda0(3, realHapticVibrator, vibrationEffectFactory, function0);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Function0 function02 = (Function0) rememberedValue;
        gapComposer.end(false);
        gapComposer.end(false);
        return function02;
    }

    public static String zza(Context context) {
        try {
            return context.getResources().getResourcePackageName(com.squareup.cash.R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public abstract float getValue(Object obj);

    public abstract void setValue(Object obj, float f);

    public static HomeViewPresenter.MetroFactory create(DoubleCheck doubleCheck, DelegateFactory delegateFactory, DoubleCheck doubleCheck2, RealGlobalConfigManager.MetroFactory metroFactory, RealMarketAttributesProvider.MetroFactory metroFactory2, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, DoubleCheck doubleCheck3, RealBadger2.MetroFactory metroFactory3, MoneyUiFactory.MetroFactory metroFactory4, DoubleCheck doubleCheck4, Provider provider, LambdaProvider lambdaProvider, DoubleCheck doubleCheck5, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3, BreadcrumbListener.MetroFactory metroFactory5, Badger.MetroFactory metroFactory6, BroadwayModule$ProvideBroadwayMetroFactory broadwayModule$ProvideBroadwayMetroFactory) {
        doubleCheck.getClass();
        delegateFactory.getClass();
        doubleCheck2.getClass();
        metroFactory2.getClass();
        instanceFactory.getClass();
        instanceFactory2.getClass();
        instanceFactory4.getClass();
        doubleCheck3.getClass();
        metroFactory4.getClass();
        doubleCheck4.getClass();
        provider.getClass();
        lambdaProvider.getClass();
        doubleCheck5.getClass();
        lambdaProvider2.getClass();
        lambdaProvider3.getClass();
        metroFactory5.getClass();
        metroFactory6.getClass();
        broadwayModule$ProvideBroadwayMetroFactory.getClass();
        return new HomeViewPresenter.MetroFactory(doubleCheck, delegateFactory, doubleCheck2, metroFactory, metroFactory2, instanceFactory, instanceFactory2, instanceFactory3, instanceFactory4, doubleCheck3, metroFactory3, metroFactory4, doubleCheck4, provider, lambdaProvider, doubleCheck5, lambdaProvider2, lambdaProvider3, metroFactory5, metroFactory6, broadwayModule$ProvideBroadwayMetroFactory);
    }
}
