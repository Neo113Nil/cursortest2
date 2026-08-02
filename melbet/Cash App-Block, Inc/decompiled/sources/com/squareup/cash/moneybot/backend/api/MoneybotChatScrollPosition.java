package com.squareup.cash.moneybot.backend.api;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;

/* loaded from: classes6.dex */
public final class MoneybotChatScrollPosition {
    public final int firstVisibleItemIndex;
    public final int firstVisibleItemScrollOffset;
    public final String sessionId;

    public MoneybotChatScrollPosition(String str, int i, int i2) {
        this.sessionId = str;
        this.firstVisibleItemIndex = i;
        this.firstVisibleItemScrollOffset = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotChatScrollPosition)) {
            return false;
        }
        MoneybotChatScrollPosition moneybotChatScrollPosition = (MoneybotChatScrollPosition) obj;
        return this.sessionId.equals(moneybotChatScrollPosition.sessionId) && this.firstVisibleItemIndex == moneybotChatScrollPosition.firstVisibleItemIndex && this.firstVisibleItemScrollOffset == moneybotChatScrollPosition.firstVisibleItemScrollOffset;
    }

    public final int hashCode() {
        return Integer.hashCode(this.firstVisibleItemScrollOffset) + JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.firstVisibleItemIndex, this.sessionId.hashCode() * 31, 31);
    }

    public final String toString() {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.firstVisibleItemScrollOffset, ")", Recorder$$ExternalSyntheticOutline2.m("MoneybotChatScrollPosition(sessionId=", this.firstVisibleItemIndex, this.sessionId, ", firstVisibleItemIndex=", ", firstVisibleItemScrollOffset="));
    }
}
