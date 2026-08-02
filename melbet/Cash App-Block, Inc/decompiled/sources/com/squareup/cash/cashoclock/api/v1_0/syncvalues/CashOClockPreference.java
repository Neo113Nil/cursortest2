package com.squareup.cash.cashoclock.api.v1_0.syncvalues;

import android.os.Parcelable;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class CashOClockPreference extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashOClockPreference> CREATOR;
    public final ScheduledReload scheduled_reload;
    public final LocalizedString subtitle;
    public final LocalizedString title;

    static {
        CashOClockPreference$Companion$ADAPTER$1 cashOClockPreference$Companion$ADAPTER$1 = new CashOClockPreference$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashOClockPreference.class), "type.googleapis.com/squareup.cash.cashoclock.api.v1_0.syncvalues.CashOClockPreference", Syntax.PROTO_2, null, "squareup/cash/cashoclock/api/v1_0/syncvalues/CashOClockPreference.proto");
        ADAPTER = cashOClockPreference$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashOClockPreference$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashOClockPreference(ScheduledReload scheduledReload, LocalizedString localizedString, LocalizedString localizedString2, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.scheduled_reload = scheduledReload;
        this.title = localizedString;
        this.subtitle = localizedString2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashOClockPreference)) {
            return false;
        }
        CashOClockPreference cashOClockPreference = (CashOClockPreference) obj;
        return Intrinsics.areEqual(unknownFields(), cashOClockPreference.unknownFields()) && Intrinsics.areEqual(this.scheduled_reload, cashOClockPreference.scheduled_reload) && Intrinsics.areEqual(this.title, cashOClockPreference.title) && Intrinsics.areEqual(this.subtitle, cashOClockPreference.subtitle);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ScheduledReload scheduledReload = this.scheduled_reload;
        int hashCode2 = (hashCode + (scheduledReload != null ? scheduledReload.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.title;
        int hashCode3 = (hashCode2 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        LocalizedString localizedString2 = this.subtitle;
        int hashCode4 = hashCode3 + (localizedString2 != null ? localizedString2.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(7);
        builder.withdrawalType = this.scheduled_reload;
        builder.customer_supplied_amount = this.title;
        builder.customer_token = this.subtitle;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ScheduledReload scheduledReload = this.scheduled_reload;
        if (scheduledReload != null) {
            arrayList.add("scheduled_reload=" + scheduledReload);
        }
        LocalizedString localizedString = this.title;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("title=", localizedString, arrayList);
        }
        LocalizedString localizedString2 = this.subtitle;
        if (localizedString2 != null) {
            Matcher$$ExternalSyntheticOutline0.m("subtitle=", localizedString2, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashOClockPreference{", "}", 0, null, null, 56);
    }
}
