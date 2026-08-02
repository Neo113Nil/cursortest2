package com.plaid.internal;

import androidx.core.view.ViewCompat;
import java.util.WeakHashMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* loaded from: classes5.dex */
public final class T5<T> implements FlowCollector {
    public final /* synthetic */ P5 a;

    public T5(P5 p5) {
        this.a = p5;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        ((Boolean) obj).getClass();
        P5 p5 = this.a;
        WeakHashMap weakHashMap = ViewCompat.sViewPropertyAnimatorMap;
        if (p5.isAttachedToWindow()) {
            p5.post(new R5(p5));
        } else {
            p5.addOnAttachStateChangeListener(new S5(p5, p5));
        }
        return Unit.INSTANCE;
    }
}
