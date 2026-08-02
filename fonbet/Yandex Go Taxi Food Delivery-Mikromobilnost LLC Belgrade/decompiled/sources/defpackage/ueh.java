package defpackage;

import android.content.Context;
import androidx.media3.common.a;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes10.dex */
public final class ueh implements rf10 {
    public final teh a;
    public ipg b;
    public dlh c;
    public twy d;
    public final long e;
    public final long f;
    public final long g;
    public final float h;
    public final float i;
    public boolean j;

    public ueh(ipg ipgVar, e5p e5pVar) {
        this.b = ipgVar;
        dlh dlhVar = new dlh();
        this.c = dlhVar;
        teh tehVar = new teh(e5pVar, dlhVar);
        this.a = tehVar;
        if (ipgVar != ((ipg) tehVar.x)) {
            tehVar.x = ipgVar;
            ((HashMap) tehVar.c).clear();
            ((HashMap) tehVar.w).clear();
        }
        this.e = -9223372036854775807L;
        this.f = -9223372036854775807L;
        this.g = -9223372036854775807L;
        this.h = -3.4028235E38f;
        this.i = -3.4028235E38f;
        this.j = true;
    }

    public static rf10 a(Class cls, ipg ipgVar) {
        try {
            return (rf10) cls.getConstructor(ipg.class).newInstance(ipgVar);
        } catch (Exception e) {
            ny61.o(e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v15, types: [twy] */
    @Override // defpackage.rf10
    public final uf10 createMediaSource(fe10 fe10Var) {
        fe10Var.b.getClass();
        String scheme = fe10Var.b.a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            throw null;
        }
        boolean equals = Objects.equals(fe10Var.b.b, "application/x-image-uri");
        zd10 zd10Var = fe10Var.b;
        if (equals) {
            long j = zd10Var.f;
            int i = tw21.a;
            throw null;
        }
        int O = tw21.O(zd10Var.a, zd10Var.b);
        if (fe10Var.b.f != -9223372036854775807L) {
            e5p e5pVar = (e5p) this.a.b;
            if (e5pVar instanceof lbh) {
                lbh lbhVar = (lbh) e5pVar;
                synchronized (lbhVar) {
                    lbhVar.e = 1;
                }
            }
        }
        try {
            rf10 j2 = this.a.j(O);
            xd10 a = fe10Var.c.a();
            yd10 yd10Var = fe10Var.c;
            if (yd10Var.a == -9223372036854775807L) {
                a.a = this.e;
            }
            if (yd10Var.d == -3.4028235E38f) {
                a.d = this.h;
            }
            if (yd10Var.e == -3.4028235E38f) {
                a.e = this.i;
            }
            if (yd10Var.b == -9223372036854775807L) {
                a.b = this.f;
            }
            if (yd10Var.c == -9223372036854775807L) {
                a.c = this.g;
            }
            yd10 yd10Var2 = new yd10(a);
            if (!yd10Var2.equals(fe10Var.c)) {
                td10 td10Var = new td10(fe10Var);
                td10Var.k = yd10Var2.a();
                fe10Var = td10Var.a();
            }
            uf10 createMediaSource = j2.createMediaSource(fe10Var);
            ImmutableList immutableList = fe10Var.b.e;
            if (!immutableList.isEmpty()) {
                uf10[] uf10VarArr = new uf10[immutableList.size() + 1];
                uf10VarArr[0] = createMediaSource;
                if (immutableList.size() > 0) {
                    if (!this.j) {
                        ipg ipgVar = this.b;
                        ipgVar.getClass();
                        beh behVar = new beh();
                        ?? r9 = this.d;
                        if (r9 != 0) {
                            behVar = r9;
                        }
                        new bis0((de10) immutableList.get(0), ipgVar, behVar);
                        throw null;
                    }
                    f7s f7sVar = new f7s();
                    ((de10) immutableList.get(0)).getClass();
                    ArrayList arrayList = eh20.a;
                    f7sVar.m = null;
                    ((de10) immutableList.get(0)).getClass();
                    f7sVar.d = null;
                    ((de10) immutableList.get(0)).getClass();
                    f7sVar.e = 0;
                    ((de10) immutableList.get(0)).getClass();
                    f7sVar.f = 0;
                    ((de10) immutableList.get(0)).getClass();
                    f7sVar.b = null;
                    ((de10) immutableList.get(0)).getClass();
                    f7sVar.a = null;
                    a aVar = new a(f7sVar);
                    new rah();
                    new beh();
                    if (this.c.supportsFormat(aVar)) {
                        f7s a2 = aVar.a();
                        a2.m = eh20.q("application/x-media3-cues");
                        a2.j = aVar.n;
                        a2.I = this.c.a(aVar);
                        new a(a2);
                    }
                    ((de10) immutableList.get(0)).getClass();
                    throw null;
                }
                createMediaSource = new yr10(uf10VarArr);
            }
            wd10 wd10Var = fe10Var.e;
            if (wd10Var.a != Long.MIN_VALUE) {
                n3c n3cVar = new n3c(createMediaSource);
                d6z.x(!n3cVar.d);
                long j3 = wd10Var.a;
                d6z.x(!n3cVar.d);
                n3cVar.b = j3;
                d6z.x(!n3cVar.d);
                n3cVar.c = true;
                d6z.x(!n3cVar.d);
                d6z.x(!n3cVar.d);
                n3cVar.d = true;
                createMediaSource = new p3c(n3cVar);
            }
            fe10Var.b.getClass();
            fe10Var.b.getClass();
            return createMediaSource;
        } catch (ClassNotFoundException e) {
            ny61.o(e);
            return null;
        }
    }

    @Override // defpackage.rf10
    public final rf10 experimentalParseSubtitlesDuringExtraction(boolean z) {
        this.j = z;
        teh tehVar = this.a;
        tehVar.a = z;
        ((e5p) tehVar.b).a(z);
        Iterator it = ((HashMap) tehVar.w).values().iterator();
        while (it.hasNext()) {
            ((rf10) it.next()).experimentalParseSubtitlesDuringExtraction(z);
        }
        return this;
    }

    @Override // defpackage.rf10
    public final rf10 experimentalSetCodecsToParseWithinGopSampleDependencies(int i) {
        teh tehVar = this.a;
        tehVar.getClass();
        ((e5p) tehVar.b).e();
        return this;
    }

    @Override // defpackage.rf10
    public final int[] getSupportedTypes() {
        teh tehVar = this.a;
        tehVar.getClass();
        try {
            tehVar.r(0);
        } catch (ClassNotFoundException unused) {
        }
        try {
            tehVar.r(1);
        } catch (ClassNotFoundException unused2) {
        }
        try {
            tehVar.r(2);
        } catch (ClassNotFoundException unused3) {
        }
        try {
            tehVar.r(3);
        } catch (ClassNotFoundException unused4) {
        }
        try {
            tehVar.r(4);
        } catch (ClassNotFoundException unused5) {
        }
        return com.google.common.primitives.a.e(((HashMap) tehVar.c).keySet());
    }

    @Override // defpackage.rf10
    public final rf10 setDrmSessionManagerProvider(rmm rmmVar) {
        d6z.u(rmmVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        teh tehVar = this.a;
        tehVar.z = rmmVar;
        Iterator it = ((HashMap) tehVar.w).values().iterator();
        while (it.hasNext()) {
            ((rf10) it.next()).setDrmSessionManagerProvider(rmmVar);
        }
        return this;
    }

    @Override // defpackage.rf10
    public final rf10 setLoadErrorHandlingPolicy(twy twyVar) {
        d6z.u(twyVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.d = twyVar;
        teh tehVar = this.a;
        tehVar.A = twyVar;
        Iterator it = ((HashMap) tehVar.w).values().iterator();
        while (it.hasNext()) {
            ((rf10) it.next()).setLoadErrorHandlingPolicy(twyVar);
        }
        return this;
    }

    @Override // defpackage.rf10
    public final rf10 setSubtitleParserFactory(o2v0 o2v0Var) {
        dlh dlhVar = (dlh) o2v0Var;
        this.c = dlhVar;
        teh tehVar = this.a;
        tehVar.y = dlhVar;
        ((e5p) tehVar.b).d(dlhVar);
        Iterator it = ((HashMap) tehVar.w).values().iterator();
        while (it.hasNext()) {
            ((rf10) it.next()).setSubtitleParserFactory(o2v0Var);
        }
        return this;
    }

    public ueh(Context context, lbh lbhVar) {
        this(new l9h(context), lbhVar);
    }

    public ueh(Context context) {
        this(new l9h(context), new lbh());
    }
}
