package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final /* synthetic */ class seh implements rhw0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ seh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.rhw0
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                try {
                    return (rf10) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    ny61.o(e);
                    return null;
                }
            case 1:
                return (vmh) obj;
            case 2:
                return (rih) obj;
            case 3:
                return (rf10) obj;
            case 4:
                return (syi0) obj;
            case 5:
                return (ueh) obj;
            case 6:
                return (x001) obj;
            case 7:
                return (owy) obj;
            case 8:
                return (ip4) obj;
            case 9:
                return (zdh) obj;
            default:
                return Boolean.valueOf(((AtomicBoolean) obj).get());
        }
    }
}
