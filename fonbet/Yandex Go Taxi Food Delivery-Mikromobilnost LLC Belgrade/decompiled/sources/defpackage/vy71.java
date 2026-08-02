package defpackage;

import android.view.View;
import android.widget.TextView;
import com.yandex.div.core.view2.Div2View;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class vy71 implements dpk {
    @Override // defpackage.dpk
    public final void bindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
        Object obj;
        JSONObject jSONObject;
        String string;
        if (view instanceof TextView) {
            TextView textView = (TextView) view;
            textView.setHyphenationFrequency(2);
            List extensions = egkVar.getExtensions();
            Locale locale = null;
            if (extensions != null) {
                Iterator it = extensions.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    } else {
                        obj = it.next();
                        if (jl40.l(((bpk) obj).a, "hyphenation")) {
                            break;
                        }
                    }
                }
                bpk bpkVar = (bpk) obj;
                if (bpkVar != null && (jSONObject = bpkVar.b) != null && (string = jSONObject.getString("locale")) != null) {
                    locale = new Locale(string);
                }
            }
            if (locale != null) {
                textView.setTextLocale(locale);
            }
        }
    }

    @Override // defpackage.dpk
    public final boolean matches(egk egkVar) {
        List extensions = egkVar.getExtensions();
        if (extensions == null || extensions.isEmpty()) {
            return false;
        }
        Iterator it = extensions.iterator();
        while (it.hasNext()) {
            if (jl40.l(((bpk) it.next()).a, "hyphenation")) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dpk
    public final void unbindView(Div2View div2View, rvo rvoVar, View view, egk egkVar) {
    }
}
