# Cloaking hints — Ice Fishing (usan-code)

- Play / карточка: «Ice Fishing»; APK application-label: «Ice Fishing Drift»; package `com.icefishingdrift.app`
- Application: `IceFishingDriftApp.onCreate` → OneSignal.initWithContext (`b8412f8e-c530-4cbc-9f15-7e7ab56db855`)
- LAUNCHER: `MainActivity` → Compose n01, POST_NOTIFICATIONS, soundManager
- Splash `lc1`: ping `https://www.google.com/generate_204` (до 3 раз, пауза 1500 мс)
- Gate `jc1`/`ec3`: POST JSON-массив из 4 RSA-OAEP строк на `https://twilight-mountain-9b34.nazarstrij152.workers.dev/`
  заголовок `fishing-x-drift` = зашифрованный WebSettings.getDefaultUserAgent
  поля: Firebase Installation ID (или два UUID), GAID, локальный UUID (onesignal_id), Firebase Analytics app instance id
- Ответ: trim + URLDecoder → DataStore `user_id`; OneSignal.login(onesignal_id)
- Навигация: loading → webview (`qj2.loadUrl("https://icefishingdrift.online?"+user_id)`), extra header `X-Requested-With` пустой
- `ft0` WebViewClient: jungleDomGuard JS; SSL proceed(); non-http → Intent.parseUri
- Custom Tabs — androidx.browser / OneSignal in-app; first-party оффер через WebView
- config.ru — языковой сплит splits0.xml; auroraoss.com в коде нет; com.icefishingdrift.app — имя пакета
- Cloak = да
