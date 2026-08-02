package defpackage;

import android.webkit.JavascriptInterface;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class r3f {
    public final ezc a;

    /* JADX WARN: Multi-variable type inference failed */
    public r3f(Function1 function1) {
        this.a = (ezc) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ezc, kotlin.jvm.functions.Function1] */
    @JavascriptInterface
    public final void onPostMessage(@NotNull String str) {
        str.getClass();
        this.a.invoke(str);
    }
}
