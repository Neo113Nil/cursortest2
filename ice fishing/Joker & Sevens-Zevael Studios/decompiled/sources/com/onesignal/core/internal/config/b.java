package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.l;
import com.onesignal.common.modeling.m;
import pc.j;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public class b extends m {

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends k implements oc.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // oc.a
        public final com.onesignal.core.internal.config.a invoke() {
            return new com.onesignal.core.internal.config.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c9.b bVar) {
        super(new l(a.INSTANCE, "config", bVar));
        j.e(bVar, "prefs");
    }
}
