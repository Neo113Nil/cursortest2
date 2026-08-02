package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.Arrays;
import java.util.HashSet;

/* loaded from: classes5.dex */
public final class bwi extends wjq {
    @Override // defpackage.ndq
    public final Intent c(Context context) {
        context.getClass();
        hwk hwkVar = hwk.YANDEXMUSIC;
        Uri m = ((iwk) new b30(hwkVar).a(String.format(hwkVar.b, Arrays.copyOf(new Object[]{"last"}, 1)), true)).m();
        m.getClass();
        return new Intent("android.intent.action.VIEW", m);
    }

    @Override // defpackage.wjq
    public final HashSet d() {
        return wjq.e;
    }
}
