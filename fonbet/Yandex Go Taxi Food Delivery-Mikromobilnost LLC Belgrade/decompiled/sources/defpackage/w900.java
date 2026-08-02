package defpackage;

import com.yandex.go.flex.main_screen.routers.c;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes.dex */
public final class w900 extends mx60 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w900(int i, Object obj) {
        super(false);
        this.d = i;
        this.e = obj;
    }

    @Override // defpackage.mx60
    public final void d() {
        int i = this.d;
        Object obj = this.e;
        switch (i) {
            case 0:
                ylr ylrVar = ((c) obj).E;
                if (ylrVar != null) {
                    ylrVar.interceptOnBackPressed();
                    break;
                }
                break;
            case 1:
                h(false);
                ((ModalView) obj).onBackPressed();
                h(true);
                break;
            default:
                se41 se41Var = (se41) obj;
                if (se41Var.w.isInitialized()) {
                    ((y3x0) se41Var.a()).e.goBack();
                    h(((y3x0) se41Var.a()).e.canGoBack());
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w900(ModalView modalView) {
        super(true);
        this.d = 1;
        this.e = modalView;
    }
}
