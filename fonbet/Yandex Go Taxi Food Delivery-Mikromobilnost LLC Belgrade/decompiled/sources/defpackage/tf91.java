package defpackage;

import android.text.TextPaint;
import android.view.ViewGroup;
import com.yandex.go.taxi.experiments.VerticalSelectorSettingsExperiment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import ru.CryptoPro.reprov.array.DerValue;
import ru.CryptoPro.ssl.Alerts;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes6.dex */
public abstract class tf91 {
    public static final byte[] a = {93, -104, 63, Alerts.alert_protocol_version, -54, 79, 19, DerValue.TAG_CONTEXT};
    public static final byte[] b = {63, -7, 81, Alerts.alert_certificate_expired, -107, 38, 119};

    public static edj a(ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        Object tag = viewGroup.getTag(ndh0.dialog_container_accessibility_delegate);
        edj edjVar = tag instanceof edj ? (edj) tag : null;
        if (edjVar != null) {
            return edjVar;
        }
        edj edjVar2 = new edj(viewGroup, arrayList);
        viewGroup.setTag(ndh0.dialog_container_accessibility_delegate, edjVar2);
        return edjVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r3 != null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final hfa0 b(oea0 oea0Var, lv90 lv90Var) {
        lea0 lea0Var;
        Object obj;
        List list = oea0Var.a;
        if (lv90Var != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                lea0 lea0Var2 = (lea0) obj;
                if (jl40.l(lea0Var2.getId(), lv90Var.b) && lea0Var2.c() == lv90Var.a) {
                    break;
                }
            }
            lea0Var = (lea0) obj;
        }
        lea0Var = oea0Var.c;
        return new hfa0(list, lea0Var != null ? new shq0(lea0Var, null) : null);
    }

    public static final hfa0 c(oea0 oea0Var, m6a0 m6a0Var) {
        lea0 p;
        shq0 shq0Var = null;
        shq0 shq0Var2 = (m6a0Var == null || (p = eja1.p(oea0Var, m6a0Var)) == null) ? null : new shq0(p, eja1.p(oea0Var, m6a0Var.c));
        if (shq0Var2 == null) {
            lea0 lea0Var = oea0Var.c;
            if (lea0Var != null) {
                shq0Var = new shq0(lea0Var, null);
            }
        } else {
            shq0Var = shq0Var2;
        }
        return new hfa0(oea0Var.a, shq0Var);
    }

    public static final void d(hf31 hf31Var, String str, String str2, RobotoTextView robotoTextView) {
        int i = ((VerticalSelectorSettingsExperiment) hf31Var.a.c.b()).e.b;
        gr80 gr80Var = new gr80(str, str2, i);
        ConcurrentHashMap concurrentHashMap = hf31Var.b;
        if (concurrentHashMap.containsKey(gr80Var)) {
            return;
        }
        TextPaint paint = robotoTextView.getPaint();
        int length = str2.length();
        if (i <= length) {
            length = i;
        }
        int b2 = m810.b(paint.measureText(str2, 0, length));
        TextPaint paint2 = robotoTextView.getPaint();
        int length2 = str2.length() - i;
        concurrentHashMap.putIfAbsent(gr80Var, new k2x(b2, m810.b(paint2.measureText(str2, length2 >= 0 ? length2 : 0, str2.length()))));
    }
}
