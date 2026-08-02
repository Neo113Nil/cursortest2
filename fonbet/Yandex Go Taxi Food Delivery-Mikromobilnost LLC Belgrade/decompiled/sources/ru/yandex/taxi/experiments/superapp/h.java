package ru.yandex.taxi.experiments.superapp;

import android.os.SystemClock;
import com.yandex.go.navigation.screen.api.Screen;
import defpackage.eaf0;
import defpackage.hbp0;
import defpackage.j3s0;
import defpackage.qaf0;
import defpackage.tje;
import defpackage.uaf0;
import defpackage.vpr;
import defpackage.yaf0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class h implements vpr {
    public final /* synthetic */ i a;

    public h(i iVar) {
        this.a = iVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        j3s0 j3s0Var = (j3s0) obj;
        i iVar = this.a;
        iVar.getClass();
        Screen screen = j3s0Var.a;
        if (screen == Screen.ORDERS_LIST || screen == Screen.ORDER) {
            a aVar = iVar.c;
            aVar.e = false;
            aVar.d.b();
            iVar.h = new j3s0(j3s0Var.a, j3s0Var.b, SystemClock.uptimeMillis(), j3s0Var.d);
            iVar.e.b();
            a aVar2 = iVar.c;
            uaf0 uaf0Var = yaf0.c;
            eaf0 eaf0Var = j3s0Var.d;
            hbp0 hbp0Var = aVar2.d;
            if (!aVar2.e) {
                aVar2.e = true;
                hbp0Var.a();
                tje.N(hbp0Var.c(), null, null, new EatsOrderBasedProductFetcher$start$1(aVar2, uaf0Var, eaf0Var, null), 3);
            }
        } else {
            a aVar3 = iVar.c;
            aVar3.e = false;
            aVar3.d.b();
            iVar.e.f.b();
            iVar.d.b(new qaf0(yaf0.c, iVar.hashCode()), false);
        }
        return zy11.a;
    }
}
