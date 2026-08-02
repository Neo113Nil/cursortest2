package com.yandex.passport.internal.report.reporters;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.yandex.passport.internal.report.p6;
import defpackage.e5b;
import defpackage.t7g;
import defpackage.uah;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class s extends androidx.core.app.n0 {
    public final Context b;
    public final com.yandex.passport.internal.flags.i c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, com.yandex.passport.internal.report.g gVar, com.yandex.passport.internal.flags.i iVar) {
        super(gVar);
        context.getClass();
        gVar.getClass();
        iVar.getClass();
        this.b = context;
        this.c = iVar;
    }

    @Override // androidx.core.app.n0
    public final boolean k() {
        com.yandex.passport.internal.flags.a aVar = com.yandex.passport.internal.flags.o.a;
        return ((Boolean) this.c.b(com.yandex.passport.internal.flags.o.z0)).booleanValue();
    }

    public final Map u() {
        try {
            InputStream open = this.b.getAssets().open("dependencies/dependencies.json");
            open.getClass();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open, Charsets.UTF_8), RemoteCameraConfig.Notification.ID);
            try {
                String F = t7g.F(bufferedReader);
                bufferedReader.close();
                JSONObject jSONObject = new JSONObject(F).getJSONObject("dependencies");
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    linkedHashMap.put(next, jSONObject.getString(next));
                }
                return linkedHashMap;
            } finally {
            }
        } catch (Exception e) {
            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.c, null, "DependenciesReporter::loadDependenciesInfo: " + e.getMessage(), e);
            }
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            return e5bVar;
        }
    }

    public final void v(long j) {
        Context context = this.b;
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
            applicationInfo.getClass();
            Pair pair = new Pair("dependencies", u());
            Pair pair2 = new Pair("target_sdk_version", String.valueOf(applicationInfo.targetSdkVersion));
            Pair pair3 = new Pair("min_sdk_version", String.valueOf(applicationInfo.minSdkVersion));
            Pair pair4 = new Pair("compile_sdk_version", String.valueOf(Build.VERSION.SDK_INT >= 31 ? Integer.valueOf(applicationInfo.compileSdkVersion) : null));
            Pair pair5 = new Pair("version_code", String.valueOf(j));
            String str = "unknown";
            try {
                String str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                if (str2 != null) {
                    str = str2;
                }
            } catch (Exception unused) {
            }
            l(p6.d, uah.e(pair, pair2, pair3, pair4, pair5, new Pair("version_name", str)));
        } catch (Exception e) {
            com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.c, null, "DependenciesReporter::reportDependencies: " + e.getMessage(), e);
            }
        }
    }
}
