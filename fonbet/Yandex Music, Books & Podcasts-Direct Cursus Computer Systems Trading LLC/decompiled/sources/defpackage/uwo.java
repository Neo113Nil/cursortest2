package defpackage;

import android.widget.FrameLayout;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class uwo extends ezc implements Function2 {
    public static final uwo a = new uwo(2, FrameLayout.LayoutParams.class, "<init>", "<init>(II)V", 0);

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new FrameLayout.LayoutParams(((Number) obj).intValue(), ((Number) obj2).intValue());
    }
}
