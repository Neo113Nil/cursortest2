package ru.kinopoisk.sdk.easylogin.internal;

import java.util.Iterator;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class A1 implements InterfaceC1093j6 {

    @NotNull
    public final Set<InterfaceC1093j6> a;

    public A1(@NotNull Set<InterfaceC1093j6> set) {
        set.getClass();
        this.a = set;
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1093j6
    public final void a(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1093j6) it.next()).a(str, str2);
        }
    }

    @Override // ru.kinopoisk.sdk.easylogin.internal.InterfaceC1093j6
    public final void a(@NotNull String str, @NotNull Throwable th) {
        str.getClass();
        th.getClass();
        Iterator<T> it = this.a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1093j6) it.next()).a(str, th);
        }
    }
}
