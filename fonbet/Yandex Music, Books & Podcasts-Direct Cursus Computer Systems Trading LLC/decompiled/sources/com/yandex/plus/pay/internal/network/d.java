package com.yandex.plus.pay.internal.network;

import android.content.Context;
import com.yandex.passport.internal.push.x0;
import com.yandex.plus.pay.api.model.SimOperatorInfo;
import defpackage.btf;
import defpackage.jyr;

/* loaded from: classes5.dex */
public final class d {
    public final jyr a;

    public d(int i) {
        switch (i) {
            case 2:
                this.a = btf.b(new com.yandex.plus.paymentsdk.api.d(6));
                break;
            default:
                this.a = btf.b(new com.yandex.plus.paymentsdk.api.d(5));
                break;
        }
    }

    public SimOperatorInfo a() {
        jyr jyrVar = this.a;
        e eVar = (e) jyrVar.getValue();
        String str = eVar != null ? eVar.a : null;
        if (str == null) {
            str = "";
        }
        e eVar2 = (e) jyrVar.getValue();
        String str2 = eVar2 != null ? eVar2.b : null;
        return new SimOperatorInfo(str, str2 != null ? str2 : "");
    }

    public d(Context context) {
        context.getClass();
        this.a = btf.b(new x0(context, 5));
    }
}
