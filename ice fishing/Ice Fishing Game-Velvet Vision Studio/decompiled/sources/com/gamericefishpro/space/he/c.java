package com.gamericefishpro.space.he;

import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.fc.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i {

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends l implements Function0 {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final String invoke() {
            return "";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class b extends l implements Function0 {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return "";
        }
    }

    public c() {
        super(null, null, 3, null);
    }

    public final String getKey() {
        return getStringProperty("key", a.INSTANCE);
    }

    public final Object getValue() {
        return getAnyProperty("value", b.INSTANCE);
    }

    public final void setKey(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        i.setStringProperty$default(this, "key", value, null, false, 12, null);
    }

    public final void setValue(Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        i.setAnyProperty$default(this, "value", value, null, true, 4, null);
    }
}
