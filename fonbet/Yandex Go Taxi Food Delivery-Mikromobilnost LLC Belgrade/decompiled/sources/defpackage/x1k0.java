package defpackage;

import android.os.Looper;
import com.yandex.messaging.internal.net.a;

/* loaded from: classes15.dex */
public final class x1k0 implements qw50 {
    public boolean a;
    public final /* synthetic */ a b;

    public x1k0(a aVar, boolean z) {
        this.b = aVar;
        this.a = z;
    }

    @Override // defpackage.qw50
    public final void a(boolean z) {
        a aVar = this.b;
        z83.g(null, aVar.c, Looper.myLooper());
        if (z != this.a) {
            if (z) {
                aVar.c();
            } else {
                aVar.b();
            }
            this.a = z;
        }
    }
}
