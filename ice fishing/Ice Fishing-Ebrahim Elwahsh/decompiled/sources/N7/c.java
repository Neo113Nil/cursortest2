package N7;

import W2.e;
import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ c[] f2203A;

    /* renamed from: u, reason: collision with root package name */
    public static final c f2204u;

    /* renamed from: v, reason: collision with root package name */
    public static final c f2205v;

    /* renamed from: w, reason: collision with root package name */
    public static final c f2206w;

    /* renamed from: x, reason: collision with root package name */
    public static final c f2207x;

    /* renamed from: y, reason: collision with root package name */
    public static final c f2208y;

    /* renamed from: z, reason: collision with root package name */
    public static final c f2209z;

    /* renamed from: n, reason: collision with root package name */
    public final TimeUnit f2210n;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f2204u = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f2205v = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        f2206w = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f2207x = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f2208y = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        f2209z = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f2203A = cVarArr;
        e.d(cVarArr);
    }

    public c(String str, int i, TimeUnit timeUnit) {
        this.f2210n = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f2203A.clone();
    }
}
