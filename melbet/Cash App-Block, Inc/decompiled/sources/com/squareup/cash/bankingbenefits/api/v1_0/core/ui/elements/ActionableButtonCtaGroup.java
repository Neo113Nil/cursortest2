package com.squareup.cash.bankingbenefits.api.v1_0.core.ui.elements;

import android.os.Parcelable;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.localization.LocalizedString;
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
import squareup.cash.ui.arcade.elements.ButtonCtaGroup;

/* loaded from: classes7.dex */
public final class ActionableButtonCtaGroup extends AndroidMessage {
    public static final ProtoAdapter ADAPTER;
    public static final Parcelable.Creator<ActionableButtonCtaGroup> CREATOR;
    public final ButtonCtaGroup.Direction direction;
    public final LocalizedString disclaimer_text;
    public final ActionableButtonDefault primary_button;
    public final ActionableButtonDefault secondary_button;
    public final Boolean show_hairline;
    public final ActionableButtonDefault tertiary_button;

    static {
        ActionableButtonCtaGroup$Companion$ADAPTER$1 actionableButtonCtaGroup$Companion$ADAPTER$1 = new ActionableButtonCtaGroup$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, Reflection.factory.getOrCreateKotlinClass(ActionableButtonCtaGroup.class), "type.googleapis.com/squareup.cash.bankingbenefits.api.v1_0.core.ui.elements.ActionableButtonCtaGroup", Syntax.PROTO_2, null, "squareup/cash/bankingbenefits/api/v1_0/core/ui/elements/ActionableButtonCtaGroup.proto");
        ADAPTER = actionableButtonCtaGroup$Companion$ADAPTER$1;
        AndroidMessage.Companion.getClass();
        CREATOR = new AndroidMessage.ProtoAdapterCreator(actionableButtonCtaGroup$Companion$ADAPTER$1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionableButtonCtaGroup(ActionableButtonDefault actionableButtonDefault, ActionableButtonDefault actionableButtonDefault2, ActionableButtonDefault actionableButtonDefault3, ButtonCtaGroup.Direction direction, LocalizedString localizedString, Boolean bool, ByteString byteString) {
        super(ADAPTER, byteString);
        byteString.getClass();
        this.primary_button = actionableButtonDefault;
        this.secondary_button = actionableButtonDefault2;
        this.tertiary_button = actionableButtonDefault3;
        this.direction = direction;
        this.disclaimer_text = localizedString;
        this.show_hairline = bool;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActionableButtonCtaGroup)) {
            return false;
        }
        ActionableButtonCtaGroup actionableButtonCtaGroup = (ActionableButtonCtaGroup) obj;
        return Intrinsics.areEqual(unknownFields(), actionableButtonCtaGroup.unknownFields()) && Intrinsics.areEqual(this.primary_button, actionableButtonCtaGroup.primary_button) && Intrinsics.areEqual(this.secondary_button, actionableButtonCtaGroup.secondary_button) && Intrinsics.areEqual(this.tertiary_button, actionableButtonCtaGroup.tertiary_button) && this.direction == actionableButtonCtaGroup.direction && Intrinsics.areEqual(this.disclaimer_text, actionableButtonCtaGroup.disclaimer_text) && Intrinsics.areEqual(this.show_hairline, actionableButtonCtaGroup.show_hairline);
    }

    public final int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        ActionableButtonDefault actionableButtonDefault = this.primary_button;
        int hashCode2 = (hashCode + (actionableButtonDefault != null ? actionableButtonDefault.hashCode() : 0)) * 37;
        ActionableButtonDefault actionableButtonDefault2 = this.secondary_button;
        int hashCode3 = (hashCode2 + (actionableButtonDefault2 != null ? actionableButtonDefault2.hashCode() : 0)) * 37;
        ActionableButtonDefault actionableButtonDefault3 = this.tertiary_button;
        int hashCode4 = (hashCode3 + (actionableButtonDefault3 != null ? actionableButtonDefault3.hashCode() : 0)) * 37;
        ButtonCtaGroup.Direction direction = this.direction;
        int hashCode5 = (hashCode4 + (direction != null ? direction.hashCode() : 0)) * 37;
        LocalizedString localizedString = this.disclaimer_text;
        int hashCode6 = (hashCode5 + (localizedString != null ? localizedString.hashCode() : 0)) * 37;
        Boolean bool = this.show_hairline;
        int hashCode7 = hashCode6 + (bool != null ? Boolean.hashCode(bool.booleanValue()) : 0);
        this.hashCode = hashCode7;
        return hashCode7;
    }

    @Override // com.squareup.wire.Message
    public final Message.Builder newBuilder() {
        Error.Builder builder = new Error.Builder(1, false);
        builder.category = this.primary_button;
        builder.code = this.secondary_button;
        builder.description = this.tertiary_button;
        builder.field = this.direction;
        builder.metadata = this.disclaimer_text;
        builder.retryable = this.show_hairline;
        builder.addUnknownFields(unknownFields());
        return builder;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        ActionableButtonDefault actionableButtonDefault = this.primary_button;
        if (actionableButtonDefault != null) {
            arrayList.add("primary_button=" + actionableButtonDefault);
        }
        ActionableButtonDefault actionableButtonDefault2 = this.secondary_button;
        if (actionableButtonDefault2 != null) {
            arrayList.add("secondary_button=" + actionableButtonDefault2);
        }
        ActionableButtonDefault actionableButtonDefault3 = this.tertiary_button;
        if (actionableButtonDefault3 != null) {
            arrayList.add("tertiary_button=" + actionableButtonDefault3);
        }
        ButtonCtaGroup.Direction direction = this.direction;
        if (direction != null) {
            arrayList.add("direction=" + direction);
        }
        LocalizedString localizedString = this.disclaimer_text;
        if (localizedString != null) {
            Matcher$$ExternalSyntheticOutline0.m("disclaimer_text=", localizedString, arrayList);
        }
        Boolean bool = this.show_hairline;
        if (bool != null) {
            BalanceFeedKt$$ExternalSyntheticOutline0.m("show_hairline=", bool, arrayList);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActionableButtonCtaGroup{", "}", 0, null, null, 56);
    }
}
