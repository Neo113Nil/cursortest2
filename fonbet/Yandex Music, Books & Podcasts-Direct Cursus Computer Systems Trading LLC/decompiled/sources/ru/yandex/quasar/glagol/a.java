package ru.yandex.quasar.glagol;

import defpackage.mdk;

/* loaded from: classes6.dex */
public interface a {
    mdk getNextPayload(boolean z);

    mdk getPingPayload();

    mdk getPlayMusicPayload(String str, String str2, double d, String str3, Integer num, String str4);

    mdk getPlayPayload();

    mdk getPrevPayload(boolean z, boolean z2);

    mdk getRewindPayload(double d);

    mdk getSetVolumePayload(Double d);

    mdk getStopPayload();
}
