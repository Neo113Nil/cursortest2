package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.util.ArrayList;
import kotlin.collections.a;
import kotlin.random.Random;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tzq0 {
    public static String a(String str) {
        String concat = str != null ? str.concat(Extension.DOT_CHAR) : "";
        ArrayList m0 = a.m0(new dj9(MoneyInputEditView.DEFAULT_VALUE, '9'), a.l0(new dj9('a', 'z'), new dj9('A', 'Z')));
        d6w d6wVar = new d6w(1, 8, 1);
        ArrayList arrayList = new ArrayList(tcc.n(d6wVar, 10));
        c6w it = d6wVar.iterator();
        while (it.c) {
            it.nextInt();
            Character ch = (Character) a.p0(m0, Random.a);
            ch.getClass();
            arrayList.add(ch);
        }
        return concat + a.X(arrayList, "", null, null, null, 62) + Extension.DOT_CHAR + System.currentTimeMillis();
    }
}
