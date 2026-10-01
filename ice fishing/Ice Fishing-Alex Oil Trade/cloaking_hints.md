# Cloaking hints — Ice Fishing (Alex Oil Trade)

- Play title = APK application-label = «Ice Fishing»; package `com.battletank.stormwar`
- In-game Flutter strings: «Battle Tank Storm» (tank arcade), not a fishing UI
- LAUNCHER: `com.battletank.stormwar.MainActivity` extends obfuscated FlutterActivity (`e0.AbstractActivityC0107f`)
- Application: `com.pairip.application.Application.attachBaseContext` → `LicenseClient.checkLicense` (Google Play licensing only, `com.android.vending`)
- Plugins: only `shared_preferences_android` (GeneratedPluginRegistrant)
- No android.webkit.WebView, CustomTabsIntent, HttpURLConnection, OkHttp, url_launcher
- INTERNET present; no first-party HTTP to a custom host; dart:_http is Flutter SDK only
- Custom Tabs query in manifest is Flutter embedding template leftover (androidx.browser 1.8.0 unused)
- Prefs keys: tank_sound / tank_music / tank_haptics / tank_selected / tank_control / tank_difficulty / tank_best_* / tank_total_* / tank_victories / tank_longest_run
- config.ru = splits0.xml language split; dispatchers.io = Kotlin Dispatchers.IO; systemuioverlay.top = SystemChrome.setSystemUIOverlayStyle
- Cloaking = нет: no offer/white traffic fork; Play name matches APK label
