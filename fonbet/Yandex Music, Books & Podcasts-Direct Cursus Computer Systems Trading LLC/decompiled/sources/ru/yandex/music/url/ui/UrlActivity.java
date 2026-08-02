package ru.yandex.music.url.ui;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.internal.k;
import com.yandex.metrica.push.YandexMetricaPush;
import defpackage.a8p;
import defpackage.b6e;
import defpackage.b8p;
import defpackage.btf;
import defpackage.buo;
import defpackage.cg6;
import defpackage.cnf;
import defpackage.cuo;
import defpackage.cx0;
import defpackage.duo;
import defpackage.e5b;
import defpackage.eqt;
import defpackage.f2c;
import defpackage.fqt;
import defpackage.frc;
import defpackage.fzk;
import defpackage.g2c;
import defpackage.gfo;
import defpackage.hag;
import defpackage.ih7;
import defpackage.jfb;
import defpackage.jyr;
import defpackage.k5r;
import defpackage.kii;
import defpackage.l18;
import defpackage.le3;
import defpackage.lg3;
import defpackage.mh7;
import defpackage.mpt;
import defpackage.nm6;
import defpackage.nmb;
import defpackage.np2;
import defpackage.npt;
import defpackage.o5g;
import defpackage.o5j;
import defpackage.opt;
import defpackage.ou0;
import defpackage.ouj;
import defpackage.qgg;
import defpackage.qkb;
import defpackage.r20;
import defpackage.rn6;
import defpackage.rpt;
import defpackage.saf;
import defpackage.sj2;
import defpackage.ssg;
import defpackage.tah;
import defpackage.tyf;
import defpackage.v5g;
import defpackage.v75;
import defpackage.vz1;
import defpackage.w6n;
import defpackage.w90;
import defpackage.wfs;
import defpackage.wjb;
import defpackage.wyf;
import defpackage.x6n;
import defpackage.x97;
import defpackage.xal;
import defpackage.xq0;
import defpackage.y48;
import defpackage.ypt;
import defpackage.yu0;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;
import ru.yandex.music.ui.view.YaRotatingProgress;
import ru.yandex.music.utils.Assertions;
import ru.yandex.music.utils.Preconditions;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class UrlActivity extends np2 implements y48 {
    public static final /* synthetic */ int C = 0;
    public final jyr A = btf.b(new wfs(13, this));
    public final jyr B = l18.b.b(hag.I(mh7.class), true);
    public View v;
    public YaRotatingProgress w;
    public Uri x;
    public Intent y;
    public boolean z;

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|26|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0029, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        r6.A(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0027, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r6.A(r7);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y(UrlActivity urlActivity, ypt yptVar, cg6 cg6Var) {
        mpt mptVar;
        int i;
        if (cg6Var instanceof mpt) {
            mptVar = (mpt) cg6Var;
            int i2 = mptVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mptVar.l = i2 - Integer.MIN_VALUE;
                Object obj = mptVar.j;
                nm6 nm6Var = nm6.a;
                i = mptVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    fzk fzkVar = fzk.a;
                    w90 w90Var = new w90(urlActivity, yptVar, null, 18);
                    mptVar.l = 1;
                    Object f = fzkVar.f(yptVar, w90Var, mptVar);
                    urlActivity = f;
                    if (f == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    urlActivity = urlActivity;
                }
                return Unit.a;
            }
        }
        mptVar = new mpt(urlActivity, cg6Var);
        Object obj2 = mptVar.j;
        nm6 nm6Var2 = nm6.a;
        i = mptVar.l;
        if (i != 0) {
        }
        return Unit.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object z(UrlActivity urlActivity, ypt yptVar, cg6 cg6Var) {
        opt optVar;
        int i;
        ypt yptVar2;
        if (cg6Var instanceof opt) {
            optVar = (opt) cg6Var;
            int i2 = optVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                optVar.l = i2 - Integer.MIN_VALUE;
                Object obj = optVar.j;
                Object obj2 = nm6.a;
                i = optVar.l;
                if (i != 0) {
                    qgg.h0(obj);
                    if (!(yptVar instanceof cx0)) {
                        return new cuo(yptVar, buo.b);
                    }
                    AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
                    appsFlyerLib.getClass();
                    optVar.l = 1;
                    obj = sj2.E(appsFlyerLib, optVar);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                yptVar2 = (ypt) obj;
                if (yptVar2 == null) {
                    return new cuo(yptVar2, buo.a);
                }
                xq0.x("Error processing AppsFlyer intent");
                return null;
            }
        }
        optVar = new opt(urlActivity, cg6Var);
        Object obj3 = optVar.j;
        Object obj22 = nm6.a;
        i = optVar.l;
        if (i != 0) {
        }
        yptVar2 = (ypt) obj3;
        if (yptVar2 == null) {
        }
    }

    public final void A(RuntimeException runtimeException) {
        this.x = null;
        Intent intent = this.y;
        Uri data = intent != null ? intent.getData() : null;
        Intent intent2 = this.y;
        ssg.a(6, null, "Extras = " + (intent2 != null ? intent2.getExtras() : null), null);
        ssg.a(7, "UrlActivity", "failed to navigate to scheme, uri = " + data, runtimeException);
        f2c f2cVar = (f2c) this.A.getValue();
        String valueOf = String.valueOf(data);
        f2cVar.getClass();
        nmb nmbVar = f2cVar.b;
        qkb qkbVar = qkb.ExternalLaunch;
        String G = f2cVar.a.G();
        wjb wjbVar = wjb.Link;
        nmb.y(nmbVar, qkbVar, qkbVar, G, wjbVar, null, null, null, null, null, wjbVar, wjb.PageNotFoundScreen, valueOf, 4080);
        Intent z = StubActivity.z(this, rpt.NOT_FOUND);
        z.getClass();
        B(z, false);
    }

    public final void B(Intent intent, boolean z) {
        ssg.a(3, "UrlActivity", "navigate: " + intent, null);
        if (!z) {
            intent.getClass();
            Bundle extras = intent.getExtras();
            if ((extras != null ? extras.get("extra.playbackScope") : null) == null) {
                intent.putExtra("extra.playbackScope", r());
            }
            Bundle bundleExtra = getIntent().getBundleExtra("extra.bundle.params");
            if (bundleExtra != null) {
                intent.putExtras(bundleExtra);
            }
        }
        intent.addFlags(268435456);
        intent.putExtra("extraFromUrlScheme", true);
        this.y = intent;
        startActivity(intent);
        finish();
        overridePendingTransition(0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00da, code lost:
    
        if (kotlin.text.c.o(r9.getAuthority(), "plus-home-sdk", true) != false) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void C(Intent intent) {
        ypt yptVar;
        String str;
        Map map;
        Object obj = intent.getPackage();
        if (obj == null && (obj = getCallingPackage()) == null) {
            obj = getReferrer();
        }
        Uri data = intent.getData();
        if (data != null && Intrinsics.d(this.x, data)) {
            ssg.a(5, "UrlActivity", "skip duplicated intent from " + obj + " to " + data, null);
            return;
        }
        int i = 0;
        if (!intent.getBooleanExtra("extraFromUrlScheme", false)) {
            AppMetrica.reportAppOpen(this);
        }
        o5g.H(intent);
        ssg.a(3, "UrlActivity", obj + " publishSchemeFrom: " + intent, null);
        boolean booleanExtra = intent.getBooleanExtra("extra.use.browser", true);
        if ("android.media.action.MEDIA_PLAY_FROM_SEARCH".equals(intent.getAction()) || ("com.google.android.gms.actions.SEARCH_ACTION".equals(intent.getAction()) && intent.hasExtra("query"))) {
            lg3.e0("URL_commonIntent", Collections.singletonMap(Constants.KEY_ACTION, intent.getAction()));
            r20 r20Var = new r20(1);
            yptVar = (b8p) r20Var.a(vz1.s(new StringBuilder(), ((a8p) r20Var.d).b, "?text=", intent.getStringExtra("query")), true);
        } else if (intent.getData() == null) {
            Assertions.fail("Invalid scheme: data is null");
            jfb.w0("Invalid scheme: data is null");
            yptVar = null;
        } else {
            Uri data2 = intent.getData();
            String uri = data2.toString();
            String host = data2.getHost();
            if (host != null) {
                if (!host.equalsIgnoreCase("CROWDTEST") && !host.equalsIgnoreCase("WEBVIEW")) {
                    String uri2 = data2.toString();
                    uri2.getClass();
                    Uri parse = Uri.parse(uri2);
                    parse.getClass();
                }
                boolean z = intent.hasExtra(YandexMetricaPush.EXTRA_PAYLOAD) && intent.getBooleanExtra("need_permission", true);
                HashMap r = k.r("url", uri);
                r.put("need_permissions", Boolean.valueOf(z));
                lg3.e0("URL_schemeEntered", r);
                jyr jyrVar = o5j.e;
                if (tyf.v()) {
                    ArrayList arrayList = ih7.a;
                    uri.getClass();
                    Iterator it = ih7.a.iterator();
                    while (it.hasNext()) {
                        duo duoVar = (duo) it.next();
                        Matcher matcher = duoVar.a.matcher(uri);
                        if (matcher.matches()) {
                            String replaceAll = matcher.replaceAll(duoVar.b);
                            replaceAll.getClass();
                            str = Uri.parse(replaceAll).buildUpon().clearQuery().fragment(null).build().toString();
                            str.getClass();
                            Uri parse2 = Uri.parse(uri);
                            String query = parse2.getQuery();
                            if (query == null || query.length() == 0) {
                                map = e5b.a;
                                map.getClass();
                            } else {
                                Set<String> queryParameterNames = parse2.getQueryParameterNames();
                                queryParameterNames.getClass();
                                Set<String> set = queryParameterNames;
                                int a = tah.a(v75.o(set, 10));
                                if (a < 16) {
                                    a = 16;
                                }
                                map = new LinkedHashMap(a);
                                for (Object obj2 : set) {
                                    String queryParameter = parse2.getQueryParameter((String) obj2);
                                    if (queryParameter == null) {
                                        queryParameter = "";
                                    }
                                    map.put(obj2, queryParameter);
                                }
                            }
                            v5g v5gVar = duoVar.c;
                            if (!(v5gVar instanceof x6n)) {
                                if (!(v5gVar instanceof w6n)) {
                                    b6e.s();
                                    return;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                for (Map.Entry entry : map.entrySet()) {
                                    if (!((w6n) v5gVar).a.contains((String) entry.getKey())) {
                                        linkedHashMap.put(entry.getKey(), entry.getValue());
                                    }
                                }
                                map = linkedHashMap;
                            }
                            if (!map.isEmpty()) {
                                str = ouj.o(str, "?", CollectionsKt.X(map.entrySet(), "&", null, null, new rn6(27), 30));
                            }
                            if (!uri.equals(str)) {
                                Timber.d("DeepLink Redirected: %s -> %s", uri, str);
                            }
                            if (booleanExtra) {
                                yptVar = fqt.a(str, z, intent.getBooleanExtra("extraFromUrlScheme", false));
                            } else {
                                boolean booleanExtra2 = intent.getBooleanExtra("extraFromUrlScheme", false);
                                Iterator it2 = fqt.a.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        eqt eqtVar = (eqt) it2.next();
                                        eqtVar.getClass();
                                        if (eqtVar.b(str)) {
                                            yptVar = eqtVar.a(str, z);
                                            break;
                                        }
                                    } else {
                                        yptVar = fqt.b(str) ? new g2c(str, booleanExtra2, false) : null;
                                    }
                                }
                            }
                            Timber.d("<%s> %s", str, yptVar);
                            if (yptVar == null) {
                                jfb.w0("Invalid scheme: " + intent.getData());
                            }
                        }
                    }
                }
                str = uri;
                if (!uri.equals(str)) {
                }
                if (booleanExtra) {
                }
                Timber.d("<%s> %s", str, yptVar);
                if (yptVar == null) {
                }
            }
            uri = hag.K(uri, true);
            if (intent.hasExtra(YandexMetricaPush.EXTRA_PAYLOAD)) {
            }
            HashMap r2 = k.r("url", uri);
            r2.put("need_permissions", Boolean.valueOf(z));
            lg3.e0("URL_schemeEntered", r2);
            jyr jyrVar2 = o5j.e;
            if (tyf.v()) {
            }
            str = uri;
            if (!uri.equals(str)) {
            }
            if (booleanExtra) {
            }
            Timber.d("<%s> %s", str, yptVar);
            if (yptVar == null) {
            }
        }
        if (yptVar == null) {
            A(new IllegalArgumentException("no valid scheme in intent"));
            return;
        }
        this.x = data;
        if (this.z) {
            if (cnf.d) {
                ssg.a(3, "LaunchDeeplinkTracker", "onDeeplinkLaunched: already captured, ignoring", null);
            } else {
                cnf.d = true;
                cnf.c = yptVar;
                ssg.a(3, "LaunchDeeplinkTracker", "onDeeplinkLaunched: captured scheme type=" + yptVar.getType(), null);
            }
        }
        View view = this.v;
        if (view == null) {
            Intrinsics.j("retryContainer");
            throw null;
        }
        view.setVisibility(8);
        YaRotatingProgress yaRotatingProgress = this.w;
        if (yaRotatingProgress == null) {
            Intrinsics.j("yaRotatingProgress");
            throw null;
        }
        yaRotatingProgress.d = false;
        yaRotatingProgress.removeCallbacks(yaRotatingProgress.f);
        if (!yaRotatingProgress.c) {
            yaRotatingProgress.b = -1L;
            yaRotatingProgress.c = true;
            yaRotatingProgress.postDelayed(yaRotatingProgress.e, 300L);
        }
        x97.y(wyf.F(getLifecycle()), null, null, new npt(this, yptVar, (Continuation) null, i), 3);
    }

    @Override // defpackage.gnb
    public final gfo j() {
        if (getIntent().hasExtra("global.key.evgen.meta")) {
            return null;
        }
        return gfo.Deeplink;
    }

    @Override // defpackage.np2
    public final boolean m() {
        return true;
    }

    @Override // defpackage.np2
    public final boolean n() {
        return true;
    }

    @Override // defpackage.np2, defpackage.gnb, androidx.fragment.app.t, defpackage.hn5, androidx.core.app.i, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z = false;
        overridePendingTransition(0, 0);
        if (frc.a.d.size() == 0 && bundle == null) {
            z = true;
        }
        this.z = z;
        k5r.v("onCreate, isColdStart=", z, 3, "UrlActivity", null);
        super.onCreate(bundle);
        le3 le3Var = this.d;
        if (le3Var != null) {
            ((kii) Preconditions.nonNull((kii) le3Var.a)).setVisibility(8);
        }
        View findViewById = findViewById(R.id.progress);
        findViewById.getClass();
        YaRotatingProgress yaRotatingProgress = (YaRotatingProgress) findViewById;
        this.w = yaRotatingProgress;
        yaRotatingProgress.setVisibility(8);
        View findViewById2 = findViewById(R.id.retry_container);
        findViewById2.getClass();
        this.v = findViewById2;
        findViewById(R.id.retry).setOnClickListener(new xal(13, this));
        if (bundle == null) {
            AppsFlyerLib.getInstance().start(this);
        }
    }

    @Override // defpackage.hn5, android.app.Activity
    public final void onNewIntent(Intent intent) {
        intent.getClass();
        ssg.a(3, "UrlActivity", "onNewIntent: " + intent, null);
        super.onNewIntent(intent);
        setIntent(intent);
        C(intent);
    }

    @Override // android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() == 16908332) {
            finish();
        }
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // defpackage.np2, defpackage.gnb, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onStart() {
        super.onStart();
        Intent intent = getIntent();
        intent.getClass();
        C(intent);
    }

    @Override // defpackage.np2, defpackage.gnb, defpackage.hq0, androidx.fragment.app.t, android.app.Activity
    public final void onStop() {
        super.onStop();
        saf.D(wyf.F(getLifecycle()).b, null);
        this.x = null;
    }

    @Override // defpackage.np2
    public final int q() {
        return R.layout.activity_url;
    }

    @Override // defpackage.np2
    public final int v(ou0 ou0Var) {
        return yu0.a[ou0Var.ordinal()] == 1 ? R.style.AppTheme_Transparent_EdgeToEdge : R.style.AppTheme_Transparent_Dark_EdgeToEdge;
    }
}
