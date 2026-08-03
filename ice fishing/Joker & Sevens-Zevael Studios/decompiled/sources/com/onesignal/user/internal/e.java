package com.onesignal.user.internal;

import ob.g;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class e extends b {
    public static final a Companion = new a(null);

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a {
        public /* synthetic */ a(pc.f fVar) {
            this();
        }

        public final ob.d createFakePushSub() {
            ob.d dVar = new ob.d();
            dVar.setId("");
            dVar.setType(g.PUSH);
            dVar.setOptedIn(false);
            dVar.setAddress("");
            return dVar;
        }

        private a() {
        }
    }

    public e() {
        super(Companion.createFakePushSub());
    }
}
