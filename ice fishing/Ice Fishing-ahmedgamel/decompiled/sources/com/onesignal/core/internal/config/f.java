package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.i;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class f extends i {

    public static final class a extends kotlin.jvm.internal.i implements I7.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // I7.a
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i parentModel, String parentProperty) {
        super(parentModel, parentProperty);
        h.e(parentModel, "parentModel");
        h.e(parentProperty, "parentProperty");
    }

    public final M4.c getLogLevel() {
        Object optAnyProperty$default = i.getOptAnyProperty$default(this, "logLevel", null, 2, null);
        return (M4.c) (optAnyProperty$default != null ? optAnyProperty$default instanceof M4.c ? (Enum) optAnyProperty$default : optAnyProperty$default instanceof String ? M4.c.valueOf((String) optAnyProperty$default) : (M4.c) optAnyProperty$default : null);
    }

    public final boolean isEnabled() {
        return getBooleanProperty("isEnabled", a.INSTANCE);
    }

    public final void setEnabled(boolean z6) {
        i.setBooleanProperty$default(this, "isEnabled", z6, null, false, 12, null);
    }

    public final void setLogLevel(M4.c cVar) {
        setOptAnyProperty("logLevel", cVar != null ? cVar.toString() : null, "NORMAL", false);
    }
}
