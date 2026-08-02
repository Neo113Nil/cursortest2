package com.squareup.cash.payments.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.squareup.protos.cash.ui.Image;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class NearbyPaymentsInfoViewModel {
    public final List articles;
    public final String body;
    public final Image heroImage;
    public final List infoItems;
    public final String title;

    public NearbyPaymentsInfoViewModel(String str, String str2, List list, List list2, Image image) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        this.title = str;
        this.body = str2;
        this.infoItems = list;
        this.articles = list2;
        this.heroImage = image;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NearbyPaymentsInfoViewModel)) {
            return false;
        }
        NearbyPaymentsInfoViewModel nearbyPaymentsInfoViewModel = (NearbyPaymentsInfoViewModel) obj;
        return Intrinsics.areEqual(this.title, nearbyPaymentsInfoViewModel.title) && Intrinsics.areEqual(this.body, nearbyPaymentsInfoViewModel.body) && Intrinsics.areEqual(this.infoItems, nearbyPaymentsInfoViewModel.infoItems) && Intrinsics.areEqual(this.articles, nearbyPaymentsInfoViewModel.articles) && this.heroImage.equals(nearbyPaymentsInfoViewModel.heroImage);
    }

    public final int hashCode() {
        return this.heroImage.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.title.hashCode() * 31, 31, this.body), 31, this.infoItems), 31, this.articles);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("NearbyPaymentsInfoViewModel(title=", this.title, ", body=", this.body, ", infoItems=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.infoItems, ", articles=", this.articles, ", heroImage=");
        m.append(this.heroImage);
        m.append(")");
        return m.toString();
    }
}
