package com.squareup.cash.moneybot.viewmodels.chat;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata {
    public final List cdfEvents;
    public final String suggestionsId;

    public MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata(String str) {
        EmptyList emptyList = EmptyList.INSTANCE;
        emptyList.getClass();
        this.suggestionsId = str;
        this.cdfEvents = emptyList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata)) {
            return false;
        }
        MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata = (MoneybotChatViewEvent$SuggestionEvent$SuggestionMetadata) obj;
        return Intrinsics.areEqual(this.suggestionsId, moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata.suggestionsId) && this.cdfEvents.equals(moneybotChatViewEvent$SuggestionEvent$SuggestionMetadata.cdfEvents);
    }

    public final int hashCode() {
        String str = this.suggestionsId;
        return this.cdfEvents.hashCode() + ((str == null ? 0 : str.hashCode()) * 29791);
    }

    public final String toString() {
        return CameraState$Type$EnumUnboxingLocalUtility.m("SuggestionMetadata(suggestionsId=", this.suggestionsId, ", campaignCategory=null, clientSuggestionId=null, cdfEvents=", ")", this.cdfEvents);
    }
}
