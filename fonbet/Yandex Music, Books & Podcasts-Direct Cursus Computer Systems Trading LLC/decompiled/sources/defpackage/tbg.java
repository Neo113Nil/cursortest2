package defpackage;

import android.os.Handler;
import ru.yandex.video.m3.player.PreparingParams;

/* loaded from: classes6.dex */
public final class tbg implements u9l {
    public final acg a;
    public final Handler b;
    public final qdc c;
    public final String d;

    public tbg(acg acgVar, Handler handler, qdc qdcVar, String str) {
        this.a = acgVar;
        this.b = handler;
        this.c = qdcVar;
        this.d = str;
    }

    @Override // defpackage.u9l
    public final void j(PreparingParams preparingParams) {
        preparingParams.getClass();
        dvt.c0(this.b, new juc(12, this, preparingParams));
    }
}
