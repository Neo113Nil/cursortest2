package com.google.android.play.core.integrity;

import bo.app.a$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class i {
    public long a;
    public byte c;

    public final k build() {
        if (this.c == 3) {
            return new k(this.a);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.c & 1) == 0) {
            sb.append(" cloudProjectNumber");
        }
        if ((this.c & 2) == 0) {
            sb.append(" webViewRequestMode");
        }
        a$$ExternalSyntheticBUOutline0.m$1("Missing required properties:".concat(sb.toString()));
        return null;
    }
}
