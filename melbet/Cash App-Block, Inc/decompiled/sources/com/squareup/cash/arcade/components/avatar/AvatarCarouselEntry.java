package com.squareup.cash.arcade.components.avatar;

import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AvatarCarouselEntry {
    public final AvatarEntry avatarEntry;
    public final String key;
    public final String name;
    public final String onClickLabel;

    public AvatarCarouselEntry(String str, String str2, AvatarEntry avatarEntry, String str3, int i) {
        str3 = (i & 16) != 0 ? null : str3;
        str.getClass();
        str2.getClass();
        this.name = str;
        this.key = str2;
        this.avatarEntry = avatarEntry;
        this.onClickLabel = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarCarouselEntry)) {
            return false;
        }
        AvatarCarouselEntry avatarCarouselEntry = (AvatarCarouselEntry) obj;
        return Intrinsics.areEqual(this.name, avatarCarouselEntry.name) && Intrinsics.areEqual(this.key, avatarCarouselEntry.key) && this.avatarEntry.equals(avatarCarouselEntry.avatarEntry) && Intrinsics.areEqual(this.onClickLabel, avatarCarouselEntry.onClickLabel);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((this.avatarEntry.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.name.hashCode() * 31, 31, this.key)) * 31, 31, true);
        String str = this.onClickLabel;
        return m + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AvatarCarouselEntry(name=", this.name, ", key=", this.key, ", avatarEntry=");
        m.append(this.avatarEntry);
        m.append(", enabled=true, onClickLabel=");
        m.append(this.onClickLabel);
        m.append(")");
        return m.toString();
    }
}
