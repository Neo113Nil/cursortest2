package defpackage;

import android.content.res.Resources;
import android.util.SparseArray;
import android.view.View;
import java.lang.reflect.Field;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract class k7b {
    public static Field a;

    static {
        try {
            Field declaredField = View.class.getDeclaredField("mKeyedTags");
            a = declaredField;
            if (declaredField != null) {
                declaredField.setAccessible(true);
            }
        } catch (NoSuchFieldException unused) {
        }
    }

    public static JSONObject a(View view) {
        String str;
        JSONObject jSONObject = null;
        try {
            if (a == null) {
                Field declaredField = View.class.getDeclaredField("mKeyedTags");
                a = declaredField;
                if (declaredField != null) {
                    declaredField.setAccessible(true);
                }
            }
            Field field = a;
            Object obj = field != null ? field.get(view) : null;
            if (obj == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.util.SparseArray<*>");
            }
            SparseArray sparseArray = (SparseArray) obj;
            if (sparseArray.size() <= 0) {
                return null;
            }
            JSONObject jSONObject2 = new JSONObject();
            try {
                int size = sparseArray.size();
                for (int i = 0; i < size; i++) {
                    Resources resources = view.getResources();
                    int keyAt = sparseArray.keyAt(i);
                    try {
                        str = pcg.B(resources, keyAt);
                    } catch (Resources.NotFoundException unused) {
                        str = "#" + Integer.toHexString(keyAt);
                    }
                    try {
                        jSONObject2.put(str, sparseArray.valueAt(i));
                    } catch (JSONException unused2) {
                    }
                }
                return jSONObject2;
            } catch (Exception unused3) {
                jSONObject = jSONObject2;
                return jSONObject;
            }
        } catch (Exception unused4) {
        }
    }
}
