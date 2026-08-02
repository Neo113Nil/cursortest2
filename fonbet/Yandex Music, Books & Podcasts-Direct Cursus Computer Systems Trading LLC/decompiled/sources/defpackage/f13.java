package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes4.dex */
public final class f13 implements rzm {
    public final /* synthetic */ int a;
    public final szm b;
    public final szm c;

    public /* synthetic */ f13(Object obj, toe toeVar, rzm rzmVar, int i) {
        this.a = i;
        this.b = toeVar;
        this.c = rzmVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                Context context = (Context) this.b.get();
                pxf pxfVar = (pxf) this.c.get();
                context.getClass();
                pxfVar.getClass();
                Resources resources = context.getResources();
                resources.getClass();
                return new qk7(pxfVar, resources);
            default:
                Context context2 = (Context) this.b.get();
                pxf pxfVar2 = (pxf) this.c.get();
                context2.getClass();
                pxfVar2.getClass();
                return new mnd(context2, pxfVar2);
        }
    }
}
