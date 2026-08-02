package defpackage;

import java.util.Comparator;

/* loaded from: classes9.dex */
public final /* synthetic */ class yu4 implements Comparator {
    public final /* synthetic */ int a;
    public final /* synthetic */ wls b;

    public /* synthetic */ yu4(wls wlsVar, int i) {
        this.a = i;
        this.b = wlsVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i = this.a;
        wls wlsVar = this.b;
        switch (i) {
            case 0:
                return ((Number) ((yk) wlsVar).invoke(obj, obj2)).intValue();
            case 1:
                return ((Number) ((yk) wlsVar).invoke(obj, obj2)).intValue();
            case 2:
                return ((Number) ((yk) wlsVar).invoke(obj, obj2)).intValue();
            case 3:
                return ((Number) ((etq0) wlsVar).invoke(obj, obj2)).intValue();
            default:
                return ((Number) ((jid) wlsVar).invoke(obj, obj2)).intValue();
        }
    }
}
