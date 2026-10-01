# Cloaking hints — Icebreaker Fishing (Solid Games)

- Play title «Icebreaker Fishing» = APK application-label «Icebreaker Fishing»; package `com.icebreaker.fishing` 0.1.6 (versionCode 16)
- First-party Java: only `com.icebreaker.fishing.R.java`. Game logic is Unity IL2CPP (`libil2cpp.so` + global-metadata.dat)
- LAUNCHER: `com.unity3d.player.UnityPlayerActivity` — onCreate creates UnityPlayer and shows the fishing game. No Application subclass
- Listed loadUrl hits (all SDK, not a traffic gate):
  - `bolts/WebViewAppLinkResolver.java` — Facebook Bolts App Links: hidden WebView runs javascript: extractor on already-downloaded HTML (`setNetworkAvailable(false)`), not an offer WebView
  - `com/apm/insight/MonitorCrash.java` / `ConfigManager.java` / `k/e.java` — ByteDance APM crash upload URL setters (`setJavaCrashUploadUrl`), substring match on loadUrl, not WebView
  - `sg/bigo/ads/core/landing/WebViewActivityImpl.java` — Bigo Ads click landing WebView (`shouldOverrideUrlLoading` / `loadUrl` for ad click-through)
  - `io/bidmachine/iab/mraid/MraidWebViewController.java` + `MraidWebView.java` — BidMachine MRAID ad WebView (`loadUrl` of ad HTML / `javascript:` / `mraid://` commands)
- `gatewayprotocol.v1.WebviewConfiguration` — Unity Ads protobuf, not first-party cloaking
- `GameAnalytics IRemoteConfigsListener` / `Singular SLRemoteConfiguration` / Firebase Remote Config — SDK A/B and attribution, no offer/white fork in Java
- Custom Tabs: Facebook `CustomTabActivity` + androidx.browser 1.8.0 + manifest queries; used by ads/Facebook, not a first-party offer browser
- 123.com = InMobi dummy `https://www.123.com`; OSS hosts = Bigo Ads backup `uni/v2/au.pj`; adsbigo.com = Bigo privacy URL
- Cloaking = нет: ordinary Unity idle fishing game + MAX mediation. No silent gate, no Play≠label white wrapper, no first-party offer URL
