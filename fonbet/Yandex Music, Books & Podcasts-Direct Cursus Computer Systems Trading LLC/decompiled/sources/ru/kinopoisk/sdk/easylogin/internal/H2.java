package ru.kinopoisk.sdk.easylogin.internal;

import android.view.accessibility.AccessibilityManager;
import defpackage.uif;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class H2 extends uif implements Function0<AccessibilityManager> {
    public final /* synthetic */ G2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H2(G2 g2) {
        super(0);
        this.a = g2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object systemService = this.a.b.getSystemService("accessibility");
        if (systemService instanceof AccessibilityManager) {
            return (AccessibilityManager) systemService;
        }
        return null;
    }
}
