package defpackage;

import com.yandex.music.core.ui.compose.b;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class l50 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public l50(List list, int i) {
        this.a = 2;
        this.c = list;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                jfp jfpVar = (jfp) obj;
                jfpVar.getClass();
                wfp.t(jfpVar, "downloads_filter");
                int i = this.b;
                b.a(jfpVar, i);
                wfp.q(jfpVar, 4);
                wfp.r(jfpVar, ((sr3) this.c).c);
                wfp.j(jfpVar, new my4(0, 1, i, 1));
                break;
            case 1:
                jfp jfpVar2 = (jfp) obj;
                jfpVar2.getClass();
                wfp.t(jfpVar2, "downloads_filter");
                int i2 = this.b;
                b.a(jfpVar2, i2);
                wfp.q(jfpVar2, 4);
                wfp.r(jfpVar2, ((sr3) this.c).c);
                wfp.j(jfpVar2, new my4(0, 1, i2, 1));
                break;
            default:
                ((List) this.c).set(this.b + 1, Float.valueOf((int) (((hqe) obj).a & 4294967295L)));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ l50(int i, sr3 sr3Var, int i2) {
        this.a = i2;
        this.b = i;
        this.c = sr3Var;
    }
}
