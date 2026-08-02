package defpackage;

import android.view.View;
import com.yandex.go.safety.center.contacts.SafetyCenterContactsView;
import java.util.function.Consumer;

/* loaded from: classes13.dex */
public final /* synthetic */ class zql0 implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ zql0(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        int i2 = this.b;
        View view = (View) obj;
        switch (i) {
            case 0:
                SafetyCenterContactsView.setMode$lambda$0(i2, view);
                break;
            case 1:
                xvy0.a(i2, view);
                break;
            case 2:
                xvy0.a(i2, view);
                break;
            default:
                xvy0.a(i2, view);
                break;
        }
    }
}
