package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.f4;
import defpackage.gp;
import defpackage.hp;
import defpackage.iu;
import defpackage.kp;
import defpackage.o10;
import defpackage.t90;
import defpackage.w90;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements o10 {
    @Override // defpackage.o10
    public final List GWasM1elztuh() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // defpackage.o10
    public final Object Yi7zF1RB1(Context context) {
        Object obj;
        iu iuVar = new iu(new kp(context, 0));
        iuVar.Yi7zF1RB1 = 1;
        if (gp.rQPn8YBR == null) {
            synchronized (gp.JFJ3QoxA) {
                try {
                    if (gp.rQPn8YBR == null) {
                        gp.rQPn8YBR = new gp(iuVar);
                    }
                } finally {
                }
            }
        }
        f4 AvO7iQsrTN = f4.AvO7iQsrTN(context);
        AvO7iQsrTN.getClass();
        synchronized (f4.EljAMC1QTz) {
            try {
                obj = ((HashMap) AvO7iQsrTN.Yi7zF1RB1).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = AvO7iQsrTN.xqGvceK5x(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        w90 AvO7iQsrTN2 = ((t90) obj).AvO7iQsrTN();
        AvO7iQsrTN2.GWasM1elztuh(new hp(this, AvO7iQsrTN2));
        return Boolean.TRUE;
    }
}
