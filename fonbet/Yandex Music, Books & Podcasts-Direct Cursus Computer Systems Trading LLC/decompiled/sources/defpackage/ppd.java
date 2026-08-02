package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final class ppd extends uif implements Function0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ rd2 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ppd(rd2 rd2Var, int i) {
        super(0);
        this.r = i;
        this.s = rd2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Integer num;
        int i = this.r;
        rd2 rd2Var = this.s;
        switch (i) {
            case 0:
                rpd rpdVar = (rpd) rd2Var.h;
                if (rpdVar.getChildCount() == 0) {
                    return new npd(c5b.a, 0);
                }
                int i2 = rd2Var.b;
                ArrayList arrayList = new ArrayList(rpdVar.getChildCount());
                int[] iArr = new int[i2];
                int[] iArr2 = new int[i2];
                int childCount = rpdVar.getChildCount();
                int i3 = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = rpdVar.getChildAt(i4);
                    if (childAt.getVisibility() != 8) {
                        Integer N = xz0.N(iArr2);
                        int intValue = N != null ? N.intValue() : 0;
                        int F = xz0.F(iArr2, intValue);
                        int i5 = i3 + intValue;
                        IntRange m = yhn.m(0, i2);
                        int i6 = m.a;
                        int i7 = m.b;
                        if (i6 <= i7) {
                            while (true) {
                                iArr2[i6] = Math.max(0, iArr2[i6] - intValue);
                                if (i6 != i7) {
                                    i6++;
                                }
                            }
                        }
                        int i8 = y0a.b;
                        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                        layoutParams.getClass();
                        u79 u79Var = (u79) layoutParams;
                        int min = Math.min(u79Var.a(), i2 - F);
                        int c = u79Var.c();
                        arrayList.add(new mpd(i4, F, i5, min, c));
                        int i9 = F + min;
                        while (F < i9) {
                            if (iArr2[F] > 0) {
                                mpd mpdVar = (mpd) arrayList.get(iArr[F]);
                                int i10 = mpdVar.b;
                                int i11 = mpdVar.d + i10;
                                while (i10 < i11) {
                                    int i12 = iArr2[i10];
                                    iArr2[i10] = 0;
                                    i10++;
                                }
                                mpdVar.e = i5 - mpdVar.c;
                            }
                            iArr[F] = i4;
                            iArr2[F] = c;
                            F++;
                        }
                        i3 = i5;
                    }
                }
                if (i2 == 0) {
                    num = null;
                } else {
                    int i13 = iArr2[0];
                    if (i13 < 1) {
                        i13 = 1;
                    }
                    Integer valueOf = Integer.valueOf(i13);
                    int i14 = i2 - 1;
                    if (1 <= i14) {
                        int i15 = 1;
                        while (true) {
                            int i16 = iArr2[i15];
                            if (i16 < 1) {
                                i16 = 1;
                            }
                            Integer valueOf2 = Integer.valueOf(i16);
                            if (valueOf.compareTo(valueOf2) < 0) {
                                valueOf = valueOf2;
                            }
                            if (i15 != i14) {
                                i15++;
                            }
                        }
                    }
                    num = valueOf;
                }
                return new npd(arrayList, ((mpd) CollectionsKt.Y(arrayList)).c + (num != null ? num.intValue() : 1));
            case 1:
                return rd2Var.m(rd2Var.b, (c9n) rd2Var.f, kb5.v0);
            default:
                return rd2Var.m(((npd) ((j6e) rd2Var.c).a()).b, (c9n) rd2Var.g, kb5.w0);
        }
    }
}
