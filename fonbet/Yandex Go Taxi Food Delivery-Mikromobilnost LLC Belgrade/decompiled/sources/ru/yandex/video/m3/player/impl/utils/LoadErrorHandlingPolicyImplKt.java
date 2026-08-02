package ru.yandex.video.m3.player.impl.utils;

import defpackage.twy;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\b\u001a\u00020\u0005*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Ltwy;", "", "getDEFAULT_MAX_RETRY_DELAY_MS", "(Ltwy;)J", "DEFAULT_MAX_RETRY_DELAY_MS", "", "getDEFAULT_MIN_LOADABLE_RETRY_COUNT", "(Ltwy;)I", "DEFAULT_MIN_LOADABLE_RETRY_COUNT", "video-player_internalRelease"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LoadErrorHandlingPolicyImplKt {
    public static final long getDEFAULT_MAX_RETRY_DELAY_MS(twy twyVar) {
        return 5000L;
    }

    public static final int getDEFAULT_MIN_LOADABLE_RETRY_COUNT(twy twyVar) {
        return 3;
    }
}
