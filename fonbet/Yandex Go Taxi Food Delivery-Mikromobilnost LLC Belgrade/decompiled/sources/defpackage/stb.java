package defpackage;

import android.view.View;
import ru.yandex.taxi.design.CircleButtonsPanelComponent;

/* loaded from: classes5.dex */
public final /* synthetic */ class stb implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ vtb b;
    public final /* synthetic */ View c;
    public final /* synthetic */ int w;

    public /* synthetic */ stb(vtb vtbVar, View view, int i, int i2) {
        this.a = i2;
        this.b = vtbVar;
        this.c = view;
        this.w = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        View view = this.c;
        vtb vtbVar = this.b;
        switch (i) {
            case 0:
                vtbVar.b(view, i2 == 0, true);
                CircleButtonsPanelComponent circleButtonsPanelComponent = vtbVar.a;
                int childCount = circleButtonsPanelComponent.getChildCount();
                if (i2 > childCount) {
                    i2 = childCount;
                }
                circleButtonsPanelComponent.addViewInternal$design_components(view, i2);
                break;
            default:
                vtbVar.b(view, i2 == 0, false);
                vtbVar.a.removeViewInternal$design_components(view);
                break;
        }
        return zy11Var;
    }
}
