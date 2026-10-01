# Cloaking hints — Ice Fishing (UHG GROUP LTD)

- Play title «Ice Fishing» ≠ APK application-label «Ice Skating»; package `uhggroup.iceskating.app`
- Play listing talks about slots/RTP/login/bonus; APK is a local luggage catalog (Compose)
- LAUNCHER: `uhggroup.iceskating.app.MainActivity` (ComponentActivity + Compose)
- Application: `com.pairip.application.Application.attachBaseContext` → `LicenseClient.checkLicense` (Google Play licensing only)
- ICSApplication.onCreate: Koin modules (Data/View/Dispatcher) only
- Splash: DataStore `onboarding_prefs` / `onboardedState` → onboarding or home catalog (no offer URL)
- Products hardcoded in ProductRepository with imageUrl; Coil AsyncImage loads photos
- Image hosts: cdn.shopify.com, travelandleisure.com, i0.wp.com, amazon/wired/manofmany/rockluggage/onyxjourney/themarket
- `config.ru` = splits0.xml language split (`split="config.ru"`), not a network host
- mindgate.top not present in dex/resources
- No android.webkit.WebView, CustomTabsIntent, HttpURLConnection/OkHttp in first-party
- INTERNET used by Coil for catalog photos + PairIP to Play; no ads/analytics/remote config
- Prefs: DataStore onboardedState; Room ics_db cart/orders
- ics_customer_support_link is empty
- Cloaking = нет: no offer/white traffic fork
