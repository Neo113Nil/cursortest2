package defpackage;

import android.content.Context;
import android.view.ViewConfiguration;

/* loaded from: classes12.dex */
public final class s7z0 {
    public final int a;
    public float b;
    public float c;

    public s7z0(Context context) {
        this.a = ViewConfiguration.get(context).getScaledTouchSlop();
    }
}
