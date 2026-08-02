package defpackage;

import android.view.View;
import androidx.compose.ui.node.LayoutNode;
import androidx.core.view.ViewCompat$Api21Impl;
import androidx.core.view.b;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Comparator;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class y0u implements Comparator {
    public static final y0u b = new y0u(0);
    public static final y0u c = new y0u(1);
    public final /* synthetic */ int a;

    public /* synthetic */ y0u(int i) {
        this.a = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        int i;
        int i2;
        switch (this.a) {
            case 0:
                w0u w0uVar = (w0u) obj;
                w0u w0uVar2 = (w0u) obj2;
                int i3 = w0uVar.b;
                int i4 = w0uVar.c;
                int i5 = w0uVar.d;
                int i6 = w0uVar.e;
                int i7 = ((i3 + i4) + i5) / i6;
                int i8 = w0uVar2.b;
                int i9 = w0uVar2.c;
                int i10 = w0uVar2.d;
                int i11 = w0uVar2.e;
                if (i7 < ((i8 + i9) + i10) / i11) {
                    return 1;
                }
                return ((i3 + i4) + i5) / i6 > ((i8 + i9) + i10) / i11 ? -1 : 0;
            case 1:
                LayoutNode layoutNode = (LayoutNode) obj;
                LayoutNode layoutNode2 = (LayoutNode) obj2;
                int q = jl40.q(layoutNode2.I, layoutNode.I);
                return q != 0 ? q : jl40.q(layoutNode.hashCode(), layoutNode2.hashCode());
            case 2:
                String str = (String) obj;
                String str2 = (String) obj2;
                int min = Math.min(str.length(), str2.length());
                int i12 = 4;
                while (true) {
                    if (i12 >= min) {
                        int length = str.length();
                        int length2 = str2.length();
                        if (length == length2) {
                            return 0;
                        }
                        if (length >= length2) {
                            return 1;
                        }
                    } else {
                        char charAt = str.charAt(i12);
                        char charAt2 = str2.charAt(i12);
                        if (charAt == charAt2) {
                            i12++;
                        } else if (jl40.q(charAt, charAt2) >= 0) {
                            return 1;
                        }
                    }
                }
                return -1;
            case 3:
                WeakHashMap weakHashMap = b.a;
                float i13 = ViewCompat$Api21Impl.i((View) obj);
                float i14 = ViewCompat$Api21Impl.i((View) obj2);
                if (i13 > i14) {
                    return -1;
                }
                return i13 < i14 ? 1 : 0;
            case 4:
                LayoutNode layoutNode3 = (LayoutNode) obj;
                LayoutNode layoutNode4 = (LayoutNode) obj2;
                int q2 = jl40.q(layoutNode3.I, layoutNode4.I);
                return q2 != 0 ? q2 : jl40.q(layoutNode3.hashCode(), layoutNode4.hashCode());
            case 5:
                i = ((yij) obj).a;
                i2 = ((yij) obj2).a;
                break;
            case 6:
                its itsVar = (its) obj;
                its itsVar2 = (its) obj2;
                RecyclerView recyclerView = itsVar.d;
                if ((recyclerView == null) == (itsVar2.d == null)) {
                    boolean z = itsVar.a;
                    if (z == itsVar2.a) {
                        int i15 = itsVar2.b - itsVar.b;
                        if (i15 != 0) {
                            return i15;
                        }
                        int i16 = itsVar.c - itsVar2.c;
                        if (i16 != 0) {
                            return i16;
                        }
                        return 0;
                    }
                    if (!z) {
                        return 1;
                    }
                } else if (recyclerView == null) {
                    return 1;
                }
                return -1;
            default:
                i = ((at31) obj).b;
                i2 = ((at31) obj2).b;
                break;
        }
        return i - i2;
    }
}
