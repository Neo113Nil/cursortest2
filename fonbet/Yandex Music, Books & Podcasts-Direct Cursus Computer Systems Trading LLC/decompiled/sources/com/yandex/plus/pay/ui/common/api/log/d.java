package com.yandex.plus.pay.ui.common.api.log;

import androidx.fragment.app.o;
import androidx.fragment.app.y;
import defpackage.euc;
import ru.kinopoisk.sdk.easylogin.internal.C1309z4;

/* loaded from: classes5.dex */
public final /* synthetic */ class d implements euc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ d(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.euc
    public final void a(y yVar, o oVar) {
        switch (this.a) {
            case 0:
                c cVar = (c) this.b;
                yVar.getClass();
                oVar.getLifecycle().a(cVar);
                break;
            default:
                C1309z4._init_$lambda$0((C1309z4) this.b, yVar, oVar);
                break;
        }
    }
}
