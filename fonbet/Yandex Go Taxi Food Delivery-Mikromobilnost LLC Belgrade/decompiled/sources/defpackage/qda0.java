package defpackage;

import android.view.ViewGroup;
import com.yandex.go.address.models.Address;
import com.yandex.go.zone.dto.objects.ServiceLevel;
import com.yandex.go.zone.model.Zone;
import java.net.Proxy;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.ListHintComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes8.dex */
public final /* synthetic */ class qda0 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ qda0(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        long j;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ListHintComponent listHintComponent = new ListHintComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listHintComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return listHintComponent;
            case 1:
                return new prq0((ListHintComponent) obj, 1);
            case 2:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                nzs.s(listItemComponent, -1, -2);
                return listItemComponent;
            case 3:
                Zone zone = (Zone) obj;
                if (zone != null) {
                    return zone.g;
                }
                return null;
            case 4:
                return dnz0.a((dnz0) obj, null, null, 2);
            case 5:
                boc0 boc0Var = (boc0) obj;
                return new Pair(boc0Var.c, Boolean.valueOf(boc0Var.d));
            case 6:
                return ((boc0) obj).a;
            case 7:
                return (po2) obj;
            case 8:
                return ((lj) obj).getAuthToken();
            case 9:
                return ((lj) obj).getAuthToken();
            case 10:
                o3d0 o3d0Var = (o3d0) obj;
                if (o3d0Var instanceof m3d0) {
                    return "PLUS_HOME_SDK_REST_GATEWAY";
                }
                if (o3d0Var instanceof k3d0) {
                    return "PLUS_HOME_SDK_GRAPHQL_GATEWAY";
                }
                if (o3d0Var instanceof j3d0) {
                    return "PLUS_HOME_SDK_AVATARS_GATEWAY";
                }
                if (o3d0Var instanceof l3d0) {
                    return "PLUS_HOME_SDK_HOME_WEBVIEW";
                }
                if (o3d0Var instanceof n3d0) {
                    return "PLUS_HOME_SDK_STORY_WEBVIEW";
                }
                w511.b();
                return null;
            case 11:
                return (po2) obj;
            case 12:
                acx acxVar = (acx) obj;
                acxVar.c = true;
                acxVar.g = true;
                return zy11Var;
            case 13:
                return oyr.p("PlusPayUIComponentHolder with instanceId=", (String) obj, " is not initialized, to initialize call PlusPayUI.getProvider(...)");
            case 14:
                i3y i3yVar = skd0.a;
                return Boolean.TRUE;
            case 15:
                return kp50.i();
            case 16:
                return EmptyList.a;
            case 17:
                return Boolean.valueOf(((ServiceLevel.TariffDetail) obj).d());
            case 18:
                return igf0.a;
            case 19:
                hl3 hl3Var = (hl3) obj;
                if (hl3Var instanceof fl3) {
                    j = ((fl3) hl3Var).a;
                } else {
                    if (!(hl3Var instanceof gl3)) {
                        w511.b();
                        return null;
                    }
                    j = 0;
                }
                return new jgf0(j);
            case 20:
                return ggf0.a;
            case 21:
                return fgf0.a;
            case 22:
                return pwf0.d((Class) obj, new iwf0());
            case 23:
                Proxy proxy = (Proxy) obj;
                return "{ address: " + proxy.address() + ", type: " + proxy.type().name() + " }";
            case 24:
                return ((vei0) obj).a;
            case 25:
                return zy11Var;
            case 26:
                return zy11Var;
            case 27:
                ((acx) obj).c = true;
                return zy11Var;
            case 28:
                zzk0 zzk0Var = d0l0.Companion;
                return ((Address) obj).B();
            default:
                Address address = (Address) obj;
                return address.d() + Extension.O_BRAKE + address.B() + Extension.C_BRAKE;
        }
    }
}
