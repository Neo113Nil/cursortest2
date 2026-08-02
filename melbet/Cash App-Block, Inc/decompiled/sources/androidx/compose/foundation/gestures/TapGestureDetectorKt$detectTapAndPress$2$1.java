package androidx.compose.foundation.gestures;

import android.graphics.PointF;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SuspendAnimationKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.BorderKt$$ExternalSyntheticLambda1;
import androidx.compose.material.SliderKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.paging.CachedPagingDataKt$cachedIn$5;
import androidx.paging.HintHandler$$ExternalSyntheticLambda0;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahe;
import com.squareup.cash.arcade.components.ToastKt$Toast$12$1$1;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardsKt;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.clientsync.persistence.RealClientSyncTransactor$$ExternalSyntheticLambda0;
import com.squareup.cash.common.composeui.BadgedBoxKt$$ExternalSyntheticLambda0;
import com.squareup.cash.composeUi.foundation.text.DetectTapGesturesKt$detectTapGestures$2$1$3;
import com.squareup.cash.composeUi.foundation.text.LinkTapDetectorState;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.graphics.swampgl.components.Entity;
import com.squareup.cash.money.views.MoneyTabUIKt$MoneyTabLoaded$4$4$1$1;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt;
import com.squareup.workflow1.TimerWorker$run$1;
import com.squareup.workflow1.internal.WorkflowNode$tick$1$1;
import defpackage.Size$$ExternalSyntheticLambda0;
import kotlin.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.MutableSharedFlow;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class TapGestureDetectorKt$detectTapAndPress$2$1 extends RestrictedSuspendLambda implements Function2 {
    public final /* synthetic */ Object $$this$coroutineScope;
    public final /* synthetic */ Object $onPress;
    public final /* synthetic */ Object $onTap;
    public final /* synthetic */ Object $pressScope;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public Object L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapAndPress$2$1(CoroutineScope coroutineScope, PressGestureScopeImpl pressGestureScopeImpl, Function1 function1, Function3 function3, Function1 function12, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 3;
        this.$$this$coroutineScope = coroutineScope;
        this.$pressScope = pressGestureScopeImpl;
        this.$onTap = function1;
        this.$onPress = function3;
        this.L$1 = function12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$pressScope;
        Object obj3 = this.$onTap;
        Object obj4 = this.$onPress;
        Object obj5 = this.$$this$coroutineScope;
        switch (i) {
            case 0:
                TapGestureDetectorKt$detectTapAndPress$2$1 tapGestureDetectorKt$detectTapAndPress$2$1 = new TapGestureDetectorKt$detectTapAndPress$2$1((CoroutineScope) obj5, (Function3) obj4, (Function1) obj3, (PressGestureScopeImpl) obj2, continuation, 0);
                tapGestureDetectorKt$detectTapAndPress$2$1.L$0 = obj;
                return tapGestureDetectorKt$detectTapAndPress$2$1;
            case 1:
                TapGestureDetectorKt$detectTapAndPress$2$1 tapGestureDetectorKt$detectTapAndPress$2$12 = new TapGestureDetectorKt$detectTapAndPress$2$1((Size$$ExternalSyntheticLambda0) this.L$1, (BrandSheetViewKt$$ExternalSyntheticLambda6) obj5, (Function2) obj4, (Function0) obj3, (LocalMapKt$$ExternalSyntheticLambda10) obj2, continuation, 1);
                tapGestureDetectorKt$detectTapAndPress$2$12.L$0 = obj;
                return tapGestureDetectorKt$detectTapAndPress$2$12;
            case 2:
                TapGestureDetectorKt$detectTapAndPress$2$1 tapGestureDetectorKt$detectTapAndPress$2$13 = new TapGestureDetectorKt$detectTapAndPress$2$1((BorderKt$$ExternalSyntheticLambda1) obj5, (Function2) obj4, (Size$$ExternalSyntheticLambda0) obj3, (Size$$ExternalSyntheticLambda0) obj2, continuation, 2);
                tapGestureDetectorKt$detectTapAndPress$2$13.L$0 = obj;
                return tapGestureDetectorKt$detectTapAndPress$2$13;
            case 3:
                TapGestureDetectorKt$detectTapAndPress$2$1 tapGestureDetectorKt$detectTapAndPress$2$14 = new TapGestureDetectorKt$detectTapAndPress$2$1((CoroutineScope) obj5, (PressGestureScopeImpl) obj2, (Function1) obj3, (Function3) obj4, (Function1) this.L$1, continuation);
                tapGestureDetectorKt$detectTapAndPress$2$14.L$0 = obj;
                return tapGestureDetectorKt$detectTapAndPress$2$14;
            case 4:
                TapGestureDetectorKt$detectTapAndPress$2$1 tapGestureDetectorKt$detectTapAndPress$2$15 = new TapGestureDetectorKt$detectTapAndPress$2$1((BadgedBoxKt$$ExternalSyntheticLambda0) this.L$1, (CoroutineScope) obj5, (RealClientSyncTransactor$$ExternalSyntheticLambda0) obj4, (com.squareup.cash.composeUi.foundation.text.PressGestureScopeImpl) obj3, (RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1) obj2, continuation, 4);
                tapGestureDetectorKt$detectTapAndPress$2$15.L$0 = obj;
                return tapGestureDetectorKt$detectTapAndPress$2$15;
            case 5:
                TapGestureDetectorKt$detectTapAndPress$2$1 tapGestureDetectorKt$detectTapAndPress$2$16 = new TapGestureDetectorKt$detectTapAndPress$2$1((CardScene) obj4, (Function0) obj3, (CoroutineScope) obj5, (Animatable) obj2, continuation);
                tapGestureDetectorKt$detectTapAndPress$2$16.L$0 = obj;
                return tapGestureDetectorKt$detectTapAndPress$2$16;
            default:
                TapGestureDetectorKt$detectTapAndPress$2$1 tapGestureDetectorKt$detectTapAndPress$2$17 = new TapGestureDetectorKt$detectTapAndPress$2$1((CoroutineScope) obj5, (MutableState) this.L$1, (MutableSharedFlow) obj4, (MutableSharedFlow) obj3, (MutableState) obj2, continuation);
                tapGestureDetectorKt$detectTapAndPress$2$17.L$0 = obj;
                return tapGestureDetectorKt$detectTapAndPress$2$17;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((TapGestureDetectorKt$detectTapAndPress$2$1) create(pointerEventHandlerCoroutine, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0347, code lost:
    
        if (r0 == r6) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x02ff, code lost:
    
        if (r1 == r6) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x03a7, code lost:
    
        if (androidx.compose.foundation.gestures.DragGestureDetectorKt.processDragGesture(r0, (androidx.compose.ui.input.pointer.PointerInputChange) r1, (defpackage.Size$$ExternalSyntheticLambda0) r32.L$1, (app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6) r10, (kotlin.jvm.functions.Function2) r11, (kotlin.jvm.functions.Function0) r7, (app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda10) r8, r32) == r14) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0384, code lost:
    
        if (r1 == r14) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x03fe, code lost:
    
        if (r4 == r0) goto L154;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00c0, code lost:
    
        if (r1 == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0110, code lost:
    
        if (r2 == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0243, code lost:
    
        if (r0 == r1) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x01d2, code lost:
    
        if (r2 == r1) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:115:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0136  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine;
        StandaloneCoroutine launch$default;
        Object awaitFirstDown$default;
        Continuation continuation;
        Object waitForUpOrCancellation;
        Job job;
        PointerInputChange pointerInputChange;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine2;
        Object awaitFirstDown;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine3;
        Object awaitFirstDown$default2;
        Object m209awaitVerticalPointerSlopOrCancellationgDDlDlE;
        SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine4;
        Ref$FloatRef ref$FloatRef;
        PointerInputChange pointerInputChange2;
        Object m213verticalDragjO51t88;
        Object awaitFirstDown$default3;
        AnnotatedString.Range range;
        Object waitForUpOrCancellation2;
        Object awaitFirstDown$default4;
        Object withTimeoutOrNull;
        PointerInputChange pointerInputChange3;
        Pair pair;
        Object awaitFirstDown$default5;
        CoroutineSingletons coroutineSingletons;
        MutableState mutableState;
        Object m210dragjO51t88;
        int i = this.$r8$classId;
        boolean z = false;
        Object obj2 = this.$onTap;
        Object obj3 = this.$pressScope;
        Object obj4 = this.$$this$coroutineScope;
        Object obj5 = this.$onPress;
        int i2 = 2;
        Continuation continuation2 = null;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) obj4;
                PressGestureScopeImpl pressGestureScopeImpl = (PressGestureScopeImpl) obj3;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    pointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                    launch$default = JobKt.launch$default(coroutineScope, null, CoroutineStart.UNDISPATCHED, new TapGestureDetectorKt$processTapGesture$resetJob$1(pressGestureScopeImpl, null, 1), 1);
                    this.L$0 = pointerEventHandlerCoroutine;
                    this.L$1 = launch$default;
                    this.label = 1;
                    awaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(pointerEventHandlerCoroutine, this, 3);
                    break;
                } else if (i3 == 1) {
                    launch$default = (StandaloneCoroutine) this.L$1;
                    pointerEventHandlerCoroutine = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    awaitFirstDown$default = obj;
                } else if (i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    job = (Job) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    continuation = null;
                    waitForUpOrCancellation = obj;
                    pointerInputChange = (PointerInputChange) waitForUpOrCancellation;
                    if (pointerInputChange != null) {
                        TapGestureDetectorKt.launchAwaitingReset$default(coroutineScope, job, new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl, continuation, 1));
                    } else {
                        pointerInputChange.consume();
                        TapGestureDetectorKt.launchAwaitingReset$default(coroutineScope, job, new TapGestureDetectorKt$processTapGesture$3(pressGestureScopeImpl, continuation, 2));
                        ((Function1) obj2).invoke(new Offset(pointerInputChange.position));
                    }
                    break;
                }
                PointerInputChange pointerInputChange4 = (PointerInputChange) awaitFirstDown$default;
                pointerInputChange4.consume();
                Function3 function3 = (Function3) obj5;
                if (function3 != TapGestureDetectorKt.NoPressGesture) {
                    continuation = null;
                    TapGestureDetectorKt.launchAwaitingReset$default(coroutineScope, launch$default, new TapGestureDetectorKt$processTapGesture$2(function3, pressGestureScopeImpl, pointerInputChange4, null, 1));
                } else {
                    continuation = null;
                }
                this.L$0 = launch$default;
                this.L$1 = continuation;
                this.label = 2;
                waitForUpOrCancellation = TapGestureDetectorKt.waitForUpOrCancellation(pointerEventHandlerCoroutine, PointerEventPass.Main, this);
                if (waitForUpOrCancellation != coroutineSingletons2) {
                    job = launch$default;
                    pointerInputChange = (PointerInputChange) waitForUpOrCancellation;
                    if (pointerInputChange != null) {
                    }
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    pointerEventHandlerCoroutine2 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                    PointerEventPass pointerEventPass = PointerEventPass.Initial;
                    this.L$0 = pointerEventHandlerCoroutine2;
                    this.label = 1;
                    awaitFirstDown = TapGestureDetectorKt.awaitFirstDown(pointerEventHandlerCoroutine2, false, pointerEventPass, this);
                    break;
                } else if (i4 == 1) {
                    pointerEventHandlerCoroutine2 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    awaitFirstDown = obj;
                } else if (i4 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    break;
                }
                this.L$0 = null;
                this.label = 2;
                break;
            case 2:
                Function2 function2 = (Function2) obj5;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    pointerEventHandlerCoroutine3 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                    this.L$0 = pointerEventHandlerCoroutine3;
                    this.label = 1;
                    awaitFirstDown$default2 = TapGestureDetectorKt.awaitFirstDown$default(pointerEventHandlerCoroutine3, this, 2);
                    break;
                } else if (i5 == 1) {
                    pointerEventHandlerCoroutine3 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    awaitFirstDown$default2 = obj;
                } else if (i5 == 2) {
                    ref$FloatRef = (Ref$FloatRef) this.L$1;
                    SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine5 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    pointerEventHandlerCoroutine4 = pointerEventHandlerCoroutine5;
                    m209awaitVerticalPointerSlopOrCancellationgDDlDlE = obj;
                    pointerInputChange2 = (PointerInputChange) m209awaitVerticalPointerSlopOrCancellationgDDlDlE;
                    if (pointerInputChange2 != null) {
                        function2.invoke(pointerInputChange2, new Float(ref$FloatRef.element));
                        long j = pointerInputChange2.id;
                        SuspendAnimationKt$$ExternalSyntheticLambda0 suspendAnimationKt$$ExternalSyntheticLambda0 = new SuspendAnimationKt$$ExternalSyntheticLambda0(1, function2);
                        this.L$0 = null;
                        this.L$1 = null;
                        this.label = 3;
                        m213verticalDragjO51t88 = DragGestureDetectorKt.m213verticalDragjO51t88(pointerEventHandlerCoroutine4, j, suspendAnimationKt$$ExternalSyntheticLambda0, this);
                        break;
                    }
                } else if (i5 != 3) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    m213verticalDragjO51t88 = obj;
                    ((Boolean) m213verticalDragjO51t88).booleanValue();
                    break;
                }
                PointerInputChange pointerInputChange5 = (PointerInputChange) awaitFirstDown$default2;
                Ref$FloatRef ref$FloatRef2 = new Ref$FloatRef();
                long j2 = pointerInputChange5.id;
                int i6 = pointerInputChange5.f859type;
                HintHandler$$ExternalSyntheticLambda0 hintHandler$$ExternalSyntheticLambda0 = new HintHandler$$ExternalSyntheticLambda0(ref$FloatRef2, i2);
                this.L$0 = pointerEventHandlerCoroutine3;
                this.L$1 = ref$FloatRef2;
                this.label = 2;
                m209awaitVerticalPointerSlopOrCancellationgDDlDlE = DragGestureDetectorKt.m209awaitVerticalPointerSlopOrCancellationgDDlDlE(pointerEventHandlerCoroutine3, j2, i6, hintHandler$$ExternalSyntheticLambda0, this);
                if (m209awaitVerticalPointerSlopOrCancellationgDDlDlE != coroutineSingletons4) {
                    pointerEventHandlerCoroutine4 = pointerEventHandlerCoroutine3;
                    ref$FloatRef = ref$FloatRef2;
                    pointerInputChange2 = (PointerInputChange) m209awaitVerticalPointerSlopOrCancellationgDDlDlE;
                    if (pointerInputChange2 != null) {
                    }
                }
                break;
            case 3:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Function1 function1 = (Function1) this.L$1;
                    this.label = 1;
                    if (TapGestureDetectorKt.processTapGesture((SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0, (CoroutineScope) obj4, (PressGestureScopeImpl) obj3, (Function1) obj2, (Function3) obj5, function1, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i7 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineScope coroutineScope2 = (CoroutineScope) obj4;
                com.squareup.cash.composeUi.foundation.text.PressGestureScopeImpl pressGestureScopeImpl2 = (com.squareup.cash.composeUi.foundation.text.PressGestureScopeImpl) obj2;
                SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine6 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                Continuation continuation3 = null;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = pointerEventHandlerCoroutine6;
                    this.label = 1;
                    awaitFirstDown$default3 = TapGestureDetectorKt.awaitFirstDown$default(pointerEventHandlerCoroutine6, this, 3);
                    break;
                } else if (i8 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    awaitFirstDown$default3 = obj;
                } else if (i8 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    waitForUpOrCancellation2 = obj;
                    PointerInputChange pointerInputChange6 = (PointerInputChange) waitForUpOrCancellation2;
                    if (pointerInputChange6 == null) {
                        JobKt.launch$default(coroutineScope2, null, null, new DetectTapGesturesKt$detectTapGestures$2$1$3(pressGestureScopeImpl2, null, 0), 3);
                    } else {
                        pointerInputChange6.consume();
                        JobKt.launch$default(coroutineScope2, null, null, new DetectTapGesturesKt$detectTapGestures$2$1$3(pressGestureScopeImpl2, null, 1), 3);
                        RealClientSyncTransactor$$ExternalSyntheticLambda0 realClientSyncTransactor$$ExternalSyntheticLambda0 = (RealClientSyncTransactor$$ExternalSyntheticLambda0) obj5;
                        Ref$ObjectRef ref$ObjectRef = realClientSyncTransactor$$ExternalSyntheticLambda0.f$1;
                        Function1 function12 = realClientSyncTransactor$$ExternalSyntheticLambda0.f$0;
                        AnnotatedString.Range range2 = (AnnotatedString.Range) ref$ObjectRef.element;
                        if (range2 != null) {
                            function12.invoke(Integer.valueOf(range2.start));
                        }
                        ref$ObjectRef.element = null;
                    }
                    break;
                }
                PointerInputChange pointerInputChange7 = (PointerInputChange) awaitFirstDown$default3;
                BadgedBoxKt$$ExternalSyntheticLambda0 badgedBoxKt$$ExternalSyntheticLambda0 = (BadgedBoxKt$$ExternalSyntheticLambda0) this.L$1;
                long j3 = pointerInputChange7.position;
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) badgedBoxKt$$ExternalSyntheticLambda0.f$0;
                LinkTapDetectorState linkTapDetectorState = (LinkTapDetectorState) badgedBoxKt$$ExternalSyntheticLambda0.f$1;
                TextLayoutResult textLayoutResult = (TextLayoutResult) linkTapDetectorState.textLayoutResult$delegate.getValue();
                if (textLayoutResult != null) {
                    int m966getOffsetForPositionk4lQ0M = textLayoutResult.multiParagraph.m966getOffsetForPositionk4lQ0M(j3);
                    range = (AnnotatedString.Range) CollectionsKt.firstOrNull(((AnnotatedString) linkTapDetectorState.text$delegate.getValue()).getLinkAnnotations(m966getOffsetForPositionk4lQ0M, m966getOffsetForPositionk4lQ0M));
                } else {
                    range = null;
                }
                ref$ObjectRef2.element = range;
                if (range != null) {
                    pointerInputChange7.consume();
                    JobKt.launch$default(coroutineScope2, null, null, new CardModelView.AnonymousClass1.C00581(pressGestureScopeImpl2, continuation3, 26), 3);
                    JobKt.launch$default(coroutineScope2, null, null, new RealProfileManager$setPhoto$2((RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1) obj3, pressGestureScopeImpl2, pointerInputChange7, continuation3, 10), 3);
                    this.L$0 = null;
                    this.label = 2;
                    CachedPagingDataKt$cachedIn$5 cachedPagingDataKt$cachedIn$5 = TapGestureDetectorKt.NoPressGesture;
                    waitForUpOrCancellation2 = TapGestureDetectorKt.waitForUpOrCancellation(pointerEventHandlerCoroutine6, PointerEventPass.Main, this);
                    break;
                }
            case 5:
                SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine7 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = pointerEventHandlerCoroutine7;
                    this.label = 1;
                    awaitFirstDown$default4 = TapGestureDetectorKt.awaitFirstDown$default(pointerEventHandlerCoroutine7, this, 2);
                    break;
                } else if (i9 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    awaitFirstDown$default4 = obj;
                } else if (i9 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    pointerInputChange3 = (PointerInputChange) this.L$1;
                    SafeTrace.throwOnFailure(obj);
                    withTimeoutOrNull = obj;
                    if (((PointerInputChange) withTimeoutOrNull) != null) {
                        CardScene cardScene = (CardScene) obj5;
                        float intBitsToFloat = Float.intBitsToFloat((int) (pointerInputChange3.position >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (pointerInputChange3.position & BodyPartID.bodyIdMax));
                        long j4 = SuspendingPointerInputModifierNodeImpl.this.boundsSize;
                        float f = (int) (j4 >> 32);
                        float f2 = (int) (j4 & BodyPartID.bodyIdMax);
                        Entity cardEntity$views = cardScene.getCardEntity$views();
                        if (cardEntity$views != null && (pair = zzahe.touchToTextureUV(cardScene.camera, intBitsToFloat, intBitsToFloat2, f, f2, cardEntity$views)) != null) {
                            z = CardsKt.ICON_TEXTURE_BOUNDS.contains(((Number) pair.first).floatValue(), ((Number) pair.second).floatValue());
                        }
                        if (z) {
                            ((Function0) obj2).invoke();
                            JobKt.launch$default((CoroutineScope) obj4, null, CoroutineStart.UNDISPATCHED, new MoneyTabUIKt$MoneyTabLoaded$4$4$1$1((Animatable) obj3, continuation2, 11), 1);
                        }
                    }
                    break;
                }
                PointerInputChange pointerInputChange8 = (PointerInputChange) awaitFirstDown$default4;
                long longPressTimeoutMillis = pointerEventHandlerCoroutine7.getViewConfiguration().getLongPressTimeoutMillis();
                ToastKt$Toast$12$1$1.AnonymousClass1 anonymousClass1 = new ToastKt$Toast$12$1$1.AnonymousClass1(2, null, 3);
                this.L$0 = pointerEventHandlerCoroutine7;
                this.L$1 = pointerInputChange8;
                this.label = 2;
                withTimeoutOrNull = pointerEventHandlerCoroutine7.withTimeoutOrNull(longPressTimeoutMillis, anonymousClass1, this);
                if (withTimeoutOrNull != coroutineSingletons7) {
                    pointerInputChange3 = pointerInputChange8;
                    if (((PointerInputChange) withTimeoutOrNull) != null) {
                    }
                }
                break;
            default:
                MutableState mutableState2 = (MutableState) obj3;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj4;
                MutableState mutableState3 = (MutableState) this.L$1;
                SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine pointerEventHandlerCoroutine8 = (SuspendingPointerInputModifierNodeImpl.PointerEventHandlerCoroutine) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = pointerEventHandlerCoroutine8;
                    this.label = 1;
                    awaitFirstDown$default5 = TapGestureDetectorKt.awaitFirstDown$default(pointerEventHandlerCoroutine8, this, 2);
                    if (awaitFirstDown$default5 == coroutineSingletons8) {
                        coroutineSingletons = coroutineSingletons8;
                        break;
                    }
                } else if (i10 == 1) {
                    SafeTrace.throwOnFailure(obj);
                    awaitFirstDown$default5 = obj;
                } else if (i10 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    m210dragjO51t88 = obj;
                    mutableState = mutableState2;
                    if (((Boolean) m210dragjO51t88).booleanValue()) {
                        JobKt.launch$default(coroutineScope3, null, null, new TimerWorker$run$1((MutableSharedFlow) obj5, mutableState, continuation2, 7), 3);
                    }
                    break;
                }
                PointerInputChange pointerInputChange9 = (PointerInputChange) awaitFirstDown$default5;
                float[] fArr = Hero3DCardViewKt.X_AXIS;
                CardModelView cardModelView = (CardModelView) mutableState3.getValue();
                if (cardModelView != null && cardModelView.touchTextureIntersect(new PointF(Float.intBitsToFloat((int) (pointerInputChange9.position >> 32)), Float.intBitsToFloat((int) (pointerInputChange9.position & BodyPartID.bodyIdMax)))) != null) {
                    JobKt.launch$default(coroutineScope3, null, null, new WorkflowNode$tick$1$1(pointerInputChange9, mutableState3, continuation2, 17), 3);
                    Ref$LongRef ref$LongRef = new Ref$LongRef();
                    ref$LongRef.element = pointerInputChange9.position;
                    long j5 = pointerInputChange9.id;
                    coroutineSingletons = coroutineSingletons8;
                    SliderKt$$ExternalSyntheticLambda4 sliderKt$$ExternalSyntheticLambda4 = new SliderKt$$ExternalSyntheticLambda4(ref$LongRef, (CoroutineScope) obj4, (MutableState) this.L$1, (MutableSharedFlow) obj5, pointerEventHandlerCoroutine8, (MutableSharedFlow) obj2, mutableState2);
                    mutableState = mutableState2;
                    this.L$0 = null;
                    this.label = 2;
                    m210dragjO51t88 = DragGestureDetectorKt.m210dragjO51t88(pointerEventHandlerCoroutine8, j5, sliderKt$$ExternalSyntheticLambda4, this);
                    break;
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TapGestureDetectorKt$detectTapAndPress$2$1(Object obj, Function function, Function function2, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$$this$coroutineScope = obj;
        this.$onPress = function;
        this.$onTap = function2;
        this.$pressScope = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TapGestureDetectorKt$detectTapAndPress$2$1(Function function, Object obj, Function function2, Object obj2, Function function3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$1 = function;
        this.$$this$coroutineScope = obj;
        this.$onPress = function2;
        this.$onTap = obj2;
        this.$pressScope = function3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapAndPress$2$1(CardScene cardScene, Function0 function0, CoroutineScope coroutineScope, Animatable animatable, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 5;
        this.$onPress = cardScene;
        this.$onTap = function0;
        this.$$this$coroutineScope = coroutineScope;
        this.$pressScope = animatable;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TapGestureDetectorKt$detectTapAndPress$2$1(CoroutineScope coroutineScope, MutableState mutableState, MutableSharedFlow mutableSharedFlow, MutableSharedFlow mutableSharedFlow2, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 6;
        this.$$this$coroutineScope = coroutineScope;
        this.L$1 = mutableState;
        this.$onPress = mutableSharedFlow;
        this.$onTap = mutableSharedFlow2;
        this.$pressScope = mutableState2;
    }
}
