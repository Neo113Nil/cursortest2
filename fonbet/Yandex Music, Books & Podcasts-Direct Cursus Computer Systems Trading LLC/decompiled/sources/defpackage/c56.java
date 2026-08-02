package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class c56 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Serializable e;
    public final /* synthetic */ Object f;

    public /* synthetic */ c56(String str, int i, yci yciVar, int i2, int i3) {
        this.e = str;
        this.b = i;
        this.f = yciVar;
        this.c = i2;
        this.d = i3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                ((Integer) obj2).getClass();
                vwb.h((String) this.e, this.b, (yci) this.f, (hq5) obj, rvf.R(this.c | 1), this.d);
                break;
            default:
                ArrayList arrayList = (ArrayList) this.e;
                rja rjaVar = (rja) this.f;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                mqs mqsVar = ((ko6) arrayList.get(this.b)).b;
                rjaVar.getClass();
                weo.H(rjaVar.b, szf.M(mqsVar, this.c, this.d), booleanValue, str, null);
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ c56(ArrayList arrayList, int i, int i2, int i3, rja rjaVar) {
        this.e = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.f = rjaVar;
    }
}
