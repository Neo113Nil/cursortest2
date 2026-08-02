package com.plaid.internal;

import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.plaid.internal.c7, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C0116c7<T> extends MutableLiveData {
    public final AtomicBoolean a = new AtomicBoolean(false);

    public static final void a(C0116c7 c0116c7, Observer observer, Object obj) {
        c0116c7.getClass();
        observer.getClass();
        if (c0116c7.a.get()) {
            observer.onChanged(obj);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public final void observe(LifecycleOwner lifecycleOwner, Observer observer) {
        lifecycleOwner.getClass();
        observer.getClass();
        if (hasActiveObservers()) {
            throw new B2("Only one observer supported");
        }
        super.observe(lifecycleOwner, new c7$$ExternalSyntheticLambda0(0, this, observer));
    }

    @Override // androidx.lifecycle.LiveData
    public final void setValue(T t) {
        this.a.set(true);
        super.setValue(t);
    }
}
