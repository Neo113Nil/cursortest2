package defpackage;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class nqr {
    public static final nqr b = new nqr();
    public static final List a = u75.h(Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class);

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r5.isClickable() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        r0.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0038, code lost:
    
        r5 = defpackage.qeu.b(r5).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r5.hasNext() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0046, code lost:
    
        r0.addAll(a((android.view.View) r5.next()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList a(View view) {
        if (bp6.a.contains(nqr.class)) {
            return null;
        }
        try {
            view.getClass();
            ArrayList arrayList = new ArrayList();
            Iterator it = a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (((Class) it.next()).isInstance(view)) {
                    break;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            bp6.a(nqr.class, th);
            return null;
        }
    }

    public static final JSONObject b(View view, View view2) {
        if (bp6.a.contains(nqr.class)) {
            return null;
        }
        try {
            view.getClass();
            JSONObject jSONObject = new JSONObject();
            if (view == view2) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = qeu.b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b((View) it.next(), view2));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th) {
            bp6.a(nqr.class, th);
            return null;
        }
    }

    public static final String d(View view) {
        if (bp6.a.contains(nqr.class)) {
            return null;
        }
        try {
            view.getClass();
            String j = qeu.j(view);
            if (j.length() > 0) {
                return j;
            }
            String join = TextUtils.join(StringUtil.SPACE, b.c(view));
            join.getClass();
            return join;
        } catch (Throwable th) {
            bp6.a(nqr.class, th);
            return null;
        }
    }

    public static final void e(View view, JSONObject jSONObject) {
        if (bp6.a.contains(nqr.class)) {
            return;
        }
        try {
            view.getClass();
            try {
                String j = qeu.j(view);
                String h = qeu.h(view);
                jSONObject.put("classname", view.getClass().getSimpleName());
                jSONObject.put("classtypebitmask", qeu.c(view));
                if (j.length() > 0) {
                    jSONObject.put("text", j);
                }
                if (h.length() > 0) {
                    jSONObject.put("hint", h);
                }
                if (view instanceof EditText) {
                    jSONObject.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th) {
            bp6.a(nqr.class, th);
        }
    }

    public final ArrayList c(View view) {
        if (bp6.a.contains(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = qeu.b(view).iterator();
            while (it.hasNext()) {
                View view2 = (View) it.next();
                String j = qeu.j(view2);
                if (j.length() > 0) {
                    arrayList.add(j);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th) {
            bp6.a(this, th);
            return null;
        }
    }
}
