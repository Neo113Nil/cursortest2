package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.s9f;
import defpackage.sij;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.n0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1143n0 extends sij {
    public final /* synthetic */ C1171p0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1143n0(String str, C1171p0 c1171p0) {
        super(str);
        this.a = c1171p0;
    }

    @Override // defpackage.sij
    public final void afterChange(s9f s9fVar, String str, String str2) {
        s9fVar.getClass();
        this.a.a.setSessionId(str2);
    }
}
