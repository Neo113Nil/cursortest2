package defpackage;

import android.view.InputDevice;
import android.view.KeyEvent;
import androidx.compose.ui.focus.c;
import com.yandex.xplat.common.YSError;
import java.util.List;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes10.dex */
public final class qmy0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qmy0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = false;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((eix) obj).a;
                dur durVar = (dur) obj3;
                InputDevice device = keyEvent.getDevice();
                if (device != null && device.supportsSource(513) && ((!device.isVirtual() || keyEvent.getSource() == 33554433) && c9y.f(keyEvent) == 2 && keyEvent.getSource() != 257)) {
                    if (qlb1.a(19, keyEvent)) {
                        z = ((c) durVar).j(5, true);
                    } else if (qlb1.a(20, keyEvent)) {
                        z = ((c) durVar).j(6, true);
                    } else if (qlb1.a(21, keyEvent)) {
                        z = ((c) durVar).j(3, true);
                    } else if (qlb1.a(22, keyEvent)) {
                        z = ((c) durVar).j(4, true);
                    } else if (qlb1.a(23, keyEvent)) {
                        u5t0 u5t0Var = ((oay) obj2).c;
                        if (u5t0Var != null) {
                            ((wqh) u5t0Var).b();
                        }
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                ((wls) obj3).invoke((h711) obj2, (ib11) obj);
                return zy11Var;
            case 2:
                int intValue = ((Number) obj).intValue();
                return ((jiz0) obj3).invoke(Integer.valueOf(intValue), ((List) obj2).get(intValue));
            default:
                ((y22) ((rwo) obj3)).a(iho.b(vfc.f(qv90.a, 0, DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "Получение фичефлагов", "get_feature_flags"), ((YSError) obj).getMessage(), 2));
                ((j18) obj2).resumeWith(zy11Var);
                return zy11Var;
        }
    }
}
