package com.squareup.cash.pools.views.animation;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.enums.EnumEntriesList;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.ReadonlyStateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class GoalMetTimeline {
    public final StateFlowImpl mutableSteps;
    public final ReadonlyStateFlow steps;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes7.dex */
    public final class Step {
        public static final /* synthetic */ EnumEntriesList $ENTRIES;
        public static final /* synthetic */ Step[] $VALUES;
        public static final Step COLLAPSE_DETAILS;
        public static final Step EXPAND_DETAILS;
        public static final Step HIDE_HERO;
        public static final Step IDLE;
        public static final Step SHOW_HERO;
        public final long duration;

        static {
            Step step = new Step(0L, "IDLE", 0);
            IDLE = step;
            Step step2 = new Step(283L, "COLLAPSE_DETAILS", 1);
            COLLAPSE_DETAILS = step2;
            Step step3 = new Step(2500L, "SHOW_HERO", 2);
            SHOW_HERO = step3;
            Step step4 = new Step(433L, "HIDE_HERO", 3);
            HIDE_HERO = step4;
            Step step5 = new Step(533L, "EXPAND_DETAILS", 4);
            EXPAND_DETAILS = step5;
            Step[] stepArr = {step, step2, step3, step4, step5};
            $VALUES = stepArr;
            $ENTRIES = new EnumEntriesList(stepArr);
        }

        public Step(long j, String str, int i) {
            this.duration = j;
        }

        public static Step valueOf(String str) {
            return (Step) Enum.valueOf(Step.class, str);
        }

        public static Step[] values() {
            return (Step[]) $VALUES.clone();
        }
    }

    public GoalMetTimeline(Step step) {
        step.getClass();
        StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(step);
        this.mutableSteps = MutableStateFlow;
        this.steps = FlowKt.asStateFlow(MutableStateFlow);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        if (kotlin.Unit.INSTANCE != r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r6, r0) == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(r9, r0) == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0088 -> B:12:0x008b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object play(long j, ContinuationImpl continuationImpl) {
        GoalMetTimeline$play$1 goalMetTimeline$play$1;
        int i;
        Step step;
        if (continuationImpl instanceof GoalMetTimeline$play$1) {
            goalMetTimeline$play$1 = (GoalMetTimeline$play$1) continuationImpl;
            int i2 = goalMetTimeline$play$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                goalMetTimeline$play$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = goalMetTimeline$play$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = goalMetTimeline$play$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    goalMetTimeline$play$1.J$0 = j;
                    goalMetTimeline$play$1.label = 1;
                } else if (i == 1) {
                    j = goalMetTimeline$play$1.J$0;
                    SafeTrace.throwOnFailure(obj);
                } else if (i == 2) {
                    j = goalMetTimeline$play$1.J$0;
                    step = goalMetTimeline$play$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    long j2 = step.duration;
                    goalMetTimeline$play$1.L$0 = step;
                    goalMetTimeline$play$1.J$0 = j;
                    goalMetTimeline$play$1.label = 3;
                } else {
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = goalMetTimeline$play$1.J$0;
                    step = goalMetTimeline$play$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    if (step == Step.IDLE) {
                        return Unit.INSTANCE;
                    }
                }
                StateFlowImpl stateFlowImpl = this.mutableSteps;
                Step step2 = (Step) stateFlowImpl.getValue();
                EnumEntriesList enumEntriesList = Step.$ENTRIES;
                step = (Step) enumEntriesList.get((step2.ordinal() + 1) % enumEntriesList.getSize());
                goalMetTimeline$play$1.L$0 = step;
                goalMetTimeline$play$1.J$0 = j;
                goalMetTimeline$play$1.label = 2;
                stateFlowImpl.setValue(step);
            }
        }
        goalMetTimeline$play$1 = new GoalMetTimeline$play$1(this, continuationImpl);
        Object obj2 = goalMetTimeline$play$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = goalMetTimeline$play$1.label;
        if (i != 0) {
        }
        StateFlowImpl stateFlowImpl2 = this.mutableSteps;
        Step step22 = (Step) stateFlowImpl2.getValue();
        EnumEntriesList enumEntriesList2 = Step.$ENTRIES;
        step = (Step) enumEntriesList2.get((step22.ordinal() + 1) % enumEntriesList2.getSize());
        goalMetTimeline$play$1.L$0 = step;
        goalMetTimeline$play$1.J$0 = j;
        goalMetTimeline$play$1.label = 2;
        stateFlowImpl2.setValue(step);
    }
}
