package d;

import android.os.Bundle;
import bc.a0;
import bd.e0;
import com.onesignal.inAppMessages.internal.display.impl.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.fortheloss.st.MainActivity;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements e4.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1495b;

    public /* synthetic */ i(int i10, Object obj) {
        this.f1494a = i10;
        this.f1495b = obj;
    }

    @Override // e4.d
    public final Bundle a() {
        ac.i[] iVarArr;
        switch (this.f1494a) {
            case 0:
                MainActivity mainActivity = (MainActivity) this.f1495b;
                Bundle bundle = new Bundle();
                n nVar = mainActivity.f1517n;
                nVar.getClass();
                LinkedHashMap linkedHashMap = nVar.f1503b;
                bundle.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList<>(linkedHashMap.values()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList<>(linkedHashMap.keySet()));
                bundle.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList<>(nVar.f1505d));
                bundle.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(nVar.f1508g));
                return bundle;
            case a.b.DRAGGABLE_DIRECTION_DOWN /* 1 */:
                d8.t tVar = (d8.t) this.f1495b;
                for (Map.Entry entry : bc.z.R((LinkedHashMap) tVar.f1819d).entrySet()) {
                    tVar.n(((e0) ((bd.p) entry.getValue())).getValue(), (String) entry.getKey());
                }
                for (Map.Entry entry2 : bc.z.R((LinkedHashMap) tVar.f1817b).entrySet()) {
                    tVar.n(((e4.d) entry2.getValue()).a(), (String) entry2.getKey());
                }
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) tVar.f1816a;
                if (linkedHashMap2.isEmpty()) {
                    iVarArr = new ac.i[0];
                } else {
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
                        arrayList.add(new ac.i((String) entry3.getKey(), entry3.getValue()));
                    }
                    iVarArr = (ac.i[]) arrayList.toArray(new ac.i[0]);
                }
                return a0.e((ac.i[]) Arrays.copyOf(iVarArr, iVarArr.length));
            default:
                Map d10 = ((v0.f) this.f1495b).d();
                Bundle bundle2 = new Bundle();
                for (Map.Entry entry4 : d10.entrySet()) {
                    String str = (String) entry4.getKey();
                    List list = (List) entry4.getValue();
                    bundle2.putParcelableArrayList(str, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
                }
                return bundle2;
        }
    }
}
