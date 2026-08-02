package com.squareup.cash.moneybot.viewmodels.plugins;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class BriefViewModel {
    public final String markdownText;
    public final String title;

    public BriefViewModel(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.title = str;
        this.markdownText = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BriefViewModel)) {
            return false;
        }
        BriefViewModel briefViewModel = (BriefViewModel) obj;
        return Intrinsics.areEqual(this.title, briefViewModel.title) && Intrinsics.areEqual(this.markdownText, briefViewModel.markdownText);
    }

    public final int hashCode() {
        return this.markdownText.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("BriefViewModel(title=", this.title, ", markdownText=", this.markdownText, ")");
    }
}
