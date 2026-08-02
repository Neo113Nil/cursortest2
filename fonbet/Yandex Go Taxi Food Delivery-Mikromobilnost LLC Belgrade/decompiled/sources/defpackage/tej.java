package defpackage;

import ru.yandex.taxi.widget.dialog.BaseDialog;

/* loaded from: classes5.dex */
public final /* synthetic */ class tej implements qdj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tej(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.qdj
    public final void dismiss() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((apf) obj).f();
                break;
            default:
                ((BaseDialog) obj).dismiss();
                break;
        }
    }
}
