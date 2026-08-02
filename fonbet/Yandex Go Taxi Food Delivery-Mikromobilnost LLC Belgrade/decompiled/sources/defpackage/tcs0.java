package defpackage;

import android.os.Build;
import kotlin.a;
import ru.yandex.yx_platform_api.SimCardManager$SimCardStreamHandler$onDataEnabledCallback$2$1;

/* loaded from: classes7.dex */
public final class tcs0 implements zeo {
    public yeo a;
    public final i3y b;
    public final /* synthetic */ ucs0 c;

    public tcs0(ucs0 ucs0Var) {
        this.c = ucs0Var;
        this.b = a.a(new ppr0(9, ucs0Var, this));
    }

    @Override // defpackage.zeo
    public final void onCancel(Object obj) {
        this.a = null;
        if (Build.VERSION.SDK_INT >= 31) {
            this.c.b.unregisterTelephonyCallback((SimCardManager$SimCardStreamHandler$onDataEnabledCallback$2$1) this.b.getValue());
        }
    }

    @Override // defpackage.zeo
    public final void onListen(Object obj, xeo xeoVar) {
        this.a = (yeo) xeoVar;
        if (Build.VERSION.SDK_INT >= 31) {
            ucs0 ucs0Var = this.c;
            ucs0Var.b.registerTelephonyCallback(ucs0Var.a.getMainExecutor(), (SimCardManager$SimCardStreamHandler$onDataEnabledCallback$2$1) this.b.getValue());
        }
    }
}
