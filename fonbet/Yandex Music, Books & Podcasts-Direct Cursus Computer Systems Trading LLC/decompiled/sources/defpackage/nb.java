package defpackage;

import android.view.View;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class nb extends ezc implements Function1 {
    public static final nb a = new nb(1, View.class, "getLeft", "getLeft()I", 0);

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return Integer.valueOf(((View) obj).getLeft());
    }
}
