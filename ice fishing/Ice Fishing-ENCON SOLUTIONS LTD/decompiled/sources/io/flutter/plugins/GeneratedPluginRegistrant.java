package io.flutter.plugins;

import G0.c;
import I0.a;
import android.util.Log;
import androidx.annotation.Keep;
import f1.C0161L;
import io.appmetrica.analytics.flutter.AppMetricaPlugin;
import io.flutter.embedding.engine.FlutterEngine;

@Keep
/* loaded from: classes.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(FlutterEngine flutterEngine) {
        try {
            flutterEngine.f7709d.a(new AppMetricaPlugin());
        } catch (Exception e2) {
            Log.e(TAG, "Error registering plugin appmetrica_plugin, io.appmetrica.analytics.flutter.AppMetricaPlugin", e2);
        }
        try {
            flutterEngine.f7709d.a(new a());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e3);
        }
        try {
            flutterEngine.f7709d.a(new C0161L());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e4);
        }
        try {
            flutterEngine.f7709d.a(new c());
        } catch (Exception e5) {
            Log.e(TAG, "Error registering plugin varioqub_plugin, com.yandex.varioqub.flutter.VarioqubPlugin", e5);
        }
    }
}
