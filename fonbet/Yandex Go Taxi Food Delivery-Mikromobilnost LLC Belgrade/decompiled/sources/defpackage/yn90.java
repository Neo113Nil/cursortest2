package defpackage;

import android.content.Context;
import android.content.Intent;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.passport.internal.a0;

/* loaded from: classes15.dex */
public final class yn90 extends x40 {
    public final /* synthetic */ int a;
    public final DefaultEnvironment b;
    public final dn90 c;

    public /* synthetic */ yn90(DefaultEnvironment defaultEnvironment, dn90 dn90Var, int i) {
        this.a = i;
        this.b = defaultEnvironment;
        this.c = dn90Var;
    }

    @Override // defpackage.x40
    public final Intent a(Context context, Object obj) {
        int i = this.a;
        DefaultEnvironment defaultEnvironment = this.b;
        dn90 dn90Var = this.c;
        switch (i) {
            case 0:
                return ((hn90) dn90Var).a(context, defaultEnvironment == DefaultEnvironment.TESTING);
            default:
                return ((hn90) dn90Var).a(context, defaultEnvironment == DefaultEnvironment.TESTING);
        }
    }

    @Override // defpackage.x40
    public final Object c(int i, Intent intent) {
        int i2 = this.a;
        dn90 dn90Var = this.c;
        switch (i2) {
            case 0:
                if (intent != null && i == -1) {
                    ((hn90) dn90Var).getClass();
                    break;
                }
                break;
            default:
                if (intent != null && i == -1) {
                    ((hn90) dn90Var).getClass();
                    break;
                }
                break;
        }
        return Long.valueOf(a0.e(intent.getExtras()).a.getValue());
    }
}
