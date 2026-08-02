package ru.yandex.quasar.glagol;

import defpackage.unl;

/* loaded from: classes6.dex */
public interface State {

    public enum AliceState {
        IDLE,
        BUSY,
        LISTENING,
        SHAZAM,
        SPEAKING,
        UNKNOWN
    }

    unl getPlayerState();

    Long getTimeSinceLastVoiceActivity();

    Double getVolume();
}
