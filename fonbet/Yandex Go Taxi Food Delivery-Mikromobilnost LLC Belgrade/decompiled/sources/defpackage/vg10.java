package defpackage;

import com.yandex.plus.core.config.Environment;
import java.util.HashMap;
import java.util.HashSet;

/* loaded from: classes9.dex */
public final /* synthetic */ class vg10 implements thw0, moh, nuw, e5o {
    public final /* synthetic */ int a;

    public /* synthetic */ vg10(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(int i, Object obj, Object obj2, Object obj3, String str) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + ((char) i)).toString());
    }

    public static /* synthetic */ void c(int i, Object obj, Object obj2, String str) {
        throw new IllegalArgumentException((str + i + obj + obj2).toString());
    }

    public static /* synthetic */ void d(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void e(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void h(String str, Object obj, int i) {
        throw new IllegalArgumentException(str + obj + ((char) i));
    }

    public static /* synthetic */ void i(String str, Object obj, Object obj2) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void j(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4 + obj5).toString());
    }

    public static /* synthetic */ void m(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalArgumentException(sb.toString().toString());
    }

    public static /* synthetic */ void n(Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void o(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void p(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void q(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void s(String str, Object obj, Object obj2) {
        throw new IllegalStateException(str + obj + obj2);
    }

    @Override // defpackage.nuw
    public boolean b(sfr sfrVar, sfr sfrVar2) {
        if (sfrVar != null && sfrVar2 != null) {
            boolean z = sfrVar.d() <= sfrVar2.a() && sfrVar.a() >= sfrVar2.d();
            if (sfrVar.b() <= sfrVar2.c() && sfrVar.c() >= sfrVar2.b() && z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.moh
    public void f(zvf0 zvf0Var) {
    }

    @Override // defpackage.thw0
    public Object get() {
        switch (this.a) {
            case 2:
                return q5z.E();
            case 3:
                return q5z.G();
            case 4:
                return q5z.B();
            case 5:
                return q5z.z();
            case 6:
                return q5z.A();
            case 7:
                HashMap hashMap = new HashMap(4);
                Double valueOf = Double.valueOf(0.2d);
                hashMap.put("FirstFrameDrawn", valueOf);
                Double valueOf2 = Double.valueOf(0.3d);
                hashMap.put("FirstContentShown", valueOf2);
                hashMap.put("FirstInputDelay", valueOf);
                hashMap.put("TimeToInteractive", valueOf2);
                return hashMap;
            case 8:
                HashMap hashMap2 = new HashMap(4);
                Double valueOf3 = Double.valueOf(0.2d);
                hashMap2.put("FirstFrameDrawn", valueOf3);
                Double valueOf4 = Double.valueOf(0.3d);
                hashMap2.put("FirstContentShown", valueOf4);
                hashMap2.put("InteractionToNextPaint", valueOf3);
                hashMap2.put("TimeToInteractive", valueOf4);
                return hashMap2;
            default:
                HashSet hashSet = new HashSet(1);
                hashSet.add("FirstInputDelay");
                hashSet.add("InteractionToNextPaint");
                return hashSet;
        }
    }

    @Override // defpackage.e5o
    public Environment getEnvironment() {
        switch (this.a) {
        }
        return Environment.PRODUCTION;
    }
}
