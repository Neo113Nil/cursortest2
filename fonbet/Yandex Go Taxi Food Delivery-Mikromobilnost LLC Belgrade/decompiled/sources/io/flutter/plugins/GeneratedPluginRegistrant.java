package io.flutter.plugins;

import android.util.Log;
import com.cloudwebrtc.webrtc.FlutterWebRTCPlugin;
import com.github.dart_lang.jni.JniPlugin;
import com.lib.flutter_blue_plus.FlutterBluePlusPlugin;
import com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin;
import com.ryanheise.audio_session.b;
import com.yandex.mobile.drive.account_manager.a;
import com.yandex.mobile.drive.sdk.map.MapMobileSdkPlugin;
import defpackage.abj;
import defpackage.ax2;
import defpackage.b9v;
import defpackage.bh21;
import defpackage.dm00;
import defpackage.e8x0;
import defpackage.em51;
import defpackage.f8x0;
import defpackage.h8x0;
import defpackage.ihb0;
import defpackage.ira0;
import defpackage.jfm;
import defpackage.kv51;
import defpackage.lkr0;
import defpackage.mfm;
import defpackage.nl7;
import defpackage.nrr;
import defpackage.nrs;
import defpackage.nya0;
import defpackage.oj51;
import defpackage.oo7;
import defpackage.pj51;
import defpackage.pvc0;
import defpackage.sbr;
import defpackage.shm;
import defpackage.sk31;
import defpackage.ul7;
import defpackage.vp41;
import defpackage.yf5;
import defpackage.ywt0;
import defpackage.zcm;
import defpackage.zsr;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.plugins.imagepicker.ImagePickerPlugin;
import io.flutter.plugins.pathprovider.d;
import io.flutter.plugins.sharedpreferences.g;
import io.flutter.plugins.videoplayer.c;

/* loaded from: classes15.dex */
public final class GeneratedPluginRegistrant {
    private static final String TAG = "GeneratedPluginRegistrant";

