package defpackage;

import com.connectsdk.service.airplay.PListParser;
import io.appmetrica.analytics.rtm.internal.Constants;

/* loaded from: classes3.dex */
public final class e52 implements rhj {
    public static final e52 a = new e52();
    public static final d9c b = d9c.a(PListParser.TAG_KEY);
    public static final d9c c = d9c.a(Constants.KEY_VALUE);

    @Override // defpackage.j6b
    public final void a(Object obj, Object obj2) {
        shj shjVar = (shj) obj2;
        vb2 vb2Var = (vb2) ((rp6) obj);
        shjVar.a(b, vb2Var.a);
        shjVar.a(c, vb2Var.b);
    }
}
