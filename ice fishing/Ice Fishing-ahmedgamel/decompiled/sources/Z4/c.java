package Z4;

import com.onesignal.common.modeling.i;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public final class c extends i {

    public static final class a extends kotlin.jvm.internal.i implements I7.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // I7.a
        public final String invoke() {
            return "";
        }
    }

    public static final class b extends kotlin.jvm.internal.i implements I7.a {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // I7.a
        public final Object invoke() {
            return "";
        }
    }

    public c() {
        super(null, null, 3, null);
    }

    public final String getKey() {
        return getStringProperty("key", a.INSTANCE);
    }

    public final Object getValue() {
        return getAnyProperty("value", b.INSTANCE);
    }

    public final void setKey(String value) {
        h.e(value, "value");
        i.setStringProperty$default(this, "key", value, null, false, 12, null);
    }

    public final void setValue(Object value) {
        h.e(value, "value");
        i.setAnyProperty$default(this, "value", value, null, true, 4, null);
    }
}
