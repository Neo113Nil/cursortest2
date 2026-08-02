package com.squareup.cash.arcade.components.timeline;

import androidx.compose.runtime.internal.ComposableLambdaImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class TimelineItem {
    public final Function3 accessory;
    public final Function3 body;
    public final Function0 onClick;
    public final State state;
    public final ComposableLambdaImpl title;
    public final Function2 value;
    public final Function2 valueDescriptor;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class State {
        public static final /* synthetic */ State[] $VALUES;
        public static final State Done;
        public static final State Incomplete;
        public static final State NotStarted;
        public static final State Pending;
        public static final State Skipped;

        static {
            State state = new State("NotStarted", 0);
            NotStarted = state;
            State state2 = new State("Incomplete", 1);
            Incomplete = state2;
            State state3 = new State("Pending", 2);
            Pending = state3;
            State state4 = new State("Skipped", 3);
            Skipped = state4;
            State state5 = new State("Done", 4);
            Done = state5;
            $VALUES = new State[]{state, state2, state3, state4, state5};
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public TimelineItem(State state, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, ComposableLambdaImpl composableLambdaImpl3, Function2 function2, Function0 function0, Function3 function3) {
        this.state = state;
        this.title = composableLambdaImpl;
        this.value = composableLambdaImpl2;
        this.body = composableLambdaImpl3;
        this.valueDescriptor = function2;
        this.onClick = function0;
        this.accessory = function3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimelineItem)) {
            return false;
        }
        TimelineItem timelineItem = (TimelineItem) obj;
        return this.state == timelineItem.state && Intrinsics.areEqual(this.title, timelineItem.title) && Intrinsics.areEqual(this.value, timelineItem.value) && Intrinsics.areEqual(this.body, timelineItem.body) && Intrinsics.areEqual(this.valueDescriptor, timelineItem.valueDescriptor) && Intrinsics.areEqual(this.onClick, timelineItem.onClick) && Intrinsics.areEqual(this.accessory, timelineItem.accessory);
    }

    public final int hashCode() {
        int hashCode = (this.title.hashCode() + (this.state.hashCode() * 31)) * 31;
        Function2 function2 = this.value;
        int hashCode2 = (hashCode + (function2 == null ? 0 : function2.hashCode())) * 31;
        Function3 function3 = this.body;
        int hashCode3 = (hashCode2 + (function3 == null ? 0 : function3.hashCode())) * 31;
        Function2 function22 = this.valueDescriptor;
        int hashCode4 = (hashCode3 + (function22 == null ? 0 : function22.hashCode())) * 31;
        Function0 function0 = this.onClick;
        int hashCode5 = (hashCode4 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function3 function32 = this.accessory;
        return hashCode5 + (function32 != null ? function32.hashCode() : 0);
    }

    public final String toString() {
        return "TimelineItem(state=" + this.state + ", title=" + this.title + ", value=" + this.value + ", body=" + this.body + ", valueDescriptor=" + this.valueDescriptor + ", onClick=" + this.onClick + ", accessory=" + this.accessory + ")";
    }

    public /* synthetic */ TimelineItem(State state, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, ComposableLambdaImpl composableLambdaImpl3, ComposableLambdaImpl composableLambdaImpl4, Function0 function0, int i) {
        this(state, composableLambdaImpl, composableLambdaImpl2, composableLambdaImpl3, (i & 16) != 0 ? null : composableLambdaImpl4, function0, (Function3) null);
    }
}
