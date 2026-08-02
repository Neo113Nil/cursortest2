package defpackage;

import android.content.ContentResolver;
import android.content.Context;

/* loaded from: classes.dex */
public class tth {
    public static final boolean c = zth.b;
    public final Context a;
    public final ContentResolver b;

    public tth(Context context) {
        this.a = context;
        this.b = context.getContentResolver();
        this.a = context;
    }

    public final boolean a(wth wthVar, String str) {
        int i = wthVar.b;
        Context context = this.a;
        return i < 0 ? context.getPackageManager().checkPermission(str, wthVar.a) == 0 : context.checkPermission(str, i, wthVar.c) == 0;
    }
}
