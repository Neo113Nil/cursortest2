package com.squareup.cash.bankingbenefits.api.v1_0.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.mooncake.theming.RipplesKt;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;
import squareup.cash.bankingbenefits.ui.GreenBenefitsV1;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/cash/bankingbenefits/api/v1_0/app/GetBenefitLeafletResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lsquareup/cash/bankingbenefits/ui/GreenBenefitsV1$Builder;", "Builder", "BenefitLeafletElement", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetBenefitLeafletResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetBenefitLeafletResponse> CREATOR;
    public final List elements;
    public final List footer_elements;

    public final class BenefitLeafletElement extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<BenefitLeafletElement> CREATOR;
        public final RipplesKt element;

        static {
            GetBenefitLeafletResponse$BenefitLeafletElement$Companion$ADAPTER$1 getBenefitLeafletResponse$BenefitLeafletElement$Companion$ADAPTER$1 = new GetBenefitLeafletResponse$BenefitLeafletElement$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BenefitLeafletElement.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.GetBenefitLeafletResponse.BenefitLeafletElement", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBenefitLeaflet.proto");
            ADAPTER = getBenefitLeafletResponse$BenefitLeafletElement$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getBenefitLeafletResponse$BenefitLeafletElement$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public BenefitLeafletElement(RipplesKt ripplesKt, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.element = ripplesKt;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof BenefitLeafletElement)) {
                return false;
            }
            BenefitLeafletElement benefitLeafletElement = (BenefitLeafletElement) obj;
            return Intrinsics.areEqual(unknownFields(), benefitLeafletElement.unknownFields()) && Intrinsics.areEqual(this.element, benefitLeafletElement.element);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            RipplesKt ripplesKt = this.element;
            int hashCode2 = hashCode + (ripplesKt != null ? ripplesKt.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SubsectionBlock.Builder builder = new SubsectionBlock.Builder(3);
            builder.f1245type = this.element;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            RipplesKt ripplesKt = this.element;
            if (ripplesKt != null) {
                arrayList.add("element=" + ripplesKt);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "BenefitLeafletElement{", "}", 0, null, null, 56);
        }
    }

    static {
        GetBenefitLeafletResponse$Companion$ADAPTER$1 getBenefitLeafletResponse$Companion$ADAPTER$1 = new GetBenefitLeafletResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetBenefitLeafletResponse.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.GetBenefitLeafletResponse", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBenefitLeaflet.proto");
        ADAPTER = getBenefitLeafletResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getBenefitLeafletResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBenefitLeafletResponse(List list, List list2, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
        this.elements = TransactorKt.immutableCopyOf("elements", list);
        this.footer_elements = TransactorKt.immutableCopyOf("footer_elements", list2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetBenefitLeafletResponse)) {
            return false;
        }
        GetBenefitLeafletResponse getBenefitLeafletResponse = (GetBenefitLeafletResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getBenefitLeafletResponse.unknownFields()) && Intrinsics.areEqual(this.elements, getBenefitLeafletResponse.elements) && Intrinsics.areEqual(this.footer_elements, getBenefitLeafletResponse.footer_elements);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.footer_elements.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.elements);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        GreenBenefitsV1.Builder builder = new GreenBenefitsV1.Builder(2, false);
        builder.card_holder_benefits = this.elements;
        builder.green_status_benefits = this.footer_elements;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.elements;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("elements=", arrayList, list);
        }
        List list2 = this.footer_elements;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("footer_elements=", arrayList, list2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBenefitLeafletResponse{", "}", 0, null, null, 56);
    }
}
