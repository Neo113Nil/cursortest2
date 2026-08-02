package com.squareup.cash.crypto.amount;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.aegis.core.Member;
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
public final class BitcoinAmount extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BitcoinAmount> CREATOR;
    public final Integer remainder_pico;
    public final long satoshi;

    static {
        BitcoinAmount$Companion$ADAPTER$1 bitcoinAmount$Companion$ADAPTER$1 = new BitcoinAmount$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BitcoinAmount.class), "type.googleapis.com/squareup.cash.crypto.BitcoinAmount", Syntax.PROTO_2, null, "squareup/cash/crypto/amount.proto");
        ADAPTER = bitcoinAmount$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(bitcoinAmount$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BitcoinAmount(long j, Integer num, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.satoshi = j;
        this.remainder_pico = num;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BitcoinAmount)) {
            return false;
        }
        BitcoinAmount bitcoinAmount = (BitcoinAmount) obj;
        return Intrinsics.areEqual(unknownFields(), bitcoinAmount.unknownFields()) && this.satoshi == bitcoinAmount.satoshi && Intrinsics.areEqual(this.remainder_pico, bitcoinAmount.remainder_pico);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int m = Recorder$$ExternalSyntheticOutline2.m(unknownFields().hashCode() * 37, 37, this.satoshi);
        Integer num = this.remainder_pico;
        int hashCode = m + (num != null ? Integer.hashCode(num.intValue()) : 0);
        this.hashCode = hashCode;
        return hashCode;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Member.Builder builder = new Member.Builder(10);
        builder.customer_token = Long.valueOf(this.satoshi);
        builder.sponsorship_tier = this.remainder_pico;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("satoshi=" + this.satoshi);
        Integer num = this.remainder_pico;
        if (num != null) {
            re$$ExternalSyntheticOutline0.m("remainder_pico=", num, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BitcoinAmount{", "}", 0, null, null, 56);
    }

    public /* synthetic */ BitcoinAmount(long j) {
        this(j, null, ByteString.EMPTY);
    }
}
