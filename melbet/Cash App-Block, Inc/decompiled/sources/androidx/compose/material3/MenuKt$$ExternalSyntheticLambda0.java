package androidx.compose.material3;

import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.KeyboardActionScope;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.SelectionHandlesKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOrigin;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.lifecycle.compose.LifecycleStartStopEffectScope;
import androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayerImpl;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.internal.NavControllerImpl;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.CircularProgressDrawable;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieListener;
import com.squareup.cash.arcade.components.FilterBarScope;
import com.squareup.cash.blockers.viewmodels.SetNameEvent;
import com.squareup.cash.common.viewmodels.LoadingAnimationAssets;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.views.components.EarningsCardKt;
import com.squareup.cash.lottie.CashLottieAnimationView;
import com.squareup.cash.savings.viewmodels.CelebrationViewModel;
import com.squareup.cash.score.views.ScoreUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.storage.FileDownloader$Category;
import com.squareup.cash.storage.FileDownloaderClientProvider;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.workflow1.BaseRenderContext;
import com.squareup.workflow1.StatefulWorkflow;
import com.squareup.workflow1.WorkflowAction;
import com.squareup.workflow1.Workflows;
import com.withpersona.sdk2.inquiry.permissions.PermissionRequestWorkflow;
import com.withpersona.sdk2.inquiry.ui.UiState;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow;
import com.withpersona.sdk2.inquiry.ui.UiWorkflow$$ExternalSyntheticLambda2;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.time.InstantKt$$ExternalSyntheticLambda0;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.connection.RealCall;
import okio.BufferedSink;
import okio.Utf8;
import timber.log.Timber;

