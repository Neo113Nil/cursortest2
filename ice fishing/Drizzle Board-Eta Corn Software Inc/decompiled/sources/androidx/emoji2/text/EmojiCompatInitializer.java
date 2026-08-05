package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import defpackage.af;
import defpackage.f0;
import defpackage.k0;
import defpackage.um;
import defpackage.vh;
import defpackage.vo;
import defpackage.xo;
import defpackage.ze;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements um {
    @Override // defpackage.um
    public final Object NCTxEWno(Context context) {
        Object obj;
        vh vhVar = new vh(new k0(context));
        vhVar.qoPGr6Ce = 1;
        if (ze.k3x7lurq == null) {
            synchronized (ze.eVhOlqcC) {
                try {
                    if (ze.k3x7lurq == null) {
                        ze.k3x7lurq = new ze(vhVar);
                    }
                } finally {
                }
            }
        }
        f0 Ey6iv0m0 = f0.Ey6iv0m0(context);
        Ey6iv0m0.getClass();
        synchronized (f0.b2ZJblxo) {
            try {
                obj = ((HashMap) Ey6iv0m0.MdtA4re8).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = Ey6iv0m0.OnDfzHZD(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        xo b2ZJblxo = ((vo) obj).b2ZJblxo();
        b2ZJblxo.qoPGr6Ce(new af(this, b2ZJblxo));
        return Boolean.TRUE;
    }

    @Override // defpackage.um
    public final List qoPGr6Ce() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
