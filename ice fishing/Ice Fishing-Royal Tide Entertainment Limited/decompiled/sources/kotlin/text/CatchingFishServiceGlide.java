package kotlin.text;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class CatchingFishServiceGlide extends CancellationException {
    public final transient CatchingFishPicassoView CatchingFishReduxKtor;

    public CatchingFishServiceGlide(String str, Throwable th, CatchingFishPicassoView catchingFishPicassoView) {
        super(str);
        this.CatchingFishReduxKtor = catchingFishPicassoView;
        if (th != null) {
            initCause(th);
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof CatchingFishServiceGlide)) {
            return false;
        }
        CatchingFishServiceGlide catchingFishServiceGlide = (CatchingFishServiceGlide) obj;
        return CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishServiceGlide.getMessage(), getMessage()) && CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishServiceGlide.CatchingFishReduxKtor, this.CatchingFishReduxKtor) && CatchingFishFirebaseDagger.CatchingFishOkHttp(catchingFishServiceGlide.getCause(), getCause());
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public final int hashCode() {
        String message = getMessage();
        CatchingFishFirebaseDagger.CatchingFishAnimationMockk(message);
        int hashCode = (this.CatchingFishReduxKtor.hashCode() + (message.hashCode() * 31)) * 31;
        Throwable cause = getCause();
        return hashCode + (cause != null ? cause.hashCode() : 0);
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.CatchingFishReduxKtor;
    }
}
