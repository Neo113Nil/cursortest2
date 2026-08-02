package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public abstract class erv {
    public static final LinkedHashMap a = new LinkedHashMap();

    public static final vdr a(Context context) {
        vdr vdrVar;
        LinkedHashMap linkedHashMap = a;
        synchronized (linkedHashMap) {
            try {
                Object obj = linkedHashMap.get(context);
                if (obj == null) {
                    ContentResolver contentResolver = context.getContentResolver();
                    Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                    zi3 g = men.g(-1, 6, null);
                    obj = zsd.F0(new eno(new y7b(contentResolver, uriFor, new hw6(g, ild.t(Looper.getMainLooper())), g, context, (Continuation) null)), gld.B(), new hdr(0L, Long.MAX_VALUE), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                    linkedHashMap.put(context, obj);
                }
                vdrVar = (vdr) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vdrVar;
    }

    public static final tr5 b(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof tr5) {
            return (tr5) tag;
        }
        return null;
    }
}
