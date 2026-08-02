package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.a;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.Sequence;

/* loaded from: classes5.dex */
public final class l8j extends a implements r2f {
    public static final l8j c = new l8j(o6c.l);

    @Override // defpackage.r2f
    public final CancellationException D() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.r2f
    public final qa8 R(Function1 function1) {
        return m8j.a;
    }

    @Override // defpackage.r2f
    public final boolean X() {
        return false;
    }

    @Override // defpackage.r2f
    public final qa8 Y(boolean z, boolean z2, aub aubVar) {
        return m8j.a;
    }

    @Override // defpackage.r2f
    public final Sequence a() {
        return p5b.a;
    }

    @Override // defpackage.r2f
    public final boolean b() {
        return true;
    }

    @Override // defpackage.r2f
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.r2f
    public final Object j0(Continuation continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.r2f
    public final hj4 l0(h3f h3fVar) {
        return m8j.a;
    }

    @Override // defpackage.r2f
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.r2f
    public final void g(CancellationException cancellationException) {
    }
}
