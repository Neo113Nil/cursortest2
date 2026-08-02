package ru.yandex.tankerapp.go.models;

import com.adjust.sdk.Constants;
import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.ysq0;
import java.io.Serializable;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0080\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u0007\u0010\u001aR\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u001c\u0010\u0016R\u001a\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\n\u0010\u001aR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0014\u001a\u0004\b\u001d\u0010\u0016R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0014\u001a\u0004\b\u001e\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0019\u001a\u0004\b\u000e\u0010\u001aR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0014\u001a\u0004\b \u0010\u0016R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b!\u0010\u0016R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0014\u001a\u0004\b\"\u0010\u0016¨\u0006#"}, d2 = {"Lru/yandex/tankerapp/go/models/HomeInitialModel;", "Ljava/io/Serializable;", "", "versionApp", "appName", "baseUrl", "", "isDark", "locale", "deviceName", "isBlackBox", "uuid", "deviceId", "phoneId", "isInternalTest", Constants.DEEPLINK, "goUserId", "promoMode", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getVersionApp", "()Ljava/lang/String;", "getAppName", "getBaseUrl", "Z", "()Z", "getLocale", "getDeviceName", "getUuid", "getDeviceId", "getPhoneId", "getDeeplink", "getGoUserId", "getPromoMode", "tanker_go_sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class HomeInitialModel implements Serializable {

    @ysq0("appName")
    private final String appName;

    @ysq0("baseUrl")
    private final String baseUrl;

    @ysq0(Constants.DEEPLINK)
    private final String deeplink;

    @ysq0("deviceId")
    private final String deviceId;

    @ysq0("deviceName")
    private final String deviceName;

    @ysq0("goUserId")
    private final String goUserId;

    @ysq0("isBlackBox")
    private final boolean isBlackBox;

    @ysq0("isDark")
    private final boolean isDark;

    @ysq0("isInternalTest")
    private final boolean isInternalTest;

    @ysq0("locale")
    private final String locale;

    @ysq0("phoneId")
    private final String phoneId;

    @ysq0("promoMode")
    private final String promoMode;

    @ysq0("uuid")
    private final String uuid;

    @ysq0("versionApp")
    private final String versionApp;

    public HomeInitialModel(String str, String str2, String str3, boolean z, String str4, String str5, boolean z2, String str6, String str7, String str8, boolean z3, String str9, String str10, String str11) {
        this.versionApp = str;
        this.appName = str2;
        this.baseUrl = str3;
        this.isDark = z;
        this.locale = str4;
        this.deviceName = str5;
        this.isBlackBox = z2;
        this.uuid = str6;
        this.deviceId = str7;
        this.phoneId = str8;
        this.isInternalTest = z3;
        this.deeplink = str9;
        this.goUserId = str10;
        this.promoMode = str11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HomeInitialModel)) {
            return false;
        }
        HomeInitialModel homeInitialModel = (HomeInitialModel) obj;
        return jl40.l(this.versionApp, homeInitialModel.versionApp) && jl40.l(this.appName, homeInitialModel.appName) && jl40.l(this.baseUrl, homeInitialModel.baseUrl) && this.isDark == homeInitialModel.isDark && jl40.l(this.locale, homeInitialModel.locale) && jl40.l(this.deviceName, homeInitialModel.deviceName) && this.isBlackBox == homeInitialModel.isBlackBox && jl40.l(this.uuid, homeInitialModel.uuid) && jl40.l(this.deviceId, homeInitialModel.deviceId) && jl40.l(this.phoneId, homeInitialModel.phoneId) && this.isInternalTest == homeInitialModel.isInternalTest && jl40.l(this.deeplink, homeInitialModel.deeplink) && jl40.l(this.goUserId, homeInitialModel.goUserId) && jl40.l(this.promoMode, homeInitialModel.promoMode);
    }

    public final int hashCode() {
        int e = unr0.e(unr0.b(unr0.b(unr0.e(unr0.b(unr0.b(this.versionApp.hashCode() * 31, 31, this.appName), 31, this.baseUrl), 31, this.isDark), 31, this.locale), 31, this.deviceName), 31, this.isBlackBox);
        String str = this.uuid;
        int hashCode = (e + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.deviceId;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.phoneId;
        int e2 = unr0.e((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.isInternalTest);
        String str4 = this.deeplink;
        int hashCode3 = (e2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.goUserId;
        int hashCode4 = (hashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.promoMode;
        return hashCode4 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.versionApp;
        String str2 = this.appName;
        String str3 = this.baseUrl;
        boolean z = this.isDark;
        String str4 = this.locale;
        String str5 = this.deviceName;
        boolean z2 = this.isBlackBox;
        String str6 = this.uuid;
        String str7 = this.deviceId;
        String str8 = this.phoneId;
        boolean z3 = this.isInternalTest;
        String str9 = this.deeplink;
        String str10 = this.goUserId;
        String str11 = this.promoMode;
        StringBuilder v = b64.v("HomeInitialModel(versionApp=", str, ", appName=", str2, ", baseUrl=");
        tse0.y(str3, ", isDark=", ", locale=", v, z);
        g8e.D(v, str4, ", deviceName=", str5, ", isBlackBox=");
        unr0.A(", uuid=", str6, ", deviceId=", v, z2);
        g8e.D(v, str7, ", phoneId=", str8, ", isInternalTest=");
        unr0.A(", deeplink=", str9, ", goUserId=", v, z3);
        return g8e.r(v, str10, ", promoMode=", str11, Extension.C_BRAKE);
    }
}
