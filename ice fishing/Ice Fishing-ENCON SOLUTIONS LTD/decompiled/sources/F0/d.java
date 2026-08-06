package F0;

import com.yandex.varioqub.config.impl.B;
import java.io.Serializable;
import t1.InterfaceC1046a;

/* loaded from: classes.dex */
public final /* synthetic */ class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f585a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f586b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f587c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f588d;

    public /* synthetic */ d(Object obj, int i2, Object obj2, int i3) {
        this.f585a = i3;
        this.f587c = obj;
        this.f586b = i2;
        this.f588d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f585a) {
            case 0:
                B.a((B) this.f587c, this.f586b, (InterfaceC1046a) this.f588d);
                break;
            default:
                ((N.d) ((N.a) this.f587c).f1107c).a(this.f586b, (Serializable) this.f588d);
                break;
        }
    }
}
