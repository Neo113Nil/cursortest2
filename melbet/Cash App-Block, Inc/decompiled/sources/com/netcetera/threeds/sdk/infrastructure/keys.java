package com.netcetera.threeds.sdk.infrastructure;

import android.content.Intent;
import android.net.Uri;

/* loaded from: classes5.dex */
public final class keys {
    private static int getWarnings = 1;
    private static int initialize;
    private final Uri ThreeDS2Service;

    public static class getWarnings {
        private static int get = 0;
        private static int initialize = 1;
        private Uri ThreeDS2ServiceInstance;

        public getWarnings T_(Intent intent) {
            int i = get + 53;
            int i2 = i % 128;
            initialize = i2;
            if (i % 2 == 0) {
                throw null;
            }
            if (intent != null) {
                int i3 = (i2 & (-46)) | ((~i2) & 45);
                int i4 = -(-((i2 & 45) << 1));
                get = (((i3 | i4) << 1) - (i3 ^ i4)) % 128;
                this.ThreeDS2ServiceInstance = intent.getData();
                int i5 = initialize;
                int i6 = i5 & 75;
                int i7 = -(-((i5 ^ 75) | i6));
                get = ((i6 & i7) + (i7 | i6)) % 128;
            }
            int i8 = get;
            int i9 = ((i8 | 103) << 1) - (i8 ^ 103);
            initialize = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 62 / 0;
            }
            return this;
        }

        public keys ThreeDS2ServiceInstance() {
            keys keysVar = new keys(this.ThreeDS2ServiceInstance);
            int i = get;
            int i2 = i & 27;
            int i3 = (((i | 27) & (~i2)) - (~(i2 << 1))) - 1;
            initialize = i3 % 128;
            if (i3 % 2 != 0) {
                return keysVar;
            }
            throw null;
        }
    }

    private keys(Uri uri) {
        this.ThreeDS2Service = uri;
    }

    public Uri S_() {
        int i = initialize;
        Uri uri = this.ThreeDS2Service;
        int i2 = i & 85;
        int i3 = (i ^ 85) | i2;
        int i4 = (i2 & i3) + (i3 | i2);
        getWarnings = i4 % 128;
        if (i4 % 2 != 0) {
            return uri;
        }
        throw null;
    }
}
