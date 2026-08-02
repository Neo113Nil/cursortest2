package defpackage;

import android.content.Context;
import com.yandex.plus.core.config.Environment;
import com.yandex.plus.metrica.utils.e;
import kotlin.a;

/* loaded from: classes8.dex */
public abstract class y75 {
    public final Context a;
    public final i3y b;
    public final i3y c;

    public y75(Context context, final oa20 oa20Var, final String str, final String str2, final String str3, final String str4, final Environment environment, final sls slsVar, final sls slsVar2) {
        this.a = context.getApplicationContext();
        this.b = a.a(new ou(8, oa20Var, this));
        this.c = a.a(new sls() { // from class: w75
            @Override // defpackage.sls
            public final Object invoke() {
                return new e(y75.this.a, oa20Var, str, str2, str3, str4, environment, slsVar, slsVar2);
            }
        });
    }

    public final e a() {
        return (e) this.c.getValue();
    }
}
