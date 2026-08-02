package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufStateStorage;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes9.dex */
public final class Dp implements Gp {
    public volatile Bp a;
    public final CopyOnWriteArrayList b = new CopyOnWriteArrayList();

    public final void a(Context context) {
        String optStringOrNull;
        ProtobufStateStorage<Object> create = ((AbstractC0576nq) C0518lq.a(Fp.class)).create(context);
        Zr a = Jb.k().D().a();
        synchronized (a) {
            optStringOrNull = JsonUtils.optStringOrNull(a.a.a(), MetaDataField.DEVICE_ID_FIELD);
        }
        a(new Bp(optStringOrNull, a.a(), (Fp) create.read()));
    }

    public final void b(Gp gp) {
        this.b.remove(gp);
    }

    public final Bp a() {
        Bp bp = this.a;
        if (bp == null) {
            return null;
        }
        return bp;
    }

    public final void a(Gp gp) {
        this.b.add(gp);
        if (this.a != null) {
            Bp bp = this.a;
            if (bp == null) {
                bp = null;
            }
            gp.a(bp);
        }
    }

    @Override // io.appmetrica.analytics.impl.Gp
    public final void a(Bp bp) {
        this.a = bp;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            ((Gp) it.next()).a(bp);
        }
    }
}
