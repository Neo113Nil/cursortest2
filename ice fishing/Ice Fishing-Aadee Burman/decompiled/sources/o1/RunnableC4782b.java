package o1;

import android.webkit.WebView;
import com.anythink.basead.webtemplet.a.c;
import com.anythink.basead.webtemplet.e;

/* renamed from: o1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4782b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39551n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f39552u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f39553v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f39554w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f39555x;

    public /* synthetic */ RunnableC4782b(c cVar, Object obj, String str, String str2, int i) {
        this.f39551n = i;
        this.f39552u = cVar;
        this.f39555x = obj;
        this.f39553v = str;
        this.f39554w = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39551n) {
            case 0:
                this.f39552u.b((WebView) this.f39555x, this.f39553v, this.f39554w);
                break;
            default:
                this.f39552u.b((e) this.f39555x, this.f39553v, this.f39554w);
                break;
        }
    }
}
