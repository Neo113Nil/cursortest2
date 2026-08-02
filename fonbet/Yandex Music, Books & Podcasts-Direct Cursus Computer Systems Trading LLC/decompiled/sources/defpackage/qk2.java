package defpackage;

import android.content.Context;
import ru.yandex.video.m3.player.utils.network.NetworkType;

/* loaded from: classes6.dex */
public final class qk2 implements xk2, lzi {
    public final l2j a;
    public final sk2 b;
    public String c;

    public qk2(Context context) {
        context.getClass();
        l2j s = l2j.d.s(context);
        sk2 Z = sk2.b.Z(context);
        this.a = s;
        this.b = Z;
        this.c = s.c(context).getNetworkTypeName();
    }

    @Override // defpackage.lzi
    public final void a(NetworkType networkType) {
        networkType.getClass();
        this.c = networkType.getNetworkTypeName();
    }

    @Override // defpackage.xk2
    public final void c(int i, long j, long j2) {
        String str = this.c;
        sk2 sk2Var = this.b;
        sk2Var.getClass();
        str.getClass();
        sk2Var.a.edit().putLong(str, j2).apply();
    }
}
