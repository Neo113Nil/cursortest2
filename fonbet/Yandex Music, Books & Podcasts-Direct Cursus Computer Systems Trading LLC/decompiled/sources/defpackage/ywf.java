package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import androidx.compose.foundation.e;
import androidx.compose.foundation.layout.b;
import androidx.compose.foundation.layout.c;
import androidx.compose.foundation.layout.d;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.y;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import com.google.android.gms.tasks.Task;
import com.yandex.music.shared.dto.universalentities.UniversalEntityDto;
import com.yandex.music.universal.entities.data.network.dto.UniversalScreenEntitiesPageDto;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import kotlin.text.StringsKt;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class ywf {
    public static SharedPreferences a;

    public static final boolean A(o3k o3kVar, float f) {
        o3kVar.l().getClass();
        return !(((o3kVar.s() ? -f : t(o3kVar)) > 0.0f ? 1 : ((o3kVar.s() ? -f : t(o3kVar)) == 0.0f ? 0 : -1)) > 0);
    }

    public static String B(String str, String str2, String str3) {
        return (str == null || str.length() == 0) ? str2 != null ? str2 : "" : (str2 == null || str2.length() == 0) ? str : ouj.o(str, str3, str2);
    }

    public static final ObjectAnimator C(View view, boolean z) {
        view.getClass();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), z ? 1.0f : 0.0f);
        if (z) {
            ofFloat.getClass();
            ofFloat.addListener(new bdo(view, 1));
        } else {
            ofFloat.getClass();
            ofFloat.addListener(new bdo(view, 0));
        }
        ofFloat.getClass();
        return ofFloat;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0048, code lost:
    
        if (r6 != null) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0073 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final t9f D(uhp uhpVar, u9f u9fVar, boolean z) {
        t9f t9fVar;
        t9f t9fVar2;
        t9f kgmVar;
        f9f U = gld.U(u9fVar);
        boolean a2 = u9fVar.a();
        List g = u9fVar.g();
        ArrayList arrayList = new ArrayList(v75.o(g, 10));
        Iterator it = g.iterator();
        if (it.hasNext()) {
            ((KTypeProjection) it.next()).getClass();
            xq0.o("Star projections in type arguments are not allowed, but had null");
            return null;
        }
        if (arrayList.isEmpty()) {
            if (!leu.P(U).isInterface() || uhpVar.b(U, c5b.a) == null) {
                iip iipVar = lip.a;
                t9fVar = !a2 ? lip.a.b(U) : lip.b.b(U);
                if (t9fVar == null) {
                    return t9fVar;
                }
                if (arrayList.isEmpty()) {
                    t9fVar2 = swf.i0(U);
                    if (t9fVar2 == null && (t9fVar2 = uhpVar.b(U, c5b.a)) == null) {
                        if (leu.P(U).isInterface()) {
                            kgmVar = new kgm(U);
                            t9fVar2 = kgmVar;
                        }
                        t9fVar2 = null;
                    }
                    if (t9fVar2 != null) {
                        return a2 ? ff7.C(t9fVar2) : t9fVar2;
                    }
                } else {
                    ArrayList j0 = swf.j0(uhpVar, arrayList, z);
                    if (j0 != null) {
                        t9f e0 = swf.e0(U, j0, new x71(arrayList, 3));
                        if (e0 == null) {
                            t9fVar2 = uhpVar.b(U, j0);
                            if (t9fVar2 == null) {
                                if (leu.P(U).isInterface()) {
                                    kgmVar = new kgm(U);
                                    t9fVar2 = kgmVar;
                                }
                                t9fVar2 = null;
                            }
                        } else {
                            t9fVar2 = e0;
                        }
                        if (t9fVar2 != null) {
                        }
                    }
                }
                return null;
            }
            t9fVar = null;
            if (t9fVar == null) {
            }
        } else {
            if (!uhpVar.f) {
                iip iipVar2 = lip.a;
                Object a3 = !a2 ? lip.c.a(U, arrayList) : lip.d.a(U, arrayList);
                r7o r7oVar = z7o.b;
                if (a3 instanceof t7o) {
                    a3 = null;
                }
                t9fVar = (t9f) a3;
                if (t9fVar == null) {
                }
            }
            t9fVar = null;
            if (t9fVar == null) {
            }
        }
    }

    public static final void E(tqg tqgVar, tqg tqgVar2) {
        if (((String) tqgVar.a().d) == null) {
            g06 a2 = tqgVar.a();
            a2.getClass();
            a2.d = UUID.randomUUID().toString();
        }
        tqgVar2.a().d = (String) tqgVar.a().d;
    }

    public static void F(cvl cvlVar, dy7 dy7Var, kxi kxiVar, pu0 pu0Var, y yVar) {
        cvlVar.getClass();
        dy7Var.getClass();
        yVar.getClass();
        sai saiVar = new sai(false);
        cvo cvoVar = cvo.i;
        e3s.X(o6m.b(wjb.SummaryScreen, new avo(pkb.Playlist, cvlVar.e()), 2), yVar, "PLAYLIST_HEADER_DESCRIPTION_DIALOG_TAG", saiVar, null, new wn5(new lc(dy7Var, cvlVar, kxiVar, pu0Var, saiVar, 10), -448218818, true), 48);
    }

    public static boolean G(String str) {
        return str == null || str.isEmpty();
    }

    public static final wjb H(ih4 ih4Var) {
        if (ih4Var instanceof oza) {
            return wjb.EasyLoginScreen;
        }
        if (ih4Var instanceof pza) {
            return wjb.EasyLoginScreen;
        }
        if (ih4Var instanceof nza) {
            return wjb.EasyLoginChromecastScreen;
        }
        b6e.s();
        return null;
    }

    public static final pkb I(ih4 ih4Var) {
        if (ih4Var instanceof oza) {
            return pkb.Video;
        }
        if (ih4Var instanceof pza) {
            return pkb.Music;
        }
        if (ih4Var instanceof nza) {
            return pkb.Music;
        }
        b6e.s();
        return null;
    }

    public static final zvd J(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(20);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            t6e t6eVar = (t6e) it.next();
            String str = t6eVar.a;
            String str2 = t6eVar.b;
            str.getClass();
            str2.getClass();
            qwp.D(str);
            qwp.G(str2, str);
            arrayList.add(str);
            arrayList.add(StringsKt.t0(str2).toString());
        }
        return new zvd((String[]) arrayList.toArray(new String[0]));
    }

    public static final yjt K(UniversalScreenEntitiesPageDto universalScreenEntitiesPageDto) {
        universalScreenEntitiesPageDto.getClass();
        List<UniversalEntityDto> items = universalScreenEntitiesPageDto.getItems();
        if (items != null) {
            ArrayList arrayList = new ArrayList();
            for (UniversalEntityDto universalEntityDto : items) {
                yit H = universalEntityDto != null ? tyf.H(universalEntityDto) : null;
                if (H != null) {
                    arrayList.add(H);
                }
            }
            String title = universalScreenEntitiesPageDto.getTitle();
            if (title != null) {
                return new yjt(title, arrayList);
            }
        }
        return null;
    }

    public static final Object L(tqg tqgVar, Object obj) {
        if (!(obj instanceof tqg)) {
            return obj;
        }
        tqg tqgVar2 = (tqg) obj;
        E(tqgVar, tqgVar2);
        return tqgVar2;
    }

    public static void M(uoo uooVar, nyf nyfVar) {
        lyf b = nyfVar.b();
        if (b == lyf.b || b.compareTo(lyf.d) >= 0) {
            uooVar.d();
        } else {
            nyfVar.a(new ao7(3, nyfVar, uooVar));
        }
    }

    public static final Long N(i8l i8lVar) {
        long duration = i8lVar.getDuration();
        Long valueOf = Long.valueOf(duration);
        if (duration > 0) {
            return valueOf;
        }
        return null;
    }

    public static onx O(List list) {
        if (list == null || list.isEmpty()) {
            return w(null);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Task) it.next()) == null) {
                jj4.j("null tasks are not accepted");
                return null;
            }
        }
        onx onxVar = new onx();
        t0x t0xVar = new t0x(list.size(), onxVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Task task = (Task) it2.next();
            f48 f48Var = j8s.b;
            task.d(f48Var, t0xVar);
            task.c(f48Var, t0xVar);
            task.a(f48Var, t0xVar);
        }
        return onxVar;
    }

    public static SharedPreferences P(Context context) {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            try {
                if (a == null) {
                    a = (SharedPreferences) qgg.m0(new z68(5, context));
                }
                sharedPreferences = a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sharedPreferences;
    }

    public static Object Q(Task task) {
        if (task.l()) {
            return task.h();
        }
        if (task.j()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(task.g());
    }

    public static final void a(ma5 ma5Var, udt udtVar, ivp ivpVar, wn5 wn5Var, hq5 hq5Var, int i) {
        ivp ivpVar2;
        ivp ivpVar3;
        x6k x6kVar;
        float f;
        float f2;
        wn5 wn5Var2 = wn5Var;
        x6k x6kVar2 = ma5Var.l;
        x6k x6kVar3 = ma5Var.j;
        x6k x6kVar4 = ma5Var.i;
        x6k x6kVar5 = ma5Var.h;
        x6k x6kVar6 = ma5Var.c;
        x6k x6kVar7 = ma5Var.b;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-891417079);
        int i2 = (i & 6) == 0 ? (oq5Var.f(ma5Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= oq5Var.f(udtVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.h(wn5Var2) ? 2048 : 1024;
        }
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            oq5Var.U();
            if ((i & 1) == 0 || oq5Var.y()) {
                ivpVar3 = (ivp) oq5Var.j(kvp.a);
            } else {
                oq5Var.S();
                ivpVar3 = ivpVar;
            }
            oq5Var.q();
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                x6kVar = x6kVar2;
                ma5 ma5Var2 = new ma5(ma5Var.d(), ((d85) x6kVar7.getValue()).a, ((d85) x6kVar6.getValue()).a, ma5Var.e(), ma5Var.a(), ma5Var.f(), ma5Var.b(), ((d85) x6kVar5.getValue()).a, ((d85) x6kVar4.getValue()).a, ((d85) x6kVar3.getValue()).a, ma5Var.c(), ((d85) x6kVar.getValue()).a, ma5Var.g());
                oq5Var.k0(ma5Var2);
                K = ma5Var2;
            } else {
                x6kVar = x6kVar2;
            }
            ma5 ma5Var3 = (ma5) K;
            agr agrVar = pa5.a;
            ma5Var3.a.setValue(new d85(ma5Var.d()));
            ma5Var3.b.setValue(new d85(((d85) x6kVar7.getValue()).a));
            ma5Var3.c.setValue(new d85(((d85) x6kVar6.getValue()).a));
            ma5Var3.d.setValue(new d85(ma5Var.e()));
            ma5Var3.e.setValue(new d85(ma5Var.a()));
            ma5Var3.f.setValue(new d85(ma5Var.f()));
            ma5Var3.g.setValue(new d85(ma5Var.b()));
            ma5Var3.h.setValue(new d85(((d85) x6kVar5.getValue()).a));
            ma5Var3.i.setValue(new d85(((d85) x6kVar4.getValue()).a));
            ma5Var3.j.setValue(new d85(((d85) x6kVar3.getValue()).a));
            ma5Var3.k.setValue(new d85(ma5Var.c()));
            ma5Var3.l.setValue(new d85(((d85) x6kVar.getValue()).a));
            ma5Var3.m.setValue(Boolean.valueOf(ma5Var.g()));
            geo a2 = eeo.a(0.0f, 7, 0L, false);
            long d = ma5Var3.d();
            long a3 = ma5Var3.a();
            oq5Var.Z(1102762852);
            long a4 = pa5.a(ma5Var3, a3);
            if (a4 != 16) {
                f = 0.0f;
            } else {
                f = 0.0f;
                a4 = ((d85) oq5Var.j(sb6.a)).a;
            }
            oq5Var.p(false);
            long j = ((d85) oq5Var.j(sb6.a)).a;
            long b = d85.b(a4, (!((ma5) oq5Var.j(pa5.a)).g() ? ((double) c3x.N(j)) < 0.5d : ((double) c3x.N(j)) > 0.5d) ? 0.6f : 0.74f, 0.0f, 0.0f, 0.0f, 14);
            boolean e = oq5Var.e(d) | oq5Var.e(a3) | oq5Var.e(b);
            Object K2 = oq5Var.K();
            float f3 = 1.0f;
            if (e || K2 == kjnVar) {
                long d2 = ma5Var3.d();
                float y = swf.y(d, 0.4f, b, a3);
                float y2 = swf.y(d, 0.2f, b, a3);
                float f4 = 0.4f;
                if (y < 4.5f) {
                    float f5 = 0.2f;
                    if (y2 >= 4.5f) {
                        f2 = 0.4f;
                        for (int i3 = 0; i3 < 7; i3++) {
                            float y3 = (swf.y(d, f2, b, a3) / 4.5f) - 1.0f;
                            if (f <= y3 && y3 <= 0.01f) {
                                break;
                            }
                            if (y3 < f) {
                                f4 = f2;
                            } else {
                                f5 = f2;
                            }
                            f2 = (f4 + f5) / 2.0f;
                        }
                    } else {
                        f2 = 0.2f;
                    }
                } else {
                    f2 = 0.4f;
                }
                K2 = new xds(d2, d85.b(d, f2, 0.0f, 0.0f, 0.0f, 14));
                oq5Var.k0(K2);
            }
            xds xdsVar = (xds) K2;
            agr agrVar2 = pa5.a;
            qzm a5 = agrVar2.a(ma5Var3);
            qs5 qs5Var = mb6.a;
            long j2 = ((d85) oq5Var.j(sb6.a)).a;
            if (!((ma5) oq5Var.j(agrVar2)).g() ? c3x.N(j2) >= 0.5d : c3x.N(j2) <= 0.5d) {
                f3 = 0.87f;
            }
            qzm[] qzmVarArr = {a5, qs5Var.a(Float.valueOf(f3)), e.a.a(a2), kvp.a.a(ivpVar3), yds.a.a(xdsVar), wdt.b.a(udtVar)};
            wn5Var2 = wn5Var;
            etn.m(qzmVarArr, ild.C(-1740102967, new qtf(5, udtVar, wn5Var2), oq5Var), oq5Var, 56);
            ivpVar2 = ivpVar3;
        } else {
            oq5Var.S();
            ivpVar2 = ivpVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new un5(ma5Var, udtVar, ivpVar2, wn5Var2, i, 4);
        }
    }

    public static final void b(int i, long j, hq5 hq5Var, yci yciVar, List list) {
        kb5 kb5Var;
        int i2;
        int i3;
        yci yciVar2;
        int i4 = 0;
        Integer num = 0;
        list.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1952201787);
        int i5 = i | (oq5Var.e(j) ? 4 : 2) | (oq5Var.h(list) ? 32 : 16) | 384;
        if ((i5 & 147) == 146 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            oq5Var.a0(-2115993395);
            iag iagVar = (iag) oq5Var.j(r8g.a);
            oq5Var.p(false);
            if (!iagVar.W) {
                xmn r = oq5Var.r();
                if (r != null) {
                    r.d = new ok2(j, list, i, 1);
                    return;
                }
                return;
            }
            List h = u75.h(new ArrayList(), new ArrayList());
            List list2 = list;
            long j2 = 0;
            int i6 = 0;
            for (Object obj : list2) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    u75.n();
                    throw null;
                }
                cgg cggVar = (cgg) obj;
                boolean z = cggVar.b;
                long j3 = cggVar.a;
                if (z) {
                    j2++;
                }
                ((List) h.get(i4)).add(new jod(Long.valueOf((i6 - j2) + 1), j3));
                ((List) h.get(1)).add(new jod(Long.valueOf(j2), j3));
                i6 = i7;
                num = num;
                i4 = 0;
            }
            Integer num2 = num;
            oq5Var.a0(-483455358);
            kx0 kx0Var = qx0.c;
            gz2 gz2Var = b2c.n;
            ta5 a2 = sa5.a(kx0Var, gz2Var, oq5Var, 0);
            oq5Var.a0(-1323940314);
            int i8 = oq5Var.P;
            a l = oq5Var.l();
            xp5.T.getClass();
            grb grbVar = wp5.b;
            vci vciVar = vci.a;
            wn5 A = ghh.A(vciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            kb5 kb5Var2 = wp5.f;
            g0g.U(oq5Var, a2, kb5Var2);
            kb5 kb5Var3 = wp5.e;
            g0g.U(oq5Var, l, kb5Var3);
            kb5 kb5Var4 = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i8))) {
                ouj.x(i8, oq5Var, i8, kb5Var4);
            }
            A.invoke(new lrq(oq5Var), oq5Var, num2);
            oq5Var.a0(2058660585);
            h4a.m(0, 6, oq5Var, null, rvf.M(R.string.networkRequestsLabel, oq5Var), false);
            oq5Var.a0(-862651793);
            u3r u3rVar = (u3r) oq5Var.j(bfs.c);
            oq5Var.p(false);
            nx0 g = qx0.g(u3rVar.b);
            oq5Var.a0(693286680);
            nho a3 = lho.a(g, b2c.k, oq5Var, 0);
            oq5Var.a0(-1323940314);
            int i9 = oq5Var.P;
            a l2 = oq5Var.l();
            wn5 A2 = ghh.A(vciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a3, kb5Var2);
            g0g.U(oq5Var, l2, kb5Var3);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i9))) {
                kb5Var = kb5Var4;
                ouj.x(i9, oq5Var, i9, kb5Var);
            } else {
                kb5Var = kb5Var4;
            }
            A2.invoke(new lrq(oq5Var), oq5Var, num2);
            oq5Var.a0(2058660585);
            oq5Var.a0(-483455358);
            ta5 a4 = sa5.a(kx0Var, gz2Var, oq5Var, 0);
            oq5Var.a0(-1323940314);
            int i10 = oq5Var.P;
            a l3 = oq5Var.l();
            wn5 A3 = ghh.A(vciVar);
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a4, kb5Var2);
            g0g.U(oq5Var, l3, kb5Var3);
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i10))) {
                ouj.x(i10, oq5Var, i10, kb5Var);
            }
            A3.invoke(new lrq(oq5Var), oq5Var, num2);
            oq5Var.a0(2058660585);
            Integer valueOf = Integer.valueOf(R.string.networkRequestsTotalNumOfSuccess);
            boolean z2 = list2 instanceof Collection;
            if (z2 && list2.isEmpty()) {
                i2 = 0;
            } else {
                Iterator it = list2.iterator();
                i2 = 0;
                while (it.hasNext()) {
                    if (((cgg) it.next()).b && (i2 = i2 + 1) < 0) {
                        u75.m();
                        throw null;
                    }
                }
            }
            Integer valueOf2 = Integer.valueOf(i2);
            oq5Var.a0(-2115993395);
            qs5 qs5Var = r8g.a;
            iag iagVar2 = (iag) oq5Var.j(qs5Var);
            oq5Var.p(false);
            boolean z3 = iagVar2.X;
            oq5Var.a0(-2115993395);
            iag iagVar3 = (iag) oq5Var.j(qs5Var);
            oq5Var.p(false);
            h4a.i(valueOf, valueOf2, null, false, z3, iagVar3.Y, oq5Var, 0, 12);
            Integer valueOf3 = Integer.valueOf(R.string.networkRequestsTotalNumOfErrors);
            if (z2 && list2.isEmpty()) {
                i3 = 0;
            } else {
                Iterator it2 = list2.iterator();
                i3 = 0;
                while (it2.hasNext()) {
                    if (!((cgg) it2.next()).b && (i3 = i3 + 1) < 0) {
                        u75.m();
                        throw null;
                    }
                }
            }
            h4a.i(valueOf3, Integer.valueOf(i3), null, false, vut.I(oq5Var).Z, vut.I(oq5Var).a0, oq5Var, 0, 12);
            k5r.s(oq5Var, false, true, false, false);
            boolean z4 = vut.I(oq5Var).b0;
            boolean z5 = vut.I(oq5Var).c0;
            boolean z6 = vut.I(oq5Var).d0;
            boolean z7 = vut.I(oq5Var).e0;
            oq5Var.a0(118080530);
            agr agrVar = bfs.a;
            h95 h95Var = (h95) oq5Var.j(agrVar);
            oq5Var.p(false);
            d85 d85Var = new d85(h95Var.g);
            oq5Var.a0(118080530);
            h95 h95Var2 = (h95) oq5Var.j(agrVar);
            oq5Var.p(false);
            ed.a(h, j, d.e(d.d(vciVar, 1.0f), dpd.a), null, true, u75.h(d85Var, new d85(h95Var2.f)), u75.h(rvf.M(R.string.networkRequestsCurrentNumOfErrors, oq5Var), rvf.M(R.string.networkRequestsCurrentNumOfSuccess, oq5Var)), vut.I(oq5Var).f0, z4, z5, Integer.valueOf(R.string.networkRequestsMaxValues), z6, z7, Integer.valueOf(R.string.networkRequestsLastValues), null, oq5Var, ((i5 << 3) & 112) | 1576320);
            oq5Var = oq5Var;
            k5r.s(oq5Var, false, true, false, false);
            k5r.s(oq5Var, false, true, false, false);
            yciVar2 = vciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new pk2(i, 1, j, yciVar2, list);
        }
    }

    public static final ynn c(long j, long j2) {
        return new ynn(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final ynn d(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new ynn(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j2 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j2 & 4294967295L)) + Float.intBitsToFloat(i2));
    }

    public static final void e(final nnk nnkVar, Function0 function0, yci yciVar, hq5 hq5Var, int i) {
        function0.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1439543977);
        int i2 = i | (oq5Var.f(nnkVar) ? 4 : 2) | (oq5Var.h(function0) ? 32 : 16) | (oq5Var.f(yciVar) ? 256 : 128);
        if (oq5Var.P(i2 & 1, (i2 & 147) != 146)) {
            final int i3 = 0;
            final int i4 = 1;
            ngg.i(function0, androidx.compose.ui.platform.a.a(yciVar, "search_best_result_artist_related_list_item"), ild.C(1477008875, new Function2() { // from class: hzo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i3) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj;
                            int intValue = ((Integer) obj2).intValue();
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                                yci m = d.m(vci.a, lsq.s(e9g.a));
                                kfh d = ug3.d(b2c.b, false);
                                int i5 = oq5Var2.P;
                                a l = oq5Var2.l();
                                yci H = vnj.H(oq5Var2, m);
                                xp5.T.getClass();
                                grb grbVar = wp5.b;
                                oq5Var2.d0();
                                if (oq5Var2.O) {
                                    oq5Var2.k(grbVar);
                                } else {
                                    oq5Var2.n0();
                                }
                                g0g.U(oq5Var2, d, wp5.f);
                                g0g.U(oq5Var2, l, wp5.e);
                                kb5 kb5Var = wp5.g;
                                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                                    ouj.x(i5, oq5Var2, i5, kb5Var);
                                }
                                g0g.U(oq5Var2, H, wp5.d);
                                ywf.f((ArrayList) nnkVar.b, null, oq5Var2, 390);
                                oq5Var2.p(true);
                            } else {
                                oq5Var2.S();
                            }
                            break;
                        default:
                            hq5 hq5Var3 = (hq5) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            oq5 oq5Var3 = (oq5) hq5Var3;
                            if (oq5Var3.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                xv7.j((String) nnkVar.a, androidx.compose.ui.platform.a.a(d.d(vci.a, 1.0f), "artist_list_item_title"), ((dq0) oq5Var3.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 2, 0, null, nu0.j(), oq5Var3, 48, 3120, 55288);
                            } else {
                                oq5Var3.S();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var), false, 0L, null, null, 0.0f, null, ild.C(-179315900, new Function2() { // from class: hzo
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    switch (i4) {
                        case 0:
                            hq5 hq5Var2 = (hq5) obj;
                            int intValue = ((Integer) obj2).intValue();
                            oq5 oq5Var2 = (oq5) hq5Var2;
                            if (oq5Var2.P(intValue & 1, (intValue & 3) != 2)) {
                                yci m = d.m(vci.a, lsq.s(e9g.a));
                                kfh d = ug3.d(b2c.b, false);
                                int i5 = oq5Var2.P;
                                a l = oq5Var2.l();
                                yci H = vnj.H(oq5Var2, m);
                                xp5.T.getClass();
                                grb grbVar = wp5.b;
                                oq5Var2.d0();
                                if (oq5Var2.O) {
                                    oq5Var2.k(grbVar);
                                } else {
                                    oq5Var2.n0();
                                }
                                g0g.U(oq5Var2, d, wp5.f);
                                g0g.U(oq5Var2, l, wp5.e);
                                kb5 kb5Var = wp5.g;
                                if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i5))) {
                                    ouj.x(i5, oq5Var2, i5, kb5Var);
                                }
                                g0g.U(oq5Var2, H, wp5.d);
                                ywf.f((ArrayList) nnkVar.b, null, oq5Var2, 390);
                                oq5Var2.p(true);
                            } else {
                                oq5Var2.S();
                            }
                            break;
                        default:
                            hq5 hq5Var3 = (hq5) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            oq5 oq5Var3 = (oq5) hq5Var3;
                            if (oq5Var3.P(intValue2 & 1, (intValue2 & 3) != 2)) {
                                xv7.j((String) nnkVar.a, androidx.compose.ui.platform.a.a(d.d(vci.a, 1.0f), "artist_list_item_title"), ((dq0) oq5Var3.j(eq0.a)).b.a, 0L, 0L, 0, 0L, 2, false, 2, 0, null, nu0.j(), oq5Var3, 48, 3120, 55288);
                            } else {
                                oq5Var3.S();
                            }
                            break;
                    }
                    return Unit.a;
                }
            }, oq5Var), oq5Var, ((i2 >> 3) & 14) | 805306752, 504);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new t2n(nnkVar, function0, yciVar, i, 5);
        }
    }

    public static final void f(ArrayList arrayList, yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        vci vciVar;
        e9g e9gVar = e9g.a;
        iz2 iz2Var = b2c.h;
        iz2 iz2Var2 = b2c.b;
        iz2 iz2Var3 = b2c.j;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-695263628);
        int i2 = i | (oq5Var.f(arrayList) ? 32 : 16) | 3072;
        boolean z = false;
        if (oq5Var.P(i2 & 1, (i2 & 1171) != 1170)) {
            int size = arrayList.size();
            if (size <= 0) {
                xq0.x("SearchBestResultsArtistAvatars requires at least 1 artists");
                return;
            }
            float s = lsq.s(e9gVar);
            int i3 = 54;
            vci vciVar2 = vci.a;
            if (size != 1) {
                b bVar = b.a;
                if (size != 2) {
                    if (size != 3) {
                        oq5Var.Z(2031278360);
                        float f = 2;
                        float f2 = (s / f) - f;
                        int i4 = 4;
                        List h = u75.h(iz2Var2, b2c.d, iz2Var, iz2Var3);
                        int i5 = 0;
                        while (i5 < i4) {
                            String str = ((jd1) arrayList.get(i5)).a;
                            int i6 = i4;
                            qo6 qo6Var = qo6.d;
                            irf.y(str, qo6Var, bVar.a(d.m(vciVar2, f2), (g40) h.get(i5)), false, false, null, null, lsq.r(e9gVar, qo6Var, oq5Var, i3), oq5Var, 48, 120);
                            bVar = bVar;
                            z = z;
                            i5++;
                            i4 = i6;
                            vciVar2 = vciVar2;
                            i3 = 54;
                            f2 = f2;
                        }
                        vciVar = vciVar2;
                        oq5Var.p(z);
                    } else {
                        oq5Var.Z(2030060835);
                        float f3 = 2;
                        float f4 = (s / f3) - f3;
                        String str2 = ((jd1) arrayList.get(0)).a;
                        qo6 qo6Var2 = qo6.d;
                        irf.y(str2, qo6Var2, bVar.a(d.m(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, f3, 0.0f, 0.0f, 13), f4), b2c.c), false, false, null, null, lsq.r(e9gVar, qo6Var2, oq5Var, 54), oq5Var, 48, 120);
                        irf.y(((jd1) arrayList.get(1)).a, qo6Var2, bVar.a(d.m(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 0.0f, 0.0f, f3, 7), f4), iz2Var), false, false, null, null, lsq.r(e9gVar, qo6Var2, oq5Var, 54), oq5Var, 48, 120);
                        vciVar = vciVar2;
                        irf.y(((jd1) arrayList.get(2)).a, qo6Var2, bVar.a(d.m(androidx.compose.foundation.layout.a.q(vciVar2, 0.0f, 0.0f, 0.0f, f3, 7), f4), iz2Var3), false, false, null, null, lsq.r(e9gVar, qo6Var2, oq5Var, 54), oq5Var, 48, 120);
                        oq5Var.p(false);
                    }
                    yciVar2 = vciVar;
                } else {
                    oq5Var.Z(2029221820);
                    float f5 = (s * 13) / 20;
                    String str3 = ((jd1) arrayList.get(0)).a;
                    qo6 qo6Var3 = qo6.d;
                    yci g0 = f8g.g0(bVar.a(d.m(vciVar2, f5), iz2Var3), 0.0f);
                    tgo r = lsq.r(e9gVar, qo6Var3, oq5Var, 54);
                    yciVar2 = vciVar2;
                    irf.y(str3, qo6Var3, g0, false, false, null, null, r, oq5Var, 48, 120);
                    irf.y(((jd1) arrayList.get(1)).a, qo6Var3, f8g.g0(bVar.a(d.m(yciVar2, f5), iz2Var2), 1.0f), false, false, null, null, lsq.r(e9gVar, qo6Var3, oq5Var, 54), oq5Var, 48, 120);
                    oq5Var.p(false);
                }
            } else {
                yciVar2 = vciVar2;
                oq5Var.Z(2028894243);
                String str4 = ((jd1) CollectionsKt.Q(arrayList)).a;
                qo6 qo6Var4 = qo6.d;
                irf.y(str4, qo6Var4, d.m(yciVar2, s), false, false, null, null, lsq.r(e9gVar, qo6Var4, oq5Var, 54), oq5Var, 48, 120);
                oq5Var.p(false);
            }
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r2 = oq5Var.r();
        if (r2 != null) {
            r2.d = new hon(arrayList, yciVar2, i);
        }
    }

    public static final void g(vgq vgqVar, s14 s14Var, yci yciVar, hq5 hq5Var, int i) {
        int i2;
        yci yciVar2;
        ugq ugqVar;
        boolean z;
        vci vciVar;
        vgqVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1556374213);
        if ((i & 6) == 0) {
            i2 = i | (oq5Var.h(vgqVar) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= oq5Var.h(s14Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (oq5Var.P(i3 & 1, (i3 & 147) != 146)) {
            Object K = oq5Var.K();
            Object obj = gq5.a;
            if (K == obj) {
                K = gld.R(g.a, oq5Var);
                oq5Var.k0(K);
            }
            mm6 mm6Var = (mm6) K;
            boolean f = oq5Var.f(vgqVar) | oq5Var.f(s14Var) | oq5Var.f(mm6Var);
            Object K2 = oq5Var.K();
            if (f || K2 == obj) {
                K2 = new ugq(vgqVar.b, mm6Var, vgqVar, s14Var);
                oq5Var.k0(K2);
            }
            ugq ugqVar2 = (ugq) K2;
            dhq dhqVar = (dhq) gld.M(vgqVar.f, oq5Var).getValue();
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i4 = oq5Var.P;
            a l = oq5Var.l();
            vci vciVar2 = vci.a;
            yci H = vnj.H(oq5Var, vciVar2);
            xp5.T.getClass();
            Function0 function0 = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(function0);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i4))) {
                ouj.x(i4, oq5Var, i4, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            if (Intrinsics.d(dhqVar, bhq.a)) {
                oq5Var.Z(305071867);
                oq5Var.p(false);
            } else if (Intrinsics.d(dhqVar, chq.a)) {
                oq5Var.Z(305129403);
                oq5Var.p(false);
            } else {
                if (!(dhqVar instanceof ahq)) {
                    throw vz1.i(oq5Var, -959992144, false);
                }
                oq5Var.Z(305203617);
                String str = vgqVar.d;
                if (str != null) {
                    oq5Var.Z(305281024);
                    ugqVar = ugqVar2;
                    vciVar = vciVar2;
                    z = false;
                    irf.h(str, null, null, (o0k) oq5Var.j(lkg.a), null, false, null, false, null, oq5Var, 0, 502);
                    eta.p(vciVar, 16, oq5Var, false);
                } else {
                    ugqVar = ugqVar2;
                    z = false;
                    vciVar = vciVar2;
                    oq5Var.Z(300782397);
                    oq5Var.p(false);
                }
                oq5Var.p(z);
                vci vciVar3 = vciVar;
                bg3.c(ugqVar, zpd.k, vciVar3, (o0k) oq5Var.j(lkg.a), 0.0f, oq5Var, 432, 16);
                oq5Var.p(true);
                yciVar2 = vciVar3;
            }
            ugqVar = ugqVar2;
            vciVar = vciVar2;
            vci vciVar32 = vciVar;
            bg3.c(ugqVar, zpd.k, vciVar32, (o0k) oq5Var.j(lkg.a), 0.0f, oq5Var, 432, 16);
            oq5Var.p(true);
            yciVar2 = vciVar32;
        } else {
            oq5Var.S();
            yciVar2 = yciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new erj(vgqVar, s14Var, yciVar2, i, 11);
        }
    }

    public static final void h(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1730910849);
        if (oq5Var.P(i & 1, i != 0)) {
            ta5 a2 = sa5.a(qx0.c, b2c.n, oq5Var, 0);
            int i2 = oq5Var.P;
            a l = oq5Var.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            irf.h(rvf.M(R.string.similar_entities_block_title, oq5Var), null, null, (o0k) oq5Var.j(lkg.a), null, false, null, false, null, oq5Var, 0, 502);
            u1g.l(oq5Var, d.e(vciVar, 16));
            ArrayList arrayList = new ArrayList(3);
            for (int i3 = 0; i3 < 3; i3++) {
                arrayList.add(Unit.a);
            }
            up6.j(arrayList, vciVar, (o0k) oq5Var.j(lkg.a), 0.0f, 0.0f, null, null, false, 0, fgq.c, oq5Var, 102236208, 696);
            oq5Var = oq5Var;
            oq5Var.p(true);
        } else {
            oq5Var.S();
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new j1p(i, 9);
        }
    }

    public static final void i(ltu ltuVar, wn5 wn5Var, hq5 hq5Var, int i) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1069592493);
        if ((((oq5Var.f(ltuVar) ? 4 : 2) | i) & 19) == 18 && oq5Var.z()) {
            oq5Var.S();
        } else {
            pm0.a(null, ild.C(-2053317142, new oc1(asq.I((Configuration) oq5Var.j(AndroidCompositionLocals_androidKt.a)), ltuVar, wn5Var, 23), oq5Var), oq5Var, 48, 1);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new k0r(ltuVar, wn5Var, i, 29);
        }
    }

    public static final void j(final ab0 ab0Var, final wn5 wn5Var, final ltu ltuVar, final boolean z, final yci yciVar, hq5 hq5Var, int i) {
        boolean z2;
        boolean z3;
        ab0Var.getClass();
        ltuVar.getClass();
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(1250447523);
        int i2 = (oq5Var.h(ab0Var) ? 4 : 2) | i | (oq5Var.h(wn5Var) ? 32 : 16);
        if ((i & 384) == 0) {
            i2 |= (i & RemoteCameraConfig.Mic.BUFFER_SIZE) == 0 ? oq5Var.f(ltuVar) : oq5Var.h(ltuVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= oq5Var.g(z) ? 2048 : 1024;
        }
        if (((i2 | (oq5Var.f(yciVar) ? 16384 : RemoteCameraConfig.Notification.ID)) & 9363) == 9362 && oq5Var.z()) {
            oq5Var.S();
        } else {
            final aqi O = gld.O(ltuVar.s, oq5Var);
            final boolean z4 = ltuVar.m && Build.VERSION.SDK_INT >= 33;
            Object K = oq5Var.K();
            kjn kjnVar = gq5.a;
            if (K == kjnVar) {
                K = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var = ((fs5) K).a;
            Object K2 = oq5Var.K();
            if (K2 == kjnVar) {
                K2 = vq2.a(0.0f);
                oq5Var.k0(K2);
            }
            final fk0 fk0Var = (fk0) K2;
            boolean f = oq5Var.f(fk0Var);
            Object K3 = oq5Var.K();
            if (f || K3 == kjnVar) {
                K3 = new buu(fk0Var, null, 0);
                oq5Var.k0(K3);
            }
            Function1 function1 = (Function1) K3;
            boolean f2 = oq5Var.f(mm6Var) | oq5Var.f(function1);
            Object K4 = oq5Var.K();
            if (f2 || K4 == kjnVar) {
                K4 = new cqj(mm6Var, function1);
                oq5Var.k0(K4);
            }
            Function0 function0 = (Function0) K4;
            oq5Var.Z(380555734);
            s3v s3vVar = ltuVar.f;
            xdr xdrVar = ltuVar.u;
            kxi kxiVar = ltuVar.p;
            dxr dxrVar = ltuVar.x;
            c5p c5pVar = new c5p(13, ltuVar);
            boolean z5 = ltuVar.r;
            q04 q04Var = s3vVar.a;
            xdrVar.getClass();
            dxrVar.getClass();
            Object K5 = oq5Var.K();
            if (K5 == kjnVar) {
                K5 = tlm.f(gld.R(g.a, oq5Var), oq5Var);
            }
            mm6 mm6Var2 = ((fs5) K5).a;
            Object K6 = oq5Var.K();
            if (K6 == kjnVar) {
                K6 = new u3v(xdrVar, kxiVar, (thv) q04Var.d.getValue(), dxrVar, z5, (g0l) q04Var.e.getValue(), c5pVar, (cc7) q04Var.b.getValue(), mm6Var2, (frt) q04Var.a.getValue(), (vdr) q04Var.c.getValue());
                oq5Var.k0(K6);
            }
            u3v u3vVar = (u3v) K6;
            oq5Var.p(false);
            aqi O2 = gld.O(u3vVar.k, oq5Var);
            if (ltuVar.j && ((Boolean) O2.getValue()).booleanValue()) {
                oq5Var.Z(-910728903);
                z2 = !irv.h(oq5Var);
                oq5Var.p(false);
            } else {
                oq5Var.Z(1832176316);
                oq5Var.p(false);
                z2 = false;
            }
            if (z2) {
                oq5Var.Z(1832209801);
                boolean h = oq5Var.h(u3vVar) | oq5Var.h(mm6Var) | oq5Var.g(z4) | oq5Var.h(function1);
                Object K7 = oq5Var.K();
                if (h || K7 == kjnVar) {
                    K7 = new xtu(u3vVar, mm6Var, z4, function1);
                    oq5Var.k0(K7);
                }
                z3 = false;
                w1g.m((Function0) K7, oq5Var, 0);
            } else {
                z3 = false;
                oq5Var.Z(1825514111);
            }
            oq5Var.p(z3);
            qs5 qs5Var = AndroidCompositionLocals_androidKt.a;
            final boolean I = asq.I((Configuration) oq5Var.j(qs5Var));
            final long j = ((dq0) oq5Var.j(eq0.a)).a.h;
            agr agrVar = htu.a;
            boolean I2 = asq.I((Configuration) oq5Var.j(qs5Var));
            int i3 = ((Configuration) oq5Var.j(qs5Var)).screenHeightDp;
            int i4 = ((Configuration) oq5Var.j(qs5Var)).screenWidthDp;
            etn.m(new qzm[]{agrVar.a((!I2 || i3 < 700) ? (!I2 || i3 > 370) ? I2 ? gtu.q : i4 >= 700 ? gtu.t : i4 <= 370 ? gtu.r : gtu.p : gtu.s : gtu.u), ieo.a.a(function0)}, ild.C(1836450787, new Function2() { // from class: ytu
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    final boolean z6;
                    hq5 hq5Var2 = (hq5) obj;
                    if ((((Integer) obj2).intValue() & 3) == 2) {
                        oq5 oq5Var2 = (oq5) hq5Var2;
                        if (oq5Var2.z()) {
                            oq5Var2.S();
                            return Unit.a;
                        }
                    }
                    yci b = androidx.compose.foundation.a.b(yci.this, ((dq0) ((oq5) hq5Var2).j(eq0.a)).c.a, vnj.i);
                    b.getClass();
                    fk0 fk0Var2 = fk0Var;
                    fk0Var2.getClass();
                    boolean z7 = z4;
                    boolean z8 = I;
                    if (!z7 || Build.VERSION.SDK_INT < 33) {
                        z6 = z8;
                    } else {
                        Boolean valueOf = Boolean.valueOf(z8);
                        long j2 = j;
                        z6 = z8;
                        b = b.f(new vbf(fk0Var2, valueOf, new d85(j2), lhb.v0, new sd5(2, j2, fk0Var2, z8)));
                    }
                    final boolean z9 = z;
                    final wn5 wn5Var2 = wn5Var;
                    final sdr sdrVar = O;
                    final ltu ltuVar2 = ltuVar;
                    final ab0 ab0Var2 = ab0Var;
                    bg3.a(b, null, false, ild.C(1220330317, new pyc() { // from class: ztu
                        @Override // defpackage.pyc
                        public final Object invoke(Object obj3, Object obj4, Object obj5) {
                            float d;
                            float f3;
                            c cVar = (c) obj3;
                            hq5 hq5Var3 = (hq5) obj4;
                            int intValue = ((Integer) obj5).intValue();
                            cVar.getClass();
                            if ((intValue & 6) == 0) {
                                intValue |= ((oq5) hq5Var3).f(cVar) ? 4 : 2;
                            }
                            if ((intValue & 19) == 18) {
                                oq5 oq5Var3 = (oq5) hq5Var3;
                                if (oq5Var3.z()) {
                                    oq5Var3.S();
                                    return Unit.a;
                                }
                            }
                            oq5 oq5Var4 = (oq5) hq5Var3;
                            boolean I3 = asq.I((Configuration) oq5Var4.j(AndroidCompositionLocals_androidKt.a));
                            agr agrVar2 = htu.a;
                            gtu gtuVar = (gtu) oq5Var4.j(agrVar2);
                            boolean booleanValue = ((Boolean) oq5Var4.j(upg.a)).booleanValue();
                            float f4 = z0v.a;
                            oq5Var4.Z(-108084228);
                            gtu gtuVar2 = (gtu) oq5Var4.j(agrVar2);
                            boolean z10 = z9;
                            onu v = rzf.v(cVar, z10, booleanValue, oq5Var4, intValue & 14);
                            float f5 = gtuVar2.a;
                            float c = z0v.c(true, z10, cVar.c(), booleanValue, oq5Var4);
                            if (booleanValue) {
                                c = (c - gtuVar2.e) - gtuVar2.j;
                            }
                            if (v == onu.c) {
                                oq5Var4.Z(1289112396);
                                d = z0v.d(oq5Var4);
                                oq5Var4.p(false);
                                oq5Var4.p(false);
                            } else {
                                oq5Var4.Z(1286349862);
                                oq5Var4.p(false);
                                if (v == onu.b) {
                                    oq5Var4.Z(1289193368);
                                    d = z0v.d(oq5Var4) + (c / 2);
                                    oq5Var4.p(false);
                                    oq5Var4.p(false);
                                } else {
                                    oq5Var4.Z(1286349862);
                                    oq5Var4.p(false);
                                    float f6 = f5 - z0v.b;
                                    cma cmaVar = new cma(c - (z0v.d + f6));
                                    cma cmaVar2 = new cma(cVar.d());
                                    if (cmaVar.compareTo(cmaVar2) > 0) {
                                        cmaVar = cmaVar2;
                                    }
                                    d = ((cmaVar.a + f6) / 2) + z0v.d(oq5Var4);
                                    oq5Var4.p(false);
                                }
                            }
                            float c2 = d / cVar.c();
                            if (I3) {
                                float d2 = cVar.d();
                                gtuVar.getClass();
                                f3 = 1 - (((cVar.d() - (d2 * 0.33333334f)) / 2) / cVar.d());
                            } else {
                                f3 = 0.5f;
                            }
                            enj enjVar = new enj(swf.i(f3, c2));
                            Boolean valueOf2 = Boolean.valueOf(z6);
                            wn5 wn5Var3 = wn5Var2;
                            sdr sdrVar2 = sdrVar;
                            wn5Var3.invoke(sdrVar2, enjVar, valueOf2, hq5Var3, 0);
                            ltu ltuVar3 = ltuVar2;
                            ywf.i(ltuVar3, ild.C(1282502289, new s43(ltuVar3, sdrVar2, z10, ab0Var2, 29), hq5Var3), hq5Var3, 48);
                            return Unit.a;
                        }
                    }, hq5Var2), hq5Var2, 3072, 6);
                    return Unit.a;
                }
            }, oq5Var), oq5Var, 56);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new vu0(ab0Var, wn5Var, ltuVar, z, yciVar, i, 7);
        }
    }

    public static final void k(ab0 ab0Var, wn5 wn5Var, wn5 wn5Var2, ltu ltuVar, boolean z, hq5 hq5Var, int i) {
        oq5 oq5Var;
        ab0Var.getClass();
        ltuVar.getClass();
        oq5 oq5Var2 = (oq5) hq5Var;
        oq5Var2.b0(-1855746115);
        int i2 = i | (oq5Var2.h(ab0Var) ? 4 : 2) | (oq5Var2.h(wn5Var) ? 32 : 16) | (oq5Var2.f(ltuVar) ? 2048 : 1024) | (oq5Var2.g(z) ? 16384 : RemoteCameraConfig.Notification.ID);
        if ((i2 & 9363) == 9362 && oq5Var2.z()) {
            oq5Var2.S();
            oq5Var = oq5Var2;
        } else {
            sdr a2 = pk0.a(((Boolean) gld.O((vdr) ltuVar.c.b, oq5Var2).getValue()).booleanValue() ? 24 : 0, null, "landing corner animation for bar above", oq5Var2, 384, 10);
            ta5 a3 = sa5.a(qx0.c, b2c.n, oq5Var2, 0);
            int i3 = oq5Var2.P;
            a l = oq5Var2.l();
            vci vciVar = vci.a;
            yci H = vnj.H(oq5Var2, vciVar);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var2.d0();
            if (oq5Var2.O) {
                oq5Var2.k(grbVar);
            } else {
                oq5Var2.n0();
            }
            g0g.U(oq5Var2, a3, wp5.f);
            g0g.U(oq5Var2, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var2.O || !Intrinsics.d(oq5Var2.K(), Integer.valueOf(i3))) {
                ouj.x(i3, oq5Var2, i3, kb5Var);
            }
            g0g.U(oq5Var2, H, wp5.d);
            wn5Var2.invoke(oq5Var2, 6);
            yci u = xp3.u(androidx.compose.foundation.a.b(vciVar, ((dq0) oq5Var2.j(eq0.a)).c.a, vnj.i), ugo.c(((cma) a2.getValue()).a, ((cma) a2.getValue()).a));
            int i4 = i2 & 126;
            int i5 = i2 >> 3;
            j(ab0Var, wn5Var, ltuVar, z, u, oq5Var2, (i5 & 7168) | i4 | (i5 & 896));
            oq5Var = oq5Var2;
            oq5Var.p(true);
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new qr(ab0Var, wn5Var, z, wn5Var2, ltuVar, i, 19);
        }
    }

    public static final void l(yci yciVar, hq5 hq5Var, int i) {
        yci yciVar2;
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.b0(-1600016459);
        if (((i | 6) & 3) == 2 && oq5Var.z()) {
            oq5Var.S();
            yciVar2 = yciVar;
        } else {
            vci vciVar = vci.a;
            yci c = d.c(vciVar, 1.0f);
            ta5 a2 = sa5.a(qx0.e, b2c.o, oq5Var, 54);
            int i2 = oq5Var.P;
            a l = oq5Var.l();
            yci H = vnj.H(oq5Var, c);
            xp5.T.getClass();
            grb grbVar = wp5.b;
            oq5Var.d0();
            if (oq5Var.O) {
                oq5Var.k(grbVar);
            } else {
                oq5Var.n0();
            }
            g0g.U(oq5Var, a2, wp5.f);
            g0g.U(oq5Var, l, wp5.e);
            kb5 kb5Var = wp5.g;
            if (oq5Var.O || !Intrinsics.d(oq5Var.K(), Integer.valueOf(i2))) {
                ouj.x(i2, oq5Var, i2, kb5Var);
            }
            g0g.U(oq5Var, H, wp5.d);
            neg.o(oq5Var);
            w4k E = a0g.E(R.drawable.ic_search_24, 0, oq5Var);
            yci m = d.m(vciVar, 64);
            agr agrVar = eq0.a;
            gae.b(E, null, m, ((dq0) oq5Var.j(agrVar)).a.a, oq5Var, 432, 0);
            neg.s(oq5Var);
            xcs.b(rvf.M(R.string.wizard_search_empty_result, oq5Var), androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 40, 0.0f, 0.0f, 13), ((dq0) oq5Var.j(agrVar)).b.a, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, neg.t(oq5Var).c.c, oq5Var, 48, 0, 65016);
            neg.s(oq5Var);
            xcs.b(rvf.M(R.string.wizard_search_empty_result_description, oq5Var), androidx.compose.foundation.layout.a.q(vciVar, 0.0f, 12, 0.0f, 0.0f, 13), ((dq0) oq5Var.j(agrVar)).b.b, 0L, null, 0L, null, new o9s(3), 0L, 0, false, 0, 0, null, neg.t(oq5Var).c.d, oq5Var, 48, 0, 65016);
            oq5Var = oq5Var;
            oq5Var.p(true);
            yciVar2 = vciVar;
        }
        xmn r = oq5Var.r();
        if (r != null) {
            r.d = new cxd(yciVar2, i, 29);
        }
    }

    public static final void m(bfu bfuVar, uoo uooVar, nyf nyfVar) {
        uooVar.getClass();
        nyfVar.getClass();
        ooo oooVar = (ooo) bfuVar.getCloseable("androidx.lifecycle.savedstate.vm.tag");
        if (oooVar == null || oooVar.c) {
            return;
        }
        oooVar.a(uooVar, nyfVar);
        M(uooVar, nyfVar);
    }

    public static Object n(Task task) {
        y1g.F("Must not be called on the main application thread");
        y1g.E();
        y1g.H(task, "Task must not be null");
        if (task.k()) {
            return Q(task);
        }
        knn knnVar = new knn(24);
        Executor executor = j8s.b;
        task.d(executor, knnVar);
        task.c(executor, knnVar);
        task.a(executor, knnVar);
        ((CountDownLatch) knnVar.b).await();
        return Q(task);
    }

    public static Object o(Task task, long j, TimeUnit timeUnit) {
        y1g.F("Must not be called on the main application thread");
        y1g.E();
        y1g.H(task, "Task must not be null");
        y1g.H(timeUnit, "TimeUnit must not be null");
        if (task.k()) {
            return Q(task);
        }
        knn knnVar = new knn(24);
        Executor executor = j8s.b;
        task.d(executor, knnVar);
        task.c(executor, knnVar);
        task.a(executor, knnVar);
        if (((CountDownLatch) knnVar.b).await(j, timeUnit)) {
            return Q(task);
        }
        throw new TimeoutException("Timed out waiting for Task");
    }

    public static onx p(Executor executor, Callable callable) {
        y1g.H(executor, "Executor must not be null");
        onx onxVar = new onx();
        executor.execute(new rxw(onxVar, callable, false, 23));
        return onxVar;
    }

    public static final ooo q(uoo uooVar, nyf nyfVar, String str, Bundle bundle) {
        noo nooVar;
        uooVar.getClass();
        nyfVar.getClass();
        Bundle a2 = uooVar.a(str);
        if (a2 != null) {
            bundle = a2;
        }
        if (bundle == null) {
            nooVar = new noo();
        } else {
            ClassLoader classLoader = noo.class.getClassLoader();
            classLoader.getClass();
            bundle.setClassLoader(classLoader);
            f9h f9hVar = new f9h(bundle.size());
            for (String str2 : bundle.keySet()) {
                str2.getClass();
                f9hVar.put(str2, bundle.get(str2));
            }
            nooVar = new noo(f9hVar.b());
        }
        ooo oooVar = new ooo(str, nooVar);
        oooVar.a(uooVar, nyfVar);
        M(uooVar, nyfVar);
        return oooVar;
    }

    public static zwf r(qvs qvsVar, qvs qvsVar2, long j, long j2, boolean z) {
        if (qvsVar == null || qvsVar2 == null) {
            if (z) {
                return null;
            }
            long j3 = j - 5000;
            StringBuilder l = tlm.l(j3, "fade-out start ", ", stop ");
            l.append(j);
            ssg.a(3, "SmartCrossfade", l.toString(), null);
            ssg.a(3, "SmartCrossfade", "fade-in start 0, stop 5000", null);
            ssg.a(3, "SmartCrossfade", "swap players in " + j3, null);
            return new xzq(j2, 0L, 5000L, j3, j);
        }
        long j4 = qvsVar.c;
        long j5 = qvsVar.d;
        long j6 = qvsVar2.a;
        long j7 = qvsVar2.b;
        long j8 = j5 - j4;
        long j9 = j7 - j6;
        StringBuilder l2 = tlm.l(j4, "fade-out start ", ", stop ");
        l2.append(j5);
        ssg.a(3, "SmartCrossfade", l2.toString(), null);
        ssg.a(3, "SmartCrossfade", "fade-in start " + j6 + ", stop " + j7, null);
        if (z) {
            if (j9 >= j8) {
                ssg.a(3, "SmartCrossfade", dfi.d(j4 - j6, "swap players in "), null);
                return new vzq(j2, j6, j7, j4, j5);
            }
            ssg.a(3, "SmartCrossfade", dfi.d(j5 - j7, "swap players in "), null);
            return new e0r(j2, j4, j5, j6, j7, 0);
        }
        if (j9 >= j8) {
            ssg.a(3, "SmartCrossfade", dfi.d(j4 - j6, "swap players in "), null);
            return new xzq(j2, j6, j7, j4, j5);
        }
        ssg.a(3, "SmartCrossfade", dfi.d(j5 - j7, "swap players in "), null);
        return new e0r(j2, j4, j5, j6, j7, 1);
    }

    public static final bhs s(hq5 hq5Var) {
        float E = hag.E(60, 1, hq5Var);
        float f = 310;
        qs5 qs5Var = AndroidCompositionLocals_androidKt.a;
        Configuration configuration = (Configuration) ((oq5) hq5Var).j(qs5Var);
        return new bhs(E, ((Configuration) ((oq5) hq5Var).j(qs5Var)).screenWidthDp < 320, ((float) configuration.screenWidthDp) / configuration.fontScale < f, f);
    }

    public static final float t(o3k o3kVar) {
        return o3kVar.l().e == bxj.b ? Float.intBitsToFloat((int) (o3kVar.r() >> 32)) : Float.intBitsToFloat((int) (o3kVar.r() & 4294967295L));
    }

    public static final boolean u(long j, long j2) {
        return j == j2;
    }

    public static onx v(Exception exc) {
        onx onxVar = new onx();
        onxVar.p(exc);
        return onxVar;
    }

    public static onx w(Object obj) {
        onx onxVar = new onx();
        onxVar.q(obj);
        return onxVar;
    }

    public static izm x(String str) {
        if (str.equals("http/1.0")) {
            return izm.HTTP_1_0;
        }
        if (str.equals("http/1.1")) {
            return izm.HTTP_1_1;
        }
        if (str.equals("h2_prior_knowledge")) {
            return izm.H2_PRIOR_KNOWLEDGE;
        }
        if (str.equals("h2")) {
            return izm.HTTP_2;
        }
        if (str.equals("spdy/3.1")) {
            return izm.SPDY_3;
        }
        if (str.equals("quic")) {
            return izm.QUIC;
        }
        kac.f("Unexpected protocol: ".concat(str));
        return null;
    }

    public static final woo y(View view) {
        view.getClass();
        while (view != null) {
            Object tag = view.getTag(R.id.view_tree_saved_state_registry_owner);
            woo wooVar = tag instanceof woo ? (woo) tag : null;
            if (wooVar != null) {
                return wooVar;
            }
            Object B = rvf.B(view);
            view = B instanceof View ? (View) B : null;
        }
        return null;
    }

    public static boolean z(String str) {
        so0 so0Var = xdv.a;
        Set<to0> unmodifiableSet = Collections.unmodifiableSet(to0.c);
        HashSet hashSet = new HashSet();
        for (to0 to0Var : unmodifiableSet) {
            if (to0Var.a.equals(str)) {
                hashSet.add(to0Var);
            }
        }
        if (hashSet.isEmpty()) {
            wvs.p("Unknown feature ".concat(str));
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            to0 to0Var2 = (to0) it.next();
            if (to0Var2.a() || to0Var2.b()) {
                return true;
            }
        }
        return false;
    }
}
