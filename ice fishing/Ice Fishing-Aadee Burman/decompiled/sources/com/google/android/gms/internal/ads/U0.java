package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class U0 implements InterfaceC3529lo {

    /* renamed from: n, reason: collision with root package name */
    public long f27844n;

    @Override // com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a */
    public void mo1a(Object obj) {
        C3534lt c3534lt;
        C3567mP c3567mP = (C3567mP) obj;
        C3836rP c3836rP = c3567mP.f31967b;
        if (c3567mP.equals(c3836rP.f33620h) && (c3534lt = c3836rP.f33623l) != null) {
            C3944tP c3944tP = (C3944tP) c3534lt.f31863u;
            c3944tP.f34288w1 = true;
            S0.l lVar = c3944tP.f34279l1;
            Handler handler = (Handler) lVar.f2797u;
            if (handler != null) {
                handler.post(new WO(lVar, this.f27844n));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [com.google.android.gms.internal.ads.cN] */
    /* JADX WARN: Type inference failed for: r9v7, types: [com.google.android.gms.internal.ads.cN] */
    public long b(ByteBuffer byteBuffer) {
        C4140x5 c4140x5;
        C4086w5 c4086w5;
        long j6 = this.f27844n;
        if (j6 > 0) {
            return j6;
        }
        try {
            ByteBuffer duplicate = byteBuffer.duplicate();
            duplicate.flip();
            C3978u5 c3978u5 = new C3978u5(new C2656Lg(duplicate), C2673Mg.f26304c);
            C2656Lg c2656Lg = c3978u5.f28876u;
            ArrayList arrayList = c3978u5.f28880y;
            if (c2656Lg != null && c3978u5.f28877v != ZM.f28874z) {
                arrayList = new C3028cN(arrayList, c3978u5);
            }
            Iterator it = arrayList.iterator();
            while (true) {
                c4140x5 = null;
                if (!it.hasNext()) {
                    c4086w5 = null;
                    break;
                }
                InterfaceC4032v5 interfaceC4032v5 = (InterfaceC4032v5) it.next();
                if (interfaceC4032v5 instanceof C4086w5) {
                    c4086w5 = (C4086w5) interfaceC4032v5;
                    break;
                }
            }
            C2656Lg c2656Lg2 = c4086w5.f28876u;
            ArrayList arrayList2 = c4086w5.f28880y;
            if (c2656Lg2 != null && c4086w5.f28877v != ZM.f28874z) {
                arrayList2 = new C3028cN(arrayList2, c4086w5);
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                InterfaceC4032v5 interfaceC4032v52 = (InterfaceC4032v5) it2.next();
                if (interfaceC4032v52 instanceof C4140x5) {
                    c4140x5 = (C4140x5) interfaceC4032v52;
                    break;
                }
            }
            long j9 = (c4140x5.f34954F * 1000) / c4140x5.f34953E;
            this.f27844n = j9;
            return j9;
        } catch (IOException | RuntimeException unused) {
            return 0L;
        }
    }
}
