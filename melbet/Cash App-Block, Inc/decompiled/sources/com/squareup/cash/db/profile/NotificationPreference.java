package com.squareup.cash.db.profile;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.api.UiAlias;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NotificationPreference implements Alias {
    public final String canonical_text;
    public final boolean enabled;

    /* renamed from: type, reason: collision with root package name */
    public final UiAlias.Type f1120type;

    public NotificationPreference(UiAlias.Type type2, String str, boolean z) {
        str.getClass();
        type2.getClass();
        this.canonical_text = str;
        this.enabled = z;
        this.f1120type = type2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NotificationPreference)) {
            return false;
        }
        NotificationPreference notificationPreference = (NotificationPreference) obj;
        return Intrinsics.areEqual(this.canonical_text, notificationPreference.canonical_text) && this.enabled == notificationPreference.enabled && this.f1120type == notificationPreference.f1120type;
    }

    @Override // com.squareup.cash.db.profile.Alias
    public final String getCanonical_text() {
        return this.canonical_text;
    }

    @Override // com.squareup.cash.db.profile.Alias
    public final UiAlias.Type getType() {
        return this.f1120type;
    }

    public final int hashCode() {
        return this.f1120type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.canonical_text.hashCode() * 31, 31, this.enabled);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("NotificationPreference(canonical_text=", this.canonical_text, ", enabled=", ", type=", this.enabled);
        m1540m.append(this.f1120type);
        m1540m.append(")");
        return m1540m.toString();
    }
}
