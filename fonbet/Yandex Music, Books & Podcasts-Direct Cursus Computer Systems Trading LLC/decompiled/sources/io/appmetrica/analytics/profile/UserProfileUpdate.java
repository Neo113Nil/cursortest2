package io.appmetrica.analytics.profile;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.impl.InterfaceC0532or;

/* loaded from: classes5.dex */
public class UserProfileUpdate<T extends InterfaceC0532or> {
    private final InterfaceC0532or a;

    public UserProfileUpdate(InterfaceC0532or interfaceC0532or) {
        this.a = interfaceC0532or;
    }

    @NonNull
    public T getUserProfileUpdatePatcher() {
        return (T) this.a;
    }
}
