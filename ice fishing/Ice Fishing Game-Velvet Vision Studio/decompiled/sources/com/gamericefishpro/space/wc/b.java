package com.gamericefishpro.space.wc;

import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.oh.h;
import com.gamericefishpro.space.oh.i;
import com.gamericefishpro.space.vc.d;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements d {
    private final com.gamericefishpro.space.gd.b _prefs;
    private final h currentId$delegate;

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a extends l implements Function0 {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final UUID invoke() {
            String string$default = com.gamericefishpro.space.gd.a.getString$default(b.this._prefs, "OneSignal", "PREFS_OS_INSTALL_ID", null, 4, null);
            if (string$default != null) {
                return UUID.fromString(string$default);
            }
            UUID uuidRandomUUID = UUID.randomUUID();
            b.this._prefs.saveString("OneSignal", "PREFS_OS_INSTALL_ID", uuidRandomUUID.toString());
            return uuidRandomUUID;
        }
    }

    public b(com.gamericefishpro.space.gd.b _prefs) {
        Intrinsics.checkNotNullParameter(_prefs, "_prefs");
        this._prefs = _prefs;
        this.currentId$delegate = i.b(new a());
    }

    private final UUID getCurrentId() {
        Object value = this.currentId$delegate.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (UUID) value;
    }

    @Override // com.gamericefishpro.space.vc.d
    public Object getId(com.gamericefishpro.space.th.a aVar) {
        return getCurrentId();
    }
}
