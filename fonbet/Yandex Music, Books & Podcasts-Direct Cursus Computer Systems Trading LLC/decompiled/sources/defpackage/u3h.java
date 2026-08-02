package defpackage;

import android.content.Context;
import java.util.List;
import kotlin.collections.CollectionsKt;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class u3h {
    public final Context a;

    public u3h(Context context) {
        this.a = context;
    }

    public final String a(String str) {
        if (str.length() == 0) {
            return null;
        }
        return ouj.o(this.a.getString(R.string.lyrics_info_prefix_license), ": ", str);
    }

    public final String b(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return ouj.o(this.a.getString(R.string.lyrics_info_prefix_author), ": ", CollectionsKt.X(list, ", ", null, null, null, 62));
    }
}
