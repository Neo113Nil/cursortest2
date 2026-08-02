package defpackage;

import android.view.View;
import defpackage.otv0;

/* loaded from: classes13.dex */
public final /* synthetic */ class zph implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ u45 b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ sls y;

    public /* synthetic */ zph(Object obj, u45 u45Var, Object obj2, Object obj3, sls slsVar, int i) {
        this.a = i;
        this.c = obj;
        this.b = u45Var;
        this.w = obj2;
        this.x = obj3;
        this.y = slsVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = this.a;
        sls slsVar = this.y;
        Object obj = this.x;
        Object obj2 = this.w;
        u45 u45Var = this.b;
        Object obj3 = this.c;
        switch (i9) {
            case 0:
                aqh.c((aqh) obj3, u45Var, (bsa0) obj2, (n3v) obj, slsVar);
                break;
            default:
                otv0.c((otv0) obj3, u45Var, (otv0.a) obj2, (View) obj, (ogu0) slsVar);
                break;
        }
    }
}
