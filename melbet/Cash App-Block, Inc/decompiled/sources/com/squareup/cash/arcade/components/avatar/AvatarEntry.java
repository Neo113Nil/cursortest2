package com.squareup.cash.arcade.components.avatar;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.graphics.Color;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.ULong;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class AvatarEntry {
    public final AvatarImage avatarImage;
    public final long backgroundColor;
    public final AvatarOverlay badge;
    public final Color borderColor;
    public final String contentDescription;
    public final Integer counterValue;
    public final String monogram;
    public final Integer overflowCount;

    public /* synthetic */ AvatarEntry(String str, long j, Integer num, AvatarImage avatarImage, String str2, AvatarOverlay avatarOverlay, Color color, Integer num2, int i) {
        this(str, j, (i & 4) != 0 ? null : num, (i & 8) != 0 ? null : avatarImage, str2, (i & 32) != 0 ? null : avatarOverlay, (i & 64) != 0 ? null : color, (i & 128) != 0 ? null : num2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v2, types: [com.squareup.cash.arcade.components.avatar.AvatarOverlay] */
    /* renamed from: copy-DuSw1wk$default, reason: not valid java name */
    public static AvatarEntry m3382copyDuSw1wk$default(AvatarEntry avatarEntry, long j, AvatarImage avatarImage, AvatarOverlay.LocalIcon localIcon, int i) {
        String str = avatarEntry.monogram;
        if ((i & 2) != 0) {
            j = avatarEntry.backgroundColor;
        }
        long j2 = j;
        Integer num = avatarEntry.counterValue;
        if ((i & 8) != 0) {
            avatarImage = avatarEntry.avatarImage;
        }
        AvatarImage avatarImage2 = avatarImage;
        String str2 = (i & 16) != 0 ? avatarEntry.contentDescription : null;
        AvatarOverlay.LocalIcon localIcon2 = localIcon;
        if ((i & 32) != 0) {
            localIcon2 = avatarEntry.badge;
        }
        Color color = avatarEntry.borderColor;
        Integer num2 = avatarEntry.overflowCount;
        str.getClass();
        return new AvatarEntry(str, j2, num, avatarImage2, str2, localIcon2, color, num2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvatarEntry)) {
            return false;
        }
        AvatarEntry avatarEntry = (AvatarEntry) obj;
        return Intrinsics.areEqual(this.monogram, avatarEntry.monogram) && Color.m676equalsimpl0(this.backgroundColor, avatarEntry.backgroundColor) && Intrinsics.areEqual(this.counterValue, avatarEntry.counterValue) && Intrinsics.areEqual(this.avatarImage, avatarEntry.avatarImage) && Intrinsics.areEqual(this.contentDescription, avatarEntry.contentDescription) && Intrinsics.areEqual(this.badge, avatarEntry.badge) && Intrinsics.areEqual(this.borderColor, avatarEntry.borderColor) && Intrinsics.areEqual(this.overflowCount, avatarEntry.overflowCount);
    }

    public final int hashCode() {
        int hashCode = this.monogram.hashCode() * 31;
        int i = Color.$r8$clinit;
        ULong.Companion companion = ULong.Companion;
        int m = Recorder$$ExternalSyntheticOutline2.m(hashCode, 31, this.backgroundColor);
        Integer num = this.counterValue;
        int hashCode2 = (m + (num == null ? 0 : num.hashCode())) * 31;
        AvatarImage avatarImage = this.avatarImage;
        int hashCode3 = (hashCode2 + (avatarImage == null ? 0 : avatarImage.hashCode())) * 31;
        String str = this.contentDescription;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        AvatarOverlay avatarOverlay = this.badge;
        int hashCode5 = (hashCode4 + (avatarOverlay == null ? 0 : avatarOverlay.hashCode())) * 31;
        Color color = this.borderColor;
        int hashCode6 = (hashCode5 + (color == null ? 0 : Long.hashCode(color.value))) * 31;
        Integer num2 = this.overflowCount;
        return hashCode6 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("AvatarEntry(monogram=", this.monogram, ", backgroundColor=", Color.m682toStringimpl(this.backgroundColor), ", counterValue=");
        m.append(this.counterValue);
        m.append(", avatarImage=");
        m.append(this.avatarImage);
        m.append(", contentDescription=");
        m.append(this.contentDescription);
        m.append(", badge=");
        m.append(this.badge);
        m.append(", borderColor=");
        m.append(this.borderColor);
        m.append(", overflowCount=");
        m.append(this.overflowCount);
        m.append(")");
        return m.toString();
    }

    public AvatarEntry(String str, long j, Integer num, AvatarImage avatarImage, String str2, AvatarOverlay avatarOverlay, Color color, Integer num2) {
        str.getClass();
        this.monogram = str;
        this.backgroundColor = j;
        this.counterValue = num;
        this.avatarImage = avatarImage;
        this.contentDescription = str2;
        this.badge = avatarOverlay;
        this.borderColor = color;
        this.overflowCount = num2;
    }
}
