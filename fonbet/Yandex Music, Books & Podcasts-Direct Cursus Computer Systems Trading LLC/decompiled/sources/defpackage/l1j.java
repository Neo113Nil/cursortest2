package defpackage;

import android.view.View;
import io.appmetrica.analytics.PulseConfig;
import io.appmetrica.analytics.impl.L1;
import io.appmetrica.analytics.impl.O1;
import ru.kinopoisk.sdk.easylogin.internal.I1;

/* loaded from: classes6.dex */
public final /* synthetic */ class l1j implements L1, I1, lu7, tgl, jpj, jd, kd {
    public final /* synthetic */ int a;

    public /* synthetic */ l1j(int i) {
        this.a = i;
    }

    private final void d(uzm uzmVar) {
    }

    public static /* synthetic */ void f() {
        throw new ClassCastException();
    }

    public static void g(int i) {
        throw new d5f(k5r.i(i, "An unknown field for index "));
    }

    public static /* synthetic */ void h(int i, Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static /* synthetic */ void i(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void k(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void l(Object obj, Object obj2, Object obj3, Throwable th) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(obj2);
        sb.append(obj3);
        throw new IllegalStateException(sb.toString(), th);
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void n(Object obj, Throwable th) {
        throw new IllegalStateException(obj.toString(), th);
    }

    public static /* synthetic */ void o(StringBuilder sb, Object obj, Object obj2) {
        sb.append(obj);
        sb.append(obj2);
        throw new IllegalStateException(sb.toString().toString());
    }

    public static /* synthetic */ void p(Object obj, String str) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void q(Object obj, String str) {
        throw new IllegalArgumentException(str + obj + '.');
    }

    @Override // defpackage.jpj
    public kqv G(View view, kqv kqvVar) {
        view.getClass();
        return kqv.b;
    }

    @Override // io.appmetrica.analytics.impl.L1
    public void a(PulseConfig pulseConfig) {
        switch (this.a) {
            case 5:
                O1.b(pulseConfig);
                break;
            default:
                O1.a(pulseConfig);
                break;
        }
    }

    @Override // defpackage.kd
    /* renamed from: b */
    public void mo33b(Object obj) {
    }

    public Object c(Object obj) {
        return Integer.valueOf(((qon) obj).c());
    }

    @Override // defpackage.jd
    public void call() {
    }

    @Override // defpackage.lu7
    public void j(uzm uzmVar) {
        switch (this.a) {
            case 10:
                return;
            default:
                uzmVar.get().getClass();
                throw new ClassCastException();
        }
    }

    @Override // defpackage.tgl
    public yil a(vil vilVar, cvo cvoVar) {
        vilVar.getClass();
        cvoVar.getClass();
        return yil.b;
    }
}
