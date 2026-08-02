package com.squareup.cash.cashcommercebrowser.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.idv.DisplayName;
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
public final class BlockedItem extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BlockedItem> CREATOR;
    public final String name;

    static {
        BlockedItem$Companion$ADAPTER$1 blockedItem$Companion$ADAPTER$1 = new BlockedItem$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BlockedItem.class), "type.googleapis.com/squareup.cash.cashcommercebrowser.api.v1.BlockedItem", Syntax.PROTO_2, null, "squareup/cash/cashcommercebrowser/api/v1/analyze_cart.proto");
        ADAPTER = blockedItem$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(blockedItem$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockedItem(String str, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.name = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BlockedItem)) {
            return false;
        }
        BlockedItem blockedItem = (BlockedItem) obj;
        return Intrinsics.areEqual(unknownFields(), blockedItem.unknownFields()) && Intrinsics.areEqual(this.name, blockedItem.name);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        DisplayName.Builder builder = new DisplayName.Builder(2);
        builder.display_name = this.name;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BlockedItem{", "}", 0, null, null, 56);
    }
}
