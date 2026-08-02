package defpackage;

import android.content.Context;

/* loaded from: classes5.dex */
public final class qyf implements xvf0 {
    public final /* synthetic */ int a;
    public final q4g b;

    public /* synthetic */ qyf(q4g q4gVar, int i) {
        this.a = i;
        this.b = q4gVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        q4g q4gVar = this.b;
        switch (i) {
            case 0:
                return (jwh) q4gVar.y;
            case 1:
                Context context = (Context) q4gVar.b;
                q5z.h(context);
                return context;
            case 2:
                return (dci) q4gVar.x;
            case 3:
                return (qcp0) q4gVar.c;
            default:
                return (hwy0) q4gVar.w;
        }
    }
}
