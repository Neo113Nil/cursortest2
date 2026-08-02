package defpackage;

import com.yandex.payment.divkit.bind.b;

/* loaded from: classes2.dex */
public final class ss8 implements hs31 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object w;

    public /* synthetic */ ss8(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.w = obj3;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        int i = this.a;
        Object obj = this.w;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                break;
            case 1:
                if (!cls.equals(jle.class)) {
                    ny61.r("Unknown view model");
                    break;
                } else {
                    break;
                }
            default:
                if (!cls.equals(b.class)) {
                    ny61.r("Unknown view model");
                    break;
                } else {
                    break;
                }
        }
        return null;
    }
}
