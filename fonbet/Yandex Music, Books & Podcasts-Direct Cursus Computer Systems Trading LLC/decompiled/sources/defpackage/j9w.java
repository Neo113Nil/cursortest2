package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.yandex.passport.R;
import com.yandex.passport.api.v2;
import com.yandex.passport.api.z1;
import com.yandex.passport.data.network.b6;
import com.yandex.passport.data.network.e6;
import com.yandex.passport.internal.analytics.j;
import com.yandex.passport.internal.analytics.o0;
import com.yandex.passport.internal.analytics.p;
import com.yandex.passport.internal.badges.c;
import com.yandex.passport.internal.config.template.g;
import com.yandex.passport.internal.core.accounts.i;
import com.yandex.passport.internal.d;
import com.yandex.passport.internal.database.PassportDatabase_Impl;
import com.yandex.passport.internal.database.auth_cookie.b;
import com.yandex.passport.internal.database.auth_cookie.e;
import com.yandex.passport.internal.database.diary.a;
import com.yandex.passport.internal.entities.s;
import com.yandex.passport.internal.links.h;
import com.yandex.passport.internal.methods.c5;
import com.yandex.passport.internal.methods.d3;
import com.yandex.passport.internal.methods.h3;
import com.yandex.passport.internal.methods.h4;
import com.yandex.passport.internal.methods.m3;
import com.yandex.passport.internal.methods.performer.b1;
import com.yandex.passport.internal.methods.performer.e1;
import com.yandex.passport.internal.methods.performer.j0;
import com.yandex.passport.internal.methods.performer.n;
import com.yandex.passport.internal.methods.performer.r;
import com.yandex.passport.internal.methods.performer.r0;
import com.yandex.passport.internal.methods.q4;
import com.yandex.passport.internal.methods.x4;
import com.yandex.passport.internal.properties.l;
import com.yandex.passport.internal.provider.communication.f;
import com.yandex.passport.internal.push.f0;
import com.yandex.passport.internal.push.h0;
import com.yandex.passport.internal.push.m;
import com.yandex.passport.internal.push.m0;
import com.yandex.passport.internal.report.ab;
import com.yandex.passport.internal.report.dd;
import com.yandex.passport.internal.report.diary.e0;
import com.yandex.passport.internal.report.diary.q0;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.h2;
import com.yandex.passport.internal.report.i2;
import com.yandex.passport.internal.report.reporters.g0;
import com.yandex.passport.internal.report.reporters.j1;
import com.yandex.passport.internal.report.reporters.k;
import com.yandex.passport.internal.report.reporters.t;
import com.yandex.passport.internal.report.ue;
import com.yandex.passport.internal.social.esia.d0;
import com.yandex.passport.internal.ui.util.q;
import com.yandex.passport.internal.v;
import com.yandex.pulse.metrics.o;
import io.appmetrica.analytics.IReporterYandex;
import java.io.Serializable;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class j9w extends aur implements Function2 {
    public final /* synthetic */ int j;
    public /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j9w(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.k = obj;
        this.l = obj2;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                j9w j9wVar = new j9w((k9w) this.l, continuation, 0);
                j9wVar.k = obj;
                return j9wVar;
            case 1:
                return new j9w((String) this.k, (d1) this.l, continuation, 1);
            case 2:
                j9w j9wVar2 = new j9w((rdk) this.l, continuation, 2);
                j9wVar2.k = obj;
                return j9wVar2;
            case 3:
                j9w j9wVar3 = new j9w((iz7) this.l, continuation, 3);
                j9wVar3.k = obj;
                return j9wVar3;
            case 4:
                j9w j9wVar4 = new j9w((cbw) this.l, continuation, 4);
                j9wVar4.k = obj;
                return j9wVar4;
            case 5:
                return new j9w((rlw) this.k, (String) this.l, continuation, 5);
            case 6:
                return new j9w((nmw) this.k, (h4q) this.l, continuation, 6);
            case 7:
                return new j9w((nmw) this.k, (n4q) this.l, continuation, 7);
            case 8:
                return new j9w((prw) this.k, (List) this.l, continuation, 8);
            case 9:
                return new j9w((ltw) this.k, (wqw) this.l, continuation, 9);
            case 10:
                return new j9w((Context) this.k, (IReporterYandex) this.l, continuation, 10);
            case 11:
                return new j9w((bw1) this.k, (Throwable) this.l, continuation, 11);
            case 12:
                return new j9w((c) this.k, (String) this.l, continuation, 12);
            case 13:
                return new j9w((e6) this.k, (g) this.l, continuation, 13);
            case 14:
                return new j9w((b) this.k, (e) this.l, continuation, 14);
            case 15:
                return new j9w((com.yandex.passport.internal.links.g) this.k, (l) this.l, continuation, 15);
            case 16:
                return new j9w((d3) this.k, (com.yandex.passport.internal.methods.performer.l) this.l, continuation, 16);
            case 17:
                return new j9w((n) this.k, (h3) this.l, continuation, 17);
            case 18:
                return new j9w((m3) this.k, (r) this.l, continuation, 18);
            case 19:
                return new j9w((h4) this.k, (j0) this.l, continuation, 19);
            case 20:
                return new j9w((q4) this.k, (r0) this.l, continuation, 20);
            case 21:
                return new j9w((b1) this.k, (x4) this.l, continuation, 21);
            case 22:
                return new j9w((c5) this.k, (e1) this.l, continuation, 22);
            case 23:
                return new j9w((f) this.k, (v2) this.l, continuation, 23);
            case 24:
                return new j9w((m) this.k, (Bundle) this.l, continuation, 24);
            case 25:
                return new j9w((e0) this.k, (a) this.l, continuation, 25);
            case 26:
                return new j9w((e0) this.k, (com.yandex.passport.internal.database.diary.b) this.l, continuation, 26);
            case 27:
                return new j9w((q0) this.k, (com.yandex.passport.internal.database.diary.f) this.l, continuation, 27);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                return new j9w((com.yandex.passport.internal.sloth.performers.f) this.k, (l83) this.l, continuation, 28);
            default:
                return new j9w((Function1) this.k, (d0) this.l, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((j9w) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x05ff  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x05f4  */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v18 */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        n7q n7qVar;
        u3q g;
        a0q id;
        s sVar;
        boolean b;
        d dVar;
        Object obj2;
        Uri uri;
        com.yandex.passport.internal.l c;
        int ordinal;
        com.yandex.passport.common.core.f fVar;
        Object obj3;
        String str;
        com.yandex.passport.internal.l lVar;
        com.yandex.passport.common.core.f fVar2;
        int i = 18;
        int i2 = 4;
        String str2 = 0;
        switch (this.j) {
            case 0:
                oow oowVar = (oow) this.k;
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                ((afw) ((k9w) this.l).b.getValue()).h(oowVar);
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                Log.i("YP:ABExps", "player with vsid=" + ((String) this.k) + " received config=" + ((d1) this.l));
                return Unit.a;
            case 2:
                nm6 nm6Var3 = nm6.a;
                qgg.h0(obj);
                j1 j1Var = (j1) this.k;
                rdk rdkVar = (rdk) this.l;
                rdkVar.d = j1Var;
                rdk.p(rdkVar);
                return Unit.a;
            case 3:
                nm6 nm6Var4 = nm6.a;
                qgg.h0(obj);
                ((xdr) ((iz7) this.l).c).l((qe7) this.k);
                return Unit.a;
            case 4:
                nm6 nm6Var5 = nm6.a;
                qgg.h0(obj);
                mm6 mm6Var = (mm6) this.k;
                cbw cbwVar = (cbw) this.l;
                x97.y(mm6Var, null, null, new bbw(cbwVar, str2, 0), 3);
                return x97.y(mm6Var, null, null, new bbw(cbwVar, str2, 1), 3);
            case 5:
                nm6 nm6Var6 = nm6.a;
                qgg.h0(obj);
                rlw rlwVar = (rlw) this.k;
                d6l x = p6g.x((e6l) rlwVar.b.a.c.getValue());
                String str3 = (x == null || (n7qVar = x.a) == null || (g = n7qVar.g()) == null || (id = g.getId()) == null) ? null : (String) o8g.i(id, mvn.e);
                ssg.a(2, "PlaybackUserInteractionTracker", hrg.r("interactive action(entity=", str3, "): ", (String) this.l), null);
                zzp zzpVar = rlwVar.c;
                rlw.a(rlwVar, new njs(zzpVar.b(), zzpVar.a()), str3, 4);
                return Unit.a;
            case 6:
                nm6 nm6Var7 = nm6.a;
                qgg.h0(obj);
                nmw nmwVar = (nmw) this.k;
                h4q h4qVar = (h4q) this.l;
                if (((qfw) nmwVar.c.getValue()).d() == gfw.b) {
                    epw y = nmwVar.y();
                    y.getClass();
                    h4qVar.getClass();
                    if (!gdg.u(((qmw) y.b().f.getValue()).c, h4qVar)) {
                        rmw b2 = y.b();
                        b2.getClass();
                        qmw qmwVar = (qmw) b2.f.getValue();
                        qmwVar.getClass();
                        qmw.b(qmwVar, null, h4qVar, 3);
                        y.e(new hav(i, h4qVar, y));
                    }
                }
                return Unit.a;
            case 7:
                nm6 nm6Var8 = nm6.a;
                qgg.h0(obj);
                nmw nmwVar2 = (nmw) this.k;
                n4q n4qVar = (n4q) this.l;
                if (((qfw) nmwVar2.c.getValue()).d() == gfw.b) {
                    nmwVar2.y().getClass();
                    n4qVar.getClass();
                }
                return Unit.a;
            case 8:
                nm6 nm6Var9 = nm6.a;
                qgg.h0(obj);
                prw prwVar = (prw) this.k;
                List list = (List) this.l;
                SharedPreferences.Editor edit = ((SharedPreferences) prwVar.b.getValue()).edit();
                if (list != null) {
                    gao gaoVar = prwVar.a;
                    gaoVar.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (!((gow) obj4).j) {
                            arrayList.add(obj4);
                        }
                    }
                    str2 = CollectionsKt.X(arrayList, "|||", null, null, new q0v(17, gaoVar), 30);
                }
                edit.putString("YNISON_DEVICE_LIST", str2);
                edit.apply();
                return Unit.a;
            case 9:
                nm6 nm6Var10 = nm6.a;
                qgg.h0(obj);
                int i3 = ((ltw) this.k).i.c;
                wqw wqwVar = (wqw) this.l;
                if (i3 != wqwVar.a) {
                    ssg.a(4, "YnisonApp:VolumeProvider", "update volume -- " + wqwVar + " / " + wqwVar.b.a, null);
                    ((ltw) this.k).i.e(((wqw) this.l).a);
                }
                ((ltw) this.k).e = null;
                return Unit.a;
            case 10:
                nm6 nm6Var11 = nm6.a;
                qgg.h0(obj);
                List list2 = v.a;
                Context applicationContext = ((Context) this.k).getApplicationContext();
                applicationContext.getClass();
                IReporterYandex iReporterYandex = (IReporterYandex) this.l;
                try {
                    byte[] bArr = s.c;
                    PackageManager packageManager = applicationContext.getPackageManager();
                    packageManager.getClass();
                    String packageName = applicationContext.getPackageName();
                    packageName.getClass();
                    sVar = com.yandex.plus.core.network.api.utils.a.q(packageManager, packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "releaseRuntimeChecks", e);
                    }
                    v.d(iReporterYandex, com.yandex.passport.internal.analytics.m.d, e);
                    sVar = s.f;
                } catch (NoSuchAlgorithmException e2) {
                    com.yandex.passport.common.logger.d dVar3 = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "releaseRuntimeChecks", e2);
                    }
                    v.d(iReporterYandex, com.yandex.passport.internal.analytics.m.d, e2);
                    sVar = s.f;
                }
                String string = applicationContext.getString(R.string.passport_account_type);
                string.getClass();
                if (!string.equals("com.yandex.passport")) {
                    com.yandex.passport.internal.ui.a.a = "com.yandex.passport".concat(string.substring(19));
                }
                if (sVar.d() && com.yandex.passport.internal.ui.a.a.equals("com.yandex.passport")) {
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "releaseRuntimeChecks: production signature with production account type: passed", 8);
                    }
                    b = v.b(applicationContext, iReporterYandex);
                } else {
                    if (sVar.c()) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "releaseRuntimeChecks: development signature: passed", 8);
                        }
                    } else if (kotlin.text.c.n(com.yandex.passport.internal.ui.a.a, ".sso", false) || com.yandex.plus.pay.ui.core.b.A(applicationContext, iReporterYandex)) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "releaseRuntimeChecks: valid alien signature: passed", 8);
                        }
                        b = v.b(applicationContext, iReporterYandex);
                    } else if (com.yandex.plus.pay.ui.core.b.y(applicationContext, iReporterYandex)) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.d, null, "releaseRuntimeChecks: expired alien certificate, don't crash: passed", 8);
                        }
                        b = v.b(applicationContext, iReporterYandex);
                    } else if (!com.yandex.passport.common.util.a.d(applicationContext)) {
                        String packageName2 = applicationContext.getPackageName();
                        packageName2.getClass();
                        if (!StringsKt.M(packageName2, "uber.az", false) || com.yandex.passport.internal.ui.a.a.equals("com.yandex.passport")) {
                            if (!v.a.contains(applicationContext.getPackageName()) || com.yandex.passport.internal.ui.a.a.equals("com.yandex.passport")) {
                                if (!kotlin.text.c.v(com.yandex.passport.internal.ui.a.a, "com.yandex.passport.wl", false)) {
                                    b = false;
                                }
                            } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "releaseRuntimeChecks: known packageName: " + applicationContext.getPackageName(), 8);
                            }
                        } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "releaseRuntimeChecks: uber.az", 8);
                        }
                    } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.d, null, "releaseRuntimeChecks: application is debuggable: passed", 8);
                    }
                    b = true;
                }
                if (!b) {
                    if (sVar.d()) {
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "releaseRuntimeChecks: production signature with unknown account type: crash", 8);
                        }
                    } else if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "releaseRuntimeChecks: unknown signature and application is not debuggable: crash", 8);
                    }
                    com.yandex.passport.internal.analytics.m mVar = com.yandex.passport.internal.analytics.m.c;
                    IllegalStateException illegalStateException = new IllegalStateException("Internal error, application signature mismatch");
                    v.d(iReporterYandex, mVar, illegalStateException);
                    Log.e("PassportRuntime", "Passport initial error: " + illegalStateException);
                    new Handler(Looper.getMainLooper()).post(new oq0(applicationContext, i2));
                }
                return Unit.a;
            case 11:
                nm6 nm6Var12 = nm6.a;
                qgg.h0(obj);
                ((zh) ((bw1) this.k).k).a((Throwable) this.l);
                return Unit.a;
            case 12:
                c cVar = (c) this.k;
                nm6 nm6Var13 = nm6.a;
                qgg.h0(obj);
                try {
                    zac.f(cVar.e, (String) this.l);
                    SharedPreferences sharedPreferences = cVar.d;
                    sharedPreferences.getClass();
                    SharedPreferences.Editor edit2 = sharedPreferences.edit();
                    cVar.b.getClass();
                    edit2.putLong("last_update", System.currentTimeMillis());
                    edit2.commit();
                    k kVar = cVar.c;
                    kVar.getClass();
                    kVar.p(i2.d);
                } catch (Exception e3) {
                    k kVar2 = cVar.c;
                    kVar2.getClass();
                    kVar2.n(h2.d, new ff(e3), new ue(e3));
                }
                return Unit.a;
            case 13:
                nm6 nm6Var14 = nm6.a;
                qgg.h0(obj);
                e6 e6Var = (e6) this.k;
                if (e6Var == null) {
                    return null;
                }
                ((g) this.l).getClass();
                b6 b6Var = e6Var.a;
                com.yandex.passport.internal.config.template.f b3 = b6Var != null ? g.b(b6Var) : null;
                b6 b6Var2 = e6Var.b;
                return new com.yandex.passport.internal.config.template.c(b3, b6Var2 != null ? g.b(b6Var2) : null);
            case 14:
                nm6 nm6Var15 = nm6.a;
                qgg.h0(obj);
                b bVar = (b) this.k;
                com.yandex.passport.internal.database.auth_cookie.d dVar4 = bVar.a;
                e eVar = (e) this.l;
                List list3 = eVar.b;
                if (((Boolean) bVar.e.b(com.yandex.passport.internal.flags.o.h0)).booleanValue()) {
                    List list4 = list3;
                    ArrayList arrayList2 = new ArrayList(v75.o(list4, 10));
                    Iterator it = list4.iterator();
                    while (it.hasNext()) {
                        Serializable c2 = bVar.d.c((String) it.next(), "cookie");
                        if (c2 instanceof t7o) {
                            c2 = null;
                        }
                        arrayList2.add((String) c2);
                    }
                    eVar = e.a(eVar, com.yandex.plus.pay.ui.core.b.o(arrayList2, list3));
                }
                up6.F(dVar4.a, false, true, new itv(21, dVar4, eVar));
                return Unit.a;
            case 15:
                com.yandex.passport.internal.links.g gVar = (com.yandex.passport.internal.links.g) this.k;
                nm6 nm6Var16 = nm6.a;
                qgg.h0(obj);
                try {
                    dVar = gVar.r.a();
                } catch (SecurityException unused) {
                    dVar = new d(c5b.a, gVar.r.a.h);
                }
                l lVar2 = (l) this.l;
                q qVar = gVar.z;
                Uri uri2 = gVar.t;
                com.yandex.passport.internal.l a = gVar.q.a();
                com.yandex.passport.internal.l e4 = (a == null || (fVar = a.b) == null) ? null : dVar.e(fVar);
                Iterator it2 = h.f.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        obj2 = it2.next();
                        if (((h) obj2).a.equals(uri2.getPath())) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                h hVar = (h) obj2;
                if (hVar == null) {
                    qq6.d(k5r.k(uri2, "Unknown deeplink "));
                    return null;
                }
                int ordinal2 = hVar.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        String queryParameter = uri2.getQueryParameter("url");
                        if (queryParameter == null) {
                            queryParameter = "";
                        }
                        uri = Uri.parse(queryParameter);
                        String queryParameter2 = uri2.getQueryParameter("BrowserName");
                        String queryParameter3 = uri2.getQueryParameter("machine_readable_login");
                        c = queryParameter3 == null ? dVar.c(queryParameter3) : null;
                        com.yandex.passport.internal.l lVar3 = c;
                        if (c == null) {
                            c = e4;
                        }
                        ordinal = hVar.ordinal();
                        if (ordinal != 0) {
                            qVar.m(new com.yandex.passport.internal.links.a(uri, c, queryParameter2));
                        } else if (ordinal == 1) {
                            Uri uri3 = uri;
                            String queryParameter4 = uri2.getQueryParameter("process_uuid");
                            if (queryParameter4 == null) {
                                queryParameter4 = "";
                            }
                            String queryParameter5 = uri3.getQueryParameter("origin");
                            String str4 = queryParameter5 != null ? queryParameter5 : "";
                            com.yandex.passport.internal.report.d dVar5 = gVar.x;
                            dVar5.getClass();
                            dVar5.e = new com.yandex.passport.internal.report.c("process_uuid", queryParameter4);
                            g0 g0Var = gVar.s;
                            g0Var.getClass();
                            g0Var.n(ab.d, new com.yandex.passport.internal.report.c(uri3), new com.yandex.passport.internal.report.c("origin", str4));
                            if (((Boolean) gVar.w.b(com.yandex.passport.internal.flags.o.B)).booleanValue()) {
                                x97.y(ot0.F(gVar), null, null, new xg(gVar, e4, lVar3, lVar2, uri3, queryParameter2, null, 27), 3);
                            } else {
                                qVar.m(new com.yandex.passport.internal.links.c(uri3, lVar3, queryParameter2));
                            }
                        } else {
                            if (ordinal != 2) {
                                b6e.s();
                                return null;
                            }
                            x97.y(ot0.F(gVar), null, null, new y7b(gVar, uri, c, lVar2, queryParameter2, (Continuation) null), 3);
                        }
                        return Unit.a;
                    }
                    if (ordinal2 != 2) {
                        b6e.s();
                        return null;
                    }
                }
                uri = uri2;
                String queryParameter22 = uri2.getQueryParameter("BrowserName");
                String queryParameter32 = uri2.getQueryParameter("machine_readable_login");
                if (queryParameter32 == null) {
                }
                com.yandex.passport.internal.l lVar32 = c;
                if (c == null) {
                }
                ordinal = hVar.ordinal();
                if (ordinal != 0) {
                }
                return Unit.a;
            case 16:
                nm6 nm6Var17 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.common.core.f L = com.yandex.plus.pay.ui.core.b.L((z1) ((d3) this.k).c.c);
                com.yandex.passport.internal.methods.performer.l lVar4 = (com.yandex.passport.internal.methods.performer.l) this.l;
                com.yandex.passport.internal.l e5 = lVar4.a.a().e(L);
                if (e5 != null) {
                    i iVar = lVar4.b;
                    iVar.getClass();
                    iVar.e.u(t.b, e5.b, null);
                    if (iVar.a.p(iVar.l.a(e5), "invalid_master_token")) {
                        com.yandex.passport.internal.core.announcing.b.d(iVar.b, p.c);
                    }
                }
                return Unit.a;
            case 17:
                nm6 nm6Var18 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.internal.core.tokens.b bVar2 = ((n) this.k).a;
                String str5 = ((com.yandex.passport.internal.entities.e) ((h3) this.l).c.c).a;
                bVar2.getClass();
                str5.getClass();
                Iterator it3 = bVar2.b.a().g().iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj3 = it3.next();
                        com.yandex.passport.internal.database.d dVar6 = bVar2.a;
                        com.yandex.passport.common.core.f fVar3 = ((com.yandex.passport.internal.l) obj3).b;
                        dVar6.getClass();
                        fVar3.getClass();
                        com.yandex.passport.internal.database.h hVar2 = dVar6.b;
                        hVar2.getClass();
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "getClientToken: uid=" + fVar3, 8);
                        }
                        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) hVar2.a.invoke();
                        String[] strArr = com.yandex.passport.internal.database.tables.a.e;
                        StringBuilder sb = new StringBuilder();
                        sb.append(fVar3.a.a);
                        sb.append(':');
                        sb.append(fVar3.b);
                        Cursor query = sQLiteDatabase.query("tokens", strArr, "uid = ?", new String[]{sb.toString()}, null, null, null);
                        try {
                            Cursor cursor = query;
                            if (cursor.moveToNext()) {
                                str = cursor.getString(cursor.getColumnIndexOrThrow("client_token"));
                                yd5.q(query, null);
                            } else {
                                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "getClientToken: no token for uid " + fVar3, 8);
                                }
                                yd5.q(query, null);
                                str = null;
                            }
                            if (Intrinsics.d(str, str5)) {
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                yd5.q(query, th);
                                throw th2;
                            }
                        }
                    } else {
                        obj3 = null;
                    }
                }
                com.yandex.passport.internal.l lVar5 = (com.yandex.passport.internal.l) obj3;
                com.yandex.passport.internal.core.tokens.a aVar = bVar2.c;
                aVar.getClass();
                com.yandex.passport.internal.database.d dVar7 = aVar.a;
                dVar7.getClass();
                com.yandex.passport.internal.database.h hVar3 = dVar7.b;
                hVar3.getClass();
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "dropClientToken: tokenValue.length=" + str5.length(), 8);
                }
                int delete = ((SQLiteDatabase) hVar3.b.invoke()).delete("tokens", "client_token = ?", new String[]{str5});
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "dropClientToken(tokenValue): rows=" + delete, 8);
                }
                o0 o0Var = aVar.b;
                com.yandex.passport.common.core.f fVar4 = lVar5 != null ? lVar5.b : null;
                o0Var.getClass();
                xy0 xy0Var = new xy0(0);
                if (fVar4 != null) {
                    xy0Var.put("uid", String.valueOf(fVar4.b));
                }
                o0Var.a.b(j.c, xy0Var);
                return Unit.a;
            case 18:
                nm6 nm6Var19 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.common.core.f L2 = com.yandex.plus.pay.ui.core.b.L((z1) ((m3) this.k).c.c);
                com.yandex.passport.internal.l e6 = ((r) this.l).a.a().e(L2);
                if (e6 != null) {
                    return com.yandex.plus.core.locale.b.B(e6);
                }
                throw new com.yandex.passport.api.exception.b(L2);
            case 19:
                nm6 nm6Var20 = nm6.a;
                qgg.h0(obj);
                h4 h4Var = (h4) this.k;
                com.yandex.passport.common.core.f L3 = com.yandex.plus.pay.ui.core.b.L((z1) h4Var.c.c);
                com.yandex.passport.internal.helper.j jVar = ((j0) this.l).a;
                boolean booleanValue = ((Boolean) h4Var.d.c).booleanValue();
                jVar.getClass();
                com.yandex.passport.internal.l e7 = jVar.a.a().e(L3);
                if (e7 == null) {
                    throw new com.yandex.passport.api.exception.b(L3);
                }
                com.yandex.passport.internal.network.client.g a2 = jVar.b.a(e7.b.a);
                com.yandex.passport.common.account.a aVar2 = e7.d;
                aVar2.getClass();
                com.yandex.passport.common.network.n nVar = a2.b;
                String d = aVar2.d();
                d.getClass();
                com.yandex.passport.common.network.n nVar2 = new com.yandex.passport.common.network.n((String) nVar.Q().b, 0);
                nVar2.J("/1/bundle/account/");
                nVar2.F("Ya-Consumer-Authorization", "OAuth ".concat(d));
                nVar2.O("need_display_name_variants", Boolean.toString(booleanValue));
                nVar2.O("need_social_profiles", Boolean.toString(false));
                Object c3 = a2.c(nVar2.z(), com.yandex.passport.internal.network.client.e.a);
                c3.getClass();
                return (com.yandex.passport.internal.entities.r) c3;
            case 20:
                nm6 nm6Var21 = nm6.a;
                qgg.h0(obj);
                String str6 = (String) ((q4) this.k).c.c;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "getUidByNormalizedLogin: normalizedLogin = " + str6, 8);
                }
                d a3 = ((r0) this.l).a.a();
                Iterator it4 = a3.a.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        lVar = a3.b.b((com.yandex.passport.internal.b) it4.next());
                        if (lVar != null) {
                            String str7 = lVar.e.g;
                            if (str6 != null && str7 != null && TextUtils.equals(str6, str7)) {
                            }
                        }
                    } else {
                        lVar = null;
                    }
                }
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "getUidByNormalizedLogin: account = " + lVar, 8);
                }
                if (lVar == null || (fVar2 = lVar.b) == null) {
                    throw new com.yandex.passport.api.exception.b("normalized display login", str6);
                }
                return com.yandex.plus.pay.ui.core.b.J(fVar2);
            case 21:
                nm6 nm6Var22 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.internal.common.a aVar3 = ((b1) this.k).a;
                Boolean bool = (Boolean) ((x4) this.l).c.c;
                bool.getClass();
                xdr xdrVar = ((com.yandex.passport.internal.common.b) aVar3).a;
                xdrVar.getClass();
                xdrVar.m(null, bool);
                return Unit.a;
            case 22:
                nm6 nm6Var23 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.common.core.f L4 = com.yandex.plus.pay.ui.core.b.L((z1) ((c5) this.k).c.c);
                com.yandex.passport.internal.helper.j jVar2 = ((e1) this.l).a;
                jVar2.getClass();
                jVar2.e.getClass();
                long currentTimeMillis = System.currentTimeMillis();
                com.yandex.passport.internal.storage.m mVar2 = jVar2.d;
                mVar2.getClass();
                com.yandex.passport.internal.storage.e eVar2 = new com.yandex.passport.internal.storage.e(mVar2, L4);
                List list5 = (List) eVar2.c.getValue(eVar2, com.yandex.passport.internal.storage.e.d[2]);
                ArrayList arrayList3 = new ArrayList();
                for (Object obj5 : list5) {
                    if (currentTimeMillis - ((Number) obj5).longValue() < com.yandex.passport.internal.helper.j.i) {
                        arrayList3.add(obj5);
                    }
                }
                if (arrayList3.size() >= 10) {
                    j1 j1Var2 = jVar2.g;
                    j1Var2.getClass();
                    j1Var2.n(dd.d, new ff(L4));
                    throw new com.yandex.passport.api.exception.i("Account sync limit exceeded. Please try later.");
                }
                ArrayList h0 = CollectionsKt.h0(arrayList3, Long.valueOf(currentTimeMillis));
                com.yandex.passport.internal.storage.e eVar3 = new com.yandex.passport.internal.storage.e(mVar2, L4);
                eVar3.c.setValue(eVar3, com.yandex.passport.internal.storage.e.d[2], h0);
                com.yandex.passport.internal.l e8 = jVar2.a.a().e(L4);
                if (e8 == null) {
                    throw new com.yandex.passport.api.exception.b(L4);
                }
                jVar2.c.a(e8.g, true);
                return Unit.a;
            case 23:
                nm6 nm6Var24 = nm6.a;
                qgg.h0(obj);
                ((f) this.k).a.getClass();
                return new com.yandex.passport.internal.provider.communication.h(null);
            case 24:
                nm6 nm6Var25 = nm6.a;
                qgg.h0(obj);
                m mVar3 = (m) this.k;
                h0 a4 = mVar3.m.a((Bundle) this.l);
                long j = a4.f;
                com.yandex.passport.internal.l k = mVar3.k(m0.f(a4), j);
                if (k == null) {
                    xq0.q(dfi.d(j, "No authorized account with "));
                    return null;
                }
                f0 f0Var = mVar3.o;
                com.yandex.passport.common.core.f fVar5 = k.b;
                f0Var.getClass();
                fVar5.getClass();
                return f0Var.e(fVar5, a4.m, a4.s);
            case 25:
                nm6 nm6Var26 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.common.logger.d dVar8 = com.yandex.passport.common.logger.a.a;
                a aVar4 = (a) this.l;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "recording method entity: " + aVar4, 8);
                }
                com.yandex.passport.internal.database.diary.c cVar2 = ((e0) this.k).b;
                cVar2.getClass();
                aVar4.getClass();
                Long l = new Long(((Long) up6.F(cVar2.a, false, true, new itv(23, cVar2, aVar4))).longValue());
                com.yandex.passport.common.logger.b bVar3 = com.yandex.passport.common.logger.b.b;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(bVar3, null, dfi.d(l.longValue(), "method entity recorded with id="), 10);
                }
                return l;
            case 26:
                nm6 nm6Var27 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.common.logger.d dVar9 = com.yandex.passport.common.logger.a.a;
                com.yandex.passport.internal.database.diary.b bVar4 = (com.yandex.passport.internal.database.diary.b) this.l;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "parameter entity recorded: " + bVar4, 8);
                }
                com.yandex.passport.internal.database.diary.c cVar3 = ((e0) this.k).b;
                cVar3.getClass();
                bVar4.getClass();
                Long l2 = new Long(((Long) up6.F(cVar3.a, false, true, new itv(22, cVar3, bVar4))).longValue());
                com.yandex.passport.common.logger.b bVar5 = com.yandex.passport.common.logger.b.b;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(bVar5, null, dfi.d(l2.longValue(), "parameter entity recorded with id="), 10);
                }
                return l2;
            case 27:
                nm6 nm6Var28 = nm6.a;
                qgg.h0(obj);
                com.yandex.passport.internal.database.diary.e eVar4 = ((q0) this.k).a;
                com.yandex.passport.internal.database.diary.f fVar6 = (com.yandex.passport.internal.database.diary.f) this.l;
                eVar4.getClass();
                PassportDatabase_Impl passportDatabase_Impl = eVar4.a;
                return (com.yandex.passport.internal.database.diary.f) up6.F(passportDatabase_Impl, true, false, new fn1(((Long) up6.F(passportDatabase_Impl, false, true, new itv(24, eVar4, fVar6))).longValue(), i));
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                nm6 nm6Var29 = nm6.a;
                qgg.h0(obj);
                ((phg) ((com.yandex.passport.internal.sloth.performers.f) this.k).e.getValue()).d((l83) this.l);
                return Unit.a;
            default:
                nm6 nm6Var30 = nm6.a;
                qgg.h0(obj);
                ((Function1) this.k).invoke((d0) this.l);
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j9w(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = obj;
    }
}
