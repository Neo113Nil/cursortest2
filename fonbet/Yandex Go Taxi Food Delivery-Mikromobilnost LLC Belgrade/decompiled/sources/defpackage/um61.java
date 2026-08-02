package defpackage;

import android.content.Context;

/* loaded from: classes7.dex */
public final /* synthetic */ class um61 implements pg61 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ um61(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.pg61
    public final Object get() {
        switch (this.a) {
            case 0:
                return new ks71(this.b);
            case 1:
                return new k191(new hn71(this.b, 19), new ej71());
            case 2:
                return new ba71(this.b);
            default:
                return wm61.a(this.b);
        }
    }
}
