package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.semantics.f;
import com.yandex.mapkit.map.CameraPosition;

/* loaded from: classes12.dex */
public final /* synthetic */ class wth implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ wth(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 9;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                CameraPosition cameraPosition = (CameraPosition) obj;
                return new CameraPosition(cameraPosition.getTarget(), 17.0f, cameraPosition.getAzimuth(), cameraPosition.getTilt());
            case 1:
                zsa zsaVar = ((hvh) obj).a;
                zsaVar.r(new qu(i2));
                ((bmh) zsaVar.G).invoke();
                return zy11Var;
            case 2:
                zsa zsaVar2 = ((hvh) obj).a;
                zsaVar2.r(new qu(i2));
                ((amh) zsaVar2.F).invoke();
                return zy11Var;
            case 3:
                return zy11Var;
            case 4:
                ((sy60) obj).a();
                return zy11Var;
            case 5:
                ((sy60) obj).a();
                return zy11Var;
            case 6:
                return zy11Var;
            case 7:
                return new View(((ViewGroup) obj).getContext());
            case 8:
                ((c0i) obj).i0();
                return zy11Var;
            case 9:
                ((c0i) obj).C0();
                return zy11Var;
            case 10:
                ((c0i) obj).i0();
                return zy11Var;
            case 11:
                ((c0i) obj).a();
                return zy11Var;
            case 12:
                ((c0i) obj).i0();
                return zy11Var;
            case 13:
                ((c0i) obj).C0();
                return zy11Var;
            case 14:
                ((isd) obj).a();
                return zy11Var;
            case 15:
                f.d((mnq0) obj);
                return zy11Var;
            case 16:
                return ((oo0) obj).a;
            case 17:
                zsa zsaVar3 = ((xii) obj).a;
                zsaVar3.r(new qu(i2));
                ((wii) zsaVar3.G).invoke();
                return zy11Var;
            case 18:
                zsa zsaVar4 = ((xii) obj).a;
                zsaVar4.r(new qu(i2));
                ((wii) zsaVar4.F).invoke();
                return zy11Var;
            case 19:
                ((q8i) obj).f();
                return zy11Var;
            case 20:
                ((q8i) obj).onCancel();
                return zy11Var;
            case 21:
                ((cai) obj).w();
                return zy11Var;
            case 22:
                ((sy60) obj).a();
                return zy11Var;
            case 23:
                ((sy60) obj).a();
                return zy11Var;
            case 24:
                w3j0 w3j0Var = (w3j0) obj;
                w3j0Var.a.put("close_reason", "done");
                return w3j0Var;
            case 25:
                w3j0 w3j0Var2 = (w3j0) obj;
                w3j0Var2.a.put("close_reason", "back_button");
                return w3j0Var2;
            case 26:
                ((fgi) obj).a();
                return zy11Var;
            case 27:
                zsa zsaVar5 = ((fgi) obj).a;
                zsaVar5.r(new qu(i2));
                ((egi) zsaVar5.F).invoke();
                return zy11Var;
            case 28:
                return ((fnx0) obj).c.b;
            default:
                return d6z.C((String) obj);
        }
    }
}
