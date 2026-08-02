package com.squareup.cash.lynx.api.v1_0.model;

import android.os.Parcelable;
import com.squareup.protos.cash.aegis.core.SubsectionBlock;
import com.squareup.protos.franklin.data.BrowserInteraction;
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
public final class BrowserInteractionDetails extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<BrowserInteractionDetails> CREATOR;
    public final BrowserInteraction browser_interaction;

    static {
        BrowserInteractionDetails$Companion$ADAPTER$1 browserInteractionDetails$Companion$ADAPTER$1 = new BrowserInteractionDetails$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(BrowserInteractionDetails.class), "type.googleapis.com/squareup.cash.lynx.api.v1_0.model.BrowserInteractionDetails", Syntax.PROTO_2, null, "squareup/cash/lynx/api/v1_0/model/BrowserInteractionDetails.proto");
        ADAPTER = browserInteractionDetails$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(browserInteractionDetails$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrowserInteractionDetails(BrowserInteraction browserInteraction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.browser_interaction = browserInteraction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BrowserInteractionDetails)) {
            return false;
        }
        BrowserInteractionDetails browserInteractionDetails = (BrowserInteractionDetails) obj;
        return Intrinsics.areEqual(unknownFields(), browserInteractionDetails.unknownFields()) && Intrinsics.areEqual(this.browser_interaction, browserInteractionDetails.browser_interaction);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        BrowserInteraction browserInteraction = this.browser_interaction;
        int hashCode2 = hashCode + (browserInteraction != null ? browserInteraction.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        SubsectionBlock.Builder builder = new SubsectionBlock.Builder(8);
        builder.f1245type = this.browser_interaction;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        BrowserInteraction browserInteraction = this.browser_interaction;
        if (browserInteraction != null) {
            arrayList.add("browser_interaction=" + browserInteraction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "BrowserInteractionDetails{", "}", 0, null, null, 56);
    }
}
