package com.squareup.cash.data.contacts;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ContactDetailsSyncState$PrimaryKey {
    public final String key;

    public /* synthetic */ ContactDetailsSyncState$PrimaryKey(String str) {
        this.key = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ContactDetailsSyncState$PrimaryKey m3514boximpl(String str) {
        return new ContactDetailsSyncState$PrimaryKey(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static void m3515constructorimpl(String str) {
        str.getClass();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ContactDetailsSyncState$PrimaryKey) {
            return Intrinsics.areEqual(this.key, ((ContactDetailsSyncState$PrimaryKey) obj).key);
        }
        return false;
    }

    public final int hashCode() {
        return this.key.hashCode();
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("PrimaryKey(key=", this.key, ")");
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m3516unboximpl() {
        return this.key;
    }
}
