package com.squareup.cash.crypto.amount;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.crypto.WithdrawalDetails;
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
public final class CryptoAmount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CryptoAmount> CREATOR;
    public final CryptoCurrency currency;
    public final Integer scale;
    public final long units;

    static {
        CryptoAmount$Companion$ADAPTER$1 cryptoAmount$Companion$ADAPTER$1 = new CryptoAmount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CryptoAmount.class), "type.googleapis.com/squareup.cash.crypto.CryptoAmount", Syntax.PROTO_2, null, "squareup/cash/crypto/amount.proto");
        ADAPTER = cryptoAmount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cryptoAmount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoAmount(long j, CryptoCurrency cryptoCurrency, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        cryptoCurrency.getClass();
        byteString.getClass();
        this.units = j;
        this.currency = cryptoCurrency;
        this.scale = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CryptoAmount)) {
            return false;
        }
        CryptoAmount cryptoAmount = (CryptoAmount) obj;
        return Intrinsics.areEqual(unknownFields(), cryptoAmount.unknownFields()) && this.units == cryptoAmount.units && this.currency == cryptoAmount.currency && Intrinsics.areEqual(this.scale, cryptoAmount.scale);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = (this.currency.hashCode() + Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.units)) * 37;
        Integer num = this.scale;
        int hashCode2 = hashCode + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        WithdrawalDetails.Builder builder = new WithdrawalDetails.Builder(12);
        builder.withdrawalType = Long.valueOf(this.units);
        builder.customer_supplied_amount = this.currency;
        builder.customer_token = this.scale;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("units=" + this.units);
        arrayList.add("currency=" + this.currency);
        Integer num = this.scale;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("scale=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoAmount{", "}", 0, null, null, 56);
    }

    public /* synthetic */ CryptoAmount(long j) {
        this(j, CryptoCurrency.BTC, null, ByteString.EMPTY);
    }
}
