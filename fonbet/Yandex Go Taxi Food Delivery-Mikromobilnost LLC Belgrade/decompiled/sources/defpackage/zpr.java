package defpackage;

import kotlinx.coroutines.flow.internal.ChildCancelledException;

/* loaded from: classes9.dex */
public final class zpr extends fbp0 {
    @Override // kotlinx.coroutines.c
    public final boolean z(Throwable th) {
        if (th instanceof ChildCancelledException) {
            return true;
        }
        return t(th);
    }
}
