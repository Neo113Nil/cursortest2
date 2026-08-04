package com.gamericefishpro.space.mg;

import com.gamericefishpro.space.i9.a4;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public enum d {
    DIRECT,
    INDIRECT,
    UNATTRIBUTED,
    DISABLED;

    private static final /* synthetic */ com.gamericefishpro.space.wh.a $ENTRIES = a4.t(values());
    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final d fromString(String str) {
            d dVar;
            if (str != null) {
                d[] dVarArrValues = d.values();
                int length = dVarArrValues.length - 1;
                if (length < 0) {
                    dVar = null;
                    break;
                }
                while (true) {
                    int i = length - 1;
                    dVar = dVarArrValues[length];
                    if (kotlin.text.d.g(dVar.name(), str, true)) {
                        break;
                    }
                    if (i < 0) {
                        dVar = null;
                        break;
                    }
                    length = i;
                }
                if (dVar != null) {
                    return dVar;
                }
            }
            return d.UNATTRIBUTED;
        }

        private a() {
        }
    }

    public static final d fromString(String str) {
        return Companion.fromString(str);
    }

    public static com.gamericefishpro.space.wh.a getEntries() {
        return $ENTRIES;
    }

    public final boolean isAttributed() {
        return isDirect() || isIndirect();
    }

    public final boolean isDirect() {
        return this == DIRECT;
    }

    public final boolean isDisabled() {
        return this == DISABLED;
    }

    public final boolean isIndirect() {
        return this == INDIRECT;
    }

    public final boolean isUnattributed() {
        return this == UNATTRIBUTED;
    }
}
