package com.squareup.cash.data.contacts;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class ContactDetailsSyncState$LatestLookupKey {
    public final String key;

    /* renamed from: constructor-impl, reason: not valid java name */
    public static void m3512constructorimpl(String str) {
        str.getClass();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m3513toStringimpl(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LatestLookupKey(key=", str, ")");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ContactDetailsSyncState$LatestLookupKey) {
            return Intrinsics.areEqual(this.key, ((ContactDetailsSyncState$LatestLookupKey) obj).key);
        }
        return false;
    }

    public final int hashCode() {
        return this.key.hashCode();
    }

    public final String toString() {
        return m3513toStringimpl(this.key);
    }
}
