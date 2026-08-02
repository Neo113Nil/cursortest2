package com.yandex.pulse.metrics;

import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import defpackage.a0s;
import defpackage.b0s;
import defpackage.bye;
import defpackage.c0s;
import defpackage.c8;
import defpackage.d0s;
import defpackage.ipe;
import defpackage.j3d;
import defpackage.mse;
import defpackage.n3d;
import defpackage.n7k;
import defpackage.nn3;
import defpackage.nse;
import defpackage.o3d;
import defpackage.ose;
import defpackage.qr4;
import defpackage.rse;
import defpackage.rzr;
import defpackage.sxf;
import defpackage.szr;
import defpackage.tzr;
import defpackage.u8;
import defpackage.uzr;
import defpackage.vzr;
import defpackage.wzr;
import defpackage.xzh;
import defpackage.xzr;
import defpackage.yzr;
import defpackage.z0c;
import defpackage.zzr;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* loaded from: classes5.dex */
public final class o extends o3d implements xzh {
    public static final int ANTIVIRUS_PRODUCT_FIELD_NUMBER = 23;
    public static final int APPLICATION_LOCALE_FIELD_NUMBER = 4;
    public static final int APP_PACKAGE_NAME_ALLOWLIST_FILTER_FIELD_NUMBER = 42;
    public static final int APP_PACKAGE_NAME_FIELD_NUMBER = 26;
    public static final int APP_VERSION_FIELD_NUMBER = 2;
    public static final int BRAND_CODE_FIELD_NUMBER = 12;
    public static final int BUILD_TIMESTAMP_FIELD_NUMBER = 1;
    public static final int CHANNEL_FIELD_NUMBER = 10;
    public static final int CHROME_COMPONENT_FIELD_NUMBER = 24;
    public static final int CLIENT_ID_WAS_USED_FOR_TRIAL_ASSIGNMENT_FIELD_NUMBER = 33;
    public static final int CLIENT_SIDE_SAMPLING_STATUS_FIELD_NUMBER = 43;
    public static final int CLIENT_UUID_FIELD_NUMBER = 34;
    public static final int CLONED_INSTALL_INFO_FIELD_NUMBER = 39;
    public static final int COMMAND_LINE_KEY_HASH_FIELD_NUMBER = 38;
    private static final o DEFAULT_INSTANCE;
    public static final int DEMO_MODE_DIMENSIONS_FIELD_NUMBER = 41;
    public static final int EXTERNAL_ACCESS_POINT_FIELD_NUMBER = 15;
    public static final int EXTERNAL_AUDIO_VIDEO_DEVICE_FIELD_NUMBER = 14;
    public static final int FIELD_TRIAL_FIELD_NUMBER = 9;
    public static final int GOOGLE_UPDATE_FIELD_NUMBER = 11;
    public static final int HARDWARE_FIELD_NUMBER = 6;
    public static final int INSTALLER_PACKAGE_FIELD_NUMBER = 35;
    public static final int INSTALL_DATE_FIELD_NUMBER = 16;
    public static final int IS_EXTENDED_STABLE_CHANNEL_FIELD_NUMBER = 36;
    public static final int IS_INSTRUMENTED_BUILD_FIELD_NUMBER = 20;
    public static final int LINKED_ANDROID_PHONE_DATA_FIELD_NUMBER = 29;
    public static final int LOG_WRITTEN_BY_APP_VERSION_FIELD_NUMBER = 40;
    public static final int LOW_ENTROPY_SOURCE_FIELD_NUMBER = 31;
    public static final int LTS_CHANNEL_FIELD_NUMBER = 45;
    public static final int METRICS_FILTERING_STATUS_FIELD_NUMBER = 44;
    public static final int MULTI_PROFILE_USER_COUNT_FIELD_NUMBER = 17;
    public static final int NETWORK_FIELD_NUMBER = 13;
    public static final int OCCUPIED_EXTENSION_BUCKET_FIELD_NUMBER = 18;
    public static final int OFFSTORE_EXTENSIONS_STATE_FIELD_NUMBER = 19;
    public static final int OLD_LOW_ENTROPY_SOURCE_FIELD_NUMBER = 32;
    public static final int OS_FIELD_NUMBER = 5;
    private static volatile n7k PARSER = null;
    public static final int PSEUDO_LOW_ENTROPY_SOURCE_FIELD_NUMBER = 37;
    public static final int SESSION_HASH_FIELD_NUMBER = 46;
    public static final int STABILITY_FIELD_NUMBER = 8;
    public static final int TPM_IDENTIFIER_FIELD_NUMBER = 47;
    public static final int UMA_DEFAULT_STATE_FIELD_NUMBER = 22;
    public static final int UMA_ENABLED_DATE_FIELD_NUMBER = 3;
    public static final int VARIATIONS_SEED_VERSION_FIELD_NUMBER = 28;
    public static final int YA_FIELD_NUMBER = 1000;
    private int appPackageNameAllowlistFilter_;
    private int bitField0_;
    private int bitField1_;
    private long buildTimestamp_;
    private int channel_;
    private boolean clientIdWasUsedForTrialAssignment_;
    private int clientSideSamplingStatus_;
    private c clonedInstallInfo_;
    private d demoModeDimensions_;
    private e externalAccessPoint_;
    private h googleUpdate_;
    private i hardware_;
    private long installDate_;
    private int installerPackage_;
    private boolean isExtendedStableChannel_;
    private boolean isInstrumentedBuild_;
    private j linkedAndroidPhoneData_;
    private int lowEntropySource_;
    private int ltsChannel_;
    private int metricsFilteringStatus_;
    private int multiProfileUserCount_;
    private k network_;
    private int offstoreExtensionsState_;
    private int oldLowEntropySource_;
    private l os_;
    private int pseudoLowEntropySource_;
    private long sessionHash_;
    private m stability_;
    private n tpmIdentifier_;
    private int umaDefaultState_;
    private long umaEnabledDate_;
    private C0020o ya_;
    private int commandLineKeyHashMemoizedSerializedSize = -1;
    private String appVersion_ = "";
    private String logWrittenByAppVersion_ = "";
    private String brandCode_ = "";
    private String applicationLocale_ = "";
    private mse commandLineKeyHash_ = o3d.emptyIntList();
    private rse fieldTrial_ = o3d.emptyProtobufList();
    private String variationsSeedVersion_ = "";
    private String clientUuid_ = "";
    private rse externalAudioVideoDevice_ = o3d.emptyProtobufList();
    private mse occupiedExtensionBucket_ = o3d.emptyIntList();
    private rse antivirusProduct_ = o3d.emptyProtobufList();
    private rse chromeComponent_ = o3d.emptyProtobufList();
    private String appPackageName_ = "";

    static {
        o oVar = new o();
        DEFAULT_INSTANCE = oVar;
        o3d.registerDefaultInstance(o.class, oVar);
    }

    private o() {
    }

    private void addAllAntivirusProduct(Iterable<? extends a> iterable) {
        ensureAntivirusProductIsMutable();
        c8.addAll(iterable, this.antivirusProduct_);
    }

    private void addAllChromeComponent(Iterable<? extends b> iterable) {
        ensureChromeComponentIsMutable();
        c8.addAll(iterable, this.chromeComponent_);
    }

    private void addAllCommandLineKeyHash(Iterable<? extends Integer> iterable) {
        ensureCommandLineKeyHashIsMutable();
        c8.addAll(iterable, this.commandLineKeyHash_);
    }

