package defpackage;

import android.graphics.PorterDuff;
import java.util.function.Consumer;
import ru.yandex.taxi.widget.ArrowsView;

/* loaded from: classes10.dex */
public final /* synthetic */ class s73 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrowsView b;

    public /* synthetic */ s73(ArrowsView arrowsView, int i) {
        this.a = i;
        this.b = arrowsView;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Integer num;
        int i = this.a;
        ArrowsView arrowsView = this.b;
        Integer num2 = (Integer) obj;
        switch (i) {
            case 0:
                arrowsView.setDefaultColorAttr(num2.intValue());
                break;
            case 1:
                ArrowsView.resolveThemebleAttrs$lambda$0(arrowsView, num2);
                break;
            case 2:
                arrowsView.setEndColorAttr(num2.intValue());
                break;
            case 3:
                ArrowsView.resolveThemebleAttrs$lambda$1(arrowsView, num2);
                break;
            default:
                arrowsView.colorFilter = num2;
                num = arrowsView.colorFilter;
                arrowsView.setColorFilter(num != null ? num.intValue() : 0, PorterDuff.Mode.SRC_IN);
                break;
        }
    }
}