    public static void registerWith(FlutterEngine flutterEngine) {
        try {
            flutterEngine.d.f(new ax2());
        } catch (Exception e) {
            Log.e(TAG, "Error registering plugin app_settings, com.spencerccf.app_settings.AppSettingsPlugin", e);
        }
        try {
            flutterEngine.d.f(new b());
        } catch (Exception e2) {
            Log.e(TAG, "Error registering plugin audio_session, com.ryanheise.audio_session.AudioSessionPlugin", e2);
        }
        try {
            flutterEngine.d.f(new yf5());
        } catch (Exception e3) {
            Log.e(TAG, "Error registering plugin battery_plus, dev.fluttercommunity.plus.battery.BatteryPlusPlugin", e3);
        }
        try {
            flutterEngine.d.f(new ul7());
        } catch (Exception e4) {
            Log.e(TAG, "Error registering plugin calls, ru.yandex.in_app_calls.calls.CallsPlugin", e4);
        }
        try {
            flutterEngine.d.f(new nl7());
        } catch (Exception e5) {
            Log.e(TAG, "Error registering plugin calls_go, com.yandex.voip_calls.calls_go.CallsGoPlugin", e5);
        }
        try {
            flutterEngine.d.f(new oo7());
        } catch (Exception e6) {
            Log.e(TAG, "Error registering plugin camera_android_camerax, io.flutter.plugins.camerax.CameraAndroidCameraxPlugin", e6);
        }
        try {
            flutterEngine.d.f(new h8x0());
        } catch (Exception e7) {
            Log.e(TAG, "Error registering plugin car_tech_payment_sdk_android, ru.yandex.tankerapp.TankerPaymentManagerPlugin", e7);
        }
        try {
            flutterEngine.d.f(new abj());
        } catch (Exception e8) {
            Log.e(TAG, "Error registering plugin device_info_plus, dev.fluttercommunity.plus.device_info.DeviceInfoPlusPlugin", e8);
        }
        try {
            flutterEngine.d.f(new a());
        } catch (Exception e9) {
            Log.e(TAG, "Error registering plugin drive_account_manager_go, com.yandex.mobile.drive.account_manager.DriveSdkAccountManagerPlugin", e9);
        }
        try {
            flutterEngine.d.f(new com.yandex.mobile.drive.analytics.a());
        } catch (Exception e10) {
            Log.e(TAG, "Error registering plugin drive_analytics_go, com.yandex.mobile.drive.analytics.SdkAnalyticsMobilePlugin", e10);
        }
        try {
            flutterEngine.d.f(new jfm());
        } catch (Exception e11) {
            Log.e(TAG, "Error registering plugin drive_bank_go, com.yandex.mobile.drive.bank.DriveSdkBankPlugin", e11);
        }
        try {
            flutterEngine.d.f(new zcm());
        } catch (Exception e12) {
            Log.e(TAG, "Error registering plugin drive_camera_type_detector, com.yandex.drive.drive_camera_type_detector.DriveCameraTypeDetectorPlugin", e12);
        }
        try {
            flutterEngine.d.f(new com.yandex.mobile.drive.map.geocoder.a());
        } catch (Exception e13) {
            Log.e(TAG, "Error registering plugin drive_map_geocoder_go, com.yandex.mobile.drive.map.geocoder.MapGeocoderGoPlugin", e13);
        }
        try {
            flutterEngine.d.f(new dm00());
        } catch (Exception e14) {
            Log.e(TAG, "Error registering plugin drive_map_mobile_core, com.yandex.mobile.drive.map.MapMobileCorePlugin", e14);
        }
        try {
            flutterEngine.d.f(new MapMobileSdkPlugin());
        } catch (Exception e15) {
            Log.e(TAG, "Error registering plugin drive_map_mobile_sdk, com.yandex.mobile.drive.sdk.map.MapMobileSdkPlugin", e15);
        }
        try {
            flutterEngine.d.f(new com.yandex.mobile.drive.drive_media_tools.a());
        } catch (Exception e16) {
            Log.e(TAG, "Error registering plugin drive_media_tools, com.yandex.mobile.drive.drive_media_tools.DriveMediaToolsPlugin", e16);
        }
        try {
            flutterEngine.d.f(new com.yandex.mobile.drive.drive_native_features.b());
        } catch (Exception e17) {
            Log.e(TAG, "Error registering plugin drive_native_features, com.yandex.mobile.drive.drive_native_features.DriveNativeFeaturesPlugin", e17);
        }
        try {
            flutterEngine.d.f(new pvc0());
        } catch (Exception e18) {
            Log.e(TAG, "Error registering plugin drive_platform_integration_mobile, com.yandex.mobile.drive.platform.PlatformIntegrationAndroid", e18);
        }
        try {
            flutterEngine.d.f(new mfm());
        } catch (Exception e19) {
            Log.e(TAG, "Error registering plugin drive_sdk_go, com.yandex.mobile.drive.sdk.DriveSdkGoPlugin", e19);
        }
        try {
            flutterEngine.d.f(new shm());
        } catch (Exception e20) {
            Log.e(TAG, "Error registering plugin drive_wallet_go, com.yandex.mobile.drive.wallet.DriveWalletGoPlugin", e20);
        }
        try {
            flutterEngine.d.f(new sbr());
        } catch (Exception e21) {
            Log.e(TAG, "Error registering plugin fintech_sdk_interface, ru.yandex.tankerapp.fintech.FintechSdkInterfacePlugin", e21);
        }
        try {
            flutterEngine.d.f(new FlutterBluePlusPlugin());
        } catch (Exception e22) {
            Log.e(TAG, "Error registering plugin flutter_blue_plus_android, com.lib.flutter_blue_plus.FlutterBluePlusPlugin", e22);
        }
        try {
            flutterEngine.d.f(new b9v());
        } catch (Exception e23) {
            Log.e(TAG, "Error registering plugin flutter_image_compress_common, com.fluttercandies.flutter_image_compress.ImageCompressPlugin", e23);
        }
        try {
            flutterEngine.d.f(new nrr());
        } catch (Exception e24) {
            Log.e(TAG, "Error registering plugin flutter_plugin_android_lifecycle, io.flutter.plugins.flutter_plugin_android_lifecycle.FlutterAndroidLifecyclePlugin", e24);
        }
        try {
            flutterEngine.d.f(new zsr());
        } catch (Exception e25) {
            Log.e(TAG, "Error registering plugin flutter_ringtone_player, io.inway.ringtone.player.FlutterRingtonePlayerPlugin", e25);
        }
        try {
            flutterEngine.d.f(new FlutterWebRTCPlugin());
        } catch (Exception e26) {
            Log.e(TAG, "Error registering plugin flutter_webrtc, com.cloudwebrtc.webrtc.FlutterWebRTCPlugin", e26);
        }
        try {
            flutterEngine.d.f(new em51());
        } catch (Exception e27) {
            Log.e(TAG, "Error registering plugin flutter_yandex_mapkit, ru.yandextaxi.flutter_yandex_mapkit.YandexMapKitPlugin", e27);
        }
        try {
            flutterEngine.d.f(new nrs());
        } catch (Exception e28) {
            Log.e(TAG, "Error registering plugin gal, studio.midoridesign.gal.GalPlugin", e28);
        }
        try {
            flutterEngine.d.f(new ImagePickerPlugin());
        } catch (Exception e29) {
            Log.e(TAG, "Error registering plugin image_picker_android, io.flutter.plugins.imagepicker.ImagePickerPlugin", e29);
        }
        try {
            flutterEngine.d.f(new JniPlugin());
        } catch (Exception e30) {
            Log.e(TAG, "Error registering plugin jni, com.github.dart_lang.jni.JniPlugin", e30);
        }
        try {
            flutterEngine.d.f(new d());
        } catch (Exception e31) {
            Log.e(TAG, "Error registering plugin path_provider_android, io.flutter.plugins.pathprovider.PathProviderPlugin", e31);
        }
        try {
            flutterEngine.d.f(new ira0());
        } catch (Exception e32) {
            Log.e(TAG, "Error registering plugin pdfx, io.scer.pdfx.PdfxPlugin", e32);
        }
        try {
            flutterEngine.d.f(new nya0());
        } catch (Exception e33) {
            Log.e(TAG, "Error registering plugin permission_handler_android, com.baseflow.permissionhandler.PermissionHandlerPlugin", e33);
        }
        try {
            flutterEngine.d.f(new ihb0());
        } catch (Exception e34) {
            Log.e(TAG, "Error registering plugin photo_manager, com.fluttercandies.photo_manager.PhotoManagerPlugin", e34);
        }
        try {
            flutterEngine.d.f(new lkr0());
        } catch (Exception e35) {
            Log.e(TAG, "Error registering plugin share_plus, dev.fluttercommunity.plus.share.SharePlusPlugin", e35);
        }
        try {
            flutterEngine.d.f(new g());
        } catch (Exception e36) {
            Log.e(TAG, "Error registering plugin shared_preferences_android, io.flutter.plugins.sharedpreferences.SharedPreferencesPlugin", e36);
        }
        try {
            flutterEngine.d.f(new ywt0());
        } catch (Exception e37) {
            Log.e(TAG, "Error registering plugin sqflite_android, com.tekartik.sqflite.SqflitePlugin", e37);
        }
        try {
            flutterEngine.d.f(new e8x0());
        } catch (Exception e38) {
            Log.e(TAG, "Error registering plugin tanker_geocoding, ru.yandex.tankerapp.geocoding.TankerGeocodingPlugin", e38);
        }
        try {
            flutterEngine.d.f(new f8x0());
        } catch (Exception e39) {
            Log.e(TAG, "Error registering plugin tanker_go_sdk, ru.yandex.tankerapp.go.TankerGoSdkPlugin", e39);
        }
        try {
            flutterEngine.d.f(new bh21());
        } catch (Exception e40) {
            Log.e(TAG, "Error registering plugin url_launcher_android, io.flutter.plugins.urllauncher.UrlLauncherPlugin", e40);
        }
        try {
            flutterEngine.d.f(new sk31());
        } catch (Exception e41) {
            Log.e(TAG, "Error registering plugin vibration, com.benjaminabel.vibration.VibrationPlugin", e41);
        }
        try {
            flutterEngine.d.f(new c());
        } catch (Exception e42) {
            Log.e(TAG, "Error registering plugin video_player_android, io.flutter.plugins.videoplayer.VideoPlayerPlugin", e42);
        }
        try {
            flutterEngine.d.f(new vp41());
        } catch (Exception e43) {
            Log.e(TAG, "Error registering plugin webview_flutter_android, io.flutter.plugins.webviewflutter.WebViewFlutterPlugin", e43);
        }
        try {
            flutterEngine.d.f(new kv51());
        } catch (Exception e44) {
            Log.e(TAG, "Error registering plugin yb_sdk_adapter, ru.yandex.tankerapp.yb.YbSdkAdapterPlugin", e44);
        }
        try {
            flutterEngine.d.f(new InAppWebViewFlutterPlugin());
        } catch (Exception e45) {
            Log.e(TAG, "Error registering plugin yx_fork_flutter_inappwebview_android, com.pichillilorenzo.flutter_inappwebview_android.InAppWebViewFlutterPlugin", e45);
        }
        try {
            flutterEngine.d.f(new oj51());
        } catch (Exception e46) {
            Log.e(TAG, "Error registering plugin yx_logger, ru.yandex.yx_logger.YXLoggerPlugin", e46);
        }
        try {
            flutterEngine.d.f(new ru.yandex.yx_platform_api.d());
        } catch (Exception e47) {
            Log.e(TAG, "Error registering plugin yx_platform_api, ru.yandex.yx_platform_api.YxPlatformApiPlugin", e47);
        }
        try {
            flutterEngine.d.f(new pj51());
        } catch (Exception e48) {
            Log.e(TAG, "Error registering plugin yx_system_proxy, com.example.yx_system_proxy.YXSystemProxyPlugin", e48);
        }
    }
}
