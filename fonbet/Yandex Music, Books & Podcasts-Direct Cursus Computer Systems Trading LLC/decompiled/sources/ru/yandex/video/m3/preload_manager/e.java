package ru.yandex.video.m3.preload_manager;

import android.content.Context;
import defpackage.anm;
import defpackage.aw7;
import defpackage.c5b;
import defpackage.cke;
import defpackage.cnm;
import defpackage.ern;
import defpackage.ip3;
import defpackage.ksa;
import defpackage.liq;
import defpackage.lp7;
import defpackage.n2t;
import defpackage.n4f;
import defpackage.opi;
import defpackage.ot0;
import defpackage.q08;
import defpackage.qee;
import defpackage.rxk;
import defpackage.s9f;
import defpackage.ssm;
import defpackage.t8w;
import defpackage.va7;
import defpackage.vej;
import defpackage.wt0;
import defpackage.xiu;
import defpackage.ylr;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.OkHttpClient;

/* loaded from: classes6.dex */
public final class e {
    public static final rxk q;
    public static final /* synthetic */ s9f[] r;
    public static final t8w s;
    public final vej a;
    public ExecutorService b;
    public final vej c;
    public final vej d;
    public final vej e;
    public xiu f;
    public final vej g;
    public final vej h;
    public ssm i;
    public OkHttpClient j;
    public final vej k;
    public qee l;
    public Object m;
    public String n;
    public long o;
    public String p;

    static {
        opi opiVar = new opi(e.class, "workersExecutorService", "getWorkersExecutorService()Ljava/util/concurrent/ExecutorService;", 0);
        ern.a.getClass();
        r = new s9f[]{opiVar, new opi(e.class, "maxSimultaneousDownloads", "getMaxSimultaneousDownloads()I", 0), new opi(e.class, "preloadCacheProvider", "getPreloadCacheProvider()Lru/yandex/video/m3/preload_manager/cache/PreloadCacheProvider;", 0), new opi(e.class, "upstreamDataSourceFactory", "getUpstreamDataSourceFactory()Landroidx/media3/datasource/DataSource$Factory;", 0), new opi(e.class, "bandwidthMeter", "getBandwidthMeter()Landroidx/media3/exoplayer/upstream/BandwidthMeter;", 0), new opi(e.class, "trackSelectorFactoryBuilder", "getTrackSelectorFactoryBuilder()Lkotlin/jvm/functions/Function1;", 0), new opi(e.class, "deviceInfoProvider", "getDeviceInfoProvider()Lru/yandex/video/m3/player/impl/tracking/device/DeviceInfoProvider;", 0)};
        q = new rxk();
        s = new t8w();
    }

    public e(Context context) {
        context.getClass();
        aw7.a.getClass();
        this.a = new vej();
        this.c = new vej();
        this.d = new vej();
        this.e = new vej();
        this.g = new vej();
        this.h = new vej();
        this.k = new vej();
        this.m = c5b.a;
        this.o = 10L;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.List] */
    public final ru.yandex.video.m3.preload_manager.tracking.a a(cke ckeVar) {
        List list;
        List split$default;
        OkHttpClient okHttpClient = this.j;
        if (okHttpClient == null) {
            okHttpClient = new OkHttpClient();
        }
        ylr ylrVar = new ylr(okHttpClient, Executors.newSingleThreadExecutor(new lp7(4, Executors.defaultThreadFactory())), new n4f(), ckeVar, new ksa(), null);
        wt0 b = ckeVar.b();
        LinkedHashMap T = ot0.T(((q08) this.k.getValue(this, r[6])).get());
        Object obj = this.m;
        if (((Collection) obj).isEmpty()) {
            obj = null;
        }
        String X = obj != null ? CollectionsKt.X((Iterable) obj, ";", null, null, null, 62) : null;
        ?? r1 = this.m;
        q.getClass();
        if (r1.isEmpty()) {
            list = c5b.a;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it = ((Iterable) r1).iterator();
            while (it.hasNext()) {
                split$default = StringsKt__StringsKt.split$default((String) it.next(), new String[]{StringUtils.COMMA}, false, 2, 2, null);
                String str = (String) CollectionsKt.firstOrNull(split$default);
                Integer intOrNull = str != null ? StringsKt.toIntOrNull(str) : null;
                if (intOrNull != null) {
                    arrayList.add(intOrNull);
                }
            }
            list = arrayList;
        }
        return new ru.yandex.video.m3.preload_manager.tracking.a(ylrVar, new n2t("AndroidPlayer", "", b, T, null, X, list, null, this.n, null, -1, null, ckeVar.b.f()), this.l);
    }

    public final ip3 b(liq liqVar) {
        anm c = c();
        s9f[] s9fVarArr = r;
        s9f s9fVar = s9fVarArr[3];
        vej vejVar = this.e;
        va7 va7Var = (va7) vejVar.getValue(this, s9fVar);
        cnm cnmVar = (cnm) c;
        Object obj = cnmVar.b;
        if (obj == null) {
            obj = cnmVar.c;
        }
        if (obj == null) {
            cnmVar.a();
        }
        liq liqVar2 = cnmVar.b;
        if (liqVar2 != null) {
            ip3 ip3Var = new ip3();
            ip3Var.a = liqVar2;
            ip3Var.f = va7Var;
            ip3Var.d = (t8w) cnmVar.d.getValue();
            va7Var = ip3Var;
        }
        ip3 ip3Var2 = va7Var instanceof ip3 ? (ip3) va7Var : null;
        if (ip3Var2 != null) {
            return ip3Var2;
        }
        ip3 ip3Var3 = new ip3();
        ip3Var3.a = liqVar;
        ip3Var3.f = (va7) vejVar.getValue(this, s9fVarArr[3]);
        ip3Var3.d = s;
        return ip3Var3;
    }

    public final anm c() {
        return (anm) this.d.getValue(this, r[2]);
    }
}
