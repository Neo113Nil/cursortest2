package defpackage;

import android.view.KeyEvent;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.remotecamera.RemoteCameraConfig;
import ru.yandex.music.R;
import ru.yandex.music.phonoteka.mymusic.CollectionMainActivity;

/* loaded from: classes4.dex */
public final /* synthetic */ class fp2 implements ytc {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ fp2(KeyEvent.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // defpackage.ytc
    public final void onBackStackChanged() {
        boolean z;
        int i = this.a;
        KeyEvent.Callback callback = this.b;
        switch (i) {
            case 0:
                op2 op2Var = (op2) callback;
                o C = op2Var.getSupportFragmentManager().C(R.id.fragment_container);
                op2Var.getWindow().setFlags(((C instanceof a13) || ((z = C instanceof u07)) || z || !n7w.R(q6c.g)) ? 8192 : 0, RemoteCameraConfig.Notification.ID);
                break;
            default:
                int i2 = CollectionMainActivity.v0;
                ((FragmentContainerView) callback).sendAccessibilityEvent(8);
                break;
        }
    }
}
