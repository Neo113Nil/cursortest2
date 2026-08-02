package defpackage;

import androidx.compose.runtime.internal.a;
import com.yandex.go.chargers.feedback.ui.b;
import com.yandex.go.design.compose.radio.RadioSize;
import java.util.List;
import java.util.Set;
import ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.d;
import ru.yandex.taxi.logistics.sdk.ui.component.drag_drop_column.utils.e;

/* loaded from: classes11.dex */
public final /* synthetic */ class rz9 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ rz9(az9 az9Var, int i, Set set, boolean z, boolean z2, tls tlsVar, oip0 oip0Var, int i2) {
        this.y = az9Var;
        this.x = i;
        this.z = set;
        this.b = z;
        this.w = z2;
        this.c = tlsVar;
        this.A = oip0Var;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.x;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.A;
        Object obj5 = this.z;
        Object obj6 = this.y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(9);
                b.d((az9) obj6, this.x, (Set) obj5, this.b, this.w, (tls) obj3, (oip0) obj4, (fid) obj, O);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                ((oih) obj6).a(this.b, (f530) obj5, (RadioSize) obj4, (tls) obj3, this.w, (fid) obj, O2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int O3 = vng.O(i2 | 1);
                d.a((e) obj6, (Integer) obj5, (f530) obj3, this.b, this.w, (a) obj4, (fid) obj, O3);
                break;
            default:
                ((Integer) obj2).getClass();
                int O4 = vng.O(i2 | 1);
                fnm0.b(this.b, (s7u0) obj6, (List) obj5, this.w, (f530) obj4, (tls) obj3, (fid) obj, O4);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ rz9(oih oihVar, boolean z, f530 f530Var, RadioSize radioSize, tls tlsVar, boolean z2, int i) {
        this.y = oihVar;
        this.b = z;
        this.z = f530Var;
        this.A = radioSize;
        this.c = tlsVar;
        this.w = z2;
        this.x = i;
    }

    public /* synthetic */ rz9(e eVar, Integer num, f530 f530Var, boolean z, boolean z2, a aVar, int i) {
        this.y = eVar;
        this.z = num;
        this.c = f530Var;
        this.b = z;
        this.w = z2;
        this.A = aVar;
        this.x = i;
    }

    public /* synthetic */ rz9(boolean z, s7u0 s7u0Var, List list, boolean z2, f530 f530Var, tls tlsVar, int i) {
        this.b = z;
        this.y = s7u0Var;
        this.z = list;
        this.w = z2;
        this.A = f530Var;
        this.c = tlsVar;
        this.x = i;
    }
}
