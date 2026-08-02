package c1;

import G3.u;
import Z0.G;
import android.graphics.PointF;
import com.google.android.gms.internal.ads.LP;

/* loaded from: classes.dex */
public final class p extends LP {

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ u f5681w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ LP f5682x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ e1.b f5683y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(u uVar, LP lp, e1.b bVar) {
        super(3);
        this.f5681w = uVar;
        this.f5682x = lp;
        this.f5683y = bVar;
    }

    @Override // com.google.android.gms.internal.ads.LP
    public final Object c(u uVar) {
        float f2 = uVar.f1169a;
        float f9 = uVar.f1170b;
        String str = ((e1.b) uVar.f1174f).f37215a;
        String str2 = ((e1.b) uVar.f1175g).f37215a;
        float f10 = uVar.f1171c;
        float f11 = uVar.f1172d;
        float f12 = uVar.f1173e;
        u uVar2 = this.f5681w;
        uVar2.f1169a = f2;
        uVar2.f1170b = f9;
        uVar2.f1174f = str;
        uVar2.f1175g = str2;
        uVar2.f1171c = f10;
        uVar2.f1172d = f11;
        uVar2.f1173e = f12;
        String str3 = (String) ((G) this.f5682x.f26917v);
        e1.b bVar = (e1.b) (uVar.f1172d == 1.0f ? uVar.f1175g : uVar.f1174f);
        String str4 = bVar.f37216b;
        float f13 = bVar.f37217c;
        int i = bVar.f37218d;
        int i4 = bVar.f37219e;
        float f14 = bVar.f37220f;
        float f15 = bVar.f37221g;
        int i6 = bVar.f37222h;
        int i9 = bVar.i;
        float f16 = bVar.f37223j;
        boolean z6 = bVar.f37224k;
        PointF pointF = bVar.f37225l;
        PointF pointF2 = bVar.f37226m;
        e1.b bVar2 = this.f5683y;
        bVar2.f37215a = str3;
        bVar2.f37216b = str4;
        bVar2.f37217c = f13;
        bVar2.f37218d = i;
        bVar2.f37219e = i4;
        bVar2.f37220f = f14;
        bVar2.f37221g = f15;
        bVar2.f37222h = i6;
        bVar2.i = i9;
        bVar2.f37223j = f16;
        bVar2.f37224k = z6;
        bVar2.f37225l = pointF;
        bVar2.f37226m = pointF2;
        return bVar2;
    }
}
