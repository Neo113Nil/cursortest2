package com.plaid.link.event;

import android.os.Parcel;
import android.os.Parcelable;
import com.plaid.internal.C0103b4;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001d"}, d2 = {"Lcom/plaid/link/event/LinkEvent;", "Landroid/os/Parcelable;", "eventName", "Lcom/plaid/link/event/LinkEventName;", "metadata", "Lcom/plaid/link/event/LinkEventMetadata;", "(Lcom/plaid/link/event/LinkEventName;Lcom/plaid/link/event/LinkEventMetadata;)V", "getEventName", "()Lcom/plaid/link/event/LinkEventName;", "getMetadata", "()Lcom/plaid/link/event/LinkEventMetadata;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LinkEvent implements Parcelable {
    private final LinkEventName eventName;
    private final LinkEventMetadata metadata;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LinkEvent> CREATOR = new Creator();

    public LinkEvent(LinkEventName linkEventName, LinkEventMetadata linkEventMetadata) {
        linkEventName.getClass();
        linkEventMetadata.getClass();
        this.eventName = linkEventName;
        this.metadata = linkEventMetadata;
    }

    public static /* synthetic */ LinkEvent copy$default(LinkEvent linkEvent, LinkEventName linkEventName, LinkEventMetadata linkEventMetadata, int i, Object obj) {
        if ((i & 1) != 0) {
            linkEventName = linkEvent.eventName;
        }
        if ((i & 2) != 0) {
            linkEventMetadata = linkEvent.metadata;
        }
        return linkEvent.copy(linkEventName, linkEventMetadata);
    }

    /* renamed from: component1, reason: from getter */
    public final LinkEventName getEventName() {
        return this.eventName;
    }

    /* renamed from: component2, reason: from getter */
    public final LinkEventMetadata getMetadata() {
        return this.metadata;
    }

    public final LinkEvent copy(LinkEventName eventName, LinkEventMetadata metadata) {
        eventName.getClass();
        metadata.getClass();
        return new LinkEvent(eventName, metadata);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkEvent)) {
            return false;
        }
        LinkEvent linkEvent = (LinkEvent) other;
        return Intrinsics.areEqual(this.eventName, linkEvent.eventName) && Intrinsics.areEqual(this.metadata, linkEvent.metadata);
    }

    public final LinkEventName getEventName() {
        return this.eventName;
    }

    public final LinkEventMetadata getMetadata() {
        return this.metadata;
    }

    public int hashCode() {
        return this.metadata.hashCode() + (this.eventName.hashCode() * 31);
    }

    public String toString() {
        return "LinkEvent(eventName=" + this.eventName + ", metadata=" + this.metadata + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeParcelable(this.eventName, flags);
        this.metadata.writeToParcel(parcel, flags);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J#\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0000¢\u0006\u0002\b\bJ\b\u0010\t\u001a\u00020\u0007H\u0002¨\u0006\n"}, d2 = {"Lcom/plaid/link/event/LinkEvent$Companion;", "", "()V", "fromMap", "Lcom/plaid/link/event/LinkEvent;", "linkData", "", "", "fromMap$link_sdk_release", "getTimestamp", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String getTimestamp() {
            String format2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ", Locale.ENGLISH).format(new Date());
            format2.getClass();
            return format2;
        }

        public final LinkEvent fromMap$link_sdk_release(Map<String, String> linkData) {
            linkData.getClass();
            LinkEventName fromString$link_sdk_release = LinkEventName.INSTANCE.fromString$link_sdk_release(C0103b4.a("event_name", "", linkData));
            String a = C0103b4.a("error_code", "", linkData);
            String a2 = C0103b4.a("error_message", "", linkData);
            String a3 = C0103b4.a("error_type", "", linkData);
            String a4 = C0103b4.a("exit_status", "", linkData);
            String a5 = C0103b4.a("institution_id", "", linkData);
            String a6 = C0103b4.a("institution_name", "", linkData);
            String a7 = C0103b4.a("institution_search_query", "", linkData);
            String a8 = C0103b4.a("issue_description", "", linkData);
            String a9 = C0103b4.a("issue_detected_at", "", linkData);
            String a10 = C0103b4.a("issue_id", "", linkData);
            String a11 = C0103b4.a("link_session_id", "", linkData);
            String a12 = C0103b4.a("mfa_type", "", linkData);
            String a13 = C0103b4.a("request_id", "", linkData);
            String a14 = C0103b4.a("timestamp", getTimestamp(), linkData);
            LinkEventViewName fromString$link_sdk_release2 = LinkEventViewName.INSTANCE.fromString$link_sdk_release(C0103b4.a("view_name", "", linkData));
            return new LinkEvent(fromString$link_sdk_release, new LinkEventMetadata(null, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, C0103b4.a("selection", "", linkData), a14, fromString$link_sdk_release2, C0103b4.a("metadata_json", "", linkData), null, linkData.containsKey("is_update_mode") ? linkData.get("is_update_mode") : null, linkData.containsKey("match_reason") ? linkData.get("match_reason") : null, linkData.containsKey("account_number_mask") ? linkData.get("account_number_mask") : null, 262145, null));
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkEvent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkEvent createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new LinkEvent((LinkEventName) parcel.readParcelable(LinkEvent.class.getClassLoader()), LinkEventMetadata.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkEvent[] newArray(int i) {
            return new LinkEvent[i];
        }
    }
}
