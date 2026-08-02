package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.uif;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class Bb extends uif implements Function0<List<? extends H3>> {
    public final /* synthetic */ Gb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Bb(Gb gb) {
        super(0);
        this.a = gb;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        return this.a.f.get();
    }
}
