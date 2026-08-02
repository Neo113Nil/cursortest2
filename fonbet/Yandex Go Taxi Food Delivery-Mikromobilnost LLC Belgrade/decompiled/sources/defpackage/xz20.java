package defpackage;

import android.view.ViewTreeObserver;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes10.dex */
public final /* synthetic */ class xz20 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xz20(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean preDrawListener$lambda$0;
        boolean invalidateAutosize$lambda$0;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                preDrawListener$lambda$0 = ModalView.getPreDrawListener$lambda$0((ModalView) obj);
                return preDrawListener$lambda$0;
            case 1:
                return ((Boolean) ((sls) obj).invoke()).booleanValue();
            default:
                invalidateAutosize$lambda$0 = RobotoTextView.invalidateAutosize$lambda$0((RobotoTextView) obj);
                return invalidateAutosize$lambda$0;
        }
    }
}
