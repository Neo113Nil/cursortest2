package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class nc9 extends ezc implements Function1 {
    public static final nc9 a = new nc9(1, View.class, "isLongClickable", "isLongClickable()Z", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((View) obj).isLongClickable());
    }
}
