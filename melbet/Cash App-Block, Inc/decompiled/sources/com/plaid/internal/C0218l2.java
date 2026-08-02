package com.plaid.internal;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider$Factory;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.reflect.KClass;

/* renamed from: com.plaid.internal.l2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0218l2 implements ViewModelProvider$Factory {
    public final InterfaceC0092a3 a;

    public C0218l2(InterfaceC0092a3 interfaceC0092a3) {
        interfaceC0092a3.getClass();
        this.a = interfaceC0092a3;
    }

    @Override // androidx.lifecycle.ViewModelProvider$Factory
    public final <T extends ViewModel> T create(Class<T> cls) {
        cls.getClass();
        return new C0200j2(this.a);
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
