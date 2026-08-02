package androidx.camera.core.impl.utils;

import android.os.Handler;
import android.os.Looper;
import androidx.camera.core.impl.utils.Threads;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.room.TransactorKt;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda4;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda0;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.genie.backend.real.GenieLogger;
import com.squareup.cash.moneybot.genie.GenieViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$3$1;
import com.squareup.cash.moneybot.genie.protos.ComposePlatform;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.cash.moneybot.genie.protos.Node;
import com.squareup.protos.cash.ui.Icon;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import okio.ByteString;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import timber.log.Timber;
import xyz.block.genie.expressions.ExpressionEvaluator;
import xyz.block.genie.state.GenieCompositionLocalsKt;
import xyz.block.genie.state.GenieRootViewState;
import xyz.block.protos.genie.ViewPlan;
import xyz.block.protos.genie.ViewSpec;

/* loaded from: classes3.dex */
public abstract class Threads {
    public static final void GenieView(final ViewPlan viewPlan, final Modifier modifier, final GenieRootViewState genieRootViewState, Composer composer, final int i) {
        Continuation continuation;
        Object obj;
        Object failure;
        Node node;
        String str = viewPlan.initial_view_slug;
        List list = viewPlan.view_entries;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(698529200);
        int i2 = i | (gapComposer.changedInstance(viewPlan) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16) | MLKEMEngine.KyberPolyBytes | (gapComposer.changed(genieRootViewState) ? 2048 : 1024);
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            GenieLogger genieLogger = (GenieLogger) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieLogger);
            if (gapComposer.consume(GenieCompositionLocalsKt.LocalGenieActionHandler) != null) {
                a$$ExternalSyntheticBUOutline0.m$1();
                return;
            }
            ExpressionEvaluator expressionEvaluator = (ExpressionEvaluator) gapComposer.consume(GenieCompositionLocalsKt.LocalGenieExpressionEvaluator);
            JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(gapComposer.consume(GenieCompositionLocalsKt.LocalGenieActionExecutor));
            Iterator it = list.iterator();
            while (true) {
                continuation = null;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.areEqual(((ViewPlan.ViewEntry) obj).view_slug, str)) {
                        break;
                    }
                }
            }
            ViewPlan.ViewEntry viewEntry = (ViewPlan.ViewEntry) obj;
            ViewSpec viewSpec = viewEntry != null ? viewEntry.view : null;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (viewSpec == null) {
                gapComposer.startReplaceGroup(767357567);
                boolean changedInstance = gapComposer.changedInstance(genieLogger) | gapComposer.changedInstance(viewPlan);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new GenieViewKt$GenieView$1$1(genieLogger, viewPlan, continuation, i3);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Updater.LaunchedEffect(str, list, null, (Function2) rememberedValue, gapComposer);
                gapComposer.end(false);
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i4 = 0;
                    endRestartGroup.block = new Function2(viewPlan, modifier, genieRootViewState, i, i4) { // from class: com.squareup.cash.moneybot.genie.GenieViewKt$$ExternalSyntheticLambda0
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ ViewPlan f$0;
                        public final /* synthetic */ Modifier f$1;
                        public final /* synthetic */ GenieRootViewState f$3;

                        {
                            this.$r8$classId = i4;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            int i5 = this.$r8$classId;
                            GenieRootViewState genieRootViewState2 = this.f$3;
                            Modifier modifier2 = this.f$1;
                            ViewPlan viewPlan2 = this.f$0;
                            Composer composer2 = (Composer) obj2;
                            ((Integer) obj3).getClass();
                            switch (i5) {
                                case 0:
                                    Threads.GenieView(viewPlan2, modifier2, genieRootViewState2, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    Threads.GenieView(viewPlan2, modifier2, genieRootViewState2, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            gapComposer.startReplaceGroup(767621842);
            gapComposer.end(false);
            ByteString byteString = viewSpec.view_node;
            boolean z = byteString != null && byteString.getSize$okio() > 0;
            boolean changed = gapComposer.changed(viewSpec) | gapComposer.changed(byteString);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                if (byteString != null) {
                    if (byteString.getSize$okio() <= 0) {
                        byteString = null;
                    }
                    if (byteString != null) {
                        try {
                            Result.Companion companion = Result.Companion;
                            failure = (Node) Node.ADAPTER.decode(byteString);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            failure = new Result.Failure(th);
                        }
                        rememberedValue2 = new Result(failure);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                }
                rememberedValue2 = null;
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Result result = (Result) rememberedValue2;
            if (result != null) {
                Object obj2 = result.value;
                if (obj2 instanceof Result.Failure) {
                    obj2 = null;
                }
                node = (Node) obj2;
            } else {
                node = null;
            }
            Boolean valueOf = Boolean.valueOf(z);
            boolean changed2 = gapComposer.changed(z) | gapComposer.changedInstance(genieLogger);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new GenieViewKt$GenieView$3$1(z, genieLogger, continuation, i3);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue3);
            boolean changedInstance2 = gapComposer.changedInstance(result) | gapComposer.changedInstance(genieLogger);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new GenieViewKt$GenieView$1$1(result, genieLogger, (Continuation) null);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Updater.LaunchedEffect(gapComposer, result, (Function2) rememberedValue4);
            boolean changed3 = gapComposer.changed(System.identityHashCode(viewPlan)) | gapComposer.changed(viewSpec) | ((i2 & 7168) == 2048);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changed3 || rememberedValue5 == neverEqualPolicy) {
                GenieRootViewState genieRootViewState2 = genieRootViewState == null ? new GenieRootViewState(viewSpec.view_state) : genieRootViewState;
                gapComposer.updateRememberedValue(genieRootViewState2);
                rememberedValue5 = genieRootViewState2;
            }
            GenieRootViewState genieRootViewState3 = (GenieRootViewState) rememberedValue5;
            boolean changed4 = gapComposer.changed(expressionEvaluator) | gapComposer.changed(genieLogger);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changed4 || rememberedValue6 == neverEqualPolicy) {
                if (genieLogger != null) {
                    expressionEvaluator = new ExpressionEvaluator(genieLogger);
                }
                gapComposer.updateRememberedValue(expressionEvaluator);
                rememberedValue6 = expressionEvaluator;
            }
            ExpressionEvaluator expressionEvaluator2 = (ExpressionEvaluator) rememberedValue6;
            boolean changed5 = gapComposer.changed((Object) null) | gapComposer.changed((Object) null) | gapComposer.changed(viewPlan) | gapComposer.changed(expressionEvaluator2) | gapComposer.changed(genieLogger);
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (changed5 || rememberedValue7 == neverEqualPolicy) {
                gapComposer.updateRememberedValue(null);
                rememberedValue7 = null;
            }
            JsonLogicResult$Success$$ExternalSyntheticOutline0.m4m(rememberedValue7);
            boolean changed6 = gapComposer.changed(node);
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (changed6 || rememberedValue8 == neverEqualPolicy) {
                rememberedValue8 = Boolean.valueOf(node != null && containsAction(node));
                gapComposer.updateRememberedValue(rememberedValue8);
            }
            boolean booleanValue = ((Boolean) rememberedValue8).booleanValue();
            Boolean valueOf2 = Boolean.valueOf(booleanValue);
            boolean changed7 = gapComposer.changed(booleanValue) | gapComposer.changedInstance(genieLogger);
            Object rememberedValue9 = gapComposer.rememberedValue();
            if (changed7 || rememberedValue9 == neverEqualPolicy) {
                rememberedValue9 = new GenieViewKt$GenieView$3$1(booleanValue, genieLogger, continuation, 2);
                gapComposer.updateRememberedValue(rememberedValue9);
            }
            Updater.LaunchedEffect(gapComposer, valueOf2, (Function2) rememberedValue9);
            Updater.CompositionLocalProvider(new ProvidedValue[]{GenieCompositionLocalsKt.LocalGenieViewState.defaultProvidedValue$runtime(genieRootViewState3), GenieCompositionLocalsKt.LocalGenieExpressionEvaluator.defaultProvidedValue$runtime(expressionEvaluator2), GenieCompositionLocalsKt.LocalGenieActionExecutor.defaultProvidedValue$runtime(null)}, Expect_jvmKt.rememberComposableLambda(1141496432, new GenieViewKt$$ExternalSyntheticLambda1(node, modifier, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i5 = 1;
            endRestartGroup2.block = new Function2(viewPlan, modifier, genieRootViewState, i, i5) { // from class: com.squareup.cash.moneybot.genie.GenieViewKt$$ExternalSyntheticLambda0
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ ViewPlan f$0;
                public final /* synthetic */ Modifier f$1;
                public final /* synthetic */ GenieRootViewState f$3;

                {
                    this.$r8$classId = i5;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj22, Object obj3) {
                    int i52 = this.$r8$classId;
                    GenieRootViewState genieRootViewState22 = this.f$3;
                    Modifier modifier2 = this.f$1;
                    ViewPlan viewPlan2 = this.f$0;
                    Composer composer2 = (Composer) obj22;
                    ((Integer) obj3).getClass();
                    switch (i52) {
                        case 0:
                            Threads.GenieView(viewPlan2, modifier2, genieRootViewState22, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            Threads.GenieView(viewPlan2, modifier2, genieRootViewState22, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void InlineAppMessageV2(MutableTransitionState mutableTransitionState, InlineAppMessageV2ViewModel.Ready ready, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        Icons icons;
        Modifier.Companion companion;
        String str;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(411882284);
        int i2 = i | (gapComposer2.changed(mutableTransitionState) ? 4 : 2) | (gapComposer2.changedInstance(ready) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128) | 3072;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            CoroutineScope coroutineScope = (CoroutineScope) rememberedValue;
            Icon icon = ready.avatar.icon;
            if (icon == null || (str = icon.arcade_id) == null) {
                icons = null;
            } else {
                Icons.Companion.getClass();
                icons = zzd.get(str);
            }
            if (icons == null) {
                Timber.Forest.e("InlineAppMessageV2ViewModel UiAvatar is missing Icon", new Object[0]);
            }
            boolean changed = gapComposer2.changed(ready.messageToken);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (icons == null) {
                gapComposer2.startReplaceGroup(-335926404);
                gapComposer2.end(false);
                gapComposer = gapComposer2;
                companion = companion2;
            } else {
                gapComposer2.startReplaceGroup(-335926403);
                gapComposer = gapComposer2;
                companion = companion2;
                AnimatedContentKt.AnimatedVisibility(mutableTransitionState, companion, EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(10, 0, null, 6), 2), EnterExitTransitionKt.shrinkVertically$default(null, Alignment.Companion.CenterVertically, 13).plus(EnterExitTransitionKt.fadeOut$default(null, 3)), (String) null, Expect_jvmKt.rememberComposableLambda(-1468366913, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda0(mutableState, function1, ready, icons, coroutineScope, mutableTransitionState, 4), gapComposer2), gapComposer, (i2 & 14) | 200112, 16);
                gapComposer.end(false);
            }
            modifier2 = companion;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new DismissableToastKt$$ExternalSyntheticLambda4(mutableTransitionState, ready, function1, modifier2, i, 24);
        }
    }

    public static void checkMainThread() {
        TransactorKt.checkState("Not in application's main thread", isMainThread());
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x00bf A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean containsAction(Node node) {
        boolean z;
        Node node2;
        List list;
        List list2;
        List list3;
        Node node3;
        Node node4;
        node.getClass();
        ForEach forEach = node.for_each;
        if (forEach != null && (node4 = forEach.template) != null && containsAction(node4)) {
            return true;
        }
        ComposePlatform composePlatform = node.compose_platform;
        if (composePlatform != null) {
            composePlatform.getClass();
            ComposePlatform.Button button = composePlatform.button;
            if ((button != null ? button.action : null) == null && (button == null || (node3 = button.label) == null || !containsAction(node3))) {
                ComposePlatform.Column column = composePlatform.column;
                if (column != null && (list3 = column.children) != null) {
                    Iterator it = list3.iterator();
                    while (it.hasNext()) {
                        if (containsAction((Node) it.next())) {
                            break;
                        }
                    }
                }
                ComposePlatform.Row row = composePlatform.row;
                if (row != null && (list2 = row.children) != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (containsAction((Node) it2.next())) {
                            break;
                        }
                    }
                }
                ComposePlatform.Box box = composePlatform.box;
                if (box != null && (list = box.children) != null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (containsAction((Node) it3.next())) {
                            break;
                        }
                    }
                }
                Iterator it4 = composePlatform.modifiers.iterator();
                while (it4.hasNext()) {
                    ComposePlatform.Modifier.Overlay overlay = ((ComposePlatform.Modifier) it4.next()).overlay;
                    if (overlay == null || (node2 = overlay.content) == null || !containsAction(node2)) {
                    }
                }
                z = false;
                if (!z) {
                    return true;
                }
            }
            z = true;
            if (!z) {
            }
        }
        return false;
    }

    public static boolean isMainThread() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public static void runOnMain(Runnable runnable) {
        if (isMainThread()) {
            runnable.run();
        } else {
            TransactorKt.checkState("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(runnable));
        }
    }
}
