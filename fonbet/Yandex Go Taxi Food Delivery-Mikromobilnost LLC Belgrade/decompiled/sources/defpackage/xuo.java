package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes12.dex */
public final class xuo {
    public static final /* synthetic */ kgx[] b = {new MutablePropertyReference1Impl("syncTs", 0, "getSyncTs()J", xuo.class)};
    public final cjm0 a;

    public xuo(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("explorer_sync_with_back_prefs", 0);
        this.a = new cjm0(26, sharedPreferences, sharedPreferences);
    }
}
