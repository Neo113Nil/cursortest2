package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.ContextThemeWrapper;
import android.view.View;
import androidx.camera.camera2.internal.l;
import androidx.compose.ui.platform.ComposeView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.a;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.bugreport.router.b;
import ru.yandex.taxi.requirements.interactor.x;

/* loaded from: classes6.dex */
public final class sk7 implements a98, mfg, mhs0, wni {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public Object w;

    public sk7(c06 c06Var) {
        this.a = 1;
        this.w = c06Var;
        this.c = new AtomicBoolean(false);
        this.b = ((l) c06Var.b).w.schedule(new js4(28, this), 2000L, TimeUnit.MILLISECONDS);
    }

    public static String g(String str) {
        if (!evu0.J(str)) {
            Uri parse = Uri.parse(str);
            if (!parse.isOpaque()) {
                Uri.Builder path = new Uri.Builder().scheme(parse.getScheme()).authority(parse.getHost()).path(parse.getPath());
                Iterator<String> it = parse.getQueryParameterNames().iterator();
                while (it.hasNext()) {
                    path.appendQueryParameter(it.next(), "hidden");
                }
                return path.toString();
            }
        }
        return str;
    }

    public void a(gmw0 gmw0Var, int i, String str) {
        ((x8) ((g580) ((i3y) this.c).getValue())).e(((dqe0) this.b).a.x);
        ejj0 p = str != null ? gmw0Var.p(str) : null;
        ArrayList arrayList = new ArrayList(((x) ((i3y) this.w).getValue()).c(gmw0Var));
        if (i < 0 || i >= arrayList.size()) {
            if (p != null) {
                arrayList.add(p);
            }
        } else if (p != null) {
            arrayList.set(i, p);
        } else {
            arrayList.remove(i);
        }
        ((x) ((i3y) this.w).getValue()).a(gmw0Var, arrayList);
    }

    public k1t b(boolean z) {
        return new k1t((String) this.b, (String) this.c, (Calendar) this.w, z);
    }

    public wl3 c() {
        wl3 wl3Var = (wl3) this.c;
        Objects.requireNonNull(wl3Var);
        return wl3Var;
    }

    public String d() {
        return (String) this.b;
    }

    public boolean e() {
        return ((wl3) this.c) == null;
    }

    public ArrayList f(List list, Map map, cxu0 cxu0Var) {
        Iterator it;
        List singletonList;
        String str;
        Context context;
        Iterator it2;
        gmw0 gmw0Var;
        List list2;
        ArrayList arrayList;
        px8 px8Var;
        String str2;
        az8 az8Var;
        sk7 sk7Var = this;
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = list.iterator();
        while (it3.hasNext()) {
            apj0 apj0Var = (apj0) it3.next();
            cz8 cz8Var = (cz8) map.get(apj0Var.a);
            Context context2 = (Context) sk7Var.w;
            if (apj0Var.l.equals(Boolean.FALSE)) {
                String str3 = apj0Var.j;
                singletonList = Collections.singletonList(new sx8(apj0Var.a, apj0Var.b, str3 == null ? cz8Var != null ? cz8Var.a : null : str3, apj0Var.m));
            } else {
                tlx0 tlx0Var = apj0Var.f;
                if (tlx0Var != null) {
                    singletonList = Collections.singletonList(new ox8(apj0Var.a, apj0Var.b, tlx0Var.c, cz8Var != null ? cz8Var.a : null, tlx0Var.b, tlx0Var.a));
                } else {
                    gmw0 gmw0Var2 = apj0Var.k;
                    if (gmw0Var2 != null) {
                        List c = ((x) sk7Var.c).c(gmw0Var2);
                        ArrayList arrayList3 = gmw0Var2.t.a;
                        ArrayList arrayList4 = new ArrayList(tcc.n(arrayList3, 10));
                        int i = 0;
                        for (Object obj : arrayList3) {
                            int i2 = i + 1;
                            if (i < 0) {
                                scc.m();
                                throw null;
                            }
                            qvd qvdVar = (qvd) obj;
                            ejj0 ejj0Var = (ejj0) a.S(i, c);
                            if (cxu0Var != null) {
                                str = null;
                                context = new ContextThemeWrapper(context2, cxu0Var.b);
                            } else {
                                str = null;
                                context = context2;
                            }
                            if (ejj0Var != null) {
                                if (cz8Var == null || (az8Var = (az8) cz8Var.b.get(ejj0Var.a)) == null || (str2 = az8Var.a) == null) {
                                    str2 = ejj0Var.k;
                                }
                                String a = str2 != null ? ((m7x0) ((k7x0) sk7Var.b)).a(str2) : str;
                                it2 = it3;
                                list2 = c;
                                gmw0Var = gmw0Var2;
                                arrayList = arrayList4;
                                px8Var = new px8(apj0Var.a, ejj0Var.b, a, true, new cdc(qje.t(xng0.controlMain, context)), new cdc(qje.u(context.getTheme(), xng0.textOnControl)), gmw0Var, i, apj0Var.n);
                            } else {
                                it2 = it3;
                                gmw0Var = gmw0Var2;
                                list2 = c;
                                arrayList = arrayList4;
                                px8Var = new px8(apj0Var.a, qvdVar.a, cz8Var != null ? cz8Var.a : str, false, new cdc(qje.t(xng0.controlMain, context)), new cdc(qje.u(context.getTheme(), xng0.textOnControl)), gmw0Var, i, apj0Var.n);
                            }
                            arrayList.add(px8Var);
                            c = list2;
                            arrayList4 = arrayList;
                            gmw0Var2 = gmw0Var;
                            i = i2;
                            it3 = it2;
                            sk7Var = this;
                        }
                        it = it3;
                        singletonList = a.x0(arrayList4, new ay8());
                    } else {
                        it = it3;
                        if (cxu0Var != null) {
                            context2 = new ContextThemeWrapper(context2, cxu0Var.b);
                        }
                        singletonList = Collections.singletonList(new qx8(apj0Var.a, apj0Var.b, cz8Var != null ? cz8Var.a : null, apj0Var.e, new cdc(qje.t(xng0.controlMain, context2)), new cdc(qje.u(context2.getTheme(), xng0.textOnControl))));
                    }
                    ycc.r(singletonList, arrayList2);
                    sk7Var = this;
                    it3 = it;
                }
            }
            it = it3;
            ycc.r(singletonList, arrayList2);
            sk7Var = this;
            it3 = it;
        }
        return arrayList2;
    }

