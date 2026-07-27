package androidx.emoji2.text;

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import y1.C5227b;
import y1.C5240o;
import y1.InterfaceC5232g;
import y1.InterfaceC5244s;
import y1.InterfaceC5245t;
import y1.y;

/* loaded from: classes.dex */
public final class l implements i, N1.i, InterfaceC5245t, InterfaceC5232g {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f4898n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f4899u;

    public /* synthetic */ l(Context context, int i) {
        this.f4898n = i;
        this.f4899u = context;
    }

    @Override // y1.InterfaceC5232g
    public Class a() {
        return InputStream.class;
    }

    @Override // y1.InterfaceC5232g
    public Object b(Resources resources, int i, Resources.Theme theme) {
        return resources.openRawResource(i);
    }

    @Override // androidx.emoji2.text.i
    public void c(S0.f fVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new a7.b(this, fVar, threadPoolExecutor, 2));
    }

    @Override // y1.InterfaceC5232g
    public void d(Object obj) {
        ((InputStream) obj).close();
    }

    @Override // N1.i
    public Object get() {
        return (ConnectivityManager) this.f4899u.getSystemService("connectivity");
    }

    @Override // y1.InterfaceC5245t
    public InterfaceC5244s i(y yVar) {
        switch (this.f4898n) {
            case 2:
                return new C5227b(this.f4899u, this);
            case 3:
                return new C5227b(this.f4899u, yVar.b(Integer.class, InputStream.class));
            default:
                return new C5240o(this.f4899u, 1);
        }
    }

    public l(Context context) {
        this.f4898n = 0;
        this.f4899u = context.getApplicationContext();
    }
}
