package defpackage;

import android.net.Uri;
import com.yandex.go.taxi.order.domain.repositories.e0;
import java.util.HashMap;
import java.util.Map;
import ru.yandex.taxi.startup.launch.h;

/* loaded from: classes6.dex */
public final class xu41 {
    public final String a;
    public final HashMap b = new HashMap();
    public final /* synthetic */ yu41 c;

    public xu41(yu41 yu41Var, String str) {
        this.c = yu41Var;
        this.a = str;
    }

    public final Uri.Builder a() {
        Uri.Builder buildUpon = Uri.parse(this.a).buildUpon();
        for (Map.Entry entry : this.b.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return buildUpon;
    }

    public final void b() {
        String Hg = ((h) this.c.a).Hg();
        if (Hg == null || Hg.length() == 0) {
            return;
        }
        this.b.put("id", Hg);
    }

    public final void c(String str) {
        o2y0 z = ((e0) this.c.b).z();
        if (z == null || !z.e()) {
            return;
        }
        this.b.put(str, z.b().a);
    }
}
