# Cloaking hints — Ice Fishing (Iсe Fishing Value)

- LAUNCHER: `com.ice.fishing.hagopal.bluefarets.PerchActivity` (React Native, component `PlumeBirdJournal`)
- Application: `com.pairip.application.Application` (Play Integrity / license)
- White shell: Play/APK label «Ice Fishing», внутри журнал «Plume Bird Journal»
- Gate: `PlumeGate.decide()` сразу после запуска (пока `PlumePending` / BrandSplash)
- Локальный фильтр: `PlumeTerrain.isSynthetic()` — isEmulator + model/brand/manufacturer/product/fingerprint/hardware
  (generic, emulator, sdk_gphone, goldfish, ranchu, vbox, genymotion, sdk, android sdk built for)
- Идентификатор: `PlumeTrace.read()` = sha256(androidId + bundleId) в виде uuid
- URL и имена полей XOR+Base64 в `PlumeReserve.at()`:
  0 = `https://bluefarets.space/status/ping/`
  1 = `uuid`
  2 = `saved_endpoint`
  3 = `synced_at`
- Запрос: GET, query `uuid`, headers `Accept: application/json`, `User-Agent` (зашит Xiaomi M2101K6G / Chrome 123)
- Ответ: JSON `result.data.uri`, `result.data.sync`; HTTP 200–299; пустой uri → белая
- Сохранение: AsyncStorage `settings_data`, ключи `saved_endpoint` / `synced_at`, значения через `_cloak` (XOR veil)
- Оффер: `PlumePageScreen` → RNC WebView `source.uri` с сервера; `__linkGuard` JS; `PlumeBridge.openExternal` / `httpDownload`
- Белая: `PlumeHome` / AppRoot (журнал птиц)
- RNCWebView loadUrl / shouldOverrideUrlLoading — SDK react-native-webview, вызывается ПОСЛЕ gate с URL с сервера
- `config.ru` в splits0.xml — языковой split Android, не хост
