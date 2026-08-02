package com.squareup.cash.pools.screens;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.cdf.asset.AssetPoolAddMemberStart;
import com.squareup.cash.pdf.screen.PdfScreen;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class PoolInvitePeopleListScreen implements Screen {
    public static final Parcelable.Creator<PoolInvitePeopleListScreen> CREATOR = new PdfScreen.Creator(7);
    public final List alreadyAddedCustomerTokens;
    public final String flowToken;
    public final AskedQuestion question;
    public final String shareUrl;
    public final AssetPoolAddMemberStart.AddMemberSource source;
    public final String token;

    public PoolInvitePeopleListScreen(String str, ArrayList arrayList, String str2, AskedQuestion askedQuestion, AssetPoolAddMemberStart.AddMemberSource addMemberSource, String str3) {
        str.getClass();
        arrayList.getClass();
        addMemberSource.getClass();
        str3.getClass();
        this.token = str;
        this.alreadyAddedCustomerTokens = arrayList;
        this.shareUrl = str2;
        this.question = askedQuestion;
        this.source = addMemberSource;
        this.flowToken = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PoolInvitePeopleListScreen)) {
            return false;
        }
        PoolInvitePeopleListScreen poolInvitePeopleListScreen = (PoolInvitePeopleListScreen) obj;
        return Intrinsics.areEqual(this.token, poolInvitePeopleListScreen.token) && Intrinsics.areEqual(this.alreadyAddedCustomerTokens, poolInvitePeopleListScreen.alreadyAddedCustomerTokens) && Intrinsics.areEqual(this.shareUrl, poolInvitePeopleListScreen.shareUrl) && Intrinsics.areEqual(this.question, poolInvitePeopleListScreen.question) && this.source == poolInvitePeopleListScreen.source && Intrinsics.areEqual(this.flowToken, poolInvitePeopleListScreen.flowToken);
    }

    public final int hashCode() {
        int m = Recorder$$ExternalSyntheticOutline2.m(this.token.hashCode() * 31, 31, this.alreadyAddedCustomerTokens);
        String str = this.shareUrl;
        int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
        AskedQuestion askedQuestion = this.question;
        return this.flowToken.hashCode() + ((this.source.hashCode() + ((hashCode + (askedQuestion != null ? askedQuestion.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("PoolInvitePeopleListScreen(token=", this.token, ", alreadyAddedCustomerTokens=", ", shareUrl=", this.alreadyAddedCustomerTokens);
        m.append(this.shareUrl);
        m.append(", question=");
        m.append(this.question);
        m.append(", source=");
        m.append(this.source);
        m.append(", flowToken=");
        m.append(this.flowToken);
        m.append(")");
        return m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.token);
        parcel.writeStringList(this.alreadyAddedCustomerTokens);
        parcel.writeString(this.shareUrl);
        parcel.writeParcelable(this.question, i);
        parcel.writeString(this.source.name());
        parcel.writeString(this.flowToken);
    }
}
