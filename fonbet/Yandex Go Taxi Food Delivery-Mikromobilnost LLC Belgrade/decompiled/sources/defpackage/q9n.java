package defpackage;

import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.dynamic_timeline.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class q9n implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long w;

    public /* synthetic */ q9n(int i, int i2, long j, long j2, f530 f530Var) {
        this.a = i2;
        this.b = f530Var;
        this.c = j;
        this.w = j2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(1);
                a.i(this.b, this.c, this.w, (fid) obj, O);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(1);
                ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header.a.d(this.b, this.c, this.w, (fid) obj, O2);
                break;
        }
        return zy11Var;
    }
}
