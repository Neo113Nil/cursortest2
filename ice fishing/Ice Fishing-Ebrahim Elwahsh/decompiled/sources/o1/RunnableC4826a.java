package o1;

import com.anythink.basead.webtemplet.a.c;
import com.anythink.basead.webtemplet.e;

/* renamed from: o1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4826a implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39678n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f39679u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e f39680v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f39681w;

    public /* synthetic */ RunnableC4826a(c cVar, e eVar, String str, int i) {
        this.f39678n = i;
        this.f39679u = cVar;
        this.f39680v = eVar;
        this.f39681w = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39678n) {
            case 0:
                this.f39679u.b(this.f39680v, this.f39681w);
                break;
            default:
                this.f39679u.a(this.f39680v, this.f39681w);
                break;
        }
    }
}
