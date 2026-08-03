package com.onesignal.location.internal;

import fc.d;
import pc.f;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class b implements u9.a {
    public static final a Companion = new a(null);

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(f fVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Exception getEXCEPTION() {
            return new Exception("Must include gradle module com.onesignal:Location in order to use this functionality!");
        }

        private a() {
        }
    }

    @Override // u9.a
    public boolean isShared() {
        throw Companion.getEXCEPTION();
    }

    @Override // u9.a
    public Object requestPermission(d dVar) {
        throw Companion.getEXCEPTION();
    }

    @Override // u9.a
    public void setShared(boolean z10) {
        throw Companion.getEXCEPTION();
    }
}
