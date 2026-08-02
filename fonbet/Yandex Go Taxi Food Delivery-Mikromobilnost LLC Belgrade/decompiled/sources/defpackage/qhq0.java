package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Xml;
import androidx.room.RoomDatabase;
import com.yandex.go.flex.main_screen.api.data.SupermapInteractionState;
import com.yandex.go.mainscreen.superapp.impl.header.experiment.SuperAppConfigMenuExperiment;
import com.yandex.go.mainscreen.superapp.orders.presentation.ui.SuperAppMainScreenOrdersView;
import com.yandex.go.payments.data.k;
import com.yandex.go.payments.shared.data.CoopAccountApi;
import com.yandex.go.payments.shared.x;
import com.yandex.go.pin.api.a;
import com.yandex.go.splash.SplashComponent;
import com.yandex.messaging.files.SharingFileProvider;
import com.yandex.messaging.internal.storage.i;
import gom.yandex.go.web.statics.data.b;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import json.state.disk.storage.feature.c;
import kotlin.Pair;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.r0;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.TaxiApplication;
import ru.yandex.taxi.experiments.storage.StoredExperimentsDatabase_Impl;
import ru.yandex.taxi.map_common.map.TaxiMapView;
import ru.yandex.taxi.map_common.map.p;
import ru.yandex.taxi.network.api.models.GoApiName;

