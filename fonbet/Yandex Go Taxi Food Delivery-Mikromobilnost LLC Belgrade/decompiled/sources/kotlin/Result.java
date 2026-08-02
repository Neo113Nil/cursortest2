package kotlin;

import defpackage.gyj0;
import defpackage.jl40;
import defpackage.unr0;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.io.Serializable;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087@\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00060\u0002j\u0002`\u0003:\u0002\t\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\u0007\u0010\b\u0088\u0001\u0005\u0092\u0001\u0004\u0018\u00010\u0004¨\u0006\u000b"}, d2 = {"Lkotlin/Result;", "T", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "value", "Ljava/lang/Object;", "getValue$annotations", "()V", "gyj0", "Failure", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class Result<T> implements Serializable {
    public static final gyj0 a = new gyj0();
    private final Object value;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002R\u0014\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlin/Result$Failure;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", Constants.KEY_EXCEPTION, "Ljava/lang/Throwable;", "kotlin-stdlib"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Failure implements Serializable {
        public final Throwable exception;

        public Failure(Throwable th) {
            this.exception = th;
        }

        public final boolean equals(Object obj) {
            return (obj instanceof Failure) && jl40.l(this.exception, ((Failure) obj).exception);
        }

        public final int hashCode() {
            return this.exception.hashCode();
        }

        public final String toString() {
            return unr0.s(new StringBuilder("Failure("), this.exception, ')');
        }
    }

    public /* synthetic */ Result(Object obj) {
        this.value = obj;
    }

    public static final Throwable a(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    public static int b(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static String c(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public final boolean equals(Object obj) {
        return (obj instanceof Result) && jl40.l(this.value, ((Result) obj).value);
    }

    /* renamed from: f, reason: from getter */
    public final /* synthetic */ Object getValue() {
        return this.value;
    }

    public final int hashCode() {
        return b(this.value);
    }

    public final String toString() {
        return c(this.value);
    }
}
