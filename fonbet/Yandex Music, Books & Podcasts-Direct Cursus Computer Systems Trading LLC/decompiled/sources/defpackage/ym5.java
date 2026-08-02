package defpackage;

import android.os.Bundle;
import androidx.fragment.app.y;
import com.yandex.plus.pay.ui.core.tarifficator.api.data.common.a;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes.dex */
public final /* synthetic */ class ym5 implements too {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ym5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.too
    public final Bundle a() {
        Pair[] pairArr;
        switch (this.a) {
            case 0:
                return hn5.f((hn5) this.b);
            case 1:
                Map d = ((loo) this.b).d();
                Bundle bundle = new Bundle();
                for (Map.Entry entry : d.entrySet()) {
                    String str = (String) entry.getKey();
                    List list = (List) entry.getValue();
                    bundle.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle;
            case 2:
                return ((y) this.b).b0();
            case 3:
                tao taoVar = (tao) this.b;
                for (Map.Entry entry2 : uah.o((LinkedHashMap) taoVar.d).entrySet()) {
                    taoVar.l(((xdr) ((bqi) entry2.getValue())).getValue(), (String) entry2.getKey());
                }
                for (Map.Entry entry3 : uah.o((LinkedHashMap) taoVar.b).entrySet()) {
                    taoVar.l(((too) entry3.getValue()).a(), (String) entry3.getKey());
                }
                LinkedHashMap linkedHashMap = (LinkedHashMap) taoVar.a;
                if (linkedHashMap.isEmpty()) {
                    pairArr = new Pair[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry4 : linkedHashMap.entrySet()) {
                        arrayList.add(new Pair((String) entry4.getKey(), entry4.getValue()));
                    }
                    pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
                }
                return cxb.K((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
            default:
                a a = ((c) this.b).k.a.a();
                return cxb.K(new Pair("CURRENT_PURCHASE", a.b), new Pair("PURCHASES_HISTORY", a.c));
        }
    }
}
