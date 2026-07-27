package l0;

import L.C0051b;
import L.Q;
import android.util.Log;
import e0.C0131g;
import m0.InterfaceC0214l;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2727a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2728b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2729c;

    public /* synthetic */ k(int i2, Object obj, Object obj2) {
        this.f2727a = i2;
        this.f2729c = obj;
        this.f2728b = obj2;
    }

    public final void a(String str, String str2, Object obj) {
        switch (this.f2727a) {
            case 0:
                Log.e("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
                break;
            default:
                ((C0131g) this.f2728b).a(((InterfaceC0214l) ((C0051b) ((Q) this.f2729c).f598h).f604i).c(str, str2, obj));
                break;
        }
    }

    public void b() {
        ((C0131g) this.f2728b).a(null);
    }

    public final void c(Object obj) {
        switch (this.f2727a) {
            case 0:
                ((l) this.f2729c).f2731b = (byte[]) this.f2728b;
                break;
            default:
                ((C0131g) this.f2728b).a(((InterfaceC0214l) ((C0051b) ((Q) this.f2729c).f598h).f604i).d(obj));
                break;
        }
    }
}
