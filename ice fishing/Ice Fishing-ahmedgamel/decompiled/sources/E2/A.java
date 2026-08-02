package E2;

import com.google.android.gms.internal.ads.C3451jv;

/* loaded from: classes.dex */
public final /* synthetic */ class A implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f711n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ boolean f712u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f713v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f714w;

    public /* synthetic */ A(Object obj, boolean z6, boolean z9, int i) {
        this.f711n = i;
        this.f714w = obj;
        this.f712u = z6;
        this.f713v = z9;
    }

    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f711n) {
            case 0:
                ((C) this.f714w).d(this.f712u, this.f713v);
                break;
            default:
                ((S0.c) ((C3451jv) this.f714w).f32126v).l(this.f712u, this.f713v);
                break;
        }
    }
}
