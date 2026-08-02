package com.squareup.cash.cashcommercebrowser.api.v1;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.franklin.api.SupportConfig;
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
public final class ShoppingCartProduct extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ShoppingCartProduct> CREATOR;
    public final String image_url;
    public final String name;
    public final String url;

    static {
        ShoppingCartProduct$Companion$ADAPTER$1 shoppingCartProduct$Companion$ADAPTER$1 = new ShoppingCartProduct$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ShoppingCartProduct.class), "type.googleapis.com/squareup.cash.cashcommercebrowser.api.v1.ShoppingCartProduct", Syntax.PROTO_2, null, "squareup/cash/cashcommercebrowser/api/v1/analyze_cart.proto");
        ADAPTER = shoppingCartProduct$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(shoppingCartProduct$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShoppingCartProduct(String str, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.name = str;
        this.url = str2;
        this.image_url = str3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ShoppingCartProduct)) {
            return false;
        }
        ShoppingCartProduct shoppingCartProduct = (ShoppingCartProduct) obj;
        return Intrinsics.areEqual(unknownFields(), shoppingCartProduct.unknownFields()) && Intrinsics.areEqual(this.name, shoppingCartProduct.name) && Intrinsics.areEqual(this.url, shoppingCartProduct.url) && Intrinsics.areEqual(this.image_url, shoppingCartProduct.image_url);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
        String str2 = this.url;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
        String str3 = this.image_url;
        int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SupportConfig.Builder builder = new SupportConfig.Builder(2);
        builder.contact_support_url = this.name;
        builder.privacy_policy_url = this.url;
        builder.terms_of_service_url = this.image_url;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        String str = this.name;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "name=", arrayList);
        }
        String str2 = this.url;
        if (str2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "url=", arrayList);
        }
        String str3 = this.image_url;
        if (str3 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "image_url=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShoppingCartProduct{", "}", 0, null, null, 56);
    }
}
