package com.fidesmo.sec.delivery.models;

import android.content.Intent;
import android.net.Uri;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.google.gson.GsonBuilder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J(\u0010\u001b\u001a\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001cj\u0002`\u001e2\n\u0010\u001f\u001a\u00060\u0003j\u0002`\u001dR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006!"}, d2 = {"Lcom/fidesmo/sec/delivery/models/FpWebStepupReturn;", "", "result", "", "authentication_code", "status", "proofOfAuthentication", "reason", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthentication_code", "()Ljava/lang/String;", "getProofOfAuthentication", "getReason", "getResult", "getStatus", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "toUserDataResponse", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "Lcom/fidesmo/sec/delivery/models/UserDataResponse;", "dataRequirementId", "Companion", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FpWebStepupReturn {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String authentication_code;
    private final String proofOfAuthentication;
    private final String reason;
    private final String result;
    private final String status;

    public /* synthetic */ FpWebStepupReturn(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public static /* synthetic */ FpWebStepupReturn copy$default(FpWebStepupReturn fpWebStepupReturn, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fpWebStepupReturn.result;
        }
        if ((i & 2) != 0) {
            str2 = fpWebStepupReturn.authentication_code;
        }
        if ((i & 4) != 0) {
            str3 = fpWebStepupReturn.status;
        }
        if ((i & 8) != 0) {
            str4 = fpWebStepupReturn.proofOfAuthentication;
        }
        if ((i & 16) != 0) {
            str5 = fpWebStepupReturn.reason;
        }
        String str6 = str5;
        String str7 = str3;
        return fpWebStepupReturn.copy(str, str2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAuthentication_code() {
        return this.authentication_code;
    }

    /* renamed from: component3, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    /* renamed from: component4, reason: from getter */
    public final String getProofOfAuthentication() {
        return this.proofOfAuthentication;
    }

    /* renamed from: component5, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    public final FpWebStepupReturn copy(String result, String authentication_code, String status, String proofOfAuthentication, String reason) {
        return new FpWebStepupReturn(result, authentication_code, status, proofOfAuthentication, reason);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FpWebStepupReturn)) {
            return false;
        }
        FpWebStepupReturn fpWebStepupReturn = (FpWebStepupReturn) other;
        return Intrinsics.areEqual(this.result, fpWebStepupReturn.result) && Intrinsics.areEqual(this.authentication_code, fpWebStepupReturn.authentication_code) && Intrinsics.areEqual(this.status, fpWebStepupReturn.status) && Intrinsics.areEqual(this.proofOfAuthentication, fpWebStepupReturn.proofOfAuthentication) && Intrinsics.areEqual(this.reason, fpWebStepupReturn.reason);
    }

    public final String getAuthentication_code() {
        return this.authentication_code;
    }

    public final String getProofOfAuthentication() {
        return this.proofOfAuthentication;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getResult() {
        return this.result;
    }

    public final String getStatus() {
        return this.status;
    }

    public int hashCode() {
        String str = this.result;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authentication_code;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.status;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.proofOfAuthentication;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.reason;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FpWebStepupReturn(result=");
        sb.append(this.result);
        sb.append(", authentication_code=");
        sb.append(this.authentication_code);
        sb.append(", status=");
        sb.append(this.status);
        sb.append(", proofOfAuthentication=");
        sb.append(this.proofOfAuthentication);
        sb.append(", reason=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.reason, ')');
    }

    public final Map<String, String> toUserDataResponse(String dataRequirementId) {
        dataRequirementId.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String json = new GsonBuilder().create().toJson(this);
        json.getClass();
        linkedHashMap.put(dataRequirementId, json);
        return linkedHashMap;
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/fidesmo/sec/delivery/models/FpWebStepupReturn$Companion;", "", "()V", "fromWebActivationResponse", "Lcom/fidesmo/sec/delivery/models/FpWebStepupReturn;", "intent", "Landroid/content/Intent;", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FpWebStepupReturn fromWebActivationResponse(Intent intent) {
            Uri data = intent != null ? intent.getData() : null;
            return new FpWebStepupReturn(data != null ? data.getQueryParameter("stepupresponse") : null, data != null ? data.getQueryParameter("stepupauthcode") : null, data != null ? data.getQueryParameter("status") : null, data != null ? data.getQueryParameter("proofOfAuthentication") : null, data != null ? data.getQueryParameter("reason") : null);
        }

        private Companion() {
        }
    }

    public FpWebStepupReturn(String str, String str2, String str3, String str4, String str5) {
        this.result = str;
        this.authentication_code = str2;
        this.status = str3;
        this.proofOfAuthentication = str4;
        this.reason = str5;
    }

    public FpWebStepupReturn() {
        this(null, null, null, null, null, 31, null);
    }
}
