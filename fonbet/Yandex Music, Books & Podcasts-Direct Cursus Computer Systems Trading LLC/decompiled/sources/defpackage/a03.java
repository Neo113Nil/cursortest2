package defpackage;

import android.graphics.drawable.Drawable;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;
import com.connectsdk.service.DeviceService;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.OkHttpClient;

/* loaded from: classes5.dex */
public final class a03 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a03(TextView textView, szb szbVar, szb szbVar2, szb szbVar3, szb szbVar4, ly9 ly9Var, xzb xzbVar) {
        super(1);
        this.r = 11;
        this.s = textView;
        this.t = szbVar;
        this.u = szbVar2;
        this.v = szbVar3;
        this.w = ly9Var;
        this.x = xzbVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int w;
        int w2;
        int i = this.r;
        int i2 = 18;
        Object obj2 = this.x;
        Object obj3 = this.s;
        Object obj4 = this.w;
        Object obj5 = this.v;
        Object obj6 = this.t;
        Object obj7 = this.u;
        switch (i) {
            case 0:
                ihk ihkVar = (ihk) obj;
                r9i r9iVar = (r9i) obj2;
                wa4 wa4Var = (wa4) obj4;
                String str = (String) obj6;
                ihkVar.getClass();
                j03 j03Var = (j03) obj3;
                if (!j03Var.p) {
                    frr frrVar = new frr(1, j03Var.a.a, ihkVar.a, ihkVar.b, (String) obj7, (String) obj6);
                    t28 t28Var = j03Var.d;
                    break;
                } else if (str != null && !str.equals("")) {
                    hos hosVar = j03Var.i;
                    z9h z9hVar = j03Var.q;
                    z9hVar.getClass();
                    break;
                } else {
                    break;
                }
                break;
            case 1:
                jsk jskVar = (jsk) obj;
                ksk[] kskVarArr = (ksk[]) obj3;
                List list = (List) obj6;
                mfh mfhVar = (mfh) obj7;
                vqn vqnVar = (vqn) obj5;
                vqn vqnVar2 = (vqn) obj4;
                wg3 wg3Var = (wg3) obj2;
                int length = kskVarArr.length;
                int i3 = 0;
                int i4 = 0;
                while (i4 < length) {
                    ksk kskVar = kskVarArr[i4];
                    kskVar.getClass();
                    ug3.b(jskVar, kskVar, (ffh) list.get(i3), mfhVar.getLayoutDirection(), vqnVar.a, vqnVar2.a, wg3Var.a);
                    i4++;
                    i3++;
                }
                break;
            case 2:
                frb frbVar = (frb) obj;
                frbVar.getClass();
                frbVar.a = (OkHttpClient) obj3;
                frbVar.b = (so7) obj6;
                frbVar.c = (ScheduledExecutorService) obj7;
                frbVar.d = (t6s) obj5;
                frbVar.e = (iwe) obj4;
                frbVar.f = (erb) obj2;
                break;
            case 3:
                ((xzi) obj3).S((View) obj6, (e23) obj7, (Drawable) obj5, (List) obj4, (List) obj2);
                break;
            case 4:
                ((o19) obj3).G((v19) obj6, (gc8) obj7, (xzb) obj5, (i19) obj4, (dfb) obj2);
                break;
            case 5:
                i39 i39Var = (i39) obj3;
                if (!i39Var.o()) {
                    i29 i29Var = (i29) obj5;
                    ((v29) obj6).K(i39Var, (e23) obj7, i29Var, v29.N((xzb) obj4, i39Var, i29Var), (dfb) obj2);
                }
                break;
            case 6:
                jk9 jk9Var = (jk9) obj;
                wl9 wl9Var = (wl9) obj3;
                szb szbVar = (szb) obj6;
                szb szbVar2 = (szb) obj7;
                ouq ouqVar = (ouq) obj5;
                xzb xzbVar = (xzb) obj4;
                DisplayMetrics displayMetrics = (DisplayMetrics) obj2;
                if (szbVar != null) {
                    long longValue = ((Number) szbVar.a(xzbVar)).longValue();
                    int ordinal = jk9Var.ordinal();
                    if (ordinal == 0) {
                        w2 = bg3.w(Long.valueOf(longValue), displayMetrics);
                    } else if (ordinal == 1) {
                        w2 = bg3.Z(Long.valueOf(longValue), displayMetrics);
                    } else if (ordinal != 2) {
                        b6e.s();
                        break;
                    } else {
                        long j = longValue >> 31;
                        w2 = (j == 0 || j == -1) ? (int) longValue : longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    ouqVar.c = w2;
                }
                if (szbVar2 != null) {
                    long longValue2 = ((Number) szbVar2.a(xzbVar)).longValue();
                    int ordinal2 = jk9Var.ordinal();
                    if (ordinal2 == 0) {
                        w = bg3.w(Long.valueOf(longValue2), displayMetrics);
                    } else if (ordinal2 == 1) {
                        w = bg3.Z(Long.valueOf(longValue2), displayMetrics);
                    } else if (ordinal2 != 2) {
                        b6e.s();
                        break;
                    } else {
                        long j2 = longValue2 >> 31;
                        w = (j2 == 0 || j2 == -1) ? (int) longValue2 : longValue2 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                    }
                    ouqVar.d = w;
                }
                wl9Var.requestLayout();
                wl9Var.invalidate();
                break;
            case 7:
                of9 of9Var = (of9) obj7;
                DisplayMetrics displayMetrics2 = (DisplayMetrics) obj5;
                xzb xzbVar2 = (xzb) obj4;
                pcg Z = i4w.Z(of9Var.e, displayMetrics2, xzbVar2);
                hag Y = i4w.Y(of9Var.a, displayMetrics2, xzbVar2);
                hag Y2 = i4w.Y(of9Var.b, displayMetrics2, xzbVar2);
                la5 W = i4w.W(of9Var, xzbVar2);
                xv.D(W, (gc8) obj2);
                ((er9) obj3).M((d89) obj6, Z, Y, Y2, W);
                break;
            case 8:
                jfp jfpVar = (jfp) obj;
                zcq zcqVar = (zcq) obj3;
                String str2 = (String) obj7;
                String str3 = (String) obj5;
                mm6 mm6Var = (mm6) obj2;
                vr1 vr1Var = new vr1(1, (Function0) obj4);
                s9f[] s9fVarArr = wfp.a;
                jfpVar.o(hfp.u, new sa((String) obj6, vr1Var));
                ia0 ia0Var = zcqVar.b;
                gdq gdqVar = (gdq) ((x6k) ia0Var.g).getValue();
                gdq gdqVar2 = gdq.c;
                if (gdqVar == gdqVar2) {
                    jfpVar.o(hfp.s, new sa(str2, new t03(i2, zcqVar, mm6Var, zcqVar)));
                } else if (ia0Var.g().a.containsKey(gdqVar2)) {
                    jfpVar.o(hfp.t, new sa(str3, new ssb(i2, zcqVar, mm6Var)));
                }
                break;
            case 9:
                ((wle) obj).getClass();
                j03 j03Var2 = ((ogk) obj3).a;
                String str4 = (String) obj6;
                String str5 = (String) obj7;
                String str6 = (String) obj5;
                qxp qxpVar = (qxp) obj4;
                pv9 pv9Var = (pv9) obj2;
                str4.getClass();
                g0c g0cVar = j03Var2.g;
                boolean z = j03Var2.p;
                String r = hrg.r("Оплата СБП токеном ", str4, StringUtil.SPACE, z ? "через PSP" : "через Trust");
                String str7 = z ? "sbp_token_payment_v2" : "sbp_token_payment";
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                r1f r1fVar = r1f.a;
                linkedHashMap.put("sbp_token_id", new jkr(str4));
                linkedHashMap.put(DeviceService.KEY_DESC, new jkr(r));
                vtm vtmVar = new vtm((Map) linkedHashMap);
                ci0 ci0Var = qjb.a;
                ci0Var.a = su4.g(1, ci0Var.a);
                vtmVar.u(qee.n() + ci0Var.a, "eventus_id");
                qne j3 = su4.j(vtmVar, "event_name", str7, str7, vtmVar);
                yop a = mif.a(j03Var2.d(str5), new a03(j03Var2, (Object) null, str4, str6, qxpVar, pv9Var, 0), null, 5);
                ((x60) g0cVar).b(j3, a);
                break;
            case 10:
                wj9 wj9Var = (wj9) obj2;
                tao taoVar = (tao) obj3;
                if (((Boolean) obj).booleanValue()) {
                    ((s1a) taoVar.a).invoke((gc8) obj6, (xzb) obj7, (View) obj5, (jc8) obj4, wj9Var);
                } else {
                    ((s1a) taoVar.b).invoke((gc8) obj6, (xzb) obj7, (View) obj5, (jc8) obj4, wj9Var);
                }
                break;
            default:
                woe.c((TextView) obj3, (szb) obj6, (szb) obj7, (szb) obj5, (ly9) obj4, (xzb) obj2);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a03(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        super(1);
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
        this.v = obj4;
        this.w = obj5;
        this.x = obj6;
    }
}
