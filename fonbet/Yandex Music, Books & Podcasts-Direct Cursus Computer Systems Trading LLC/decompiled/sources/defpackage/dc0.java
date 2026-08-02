package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes5.dex */
public final class dc0 {
    public final Context a;

    public dc0(Context context) {
        this.a = context;
    }

    public static Uri a(Context context, int i) {
        return Uri.parse("android.resource://ru.yandex.music/drawable/" + context.getResources().getResourceEntryName(i));
    }
}
