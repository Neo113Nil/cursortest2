package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;

/* loaded from: classes8.dex */
public final class u0y0 implements z320 {
    public final y72 a;
    public final vq70 b;

    public u0y0(y72 y72Var, vq70 vq70Var) {
        this.a = y72Var;
        this.b = vq70Var;
    }

    @Override // defpackage.z320
    public final PendingIntent a(Context context, String str) {
        Intent action = new Intent(context, (Class<?>) this.a.a(AndroidComponentRepository$Component.MAIN_ACTIVITY)).addFlags(SelfTester_JCP.IMITA).setAction("android.intent.action.VIEW");
        xq70 xq70Var = (xq70) this.b;
        i0y0 i0y0Var = new i0y0(str, xq70Var.d(), false);
        ((pux0) xq70Var.a).getClass();
        return PendingIntent.getActivity(context, 0, action.setData(xq70.a(i0y0Var, pux0.c)), 201326592);
    }
}
