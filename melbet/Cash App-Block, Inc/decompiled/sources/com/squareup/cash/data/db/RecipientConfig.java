package com.squareup.cash.data.db;

import com.squareup.protos.franklin.common.RecipientGroup;
import com.squareup.protos.franklin.common.SuggestedRecipientsData;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class RecipientConfig {
    public static final SuggestedRecipientsData DEFAULT_DATA = new SuggestedRecipientsData(EmptyList.INSTANCE, CollectionsKt__CollectionsKt.listOf((Object[]) new RecipientGroup[]{RecipientGroup.NEARBY, RecipientGroup.SUGGESTIONS, RecipientGroup.RECENTS}), ByteString.EMPTY);
    public final boolean confirm_cashtag_recipient;
    public final SuggestedRecipientsData pay_data;
    public final SuggestedRecipientsData request_data;

    public RecipientConfig(SuggestedRecipientsData suggestedRecipientsData, SuggestedRecipientsData suggestedRecipientsData2, boolean z) {
        suggestedRecipientsData.getClass();
        suggestedRecipientsData2.getClass();
        this.pay_data = suggestedRecipientsData;
        this.request_data = suggestedRecipientsData2;
        this.confirm_cashtag_recipient = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RecipientConfig)) {
            return false;
        }
        RecipientConfig recipientConfig = (RecipientConfig) obj;
        return Intrinsics.areEqual(this.pay_data, recipientConfig.pay_data) && Intrinsics.areEqual(this.request_data, recipientConfig.request_data) && this.confirm_cashtag_recipient == recipientConfig.confirm_cashtag_recipient;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.confirm_cashtag_recipient) + ((this.request_data.hashCode() + (this.pay_data.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecipientConfig(pay_data=");
        sb.append(this.pay_data);
        sb.append(", request_data=");
        sb.append(this.request_data);
        sb.append(", confirm_cashtag_recipient=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(sb, this.confirm_cashtag_recipient, ")");
    }
}
