package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.draw.ShadowGraphicsLayerElement;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import okhttp3.OkHttpClient;
import ru.yandex.video.m3.data.DrmType;

/* loaded from: classes.dex */
public final class hxo extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hxo(int i, Object obj) {
        super(1);
        this.r = i;
        this.s = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        ynn T0;
        float f = 0.0f;
        boolean z = false;
        Object obj2 = null;
        switch (this.r) {
            case 0:
                dc6 dc6Var = ((lxo) this.s).F;
                dc6Var.t = (wof) obj;
                if (dc6Var.v && (T0 = dc6Var.T0()) != null && !dc6Var.U0(T0, dc6Var.w)) {
                    dc6Var.u = true;
                    dc6Var.V0();
                }
                dc6Var.v = false;
                return Unit.a;
            case 1:
                long j = ((enj) obj).a;
                iyo iyoVar = (iyo) this.s;
                return new enj(iyo.a(iyoVar, iyoVar.j, j, iyoVar.i));
            case 2:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                g0c g0cVar = ((mcp) this.s).h;
                qne s1 = gut.s1(fbs.CVN, booleanValue, null);
                x60 x60Var = (x60) g0cVar;
                x60Var.getClass();
                x60Var.a(s1);
                return Unit.a;
            case 3:
                wfp.q((jfp) obj, ((meo) this.s).a);
                return Unit.a;
            case 4:
                ((List) obj).add((Float) ((nuf) this.s).invoke());
                return true;
            case 5:
                c7t c7tVar = (c7t) obj;
                c7tVar.getClass();
                int[] iArr = c7tVar.a;
                IntRange intRange = (IntRange) this.s;
                int length = iArr.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (intRange.q(iArr[i])) {
                            z = true;
                        } else {
                            i++;
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 6:
                ((r2f) this.s).g(null);
                return Unit.a;
            case 7:
                zco zcoVar = (zco) obj;
                ShadowGraphicsLayerElement shadowGraphicsLayerElement = (ShadowGraphicsLayerElement) this.s;
                zcoVar.o(zcoVar.q.getDensity() * shadowGraphicsLayerElement.a);
                zcoVar.r(shadowGraphicsLayerElement.b);
                zcoVar.c(shadowGraphicsLayerElement.c);
                zcoVar.b(shadowGraphicsLayerElement.d);
                zcoVar.t(shadowGraphicsLayerElement.e);
                return Unit.a;
            case 8:
                zco zcoVar2 = (zco) obj;
                wiq wiqVar = (wiq) this.s;
                zcoVar2.k(wiqVar.o);
                zcoVar2.n(wiqVar.p);
                zcoVar2.a(wiqVar.q);
                zcoVar2.x(0.0f);
                zcoVar2.y(0.0f);
                zcoVar2.o(wiqVar.r);
                zcoVar2.j(wiqVar.s);
                float f2 = wiqVar.t;
                if (zcoVar2.k != f2) {
                    zcoVar2.a |= 2048;
                    zcoVar2.k = f2;
                }
                zcoVar2.v(wiqVar.u);
                zcoVar2.r(wiqVar.v);
                zcoVar2.c(wiqVar.w);
                zcoVar2.h(null);
                zcoVar2.b(wiqVar.x);
                zcoVar2.t(wiqVar.y);
                zcoVar2.d(wiqVar.z);
                return Unit.a;
            case 9:
                return Boolean.valueOf(Intrinsics.d(((b4c) obj).a, (g1r) this.s));
            case 10:
                if (obj instanceof ner) {
                    ((ner) obj).c(4);
                }
                ((upi) this.s).a(obj);
                return Unit.a;
            case 11:
                a42 a42Var = (a42) this.s;
                synchronized (a42Var.b) {
                    v2r v2rVar = (v2r) a42Var.j;
                    v2rVar.getClass();
                    Object obj3 = v2rVar.b;
                    obj3.getClass();
                    int i2 = v2rVar.d;
                    cpi cpiVar = v2rVar.c;
                    if (cpiVar == null) {
                        cpiVar = new cpi();
                        v2rVar.c = cpiVar;
                        v2rVar.f.m(obj3, cpiVar);
                    }
                    v2rVar.c(obj, i2, obj3, cpiVar);
                }
                return Unit.a;
            case 12:
                yr7 yr7Var = (yr7) obj;
                yr7Var.getClass();
                yar yarVar = (yar) this.s;
                yr7Var.g = null;
                yr7Var.j = new g06(obj2, new ksa(), yarVar.h, yarVar.i);
                yr7Var.h = new f9h().b();
                return Unit.a;
            case 13:
                obj.getClass();
                ((xdr) this.s).m(null, obj);
                return Unit.a;
            case 14:
                n2t n2tVar = (n2t) obj;
                n2tVar.getClass();
                DrmType drmType = (DrmType) this.s;
                String str = n2tVar.a;
                String str2 = n2tVar.b;
                wt0 wt0Var = n2tVar.c;
                Map map = n2tVar.d;
                String str3 = n2tVar.e;
                String str4 = n2tVar.f;
                List list = n2tVar.g;
                Map map2 = n2tVar.h;
                String str5 = n2tVar.i;
                int i3 = n2tVar.k;
                Set set = n2tVar.l;
                String str6 = n2tVar.m;
                wt0Var.getClass();
                map.getClass();
                return new n2t(str, str2, wt0Var, map, str3, str4, list, map2, str5, drmType, i3, set, str6);
            case 15:
                k6e k6eVar = (k6e) obj;
                k6eVar.getClass();
                ulr ulrVar = (ulr) this.s;
                ulrVar.g = 0L;
                ulrVar.h = -1L;
                k6eVar.close();
                ulrVar.e.B(ulrVar);
                return Unit.a;
            case 16:
                Throwable th = (Throwable) obj;
                hur hurVar = (hur) this.s;
                zt3 zt3Var = hurVar.c;
                if (zt3Var != null) {
                    zt3Var.h(th);
                }
                hurVar.c = null;
                return Unit.a;
            case 17:
                float floatValue = ((Number) obj).floatValue();
                nvr nvrVar = (nvr) this.s;
                t6k t6kVar = nvrVar.g;
                float e = t6kVar.e() + floatValue;
                float c = yhn.c(e, nvrVar.k, nvrVar.l);
                float f3 = e - c;
                a2o a2oVar = (a2o) nvrVar.o.getValue();
                if (a2oVar != null) {
                    float f4 = a2oVar.a;
                    float f5 = f3 / f4;
                    if (f5 < -1.0f) {
                        f5 = -1.0f;
                    }
                    if (f5 > 1.0f) {
                        f5 = 1.0f;
                    }
                    f = (f4 / 10.0f) * ((float) Math.sin((f5 * 3.1415927f) / 2));
                }
                nvrVar.e.h(c + f);
                nvrVar.f.h(f3);
                t6kVar.h(e);
                return Unit.a;
            case 18:
                float[] fArr = ((feh) obj).a;
                wof wofVar = (wof) this.s;
                if (wofVar.d()) {
                    ltg.D(wofVar).h(wofVar, fArr);
                }
                return Unit.a;
            case 19:
                float floatValue2 = ((Number) obj).floatValue();
                lbs lbsVar = (lbs) this.s;
                t6k t6kVar2 = lbsVar.a;
                float e2 = t6kVar2.e() + floatValue2;
                t6k t6kVar3 = lbsVar.b;
                if (e2 > t6kVar3.e()) {
                    floatValue2 = t6kVar3.e() - t6kVar2.e();
                } else if (e2 < 0.0f) {
                    floatValue2 = -t6kVar2.e();
                }
                t6kVar2.h(t6kVar2.e() + floatValue2);
                return Float.valueOf(floatValue2);
            case 20:
                ((rxt) this.s).a((kxt) obj);
                return Unit.a;
            case 21:
                o0l o0lVar = (o0l) obj;
                o0lVar.getClass();
                o0lVar.b = Long.valueOf(((l1u) this.s).a.getPosition());
                return Unit.a;
            case 22:
                nxi nxiVar = (nxi) obj;
                ddu dduVar = (ddu) this.s;
                if (Intrinsics.d(nxiVar, nxi.a)) {
                    dduVar.z();
                } else if (Intrinsics.d(nxiVar, nxi.b)) {
                    ddu.A(dduVar, false);
                } else if (Intrinsics.d(nxiVar, nxi.d)) {
                    ddu.A(dduVar, true);
                } else if (Intrinsics.d(nxiVar, nxi.c)) {
                    ddu.B(dduVar, false);
                } else if (Intrinsics.d(nxiVar, nxi.e)) {
                    ddu.B(dduVar, true);
                }
                return Unit.a;
            case 23:
                ((RecyclerView) obj).setRecycledViewPool((fpn) this.s);
                return Unit.a;
            case 24:
                fv3 fv3Var = (fv3) obj;
                fv3Var.getClass();
                ((zdv) this.s).k = fv3Var;
                if (fv3Var.getId() == -1) {
                    fv3Var.setId(View.generateViewId());
                }
                ((FrameLayout) ((zdv) this.s).x().d).addView(fv3Var, 0, new ViewGroup.LayoutParams(-1, -1));
                ((zdv) this.s).A(fv3Var);
                return Unit.a;
            case 25:
                ((Unit) obj).getClass();
                zt3 zt3Var2 = (zt3) this.s;
                r7o r7oVar = z7o.b;
                Unit unit = Unit.a;
                zt3Var2.resumeWith(unit);
                return unit;
            case 26:
                String str7 = (String) obj;
                str7.getClass();
                SharedPreferences sharedPreferences = ((Context) ((z6u) this.s).b).getSharedPreferences(str7, 0);
                sharedPreferences.getClass();
                return sharedPreferences;
            default:
                qaw qawVar = (qaw) obj;
                qawVar.getClass();
                qawVar.a = (OkHttpClient) this.s;
                qawVar.b = 1;
                return Unit.a;
        }
    }
}
