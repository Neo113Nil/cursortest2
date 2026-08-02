package defpackage;

import android.content.Context;
import java.io.File;

/* loaded from: classes7.dex */
public final class rl81 {
    public static File a(Context context, String str) {
        return new File(g8e.p(context.getCacheDir().getPath(), File.separator, str));
    }
}
