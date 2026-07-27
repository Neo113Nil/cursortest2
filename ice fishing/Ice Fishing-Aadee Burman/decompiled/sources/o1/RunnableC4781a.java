package o1;

import com.anythink.basead.webtemplet.a.c;
import com.anythink.basead.webtemplet.e;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4781a implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39547n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f39548u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e f39549v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f39550w;

    public /* synthetic */ RunnableC4781a(c cVar, e eVar, String str, int i) {
        this.f39547n = i;
        this.f39548u = cVar;
        this.f39549v = eVar;
        this.f39550w = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39547n) {
            case 0:
                this.f39548u.b(this.f39549v, this.f39550w);
                break;
            default:
                this.f39548u.a(this.f39549v, this.f39550w);
                break;
        }
    }
}
