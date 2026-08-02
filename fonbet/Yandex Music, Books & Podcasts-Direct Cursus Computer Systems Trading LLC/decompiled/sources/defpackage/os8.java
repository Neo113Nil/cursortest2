package defpackage;

import android.view.View;
import android.widget.TextView;
import com.connectsdk.device.ConnectableDevice;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class os8 implements ux8 {
    public final /* synthetic */ int a;
    public LinkedHashMap b;

    public os8() {
        this.a = 1;
        this.b = uah.g(new Pair("payments_method_title", Integer.valueOf(R.id.payments_method_title)), new Pair("recycler_view", Integer.valueOf(R.id.recycler_view)), new Pair("banks_recycler_view", Integer.valueOf(R.id.banks_recycler_view)));
    }

    public boolean a() {
        CharSequence text;
        LinkedHashMap linkedHashMap = this.b;
        if (linkedHashMap.isEmpty()) {
            return false;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            View view = (View) ((Map.Entry) it.next()).getValue();
            if (view.getVisibility() == 0) {
                TextView textView = view instanceof TextView ? (TextView) view : null;
                if (textView != null && (text = textView.getText()) != null && text.length() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ux8
    public final void b(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var) {
        String C;
        Integer num;
        int i = this.a;
        xzbVar.getClass();
        view.getClass();
        dp8Var.getClass();
        switch (i) {
            case 0:
                String id = dp8Var.getId();
                if (id == null) {
                    ssg.a(6, "DivCommunicationOneClickDisclaimerExtension", "Div must be used with id", null);
                    break;
                } else {
                    this.b.put(id, view);
                    break;
                }
            case 1:
                List n = dp8Var.n();
                if (n != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : n) {
                        rx8 rx8Var = (rx8) obj;
                        if (Intrinsics.d(rx8Var.a, "id_ext") || Intrinsics.d(rx8Var.a, "id_extension_for_list")) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObject = ((rx8) it.next()).b;
                        if (jSONObject != null && (C = wct.C(ConnectableDevice.KEY_ID, jSONObject)) != null && (num = (Integer) this.b.get(C)) != null) {
                            view.setId(num.intValue());
                        }
                    }
                    break;
                }
                break;
            default:
                String id2 = dp8Var.getId();
                if (id2 == null) {
                    ssg.a(6, "OptionPaywallOneClickDisclaimerExtension", "Div must be used with id", null);
                    break;
                } else {
                    this.b.put(id2, view);
                    break;
                }
        }
    }

    @Override // defpackage.ux8
    public final boolean c(dp8 dp8Var) {
        Boolean bool;
        int i = this.a;
        dp8Var.getClass();
        switch (i) {
            case 0:
                return sj2.t(dp8Var, "payment_legal_notes");
            case 1:
                List n = dp8Var.n();
                if (n != null) {
                    List list = n;
                    boolean z = false;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (Intrinsics.d(((rx8) it.next()).a, "id_ext")) {
                                    z = true;
                                }
                            }
                        }
                    }
                    bool = Boolean.valueOf(z);
                } else {
                    bool = null;
                }
                return qdq.B(bool);
            default:
                return sj2.t(dp8Var, "payment_legal_notes");
        }
    }

    @Override // defpackage.ux8
    public final void e(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var) {
        int i = this.a;
        gc8Var.getClass();
        xzbVar.getClass();
        view.getClass();
        dp8Var.getClass();
        switch (i) {
            case 0:
                String id = dp8Var.getId();
                if (id != null) {
                    break;
                }
                break;
            case 1:
                break;
            default:
                String id2 = dp8Var.getId();
                if (id2 != null) {
                    break;
                }
                break;
        }
    }

    public /* synthetic */ os8(int i) {
        this.a = i;
    }
}
