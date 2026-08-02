package com.datadog.android.core.internal;

import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.telephony.TelephonyManager;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import com.datadog.android.api.context.DeviceType;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class CoreFeature$initialize$2 extends Lambda implements Function0 {
    public final /* synthetic */ Context $appContext;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String $sdkInstanceId;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoreFeature$initialize$2(Context context, String str) {
        super(0);
        this.$r8$classId = 3;
        this.$sdkInstanceId = str;
        this.$appContext = context;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        boolean z = true;
        Context context = this.$appContext;
        String str = this.$sdkInstanceId;
        switch (i) {
            case 0:
                return new File(context.getCacheDir(), String.format(Locale.US, "datadog-%s", Arrays.copyOf(new Object[]{str}, 1)));
            case 1:
                return Room.dataStoreFile(context, str);
            case 2:
                return DBUtil.preferencesDataStoreFile(context, str);
            default:
                Object systemService = context.getSystemService("uimode");
                UiModeManager uiModeManager = systemService instanceof UiModeManager ? (UiModeManager) systemService : null;
                if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
                    PackageManager packageManager = context.getPackageManager();
                    packageManager.getClass();
                    if (!packageManager.hasSystemFeature("android.software.leanback") && !packageManager.hasSystemFeature("com.google.android.tv")) {
                        Locale locale = Locale.US;
                        String m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(locale, str, locale);
                        boolean z2 = false;
                        if (StringsKt.contains((CharSequence) m, (CharSequence) "tablet", false) || StringsKt.contains((CharSequence) m, (CharSequence) "sm-t", false) || context.getResources().getConfiguration().smallestScreenWidthDp >= 800) {
                            return DeviceType.TABLET;
                        }
                        String lowerCase = str.toLowerCase(locale);
                        lowerCase.getClass();
                        if (!StringsKt.contains((CharSequence) lowerCase, (CharSequence) "phone", false)) {
                            Object systemService2 = context.getSystemService("phone");
                            TelephonyManager telephonyManager = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
                            if (telephonyManager != null && telephonyManager.getPhoneType() == 0) {
                                z2 = true;
                            }
                            z = true ^ z2;
                        }
                        return z ? DeviceType.MOBILE : DeviceType.OTHER;
                    }
                }
                return DeviceType.TV;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CoreFeature$initialize$2(Context context, int i, String str) {
        super(0);
        this.$r8$classId = i;
        this.$appContext = context;
        this.$sdkInstanceId = str;
    }
}
