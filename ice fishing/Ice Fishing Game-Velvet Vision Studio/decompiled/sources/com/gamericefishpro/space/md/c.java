package com.gamericefishpro.space.md;

import com.gamericefishpro.space.i9.a4;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public enum c {
    NONE,
    FATAL,
    ERROR,
    WARN,
    INFO,
    DEBUG,
    VERBOSE;

    private static final /* synthetic */ com.gamericefishpro.space.wh.a $ENTRIES = a4.t(values());
    public static final a Companion = new a(null);

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c fromInt(int i) {
            return c.values()[i];
        }

        private a() {
        }
    }

    public static final c fromInt(int i) {
        return Companion.fromInt(i);
    }

    public static com.gamericefishpro.space.wh.a getEntries() {
        return $ENTRIES;
    }
}
