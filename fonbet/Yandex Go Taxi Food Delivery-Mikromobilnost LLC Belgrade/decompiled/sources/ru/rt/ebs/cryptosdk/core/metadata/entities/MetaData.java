package ru.rt.ebs.cryptosdk.core.metadata.entities;

import defpackage.b64;
import defpackage.g8e;
import defpackage.jl40;
import defpackage.m2a1;
import defpackage.ysq0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\bM\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0003HÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\u0003HÆ\u0003J\t\u0010B\u001a\u00020\u0003HÆ\u0003J\t\u0010C\u001a\u00020\u0003HÆ\u0003J\t\u0010D\u001a\u00020\u0003HÆ\u0003J\t\u0010E\u001a\u00020\u0003HÆ\u0003J\t\u0010F\u001a\u00020\u0003HÆ\u0003J\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0003HÆ\u0003J\t\u0010J\u001a\u00020\u0003HÆ\u0003J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0003HÆ\u0003J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J½\u0001\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0003HÆ\u0001J\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010S\u001a\u00020THÖ\u0001J\t\u0010U\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0018\"\u0004\b\"\u0010\u001aR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0018\"\u0004\b$\u0010\u001aR\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0018\"\u0004\b&\u0010\u001aR\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0018\"\u0004\b(\u0010\u001aR\u001e\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0018\"\u0004\b*\u0010\u001aR\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0018\"\u0004\b,\u0010\u001aR\u001e\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0018\"\u0004\b.\u0010\u001aR\u001e\u0010\u000e\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0018\"\u0004\b0\u0010\u001aR\u001e\u0010\u000f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0018\"\u0004\b2\u0010\u001aR\u001e\u0010\u0010\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u0018\"\u0004\b4\u0010\u001aR\u001e\u0010\u0011\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0018\"\u0004\b6\u0010\u001aR\u001e\u0010\u0012\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0018\"\u0004\b8\u0010\u001aR\u001e\u0010\u0013\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u0018\"\u0004\b:\u0010\u001aR\u001e\u0010\u0014\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0018\"\u0004\b<\u0010\u001a¨\u0006V"}, d2 = {"Lru/rt/ebs/cryptosdk/core/metadata/entities/MetaData;", "", MetaDataField.DATE_FIELD, "", "timezone", MetaDataField.GEOLOCATION_FIELD, "operatingSystem", MetaDataField.ISP_FIELD, "advertisingId", MetaDataField.SCREEN_FIELD, MetaDataField.DPI_FIELD, "cameraId", "locale", "deviceSerial", MetaDataField.IMEI_FIELD, "deviceId", "deviceManufacturer", "deviceModel", "deviceCpu", MetaDataField.SIM, MetaDataField.ROOTED, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getTimezone", "setTimezone", "getGeolocation", "setGeolocation", "getOperatingSystem", "setOperatingSystem", "getIsp", "setIsp", "getAdvertisingId", "setAdvertisingId", "getScreen", "setScreen", "getDpi", "setDpi", "getCameraId", "setCameraId", "getLocale", "setLocale", "getDeviceSerial", "setDeviceSerial", "getImei", "setImei", "getDeviceId", "setDeviceId", "getDeviceManufacturer", "setDeviceManufacturer", "getDeviceModel", "setDeviceModel", "getDeviceCpu", "setDeviceCpu", "getSim", "setSim", "getRooted", "setRooted", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "", "other", "hashCode", "", "toString", "cryptosdk-core_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MetaData {

    @ysq0(MetaDataField.ADVERTISING_ID_FIELD)
    private String advertisingId;

    @ysq0(MetaDataField.CAMERA_ID_FIELD)
    private String cameraId;

    @ysq0(MetaDataField.DATE_FIELD)
    private String date;

    @ysq0(MetaDataField.DEVICE_CPU)
    private String deviceCpu;

    @ysq0(MetaDataField.DEVICE_ID_FIELD)
    private String deviceId;

    @ysq0(MetaDataField.DEVICE_MANUFACTURER_FIELD)
    private String deviceManufacturer;

    @ysq0(MetaDataField.DEVICE_MODEL_FIELD)
    private String deviceModel;

    @ysq0(MetaDataField.DEVICE_SERIAL_FIELD)
    private String deviceSerial;

    @ysq0(MetaDataField.DPI_FIELD)
    private String dpi;

    @ysq0(MetaDataField.GEOLOCATION_FIELD)
    private String geolocation;

    @ysq0(MetaDataField.IMEI_FIELD)
    private String imei;

    @ysq0(MetaDataField.ISP_FIELD)
    private String isp;

    @ysq0("locale")
    private String locale;

    @ysq0(MetaDataField.OPERATING_SYSTEM_FIELD)
    private String operatingSystem;

    @ysq0(MetaDataField.ROOTED)
    private String rooted;

    @ysq0(MetaDataField.SCREEN_FIELD)
    private String screen;

    @ysq0(MetaDataField.SIM)
    private String sim;

    @ysq0(MetaDataField.TIME_ZONE_FIELD)
    private String timezone;

    public /* synthetic */ MetaData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "unknown" : str, (i & 2) != 0 ? "unknown" : str2, (i & 4) != 0 ? "unknown" : str3, (i & 8) != 0 ? "unknown" : str4, (i & 16) != 0 ? "unknown" : str5, (i & 32) != 0 ? "unknown" : str6, (i & 64) != 0 ? "unknown" : str7, (i & 128) != 0 ? "unknown" : str8, (i & 256) != 0 ? "unknown" : str9, (i & 512) != 0 ? "unknown" : str10, (i & 1024) != 0 ? "unknown" : str11, (i & 2048) != 0 ? "unknown" : str12, (i & 4096) != 0 ? "unknown" : str13, (i & 8192) != 0 ? "unknown" : str14, (i & 16384) != 0 ? "unknown" : str15, (i & 32768) != 0 ? "unknown" : str16, (i & 65536) != 0 ? "unknown" : str17, (i & 131072) != 0 ? "unknown" : str18);
    }

    public static /* synthetic */ MetaData copy$default(MetaData metaData, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, Object obj) {
        String str19;
        String str20;
        String str21 = (i & 1) != 0 ? metaData.date : str;
        String str22 = (i & 2) != 0 ? metaData.timezone : str2;
        String str23 = (i & 4) != 0 ? metaData.geolocation : str3;
        String str24 = (i & 8) != 0 ? metaData.operatingSystem : str4;
        String str25 = (i & 16) != 0 ? metaData.isp : str5;
        String str26 = (i & 32) != 0 ? metaData.advertisingId : str6;
        String str27 = (i & 64) != 0 ? metaData.screen : str7;
        String str28 = (i & 128) != 0 ? metaData.dpi : str8;
        String str29 = (i & 256) != 0 ? metaData.cameraId : str9;
        String str30 = (i & 512) != 0 ? metaData.locale : str10;
        String str31 = (i & 1024) != 0 ? metaData.deviceSerial : str11;
        String str32 = (i & 2048) != 0 ? metaData.imei : str12;
        String str33 = (i & 4096) != 0 ? metaData.deviceId : str13;
        String str34 = (i & 8192) != 0 ? metaData.deviceManufacturer : str14;
        String str35 = str21;
        String str36 = (i & 16384) != 0 ? metaData.deviceModel : str15;
        String str37 = (i & 32768) != 0 ? metaData.deviceCpu : str16;
        String str38 = (i & 65536) != 0 ? metaData.sim : str17;
        if ((i & 131072) != 0) {
            str20 = str38;
            str19 = metaData.rooted;
        } else {
            str19 = str18;
            str20 = str38;
        }
        return metaData.copy(str35, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str36, str37, str20, str19);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* renamed from: component10, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* renamed from: component11, reason: from getter */
    public final String getDeviceSerial() {
        return this.deviceSerial;
    }

    /* renamed from: component12, reason: from getter */
    public final String getImei() {
        return this.imei;
    }

    /* renamed from: component13, reason: from getter */
    public final String getDeviceId() {
        return this.deviceId;
    }

    /* renamed from: component14, reason: from getter */
    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    /* renamed from: component15, reason: from getter */
    public final String getDeviceModel() {
        return this.deviceModel;
    }

    /* renamed from: component16, reason: from getter */
    public final String getDeviceCpu() {
        return this.deviceCpu;
    }

    /* renamed from: component17, reason: from getter */
    public final String getSim() {
        return this.sim;
    }

    /* renamed from: component18, reason: from getter */
    public final String getRooted() {
        return this.rooted;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTimezone() {
        return this.timezone;
    }

    /* renamed from: component3, reason: from getter */
    public final String getGeolocation() {
        return this.geolocation;
    }

    /* renamed from: component4, reason: from getter */
    public final String getOperatingSystem() {
        return this.operatingSystem;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIsp() {
        return this.isp;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    /* renamed from: component7, reason: from getter */
    public final String getScreen() {
        return this.screen;
    }

    /* renamed from: component8, reason: from getter */
    public final String getDpi() {
        return this.dpi;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCameraId() {
        return this.cameraId;
    }

    public final MetaData copy(String date, String timezone, String geolocation, String operatingSystem, String isp, String advertisingId, String screen, String dpi, String cameraId, String locale, String deviceSerial, String imei, String deviceId, String deviceManufacturer, String deviceModel, String deviceCpu, String sim, String rooted) {
        return new MetaData(date, timezone, geolocation, operatingSystem, isp, advertisingId, screen, dpi, cameraId, locale, deviceSerial, imei, deviceId, deviceManufacturer, deviceModel, deviceCpu, sim, rooted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MetaData)) {
            return false;
        }
        MetaData metaData = (MetaData) other;
        return jl40.l(this.date, metaData.date) && jl40.l(this.timezone, metaData.timezone) && jl40.l(this.geolocation, metaData.geolocation) && jl40.l(this.operatingSystem, metaData.operatingSystem) && jl40.l(this.isp, metaData.isp) && jl40.l(this.advertisingId, metaData.advertisingId) && jl40.l(this.screen, metaData.screen) && jl40.l(this.dpi, metaData.dpi) && jl40.l(this.cameraId, metaData.cameraId) && jl40.l(this.locale, metaData.locale) && jl40.l(this.deviceSerial, metaData.deviceSerial) && jl40.l(this.imei, metaData.imei) && jl40.l(this.deviceId, metaData.deviceId) && jl40.l(this.deviceManufacturer, metaData.deviceManufacturer) && jl40.l(this.deviceModel, metaData.deviceModel) && jl40.l(this.deviceCpu, metaData.deviceCpu) && jl40.l(this.sim, metaData.sim) && jl40.l(this.rooted, metaData.rooted);
    }

    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    public final String getCameraId() {
        return this.cameraId;
    }

    public final String getDate() {
        return this.date;
    }

    public final String getDeviceCpu() {
        return this.deviceCpu;
    }

    public final String getDeviceId() {
        return this.deviceId;
    }

    public final String getDeviceManufacturer() {
        return this.deviceManufacturer;
    }

    public final String getDeviceModel() {
        return this.deviceModel;
    }

    public final String getDeviceSerial() {
        return this.deviceSerial;
    }

    public final String getDpi() {
        return this.dpi;
    }

    public final String getGeolocation() {
        return this.geolocation;
    }

    public final String getImei() {
        return this.imei;
    }

    public final String getIsp() {
        return this.isp;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getOperatingSystem() {
        return this.operatingSystem;
    }

    public final String getRooted() {
        return this.rooted;
    }

    public final String getScreen() {
        return this.screen;
    }

    public final String getSim() {
        return this.sim;
    }

    public final String getTimezone() {
        return this.timezone;
    }

    public int hashCode() {
        return this.rooted.hashCode() + m2a1.a(this.sim, m2a1.a(this.deviceCpu, m2a1.a(this.deviceModel, m2a1.a(this.deviceManufacturer, m2a1.a(this.deviceId, m2a1.a(this.imei, m2a1.a(this.deviceSerial, m2a1.a(this.locale, m2a1.a(this.cameraId, m2a1.a(this.dpi, m2a1.a(this.screen, m2a1.a(this.advertisingId, m2a1.a(this.isp, m2a1.a(this.operatingSystem, m2a1.a(this.geolocation, m2a1.a(this.timezone, this.date.hashCode() * 31))))))))))))))));
    }

    public final void setAdvertisingId(String str) {
        this.advertisingId = str;
    }

    public final void setCameraId(String str) {
        this.cameraId = str;
    }

    public final void setDate(String str) {
        this.date = str;
    }

    public final void setDeviceCpu(String str) {
        this.deviceCpu = str;
    }

    public final void setDeviceId(String str) {
        this.deviceId = str;
    }

    public final void setDeviceManufacturer(String str) {
        this.deviceManufacturer = str;
    }

    public final void setDeviceModel(String str) {
        this.deviceModel = str;
    }

    public final void setDeviceSerial(String str) {
        this.deviceSerial = str;
    }

    public final void setDpi(String str) {
        this.dpi = str;
    }

    public final void setGeolocation(String str) {
        this.geolocation = str;
    }

    public final void setImei(String str) {
        this.imei = str;
    }

    public final void setIsp(String str) {
        this.isp = str;
    }

    public final void setLocale(String str) {
        this.locale = str;
    }

    public final void setOperatingSystem(String str) {
        this.operatingSystem = str;
    }

    public final void setRooted(String str) {
        this.rooted = str;
    }

    public final void setScreen(String str) {
        this.screen = str;
    }

    public final void setSim(String str) {
        this.sim = str;
    }

    public final void setTimezone(String str) {
        this.timezone = str;
    }

    public String toString() {
        String str = this.date;
        String str2 = this.timezone;
        String str3 = this.geolocation;
        String str4 = this.operatingSystem;
        String str5 = this.isp;
        String str6 = this.advertisingId;
        String str7 = this.screen;
        String str8 = this.dpi;
        String str9 = this.cameraId;
        String str10 = this.locale;
        String str11 = this.deviceSerial;
        String str12 = this.imei;
        String str13 = this.deviceId;
        String str14 = this.deviceManufacturer;
        String str15 = this.deviceModel;
        String str16 = this.deviceCpu;
        String str17 = this.sim;
        String str18 = this.rooted;
        StringBuilder v = b64.v("MetaData(date=", str, ", timezone=", str2, ", geolocation=");
        g8e.D(v, str3, ", operatingSystem=", str4, ", isp=");
        g8e.D(v, str5, ", advertisingId=", str6, ", screen=");
        g8e.D(v, str7, ", dpi=", str8, ", cameraId=");
        g8e.D(v, str9, ", locale=", str10, ", deviceSerial=");
        g8e.D(v, str11, ", imei=", str12, ", deviceId=");
        g8e.D(v, str13, ", deviceManufacturer=", str14, ", deviceModel=");
        g8e.D(v, str15, ", deviceCpu=", str16, ", sim=");
        return g8e.r(v, str17, ", rooted=", str18, Extension.C_BRAKE);
    }

    public MetaData(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18) {
        this.date = str;
        this.timezone = str2;
        this.geolocation = str3;
        this.operatingSystem = str4;
        this.isp = str5;
        this.advertisingId = str6;
        this.screen = str7;
        this.dpi = str8;
        this.cameraId = str9;
        this.locale = str10;
        this.deviceSerial = str11;
        this.imei = str12;
        this.deviceId = str13;
        this.deviceManufacturer = str14;
        this.deviceModel = str15;
        this.deviceCpu = str16;
        this.sim = str17;
        this.rooted = str18;
    }

    public MetaData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
    }
}
