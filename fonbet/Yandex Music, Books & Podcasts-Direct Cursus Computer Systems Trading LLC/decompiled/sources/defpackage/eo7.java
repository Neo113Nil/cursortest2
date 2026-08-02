package defpackage;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;

/* loaded from: classes3.dex */
public final class eo7 implements iqg {
    public final LinkedHashMap a;

    public eo7(gqg gqgVar) {
        List list = gqgVar.a;
        int a = tah.a(v75.o(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(a < 16 ? 16 : a);
        for (Object obj : list) {
            linkedHashMap.put(((gtr) obj).a, obj);
        }
        this.a = linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        if (defpackage.gtr.e.contains(r3) != false) goto L10;
     */
    @Override // defpackage.iqg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a(Context context) {
        Locale locale = context.getResources().getConfiguration().getLocales().get(0);
        locale.getClass();
        String language = locale.getLanguage();
        LinkedHashMap linkedHashMap = this.a;
        gtr gtrVar = (gtr) linkedHashMap.get(language);
        if (gtrVar == null) {
            language.getClass();
            gtrVar = gtr.RUSSIAN;
            if (linkedHashMap.containsValue(gtrVar)) {
                gtr.b.getClass();
            }
            gtr.b.getClass();
            gtrVar = gtr.d;
        }
        return gtrVar.a;
    }
}
