package com.fidesmo.sec.delivery.models;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import com.google.gson.GsonBuilder;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000  2\u00020\u0001:\u0001 BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003JE\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J(\u0010\u001b\u001a\u0018\u0012\b\u0012\u00060\u0003j\u0002`\u001d\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u001cj\u0002`\u001e2\n\u0010\u001f\u001a\u00060\u0003j\u0002`\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006!"}, d2 = {"Lcom/fidesmo/sec/delivery/models/FpAppStepupReturn;", "", "result", "", "authentication_code", "issuerMobileAppAuthResponse", "TAV", "tokenUniqueReference", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTAV", "()Ljava/lang/String;", "getAuthentication_code", "getIssuerMobileAppAuthResponse", "getResult", "getTokenUniqueReference", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "toUserDataResponse", "", "Lcom/fidesmo/sec/delivery/models/DataRequirementId;", "Lcom/fidesmo/sec/delivery/models/UserDataResponse;", "dataRequirementId", "Companion", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FpAppStepupReturn {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String TAV;
    private final String authentication_code;
    private final String issuerMobileAppAuthResponse;
    private final String result;
    private final String tokenUniqueReference;

    public /* synthetic */ FpAppStepupReturn(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    public static /* synthetic */ FpAppStepupReturn copy$default(FpAppStepupReturn fpAppStepupReturn, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = fpAppStepupReturn.result;
        }
        if ((i & 2) != 0) {
            str2 = fpAppStepupReturn.authentication_code;
        }
        if ((i & 4) != 0) {
            str3 = fpAppStepupReturn.issuerMobileAppAuthResponse;
        }
        if ((i & 8) != 0) {
            str4 = fpAppStepupReturn.TAV;
        }
        if ((i & 16) != 0) {
            str5 = fpAppStepupReturn.tokenUniqueReference;
        }
        String str6 = str5;
        String str7 = str3;
        return fpAppStepupReturn.copy(str, str2, str7, str4, str6);
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
    public final String getIssuerMobileAppAuthResponse() {
        return this.issuerMobileAppAuthResponse;
    }

    /* renamed from: component4, reason: from getter */
    public final String getTAV() {
        return this.TAV;
    }

    /* renamed from: component5, reason: from getter */
    public final String getTokenUniqueReference() {
        return this.tokenUniqueReference;
    }

    public final FpAppStepupReturn copy(String result, String authentication_code, String issuerMobileAppAuthResponse, String TAV, String tokenUniqueReference) {
        return new FpAppStepupReturn(result, authentication_code, issuerMobileAppAuthResponse, TAV, tokenUniqueReference);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FpAppStepupReturn)) {
            return false;
        }
        FpAppStepupReturn fpAppStepupReturn = (FpAppStepupReturn) other;
        return Intrinsics.areEqual(this.result, fpAppStepupReturn.result) && Intrinsics.areEqual(this.authentication_code, fpAppStepupReturn.authentication_code) && Intrinsics.areEqual(this.issuerMobileAppAuthResponse, fpAppStepupReturn.issuerMobileAppAuthResponse) && Intrinsics.areEqual(this.TAV, fpAppStepupReturn.TAV) && Intrinsics.areEqual(this.tokenUniqueReference, fpAppStepupReturn.tokenUniqueReference);
    }

    public final String getAuthentication_code() {
        return this.authentication_code;
    }

    public final String getIssuerMobileAppAuthResponse() {
        return this.issuerMobileAppAuthResponse;
    }

    public final String getResult() {
        return this.result;
    }

    public final String getTAV() {
        return this.TAV;
    }

    public final String getTokenUniqueReference() {
        return this.tokenUniqueReference;
    }

    public int hashCode() {
        String str = this.result;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authentication_code;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.issuerMobileAppAuthResponse;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.TAV;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.tokenUniqueReference;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("FpAppStepupReturn(result=");
        sb.append(this.result);
        sb.append(", authentication_code=");
        sb.append(this.authentication_code);
        sb.append(", issuerMobileAppAuthResponse=");
        sb.append(this.issuerMobileAppAuthResponse);
        sb.append(", TAV=");
        sb.append(this.TAV);
        sb.append(", tokenUniqueReference=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.tokenUniqueReference, ')');
    }

    public final Map<String, String> toUserDataResponse(String dataRequirementId) {
        dataRequirementId.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String json = new GsonBuilder().create().toJson(this);
        json.getClass();
        linkedHashMap.put(dataRequirementId, json);
        return linkedHashMap;
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u0012\u0010\u0007\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006\b"}, d2 = {"Lcom/fidesmo/sec/delivery/models/FpAppStepupReturn$Companion;", "", "()V", "fromAuthenticationResponse", "Lcom/fidesmo/sec/delivery/models/FpAppStepupReturn;", "intent", "Landroid/content/Intent;", "fromWebActivationResponse", "sec-client-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FpAppStepupReturn fromAuthenticationResponse(Intent intent) {
            Bundle extras;
            Bundle extras2;
            Bundle extras3;
            Bundle extras4;
            Bundle extras5;
            String str = null;
            String string2 = (intent == null || (extras5 = intent.getExtras()) == null) ? null : extras5.getString("STEP_UP_RESPONSE");
            String string3 = (intent == null || (extras4 = intent.getExtras()) == null) ? null : extras4.getString("STEP_UP_AUTH_CODE");
            String string4 = (intent == null || (extras3 = intent.getExtras()) == null) ? null : extras3.getString("issuerMobileAppAuthResponse");
            String string5 = (intent == null || (extras2 = intent.getExtras()) == null) ? null : extras2.getString("TAV");
            if (intent != null && (extras = intent.getExtras()) != null) {
                str = extras.getString("tokenUniqueReference");
            }
            return new FpAppStepupReturn(string2, string3, string4, string5, str);
        }

        @Deprecated
        public final FpAppStepupReturn fromWebActivationResponse(Intent intent) {
            Uri data = intent != null ? intent.getData() : null;
            return new FpAppStepupReturn(data != null ? data.getQueryParameter("stepupresponse") : null, data != null ? data.getQueryParameter("stepupauthcode") : null, null, null, null, 28, null);
        }

        private Companion() {
        }
    }

    public FpAppStepupReturn(String str, String str2, String str3, String str4, String str5) {
        this.result = str;
        this.authentication_code = str2;
        this.issuerMobileAppAuthResponse = str3;
        this.TAV = str4;
        this.tokenUniqueReference = str5;
    }

    public FpAppStepupReturn() {
        this(null, null, null, null, null, 31, null);
    }
}
