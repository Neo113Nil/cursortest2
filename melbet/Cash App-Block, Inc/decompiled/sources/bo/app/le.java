package bo.app;

import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class le implements Function0 {
    public final /* synthetic */ Throwable a;

    public le(Throwable th) {
        this.a = th;
    }

    @Override // kotlin.jvm.functions.Function0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String invoke() {
        return "Child job of SerialCoroutineScope got exception: " + this.a;
    }
}
