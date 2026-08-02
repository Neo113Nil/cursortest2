package defpackage;

import androidx.compose.material3.t;
import androidx.compose.runtime.internal.a;
import androidx.compose.ui.layout.o;
import com.yandex.go.masstransit.sdk.order.impl.activation.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final /* synthetic */ class qwa implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ qwa(CharSequence charSequence, boolean z, sls slsVar, rwa rwaVar, boolean z2, f530 f530Var, int i) {
        this.a = 0;
        this.w = charSequence;
        this.b = z;
        this.x = slsVar;
        this.y = rwaVar;
        this.c = z2;
        this.z = f530Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.z;
        Object obj4 = this.y;
        Object obj5 = this.x;
        Object obj6 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                h791.a((CharSequence) obj6, this.b, (sls) obj5, (rwa) obj4, this.c, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 1:
                wls wlsVar = (wls) obj3;
                tyu0 tyu0Var = (tyu0) obj;
                final n8e n8eVar = (n8e) obj2;
                List h0 = tyu0Var.h0(zy11Var, new a(167505807, new bsm((String) obj6, (String) obj5, (zrm) obj4, this.c, wlsVar, 0), true));
                final ArrayList arrayList = new ArrayList();
                x910 x910Var = (x910) h0.get(0);
                x910 x910Var2 = (x910) h0.get(1);
                x910 x910Var3 = (x910) h0.get(2);
                arrayList.add(x910Var.l0(n8eVar.a));
                long j = n8eVar.a;
                arrayList.add(x910Var3.l0(j));
                long j2 = n8eVar.a;
                int i2 = ((o) arrayList.get(0)).a;
                int i3 = ((o) arrayList.get(1)).a;
                qnm.c.getClass();
                int w0 = (int) tyu0Var.w0(16.0f);
                final boolean z = this.b;
                int i4 = n8e.i(j) - (z ? i2 : i3);
                int i5 = n8e.i(j) - (i2 + i3);
                int i6 = (n8e.i(j) - i5) / 2;
                int max = Math.max((i6 + i5) - i4, 0);
                while (i5 > 0 && max > 0) {
                    i5 -= max;
                    i6 = (n8e.i(j) - i5) / 2;
                    max = Math.max((i6 + i5) - i4, 0);
                }
                if (z) {
                    i2 = i3;
                }
                int max2 = Math.max(i2 - i6, 0);
                while (i5 > 0 && max2 > 0) {
                    i5 -= max2;
                    max2 = Math.max(i2 - ((n8e.i(j) - i5) / 2), 0);
                }
                arrayList.add(1, x910Var2.l0(n8e.b(0, j2, Math.max(i5 - w0, 0), 0, 0, 13)));
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    ny61.p();
                    break;
                } else {
                    final int i7 = ((o) it.next()).b;
                    while (it.hasNext()) {
                        int i8 = ((o) it.next()).b;
                        if (i7 < i8) {
                            i7 = i8;
                        }
                    }
                    break;
                }
            case 2:
                ((Integer) obj2).getClass();
                fi91.a(this.b, (w7b0) obj6, (sls) obj5, (tls) obj4, this.c, (f530) obj3, (fid) obj, vng.O(1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((t) obj6).b(this.b, this.c, (h8w) obj5, (imy0) obj4, (ehr0) obj3, (fid) obj, vng.O(114822145));
                break;
            default:
                ((Integer) obj2).getClass();
                c.b((v1z0) obj6, this.b, this.c, (sls) obj5, (tls) obj4, (f530) obj3, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ qwa(Object obj, boolean z, boolean z2, Object obj2, Object obj3, Object obj4, int i, int i2) {
        this.a = i2;
        this.w = obj;
        this.b = z;
        this.c = z2;
        this.x = obj2;
        this.y = obj3;
        this.z = obj4;
    }

    public /* synthetic */ qwa(boolean z, w7b0 w7b0Var, sls slsVar, tls tlsVar, boolean z2, f530 f530Var, int i) {
        this.a = 2;
        this.b = z;
        this.w = w7b0Var;
        this.x = slsVar;
        this.y = tlsVar;
        this.c = z2;
        this.z = f530Var;
    }

    public /* synthetic */ qwa(boolean z, String str, String str2, zrm zrmVar, boolean z2, wls wlsVar) {
        this.a = 1;
        this.b = z;
        this.w = str;
        this.x = str2;
        this.y = zrmVar;
        this.c = z2;
        this.z = wlsVar;
    }
}
