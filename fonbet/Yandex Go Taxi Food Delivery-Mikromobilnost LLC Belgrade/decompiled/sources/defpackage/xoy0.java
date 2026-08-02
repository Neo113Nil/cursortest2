package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.layout.o;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.a;
import kotlin.collections.b;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.yandex.logistics.sdk.cargo_form.impl.popup.ui.PopupModel$TextHintPopup$ArrowDirection;

/* loaded from: classes5.dex */
public final class xoy0 implements gl40 {
    public final /* synthetic */ l9e0 a;
    public final /* synthetic */ zii0 b;
    public final /* synthetic */ zii0 c;
    public final /* synthetic */ fwi d;

    public xoy0(l9e0 l9e0Var, zii0 zii0Var, zii0 zii0Var2, fwi fwiVar) {
        this.a = l9e0Var;
        this.b = zii0Var;
        this.c = zii0Var2;
        this.d = fwiVar;
    }

    @Override // defpackage.gl40
    public final aa10 b(k kVar, List list, long j) {
        int i;
        long b;
        int i2;
        int i3;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        final o l0 = ((x910) a.P((List) arrayList.get(1))).l0(j);
        final int f0 = kVar.f0(1.0f);
        l9e0 l9e0Var = this.a;
        PopupModel$TextHintPopup$ArrowDirection popupModel$TextHintPopup$ArrowDirection = l9e0Var.c;
        PopupModel$TextHintPopup$ArrowDirection popupModel$TextHintPopup$ArrowDirection2 = l9e0Var.c;
        int[] iArr = woy0.a;
        int i4 = iArr[popupModel$TextHintPopup$ArrowDirection.ordinal()];
        zii0 zii0Var = this.b;
        if (i4 == 1 || i4 == 2) {
            float w0 = kVar.w0(8.0f);
            float w02 = kVar.w0(7.0f);
            int i5 = iArr[popupModel$TextHintPopup$ArrowDirection2.ordinal()];
            zii0 zii0Var2 = this.c;
            int d = y6i0.d(m810.b(((i5 == 1 ? ((zii0Var.c - w0) - zii0Var2.c) - w02 : ((zii0Var2.a - w02) - zii0Var.a) - w0) - l0.a) + f0), 0, n8e.i(j));
            i = 3;
            b = n8e.b(0, j, d, 0, 0, 13);
        } else {
            if (i4 != 3 && i4 != 4) {
                w511.b();
                return null;
            }
            int d2 = y6i0.d(m810.b((zii0Var.c - zii0Var.a) - (2.0f * kVar.w0(8.0f))), 0, n8e.i(j));
            i = 3;
            b = n8e.b(0, j, d2, 0, 0, 13);
        }
        final o l02 = ((x910) a.P(list2)).l0(b);
        int i6 = iArr[popupModel$TextHintPopup$ArrowDirection2.ordinal()];
        if (i6 == 1 || i6 == 2) {
            i2 = (l02.a + l0.a) - f0;
            i3 = l02.b;
        } else {
            if (i6 != i && i6 != 4) {
                w511.b();
                return null;
            }
            i2 = l02.a;
            i3 = (l02.b + l0.b) - f0;
        }
        final int i7 = i2;
        final lae0 b2 = v0a1.b(this.c, this.b, (i7 << 32) | (i3 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), l9e0Var.c, this.d);
        final l9e0 l9e0Var2 = this.a;
        final int i8 = i3;
        return kVar.w(i7, i8, b.f(), new tls() { // from class: voy0
            @Override // defpackage.tls
            public final Object invoke(Object obj) {
                Float f = b2.b;
                o.a aVar = (o.a) obj;
                int i9 = woy0.a[l9e0.this.c.ordinal()];
                o oVar = l0;
                o oVar2 = l02;
                int i10 = f0;
                int i11 = i8;
                if (i9 == 1) {
                    aVar.g(oVar, 0, (i11 / 2) - (oVar.b / 2), 0.0f);
                    aVar.g(oVar2, oVar.a - i10, 0, 0.0f);
                } else if (i9 != 2) {
                    int i12 = i7;
                    if (i9 == 3) {
                        aVar.g(oVar, f != null ? m810.b(f.floatValue() - (oVar.a / 2)) : (i12 / 2) - (oVar.a / 2), 0, 0.0f);
                        aVar.g(oVar2, 0, oVar.b - i10, 0.0f);
                    } else {
                        if (i9 != 4) {
                            w511.b();
                            return null;
                        }
                        aVar.g(oVar2, 0, 0, 0.0f);
                        aVar.g(oVar, f != null ? m810.b(f.floatValue() - (oVar.a / 2)) : (i12 / 2) - (oVar.a / 2), oVar2.b - i10, 0.0f);
                    }
                } else {
                    aVar.g(oVar2, 0, 0, 0.0f);
                    aVar.g(oVar, oVar2.a - i10, (i11 / 2) - (oVar.b / 2), 0.0f);
                }
                return zy11.a;
            }
        });
    }
}
