package com.squareup.cash.bankingbenefits.api.v1_0.app;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.cashsuggest.api.ToggleScreen;
import com.squareup.protos.franklin.api.SupportConfig;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsForBookletResponse;", "Lcom/squareup/wire/AndroidMessage;", "Lcom/squareup/protos/cash/cashsuggest/api/ToggleScreen$Builder;", "Builder", "Benefit", "lib"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class GetBankingBenefitsForBookletResponse extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<GetBankingBenefitsForBookletResponse> CREATOR;
    public final List benefits;
    public final String disclosures_text;

    /* loaded from: classes8.dex */
    public final class Benefit extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<Benefit> CREATOR;
        public final String icon_arcade_id;
        public final String subtitle;
        public final String title;

        static {
            GetBankingBenefitsForBookletResponse$Benefit$Companion$ADAPTER$1 getBankingBenefitsForBookletResponse$Benefit$Companion$ADAPTER$1 = new GetBankingBenefitsForBookletResponse$Benefit$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(Benefit.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForBookletResponse.Benefit", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsForBooklet.proto");
            ADAPTER = getBankingBenefitsForBookletResponse$Benefit$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(getBankingBenefitsForBookletResponse$Benefit$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Benefit(String str, String str2, String str3, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.title = str;
            this.subtitle = str2;
            this.icon_arcade_id = str3;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Benefit)) {
                return false;
            }
            Benefit benefit = (Benefit) obj;
            return Intrinsics.areEqual(unknownFields(), benefit.unknownFields()) && Intrinsics.areEqual(this.title, benefit.title) && Intrinsics.areEqual(this.subtitle, benefit.subtitle) && Intrinsics.areEqual(this.icon_arcade_id, benefit.icon_arcade_id);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.title;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.subtitle;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 37;
            String str3 = this.icon_arcade_id;
            int hashCode4 = hashCode3 + (str3 != null ? str3.hashCode() : 0);
            this.hashCode = hashCode4;
            return hashCode4;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            SupportConfig.Builder builder = new SupportConfig.Builder(1);
            builder.contact_support_url = this.title;
            builder.privacy_policy_url = this.subtitle;
            builder.terms_of_service_url = this.icon_arcade_id;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.title;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "title=", arrayList);
            }
            String str2 = this.subtitle;
            if (str2 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str2, "subtitle=", arrayList);
            }
            String str3 = this.icon_arcade_id;
            if (str3 != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str3, "icon_arcade_id=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Benefit{", "}", 0, null, null, 56);
        }
    }

    static {
        GetBankingBenefitsForBookletResponse$Companion$ADAPTER$1 getBankingBenefitsForBookletResponse$Companion$ADAPTER$1 = new GetBankingBenefitsForBookletResponse$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(GetBankingBenefitsForBookletResponse.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.app.GetBankingBenefitsForBookletResponse", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/app/GetBankingBenefitsForBooklet.proto");
        ADAPTER = getBankingBenefitsForBookletResponse$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(getBankingBenefitsForBookletResponse$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetBankingBenefitsForBookletResponse(List list, String str, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.disclosures_text = str;
        this.benefits = TransactorKt.immutableCopyOf("benefits", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GetBankingBenefitsForBookletResponse)) {
            return false;
        }
        GetBankingBenefitsForBookletResponse getBankingBenefitsForBookletResponse = (GetBankingBenefitsForBookletResponse) obj;
        return Intrinsics.areEqual(unknownFields(), getBankingBenefitsForBookletResponse.unknownFields()) && Intrinsics.areEqual(this.benefits, getBankingBenefitsForBookletResponse.benefits) && Intrinsics.areEqual(this.disclosures_text, getBankingBenefitsForBookletResponse.disclosures_text);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.benefits);
        String str = this.disclosures_text;
        int hashCode = m + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ToggleScreen.Builder builder = new ToggleScreen.Builder(2, false);
        builder.sections = this.benefits;
        builder.toggle_title = this.disclosures_text;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.benefits;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("benefits=", arrayList, list);
        }
        String str = this.disclosures_text;
        if (str != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "disclosures_text=", arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetBankingBenefitsForBookletResponse{", "}", 0, null, null, 56);
    }
}
