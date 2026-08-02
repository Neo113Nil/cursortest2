package defpackage;

import yads.rn0;

/* loaded from: classes7.dex */
public final /* synthetic */ class tm61 implements pg61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tm61(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pg61
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return (hi81) obj;
            case 1:
                return (ks71) obj;
            case 2:
                return ((rn0) obj).c();
            default:
                try {
                    return (hz71) ((Class) obj).getConstructor(null).newInstance(null);
                } catch (Exception e) {
                    ny61.o(e);
                    return null;
                }
        }
    }
}
