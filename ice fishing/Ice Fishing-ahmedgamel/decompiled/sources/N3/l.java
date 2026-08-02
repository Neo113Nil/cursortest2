package N3;

import A1.AbstractC0269k;
import android.app.Activity;
import android.os.Bundle;
import h.C4543G;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class l extends AbstractC0269k {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Activity f1989v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f1990w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f1991x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ HashMap f1992y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ m f1993z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(m mVar, C4543G c4543g, Activity activity, String str, String str2, HashMap hashMap) {
        super(1, c4543g);
        this.f1989v = activity;
        this.f1990w = str;
        this.f1991x = str2;
        this.f1992y = hashMap;
        this.f1993z = mVar;
    }

    @Override // A1.AbstractC0269k, N3.InterfaceC0323a
    public final void K(Bundle bundle) {
        String str = this.f1991x;
        HashMap hashMap = this.f1992y;
        String str2 = this.f1990w;
        Activity activity = this.f1989v;
        activity.runOnUiThread(new j(this, activity, str2, str, hashMap, 0));
        super.K(bundle);
    }

    @Override // A1.AbstractC0269k, N3.InterfaceC0323a
    public final void O(Bundle bundle) {
        this.f1989v.runOnUiThread(new k(this, 0));
        super.O(bundle);
    }

    @Override // A1.AbstractC0269k, N3.InterfaceC0323a
    public final void W(Bundle bundle) {
        this.f1989v.runOnUiThread(new k(this, 1));
        super.W(bundle);
    }
}
