package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.SensorManager;
import com.yandex.pulse.metrics.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.search.SearchActivity;
import ru.yandex.music.slides.SlidesScreenActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class oxo implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oxo(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object obj;
        u7e u7eVar;
        String str;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(((mxo) this.b).b());
            case 1:
                SearchActivity searchActivity = (SearchActivity) this.b;
                int i = SearchActivity.Z;
                return new rbb((n5p) searchActivity.getIntent().getParcelableExtra("extra.for.entity.search"));
            case 2:
                p2p p2pVar = (p2p) this.b;
                return new h0h(p2pVar.c.a, p2pVar.d.a);
            case 3:
                m7n m7nVar = (m7n) this.b;
                k7n k7nVar = (k7n) m7nVar.g.getValue();
                i7n i7nVar = k7nVar instanceof i7n ? (i7n) k7nVar : null;
                if (i7nVar != null) {
                    if (m7nVar.c.c()) {
                        m7nVar.d.invoke(i7nVar.c, new ebm(0, m7nVar, m7n.class, "playWave", "playWave()V", 0, 27));
                    } else {
                        owu owuVar = m7nVar.i;
                        if (owuVar != null) {
                            owuVar.b((qmu) owuVar.c().getValue());
                        }
                    }
                }
                return Unit.a;
            case 4:
                q6p q6pVar = (q6p) this.b;
                l18 l18Var = l18.b;
                bdt I = hag.I(kze.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                return new rsj((kze) qdcVar.C(I), q6pVar.a);
            case 5:
                Iterator it = ((s9p) this.b).a.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((g9p) obj) instanceof k7h) {
                        }
                    } else {
                        obj = null;
                    }
                }
                g9p g9pVar = (g9p) obj;
                if (g9pVar != null) {
                    return (k7h) g9pVar;
                }
                return null;
            case 6:
                return this.b;
            case 7:
                ohp ohpVar = (ohp) this.b;
                return Integer.valueOf(v7g.A(ohpVar, ohpVar.k));
            case 8:
                jpp jppVar = (jpp) this.b;
                return new tnb(jppVar.b, jppVar.a, objArr == true ? 1 : 0, 28);
            case 9:
                lpp lppVar = (lpp) this.b;
                return new jpp(lppVar.g.m(), lppVar.j);
            case 10:
                jrp jrpVar = (jrp) ((ts2) this.b).a;
                return new fpp((irp) jrpVar.e.getValue(), (grp) jrpVar.g.getValue(), ((oq7) jrpVar.c.getValue()).c.j, (hrp) jrpVar.f.getValue(), (z66) jrpVar.d.getValue());
            case 11:
                wtp wtpVar = (wtp) this.b;
                SensorManager sensorManager = wtpVar.b;
                if (sensorManager != null) {
                    sensorManager.unregisterListener(wtpVar);
                }
                wtpVar.b = null;
                return Unit.a;
            case 12:
                return new mxp((owp) ((jyr) ((eg0) this.b).g).getValue());
            case 13:
                return o8g.E(((v1q) this.b).b);
            case 14:
                return Integer.valueOf(((f4i) ((q2q) ((cr) ((sfm) this.b).b).e).invoke()).a);
            case 15:
                sfm sfmVar = ((se5) this.b).d;
                sfmVar.getClass();
                List list = (List) x97.D(g.a, new g2l(sfmVar, objArr2 == true ? 1 : 0, 24));
                ArrayList arrayList = new ArrayList(v75.o(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList.add(((mqs) it2.next()).a);
                }
                return arrayList;
            case 16:
                return ((u6q) this.b).a();
            case 17:
                return new mka(((o4c) ((xu6) this.b).invoke()).a);
            case 18:
                s8q s8qVar = (s8q) this.b;
                rfn rfnVar = s8qVar.g;
                nur nurVar = rfnVar.a;
                long g = s8qVar.i.g();
                nnd nndVar = (nnd) nurVar.c;
                x97.y((tf6) nndVar.c, null, null, new mj0(nndVar, g, (Continuation) null, 5), 3).R(new mjm(8, nndVar));
                agn agnVar = s8qVar.j;
                agnVar.getClass();
                rfnVar.getClass();
                AtomicReference atomicReference = agnVar.a;
                while (!atomicReference.compareAndSet(rfnVar, null) && atomicReference.get() == rfnVar) {
                }
                xdr xdrVar = s8qVar.n;
                s7q s7qVar = new s7q(s8qVar);
                xdrVar.getClass();
                xdrVar.m(null, s7qVar);
                return Unit.a;
            case 19:
                ((owu) this.b).d();
                return Unit.a;
            case 20:
                return Float.valueOf(((jnu) this.b) instanceof hnu ? 0.0f : 1.0f);
            case 21:
                return new ddr((diw) this.b);
            case 22:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) this.b;
                sQLiteDatabase.getClass();
                Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT instance_uid FROM ExoPlayerVersions WHERE feature = 1", new String[0]);
                rawQuery.getClass();
                Cursor cursor = rawQuery;
                try {
                    Cursor cursor2 = cursor;
                    ArrayList arrayList2 = new ArrayList();
                    rawQuery.moveToFirst();
                    while (!rawQuery.isAfterLast()) {
                        arrayList2.add(rawQuery.getString(0));
                        rawQuery.moveToNext();
                    }
                    cursor.close();
                    String str2 = (String) CollectionsKt.l0(arrayList2);
                    if (str2 == null) {
                        ssg.a(7, "SimpleCacheStorageMigration", dfi.c(arrayList2.size(), "cannot read uid from database (", ")"), null);
                    } else {
                        String concat = "ExoPlayerCacheIndex".concat(str2);
                        Cursor rawQuery2 = sQLiteDatabase.rawQuery("SELECT id, key FROM ".concat(concat), new String[0]);
                        rawQuery2.getClass();
                        Cursor cursor3 = rawQuery2;
                        try {
                            Cursor cursor4 = cursor3;
                            ArrayList arrayList3 = new ArrayList();
                            rawQuery2.moveToFirst();
                            while (!rawQuery2.isAfterLast()) {
                                arrayList3.add(new Pair(Long.valueOf(rawQuery2.getLong(0)), rawQuery2.getString(1)));
                                rawQuery2.moveToNext();
                            }
                            cursor3.close();
                            Map n = uah.n(arrayList3);
                            LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(n.size()));
                            for (Map.Entry entry : n.entrySet()) {
                                Object key = entry.getKey();
                                String str3 = (String) entry.getValue();
                                str3.getClass();
                                try {
                                    s7e s7eVar = new s7e();
                                    s7eVar.h(null, str3);
                                    u7eVar = s7eVar.e();
                                } catch (IllegalArgumentException unused) {
                                    u7eVar = null;
                                }
                                if (u7eVar == null) {
                                    str = null;
                                } else {
                                    s7e f = u7eVar.f();
                                    etn.g0(f, u7eVar);
                                    str = f.e().i;
                                }
                                linkedHashMap.put(key, str);
                            }
                            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                            for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                                Object value = entry2.getValue();
                                if (value != null) {
                                    linkedHashMap2.put(entry2.getKey(), value);
                                }
                            }
                            for (Pair pair : wah.r(linkedHashMap2)) {
                                sQLiteDatabase.execSQL(hrg.q("UPDATE ", concat, " SET key = ? WHERE id = ?"), new Object[]{(String) pair.b, Long.valueOf(((Number) pair.a).longValue())});
                            }
                        } finally {
                        }
                    }
                    return Unit.a;
                } finally {
                }
            case 23:
                vqn vqnVar = (vqn) this.b;
                int i2 = vqnVar.a;
                vqnVar.a = i2 + 1;
                return Integer.valueOf(i2);
            case 24:
                kkq kkqVar = (kkq) this.b;
                return new eke(kkqVar.d, new gke(kkqVar.c));
            case 25:
                dmq dmqVar = (dmq) this.b;
                Function1 function1 = dmqVar.a;
                l13 l13Var = dmqVar.b;
                if (l13Var != null) {
                    return function1.invoke(l13Var);
                }
                Intrinsics.j("binder");
                throw null;
            case 26:
                return new p6o(((oq7) ((jyr) ((ju0) this.b).f).getValue()).a.d, 25);
            case 27:
                nvq nvqVar = (nvq) this.b;
                return zsd.F0(new ub7(12, nvqVar.d.M(), new v5p((Object) nvqVar, (Continuation) (objArr3 == true ? 1 : 0), 29)), nvqVar.g, new hdr(0L, Long.MAX_VALUE), jwq.a);
            case o.VARIATIONS_SEED_VERSION_FIELD_NUMBER /* 28 */:
                SlidesScreenActivity slidesScreenActivity = (SlidesScreenActivity) this.b;
                int i3 = SlidesScreenActivity.y;
                return (zvq) slidesScreenActivity.getIntent().getParcelableExtra("extra.slides_params");
            default:
                return new cvo(wjb.SlidesScreen, hlb.Fullscreen, (glb) null, (dvo) null, new avo(pkb.Slide, ((zvq) this.b).d()), 44);
        }
    }
}