/* loaded from: classes3.dex */
public final /* synthetic */ class MenuKt$$ExternalSyntheticLambda0 implements Function1 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;

    public /* synthetic */ MenuKt$$ExternalSyntheticLambda0(AnimatedContentScopeImpl animatedContentScopeImpl, boolean z, Function1 function1, TouchRecorder touchRecorder, MutableState mutableState) {
        this.$r8$classId = 4;
        this.f$1 = animatedContentScopeImpl;
        this.f$0 = z;
        this.f$3 = function1;
        this.f$4 = touchRecorder;
        this.f$2 = mutableState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [com.squareup.cash.arcade.components.ProgressBrandedKt$ProgressBranded$1$1$listener$1, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.$r8$classId;
        boolean z = false;
        Object obj2 = this.f$4;
        boolean z2 = this.f$0;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        Object obj5 = this.f$1;
        switch (i) {
            case 0:
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((MutableTransitionState) obj5).targetState$delegate;
                MutableState mutableState = (MutableState) obj4;
                State state = (State) obj3;
                State state2 = (State) obj2;
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                float f = 0.8f;
                float f2 = 1.0f;
                reusableGraphicsLayerScope.setScaleX(!z2 ? ((Number) state.getValue()).floatValue() : ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue() ? 1.0f : 0.8f);
                if (!z2) {
                    f = ((Number) state.getValue()).floatValue();
                } else if (((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
                    f = 1.0f;
                }
                reusableGraphicsLayerScope.setScaleY(f);
                if (!z2) {
                    f2 = ((Number) state2.getValue()).floatValue();
                } else if (!((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue()) {
                    f2 = RecyclerView.DECELERATION_RATE;
                }
                reusableGraphicsLayerScope.setAlpha(f2);
                reusableGraphicsLayerScope.m711setTransformOrigin__ExYCQ(((TransformOrigin) mutableState.getValue()).packedValue);
                return Unit.INSTANCE;
            case 1:
                TextFieldSelectionState textFieldSelectionState = (TextFieldSelectionState) obj4;
                long m442getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m442getAdjustedCoordinatesk4lQ0M(textFieldSelectionState.m420getHandlePositiontuRUvjQ(z2));
                ((Ref$LongRef) obj5).element = m442getAdjustedCoordinatesk4lQ0M;
                textFieldSelectionState.m422updateHandleDraggingUv8p0NA((Handle) obj3, m442getAdjustedCoordinatesk4lQ0M);
                ((Ref$LongRef) obj2).element = 0L;
                textFieldSelectionState.previousRawDragOffset = -1;
                return Unit.INSTANCE;
            case 2:
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                navBackStackEntry.getClass();
                ((Ref$BooleanRef) obj5).element = true;
                ((Ref$BooleanRef) obj4).element = true;
                ((NavControllerImpl) obj3).popEntryFromBackStack$navigation_runtime_release(navBackStackEntry, z2, (ArrayDeque) obj2);
                return Unit.INSTANCE;
            case 3:
                Context context = (Context) obj5;
                LoadingAnimationAssets loadingAnimationAssets = (LoadingAnimationAssets) obj3;
                final MutableState mutableState2 = (MutableState) obj4;
                final Function1 function1 = (Function1) obj2;
                final LifecycleStartStopEffectScope lifecycleStartStopEffectScope = (LifecycleStartStopEffectScope) obj;
                lifecycleStartStopEffectScope.getClass();
                String str = z2 ? "dark" : "light";
                ExoPlayerImpl build = new ExoPlayer.Builder(context).build();
                build.setPlayWhenReady(true);
                build.setRepeatMode(2);
                List<String> list = loadingAnimationAssets.assetNames;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                for (String str2 : list) {
                    String lowerCase = loadingAnimationAssets.name().toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    arrayList.add(MediaItem.fromUri(Uri.parse("asset:///" + lowerCase + "/" + str + "/" + str2 + ".webm")));
                }
                build.setMediaItems(arrayList);
                build.prepare();
                build.setPlayWhenReady(true);
                mutableState2.setValue(build);
                final ?? r0 = new Player.Listener() { // from class: com.squareup.cash.arcade.components.ProgressBrandedKt$ProgressBranded$1$1$listener$1
                    @Override // androidx.media3.common.Player.Listener
                    public final void onIsPlayingChanged(boolean z3) {
                        Function1 function12 = Function1.this;
                        if (function12 != null) {
                            function12.invoke(Boolean.valueOf(z3));
                        }
                    }
                };
                ExoPlayer exoPlayer = (ExoPlayer) mutableState2.getValue();
                if (exoPlayer != null) {
                    ((ExoPlayerImpl) exoPlayer).listeners.add(r0);
                }
                return new LifecycleStopOrDisposeEffectResult(lifecycleStartStopEffectScope, r0, mutableState2) { // from class: com.squareup.cash.arcade.components.ProgressBrandedKt$ProgressBranded$lambda$3$0$$inlined$onStopOrDispose$1
                    public final /* synthetic */ ProgressBrandedKt$ProgressBranded$1$1$listener$1 $listener$inlined;
                    public final /* synthetic */ MutableState $player$delegate$inlined;

                    {
                        this.$listener$inlined = r0;
                        this.$player$delegate$inlined = mutableState2;
                    }

                    @Override // androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult
                    public final void runStopOrDisposeEffect() {
                        MutableState mutableState3 = this.$player$delegate$inlined;
                        ExoPlayer exoPlayer2 = (ExoPlayer) mutableState3.getValue();
                        if (exoPlayer2 != null) {
                            ((ExoPlayerImpl) exoPlayer2).removeListener(this.$listener$inlined);
                        }
                        ExoPlayer exoPlayer3 = (ExoPlayer) mutableState3.getValue();
                        if (exoPlayer3 != null) {
                            ((ExoPlayerImpl) exoPlayer3).release();
                        }
                        mutableState3.setValue(null);
                    }
                };
            case 4:
                Function1 function12 = (Function1) obj3;
                TouchRecorder touchRecorder = (TouchRecorder) obj2;
                MutableState mutableState3 = (MutableState) obj4;
                ((KeyboardActionScope) obj).getClass();
                if (!((AnimatedContentScopeImpl) obj5).$$delegate_0.getTransition().isRunning() && !z2) {
                    function12.invoke(new SetNameEvent.NameSubmitted(((TextFieldValue) mutableState3.getValue()).annotatedString.text, touchRecorder.getSignalsContext()));
                }
                return Unit.INSTANCE;
            case 5:
                Function0 function0 = (Function0) obj4;
                DateFilter dateFilter = (DateFilter) obj3;
                Function1 function13 = (Function1) obj2;
                FilterBarScope filterBarScope = (FilterBarScope) obj;
                filterBarScope.getClass();
                for (DateFilter dateFilter2 : (List) obj5) {
                    FilterBarScope.chip$default(filterBarScope, new ArcadeModal2Kt$$ExternalSyntheticLambda2(17, function13, dateFilter2), Intrinsics.areEqual(dateFilter2, dateFilter), dateFilter2, new ComposableLambdaImpl(new ScoreUiFactory$$ExternalSyntheticLambda0(dateFilter2, 12), true, 658557517), 22);
                }
                if (z2) {
                    FilterBarScope.chip$default(filterBarScope, function0, false, "overflow", EarningsCardKt.f389lambda$530682875, 22);
                }
                return Unit.INSTANCE;
            case 6:
                final CelebrationViewModel celebrationViewModel = (CelebrationViewModel) obj5;
                String str3 = (String) obj3;
                final MutableState mutableState4 = (MutableState) obj4;
                final Function1 function14 = (Function1) obj2;
                final CashLottieAnimationView cashLottieAnimationView = (CashLottieAnimationView) obj;
                cashLottieAnimationView.getClass();
                if (!Intrinsics.areEqual(celebrationViewModel, (CelebrationViewModel) mutableState4.getValue()) && z2) {
                    LottieCompositionFactory.fromUrl(cashLottieAnimationView.getContext(), str3, str3).addListener(new LottieListener() { // from class: com.squareup.cash.savings.views.CelebrationKt$$ExternalSyntheticLambda4
                        @Override // com.airbnb.lottie.LottieListener
                        public final void onResult(Object obj6) {
                            MutableState mutableState5 = mutableState4;
                            CelebrationViewModel celebrationViewModel2 = CelebrationViewModel.this;
                            mutableState5.setValue(celebrationViewModel2);
                            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
                            CashLottieAnimationView cashLottieAnimationView2 = cashLottieAnimationView;
                            cashLottieAnimationView2.setScaleType(scaleType);
                            cashLottieAnimationView2.setAlpha(1.0f);
                            cashLottieAnimationView2.setRepeatCount(0);
                            cashLottieAnimationView2.setComposition((LottieComposition) obj6);
                            cashLottieAnimationView2.playAnimation();
                            cashLottieAnimationView2.addAnimatorListener(new CircularProgressDrawable.AnonymousClass2(3, function14, celebrationViewModel2));
                        }
                    });
                    return Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 7:
                HttpUrl httpUrl = (HttpUrl) obj4;
                FileDownloader$Category fileDownloader$Category = (FileDownloader$Category) obj3;
                String str4 = (String) obj2;
                BufferedSink bufferedSink = (BufferedSink) obj;
                bufferedSink.getClass();
                FileDownloaderClientProvider fileDownloaderClientProvider = ((RealFileDownloader) obj5).fileDownloaderClientProvider;
                OkHttpClient okHttpClient = z2 ? (OkHttpClient) fileDownloaderClientProvider.increasedTimeoutAuthenticatedOkHttpClient$delegate.getValue() : (OkHttpClient) fileDownloaderClientProvider.client$delegate.getValue();
                Request.Builder builder = new Request.Builder();
                builder.url = httpUrl;
                Request request = new Request(builder);
                okHttpClient.getClass();
                Response execute = new RealCall(okHttpClient, request, false).execute();
                ResponseBody responseBody = execute.body;
                if (execute.isSuccessful) {
                    try {
                        bufferedSink.writeAll(responseBody.source());
                        bufferedSink.flush();
                        responseBody.close();
                        z = true;
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            Utf8.closeFinally(responseBody, th);
                            throw th2;
                        }
                    }
                } else {
                    responseBody.close();
                    Timber.Forest.e("Failed to preload " + fileDownloader$Category + " " + str4, new Object[0]);
                }
                return Boolean.valueOf(z);
            default:
                BaseRenderContext baseRenderContext = ((StatefulWorkflow.RenderContext) obj4).$$delegate_0;
                UiWorkflow uiWorkflow = (UiWorkflow) obj3;
                UiState uiState = (UiState) obj2;
                ((WorkflowAction.Updater) obj).getClass();
                int ordinal = ((PermissionRequestWorkflow.Output) obj5).permissionState.result.ordinal();
                if (ordinal == 0) {
                    baseRenderContext.getActionSink().send(Workflows.action$default(uiWorkflow, new InstantKt$$ExternalSyntheticLambda0(uiWorkflow, 8)));
                } else if (ordinal != 1) {
                    if (ordinal != 2) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    baseRenderContext.getActionSink().send(Workflows.action$default(uiWorkflow, new UiWorkflow$$ExternalSyntheticLambda2(uiState, 3)));
                } else if (z2) {
                    baseRenderContext.getActionSink().send(Workflows.action$default(uiWorkflow, new InstantKt$$ExternalSyntheticLambda0(uiWorkflow, 10)));
                } else {
                    baseRenderContext.getActionSink().send(Workflows.action$default(uiWorkflow, new UiWorkflow$$ExternalSyntheticLambda2(uiState, 0)));
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ MenuKt$$ExternalSyntheticLambda0(Handle handle, TextFieldSelectionState textFieldSelectionState, Ref$LongRef ref$LongRef, Ref$LongRef ref$LongRef2, boolean z) {
        this.$r8$classId = 1;
        this.f$1 = ref$LongRef;
        this.f$2 = textFieldSelectionState;
        this.f$0 = z;
        this.f$3 = handle;
        this.f$4 = ref$LongRef2;
    }

    public /* synthetic */ MenuKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, boolean z, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$0 = z;
        this.f$4 = obj4;
    }

    public /* synthetic */ MenuKt$$ExternalSyntheticLambda0(Object obj, boolean z, Object obj2, MutableState mutableState, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = z;
        this.f$3 = obj2;
        this.f$2 = mutableState;
        this.f$4 = function1;
    }

    public /* synthetic */ MenuKt$$ExternalSyntheticLambda0(Object obj, boolean z, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$1 = obj;
        this.f$0 = z;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
    }

    public /* synthetic */ MenuKt$$ExternalSyntheticLambda0(boolean z, MutableTransitionState mutableTransitionState, MutableState mutableState, Transition.TransitionAnimationState transitionAnimationState, Transition.TransitionAnimationState transitionAnimationState2) {
        this.$r8$classId = 0;
        this.f$0 = z;
        this.f$1 = mutableTransitionState;
        this.f$2 = mutableState;
        this.f$3 = transitionAnimationState;
        this.f$4 = transitionAnimationState2;
    }
}
