package U5;

import com.onesignal.common.modeling.l;
import com.onesignal.common.modeling.m;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;

/* loaded from: classes2.dex */
public class b extends m {

    public static final class a extends i implements I7.a {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // I7.a
        public final U5.a invoke() {
            return new U5.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(J4.b prefs) {
        super(new l(a.INSTANCE, c.IDENTITY_NAME_SPACE, prefs));
        h.e(prefs, "prefs");
    }
}
