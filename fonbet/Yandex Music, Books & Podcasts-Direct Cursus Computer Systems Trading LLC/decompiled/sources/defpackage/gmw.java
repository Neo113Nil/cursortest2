package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class gmw implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ wnd b;

    public /* synthetic */ gmw(wnd wndVar, int i) {
        this.a = i;
        this.b = wndVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Throwable th = (Throwable) obj;
        th.getClass();
        switch (i) {
            case 0:
                wnd wndVar = this.b;
                if (wndVar != null) {
                    new lum(wndVar.b).Q(th);
                }
                ssg.a(6, "YnisonPlaybackLauncherBridgeImpl", "Error while starting fallback radio", th);
                break;
            default:
                wnd wndVar2 = this.b;
                if (wndVar2 != null) {
                    new lum(wndVar2.b).Q(th);
                }
                ssg.a(6, "YnisonPlaybackLauncherBridgeImpl", "Error while starting passive queue", th);
                break;
        }
        return Unit.a;
    }
}
