package com.squareup.cash.cryptocurrency;

import android.os.Parcelable;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.mlkit.vision.text.zza;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Member;
import com.squareup.protos.cash.appthemes.Gradient;
import com.squareup.wire.AndroidMessage;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* loaded from: classes6.dex */
public final class SponsorshipCryptoAuthorization extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<SponsorshipCryptoAuthorization> CREATOR;
    public final List feature_authorizations;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class Feature implements WireEnum {
        public static final /* synthetic */ Feature[] $VALUES;
        public static final SponsorshipCryptoAuthorization$Feature$Companion$ADAPTER$1 ADAPTER;
        public static final Feature BTC_EXCHANGE;
        public static final zza Companion;

        static {
            Feature feature = new Feature("BTC_EXCHANGE", 0);
            BTC_EXCHANGE = feature;
            $VALUES = new Feature[]{feature};
            Companion = new zza(22);
            ADAPTER = new SponsorshipCryptoAuthorization$Feature$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(Feature.class), Syntax.PROTO_2, null);
        }

        public static final Feature fromValue(int i) {
            Companion.getClass();
            if (i == 1) {
                return BTC_EXCHANGE;
            }
            return null;
        }

        public static Feature valueOf(String str) {
            return (Feature) Enum.valueOf(Feature.class, str);
        }

        public static Feature[] values() {
            return (Feature[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public final int getValue() {
            return 1;
        }
    }

    public final class FeatureAuthorization extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<FeatureAuthorization> CREATOR;
        public final Feature feature;
        public final Boolean is_authorized;

        static {
            SponsorshipCryptoAuthorization$FeatureAuthorization$Companion$ADAPTER$1 sponsorshipCryptoAuthorization$FeatureAuthorization$Companion$ADAPTER$1 = new SponsorshipCryptoAuthorization$FeatureAuthorization$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(FeatureAuthorization.class), "type.googleapis.com/squareup.cash.cryptocurrency.SponsorshipCryptoAuthorization.FeatureAuthorization", Syntax.PROTO_2, null, "squareup/cash/cryptocurrency/SponsorshipCryptoAuthorization.proto");
            ADAPTER = sponsorshipCryptoAuthorization$FeatureAuthorization$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(sponsorshipCryptoAuthorization$FeatureAuthorization$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FeatureAuthorization(Feature feature, Boolean bool, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.feature = feature;
            this.is_authorized = bool;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FeatureAuthorization)) {
                return false;
            }
            FeatureAuthorization featureAuthorization = (FeatureAuthorization) obj;
            return Intrinsics.areEqual(unknownFields(), featureAuthorization.unknownFields()) && this.feature == featureAuthorization.feature && Intrinsics.areEqual(this.is_authorized, featureAuthorization.is_authorized);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Feature feature = this.feature;
            int hashCode2 = (hashCode + (feature != null ? feature.hashCode() : 0)) * 37;
            Boolean bool = this.is_authorized;
            int hashCode3 = hashCode2 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            Member.Builder builder = new Member.Builder(11);
            builder.customer_token = this.feature;
            builder.sponsorship_tier = this.is_authorized;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            Feature feature = this.feature;
            if (feature != null) {
                arrayList.add("feature=" + feature);
            }
            Boolean bool = this.is_authorized;
            if (bool != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m("is_authorized=", bool, arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FeatureAuthorization{", "}", 0, null, null, 56);
        }
    }

    static {
        SponsorshipCryptoAuthorization$Companion$ADAPTER$1 sponsorshipCryptoAuthorization$Companion$ADAPTER$1 = new SponsorshipCryptoAuthorization$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(SponsorshipCryptoAuthorization.class), "type.googleapis.com/squareup.cash.cryptocurrency.SponsorshipCryptoAuthorization", Syntax.PROTO_2, null, "squareup/cash/cryptocurrency/SponsorshipCryptoAuthorization.proto");
        ADAPTER = sponsorshipCryptoAuthorization$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(sponsorshipCryptoAuthorization$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SponsorshipCryptoAuthorization(List list, ByteString byteString) {
        super(ADAPTER, byteString);
        list.getClass();
        byteString.getClass();
        this.feature_authorizations = TransactorKt.immutableCopyOf("feature_authorizations", list);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SponsorshipCryptoAuthorization)) {
            return false;
        }
        SponsorshipCryptoAuthorization sponsorshipCryptoAuthorization = (SponsorshipCryptoAuthorization) obj;
        return Intrinsics.areEqual(unknownFields(), sponsorshipCryptoAuthorization.unknownFields()) && Intrinsics.areEqual(this.feature_authorizations, sponsorshipCryptoAuthorization.feature_authorizations);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.feature_authorizations.hashCode() + (unknownFields().hashCode() * 37);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Gradient.Builder builder = new Gradient.Builder(8, false);
        builder.colors = this.feature_authorizations;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        List list = this.feature_authorizations;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("feature_authorizations=", arrayList, list);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "SponsorshipCryptoAuthorization{", "}", 0, null, null, 56);
    }
}
