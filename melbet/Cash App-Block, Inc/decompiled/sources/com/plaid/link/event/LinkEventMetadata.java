package com.plaid.link.event;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.gson.annotations.SerializedName;
import com.plaid.internal.C0322x;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0001XB\u0087\u0002\b\u0000\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001aJ\u000b\u00102\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0003HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u008d\u0002\u0010H\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010I\u001a\u00020JHÖ\u0001J\u0013\u0010K\u001a\u00020L2\b\u0010M\u001a\u0004\u0018\u00010NHÖ\u0003J\t\u0010O\u001a\u00020JHÖ\u0001J\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030QJ\t\u0010R\u001a\u00020\u0003HÖ\u0001J\u0019\u0010S\u001a\u00020T2\u0006\u0010U\u001a\u00020V2\u0006\u0010W\u001a\u00020JHÖ\u0001R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001cR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001cR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001cR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001cR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001cR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001cR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001cR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u00101¨\u0006Y"}, d2 = {"Lcom/plaid/link/event/LinkEventMetadata;", "Landroid/os/Parcelable;", "brandName", "", "errorCode", "errorMessage", "errorType", "exitStatus", "institutionId", "institutionName", "institutionSearchQuery", "issueDescription", "issueDetectedAt", "issueId", "linkSessionId", "mfaType", "requestId", "selection", "timestamp", "viewName", "Lcom/plaid/link/event/LinkEventViewName;", "metadataJson", "routingNumber", "isUpdateMode", "matchReason", "accountNumberMask", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/plaid/link/event/LinkEventViewName;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAccountNumberMask", "()Ljava/lang/String;", "getBrandName", "getErrorCode", "getErrorMessage", "getErrorType", "getExitStatus", "getInstitutionId", "getInstitutionName", "getInstitutionSearchQuery", "getIssueDescription", "getIssueDetectedAt", "getIssueId", "getLinkSessionId", "getMatchReason", "getMetadataJson", "getMfaType", "getRequestId", "getRoutingNumber", "getSelection", "getTimestamp", "getViewName", "()Lcom/plaid/link/event/LinkEventViewName;", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toMap", "", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class LinkEventMetadata implements Parcelable {

    @SerializedName("account_number_mask")
    private final String accountNumberMask;

    @SerializedName("brand_name")
    private final String brandName;

    @SerializedName("error_code")
    private final String errorCode;

    @SerializedName("error_message")
    private final String errorMessage;

    @SerializedName("error_type")
    private final String errorType;

    @SerializedName("exit_status")
    private final String exitStatus;

    @SerializedName("institution_id")
    private final String institutionId;

    @SerializedName("institution_name")
    private final String institutionName;

    @SerializedName("institution_search_query")
    private final String institutionSearchQuery;

    @SerializedName("is_update_mode")
    private final String isUpdateMode;

    @SerializedName("issue_description")
    private final String issueDescription;

    @SerializedName("issue_detected_at")
    private final String issueDetectedAt;

    @SerializedName("issue_id")
    private final String issueId;

    @SerializedName("link_session_id")
    private final String linkSessionId;

    @SerializedName("match_reason")
    private final String matchReason;

    @SerializedName("metadata_json")
    private final String metadataJson;

    @SerializedName("mfa_type")
    private final String mfaType;

    @SerializedName("request_id")
    private final String requestId;

    @SerializedName("routing_number")
    private final String routingNumber;

    @SerializedName("selection")
    private final String selection;

    @SerializedName("timestamp")
    private final String timestamp;

    @SerializedName("view_name")
    private final LinkEventViewName viewName;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LinkEventMetadata> CREATOR = new Creator();

    public /* synthetic */ LinkEventMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, LinkEventViewName linkEventViewName, String str17, String str18, String str19, String str20, String str21, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? null : str9, (i & 512) != 0 ? null : str10, (i & 1024) != 0 ? null : str11, str12, (i & 4096) != 0 ? null : str13, (i & PKIFailureInfo.certRevoked) != 0 ? null : str14, (i & 16384) != 0 ? null : str15, str16, (65536 & i) != 0 ? null : linkEventViewName, (131072 & i) != 0 ? null : str17, (262144 & i) != 0 ? null : str18, (524288 & i) != 0 ? null : str19, (1048576 & i) != 0 ? null : str20, (i & PKIFailureInfo.badSenderNonce) != 0 ? null : str21);
    }

    public static /* synthetic */ LinkEventMetadata copy$default(LinkEventMetadata linkEventMetadata, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, LinkEventViewName linkEventViewName, String str17, String str18, String str19, String str20, String str21, int i, Object obj) {
        String str22;
        String str23;
        String str24 = (i & 1) != 0 ? linkEventMetadata.brandName : str;
        String str25 = (i & 2) != 0 ? linkEventMetadata.errorCode : str2;
        String str26 = (i & 4) != 0 ? linkEventMetadata.errorMessage : str3;
        String str27 = (i & 8) != 0 ? linkEventMetadata.errorType : str4;
        String str28 = (i & 16) != 0 ? linkEventMetadata.exitStatus : str5;
        String str29 = (i & 32) != 0 ? linkEventMetadata.institutionId : str6;
        String str30 = (i & 64) != 0 ? linkEventMetadata.institutionName : str7;
        String str31 = (i & 128) != 0 ? linkEventMetadata.institutionSearchQuery : str8;
        String str32 = (i & 256) != 0 ? linkEventMetadata.issueDescription : str9;
        String str33 = (i & 512) != 0 ? linkEventMetadata.issueDetectedAt : str10;
        String str34 = (i & 1024) != 0 ? linkEventMetadata.issueId : str11;
        String str35 = (i & 2048) != 0 ? linkEventMetadata.linkSessionId : str12;
        String str36 = (i & 4096) != 0 ? linkEventMetadata.mfaType : str13;
        String str37 = (i & PKIFailureInfo.certRevoked) != 0 ? linkEventMetadata.requestId : str14;
        String str38 = str24;
        String str39 = (i & 16384) != 0 ? linkEventMetadata.selection : str15;
        String str40 = (i & 32768) != 0 ? linkEventMetadata.timestamp : str16;
        LinkEventViewName linkEventViewName2 = (i & 65536) != 0 ? linkEventMetadata.viewName : linkEventViewName;
        String str41 = (i & PKIFailureInfo.unsupportedVersion) != 0 ? linkEventMetadata.metadataJson : str17;
        String str42 = (i & PKIFailureInfo.transactionIdInUse) != 0 ? linkEventMetadata.routingNumber : str18;
        String str43 = (i & PKIFailureInfo.signerNotTrusted) != 0 ? linkEventMetadata.isUpdateMode : str19;
        String str44 = (i & PKIFailureInfo.badCertTemplate) != 0 ? linkEventMetadata.matchReason : str20;
        if ((i & PKIFailureInfo.badSenderNonce) != 0) {
            str23 = str44;
            str22 = linkEventMetadata.accountNumberMask;
        } else {
            str22 = str21;
            str23 = str44;
        }
        return linkEventMetadata.copy(str38, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str37, str39, str40, linkEventViewName2, str41, str42, str43, str23, str22);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBrandName() {
        return this.brandName;
    }

    /* renamed from: component10, reason: from getter */
    public final String getIssueDetectedAt() {
        return this.issueDetectedAt;
    }

    /* renamed from: component11, reason: from getter */
    public final String getIssueId() {
        return this.issueId;
    }

    /* renamed from: component12, reason: from getter */
    public final String getLinkSessionId() {
        return this.linkSessionId;
    }

    /* renamed from: component13, reason: from getter */
    public final String getMfaType() {
        return this.mfaType;
    }

    /* renamed from: component14, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* renamed from: component15, reason: from getter */
    public final String getSelection() {
        return this.selection;
    }

    /* renamed from: component16, reason: from getter */
    public final String getTimestamp() {
        return this.timestamp;
    }

    /* renamed from: component17, reason: from getter */
    public final LinkEventViewName getViewName() {
        return this.viewName;
    }

    /* renamed from: component18, reason: from getter */
    public final String getMetadataJson() {
        return this.metadataJson;
    }

    /* renamed from: component19, reason: from getter */
    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getErrorCode() {
        return this.errorCode;
    }

    /* renamed from: component20, reason: from getter */
    public final String getIsUpdateMode() {
        return this.isUpdateMode;
    }

    /* renamed from: component21, reason: from getter */
    public final String getMatchReason() {
        return this.matchReason;
    }

    /* renamed from: component22, reason: from getter */
    public final String getAccountNumberMask() {
        return this.accountNumberMask;
    }

    /* renamed from: component3, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* renamed from: component4, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    /* renamed from: component5, reason: from getter */
    public final String getExitStatus() {
        return this.exitStatus;
    }

    /* renamed from: component6, reason: from getter */
    public final String getInstitutionId() {
        return this.institutionId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getInstitutionName() {
        return this.institutionName;
    }

    /* renamed from: component8, reason: from getter */
    public final String getInstitutionSearchQuery() {
        return this.institutionSearchQuery;
    }

    /* renamed from: component9, reason: from getter */
    public final String getIssueDescription() {
        return this.issueDescription;
    }

    public final LinkEventMetadata copy(String brandName, String errorCode, String errorMessage, String errorType, String exitStatus, String institutionId, String institutionName, String institutionSearchQuery, String issueDescription, String issueDetectedAt, String issueId, String linkSessionId, String mfaType, String requestId, String selection, String timestamp, LinkEventViewName viewName, String metadataJson, String routingNumber, String isUpdateMode, String matchReason, String accountNumberMask) {
        linkSessionId.getClass();
        timestamp.getClass();
        return new LinkEventMetadata(brandName, errorCode, errorMessage, errorType, exitStatus, institutionId, institutionName, institutionSearchQuery, issueDescription, issueDetectedAt, issueId, linkSessionId, mfaType, requestId, selection, timestamp, viewName, metadataJson, routingNumber, isUpdateMode, matchReason, accountNumberMask);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LinkEventMetadata)) {
            return false;
        }
        LinkEventMetadata linkEventMetadata = (LinkEventMetadata) other;
        return Intrinsics.areEqual(this.brandName, linkEventMetadata.brandName) && Intrinsics.areEqual(this.errorCode, linkEventMetadata.errorCode) && Intrinsics.areEqual(this.errorMessage, linkEventMetadata.errorMessage) && Intrinsics.areEqual(this.errorType, linkEventMetadata.errorType) && Intrinsics.areEqual(this.exitStatus, linkEventMetadata.exitStatus) && Intrinsics.areEqual(this.institutionId, linkEventMetadata.institutionId) && Intrinsics.areEqual(this.institutionName, linkEventMetadata.institutionName) && Intrinsics.areEqual(this.institutionSearchQuery, linkEventMetadata.institutionSearchQuery) && Intrinsics.areEqual(this.issueDescription, linkEventMetadata.issueDescription) && Intrinsics.areEqual(this.issueDetectedAt, linkEventMetadata.issueDetectedAt) && Intrinsics.areEqual(this.issueId, linkEventMetadata.issueId) && Intrinsics.areEqual(this.linkSessionId, linkEventMetadata.linkSessionId) && Intrinsics.areEqual(this.mfaType, linkEventMetadata.mfaType) && Intrinsics.areEqual(this.requestId, linkEventMetadata.requestId) && Intrinsics.areEqual(this.selection, linkEventMetadata.selection) && Intrinsics.areEqual(this.timestamp, linkEventMetadata.timestamp) && Intrinsics.areEqual(this.viewName, linkEventMetadata.viewName) && Intrinsics.areEqual(this.metadataJson, linkEventMetadata.metadataJson) && Intrinsics.areEqual(this.routingNumber, linkEventMetadata.routingNumber) && Intrinsics.areEqual(this.isUpdateMode, linkEventMetadata.isUpdateMode) && Intrinsics.areEqual(this.matchReason, linkEventMetadata.matchReason) && Intrinsics.areEqual(this.accountNumberMask, linkEventMetadata.accountNumberMask);
    }

    public final String getAccountNumberMask() {
        return this.accountNumberMask;
    }

    public final String getBrandName() {
        return this.brandName;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final String getErrorType() {
        return this.errorType;
    }

    public final String getExitStatus() {
        return this.exitStatus;
    }

    public final String getInstitutionId() {
        return this.institutionId;
    }

    public final String getInstitutionName() {
        return this.institutionName;
    }

    public final String getInstitutionSearchQuery() {
        return this.institutionSearchQuery;
    }

    public final String getIssueDescription() {
        return this.issueDescription;
    }

    public final String getIssueDetectedAt() {
        return this.issueDetectedAt;
    }

    public final String getIssueId() {
        return this.issueId;
    }

    public final String getLinkSessionId() {
        return this.linkSessionId;
    }

    public final String getMatchReason() {
        return this.matchReason;
    }

    public final String getMetadataJson() {
        return this.metadataJson;
    }

    public final String getMfaType() {
        return this.mfaType;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getRoutingNumber() {
        return this.routingNumber;
    }

    public final String getSelection() {
        return this.selection;
    }

    public final String getTimestamp() {
        return this.timestamp;
    }

    public final LinkEventViewName getViewName() {
        return this.viewName;
    }

    public int hashCode() {
        String str = this.brandName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorCode;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.errorMessage;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.errorType;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.exitStatus;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.institutionId;
        int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.institutionName;
        int hashCode7 = (hashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.institutionSearchQuery;
        int hashCode8 = (hashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.issueDescription;
        int hashCode9 = (hashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.issueDetectedAt;
        int hashCode10 = (hashCode9 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.issueId;
        int a = C0322x.a(this.linkSessionId, (hashCode10 + (str11 == null ? 0 : str11.hashCode())) * 31, 31);
        String str12 = this.mfaType;
        int hashCode11 = (a + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.requestId;
        int hashCode12 = (hashCode11 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.selection;
        int a2 = C0322x.a(this.timestamp, (hashCode12 + (str14 == null ? 0 : str14.hashCode())) * 31, 31);
        LinkEventViewName linkEventViewName = this.viewName;
        int hashCode13 = (a2 + (linkEventViewName == null ? 0 : linkEventViewName.hashCode())) * 31;
        String str15 = this.metadataJson;
        int hashCode14 = (hashCode13 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.routingNumber;
        int hashCode15 = (hashCode14 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.isUpdateMode;
        int hashCode16 = (hashCode15 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.matchReason;
        int hashCode17 = (hashCode16 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.accountNumberMask;
        return hashCode17 + (str19 != null ? str19.hashCode() : 0);
    }

    public final String isUpdateMode() {
        return this.isUpdateMode;
    }

    public final Map<String, String> toMap() {
        Pair pair = new Pair("brand_name", this.brandName);
        Pair pair2 = new Pair("error_code", this.errorCode);
        Pair pair3 = new Pair("error_message", this.errorMessage);
        Pair pair4 = new Pair("error_type", this.errorType);
        Pair pair5 = new Pair("exit_status", this.exitStatus);
        Pair pair6 = new Pair("institution_id", this.institutionId);
        Pair pair7 = new Pair("institution_name", this.institutionName);
        Pair pair8 = new Pair("institution_search_query", this.institutionSearchQuery);
        Pair pair9 = new Pair("issue_description", this.issueDescription);
        Pair pair10 = new Pair("issue_detected_at", this.issueDetectedAt);
        Pair pair11 = new Pair("issue_id", this.issueId);
        Pair pair12 = new Pair("link_session_id", this.linkSessionId);
        Pair pair13 = new Pair("mfa_type", this.mfaType);
        Pair pair14 = new Pair("request_id", this.requestId);
        Pair pair15 = new Pair("routing_number", this.routingNumber);
        Pair pair16 = new Pair("selection", this.selection);
        Pair pair17 = new Pair("isUpdateMode", this.isUpdateMode);
        Pair pair18 = new Pair("matchReason", this.matchReason);
        Pair pair19 = new Pair("accountNumberMask", this.accountNumberMask);
        Pair pair20 = new Pair("timestamp", this.timestamp);
        LinkEventViewName linkEventViewName = this.viewName;
        Map mapOf = MapsKt__MapsKt.mapOf(pair, pair2, pair3, pair4, pair5, pair6, pair7, pair8, pair9, pair10, pair11, pair12, pair13, pair14, pair15, pair16, pair17, pair18, pair19, pair20, new Pair("view_name", linkEventViewName != null ? linkEventViewName.getJsonValue() : null));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapOf.entrySet()) {
            CharSequence charSequence = (CharSequence) entry.getValue();
            if (charSequence != null && charSequence.length() != 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    public String toString() {
        String str = this.brandName;
        String str2 = this.errorCode;
        String str3 = this.errorMessage;
        String str4 = this.errorType;
        String str5 = this.exitStatus;
        String str6 = this.institutionId;
        String str7 = this.institutionName;
        String str8 = this.institutionSearchQuery;
        String str9 = this.issueDescription;
        String str10 = this.issueDetectedAt;
        String str11 = this.issueId;
        String str12 = this.linkSessionId;
        String str13 = this.mfaType;
        String str14 = this.requestId;
        String str15 = this.selection;
        String str16 = this.timestamp;
        LinkEventViewName linkEventViewName = this.viewName;
        String str17 = this.metadataJson;
        String str18 = this.routingNumber;
        String str19 = this.isUpdateMode;
        String str20 = this.matchReason;
        String str21 = this.accountNumberMask;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("LinkEventMetadata(brandName=", str, ", errorCode=", str2, ", errorMessage=");
        Boxes$$ExternalSyntheticOutline1.m(m, str3, ", errorType=", str4, ", exitStatus=");
        Boxes$$ExternalSyntheticOutline1.m(m, str5, ", institutionId=", str6, ", institutionName=");
        Boxes$$ExternalSyntheticOutline1.m(m, str7, ", institutionSearchQuery=", str8, ", issueDescription=");
        Boxes$$ExternalSyntheticOutline1.m(m, str9, ", issueDetectedAt=", str10, ", issueId=");
        Boxes$$ExternalSyntheticOutline1.m(m, str11, ", linkSessionId=", str12, ", mfaType=");
        Boxes$$ExternalSyntheticOutline1.m(m, str13, ", requestId=", str14, ", selection=");
        Boxes$$ExternalSyntheticOutline1.m(m, str15, ", timestamp=", str16, ", viewName=");
        m.append(linkEventViewName);
        m.append(", metadataJson=");
        m.append(str17);
        m.append(", routingNumber=");
        Boxes$$ExternalSyntheticOutline1.m(m, str18, ", isUpdateMode=", str19, ", matchReason=");
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(m, str20, ", accountNumberMask=", str21, ")");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        parcel.getClass();
        parcel.writeString(this.brandName);
        parcel.writeString(this.errorCode);
        parcel.writeString(this.errorMessage);
        parcel.writeString(this.errorType);
        parcel.writeString(this.exitStatus);
        parcel.writeString(this.institutionId);
        parcel.writeString(this.institutionName);
        parcel.writeString(this.institutionSearchQuery);
        parcel.writeString(this.issueDescription);
        parcel.writeString(this.issueDetectedAt);
        parcel.writeString(this.issueId);
        parcel.writeString(this.linkSessionId);
        parcel.writeString(this.mfaType);
        parcel.writeString(this.requestId);
        parcel.writeString(this.selection);
        parcel.writeString(this.timestamp);
        parcel.writeParcelable(this.viewName, flags);
        parcel.writeString(this.metadataJson);
        parcel.writeString(this.routingNumber);
        parcel.writeString(this.isUpdateMode);
        parcel.writeString(this.matchReason);
        parcel.writeString(this.accountNumberMask);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\u0003\u001a\u00020\u00042\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0007¨\u0006\t"}, d2 = {"Lcom/plaid/link/event/LinkEventMetadata$Companion;", "", "()V", "fromMap", "Lcom/plaid/link/event/LinkEventMetadata;", "linkData", "", "", "linkSessionId", "link-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final LinkEventMetadata fromMap(Map<String, String> linkData, String linkSessionId) {
            linkData.getClass();
            String str = linkData.get("error_code");
            String str2 = linkData.get("error_message");
            String str3 = linkData.get("error_type");
            String str4 = linkData.get("exit_status");
            String str5 = linkData.get("institution_id");
            String str6 = linkData.get("institution_name");
            String str7 = linkData.get("institution_search_query");
            String str8 = linkData.get("issue_description");
            String str9 = linkData.get("issue_detected_at");
            String str10 = linkData.get("issue_id");
            String str11 = linkSessionId == null ? "" : linkSessionId;
            String str12 = linkData.get("mfa_type");
            String str13 = linkData.get("request_id");
            String str14 = str13 == null ? "" : str13;
            String str15 = linkData.containsKey("routing_number") ? linkData.get("routing_number") : null;
            String str16 = linkData.get("timestamp");
            String str17 = str16 == null ? "" : str16;
            LinkEventViewName fromString$link_sdk_release = LinkEventViewName.INSTANCE.fromString$link_sdk_release(linkData.get("view_name"));
            return new LinkEventMetadata(linkData.containsKey("brand_name") ? linkData.get("brand_name") : null, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str14, linkData.containsKey("selection") ? linkData.get("selection") : null, str17, fromString$link_sdk_release, linkData.get("metadata_json"), str15, linkData.containsKey("is_update_mode") ? linkData.get("is_update_mode") : null, linkData.containsKey("match_reason") ? linkData.get("match_reason") : null, linkData.containsKey("account_number_mask") ? linkData.get("account_number_mask") : null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LinkEventMetadata> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkEventMetadata createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new LinkEventMetadata(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (LinkEventViewName) parcel.readParcelable(LinkEventMetadata.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LinkEventMetadata[] newArray(int i) {
            return new LinkEventMetadata[i];
        }
    }

    public LinkEventMetadata(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, LinkEventViewName linkEventViewName, String str17, String str18, String str19, String str20, String str21) {
        str12.getClass();
        str16.getClass();
        this.brandName = str;
        this.errorCode = str2;
        this.errorMessage = str3;
        this.errorType = str4;
        this.exitStatus = str5;
        this.institutionId = str6;
        this.institutionName = str7;
        this.institutionSearchQuery = str8;
        this.issueDescription = str9;
        this.issueDetectedAt = str10;
        this.issueId = str11;
        this.linkSessionId = str12;
        this.mfaType = str13;
        this.requestId = str14;
        this.selection = str15;
        this.timestamp = str16;
        this.viewName = linkEventViewName;
        this.metadataJson = str17;
        this.routingNumber = str18;
        this.isUpdateMode = str19;
        this.matchReason = str20;
        this.accountNumberMask = str21;
    }
}
