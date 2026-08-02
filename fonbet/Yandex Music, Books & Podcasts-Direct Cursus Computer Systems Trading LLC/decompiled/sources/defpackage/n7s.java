package defpackage;

import android.view.View;
import android.widget.TextView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class n7s implements ux8 {
    public LinkedHashMap a;
    public LinkedHashMap b;
    public LinkedHashMap c;
    public String d;
    public String e;
    public String f;
    public String g;
    public String h;
    public String i;

    public final boolean a() {
        CharSequence text;
        LinkedHashMap linkedHashMap = this.c;
        if (linkedHashMap.isEmpty()) {
            return false;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            m7s m7sVar = (m7s) ((Map.Entry) it.next()).getValue();
            if (m7sVar.a.getVisibility() == 0) {
                View view = m7sVar.a;
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
        Object obj;
        JSONObject jSONObject;
        String C;
        TextView textView;
        xzbVar.getClass();
        view.getClass();
        dp8Var.getClass();
        String id = dp8Var.getId();
        if (id == null) {
            ssg.a(6, "TariffPaywallConditionsExtension", "Div must be used with id", null);
            return;
        }
        List n = dp8Var.n();
        if (n != null) {
            Iterator it = n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (Intrinsics.d(((rx8) obj).a, "payment_texts")) {
                        break;
                    }
                }
            }
            rx8 rx8Var = (rx8) obj;
            if (rx8Var == null || (jSONObject = rx8Var.b) == null || (C = wct.C("type", jSONObject)) == null) {
                return;
            }
            Boolean z = fgq.z("available_text_override", jSONObject);
            boolean booleanValue = z != null ? z.booleanValue() : true;
            Boolean z2 = fgq.z("available_change_visibility", jSONObject);
            boolean booleanValue2 = z2 != null ? z2.booleanValue() : true;
            int hashCode = C.hashCode();
            if (hashCode == -1324617915) {
                if (C.equals("paywall_subtitle")) {
                    String str = this.f;
                    if (str != null) {
                        if (booleanValue) {
                            textView = view instanceof TextView ? (TextView) view : null;
                            if (textView != null) {
                                textView.setText(str);
                            }
                            view.setContentDescription(this.g);
                        }
                        if (booleanValue2) {
                            view.setVisibility(0);
                        }
                    }
                    this.b.put(id, new m7s(view, booleanValue, booleanValue2));
                    return;
                }
                return;
            }
            if (hashCode != 748492363) {
                if (hashCode == 1872779118 && C.equals("paywall_legal_notes")) {
                    if (booleanValue) {
                        textView = view instanceof TextView ? (TextView) view : null;
                        if (textView != null) {
                            textView.setText(this.h);
                            textView.setContentDescription(this.i);
                        }
                    }
                    if (booleanValue2) {
                        view.setVisibility(this.h == null ? 8 : 0);
                    }
                    this.c.put(id, new m7s(view, booleanValue, booleanValue2));
                    return;
                }
                return;
            }
            if (C.equals("paywall_title")) {
                String str2 = this.d;
                if (str2 != null) {
                    if (booleanValue) {
                        textView = view instanceof TextView ? (TextView) view : null;
                        if (textView != null) {
                            textView.setText(str2);
                        }
                        view.setContentDescription(this.e);
                    }
                    if (booleanValue2) {
                        view.setVisibility(0);
                    }
                }
                this.a.put(id, new m7s(view, booleanValue, booleanValue2));
            }
        }
    }

    @Override // defpackage.ux8
    public final boolean c(dp8 dp8Var) {
        dp8Var.getClass();
        return sj2.t(dp8Var, "payment_texts");
    }

    @Override // defpackage.ux8
    public final void e(gc8 gc8Var, xzb xzbVar, View view, dp8 dp8Var) {
        gc8Var.getClass();
        xzbVar.getClass();
        view.getClass();
        dp8Var.getClass();
        String id = dp8Var.getId();
        if (id != null) {
            this.a.remove(id);
            this.b.remove(id);
        }
    }
}
