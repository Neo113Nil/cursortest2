package defpackage;

import android.content.Context;
import android.content.Intent;
import java.util.Arrays;
import java.util.HashSet;
import java.util.regex.Pattern;

/* loaded from: classes6.dex */
public final class bga extends wjq {
    @Override // defpackage.wjq, defpackage.ndq
    public final pjc b(Context context) {
        context.getClass();
        l18 l18Var = l18.b;
        bdt I = hag.I(uaa.class);
        qdc qdcVar = l18Var.a;
        qdcVar.getClass();
        return new u21(10, super.b(context), zsd.b0(new bca(((e6q) ((uaa) qdcVar.C(I))).e, 6)), new ib3(3, 3, null));
    }

    @Override // defpackage.ndq
    public final Intent c(Context context) {
        context.getClass();
        Pattern pattern = u15.j;
        b30 b30Var = new b30(u15.j, new p20(5));
        ogp ogpVar = s15.b;
        return new Intent("android.intent.action.VIEW", ((u15) b30Var.a(String.format("yandexmusic://mymusic/%s", Arrays.copyOf(new Object[]{"cached_tracks"}, 1)), true)).m());
    }

    @Override // defpackage.wjq
    public final HashSet d() {
        return wjq.f;
    }
}
