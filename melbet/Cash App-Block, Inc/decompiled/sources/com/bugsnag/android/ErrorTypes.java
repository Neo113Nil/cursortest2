package com.bugsnag.android;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes.dex */
public final class ErrorTypes {
    public final boolean anrs;
    public final boolean ndkCrashes;
    public final boolean unhandledExceptions;
    public final boolean unhandledRejections;

    public ErrorTypes(boolean z, boolean z2, boolean z3, boolean z4) {
        this.anrs = z;
        this.ndkCrashes = z2;
        this.unhandledExceptions = z3;
        this.unhandledRejections = z4;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ErrorTypes)) {
            return false;
        }
        ErrorTypes errorTypes = (ErrorTypes) obj;
        return this.anrs == errorTypes.anrs && this.ndkCrashes == errorTypes.ndkCrashes && this.unhandledExceptions == errorTypes.unhandledExceptions && this.unhandledRejections == errorTypes.unhandledRejections;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.unhandledRejections) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(Boolean.hashCode(this.anrs) * 31, 31, this.ndkCrashes), 31, this.unhandledExceptions);
    }
}
