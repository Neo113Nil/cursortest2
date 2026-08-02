package defpackage;

import android.content.Context;
import android.os.Looper;
import com.yandex.messenger.websdk.api.MessengerParams;
import com.yandex.messenger.websdk.api.SupportInfoProvider;

/* loaded from: classes3.dex */
public final class k0i {
    public final vbv a;

    public k0i(vbv vbvVar) {
        this.a = vbvVar;
    }

    public final fi4 a() {
        vbv vbvVar = this.a;
        Context context = vbvVar.a;
        ote oteVar = (ote) vbvVar.p.getValue();
        Object value = this.a.n.getValue();
        value.getClass();
        Looper looper = (Looper) value;
        h02 h02Var = (h02) this.a.k.getValue();
        hfj hfjVar = (hfj) this.a.m.getValue();
        vbv vbvVar2 = this.a;
        SupportInfoProvider supportInfoProvider = vbvVar2.c;
        qdc qdcVar = vbvVar2.r;
        MessengerParams messengerParams = vbvVar2.g;
        vbv vbvVar3 = this.a;
        return new fi4(vbvVar, context, oteVar, h02Var, hfjVar, supportInfoProvider, looper, qdcVar, messengerParams, vbvVar3.e, vbvVar3.s, (o0j) this.a.C.getValue(), (imf) vbvVar3.u.getValue(), (pgv) this.a.B.getValue(), (hu1) this.a.y.getValue(), (kue) this.a.z.getValue(), this.a.f);
    }
}
