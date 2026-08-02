package defpackage;

import android.content.Context;
import com.yandex.fintechsdk.entities.environment.DefaultEnvironment;
import com.yandex.fintechsdk.entities.region.Region;
import java.util.Map;

/* loaded from: classes12.dex */
public final class z370 implements jg5 {
    public final hk3 a;
    public final hsb b;
    public final fke c;
    public final DefaultEnvironment w;
    public final dn90 x;
    public final Region y;

    public z370(hk3 hk3Var, hsb hsbVar, fke fkeVar, DefaultEnvironment defaultEnvironment, dn90 dn90Var, Region region) {
        this.a = hk3Var;
        this.b = hsbVar;
        this.c = fkeVar;
        this.w = defaultEnvironment;
        this.x = dn90Var;
        this.y = region;
    }

    @Override // defpackage.jg5
    public final void y(ig5 ig5Var, jh5 jh5Var) {
        Context context;
        if (ig5Var instanceof y370) {
            y370 y370Var = (y370) ig5Var;
            Map map = y370Var.a;
            String str = null;
            boolean l = jl40.l(map != null ? (String) map.get("with_passport_auth") : null, "true");
            String str2 = y370Var.b;
            if (l) {
                xk3 xk3Var = (xk3) this.a.c.a.getValue();
                if ((xk3Var instanceof qk3) && (context = (Context) this.c.a()) != null) {
                    dn90 dn90Var = this.x;
                    if (dn90Var != null) {
                        str = ((hn90) dn90Var).b(context, y370Var.b, ((qk3) xk3Var).a.b, this.y.getKey(), this.w == DefaultEnvironment.TESTING);
                    }
                    if (str != null) {
                        str2 = str;
                    }
                }
            }
            this.b.a.d(str2);
        }
    }
}
