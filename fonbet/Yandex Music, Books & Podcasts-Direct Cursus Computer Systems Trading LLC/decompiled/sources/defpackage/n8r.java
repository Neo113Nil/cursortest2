package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes.dex */
public final class n8r extends cs2 {
    public final PointF i;
    public final PointF j;
    public final yic k;
    public final yic l;
    public szg m;
    public szg n;

    public n8r(yic yicVar, yic yicVar2) {
        super(Collections.EMPTY_LIST);
        this.i = new PointF();
        this.j = new PointF();
        this.k = yicVar;
        this.l = yicVar2;
        i(this.d);
    }

    @Override // defpackage.cs2
    public final Object e() {
        return l();
    }

    @Override // defpackage.cs2
    public final /* bridge */ /* synthetic */ Object f(acf acfVar, float f) {
        return l();
    }

    @Override // defpackage.cs2
    public final void i(float f) {
        yic yicVar = this.k;
        yicVar.i(f);
        yic yicVar2 = this.l;
        yicVar2.i(f);
        this.i.set(((Float) yicVar.e()).floatValue(), ((Float) yicVar2.e()).floatValue());
        int i = 0;
        while (true) {
            ArrayList arrayList = this.a;
            if (i >= arrayList.size()) {
                return;
            }
            ((yr2) arrayList.get(i)).a();
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
        Float f;
        Float f2 = null;
        if (this.m != null) {
            yic yicVar = this.k;
            acf e = yicVar.c.e();
            if (e != null) {
                Float f3 = e.h;
                szg szgVar = this.m;
                float f4 = e.g;
                f = (Float) szgVar.b(f4, f3 == null ? f4 : f3.floatValue(), (Float) e.b, (Float) e.c, yicVar.c(), yicVar.d(), yicVar.d);
                if (this.n != null) {
                    yic yicVar2 = this.l;
                    acf e2 = yicVar2.c.e();
                    if (e2 != null) {
                        Float f5 = e2.h;
                        szg szgVar2 = this.n;
                        float f6 = e2.g;
                        f2 = (Float) szgVar2.b(f6, f5 == null ? f6 : f5.floatValue(), (Float) e2.b, (Float) e2.c, yicVar2.c(), yicVar2.d(), yicVar2.d);
                    }
                }
                PointF pointF = this.i;
                PointF pointF2 = this.j;
                if (f != null) {
                    pointF2.set(pointF.x, 0.0f);
                } else {
                    pointF2.set(f.floatValue(), 0.0f);
                }
                if (f2 != null) {
                    pointF2.set(pointF2.x, pointF.y);
                    return pointF2;
                }
                pointF2.set(pointF2.x, f2.floatValue());
                return pointF2;
            }
        }
        f = null;
        if (this.n != null) {
        }
        PointF pointF3 = this.i;
        PointF pointF22 = this.j;
        if (f != null) {
        }
        if (f2 != null) {
        }
    }
}
