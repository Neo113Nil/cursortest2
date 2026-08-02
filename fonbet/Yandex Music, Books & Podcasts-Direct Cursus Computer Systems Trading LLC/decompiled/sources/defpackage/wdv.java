package defpackage;

/* loaded from: classes.dex */
public final class wdv extends so0 {
    @Override // defpackage.to0
    public final boolean b() {
        if (super.b() && ywf.z("MULTI_PROCESS")) {
            int i = ddv.a;
            if (xdv.a.b()) {
                return bev.a.getStatics().isMultiProcessEnabled();
            }
            qq6.d("This method is not supported by the current version of the framework and the current WebView APK");
        }
        return false;
    }
}
