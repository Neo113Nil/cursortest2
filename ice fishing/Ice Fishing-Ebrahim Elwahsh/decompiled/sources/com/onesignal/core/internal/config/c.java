package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.l;
import com.onesignal.common.modeling.m;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;

/* loaded from: classes2.dex */
public class c extends m {

    public static final class a extends i implements E7.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // E7.a
        public final b invoke() {
            return new b();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(F4.b prefs) {
        super(new l(a.INSTANCE, com.anythink.expressad.foundation.g.g.a.b.ai, prefs));
        h.e(prefs, "prefs");
    }
}
