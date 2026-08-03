package t9;

import com.onesignal.common.modeling.i;
import pc.j;
import pc.k;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class c extends i {

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class a extends k implements oc.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // oc.a
        public final String invoke() {
            return "";
        }
    }

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    public static final class b extends k implements oc.a {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // oc.a
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

    public final void setKey(String str) {
        j.e(str, "value");
        i.setStringProperty$default(this, "key", str, null, false, 12, null);
    }

    public final void setValue(Object obj) {
        j.e(obj, "value");
        i.setAnyProperty$default(this, "value", obj, null, true, 4, null);
    }
}
