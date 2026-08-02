package com.datadog.android.core.feature.event;

import bo.app.re$$ExternalSyntheticOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ThreadDump {
    public final boolean crashed;
    public final String name;
    public final String stack;
    public final String state;

    public ThreadDump(String str, String str2, String str3, boolean z) {
        str.getClass();
        str3.getClass();
        this.name = str;
        this.state = str2;
        this.stack = str3;
        this.crashed = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ThreadDump)) {
            return false;
        }
        ThreadDump threadDump = (ThreadDump) obj;
        return Intrinsics.areEqual(this.name, threadDump.name) && this.state.equals(threadDump.state) && Intrinsics.areEqual(this.stack, threadDump.stack) && this.crashed == threadDump.crashed;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.crashed) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.state), 31, this.stack);
    }

    public final String toString() {
        return re$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("ThreadDump(name=", this.name, ", state=", this.state, ", stack="), this.stack, ", crashed=", this.crashed, ")");
    }
}
