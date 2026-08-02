package defpackage;

import android.content.Intent;
import dev.fluttercommunity.plus.share.SharePlusPendingIntent;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes11.dex */
public final class zlr0 implements nzc0 {
    public ba20 a;
    public AtomicBoolean b;

    @Override // defpackage.nzc0
    public final boolean onActivityResult(int i, int i2, Intent intent) {
        String str;
        ba20 ba20Var;
        if (i != 22643) {
            return false;
        }
        SharePlusPendingIntent.Companion.getClass();
        str = SharePlusPendingIntent.result;
        if (this.b.compareAndSet(false, true) && (ba20Var = this.a) != null) {
            ba20Var.success(str);
            this.a = null;
        }
        return true;
    }
}
