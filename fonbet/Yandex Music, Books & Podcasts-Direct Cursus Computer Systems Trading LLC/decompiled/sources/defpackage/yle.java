package defpackage;

import android.content.Context;
import ru.yandex.video.m3.player.utils.network.NetworkType;

/* loaded from: classes6.dex */
public final class yle implements zle {
    public final zle a = ame.a;

    @Override // defpackage.zle
    public final long a(Context context, NetworkType networkType, String str) {
        context.getClass();
        networkType.getClass();
        str.getClass();
        sk2 Z = sk2.b.Z(context);
        String networkTypeName = networkType.getNetworkTypeName();
        networkTypeName.getClass();
        long j = Z.a.getLong(networkTypeName, -1L);
        Long valueOf = j == -1 ? null : Long.valueOf(j);
        return valueOf != null ? valueOf.longValue() : this.a.a(context, networkType, str);
    }
}
