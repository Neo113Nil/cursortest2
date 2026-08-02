package yads;

import android.os.Handler;
import android.os.Message;
import com.monetization.ads.exo.source.dash.c;
import defpackage.dh81;
import defpackage.lz71;
import defpackage.rf71;
import defpackage.uo81;
import defpackage.xi71;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes7.dex */
public final class yc2 implements Handler.Callback {
    public final xi71 b;
    public final c c;
    public dh81 g;
    public boolean h;
    public boolean i;
    public boolean j;
    public final TreeMap f = new TreeMap();
    public final Handler e = rf71.i(this);
    public final lz71 d = new lz71();

    public yc2(dh81 dh81Var, c cVar, xi71 xi71Var) {
        this.g = dh81Var;
        this.c = cVar;
        this.b = xi71Var;
    }

    public final boolean a(long j) {
        boolean z;
        dh81 dh81Var = this.g;
        if (!dh81Var.d) {
            return false;
        }
        if (this.i) {
            return true;
        }
        Map.Entry ceilingEntry = this.f.ceilingEntry(Long.valueOf(dh81Var.h));
        if (ceilingEntry == null || ((Long) ceilingEntry.getValue()).longValue() >= j) {
            z = false;
        } else {
            long longValue = ((Long) ceilingEntry.getKey()).longValue();
            com.monetization.ads.exo.source.dash.i iVar = this.c.a;
            long j2 = iVar.N;
            if (j2 == -9223372036854775807L || j2 < longValue) {
                iVar.N = longValue;
            }
            z = true;
        }
        if (z && this.h) {
            this.i = true;
            this.h = false;
            com.monetization.ads.exo.source.dash.i iVar2 = this.c.a;
            iVar2.D.removeCallbacks(iVar2.w);
            iVar2.h();
        }
        return z;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.j) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        uo81 uo81Var = (uo81) message.obj;
        long j = uo81Var.a;
        long j2 = uo81Var.b;
        Long l = (Long) this.f.get(Long.valueOf(j2));
        if (l == null) {
            this.f.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.f.put(Long.valueOf(j2), Long.valueOf(j));
        }
        return true;
    }
}
