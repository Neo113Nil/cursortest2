package f0;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: f0.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0147l extends D1.j implements C1.l {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ D1.l f2946b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2947c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D1.m f2948d;
    public final /* synthetic */ z e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Bundle f2949f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0147l(D1.l lVar, ArrayList arrayList, D1.m mVar, z zVar, Bundle bundle) {
        super(1);
        this.f2946b = lVar;
        this.f2947c = arrayList;
        this.f2948d = mVar;
        this.e = zVar;
        this.f2949f = bundle;
    }

    @Override // C1.l
    public final Object g(Object obj) {
        List list;
        C0141f c0141f = (C0141f) obj;
        D1.i.e(c0141f, "entry");
        this.f2946b.f167a = true;
        ArrayList arrayList = this.f2947c;
        int indexOf = arrayList.indexOf(c0141f);
        if (indexOf != -1) {
            D1.m mVar = this.f2948d;
            int i = indexOf + 1;
            list = arrayList.subList(mVar.f168a, i);
            mVar.f168a = i;
        } else {
            list = u1.o.f4473a;
        }
        this.e.a(c0141f.f2920b, this.f2949f, c0141f, list);
        return t1.i.f4388c;
    }
}
