package defpackage;

import android.widget.LinearLayout;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class b7g extends ezc implements Function2 {
    public static final b7g a = new b7g(2, LinearLayout.LayoutParams.class, "<init>", "<init>(II)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new LinearLayout.LayoutParams(((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
