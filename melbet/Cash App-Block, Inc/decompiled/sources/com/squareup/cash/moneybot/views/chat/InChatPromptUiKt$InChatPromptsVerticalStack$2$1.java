package com.squareup.cash.moneybot.views.chat;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.State;
import androidx.navigation.compose.NavHostKt$NavHost$29$1$1$1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public final class InChatPromptUiKt$InChatPromptsVerticalStack$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ State $allPromptsMeasured$delegate;
    public final /* synthetic */ boolean $animationReady;
    public final /* synthetic */ boolean $animationsEnabled;
    public final /* synthetic */ MutableState $loadInAnimationFinished$delegate;
    public final /* synthetic */ Map $promptHeights;
    public final /* synthetic */ List $stackPrompts;
    public final /* synthetic */ Animatable $stackShift;
    public final /* synthetic */ SpringSpec $stackShiftAnimationSpec;
    public final /* synthetic */ ParcelableSnapshotMutableIntState $visiblePromptCount$delegate;
    public int I$0;
    public int I$1;
    public int I$2;
    public /* synthetic */ Object L$0;
    public Map L$1;
    public List L$2;
    public ParcelableSnapshotMutableIntState L$3;
    public Animatable L$4;
    public SpringSpec L$5;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InChatPromptUiKt$InChatPromptsVerticalStack$2$1(boolean z, List list, Animatable animatable, boolean z2, Map map, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, MutableState mutableState, State state, SpringSpec springSpec, Continuation continuation) {
        super(2, continuation);
        this.$animationsEnabled = z;
        this.$stackPrompts = list;
        this.$stackShift = animatable;
        this.$animationReady = z2;
        this.$promptHeights = map;
        this.$visiblePromptCount$delegate = parcelableSnapshotMutableIntState;
        this.$loadInAnimationFinished$delegate = mutableState;
        this.$allPromptsMeasured$delegate = state;
        this.$stackShiftAnimationSpec = springSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        InChatPromptUiKt$InChatPromptsVerticalStack$2$1 inChatPromptUiKt$InChatPromptsVerticalStack$2$1 = new InChatPromptUiKt$InChatPromptsVerticalStack$2$1(this.$animationsEnabled, this.$stackPrompts, this.$stackShift, this.$animationReady, this.$promptHeights, this.$visiblePromptCount$delegate, this.$loadInAnimationFinished$delegate, this.$allPromptsMeasured$delegate, this.$stackShiftAnimationSpec, continuation);
        inChatPromptUiKt$InChatPromptsVerticalStack$2$1.L$0 = obj;
        return inChatPromptUiKt$InChatPromptsVerticalStack$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((InChatPromptUiKt$InChatPromptsVerticalStack$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x014d, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(750, r22) == r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x007d, code lost:
    
        if (r12.snapTo(r1, r22) == r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c1, code lost:
    
        if (r12.snapTo(r5, r22) == r2) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0165, code lost:
    
        if (r12.snapTo(r1, r22) == r2) goto L55;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x012d  */
    /* JADX WARN: Type inference failed for: r11v3, types: [androidx.compose.animation.core.Animatable, androidx.compose.animation.core.SpringSpec, androidx.compose.runtime.ParcelableSnapshotMutableIntState, java.lang.Object, java.util.List, java.util.Map] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x00f5 -> B:15:0x00fa). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x0106 -> B:16:0x0103). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        SpringSpec springSpec;
        int i;
        int i2;
        SpringSpec springSpec2;
        int i3;
        List list;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState;
        SpringSpec springSpec3;
        Map map;
        int i4;
        Object obj2;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i5 = this.label;
        Map map2 = this.$promptHeights;
        MutableState mutableState = this.$loadInAnimationFinished$delegate;
        ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState2 = this.$visiblePromptCount$delegate;
        int i6 = 0;
        Animatable animatable = this.$stackShift;
        List list2 = this.$stackPrompts;
        int i7 = 1;
        Object obj3 = null;
        if (i5 == 0) {
            SafeTrace.throwOnFailure(obj);
            if (this.$animationsEnabled) {
                mutableState.setValue(Boolean.FALSE);
                parcelableSnapshotMutableIntState2.setIntValue(0);
                if (this.$animationReady && !list2.isEmpty() && ((Boolean) this.$allPromptsMeasured$delegate.getValue()).booleanValue()) {
                    Float f = new Float(ViewfinderDefaults.access$stackShiftPx(1, map2, list2.size()));
                    this.L$0 = coroutineScope;
                    this.label = 3;
                } else {
                    Float f2 = new Float(RecyclerView.DECELERATION_RATE);
                    this.L$0 = null;
                    this.label = 2;
                }
            } else {
                parcelableSnapshotMutableIntState2.setIntValue(list2.size());
                Float f3 = new Float(RecyclerView.DECELERATION_RATE);
                this.L$0 = null;
                this.label = 1;
            }
            return coroutineSingletons;
        }
        if (i5 == 1) {
            SafeTrace.throwOnFailure(obj);
            mutableState.setValue(Boolean.TRUE);
            return Unit.INSTANCE;
        }
        if (i5 == 2) {
            SafeTrace.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        if (i5 == 3) {
            SafeTrace.throwOnFailure(obj);
            int size = list2.size();
            springSpec = this.$stackShiftAnimationSpec;
            i = size;
        } else {
            if (i5 != 4) {
                if (i5 != 5) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                mutableState.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            }
            int i8 = this.I$2;
            i4 = this.I$1;
            i = this.I$0;
            springSpec3 = this.L$5;
            Animatable animatable2 = this.L$4;
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState3 = this.L$3;
            List list3 = this.L$2;
            map = this.L$1;
            SafeTrace.throwOnFailure(obj);
            i6 = i8;
            i2 = 1;
            list = list3;
            parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState3;
            animatable = animatable2;
            Map map3 = map;
            i3 = i4;
            map2 = map3;
            springSpec2 = springSpec3;
            parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState;
            list2 = list;
            Animatable animatable3 = animatable;
            parcelableSnapshotMutableIntState2.setIntValue(i6 + 1);
            if (i6 > 0) {
                obj2 = null;
                JobKt.launch$default(coroutineScope, null, null, new NavHostKt$NavHost$29$1$1$1(animatable3, ViewfinderDefaults.access$stackShiftPx(parcelableSnapshotMutableIntState2.getIntValue(), map2, list2.size()), springSpec2, null, 1), 3);
            } else {
                obj2 = null;
            }
            i7 = i2;
            obj3 = obj2;
            animatable = animatable3;
            i6 = i3 + i2;
            springSpec = springSpec2;
        }
        if (i6 >= i) {
            ?? r11 = obj3;
            this.L$0 = r11;
            this.L$1 = r11;
            this.L$2 = r11;
            this.L$3 = r11;
            this.L$4 = r11;
            this.L$5 = r11;
            this.label = 5;
        } else if (i6 > 0) {
            this.L$0 = coroutineScope;
            this.L$1 = map2;
            this.L$2 = list2;
            this.L$3 = parcelableSnapshotMutableIntState2;
            this.L$4 = animatable;
            this.L$5 = springSpec;
            this.I$0 = i;
            this.I$1 = i6;
            this.I$2 = i6;
            this.label = 4;
            i2 = i7;
            if (JobKt.delay(240L, this) != coroutineSingletons) {
                list = list2;
                parcelableSnapshotMutableIntState = parcelableSnapshotMutableIntState2;
                springSpec3 = springSpec;
                map = map2;
                i4 = i6;
                Map map32 = map;
                i3 = i4;
                map2 = map32;
                springSpec2 = springSpec3;
                parcelableSnapshotMutableIntState2 = parcelableSnapshotMutableIntState;
                list2 = list;
                Animatable animatable32 = animatable;
                parcelableSnapshotMutableIntState2.setIntValue(i6 + 1);
                if (i6 > 0) {
                }
                i7 = i2;
                obj3 = obj2;
                animatable = animatable32;
                i6 = i3 + i2;
                springSpec = springSpec2;
                if (i6 >= i) {
                }
            }
        } else {
            i2 = i7;
            springSpec2 = springSpec;
            i3 = i6;
            Animatable animatable322 = animatable;
            parcelableSnapshotMutableIntState2.setIntValue(i6 + 1);
            if (i6 > 0) {
            }
            i7 = i2;
            obj3 = obj2;
            animatable = animatable322;
            i6 = i3 + i2;
            springSpec = springSpec2;
            if (i6 >= i) {
            }
        }
        return coroutineSingletons;
    }
}
