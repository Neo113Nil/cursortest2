package defpackage;

import android.content.SharedPreferences;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes3.dex */
public final class agd {
    public final zzp a;
    public final arf c;
    public final imp b = new imp();
    public final x0q d = y0q.b(0, 1, oi3.b, 1);

    public agd(zzp zzpVar, aub aubVar) {
        this.a = zzpVar;
        this.c = (arf) aubVar.invoke("GLAGOL_PREFERENCES");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0087 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002d A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List a() {
        List split$default;
        fgd fgdVar;
        JsonObject n0;
        String string = b().getString("USER_SMART_HOME_RESPONSE", null);
        if (string == null) {
            return null;
        }
        if (StringsKt.U(string)) {
            return c5b.a;
        }
        split$default = StringsKt__StringsKt.split$default(string, new String[]{"|||"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        Iterator it = split$default.iterator();
        while (it.hasNext()) {
            try {
                n0 = cxb.n0((String) it.next());
            } catch (IOException unused) {
            }
            if (n0 != null) {
                JsonElement v = n0.v("userId");
                v.getClass();
                String I = cxb.I(v);
                JsonElement v2 = n0.v("deviceId");
                v2.getClass();
                String I2 = cxb.I(v2);
                JsonElement v3 = n0.v("name");
                v3.getClass();
                String I3 = cxb.I(v3);
                JsonElement v4 = n0.v("platform");
                v4.getClass();
                String I4 = cxb.I(v4);
                if (I != null && I2 != null && I3 != null && I4 != null) {
                    fgdVar = new fgd(I, I2, I3, I4);
                    if (fgdVar == null) {
                        arrayList.add(fgdVar);
                    }
                }
            }
            fgdVar = null;
            if (fgdVar == null) {
            }
        }
        return arrayList;
    }

    public final SharedPreferences b() {
        return (SharedPreferences) this.c.getValue();
    }
}
