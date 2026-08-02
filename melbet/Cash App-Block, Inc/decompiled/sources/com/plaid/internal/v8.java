package com.plaid.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.plaid.internal.p8;
import kotlin.reflect.KClass;

/* loaded from: classes.dex */
public final class v8 implements ViewModelProvider$Factory {
    public final p8.a a;
    public final H1 b;

    public v8(p8.a aVar, H1 h1) {
        aVar.getClass();
        h1.getClass();
        this.a = aVar;
        this.b = h1;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        cls.getClass();
        Object invoke = this.a.invoke(this.b);
        invoke.getClass();
        return (T) invoke;
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
