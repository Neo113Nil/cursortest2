package com.google.android.gms.common.api;

import coil3.size.DimensionKt;

/* loaded from: classes.dex */
public final class Api {
    public final DimensionKt zaa;
    public final ClientKey zab;
    public final String zac;

    public interface ApiOptions {
        public static final NoOptions NO_OPTIONS = new NoOptions();

        public final class NoOptions implements NotRequiredOptions {
        }

        public interface NotRequiredOptions extends ApiOptions {
        }
    }

    public final class ClientKey {
    }

    public Api(String str, DimensionKt dimensionKt, ClientKey clientKey) {
        this.zac = str;
        this.zaa = dimensionKt;
        this.zab = clientKey;
    }
}
