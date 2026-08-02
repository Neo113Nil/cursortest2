package defpackage;

import androidx.compose.runtime.internal.a;
import com.yandex.go.masstransit.sdk.trains.impl.datepicker.ui.b;
import java.util.List;

/* loaded from: classes11.dex */
public final /* synthetic */ class z640 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ z640(f530 f530Var, float f, int i, sls slsVar, jx41 jx41Var, boolean z, int i2) {
        this.b = f530Var;
        this.c = f;
        this.x = i;
        this.z = slsVar;
        this.A = jx41Var;
        this.w = z;
        this.y = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.x;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.A;
        Object obj4 = this.z;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                gpb1.c(this.b, this.w, this.c, (a) obj4, (zls) obj3, (fid) obj, O, this.y);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                psb1.b(this.b, this.c, (List) obj4, this.w, (wls) obj3, (fid) obj, O2, this.y);
                break;
            default:
                ((Integer) obj2).intValue();
                int O3 = vng.O(this.y | 1);
                b.a(this.b, this.c, this.x, (sls) obj4, (jx41) obj3, this.w, (fid) obj, O3);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ z640(f530 f530Var, float f, List list, boolean z, wls wlsVar, int i, int i2) {
        this.b = f530Var;
        this.c = f;
        this.z = list;
        this.w = z;
        this.A = wlsVar;
        this.x = i;
        this.y = i2;
    }

    public /* synthetic */ z640(f530 f530Var, boolean z, float f, a aVar, zls zlsVar, int i, int i2) {
        this.b = f530Var;
        this.w = z;
        this.c = f;
        this.z = aVar;
        this.A = zlsVar;
        this.x = i;
        this.y = i2;
    }
}
