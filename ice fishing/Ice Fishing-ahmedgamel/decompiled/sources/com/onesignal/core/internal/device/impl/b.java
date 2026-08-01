package com.onesignal.core.internal.device.impl;

import C4.d;
import a.AbstractC0422a;
import java.util.UUID;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import u7.InterfaceC5087e;
import z7.InterfaceC5267d;

/* loaded from: classes2.dex */
public final class b implements d {
    private final J4.b _prefs;
    private final InterfaceC5087e currentId$delegate;

    public static final class a extends i implements I7.a {
        public a() {
            super(0);
        }

        @Override // I7.a
        public final UUID invoke() {
            String string$default = J4.a.getString$default(b.this._prefs, com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_INSTALL_ID", null, 4, null);
            if (string$default != null) {
                return UUID.fromString(string$default);
            }
            UUID randomUUID = UUID.randomUUID();
            b.this._prefs.saveString(com.onesignal.common.threading.b.BASE_THREAD_NAME, "PREFS_OS_INSTALL_ID", randomUUID.toString());
            return randomUUID;
        }
    }

    public b(J4.b _prefs) {
        h.e(_prefs, "_prefs");
        this._prefs = _prefs;
        this.currentId$delegate = AbstractC0422a.q(new a());
    }

    private final UUID getCurrentId() {
        Object value = this.currentId$delegate.getValue();
        h.d(value, "getValue(...)");
        return (UUID) value;
    }

    @Override // C4.d
    public Object getId(InterfaceC5267d interfaceC5267d) {
        return getCurrentId();
    }
}
