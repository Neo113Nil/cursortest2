# Cloaking hints — Ice Winner Fishing (Abide publishing)

- Play / APK-label совпадают: «Ice Winner Fishing»; package `com.devsisters.cook`
- Application: `com.pairip.application.Application` → LicenseClient.checkLicense → `MyApplication`
- LAUNCHER: `com.devsisters.cook.app.MainActivity` (Compose: InitialScreen / MenuScreen / GameScreen)
- InitialScreen (`r5.c`) помечен `@s5.a` `@s5.b` `@s5.c`:
  - `@s5.b` — ждать сеть (сокет на 8.8.8.8:53, 1500 мс), затем `initNativeDatastore(filesDir)`
  - `@s5.c` — показать встроенное окно сайта поверх стартового экрана
  - `@s5.a` — если нативное хранилище уже готово, сразу MenuScreen
- URL во встроенное окно грузит натив `libnative.so`: `apply_hardware_layer` / `g_pending_url` (Java `loadUrl` нет)
- `j6.a.shouldOverrideUrlLoading`: префиксы из `NativeStoreManager.getExceptions()`; facebook.com / fb.com / fb.me → приложение Facebook; иначе ACTION_VIEW
- HTTP 403 в WebViewClient → `onPolicy` → скрыть окно и открыть MenuScreen (белая)
- Успешный `onPageCommitVisible` (1 с) → `applyHardwareLayer(null, url)` → оставить встроенное окно (оффер)
- Натив: AES (CBC/ECB/CTR), nlohmann JSON, `post` / `perform`, `af_init` / `af_get_uid`; адрес проверки в открытом виде не виден
- Custom Tabs — только OneSignal in-app; first-party оффер через WebView
- config.ru — языковой сплит `splits0.xml`, не хост проверки
- fb.com — обработка deeplink Facebook во WebViewClient, не gate
- Cloak = да
