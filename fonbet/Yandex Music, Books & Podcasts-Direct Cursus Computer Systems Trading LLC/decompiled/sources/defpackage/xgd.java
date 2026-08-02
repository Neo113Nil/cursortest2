package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.b1;
import androidx.core.app.f0;
import androidx.core.app.z;
import androidx.core.graphics.drawable.IconCompat;
import com.yandex.music.shared.glagol.api.domain.GlagolTargetException;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import ru.yandex.music.data.wave.recommendations.StationId;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class xgd implements b0q {
    public final Object a;
    public boolean b;
    public boolean c;
    public final Object d;
    public final Object e;
    public final Object f;
    public Object g;

    public xgd(Context context) {
        context.getClass();
        Context applicationContext = context.getApplicationContext();
        this.d = applicationContext instanceof Application ? (Application) applicationContext : null;
        Set newSetFromMap = Collections.newSetFromMap(new WeakHashMap());
        newSetFromMap.getClass();
        this.a = newSetFromMap;
        this.e = new uf2(5, this);
        this.f = new bbv();
        this.g = new Object();
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x004a, code lost:
    
        if (r2 == r4) goto L66;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x011a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(xgd xgdVar, re5 re5Var, cg6 cg6Var) {
        wgd wgdVar;
        int i;
        List list;
        int intValue;
        Double d;
        re5 re5Var2 = re5Var;
        if (cg6Var instanceof wgd) {
            wgdVar = (wgd) cg6Var;
            int i2 = wgdVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wgdVar.m = i2 - Integer.MIN_VALUE;
                Object obj = wgdVar.k;
                nm6 nm6Var = nm6.a;
                i = wgdVar.m;
                int i3 = 1;
                if (i != 0) {
                    qgg.h0(obj);
                    sfm sfmVar = re5Var2.a;
                    wgdVar.j = re5Var2;
                    wgdVar.m = 1;
                    obj = sfmVar.m(wgdVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            qgg.h0(obj);
                            return obj;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    re5Var2 = wgdVar.j;
                    qgg.h0(obj);
                }
                list = (List) obj;
                if (!list.isEmpty()) {
                    throw new GlagolTargetException("No tracks found in " + re5Var2);
                }
                int i4 = re5Var2.b;
                mqs mqsVar = re5Var2.c;
                Integer num = new Integer(i4);
                Continuation continuation = null;
                if (num.intValue() == -1) {
                    num = null;
                }
                List list2 = list;
                IntRange f = u75.f(list2);
                if (num == null || !f.q(num.intValue())) {
                    num = null;
                }
                if (num != null) {
                    intValue = num.intValue();
                } else {
                    Integer num2 = new Integer(list.indexOf(mqsVar));
                    if (num2.intValue() == -1) {
                        num2 = null;
                    }
                    intValue = num2 != null ? num2.intValue() : re5Var2.d ? yhn.j(u75.f(list2), phn.a) : 0;
                }
                mqs mqsVar2 = (mqs) list.get(intValue);
                if (re5Var2.b == intValue || Intrinsics.d(mqsVar, mqsVar2)) {
                    Long l = new Long(re5Var2.e);
                    if (l.longValue() < 0) {
                        l = null;
                    }
                    if (l != null) {
                        d = new Double(l.longValue() / 1000);
                        Function1 ikcVar = mqsVar2 != null ? new ikc(i3, 2, continuation) : new lgd(new ygd(mqsVar2.a, mqsVar2.e, new Integer(intValue)), xgdVar.c, d == null ? d.doubleValue() : 0.0d, null);
                        wgdVar.j = null;
                        wgdVar.m = 2;
                        Object invoke = ikcVar.invoke(wgdVar);
                        return invoke != nm6Var ? nm6Var : invoke;
                    }
                }
                d = null;
                if (mqsVar2 != null) {
                }
                wgdVar.j = null;
                wgdVar.m = 2;
                Object invoke2 = ikcVar.invoke(wgdVar);
                if (invoke2 != nm6Var) {
                }
            }
        }
        wgdVar = new wgd(xgdVar, cg6Var);
        Object obj2 = wgdVar.k;
        nm6 nm6Var2 = nm6.a;
        i = wgdVar.m;
        int i32 = 1;
        if (i != 0) {
        }
        list = (List) obj2;
        if (!list.isEmpty()) {
        }
    }

    public static final void b(xgd xgdVar) {
        Object obj;
        HashSet u0;
        Object t7oVar;
        if (xgdVar.e()) {
            return;
        }
        Iterator it = ((Set) xgdVar.a).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Activity) obj).isInPictureInPictureMode()) {
                    break;
                }
            }
        }
        Activity activity = (Activity) obj;
        boolean isInPictureInPictureMode = activity == null ? false : activity.isInPictureInPictureMode();
        if (xgdVar.c != isInPictureInPictureMode) {
            xgdVar.c = isInPictureInPictureMode;
            bbv bbvVar = (bbv) xgdVar.f;
            synchronized (bbvVar.b) {
                u0 = CollectionsKt.u0(bbvVar.b);
            }
            Iterator it2 = u0.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                try {
                    r7o r7oVar = z7o.b;
                    ((rgu) next).b(xgdVar.c);
                    t7oVar = Unit.a;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                }
                Throwable a = z7o.a(t7oVar);
                if (a != null) {
                    Timber.INSTANCE.e(a, "notifyObservers", new Object[0]);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static mqs g(hgr hgrVar) {
        jzs jzsVar;
        xsu xsuVar = hgrVar.a;
        if (xsuVar instanceof wsu) {
            wsu wsuVar = (wsu) xsuVar;
            List list = wsuVar.a;
            vsu vsuVar = wsuVar.c;
            if (vsuVar instanceof ssu) {
                jzsVar = (jzs) list.get(((ssu) vsuVar).a);
            } else if (vsuVar instanceof tsu) {
                jzsVar = (jzs) CollectionsKt.Z(list);
            } else if (!Intrinsics.d(vsuVar, usu.a)) {
                b6e.s();
                return null;
            }
            if (jzsVar == null) {
                return jzsVar.a;
            }
            return null;
        }
        if (!Intrinsics.d(xsuVar, rsu.a) && !(xsuVar instanceof qsu)) {
            b6e.s();
            return null;
        }
        jzsVar = null;
        if (jzsVar == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00bf A[RETURN] */
    /* JADX WARN: Type inference failed for: r2v23, types: [ikc] */
    /* JADX WARN: Type inference failed for: r7v9, types: [pgd] */
    @Override // defpackage.b0q
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object B(aaq aaqVar) {
        Class cls;
        Function1 lgdVar;
        String str;
        String h;
        Pair pair;
        r9p r9pVar = r9p.a;
        l18 l18Var = l18.b;
        Integer num = (Integer) this.f;
        mqs mqsVar = (mqs) this.e;
        String str2 = (String) this.a;
        aaqVar.getClass();
        int i = 1;
        Continuation continuation = null;
        r8 = null;
        r8 = null;
        r8 = null;
        String str3 = null;
        if (!(aaqVar instanceof z9q)) {
            if (aaqVar instanceof caq) {
                StationId f = StationId.f(((caq) aaqVar).a);
                f.getClass();
                str2.getClass();
                return new pgd(ngd.GENERATIVE, f.h(), null, str2, null);
            }
            if (aaqVar instanceof gbq) {
                gbq gbqVar = (gbq) aaqVar;
                Function1 ikcVar = mqsVar == null ? new ikc(i, 2, continuation) : new lgd(new ygd(mqsVar.a, mqsVar.e, num), this.c, 0.0d, null);
                str2.getClass();
                bdt I = hag.I(byb.class);
                qdc qdcVar = l18Var.a;
                qdcVar.getClass();
                if (((thd) ((byb) qdcVar.C(I)).b(thd.class)).h()) {
                    s9p P = qgg.P(gbqVar);
                    if (P == null) {
                        P = new s9p(t75.c(r9pVar));
                    }
                    h = CollectionsKt.X(P.a, StringUtils.COMMA, null, null, new g4d(15), 30);
                } else {
                    h = StationId.e(gbqVar.d()).h();
                }
                return new pgd(ngd.RADIO, h, ikcVar, str2, null);
            }
            if (!(aaqVar instanceof dbq)) {
                if (aaqVar instanceof cbq) {
                    if (mqsVar == null) {
                        return new qgd("Could not get id of current track in PhonotekaOnly mode");
                    }
                    String str4 = mqsVar.a;
                    Integer valueOf = Integer.valueOf(num != null ? num.intValue() : 0);
                    str2.getClass();
                    return new ugd(new ov(new ygd(str4, mqsVar.e, valueOf), str4, str2, (Continuation) null));
                }
                if (aaqVar instanceof uaq) {
                    return new qgd("Unsupported video clip queue");
                }
                if (aaqVar instanceof paq) {
                    return new qgd("Unknown Ynison state for transition");
                }
                b6e.s();
                return null;
            }
            dbq dbqVar = (dbq) aaqVar;
            boolean z = this.c;
            if (mqsVar == null) {
                lgdVar = new ikc(i, 2, continuation);
                cls = byb.class;
            } else {
                cls = byb.class;
                lgdVar = new lgd(new ygd(mqsVar.a, mqsVar.e, num), z, 0.0d, null);
            }
            str2.getClass();
            bdt I2 = hag.I(cls);
            qdc qdcVar2 = l18Var.a;
            qdcVar2.getClass();
            if (((thd) ((byb) qdcVar2.C(I2)).b(thd.class)).h()) {
                s9p P2 = qgg.P(dbqVar);
                if (P2 == null) {
                    P2 = new s9p(t75.c(r9pVar));
                }
                str = CollectionsKt.X(P2.a, StringUtils.COMMA, null, null, new g4d(17), 30);
            } else {
                StationId f2 = StationId.f(dbqVar.a);
                if (Intrinsics.d(f2, StationId.a)) {
                    f2 = null;
                }
                if (f2 != null) {
                    str = f2.h();
                } else {
                    su4.s(2, null, "SharedYnisonWaveId.RawWithWave has invalid rawStationId. Falling back to UserWave", null);
                    str = "user:onyourwave";
                }
            }
            return new pgd(ngd.RADIO, str, lgdVar, str2, null);
        }
        z9q z9qVar = (z9q) aaqVar;
        lgd ikcVar2 = mqsVar == null ? new ikc(i, 2, continuation) : new lgd(new ygd(mqsVar.a, mqsVar.e, num), this.c, 0.0d, null);
        y9q y9qVar = y9q.a;
        str2.getClass();
        boolean z2 = z9qVar instanceof t9q;
        if (z2) {
            pair = new Pair(ngd.ALBUM, ((t9q) z9qVar).a);
        } else if (z9qVar instanceof u9q) {
            pair = new Pair(ngd.ARTIST, ((u9q) z9qVar).a);
        } else {
            if (!(z9qVar instanceof x9q)) {
                if (!z9qVar.equals(y9qVar)) {
                    b6e.s();
                    return null;
                }
                return continuation != null ? new qgd(f1d.g("Could not extrack GlagolCastTarget from id ", z9qVar.b())) : continuation;
            }
            pair = new Pair(ngd.PLAYLIST, z9qVar.b());
        }
        ngd ngdVar = (ngd) pair.a;
        String str5 = (String) pair.b;
        if (z9qVar instanceof w9q) {
            str3 = ((w9q) z9qVar).c;
        } else if (!(z9qVar instanceof v9q) && !z2 && !(z9qVar instanceof u9q) && !z9qVar.equals(y9qVar)) {
            b6e.s();
            return null;
        }
        continuation = new pgd(ngdVar, str5, ikcVar2, str2, str3);
        if (continuation != null) {
        }
    }

    @Override // defpackage.b0q
    public Object D(yc5 yc5Var) {
        yc5Var.getClass();
        return f(yc5Var);
    }

    @Override // defpackage.b0q
    public Object F(doc docVar) {
        docVar.getClass();
        return new qgd("FmRadioContentId: not supported by Glagol Cast");
    }

    @Override // defpackage.b0q
    public Object G(xc5 xc5Var) {
        xc5Var.getClass();
        return f(xc5Var);
    }

    @Override // defpackage.b0q
    public Object M(g1q g1qVar) {
        g1qVar.getClass();
        if (this.b) {
            return rgd.a;
        }
        ced cedVar = ((odd) ((jyr) this.g).getValue()).l;
        if (cedVar == null) {
            return new qgd("Station is not connected but recieved a glagol content id");
        }
        final String str = (String) this.a;
        t1q t1qVar = (t1q) cedVar.r.k.getValue();
        vhd vhdVar = (vhd) cedVar.u.getValue();
        str.getClass();
        t1qVar.getClass();
        vhdVar.getClass();
        final ygd ygdVar = new ygd(vhdVar.a, vhdVar.f, null);
        final double d = vhdVar.e / 1000;
        arf a = btf.a(bwf.c, new Function0() { // from class: igd
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new tgd(ygd.this, d, str);
            }
        });
        z3q z3qVar = t1qVar.a;
        qhd e = z3qVar.e();
        String str2 = e.a;
        if (str2 == null) {
            return (tgd) a.getValue();
        }
        String str3 = e.c;
        if (str3 == null) {
            return new qgd("Glagol Entity with id but with unknown type");
        }
        jgd jgdVar = new jgd(ygdVar, d, null);
        if (z3qVar instanceof u1q) {
            return new pgd(ngd.RADIO, str2, jgdVar, str, null);
        }
        if (z3qVar instanceof a2q) {
            return new pgd(ngd.TRACK, str2, jgdVar, str, null);
        }
        if (z3qVar instanceof c1q) {
            return new pgd(ngd.ALBUM, str2, jgdVar, str, null);
        }
        if (z3qVar instanceof e1q) {
            return new pgd(ngd.ARTIST, str2, jgdVar, str, null);
        }
        if (z3qVar instanceof r1q) {
            return new pgd(ngd.PLAYLIST, str2, jgdVar, str, null);
        }
        if (z3qVar instanceof h1q) {
            return new pgd(ngd.GENERATIVE, str2, jgdVar, str, null);
        }
        if (z3qVar instanceof k1q) {
            return new sgd(new lfd(null, str3, str2, ygdVar, Double.valueOf(d), str));
        }
        b6e.s();
        return null;
    }

    @Override // defpackage.b0q
    public Object N(cd5 cd5Var) {
        cd5Var.getClass();
        return f(cd5Var);
    }

    @Override // defpackage.b0q
    public Object R(w3d w3dVar) {
        w3dVar.getClass();
        d5d d5dVar = w3dVar.a;
        d5dVar.getClass();
        StationId stationId = new StationId(d5dVar.a, d5dVar.b);
        String str = (String) this.a;
        str.getClass();
        return new pgd(ngd.GENERATIVE, stationId.h(), null, str, null);
    }

    public z c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.g;
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                b1 b1Var = (b1) it.next();
                b1Var.getClass();
                arrayList2.add(b1Var);
            }
        }
        if (!arrayList.isEmpty()) {
        }
        return new z((IconCompat) this.d, (CharSequence) this.a, (PendingIntent) this.e, (Bundle) this.f, arrayList2.isEmpty() ? null : (b1[]) arrayList2.toArray(new b1[arrayList2.size()]), this.b, this.c);
    }

    @Override // defpackage.b0q
    public Object d(w6u w6uVar) {
        w6uVar.getClass();
        return new qgd("VideoClipRadioContentId: not supported by Glagol Cast");
    }

    public boolean e() {
        if (!((bbv) this.f).b.isEmpty() || !this.b) {
            return false;
        }
        Application application = (Application) this.d;
        if (application != null) {
            application.unregisterActivityLifecycleCallbacks((uf2) this.e);
        }
        this.b = false;
        return true;
    }

    public vgd f(dd5 dd5Var) {
        return rre.S(dd5Var, new hv0(this, null, 12), (String) this.a);
    }

    @Override // defpackage.b0q
    public Object s(d0t d0tVar) {
        mqs mqsVar = (mqs) this.e;
        d0tVar.getClass();
        u8n u8nVar = (u8n) this.d;
        Continuation continuation = null;
        if (u8nVar instanceof ggr) {
            if (mqsVar == null) {
                jzs jzsVar = ((ggr) u8nVar).a;
                mqsVar = jzsVar != null ? jzsVar.a : null;
            }
        } else if ((u8nVar instanceof hgr) && mqsVar == null) {
            mqsVar = g((hgr) u8nVar);
        }
        String str = (String) this.a;
        Function1 ikcVar = mqsVar == null ? new ikc(1, 2, continuation) : new lgd(new ygd(mqsVar.a, mqsVar.e, (Integer) this.f), this.c, 0.0d, null);
        l18 l18Var = l18.b;
        bdt I = hag.I(byb.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        boolean h = ((thd) ((byb) qdcVar.C(I)).b(thd.class)).h();
        s9p s9pVar = d0tVar.a;
        String h2 = !h ? StationId.e(s9pVar).h() : CollectionsKt.X(o8g.R(s9pVar), StringUtils.COMMA, null, null, new g4d(16), 30);
        ngd ngdVar = ngd.RADIO;
        if (str == null) {
            str = "";
        }
        return new pgd(ngdVar, h2, ikcVar, str, null);
    }

    @Override // defpackage.b0q
    public Object w(bd5 bd5Var) {
        bd5Var.getClass();
        return f(bd5Var);
    }

    @Override // defpackage.b0q
    public Object x(aou aouVar) {
        mqs mqsVar = (mqs) this.e;
        aouVar.getClass();
        u8n u8nVar = (u8n) this.d;
        Continuation continuation = null;
        if (u8nVar instanceof ggr) {
            if (mqsVar == null) {
                jzs jzsVar = ((ggr) u8nVar).a;
                mqsVar = jzsVar != null ? jzsVar.a : null;
            }
        } else if ((u8nVar instanceof hgr) && mqsVar == null) {
            mqsVar = g((hgr) u8nVar);
        }
        return rre.T(aouVar, (String) this.a, mqsVar == null ? new ikc(1, 2, continuation) : new lgd(new ygd(mqsVar.a, mqsVar.e, (Integer) this.f), this.c, 0.0d, null));
    }

    public xgd(String str, boolean z, boolean z2, mt4 mt4Var, o57 o57Var, ej6 ej6Var, p57 p57Var, p57 p57Var2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = mt4Var;
        this.e = ej6Var;
        this.f = p57Var;
        this.g = p57Var2;
    }

    public xgd(u8n u8nVar, boolean z, String str, boolean z2, mqs mqsVar, Integer num) {
        str.getClass();
        this.d = u8nVar;
        this.b = z;
        this.a = str;
        this.c = z2;
        this.e = mqsVar;
        this.f = num;
        this.g = l18.b.b(hag.I(odd.class), true);
    }

    public xgd(int i, String str, PendingIntent pendingIntent) {
        IconCompat c = i == 0 ? null : IconCompat.c(null, "", i);
        Bundle bundle = new Bundle();
        this.b = true;
        this.c = true;
        this.d = c;
        this.a = f0.c(str);
        this.e = pendingIntent;
        this.f = bundle;
        this.g = null;
        this.b = true;
        this.c = true;
    }
}
