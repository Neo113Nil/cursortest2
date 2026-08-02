package N3;

import A1.AbstractC0269k;
import E2.I;
import android.app.Activity;
import android.os.Bundle;
import h.C4543G;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class i extends AbstractC0269k {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Activity f1977v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f1978w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f1979x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ HashMap f1980y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(m mVar, C4543G c4543g, Activity activity, String str, String str2, HashMap hashMap) {
        super(1, c4543g);
        this.f1977v = activity;
        this.f1978w = str;
        this.f1979x = str2;
        this.f1980y = hashMap;
    }

    @Override // A1.AbstractC0269k, N3.InterfaceC0323a
    public final void K(Bundle bundle) {
        String str = this.f1979x;
        HashMap hashMap = this.f1980y;
        String str2 = this.f1978w;
        Activity activity = this.f1977v;
        activity.runOnUiThread(new I(activity, str2, str, hashMap, 5));
        super.K(bundle);
    }
}
