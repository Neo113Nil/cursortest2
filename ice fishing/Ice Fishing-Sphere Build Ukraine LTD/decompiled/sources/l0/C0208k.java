package l0;

import L.C0026b;
import L.Q;
import android.util.Log;
import e0.C0131g;

/* renamed from: l0.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0208k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2735a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2736b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2737c;

    public /* synthetic */ C0208k(int i2, Object obj, Object obj2) {
        this.f2735a = i2;
        this.f2737c = obj;
        this.f2736b = obj2;
    }

    public final void a(String str, String str2, Object obj) {
        switch (this.f2735a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((C0131g) this.f2736b).a(((m0.l) ((C0026b) ((Q) this.f2737c).f520g).f526h).c(str, str2, obj));
                break;
        }
    }

    public void b() {
        ((C0131g) this.f2736b).a(null);
    }

    public final void c(Object obj) {
        switch (this.f2735a) {
            case 0:
                ((C0209l) this.f2737c).f2739b = (byte[]) this.f2736b;
                break;
            default:
                ((C0131g) this.f2736b).a(((m0.l) ((C0026b) ((Q) this.f2737c).f520g).f526h).d(obj));
                break;
        }
    }
}
