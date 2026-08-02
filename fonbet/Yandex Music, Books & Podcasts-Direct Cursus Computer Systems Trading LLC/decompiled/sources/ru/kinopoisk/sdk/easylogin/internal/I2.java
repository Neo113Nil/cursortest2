package ru.kinopoisk.sdk.easylogin.internal;

import android.content.ContentResolver;
import defpackage.uif;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class I2 extends uif implements Function0<ContentResolver> {
    public final /* synthetic */ G2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I2(G2 g2) {
        super(0);
        this.a = g2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.a.b.getContentResolver();
    }
}
