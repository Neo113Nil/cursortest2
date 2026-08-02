package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import ru.yandex.taxi.logistics.photocomment.a;
import ru.yandex.taxi.logistics.photocomment.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class wii implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;
    public final /* synthetic */ ArrayList c;

    public /* synthetic */ wii(b bVar, ArrayList arrayList, int i) {
        this.a = i;
        this.b = bVar;
        this.c = arrayList;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ArrayList<hkb0> arrayList = this.c;
        b bVar = this.b;
        switch (i) {
            case 0:
                bVar.b.a(arrayList.size(), "retry");
                for (hkb0 hkb0Var : arrayList) {
                    okb0 okb0Var = hkb0Var.b;
                    erv ervVar = okb0Var instanceof erv ? (erv) okb0Var : null;
                    if (ervVar == null) {
                        break;
                    } else {
                        int i2 = ervVar.a;
                        a aVar = bVar.g;
                        String str = hkb0Var.a;
                        File a = aVar.d.a(str);
                        FileInputStream fileInputStream = !a.exists() ? null : new FileInputStream(a);
                        if (fileInputStream != null) {
                            aVar.a.b(new ikb0(str, aVar.d.b(str), 0, 0), new erv(i2));
                            aVar.b(str, fileInputStream, i2);
                        }
                    }
                }
                break;
            default:
                bVar.b.a(arrayList.size(), "continue");
                for (hkb0 hkb0Var2 : arrayList) {
                    okb0 okb0Var2 = hkb0Var2.b;
                    erv ervVar2 = okb0Var2 instanceof erv ? (erv) okb0Var2 : null;
                    if (ervVar2 == null) {
                        break;
                    } else {
                        bVar.g.c(ervVar2.a, hkb0Var2.a);
                    }
                }
                break;
        }
        return zy11Var;
    }
}
