package defpackage;

import android.content.Context;
import com.google.gson.Gson;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes3.dex */
public final class k5i {
    public final Context a;
    public final List b;
    public final LinkedHashSet c = new LinkedHashSet();

    public k5i(Context context, Gson gson) {
        this.a = context;
        this.b = u75.h(new j5i(context, gson, 0), new j5i(context, gson, 1));
    }
}
