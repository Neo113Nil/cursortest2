package c1;

import android.graphics.PointF;
import com.google.android.gms.internal.ads.LP;
import java.util.ArrayList;
import java.util.Collections;
import m1.C4739a;

/* loaded from: classes.dex */
public final class o extends AbstractC0545e {
    public final PointF i;

    /* renamed from: j, reason: collision with root package name */
    public final PointF f5676j;

    /* renamed from: k, reason: collision with root package name */
    public final i f5677k;

    /* renamed from: l, reason: collision with root package name */
    public final i f5678l;

    /* renamed from: m, reason: collision with root package name */
    public LP f5679m;

    /* renamed from: n, reason: collision with root package name */
    public LP f5680n;

    public o(i iVar, i iVar2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.f5676j = new PointF();
        this.f5677k = iVar;
        this.f5678l = iVar2;
        i(this.f5651d);
    }

    @Override // c1.AbstractC0545e
    public final Object e() {
        return l();
    }

    @Override // c1.AbstractC0545e
    public final /* bridge */ /* synthetic */ Object f(C4739a c4739a, float f2) {
        return l();
    }

    @Override // c1.AbstractC0545e
    public final void i(float f2) {
        i iVar = this.f5677k;
        iVar.i(f2);
        i iVar2 = this.f5678l;
        iVar2.i(f2);
        this.i.set(((Float) iVar.e()).floatValue(), ((Float) iVar2.e()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.f5648a;
            if (i >= arrayList.size()) {
                return;
            }
            ((InterfaceC0541a) arrayList.get(i)).a();
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
        Float f2;
        Float f9 = null;
        if (this.f5679m != null) {
            i iVar = this.f5677k;
            C4739a f10 = iVar.f5650c.f();
            if (f10 != null) {
                Float f11 = f10.f39347h;
                LP lp = this.f5679m;
                float f12 = f10.f39346g;
                f2 = (Float) lp.d(f12, f11 == null ? f12 : f11.floatValue(), (Float) f10.f39341b, (Float) f10.f39342c, iVar.c(), iVar.d(), iVar.f5651d);
                if (this.f5680n != null) {
                    i iVar2 = this.f5678l;
                    C4739a f13 = iVar2.f5650c.f();
                    if (f13 != null) {
                        Float f14 = f13.f39347h;
                        LP lp2 = this.f5680n;
                        float f15 = f13.f39346g;
                        f9 = (Float) lp2.d(f15, f14 == null ? f15 : f14.floatValue(), (Float) f13.f39341b, (Float) f13.f39342c, iVar2.c(), iVar2.d(), iVar2.f5651d);
                    }
                }
                PointF pointF = this.i;
                PointF pointF2 = this.f5676j;
                if (f2 != null) {
                    pointF2.set(pointF.x, 0.0f);
                } else {
                    pointF2.set(f2.floatValue(), 0.0f);
                }
                if (f9 != null) {
                    pointF2.set(pointF2.x, pointF.y);
                    return pointF2;
                }
                pointF2.set(pointF2.x, f9.floatValue());
                return pointF2;
            }
        }
        f2 = null;
        if (this.f5680n != null) {
        }
        PointF pointF3 = this.i;
        PointF pointF22 = this.f5676j;
        if (f2 != null) {
        }
        if (f9 != null) {
        }
    }
}
