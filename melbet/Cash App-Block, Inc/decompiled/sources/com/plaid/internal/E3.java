package com.plaid.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public final class E3 implements ViewModelProvider$Factory {
    public final H1 a;

    public E3(H1 h1) {
        h1.getClass();
        this.a = h1;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        cls.getClass();
        if (cls.isAssignableFrom(D3.class)) {
            return new D3(this.a);
        }
        throw new B2("Unsupported ViewModel");
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public /* bridge */ /* synthetic */ ViewModel create(KClass kClass, CreationExtras creationExtras) {
        return super.create(kClass, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public /* bridge */ /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return super.create(cls, creationExtras);
    }
}
