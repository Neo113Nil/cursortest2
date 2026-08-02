package defpackage;

import com.ybsdk.widgets.common.MoneyInputEditView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.LicenseUtility;

/* loaded from: classes12.dex */
public abstract class ug21 {
    public static final ArrayList a;
    public static final Set b;

    static {
        List g = scc.g(Character.valueOf(LicenseUtility.SEPARATOR), '.', '_', '~');
        ArrayList arrayList = new ArrayList(tcc.n(g, 10));
        Iterator it = g.iterator();
        while (it.hasNext()) {
            arrayList.add(Byte.valueOf((byte) ((Character) it.next()).charValue()));
        }
        a = arrayList;
        ArrayList m0 = a.m0(new dj9(MoneyInputEditView.DEFAULT_VALUE, '9'), a.l0(new dj9('a', 'z'), new dj9('A', 'Z')));
        ArrayList arrayList2 = new ArrayList(tcc.n(m0, 10));
        Iterator it2 = m0.iterator();
        while (it2.hasNext()) {
            arrayList2.add(Byte.valueOf((byte) ((Character) it2.next()).charValue()));
        }
        b = a.N0(arrayList2);
    }
}
