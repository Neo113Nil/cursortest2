package defpackage;

import android.view.View;
import com.yandex.div.internal.widget.SelectView;
import com.yandex.div.internal.widget.SwitchView;
import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;
import ru.yandex.taxi.design.ListItemInputComponent;
import ru.yandex.taxi.design.NotificationStackComponent;

/* loaded from: classes10.dex */
public final /* synthetic */ class t37 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t37(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Runnable) obj).run();
                break;
            case 1:
                FullscreenSuperappSuggestModalView.setupFloatingInputField$lambda$2((FullscreenSuperappSuggestModalView) obj, view);
                break;
            case 2:
                ListItemInputComponent.init$lambda$3((ListItemInputComponent) obj, view);
                break;
            case 3:
                ((NotificationStackComponent) obj).closeList();
                break;
            case 4:
                SelectView._init_$lambda$1((SelectView) obj, view);
                break;
            default:
                ((SwitchView) obj).forwardClicksToSwitch();
                break;
        }
    }
}
