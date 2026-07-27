package C2;

import com.google.android.gms.internal.ads.C3428jv;

/* loaded from: classes.dex */
public final /* synthetic */ class B implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f251n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f252u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f253v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f254w;

    public /* synthetic */ B(Object obj, boolean z3, boolean z6, int i) {
        this.f251n = i;
        this.f254w = obj;
        this.f252u = z3;
        this.f253v = z6;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f251n) {
            case 0:
                ((D) this.f254w).d(this.f252u, this.f253v);
                break;
            default:
                ((S0.c) ((C3428jv) this.f254w).f31347v).u(this.f252u, this.f253v);
                break;
        }
    }
}
