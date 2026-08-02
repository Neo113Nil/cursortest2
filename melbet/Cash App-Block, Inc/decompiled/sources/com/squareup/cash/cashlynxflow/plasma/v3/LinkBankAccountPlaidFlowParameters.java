package com.squareup.cash.cashlynxflow.plasma.v3;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.vision.text.zzd;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ForEach;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class LinkBankAccountPlaidFlowParameters extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<LinkBankAccountPlaidFlowParameters> CREATOR;
    public final List additional_products;
    public final Boolean allow_manual_linking;
    public final String instrument_token_to_replace;
    public final Boolean use_update_mode;

    public enum PlaidProduct implements WireEnum {
        PLAID_PRODUCT_UNSPECIFIED(0),
        PLAID_PRODUCT_ASSETS(1);

        public static final LinkBankAccountPlaidFlowParameters$PlaidProduct$Companion$ADAPTER$1 ADAPTER;
        public static final zzd Companion;
        public final int value;

        static {
            PlaidProduct plaidProduct = PLAID_PRODUCT_UNSPECIFIED;
            Companion = new zzd(19);
            ADAPTER = new LinkBankAccountPlaidFlowParameters$PlaidProduct$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PlaidProduct.class), Syntax.PROTO_2, plaidProduct);
        }

        PlaidProduct(int i) {
            this.value = i;
        }

        public static final PlaidProduct fromValue(int i) {
            Companion.getClass();
            if (i == 0) {
                return PLAID_PRODUCT_UNSPECIFIED;
            }
            if (i != 1) {
                return null;
            }
            return PLAID_PRODUCT_ASSETS;
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return this.value;
        }
    }

    static {
        LinkBankAccountPlaidFlowParameters$Companion$ADAPTER$1 linkBankAccountPlaidFlowParameters$Companion$ADAPTER$1 = new LinkBankAccountPlaidFlowParameters$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(LinkBankAccountPlaidFlowParameters.class), "type.googleapis.com/squareup.cash.cashlynxflow.plasma.v3.LinkBankAccountPlaidFlowParameters", Syntax.PROTO_2, null, "squareup/cash/cashlynxflow/plasma/v3/link_bank_account_plaid_flow_parameters.proto");
        ADAPTER = linkBankAccountPlaidFlowParameters$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(linkBankAccountPlaidFlowParameters$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkBankAccountPlaidFlowParameters(Boolean bool, Boolean bool2, List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.allow_manual_linking = bool;
        this.use_update_mode = bool2;
        this.instrument_token_to_replace = str;
        this.additional_products = TransactorKt.immutableCopyOf("additional_products", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LinkBankAccountPlaidFlowParameters)) {
            return false;
        }
        LinkBankAccountPlaidFlowParameters linkBankAccountPlaidFlowParameters = (LinkBankAccountPlaidFlowParameters) obj;
        return Intrinsics.areEqual(unknownFields(), linkBankAccountPlaidFlowParameters.unknownFields()) && Intrinsics.areEqual(this.allow_manual_linking, linkBankAccountPlaidFlowParameters.allow_manual_linking) && Intrinsics.areEqual(this.use_update_mode, linkBankAccountPlaidFlowParameters.use_update_mode) && Intrinsics.areEqual(this.additional_products, linkBankAccountPlaidFlowParameters.additional_products) && Intrinsics.areEqual(this.instrument_token_to_replace, linkBankAccountPlaidFlowParameters.instrument_token_to_replace);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Boolean bool = this.allow_manual_linking;
        int hashCode2 = (hashCode + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0)) * 37;
        Boolean bool2 = this.use_update_mode;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (bool2 != null ? Boolean.hashCode(bool2.booleanValue()) : 0)) * 37, 37, this.additional_products);
        String str = this.instrument_token_to_replace;
        int hashCode3 = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ForEach.Builder builder = new ForEach.Builder(2);
        builder.collection = this.allow_manual_linking;
        builder.template = this.use_update_mode;
        builder.source = this.additional_products;
        builder.item_variable = this.instrument_token_to_replace;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Boolean bool = this.allow_manual_linking;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("allow_manual_linking=", bool, arrayList);
        }
        Boolean bool2 = this.use_update_mode;
        if (bool2 != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("use_update_mode=", bool2, arrayList);
        }
        List list = this.additional_products;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("additional_products=", arrayList, list);
        }
        String str = this.instrument_token_to_replace;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "instrument_token_to_replace=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "LinkBankAccountPlaidFlowParameters{", "}", 0, null, null, 56);
    }

    public LinkBankAccountPlaidFlowParameters(String str) {
        this(Boolean.TRUE, null, EmptyList.INSTANCE, str, ByteString.EMPTY);
    }
}
