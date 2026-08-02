package ru.yandex.tankerapp.go.sdk.models;

import com.adjust.sdk.Constants;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.unr0;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0086\b\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0004\u001a\u0004\b\u0011\u0010\u0006R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0004\u001a\u0004\b\u0015\u0010\u0006R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0004\u001a\u0004\b\u0017\u0010\u0006R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0006R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0004\u001a\u0004\b\u001d\u0010\u0006R\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006¨\u0006 "}, d2 = {"Lru/yandex/tankerapp/go/sdk/models/CartechInitialData;", "Ljava/io/Serializable;", "", "versionApp", "Ljava/lang/String;", "k", "()Ljava/lang/String;", "appName", "a", "", "isTesting", "Z", "n", "()Z", "isDarkTheme", "l", "locale", "g", "uuid", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "deviceId", "c", "phoneId", "h", "isInternalTest", "m", "goUserId", "f", "promoMode", CoreConstants.PushMessage.SERVICE_TYPE, Constants.DEEPLINK, "b", "tanker_go_sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class CartechInitialData implements Serializable {
    private final String appName;
    private final String deeplink;
    private final String deviceId;
    private final String goUserId;
    private final boolean isDarkTheme;
    private final String locale;
    private final String phoneId;
    private final String uuid;
    private final String versionApp;
    private final boolean isTesting = false;
    private final boolean isInternalTest = false;
    private final String promoMode = null;

    public CartechInitialData(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, String str8) {
        this.versionApp = str;
        this.appName = str2;
        this.isDarkTheme = z;
        this.locale = str3;
        this.uuid = str4;
        this.deviceId = str5;
        this.phoneId = str6;
        this.goUserId = str7;
        this.deeplink = str8;
    }

    /* renamed from: a, reason: from getter */
    public final String getAppName() {
        return this.appName;
    }

    /* renamed from: b, reason: from getter */
    public final String getDeeplink() {
        return this.deeplink;
    }

    /* renamed from: c, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartechInitialData)) {
            return false;
        }
        CartechInitialData cartechInitialData = (CartechInitialData) obj;
        return jl40.l(this.versionApp, cartechInitialData.versionApp) && jl40.l(this.appName, cartechInitialData.appName) && this.isTesting == cartechInitialData.isTesting && this.isDarkTheme == cartechInitialData.isDarkTheme && jl40.l(this.locale, cartechInitialData.locale) && jl40.l(this.uuid, cartechInitialData.uuid) && jl40.l(this.deviceId, cartechInitialData.deviceId) && jl40.l(this.phoneId, cartechInitialData.phoneId) && this.isInternalTest == cartechInitialData.isInternalTest && jl40.l(this.goUserId, cartechInitialData.goUserId) && jl40.l(this.promoMode, cartechInitialData.promoMode) && jl40.l(this.deeplink, cartechInitialData.deeplink);
    }

    /* renamed from: f, reason: from getter */
    public final String getGoUserId() {
        return this.goUserId;
    }

    /* renamed from: g, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* renamed from: h, reason: from getter */
    public final String getPhoneId() {
        return this.phoneId;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.e(unr0.e(unr0.b(this.versionApp.hashCode() * 31, 31, this.appName), 31, this.isTesting), 31, this.isDarkTheme), 31, this.locale);
        String str = this.uuid;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneId;
        int e = unr0.e((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isInternalTest);
        String str4 = this.goUserId;
        int hashCode3 = (e + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.promoMode;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.deeplink;
        return hashCode4 + (str6 != null ? str6.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final String getPromoMode() {
        return this.promoMode;
    }

    /* renamed from: j, reason: from getter */
    public final String getUuid() {
        return this.uuid;
    }

    /* renamed from: k, reason: from getter */
    public final String getVersionApp() {
        return this.versionApp;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getIsDarkTheme() {
        return this.isDarkTheme;
    }

    /* renamed from: m, reason: from getter */
    public final boolean getIsInternalTest() {
        return this.isInternalTest;
    }

    /* renamed from: n, reason: from getter */
    public final boolean getIsTesting() {
        return this.isTesting;
    }

    public final String toString() {
        String str = this.versionApp;
        String str2 = this.appName;
        boolean z = this.isTesting;
        boolean z2 = this.isDarkTheme;
        String str3 = this.locale;
        String str4 = this.uuid;
        String str5 = this.deviceId;
        String str6 = this.phoneId;
        boolean z3 = this.isInternalTest;
        String str7 = this.goUserId;
        String str8 = this.promoMode;
        String str9 = this.deeplink;
        StringBuilder v = b64.v("CartechInitialData(versionApp=", str, ", appName=", str2, ", isTesting=");
        nnm.v(", isDarkTheme=", ", locale=", v, z, z2);
        g8e.D(v, str3, ", uuid=", str4, ", deviceId=");
        g8e.D(v, str5, ", phoneId=", str6, ", isInternalTest=");
        unr0.A(", goUserId=", str7, ", promoMode=", v, z3);
        return g8e.r(v, str8, ", deeplink=", str9, Extension.C_BRAKE);
    }
}
