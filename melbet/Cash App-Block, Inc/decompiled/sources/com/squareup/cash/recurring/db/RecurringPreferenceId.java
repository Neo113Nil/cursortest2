package com.squareup.cash.recurring.db;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class RecurringPreferenceId {
    public final String entityId;

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m3730equalsimpl0(String str, String str2) {
        return Intrinsics.areEqual(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m3731hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3732toStringimpl(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("RecurringPreferenceId(entityId=", str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof RecurringPreferenceId) {
            return Intrinsics.areEqual(this.entityId, ((RecurringPreferenceId) obj).entityId);
        }
        return false;
    }

    public final int hashCode() {
        return this.entityId.hashCode();
    }

    public final String toString() {
        return m3732toStringimpl(this.entityId);
    }
}
