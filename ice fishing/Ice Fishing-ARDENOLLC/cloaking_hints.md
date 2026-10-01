# Cloaking hints — Ice Fishing (ARDENOLLC)

- Play «Ice Fishing» ≠ application-label «Frost Kintsugi» (белая оболочка по названию)
- LAUNCHER: `com.kolosta.rejin.tarlyons.MainActivity` (ComponentActivity + Compose)
- Application: `com.pairip.application.Application` → LicenseClient.checkLicense → только Google Play (`com.android.vending`)
- Нет INTERNET, WebView, Custom Tabs, OkHttp, HttpURLConnection, ACTION_VIEW
- Локальные экраны: TABLE / STACK / PLAY / REVEAL / CABINET
- DataStore `kintsugiStore`: unlocked_tray, lacquer_drops, perfect_trays, resin_tints, equipped_tint, cabinet_boards
- config.ru — языковой сплит splits0.xml, не хост
- theme.app — ложное срабатывание стиля Theme.App, DNS не резолвится
- Cloak = нет (ребрендинг без фильтрации трафика)
