package defpackage;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes8.dex */
public final /* synthetic */ class vop0 {
    public final /* synthetic */ Context a;

    public final String a(String str) {
        return new Uri.Builder().scheme(gay.a()).authority(this.a.getPackageName()).path(str).build().toString();
    }
}
