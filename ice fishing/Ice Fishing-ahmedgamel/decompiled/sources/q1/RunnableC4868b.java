package q1;

import android.webkit.WebView;
import com.anythink.basead.webtemplet.a.c;
import com.anythink.basead.webtemplet.e;

/* renamed from: q1.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4868b implements Runnable {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f40034n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c f40035u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f40036v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f40037w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f40038x;

    public /* synthetic */ RunnableC4868b(c cVar, Object obj, String str, String str2, int i) {
        this.f40034n = i;
        this.f40035u = cVar;
        this.f40038x = obj;
        this.f40036v = str;
        this.f40037w = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f40034n) {
            case 0:
                this.f40035u.b((WebView) this.f40038x, this.f40036v, this.f40037w);
                break;
            default:
                this.f40035u.b((e) this.f40038x, this.f40036v, this.f40037w);
                break;
        }
    }
}
