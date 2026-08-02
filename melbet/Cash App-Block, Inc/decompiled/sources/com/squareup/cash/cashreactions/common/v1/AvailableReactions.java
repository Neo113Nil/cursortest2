package com.squareup.cash.cashreactions.common.v1;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.appthemes.Gradient;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class AvailableReactions extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<AvailableReactions> CREATOR;
    public final List emoji;

    static {
        AvailableReactions$Companion$ADAPTER$1 availableReactions$Companion$ADAPTER$1 = new AvailableReactions$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(AvailableReactions.class), "type.googleapis.com/squareup.cash.cashreactions.common.v1.AvailableReactions", Syntax.PROTO_3, null, "squareup/cash/cashreactions/common/v1/available_reactions.proto");
        ADAPTER = availableReactions$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(availableReactions$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AvailableReactions(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.emoji = TransactorKt.immutableCopyOf("emoji", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AvailableReactions)) {
            return false;
        }
        AvailableReactions availableReactions = (AvailableReactions) obj;
        return Intrinsics.areEqual(unknownFields(), availableReactions.unknownFields()) && Intrinsics.areEqual(this.emoji, availableReactions.emoji);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.emoji.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Gradient.Builder builder = new Gradient.Builder(6, false);
        builder.colors = this.emoji;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.emoji;
        if (!list.isEmpty()) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("emoji=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AvailableReactions{", "}", 0, null, null, 56);
    }
}
