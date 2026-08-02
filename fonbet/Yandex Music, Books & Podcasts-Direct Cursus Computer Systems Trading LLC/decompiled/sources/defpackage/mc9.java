package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class mc9 extends ezc implements Function1 {
    public static final mc9 a = new mc9(1, View.class, "isClickable", "isClickable()Z", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Boolean.valueOf(((View) obj).isClickable());
    }
}
