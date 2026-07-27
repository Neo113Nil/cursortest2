package o1;

import android.webkit.WebView;
import com.anythink.basead.webtemplet.a.c;
import com.anythink.basead.webtemplet.e;

/* renamed from: o1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4827b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f39682n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f39683u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f39684v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f39685w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f39686x;

    public /* synthetic */ RunnableC4827b(c cVar, Object obj, String str, String str2, int i) {
        this.f39682n = i;
        this.f39683u = cVar;
        this.f39686x = obj;
        this.f39684v = str;
        this.f39685w = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f39682n) {
            case 0:
                this.f39683u.b((WebView) this.f39686x, this.f39684v, this.f39685w);
                break;
            default:
                this.f39683u.b((e) this.f39686x, this.f39684v, this.f39685w);
                break;
        }
    }
}
