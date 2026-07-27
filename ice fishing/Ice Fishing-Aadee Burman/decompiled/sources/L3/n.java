package L3;

import android.app.Activity;
import android.os.Bundle;
import g1.C4522b;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class n extends o {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Activity f1714v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f1715w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f1716x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ HashMap f1717y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ p f1718z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, C4522b c4522b, Activity activity, String str, String str2, HashMap hashMap) {
        super(0, c4522b);
        this.f1714v = activity;
        this.f1715w = str;
        this.f1716x = str2;
        this.f1717y = hashMap;
        this.f1718z = pVar;
    }

    @Override // L3.o, L3.InterfaceC0315a
    public final void L(Bundle bundle) {
        String str = this.f1716x;
        HashMap hashMap = this.f1717y;
        String str2 = this.f1715w;
        Activity activity = this.f1714v;
        activity.runOnUiThread(new l(this, activity, str2, str, hashMap, 0));
        super.L(bundle);
    }

    @Override // L3.o, L3.InterfaceC0315a
    public final void O(Bundle bundle) {
        this.f1714v.runOnUiThread(new m(this, 0));
        super.O(bundle);
    }

    @Override // L3.o, L3.InterfaceC0315a
    public final void W(Bundle bundle) {
        this.f1714v.runOnUiThread(new m(this, 1));
        super.W(bundle);
    }
}
