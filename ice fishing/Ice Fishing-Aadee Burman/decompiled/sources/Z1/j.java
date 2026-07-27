package Z1;

import C2.N;
import android.content.Context;
import android.content.res.Resources;
import b2.C0514a;
import com.google.android.gms.internal.ads.C2991bm;
import j4.q;
import java.io.InputStream;
import m.b1;
import t7.InterfaceC5044a;
import y1.C5207b;
import y1.InterfaceC5211f;
import y1.InterfaceC5223r;
import y1.InterfaceC5224s;
import y1.x;

/* loaded from: classes.dex */
public final class j implements InterfaceC5224s, InterfaceC5211f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4151n;

    /* renamed from: u, reason: collision with root package name */
    public Context f4152u;

    public /* synthetic */ j() {
        this.f4151n = 0;
    }

    @Override // y1.InterfaceC5211f
    public Class a() {
        return InputStream.class;
    }

    @Override // y1.InterfaceC5211f
    public Object b(Resources resources, int i, Resources.Theme theme) {
        return resources.openRawResource(i);
    }

    public A6.d c() {
        Context context = this.f4152u;
        if (context == null) {
            throw new IllegalStateException(Context.class.getCanonicalName() + " must be set");
        }
        A6.d dVar = new A6.d();
        dVar.f47u = C0514a.a(l.f4155a);
        G3.e eVar = new G3.e(context);
        dVar.f48v = eVar;
        dVar.f49w = C0514a.a(new S0.e(5, eVar, new a2.e(eVar, 0)));
        G3.e eVar2 = (G3.e) dVar.f48v;
        dVar.f50x = new F1.a(18, eVar2);
        InterfaceC5044a a9 = C0514a.a(new C2991bm(28, (F1.a) dVar.f50x, C0514a.a(new a2.e(eVar2, 1))));
        dVar.f51y = a9;
        E3.e eVar3 = new E3.e();
        G3.e eVar4 = (G3.e) dVar.f48v;
        Z2.e eVar5 = new Z2.e(27, eVar4, a9, eVar3);
        InterfaceC5044a interfaceC5044a = (InterfaceC5044a) dVar.f47u;
        InterfaceC5044a interfaceC5044a2 = (InterfaceC5044a) dVar.f49w;
        N n9 = new N(interfaceC5044a, interfaceC5044a2, eVar5, a9, a9, 6);
        b1 b1Var = new b1(eVar4, interfaceC5044a2, a9, eVar5, interfaceC5044a, a9, a9);
        q qVar = new q();
        qVar.f38433n = interfaceC5044a;
        qVar.f38434u = a9;
        qVar.f38435v = eVar5;
        qVar.f38436w = a9;
        dVar.f52z = C0514a.a(new Z2.e(21, n9, b1Var, qVar));
        return dVar;
    }

    @Override // y1.InterfaceC5211f
    public void d(Object obj) {
        ((InputStream) obj).close();
    }

    @Override // y1.InterfaceC5224s
    public InterfaceC5223r i(x xVar) {
        switch (this.f4151n) {
            case 1:
                return new C5207b(this.f4152u, this);
            default:
                return new C5207b(this.f4152u, xVar.b(Integer.class, InputStream.class));
        }
    }

    public /* synthetic */ j(Context context, int i) {
        this.f4151n = i;
        this.f4152u = context;
    }
}
