package L3;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory;
import y1.C5207b;
import y1.C5219n;
import y1.InterfaceC5211f;
import y1.InterfaceC5223r;
import y1.InterfaceC5224s;

/* loaded from: classes2.dex */
public final /* synthetic */ class i implements d3.c, InterfaceC5224s, InterfaceC5211f {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1698n;

    /* renamed from: u, reason: collision with root package name */
    public final Context f1699u;

    public /* synthetic */ i(Context context, int i) {
        this.f1698n = i;
        this.f1699u = context;
    }

    @Override // y1.InterfaceC5211f
    public Class a() {
        return AssetFileDescriptor.class;
    }

    @Override // y1.InterfaceC5211f
    public Object b(Resources resources, int i, Resources.Theme theme) {
        return resources.openRawResourceFd(i);
    }

    @Override // d3.c
    public Object c() {
        E t6;
        t6 = F.t(this.f1699u, HsdpDeepLinkServiceFactory.createHsdpServiceIntent());
        return t6;
    }

    @Override // y1.InterfaceC5211f
    public void d(Object obj) {
        ((AssetFileDescriptor) obj).close();
    }

    @Override // y1.InterfaceC5224s
    public InterfaceC5223r i(y1.x xVar) {
        switch (this.f1698n) {
            case 1:
                return new C5207b(this.f1699u, this);
            default:
                return new C5219n(this.f1699u, 2);
        }
    }
}
