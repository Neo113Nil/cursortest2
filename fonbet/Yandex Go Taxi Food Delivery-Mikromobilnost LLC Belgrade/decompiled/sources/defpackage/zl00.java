package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.go.superapp.discovery.map.impl.ui.main.v2.a;
import com.yandex.go.superapp.discovery.map.impl.ui.main.v2.b;
import defpackage.zl00;

/* loaded from: classes14.dex */
public final class zl00 {
    public final ah00 a;
    public final long b;
    public final sls c;
    public final sls d;
    public boolean f;
    public final Handler e = new Handler(Looper.getMainLooper());
    public final a g = new Runnable() { // from class: com.yandex.go.superapp.discovery.map.impl.ui.main.v2.a
        @Override // java.lang.Runnable
        public final void run() {
            zl00 zl00Var = zl00.this;
            zl00Var.f = true;
            ((SuperAppDiscoveryMapV2ModalView$longPressDetector$1) zl00Var.c).invoke();
            zl00Var.e.postDelayed(zl00Var.h, 16L);
        }
    };
    public final b h = new b(this);
    public final b01 i = new b01(12, this);

    /* JADX WARN: Type inference failed for: r1v2, types: [com.yandex.go.superapp.discovery.map.impl.ui.main.v2.a] */
    public zl00(ah00 ah00Var, long j, sls slsVar, sls slsVar2) {
        this.a = ah00Var;
        this.b = j;
        this.c = slsVar;
        this.d = slsVar2;
    }
}
