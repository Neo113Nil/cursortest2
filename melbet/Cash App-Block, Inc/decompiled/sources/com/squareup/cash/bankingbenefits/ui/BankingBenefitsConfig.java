package com.squareup.cash.bankingbenefits.ui;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.WithdrawalDetails;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
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

/* loaded from: classes5.dex */
public final class BankingBenefitsConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BankingBenefitsConfig> CREATOR;
    public final ActivitySection activity_section;

    public final class ActivitySection extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ActivitySection> CREATOR;
        public final List exclude_product_classifiers;
        public final List include_product_classifiers;
        public final Integer page_size;

        static {
            BankingBenefitsConfig$ActivitySection$Companion$ADAPTER$1 bankingBenefitsConfig$ActivitySection$Companion$ADAPTER$1 = new BankingBenefitsConfig$ActivitySection$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActivitySection.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.BankingBenefitsConfig.ActivitySection", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/BankingBenefitsConfig.proto");
            ADAPTER = bankingBenefitsConfig$ActivitySection$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(bankingBenefitsConfig$ActivitySection$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ActivitySection(List list, List list2, Integer num, ByteString byteString) {
            super(ADAPTER, byteString);
            BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, byteString);
            this.page_size = num;
            this.include_product_classifiers = TransactorKt.immutableCopyOf("include_product_classifiers", list);
            this.exclude_product_classifiers = TransactorKt.immutableCopyOf("exclude_product_classifiers", list2);
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ActivitySection)) {
                return false;
            }
            ActivitySection activitySection = (ActivitySection) obj;
            return Intrinsics.areEqual(unknownFields(), activitySection.unknownFields()) && Intrinsics.areEqual(this.include_product_classifiers, activitySection.include_product_classifiers) && Intrinsics.areEqual(this.exclude_product_classifiers, activitySection.exclude_product_classifiers) && Intrinsics.areEqual(this.page_size, activitySection.page_size);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int m = Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.include_product_classifiers), 37, this.exclude_product_classifiers);
            Integer num = this.page_size;
            int hashCode = m + (num != null ? Integer.hashCode(num.intValue()) : 0);
            this.hashCode = hashCode;
            return hashCode;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(5);
            builder.withdrawalType = this.include_product_classifiers;
            builder.customer_supplied_amount = this.exclude_product_classifiers;
            builder.customer_token = this.page_size;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            List list = this.include_product_classifiers;
            if (!list.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("include_product_classifiers=", arrayList, list);
            }
            List list2 = this.exclude_product_classifiers;
            if (!list2.isEmpty()) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("exclude_product_classifiers=", arrayList, list2);
            }
            Integer num = this.page_size;
            if (num != null) {
                re$$ExternalSyntheticOutline0.m("page_size=", num, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ActivitySection{", "}", 0, null, null, 56);
        }
    }

    static {
        BankingBenefitsConfig$Companion$ADAPTER$1 bankingBenefitsConfig$Companion$ADAPTER$1 = new BankingBenefitsConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BankingBenefitsConfig.class), "type.googleapis.com/squareup.cash.bankingbenefits.ui.BankingBenefitsConfig", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/ui/BankingBenefitsConfig.proto");
        ADAPTER = bankingBenefitsConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(bankingBenefitsConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankingBenefitsConfig(ActivitySection activitySection, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.activity_section = activitySection;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BankingBenefitsConfig)) {
            return false;
        }
        BankingBenefitsConfig bankingBenefitsConfig = (BankingBenefitsConfig) obj;
        return Intrinsics.areEqual(unknownFields(), bankingBenefitsConfig.unknownFields()) && Intrinsics.areEqual(this.activity_section, bankingBenefitsConfig.activity_section);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ActivitySection activitySection = this.activity_section;
        int hashCode2 = hashCode + (activitySection != null ? activitySection.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(4);
        builder.f1245type = this.activity_section;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ActivitySection activitySection = this.activity_section;
        if (activitySection != null) {
            arrayList.add("activity_section=" + activitySection);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BankingBenefitsConfig{", "}", 0, null, null, 56);
    }
}
