package defpackage;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lo3w;", "Lgxb;", "wave-screen"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class o3w extends gxb {
    public final xdr e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public o3w() {
        super("androidWaveScreenWordsInWave", ouj.c("default", r0, r0), 12);
        List h = u75.h("default", "on", "on1");
        this.e = ydr.a(new j7v(false, false));
    }

    @Override // defpackage.gxb
    public final void c(exb exbVar) {
        String b = b();
        j7v j7vVar = new j7v(Intrinsics.d(b, "on") || Intrinsics.d(b, "on1"), Intrinsics.d(b, "on"));
        xdr xdrVar = this.e;
        xdrVar.getClass();
        xdrVar.m(null, j7vVar);
    }
}
