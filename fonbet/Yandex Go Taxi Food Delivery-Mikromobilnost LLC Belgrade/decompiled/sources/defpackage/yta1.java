package defpackage;

import android.os.Build;
import android.os.Looper;
import android.util.LongSparseArray;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.semantics.a;
import androidx.compose.ui.semantics.b;
import androidx.compose.ui.semantics.c;
import androidx.compose.ui.semantics.d;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.masstransit.datasource.routing.MtTransportType;

/* loaded from: classes6.dex */
public abstract class yta1 {
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = r4.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r4 = r4.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void a(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        jnq0 jnq0Var;
        c cVar;
        ag agVar;
        tls tlsVar;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse p = hl1.p(longSparseArray.get(keyAt));
            if (p != null && value != null && text != null && (jnq0Var = (jnq0) androidContentCaptureManager.getCurrentSemanticsNodes$ui().b((int) keyAt)) != null && (cVar = jnq0Var.a) != null && (agVar = (ag) b.a(cVar.d, a.l)) != null && (tlsVar = (tls) agVar.b) != null) {
            }
        }
    }

    public static final boolean b(Fragment fragment) {
        if (fragment.isRemoving() || fragment.requireActivity().isFinishing()) {
            return true;
        }
        boolean z = false;
        for (Fragment parentFragment = fragment.getParentFragment(); !z && parentFragment != null; parentFragment = parentFragment.getParentFragment()) {
            z = parentFragment.isRemoving();
        }
        return z;
    }

    public static void c(AndroidContentCaptureManager androidContentCaptureManager, long[] jArr, Consumer consumer) {
        c cVar;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        for (long j : jArr) {
            jnq0 jnq0Var = (jnq0) androidContentCaptureManager.getCurrentSemanticsNodes$ui().b((int) j);
            if (jnq0Var != null && (cVar = jnq0Var.a) != null) {
                hl1.w();
                ViewTranslationRequest.Builder n = hl1.n(androidContentCaptureManager.getView().getAutofillId(), cVar.f);
                List list = (List) b.a(cVar.d, d.C);
                if (list != null) {
                    forText = TranslationRequestValue.forText(new kk2(rty.a(62, null, "\n", list)));
                    n.setValue("android:text", forText);
                    build = n.build();
                    consumer.accept(build);
                }
            }
        }
    }

    public static void d(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (jl40.l(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            a(androidContentCaptureManager, longSparseArray);
        } else {
            androidContentCaptureManager.getView().post(new hc(16, androidContentCaptureManager, longSparseArray));
        }
    }

    public static final ArrayList e(List list, fay0 fay0Var) {
        Iterator it;
        List singletonList;
        u611 u611Var;
        a0c0 a0c0Var;
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            m1j m1jVar = (m1j) next;
            if (m1jVar instanceof hj5) {
                hj5 hj5Var = (hj5) m1jVar;
                singletonList = Collections.singletonList(new h611(hj5Var.a, hj5Var.b, null, hj5Var.c, hj5Var.d, hj5Var.e, hj5Var.f, b64.j(hj5Var.g, "_begin_section")));
            } else if (m1jVar instanceof pj5) {
                pj5 pj5Var = (pj5) m1jVar;
                singletonList = Collections.singletonList(new i611(pj5Var.b, pj5Var.c, pj5Var.a, pj5Var.e, pj5Var.f, pj5Var.g, pj5Var.h, b64.j(pj5Var.i, "_begin_suburban_section")));
            } else {
                if (m1jVar instanceof oj5) {
                    oj5 oj5Var = (oj5) m1jVar;
                    it = it2;
                    singletonList = Collections.singletonList(new g611(oj5Var.a, oj5Var.b, oj5Var.c, oj5Var.d, oj5Var.e, oj5Var.f, oj5Var.g, oj5Var.h, oj5Var.i, oj5Var.j, oj5Var.k.concat("_begin_scooter_section")));
                } else {
                    it = it2;
                    if (m1jVar instanceof e0o) {
                        e0o e0oVar = (e0o) m1jVar;
                        singletonList = Collections.singletonList(new l611(e0oVar.a, e0oVar.b, e0oVar.c, e0oVar.d, e0oVar.e, e0oVar.f, e0oVar.g, e0oVar.h.concat("_end_scooter_section")));
                    } else if (m1jVar instanceof jar) {
                        jar jarVar = (jar) m1jVar;
                        singletonList = Collections.singletonList(new n611(jarVar.a, jarVar.b, null, jarVar.c, jarVar.d, jarVar.e, b64.j(jarVar.f, "_finish_section")));
                    } else if (m1jVar instanceof nra0) {
                        nra0 nra0Var = (nra0) m1jVar;
                        singletonList = Collections.singletonList(new r611(nra0Var.a, nra0Var.b, nra0Var.c, nra0Var.d, b64.j(nra0Var.e, "_pedestrian_section")));
                    } else if (m1jVar instanceof eay0) {
                        ListBuilder a = rcc.a();
                        eay0 eay0Var = (eay0) m1jVar;
                        h911 h911Var = eay0Var.h;
                        String str = eay0Var.i;
                        a.add(new j611(eay0Var.b, eay0Var.c, eay0Var.d, (fay0Var != null ? fay0Var.g : null) != null, eay0Var.a, eay0Var.f, fay0Var != null ? fay0Var.h : null, fay0Var != null ? fay0Var.d : null, fay0Var != null ? fay0Var.i : null, (fay0Var == null || (a0c0Var = fay0Var.f) == null) ? null : a0c0Var.a, eay0Var.g, fay0Var != null ? fay0Var.g : null, h911Var, b64.j(str, "_begin_taxi_section")));
                        if (fay0Var != null && (u611Var = fay0Var.g) != null) {
                            a.add(new v611(u611Var, h911Var, b64.j(str, "_taxi_feedback_section")));
                        }
                        singletonList = a.j();
                    } else if (m1jVar instanceof zj5) {
                        zj5 zj5Var = (zj5) m1jVar;
                        singletonList = Collections.singletonList(new k611(zj5Var.b, zj5Var.c, zj5Var.a, zj5Var.e, zj5Var.f, zj5Var.g, zj5Var.h, b64.j(zj5Var.i, "_begin_underground_section")));
                    } else if (m1jVar instanceof i0o) {
                        i0o i0oVar = (i0o) m1jVar;
                        singletonList = Collections.singletonList(new m611(i0oVar.a, i0oVar.b, i0oVar.c, i0oVar.d, i0oVar.e, i0oVar.f, i0oVar.g, b64.j(i0oVar.h, "_end_transport_section")));
                    } else if (m1jVar instanceof xpw) {
                        xpw xpwVar = (xpw) m1jVar;
                        singletonList = Collections.singletonList(new q611(xpwVar.a, xpwVar.b, xpwVar.c, xpwVar.d, xpwVar.f, b64.j(xpwVar.g, "_intermediate_stop_item")));
                    } else if (m1jVar instanceof liu0) {
                        liu0 liu0Var = (liu0) m1jVar;
                        singletonList = Collections.singletonList(new s611(liu0Var.a, liu0Var.b, liu0Var.c, liu0Var.d, liu0Var.e, liu0Var.f, liu0Var.g, liu0Var.h, b64.j(liu0Var.i, "_stops_group_item")));
                    } else if (m1jVar instanceof xyy0) {
                        xyy0 xyy0Var = (xyy0) m1jVar;
                        singletonList = Collections.singletonList(new w611(xyy0Var.a, xyy0Var.b, xyy0Var.c, b64.j(xyy0Var.d, "_thread_variants_button_item")));
                    } else if (m1jVar instanceof kd01) {
                        kd01 kd01Var = (kd01) m1jVar;
                        singletonList = Collections.singletonList(new b711(kd01Var.a, kd01Var.b, kd01Var.d, b64.j(kd01Var.e, "_trains_buttons_item")));
                    } else if (m1jVar instanceof vs01) {
                        vs01 vs01Var = (vs01) m1jVar;
                        singletonList = Collections.singletonList(new c711(vs01Var.a, vs01Var.b, vs01Var.c, b64.j(vs01Var.d, "_transfer_route_item")));
                    } else if (m1jVar instanceof jt01) {
                        jt01 jt01Var = (jt01) m1jVar;
                        singletonList = Collections.singletonList(new d711(jt01Var.b, jt01Var.c, jt01Var.d, jt01Var.a, jt01Var.e, jt01Var.f, b64.j(jt01Var.g, "_transfer_stop_item")));
                    } else if (m1jVar instanceof m911) {
                        m911 m911Var = (m911) m1jVar;
                        singletonList = Collections.singletonList(new e711(m911Var.a, m911Var.b, qv10.h(i, m911Var.c, "_transport_stop_item_")));
                    } else if (m1jVar instanceof ux11) {
                        ux11 ux11Var = (ux11) m1jVar;
                        singletonList = Collections.singletonList(new f711(ux11Var.a, ux11Var.b, ux11Var.c, b64.j(ux11Var.d, "_underground_boarding_positions")));
                    } else if (m1jVar instanceof yx11) {
                        yx11 yx11Var = (yx11) m1jVar;
                        singletonList = Collections.singletonList(new g711(yx11Var.a, yx11Var.b, yx11Var.c, yx11Var.d, b64.j(yx11Var.e, "_underground_info")));
                    } else if (m1jVar instanceof jr1) {
                        jr1 jr1Var = (jr1) m1jVar;
                        obm obmVar = jr1Var.a;
                        String str2 = jr1Var.b;
                        singletonList = Collections.singletonList(new d611(str2, obmVar, new ib11(MtTransportType.UNKNOWN, str2, new bdc(xng0.error), new bdc(xng0.everFront), "", "", null, false, false, null, null, null, 3648), jr1Var.d, b64.j(jr1Var.e, "_alert_item")));
                    } else if (m1jVar instanceof sn4) {
                        sn4 sn4Var = (sn4) m1jVar;
                        singletonList = Collections.singletonList(new e611(sn4Var.a, sn4Var.b, sn4Var.d, b64.j(sn4Var.e, "_badge_with_subtitle_item")));
                    } else {
                        if (!(m1jVar instanceof yi5)) {
                            w511.b();
                            return null;
                        }
                        yi5 yi5Var = (yi5) m1jVar;
                        singletonList = Collections.singletonList(new f611(yi5Var.a, yi5Var.b, yi5Var.c, yi5Var.d, yi5Var.f, yi5Var.g, yi5Var.h, b64.j(yi5Var.i, "_begin_ground_section_item")));
                    }
                }
                ycc.r(singletonList, arrayList);
                i = i2;
                it2 = it;
            }
            it = it2;
            ycc.r(singletonList, arrayList);
            i = i2;
            it2 = it;
        }
        return arrayList;
    }

    public abstract el91 f(ql91 ql91Var);

    public abstract ll91 g(ql91 ql91Var);

    public abstract void h(ll91 ll91Var, ll91 ll91Var2);

    public abstract void i(ll91 ll91Var, Thread thread);

    public abstract boolean j(ql91 ql91Var, el91 el91Var, el91 el91Var2);

    public abstract boolean k(ql91 ql91Var, Object obj, Object obj2);

    public abstract boolean l(ql91 ql91Var, ll91 ll91Var, ll91 ll91Var2);
}
