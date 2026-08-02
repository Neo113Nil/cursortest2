package defpackage;

import android.webkit.WebView;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import org.json.JSONObject;
import ru.yandex.common.clid.ClidProvider;
import yads.ku3;

/* loaded from: classes7.dex */
public final class sn71 implements jh71 {
    public static final sn71 e = new sn71(new ku3());
    public Date a;
    public boolean b;
    public final ku3 c;
    public boolean d;

    public sn71(ku3 ku3Var) {
        this.c = ku3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jh71
    public final void a(boolean z) {
        if (!this.d && z) {
            Date date = new Date();
            Date date2 = this.a;
            if (date2 == null || date.after(date2)) {
                this.a = date;
                if (this.b) {
                    Iterator it = Collections.unmodifiableCollection(kb71.c.b).iterator();
                    while (it.hasNext()) {
                        o971 o971Var = ((j681) it.next()).e;
                        Date date3 = this.a;
                        Date date4 = date3 != null ? (Date) date3.clone() : null;
                        o971Var.getClass();
                        if (date4 != null) {
                            JSONObject jSONObject = new JSONObject();
                            y471.c(jSONObject, ClidProvider.TIMESTAMP, Long.valueOf(date4.getTime()));
                            vj61.a.b((WebView) o971Var.b.get(), "setLastActivity", jSONObject);
                        }
                    }
                }
            }
        }
        this.d = z;
    }
}
