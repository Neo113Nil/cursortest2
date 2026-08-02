package defpackage;

import android.view.MenuItem;
import io.appmetrica.analytics.impl.C0633sd;
import io.appmetrica.analytics.locationapi.internal.LocationControllerObserver;
import java.util.HashMap;
import kotlin.Pair;
import ru.yandex.music.utils.Assertions;

/* loaded from: classes4.dex */
public final /* synthetic */ class o37 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o37(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                d47 d47Var = (d47) this.c;
                t37 t37Var = (t37) this.d;
                d47Var.getClass();
                for (Pair pair : ((w37) d47Var).a.b) {
                    String str = (String) pair.a;
                    String str2 = (String) pair.b;
                    gc8 gc8Var = t37Var.k;
                    if (gc8Var != null) {
                        gc8Var.N(str, str2);
                    }
                }
                gc8 gc8Var2 = t37Var.k;
                if (gc8Var2 != null) {
                    gc8Var2.N("isLightTheme", String.valueOf(this.b));
                    break;
                }
                break;
            case 1:
                lum lumVar = (lum) this.c;
                h6w h6wVar = (h6w) this.d;
                Object obj = ((HashMap) lumVar.a).get(h6wVar);
                Assertions.assertNonNull(obj, "setVisible(): view is null for item " + h6wVar);
                if (obj != null) {
                    ((MenuItem) obj).setVisible(this.b);
                    break;
                }
                break;
            default:
                C0633sd.a((C0633sd) this.c, (LocationControllerObserver) this.d, this.b);
                break;
        }
    }
}
