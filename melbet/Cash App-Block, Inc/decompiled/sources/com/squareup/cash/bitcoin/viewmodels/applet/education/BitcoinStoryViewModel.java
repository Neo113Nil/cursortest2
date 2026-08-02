package com.squareup.cash.bitcoin.viewmodels.applet.education;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class BitcoinStoryViewModel {
    public final String coverImageUrl;
    public final int primaryColor;
    public final List sceneBackgroundColors;
    public final String title;
    public final String url;

    public BitcoinStoryViewModel(int i, String str, String str2, String str3, List list) {
        Request$Priority$EnumUnboxingLocalUtility.m(str, str2, list);
        this.url = str;
        this.title = str2;
        this.coverImageUrl = str3;
        this.primaryColor = i;
        this.sceneBackgroundColors = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BitcoinStoryViewModel)) {
            return false;
        }
        BitcoinStoryViewModel bitcoinStoryViewModel = (BitcoinStoryViewModel) obj;
        return Intrinsics.areEqual(this.url, bitcoinStoryViewModel.url) && Intrinsics.areEqual(this.title, bitcoinStoryViewModel.title) && Intrinsics.areEqual(this.coverImageUrl, bitcoinStoryViewModel.coverImageUrl) && this.primaryColor == bitcoinStoryViewModel.primaryColor && Intrinsics.areEqual(this.sceneBackgroundColors, bitcoinStoryViewModel.sceneBackgroundColors);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.url.hashCode() * 31, 31, this.title);
        String str = this.coverImageUrl;
        return this.sceneBackgroundColors.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.primaryColor, (m + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("BitcoinStoryViewModel(url=", this.url, ", title=", this.title, ", coverImageUrl=");
        Boxes$$ExternalSyntheticOutline1.m(m, this.coverImageUrl, ", primaryColor=", this.primaryColor, ", sceneBackgroundColors=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(m, this.sceneBackgroundColors, ")");
    }
}
