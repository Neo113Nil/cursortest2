package defpackage;

import android.os.Build;
import java.util.ArrayList;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes10.dex */
public final class v2v {
    public static final /* synthetic */ v2v a = new v2v();
    public static final ArrayList b;
    public static final ArrayList c;
    public static final String[] d;
    public static final String[] e;

    static {
        ArrayList i = scc.i("_display_name", "_data", ClidProvider._ID, "title", "bucket_id", "bucket_display_name", "width", "height", "orientation", "date_added", "date_modified", "mime_type", "datetaken");
        i.add("datetaken");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30) {
            i.add("is_favorite");
        }
        b = i;
        ArrayList i3 = scc.i("_display_name", "_data", ClidProvider._ID, "title", "bucket_id", "bucket_display_name", "date_added", "width", "height", "orientation", "date_modified", "mime_type", "duration");
        i3.add("datetaken");
        if (i2 >= 30) {
            i3.add("is_favorite");
        }
        c = i3;
        d = new String[]{"media_type", "_display_name"};
        e = new String[]{"bucket_id", "bucket_display_name"};
    }
}
