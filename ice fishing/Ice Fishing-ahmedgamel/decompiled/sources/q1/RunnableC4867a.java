package q1;

import com.anythink.basead.webtemplet.a.c;
import com.anythink.basead.webtemplet.e;

/* renamed from: q1.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4867a implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40030n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f40031u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ e f40032v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f40033w;

    public /* synthetic */ RunnableC4867a(c cVar, e eVar, String str, int i) {
        this.f40030n = i;
        this.f40031u = cVar;
        this.f40032v = eVar;
        this.f40033w = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40030n) {
            case 0:
                this.f40031u.b(this.f40032v, this.f40033w);
                break;
            default:
                this.f40031u.a(this.f40032v, this.f40033w);
                break;
        }
    }
}
