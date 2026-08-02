package com.squareup.cash.observability.backend.real;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import androidx.work.impl.WorkLauncherImpl;
import com.datadog.android.Datadog;
import com.datadog.android.rum.RumMonitor;
import com.google.android.gms.internal.mlkit_genai_prompt.zzadx;
import com.squareup.cash.observability.types.MetadataKey;
import com.squareup.cash.observability.types.MetadataSection$ReservedRumKey;
import dev.zacsweers.metro.Provider;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyMap;
import kotlin.jvm.functions.Function2;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealDatadogClient {
    public String appToken;
    public final String applicationId;
    public final String buildType;
    public final String clientToken;
    public final Context context;
    public String customerToken;
    public final String environment;
    public final List firstPartyHosts;
    public final String flavor;
    public final Provider rumMonitor;
    public final Provider tracer;

    public RealDatadogClient(String str, Context context, String str2, String str3, List list, Provider provider, Provider provider2) {
        provider.getClass();
        provider2.getClass();
        this.buildType = str;
        this.context = context;
        this.environment = str2;
        this.flavor = str3;
        this.firstPartyHosts = list;
        this.rumMonitor = provider;
        this.tracer = provider2;
        ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        applicationInfo.getClass();
        Bundle bundle = applicationInfo.metaData;
        String string2 = bundle.getString("com.datadog.android.APPLICATION_ID");
        string2.getClass();
        this.applicationId = string2;
        String string3 = bundle.getString("com.datadog.android.CLIENT_TOKEN");
        string3.getClass();
        this.clientToken = string3;
    }

    public final void addCustomAttributeToRumMonitoring(List list) {
        list.getClass();
        if (list.isEmpty()) {
            return;
        }
        RumMonitor rumMonitor = (RumMonitor) this.rumMonitor.invoke();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            MetadataKey metadataKey = (MetadataKey) pair.first;
            Object obj = pair.second;
            if (!(metadataKey instanceof MetadataSection$ReservedRumKey)) {
                rumMonitor.addAttribute(obj, metadataKey.getDatadogName());
            }
        }
    }

    public final void populateGlobalAttributes(Function2 function2) {
        function2.invoke(MetadataSection$ReservedRumKey.OsNameKey.INSTANCE.datadogName, "Android");
        String str = MetadataSection$ReservedRumKey.OsVersionKey.INSTANCE.datadogName;
        String str2 = Build.VERSION.RELEASE;
        str2.getClass();
        function2.invoke(str, str2);
        String str3 = MetadataSection$ReservedRumKey.DeviceBrandKey.INSTANCE.datadogName;
        String str4 = Build.MANUFACTURER;
        str4.getClass();
        function2.invoke(str3, str4);
        String str5 = MetadataSection$ReservedRumKey.DeviceModelKey.INSTANCE.datadogName;
        String str6 = Build.MODEL;
        str6.getClass();
        function2.invoke(str5, str6);
        function2.invoke("cost_center", "10102 Cash App - Engineering");
        function2.invoke("env", this.environment);
        function2.invoke("build_variant", zzadx.getUnifiedNameBuildVariantTag(this.flavor, this.buildType));
    }

    public final void updateUserInfo() {
        String str = this.customerToken;
        if (str == null && (str = this.appToken) == null) {
            str = "";
        }
        if (str.length() == 0) {
            Timber.Forest.w("Setting empty user ID to Datadog - appToken may not be initialized", new Object[0]);
        }
        WorkLauncherImpl workLauncherImpl = Datadog.registry;
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        Datadog.getInstance(null).setUserInfo(str, emptyMap);
    }
}
