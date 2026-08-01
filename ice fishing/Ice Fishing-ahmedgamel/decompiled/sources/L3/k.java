package L3;

import C2.J;
import android.app.Activity;
import android.os.Bundle;
import g1.C4522b;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class k extends o {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Activity f1702v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f1703w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f1704x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ HashMap f1705y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p pVar, C4522b c4522b, Activity activity, String str, String str2, HashMap hashMap) {
        super(0, c4522b);
        this.f1702v = activity;
        this.f1703w = str;
        this.f1704x = str2;
        this.f1705y = hashMap;
    }

    @Override // L3.o, L3.InterfaceC0315a
    public final void L(Bundle bundle) {
        String str = this.f1704x;
        HashMap hashMap = this.f1705y;
        String str2 = this.f1703w;
        Activity activity = this.f1702v;
        activity.runOnUiThread(new J(activity, str2, str, hashMap, 5));
        super.L(bundle);
    }
}
