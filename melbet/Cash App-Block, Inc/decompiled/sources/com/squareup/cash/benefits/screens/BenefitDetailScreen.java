package com.squareup.cash.benefits.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.protos.franklin.ui.UiAvatar;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class BenefitDetailScreen implements BenefitsScreen {
    public static final Parcelable.Creator<BenefitDetailScreen> CREATOR = new SheetAppMessage.Creator(22);
    public final UiAvatar avatar;
    public final List content;
    public final List disclaimers;
    public final String title;

    public BenefitDetailScreen(UiAvatar uiAvatar, String str, List list, List list2) {
        uiAvatar.getClass();
        str.getClass();
        list.getClass();
        list2.getClass();
        this.avatar = uiAvatar;
        this.title = str;
        this.content = list;
        this.disclaimers = list2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BenefitDetailScreen)) {
            return false;
        }
        BenefitDetailScreen benefitDetailScreen = (BenefitDetailScreen) obj;
        return Intrinsics.areEqual(this.avatar, benefitDetailScreen.avatar) && Intrinsics.areEqual(this.title, benefitDetailScreen.title) && Intrinsics.areEqual(this.content, benefitDetailScreen.content) && Intrinsics.areEqual(this.disclaimers, benefitDetailScreen.disclaimers);
    }

    public final int hashCode() {
        return this.disclaimers.hashCode() + Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.avatar.hashCode() * 31, 31, this.title), 31, this.content);
    }

    public final String toString() {
        return "BenefitDetailScreen(avatar=" + this.avatar + ", title=" + this.title + ", content=" + this.content + ", disclaimers=" + this.disclaimers + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.avatar, i);
        parcel.writeString(this.title);
        parcel.writeStringList(this.content);
        parcel.writeStringList(this.disclaimers);
    }
}
