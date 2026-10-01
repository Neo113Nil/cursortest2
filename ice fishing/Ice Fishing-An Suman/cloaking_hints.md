# Cloaking hints — Ice Fishing (An Suman)

- LAUNCHER: `com.icefishing.icefishing4.SplashActivity` → parent `adscode.ApplinkActivity`
- Gate URL (hardcoded): `https://raw.githubusercontent.com/smtpatel9211/PandyaTech/refs/heads/main/com.icefishing.icefishing4`
- Volley GET, body/query empty; package name is in the URL path
- Response saved to SharedPreferences `MyPref` key `response`
- Parsed: `splash_redirect`, `splash_link_all`, `link1`, `link2`, `link3`, TopOn/AdMob/Facebook ids
- Offer open: `o4.l.g()` Custom Tabs Chrome, random of link1–3; fallback `ACTION_VIEW`
- Live config: `splash_redirect=1`, links to criczop / astrozop / 11483.play.gamezop.com
- White: IntroActivity / StartActivity / MainActivity; Gamezop HTML5 in `MWebActivity.loadUrl(web_url)`
- First-party scan hit: `MWebActivity.java` · loadUrl — not disproven as WebView after check (games + remote links)
