package defpackage;

import android.app.Application;
import android.content.Context;

/* loaded from: classes4.dex */
public final class tp2 implements rzm {
    public final /* synthetic */ int a;
    public final toe b;

    public /* synthetic */ tp2(Object obj, toe toeVar, int i) {
        this.a = i;
        this.b = toeVar;
    }

    @Override // defpackage.szm
    public final Object get() {
        switch (this.a) {
            case 0:
                ugk ugkVar = (ugk) this.b.a;
                ugkVar.getClass();
                return new pxf(ugkVar);
            default:
                Application application = (Application) this.b.a;
                application.getClass();
                Context applicationContext = application.getApplicationContext();
                applicationContext.getClass();
                return applicationContext;
        }
    }
}
