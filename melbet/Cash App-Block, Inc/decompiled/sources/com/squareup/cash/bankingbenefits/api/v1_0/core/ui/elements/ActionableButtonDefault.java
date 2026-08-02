package com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.idv.DisplayName;
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
import squareup.cash.ui.arcade.elements.ButtonDefault;

/* loaded from: classes5.dex */
public final class ActionableButtonDefault extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActionableButtonDefault> CREATOR;
    public final ActionableButtonDefault$Action$ClientRouteAction action;
    public final ButtonDefault button;

    public final class ClientRouteAction extends AndroidMessage {
        public static final ProtoAdapter ADAPTER;
        public static final Parcelable.Creator<ClientRouteAction> CREATOR;
        public final String client_route_url;

        static {
            ActionableButtonDefault$ClientRouteAction$Companion$ADAPTER$1 actionableButtonDefault$ClientRouteAction$Companion$ADAPTER$1 = new ActionableButtonDefault$ClientRouteAction$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ClientRouteAction.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonDefault.ClientRouteAction", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/core/ui/elements/ActionableButtonDefault.proto");
            ADAPTER = actionableButtonDefault$ClientRouteAction$Companion$ADAPTER$1;
            AndroidMessage.Companion.getClass();
            CREATOR = new AndroidMessage.ProtoAdapterCreator(actionableButtonDefault$ClientRouteAction$Companion$ADAPTER$1);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ClientRouteAction(String str, ByteString byteString) {
            super(ADAPTER, byteString);
            byteString.getClass();
            this.client_route_url = str;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ClientRouteAction)) {
                return false;
            }
            ClientRouteAction clientRouteAction = (ClientRouteAction) obj;
            return Intrinsics.areEqual(unknownFields(), clientRouteAction.unknownFields()) && Intrinsics.areEqual(this.client_route_url, clientRouteAction.client_route_url);
        }

        public final int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            String str = this.client_route_url;
            int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode2;
            return hashCode2;
        }

        @Override // com.squareup.wire.Message
        public final Message.Builder newBuilder() {
            DisplayName.Builder builder = new DisplayName.Builder(1);
            builder.display_name = this.client_route_url;
            builder.addUnknownFields(unknownFields());
            return builder;
        }

        public final String toString() {
            ArrayList arrayList = new ArrayList();
            String str = this.client_route_url;
            if (str != null) {
                BalanceFeedKt$$ExternalSyntheticOutline0.m(str, "client_route_url=", arrayList);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "ClientRouteAction{", "}", 0, null, null, 56);
        }
    }

    static {
        ActionableButtonDefault$Companion$ADAPTER$1 actionableButtonDefault$Companion$ADAPTER$1 = new ActionableButtonDefault$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActionableButtonDefault.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonDefault", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/core/ui/elements/ActionableButtonDefault.proto");
        ADAPTER = actionableButtonDefault$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(actionableButtonDefault$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionableButtonDefault(ButtonDefault buttonDefault, ActionableButtonDefault$Action$ClientRouteAction actionableButtonDefault$Action$ClientRouteAction, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.button = buttonDefault;
        this.action = actionableButtonDefault$Action$ClientRouteAction;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActionableButtonDefault)) {
            return false;
        }
        ActionableButtonDefault actionableButtonDefault = (ActionableButtonDefault) obj;
        return Intrinsics.areEqual(unknownFields(), actionableButtonDefault.unknownFields()) && Intrinsics.areEqual(this.button, actionableButtonDefault.button) && Intrinsics.areEqual(this.action, actionableButtonDefault.action);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ButtonDefault buttonDefault = this.button;
        int hashCode2 = (hashCode + (buttonDefault != null ? buttonDefault.hashCode() : 0)) * 37;
        ActionableButtonDefault$Action$ClientRouteAction actionableButtonDefault$Action$ClientRouteAction = this.action;
        int hashCode3 = hashCode2 + (actionableButtonDefault$Action$ClientRouteAction != null ? actionableButtonDefault$Action$ClientRouteAction.value.hashCode() : 0);
        this.hashCode = hashCode3;
        return hashCode3;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Member.Builder builder = new Member.Builder(6);
        builder.customer_token = this.button;
        builder.sponsorship_tier = this.action;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ButtonDefault buttonDefault = this.button;
        if (buttonDefault != null) {
            arrayList.add("button=" + buttonDefault);
        }
        ActionableButtonDefault$Action$ClientRouteAction actionableButtonDefault$Action$ClientRouteAction = this.action;
        if (actionableButtonDefault$Action$ClientRouteAction != null) {
            arrayList.add("action=" + actionableButtonDefault$Action$ClientRouteAction);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActionableButtonDefault{", "}", 0, null, null, 56);
    }
}
