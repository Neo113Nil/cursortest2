package defpackage;

import java.util.List;
import ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.b;

/* loaded from: classes11.dex */
public final /* synthetic */ class wm1 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;

    public /* synthetic */ wm1(boolean z, int i, int i2, List list) {
        this.a = 3;
        this.c = i;
        this.w = list;
        this.b = z;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        boolean z = this.b;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                dn1.d((sls) obj3, z, (fid) obj, vng.O(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).intValue();
                hza1.a(z, (spm) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                b.c((o9z0) obj3, z, (fid) obj, vng.O(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                int i3 = this.c;
                om91.a(i3, O, (fid) obj, c530.a, (List) obj3, this.b);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ wm1(int i, int i2, Object obj, boolean z) {
        this.a = i2;
        this.w = obj;
        this.b = z;
        this.c = i;
    }

    public /* synthetic */ wm1(boolean z, spm spmVar, int i) {
        this.a = 1;
        this.b = z;
        this.w = spmVar;
        this.c = i;
    }
}
