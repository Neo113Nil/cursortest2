package ru.kinopoisk.sdk.easylogin.internal.di;

import defpackage.a4g;
import defpackage.bkk;
import defpackage.rzm;

/* loaded from: classes5.dex */
public final class LibraryModule_Companion_ProvidePendingNavigationCommandBufferFactory implements rzm {

    public static final class InstanceHolder {
        private static final LibraryModule_Companion_ProvidePendingNavigationCommandBufferFactory INSTANCE = new LibraryModule_Companion_ProvidePendingNavigationCommandBufferFactory();

        private InstanceHolder() {
        }
    }

    public static LibraryModule_Companion_ProvidePendingNavigationCommandBufferFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static bkk providePendingNavigationCommandBuffer() {
        bkk providePendingNavigationCommandBuffer = LibraryModule.INSTANCE.providePendingNavigationCommandBuffer();
        a4g.t(providePendingNavigationCommandBuffer);
        return providePendingNavigationCommandBuffer;
    }

    @Override // defpackage.szm
    public bkk get() {
        return providePendingNavigationCommandBuffer();
    }
}
