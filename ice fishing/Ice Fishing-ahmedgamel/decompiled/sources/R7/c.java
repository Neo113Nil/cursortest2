package R7;

import java.util.concurrent.TimeUnit;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: A, reason: collision with root package name */
    public static final /* synthetic */ c[] f2890A;

    /* renamed from: u, reason: collision with root package name */
    public static final c f2891u;

    /* renamed from: v, reason: collision with root package name */
    public static final c f2892v;

    /* renamed from: w, reason: collision with root package name */
    public static final c f2893w;

    /* renamed from: x, reason: collision with root package name */
    public static final c f2894x;

    /* renamed from: y, reason: collision with root package name */
    public static final c f2895y;

    /* renamed from: z, reason: collision with root package name */
    public static final c f2896z;

    /* renamed from: n, reason: collision with root package name */
    public final TimeUnit f2897n;

    static {
        c cVar = new c("NANOSECONDS", 0, TimeUnit.NANOSECONDS);
        f2891u = cVar;
        c cVar2 = new c("MICROSECONDS", 1, TimeUnit.MICROSECONDS);
        c cVar3 = new c("MILLISECONDS", 2, TimeUnit.MILLISECONDS);
        f2892v = cVar3;
        c cVar4 = new c("SECONDS", 3, TimeUnit.SECONDS);
        f2893w = cVar4;
        c cVar5 = new c("MINUTES", 4, TimeUnit.MINUTES);
        f2894x = cVar5;
        c cVar6 = new c("HOURS", 5, TimeUnit.HOURS);
        f2895y = cVar6;
        c cVar7 = new c("DAYS", 6, TimeUnit.DAYS);
        f2896z = cVar7;
        c[] cVarArr = {cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7};
        f2890A = cVarArr;
        X2.a.h(cVarArr);
    }

    public c(String str, int i, TimeUnit timeUnit) {
        this.f2897n = timeUnit;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f2890A.clone();
    }
}
