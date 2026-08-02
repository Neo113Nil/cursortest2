package ru.yandex.video.m3.player.impl.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import defpackage.cvu0;
import defpackage.i3y;
import defpackage.sls;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCP.tools.HexString;
import ru.yandex.video.m3.R;
import ru.yandex.video.m3.player.provider.internal.VpuidProvider;
import ru.yandex.video.m3.player.provider.internal.VpuidProviderImpl;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u001b\u0010\u001a\u001a\u00020\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001d\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/yandex/video/m3/player/impl/utils/InfoProviderImpl;", "Lru/yandex/video/m3/player/impl/utils/InfoProvider;", "Landroid/content/Context;", "context", "Lru/yandex/video/m3/player/provider/internal/VpuidProvider;", "vpuidProvider", "<init>", "(Landroid/content/Context;Lru/yandex/video/m3/player/provider/internal/VpuidProvider;)V", "(Landroid/content/Context;)V", "Landroid/content/pm/PackageInfo;", "info", "", "getVersionCode", "(Landroid/content/pm/PackageInfo;)J", "", "formDeviceName", "()Ljava/lang/String;", "getDeviceType", "getVpuid", "Landroid/content/Context;", "Lru/yandex/video/m3/player/provider/internal/VpuidProvider;", "Lru/yandex/video/m3/player/impl/utils/AppInfo;", "appInfo$delegate", "Li3y;", "getAppInfo", "()Lru/yandex/video/m3/player/impl/utils/AppInfo;", "appInfo", "userAgent$delegate", "getUserAgent", "userAgent", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InfoProviderImpl implements InfoProvider {
    public static final int $stable = 8;

    /* renamed from: appInfo$delegate, reason: from kotlin metadata */
    private final i3y appInfo;
    private final Context context;

    /* renamed from: userAgent$delegate, reason: from kotlin metadata */
    private final i3y userAgent;
    private final VpuidProvider vpuidProvider;

    public InfoProviderImpl(Context context, VpuidProvider vpuidProvider) {
        this.context = context;
        this.vpuidProvider = vpuidProvider;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
        this.appInfo = a.b(lazyThreadSafetyMode, new sls() { // from class: ru.yandex.video.m3.player.impl.utils.InfoProviderImpl$appInfo$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final AppInfo invoke() {
                Object failure;
                Context context2;
                Context context3;
                Context context4;
                long versionCode;
                InfoProviderImpl infoProviderImpl = InfoProviderImpl.this;
                try {
                    context2 = infoProviderImpl.context;
                    PackageManager packageManager = context2.getPackageManager();
                    context3 = infoProviderImpl.context;
                    PackageInfo packageInfo = packageManager.getPackageInfo(context3.getPackageName(), 0);
                    context4 = infoProviderImpl.context;
                    String packageName = context4.getPackageName();
                    String str = packageInfo.versionName;
                    if (str == null) {
                        str = "";
                    }
                    versionCode = infoProviderImpl.getVersionCode(packageInfo);
                    failure = AppInfoKt.AppInfo$default(packageName, str, versionCode, null, 8, null);
                } catch (Throwable th) {
                    failure = new Result.Failure(th);
                }
                Object AppInfo$default = AppInfoKt.AppInfo$default("UndefinedApp", "Undefined", 0L, null, 8, null);
                if (failure instanceof Result.Failure) {
                    failure = AppInfo$default;
                }
                return (AppInfo) failure;
            }
        });
        this.userAgent = a.b(lazyThreadSafetyMode, new sls() { // from class: ru.yandex.video.m3.player.impl.utils.InfoProviderImpl$userAgent$2
            {
                super(0);
            }

            @Override // defpackage.sls
            public final String invoke() {
                String formDeviceName;
                String deviceType;
                StringBuilder sb = new StringBuilder("ru.yandex.video.m3/3.7.1.19171 (");
                formDeviceName = InfoProviderImpl.this.formDeviceName();
                sb.append(formDeviceName);
                sb.append("; Android ");
                sb.append(Build.VERSION.RELEASE);
                sb.append(Extension.C_BRAKE_SPACE);
                sb.append(InfoProviderImpl.this.getAppInfo().getApplicationId());
                sb.append('/');
                sb.append(InfoProviderImpl.this.getAppInfo().getAppVersionName());
                sb.append('.');
                sb.append(InfoProviderImpl.this.getAppInfo().getAppVersionCode());
                sb.append(HexString.CHAR_SPACE);
                deviceType = InfoProviderImpl.this.getDeviceType();
                sb.append(deviceType);
                return sb.toString();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formDeviceName() {
        Object failure;
        try {
            String str = Build.MODEL;
            if (str == null || !cvu0.x(str, Build.MANUFACTURER, false)) {
                failure = cvu0.n(Build.MANUFACTURER) + HexString.CHAR_SPACE + cvu0.n(str);
            } else {
                failure = cvu0.n(str);
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = "";
        }
        return (String) failure;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getDeviceType() {
        Object failure;
        try {
            boolean z = this.context.getResources().getBoolean(R.bool.videoPlayer_isTablet);
            if (z) {
                failure = "Tablet";
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                failure = "Mobile";
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        return (String) (failure instanceof Result.Failure ? "Mobile" : failure);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getVersionCode(PackageInfo info) {
        return UtilsKt.isApiAchieved(28) ? info.getLongVersionCode() : info.versionCode;
    }

    @Override // ru.yandex.video.m3.player.impl.utils.InfoProvider
    public AppInfo getAppInfo() {
        return (AppInfo) this.appInfo.getValue();
    }

    @Override // ru.yandex.video.m3.player.impl.utils.InfoProvider
    public String getUserAgent() {
        return (String) this.userAgent.getValue();
    }

    @Override // ru.yandex.video.m3.player.impl.utils.InfoProvider
    public String getVpuid() {
        return this.vpuidProvider.getVpuid();
    }

    public InfoProviderImpl(Context context) {
        this(context, new VpuidProviderImpl(context));
    }
}
