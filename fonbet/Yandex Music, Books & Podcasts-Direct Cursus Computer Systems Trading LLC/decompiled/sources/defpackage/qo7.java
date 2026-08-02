package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class qo7 implements yqr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qo7(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.yqr
    public final Object get() {
        switch (this.a) {
            case 0:
                try {
                    return (tvh) ((Class) this.b).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    wvs.m(e);
                    return null;
                }
            case 1:
                return (heg) this.b;
            case 2:
                return (ct7) this.b;
            case 3:
                return (yk2) this.b;
            case 4:
                return (q6q) this.b;
            case 5:
                return (rsb) this.b;
            case 6:
                return (to7) this.b;
            case 7:
                return Boolean.valueOf(((fsb) this.b).E);
            default:
                return Boolean.valueOf(((AtomicBoolean) this.b).get());
        }
    }
}
