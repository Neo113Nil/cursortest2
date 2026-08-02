package com.squareup.cash.profile.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class ContactMethodType {
    public final AliasItem aliasType;
    public final List aliases;
    public final boolean hasNoEnabledAlias;

    public ContactMethodType(AliasItem aliasItem, List list, boolean z) {
        aliasItem.getClass();
        list.getClass();
        this.aliasType = aliasItem;
        this.aliases = list;
        this.hasNoEnabledAlias = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContactMethodType)) {
            return false;
        }
        ContactMethodType contactMethodType = (ContactMethodType) obj;
        return this.aliasType == contactMethodType.aliasType && Intrinsics.areEqual(this.aliases, contactMethodType.aliases) && this.hasNoEnabledAlias == contactMethodType.hasNoEnabledAlias;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.hasNoEnabledAlias) + Recorder$$ExternalSyntheticOutline2.m(this.aliasType.hashCode() * 31, 31, this.aliases);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContactMethodType(aliasType=");
        sb.append(this.aliasType);
        sb.append(", aliases=");
        sb.append(this.aliases);
        sb.append(", hasNoEnabledAlias=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.hasNoEnabledAlias, ")");
    }
}
