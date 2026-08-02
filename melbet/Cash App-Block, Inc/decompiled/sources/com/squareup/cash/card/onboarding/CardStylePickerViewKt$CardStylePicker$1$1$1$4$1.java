package com.squareup.cash.card.onboarding;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import androidx.compose.foundation.lazy.LazyListMeasuredItem;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1;
import com.squareup.cash.graphics.backend.gl.GLSceneScope;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.backend.gl.core.WindowSurface;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$1$1;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardStylePickerViewKt$CardStylePicker$1$1$1$4$1 extends SuspendLambda implements Function2 {
    public /* synthetic */ Object $autoScrolling$delegate;
    public final /* synthetic */ Object $filterBarListState;
    public final /* synthetic */ int $leftContentEdge;
    public final /* synthetic */ Object $model;
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ int $rightContentEdge;
    public Object $selectedTabIndex;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStylePickerViewKt$CardStylePicker$1$1$1$4$1(MutableState mutableState, MutableState mutableState2, LazyListState lazyListState, int i, int i2, CardStylePickerViewModel cardStylePickerViewModel, Continuation continuation) {
        super(2, continuation);
        this.$selectedTabIndex = mutableState;
        this.$autoScrolling$delegate = mutableState2;
        this.$filterBarListState = lazyListState;
        this.$leftContentEdge = i;
        this.$rightContentEdge = i2;
        this.$model = cardStylePickerViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$model;
        Object obj3 = this.$filterBarListState;
        switch (i) {
            case 0:
                return new CardStylePickerViewKt$CardStylePicker$1$1$1$4$1((MutableState) this.$selectedTabIndex, (MutableState) this.$autoScrolling$delegate, (LazyListState) obj3, this.$leftContentEdge, this.$rightContentEdge, (CardStylePickerViewModel) obj2, continuation);
            default:
                CardStylePickerViewKt$CardStylePicker$1$1$1$4$1 cardStylePickerViewKt$CardStylePicker$1$1$1$4$1 = new CardStylePickerViewKt$CardStylePicker$1$1$1$4$1((GLSceneScope) obj3, (SurfaceTexture) obj2, this.$leftContentEdge, this.$rightContentEdge, continuation);
                cardStylePickerViewKt$CardStylePicker$1$1$1$4$1.$autoScrolling$delegate = obj;
                return cardStylePickerViewKt$CardStylePicker$1$1$1$4$1;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
            case 0:
                return ((CardStylePickerViewKt$CardStylePicker$1$1$1$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                ((CardStylePickerViewKt$CardStylePicker$1$1$1$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        WindowSurface windowSurface;
        int i = this.$r8$classId;
        Object obj2 = this.$model;
        Object obj3 = this.$filterBarListState;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow distinctUntilChanged = FlowKt.distinctUntilChanged(FlowKt.drop(Updater.snapshotFlow(new DrawerViewKt$$ExternalSyntheticLambda2(3, (MutableState) this.$selectedTabIndex)), 1));
                    MutableState mutableState = (MutableState) this.$autoScrolling$delegate;
                    final LazyListState lazyListState = (LazyListState) obj3;
                    final int i3 = this.$rightContentEdge;
                    final CardStylePickerViewModel cardStylePickerViewModel = (CardStylePickerViewModel) obj2;
                    final int i4 = this.$leftContentEdge;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.squareup.cash.card.onboarding.CardStylePickerViewKt$CardStylePicker$1$1$1$4$1.3
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public final Object emit(Object obj4, Continuation continuation) {
                            Object obj5;
                            CardStylePickerViewModel cardStylePickerViewModel2;
                            int i5;
                            Object obj6;
                            int i6;
                            int intValue = ((Number) obj4).intValue();
                            LazyListState lazyListState2 = LazyListState.this;
                            Iterator it = lazyListState2.getLayoutInfo().visibleItemsInfo.iterator();
                            while (true) {
                                boolean hasNext = it.hasNext();
                                obj5 = null;
                                cardStylePickerViewModel2 = cardStylePickerViewModel;
                                i5 = i4;
                                if (!hasNext) {
                                    obj6 = null;
                                    break;
                                }
                                obj6 = it.next();
                                LazyListMeasuredItem lazyListMeasuredItem = (LazyListMeasuredItem) obj6;
                                int i7 = lazyListMeasuredItem.index;
                                if (i7 > 0 && i7 < cardStylePickerViewModel2.headers.size() && lazyListMeasuredItem.offset >= i5) {
                                    break;
                                }
                            }
                            if (((LazyListMeasuredItem) obj6) != null && r2.index - 1 > intValue) {
                                Object animateScrollToItem = lazyListState2.animateScrollToItem(intValue + 1, -i5, continuation);
                                return animateScrollToItem == CoroutineSingletons.COROUTINE_SUSPENDED ? animateScrollToItem : Unit.INSTANCE;
                            }
                            List list = lazyListState2.getLayoutInfo().visibleItemsInfo;
                            ListIterator listIterator = list.listIterator(list.size());
                            while (true) {
                                boolean hasPrevious = listIterator.hasPrevious();
                                i6 = i3;
                                if (!hasPrevious) {
                                    break;
                                }
                                Object previous = listIterator.previous();
                                LazyListMeasuredItem lazyListMeasuredItem2 = (LazyListMeasuredItem) previous;
                                int i8 = lazyListMeasuredItem2.index;
                                if (i8 > 0 && i8 < cardStylePickerViewModel2.headers.size() && lazyListMeasuredItem2.offset + lazyListMeasuredItem2.size <= i6) {
                                    obj5 = previous;
                                    break;
                                }
                            }
                            LazyListMeasuredItem lazyListMeasuredItem3 = (LazyListMeasuredItem) obj5;
                            if (lazyListMeasuredItem3 == null || lazyListMeasuredItem3.index - 1 >= intValue) {
                                return Unit.INSTANCE;
                            }
                            Object animateScrollToItem2 = lazyListState2.animateScrollToItem(intValue + 1, lazyListMeasuredItem3.size - i6, continuation);
                            return animateScrollToItem2 == CoroutineSingletons.COROUTINE_SUSPENDED ? animateScrollToItem2 : Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    Object collect = distinctUntilChanged.collect(new FidesmoProvisioningPresenter$models$9$1$invokeSuspend$$inlined$filter$1.AnonymousClass2(flowCollector, mutableState, 3), this);
                    if (collect != coroutineSingletons) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                GLSceneScope gLSceneScope = (GLSceneScope) obj3;
                SurfaceTexture surfaceTexture = (SurfaceTexture) obj2;
                CoroutineScope coroutineScope = (CoroutineScope) this.$autoScrolling$delegate;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    gLSceneScope.glScope = coroutineScope;
                    WindowSurface windowSurface2 = new WindowSurface(surfaceTexture);
                    EGLSurface eGLSurface = windowSurface2.eglSurface;
                    EglCore eglCore = windowSurface2.eglCore;
                    eglCore.getClass();
                    eGLSurface.getClass();
                    if (!EGL14.eglMakeCurrent((EGLDisplay) eglCore.eglDisplay, eGLSurface, eGLSurface, (EGLContext) eglCore.eglContext)) {
                        OptionalProvider$$ExternalSyntheticLambda0.m$1("eglMakeCurrent failed");
                        return null;
                    }
                    GLES20.glDepthMask(true);
                    GLES20.glDepthFunc(515);
                    GLES20.glClearDepthf(1.0f);
                    GLES20.glEnable(2929);
                    GLES20.glEnable(3042);
                    GLES20.glBlendFunc(770, 771);
                    JobKt.launch$default(gLSceneScope.engineScope, null, null, new MoneyTabUIKt$MoneyTabLoaded$1$1(gLSceneScope, this.$leftContentEdge, this.$rightContentEdge, windowSurface2, (Continuation) null), 3);
                    try {
                        this.$autoScrolling$delegate = null;
                        this.$selectedTabIndex = windowSurface2;
                        this.label = 1;
                        JobKt.awaitCancellation(this);
                        return coroutineSingletons2;
                    } catch (Throwable th2) {
                        th = th2;
                        windowSurface = windowSurface2;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    windowSurface = (WindowSurface) this.$selectedTabIndex;
                    try {
                        SafeTrace.throwOnFailure(obj);
                        throw new KotlinNothingValueException();
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                windowSurface.release();
                surfaceTexture.release();
                throw th;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStylePickerViewKt$CardStylePicker$1$1$1$4$1(GLSceneScope gLSceneScope, SurfaceTexture surfaceTexture, int i, int i2, Continuation continuation) {
        super(2, continuation);
        this.$filterBarListState = gLSceneScope;
        this.$model = surfaceTexture;
        this.$leftContentEdge = i;
        this.$rightContentEdge = i2;
    }
}
