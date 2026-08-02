package defpackage;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;

/* loaded from: classes9.dex */
public final class szc implements Continuation {
    public static final szc b = new szc(0);
    public static final szc c = new szc(1);
    public final /* synthetic */ int a;

    public /* synthetic */ szc(int i) {
        this.a = i;
    }

    private final void a(Object obj) {
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final fse get_context() {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return EmptyCoroutineContext.a;
        }
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        switch (this.a) {
            case 0:
                throw new IllegalStateException("This continuation is already complete");
            default:
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "This continuation is already complete";
            default:
                return super.toString();
        }
    }
}
