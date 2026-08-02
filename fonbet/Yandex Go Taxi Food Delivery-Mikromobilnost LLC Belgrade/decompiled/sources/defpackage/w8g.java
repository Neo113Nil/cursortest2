package defpackage;

import android.app.Application;
import ru.yandex.taxi.logistics.sdk.o;

/* loaded from: classes9.dex */
public final class w8g implements xvf0 {
    public final /* synthetic */ int a;
    public final gjz b;

    public /* synthetic */ w8g(gjz gjzVar, int i) {
        this.a = i;
        this.b = gjzVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        gjz gjzVar = this.b;
        switch (i) {
            case 0:
                gjzVar.b.f();
                return null;
            case 1:
                return gjzVar.c;
            case 2:
                jwh a = gjzVar.a();
                q5z.h(a);
                return a;
            case 3:
                return gjzVar.d;
            case 4:
                Application application = (Application) gjzVar.b.c;
                q5z.h(application);
                return application;
            case 5:
                oic a2 = gjzVar.b.h().a();
                q5z.h(a2);
                return a2;
            case 6:
                return new gp50(23, (o) gjzVar.b.b);
            case 7:
                ofg b = gjzVar.b.h().b();
                q5z.h(b);
                return b;
            case 8:
                l7i l7iVar = (l7i) ((o) gjzVar.b.b).n.get();
                q5z.h(l7iVar);
                return l7iVar;
            case 9:
                dci b2 = gjzVar.b();
                q5z.h(b2);
                return b2;
            case 10:
                tci tciVar = gjzVar.a;
                q5z.h(tciVar);
                return tciVar;
            case 11:
                return gjzVar.b.f();
            case 12:
                return new hjz((o) gjzVar.b.b);
            case 13:
                return gjzVar.b.h();
            case 14:
                return gjzVar.c();
            case 15:
                gjzVar.b.f();
                return null;
            default:
                return gjzVar.b.f().d;
        }
    }
}
