package defpackage;

import com.yandex.go.chargers.subscription.presentation.landing.c;
import java.util.List;

/* loaded from: classes5.dex */
public final /* synthetic */ class ts implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ boolean w;
    public final /* synthetic */ int x;

    public /* synthetic */ ts(int i, tls tlsVar, List list, boolean z) {
        this.a = 3;
        this.b = list;
        this.w = z;
        this.c = tlsVar;
        this.x = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.x;
        tls tlsVar = this.c;
        boolean z = this.w;
        List list = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                aka1.b(vng.O(i2 | 1), (fid) obj, tlsVar, list, z);
                break;
            case 1:
                ((Integer) obj2).intValue();
                c.e(vng.O(i2 | 1), (fid) obj, tlsVar, list, z);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                t791.b(this.b, this.w, this.c, (fid) obj, O, this.x);
                break;
            default:
                ((Integer) obj2).getClass();
                gxd0.b(vng.O(i2 | 1), (fid) obj, tlsVar, list, z);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ ts(List list, tls tlsVar, boolean z, int i, int i2) {
        this.a = i2;
        this.b = list;
        this.c = tlsVar;
        this.w = z;
        this.x = i;
    }

    public /* synthetic */ ts(List list, boolean z, tls tlsVar, int i, int i2) {
        this.a = 2;
        this.b = list;
        this.w = z;
        this.c = tlsVar;
        this.x = i2;
    }
}
