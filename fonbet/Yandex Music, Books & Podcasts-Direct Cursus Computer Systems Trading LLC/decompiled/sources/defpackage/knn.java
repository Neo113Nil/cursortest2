package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.WindowInsetsController;
import android.widget.RemoteViews;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.IReporter;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.yandex.music.R;
import ru.yandex.music.common.media.context.PlaybackScope;
import ru.yandex.music.common.media.context.a;
import ru.yandex.music.common.media.context.d;

/* loaded from: classes6.dex */
public final class knn implements lci, pur, x7o, re6, dmr, xsr, w2q, dn0, bvj, xjn, e5l, tqj, zpj, spj {
    public final /* synthetic */ int a;
    public Object b;

    public knn(int i) {
        this.a = i;
        switch (i) {
            case 9:
                this.b = new LinkedHashMap();
                break;
            case 13:
                this.b = new ConcurrentHashMap();
                break;
            case 14:
                this.b = new AtomicReference();
                break;
            case 16:
                this.b = ByteBuffer.allocate(4);
                break;
            case 18:
                break;
            case 24:
                this.b = new CountDownLatch(1);
                break;
            default:
                this.b = new SimpleDateFormat("HH:mm:ss", Locale.ROOT);
                break;
        }
    }

    public ucr a(a4w a4wVar) {
        a4wVar.getClass();
        return (ucr) ((LinkedHashMap) this.b).remove(a4wVar);
    }

    @Override // defpackage.xsr
    public int b() {
        return ((btr) this.b).d.length;
    }

    @Override // defpackage.w2q
    public Object c(foc focVar) {
        focVar.getClass();
        return eml.d;
    }

    @Override // defpackage.zpj
    public void d(Exception exc) {
        switch (this.a) {
            case 24:
                ((CountDownLatch) this.b).countDown();
                break;
            default:
                i8s i8sVar = (i8s) this.b;
                m4x.d.a(exc, "get checkbox consent failed", new Object[0]);
                i8sVar.d(Boolean.FALSE);
                break;
        }
    }

