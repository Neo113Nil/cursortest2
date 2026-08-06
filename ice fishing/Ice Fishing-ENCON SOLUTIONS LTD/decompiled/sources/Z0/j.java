package Z0;

import a1.InterfaceC0096l;
import android.util.Log;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1993a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1995c;

    public /* synthetic */ j(int i2, Object obj, Object obj2) {
        this.f1993a = i2;
        this.f1995c = obj;
        this.f1994b = obj2;
    }

    public final void a(String str, String str2, Object obj) {
        switch (this.f1993a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((R0.g) this.f1994b).a(((InterfaceC0096l) ((I0.b) ((x0.e) this.f1995c).f8531c).f723d).f(str, str2, obj));
                break;
        }
    }

    public void b() {
        ((R0.g) this.f1994b).a(null);
    }

    public final void c(Object obj) {
        switch (this.f1993a) {
            case 0:
                ((k) this.f1995c).f1997b = (byte[]) this.f1994b;
                break;
            default:
                ((R0.g) this.f1994b).a(((InterfaceC0096l) ((I0.b) ((x0.e) this.f1995c).f8531c).f723d).a(obj));
                break;
        }
    }
}
