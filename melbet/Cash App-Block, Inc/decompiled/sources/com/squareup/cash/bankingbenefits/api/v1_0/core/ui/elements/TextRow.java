package com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.janus.api.ContactAlias;
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

/* loaded from: classes5.dex */
public final class TextRow extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TextRow> CREATOR;
    public final Boolean disabled;
    public final TintedIcon icon;
    public final Boolean inactive;
    public final RowAction row_action;
    public final String subtitle;
    public final String title;
    public final Boolean unavailable;

    static {
        TextRow$Companion$ADAPTER$1 textRow$Companion$ADAPTER$1 = new TextRow$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TextRow.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.TextRow", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/core/ui/elements/TextRow.proto");
        ADAPTER = textRow$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(textRow$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextRow(TintedIcon tintedIcon, String str, String str2, RowAction rowAction, Boolean bool, Boolean bool2, Boolean bool3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.icon = tintedIcon;
        this.title = str;
        this.subtitle = str2;
        this.row_action = rowAction;
        this.inactive = bool;
        this.unavailable = bool2;
        this.disabled = bool3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TextRow)) {
            return false;
        }
        TextRow textRow = (TextRow) obj;
        return Intrinsics.areEqual(unknownFields(), textRow.unknownFields()) && Intrinsics.areEqual(this.icon, textRow.icon) && Intrinsics.areEqual(this.title, textRow.title) && Intrinsics.areEqual(this.subtitle, textRow.subtitle) && Intrinsics.areEqual(this.row_action, textRow.row_action) && Intrinsics.areEqual(this.inactive, textRow.inactive) && Intrinsics.areEqual(this.unavailable, textRow.unavailable) && Intrinsics.areEqual(this.disabled, textRow.disabled);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        TintedIcon tintedIcon = this.icon;
        int hashCode2 = (hashCode + (tintedIcon != null ? tintedIcon.hashCode() : 0)) * 37;
        String str = this.title;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.subtitle;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 37;
        RowAction rowAction = this.row_action;
        int hashCode5 = (hashCode4 + (rowAction != null ? rowAction.hashCode() : 0)) * 37;
        Boolean bool = this.inactive;
        int hashCode6 = (hashCode5 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.unavailable;
        int hashCode7 = (hashCode6 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37;
        Boolean bool3 = this.disabled;
        int hashCode8 = hashCode7 + (bool3 != null ? Boolean.hashCode(bool3.booleanValue()) : 0);
        this.hashCode = hashCode8;
        return hashCode8;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ContactAlias.Builder builder = new ContactAlias.Builder(1, false);
        builder.hashed_alias_token = this.icon;
        builder.customer_token = this.title;
        builder.alias_value = this.subtitle;
        builder.alias_type = this.row_action;
        builder.updated_at = this.inactive;
        builder.linked_at = this.unavailable;
        builder.version = this.disabled;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        TintedIcon tintedIcon = this.icon;
        if (tintedIcon != null) {
            arrayList.add("icon=" + tintedIcon);
        }
        String str = this.title;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
        }
        String str2 = this.subtitle;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
        }
        RowAction rowAction = this.row_action;
        if (rowAction != null) {
            arrayList.add("row_action=" + rowAction);
        }
        Boolean bool = this.inactive;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("inactive=", bool, arrayList);
        }
        Boolean bool2 = this.unavailable;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("unavailable=", bool2, arrayList);
        }
        Boolean bool3 = this.disabled;
        if (bool3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("disabled=", bool3, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TextRow{", "}", 0, null, null, 56);
    }
}