    private void addAllExternalAudioVideoDevice(Iterable<? extends f> iterable) {
        ensureExternalAudioVideoDeviceIsMutable();
        c8.addAll(iterable, this.externalAudioVideoDevice_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllFieldTrial(Iterable<? extends g> iterable) {
        ensureFieldTrialIsMutable();
        c8.addAll(iterable, this.fieldTrial_);
    }

    private void addAllOccupiedExtensionBucket(Iterable<? extends Integer> iterable) {
        ensureOccupiedExtensionBucketIsMutable();
        c8.addAll(iterable, this.occupiedExtensionBucket_);
    }

    private void addAntivirusProduct(a aVar) {
        aVar.getClass();
        ensureAntivirusProductIsMutable();
        this.antivirusProduct_.add(aVar);
    }

    private void addChromeComponent(b bVar) {
        bVar.getClass();
        ensureChromeComponentIsMutable();
        this.chromeComponent_.add(bVar);
    }

    private void addCommandLineKeyHash(int i2) {
        ensureCommandLineKeyHashIsMutable();
        ((ipe) this.commandLineKeyHash_).g(i2);
    }

    private void addExternalAudioVideoDevice(f fVar) {
        fVar.getClass();
        ensureExternalAudioVideoDeviceIsMutable();
        this.externalAudioVideoDevice_.add(fVar);
    }

    private void addFieldTrial(g gVar) {
        gVar.getClass();
        ensureFieldTrialIsMutable();
        this.fieldTrial_.add(gVar);
    }

    private void addOccupiedExtensionBucket(int i2) {
        ensureOccupiedExtensionBucketIsMutable();
        ((ipe) this.occupiedExtensionBucket_).g(i2);
    }

    private void clearAntivirusProduct() {
        this.antivirusProduct_ = o3d.emptyProtobufList();
    }

    private void clearAppPackageName() {
        this.bitField0_ &= -268435457;
        this.appPackageName_ = getDefaultInstance().getAppPackageName();
    }

    private void clearAppPackageNameAllowlistFilter() {
        this.bitField0_ &= -536870913;
        this.appPackageNameAllowlistFilter_ = 0;
    }

    private void clearAppVersion() {
        this.bitField0_ &= -3;
        this.appVersion_ = getDefaultInstance().getAppVersion();
    }

    private void clearApplicationLocale() {
        this.bitField0_ &= -8193;
        this.applicationLocale_ = getDefaultInstance().getApplicationLocale();
    }

    private void clearBrandCode() {
        this.bitField0_ &= -9;
        this.brandCode_ = getDefaultInstance().getBrandCode();
    }

    private void clearBuildTimestamp() {
        this.bitField0_ &= -2;
        this.buildTimestamp_ = 0L;
    }

    private void clearChannel() {
        this.bitField0_ &= -17;
        this.channel_ = 0;
    }

    private void clearChromeComponent() {
        this.chromeComponent_ = o3d.emptyProtobufList();
    }

    private void clearClientIdWasUsedForTrialAssignment() {
        this.bitField0_ &= -1048577;
        this.clientIdWasUsedForTrialAssignment_ = false;
    }

    private void clearClientSideSamplingStatus() {
        this.bitField0_ &= -1073741825;
        this.clientSideSamplingStatus_ = 0;
    }

    private void clearClientUuid() {
        this.bitField0_ &= -2097153;
        this.clientUuid_ = getDefaultInstance().getClientUuid();
    }

    private void clearClonedInstallInfo() {
        this.clonedInstallInfo_ = null;
        this.bitField0_ &= -513;
    }

    private void clearCommandLineKeyHash() {
        this.commandLineKeyHash_ = o3d.emptyIntList();
    }

    private void clearDemoModeDimensions() {
        this.demoModeDimensions_ = null;
        this.bitField1_ &= -5;
    }

    private void clearExternalAccessPoint() {
        this.externalAccessPoint_ = null;
        this.bitField0_ &= -8388609;
    }

    private void clearExternalAudioVideoDevice() {
        this.externalAudioVideoDevice_ = o3d.emptyProtobufList();
    }

    private void clearFieldTrial() {
        this.fieldTrial_ = o3d.emptyProtobufList();
    }

    private void clearGoogleUpdate() {
        this.googleUpdate_ = null;
        this.bitField0_ &= -131073;
    }

    private void clearHardware() {
        this.hardware_ = null;
        this.bitField0_ &= -32769;
    }

    private void clearInstallDate() {
        this.bitField0_ &= -257;
        this.installDate_ = 0L;
    }

    private void clearInstallerPackage() {
        this.bitField1_ &= -2;
        this.installerPackage_ = 0;
    }

    private void clearIsExtendedStableChannel() {
        this.bitField0_ &= -33;
        this.isExtendedStableChannel_ = false;
    }

    private void clearIsInstrumentedBuild() {
        this.bitField0_ &= -65;
        this.isInstrumentedBuild_ = false;
    }

    private void clearLinkedAndroidPhoneData() {
        this.linkedAndroidPhoneData_ = null;
        this.bitField1_ &= -3;
    }

    private void clearLogWrittenByAppVersion() {
        this.bitField0_ &= -5;
        this.logWrittenByAppVersion_ = getDefaultInstance().getLogWrittenByAppVersion();
    }

    private void clearLowEntropySource() {
        this.bitField0_ &= -1025;
        this.lowEntropySource_ = 0;
    }

    private void clearLtsChannel() {
        this.bitField1_ &= -9;
        this.ltsChannel_ = 0;
    }

    private void clearMetricsFilteringStatus() {
        this.bitField0_ &= Integer.MAX_VALUE;
        this.metricsFilteringStatus_ = 0;
    }

    private void clearMultiProfileUserCount() {
        this.bitField0_ &= -16777217;
        this.multiProfileUserCount_ = 0;
    }

    private void clearNetwork() {
        this.network_ = null;
        this.bitField0_ &= -65537;
    }

    private void clearOccupiedExtensionBucket() {
        this.occupiedExtensionBucket_ = o3d.emptyIntList();
    }

    private void clearOffstoreExtensionsState() {
        this.bitField0_ &= -67108865;
        this.offstoreExtensionsState_ = 0;
    }

    private void clearOldLowEntropySource() {
        this.bitField0_ &= -2049;
        this.oldLowEntropySource_ = 0;
    }

    private void clearOs() {
        this.os_ = null;
        this.bitField0_ &= -16385;
    }

    private void clearPseudoLowEntropySource() {
        this.bitField0_ &= -4097;
        this.pseudoLowEntropySource_ = 0;
    }

    private void clearSessionHash() {
        this.bitField0_ &= -4194305;
        this.sessionHash_ = 0L;
    }

    private void clearStability() {
        this.stability_ = null;
        this.bitField0_ &= -262145;
    }

    private void clearTpmIdentifier() {
        this.tpmIdentifier_ = null;
        this.bitField1_ &= -17;
    }

    private void clearUmaDefaultState() {
        this.bitField0_ &= -134217729;
        this.umaDefaultState_ = 0;
    }

    private void clearUmaEnabledDate() {
        this.bitField0_ &= -129;
        this.umaEnabledDate_ = 0L;
    }

    private void clearVariationsSeedVersion() {
        this.bitField0_ &= -524289;
        this.variationsSeedVersion_ = getDefaultInstance().getVariationsSeedVersion();
    }

    private void clearYa() {
        this.ya_ = null;
        this.bitField0_ &= -33554433;
    }

    private void ensureAntivirusProductIsMutable() {
        rse rseVar = this.antivirusProduct_;
        if (((u8) rseVar).a) {
            return;
        }
        this.antivirusProduct_ = o3d.mutableCopy(rseVar);
    }

    private void ensureChromeComponentIsMutable() {
        rse rseVar = this.chromeComponent_;
        if (((u8) rseVar).a) {
            return;
        }
        this.chromeComponent_ = o3d.mutableCopy(rseVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureCommandLineKeyHashIsMutable() {
        mse mseVar = this.commandLineKeyHash_;
        if (((u8) mseVar).a) {
            return;
        }
        this.commandLineKeyHash_ = o3d.mutableCopy(mseVar);
    }

    private void ensureExternalAudioVideoDeviceIsMutable() {
        rse rseVar = this.externalAudioVideoDevice_;
        if (((u8) rseVar).a) {
            return;
        }
        this.externalAudioVideoDevice_ = o3d.mutableCopy(rseVar);
    }

    private void ensureFieldTrialIsMutable() {
        rse rseVar = this.fieldTrial_;
        if (((u8) rseVar).a) {
            return;
        }
        this.fieldTrial_ = o3d.mutableCopy(rseVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void ensureOccupiedExtensionBucketIsMutable() {
        mse mseVar = this.occupiedExtensionBucket_;
        if (((u8) mseVar).a) {
            return;
        }
        this.occupiedExtensionBucket_ = o3d.mutableCopy(mseVar);
    }

    public static o getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeClonedInstallInfo(c cVar) {
        cVar.getClass();
        c cVar2 = this.clonedInstallInfo_;
        if (cVar2 == null || cVar2 == c.getDefaultInstance()) {
            this.clonedInstallInfo_ = cVar;
        } else {
            r newBuilder = c.newBuilder(this.clonedInstallInfo_);
            newBuilder.e(cVar);
            this.clonedInstallInfo_ = (c) newBuilder.c();
        }
        this.bitField0_ |= RemoteCameraConfig.Mic.BUFFER_SIZE;
    }

    private void mergeDemoModeDimensions(d dVar) {
        dVar.getClass();
        d dVar2 = this.demoModeDimensions_;
        if (dVar2 == null || dVar2 == d.getDefaultInstance()) {
            this.demoModeDimensions_ = dVar;
        } else {
            t newBuilder = d.newBuilder(this.demoModeDimensions_);
            newBuilder.e(dVar);
            this.demoModeDimensions_ = (d) newBuilder.c();
        }
        this.bitField1_ |= 4;
    }

    private void mergeExternalAccessPoint(e eVar) {
        eVar.getClass();
        e eVar2 = this.externalAccessPoint_;
        if (eVar2 == null || eVar2 == e.getDefaultInstance()) {
            this.externalAccessPoint_ = eVar;
        } else {
            x newBuilder = e.newBuilder(this.externalAccessPoint_);
            newBuilder.e(eVar);
            this.externalAccessPoint_ = (e) newBuilder.c();
        }
        this.bitField0_ |= 8388608;
    }

    private void mergeGoogleUpdate(h hVar) {
        hVar.getClass();
        h hVar2 = this.googleUpdate_;
        if (hVar2 == null || hVar2 == h.getDefaultInstance()) {
            this.googleUpdate_ = hVar;
        } else {
            o0 newBuilder = h.newBuilder(this.googleUpdate_);
            newBuilder.e(hVar);
            this.googleUpdate_ = (h) newBuilder.c();
        }
        this.bitField0_ |= SQLiteDatabase.OPEN_SHAREDCACHE;
    }

    private void mergeHardware(i iVar) {
        iVar.getClass();
        i iVar2 = this.hardware_;
        if (iVar2 == null || iVar2 == i.getDefaultInstance()) {
            this.hardware_ = iVar;
        } else {
            u0 newBuilder = i.newBuilder(this.hardware_);
            newBuilder.e(iVar);
            this.hardware_ = (i) newBuilder.c();
        }
        this.bitField0_ |= SQLiteDatabase.OPEN_NOMUTEX;
    }

    private void mergeLinkedAndroidPhoneData(j jVar) {
        jVar.getClass();
        j jVar2 = this.linkedAndroidPhoneData_;
        if (jVar2 == null || jVar2 == j.getDefaultInstance()) {
            this.linkedAndroidPhoneData_ = jVar;
        } else {
            j1 newBuilder = j.newBuilder(this.linkedAndroidPhoneData_);
            newBuilder.e(jVar);
            this.linkedAndroidPhoneData_ = (j) newBuilder.c();
        }
        this.bitField1_ |= 2;
    }

    private void mergeNetwork(k kVar) {
        kVar.getClass();
        k kVar2 = this.network_;
        if (kVar2 == null || kVar2 == k.getDefaultInstance()) {
            this.network_ = kVar;
        } else {
            k1 newBuilder = k.newBuilder(this.network_);
            newBuilder.e(kVar);
            this.network_ = (k) newBuilder.c();
        }
        this.bitField0_ |= SQLiteDatabase.OPEN_FULLMUTEX;
    }

    private void mergeOs(l lVar) {
        lVar.getClass();
        l lVar2 = this.os_;
        if (lVar2 == null || lVar2 == l.getDefaultInstance()) {
            this.os_ = lVar;
        } else {
            q1 newBuilder = l.newBuilder(this.os_);
            newBuilder.e(lVar);
            this.os_ = (l) newBuilder.c();
        }
        this.bitField0_ |= 16384;
    }

    private void mergeStability(m mVar) {
        mVar.getClass();
        m mVar2 = this.stability_;
        if (mVar2 == null || mVar2 == m.getDefaultInstance()) {
            this.stability_ = mVar;
        } else {
            x1 newBuilder = m.newBuilder(this.stability_);
            newBuilder.e(mVar);
            this.stability_ = (m) newBuilder.c();
        }
        this.bitField0_ |= SQLiteDatabase.OPEN_PRIVATECACHE;
    }

    private void mergeTpmIdentifier(n nVar) {
        nVar.getClass();
        n nVar2 = this.tpmIdentifier_;
        if (nVar2 == null || nVar2 == n.getDefaultInstance()) {
            this.tpmIdentifier_ = nVar;
        } else {
            y1 newBuilder = n.newBuilder(this.tpmIdentifier_);
            newBuilder.e(nVar);
            this.tpmIdentifier_ = (n) newBuilder.c();
        }
        this.bitField1_ |= 16;
    }

    private void mergeYa(C0020o c0020o) {
        c0020o.getClass();
        C0020o c0020o2 = this.ya_;
        if (c0020o2 == null || c0020o2 == C0020o.getDefaultInstance()) {
            this.ya_ = c0020o;
        } else {
            z1 newBuilder = C0020o.newBuilder(this.ya_);
            newBuilder.e(c0020o);
            this.ya_ = (C0020o) newBuilder.c();
        }
        this.bitField0_ |= 33554432;
    }

    public static p newBuilder() {
        return (p) DEFAULT_INSTANCE.createBuilder();
    }

    public static o parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (o) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(ByteBuffer byteBuffer) throws bye {
        return (o) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static n7k parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void removeAntivirusProduct(int i2) {
        ensureAntivirusProductIsMutable();
        this.antivirusProduct_.remove(i2);
    }

    private void removeChromeComponent(int i2) {
        ensureChromeComponentIsMutable();
        this.chromeComponent_.remove(i2);
    }

    private void removeExternalAudioVideoDevice(int i2) {
        ensureExternalAudioVideoDeviceIsMutable();
        this.externalAudioVideoDevice_.remove(i2);
    }

    private void removeFieldTrial(int i2) {
        ensureFieldTrialIsMutable();
        this.fieldTrial_.remove(i2);
    }

    private void setAntivirusProduct(int i2, a aVar) {
        aVar.getClass();
        ensureAntivirusProductIsMutable();
        this.antivirusProduct_.set(i2, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppPackageName(String str) {
        str.getClass();
        this.bitField0_ |= 268435456;
        this.appPackageName_ = str;
    }

    private void setAppPackageNameAllowlistFilter(tzr tzrVar) {
        this.appPackageNameAllowlistFilter_ = tzrVar.a;
        this.bitField0_ |= SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
    }

    private void setAppPackageNameBytes(nn3 nn3Var) {
        this.appPackageName_ = nn3Var.y();
        this.bitField0_ |= 268435456;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersion(String str) {
        str.getClass();
        this.bitField0_ |= 2;
        this.appVersion_ = str;
    }

    private void setAppVersionBytes(nn3 nn3Var) {
        this.appVersion_ = nn3Var.y();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setApplicationLocale(String str) {
        str.getClass();
        this.bitField0_ |= RemoteCameraConfig.Notification.ID;
        this.applicationLocale_ = str;
    }

    private void setApplicationLocaleBytes(nn3 nn3Var) {
        this.applicationLocale_ = nn3Var.y();
        this.bitField0_ |= RemoteCameraConfig.Notification.ID;
    }

    private void setBrandCode(String str) {
        str.getClass();
        this.bitField0_ |= 8;
        this.brandCode_ = str;
    }

    private void setBrandCodeBytes(nn3 nn3Var) {
        this.brandCode_ = nn3Var.y();
        this.bitField0_ |= 8;
    }

    private void setBuildTimestamp(long j2) {
        this.bitField0_ |= 1;
        this.buildTimestamp_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannel(uzr uzrVar) {
        this.channel_ = uzrVar.a;
        this.bitField0_ |= 16;
    }

    private void setChromeComponent(int i2, b bVar) {
        bVar.getClass();
        ensureChromeComponentIsMutable();
        this.chromeComponent_.set(i2, bVar);
    }

    private void setClientIdWasUsedForTrialAssignment(boolean z) {
        this.bitField0_ |= 1048576;
        this.clientIdWasUsedForTrialAssignment_ = z;
    }

    private void setClientSideSamplingStatus(wzr wzrVar) {
        this.clientSideSamplingStatus_ = wzrVar.a;
        this.bitField0_ |= 1073741824;
    }

    private void setClientUuid(String str) {
        str.getClass();
        this.bitField0_ |= 2097152;
        this.clientUuid_ = str;
    }

    private void setClientUuidBytes(nn3 nn3Var) {
        this.clientUuid_ = nn3Var.y();
        this.bitField0_ |= 2097152;
    }

    private void setClonedInstallInfo(c cVar) {
        cVar.getClass();
        this.clonedInstallInfo_ = cVar;
        this.bitField0_ |= RemoteCameraConfig.Mic.BUFFER_SIZE;
    }

    private void setCommandLineKeyHash(int i2, int i3) {
        ensureCommandLineKeyHashIsMutable();
        ((ipe) this.commandLineKeyHash_).q(i2, i3);
    }

    private void setDemoModeDimensions(d dVar) {
        dVar.getClass();
        this.demoModeDimensions_ = dVar;
        this.bitField1_ |= 4;
    }

    private void setExternalAccessPoint(e eVar) {
        eVar.getClass();
        this.externalAccessPoint_ = eVar;
        this.bitField0_ |= 8388608;
    }

    private void setExternalAudioVideoDevice(int i2, f fVar) {
        fVar.getClass();
        ensureExternalAudioVideoDeviceIsMutable();
        this.externalAudioVideoDevice_.set(i2, fVar);
    }

    private void setFieldTrial(int i2, g gVar) {
        gVar.getClass();
        ensureFieldTrialIsMutable();
        this.fieldTrial_.set(i2, gVar);
    }

    private void setGoogleUpdate(h hVar) {
        hVar.getClass();
        this.googleUpdate_ = hVar;
        this.bitField0_ |= SQLiteDatabase.OPEN_SHAREDCACHE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHardware(i iVar) {
        iVar.getClass();
        this.hardware_ = iVar;
        this.bitField0_ |= SQLiteDatabase.OPEN_NOMUTEX;
    }

    private void setInstallDate(long j2) {
        this.bitField0_ |= 256;
        this.installDate_ = j2;
    }

    private void setInstallerPackage(a0s a0sVar) {
        this.installerPackage_ = a0sVar.a;
        this.bitField1_ |= 1;
    }

    private void setIsExtendedStableChannel(boolean z) {
        this.bitField0_ |= 32;
        this.isExtendedStableChannel_ = z;
    }

    private void setIsInstrumentedBuild(boolean z) {
        this.bitField0_ |= 64;
        this.isInstrumentedBuild_ = z;
    }

    private void setLinkedAndroidPhoneData(j jVar) {
        jVar.getClass();
        this.linkedAndroidPhoneData_ = jVar;
        this.bitField1_ |= 2;
    }

    private void setLogWrittenByAppVersion(String str) {
        str.getClass();
        this.bitField0_ |= 4;
        this.logWrittenByAppVersion_ = str;
    }

    private void setLogWrittenByAppVersionBytes(nn3 nn3Var) {
        this.logWrittenByAppVersion_ = nn3Var.y();
        this.bitField0_ |= 4;
    }

    private void setLowEntropySource(int i2) {
        this.bitField0_ |= 1024;
        this.lowEntropySource_ = i2;
    }

    private void setLtsChannel(b0s b0sVar) {
        this.ltsChannel_ = b0sVar.a;
        this.bitField1_ |= 8;
    }

    private void setMetricsFilteringStatus(c0s c0sVar) {
        this.metricsFilteringStatus_ = c0sVar.a;
        this.bitField0_ |= Integer.MIN_VALUE;
    }

    private void setMultiProfileUserCount(int i2) {
        this.bitField0_ |= 16777216;
        this.multiProfileUserCount_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetwork(k kVar) {
        kVar.getClass();
        this.network_ = kVar;
        this.bitField0_ |= SQLiteDatabase.OPEN_FULLMUTEX;
    }

    private void setOccupiedExtensionBucket(int i2, int i3) {
        ensureOccupiedExtensionBucketIsMutable();
        ((ipe) this.occupiedExtensionBucket_).q(i2, i3);
    }

    private void setOffstoreExtensionsState(yzr yzrVar) {
        this.offstoreExtensionsState_ = yzrVar.a;
        this.bitField0_ |= 67108864;
    }

    private void setOldLowEntropySource(int i2) {
        this.bitField0_ |= 2048;
        this.oldLowEntropySource_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOs(l lVar) {
        lVar.getClass();
        this.os_ = lVar;
        this.bitField0_ |= 16384;
    }

    private void setPseudoLowEntropySource(int i2) {
        this.bitField0_ |= 4096;
        this.pseudoLowEntropySource_ = i2;
    }

    private void setSessionHash(long j2) {
        this.bitField0_ |= RemoteCameraConfig.Camera.BITRATE;
        this.sessionHash_ = j2;
    }

    private void setStability(m mVar) {
        mVar.getClass();
        this.stability_ = mVar;
        this.bitField0_ |= SQLiteDatabase.OPEN_PRIVATECACHE;
    }

    private void setTpmIdentifier(n nVar) {
        nVar.getClass();
        this.tpmIdentifier_ = nVar;
        this.bitField1_ |= 16;
    }

    private void setUmaDefaultState(d0s d0sVar) {
        this.umaDefaultState_ = d0sVar.a;
        this.bitField0_ |= 134217728;
    }

    private void setUmaEnabledDate(long j2) {
        this.bitField0_ |= 128;
        this.umaEnabledDate_ = j2;
    }

    private void setVariationsSeedVersion(String str) {
        str.getClass();
        this.bitField0_ |= 524288;
        this.variationsSeedVersion_ = str;
    }

    private void setVariationsSeedVersionBytes(nn3 nn3Var) {
        this.variationsSeedVersion_ = nn3Var.y();
        this.bitField0_ |= 524288;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setYa(C0020o c0020o) {
        c0020o.getClass();
        this.ya_ = c0020o;
        this.bitField0_ |= 33554432;
    }

    @Override // defpackage.o3d
    public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
        n7k n7kVar;
        switch (n3dVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001+\u0000\u0002\u0001Ϩ+\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဂ\u0007\u0004ဈ\r\u0005ဉ\u000e\u0006ဉ\u000f\bဉ\u0012\t\u001b\n᠌\u0004\u000bဉ\u0011\fဈ\u0003\rဉ\u0010\u000e\u001b\u000fဉ\u0017\u0010ဂ\b\u0011ဋ\u0018\u0012\u0016\u0013᠌\u001a\u0014ဇ\u0006\u0016᠌\u001b\u0017\u001b\u0018\u001b\u001aဈ\u001c\u001cဈ\u0013\u001dဉ!\u001fင\n င\u000b!ဇ\u0014\"ဈ\u0015#᠌ $ဇ\u0005%င\f&)'ဉ\t(ဈ\u0002)ဉ\"*᠌\u001d+᠌\u001e,᠌\u001f-᠌#.စ\u0016/ဉ$Ϩဉ\u0019", new Object[]{"bitField0_", "bitField1_", "buildTimestamp_", "appVersion_", "umaEnabledDate_", "applicationLocale_", "os_", "hardware_", "stability_", "fieldTrial_", g.class, "channel_", sxf.e, "googleUpdate_", "brandCode_", "network_", "externalAudioVideoDevice_", f.class, "externalAccessPoint_", "installDate_", "multiProfileUserCount_", "occupiedExtensionBucket_", "offstoreExtensionsState_", sxf.h, "isInstrumentedBuild_", "umaDefaultState_", sxf.l, "antivirusProduct_", a.class, "chromeComponent_", b.class, "appPackageName_", "variationsSeedVersion_", "linkedAndroidPhoneData_", "lowEntropySource_", "oldLowEntropySource_", "clientIdWasUsedForTrialAssignment_", "clientUuid_", "installerPackage_", sxf.i, "isExtendedStableChannel_", "pseudoLowEntropySource_", "commandLineKeyHash_", "clonedInstallInfo_", "logWrittenByAppVersion_", "demoModeDimensions_", "appPackageNameAllowlistFilter_", sxf.d, "clientSideSamplingStatus_", sxf.f, "metricsFilteringStatus_", sxf.k, "ltsChannel_", sxf.j, "sessionHash_", "tpmIdentifier_", "ya_"});
            case 3:
                return new o();
            case 4:
                return new p(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                n7k n7kVar2 = PARSER;
                if (n7kVar2 != null) {
                    return n7kVar2;
                }
                synchronized (o.class) {
                    try {
                        n7kVar = PARSER;
                        if (n7kVar == null) {
                            n7kVar = new j3d(DEFAULT_INSTANCE);
                            PARSER = n7kVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return n7kVar;
            default:
                androidx.core.app.q.i();
                return null;
        }
    }

    public a getAntivirusProduct(int i2) {
        return (a) this.antivirusProduct_.get(i2);
    }

    public int getAntivirusProductCount() {
        return this.antivirusProduct_.size();
    }

    public List<a> getAntivirusProductList() {
        return this.antivirusProduct_;
    }

    public rzr getAntivirusProductOrBuilder(int i2) {
        return (rzr) this.antivirusProduct_.get(i2);
    }

    public List<? extends rzr> getAntivirusProductOrBuilderList() {
        return this.antivirusProduct_;
    }

    public String getAppPackageName() {
        return this.appPackageName_;
    }

    public tzr getAppPackageNameAllowlistFilter() {
        int i2 = this.appPackageNameAllowlistFilter_;
        tzr tzrVar = tzr.SERVER_SIDE_FILTER_UNSPECIFIED;
        tzr tzrVar2 = i2 != 0 ? i2 != 1 ? i2 != 3 ? null : tzr.NO_SERVER_SIDE_FILTER_REQUIRED_FOR_SYSTEM_APPS : tzr.SERVER_SIDE_FILTER_REQUIRED : tzrVar;
        return tzrVar2 == null ? tzrVar : tzrVar2;
    }

    public nn3 getAppPackageNameBytes() {
        return nn3.o(this.appPackageName_);
    }

    public String getAppVersion() {
        return this.appVersion_;
    }

    public nn3 getAppVersionBytes() {
        return nn3.o(this.appVersion_);
    }

    public String getApplicationLocale() {
        return this.applicationLocale_;
    }

    public nn3 getApplicationLocaleBytes() {
        return nn3.o(this.applicationLocale_);
    }

    public String getBrandCode() {
        return this.brandCode_;
    }

    public nn3 getBrandCodeBytes() {
        return nn3.o(this.brandCode_);
    }

    public long getBuildTimestamp() {
        return this.buildTimestamp_;
    }

    public uzr getChannel() {
        uzr b2 = uzr.b(this.channel_);
        return b2 == null ? uzr.CHANNEL_UNKNOWN : b2;
    }

    public b getChromeComponent(int i2) {
        return (b) this.chromeComponent_.get(i2);
    }

    public int getChromeComponentCount() {
        return this.chromeComponent_.size();
    }

    public List<b> getChromeComponentList() {
        return this.chromeComponent_;
    }

    public vzr getChromeComponentOrBuilder(int i2) {
        return (vzr) this.chromeComponent_.get(i2);
    }

    public List<? extends vzr> getChromeComponentOrBuilderList() {
        return this.chromeComponent_;
    }

    public boolean getClientIdWasUsedForTrialAssignment() {
        return this.clientIdWasUsedForTrialAssignment_;
    }

    public wzr getClientSideSamplingStatus() {
        int i2 = this.clientSideSamplingStatus_;
        wzr wzrVar = wzr.SAMPLING_UNKNOWN;
        wzr wzrVar2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : wzr.SAMPLING_NOT_APPLIED : wzr.SAMPLING_APPLIED : wzrVar;
        return wzrVar2 == null ? wzrVar : wzrVar2;
    }

    public String getClientUuid() {
        return this.clientUuid_;
    }

    public nn3 getClientUuidBytes() {
        return nn3.o(this.clientUuid_);
    }

    public c getClonedInstallInfo() {
        c cVar = this.clonedInstallInfo_;
        return cVar == null ? c.getDefaultInstance() : cVar;
    }

    public int getCommandLineKeyHash(int i2) {
        return ((ipe) this.commandLineKeyHash_).n(i2);
    }

    public int getCommandLineKeyHashCount() {
        return this.commandLineKeyHash_.size();
    }

    public List<Integer> getCommandLineKeyHashList() {
        return this.commandLineKeyHash_;
    }

    public d getDemoModeDimensions() {
        d dVar = this.demoModeDimensions_;
        return dVar == null ? d.getDefaultInstance() : dVar;
    }

    public e getExternalAccessPoint() {
        e eVar = this.externalAccessPoint_;
        return eVar == null ? e.getDefaultInstance() : eVar;
    }

    public f getExternalAudioVideoDevice(int i2) {
        return (f) this.externalAudioVideoDevice_.get(i2);
    }

    public int getExternalAudioVideoDeviceCount() {
        return this.externalAudioVideoDevice_.size();
    }

    public List<f> getExternalAudioVideoDeviceList() {
        return this.externalAudioVideoDevice_;
    }

    public m0 getExternalAudioVideoDeviceOrBuilder(int i2) {
        return (m0) this.externalAudioVideoDevice_.get(i2);
    }

    public List<? extends m0> getExternalAudioVideoDeviceOrBuilderList() {
        return this.externalAudioVideoDevice_;
    }

    public g getFieldTrial(int i2) {
        return (g) this.fieldTrial_.get(i2);
    }

    public int getFieldTrialCount() {
        return this.fieldTrial_.size();
    }

    public List<g> getFieldTrialList() {
        return this.fieldTrial_;
    }

    public zzr getFieldTrialOrBuilder(int i2) {
        return (zzr) this.fieldTrial_.get(i2);
    }

    public List<? extends zzr> getFieldTrialOrBuilderList() {
        return this.fieldTrial_;
    }

    public h getGoogleUpdate() {
        h hVar = this.googleUpdate_;
        return hVar == null ? h.getDefaultInstance() : hVar;
    }

    public i getHardware() {
        i iVar = this.hardware_;
        return iVar == null ? i.getDefaultInstance() : iVar;
    }

    public long getInstallDate() {
        return this.installDate_;
    }

    public a0s getInstallerPackage() {
        int i2 = this.installerPackage_;
        a0s a0sVar = a0s.INSTALLER_PACKAGE_UNKNOWN;
        a0s a0sVar2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : a0s.INSTALLER_PACKAGE_OTHER : a0s.INSTALLER_PACKAGE_GOOGLE_PLAY_STORE : a0s.INSTALLER_PACKAGE_NONE : a0sVar;
        return a0sVar2 == null ? a0sVar : a0sVar2;
    }

    public boolean getIsExtendedStableChannel() {
        return this.isExtendedStableChannel_;
    }

    public boolean getIsInstrumentedBuild() {
        return this.isInstrumentedBuild_;
    }

    public j getLinkedAndroidPhoneData() {
        j jVar = this.linkedAndroidPhoneData_;
        return jVar == null ? j.getDefaultInstance() : jVar;
    }

    public String getLogWrittenByAppVersion() {
        return this.logWrittenByAppVersion_;
    }

    public nn3 getLogWrittenByAppVersionBytes() {
        return nn3.o(this.logWrittenByAppVersion_);
    }

    public int getLowEntropySource() {
        return this.lowEntropySource_;
    }

    public b0s getLtsChannel() {
        int i2 = this.ltsChannel_;
        b0s b0sVar = b0s.LTS_CHANNEL_UNKNOWN;
        b0s b0sVar2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : b0s.LTS_CHANNEL_LTS : b0s.LTS_CHANNEL_LTC : b0s.LTS_CHANNEL_STABLE : b0sVar;
        return b0sVar2 == null ? b0sVar : b0sVar2;
    }

    public c0s getMetricsFilteringStatus() {
        int i2 = this.metricsFilteringStatus_;
        c0s c0sVar = c0s.METRICS_UNKNOWN;
        c0s c0sVar2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? null : c0s.METRICS_ONLY_CRITICAL : c0s.METRICS_ALL : c0sVar;
        return c0sVar2 == null ? c0sVar : c0sVar2;
    }

    public int getMultiProfileUserCount() {
        return this.multiProfileUserCount_;
    }

    public k getNetwork() {
        k kVar = this.network_;
        return kVar == null ? k.getDefaultInstance() : kVar;
    }

    public int getOccupiedExtensionBucket(int i2) {
        return ((ipe) this.occupiedExtensionBucket_).n(i2);
    }

    public int getOccupiedExtensionBucketCount() {
        return this.occupiedExtensionBucket_.size();
    }

    public List<Integer> getOccupiedExtensionBucketList() {
        return this.occupiedExtensionBucket_;
    }

    public yzr getOffstoreExtensionsState() {
        int i2 = this.offstoreExtensionsState_;
        yzr yzrVar = yzr.NO_EXTENSIONS;
        yzr yzrVar2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : yzr.HAS_OFFSTORE : yzr.NO_OFFSTORE_UNVERIFIED : yzr.NO_OFFSTORE_VERIFIED : yzrVar;
        return yzrVar2 == null ? yzrVar : yzrVar2;
    }

    public int getOldLowEntropySource() {
        return this.oldLowEntropySource_;
    }

    public l getOs() {
        l lVar = this.os_;
        return lVar == null ? l.getDefaultInstance() : lVar;
    }

    public int getPseudoLowEntropySource() {
        return this.pseudoLowEntropySource_;
    }

    public long getSessionHash() {
        return this.sessionHash_;
    }

    public m getStability() {
        m mVar = this.stability_;
        return mVar == null ? m.getDefaultInstance() : mVar;
    }

    public n getTpmIdentifier() {
        n nVar = this.tpmIdentifier_;
        return nVar == null ? n.getDefaultInstance() : nVar;
    }

    public d0s getUmaDefaultState() {
        int i2 = this.umaDefaultState_;
        d0s d0sVar = d0s.OPT_IN;
        d0s d0sVar2 = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? null : d0s.OPT_UNKNOWN : d0s.POLICY_FORCED_ENABLED : d0s.OPT_OUT : d0sVar;
        return d0sVar2 == null ? d0sVar : d0sVar2;
    }

    public long getUmaEnabledDate() {
        return this.umaEnabledDate_;
    }

    public String getVariationsSeedVersion() {
        return this.variationsSeedVersion_;
    }

    public nn3 getVariationsSeedVersionBytes() {
        return nn3.o(this.variationsSeedVersion_);
    }

    public C0020o getYa() {
        C0020o c0020o = this.ya_;
        return c0020o == null ? C0020o.getDefaultInstance() : c0020o;
    }

    public boolean hasAppPackageName() {
        return (this.bitField0_ & 268435456) != 0;
    }

    public boolean hasAppPackageNameAllowlistFilter() {
        return (this.bitField0_ & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0;
    }

    public boolean hasAppVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasApplicationLocale() {
        return (this.bitField0_ & RemoteCameraConfig.Notification.ID) != 0;
    }

    public boolean hasBrandCode() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasBuildTimestamp() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasChannel() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasClientIdWasUsedForTrialAssignment() {
        return (this.bitField0_ & 1048576) != 0;
    }

    public boolean hasClientSideSamplingStatus() {
        return (this.bitField0_ & 1073741824) != 0;
    }

    public boolean hasClientUuid() {
        return (this.bitField0_ & 2097152) != 0;
    }

    public boolean hasClonedInstallInfo() {
        return (this.bitField0_ & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0;
    }

    public boolean hasDemoModeDimensions() {
        return (this.bitField1_ & 4) != 0;
    }

    public boolean hasExternalAccessPoint() {
        return (this.bitField0_ & 8388608) != 0;
    }

    public boolean hasGoogleUpdate() {
        return (this.bitField0_ & SQLiteDatabase.OPEN_SHAREDCACHE) != 0;
    }

    public boolean hasHardware() {
        return (this.bitField0_ & SQLiteDatabase.OPEN_NOMUTEX) != 0;
    }

    public boolean hasInstallDate() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasInstallerPackage() {
        return (this.bitField1_ & 1) != 0;
    }

    public boolean hasIsExtendedStableChannel() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasIsInstrumentedBuild() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasLinkedAndroidPhoneData() {
        return (this.bitField1_ & 2) != 0;
    }

    public boolean hasLogWrittenByAppVersion() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLowEntropySource() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasLtsChannel() {
        return (this.bitField1_ & 8) != 0;
    }

    public boolean hasMetricsFilteringStatus() {
        return (this.bitField0_ & Integer.MIN_VALUE) != 0;
    }

    public boolean hasMultiProfileUserCount() {
        return (this.bitField0_ & 16777216) != 0;
    }

    public boolean hasNetwork() {
        return (this.bitField0_ & SQLiteDatabase.OPEN_FULLMUTEX) != 0;
    }

    public boolean hasOffstoreExtensionsState() {
        return (this.bitField0_ & 67108864) != 0;
    }

    public boolean hasOldLowEntropySource() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasOs() {
        return (this.bitField0_ & 16384) != 0;
    }

    public boolean hasPseudoLowEntropySource() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasSessionHash() {
        return (this.bitField0_ & RemoteCameraConfig.Camera.BITRATE) != 0;
    }

    public boolean hasStability() {
        return (this.bitField0_ & SQLiteDatabase.OPEN_PRIVATECACHE) != 0;
    }

    public boolean hasTpmIdentifier() {
        return (this.bitField1_ & 16) != 0;
    }

    public boolean hasUmaDefaultState() {
        return (this.bitField0_ & 134217728) != 0;
    }

    public boolean hasUmaEnabledDate() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasVariationsSeedVersion() {
        return (this.bitField0_ & 524288) != 0;
    }

    public boolean hasYa() {
        return (this.bitField0_ & 33554432) != 0;
    }

    public static final class d extends o3d implements xzh {
        public static final int APP_VERSION_FIELD_NUMBER = 4;
        public static final int COUNTRY_FIELD_NUMBER = 1;
        public static final int CUSTOMIZATION_FACET_FIELD_NUMBER = 3;
        private static final d DEFAULT_INSTANCE;
        private static volatile n7k PARSER = null;
        public static final int RESOURCES_VERSION_FIELD_NUMBER = 5;
        public static final int RETAILER_FIELD_NUMBER = 2;
        private static final nse customizationFacet_converter_ = new s();
        private int bitField0_;
        private int customizationFacetMemoizedSerializedSize;
        private a retailer_;
        private String country_ = "";
        private mse customizationFacet_ = o3d.emptyIntList();
        private String appVersion_ = "";
        private String resourcesVersion_ = "";

        static {
            d dVar = new d();
            DEFAULT_INSTANCE = dVar;
            o3d.registerDefaultInstance(d.class, dVar);
        }

        private d() {
        }

        private void addAllCustomizationFacet(Iterable<? extends v> iterable) {
            ensureCustomizationFacetIsMutable();
            for (v vVar : iterable) {
                ((ipe) this.customizationFacet_).g(vVar.a);
            }
        }

        private void addCustomizationFacet(v vVar) {
            vVar.getClass();
            ensureCustomizationFacetIsMutable();
            ((ipe) this.customizationFacet_).g(vVar.a);
        }

        private void clearAppVersion() {
            this.bitField0_ &= -5;
            this.appVersion_ = getDefaultInstance().getAppVersion();
        }

        private void clearCountry() {
            this.bitField0_ &= -2;
            this.country_ = getDefaultInstance().getCountry();
        }

        private void clearCustomizationFacet() {
            this.customizationFacet_ = o3d.emptyIntList();
        }

        private void clearResourcesVersion() {
            this.bitField0_ &= -9;
            this.resourcesVersion_ = getDefaultInstance().getResourcesVersion();
        }

        private void clearRetailer() {
            this.retailer_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void ensureCustomizationFacetIsMutable() {
            mse mseVar = this.customizationFacet_;
            if (((u8) mseVar).a) {
                return;
            }
            this.customizationFacet_ = o3d.mutableCopy(mseVar);
        }

        public static d getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeRetailer(a aVar) {
            aVar.getClass();
            a aVar2 = this.retailer_;
            if (aVar2 == null || aVar2 == a.getDefaultInstance()) {
                this.retailer_ = aVar;
            } else {
                w newBuilder = a.newBuilder(this.retailer_);
                newBuilder.e(aVar);
                this.retailer_ = (a) newBuilder.c();
            }
            this.bitField0_ |= 2;
        }

        public static t newBuilder() {
            return (t) DEFAULT_INSTANCE.createBuilder();
        }

        public static d parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (d) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static d parseFrom(ByteBuffer byteBuffer) throws bye {
            return (d) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n7k parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setAppVersion(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.appVersion_ = str;
        }

        private void setAppVersionBytes(nn3 nn3Var) {
            this.appVersion_ = nn3Var.y();
            this.bitField0_ |= 4;
        }

        private void setCountry(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.country_ = str;
        }

        private void setCountryBytes(nn3 nn3Var) {
            this.country_ = nn3Var.y();
            this.bitField0_ |= 1;
        }

        private void setCustomizationFacet(int i, v vVar) {
            vVar.getClass();
            ensureCustomizationFacetIsMutable();
            ((ipe) this.customizationFacet_).q(i, vVar.a);
        }

        private void setResourcesVersion(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.resourcesVersion_ = str;
        }

        private void setResourcesVersionBytes(nn3 nn3Var) {
            this.resourcesVersion_ = nn3Var.y();
            this.bitField0_ |= 8;
        }

        private void setRetailer(a aVar) {
            aVar.getClass();
            this.retailer_ = aVar;
            this.bitField0_ |= 2;
        }

        @Override // defpackage.o3d
        public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
            n7k n7kVar;
            switch (n3dVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ࠬ\u0004ဈ\u0002\u0005ဈ\u0003", new Object[]{"bitField0_", "country_", "retailer_", "customizationFacet_", u.a, "appVersion_", "resourcesVersion_"});
                case 3:
                    return new d();
                case 4:
                    return new t(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    n7k n7kVar2 = PARSER;
                    if (n7kVar2 != null) {
                        return n7kVar2;
                    }
                    synchronized (d.class) {
                        try {
                            n7kVar = PARSER;
                            if (n7kVar == null) {
                                n7kVar = new j3d(DEFAULT_INSTANCE);
                                PARSER = n7kVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return n7kVar;
                default:
                    androidx.core.app.q.i();
                    return null;
            }
        }

        public String getAppVersion() {
            return this.appVersion_;
        }

        public nn3 getAppVersionBytes() {
            return nn3.o(this.appVersion_);
        }

        public String getCountry() {
            return this.country_;
        }

        public nn3 getCountryBytes() {
            return nn3.o(this.country_);
        }

        public v getCustomizationFacet(int i) {
            v b = v.b(((ipe) this.customizationFacet_).n(i));
            return b == null ? v.UNDEFINED : b;
        }

        public int getCustomizationFacetCount() {
            return this.customizationFacet_.size();
        }

        public List<v> getCustomizationFacetList() {
            return new ose(this.customizationFacet_, customizationFacet_converter_);
        }

        public String getResourcesVersion() {
            return this.resourcesVersion_;
        }

        public nn3 getResourcesVersionBytes() {
            return nn3.o(this.resourcesVersion_);
        }

        public a getRetailer() {
            a aVar = this.retailer_;
            return aVar == null ? a.getDefaultInstance() : aVar;
        }

        public boolean hasAppVersion() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasCountry() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasResourcesVersion() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasRetailer() {
            return (this.bitField0_ & 2) != 0;
        }

        public static final class a extends o3d implements xzh {
            private static final a DEFAULT_INSTANCE;
            private static volatile n7k PARSER = null;
            public static final int RETAILER_ID_FIELD_NUMBER = 1;
            public static final int STORE_ID_FIELD_NUMBER = 2;
            private int bitField0_;
            private String retailerId_ = "";
            private String storeId_ = "";

            static {
                a aVar = new a();
                DEFAULT_INSTANCE = aVar;
                o3d.registerDefaultInstance(a.class, aVar);
            }

            private a() {
            }

            private void clearRetailerId() {
                this.bitField0_ &= -2;
                this.retailerId_ = getDefaultInstance().getRetailerId();
            }

            private void clearStoreId() {
                this.bitField0_ &= -3;
                this.storeId_ = getDefaultInstance().getStoreId();
            }

            public static a getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static w newBuilder() {
                return (w) DEFAULT_INSTANCE.createBuilder();
            }

            public static a parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (a) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(ByteBuffer byteBuffer) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static n7k parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setRetailerId(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.retailerId_ = str;
            }

            private void setRetailerIdBytes(nn3 nn3Var) {
                this.retailerId_ = nn3Var.y();
                this.bitField0_ |= 1;
            }

            private void setStoreId(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.storeId_ = str;
            }

            private void setStoreIdBytes(nn3 nn3Var) {
                this.storeId_ = nn3Var.y();
                this.bitField0_ |= 2;
            }

            @Override // defpackage.o3d
            public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
                n7k n7kVar;
                switch (n3dVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "retailerId_", "storeId_"});
                    case 3:
                        return new a();
                    case 4:
                        return new w(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        n7k n7kVar2 = PARSER;
                        if (n7kVar2 != null) {
                            return n7kVar2;
                        }
                        synchronized (a.class) {
                            try {
                                n7kVar = PARSER;
                                if (n7kVar == null) {
                                    n7kVar = new j3d(DEFAULT_INSTANCE);
                                    PARSER = n7kVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return n7kVar;
                    default:
                        androidx.core.app.q.i();
                        return null;
                }
            }

            public String getRetailerId() {
                return this.retailerId_;
            }

            public nn3 getRetailerIdBytes() {
                return nn3.o(this.retailerId_);
            }

            public String getStoreId() {
                return this.storeId_;
            }

            public nn3 getStoreIdBytes() {
                return nn3.o(this.storeId_);
            }

            public boolean hasRetailerId() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasStoreId() {
                return (this.bitField0_ & 2) != 0;
            }

            public static w newBuilder(a aVar) {
                return (w) DEFAULT_INSTANCE.createBuilder(aVar);
            }

            public static a parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (a) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static a parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
            }

            public static a parseFrom(nn3 nn3Var) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
            }

            public static a parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
            }

            public static a parseFrom(byte[] bArr) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static a parseFrom(byte[] bArr, z0c z0cVar) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
            }

            public static a parseFrom(InputStream inputStream) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static a parseFrom(qr4 qr4Var) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
            }

            public static a parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
            }
        }

        public static t newBuilder(d dVar) {
            return (t) DEFAULT_INSTANCE.createBuilder(dVar);
        }

        public static d parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (d) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static d parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
            return (d) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
        }

        public static d parseFrom(nn3 nn3Var) throws bye {
            return (d) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
        }

        public static d parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
            return (d) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
        }

        public static d parseFrom(byte[] bArr) throws bye {
            return (d) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static d parseFrom(byte[] bArr, z0c z0cVar) throws bye {
            return (d) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
        }

        public static d parseFrom(InputStream inputStream) throws IOException {
            return (d) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static d parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (d) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static d parseFrom(qr4 qr4Var) throws IOException {
            return (d) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
        }

        public static d parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
            return (d) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
        }
    }

    public static final class f extends o3d implements m0 {
        public static final int AUDIO_DESCRIPTION_FIELD_NUMBER = 9;
        public static final int AV_DEVICE_TYPE_FIELD_NUMBER = 4;
        public static final int BIT_DEPTH_FIELD_NUMBER = 16;
        public static final int CEC_COMMAND_FIELD_NUMBER = 13;
        public static final int CEC_VERSION_FIELD_NUMBER = 12;
        public static final int COLOR_ENCODING_FIELD_NUMBER = 15;
        public static final int CURRENT_HDCP_VERSION_FIELD_NUMBER = 24;
        private static final f DEFAULT_INSTANCE;
        public static final int DOLBY_VISION_SUPPORT_FIELD_NUMBER = 19;
        public static final int EOTF_SUPPORT_FIELD_NUMBER = 20;
        public static final int FRAME_RATE_FIELD_NUMBER = 14;
        public static final int HDR10_SUPPORT_FIELD_NUMBER = 18;
        public static final int HORIZONTAL_RESOLUTION_FIELD_NUMBER = 7;
        public static final int IS_IN_PATH_TO_TV_FIELD_NUMBER = 11;
        public static final int MANUFACTURER_NAME_FIELD_NUMBER = 1;
        public static final int MANUFACTURE_WEEK_FIELD_NUMBER = 6;
        public static final int MANUFACTURE_YEAR_FIELD_NUMBER = 5;
        public static final int MAXIMUM_SUPPORTED_HDCP_VERSION_FIELD_NUMBER = 23;
        public static final int MODEL_NAME_FIELD_NUMBER = 2;
        private static volatile n7k PARSER = null;
        public static final int POSITION_IN_SETUP_FIELD_NUMBER = 10;
        public static final int PRODUCT_CODE_FIELD_NUMBER = 3;
        public static final int TMDS_FIELD_NUMBER = 17;
        public static final int VERTICAL_RESOLUTION_FIELD_NUMBER = 8;
        public static final int YUV_420_SUPPORT_FIELD_NUMBER = 22;
        public static final int YUV_SUPPORT_FIELD_NUMBER = 21;
        private static final nse avDeviceType_converter_ = new y();
        private int bitDepth_;
        private int bitField0_;
        private int cecVersion_;
        private int colorEncoding_;
        private int currentHdcpVersion_;
        private boolean dolbyVisionSupport_;
        private int eotfSupport_;
        private int frameRate_;
        private boolean hdr10Support_;
        private int horizontalResolution_;
        private boolean isInPathToTv_;
        private int manufactureWeek_;
        private int manufactureYear_;
        private int maximumSupportedHdcpVersion_;
        private int positionInSetup_;
        private int tmds_;
        private int verticalResolution_;
        private boolean yuv420Support_;
        private boolean yuvSupport_;
        private String manufacturerName_ = "";
        private String modelName_ = "";
        private String productCode_ = "";
        private mse avDeviceType_ = o3d.emptyIntList();
        private rse audioDescription_ = o3d.emptyProtobufList();
        private rse cecCommand_ = o3d.emptyProtobufList();

        static {
            f fVar = new f();
            DEFAULT_INSTANCE = fVar;
            o3d.registerDefaultInstance(f.class, fVar);
        }

        private f() {
        }

        private void addAllAudioDescription(Iterable<? extends a> iterable) {
            ensureAudioDescriptionIsMutable();
            c8.addAll(iterable, this.audioDescription_);
        }

        private void addAllAvDeviceType(Iterable<? extends a0> iterable) {
            ensureAvDeviceTypeIsMutable();
            for (a0 a0Var : iterable) {
                ((ipe) this.avDeviceType_).g(a0Var.a);
            }
        }

        private void addAllCecCommand(Iterable<? extends b> iterable) {
            ensureCecCommandIsMutable();
            c8.addAll(iterable, this.cecCommand_);
        }

        private void addAudioDescription(a aVar) {
            aVar.getClass();
            ensureAudioDescriptionIsMutable();
            this.audioDescription_.add(aVar);
        }

        private void addAvDeviceType(a0 a0Var) {
            a0Var.getClass();
            ensureAvDeviceTypeIsMutable();
            ((ipe) this.avDeviceType_).g(a0Var.a);
        }

        private void addCecCommand(b bVar) {
            bVar.getClass();
            ensureCecCommandIsMutable();
            this.cecCommand_.add(bVar);
        }

        private void clearAudioDescription() {
            this.audioDescription_ = o3d.emptyProtobufList();
        }

        private void clearAvDeviceType() {
            this.avDeviceType_ = o3d.emptyIntList();
        }

        private void clearBitDepth() {
            this.bitField0_ &= -4097;
            this.bitDepth_ = 0;
        }

        private void clearCecCommand() {
            this.cecCommand_ = o3d.emptyProtobufList();
        }

        private void clearCecVersion() {
            this.bitField0_ &= -513;
            this.cecVersion_ = 0;
        }

        private void clearColorEncoding() {
            this.bitField0_ &= -2049;
            this.colorEncoding_ = 0;
        }

        private void clearCurrentHdcpVersion() {
            this.bitField0_ &= -1048577;
            this.currentHdcpVersion_ = 0;
        }

        private void clearDolbyVisionSupport() {
            this.bitField0_ &= -32769;
            this.dolbyVisionSupport_ = false;
        }

        private void clearEotfSupport() {
            this.bitField0_ &= -65537;
            this.eotfSupport_ = 0;
        }

        private void clearFrameRate() {
            this.bitField0_ &= -1025;
            this.frameRate_ = 0;
        }

        private void clearHdr10Support() {
            this.bitField0_ &= -16385;
            this.hdr10Support_ = false;
        }

        private void clearHorizontalResolution() {
            this.bitField0_ &= -33;
            this.horizontalResolution_ = 0;
        }

        private void clearIsInPathToTv() {
            this.bitField0_ &= -257;
            this.isInPathToTv_ = false;
        }

        private void clearManufactureWeek() {
            this.bitField0_ &= -17;
            this.manufactureWeek_ = 0;
        }

        private void clearManufactureYear() {
            this.bitField0_ &= -9;
            this.manufactureYear_ = 0;
        }

        private void clearManufacturerName() {
            this.bitField0_ &= -2;
            this.manufacturerName_ = getDefaultInstance().getManufacturerName();
        }

        private void clearMaximumSupportedHdcpVersion() {
            this.bitField0_ &= -524289;
            this.maximumSupportedHdcpVersion_ = 0;
        }

        private void clearModelName() {
            this.bitField0_ &= -3;
            this.modelName_ = getDefaultInstance().getModelName();
        }

        private void clearPositionInSetup() {
            this.bitField0_ &= -129;
            this.positionInSetup_ = 0;
        }

        private void clearProductCode() {
            this.bitField0_ &= -5;
            this.productCode_ = getDefaultInstance().getProductCode();
        }

        private void clearTmds() {
            this.bitField0_ &= -8193;
            this.tmds_ = 0;
        }

        private void clearVerticalResolution() {
            this.bitField0_ &= -65;
            this.verticalResolution_ = 0;
        }

        private void clearYuv420Support() {
            this.bitField0_ &= -262145;
            this.yuv420Support_ = false;
        }

        private void clearYuvSupport() {
            this.bitField0_ &= -131073;
            this.yuvSupport_ = false;
        }

        private void ensureAudioDescriptionIsMutable() {
            rse rseVar = this.audioDescription_;
            if (((u8) rseVar).a) {
                return;
            }
            this.audioDescription_ = o3d.mutableCopy(rseVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void ensureAvDeviceTypeIsMutable() {
            mse mseVar = this.avDeviceType_;
            if (((u8) mseVar).a) {
                return;
            }
            this.avDeviceType_ = o3d.mutableCopy(mseVar);
        }

        private void ensureCecCommandIsMutable() {
            rse rseVar = this.cecCommand_;
            if (((u8) rseVar).a) {
                return;
            }
            this.cecCommand_ = o3d.mutableCopy(rseVar);
        }

        public static f getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static h0 newBuilder() {
            return (h0) DEFAULT_INSTANCE.createBuilder();
        }

        public static f parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (f) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static f parseFrom(ByteBuffer byteBuffer) throws bye {
            return (f) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n7k parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeAudioDescription(int i) {
            ensureAudioDescriptionIsMutable();
            this.audioDescription_.remove(i);
        }

        private void removeCecCommand(int i) {
            ensureCecCommandIsMutable();
            this.cecCommand_.remove(i);
        }

        private void setAudioDescription(int i, a aVar) {
            aVar.getClass();
            ensureAudioDescriptionIsMutable();
            this.audioDescription_.set(i, aVar);
        }

        private void setAvDeviceType(int i, a0 a0Var) {
            a0Var.getClass();
            ensureAvDeviceTypeIsMutable();
            ((ipe) this.avDeviceType_).q(i, a0Var.a);
        }

        private void setBitDepth(int i) {
            this.bitField0_ |= 4096;
            this.bitDepth_ = i;
        }

        private void setCecCommand(int i, b bVar) {
            bVar.getClass();
            ensureCecCommandIsMutable();
            this.cecCommand_.set(i, bVar);
        }

        private void setCecVersion(int i) {
            this.bitField0_ |= RemoteCameraConfig.Mic.BUFFER_SIZE;
            this.cecVersion_ = i;
        }

        private void setColorEncoding(l0 l0Var) {
            this.colorEncoding_ = l0Var.a;
            this.bitField0_ |= 2048;
        }

        private void setCurrentHdcpVersion(int i) {
            this.bitField0_ |= 1048576;
            this.currentHdcpVersion_ = i;
        }

        private void setDolbyVisionSupport(boolean z) {
            this.bitField0_ |= SQLiteDatabase.OPEN_NOMUTEX;
            this.dolbyVisionSupport_ = z;
        }

        private void setEotfSupport(int i) {
            this.bitField0_ |= SQLiteDatabase.OPEN_FULLMUTEX;
            this.eotfSupport_ = i;
        }

        private void setFrameRate(int i) {
            this.bitField0_ |= 1024;
            this.frameRate_ = i;
        }

        private void setHdr10Support(boolean z) {
            this.bitField0_ |= 16384;
            this.hdr10Support_ = z;
        }

        private void setHorizontalResolution(int i) {
            this.bitField0_ |= 32;
            this.horizontalResolution_ = i;
        }

        private void setIsInPathToTv(boolean z) {
            this.bitField0_ |= 256;
            this.isInPathToTv_ = z;
        }

        private void setManufactureWeek(int i) {
            this.bitField0_ |= 16;
            this.manufactureWeek_ = i;
        }

        private void setManufactureYear(int i) {
            this.bitField0_ |= 8;
            this.manufactureYear_ = i;
        }

        private void setManufacturerName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.manufacturerName_ = str;
        }

        private void setManufacturerNameBytes(nn3 nn3Var) {
            this.manufacturerName_ = nn3Var.y();
            this.bitField0_ |= 1;
        }

        private void setMaximumSupportedHdcpVersion(int i) {
            this.bitField0_ |= 524288;
            this.maximumSupportedHdcpVersion_ = i;
        }

        private void setModelName(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.modelName_ = str;
        }

        private void setModelNameBytes(nn3 nn3Var) {
            this.modelName_ = nn3Var.y();
            this.bitField0_ |= 2;
        }

        private void setPositionInSetup(int i) {
            this.bitField0_ |= 128;
            this.positionInSetup_ = i;
        }

        private void setProductCode(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.productCode_ = str;
        }

        private void setProductCodeBytes(nn3 nn3Var) {
            this.productCode_ = nn3Var.y();
            this.bitField0_ |= 4;
        }

        private void setTmds(int i) {
            this.bitField0_ |= RemoteCameraConfig.Notification.ID;
            this.tmds_ = i;
        }

        private void setVerticalResolution(int i) {
            this.bitField0_ |= 64;
            this.verticalResolution_ = i;
        }

        private void setYuv420Support(boolean z) {
            this.bitField0_ |= SQLiteDatabase.OPEN_PRIVATECACHE;
            this.yuv420Support_ = z;
        }

        private void setYuvSupport(boolean z) {
            this.bitField0_ |= SQLiteDatabase.OPEN_SHAREDCACHE;
            this.yuvSupport_ = z;
        }

        @Override // defpackage.o3d
        public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
            n7k n7kVar;
            switch (n3dVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0018\u0000\u0001\u0001\u0018\u0018\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ࠞ\u0005င\u0003\u0006င\u0004\u0007င\u0005\bင\u0006\t\u001b\nင\u0007\u000bဇ\b\fင\t\r\u001b\u000eင\n\u000f᠌\u000b\u0010င\f\u0011င\r\u0012ဇ\u000e\u0013ဇ\u000f\u0014င\u0010\u0015ဇ\u0011\u0016ဇ\u0012\u0017င\u0013\u0018င\u0014", new Object[]{"bitField0_", "manufacturerName_", "modelName_", "productCode_", "avDeviceType_", z.a, "manufactureYear_", "manufactureWeek_", "horizontalResolution_", "verticalResolution_", "audioDescription_", a.class, "positionInSetup_", "isInPathToTv_", "cecVersion_", "cecCommand_", b.class, "frameRate_", "colorEncoding_", k0.a, "bitDepth_", "tmds_", "hdr10Support_", "dolbyVisionSupport_", "eotfSupport_", "yuvSupport_", "yuv420Support_", "maximumSupportedHdcpVersion_", "currentHdcpVersion_"});
                case 3:
                    return new f();
                case 4:
                    return new h0(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    n7k n7kVar2 = PARSER;
                    if (n7kVar2 != null) {
                        return n7kVar2;
                    }
                    synchronized (f.class) {
                        try {
                            n7kVar = PARSER;
                            if (n7kVar == null) {
                                n7kVar = new j3d(DEFAULT_INSTANCE);
                                PARSER = n7kVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return n7kVar;
                default:
                    androidx.core.app.q.i();
                    return null;
            }
        }

        public a getAudioDescription(int i) {
            return (a) this.audioDescription_.get(i);
        }

        public int getAudioDescriptionCount() {
            return this.audioDescription_.size();
        }

        public List<a> getAudioDescriptionList() {
            return this.audioDescription_;
        }

        public g0 getAudioDescriptionOrBuilder(int i) {
            return (g0) this.audioDescription_.get(i);
        }

        public List<? extends g0> getAudioDescriptionOrBuilderList() {
            return this.audioDescription_;
        }

        public a0 getAvDeviceType(int i) {
            a0 b2 = a0.b(((ipe) this.avDeviceType_).n(i));
            return b2 == null ? a0.AV_DEVICE_TYPE_UNKNOWN : b2;
        }

        public int getAvDeviceTypeCount() {
            return this.avDeviceType_.size();
        }

        public List<a0> getAvDeviceTypeList() {
            return new ose(this.avDeviceType_, avDeviceType_converter_);
        }

        public int getBitDepth() {
            return this.bitDepth_;
        }

        public b getCecCommand(int i) {
            return (b) this.cecCommand_.get(i);
        }

        public int getCecCommandCount() {
            return this.cecCommand_.size();
        }

        public List<b> getCecCommandList() {
            return this.cecCommand_;
        }

        public j0 getCecCommandOrBuilder(int i) {
            return (j0) this.cecCommand_.get(i);
        }

        public List<? extends j0> getCecCommandOrBuilderList() {
            return this.cecCommand_;
        }

        public int getCecVersion() {
            return this.cecVersion_;
        }

        public l0 getColorEncoding() {
            l0 b2 = l0.b(this.colorEncoding_);
            return b2 == null ? l0.COLOR_ENCODING_UNKNOWN : b2;
        }

        public int getCurrentHdcpVersion() {
            return this.currentHdcpVersion_;
        }

        public boolean getDolbyVisionSupport() {
            return this.dolbyVisionSupport_;
        }

        public int getEotfSupport() {
            return this.eotfSupport_;
        }

        public int getFrameRate() {
            return this.frameRate_;
        }

        public boolean getHdr10Support() {
            return this.hdr10Support_;
        }

        public int getHorizontalResolution() {
            return this.horizontalResolution_;
        }

        public boolean getIsInPathToTv() {
            return this.isInPathToTv_;
        }

        public int getManufactureWeek() {
            return this.manufactureWeek_;
        }

        public int getManufactureYear() {
            return this.manufactureYear_;
        }

        public String getManufacturerName() {
            return this.manufacturerName_;
        }

        public nn3 getManufacturerNameBytes() {
            return nn3.o(this.manufacturerName_);
        }

        public int getMaximumSupportedHdcpVersion() {
            return this.maximumSupportedHdcpVersion_;
        }

        public String getModelName() {
            return this.modelName_;
        }

        public nn3 getModelNameBytes() {
            return nn3.o(this.modelName_);
        }

        public int getPositionInSetup() {
            return this.positionInSetup_;
        }

        public String getProductCode() {
            return this.productCode_;
        }

        public nn3 getProductCodeBytes() {
            return nn3.o(this.productCode_);
        }

        public int getTmds() {
            return this.tmds_;
        }

        public int getVerticalResolution() {
            return this.verticalResolution_;
        }

        public boolean getYuv420Support() {
            return this.yuv420Support_;
        }

        public boolean getYuvSupport() {
            return this.yuvSupport_;
        }

        public boolean hasBitDepth() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasCecVersion() {
            return (this.bitField0_ & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0;
        }

        public boolean hasColorEncoding() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasCurrentHdcpVersion() {
            return (this.bitField0_ & 1048576) != 0;
        }

        public boolean hasDolbyVisionSupport() {
            return (this.bitField0_ & SQLiteDatabase.OPEN_NOMUTEX) != 0;
        }

        public boolean hasEotfSupport() {
            return (this.bitField0_ & SQLiteDatabase.OPEN_FULLMUTEX) != 0;
        }

        public boolean hasFrameRate() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasHdr10Support() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasHorizontalResolution() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasIsInPathToTv() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasManufactureWeek() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasManufactureYear() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasManufacturerName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasMaximumSupportedHdcpVersion() {
            return (this.bitField0_ & 524288) != 0;
        }

        public boolean hasModelName() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPositionInSetup() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasProductCode() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasTmds() {
            return (this.bitField0_ & RemoteCameraConfig.Notification.ID) != 0;
        }

        public boolean hasVerticalResolution() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasYuv420Support() {
            return (this.bitField0_ & SQLiteDatabase.OPEN_PRIVATECACHE) != 0;
        }

        public boolean hasYuvSupport() {
            return (this.bitField0_ & SQLiteDatabase.OPEN_SHAREDCACHE) != 0;
        }

        public static final class a extends o3d implements g0 {
            public static final int AUDIO_FORMAT_FIELD_NUMBER = 1;
            public static final int BIT_DEPTH_FIELD_NUMBER = 5;
            private static final a DEFAULT_INSTANCE;
            public static final int MAX_BIT_RATE_PER_SECOND_FIELD_NUMBER = 4;
            public static final int NUM_CHANNELS_FIELD_NUMBER = 2;
            public static final int OUTPUT_MODE_FIELD_NUMBER = 6;
            private static volatile n7k PARSER = null;
            public static final int SAMPLE_FREQUENCY_HZ_FIELD_NUMBER = 3;
            private int audioFormat_;
            private int bitDepth_;
            private int bitField0_;
            private int maxBitRatePerSecond_;
            private int numChannels_;
            private int outputMode_;
            private mse sampleFrequencyHz_ = o3d.emptyIntList();

            static {
                a aVar = new a();
                DEFAULT_INSTANCE = aVar;
                o3d.registerDefaultInstance(a.class, aVar);
            }

            private a() {
            }

            private void addAllSampleFrequencyHz(Iterable<? extends Integer> iterable) {
                ensureSampleFrequencyHzIsMutable();
                c8.addAll(iterable, this.sampleFrequencyHz_);
            }

            private void addSampleFrequencyHz(int i) {
                ensureSampleFrequencyHzIsMutable();
                ((ipe) this.sampleFrequencyHz_).g(i);
            }

            private void clearAudioFormat() {
                this.bitField0_ &= -2;
                this.audioFormat_ = 0;
            }

            private void clearBitDepth() {
                this.bitField0_ &= -9;
                this.bitDepth_ = 0;
            }

            private void clearMaxBitRatePerSecond() {
                this.bitField0_ &= -5;
                this.maxBitRatePerSecond_ = 0;
            }

            private void clearNumChannels() {
                this.bitField0_ &= -3;
                this.numChannels_ = 0;
            }

            private void clearOutputMode() {
                this.bitField0_ &= -17;
                this.outputMode_ = 0;
            }

            private void clearSampleFrequencyHz() {
                this.sampleFrequencyHz_ = o3d.emptyIntList();
            }

            /* JADX WARN: Multi-variable type inference failed */
            private void ensureSampleFrequencyHzIsMutable() {
                mse mseVar = this.sampleFrequencyHz_;
                if (((u8) mseVar).a) {
                    return;
                }
                this.sampleFrequencyHz_ = o3d.mutableCopy(mseVar);
            }

            public static a getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static d0 newBuilder() {
                return (d0) DEFAULT_INSTANCE.createBuilder();
            }

            public static a parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (a) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(ByteBuffer byteBuffer) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static n7k parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setAudioFormat(c0 c0Var) {
                this.audioFormat_ = c0Var.a;
                this.bitField0_ |= 1;
            }

            private void setBitDepth(int i) {
                this.bitField0_ |= 8;
                this.bitDepth_ = i;
            }

            private void setMaxBitRatePerSecond(int i) {
                this.bitField0_ |= 4;
                this.maxBitRatePerSecond_ = i;
            }

            private void setNumChannels(int i) {
                this.bitField0_ |= 2;
                this.numChannels_ = i;
            }

            private void setOutputMode(f0 f0Var) {
                this.outputMode_ = f0Var.a;
                this.bitField0_ |= 16;
            }

            private void setSampleFrequencyHz(int i, int i2) {
                ensureSampleFrequencyHzIsMutable();
                ((ipe) this.sampleFrequencyHz_).q(i, i2);
            }

            @Override // defpackage.o3d
            public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
                n7k n7kVar;
                switch (n3dVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002င\u0001\u0003\u0016\u0004င\u0002\u0005င\u0003\u0006᠌\u0004", new Object[]{"bitField0_", "audioFormat_", b0.a, "numChannels_", "sampleFrequencyHz_", "maxBitRatePerSecond_", "bitDepth_", "outputMode_", e0.a});
                    case 3:
                        return new a();
                    case 4:
                        return new d0(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        n7k n7kVar2 = PARSER;
                        if (n7kVar2 != null) {
                            return n7kVar2;
                        }
                        synchronized (a.class) {
                            try {
                                n7kVar = PARSER;
                                if (n7kVar == null) {
                                    n7kVar = new j3d(DEFAULT_INSTANCE);
                                    PARSER = n7kVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return n7kVar;
                    default:
                        androidx.core.app.q.i();
                        return null;
                }
            }

            public c0 getAudioFormat() {
                c0 b = c0.b(this.audioFormat_);
                return b == null ? c0.AUDIO_FORMAT_UNKNOWN : b;
            }

            public int getBitDepth() {
                return this.bitDepth_;
            }

            public int getMaxBitRatePerSecond() {
                return this.maxBitRatePerSecond_;
            }

            public int getNumChannels() {
                return this.numChannels_;
            }

            public f0 getOutputMode() {
                int i = this.outputMode_;
                f0 f0Var = f0.ANALOG;
                f0 f0Var2 = i != 0 ? i != 1 ? null : f0.DIGITAL : f0Var;
                return f0Var2 == null ? f0Var : f0Var2;
            }

            public int getSampleFrequencyHz(int i) {
                return ((ipe) this.sampleFrequencyHz_).n(i);
            }

            public int getSampleFrequencyHzCount() {
                return this.sampleFrequencyHz_.size();
            }

            public List<Integer> getSampleFrequencyHzList() {
                return this.sampleFrequencyHz_;
            }

            public boolean hasAudioFormat() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasBitDepth() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasMaxBitRatePerSecond() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasNumChannels() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasOutputMode() {
                return (this.bitField0_ & 16) != 0;
            }

            public static d0 newBuilder(a aVar) {
                return (d0) DEFAULT_INSTANCE.createBuilder(aVar);
            }

            public static a parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (a) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static a parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
            }

            public static a parseFrom(nn3 nn3Var) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
            }

            public static a parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
            }

            public static a parseFrom(byte[] bArr) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static a parseFrom(byte[] bArr, z0c z0cVar) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
            }

            public static a parseFrom(InputStream inputStream) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static a parseFrom(qr4 qr4Var) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
            }

            public static a parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
            }
        }

        public static final class b extends o3d implements j0 {
            private static final b DEFAULT_INSTANCE;
            public static final int NUM_ABORTED_UNKNOWN_REASON_FIELD_NUMBER = 6;
            public static final int NUM_ABORTED_UNRECOGNIZED_FIELD_NUMBER = 7;
            public static final int NUM_RECEIVED_BROADCAST_FIELD_NUMBER = 3;
            public static final int NUM_RECEIVED_DIRECT_FIELD_NUMBER = 2;
            public static final int NUM_SENT_BROADCAST_FIELD_NUMBER = 5;
            public static final int NUM_SENT_DIRECT_FIELD_NUMBER = 4;
            public static final int OPCODE_FIELD_NUMBER = 1;
            private static volatile n7k PARSER;
            private int bitField0_;
            private int numAbortedUnknownReason_;
            private int numAbortedUnrecognized_;
            private int numReceivedBroadcast_;
            private int numReceivedDirect_;
            private int numSentBroadcast_;
            private int numSentDirect_;
            private int opcode_;

            static {
                b bVar = new b();
                DEFAULT_INSTANCE = bVar;
                o3d.registerDefaultInstance(b.class, bVar);
            }

            private b() {
            }

            private void clearNumAbortedUnknownReason() {
                this.bitField0_ &= -33;
                this.numAbortedUnknownReason_ = 0;
            }

            private void clearNumAbortedUnrecognized() {
                this.bitField0_ &= -65;
                this.numAbortedUnrecognized_ = 0;
            }

            private void clearNumReceivedBroadcast() {
                this.bitField0_ &= -5;
                this.numReceivedBroadcast_ = 0;
            }

            private void clearNumReceivedDirect() {
                this.bitField0_ &= -3;
                this.numReceivedDirect_ = 0;
            }

            private void clearNumSentBroadcast() {
                this.bitField0_ &= -17;
                this.numSentBroadcast_ = 0;
            }

            private void clearNumSentDirect() {
                this.bitField0_ &= -9;
                this.numSentDirect_ = 0;
            }

            private void clearOpcode() {
                this.bitField0_ &= -2;
                this.opcode_ = 0;
            }

            public static b getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static i0 newBuilder() {
                return (i0) DEFAULT_INSTANCE.createBuilder();
            }

            public static b parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (b) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static b parseFrom(ByteBuffer byteBuffer) throws bye {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static n7k parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setNumAbortedUnknownReason(int i) {
                this.bitField0_ |= 32;
                this.numAbortedUnknownReason_ = i;
            }

            private void setNumAbortedUnrecognized(int i) {
                this.bitField0_ |= 64;
                this.numAbortedUnrecognized_ = i;
            }

            private void setNumReceivedBroadcast(int i) {
                this.bitField0_ |= 4;
                this.numReceivedBroadcast_ = i;
            }

            private void setNumReceivedDirect(int i) {
                this.bitField0_ |= 2;
                this.numReceivedDirect_ = i;
            }

            private void setNumSentBroadcast(int i) {
                this.bitField0_ |= 16;
                this.numSentBroadcast_ = i;
            }

            private void setNumSentDirect(int i) {
                this.bitField0_ |= 8;
                this.numSentDirect_ = i;
            }

            private void setOpcode(int i) {
                this.bitField0_ |= 1;
                this.opcode_ = i;
            }

            @Override // defpackage.o3d
            public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
                n7k n7kVar;
                switch (n3dVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006", new Object[]{"bitField0_", "opcode_", "numReceivedDirect_", "numReceivedBroadcast_", "numSentDirect_", "numSentBroadcast_", "numAbortedUnknownReason_", "numAbortedUnrecognized_"});
                    case 3:
                        return new b();
                    case 4:
                        return new i0(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        n7k n7kVar2 = PARSER;
                        if (n7kVar2 != null) {
                            return n7kVar2;
                        }
                        synchronized (b.class) {
                            try {
                                n7kVar = PARSER;
                                if (n7kVar == null) {
                                    n7kVar = new j3d(DEFAULT_INSTANCE);
                                    PARSER = n7kVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return n7kVar;
                    default:
                        androidx.core.app.q.i();
                        return null;
                }
            }

            public int getNumAbortedUnknownReason() {
                return this.numAbortedUnknownReason_;
            }

            public int getNumAbortedUnrecognized() {
                return this.numAbortedUnrecognized_;
            }

            public int getNumReceivedBroadcast() {
                return this.numReceivedBroadcast_;
            }

            public int getNumReceivedDirect() {
                return this.numReceivedDirect_;
            }

            public int getNumSentBroadcast() {
                return this.numSentBroadcast_;
            }

            public int getNumSentDirect() {
                return this.numSentDirect_;
            }

            public int getOpcode() {
                return this.opcode_;
            }

            public boolean hasNumAbortedUnknownReason() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasNumAbortedUnrecognized() {
                return (this.bitField0_ & 64) != 0;
            }

            public boolean hasNumReceivedBroadcast() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasNumReceivedDirect() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasNumSentBroadcast() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasNumSentDirect() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasOpcode() {
                return (this.bitField0_ & 1) != 0;
            }

            public static i0 newBuilder(b bVar) {
                return (i0) DEFAULT_INSTANCE.createBuilder(bVar);
            }

            public static b parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (b) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static b parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
            }

            public static b parseFrom(nn3 nn3Var) throws bye {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
            }

            public static b parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
            }

            public static b parseFrom(byte[] bArr) throws bye {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static b parseFrom(byte[] bArr, z0c z0cVar) throws bye {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
            }

            public static b parseFrom(InputStream inputStream) throws IOException {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static b parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static b parseFrom(qr4 qr4Var) throws IOException {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
            }

            public static b parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
            }
        }

        public static h0 newBuilder(f fVar) {
            return (h0) DEFAULT_INSTANCE.createBuilder(fVar);
        }

        public static f parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (f) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static f parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
            return (f) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
        }

        public static f parseFrom(nn3 nn3Var) throws bye {
            return (f) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
        }

        public static f parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
            return (f) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
        }

        private void addAudioDescription(int i, a aVar) {
            aVar.getClass();
            ensureAudioDescriptionIsMutable();
            this.audioDescription_.add(i, aVar);
        }

        private void addCecCommand(int i, b bVar) {
            bVar.getClass();
            ensureCecCommandIsMutable();
            this.cecCommand_.add(i, bVar);
        }

        public static f parseFrom(byte[] bArr) throws bye {
            return (f) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static f parseFrom(byte[] bArr, z0c z0cVar) throws bye {
            return (f) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
        }

        public static f parseFrom(InputStream inputStream) throws IOException {
            return (f) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static f parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (f) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static f parseFrom(qr4 qr4Var) throws IOException {
            return (f) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
        }

        public static f parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
            return (f) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
        }
    }

    public static final class h extends o3d implements xzh {
        public static final int CLIENT_STATUS_FIELD_NUMBER = 5;
        private static final h DEFAULT_INSTANCE;
        public static final int GOOGLE_UPDATE_STATUS_FIELD_NUMBER = 4;
        public static final int IS_SYSTEM_INSTALL_FIELD_NUMBER = 1;
        public static final int LAST_AUTOMATIC_START_TIMESTAMP_FIELD_NUMBER = 2;
        public static final int LAST_UPDATE_CHECK_TIMESTAMP_FIELD_NUMBER = 3;
        private static volatile n7k PARSER;
        private int bitField0_;
        private a clientStatus_;
        private a googleUpdateStatus_;
        private boolean isSystemInstall_;
        private long lastAutomaticStartTimestamp_;
        private long lastUpdateCheckTimestamp_;

        static {
            h hVar = new h();
            DEFAULT_INSTANCE = hVar;
            o3d.registerDefaultInstance(h.class, hVar);
        }

        private h() {
        }

        private void clearClientStatus() {
            this.clientStatus_ = null;
            this.bitField0_ &= -17;
        }

        private void clearGoogleUpdateStatus() {
            this.googleUpdateStatus_ = null;
            this.bitField0_ &= -9;
        }

        private void clearIsSystemInstall() {
            this.bitField0_ &= -2;
            this.isSystemInstall_ = false;
        }

        private void clearLastAutomaticStartTimestamp() {
            this.bitField0_ &= -3;
            this.lastAutomaticStartTimestamp_ = 0L;
        }

        private void clearLastUpdateCheckTimestamp() {
            this.bitField0_ &= -5;
            this.lastUpdateCheckTimestamp_ = 0L;
        }

        public static h getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeClientStatus(a aVar) {
            aVar.getClass();
            a aVar2 = this.clientStatus_;
            if (aVar2 == null || aVar2 == a.getDefaultInstance()) {
                this.clientStatus_ = aVar;
            } else {
                p0 newBuilder = a.newBuilder(this.clientStatus_);
                newBuilder.e(aVar);
                this.clientStatus_ = (a) newBuilder.c();
            }
            this.bitField0_ |= 16;
        }

        private void mergeGoogleUpdateStatus(a aVar) {
            aVar.getClass();
            a aVar2 = this.googleUpdateStatus_;
            if (aVar2 == null || aVar2 == a.getDefaultInstance()) {
                this.googleUpdateStatus_ = aVar;
            } else {
                p0 newBuilder = a.newBuilder(this.googleUpdateStatus_);
                newBuilder.e(aVar);
                this.googleUpdateStatus_ = (a) newBuilder.c();
            }
            this.bitField0_ |= 8;
        }

        public static o0 newBuilder() {
            return (o0) DEFAULT_INSTANCE.createBuilder();
        }

        public static h parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (h) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static h parseFrom(ByteBuffer byteBuffer) throws bye {
            return (h) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n7k parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setClientStatus(a aVar) {
            aVar.getClass();
            this.clientStatus_ = aVar;
            this.bitField0_ |= 16;
        }

        private void setGoogleUpdateStatus(a aVar) {
            aVar.getClass();
            this.googleUpdateStatus_ = aVar;
            this.bitField0_ |= 8;
        }

        private void setIsSystemInstall(boolean z) {
            this.bitField0_ |= 1;
            this.isSystemInstall_ = z;
        }

        private void setLastAutomaticStartTimestamp(long j) {
            this.bitField0_ |= 2;
            this.lastAutomaticStartTimestamp_ = j;
        }

        private void setLastUpdateCheckTimestamp(long j) {
            this.bitField0_ |= 4;
            this.lastUpdateCheckTimestamp_ = j;
        }

        @Override // defpackage.o3d
        public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
            n7k n7kVar;
            switch (n3dVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"bitField0_", "isSystemInstall_", "lastAutomaticStartTimestamp_", "lastUpdateCheckTimestamp_", "googleUpdateStatus_", "clientStatus_"});
                case 3:
                    return new h();
                case 4:
                    return new o0(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    n7k n7kVar2 = PARSER;
                    if (n7kVar2 != null) {
                        return n7kVar2;
                    }
                    synchronized (h.class) {
                        try {
                            n7kVar = PARSER;
                            if (n7kVar == null) {
                                n7kVar = new j3d(DEFAULT_INSTANCE);
                                PARSER = n7kVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return n7kVar;
                default:
                    androidx.core.app.q.i();
                    return null;
            }
        }

        public a getClientStatus() {
            a aVar = this.clientStatus_;
            return aVar == null ? a.getDefaultInstance() : aVar;
        }

        public a getGoogleUpdateStatus() {
            a aVar = this.googleUpdateStatus_;
            return aVar == null ? a.getDefaultInstance() : aVar;
        }

        public boolean getIsSystemInstall() {
            return this.isSystemInstall_;
        }

        public long getLastAutomaticStartTimestamp() {
            return this.lastAutomaticStartTimestamp_;
        }

        public long getLastUpdateCheckTimestamp() {
            return this.lastUpdateCheckTimestamp_;
        }

        public boolean hasClientStatus() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasGoogleUpdateStatus() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasIsSystemInstall() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasLastAutomaticStartTimestamp() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasLastUpdateCheckTimestamp() {
            return (this.bitField0_ & 4) != 0;
        }

        public static final class a extends o3d implements xzh {
            private static final a DEFAULT_INSTANCE;
            public static final int LAST_ERROR_FIELD_NUMBER = 4;
            public static final int LAST_EXTRA_ERROR_FIELD_NUMBER = 5;
            public static final int LAST_RESULT_FIELD_NUMBER = 3;
            public static final int LAST_UPDATE_SUCCESS_TIMESTAMP_FIELD_NUMBER = 2;
            private static volatile n7k PARSER = null;
            public static final int VERSION_FIELD_NUMBER = 1;
            private int bitField0_;
            private int lastError_;
            private int lastExtraError_;
            private int lastResult_;
            private long lastUpdateSuccessTimestamp_;
            private String version_ = "";

            static {
                a aVar = new a();
                DEFAULT_INSTANCE = aVar;
                o3d.registerDefaultInstance(a.class, aVar);
            }

            private a() {
            }

            private void clearLastError() {
                this.bitField0_ &= -9;
                this.lastError_ = 0;
            }

            private void clearLastExtraError() {
                this.bitField0_ &= -17;
                this.lastExtraError_ = 0;
            }

            private void clearLastResult() {
                this.bitField0_ &= -5;
                this.lastResult_ = 0;
            }

            private void clearLastUpdateSuccessTimestamp() {
                this.bitField0_ &= -3;
                this.lastUpdateSuccessTimestamp_ = 0L;
            }

            private void clearVersion() {
                this.bitField0_ &= -2;
                this.version_ = getDefaultInstance().getVersion();
            }

            public static a getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static p0 newBuilder() {
                return (p0) DEFAULT_INSTANCE.createBuilder();
            }

            public static a parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (a) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(ByteBuffer byteBuffer) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static n7k parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setLastError(int i) {
                this.bitField0_ |= 8;
                this.lastError_ = i;
            }

            private void setLastExtraError(int i) {
                this.bitField0_ |= 16;
                this.lastExtraError_ = i;
            }

            private void setLastResult(r0 r0Var) {
                this.lastResult_ = r0Var.a;
                this.bitField0_ |= 4;
            }

            private void setLastUpdateSuccessTimestamp(long j) {
                this.bitField0_ |= 2;
                this.lastUpdateSuccessTimestamp_ = j;
            }

            private void setVersion(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.version_ = str;
            }

            private void setVersionBytes(nn3 nn3Var) {
                this.version_ = nn3Var.y();
                this.bitField0_ |= 1;
            }

            @Override // defpackage.o3d
            public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
                n7k n7kVar;
                switch (n3dVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"bitField0_", "version_", "lastUpdateSuccessTimestamp_", "lastResult_", q0.a, "lastError_", "lastExtraError_"});
                    case 3:
                        return new a();
                    case 4:
                        return new p0(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        n7k n7kVar2 = PARSER;
                        if (n7kVar2 != null) {
                            return n7kVar2;
                        }
                        synchronized (a.class) {
                            try {
                                n7kVar = PARSER;
                                if (n7kVar == null) {
                                    n7kVar = new j3d(DEFAULT_INSTANCE);
                                    PARSER = n7kVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return n7kVar;
                    default:
                        androidx.core.app.q.i();
                        return null;
                }
            }

            public int getLastError() {
                return this.lastError_;
            }

            public int getLastExtraError() {
                return this.lastExtraError_;
            }

            public r0 getLastResult() {
                r0 b = r0.b(this.lastResult_);
                return b == null ? r0.INSTALL_RESULT_SUCCESS : b;
            }

            public long getLastUpdateSuccessTimestamp() {
                return this.lastUpdateSuccessTimestamp_;
            }

            public String getVersion() {
                return this.version_;
            }

            public nn3 getVersionBytes() {
                return nn3.o(this.version_);
            }

            public boolean hasLastError() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasLastExtraError() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasLastResult() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasLastUpdateSuccessTimestamp() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            public static p0 newBuilder(a aVar) {
                return (p0) DEFAULT_INSTANCE.createBuilder(aVar);
            }

            public static a parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (a) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static a parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
            }

            public static a parseFrom(nn3 nn3Var) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
            }

            public static a parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
            }

            public static a parseFrom(byte[] bArr) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static a parseFrom(byte[] bArr, z0c z0cVar) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
            }

            public static a parseFrom(InputStream inputStream) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static a parseFrom(qr4 qr4Var) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
            }

            public static a parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
            }
        }

        public static o0 newBuilder(h hVar) {
            return (o0) DEFAULT_INSTANCE.createBuilder(hVar);
        }

        public static h parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (h) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static h parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
            return (h) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
        }

        public static h parseFrom(nn3 nn3Var) throws bye {
            return (h) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
        }

        public static h parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
            return (h) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
        }

        public static h parseFrom(byte[] bArr) throws bye {
            return (h) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static h parseFrom(byte[] bArr, z0c z0cVar) throws bye {
            return (h) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
        }

        public static h parseFrom(InputStream inputStream) throws IOException {
            return (h) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static h parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (h) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static h parseFrom(qr4 qr4Var) throws IOException {
            return (h) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
        }

        public static h parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
            return (h) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
        }
    }

    public static final class i extends o3d implements xzh {
        public static final int APP_CPU_ARCHITECTURE_FIELD_NUMBER = 21;
        public static final int APP_DRIVE_FIELD_NUMBER = 16;
        public static final int CELLULAR_DEVICE_VARIANT_FIELD_NUMBER = 24;
        public static final int CPU_ARCHITECTURE_FIELD_NUMBER = 1;
        public static final int CPU_FIELD_NUMBER = 13;
        private static final i DEFAULT_INSTANCE;
        public static final int DLL_BASE_FIELD_NUMBER = 3;
        public static final int FORM_FACTOR_FIELD_NUMBER = 22;
        public static final int FULL_HARDWARE_CLASS_FIELD_NUMBER = 18;
        public static final int GPU_FIELD_NUMBER = 8;
        public static final int HARDWARE_CLASS_FIELD_NUMBER = 4;
        public static final int INTERNAL_DISPLAY_SUPPORTS_TOUCH_FIELD_NUMBER = 14;
        public static final int INTERNAL_STORAGE_DEVICES_FIELD_NUMBER = 20;
        public static final int MAX_DPI_X_FIELD_NUMBER = 9;
        public static final int MAX_DPI_Y_FIELD_NUMBER = 10;
        public static final int MOTHERBOARD_FIELD_NUMBER = 25;
        private static volatile n7k PARSER = null;
        public static final int PRIMARY_SCREEN_HEIGHT_FIELD_NUMBER = 7;
        public static final int PRIMARY_SCREEN_SCALE_FACTOR_FIELD_NUMBER = 12;
        public static final int PRIMARY_SCREEN_WIDTH_FIELD_NUMBER = 6;
        public static final int SCREEN_COUNT_FIELD_NUMBER = 5;
        public static final int SYSTEM_RAM_MB_FIELD_NUMBER = 2;
        public static final int TPM_FIRMWARE_VERSION_FIELD_NUMBER = 26;
        public static final int TPM_RW_FIRMWARE_VERSION_FIELD_NUMBER = 27;
        public static final int TPM_TYPE_FIELD_NUMBER = 23;
        public static final int USER_DATA_DRIVE_FIELD_NUMBER = 17;
        private b appDrive_;
        private int bitField0_;
        private a cpu_;
        private long dllBase_;
        private int formFactor_;
        private c gpu_;
        private boolean internalDisplaySupportsTouch_;
        private float maxDpiX_;
        private float maxDpiY_;
        private e motherboard_;
        private int primaryScreenHeight_;
        private float primaryScreenScaleFactor_;
        private int primaryScreenWidth_;
        private int screenCount_;
        private long systemRamMb_;
        private long tpmFirmwareVersion_;
        private int tpmType_;
        private b userDataDrive_;
        private String cpuArchitecture_ = "";
        private String appCpuArchitecture_ = "";
        private String hardwareClass_ = "";
        private String fullHardwareClass_ = "";
        private String cellularDeviceVariant_ = "";
        private rse internalStorageDevices_ = o3d.emptyProtobufList();
        private String tpmRwFirmwareVersion_ = "";

        static {
            i iVar = new i();
            DEFAULT_INSTANCE = iVar;
            o3d.registerDefaultInstance(i.class, iVar);
        }

        private i() {
        }

        private void addAllInternalStorageDevices(Iterable<? extends d> iterable) {
            ensureInternalStorageDevicesIsMutable();
            c8.addAll(iterable, this.internalStorageDevices_);
        }

        private void addInternalStorageDevices(d dVar) {
            dVar.getClass();
            ensureInternalStorageDevicesIsMutable();
            this.internalStorageDevices_.add(dVar);
        }

        private void clearAppCpuArchitecture() {
            this.bitField0_ &= -3;
            this.appCpuArchitecture_ = getDefaultInstance().getAppCpuArchitecture();
        }

        private void clearAppDrive() {
            this.appDrive_ = null;
            this.bitField0_ &= -262145;
        }

        private void clearCellularDeviceVariant() {
            this.bitField0_ &= -65;
            this.cellularDeviceVariant_ = getDefaultInstance().getCellularDeviceVariant();
        }

        private void clearCpu() {
            this.cpu_ = null;
            this.bitField0_ &= -16385;
        }

        private void clearCpuArchitecture() {
            this.bitField0_ &= -2;
            this.cpuArchitecture_ = getDefaultInstance().getCpuArchitecture();
        }

        private void clearDllBase() {
            this.bitField0_ &= -9;
            this.dllBase_ = 0L;
        }

        private void clearFormFactor() {
            this.bitField0_ &= -8193;
            this.formFactor_ = 0;
        }

        private void clearFullHardwareClass() {
            this.bitField0_ &= -33;
            this.fullHardwareClass_ = getDefaultInstance().getFullHardwareClass();
        }

        private void clearGpu() {
            this.gpu_ = null;
            this.bitField0_ &= -65537;
        }

        private void clearHardwareClass() {
            this.bitField0_ &= -17;
            this.hardwareClass_ = getDefaultInstance().getHardwareClass();
        }

        private void clearInternalDisplaySupportsTouch() {
            this.bitField0_ &= -131073;
            this.internalDisplaySupportsTouch_ = false;
        }

        private void clearInternalStorageDevices() {
            this.internalStorageDevices_ = o3d.emptyProtobufList();
        }

        private void clearMaxDpiX() {
            this.bitField0_ &= -2049;
            this.maxDpiX_ = 0.0f;
        }

        private void clearMaxDpiY() {
            this.bitField0_ &= -4097;
            this.maxDpiY_ = 0.0f;
        }

        private void clearMotherboard() {
            this.motherboard_ = null;
            this.bitField0_ &= -32769;
        }

        private void clearPrimaryScreenHeight() {
            this.bitField0_ &= -513;
            this.primaryScreenHeight_ = 0;
        }

        private void clearPrimaryScreenScaleFactor() {
            this.bitField0_ &= -1025;
            this.primaryScreenScaleFactor_ = 0.0f;
        }

        private void clearPrimaryScreenWidth() {
            this.bitField0_ &= -257;
            this.primaryScreenWidth_ = 0;
        }

        private void clearScreenCount() {
            this.bitField0_ &= -129;
            this.screenCount_ = 0;
        }

        private void clearSystemRamMb() {
            this.bitField0_ &= -5;
            this.systemRamMb_ = 0L;
        }

        private void clearTpmFirmwareVersion() {
            this.bitField0_ &= -2097153;
            this.tpmFirmwareVersion_ = 0L;
        }

        private void clearTpmRwFirmwareVersion() {
            this.bitField0_ &= -4194305;
            this.tpmRwFirmwareVersion_ = getDefaultInstance().getTpmRwFirmwareVersion();
        }

        private void clearTpmType() {
            this.bitField0_ &= -1048577;
            this.tpmType_ = 0;
        }

        private void clearUserDataDrive() {
            this.userDataDrive_ = null;
            this.bitField0_ &= -524289;
        }

        private void ensureInternalStorageDevicesIsMutable() {
            rse rseVar = this.internalStorageDevices_;
            if (((u8) rseVar).a) {
                return;
            }
            this.internalStorageDevices_ = o3d.mutableCopy(rseVar);
        }

        public static i getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeAppDrive(b bVar) {
            bVar.getClass();
            b bVar2 = this.appDrive_;
            if (bVar2 == null || bVar2 == b.getDefaultInstance()) {
                this.appDrive_ = bVar;
            } else {
                w0 newBuilder = b.newBuilder(this.appDrive_);
                newBuilder.e(bVar);
                this.appDrive_ = (b) newBuilder.c();
            }
            this.bitField0_ |= SQLiteDatabase.OPEN_PRIVATECACHE;
        }

        private void mergeCpu(a aVar) {
            aVar.getClass();
            a aVar2 = this.cpu_;
            if (aVar2 == null || aVar2 == a.getDefaultInstance()) {
                this.cpu_ = aVar;
            } else {
                v0 newBuilder = a.newBuilder(this.cpu_);
                newBuilder.e(aVar);
                this.cpu_ = (a) newBuilder.c();
            }
            this.bitField0_ |= 16384;
        }

        private void mergeGpu(c cVar) {
            cVar.getClass();
            c cVar2 = this.gpu_;
            if (cVar2 == null || cVar2 == c.getDefaultInstance()) {
                this.gpu_ = cVar;
            } else {
                z0 newBuilder = c.newBuilder(this.gpu_);
                newBuilder.e(cVar);
                this.gpu_ = (c) newBuilder.c();
            }
            this.bitField0_ |= SQLiteDatabase.OPEN_FULLMUTEX;
        }

        private void mergeMotherboard(e eVar) {
            eVar.getClass();
            e eVar2 = this.motherboard_;
            if (eVar2 == null || eVar2 == e.getDefaultInstance()) {
                this.motherboard_ = eVar;
            } else {
                g1 newBuilder = e.newBuilder(this.motherboard_);
                newBuilder.e(eVar);
                this.motherboard_ = (e) newBuilder.c();
            }
            this.bitField0_ |= SQLiteDatabase.OPEN_NOMUTEX;
        }

        private void mergeUserDataDrive(b bVar) {
            bVar.getClass();
            b bVar2 = this.userDataDrive_;
            if (bVar2 == null || bVar2 == b.getDefaultInstance()) {
                this.userDataDrive_ = bVar;
            } else {
                w0 newBuilder = b.newBuilder(this.userDataDrive_);
                newBuilder.e(bVar);
                this.userDataDrive_ = (b) newBuilder.c();
            }
            this.bitField0_ |= 524288;
        }

        public static u0 newBuilder() {
            return (u0) DEFAULT_INSTANCE.createBuilder();
        }

        public static i parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (i) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static i parseFrom(ByteBuffer byteBuffer) throws bye {
            return (i) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n7k parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void removeInternalStorageDevices(int i) {
            ensureInternalStorageDevicesIsMutable();
            this.internalStorageDevices_.remove(i);
        }

        private void setAppCpuArchitecture(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.appCpuArchitecture_ = str;
        }

        private void setAppCpuArchitectureBytes(nn3 nn3Var) {
            this.appCpuArchitecture_ = nn3Var.y();
            this.bitField0_ |= 2;
        }

        private void setAppDrive(b bVar) {
            bVar.getClass();
            this.appDrive_ = bVar;
            this.bitField0_ |= SQLiteDatabase.OPEN_PRIVATECACHE;
        }

        private void setCellularDeviceVariant(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.cellularDeviceVariant_ = str;
        }

        private void setCellularDeviceVariantBytes(nn3 nn3Var) {
            this.cellularDeviceVariant_ = nn3Var.y();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCpu(a aVar) {
            aVar.getClass();
            this.cpu_ = aVar;
            this.bitField0_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCpuArchitecture(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.cpuArchitecture_ = str;
        }

        private void setCpuArchitectureBytes(nn3 nn3Var) {
            this.cpuArchitecture_ = nn3Var.y();
            this.bitField0_ |= 1;
        }

        private void setDllBase(long j) {
            this.bitField0_ |= 8;
            this.dllBase_ = j;
        }

        private void setFormFactor(y0 y0Var) {
            this.formFactor_ = y0Var.a;
            this.bitField0_ |= RemoteCameraConfig.Notification.ID;
        }

        private void setFullHardwareClass(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.fullHardwareClass_ = str;
        }

        private void setFullHardwareClassBytes(nn3 nn3Var) {
            this.fullHardwareClass_ = nn3Var.y();
            this.bitField0_ |= 32;
        }

        private void setGpu(c cVar) {
            cVar.getClass();
            this.gpu_ = cVar;
            this.bitField0_ |= SQLiteDatabase.OPEN_FULLMUTEX;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHardwareClass(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.hardwareClass_ = str;
        }

        private void setHardwareClassBytes(nn3 nn3Var) {
            this.hardwareClass_ = nn3Var.y();
            this.bitField0_ |= 16;
        }

        private void setInternalDisplaySupportsTouch(boolean z) {
            this.bitField0_ |= SQLiteDatabase.OPEN_SHAREDCACHE;
            this.internalDisplaySupportsTouch_ = z;
        }

        private void setInternalStorageDevices(int i, d dVar) {
            dVar.getClass();
            ensureInternalStorageDevicesIsMutable();
            this.internalStorageDevices_.set(i, dVar);
        }

        private void setMaxDpiX(float f) {
            this.bitField0_ |= 2048;
            this.maxDpiX_ = f;
        }

        private void setMaxDpiY(float f) {
            this.bitField0_ |= 4096;
            this.maxDpiY_ = f;
        }

        private void setMotherboard(e eVar) {
            eVar.getClass();
            this.motherboard_ = eVar;
            this.bitField0_ |= SQLiteDatabase.OPEN_NOMUTEX;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrimaryScreenHeight(int i) {
            this.bitField0_ |= RemoteCameraConfig.Mic.BUFFER_SIZE;
            this.primaryScreenHeight_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrimaryScreenScaleFactor(float f) {
            this.bitField0_ |= 1024;
            this.primaryScreenScaleFactor_ = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPrimaryScreenWidth(int i) {
            this.bitField0_ |= 256;
            this.primaryScreenWidth_ = i;
        }

        private void setScreenCount(int i) {
            this.bitField0_ |= 128;
            this.screenCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSystemRamMb(long j) {
            this.bitField0_ |= 4;
            this.systemRamMb_ = j;
        }

        private void setTpmFirmwareVersion(long j) {
            this.bitField0_ |= 2097152;
            this.tpmFirmwareVersion_ = j;
        }

        private void setTpmRwFirmwareVersion(String str) {
            str.getClass();
            this.bitField0_ |= RemoteCameraConfig.Camera.BITRATE;
            this.tpmRwFirmwareVersion_ = str;
        }

        private void setTpmRwFirmwareVersionBytes(nn3 nn3Var) {
            this.tpmRwFirmwareVersion_ = nn3Var.y();
            this.bitField0_ |= RemoteCameraConfig.Camera.BITRATE;
        }

        private void setTpmType(i1 i1Var) {
            this.tpmType_ = i1Var.a;
            this.bitField0_ |= 1048576;
        }

        private void setUserDataDrive(b bVar) {
            bVar.getClass();
            this.userDataDrive_ = bVar;
            this.bitField0_ |= 524288;
        }

        @Override // defpackage.o3d
        public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
            n7k n7kVar;
            switch (n3dVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0018\u0000\u0001\u0001\u001b\u0018\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0002\u0003ဂ\u0003\u0004ဈ\u0004\u0005င\u0007\u0006င\b\u0007င\t\bဉ\u0010\tခ\u000b\nခ\f\fခ\n\rဉ\u000e\u000eဇ\u0011\u0010ဉ\u0012\u0011ဉ\u0013\u0012ဈ\u0005\u0014\u001b\u0015ဈ\u0001\u0016᠌\r\u0017᠌\u0014\u0018ဈ\u0006\u0019ဉ\u000f\u001aဃ\u0015\u001bဈ\u0016", new Object[]{"bitField0_", "cpuArchitecture_", "systemRamMb_", "dllBase_", "hardwareClass_", "screenCount_", "primaryScreenWidth_", "primaryScreenHeight_", "gpu_", "maxDpiX_", "maxDpiY_", "primaryScreenScaleFactor_", "cpu_", "internalDisplaySupportsTouch_", "appDrive_", "userDataDrive_", "fullHardwareClass_", "internalStorageDevices_", d.class, "appCpuArchitecture_", "formFactor_", x0.a, "tpmType_", h1.a, "cellularDeviceVariant_", "motherboard_", "tpmFirmwareVersion_", "tpmRwFirmwareVersion_"});
                case 3:
                    return new i();
                case 4:
                    return new u0(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    n7k n7kVar2 = PARSER;
                    if (n7kVar2 != null) {
                        return n7kVar2;
                    }
                    synchronized (i.class) {
                        try {
                            n7kVar = PARSER;
                            if (n7kVar == null) {
                                n7kVar = new j3d(DEFAULT_INSTANCE);
                                PARSER = n7kVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return n7kVar;
                default:
                    androidx.core.app.q.i();
                    return null;
            }
        }

        public String getAppCpuArchitecture() {
            return this.appCpuArchitecture_;
        }

        public nn3 getAppCpuArchitectureBytes() {
            return nn3.o(this.appCpuArchitecture_);
        }

        public b getAppDrive() {
            b bVar = this.appDrive_;
            return bVar == null ? b.getDefaultInstance() : bVar;
        }

        public String getCellularDeviceVariant() {
            return this.cellularDeviceVariant_;
        }

        public nn3 getCellularDeviceVariantBytes() {
            return nn3.o(this.cellularDeviceVariant_);
        }

        public a getCpu() {
            a aVar = this.cpu_;
            return aVar == null ? a.getDefaultInstance() : aVar;
        }

        public String getCpuArchitecture() {
            return this.cpuArchitecture_;
        }

        public nn3 getCpuArchitectureBytes() {
            return nn3.o(this.cpuArchitecture_);
        }

        public long getDllBase() {
            return this.dllBase_;
        }

        public y0 getFormFactor() {
            y0 y0Var;
            int i = this.formFactor_;
            y0 y0Var2 = y0.FORM_FACTOR_UNKNOWN;
            switch (i) {
                case 0:
                    y0Var = y0Var2;
                    break;
                case 1:
                    y0Var = y0.FORM_FACTOR_DESKTOP;
                    break;
                case 2:
                    y0Var = y0.FORM_FACTOR_PHONE;
                    break;
                case 3:
                    y0Var = y0.FORM_FACTOR_TABLET;
                    break;
                case 4:
                    y0Var = y0.FORM_FACTOR_TV;
                    break;
                case 5:
                    y0Var = y0.FORM_FACTOR_MEET_DEVICE;
                    break;
                case 6:
                    y0Var = y0.FORM_FACTOR_AUTOMOTIVE;
                    break;
                case 7:
                    y0Var = y0.FORM_FACTOR_FOLDABLE;
                    break;
                default:
                    y0Var = null;
                    break;
            }
            return y0Var == null ? y0Var2 : y0Var;
        }

        public String getFullHardwareClass() {
            return this.fullHardwareClass_;
        }

        public nn3 getFullHardwareClassBytes() {
            return nn3.o(this.fullHardwareClass_);
        }

        public c getGpu() {
            c cVar = this.gpu_;
            return cVar == null ? c.getDefaultInstance() : cVar;
        }

        public String getHardwareClass() {
            return this.hardwareClass_;
        }

        public nn3 getHardwareClassBytes() {
            return nn3.o(this.hardwareClass_);
        }

        public boolean getInternalDisplaySupportsTouch() {
            return this.internalDisplaySupportsTouch_;
        }

        public d getInternalStorageDevices(int i) {
            return (d) this.internalStorageDevices_.get(i);
        }

        public int getInternalStorageDevicesCount() {
            return this.internalStorageDevices_.size();
        }

        public List<d> getInternalStorageDevicesList() {
            return this.internalStorageDevices_;
        }

        public f1 getInternalStorageDevicesOrBuilder(int i) {
            return (f1) this.internalStorageDevices_.get(i);
        }

        public List<? extends f1> getInternalStorageDevicesOrBuilderList() {
            return this.internalStorageDevices_;
        }

        public float getMaxDpiX() {
            return this.maxDpiX_;
        }

        public float getMaxDpiY() {
            return this.maxDpiY_;
        }

        public e getMotherboard() {
            e eVar = this.motherboard_;
            return eVar == null ? e.getDefaultInstance() : eVar;
        }

        public int getPrimaryScreenHeight() {
            return this.primaryScreenHeight_;
        }

        public float getPrimaryScreenScaleFactor() {
            return this.primaryScreenScaleFactor_;
        }

        public int getPrimaryScreenWidth() {
            return this.primaryScreenWidth_;
        }

        public int getScreenCount() {
            return this.screenCount_;
        }

        public long getSystemRamMb() {
            return this.systemRamMb_;
        }

        public long getTpmFirmwareVersion() {
            return this.tpmFirmwareVersion_;
        }

        public String getTpmRwFirmwareVersion() {
            return this.tpmRwFirmwareVersion_;
        }

        public nn3 getTpmRwFirmwareVersionBytes() {
            return nn3.o(this.tpmRwFirmwareVersion_);
        }

        public i1 getTpmType() {
            i1 b2 = i1.b(this.tpmType_);
            return b2 == null ? i1.TPM_TYPE_UNKNOWN : b2;
        }

        public b getUserDataDrive() {
            b bVar = this.userDataDrive_;
            return bVar == null ? b.getDefaultInstance() : bVar;
        }

        public boolean hasAppCpuArchitecture() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasAppDrive() {
            return (this.bitField0_ & SQLiteDatabase.OPEN_PRIVATECACHE) != 0;
        }

        public boolean hasCellularDeviceVariant() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasCpu() {
            return (this.bitField0_ & 16384) != 0;
        }

        public boolean hasCpuArchitecture() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasDllBase() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasFormFactor() {
            return (this.bitField0_ & RemoteCameraConfig.Notification.ID) != 0;
        }

        public boolean hasFullHardwareClass() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasGpu() {
            return (this.bitField0_ & SQLiteDatabase.OPEN_FULLMUTEX) != 0;
        }

        public boolean hasHardwareClass() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasInternalDisplaySupportsTouch() {
            return (this.bitField0_ & SQLiteDatabase.OPEN_SHAREDCACHE) != 0;
        }

        public boolean hasMaxDpiX() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasMaxDpiY() {
            return (this.bitField0_ & 4096) != 0;
        }

        public boolean hasMotherboard() {
            return (this.bitField0_ & SQLiteDatabase.OPEN_NOMUTEX) != 0;
        }

        public boolean hasPrimaryScreenHeight() {
            return (this.bitField0_ & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0;
        }

        public boolean hasPrimaryScreenScaleFactor() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasPrimaryScreenWidth() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasScreenCount() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasSystemRamMb() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasTpmFirmwareVersion() {
            return (this.bitField0_ & 2097152) != 0;
        }

        public boolean hasTpmRwFirmwareVersion() {
            return (this.bitField0_ & RemoteCameraConfig.Camera.BITRATE) != 0;
        }

        public boolean hasTpmType() {
            return (this.bitField0_ & 1048576) != 0;
        }

        public boolean hasUserDataDrive() {
            return (this.bitField0_ & 524288) != 0;
        }

        public static final class a extends o3d implements xzh {
            private static final a DEFAULT_INSTANCE;
            public static final int IS_HYPERVISOR_FIELD_NUMBER = 4;
            public static final int NUM_CORES_FIELD_NUMBER = 3;
            private static volatile n7k PARSER = null;
            public static final int SIGNATURE_FIELD_NUMBER = 2;
            public static final int VENDOR_NAME_FIELD_NUMBER = 1;
            private int bitField0_;
            private boolean isHypervisor_;
            private int numCores_;
            private int signature_;
            private String vendorName_ = "";

            static {
                a aVar = new a();
                DEFAULT_INSTANCE = aVar;
                o3d.registerDefaultInstance(a.class, aVar);
            }

            private a() {
            }

            private void clearIsHypervisor() {
                this.bitField0_ &= -9;
                this.isHypervisor_ = false;
            }

            private void clearNumCores() {
                this.bitField0_ &= -5;
                this.numCores_ = 0;
            }

            private void clearSignature() {
                this.bitField0_ &= -3;
                this.signature_ = 0;
            }

            private void clearVendorName() {
                this.bitField0_ &= -2;
                this.vendorName_ = getDefaultInstance().getVendorName();
            }

            public static a getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static v0 newBuilder() {
                return (v0) DEFAULT_INSTANCE.createBuilder();
            }

            public static a parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (a) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(ByteBuffer byteBuffer) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static n7k parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setIsHypervisor(boolean z) {
                this.bitField0_ |= 8;
                this.isHypervisor_ = z;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setNumCores(int i) {
                this.bitField0_ |= 4;
                this.numCores_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setSignature(int i) {
                this.bitField0_ |= 2;
                this.signature_ = i;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void setVendorName(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.vendorName_ = str;
            }

            private void setVendorNameBytes(nn3 nn3Var) {
                this.vendorName_ = nn3Var.y();
                this.bitField0_ |= 1;
            }

            @Override // defpackage.o3d
            public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
                n7k n7kVar;
                switch (n3dVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "vendorName_", "signature_", "numCores_", "isHypervisor_"});
                    case 3:
                        return new a();
                    case 4:
                        return new v0(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        n7k n7kVar2 = PARSER;
                        if (n7kVar2 != null) {
                            return n7kVar2;
                        }
                        synchronized (a.class) {
                            try {
                                n7kVar = PARSER;
                                if (n7kVar == null) {
                                    n7kVar = new j3d(DEFAULT_INSTANCE);
                                    PARSER = n7kVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return n7kVar;
                    default:
                        androidx.core.app.q.i();
                        return null;
                }
            }

            public boolean getIsHypervisor() {
                return this.isHypervisor_;
            }

            public int getNumCores() {
                return this.numCores_;
            }

            public int getSignature() {
                return this.signature_;
            }

            public String getVendorName() {
                return this.vendorName_;
            }

            public nn3 getVendorNameBytes() {
                return nn3.o(this.vendorName_);
            }

            public boolean hasIsHypervisor() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasNumCores() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasSignature() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasVendorName() {
                return (this.bitField0_ & 1) != 0;
            }

            public static v0 newBuilder(a aVar) {
                return (v0) DEFAULT_INSTANCE.createBuilder(aVar);
            }

            public static a parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (a) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static a parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
            }

            public static a parseFrom(nn3 nn3Var) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
            }

            public static a parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
            }

            public static a parseFrom(byte[] bArr) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static a parseFrom(byte[] bArr, z0c z0cVar) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
            }

            public static a parseFrom(InputStream inputStream) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static a parseFrom(qr4 qr4Var) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
            }

            public static a parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
            }
        }

        public static final class b extends o3d implements xzh {
            private static final b DEFAULT_INSTANCE;
            public static final int HAS_SEEK_PENALTY_FIELD_NUMBER = 1;
            private static volatile n7k PARSER;
            private int bitField0_;
            private boolean hasSeekPenalty_;

            static {
                b bVar = new b();
                DEFAULT_INSTANCE = bVar;
                o3d.registerDefaultInstance(b.class, bVar);
            }

            private b() {
            }

            private void clearHasSeekPenalty() {
                this.bitField0_ &= -2;
                this.hasSeekPenalty_ = false;
            }

            public static b getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static w0 newBuilder() {
                return (w0) DEFAULT_INSTANCE.createBuilder();
            }

            public static b parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (b) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static b parseFrom(ByteBuffer byteBuffer) throws bye {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static n7k parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setHasSeekPenalty(boolean z) {
                this.bitField0_ |= 1;
                this.hasSeekPenalty_ = z;
            }

            @Override // defpackage.o3d
            public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
                n7k n7kVar;
                switch (n3dVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"bitField0_", "hasSeekPenalty_"});
                    case 3:
                        return new b();
                    case 4:
                        return new w0(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        n7k n7kVar2 = PARSER;
                        if (n7kVar2 != null) {
                            return n7kVar2;
                        }
                        synchronized (b.class) {
                            try {
                                n7kVar = PARSER;
                                if (n7kVar == null) {
                                    n7kVar = new j3d(DEFAULT_INSTANCE);
                                    PARSER = n7kVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return n7kVar;
                    default:
                        androidx.core.app.q.i();
                        return null;
                }
            }

            public boolean getHasSeekPenalty() {
                return this.hasSeekPenalty_;
            }

            public boolean hasHasSeekPenalty() {
                return (this.bitField0_ & 1) != 0;
            }

            public static w0 newBuilder(b bVar) {
                return (w0) DEFAULT_INSTANCE.createBuilder(bVar);
            }

            public static b parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (b) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static b parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
            }

            public static b parseFrom(nn3 nn3Var) throws bye {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
            }

            public static b parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
            }

            public static b parseFrom(byte[] bArr) throws bye {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static b parseFrom(byte[] bArr, z0c z0cVar) throws bye {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
            }

            public static b parseFrom(InputStream inputStream) throws IOException {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static b parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static b parseFrom(qr4 qr4Var) throws IOException {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
            }

            public static b parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
                return (b) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
            }
        }

        public static final class c extends o3d implements xzh {
            private static final c DEFAULT_INSTANCE;
            public static final int DEVICE_ID_FIELD_NUMBER = 2;
            public static final int DRIVER_VERSION_FIELD_NUMBER = 3;
            public static final int GL_RENDERER_FIELD_NUMBER = 7;
            public static final int GL_VENDOR_FIELD_NUMBER = 6;
            private static volatile n7k PARSER = null;
            public static final int VENDOR_ID_FIELD_NUMBER = 1;
            private int bitField0_;
            private int deviceId_;
            private int vendorId_;
            private String driverVersion_ = "";
            private String glVendor_ = "";
            private String glRenderer_ = "";

            static {
                c cVar = new c();
                DEFAULT_INSTANCE = cVar;
                o3d.registerDefaultInstance(c.class, cVar);
            }

            private c() {
            }

            private void clearDeviceId() {
                this.bitField0_ &= -3;
                this.deviceId_ = 0;
            }

            private void clearDriverVersion() {
                this.bitField0_ &= -5;
                this.driverVersion_ = getDefaultInstance().getDriverVersion();
            }

            private void clearGlRenderer() {
                this.bitField0_ &= -17;
                this.glRenderer_ = getDefaultInstance().getGlRenderer();
            }

            private void clearGlVendor() {
                this.bitField0_ &= -9;
                this.glVendor_ = getDefaultInstance().getGlVendor();
            }

            private void clearVendorId() {
                this.bitField0_ &= -2;
                this.vendorId_ = 0;
            }

            public static c getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static z0 newBuilder() {
                return (z0) DEFAULT_INSTANCE.createBuilder();
            }

            public static c parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (c) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static c parseFrom(ByteBuffer byteBuffer) throws bye {
                return (c) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static n7k parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setDeviceId(int i) {
                this.bitField0_ |= 2;
                this.deviceId_ = i;
            }

            private void setDriverVersion(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.driverVersion_ = str;
            }

            private void setDriverVersionBytes(nn3 nn3Var) {
                this.driverVersion_ = nn3Var.y();
                this.bitField0_ |= 4;
            }

            private void setGlRenderer(String str) {
                str.getClass();
                this.bitField0_ |= 16;
                this.glRenderer_ = str;
            }

            private void setGlRendererBytes(nn3 nn3Var) {
                this.glRenderer_ = nn3Var.y();
                this.bitField0_ |= 16;
            }

            private void setGlVendor(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.glVendor_ = str;
            }

            private void setGlVendorBytes(nn3 nn3Var) {
                this.glVendor_ = nn3Var.y();
                this.bitField0_ |= 8;
            }

            private void setVendorId(int i) {
                this.bitField0_ |= 1;
                this.vendorId_ = i;
            }

            @Override // defpackage.o3d
            public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
                n7k n7kVar;
                switch (n3dVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဈ\u0002\u0006ဈ\u0003\u0007ဈ\u0004", new Object[]{"bitField0_", "vendorId_", "deviceId_", "driverVersion_", "glVendor_", "glRenderer_"});
                    case 3:
                        return new c();
                    case 4:
                        return new z0(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        n7k n7kVar2 = PARSER;
                        if (n7kVar2 != null) {
                            return n7kVar2;
                        }
                        synchronized (c.class) {
                            try {
                                n7kVar = PARSER;
                                if (n7kVar == null) {
                                    n7kVar = new j3d(DEFAULT_INSTANCE);
                                    PARSER = n7kVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return n7kVar;
                    default:
                        androidx.core.app.q.i();
                        return null;
                }
            }

            public int getDeviceId() {
                return this.deviceId_;
            }

            public String getDriverVersion() {
                return this.driverVersion_;
            }

            public nn3 getDriverVersionBytes() {
                return nn3.o(this.driverVersion_);
            }

            public String getGlRenderer() {
                return this.glRenderer_;
            }

            public nn3 getGlRendererBytes() {
                return nn3.o(this.glRenderer_);
            }

            public String getGlVendor() {
                return this.glVendor_;
            }

            public nn3 getGlVendorBytes() {
                return nn3.o(this.glVendor_);
            }

            public int getVendorId() {
                return this.vendorId_;
            }

            public boolean hasDeviceId() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasDriverVersion() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasGlRenderer() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasGlVendor() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasVendorId() {
                return (this.bitField0_ & 1) != 0;
            }

            public static z0 newBuilder(c cVar) {
                return (z0) DEFAULT_INSTANCE.createBuilder(cVar);
            }

            public static c parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (c) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static c parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
                return (c) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
            }

            public static c parseFrom(nn3 nn3Var) throws bye {
                return (c) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
            }

            public static c parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
                return (c) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
            }

            public static c parseFrom(byte[] bArr) throws bye {
                return (c) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static c parseFrom(byte[] bArr, z0c z0cVar) throws bye {
                return (c) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
            }

            public static c parseFrom(InputStream inputStream) throws IOException {
                return (c) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static c parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (c) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static c parseFrom(qr4 qr4Var) throws IOException {
                return (c) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
            }

            public static c parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
                return (c) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
            }
        }

        public static final class d extends o3d implements f1 {
            private static final d DEFAULT_INSTANCE;
            public static final int FIRMWARE_VERSION_FIELD_NUMBER = 6;
            public static final int MODEL_FIELD_NUMBER = 4;
            private static volatile n7k PARSER = null;
            public static final int PRODUCT_ID_FIELD_NUMBER = 2;
            public static final int PURPOSE_FIELD_NUMBER = 8;
            public static final int REVISION_FIELD_NUMBER = 3;
            public static final int SIZE_MB_FIELD_NUMBER = 5;
            public static final int TYPE_FIELD_NUMBER = 7;
            public static final int VENDOR_ID_FIELD_NUMBER = 1;
            private int bitField0_;
            private long firmwareVersion_;
            private String model_ = "";
            private long productId_;
            private int purpose_;
            private int revision_;
            private int sizeMb_;
            private int type_;
            private int vendorId_;

            static {
                d dVar = new d();
                DEFAULT_INSTANCE = dVar;
                o3d.registerDefaultInstance(d.class, dVar);
            }

            private d() {
            }

            private void clearFirmwareVersion() {
                this.bitField0_ &= -33;
                this.firmwareVersion_ = 0L;
            }

            private void clearModel() {
                this.bitField0_ &= -9;
                this.model_ = getDefaultInstance().getModel();
            }

            private void clearProductId() {
                this.bitField0_ &= -3;
                this.productId_ = 0L;
            }

            private void clearPurpose() {
                this.bitField0_ &= -129;
                this.purpose_ = 0;
            }

            private void clearRevision() {
                this.bitField0_ &= -5;
                this.revision_ = 0;
            }

            private void clearSizeMb() {
                this.bitField0_ &= -17;
                this.sizeMb_ = 0;
            }

            private void clearType() {
                this.bitField0_ &= -65;
                this.type_ = 0;
            }

            private void clearVendorId() {
                this.bitField0_ &= -2;
                this.vendorId_ = 0;
            }

            public static d getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static a1 newBuilder() {
                return (a1) DEFAULT_INSTANCE.createBuilder();
            }

            public static d parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (d) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static d parseFrom(ByteBuffer byteBuffer) throws bye {
                return (d) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static n7k parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setFirmwareVersion(long j) {
                this.bitField0_ |= 32;
                this.firmwareVersion_ = j;
            }

            private void setModel(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.model_ = str;
            }

            private void setModelBytes(nn3 nn3Var) {
                this.model_ = nn3Var.y();
                this.bitField0_ |= 8;
            }

            private void setProductId(long j) {
                this.bitField0_ |= 2;
                this.productId_ = j;
            }

            private void setPurpose(c1 c1Var) {
                this.purpose_ = c1Var.a;
                this.bitField0_ |= 128;
            }

            private void setRevision(int i) {
                this.bitField0_ |= 4;
                this.revision_ = i;
            }

            private void setSizeMb(int i) {
                this.bitField0_ |= 16;
                this.sizeMb_ = i;
            }

            private void setType(e1 e1Var) {
                this.type_ = e1Var.a;
                this.bitField0_ |= 64;
            }

            private void setVendorId(int i) {
                this.bitField0_ |= 1;
                this.vendorId_ = i;
            }

            @Override // defpackage.o3d
            public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
                n7k n7kVar;
                switch (n3dVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဃ\u0001\u0003ဋ\u0002\u0004ဈ\u0003\u0005ဋ\u0004\u0006ဃ\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"bitField0_", "vendorId_", "productId_", "revision_", "model_", "sizeMb_", "firmwareVersion_", "type_", d1.a, "purpose_", b1.a});
                    case 3:
                        return new d();
                    case 4:
                        return new a1(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        n7k n7kVar2 = PARSER;
                        if (n7kVar2 != null) {
                            return n7kVar2;
                        }
                        synchronized (d.class) {
                            try {
                                n7kVar = PARSER;
                                if (n7kVar == null) {
                                    n7kVar = new j3d(DEFAULT_INSTANCE);
                                    PARSER = n7kVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return n7kVar;
                    default:
                        androidx.core.app.q.i();
                        return null;
                }
            }

            public long getFirmwareVersion() {
                return this.firmwareVersion_;
            }

            public String getModel() {
                return this.model_;
            }

            public nn3 getModelBytes() {
                return nn3.o(this.model_);
            }

            public long getProductId() {
                return this.productId_;
            }

            public c1 getPurpose() {
                int i = this.purpose_;
                c1 c1Var = c1.PURPOSE_UNKNOWN;
                c1 c1Var2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : c1.PURPOSE_BOOT_SWAP : c1.PURPOSE_SWAP : c1.PURPOSE_BOOT : c1Var;
                return c1Var2 == null ? c1Var : c1Var2;
            }

            public int getRevision() {
                return this.revision_;
            }

            public int getSizeMb() {
                return this.sizeMb_;
            }

            public e1 getType() {
                e1 b = e1.b(this.type_);
                return b == null ? e1.TYPE_UNKNOWN : b;
            }

            public int getVendorId() {
                return this.vendorId_;
            }

            public boolean hasFirmwareVersion() {
                return (this.bitField0_ & 32) != 0;
            }

            public boolean hasModel() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasProductId() {
                return (this.bitField0_ & 2) != 0;
            }

            public boolean hasPurpose() {
                return (this.bitField0_ & 128) != 0;
            }

            public boolean hasRevision() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasSizeMb() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasType() {
                return (this.bitField0_ & 64) != 0;
            }

            public boolean hasVendorId() {
                return (this.bitField0_ & 1) != 0;
            }

            public static a1 newBuilder(d dVar) {
                return (a1) DEFAULT_INSTANCE.createBuilder(dVar);
            }

            public static d parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (d) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static d parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
                return (d) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
            }

            public static d parseFrom(nn3 nn3Var) throws bye {
                return (d) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
            }

            public static d parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
                return (d) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
            }

            public static d parseFrom(byte[] bArr) throws bye {
                return (d) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static d parseFrom(byte[] bArr, z0c z0cVar) throws bye {
                return (d) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
            }

            public static d parseFrom(InputStream inputStream) throws IOException {
                return (d) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static d parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (d) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static d parseFrom(qr4 qr4Var) throws IOException {
                return (d) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
            }

            public static d parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
                return (d) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
            }
        }

        public static final class e extends o3d implements xzh {
            public static final int BIOS_MANUFACTURER_FIELD_NUMBER = 3;
            public static final int BIOS_TYPE_FIELD_NUMBER = 5;
            public static final int BIOS_VERSION_FIELD_NUMBER = 4;
            private static final e DEFAULT_INSTANCE;
            public static final int MANUFACTURER_FIELD_NUMBER = 1;
            public static final int MODEL_FIELD_NUMBER = 2;
            private static volatile n7k PARSER;
            private int biosType_;
            private int bitField0_;
            private String manufacturer_ = "";
            private String model_ = "";
            private String biosManufacturer_ = "";
            private String biosVersion_ = "";

            static {
                e eVar = new e();
                DEFAULT_INSTANCE = eVar;
                o3d.registerDefaultInstance(e.class, eVar);
            }

            private e() {
            }

            private void clearBiosManufacturer() {
                this.bitField0_ &= -5;
                this.biosManufacturer_ = getDefaultInstance().getBiosManufacturer();
            }

            private void clearBiosType() {
                this.bitField0_ &= -17;
                this.biosType_ = 0;
            }

            private void clearBiosVersion() {
                this.bitField0_ &= -9;
                this.biosVersion_ = getDefaultInstance().getBiosVersion();
            }

            private void clearManufacturer() {
                this.bitField0_ &= -2;
                this.manufacturer_ = getDefaultInstance().getManufacturer();
            }

            private void clearModel() {
                this.bitField0_ &= -3;
                this.model_ = getDefaultInstance().getModel();
            }

            public static e getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static g1 newBuilder() {
                return (g1) DEFAULT_INSTANCE.createBuilder();
            }

            public static e parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (e) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static e parseFrom(ByteBuffer byteBuffer) throws bye {
                return (e) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static n7k parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setBiosManufacturer(String str) {
                str.getClass();
                this.bitField0_ |= 4;
                this.biosManufacturer_ = str;
            }

            private void setBiosManufacturerBytes(nn3 nn3Var) {
                this.biosManufacturer_ = nn3Var.y();
                this.bitField0_ |= 4;
            }

            private void setBiosType(t0 t0Var) {
                this.biosType_ = t0Var.a;
                this.bitField0_ |= 16;
            }

            private void setBiosVersion(String str) {
                str.getClass();
                this.bitField0_ |= 8;
                this.biosVersion_ = str;
            }

            private void setBiosVersionBytes(nn3 nn3Var) {
                this.biosVersion_ = nn3Var.y();
                this.bitField0_ |= 8;
            }

            private void setManufacturer(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.manufacturer_ = str;
            }

            private void setManufacturerBytes(nn3 nn3Var) {
                this.manufacturer_ = nn3Var.y();
                this.bitField0_ |= 1;
            }

            private void setModel(String str) {
                str.getClass();
                this.bitField0_ |= 2;
                this.model_ = str;
            }

            private void setModelBytes(nn3 nn3Var) {
                this.model_ = nn3Var.y();
                this.bitField0_ |= 2;
            }

            @Override // defpackage.o3d
            public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
                n7k n7kVar;
                switch (n3dVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004", new Object[]{"bitField0_", "manufacturer_", "model_", "biosManufacturer_", "biosVersion_", "biosType_", s0.a});
                    case 3:
                        return new e();
                    case 4:
                        return new g1(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        n7k n7kVar2 = PARSER;
                        if (n7kVar2 != null) {
                            return n7kVar2;
                        }
                        synchronized (e.class) {
                            try {
                                n7kVar = PARSER;
                                if (n7kVar == null) {
                                    n7kVar = new j3d(DEFAULT_INSTANCE);
                                    PARSER = n7kVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return n7kVar;
                    default:
                        androidx.core.app.q.i();
                        return null;
                }
            }

            public String getBiosManufacturer() {
                return this.biosManufacturer_;
            }

            public nn3 getBiosManufacturerBytes() {
                return nn3.o(this.biosManufacturer_);
            }

            public t0 getBiosType() {
                int i = this.biosType_;
                t0 t0Var = t0.BIOS_TYPE_UNKNOWN;
                t0 t0Var2 = i != 0 ? i != 1 ? i != 2 ? null : t0.BIOS_TYPE_UEFI : t0.BIOS_TYPE_LEGACY : t0Var;
                return t0Var2 == null ? t0Var : t0Var2;
            }

            public String getBiosVersion() {
                return this.biosVersion_;
            }

            public nn3 getBiosVersionBytes() {
                return nn3.o(this.biosVersion_);
            }

            public String getManufacturer() {
                return this.manufacturer_;
            }

            public nn3 getManufacturerBytes() {
                return nn3.o(this.manufacturer_);
            }

            public String getModel() {
                return this.model_;
            }

            public nn3 getModelBytes() {
                return nn3.o(this.model_);
            }

            public boolean hasBiosManufacturer() {
                return (this.bitField0_ & 4) != 0;
            }

            public boolean hasBiosType() {
                return (this.bitField0_ & 16) != 0;
            }

            public boolean hasBiosVersion() {
                return (this.bitField0_ & 8) != 0;
            }

            public boolean hasManufacturer() {
                return (this.bitField0_ & 1) != 0;
            }

            public boolean hasModel() {
                return (this.bitField0_ & 2) != 0;
            }

            public static g1 newBuilder(e eVar) {
                return (g1) DEFAULT_INSTANCE.createBuilder(eVar);
            }

            public static e parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (e) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static e parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
                return (e) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
            }

            public static e parseFrom(nn3 nn3Var) throws bye {
                return (e) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
            }

            public static e parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
                return (e) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
            }

            public static e parseFrom(byte[] bArr) throws bye {
                return (e) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static e parseFrom(byte[] bArr, z0c z0cVar) throws bye {
                return (e) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
            }

            public static e parseFrom(InputStream inputStream) throws IOException {
                return (e) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static e parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (e) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static e parseFrom(qr4 qr4Var) throws IOException {
                return (e) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
            }

            public static e parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
                return (e) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
            }
        }

        public static u0 newBuilder(i iVar) {
            return (u0) DEFAULT_INSTANCE.createBuilder(iVar);
        }

        public static i parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (i) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static i parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
            return (i) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
        }

        public static i parseFrom(nn3 nn3Var) throws bye {
            return (i) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
        }

        public static i parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
            return (i) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
        }

        private void addInternalStorageDevices(int i, d dVar) {
            dVar.getClass();
            ensureInternalStorageDevicesIsMutable();
            this.internalStorageDevices_.add(i, dVar);
        }

        public static i parseFrom(byte[] bArr) throws bye {
            return (i) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static i parseFrom(byte[] bArr, z0c z0cVar) throws bye {
            return (i) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
        }

        public static i parseFrom(InputStream inputStream) throws IOException {
            return (i) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static i parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (i) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static i parseFrom(qr4 qr4Var) throws IOException {
            return (i) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
        }

        public static i parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
            return (i) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
        }
    }

    public static final class l extends o3d implements xzh {
        public static final int ARC_FIELD_NUMBER = 7;
        public static final int BUILD_FINGERPRINT_FIELD_NUMBER = 3;
        public static final int BUILD_NUMBER_FIELD_NUMBER = 5;
        public static final int DARK_MODE_STATE_FIELD_NUMBER = 8;
        private static final l DEFAULT_INSTANCE;
        public static final int KERNEL_VERSION_FIELD_NUMBER = 6;
        public static final int NAME_FIELD_NUMBER = 1;
        private static volatile n7k PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 2;
        public static final int XDG_CURRENT_DESKTOP_FIELD_NUMBER = 10;
        public static final int XDG_SESSION_TYPE_FIELD_NUMBER = 9;
        private a arc_;
        private int bitField0_;
        private int darkModeState_;
        private int xdgCurrentDesktop_;
        private int xdgSessionType_;
        private String name_ = "";
        private String version_ = "";
        private String buildFingerprint_ = "";
        private String buildNumber_ = "";
        private String kernelVersion_ = "";

        static {
            l lVar = new l();
            DEFAULT_INSTANCE = lVar;
            o3d.registerDefaultInstance(l.class, lVar);
        }

        private l() {
        }

        private void clearArc() {
            this.arc_ = null;
            this.bitField0_ &= -33;
        }

        private void clearBuildFingerprint() {
            this.bitField0_ &= -5;
            this.buildFingerprint_ = getDefaultInstance().getBuildFingerprint();
        }

        private void clearBuildNumber() {
            this.bitField0_ &= -9;
            this.buildNumber_ = getDefaultInstance().getBuildNumber();
        }

        private void clearDarkModeState() {
            this.bitField0_ &= -65;
            this.darkModeState_ = 0;
        }

        private void clearKernelVersion() {
            this.bitField0_ &= -17;
            this.kernelVersion_ = getDefaultInstance().getKernelVersion();
        }

        private void clearName() {
            this.bitField0_ &= -2;
            this.name_ = getDefaultInstance().getName();
        }

        private void clearVersion() {
            this.bitField0_ &= -3;
            this.version_ = getDefaultInstance().getVersion();
        }

        private void clearXdgCurrentDesktop() {
            this.bitField0_ &= -257;
            this.xdgCurrentDesktop_ = 0;
        }

        private void clearXdgSessionType() {
            this.bitField0_ &= -129;
            this.xdgSessionType_ = 0;
        }

        public static l getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        private void mergeArc(a aVar) {
            aVar.getClass();
            a aVar2 = this.arc_;
            if (aVar2 == null || aVar2 == a.getDefaultInstance()) {
                this.arc_ = aVar;
            } else {
                p1 newBuilder = a.newBuilder(this.arc_);
                newBuilder.e(aVar);
                this.arc_ = (a) newBuilder.c();
            }
            this.bitField0_ |= 32;
        }

        public static q1 newBuilder() {
            return (q1) DEFAULT_INSTANCE.createBuilder();
        }

        public static l parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (l) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static l parseFrom(ByteBuffer byteBuffer) throws bye {
            return (l) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n7k parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setArc(a aVar) {
            aVar.getClass();
            this.arc_ = aVar;
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuildFingerprint(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.buildFingerprint_ = str;
        }

        private void setBuildFingerprintBytes(nn3 nn3Var) {
            this.buildFingerprint_ = nn3Var.y();
            this.bitField0_ |= 4;
        }

        private void setBuildNumber(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.buildNumber_ = str;
        }

        private void setBuildNumberBytes(nn3 nn3Var) {
            this.buildNumber_ = nn3Var.y();
            this.bitField0_ |= 8;
        }

        private void setDarkModeState(s1 s1Var) {
            this.darkModeState_ = s1Var.a;
            this.bitField0_ |= 64;
        }

        private void setKernelVersion(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.kernelVersion_ = str;
        }

        private void setKernelVersionBytes(nn3 nn3Var) {
            this.kernelVersion_ = nn3Var.y();
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.name_ = str;
        }

        private void setNameBytes(nn3 nn3Var) {
            this.name_ = nn3Var.y();
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.version_ = str;
        }

        private void setVersionBytes(nn3 nn3Var) {
            this.version_ = nn3Var.y();
            this.bitField0_ |= 2;
        }

        private void setXdgCurrentDesktop(u1 u1Var) {
            this.xdgCurrentDesktop_ = u1Var.a;
            this.bitField0_ |= 256;
        }

        private void setXdgSessionType(w1 w1Var) {
            this.xdgSessionType_ = w1Var.a;
            this.bitField0_ |= 128;
        }

        @Override // defpackage.o3d
        public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
            n7k n7kVar;
            switch (n3dVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဉ\u0005\b᠌\u0006\t᠌\u0007\n᠌\b", new Object[]{"bitField0_", "name_", "version_", "buildFingerprint_", "buildNumber_", "kernelVersion_", "arc_", "darkModeState_", r1.a, "xdgSessionType_", v1.a, "xdgCurrentDesktop_", t1.a});
                case 3:
                    return new l();
                case 4:
                    return new q1(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    n7k n7kVar2 = PARSER;
                    if (n7kVar2 != null) {
                        return n7kVar2;
                    }
                    synchronized (l.class) {
                        try {
                            n7kVar = PARSER;
                            if (n7kVar == null) {
                                n7kVar = new j3d(DEFAULT_INSTANCE);
                                PARSER = n7kVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return n7kVar;
                default:
                    androidx.core.app.q.i();
                    return null;
            }
        }

        public a getArc() {
            a aVar = this.arc_;
            return aVar == null ? a.getDefaultInstance() : aVar;
        }

        public String getBuildFingerprint() {
            return this.buildFingerprint_;
        }

        public nn3 getBuildFingerprintBytes() {
            return nn3.o(this.buildFingerprint_);
        }

        public String getBuildNumber() {
            return this.buildNumber_;
        }

        public nn3 getBuildNumberBytes() {
            return nn3.o(this.buildNumber_);
        }

        public s1 getDarkModeState() {
            s1 b = s1.b(this.darkModeState_);
            return b == null ? s1.UNKNOWN : b;
        }

        public String getKernelVersion() {
            return this.kernelVersion_;
        }

        public nn3 getKernelVersionBytes() {
            return nn3.o(this.kernelVersion_);
        }

        public String getName() {
            return this.name_;
        }

        public nn3 getNameBytes() {
            return nn3.o(this.name_);
        }

        public String getVersion() {
            return this.version_;
        }

        public nn3 getVersionBytes() {
            return nn3.o(this.version_);
        }

        public u1 getXdgCurrentDesktop() {
            u1 b = u1.b(this.xdgCurrentDesktop_);
            return b == null ? u1.OTHER : b;
        }

        public w1 getXdgSessionType() {
            w1 w1Var;
            int i = this.xdgSessionType_;
            w1 w1Var2 = w1.UNSET;
            switch (i) {
                case 0:
                    w1Var = w1Var2;
                    break;
                case 1:
                    w1Var = w1.OTHER_SESSION_TYPE;
                    break;
                case 2:
                    w1Var = w1.UNSPECIFIED;
                    break;
                case 3:
                    w1Var = w1.TTY;
                    break;
                case 4:
                    w1Var = w1.X11;
                    break;
                case 5:
                    w1Var = w1.WAYLAND;
                    break;
                case 6:
                    w1Var = w1.MIR;
                    break;
                default:
                    w1Var = null;
                    break;
            }
            return w1Var == null ? w1Var2 : w1Var;
        }

        public boolean hasArc() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasBuildFingerprint() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasBuildNumber() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasDarkModeState() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasKernelVersion() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasXdgCurrentDesktop() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasXdgSessionType() {
            return (this.bitField0_ & 128) != 0;
        }

        public static final class a extends o3d implements xzh {
            private static final a DEFAULT_INSTANCE;
            private static volatile n7k PARSER = null;
            public static final int RELEASE_FIELD_NUMBER = 1;
            private int bitField0_;
            private String release_ = "";

            static {
                a aVar = new a();
                DEFAULT_INSTANCE = aVar;
                o3d.registerDefaultInstance(a.class, aVar);
            }

            private a() {
            }

            private void clearRelease() {
                this.bitField0_ &= -2;
                this.release_ = getDefaultInstance().getRelease();
            }

            public static a getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static p1 newBuilder() {
                return (p1) DEFAULT_INSTANCE.createBuilder();
            }

            public static a parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (a) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(ByteBuffer byteBuffer) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
            }

            public static n7k parser() {
                return DEFAULT_INSTANCE.getParserForType();
            }

            private void setRelease(String str) {
                str.getClass();
                this.bitField0_ |= 1;
                this.release_ = str;
            }

            private void setReleaseBytes(nn3 nn3Var) {
                this.release_ = nn3Var.y();
                this.bitField0_ |= 1;
            }

            @Override // defpackage.o3d
            public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
                n7k n7kVar;
                switch (n3dVar.ordinal()) {
                    case 0:
                        return (byte) 1;
                    case 1:
                        return null;
                    case 2:
                        return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "release_"});
                    case 3:
                        return new a();
                    case 4:
                        return new p1(DEFAULT_INSTANCE);
                    case 5:
                        return DEFAULT_INSTANCE;
                    case 6:
                        n7k n7kVar2 = PARSER;
                        if (n7kVar2 != null) {
                            return n7kVar2;
                        }
                        synchronized (a.class) {
                            try {
                                n7kVar = PARSER;
                                if (n7kVar == null) {
                                    n7kVar = new j3d(DEFAULT_INSTANCE);
                                    PARSER = n7kVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        return n7kVar;
                    default:
                        androidx.core.app.q.i();
                        return null;
                }
            }

            public String getRelease() {
                return this.release_;
            }

            public nn3 getReleaseBytes() {
                return nn3.o(this.release_);
            }

            public boolean hasRelease() {
                return (this.bitField0_ & 1) != 0;
            }

            public static p1 newBuilder(a aVar) {
                return (p1) DEFAULT_INSTANCE.createBuilder(aVar);
            }

            public static a parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (a) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static a parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
            }

            public static a parseFrom(nn3 nn3Var) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
            }

            public static a parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
            }

            public static a parseFrom(byte[] bArr) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
            }

            public static a parseFrom(byte[] bArr, z0c z0cVar) throws bye {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
            }

            public static a parseFrom(InputStream inputStream) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
            }

            public static a parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
            }

            public static a parseFrom(qr4 qr4Var) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
            }

            public static a parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
                return (a) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
            }
        }

        public static q1 newBuilder(l lVar) {
            return (q1) DEFAULT_INSTANCE.createBuilder(lVar);
        }

        public static l parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (l) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static l parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
            return (l) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
        }

        public static l parseFrom(nn3 nn3Var) throws bye {
            return (l) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
        }

        public static l parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
            return (l) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
        }

        public static l parseFrom(byte[] bArr) throws bye {
            return (l) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static l parseFrom(byte[] bArr, z0c z0cVar) throws bye {
            return (l) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
        }

        public static l parseFrom(InputStream inputStream) throws IOException {
            return (l) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static l parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (l) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static l parseFrom(qr4 qr4Var) throws IOException {
            return (l) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
        }

        public static l parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
            return (l) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
        }
    }

    public static final class a extends o3d implements rzr {
        private static final a DEFAULT_INSTANCE;
        private static volatile n7k PARSER = null;
        public static final int PRODUCT_NAME_FIELD_NUMBER = 1;
        public static final int PRODUCT_NAME_HASH_FIELD_NUMBER = 2;
        public static final int PRODUCT_STATE_FIELD_NUMBER = 5;
        public static final int PRODUCT_VERSION_FIELD_NUMBER = 3;
        public static final int PRODUCT_VERSION_HASH_FIELD_NUMBER = 4;
        private int bitField0_;
        private int productNameHash_;
        private int productState_;
        private int productVersionHash_;
        private String productName_ = "";
        private String productVersion_ = "";

        static {
            a aVar = new a();
            DEFAULT_INSTANCE = aVar;
            o3d.registerDefaultInstance(a.class, aVar);
        }

        private a() {
        }

        private void clearProductName() {
            this.bitField0_ &= -2;
            this.productName_ = getDefaultInstance().getProductName();
        }

        private void clearProductNameHash() {
            this.bitField0_ &= -3;
            this.productNameHash_ = 0;
        }

        private void clearProductState() {
            this.bitField0_ &= -17;
            this.productState_ = 0;
        }

        private void clearProductVersion() {
            this.bitField0_ &= -5;
            this.productVersion_ = getDefaultInstance().getProductVersion();
        }

        private void clearProductVersionHash() {
            this.bitField0_ &= -9;
            this.productVersionHash_ = 0;
        }

        public static a getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static com.yandex.pulse.metrics.n newBuilder() {
            return (com.yandex.pulse.metrics.n) DEFAULT_INSTANCE.createBuilder();
        }

        public static a parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (a) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static a parseFrom(ByteBuffer byteBuffer) throws bye {
            return (a) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n7k parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setProductName(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.productName_ = str;
        }

        private void setProductNameBytes(nn3 nn3Var) {
            this.productName_ = nn3Var.y();
            this.bitField0_ |= 1;
        }

        private void setProductNameHash(int i) {
            this.bitField0_ |= 2;
            this.productNameHash_ = i;
        }

        private void setProductState(szr szrVar) {
            this.productState_ = szrVar.a;
            this.bitField0_ |= 16;
        }

        private void setProductVersion(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.productVersion_ = str;
        }

        private void setProductVersionBytes(nn3 nn3Var) {
            this.productVersion_ = nn3Var.y();
            this.bitField0_ |= 4;
        }

        private void setProductVersionHash(int i) {
            this.bitField0_ |= 8;
            this.productVersionHash_ = i;
        }

        @Override // defpackage.o3d
        public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
            n7k n7kVar;
            switch (n3dVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဆ\u0001\u0003ဈ\u0002\u0004ဆ\u0003\u0005᠌\u0004", new Object[]{"bitField0_", "productName_", "productNameHash_", "productVersion_", "productVersionHash_", "productState_", sxf.c});
                case 3:
                    return new a();
                case 4:
                    return new com.yandex.pulse.metrics.n(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    n7k n7kVar2 = PARSER;
                    if (n7kVar2 != null) {
                        return n7kVar2;
                    }
                    synchronized (a.class) {
                        try {
                            n7kVar = PARSER;
                            if (n7kVar == null) {
                                n7kVar = new j3d(DEFAULT_INSTANCE);
                                PARSER = n7kVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return n7kVar;
                default:
                    androidx.core.app.q.i();
                    return null;
            }
        }

        public String getProductName() {
            return this.productName_;
        }

        public nn3 getProductNameBytes() {
            return nn3.o(this.productName_);
        }

        public int getProductNameHash() {
            return this.productNameHash_;
        }

        public szr getProductState() {
            int i = this.productState_;
            szr szrVar = szr.STATE_ON;
            szr szrVar2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : szr.STATE_EXPIRED : szr.STATE_SNOOZED : szr.STATE_OFF : szrVar;
            return szrVar2 == null ? szrVar : szrVar2;
        }

        public String getProductVersion() {
            return this.productVersion_;
        }

        public nn3 getProductVersionBytes() {
            return nn3.o(this.productVersion_);
        }

        public int getProductVersionHash() {
            return this.productVersionHash_;
        }

        public boolean hasProductName() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasProductNameHash() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasProductState() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasProductVersion() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasProductVersionHash() {
            return (this.bitField0_ & 8) != 0;
        }

        public static com.yandex.pulse.metrics.n newBuilder(a aVar) {
            return (com.yandex.pulse.metrics.n) DEFAULT_INSTANCE.createBuilder(aVar);
        }

        public static a parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (a) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static a parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
            return (a) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
        }

        public static a parseFrom(nn3 nn3Var) throws bye {
            return (a) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
        }

        public static a parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
            return (a) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
        }

        public static a parseFrom(byte[] bArr) throws bye {
            return (a) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static a parseFrom(byte[] bArr, z0c z0cVar) throws bye {
            return (a) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
        }

        public static a parseFrom(InputStream inputStream) throws IOException {
            return (a) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static a parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (a) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static a parseFrom(qr4 qr4Var) throws IOException {
            return (a) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
        }

        public static a parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
            return (a) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
        }
    }

    public static final class b extends o3d implements vzr {
        public static final int COHORT_HASH_FIELD_NUMBER = 4;
        public static final int COMPONENT_ID_FIELD_NUMBER = 1;
        private static final b DEFAULT_INSTANCE;
        public static final int OMAHA_FINGERPRINT_FIELD_NUMBER = 3;
        private static volatile n7k PARSER = null;
        public static final int VERSION_FIELD_NUMBER = 2;
        private int bitField0_;
        private int cohortHash_;
        private int omahaFingerprint_;
        private int componentId_ = 1;
        private String version_ = "";

        static {
            b bVar = new b();
            DEFAULT_INSTANCE = bVar;
            o3d.registerDefaultInstance(b.class, bVar);
        }

        private b() {
        }

        private void clearCohortHash() {
            this.bitField0_ &= -9;
            this.cohortHash_ = 0;
        }

        private void clearComponentId() {
            this.bitField0_ &= -2;
            this.componentId_ = 1;
        }

        private void clearOmahaFingerprint() {
            this.bitField0_ &= -5;
            this.omahaFingerprint_ = 0;
        }

        private void clearVersion() {
            this.bitField0_ &= -3;
            this.version_ = getDefaultInstance().getVersion();
        }

        public static b getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static q newBuilder() {
            return (q) DEFAULT_INSTANCE.createBuilder();
        }

        public static b parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (b) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static b parseFrom(ByteBuffer byteBuffer) throws bye {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n7k parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCohortHash(int i) {
            this.bitField0_ |= 8;
            this.cohortHash_ = i;
        }

        private void setComponentId(xzr xzrVar) {
            this.componentId_ = xzrVar.a;
            this.bitField0_ |= 1;
        }

        private void setOmahaFingerprint(int i) {
            this.bitField0_ |= 4;
            this.omahaFingerprint_ = i;
        }

        private void setVersion(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.version_ = str;
        }

        private void setVersionBytes(nn3 nn3Var) {
            this.version_ = nn3Var.y();
            this.bitField0_ |= 2;
        }

        @Override // defpackage.o3d
        public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
            n7k n7kVar;
            switch (n3dVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဆ\u0002\u0004ဆ\u0003", new Object[]{"bitField0_", "componentId_", sxf.g, "version_", "omahaFingerprint_", "cohortHash_"});
                case 3:
                    return new b();
                case 4:
                    return new q(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    n7k n7kVar2 = PARSER;
                    if (n7kVar2 != null) {
                        return n7kVar2;
                    }
                    synchronized (b.class) {
                        try {
                            n7kVar = PARSER;
                            if (n7kVar == null) {
                                n7kVar = new j3d(DEFAULT_INSTANCE);
                                PARSER = n7kVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return n7kVar;
                default:
                    androidx.core.app.q.i();
                    return null;
            }
        }

        public int getCohortHash() {
            return this.cohortHash_;
        }

        public xzr getComponentId() {
            xzr b = xzr.b(this.componentId_);
            return b == null ? xzr.UNKNOWN : b;
        }

        public int getOmahaFingerprint() {
            return this.omahaFingerprint_;
        }

        public String getVersion() {
            return this.version_;
        }

        public nn3 getVersionBytes() {
            return nn3.o(this.version_);
        }

        public boolean hasCohortHash() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasComponentId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasOmahaFingerprint() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        public static q newBuilder(b bVar) {
            return (q) DEFAULT_INSTANCE.createBuilder(bVar);
        }

        public static b parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (b) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static b parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
        }

        public static b parseFrom(nn3 nn3Var) throws bye {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
        }

        public static b parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
        }

        public static b parseFrom(byte[] bArr) throws bye {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static b parseFrom(byte[] bArr, z0c z0cVar) throws bye {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
        }

        public static b parseFrom(InputStream inputStream) throws IOException {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static b parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static b parseFrom(qr4 qr4Var) throws IOException {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
        }

        public static b parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
            return (b) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
        }
    }

    public static final class c extends o3d implements xzh {
        public static final int CLONED_FROM_CLIENT_ID_FIELD_NUMBER = 2;
        public static final int COUNT_FIELD_NUMBER = 4;
        private static final c DEFAULT_INSTANCE;
        public static final int FIRST_TIMESTAMP_FIELD_NUMBER = 3;
        public static final int LAST_TIMESTAMP_FIELD_NUMBER = 1;
        private static volatile n7k PARSER;
        private int bitField0_;
        private long clonedFromClientId_;
        private int count_;
        private long firstTimestamp_;
        private long lastTimestamp_;

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            o3d.registerDefaultInstance(c.class, cVar);
        }

        private c() {
        }

        private void clearClonedFromClientId() {
            this.bitField0_ &= -3;
            this.clonedFromClientId_ = 0L;
        }

        private void clearCount() {
            this.bitField0_ &= -9;
            this.count_ = 0;
        }

        private void clearFirstTimestamp() {
            this.bitField0_ &= -5;
            this.firstTimestamp_ = 0L;
        }

        private void clearLastTimestamp() {
            this.bitField0_ &= -2;
            this.lastTimestamp_ = 0L;
        }

        public static c getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static r newBuilder() {
            return (r) DEFAULT_INSTANCE.createBuilder();
        }

        public static c parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (c) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static c parseFrom(ByteBuffer byteBuffer) throws bye {
            return (c) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n7k parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setClonedFromClientId(long j) {
            this.bitField0_ |= 2;
            this.clonedFromClientId_ = j;
        }

        private void setCount(int i) {
            this.bitField0_ |= 8;
            this.count_ = i;
        }

        private void setFirstTimestamp(long j) {
            this.bitField0_ |= 4;
            this.firstTimestamp_ = j;
        }

        private void setLastTimestamp(long j) {
            this.bitField0_ |= 1;
            this.lastTimestamp_ = j;
        }

        @Override // defpackage.o3d
        public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
            n7k n7kVar;
            switch (n3dVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002စ\u0001\u0003ဂ\u0002\u0004င\u0003", new Object[]{"bitField0_", "lastTimestamp_", "clonedFromClientId_", "firstTimestamp_", "count_"});
                case 3:
                    return new c();
                case 4:
                    return new r(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    n7k n7kVar2 = PARSER;
                    if (n7kVar2 != null) {
                        return n7kVar2;
                    }
                    synchronized (c.class) {
                        try {
                            n7kVar = PARSER;
                            if (n7kVar == null) {
                                n7kVar = new j3d(DEFAULT_INSTANCE);
                                PARSER = n7kVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return n7kVar;
                default:
                    androidx.core.app.q.i();
                    return null;
            }
        }

        public long getClonedFromClientId() {
            return this.clonedFromClientId_;
        }

        public int getCount() {
            return this.count_;
        }

        public long getFirstTimestamp() {
            return this.firstTimestamp_;
        }

        public long getLastTimestamp() {
            return this.lastTimestamp_;
        }

        public boolean hasClonedFromClientId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasCount() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasFirstTimestamp() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasLastTimestamp() {
            return (this.bitField0_ & 1) != 0;
        }

        public static r newBuilder(c cVar) {
            return (r) DEFAULT_INSTANCE.createBuilder(cVar);
        }

        public static c parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (c) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static c parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
            return (c) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
        }

        public static c parseFrom(nn3 nn3Var) throws bye {
            return (c) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
        }

        public static c parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
            return (c) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
        }

        public static c parseFrom(byte[] bArr) throws bye {
            return (c) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static c parseFrom(byte[] bArr, z0c z0cVar) throws bye {
            return (c) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
        }

        public static c parseFrom(InputStream inputStream) throws IOException {
            return (c) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static c parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (c) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static c parseFrom(qr4 qr4Var) throws IOException {
            return (c) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
        }

        public static c parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
            return (c) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
        }
    }

    public static final class e extends o3d implements xzh {
        private static final e DEFAULT_INSTANCE;
        public static final int DEVICE_NAME_FIELD_NUMBER = 4;
        public static final int MANUFACTURER_FIELD_NUMBER = 1;
        public static final int MODEL_NAME_FIELD_NUMBER = 2;
        public static final int MODEL_NUMBER_FIELD_NUMBER = 3;
        private static volatile n7k PARSER;
        private int bitField0_;
        private String manufacturer_ = "";
        private String modelName_ = "";
        private String modelNumber_ = "";
        private String deviceName_ = "";

        static {
            e eVar = new e();
            DEFAULT_INSTANCE = eVar;
            o3d.registerDefaultInstance(e.class, eVar);
        }

        private e() {
        }

        private void clearDeviceName() {
            this.bitField0_ &= -9;
            this.deviceName_ = getDefaultInstance().getDeviceName();
        }

        private void clearManufacturer() {
            this.bitField0_ &= -2;
            this.manufacturer_ = getDefaultInstance().getManufacturer();
        }

        private void clearModelName() {
            this.bitField0_ &= -3;
            this.modelName_ = getDefaultInstance().getModelName();
        }

        private void clearModelNumber() {
            this.bitField0_ &= -5;
            this.modelNumber_ = getDefaultInstance().getModelNumber();
        }

        public static e getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static x newBuilder() {
            return (x) DEFAULT_INSTANCE.createBuilder();
        }

        public static e parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (e) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static e parseFrom(ByteBuffer byteBuffer) throws bye {
            return (e) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n7k parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setDeviceName(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.deviceName_ = str;
        }

        private void setDeviceNameBytes(nn3 nn3Var) {
            this.deviceName_ = nn3Var.y();
            this.bitField0_ |= 8;
        }

        private void setManufacturer(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.manufacturer_ = str;
        }

        private void setManufacturerBytes(nn3 nn3Var) {
            this.manufacturer_ = nn3Var.y();
            this.bitField0_ |= 1;
        }

        private void setModelName(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.modelName_ = str;
        }

        private void setModelNameBytes(nn3 nn3Var) {
            this.modelName_ = nn3Var.y();
            this.bitField0_ |= 2;
        }

        private void setModelNumber(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.modelNumber_ = str;
        }

        private void setModelNumberBytes(nn3 nn3Var) {
            this.modelNumber_ = nn3Var.y();
            this.bitField0_ |= 4;
        }

        @Override // defpackage.o3d
        public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
            n7k n7kVar;
            switch (n3dVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "manufacturer_", "modelName_", "modelNumber_", "deviceName_"});
                case 3:
                    return new e();
                case 4:
                    return new x(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    n7k n7kVar2 = PARSER;
                    if (n7kVar2 != null) {
                        return n7kVar2;
                    }
                    synchronized (e.class) {
                        try {
                            n7kVar = PARSER;
                            if (n7kVar == null) {
                                n7kVar = new j3d(DEFAULT_INSTANCE);
                                PARSER = n7kVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return n7kVar;
                default:
                    androidx.core.app.q.i();
                    return null;
            }
        }

        public String getDeviceName() {
            return this.deviceName_;
        }

        public nn3 getDeviceNameBytes() {
            return nn3.o(this.deviceName_);
        }

        public String getManufacturer() {
            return this.manufacturer_;
        }

        public nn3 getManufacturerBytes() {
            return nn3.o(this.manufacturer_);
        }

        public String getModelName() {
            return this.modelName_;
        }

        public nn3 getModelNameBytes() {
            return nn3.o(this.modelName_);
        }

        public String getModelNumber() {
            return this.modelNumber_;
        }

        public nn3 getModelNumberBytes() {
            return nn3.o(this.modelNumber_);
        }

        public boolean hasDeviceName() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasManufacturer() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasModelName() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasModelNumber() {
            return (this.bitField0_ & 4) != 0;
        }

        public static x newBuilder(e eVar) {
            return (x) DEFAULT_INSTANCE.createBuilder(eVar);
        }

        public static e parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (e) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static e parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
            return (e) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
        }

        public static e parseFrom(nn3 nn3Var) throws bye {
            return (e) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
        }

        public static e parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
            return (e) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
        }

        public static e parseFrom(byte[] bArr) throws bye {
            return (e) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static e parseFrom(byte[] bArr, z0c z0cVar) throws bye {
            return (e) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
        }

        public static e parseFrom(InputStream inputStream) throws IOException {
            return (e) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static e parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (e) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static e parseFrom(qr4 qr4Var) throws IOException {
            return (e) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
        }

        public static e parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
            return (e) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
        }
    }

    public static final class g extends o3d implements zzr {
        private static final g DEFAULT_INSTANCE;
        public static final int GROUP_ID_FIELD_NUMBER = 2;
        public static final int NAME_ID_FIELD_NUMBER = 1;
        private static volatile n7k PARSER;
        private int bitField0_;
        private int groupId_;
        private int nameId_;

        static {
            g gVar = new g();
            DEFAULT_INSTANCE = gVar;
            o3d.registerDefaultInstance(g.class, gVar);
        }

        private g() {
        }

        private void clearGroupId() {
            this.bitField0_ &= -3;
            this.groupId_ = 0;
        }

        private void clearNameId() {
            this.bitField0_ &= -2;
            this.nameId_ = 0;
        }

        public static g getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static n0 newBuilder() {
            return (n0) DEFAULT_INSTANCE.createBuilder();
        }

        public static g parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (g) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static g parseFrom(ByteBuffer byteBuffer) throws bye {
            return (g) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n7k parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGroupId(int i) {
            this.bitField0_ |= 2;
            this.groupId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNameId(int i) {
            this.bitField0_ |= 1;
            this.nameId_ = i;
        }

        @Override // defpackage.o3d
        public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
            n7k n7kVar;
            switch (n3dVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဆ\u0001", new Object[]{"bitField0_", "nameId_", "groupId_"});
                case 3:
                    return new g();
                case 4:
                    return new n0(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    n7k n7kVar2 = PARSER;
                    if (n7kVar2 != null) {
                        return n7kVar2;
                    }
                    synchronized (g.class) {
                        try {
                            n7kVar = PARSER;
                            if (n7kVar == null) {
                                n7kVar = new j3d(DEFAULT_INSTANCE);
                                PARSER = n7kVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return n7kVar;
                default:
                    androidx.core.app.q.i();
                    return null;
            }
        }

        public int getGroupId() {
            return this.groupId_;
        }

        public int getNameId() {
            return this.nameId_;
        }

        public boolean hasGroupId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasNameId() {
            return (this.bitField0_ & 1) != 0;
        }

        public static n0 newBuilder(g gVar) {
            return (n0) DEFAULT_INSTANCE.createBuilder(gVar);
        }

        public static g parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (g) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static g parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
            return (g) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
        }

        public static g parseFrom(nn3 nn3Var) throws bye {
            return (g) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
        }

        public static g parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
            return (g) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
        }

        public static g parseFrom(byte[] bArr) throws bye {
            return (g) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static g parseFrom(byte[] bArr, z0c z0cVar) throws bye {
            return (g) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
        }

        public static g parseFrom(InputStream inputStream) throws IOException {
            return (g) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static g parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (g) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static g parseFrom(qr4 qr4Var) throws IOException {
            return (g) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
        }

        public static g parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
            return (g) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
        }
    }

    public static final class j extends o3d implements xzh {
        private static final j DEFAULT_INSTANCE;
        public static final int IS_INSTANT_TETHERING_ENABLED_FIELD_NUMBER = 3;
        public static final int IS_MESSAGES_ENABLED_FIELD_NUMBER = 4;
        public static final int IS_SMARTLOCK_ENABLED_FIELD_NUMBER = 2;
        private static volatile n7k PARSER = null;
        public static final int PHONE_MODEL_NAME_HASH_FIELD_NUMBER = 1;
        private int bitField0_;
        private boolean isInstantTetheringEnabled_;
        private boolean isMessagesEnabled_;
        private boolean isSmartlockEnabled_;
        private int phoneModelNameHash_;

        static {
            j jVar = new j();
            DEFAULT_INSTANCE = jVar;
            o3d.registerDefaultInstance(j.class, jVar);
        }

        private j() {
        }

        private void clearIsInstantTetheringEnabled() {
            this.bitField0_ &= -5;
            this.isInstantTetheringEnabled_ = false;
        }

        private void clearIsMessagesEnabled() {
            this.bitField0_ &= -9;
            this.isMessagesEnabled_ = false;
        }

        private void clearIsSmartlockEnabled() {
            this.bitField0_ &= -3;
            this.isSmartlockEnabled_ = false;
        }

        private void clearPhoneModelNameHash() {
            this.bitField0_ &= -2;
            this.phoneModelNameHash_ = 0;
        }

        public static j getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static j1 newBuilder() {
            return (j1) DEFAULT_INSTANCE.createBuilder();
        }

        public static j parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (j) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static j parseFrom(ByteBuffer byteBuffer) throws bye {
            return (j) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n7k parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setIsInstantTetheringEnabled(boolean z) {
            this.bitField0_ |= 4;
            this.isInstantTetheringEnabled_ = z;
        }

        private void setIsMessagesEnabled(boolean z) {
            this.bitField0_ |= 8;
            this.isMessagesEnabled_ = z;
        }

        private void setIsSmartlockEnabled(boolean z) {
            this.bitField0_ |= 2;
            this.isSmartlockEnabled_ = z;
        }

        private void setPhoneModelNameHash(int i) {
            this.bitField0_ |= 1;
            this.phoneModelNameHash_ = i;
        }

        @Override // defpackage.o3d
        public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
            n7k n7kVar;
            switch (n3dVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"bitField0_", "phoneModelNameHash_", "isSmartlockEnabled_", "isInstantTetheringEnabled_", "isMessagesEnabled_"});
                case 3:
                    return new j();
                case 4:
                    return new j1(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    n7k n7kVar2 = PARSER;
                    if (n7kVar2 != null) {
                        return n7kVar2;
                    }
                    synchronized (j.class) {
                        try {
                            n7kVar = PARSER;
                            if (n7kVar == null) {
                                n7kVar = new j3d(DEFAULT_INSTANCE);
                                PARSER = n7kVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return n7kVar;
                default:
                    androidx.core.app.q.i();
                    return null;
            }
        }

        public boolean getIsInstantTetheringEnabled() {
            return this.isInstantTetheringEnabled_;
        }

        @Deprecated
        public boolean getIsMessagesEnabled() {
            return this.isMessagesEnabled_;
        }

        public boolean getIsSmartlockEnabled() {
            return this.isSmartlockEnabled_;
        }

        public int getPhoneModelNameHash() {
            return this.phoneModelNameHash_;
        }

        public boolean hasIsInstantTetheringEnabled() {
            return (this.bitField0_ & 4) != 0;
        }

        @Deprecated
        public boolean hasIsMessagesEnabled() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasIsSmartlockEnabled() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasPhoneModelNameHash() {
            return (this.bitField0_ & 1) != 0;
        }

        public static j1 newBuilder(j jVar) {
            return (j1) DEFAULT_INSTANCE.createBuilder(jVar);
        }

        public static j parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (j) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static j parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
            return (j) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
        }

        public static j parseFrom(nn3 nn3Var) throws bye {
            return (j) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
        }

        public static j parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
            return (j) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
        }

        public static j parseFrom(byte[] bArr) throws bye {
            return (j) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static j parseFrom(byte[] bArr, z0c z0cVar) throws bye {
            return (j) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
        }

        public static j parseFrom(InputStream inputStream) throws IOException {
            return (j) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static j parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (j) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static j parseFrom(qr4 qr4Var) throws IOException {
            return (j) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
        }

        public static j parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
            return (j) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
        }
    }

    public static final class k extends o3d implements xzh {
        public static final int CONNECTION_TYPE_FIELD_NUMBER = 2;
        public static final int CONNECTION_TYPE_IS_AMBIGUOUS_FIELD_NUMBER = 1;
        private static final k DEFAULT_INSTANCE;
        public static final int MAX_EFFECTIVE_CONNECTION_TYPE_FIELD_NUMBER = 8;
        public static final int MIN_EFFECTIVE_CONNECTION_TYPE_FIELD_NUMBER = 7;
        private static volatile n7k PARSER;
        private int bitField0_;
        private boolean connectionTypeIsAmbiguous_;
        private int connectionType_;
        private int maxEffectiveConnectionType_;
        private int minEffectiveConnectionType_;

        static {
            k kVar = new k();
            DEFAULT_INSTANCE = kVar;
            o3d.registerDefaultInstance(k.class, kVar);
        }

        private k() {
        }

        private void clearConnectionType() {
            this.bitField0_ &= -3;
            this.connectionType_ = 0;
        }

        private void clearConnectionTypeIsAmbiguous() {
            this.bitField0_ &= -2;
            this.connectionTypeIsAmbiguous_ = false;
        }

        private void clearMaxEffectiveConnectionType() {
            this.bitField0_ &= -9;
            this.maxEffectiveConnectionType_ = 0;
        }

        private void clearMinEffectiveConnectionType() {
            this.bitField0_ &= -5;
            this.minEffectiveConnectionType_ = 0;
        }

        public static k getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static k1 newBuilder() {
            return (k1) DEFAULT_INSTANCE.createBuilder();
        }

        public static k parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (k) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static k parseFrom(ByteBuffer byteBuffer) throws bye {
            return (k) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n7k parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionType(m1 m1Var) {
            this.connectionType_ = m1Var.a;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setConnectionTypeIsAmbiguous(boolean z) {
            this.bitField0_ |= 1;
            this.connectionTypeIsAmbiguous_ = z;
        }

        private void setMaxEffectiveConnectionType(o1 o1Var) {
            this.maxEffectiveConnectionType_ = o1Var.a;
            this.bitField0_ |= 8;
        }

        private void setMinEffectiveConnectionType(o1 o1Var) {
            this.minEffectiveConnectionType_ = o1Var.a;
            this.bitField0_ |= 4;
        }

        @Override // defpackage.o3d
        public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
            n7k n7kVar;
            switch (n3dVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    k kVar = DEFAULT_INSTANCE;
                    l1 l1Var = l1.a;
                    n1 n1Var = n1.a;
                    return o3d.newMessageInfo(kVar, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002᠌\u0001\u0007᠌\u0002\b᠌\u0003", new Object[]{"bitField0_", "connectionTypeIsAmbiguous_", "connectionType_", l1Var, "minEffectiveConnectionType_", n1Var, "maxEffectiveConnectionType_", n1Var});
                case 3:
                    return new k();
                case 4:
                    return new k1(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    n7k n7kVar2 = PARSER;
                    if (n7kVar2 != null) {
                        return n7kVar2;
                    }
                    synchronized (k.class) {
                        try {
                            n7kVar = PARSER;
                            if (n7kVar == null) {
                                n7kVar = new j3d(DEFAULT_INSTANCE);
                                PARSER = n7kVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return n7kVar;
                default:
                    androidx.core.app.q.i();
                    return null;
            }
        }

        public m1 getConnectionType() {
            m1 b = m1.b(this.connectionType_);
            return b == null ? m1.CONNECTION_UNKNOWN : b;
        }

        public boolean getConnectionTypeIsAmbiguous() {
            return this.connectionTypeIsAmbiguous_;
        }

        public o1 getMaxEffectiveConnectionType() {
            o1 b = o1.b(this.maxEffectiveConnectionType_);
            return b == null ? o1.EFFECTIVE_CONNECTION_TYPE_UNKNOWN : b;
        }

        public o1 getMinEffectiveConnectionType() {
            o1 b = o1.b(this.minEffectiveConnectionType_);
            return b == null ? o1.EFFECTIVE_CONNECTION_TYPE_UNKNOWN : b;
        }

        public boolean hasConnectionType() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasConnectionTypeIsAmbiguous() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasMaxEffectiveConnectionType() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasMinEffectiveConnectionType() {
            return (this.bitField0_ & 4) != 0;
        }

        public static k1 newBuilder(k kVar) {
            return (k1) DEFAULT_INSTANCE.createBuilder(kVar);
        }

        public static k parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (k) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static k parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
            return (k) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
        }

        public static k parseFrom(nn3 nn3Var) throws bye {
            return (k) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
        }

        public static k parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
            return (k) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
        }

        public static k parseFrom(byte[] bArr) throws bye {
            return (k) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static k parseFrom(byte[] bArr, z0c z0cVar) throws bye {
            return (k) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
        }

        public static k parseFrom(InputStream inputStream) throws IOException {
            return (k) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static k parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (k) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static k parseFrom(qr4 qr4Var) throws IOException {
            return (k) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
        }

        public static k parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
            return (k) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
        }
    }

    public static final class m extends o3d implements xzh {
        public static final int CRASH_COUNT_DUE_TO_GMS_CORE_UPDATE_FIELD_NUMBER = 30;
        private static final m DEFAULT_INSTANCE;
        public static final int FROM_PREVIOUS_RUN_FIELD_NUMBER = 29;
        public static final int INCREMENTAL_UPTIME_SEC_FIELD_NUMBER = 1;
        public static final int KERNEL_CRASH_COUNT_FIELD_NUMBER = 8;
        public static final int LAUNCH_COUNT_FIELD_NUMBER = 15;
        public static final int OTHER_USER_CRASH_COUNT_FIELD_NUMBER = 7;
        public static final int PAGE_LOAD_COUNT_FIELD_NUMBER = 2;
        private static volatile n7k PARSER = null;
        public static final int RENDERER_LAUNCH_COUNT_FIELD_NUMBER = 26;
        public static final int UNCLEAN_SYSTEM_SHUTDOWN_COUNT_FIELD_NUMBER = 9;
        public static final int UPTIME_SEC_FIELD_NUMBER = 23;
        private int bitField0_;
        private int crashCountDueToGmsCoreUpdate_;
        private boolean fromPreviousRun_;
        private long incrementalUptimeSec_;
        private int kernelCrashCount_;
        private int launchCount_;
        private int otherUserCrashCount_;
        private int pageLoadCount_;
        private int rendererLaunchCount_;
        private int uncleanSystemShutdownCount_;
        private long uptimeSec_;

        static {
            m mVar = new m();
            DEFAULT_INSTANCE = mVar;
            o3d.registerDefaultInstance(m.class, mVar);
        }

        private m() {
        }

        private void clearCrashCountDueToGmsCoreUpdate() {
            this.bitField0_ &= -257;
            this.crashCountDueToGmsCoreUpdate_ = 0;
        }

        private void clearFromPreviousRun() {
            this.bitField0_ &= -513;
            this.fromPreviousRun_ = false;
        }

        private void clearIncrementalUptimeSec() {
            this.bitField0_ &= -2;
            this.incrementalUptimeSec_ = 0L;
        }

        private void clearKernelCrashCount() {
            this.bitField0_ &= -33;
            this.kernelCrashCount_ = 0;
        }

        private void clearLaunchCount() {
            this.bitField0_ &= -129;
            this.launchCount_ = 0;
        }

        private void clearOtherUserCrashCount() {
            this.bitField0_ &= -17;
            this.otherUserCrashCount_ = 0;
        }

        private void clearPageLoadCount() {
            this.bitField0_ &= -5;
            this.pageLoadCount_ = 0;
        }

        private void clearRendererLaunchCount() {
            this.bitField0_ &= -9;
            this.rendererLaunchCount_ = 0;
        }

        private void clearUncleanSystemShutdownCount() {
            this.bitField0_ &= -65;
            this.uncleanSystemShutdownCount_ = 0;
        }

        private void clearUptimeSec() {
            this.bitField0_ &= -3;
            this.uptimeSec_ = 0L;
        }

        public static m getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static x1 newBuilder() {
            return (x1) DEFAULT_INSTANCE.createBuilder();
        }

        public static m parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (m) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static m parseFrom(ByteBuffer byteBuffer) throws bye {
            return (m) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n7k parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setCrashCountDueToGmsCoreUpdate(int i) {
            this.bitField0_ |= 256;
            this.crashCountDueToGmsCoreUpdate_ = i;
        }

        private void setFromPreviousRun(boolean z) {
            this.bitField0_ |= RemoteCameraConfig.Mic.BUFFER_SIZE;
            this.fromPreviousRun_ = z;
        }

        private void setIncrementalUptimeSec(long j) {
            this.bitField0_ |= 1;
            this.incrementalUptimeSec_ = j;
        }

        private void setKernelCrashCount(int i) {
            this.bitField0_ |= 32;
            this.kernelCrashCount_ = i;
        }

        private void setLaunchCount(int i) {
            this.bitField0_ |= 128;
            this.launchCount_ = i;
        }

        private void setOtherUserCrashCount(int i) {
            this.bitField0_ |= 16;
            this.otherUserCrashCount_ = i;
        }

        private void setPageLoadCount(int i) {
            this.bitField0_ |= 4;
            this.pageLoadCount_ = i;
        }

        private void setRendererLaunchCount(int i) {
            this.bitField0_ |= 8;
            this.rendererLaunchCount_ = i;
        }

        private void setUncleanSystemShutdownCount(int i) {
            this.bitField0_ |= 64;
            this.uncleanSystemShutdownCount_ = i;
        }

        private void setUptimeSec(long j) {
            this.bitField0_ |= 2;
            this.uptimeSec_ = j;
        }

        @Override // defpackage.o3d
        public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
            n7k n7kVar;
            switch (n3dVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\u001e\n\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0002\u0007င\u0004\bင\u0005\tင\u0006\u000fင\u0007\u0017ဂ\u0001\u001aင\u0003\u001dဇ\t\u001eင\b", new Object[]{"bitField0_", "incrementalUptimeSec_", "pageLoadCount_", "otherUserCrashCount_", "kernelCrashCount_", "uncleanSystemShutdownCount_", "launchCount_", "uptimeSec_", "rendererLaunchCount_", "fromPreviousRun_", "crashCountDueToGmsCoreUpdate_"});
                case 3:
                    return new m();
                case 4:
                    return new x1(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    n7k n7kVar2 = PARSER;
                    if (n7kVar2 != null) {
                        return n7kVar2;
                    }
                    synchronized (m.class) {
                        try {
                            n7kVar = PARSER;
                            if (n7kVar == null) {
                                n7kVar = new j3d(DEFAULT_INSTANCE);
                                PARSER = n7kVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return n7kVar;
                default:
                    androidx.core.app.q.i();
                    return null;
            }
        }

        public int getCrashCountDueToGmsCoreUpdate() {
            return this.crashCountDueToGmsCoreUpdate_;
        }

        public boolean getFromPreviousRun() {
            return this.fromPreviousRun_;
        }

        public long getIncrementalUptimeSec() {
            return this.incrementalUptimeSec_;
        }

        public int getKernelCrashCount() {
            return this.kernelCrashCount_;
        }

        public int getLaunchCount() {
            return this.launchCount_;
        }

        public int getOtherUserCrashCount() {
            return this.otherUserCrashCount_;
        }

        public int getPageLoadCount() {
            return this.pageLoadCount_;
        }

        public int getRendererLaunchCount() {
            return this.rendererLaunchCount_;
        }

        public int getUncleanSystemShutdownCount() {
            return this.uncleanSystemShutdownCount_;
        }

        public long getUptimeSec() {
            return this.uptimeSec_;
        }

        public boolean hasCrashCountDueToGmsCoreUpdate() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasFromPreviousRun() {
            return (this.bitField0_ & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0;
        }

        public boolean hasIncrementalUptimeSec() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasKernelCrashCount() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasLaunchCount() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasOtherUserCrashCount() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasPageLoadCount() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasRendererLaunchCount() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasUncleanSystemShutdownCount() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasUptimeSec() {
            return (this.bitField0_ & 2) != 0;
        }

        public static x1 newBuilder(m mVar) {
            return (x1) DEFAULT_INSTANCE.createBuilder(mVar);
        }

        public static m parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (m) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static m parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
            return (m) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
        }

        public static m parseFrom(nn3 nn3Var) throws bye {
            return (m) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
        }

        public static m parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
            return (m) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
        }

        public static m parseFrom(byte[] bArr) throws bye {
            return (m) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static m parseFrom(byte[] bArr, z0c z0cVar) throws bye {
            return (m) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
        }

        public static m parseFrom(InputStream inputStream) throws IOException {
            return (m) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static m parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (m) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static m parseFrom(qr4 qr4Var) throws IOException {
            return (m) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
        }

        public static m parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
            return (m) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
        }
    }

    public static final class n extends o3d implements xzh {
        private static final n DEFAULT_INSTANCE;
        public static final int MANUFACTURER_ID_FIELD_NUMBER = 1;
        public static final int MANUFACTURER_VERSION_FIELD_NUMBER = 2;
        public static final int MANUFACTURER_VERSION_HASH_FIELD_NUMBER = 3;
        public static final int MANUFACTURER_VERSION_INFO_FIELD_NUMBER = 4;
        public static final int MANUFACTURER_VERSION_INFO_HASH_FIELD_NUMBER = 5;
        private static volatile n7k PARSER = null;
        public static final int TPM_SPECIFIC_VERSION_FIELD_NUMBER = 6;
        public static final int TPM_SPECIFIC_VERSION_HASH_FIELD_NUMBER = 7;
        private int bitField0_;
        private int manufacturerId_;
        private int manufacturerVersionHash_;
        private int manufacturerVersionInfoHash_;
        private int tpmSpecificVersionHash_;
        private String manufacturerVersion_ = "";
        private String manufacturerVersionInfo_ = "";
        private String tpmSpecificVersion_ = "";

        static {
            n nVar = new n();
            DEFAULT_INSTANCE = nVar;
            o3d.registerDefaultInstance(n.class, nVar);
        }

        private n() {
        }

        private void clearManufacturerId() {
            this.bitField0_ &= -2;
            this.manufacturerId_ = 0;
        }

        private void clearManufacturerVersion() {
            this.bitField0_ &= -3;
            this.manufacturerVersion_ = getDefaultInstance().getManufacturerVersion();
        }

        private void clearManufacturerVersionHash() {
            this.bitField0_ &= -5;
            this.manufacturerVersionHash_ = 0;
        }

        private void clearManufacturerVersionInfo() {
            this.bitField0_ &= -9;
            this.manufacturerVersionInfo_ = getDefaultInstance().getManufacturerVersionInfo();
        }

        private void clearManufacturerVersionInfoHash() {
            this.bitField0_ &= -17;
            this.manufacturerVersionInfoHash_ = 0;
        }

        private void clearTpmSpecificVersion() {
            this.bitField0_ &= -33;
            this.tpmSpecificVersion_ = getDefaultInstance().getTpmSpecificVersion();
        }

        private void clearTpmSpecificVersionHash() {
            this.bitField0_ &= -65;
            this.tpmSpecificVersionHash_ = 0;
        }

        public static n getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static y1 newBuilder() {
            return (y1) DEFAULT_INSTANCE.createBuilder();
        }

        public static n parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (n) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static n parseFrom(ByteBuffer byteBuffer) throws bye {
            return (n) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n7k parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setManufacturerId(int i) {
            this.bitField0_ |= 1;
            this.manufacturerId_ = i;
        }

        private void setManufacturerVersion(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.manufacturerVersion_ = str;
        }

        private void setManufacturerVersionBytes(nn3 nn3Var) {
            this.manufacturerVersion_ = nn3Var.y();
            this.bitField0_ |= 2;
        }

        private void setManufacturerVersionHash(int i) {
            this.bitField0_ |= 4;
            this.manufacturerVersionHash_ = i;
        }

        private void setManufacturerVersionInfo(String str) {
            str.getClass();
            this.bitField0_ |= 8;
            this.manufacturerVersionInfo_ = str;
        }

        private void setManufacturerVersionInfoBytes(nn3 nn3Var) {
            this.manufacturerVersionInfo_ = nn3Var.y();
            this.bitField0_ |= 8;
        }

        private void setManufacturerVersionInfoHash(int i) {
            this.bitField0_ |= 16;
            this.manufacturerVersionInfoHash_ = i;
        }

        private void setTpmSpecificVersion(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.tpmSpecificVersion_ = str;
        }

        private void setTpmSpecificVersionBytes(nn3 nn3Var) {
            this.tpmSpecificVersion_ = nn3Var.y();
            this.bitField0_ |= 32;
        }

        private void setTpmSpecificVersionHash(int i) {
            this.bitField0_ |= 64;
            this.tpmSpecificVersionHash_ = i;
        }

        @Override // defpackage.o3d
        public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
            n7k n7kVar;
            switch (n3dVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဆ\u0000\u0002ဈ\u0001\u0003ဆ\u0002\u0004ဈ\u0003\u0005ဆ\u0004\u0006ဈ\u0005\u0007ဆ\u0006", new Object[]{"bitField0_", "manufacturerId_", "manufacturerVersion_", "manufacturerVersionHash_", "manufacturerVersionInfo_", "manufacturerVersionInfoHash_", "tpmSpecificVersion_", "tpmSpecificVersionHash_"});
                case 3:
                    return new n();
                case 4:
                    return new y1(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    n7k n7kVar2 = PARSER;
                    if (n7kVar2 != null) {
                        return n7kVar2;
                    }
                    synchronized (n.class) {
                        try {
                            n7kVar = PARSER;
                            if (n7kVar == null) {
                                n7kVar = new j3d(DEFAULT_INSTANCE);
                                PARSER = n7kVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return n7kVar;
                default:
                    androidx.core.app.q.i();
                    return null;
            }
        }

        public int getManufacturerId() {
            return this.manufacturerId_;
        }

        public String getManufacturerVersion() {
            return this.manufacturerVersion_;
        }

        public nn3 getManufacturerVersionBytes() {
            return nn3.o(this.manufacturerVersion_);
        }

        public int getManufacturerVersionHash() {
            return this.manufacturerVersionHash_;
        }

        public String getManufacturerVersionInfo() {
            return this.manufacturerVersionInfo_;
        }

        public nn3 getManufacturerVersionInfoBytes() {
            return nn3.o(this.manufacturerVersionInfo_);
        }

        public int getManufacturerVersionInfoHash() {
            return this.manufacturerVersionInfoHash_;
        }

        public String getTpmSpecificVersion() {
            return this.tpmSpecificVersion_;
        }

        public nn3 getTpmSpecificVersionBytes() {
            return nn3.o(this.tpmSpecificVersion_);
        }

        public int getTpmSpecificVersionHash() {
            return this.tpmSpecificVersionHash_;
        }

        public boolean hasManufacturerId() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasManufacturerVersion() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasManufacturerVersionHash() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasManufacturerVersionInfo() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasManufacturerVersionInfoHash() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasTpmSpecificVersion() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasTpmSpecificVersionHash() {
            return (this.bitField0_ & 64) != 0;
        }

        public static y1 newBuilder(n nVar) {
            return (y1) DEFAULT_INSTANCE.createBuilder(nVar);
        }

        public static n parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (n) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static n parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
            return (n) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
        }

        public static n parseFrom(nn3 nn3Var) throws bye {
            return (n) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
        }

        public static n parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
            return (n) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
        }

        public static n parseFrom(byte[] bArr) throws bye {
            return (n) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static n parseFrom(byte[] bArr, z0c z0cVar) throws bye {
            return (n) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
        }

        public static n parseFrom(InputStream inputStream) throws IOException {
            return (n) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static n parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (n) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static n parseFrom(qr4 qr4Var) throws IOException {
            return (n) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
        }

        public static n parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
            return (n) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
        }
    }

    /* renamed from: com.yandex.pulse.metrics.o$o, reason: collision with other inner class name */
    public static final class C0020o extends o3d implements xzh {
        public static final int BRAND_ID_FIELD_NUMBER = 2;
        public static final int BUILD_FIELD_NUMBER = 3;
        public static final int CLIENT_VERSION_FIELD_NUMBER = 13;
        private static final C0020o DEFAULT_INSTANCE;
        public static final int DEGRADATION_FIELD_NUMBER = 10;
        public static final int DEVICE_FORM_FACTOR_FIELD_NUMBER = 12;
        public static final int ENERGY_SAVING_FIELD_NUMBER = 11;
        public static final int GPU_OPTIMUS_FIELD_NUMBER = 4;
        public static final int MACHINE_ID_FIELD_NUMBER = 9;
        public static final int METRICA_API_KEY_FIELD_NUMBER = 6;
        private static volatile n7k PARSER = null;
        public static final int PARTNER_ID_FIELD_NUMBER = 7;
        public static final int UI_FIELD_NUMBER = 1;
        public static final int UPDATER_CLID_FIELD_NUMBER = 8;
        public static final int UUID_FIELD_NUMBER = 14;
        private int bitField0_;
        private int degradation_;
        private int deviceFormFactor_;
        private int energySaving_;
        private boolean gpuOptimus_;
        private String ui_ = "";
        private String brandId_ = "";
        private String build_ = "";
        private String metricaApiKey_ = "";
        private String partnerId_ = "";
        private String updaterClid_ = "";
        private String machineId_ = "";
        private String clientVersion_ = "";
        private String uuid_ = "";

        static {
            C0020o c0020o = new C0020o();
            DEFAULT_INSTANCE = c0020o;
            o3d.registerDefaultInstance(C0020o.class, c0020o);
        }

        private C0020o() {
        }

        private void clearBrandId() {
            this.bitField0_ &= -3;
            this.brandId_ = getDefaultInstance().getBrandId();
        }

        private void clearBuild() {
            this.bitField0_ &= -5;
            this.build_ = getDefaultInstance().getBuild();
        }

        private void clearClientVersion() {
            this.bitField0_ &= -2049;
            this.clientVersion_ = getDefaultInstance().getClientVersion();
        }

        private void clearDegradation() {
            this.bitField0_ &= -257;
            this.degradation_ = 0;
        }

        private void clearDeviceFormFactor() {
            this.bitField0_ &= -1025;
            this.deviceFormFactor_ = 0;
        }

        private void clearEnergySaving() {
            this.bitField0_ &= -513;
            this.energySaving_ = 0;
        }

        private void clearGpuOptimus() {
            this.bitField0_ &= -9;
            this.gpuOptimus_ = false;
        }

        private void clearMachineId() {
            this.bitField0_ &= -129;
            this.machineId_ = getDefaultInstance().getMachineId();
        }

        private void clearMetricaApiKey() {
            this.bitField0_ &= -17;
            this.metricaApiKey_ = getDefaultInstance().getMetricaApiKey();
        }

        private void clearPartnerId() {
            this.bitField0_ &= -33;
            this.partnerId_ = getDefaultInstance().getPartnerId();
        }

        private void clearUi() {
            this.bitField0_ &= -2;
            this.ui_ = getDefaultInstance().getUi();
        }

        private void clearUpdaterClid() {
            this.bitField0_ &= -65;
            this.updaterClid_ = getDefaultInstance().getUpdaterClid();
        }

        private void clearUuid() {
            this.bitField0_ &= -4097;
            this.uuid_ = getDefaultInstance().getUuid();
        }

        public static C0020o getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static z1 newBuilder() {
            return (z1) DEFAULT_INSTANCE.createBuilder();
        }

        public static C0020o parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (C0020o) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static C0020o parseFrom(ByteBuffer byteBuffer) throws bye {
            return (C0020o) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static n7k parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setBrandId(String str) {
            str.getClass();
            this.bitField0_ |= 2;
            this.brandId_ = str;
        }

        private void setBrandIdBytes(nn3 nn3Var) {
            this.brandId_ = nn3Var.y();
            this.bitField0_ |= 2;
        }

        private void setBuild(String str) {
            str.getClass();
            this.bitField0_ |= 4;
            this.build_ = str;
        }

        private void setBuildBytes(nn3 nn3Var) {
            this.build_ = nn3Var.y();
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClientVersion(String str) {
            str.getClass();
            this.bitField0_ |= 2048;
            this.clientVersion_ = str;
        }

        private void setClientVersionBytes(nn3 nn3Var) {
            this.clientVersion_ = nn3Var.y();
            this.bitField0_ |= 2048;
        }

        private void setDegradation(b2 b2Var) {
            this.degradation_ = b2Var.a;
            this.bitField0_ |= 256;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDeviceFormFactor(d2 d2Var) {
            this.deviceFormFactor_ = d2Var.a;
            this.bitField0_ |= 1024;
        }

        private void setEnergySaving(f2 f2Var) {
            this.energySaving_ = f2Var.a;
            this.bitField0_ |= RemoteCameraConfig.Mic.BUFFER_SIZE;
        }

        private void setGpuOptimus(boolean z) {
            this.bitField0_ |= 8;
            this.gpuOptimus_ = z;
        }

        private void setMachineId(String str) {
            str.getClass();
            this.bitField0_ |= 128;
            this.machineId_ = str;
        }

        private void setMachineIdBytes(nn3 nn3Var) {
            this.machineId_ = nn3Var.y();
            this.bitField0_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMetricaApiKey(String str) {
            str.getClass();
            this.bitField0_ |= 16;
            this.metricaApiKey_ = str;
        }

        private void setMetricaApiKeyBytes(nn3 nn3Var) {
            this.metricaApiKey_ = nn3Var.y();
            this.bitField0_ |= 16;
        }

        private void setPartnerId(String str) {
            str.getClass();
            this.bitField0_ |= 32;
            this.partnerId_ = str;
        }

        private void setPartnerIdBytes(nn3 nn3Var) {
            this.partnerId_ = nn3Var.y();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUi(String str) {
            str.getClass();
            this.bitField0_ |= 1;
            this.ui_ = str;
        }

        private void setUiBytes(nn3 nn3Var) {
            this.ui_ = nn3Var.y();
            this.bitField0_ |= 1;
        }

        private void setUpdaterClid(String str) {
            str.getClass();
            this.bitField0_ |= 64;
            this.updaterClid_ = str;
        }

        private void setUpdaterClidBytes(nn3 nn3Var) {
            this.updaterClid_ = nn3Var.y();
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUuid(String str) {
            str.getClass();
            this.bitField0_ |= 4096;
            this.uuid_ = str;
        }

        private void setUuidBytes(nn3 nn3Var) {
            this.uuid_ = nn3Var.y();
            this.bitField0_ |= 4096;
        }

        @Override // defpackage.o3d
        public final Object dynamicMethod(n3d n3dVar, Object obj, Object obj2) {
            n7k n7kVar;
            switch (n3dVar.ordinal()) {
                case 0:
                    return (byte) 1;
                case 1:
                    return null;
                case 2:
                    return o3d.newMessageInfo(DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\u000e\r\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0006ဈ\u0004\u0007ဈ\u0005\bဈ\u0006\tဈ\u0007\n᠌\b\u000b᠌\t\f᠌\n\rဈ\u000b\u000eဈ\f", new Object[]{"bitField0_", "ui_", "brandId_", "build_", "gpuOptimus_", "metricaApiKey_", "partnerId_", "updaterClid_", "machineId_", "degradation_", a2.a, "energySaving_", e2.a, "deviceFormFactor_", c2.a, "clientVersion_", "uuid_"});
                case 3:
                    return new C0020o();
                case 4:
                    return new z1(DEFAULT_INSTANCE);
                case 5:
                    return DEFAULT_INSTANCE;
                case 6:
                    n7k n7kVar2 = PARSER;
                    if (n7kVar2 != null) {
                        return n7kVar2;
                    }
                    synchronized (C0020o.class) {
                        try {
                            n7kVar = PARSER;
                            if (n7kVar == null) {
                                n7kVar = new j3d(DEFAULT_INSTANCE);
                                PARSER = n7kVar;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return n7kVar;
                default:
                    androidx.core.app.q.i();
                    return null;
            }
        }

        public String getBrandId() {
            return this.brandId_;
        }

        public nn3 getBrandIdBytes() {
            return nn3.o(this.brandId_);
        }

        public String getBuild() {
            return this.build_;
        }

        public nn3 getBuildBytes() {
            return nn3.o(this.build_);
        }

        public String getClientVersion() {
            return this.clientVersion_;
        }

        public nn3 getClientVersionBytes() {
            return nn3.o(this.clientVersion_);
        }

        public b2 getDegradation() {
            int i = this.degradation_;
            b2 b2Var = b2.DEGRADATION_OFF;
            b2 b2Var2 = i != 0 ? i != 1 ? i != 2 ? null : b2.DEGRADATION_AMBIGOUS : b2.DEGRADATION_ON : b2Var;
            return b2Var2 == null ? b2Var : b2Var2;
        }

        public d2 getDeviceFormFactor() {
            d2 b = d2.b(this.deviceFormFactor_);
            return b == null ? d2.DEVICE_FORM_FACTOR_DESKTOP : b;
        }

        public f2 getEnergySaving() {
            int i = this.energySaving_;
            f2 f2Var = f2.ENERGY_SAVING_OFF;
            f2 f2Var2 = i != 0 ? i != 1 ? i != 2 ? null : f2.ENERGY_SAVING_AMBIGOUS : f2.ENERGY_SAVING_ON : f2Var;
            return f2Var2 == null ? f2Var : f2Var2;
        }

        public boolean getGpuOptimus() {
            return this.gpuOptimus_;
        }

        public String getMachineId() {
            return this.machineId_;
        }

        public nn3 getMachineIdBytes() {
            return nn3.o(this.machineId_);
        }

        public String getMetricaApiKey() {
            return this.metricaApiKey_;
        }

        public nn3 getMetricaApiKeyBytes() {
            return nn3.o(this.metricaApiKey_);
        }

        public String getPartnerId() {
            return this.partnerId_;
        }

        public nn3 getPartnerIdBytes() {
            return nn3.o(this.partnerId_);
        }

        public String getUi() {
            return this.ui_;
        }

        public nn3 getUiBytes() {
            return nn3.o(this.ui_);
        }

        public String getUpdaterClid() {
            return this.updaterClid_;
        }

        public nn3 getUpdaterClidBytes() {
            return nn3.o(this.updaterClid_);
        }

        public String getUuid() {
            return this.uuid_;
        }

        public nn3 getUuidBytes() {
            return nn3.o(this.uuid_);
        }

        public boolean hasBrandId() {
            return (this.bitField0_ & 2) != 0;
        }

        public boolean hasBuild() {
            return (this.bitField0_ & 4) != 0;
        }

        public boolean hasClientVersion() {
            return (this.bitField0_ & 2048) != 0;
        }

        public boolean hasDegradation() {
            return (this.bitField0_ & 256) != 0;
        }

        public boolean hasDeviceFormFactor() {
            return (this.bitField0_ & 1024) != 0;
        }

        public boolean hasEnergySaving() {
            return (this.bitField0_ & RemoteCameraConfig.Mic.BUFFER_SIZE) != 0;
        }

        public boolean hasGpuOptimus() {
            return (this.bitField0_ & 8) != 0;
        }

        public boolean hasMachineId() {
            return (this.bitField0_ & 128) != 0;
        }

        public boolean hasMetricaApiKey() {
            return (this.bitField0_ & 16) != 0;
        }

        public boolean hasPartnerId() {
            return (this.bitField0_ & 32) != 0;
        }

        public boolean hasUi() {
            return (this.bitField0_ & 1) != 0;
        }

        public boolean hasUpdaterClid() {
            return (this.bitField0_ & 64) != 0;
        }

        public boolean hasUuid() {
            return (this.bitField0_ & 4096) != 0;
        }

        public static z1 newBuilder(C0020o c0020o) {
            return (z1) DEFAULT_INSTANCE.createBuilder(c0020o);
        }

        public static C0020o parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (C0020o) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static C0020o parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
            return (C0020o) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
        }

        public static C0020o parseFrom(nn3 nn3Var) throws bye {
            return (C0020o) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
        }

        public static C0020o parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
            return (C0020o) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
        }

        public static C0020o parseFrom(byte[] bArr) throws bye {
            return (C0020o) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static C0020o parseFrom(byte[] bArr, z0c z0cVar) throws bye {
            return (C0020o) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
        }

        public static C0020o parseFrom(InputStream inputStream) throws IOException {
            return (C0020o) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static C0020o parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
            return (C0020o) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
        }

        public static C0020o parseFrom(qr4 qr4Var) throws IOException {
            return (C0020o) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
        }

        public static C0020o parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
            return (C0020o) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
        }
    }

    public static p newBuilder(o oVar) {
        return (p) DEFAULT_INSTANCE.createBuilder(oVar);
    }

    public static o parseDelimitedFrom(InputStream inputStream, z0c z0cVar) throws IOException {
        return (o) o3d.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
    }

    public static o parseFrom(ByteBuffer byteBuffer, z0c z0cVar) throws bye {
        return (o) o3d.parseFrom(DEFAULT_INSTANCE, byteBuffer, z0cVar);
    }

    public static o parseFrom(nn3 nn3Var) throws bye {
        return (o) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var);
    }

    public static o parseFrom(nn3 nn3Var, z0c z0cVar) throws bye {
        return (o) o3d.parseFrom(DEFAULT_INSTANCE, nn3Var, z0cVar);
    }

    private void addAntivirusProduct(int i2, a aVar) {
        aVar.getClass();
        ensureAntivirusProductIsMutable();
        this.antivirusProduct_.add(i2, aVar);
    }

    private void addChromeComponent(int i2, b bVar) {
        bVar.getClass();
        ensureChromeComponentIsMutable();
        this.chromeComponent_.add(i2, bVar);
    }

    private void addExternalAudioVideoDevice(int i2, f fVar) {
        fVar.getClass();
        ensureExternalAudioVideoDeviceIsMutable();
        this.externalAudioVideoDevice_.add(i2, fVar);
    }

    private void addFieldTrial(int i2, g gVar) {
        gVar.getClass();
        ensureFieldTrialIsMutable();
        this.fieldTrial_.add(i2, gVar);
    }

    public static o parseFrom(byte[] bArr) throws bye {
        return (o) o3d.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static o parseFrom(byte[] bArr, z0c z0cVar) throws bye {
        return (o) o3d.parseFrom(DEFAULT_INSTANCE, bArr, z0cVar);
    }

    public static o parseFrom(InputStream inputStream) throws IOException {
        return (o) o3d.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static o parseFrom(InputStream inputStream, z0c z0cVar) throws IOException {
        return (o) o3d.parseFrom(DEFAULT_INSTANCE, inputStream, z0cVar);
    }

    public static o parseFrom(qr4 qr4Var) throws IOException {
        return (o) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var);
    }

    public static o parseFrom(qr4 qr4Var, z0c z0cVar) throws IOException {
        return (o) o3d.parseFrom(DEFAULT_INSTANCE, qr4Var, z0cVar);
    }
}
