package defpackage;

import java.util.function.Function;

/* loaded from: classes6.dex */
public final /* synthetic */ class cim implements Function {
    public final /* synthetic */ int a;

    public /* synthetic */ cim(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return ghh.O((zp2) obj);
            default:
                return ((chv) obj).a;
        }
    }
}
