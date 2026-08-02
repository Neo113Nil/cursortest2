package defpackage;

import android.webkit.WebView;
import java.util.Collections;
import java.util.Iterator;
import ru.yandex.taxi.design.CardComponent;
import ru.yandex.taxi.widget.dialog.BaseDialog;
import yads.nu3;

/* loaded from: classes7.dex */
public final class vz4 implements Runnable {
    public final /* synthetic */ int a = 1;
    public float b;
    public final /* synthetic */ Object c;

    public vz4(h3s0 h3s0Var, float f) {
        this.c = h3s0Var;
        this.b = f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        CardComponent cardComponent;
        CardComponent cardComponent2;
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                float f = (this.b * (-0.100000024f)) + 1.1f;
                BaseDialog baseDialog = (BaseDialog) obj;
                cardComponent = baseDialog.contentContainer;
                if (cardComponent == null) {
                    cardComponent = null;
                }
                cardComponent.setScaleX(f);
                cardComponent2 = baseDialog.contentContainer;
                (cardComponent2 != null ? cardComponent2 : null).setScaleY(f);
                break;
            default:
                pn61 pn61Var = ((nu3) ((h3s0) obj).b).e;
                float f2 = this.b;
                pn61Var.a = f2;
                if (pn61Var.d == null) {
                    pn61Var.d = kb71.c;
                }
                Iterator it = Collections.unmodifiableCollection(pn61Var.d.b).iterator();
                while (it.hasNext()) {
                    o971 o971Var = ((j681) it.next()).e;
                    vj61.a.b((WebView) o971Var.b.get(), "setDeviceVolume", Float.valueOf(f2), o971Var.a);
                }
                break;
        }
    }

    public vz4(BaseDialog baseDialog) {
        this.c = baseDialog;
    }
}
