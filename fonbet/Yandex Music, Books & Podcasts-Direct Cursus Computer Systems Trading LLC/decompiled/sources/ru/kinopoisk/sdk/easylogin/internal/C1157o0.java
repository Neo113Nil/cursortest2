package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.s9f;
import defpackage.sij;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.o0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1157o0 extends sij {
    public final /* synthetic */ C1171p0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1157o0(Long l, C1171p0 c1171p0) {
        super(l);
        this.a = c1171p0;
    }

    @Override // defpackage.sij
    public final void afterChange(s9f s9fVar, Long l, Long l2) {
        s9fVar.getClass();
        long longValue = l2.longValue();
        l.longValue();
        this.a.a.setOrder(longValue);
    }
}
