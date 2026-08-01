package a1;

import android.graphics.PointF;
import com.google.android.gms.internal.ads.C2991bm;
import java.util.ArrayList;
import java.util.Collections;
import k1.C4629a;

/* loaded from: classes.dex */
public final class o extends AbstractC0428e {
    public final PointF i;

    /* renamed from: j, reason: collision with root package name */
    public final PointF f4281j;

    /* renamed from: k, reason: collision with root package name */
    public final i f4282k;

    /* renamed from: l, reason: collision with root package name */
    public final i f4283l;

    /* renamed from: m, reason: collision with root package name */
    public C2991bm f4284m;

    /* renamed from: n, reason: collision with root package name */
    public C2991bm f4285n;

    public o(i iVar, i iVar2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.f4281j = new PointF();
        this.f4282k = iVar;
        this.f4283l = iVar2;
        i(this.f4256d);
    }

    @Override // a1.AbstractC0428e
    public final Object e() {
        return l();
    }

    @Override // a1.AbstractC0428e
    public final /* bridge */ /* synthetic */ Object f(C4629a c4629a, float f3) {
        return l();
    }

    @Override // a1.AbstractC0428e
    public final void i(float f3) {
        i iVar = this.f4282k;
        iVar.i(f3);
        i iVar2 = this.f4283l;
        iVar2.i(f3);
        this.i.set(((Float) iVar.e()).floatValue(), ((Float) iVar2.e()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f4253a;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC0424a) arrayList.get(i)).a();
            i++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final PointF l() {
        Float f3;
        Float f9 = null;
        if (this.f4284m != null) {
            i iVar = this.f4282k;
            C4629a i = iVar.f4255c.i();
            if (i != null) {
                Float f10 = i.f38558h;
                C2991bm c2991bm = this.f4284m;
                float f11 = i.f38557g;
                f3 = (Float) c2991bm.R(f11, f10 == null ? f11 : f10.floatValue(), (Float) i.f38552b, (Float) i.f38553c, iVar.c(), iVar.d(), iVar.f4256d);
                if (this.f4285n != null) {
                    i iVar2 = this.f4283l;
                    C4629a i6 = iVar2.f4255c.i();
                    if (i6 != null) {
                        Float f12 = i6.f38558h;
                        C2991bm c2991bm2 = this.f4285n;
                        float f13 = i6.f38557g;
                        f9 = (Float) c2991bm2.R(f13, f12 == null ? f13 : f12.floatValue(), (Float) i6.f38552b, (Float) i6.f38553c, iVar2.c(), iVar2.d(), iVar2.f4256d);
                    }
                }
                PointF pointF = this.i;
                PointF pointF2 = this.f4281j;
                if (f3 != null) {
                    pointF2.set(pointF.x, 0.0f);
                } else {
                    pointF2.set(f3.floatValue(), 0.0f);
                }
                if (f9 != null) {
                    pointF2.set(pointF2.x, pointF.y);
                    return pointF2;
                }
                pointF2.set(pointF2.x, f9.floatValue());
                return pointF2;
            }
        }
        f3 = null;
        if (this.f4285n != null) {
        }
        PointF pointF3 = this.i;
        PointF pointF22 = this.f4281j;
        if (f3 != null) {
        }
        if (f9 != null) {
        }
    }
}
