package defpackage;

import android.graphics.Point;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.media3.session.i;
import com.yandex.plus.bdui.flex.ui.b;
import com.yandex.plus.bdui.flex.ui.content.g;
import com.yandex.plus.bdui.m;
import com.yandex.plus.bdui.plus.scaffold.controller.e;
import com.yandex.plus.bdui.ui.a;
import com.yandex.plus.core.reflect.c;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final /* synthetic */ class os7 implements zs7, rth {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ os7(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // defpackage.rth
    public void a(wrh wrhVar) {
        sth sthVar = (sth) this.b;
        alp alpVar = (alp) this.c;
        Bundle bundle = (Bundle) this.d;
        ResultReceiver resultReceiver = (ResultReceiver) this.e;
        i iVar = sthVar.h;
        if (bundle == null) {
            bundle = Bundle.EMPTY;
        }
        lcg o = iVar.o(wrhVar, alpVar, bundle);
        if (resultReceiver != null) {
            o.a(new juc(26, o, resultReceiver), e48.a);
        }
    }

    public b b(Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, pyc pycVar, Function2 function2, pyc pycVar2, String str, String str2) {
        switch (this.a) {
            case 3:
                m mVar = (m) this.b;
                f9f f9fVar = (f9f) this.c;
                a aVar = (a) this.d;
                g gVar = (g) this.e;
                return com.yandex.plus.bdui.flex.ui.a.o(mVar, f9fVar, aVar, gVar.b, (c) gVar.i.getValue(), gVar.c, gVar.d, gVar.e, function1, function12, function13, function14, function15, pycVar, function2, pycVar2, gVar.f, gVar.g, gVar.h, str, str2);
            default:
                m mVar2 = (m) this.b;
                f9f f9fVar2 = (f9f) this.c;
                e eVar = (e) this.d;
                com.yandex.plus.bdui.flex.ui.scaffold.c cVar = (com.yandex.plus.bdui.flex.ui.scaffold.c) this.e;
                return com.yandex.plus.bdui.flex.ui.a.o(mVar2, f9fVar2, eVar, cVar.b, (c) cVar.i.getValue(), cVar.c, cVar.d, cVar.e, function1, function12, function13, function14, function15, pycVar, function2, pycVar2, cVar.f, cVar.g, cVar.h, str, str2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    @Override // defpackage.zs7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public qsn h(int i, xvs xvsVar, int[] iArr) {
        int i2;
        int i3;
        int i4;
        int i5;
        Point point;
        int i6;
        int i7;
        xvs xvsVar2 = xvsVar;
        androidx.media3.exoplayer.trackselection.a aVar = (androidx.media3.exoplayer.trackselection.a) this.b;
        String str = (String) this.c;
        int[] iArr2 = (int[]) this.d;
        Point point2 = (Point) this.e;
        int i8 = iArr2[i];
        int i9 = point2 != null ? point2.x : aVar.i;
        int i10 = point2 != null ? point2.y : aVar.j;
        boolean z = aVar.l;
        if (i9 == Integer.MAX_VALUE || i10 == Integer.MAX_VALUE) {
            i2 = Integer.MAX_VALUE;
        } else {
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < xvsVar2.a; i12++) {
                dsc dscVar = xvsVar2.d[i12];
                int i13 = dscVar.u;
                int i14 = dscVar.v;
                if (i13 > 0 && i14 > 0) {
                    if (z) {
                        if ((i13 > i14) != (i9 > i10)) {
                            i5 = i9;
                            i4 = i10;
                            int i15 = i13 * i5;
                            int i16 = i14 * i4;
                            point = i15 < i16 ? new Point(i4, dvt.f(i16, i13)) : new Point(dvt.f(i15, i14), i5);
                            i6 = dscVar.u;
                            i7 = i6 * i14;
                            if (i6 >= ((int) (point.x * 0.98f)) && i14 >= ((int) (point.y * 0.98f)) && i7 < i11) {
                                i11 = i7;
                            }
                        }
                    }
                    i4 = i9;
                    i5 = i10;
                    int i152 = i13 * i5;
                    int i162 = i14 * i4;
                    if (i152 < i162) {
                    }
                    i6 = dscVar.u;
                    i7 = i6 * i14;
                    if (i6 >= ((int) (point.x * 0.98f))) {
                        i11 = i7;
                    }
                }
            }
            i2 = i11;
        }
        tde u = yde.u();
        int i17 = 0;
        while (i17 < xvsVar2.a) {
            dsc dscVar2 = xvsVar2.d[i17];
            int i18 = dscVar2.u;
            int i19 = (i18 == -1 || (i3 = dscVar2.v) == -1) ? -1 : i18 * i3;
            u.a(new bt7(i, xvsVar2, i17, aVar, iArr[i17], str, i8, i2 == Integer.MAX_VALUE || (i19 != -1 && i19 <= i2)));
            i17++;
            xvsVar2 = xvsVar;
        }
        return u.f();
    }
}
