package com.squareup.cash.cdf.instrument;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.EventDestination;
import com.squareup.cash.cdf.InstrumentLinkFlowEntryPoint;
import com.squareup.cash.cdf.InstrumentType;
import com.squareup.util.cash.Countries;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class InstrumentLinkStart implements Event {
    public static final zzd Companion = new zzd(22);
    public static final List destinations = CollectionsKt__CollectionsKt.listOf((Object[]) new EventDestination[]{EventDestination.SNOWFLAKE, EventDestination.BULLETIN, EventDestination.AMPLITUDE});
    public final String client_scenario;
    public final InstrumentLinkFlowEntryPoint entry_point;
    public final String flow_token;
    public final LinkAction link_action;
    public final LinkedHashMap parameters;
    public final String rate_plan;
    public final Boolean send_to_business;
    public final String source;

    /* renamed from: type, reason: collision with root package name */
    public final InstrumentType f1095type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class LinkAction {
        public static final /* synthetic */ LinkAction[] $VALUES;
        public static final LinkAction DEPOSIT;
        public static final LinkAction WITHDRAW;

        static {
            LinkAction linkAction = new LinkAction("DEPOSIT", 0);
            DEPOSIT = linkAction;
            LinkAction linkAction2 = new LinkAction("WITHDRAW", 1);
            WITHDRAW = linkAction2;
            $VALUES = new LinkAction[]{linkAction, linkAction2};
        }

        public static LinkAction valueOf(String str) {
            return (LinkAction) Enum.valueOf(LinkAction.class, str);
        }

        public static LinkAction[] values() {
            return (LinkAction[]) $VALUES.clone();
        }
    }

    public InstrumentLinkStart(String str, InstrumentLinkFlowEntryPoint instrumentLinkFlowEntryPoint, String str2, String str3, String str4, InstrumentType instrumentType, LinkAction linkAction, Boolean bool) {
        this.client_scenario = str;
        this.entry_point = instrumentLinkFlowEntryPoint;
        this.flow_token = str2;
        this.rate_plan = str3;
        this.source = str4;
        this.f1095type = instrumentType;
        this.link_action = linkAction;
        this.send_to_business = bool;
        LinkedHashMap m = BalanceFeedKt$$ExternalSyntheticOutline0.m("cdf_entity", 13, "Instrument", "cdf_action", "Link");
        Countries.putSafe(m, "client_scenario", str);
        Countries.putSafe(m, "entry_point", instrumentLinkFlowEntryPoint);
        Countries.putSafe(m, "flow_token", str2);
        Countries.putSafe(m, "rate_plan", str3);
        Countries.putSafe(m, "source", str4);
        Countries.putSafe(m, "type", instrumentType);
        Countries.putSafe(m, "link_action", linkAction);
        Countries.putSafe(m, "send_to_business", bool);
        this.parameters = m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstrumentLinkStart)) {
            return false;
        }
        InstrumentLinkStart instrumentLinkStart = (InstrumentLinkStart) obj;
        return Intrinsics.areEqual(this.client_scenario, instrumentLinkStart.client_scenario) && this.entry_point == instrumentLinkStart.entry_point && Intrinsics.areEqual(this.flow_token, instrumentLinkStart.flow_token) && Intrinsics.areEqual(this.rate_plan, instrumentLinkStart.rate_plan) && this.source.equals(instrumentLinkStart.source) && this.f1095type == instrumentLinkStart.f1095type && this.link_action == instrumentLinkStart.link_action && this.send_to_business.equals(instrumentLinkStart.send_to_business);
    }

    @Override // com.squareup.cash.cdf.Event
    public final String getName() {
        return "Instrument Link Start";
    }

    @Override // com.squareup.cash.cdf.Event
    public final Map getParameters() {
        return this.parameters;
    }

    public final int hashCode() {
        String str = this.client_scenario;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        InstrumentLinkFlowEntryPoint instrumentLinkFlowEntryPoint = this.entry_point;
        int hashCode2 = (hashCode + (instrumentLinkFlowEntryPoint == null ? 0 : instrumentLinkFlowEntryPoint.hashCode())) * 31;
        String str2 = this.flow_token;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 961;
        String str3 = this.rate_plan;
        int hashCode4 = (this.f1095type.hashCode() + JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 961, this.source)) * 961;
        LinkAction linkAction = this.link_action;
        return this.send_to_business.hashCode() + ((hashCode4 + (linkAction != null ? linkAction.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InstrumentLinkStart(client_scenario=");
        sb.append(this.client_scenario);
        sb.append(", entry_point=");
        sb.append(this.entry_point);
        sb.append(", flow_token=");
        Boxes$$ExternalSyntheticOutline1.m(sb, this.flow_token, ", pre_populated_from_scan=null, rate_plan=", this.rate_plan, ", source=");
        sb.append(this.source);
        sb.append(", treatment=null, type=");
        sb.append(this.f1095type);
        sb.append(", variant=null, link_action=");
        sb.append(this.link_action);
        sb.append(", send_to_business=");
        sb.append(this.send_to_business);
        sb.append(")");
        return sb.toString();
    }
}
