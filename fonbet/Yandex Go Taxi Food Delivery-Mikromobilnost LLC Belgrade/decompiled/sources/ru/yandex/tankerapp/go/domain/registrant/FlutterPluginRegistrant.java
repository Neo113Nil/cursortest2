package ru.yandex.tankerapp.go.domain.registrant;

import android.util.Log;
import com.github.dart_lang.jni.JniPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import defpackage.abj;
import defpackage.bh21;
import defpackage.e8x0;
import defpackage.em51;
import defpackage.f8x0;
import defpackage.h8x0;
import defpackage.lkr0;
import defpackage.nrr;
import defpackage.nya0;
import defpackage.oj51;
import defpackage.pj51;
import defpackage.ywt0;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.pathprovider.d;
import io.flutter.plugins.sharedpreferences.g;

/* loaded from: classes15.dex */
public final class FlutterPluginRegistrant {
    private static final String TAG = "PluginRegistrant";

    public static void nonUiPluginsRegisterWith(FlutterEngine flutterEngine) {
        try {
            flutterEngine.d.f(new abj());
        } catch (Exception e) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e);
        }
        try {
            flutterEngine.d.f(new d());
        } catch (Exception e2) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e2);
        }
        try {
            flutterEngine.d.f(new g());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e3);
        }
        try {
            flutterEngine.d.f(new ywt0());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e4);
        }
        try {
            flutterEngine.d.f(new oj51());
        } catch (Exception e5) {
            Log.e(TAG, "Error registering plugin yx_logger, ru.yandex.yx_logger.YXLoggerPlugin", e5);
        }
        try {
            flutterEngine.d.f(new pj51());
        } catch (Exception e6) {
            Log.e(TAG, "Error registering plugin yx_system_proxy, com.example.yx_system_proxy.YXSystemProxyPlugin", e6);
        }
    }

    public static void registerWith(FlutterEngine flutterEngine) {
        try {
            flutterEngine.d.f(new abj());
        } catch (Exception e) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e);
        }
        try {
            flutterEngine.d.f(new nrr());
        } catch (Exception e2) {
            Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e2);
        }
        try {
            flutterEngine.d.f(new em51());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin flutter_yandex_mapkit, ru.yandextaxi.flutter_yandex_mapkit.YandexMapKitPlugin", e3);
        }
        try {
            flutterEngine.d.f(new JniPlugin());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin jni, com.github.dart_lang.jni.JniPlugin", e4);
        }
        try {
            flutterEngine.d.f(new d());
        } catch (Exception e5) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e5);
        }
        try {
            flutterEngine.d.f(new nya0());
        } catch (Exception e6) {
            Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e6);
        }
        try {
            flutterEngine.d.f(new lkr0());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e7);
        }
        try {
            flutterEngine.d.f(new g());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e8);
        }
        try {
            flutterEngine.d.f(new ywt0());
        } catch (Exception e9) {
            Log.e(TAG, "Error registering plugin sqflite, com.tekartik.sqflite.SqflitePlugin", e9);
        }
        try {
            flutterEngine.d.f(new e8x0());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin tanker_geocoding, ru.yandex.tankerapp.geocoding.TankerGeocodingPlugin", e10);
        }
        try {
            flutterEngine.d.f(new f8x0());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin tanker_go_sdk, ru.yandex.tankerapp.go.TankerGoSdkPlugin", e11);
        }
        try {
            flutterEngine.d.f(new h8x0());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin tanker_native_payment_manager, ru.yandex.tankerapp.TankerPaymentManagerPlugin", e12);
        }
        try {
            flutterEngine.d.f(new bh21());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e13);
        }
        try {
            flutterEngine.d.f(new InAppWebViewFlutterPlugin());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin yx_fork_flutter_inappwebview, com.pichillilorenzo.flutter_inappwebview.InAppWebViewFlutterPlugin", e14);
        }
        try {
            flutterEngine.d.f(new oj51());
        } catch (Exception e15) {
            Log.e(TAG, "Error registering plugin yx_logger, ru.yandex.yx_logger.YXLoggerPlugin", e15);
        }
        try {
            flutterEngine.d.f(new pj51());
        } catch (Exception e16) {
            Log.e(TAG, "Error registering plugin yx_system_proxy, com.example.yx_system_proxy.YXSystemProxyPlugin", e16);
        }
    }
}
