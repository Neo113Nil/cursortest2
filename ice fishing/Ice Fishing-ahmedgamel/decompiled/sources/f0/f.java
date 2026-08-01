package f0;

import androidx.fragment.app.AbstractComponentCallbacksC0475s;
import kotlin.jvm.internal.h;

/* loaded from: classes.dex */
public abstract class f extends RuntimeException {

    /* renamed from: n, reason: collision with root package name */
    public final AbstractComponentCallbacksC0475s f37347n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(AbstractComponentCallbacksC0475s fragment, String str) {
        super(str);
        h.e(fragment, "fragment");
        this.f37347n = fragment;
    }
}
