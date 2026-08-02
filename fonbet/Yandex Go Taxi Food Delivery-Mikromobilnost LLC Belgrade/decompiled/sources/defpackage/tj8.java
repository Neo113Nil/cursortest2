package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.cardinput.analytics.DynamicBinInfoEventName;
import com.yandex.yphone.service.settings.AppSettingsContract$Setting;
import java.util.WeakHashMap;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes12.dex */
public abstract class tj8 {
    public static final WeakHashMap a = new WeakHashMap();
    public static final WeakHashMap b = new WeakHashMap();

    public static void a(ImageView imageView, int i) {
        if (i == 0) {
            imageView.setImageDrawable(null);
            imageView.setVisibility(8);
        } else {
            imageView.setImageResource(i);
            imageView.setVisibility(0);
        }
    }

    public static void b(qj8 qj8Var, rj8 rj8Var, long j, boolean z) {
        z22 z22Var = qj8Var.a;
        b5n b5nVar = qj8Var.b;
        if (z22Var == null || b5nVar == null) {
            return;
        }
        Drawable drawable = qj8Var.c.getDrawable();
        Integer valueOf = drawable instanceof BitmapDrawable ? Integer.valueOf(((BitmapDrawable) drawable).getBitmap().getByteCount()) : null;
        String str = rj8Var.a;
        if (str != null) {
            String a2 = DynamicBinInfoEventName.ICON_LOAD_SUCCESS.a();
            MapBuilder mapBuilder = new MapBuilder();
            mapBuilder.put(AppSettingsContract$Setting.COLUMN_PREFIX, b5nVar.a);
            mapBuilder.put("icon_url", str);
            mapBuilder.put("was_cached", String.valueOf(z));
            mapBuilder.put("load_duration_ms", String.valueOf(System.currentTimeMillis() - j));
            String num = valueOf != null ? valueOf.toString() : null;
            if (num != null) {
                mapBuilder.put("image_size_bytes", num);
            }
            yz91.c(z22Var, new li3(7, a2, mapBuilder.j()), qj8Var.d);
        }
    }
}
