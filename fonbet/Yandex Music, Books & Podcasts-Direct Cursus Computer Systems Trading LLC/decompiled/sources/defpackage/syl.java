package defpackage;

import com.yandex.music.core.ui.compose.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class syl implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ hcc c;

    public /* synthetic */ syl(int i, hcc hccVar, int i2) {
        this.a = i2;
        this.b = i;
        this.c = hccVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.t(jfpVar, "playlist_filter");
                int i = this.b;
                b.a(jfpVar, i);
                wfp.q(jfpVar, 4);
                wfp.r(jfpVar, this.c.d);
                wfp.j(jfpVar, new my4(0, 1, i, 1));
                break;
            default:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.t(jfpVar2, "playlist_filter");
                int i2 = this.b;
                b.a(jfpVar2, i2);
                wfp.q(jfpVar2, 4);
                wfp.r(jfpVar2, this.c.d);
                wfp.j(jfpVar2, new my4(0, 1, i2, 1));
                break;
        }
        return Unit.a;
    }
}
