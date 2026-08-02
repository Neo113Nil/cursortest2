package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import kotlin.jvm.functions.Function0;
import ru.yandex.music.R;

/* loaded from: classes4.dex */
public final class cdu extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ ddu s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cdu(ddu dduVar, int i) {
        super(0);
        this.r = i;
        this.s = dduVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.r;
        ddu dduVar = this.s;
        switch (i) {
            case 0:
                w3c w3cVar = new w3c();
                w3cVar.c = 500L;
                View E = dduVar.E();
                if (E != null) {
                    w3cVar.d(E.getId());
                }
                return w3cVar;
            case 1:
                return (LinearLayout) dduVar.findViewById(R.id.content_layout);
            case 2:
                n8t n8tVar = new n8t();
                n8tVar.W((b8t) dduVar.j.getValue());
                wsq wsqVar = new wsq();
                wsqVar.c = 500L;
                wsqVar.e(dduVar.findViewById(R.id.exit_fragment_container));
                n8tVar.W(wsqVar);
                return n8tVar;
            default:
                n8t n8tVar2 = new n8t();
                n8tVar2.W((b8t) dduVar.j.getValue());
                wsq wsqVar2 = new wsq();
                wsqVar2.c = 500L;
                FrameLayout H = dduVar.H();
                if (H != null) {
                    wsqVar2.d(H.getId());
                }
                n8tVar2.W(wsqVar2);
                return n8tVar2;
        }
    }
}
