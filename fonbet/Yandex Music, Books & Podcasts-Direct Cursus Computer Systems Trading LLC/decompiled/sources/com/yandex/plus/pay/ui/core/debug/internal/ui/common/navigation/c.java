package com.yandex.plus.pay.ui.core.debug.internal.ui.common.navigation;

import androidx.fragment.app.i;
import androidx.fragment.app.o;
import androidx.fragment.app.y;
import defpackage.bj2;
import defpackage.fmq;
import defpackage.js6;
import defpackage.ob5;
import defpackage.oi2;
import defpackage.otc;
import defpackage.pxi;
import defpackage.wyn;
import java.util.ArrayList;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final class c implements pxi {
    public final i a;
    public final y b;
    public final ArrayList c;

    public c(i iVar, y yVar) {
        yVar.getClass();
        this.a = iVar;
        this.b = yVar;
        this.c = new ArrayList();
    }

    @Override // defpackage.pxi
    public final void a(ob5[] ob5VarArr) {
        ob5VarArr.getClass();
        y yVar = this.b;
        yVar.z(true);
        yVar.E();
        ArrayList arrayList = this.c;
        arrayList.clear();
        int H = yVar.H();
        for (int i = 0; i < H; i++) {
            String str = yVar.G(i).k;
            if (str == null) {
                str = "";
            }
            arrayList.add(str);
        }
        for (ob5 ob5Var : ob5VarArr) {
            if (ob5Var instanceof wyn) {
                fmq fmqVar = ((wyn) ob5Var).a;
                if (arrayList.isEmpty()) {
                    b(fmqVar, false);
                } else {
                    yVar.T();
                    arrayList.remove(arrayList.size() - 1);
                    b(fmqVar, true);
                }
            } else {
                boolean z = ob5Var instanceof bj2;
                i iVar = this.a;
                if (z) {
                    iVar.dismiss();
                } else if (ob5Var instanceof oi2) {
                    if (arrayList.isEmpty()) {
                        iVar.dismiss();
                    } else {
                        yVar.T();
                        arrayList.remove(arrayList.size() - 1);
                    }
                }
            }
        }
    }

    public final void b(fmq fmqVar, boolean z) {
        y yVar = this.b;
        otc J = yVar.J();
        J.getClass();
        o oVar = (o) ((js6) fmqVar.d).h(J);
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(yVar);
        aVar.r = true;
        aVar.g(R.anim.pay_sdk_slide_in_top, R.anim.pay_sdk_slide_out_top, 0, 0);
        boolean z2 = fmqVar.b;
        String str = (String) fmqVar.c;
        if (z2) {
            aVar.e(R.id.debug_fragment_container, oVar, str);
        } else {
            aVar.d(R.id.debug_fragment_container, oVar, str, 1);
        }
        if (z) {
            aVar.c(str);
            this.c.add(str);
        }
        aVar.j();
    }
}
