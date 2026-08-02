package defpackage;

import com.yandex.go.shortcuts.dto.request.ProductsParam;
import com.yandex.go.shortcuts.dto.response.ShortcutIconSize;
import com.yandex.go.shortcuts.dto.response.ShortcutTitleSize;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes13.dex */
public final class tlw0 {
    public final j2s0 a;
    public final i3y b;
    public final i3y c;
    public final i3y d;

    public tlw0(j2s0 j2s0Var) {
        this.a = j2s0Var;
        final int i = 0;
        this.b = a.a(new sls(this) { // from class: rlw0
            public final /* synthetic */ tlw0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ShortcutTitleSize shortcutTitleSize;
                int i2 = i;
                tlw0 tlw0Var = this.b;
                switch (i2) {
                    case 0:
                        j2s0 j2s0Var2 = tlw0Var.a;
                        int i3 = j2s0Var2.a.getResources().getDisplayMetrics().widthPixels;
                        long a = j2s0.a(j2s0Var2, 6);
                        return new ProductsParam.SupportedGrid(((i3 - (((int) (a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * 2)) - (((int) (a >> 32)) * 5)) / 6);
                    case 1:
                        j2s0 j2s0Var3 = tlw0Var.a;
                        return j2s0Var3.a.getResources().getDisplayMetrics().widthPixels - (j2s0Var3.f * 6) >= (j2s0Var3.c * 5) + (j2s0Var3.e * 2) ? scc.g(ShortcutIconSize.MEDIUM, ShortcutIconSize.BIG) : Collections.singletonList(ShortcutIconSize.MEDIUM);
                    default:
                        List list = (List) tlw0Var.c.getValue();
                        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            int i4 = slw0.a[((ShortcutIconSize) it.next()).ordinal()];
                            if (i4 == 1) {
                                shortcutTitleSize = ShortcutTitleSize.REGULAR;
                            } else {
                                if (i4 != 2) {
                                    w511.b();
                                    return null;
                                }
                                shortcutTitleSize = ShortcutTitleSize.EXTENDED;
                            }
                            arrayList.add(shortcutTitleSize);
                        }
                        return arrayList;
                }
            }
        });
        final int i2 = 1;
        this.c = a.a(new sls(this) { // from class: rlw0
            public final /* synthetic */ tlw0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ShortcutTitleSize shortcutTitleSize;
                int i22 = i2;
                tlw0 tlw0Var = this.b;
                switch (i22) {
                    case 0:
                        j2s0 j2s0Var2 = tlw0Var.a;
                        int i3 = j2s0Var2.a.getResources().getDisplayMetrics().widthPixels;
                        long a = j2s0.a(j2s0Var2, 6);
                        return new ProductsParam.SupportedGrid(((i3 - (((int) (a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * 2)) - (((int) (a >> 32)) * 5)) / 6);
                    case 1:
                        j2s0 j2s0Var3 = tlw0Var.a;
                        return j2s0Var3.a.getResources().getDisplayMetrics().widthPixels - (j2s0Var3.f * 6) >= (j2s0Var3.c * 5) + (j2s0Var3.e * 2) ? scc.g(ShortcutIconSize.MEDIUM, ShortcutIconSize.BIG) : Collections.singletonList(ShortcutIconSize.MEDIUM);
                    default:
                        List list = (List) tlw0Var.c.getValue();
                        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            int i4 = slw0.a[((ShortcutIconSize) it.next()).ordinal()];
                            if (i4 == 1) {
                                shortcutTitleSize = ShortcutTitleSize.REGULAR;
                            } else {
                                if (i4 != 2) {
                                    w511.b();
                                    return null;
                                }
                                shortcutTitleSize = ShortcutTitleSize.EXTENDED;
                            }
                            arrayList.add(shortcutTitleSize);
                        }
                        return arrayList;
                }
            }
        });
        final int i3 = 2;
        this.d = a.a(new sls(this) { // from class: rlw0
            public final /* synthetic */ tlw0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                ShortcutTitleSize shortcutTitleSize;
                int i22 = i3;
                tlw0 tlw0Var = this.b;
                switch (i22) {
                    case 0:
                        j2s0 j2s0Var2 = tlw0Var.a;
                        int i32 = j2s0Var2.a.getResources().getDisplayMetrics().widthPixels;
                        long a = j2s0.a(j2s0Var2, 6);
                        return new ProductsParam.SupportedGrid(((i32 - (((int) (a & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * 2)) - (((int) (a >> 32)) * 5)) / 6);
                    case 1:
                        j2s0 j2s0Var3 = tlw0Var.a;
                        return j2s0Var3.a.getResources().getDisplayMetrics().widthPixels - (j2s0Var3.f * 6) >= (j2s0Var3.c * 5) + (j2s0Var3.e * 2) ? scc.g(ShortcutIconSize.MEDIUM, ShortcutIconSize.BIG) : Collections.singletonList(ShortcutIconSize.MEDIUM);
                    default:
                        List list = (List) tlw0Var.c.getValue();
                        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            int i4 = slw0.a[((ShortcutIconSize) it.next()).ordinal()];
                            if (i4 == 1) {
                                shortcutTitleSize = ShortcutTitleSize.REGULAR;
                            } else {
                                if (i4 != 2) {
                                    w511.b();
                                    return null;
                                }
                                shortcutTitleSize = ShortcutTitleSize.EXTENDED;
                            }
                            arrayList.add(shortcutTitleSize);
                        }
                        return arrayList;
                }
            }
        });
    }
}
