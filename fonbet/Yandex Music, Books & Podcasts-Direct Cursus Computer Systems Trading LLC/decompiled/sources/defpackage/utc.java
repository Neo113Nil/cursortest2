package defpackage;

import android.os.Bundle;
import android.util.Log;
import androidx.fragment.app.y;
import java.util.Map;

/* loaded from: classes.dex */
public final class utc implements uyf {
    public final /* synthetic */ String a;
    public final /* synthetic */ fuc b;
    public final /* synthetic */ nyf c;
    public final /* synthetic */ y d;

    public utc(y yVar, String str, fuc fucVar, nyf nyfVar) {
        this.d = yVar;
        this.a = str;
        this.b = fucVar;
        this.c = nyfVar;
    }

    @Override // defpackage.uyf
    public final void Q(dzf dzfVar, kyf kyfVar) {
        Bundle bundle;
        y yVar = this.d;
        Map map = yVar.m;
        kyf kyfVar2 = kyf.ON_START;
        String str = this.a;
        if (kyfVar == kyfVar2 && (bundle = (Bundle) map.get(str)) != null) {
            this.b.k(bundle, str);
            map.remove(str);
            if (y.M(2)) {
                Log.v("FragmentManager", "Clearing fragment result with key ".concat(str));
            }
        }
        if (kyfVar == kyf.ON_DESTROY) {
            this.c.d(this);
            yVar.n.remove(str);
        }
    }
}
