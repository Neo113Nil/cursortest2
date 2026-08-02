package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class mb extends ezc implements Function1 {
    public static final mb a = new mb(1, View.class, "getTop", "getTop()I", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Integer.valueOf(((View) obj).getTop());
    }
}
