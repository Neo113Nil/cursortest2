package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.dj, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3118dj implements InterfaceC3950t8 {

    /* renamed from: n, reason: collision with root package name */
    public InterfaceC4084vh f30596n;

    /* renamed from: u, reason: collision with root package name */
    public final Executor f30597u;

    /* renamed from: v, reason: collision with root package name */
    public final C2880Xi f30598v;

    /* renamed from: w, reason: collision with root package name */
    public final V2.a f30599w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f30600x = false;

    /* renamed from: y, reason: collision with root package name */
    public boolean f30601y = false;

    /* renamed from: z, reason: collision with root package name */
    public final C2912Zi f30602z = new C2912Zi();

    public C3118dj(Executor executor, C2880Xi c2880Xi, V2.a aVar) {
        this.f30597u = executor;
        this.f30598v = c2880Xi;
        this.f30599w = aVar;
    }

    public final void a() {
        try {
            JSONObject n9 = this.f30598v.n(this.f30602z);
            if (this.f30596n != null) {
                this.f30597u.execute(new RunnableC3996u0(19, this, n9));
            }
        } catch (JSONException e9) {
            w2.z.l("Failed to call video active view js", e9);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3950t8
    public final void f(C3896s8 c3896s8) {
        boolean z6 = this.f30601y ? false : c3896s8.f34667j;
        C2912Zi c2912Zi = this.f30602z;
        c2912Zi.f29713a = z6;
        this.f30599w.getClass();
        c2912Zi.f29715c = SystemClock.elapsedRealtime();
        c2912Zi.f29717e = c3896s8;
        if (this.f30600x) {
            a();
        }
    }
}