    @Override // defpackage.mhs0
    public void h(Canvas canvas, RectF rectF) {
        Paint paint = (Paint) this.c;
        paint.setColor(((zrv) this.b).b.r());
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
    }

    public b i() {
        c0g c0gVar = (c0g) ((i6r) this.b);
        jj3 jj3Var = (jj3) c0gVar.T7.get();
        q5z.h(jj3Var);
        zzf zzfVar = c0gVar.z;
        ru.yandex.taxi.am.token.a aVar = (ru.yandex.taxi.am.token.a) zzfVar.C3.get();
        q5z.h(aVar);
        gf41 gf41Var = new gf41(i5m.a((hwf) this.c));
        o b = zzfVar.b();
        rqo l2 = c0gVar.l2();
        q5z.h(l2);
        return new b(jj3Var, aVar, gf41Var, b, new pr6(l2, 0), (hwf) this.w);
    }

    public Object j(tls tlsVar) {
        try {
            return tlsVar.invoke((f3c) this.c);
        } catch (NullPointerException e) {
            if (!ydz.a.a()) {
                return null;
            }
            e.toString();
            ydz.a();
            return null;
        } catch (SecurityException e2) {
            if (!ydz.a.a()) {
                return null;
            }
            e2.toString();
            ydz.a();
            return null;
        }
    }

    @Override // defpackage.wni
    public ComposeView m(uni uniVar, vni vniVar) {
        switch (this.a) {
            case 23:
                ComposeView composeView = new ComposeView(((y30) this.b).a(), null, 0, 6, null);
                composeView.setContent(new androidx.compose.runtime.internal.a(1423987137, new ebe(this, 0), true));
                return composeView;
            default:
                ComposeView composeView2 = new ComposeView(((y30) this.b).a(), null, 0, 6, null);
                composeView2.setContent(new androidx.compose.runtime.internal.a(-25672460, new t1f(this, 0), true));
                return composeView2;
        }
    }

    @Override // defpackage.mhs0
    public void s(Canvas canvas, float f, float f2, bb1 bb1Var, int i, float f3, int i2) {
        Paint paint = (Paint) this.c;
        paint.setColor(i);
        RectF rectF = (RectF) this.w;
        float f4 = ((vrv) bb1Var).f;
        rectF.left = f - f4;
        rectF.top = f2 - f4;
        rectF.right = f + f4;
        rectF.bottom = f2 + f4;
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), f4, paint);
    }

    public /* synthetic */ sk7(int i, Object obj, Object obj2, String str) {
        this.a = i;
        this.w = obj;
        this.b = str;
        this.c = obj2;
    }

    public sk7(zrv zrvVar) {
        this.a = 17;
        this.b = zrvVar;
        this.c = new Paint();
        this.w = new RectF();
    }

    public sk7(View view) {
        this.a = 2;
        this.b = view;
        this.c = view.findViewById(zgh0.permissionClose);
        this.w = view.findViewById(zgh0.settings);
    }

    public sk7(Context context, me0 me0Var) {
        this.a = 21;
        this.b = context;
        this.c = me0Var;
    }

    public sk7(ijj0 ijj0Var, h580 h580Var, dqe0 dqe0Var) {
        this.a = 20;
        this.b = dqe0Var;
        this.c = kotlin.a.a(new lyc(9, h580Var));
        this.w = kotlin.a.a(new jhd(4, this, ijj0Var));
    }

    public sk7(String str, ym3 ym3Var) {
        this.a = 28;
        z83.c(null, TextUtils.isEmpty(str));
        this.b = str;
        this.c = null;
        this.w = ym3Var;
    }

    public sk7(String str, wl3 wl3Var, cn3 cn3Var) {
        this.a = 28;
        z83.c(null, TextUtils.isEmpty(str));
        this.b = str;
        this.c = wl3Var;
        this.w = cn3Var;
    }

    public sk7(i6r i6rVar) {
        this.a = 29;
        this.b = i6rVar;
        this.c = new hwf(i6rVar, 13);
        this.w = new hwf(i6rVar, 12);
    }

    public /* synthetic */ sk7(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }
}
