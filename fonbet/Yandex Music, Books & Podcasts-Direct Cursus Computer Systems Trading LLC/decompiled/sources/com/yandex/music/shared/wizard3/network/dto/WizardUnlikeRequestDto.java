package com.yandex.music.shared.wizard3.network.dto;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.gson.annotations.SerializedName;
import defpackage.hrg;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/yandex/music/shared/wizard3/network/dto/WizardUnlikeRequestDto;", "", "", "selectedArtist", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getSelectedArtist", "()Ljava/lang/String;", "shared-wizard3"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final /* data */ class WizardUnlikeRequestDto {

    @SerializedName("selectedArtist")
    @NotNull
    private final String selectedArtist;

    public WizardUnlikeRequestDto(@NotNull String str) {
        str.getClass();
        this.selectedArtist = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WizardUnlikeRequestDto) && Intrinsics.d(this.selectedArtist, ((WizardUnlikeRequestDto) obj).selectedArtist);
    }

    public final int hashCode() {
        return this.selectedArtist.hashCode();
    }

    public final String toString() {
        return hrg.q("WizardUnlikeRequestDto(selectedArtist=", this.selectedArtist, ")");
    }
}
