package defpackage;

import com.yandex.passport.internal.ui.sloth.screen.e;
import com.yandex.passport.internal.ui.sloth.screen.g;
import com.yandex.passport.sloth.data.SlothParams;
import com.yx360.design.compose.atoms.inlineNotification.DsInlineNotification$Tone;
import java.util.Map;
import ru.yandex.taxi.logistics.sdk.deliverydashboard.ui.widget.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class tq0 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int a = 5;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ tq0(w0s w0sVar, f530 f530Var, tls tlsVar, tls tlsVar2, qor qorVar, yur yurVar, int i, int i2) {
        this.b = w0sVar;
        this.c = f530Var;
        this.w = tlsVar;
        this.z = tlsVar2;
        this.A = qorVar;
        this.B = yurVar;
        this.x = i;
        this.y = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.A;
        int i2 = this.x;
        zy11 zy11Var = zy11.a;
        Object obj4 = this.B;
        Object obj5 = this.c;
        Object obj6 = this.z;
        Object obj7 = this.w;
        Object obj8 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                a.a((String) obj8, (ky) obj6, (f530) obj5, (String) obj7, this.A, (aa01) obj4, (fid) obj, O, this.y);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ut91.b((DsInlineNotification$Tone) obj6, (pa90) obj3, (String) obj8, (f530) obj5, (fqm) obj4, (String) obj7, (fid) obj, vng.O(i2 | 1), this.y);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int O2 = vng.O(this.y | 1);
                vqr.d((f530) obj5, (h43) obj8, (k43) obj7, (to5) obj6, this.x, (drr) obj3, (zls) obj4, (fid) obj, O2);
                break;
            case 3:
                ((Integer) obj2).getClass();
                mi91.d((w0s) obj8, (f530) obj5, (tls) obj7, (tls) obj6, (qor) obj3, (yur) obj4, (fid) obj, vng.O(i2 | 1), this.y);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                ttb1.a(this.A, (f530) obj5, (v2o) obj7, (ymo) obj6, (String) obj8, (bms) obj4, (fid) obj, O3, this.y);
                break;
            default:
                ((Integer) obj2).getClass();
                g.a((SlothParams) obj8, (e) obj7, (tls) obj6, (tls) obj5, (tls) obj3, (Map) obj4, (fid) obj, vng.O(i2 | 1), this.y);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ tq0(f530 f530Var, h43 h43Var, k43 k43Var, to5 to5Var, int i, drr drrVar, zls zlsVar, int i2) {
        this.c = f530Var;
        this.b = h43Var;
        this.w = k43Var;
        this.z = to5Var;
        this.x = i;
        this.A = drrVar;
        this.B = zlsVar;
        this.y = i2;
    }

    public /* synthetic */ tq0(SlothParams slothParams, e eVar, tls tlsVar, tls tlsVar2, tls tlsVar3, Map map, int i, int i2) {
        this.b = slothParams;
        this.w = eVar;
        this.z = tlsVar;
        this.c = tlsVar2;
        this.A = tlsVar3;
        this.B = map;
        this.x = i;
        this.y = i2;
    }

    public /* synthetic */ tq0(DsInlineNotification$Tone dsInlineNotification$Tone, pa90 pa90Var, String str, f530 f530Var, fqm fqmVar, String str2, int i, int i2) {
        this.z = dsInlineNotification$Tone;
        this.A = pa90Var;
        this.b = str;
        this.c = f530Var;
        this.B = fqmVar;
        this.w = str2;
        this.x = i;
        this.y = i2;
    }

    public /* synthetic */ tq0(Object obj, f530 f530Var, v2o v2oVar, ymo ymoVar, String str, bms bmsVar, int i, int i2) {
        this.A = obj;
        this.c = f530Var;
        this.w = v2oVar;
        this.z = ymoVar;
        this.b = str;
        this.B = bmsVar;
        this.x = i;
        this.y = i2;
    }

    public /* synthetic */ tq0(String str, ky kyVar, f530 f530Var, String str2, Object obj, aa01 aa01Var, int i, int i2) {
        this.b = str;
        this.z = kyVar;
        this.c = f530Var;
        this.w = str2;
        this.A = obj;
        this.B = aa01Var;
        this.x = i;
        this.y = i2;
    }
}
