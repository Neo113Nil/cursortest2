package com.plaid.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public final class X7 implements ViewModelProvider$Factory {
    public final H1 a;

    public X7(H1 h1) {
        h1.getClass();
        this.a = h1;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        cls.getClass();
        if (cls.isAssignableFrom(U7.class)) {
            return new U7(this.a);
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
