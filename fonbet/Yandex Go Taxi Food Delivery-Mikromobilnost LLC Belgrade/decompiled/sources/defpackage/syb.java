package defpackage;

import com.yandex.go.drive.sdkintegration.presentation.DriveHostView;

/* loaded from: classes13.dex */
public final class syb extends zw60 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ syb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.zw60, defpackage.s45
    public void b() {
        switch (this.a) {
            case 0:
                ((uyb) this.b).b.c();
                break;
        }
    }

    @Override // defpackage.s45
    public void c() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((l7a) obj).run();
                break;
            case 1:
                rve rveVar = (rve) obj;
                q3u0 q3u0Var = rveVar.d;
                q3u0Var.a.remove(rve.p);
                String str = (String) this.b;
                if (str.length() > 0) {
                    rveVar.f.d(str);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.s45
    public final void d() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((uyb) obj2).b.c();
                break;
            case 1:
                String str = (String) obj2;
                if (str.length() > 0) {
                    ((rve) obj).f.i(str, false);
                    break;
                }
                break;
            default:
                ((DriveHostView) obj2).launch((ovx) obj);
                break;
        }
    }
}
