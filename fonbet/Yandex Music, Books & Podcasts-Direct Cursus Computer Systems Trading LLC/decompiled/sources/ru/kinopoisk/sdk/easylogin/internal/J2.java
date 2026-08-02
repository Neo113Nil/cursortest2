package ru.kinopoisk.sdk.easylogin.internal;

import android.view.WindowManager;
import defpackage.uif;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class J2 extends uif implements Function0<WindowManager> {
    public final /* synthetic */ G2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J2(G2 g2) {
        super(0);
        this.a = g2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object systemService = this.a.b.getSystemService("window");
        systemService.getClass();
        return (WindowManager) systemService;
    }
}
