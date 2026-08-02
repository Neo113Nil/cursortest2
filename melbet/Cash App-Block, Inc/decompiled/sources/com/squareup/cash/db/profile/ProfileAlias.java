package com.squareup.cash.db.profile;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.franklin.api.UiAlias;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class ProfileAlias implements Alias {
    public final String canonical_text;

    /* renamed from: type, reason: collision with root package name */
    public final UiAlias.Type f1121type;
    public final boolean verified;

    public ProfileAlias(UiAlias.Type type2, String str, boolean z) {
        str.getClass();
        type2.getClass();
        this.canonical_text = str;
        this.verified = z;
        this.f1121type = type2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProfileAlias)) {
            return false;
        }
        ProfileAlias profileAlias = (ProfileAlias) obj;
        return Intrinsics.areEqual(this.canonical_text, profileAlias.canonical_text) && this.verified == profileAlias.verified && this.f1121type == profileAlias.f1121type;
    }

    @Override // com.squareup.cash.db.profile.Alias
    public final String getCanonical_text() {
        return this.canonical_text;
    }

    @Override // com.squareup.cash.db.profile.Alias
    public final UiAlias.Type getType() {
        return this.f1121type;
    }

    public final int hashCode() {
        return this.f1121type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.canonical_text.hashCode() * 31, 31, this.verified);
    }

    public final String toString() {
        StringBuilder m1540m = Request$Priority$EnumUnboxingLocalUtility.m1540m("ProfileAlias(canonical_text=", this.canonical_text, ", verified=", ", type=", this.verified);
        m1540m.append(this.f1121type);
        m1540m.append(")");
        return m1540m.toString();
    }
}
