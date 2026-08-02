package ru.kinopoisk.sdk.easylogin.internal;

import android.content.Context;
import com.connectsdk.device.ConnectableDevice;
import com.connectsdk.discovery.DiscoveryManager;
import defpackage.arf;
import defpackage.btf;
import defpackage.uif;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes5.dex */
public final class N5 {

    @NotNull
    public final Context a;

    @NotNull
    public final arf b;

    public static final class a extends uif implements Function0<DiscoveryManager> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            DiscoveryManager.init(N5.this.a);
            return DiscoveryManager.getInstance();
        }
    }

    public N5(@NotNull Context context) {
        context.getClass();
        this.a = context;
        this.b = btf.b(new a());
    }

    public final ConnectableDevice a(@NotNull String str) {
        str.getClass();
        return ((DiscoveryManager) this.b.getValue()).getDeviceById(str);
    }
}
