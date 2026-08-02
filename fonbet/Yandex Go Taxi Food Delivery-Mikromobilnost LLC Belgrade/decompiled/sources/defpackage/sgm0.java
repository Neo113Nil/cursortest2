package defpackage;

import android.content.SharedPreferences;
import com.yandex.payment.common.sbp.SbpOperation;
import com.yandex.payment.sdk.ui.payment.sbp.d;

/* loaded from: classes2.dex */
public final class sgm0 implements hs31 {
    public final vv90 a;
    public final pim0 b;
    public final String c;
    public final SbpOperation w;
    public final SharedPreferences x;
    public final String y;
    public final rwo z;

    public sgm0(vv90 vv90Var, oy90 oy90Var, String str, SbpOperation sbpOperation, SharedPreferences sharedPreferences, String str2, rwo rwoVar) {
        this.a = vv90Var;
        this.b = oy90Var;
        this.c = str;
        this.w = sbpOperation;
        this.x = sharedPreferences;
        this.y = str2;
        this.z = rwoVar;
    }

    @Override // defpackage.hs31
    public final yr31 create(Class cls) {
        if (!cls.equals(d.class)) {
            ny61.r("Unknown view model");
            return null;
        }
        return new d(this.a, this.b, this.c, this.w, this.x, this.y, this.z);
    }
}
