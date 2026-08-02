package com.knotapi.knot.interfaces;

import com.knotapi.knot.models.KnotError;
import com.knotapi.knot.models.KnotEvent;

/* loaded from: classes4.dex */
public interface KnotEventDelegate {
    void onError(KnotError knotError);

    void onEvent(KnotEvent knotEvent);

    void onExit();

    void onSuccess(String str);
}
