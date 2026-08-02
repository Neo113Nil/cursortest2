package defpackage;

import android.content.Context;
import com.yandex.pulse.mvi.a;
import io.appmetrica.analytics.impl.Ff;
import io.appmetrica.analytics.impl.Hf;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* loaded from: classes.dex */
public final class nh implements Runnable {
    public final /* synthetic */ int a = 2;
    public final long b;
    public final Object c;
    public final Object d;

    /* JADX WARN: Multi-variable type inference failed */
    public nh(fgc fgcVar, long j, Function0 function0) {
        this.c = fgcVar;
        this.b = j;
        this.d = (uif) function0;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [kotlin.jvm.functions.Function0, uif] */
    @Override // java.lang.Runnable
    public final void run() {
        sj sjVar;
        double d;
        switch (this.a) {
            case 0:
                if (!bp6.a.contains(this)) {
                    try {
                        String str = oh.a;
                        sj sjVar2 = oh.f;
                        Long l = sjVar2 != null ? (Long) sjVar2.e : null;
                        if (oh.f == null) {
                            oh.f = new sj(Long.valueOf(this.b), null);
                            String str2 = (String) this.c;
                            String str3 = oh.h;
                            Context context = (Context) this.d;
                            context.getClass();
                            imp.N(context, str2, str3);
                        } else if (l != null) {
                            long longValue = this.b - l.longValue();
                            if (longValue > (q8c.b(j3c.c()) != null ? r0.b : 60) * 1000) {
                                imp.S((String) this.c, oh.f, oh.h);
                                String str4 = (String) this.c;
                                String str5 = oh.h;
                                Context context2 = (Context) this.d;
                                context2.getClass();
                                imp.N(context2, str4, str5);
                                oh.f = new sj(Long.valueOf(this.b), null);
                            } else if (longValue > 1000 && (sjVar = oh.f) != null) {
                                sjVar.a++;
                            }
                        }
                        sj sjVar3 = oh.f;
                        if (sjVar3 != null) {
                            sjVar3.e = Long.valueOf(this.b);
                        }
                        sj sjVar4 = oh.f;
                        if (sjVar4 != null) {
                            sjVar4.s();
                            break;
                        }
                    } catch (Throwable th) {
                        bp6.a(this, th);
                        return;
                    }
                }
                break;
            case 1:
                ((fgc) this.c).a.postDelayed(this, this.b);
                ((uif) this.d).invoke();
                break;
            default:
                cai caiVar = (cai) this.c;
                long j = this.b;
                List list = (List) ((zqr) this.d).get();
                if (list.isEmpty()) {
                    d = -1.0d;
                } else {
                    int binarySearch = Collections.binarySearch(list, new luo(j, 0.0d), new mj(28));
                    if (binarySearch >= 0) {
                        d = ((luo) list.get(binarySearch)).b;
                    } else {
                        int i = -binarySearch;
                        int i2 = i - 1;
                        if (i2 <= 0) {
                            d = ((luo) list.get(0)).b;
                        } else if (i2 >= list.size()) {
                            d = ((luo) list.get(list.size() - 1)).b;
                        } else {
                            luo luoVar = (luo) list.get(i - 2);
                            luo luoVar2 = (luo) list.get(i2);
                            long j2 = luoVar.a;
                            double d2 = luoVar.b;
                            d = ((luoVar2.b - d2) * ((j - j2) / (luoVar2.a - j2))) + d2;
                        }
                    }
                }
                final double d3 = d;
                final eai eaiVar = caiVar.a;
                final String str6 = caiVar.b;
                final long j3 = caiVar.c;
                final String str7 = caiVar.d;
                final String str8 = caiVar.e;
                boolean z = caiVar.f;
                Runnable runnable = new Runnable() { // from class: dai
                    @Override // java.lang.Runnable
                    public final void run() {
                        eai eaiVar2 = eai.this;
                        Ff ff = eaiVar2.a;
                        Hf hf = eaiVar2.r;
                        String str9 = str6;
                        long j4 = j3;
                        double d4 = d3;
                        ff.reportKeyMetric(hf, str9, j4, d4, str7, str8);
                        iz7 iz7Var = eaiVar2.p;
                        if (((e4i) iz7Var.f) == null) {
                            iz7Var.f = (e4i) ((a) iz7Var.l).get();
                        }
                        ((e4i) iz7Var.f).e(d4, str9);
                    }
                };
                if (!z) {
                    eaiVar.e.post(runnable);
                    break;
                } else {
                    runnable.run();
                    break;
                }
        }
    }

    public nh(Context context, String str, long j) {
        this.b = j;
        this.c = str;
        this.d = context;
    }

    public nh(long j, zqr zqrVar, cai caiVar) {
        this.b = j;
        this.d = zqrVar;
        this.c = caiVar;
    }
}
