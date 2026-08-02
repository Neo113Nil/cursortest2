package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.dfi;
import java.util.concurrent.CancellationException;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.k9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1110k9 extends CancellationException {
    public C1110k9(long j) {
        super(dfi.e(j, "Timed out waiting for ", " ms"));
    }
}
