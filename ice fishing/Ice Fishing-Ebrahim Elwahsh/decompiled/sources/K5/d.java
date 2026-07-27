package K5;

import com.onesignal.common.modeling.l;
import com.onesignal.common.modeling.m;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;

/* loaded from: classes2.dex */
public class d extends m {

    public static final class a extends i implements E7.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // E7.a
        public final c invoke() {
            return new c();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(F4.b prefs) {
        super(new l(a.INSTANCE, "session", prefs));
        h.e(prefs, "prefs");
    }
}
