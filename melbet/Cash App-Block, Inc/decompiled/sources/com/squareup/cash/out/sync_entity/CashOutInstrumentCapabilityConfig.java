package com.squareup.cash.out.sync_entity;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.moneybot.genie.protos.ForEach;
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

/* loaded from: classes6.dex */
public final class CashOutInstrumentCapabilityConfig extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<CashOutInstrumentCapabilityConfig> CREATOR;
    public final List capabilities;
    public final List preselection_priority;
    public final List unsupported_speed_actions;
    public final Long version;

    static {
        CashOutInstrumentCapabilityConfig$Companion$ADAPTER$1 cashOutInstrumentCapabilityConfig$Companion$ADAPTER$1 = new CashOutInstrumentCapabilityConfig$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(CashOutInstrumentCapabilityConfig.class), "type.googleapis.com/squareup.cash.out.sync_entity.CashOutInstrumentCapabilityConfig", Syntax.PROTO_2, null, "squareup/cash/out/sync_entity/InstrumentCapability.proto");
        ADAPTER = cashOutInstrumentCapabilityConfig$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(cashOutInstrumentCapabilityConfig$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CashOutInstrumentCapabilityConfig(Long l, List list, List list2, List list3, ByteString byteString) {
        super(ADAPTER, byteString);
        BalanceFeedKt$$ExternalSyntheticOutline0.m(list, list2, list3, byteString);
        this.version = l;
        this.capabilities = TransactorKt.immutableCopyOf("capabilities", list);
        this.preselection_priority = TransactorKt.immutableCopyOf("preselection_priority", list2);
        this.unsupported_speed_actions = TransactorKt.immutableCopyOf("unsupported_speed_actions", list3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CashOutInstrumentCapabilityConfig)) {
            return false;
        }
        CashOutInstrumentCapabilityConfig cashOutInstrumentCapabilityConfig = (CashOutInstrumentCapabilityConfig) obj;
        return Intrinsics.areEqual(unknownFields(), cashOutInstrumentCapabilityConfig.unknownFields()) && Intrinsics.areEqual(this.version, cashOutInstrumentCapabilityConfig.version) && Intrinsics.areEqual(this.capabilities, cashOutInstrumentCapabilityConfig.capabilities) && Intrinsics.areEqual(this.preselection_priority, cashOutInstrumentCapabilityConfig.preselection_priority) && Intrinsics.areEqual(this.unsupported_speed_actions, cashOutInstrumentCapabilityConfig.unsupported_speed_actions);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Long l = this.version;
        int hashCode2 = this.unsupported_speed_actions.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((hashCode + (l != null ? Long.hashCode(l.longValue()) : 0)) * 37, 37, this.capabilities), 37, this.preselection_priority);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        ForEach.Builder builder = new ForEach.Builder(11);
        builder.collection = this.version;
        builder.template = this.capabilities;
        builder.item_variable = this.preselection_priority;
        builder.source = this.unsupported_speed_actions;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        Long l = this.version;
        if (l != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("version=", l, arrayList);
        }
        List list = this.capabilities;
        if (!list.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("capabilities=", arrayList, list);
        }
        List list2 = this.preselection_priority;
        if (!list2.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("preselection_priority=", arrayList, list2);
        }
        List list3 = this.unsupported_speed_actions;
        if (!list3.isEmpty()) {
            re$$ExternalSyntheticOutline0.m("unsupported_speed_actions=", arrayList, list3);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CashOutInstrumentCapabilityConfig{", "}", 0, null, null, 56);
    }
}
