package com.squareup.cash.moneybot.viewmodels.chat;

import com.squareup.cash.common.viewmodels.LoadingAnimationAssets;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ProcessingIndicator {
    public final LoadingAnimationAssets assetGroup;
    public final String text;

    public ProcessingIndicator(String str, LoadingAnimationAssets loadingAnimationAssets, int i) {
        loadingAnimationAssets = (i & 2) != 0 ? LoadingAnimationAssets.FallbacksSmall : loadingAnimationAssets;
        str.getClass();
        loadingAnimationAssets.getClass();
        this.text = str;
        this.assetGroup = loadingAnimationAssets;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProcessingIndicator)) {
            return false;
        }
        ProcessingIndicator processingIndicator = (ProcessingIndicator) obj;
        return Intrinsics.areEqual(this.text, processingIndicator.text) && this.assetGroup == processingIndicator.assetGroup;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.assetGroup.hashCode() + (this.text.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ProcessingIndicator(text=" + this.text + ", assetGroup=" + this.assetGroup + ", pauseThinkingAnimation=false)";
    }
}
