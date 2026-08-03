package y1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import java.util.LinkedHashMap;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class x1 {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashMap f8678a = new LinkedHashMap();

    public static final bd.c0 a(Context context) {
        bd.c0 c0Var;
        LinkedHashMap linkedHashMap = f8678a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    ad.e a6 = a.a.a(-1, 6, null);
                    f8.c cVar = new f8.c(new ld.d(contentResolver, uriFor, new m3.a(a6, v6.a.q(Looper.getMainLooper())), a6, context, null));
                    yc.s1 s1Var = new yc.s1(null);
                    fd.e eVar = yc.i0.f8859a;
                    obj = bd.u.f(cVar, new dd.e(v6.a.K(s1Var, dd.o.f1880a)), new bd.b0(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                c0Var = (bd.c0) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0Var;
    }

    public static final m0.v b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof m0.v) {
            return (m0.v) tag;
        }
        return null;
    }
}
