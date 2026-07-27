package com.iab.omid.library.toponad.adsession;

import com.anythink.expressad.foundation.g.a.f;
import com.onesignal.inAppMessages.internal.d;

/* loaded from: classes2.dex */
public enum AdSessionContextType {
    HTML(d.HTML),
    NATIVE(f.f19277a),
    JAVASCRIPT("javascript");

    private final String typeString;

    AdSessionContextType(String str) {
        this.typeString = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.typeString;
    }
}
