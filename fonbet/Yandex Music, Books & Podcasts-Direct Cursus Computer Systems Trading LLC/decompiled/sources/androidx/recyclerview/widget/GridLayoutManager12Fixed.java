package androidx.recyclerview.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.amh;
import defpackage.aqd;
import defpackage.kpn;
import defpackage.yon;
import defpackage.zon;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/recyclerview/widget/GridLayoutManager12Fixed;", "Landroidx/recyclerview/widget/GridLayoutManager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "yandexmusic"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes.dex */
public final class GridLayoutManager12Fixed extends GridLayoutManager {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridLayoutManager12Fixed(@NotNull Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        Z1(yon.g0(context, attributeSet, i, i2).b);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0070 A[SYNTHETIC] */
    @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View w1(amh amhVar, kpn kpnVar, boolean z, boolean z2) {
        int i;
        int i2;
        int i3;
        int i4;
        amhVar.getClass();
        kpnVar.getClass();
        int Q = Q();
        int i5 = -1;
        if (z2) {
            i3 = Q() - 1;
            i = -1;
            i2 = -1;
        } else {
            i = Q;
            i2 = 1;
            i3 = 0;
        }
        int b = kpnVar.b();
        m1();
        int n = this.r.n();
        int g = this.r.g();
        View view = null;
        View view2 = null;
        while (i3 != i) {
            View P = P(i3);
            P.getClass();
            int f0 = yon.f0(P);
            if (f0 >= 0 && f0 < b) {
                if (kpnVar.g) {
                    int i6 = this.J.get(f0, i5);
                    if (i6 != i5) {
                        i4 = i6;
                    } else {
                        int b2 = amhVar.b(f0);
                        if (b2 == i5) {
                            i4 = 0;
                        } else {
                            aqd aqdVar = this.K;
                            int i7 = this.F;
                            aqdVar.getClass();
                            i4 = b2 % i7;
                        }
                        if (i4 == 0) {
                            continue;
                        } else {
                            int b3 = this.r.b(P);
                            int e = this.r.e(P);
                            boolean z3 = b3 <= n && e < n;
                            boolean z4 = e >= g && b3 > g;
                            ViewGroup.LayoutParams layoutParams = P.getLayoutParams();
                            layoutParams.getClass();
                            if (((zon) layoutParams).a.k()) {
                                if (view2 == null) {
                                    view2 = P;
                                }
                            } else {
                                if (!z3 && !z4) {
                                    return P;
                                }
                                if (view == null) {
                                    view = P;
                                }
                            }
                        }
                    }
                } else {
                    aqd aqdVar2 = this.K;
                    int i8 = this.F;
                    aqdVar2.getClass();
                    i4 = f0 % i8;
                }
                if (i4 == 0) {
                }
            }
            i3 += i2;
            i5 = -1;
        }
        return view == null ? view2 : view;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridLayoutManager12Fixed(Context context) {
        super(context, 2);
        context.getClass();
        Z1(2);
    }
}
