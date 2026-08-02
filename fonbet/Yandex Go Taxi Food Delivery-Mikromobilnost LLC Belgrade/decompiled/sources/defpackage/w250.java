package defpackage;

import ru.yandex.taxi.eatskit.internal.nativeapi.NativeApi;

/* loaded from: classes5.dex */
public final class w250 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ NativeApi b;

    public /* synthetic */ w250(NativeApi nativeApi, int i) {
        this.a = i;
        this.b = nativeApi;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        NativeApi nativeApi = this.b;
        switch (i) {
            case 0:
                ((gcn) obj2).a(new ck7(nativeApi.handleConfig((rzd) obj), null));
                break;
            default:
                nativeApi.handleOnWebApiReady();
                ((gcn) obj2).a(new ck7(zy11Var, null));
                break;
        }
        return zy11Var;
    }
}