    @Override // defpackage.spj
    public void e() {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // defpackage.bvj
    public void f(byte[] bArr, Object obj, MessageDigest messageDigest) {
        Integer num = (Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (((ByteBuffer) this.b)) {
            ((ByteBuffer) this.b).position(0);
            messageDigest.update(((ByteBuffer) this.b).putInt(num.intValue()).array());
        }
    }

    @Override // defpackage.w2q
    public Object g(faq faqVar) {
        j1g j1gVar = (j1g) this.b;
        faqVar.getClass();
        if (faqVar instanceof naq) {
            return g0g.Y(j1gVar);
        }
        if (faqVar instanceof daq) {
            return new eml(j1gVar, false, false);
        }
        if (faqVar instanceof saq) {
            return new eml(j1gVar, true, false);
        }
        if (faqVar instanceof qaq) {
            return eml.d;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.dmr
    /* renamed from: get */
    public dmr mo22get(String str) {
        Object opt = ((JSONArray) this.b).opt(Integer.parseInt(str));
        if (opt instanceof JSONArray) {
            return new knn(10, (JSONArray) opt);
        }
        if (opt instanceof JSONObject) {
            return new hjp(5, (JSONObject) opt);
        }
        if (opt == null ? true : opt.equals(JSONObject.NULL)) {
            return null;
        }
        return i9w.g;
    }

    @Override // defpackage.sjn
    public Object getValue(Object obj, s9f s9fVar) {
        s9fVar.getClass();
        WeakReference weakReference = (WeakReference) this.b;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // defpackage.w2q
    public Object h(jzs jzsVar) {
        jzsVar.getClass();
        return g0g.Y((j1g) this.b);
    }

    @Override // defpackage.w2q
    public Object i(m1q m1qVar) {
        j1g j1gVar = (j1g) this.b;
        m1qVar.getClass();
        if (m1qVar instanceof c2q) {
            return g0g.Y(j1gVar);
        }
        if (m1qVar instanceof j1q) {
            return g0g.Y(j1gVar);
        }
        if (m1qVar instanceof e2q) {
            return eml.d;
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.w2q
    public Object j(i5u i5uVar) {
        i5uVar.getClass();
        return new eml((j1g) this.b, true, false);
    }

    @Override // defpackage.w2q
    public Object k(k4d k4dVar) {
        k4dVar.getClass();
        return g0g.Y((j1g) this.b);
    }

    @Override // defpackage.pur
    public void l(zco zcoVar, float f) {
        zcoVar.getClass();
        ((pur) this.b).l(zcoVar, 1.0f - f);
    }

    @Override // defpackage.re6
    public void m(we6 we6Var) {
        if (we6Var.g() != null) {
            ((wip) this.b).a.h = true;
        }
    }

    public List n(String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (Intrinsics.d(((a4w) entry.getKey()).a, str)) {
                linkedHashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((a4w) it.next());
        }
        return CollectionsKt.w0(linkedHashMap2.values());
    }

    @Override // defpackage.xsr
    public String o() {
        return ((btr) this.b).b;
    }

    @Override // defpackage.x7o
    public void onSuccess(Object obj) {
        switch (this.a) {
            case 5:
                kn knVar = (kn) obj;
                knVar.getClass();
                gdp gdpVar = (gdp) this.b;
                boolean z = gdpVar.x;
                voi voiVar = gdpVar.v;
                if (!z) {
                    if (!(knVar instanceof gn)) {
                        if (!(knVar instanceof hn)) {
                            if (!(knVar instanceof fn)) {
                                if (!(knVar instanceof in)) {
                                    knVar.equals(jn.a);
                                    break;
                                } else {
                                    mfk mfkVar = gdpVar.A;
                                    if (mfkVar != null) {
                                        gdpVar.s.l(new Pair(((in) knVar).a, mfkVar));
                                        break;
                                    }
                                }
                            } else {
                                voiVar.l(h2c.a);
                                break;
                            }
                        } else {
                            hn hnVar = (hn) knVar;
                            voiVar.l(new j2c(hnVar.a, hnVar.b));
                            break;
                        }
                    } else {
                        int i = edp.a[((gn) knVar).a.ordinal()];
                        gdpVar.t.l(new ycp(R.string.paymentsdk_success_title));
                        break;
                    }
                }
                break;
            default:
                ((CountDownLatch) this.b).countDown();
                break;
        }
    }

    @Override // defpackage.e5l
    public PlaybackScope p() {
        rnv rnvVar = (rnv) ((xdr) this.b).getValue();
        if (rnvVar instanceof mnv) {
            return d.t();
        }
        if (rnvVar instanceof nnv) {
            aab aabVar = ((nnv) rnvVar).a;
            if (aabVar instanceof lt) {
                return d.a();
            }
            if (aabVar instanceof u51) {
                return d.c();
            }
            if (aabVar instanceof eul) {
                return d.t();
            }
            b6e.s();
            return null;
        }
        if (rnvVar instanceof qnv) {
            return d.o();
        }
        if (!(rnvVar instanceof pnv)) {
            if (rnvVar != null) {
                b6e.s();
                return null;
            }
            a aVar = PlaybackScope.a;
            aVar.getClass();
            return aVar;
        }
        aab aabVar2 = ((pnv) rnvVar).a;
        if (aabVar2 instanceof lt) {
            return d.a();
        }
        if (aabVar2 instanceof u51) {
            return d.c();
        }
        if (aabVar2 instanceof eul) {
            return d.t();
        }
        b6e.s();
        return null;
    }

    public void q(LinkedHashMap linkedHashMap) {
        IReporter reporter = AppMetrica.getReporter((Context) ((z6u) this.b).b, "35dc0bfc-990e-4681-ad03-2b200fa7a485");
        reporter.getClass();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            reporter.putAppEnvironmentValue((String) entry.getKey(), (String) entry.getValue());
        }
    }

    public String r(long j) {
        return ((SimpleDateFormat) this.b).format(new Date(j));
    }

    public ucr s(a4w a4wVar) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.b;
        Object obj = linkedHashMap.get(a4wVar);
        if (obj == null) {
            obj = new ucr(a4wVar);
            linkedHashMap.put(a4wVar, obj);
        }
        return (ucr) obj;
    }

    @Override // defpackage.xjn
    public void setValue(Object obj, s9f s9fVar, Object obj2) {
        s9fVar.getClass();
        this.b = obj2 != null ? new WeakReference(obj2) : null;
    }

    public void t(AppWidgetManager appWidgetManager, int i, rft rftVar) {
        appWidgetManager.getClass();
        rftVar.getClass();
        Application application = (Application) this.b;
        RemoteViews remoteViews = new RemoteViews(application.getPackageName(), rftVar.a());
        if (rftVar instanceof lft) {
            lft lftVar = (lft) rftVar;
            Bitmap bitmap = lftVar.f;
            Bitmap bitmap2 = lftVar.g;
            remoteViews.setViewVisibility(R.id.plus_sdk_daily_widget_missions_image, 8);
            remoteViews.setViewVisibility(R.id.plus_sdk_daily_widget_gift_image, 8);
            remoteViews.setImageViewBitmap(R.id.plus_sdk_daily_widget_left_image, bitmap);
            remoteViews.setViewVisibility(R.id.plus_sdk_daily_widget_left_image, 0);
            remoteViews.setImageViewBitmap(R.id.plus_sdk_daily_widget_right_image, bitmap2);
            remoteViews.setViewVisibility(R.id.plus_sdk_daily_widget_right_image, 0);
        } else if (rftVar instanceof mft) {
            Bitmap bitmap3 = ((mft) rftVar).f;
            remoteViews.setViewVisibility(R.id.plus_sdk_daily_widget_left_image, 8);
            remoteViews.setViewVisibility(R.id.plus_sdk_daily_widget_right_image, 8);
            remoteViews.setViewVisibility(R.id.plus_sdk_daily_widget_missions_image, 8);
            remoteViews.setImageViewBitmap(R.id.plus_sdk_daily_widget_gift_image, bitmap3);
            remoteViews.setViewVisibility(R.id.plus_sdk_daily_widget_gift_image, 0);
        } else if (rftVar instanceof nft) {
            Bitmap bitmap4 = ((nft) rftVar).f;
            remoteViews.setViewVisibility(R.id.plus_sdk_daily_widget_left_image, 8);
            remoteViews.setViewVisibility(R.id.plus_sdk_daily_widget_right_image, 8);
            remoteViews.setViewVisibility(R.id.plus_sdk_daily_widget_gift_image, 8);
            remoteViews.setImageViewBitmap(R.id.plus_sdk_daily_widget_missions_image, bitmap4);
            remoteViews.setViewVisibility(R.id.plus_sdk_daily_widget_missions_image, 0);
        } else if (rftVar instanceof pft) {
            pft pftVar = (pft) rftVar;
            Bitmap bitmap5 = pftVar.f;
            Bitmap bitmap6 = pftVar.g;
            remoteViews.setViewVisibility(R.id.plus_sdk_daily_widget_missions_image, 8);
            remoteViews.setViewVisibility(R.id.plus_sdk_daily_widget_gift_image, 8);
            remoteViews.setImageViewBitmap(R.id.plus_sdk_daily_widget_left_image, bitmap5);
            remoteViews.setViewVisibility(R.id.plus_sdk_daily_widget_left_image, 0);
            remoteViews.setImageViewBitmap(R.id.plus_sdk_daily_widget_right_image, bitmap6);
            remoteViews.setViewVisibility(R.id.plus_sdk_daily_widget_right_image, 0);
        } else if (!(rftVar instanceof oft) && !(rftVar instanceof qft)) {
            b6e.s();
            return;
        }
        remoteViews.setImageViewBitmap(R.id.plus_sdk_daily_widget_background, rftVar.b());
        remoteViews.setTextViewText(R.id.plus_sdk_daily_widget_title, rftVar.getTitle());
        remoteViews.setContentDescription(R.id.plus_sdk_daily_widget_background, rftVar.getTitle());
        kft q = rftVar.q();
        if (q == null) {
            b6e.s();
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(q.a));
        intent.addFlags(268435456);
        intent.addFlags(32);
        intent.setPackage(application.getPackageName());
        remoteViews.setOnClickPendingIntent(R.id.plus_sdk_daily_widget_background, PendingIntent.getActivity(application, i, intent, 201326592));
        appWidgetManager.updateAppWidget(i, remoteViews);
    }

    @Override // defpackage.dmr
    public void w(Object obj, String str) {
        JSONArray jSONArray = (JSONArray) this.b;
        int parseInt = Integer.parseInt(str);
        if (parseInt < 0 || parseInt > jSONArray.length()) {
            rj7.m();
            return;
        }
        try {
            r7o r7oVar = z7o.b;
            jSONArray.put(parseInt, obj);
        } catch (Throwable unused) {
            r7o r7oVar2 = z7o.b;
        }
    }

    @Override // defpackage.x7o
    public void x(Object obj) {
        bfk bfkVar = (bfk) obj;
        bfkVar.getClass();
        gdp gdpVar = (gdp) this.b;
        if (gdpVar.x) {
            return;
        }
        gdpVar.t.l(new tcp(bfkVar));
    }

    @Override // defpackage.lci
    public kci y(kkp kkpVar) {
        return new fr1((Resources) this.b, kkpVar.n(Uri.class, AssetFileDescriptor.class));
    }

    @Override // defpackage.xsr
    public void z(wsr wsrVar) {
        wsrVar.getClass();
        btr btrVar = (btr) this.b;
        int length = btrVar.d.length;
        for (int i = 1; i < length; i++) {
            int i2 = btrVar.d[i];
            if (i2 == 1) {
                wsrVar.bindLong(i, btrVar.e[i]);
            } else if (i2 == 2) {
                wsrVar.bindDouble(i, btrVar.f[i]);
            } else if (i2 == 3) {
                String str = btrVar.g[i];
                str.getClass();
                wsrVar.bindString(i, str);
            } else if (i2 == 4) {
                byte[] bArr = btrVar.h[i];
                bArr.getClass();
                wsrVar.bindBlob(i, bArr);
            } else if (i2 == 5) {
                wsrVar.bindNull(i);
            }
        }
    }

    @Override // defpackage.dn0
    public qic get(int i) {
        return (qic) this.b;
    }

    public /* synthetic */ knn(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public knn(j1g j1gVar) {
        this.a = 12;
        j1gVar.getClass();
        this.b = j1gVar;
    }

    public knn(View view) {
        this.a = 8;
        if (Build.VERSION.SDK_INT >= 30) {
            e3r e3rVar = new e3r(13, view);
            e3rVar.c = view;
            this.b = e3rVar;
            return;
        }
        this.b = new f4m(13, view);
    }

    public knn(WindowInsetsController windowInsetsController) {
        this.a = 8;
        e3r e3rVar = new e3r(13, null);
        e3rVar.d = windowInsetsController;
        this.b = e3rVar;
    }
}
