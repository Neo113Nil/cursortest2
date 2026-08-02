package com.squareup.cash.instruments.viewmodels;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class InstrumentOptionViewModel {
    public final InstrumentAvatarViewModel avatar;
    public final boolean enabled;
    public final String pillText;
    public final String subtitle;
    public final SubtitleIcon subtitleIcon;
    public final String subtitleSuffix;
    public final String title;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SubtitleIcon {
        public static final /* synthetic */ SubtitleIcon[] $VALUES;
        public static final SubtitleIcon BANK;
        public static final SubtitleIcon CARD;

        static {
            SubtitleIcon subtitleIcon = new SubtitleIcon("CARD", 0);
            CARD = subtitleIcon;
            SubtitleIcon subtitleIcon2 = new SubtitleIcon("BANK", 1);
            BANK = subtitleIcon2;
            $VALUES = new SubtitleIcon[]{subtitleIcon, subtitleIcon2};
        }

        public static SubtitleIcon valueOf(String str) {
            return (SubtitleIcon) Enum.valueOf(SubtitleIcon.class, str);
        }

        public static SubtitleIcon[] values() {
            return (SubtitleIcon[]) $VALUES.clone();
        }
    }

    public InstrumentOptionViewModel(InstrumentAvatarViewModel instrumentAvatarViewModel, String str, SubtitleIcon subtitleIcon, String str2, String str3, String str4, boolean z) {
        str.getClass();
        this.avatar = instrumentAvatarViewModel;
        this.title = str;
        this.subtitleIcon = subtitleIcon;
        this.subtitle = str2;
        this.subtitleSuffix = str3;
        this.pillText = str4;
        this.enabled = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentOptionViewModel)) {
            return false;
        }
        InstrumentOptionViewModel instrumentOptionViewModel = (InstrumentOptionViewModel) obj;
        return this.avatar.equals(instrumentOptionViewModel.avatar) && Intrinsics.areEqual(this.title, instrumentOptionViewModel.title) && this.subtitleIcon == instrumentOptionViewModel.subtitleIcon && Intrinsics.areEqual(this.subtitle, instrumentOptionViewModel.subtitle) && Intrinsics.areEqual(this.subtitleSuffix, instrumentOptionViewModel.subtitleSuffix) && Intrinsics.areEqual(this.pillText, instrumentOptionViewModel.pillText) && this.enabled == instrumentOptionViewModel.enabled;
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.avatar.hashCode() * 31, 31, this.title);
        SubtitleIcon subtitleIcon = this.subtitleIcon;
        int hashCode = (m + (subtitleIcon == null ? 0 : subtitleIcon.hashCode())) * 31;
        String str = this.subtitle;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.subtitleSuffix;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.pillText;
        return Boolean.hashCode(this.enabled) + ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstrumentOptionViewModel(avatar=");
        sb.append(this.avatar);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", subtitleIcon=");
        sb.append(this.subtitleIcon);
        sb.append(", subtitle=");
        sb.append(this.subtitle);
        sb.append(", subtitleSuffix=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.subtitleSuffix, ", pillText=", this.pillText, ", enabled=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.enabled, ")");
    }
}
