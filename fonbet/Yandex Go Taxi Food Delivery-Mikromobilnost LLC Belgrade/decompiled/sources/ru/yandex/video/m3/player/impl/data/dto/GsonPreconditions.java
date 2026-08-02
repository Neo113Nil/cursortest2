package ru.yandex.video.m3.player.impl.data.dto;

import defpackage.w511;

/* loaded from: classes7.dex */
final class GsonPreconditions {
    private GsonPreconditions() {
        throw new UnsupportedOperationException();
    }

    public static void checkArgument(boolean z) {
        if (z) {
            return;
        }
        w511.q();
    }

    @Deprecated
    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }
}
