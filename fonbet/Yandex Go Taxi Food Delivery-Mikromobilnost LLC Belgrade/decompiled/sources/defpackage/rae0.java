package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.logistics.sdk.cargo_form.impl.popup.ui.PopupModel$TextHintPopup$ArrowDirection;

/* loaded from: classes5.dex */
public final class rae0 implements z910 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kae0 b;
    public final /* synthetic */ PopupModel$TextHintPopup$ArrowDirection c;
    public final /* synthetic */ fwi d;
    public final /* synthetic */ oz40 e;

    public rae0(int i, kae0 kae0Var, PopupModel$TextHintPopup$ArrowDirection popupModel$TextHintPopup$ArrowDirection, fwi fwiVar, oz40 oz40Var) {
        this.a = i;
        this.b = kae0Var;
        this.c = popupModel$TextHintPopup$ArrowDirection;
        this.d = fwiVar;
        this.e = oz40Var;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        o l0 = ((x910) a.P(list)).l0(j);
        kae0 kae0Var = this.b;
        int i = this.a - kae0Var.h;
        zii0 zii0Var = kae0Var.c;
        float f = i;
        long j2 = v0a1.b(new zii0(zii0Var.a, zii0Var.b - f, zii0Var.c, zii0Var.d - f), kae0Var.d, (l0.a << 32) | (l0.b & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), this.c, this.d).a;
        oz40 oz40Var = this.e;
        return kVar.w(n8e.i(j), n8e.h(j), b.f(), new h2w(l0, ((int) (j2 >> 32)) - ((int) (((z5w) oz40Var.getValue()).a >> 32)), ((int) (j2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - ((int) (((z5w) oz40Var.getValue()).a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)), 4));
    }
}
