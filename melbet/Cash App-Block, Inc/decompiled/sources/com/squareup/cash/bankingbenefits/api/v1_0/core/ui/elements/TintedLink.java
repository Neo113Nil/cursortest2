package com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.ui.Color;
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
public final class TintedLink extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<TintedLink> CREATOR;
    public final String link_text;
    public final Color tint_color;

    static {
        TintedLink$Companion$ADAPTER$1 tintedLink$Companion$ADAPTER$1 = new TintedLink$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(TintedLink.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.TintedLink", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/core/ui/elements/TintedLink.proto");
        ADAPTER = tintedLink$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(tintedLink$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TintedLink(String str, Color color, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.link_text = str;
        this.tint_color = color;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TintedLink)) {
            return false;
        }
        TintedLink tintedLink = (TintedLink) obj;
        return Intrinsics.areEqual(unknownFields(), tintedLink.unknownFields()) && Intrinsics.areEqual(this.link_text, tintedLink.link_text) && Intrinsics.areEqual(this.tint_color, tintedLink.tint_color);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.link_text;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        Color color = this.tint_color;
        int hashCode3 = hashCode2 + (color != null ? color.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        StyledText.Builder builder = new StyledText.Builder(1);
        builder.text = this.link_text;
        builder.text_color = this.tint_color;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.link_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "link_text=", arrayList);
        }
        Color color = this.tint_color;
        if (color != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("tint_color=", color, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TintedLink{", "}", 0, null, null, 56);
    }
}
