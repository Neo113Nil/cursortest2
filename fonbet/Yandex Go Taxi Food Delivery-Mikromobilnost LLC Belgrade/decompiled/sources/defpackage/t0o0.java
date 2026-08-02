package defpackage;

import com.yandex.mapkit.navigation.transport.Navigation;
import ru.yandex.taxi.scooters.data.t;

/* loaded from: classes6.dex */
public final /* synthetic */ class t0o0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Navigation b;
    public final /* synthetic */ t c;

    public /* synthetic */ t0o0(Navigation navigation, t tVar, int i) {
        this.a = i;
        this.b = navigation;
        this.c = tVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        t tVar = this.c;
        Navigation navigation = this.b;
        switch (i) {
            case 0:
                navigation.getGuidance().removeListener(tVar);
                break;
            case 1:
                navigation.getGuidance().removeListener(tVar);
                break;
            default:
                navigation.getGuidance().removeListener(tVar);
                break;
        }
        return zy11Var;
    }
}
