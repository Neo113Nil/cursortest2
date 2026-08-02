package defpackage;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.yandex.div.core.expression.variables.a;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import com.yandex.urbanads.internal.flex.UrbanAdsTheme;
import flex.core.loader.network.d;
import flex.core.loader.network.e;
import flex.parser.transition.h;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.serialization.KSerializer;
import ru.yandex.video.m3.preload_manager.PreloadManagerBuilder;

/* loaded from: classes2.dex */
public final class uir {
    public final Context a;
    public final kf21 b;
    public final re21 c;
    public final se21 d;
    public final qe21 e;
    public final xf21 f;
    public final jf21 g;
    public final e h;
    public final qir i;
    public final m6q0 j;
    public final i7x0 k;
    public final kyl l;
    public final kyl m;
    public final a n;
    public final pvy0 o;
    public final Map p;
    public final sf21 q;
    public final vjm0 r;
    public final exy0 s;
    public final k6x t;
    public final u4x u;
    public final r1s v;
    public final i3y w;
    public final flex.core.action.remote.executor.a x;
    public final ike y;

    /* JADX WARN: Code restructure failed: missing block: B:21:0x011a, code lost:
    
        if (r11 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public uir(qe21 qe21Var, re21 re21Var, se21 se21Var, jf21 jf21Var, kf21 kf21Var, lf21 lf21Var, xf21 xf21Var, ag21 ag21Var, Context context) {
        String themeId;
        Activity activity;
        FragmentManager supportFragmentManager;
        Context context2 = context;
        this.a = context2;
        this.b = kf21Var;
        this.c = re21Var;
        this.d = se21Var;
        this.e = qe21Var;
        this.f = xf21Var;
        this.g = jf21Var;
        qhw0 a = jl40.a();
        sjh sjhVar = uyj.a;
        jb7 jb7Var = zse.a;
        this.y = bvf0.a(cvw.U(a, (j400) jb7Var.b));
        final int i = 0;
        me0 me0Var = new me0(context2, (byte) 0);
        i3y a2 = kotlin.a.a(new sls(this) { // from class: pir
            public final /* synthetic */ uir b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                uir uirVar = this.b;
                switch (i2) {
                    case 0:
                        rir rirVar = new rir(uirVar, 1);
                        e0m e0mVar = new e0m();
                        rirVar.invoke(e0mVar);
                        KSerializer serializer = kwg.Companion.serializer();
                        LinkedHashMap linkedHashMap = e0mVar.b;
                        linkedHashMap.put("DebugScaffold", serializer);
                        KSerializer serializer2 = yug.Companion.serializer();
                        LinkedHashMap linkedHashMap2 = e0mVar.a;
                        linkedHashMap2.put("debug", serializer2);
                        return new d0m(new p1m(), new v1m(), new axl(), new ihe(new rjd(linkedHashMap2), new zgl(10), null), new ekm0(new csd(linkedHashMap), new zgl(11), null), new zw(new m530(new qid(e0mVar.e)), new zgl(12), null), new enr0(e0mVar.c, null), new r370(), new h(), e0mVar.d);
                    default:
                        return uir.a(uirVar, null, uirVar.q, uirVar.m, 3);
                }
            }
        });
        this.w = a2;
        core.network.mapi.client.a aVar = new core.network.mapi.client.a(new sir(0, this), Collections.singletonList(new tir(this, me0Var)), new qir(1, this));
        q2m q2mVar = new q2m();
        q2mVar.a = aVar;
        q2mVar.c = this.w;
        q2mVar.b = ip50.a;
        acj acjVar = new acj(23);
        lu00 lu00Var = q2mVar.a;
        if (lu00Var == null) {
            ny61.g("MapiClient is required for document service see https://docs.yandex-team.ru/bdui/flexbook/");
            throw null;
        }
        i3y i3yVar = q2mVar.c;
        if (i3yVar == null) {
            ny61.g("DocumentJsonProvider is required for document service see https://docs.yandex-team.ru/bdui/flexbook/");
            throw null;
        }
        l2m l2mVar = new l2m(new bxl(2, i3yVar), acjVar);
        ip50 ip50Var = q2mVar.b;
        if (ip50Var == null) {
            ny61.g("Required value was null.");
            throw null;
        }
        d dVar = new d(lu00Var, l2mVar, q2mVar.d, null, ip50Var, q2mVar.e, null, acjVar);
        k6x k6xVar = mab1.a;
        if (k6xVar == null) {
            k6xVar = new k6x();
            mab1.a = k6xVar;
        }
        this.t = k6xVar;
        u4x u4xVar = mab1.b;
        if (u4xVar == null) {
            u4xVar = new u4x(null, null, 15);
            mab1.b = u4xVar;
        }
        this.u = u4xVar;
        r1s r1sVar = mab1.c;
        if (r1sVar == null) {
            r1sVar = new r1s((u5x) null, (c5x) null);
            mab1.c = r1sVar;
        }
        this.v = r1sVar;
        List singletonList = Collections.singletonList(new g6x(0, k6xVar));
        new n0m();
        this.h = new e(dVar, singletonList);
        this.x = new flex.core.action.remote.executor.a(new hy(aVar, new ux((d0m) a2.getValue()), (jse) jb7Var.c, zun.a, null, null, null, PreloadManagerBuilder.MAXIMUM_TRACK_PRELOAD_TIMEOUT_IN_SEC), singletonList);
        if (xf21Var != null) {
            themeId = xf21Var.a;
            themeId = themeId.length() <= 0 ? null : themeId;
        }
        int i2 = context2.getResources().getConfiguration().uiMode & 48;
        themeId = i2 != 16 ? i2 != 32 ? null : UrbanAdsTheme.DARK.getThemeId() : UrbanAdsTheme.LIGHT.getThemeId();
        if (themeId == null) {
            themeId = UrbanAdsTheme.LIGHT.getThemeId();
        }
        a aVar2 = new a(null);
        this.n = aVar2;
        final int i3 = 1;
        aVar2.i(new z131(DivkitThemeChangeListener.THEME_VARIABLE_NAME, themeId));
        pvy0 pvy0Var = new pvy0();
        pvy0Var.a(themeId);
        this.o = pvy0Var;
        if (xf21Var != null) {
            xf21Var.b = new rir(this, 0);
        }
        cf21 cf21Var = new cf21(aVar2, ag21Var);
        cf21Var.d.add(new awl(new dwl(cf21Var, k6xVar)));
        this.i = new qir(2);
        this.j = new m6q0(cf21Var, pvy0Var);
        this.k = new i7x0();
        this.l = new kyl(i3);
        this.m = new kyl(2);
        com.yandex.urbanads.internal.network.a aVar3 = new com.yandex.urbanads.internal.network.a(new me1(context2.getSharedPreferences("cookie_storage", 0), 0), re21Var, kf21Var, context2.getApplicationContext().getPackageName());
        this.p = b.i(new Pair(qoi0.a(t13.class), new v13(context2, 0)), new Pair(qoi0.a(ge1.class), new ie1(aVar3, 0)), new Pair(qoi0.a(te1.class), new ie1(aVar3, i3)), new Pair(qoi0.a(q2h.class), new v4c(2, lf21Var)), new Pair(qoi0.a(nyj.class), new v4c(3, (Object) null)));
        sls slsVar = new sls(this) { // from class: pir
            public final /* synthetic */ uir b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                uir uirVar = this.b;
                switch (i22) {
                    case 0:
                        rir rirVar = new rir(uirVar, 1);
                        e0m e0mVar = new e0m();
                        rirVar.invoke(e0mVar);
                        KSerializer serializer = kwg.Companion.serializer();
                        LinkedHashMap linkedHashMap = e0mVar.b;
                        linkedHashMap.put("DebugScaffold", serializer);
                        KSerializer serializer2 = yug.Companion.serializer();
                        LinkedHashMap linkedHashMap2 = e0mVar.a;
                        linkedHashMap2.put("debug", serializer2);
                        return new d0m(new p1m(), new v1m(), new axl(), new ihe(new rjd(linkedHashMap2), new zgl(10), null), new ekm0(new csd(linkedHashMap), new zgl(11), null), new zw(new m530(new qid(e0mVar.e)), new zgl(12), null), new enr0(e0mVar.c, null), new r370(), new h(), e0mVar.d);
                    default:
                        return uir.a(uirVar, null, uirVar.q, uirVar.m, 3);
                }
            }
        };
        while (true) {
            if (context2 == null) {
                activity = null;
                break;
            } else if (context2 instanceof FragmentActivity) {
                activity = (Activity) context2;
                break;
            } else {
                ContextWrapper contextWrapper = context2 instanceof ContextWrapper ? (ContextWrapper) context2 : null;
                context2 = contextWrapper != null ? contextWrapper.getBaseContext() : null;
            }
        }
        FragmentActivity fragmentActivity = (FragmentActivity) activity;
        this.q = new sf21(slsVar, (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) ? null : new mum(supportFragmentManager), this.f, this.a);
        exy0 exy0Var = new exy0(this.o, R.color.white);
        this.s = exy0Var;
        this.r = new vjm0(cf21Var, exy0Var);
    }

    public static flex.engine.a a(uir uirVar, u1m u1mVar, r3l0 r3l0Var, kyl kylVar, int i) {
        if ((i & 1) != 0) {
            u1mVar = null;
        }
        if ((i & 4) != 0) {
            r3l0Var = uirVar.q;
        }
        if ((i & 8) != 0) {
            kylVar = uirVar.l;
        }
        uirVar.getClass();
        return bk91.e(u1mVar, new sxo(11, new com.yandex.urbanads.internal.flex.a(uirVar, kylVar, uirVar, r3l0Var), uirVar));
    }
}
