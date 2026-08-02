package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes3.dex */
public final class n4s {
    public final Context a;

    public n4s(Context context, o4s o4sVar) {
        this.a = context;
    }

    public static Intent a(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        intent.addFlags(268468224);
        return intent;
    }
}
