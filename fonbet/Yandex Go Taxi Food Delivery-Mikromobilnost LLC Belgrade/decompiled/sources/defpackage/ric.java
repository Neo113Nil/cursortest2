package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.go.design.compose.input.InputState;
import com.yandex.go.masstransit.sdk.camera.ml.b;
import com.yandex.go.masstransit.sdk.camera.ml.c;
import com.yandex.go.masstransit.sdk.camera.view.MtQRCameraPreview;
import java.util.Arrays;

/* loaded from: classes10.dex */
public final /* synthetic */ class ric implements tls {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ ric(int i, String str, String str2, oz40 oz40Var, oz40 oz40Var2) {
        this.b = i;
        this.c = str;
        this.w = str2;
        this.x = oz40Var;
        this.y = oz40Var2;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        int i2 = 0;
        zy11 zy11Var = zy11.a;
        int i3 = this.b;
        Object obj2 = this.y;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                o[] oVarArr = (o[]) obj5;
                sic sicVar = (sic) obj4;
                k kVar = (k) obj3;
                int[] iArr = (int[]) obj2;
                o.a aVar = (o.a) obj;
                int length = oVarArr.length;
                int i4 = 0;
                while (i2 < length) {
                    o oVar = oVarArr[i2];
                    int i5 = i4 + 1;
                    Object a = oVar.a();
                    hhl0 hhl0Var = a instanceof hhl0 ? (hhl0) a : null;
                    LayoutDirection layoutDirection = kVar.getLayoutDirection();
                    vtb1 vtb1Var = hhl0Var != null ? hhl0Var.c : null;
                    aVar.g(oVar, vtb1Var != null ? vtb1Var.b(i3, oVar.a, layoutDirection) : sicVar.b.a(oVar.a, i3, layoutDirection), iArr[i4], 0.0f);
                    i2++;
                    i4 = i5;
                }
                return zy11Var;
            case 1:
                o oVar2 = (o) obj4;
                o oVar3 = (o) obj3;
                o oVar4 = (o) obj2;
                o.a aVar2 = (o.a) obj;
                if (((nhy) obj5).a.getValue() == InputState.EmptyUnfocused && oVar2 == null) {
                    if (oVar3 != null) {
                        o.a.o(aVar2, oVar3, 0, (i3 - oVar3.b) / 2);
                    }
                    o.a.o(aVar2, oVar4, 0, (i3 - oVar4.b) / 2);
                } else {
                    if (oVar3 != null) {
                        o.a.o(aVar2, oVar3, 0, 0);
                    }
                    o.a.o(aVar2, oVar4, 0, oVar3 != null ? oVar3.b : 0);
                    if (oVar2 != null) {
                        o.a.o(aVar2, oVar2, 0, ((oVar4.b / 2) + (oVar3 != null ? oVar3.b : 0)) - (oVar2.b / 2));
                    }
                }
                return zy11Var;
            case 2:
                String str = (String) obj5;
                String str2 = (String) obj4;
                oz40 oz40Var = (oz40) obj3;
                oz40 oz40Var2 = (oz40) obj2;
                dry0 dry0Var = (dry0) obj;
                if (dry0Var.f() && !((Boolean) oz40Var.getValue()).booleanValue()) {
                    oz40Var.setValue(Boolean.TRUE);
                    oz40Var2.setValue(evu0.n0(gvu0.t0(str2.length() + 3, gvu0.A0(dry0Var.b.c(i3 - 1, true), str)), Arrays.copyOf(ul91.a, 3)) + "...");
                }
                return zy11Var;
            default:
                b bVar = (b) obj5;
                bVar.d = new c((ycg0) obj4, new v45((MtQRCameraPreview) obj3, (tls) obj2, i3, 7));
                return new w50(20, bVar);
        }
    }

    public /* synthetic */ ric(nhy nhyVar, o oVar, o oVar2, int i, o oVar3) {
        this.c = nhyVar;
        this.w = oVar;
        this.x = oVar2;
        this.b = i;
        this.y = oVar3;
    }

    public /* synthetic */ ric(b bVar, ycg0 ycg0Var, MtQRCameraPreview mtQRCameraPreview, tls tlsVar, int i) {
        this.c = bVar;
        this.w = ycg0Var;
        this.x = mtQRCameraPreview;
        this.y = tlsVar;
        this.b = i;
    }

    public /* synthetic */ ric(o[] oVarArr, sic sicVar, int i, k kVar, int[] iArr) {
        this.c = oVarArr;
        this.w = sicVar;
        this.b = i;
        this.x = kVar;
        this.y = iArr;
    }
}