/* loaded from: classes8.dex */
public final /* synthetic */ class qhq0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qhq0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r1v29, types: [k4w0] */
    /* JADX WARN: Type inference failed for: r5v19, types: [v900] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [int] */
    /* JADX WARN: Type inference failed for: r5v9, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v12 */
    @Override // defpackage.sls
    public final Object invoke() {
        List fileProviderHelpers_delegate$lambda$1;
        Object obj;
        boolean z;
        boolean z2;
        n450 nativeSplashViewHolder_delegate$lambda$0;
        yaf0 yaf0Var;
        String D;
        qt2 appDependencyProvider_delegate$lambda$0;
        AttributeSet attributeSet;
        boolean z3 = false;
        int i = 2;
        boolean z4 = true;
        switch (this.a) {
            case 0:
                k kVar = (k) this.b;
                return kVar.b.a(b64.j(kVar.c.getApplicationId(), ".LpmSelectedPayment"));
            case 1:
                return (sei0) ((elr) this.b).a.a.get();
            case 2:
                return this.b;
            case 3:
                asq0 asq0Var = (asq0) this.b;
                return Integer.valueOf(tje.H(asq0Var, asq0Var.k));
            case 4:
                return Boolean.valueOf(!((znr0) this.b).a.b.g().c.a.isEmpty());
            case 5:
                on2 on2Var = ((x) this.b).a;
                on2Var.getClass();
                return (CoopAccountApi) on2Var.a(GoApiName.TaxiV4, CoopAccountApi.class);
            case 6:
                m8t0 m8t0Var = ((a) this.b).n;
                if (m8t0Var != null) {
                    m8t0Var.run();
                }
                return zy11.a;
            case 7:
                hjv hjvVar = (hjv) this.b;
                String c = hjvVar.c();
                RoomDatabase roomDatabase = (RoomDatabase) hjvVar.a;
                roomDatabase.t0();
                roomDatabase.u0();
                return roomDatabase.D0().getWritableDatabase().g(c);
            case 8:
                fileProviderHelpers_delegate$lambda$1 = SharingFileProvider.fileProviderHelpers_delegate$lambda$1((SharingFileProvider) this.b);
                return fileProviderHelpers_delegate$lambda$1;
            case 9:
                return ((com.yandex.go.benefits_center.benefits.sdk.descriptors.a) this.b).b;
            case 10:
                return ((com.yandex.go.benefits_center.benefits.sdk.descriptors.a) this.b).b;
            case 11:
                n3t0 n3t0Var = (n3t0) this.b;
                while (true) {
                    Object obj2 = n3t0Var.g;
                    synchronized (obj2) {
                        try {
                            if (n3t0Var.c) {
                                obj = obj2;
                                z = z4;
                            } else {
                                n3t0Var.c = z4;
                                try {
                                    wz40 wz40Var = n3t0Var.f;
                                    Object[] objArr = wz40Var.a;
                                    int i2 = wz40Var.c;
                                    for (?? r7 = z3; r7 < i2; r7++) {
                                        try {
                                            m3t0 m3t0Var = (m3t0) objArr[r7];
                                            iz40 iz40Var = m3t0Var.g;
                                            tls tlsVar = m3t0Var.a;
                                            Object[] objArr2 = iz40Var.b;
                                            long[] jArr = iz40Var.a;
                                            int length = jArr.length - i;
                                            if (length >= 0) {
                                                ?? r13 = z3;
                                                while (true) {
                                                    long j = jArr[r13];
                                                    obj = obj2;
                                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i3 = 8 - ((~(r13 - length)) >>> 31);
                                                        z2 = z4;
                                                        for (?? r5 = z3; r5 < i3; r5++) {
                                                            if ((j & 255) < 128) {
                                                                try {
                                                                    tlsVar.invoke(objArr2[(r13 << 3) + r5]);
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    z3 = false;
                                                                    n3t0Var.c = z3;
                                                                    throw th;
                                                                }
                                                            }
                                                            j >>= 8;
                                                        }
                                                        if (i3 == 8) {
                                                        }
                                                    } else {
                                                        z2 = z4;
                                                    }
                                                    if (r13 != length) {
                                                        z4 = z2;
                                                        z3 = false;
                                                        obj2 = obj;
                                                        r13++;
                                                    }
                                                }
                                            } else {
                                                obj = obj2;
                                                z2 = z4;
                                            }
                                            iz40Var.b();
                                            z4 = z2;
                                            z3 = false;
                                            i = 2;
                                            obj2 = obj;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj = obj2;
                                        }
                                    }
                                    obj = obj2;
                                    z = z4;
                                    try {
                                        n3t0Var.c = z3;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    obj = obj2;
                                }
                            }
                            if (!n3t0Var.b()) {
                                return zy11.a;
                            }
                            z4 = z;
                            i = 2;
                        } catch (Throwable th5) {
                            th = th5;
                            obj = obj2;
                        }
                    }
                }
            case 12:
                nativeSplashViewHolder_delegate$lambda$0 = SplashComponent.nativeSplashViewHolder_delegate$lambda$0((SplashComponent) this.b);
                return nativeSplashViewHolder_delegate$lambda$0;
            case 13:
                return (a6d0) ((uyi) this.b).b;
            case 14:
                b bVar = (b) this.b;
                OkHttpClient.a aVar = new OkHttpClient.a();
                aVar.l = (sa7) bVar.a.getValue();
                o430 o430Var = e3n.b;
                DurationUnit durationUnit = DurationUnit.SECONDS;
                aVar.x = bg61.c(kp50.U(10, durationUnit));
                aVar.z = bg61.c(kp50.U(10, durationUnit));
                aVar.A = bg61.c(kp50.U(10, durationUnit));
                aVar.f = true;
                return new OkHttpClient(aVar);
            case 15:
                i iVar = (i) this.b;
                kse kseVar = iVar.f;
                x22 x22Var = iVar.d;
                Set<String> set = iVar.h;
                kseVar.getClass();
                Looper.myLooper();
                z83.i();
                if (!iVar.i) {
                    iVar.i = true;
                    if (set.isEmpty()) {
                        x22Var.reportEvent("tech_flush_outdated_profiles_empty");
                    } else {
                        try {
                            x22Var.reportEvent("tech_flush_outdated_profiles_started");
                            Set a = iVar.a(set);
                            Set b = iVar.b(set);
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            for (String str : set) {
                                if (iVar.e(i5b1.d(iVar.a, str))) {
                                    linkedHashSet.add(str);
                                }
                            }
                            Set N0 = kotlin.collections.a.N0(linkedHashSet);
                            x22Var.reportEvent("tech_flush_outdated_profiles", kotlin.collections.b.i(new Pair("prefsCount", Integer.valueOf(b.size())), new Pair("profileCount", Integer.valueOf(a.size())), new Pair("imageCaches", Integer.valueOf(N0.size())), new Pair("failedPrefsCount", Integer.valueOf(v4r0.g(set, b).size())), new Pair("failedProfileCount", Integer.valueOf(v4r0.g(set, a).size())), new Pair("failedImageCaches", Integer.valueOf(v4r0.g(set, N0).size()))));
                            Set<String> g = v4r0.g(iVar.c(), a);
                            SharedPreferences.Editor edit = iVar.e.edit();
                            edit.putStringSet("OUTDATED_PROFILES", g);
                            edit.commit();
                        } catch (Throwable th6) {
                            x22Var.reportError("tech_flush_outdated_profiles_error", th6);
                        }
                    }
                }
                return zy11.a;
            case 16:
                return new kku0((StoredExperimentsDatabase_Impl) this.b);
            case 17:
                return (SuperAppConfigMenuExperiment) ((jbh) ((usv0) this.b).a).e(SuperAppConfigMenuExperiment.d).c();
            case 18:
                return (sei0) ((a1w0) this.b).a.a.a.get();
            case 19:
                w601 w601Var = ((r2w0) this.b).J;
                return (w601Var == null || (yaf0Var = w601Var.a) == null || (D = vez0.D(yaf0Var)) == null) ? vez0.D(yaf0.b) : D;
            case 20:
                final o4w0 o4w0Var = (o4w0) this.b;
                mag magVar = o4w0Var.h0;
                if (magVar == null) {
                    ny61.g("Required value was null.");
                    return null;
                }
                d0g d0gVar = ((c0g) magVar.a).A.a;
                c0g c0gVar = d0gVar.b;
                klr j2 = ((lt2) c0gVar.z.g.get()).j();
                yvi0 yvi0Var = new yvi0((r900) d0gVar.q3.get());
                rl60 rl60Var = new rl60((Context) c0gVar.U.get(), z3);
                ?? r52 = yvi0Var;
                if (!j2.a()) {
                    r52 = rl60Var;
                }
                return r52.c(new t2w0() { // from class: k4w0
                    @Override // defpackage.t2w0
                    public final SuperAppMainScreenOrdersView create() {
                        mag magVar2 = o4w0.this.h0;
                        if (magVar2 != null) {
                            return magVar2.a();
                        }
                        ny61.g("Required value was null.");
                        return null;
                    }
                });
            case 21:
                return new AtomicReference(((tew0) this.b).b.c());
            case 22:
                com.yandex.go.suggest.impl.data.flex.a aVar2 = (com.yandex.go.suggest.impl.data.flex.a) this.b;
                return new json.state.disk.storage.feature.b(aVar2.b, (c) aVar2.c.getValue());
            case 23:
                return (zew0) this.b;
            case 24:
                return (r2h) this.b;
            case 25:
                return (s6s0) this.b;
            case 26:
                ((lhw0) this.b).a.getClass();
                return new g92(i, SupermapInteractionState.IDLE);
            case 27:
                pex0 pex0Var = (pex0) this.b;
                List list = pex0Var.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    lmw0 lmw0Var = (lmw0) obj3;
                    if (lmw0Var.h().isEmpty() || (pex0Var.K0 && lmw0Var.k(pex0Var.b))) {
                        arrayList.add(obj3);
                    }
                }
                return arrayList;
            case 28:
                appDependencyProvider_delegate$lambda$0 = TaxiApplication.appDependencyProvider_delegate$lambda$0((TaxiApplication) this.b);
                return appDependencyProvider_delegate$lambda$0;
            default:
                p pVar = (p) this.b;
                Context context = pVar.a;
                XmlResourceParser xml = context.getResources().getXml(p4i0.taxi_map_view_wrapper);
                try {
                    xml.next();
                    xml.nextTag();
                    attributeSet = Xml.asAttributeSet(xml);
                } catch (Exception unused) {
                    jst.e.getClass();
                    attributeSet = null;
                }
                TaxiMapView taxiMapView = new TaxiMapView(context, attributeSet, 0, 4, null);
                r0 r0Var = pVar.y;
                r0Var.getClass();
                r0Var.m(null, taxiMapView);
                ((rwx0) pVar.w.get()).a(taxiMapView);
                return taxiMapView;
        }
    }
}
