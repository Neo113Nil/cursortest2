package defpackage;

import kotlin.coroutines.CoroutineContext;

/* loaded from: classes5.dex */
public interface mfs extends CoroutineContext.Element {
    void restoreThreadContext(CoroutineContext coroutineContext, Object obj);

    Object updateThreadContext(CoroutineContext coroutineContext);
}
