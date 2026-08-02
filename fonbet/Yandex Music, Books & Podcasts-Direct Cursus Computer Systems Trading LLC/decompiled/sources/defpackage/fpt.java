package defpackage;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class fpt implements zbf {
    @Override // defpackage.zbf
    public final String a(Object obj, rwj rwjVar) {
        Uri uri = (Uri) obj;
        if (!Intrinsics.d(uri.getScheme(), "android.resource")) {
            return uri.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(uri);
        sb.append('-');
        Configuration configuration = rwjVar.a.getResources().getConfiguration();
        Bitmap.Config[] configArr = k.a;
        sb.append(configuration.uiMode & 48);
        return sb.toString();
    }
}
