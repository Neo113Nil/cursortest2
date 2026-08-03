package com.onesignal.core.internal.device.impl;

import ac.f;
import bc.a0;
import java.util.UUID;
import pc.j;
import pc.k;
import v8.d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements d {
    private final c9.b _prefs;
    private final f currentId$delegate;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends k implements oc.a {
        public a() {
            super(0);
        }

        @Override // oc.a
        public final UUID invoke() {
            String string$default = c9.a.getString$default(b.this._prefs, "OneSignal", "PREFS_OS_INSTALL_ID", null, 4, null);
            if (string$default != null) {
                return UUID.fromString(string$default);
            }
            UUID randomUUID = UUID.randomUUID();
            b.this._prefs.saveString("OneSignal", "PREFS_OS_INSTALL_ID", randomUUID.toString());
            return randomUUID;
        }
    }

    public b(c9.b bVar) {
        j.e(bVar, "_prefs");
        this._prefs = bVar;
        this.currentId$delegate = a0.y(new a());
    }

    private final UUID getCurrentId() {
        Object value = this.currentId$delegate.getValue();
        j.d(value, "<get-currentId>(...)");
        return (UUID) value;
    }

    @Override // v8.d
    public Object getId(fc.d dVar) {
        return getCurrentId();
    }
}
