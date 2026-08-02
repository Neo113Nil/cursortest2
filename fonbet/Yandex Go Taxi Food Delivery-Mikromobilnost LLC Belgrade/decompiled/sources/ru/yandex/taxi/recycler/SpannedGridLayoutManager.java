package ru.yandex.taxi.recycler;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r0;
import defpackage.b64;
import defpackage.b6w;
import defpackage.bnt0;
import defpackage.c6w;
import defpackage.cnt0;
import defpackage.d6w;
import defpackage.dnt0;
import defpackage.ent0;
import defpackage.fnt0;
import defpackage.jl40;
import defpackage.k4o;
import defpackage.kl3;
import defpackage.mrg0;
import defpackage.oyr;
import defpackage.tcc;
import defpackage.tls;
import defpackage.w511;
import defpackage.xby;
import defpackage.xcc;
import defpackage.xw31;
import defpackage.y6i0;
import defpackage.ycc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.yandex.taxi.recycler.SpannedGridLayoutManager;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0016\u0018\u00002\u00020\u0001:\u0005\u000b\f\r\u000e\u000fB+\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Lru/yandex/taxi/recycler/SpannedGridLayoutManager;", "Landroidx/recyclerview/widget/RecyclerView$e;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Orientation", "Direction", "SavedState", "InvalidSpanSizeException", "InvalidMaxSpansException", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public class SpannedGridLayoutManager extends RecyclerView.e {
    public final Orientation J;
    public boolean K;
    public int L;
    public final b M;
    public final int N;
    public final LinkedHashMap O;
    public final SparseIntArray P;
    public final SparseIntArray Q;
    public final SparseIntArray R;
    public final SparseIntArray S;
    public Integer T;
    public fnt0 U;
    public int V;
    public final cnt0 W;
    public cnt0 Z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/recycler/SpannedGridLayoutManager$Direction;", "", "START", "END", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Direction {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Direction[] $VALUES;
        public static final Direction END;
        public static final Direction START;

        static {
            Direction direction = new Direction("START", 0);
            START = direction;
            Direction direction2 = new Direction("END", 1);
            END = direction2;
            Direction[] directionArr = {direction, direction2};
            $VALUES = directionArr;
            $ENTRIES = kotlin.enums.a.a(directionArr);
        }

        public static Direction valueOf(String str) {
            return (Direction) Enum.valueOf(Direction.class, str);
        }

        public static Direction[] values() {
            return (Direction[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/taxi/recycler/SpannedGridLayoutManager$InvalidMaxSpansException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class InvalidMaxSpansException extends RuntimeException {
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"Lru/yandex/taxi/recycler/SpannedGridLayoutManager$InvalidSpanSizeException;", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class InvalidSpanSizeException extends RuntimeException {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lru/yandex/taxi/recycler/SpannedGridLayoutManager$Orientation;", "", "", "id", CA20Status.STATUS_USER_I, "Companion", "ru/yandex/taxi/recycler/c", "HORIZONTAL", "VERTICAL", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class Orientation {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ Orientation[] $VALUES;
        public static final c Companion;
        public static final Orientation HORIZONTAL;
        public static final Orientation VERTICAL;
        private final int id;

        static {
            Orientation orientation = new Orientation("HORIZONTAL", 0, 0);
            HORIZONTAL = orientation;
            Orientation orientation2 = new Orientation("VERTICAL", 1, 1);
            VERTICAL = orientation2;
            Orientation[] orientationArr = {orientation, orientation2};
            $VALUES = orientationArr;
            $ENTRIES = kotlin.enums.a.a(orientationArr);
            Companion = new c();
        }

        public Orientation(String str, int i, int i2) {
            this.id = i2;
        }

        public static Orientation valueOf(String str) {
            return (Orientation) Enum.valueOf(Orientation.class, str);
        }

        public static Orientation[] values() {
            return (Orientation[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/recycler/SpannedGridLayoutManager$SavedState;", "Landroid/os/Parcelable;", "", "firstVisibleItem", "<init>", "(I)V", "Landroid/os/Parcel;", "dest", "flags", "Lzy11;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", CA20Status.STATUS_USER_I, "getFirstVisibleItem", "Companion", "ru/yandex/taxi/recycler/d", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final class SavedState implements Parcelable {
        private final int firstVisibleItem;
        public static final d Companion = new d();
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: ru.yandex.taxi.recycler.SpannedGridLayoutManager$SavedState$Companion$CREATOR$1
            @Override // android.os.Parcelable.Creator
            public SpannedGridLayoutManager.SavedState createFromParcel(Parcel source) {
                return new SpannedGridLayoutManager.SavedState(source.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public SpannedGridLayoutManager.SavedState[] newArray(int size) {
                return new SpannedGridLayoutManager.SavedState[size];
            }
        };

        public SavedState(int i) {
            this.firstVisibleItem = i;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final int getFirstVisibleItem() {
            return this.firstVisibleItem;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.firstVisibleItem);
        }
    }

    public SpannedGridLayoutManager(Context context, Orientation orientation) {
        this.J = orientation;
        this.M = new b(this, orientation);
        this.N = xw31.b(mrg0.component_nav_shortcut_padding, context);
        this.O = new LinkedHashMap();
        this.P = new SparseIntArray();
        this.Q = new SparseIntArray();
        this.R = new SparseIntArray();
        this.S = new SparseIntArray();
        this.V = 1;
        this.W = new cnt0(1, 1, false);
    }

    public static int O1(SpannedGridLayoutManager spannedGridLayoutManager, int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += spannedGridLayoutManager.H1(i3);
        }
        return i2;
    }

    public final Rect A1(int i) {
        cnt0 z1 = z1(E1(i));
        int i2 = this.J == Orientation.HORIZONTAL ? z1.c : z1.b;
        int i3 = this.V;
        if (i2 > i3 || i2 < 1) {
            throw new InvalidSpanSizeException(b64.d(i2, i3, "Invalid item span size: ", ". Span size must be in the range: (1...", Extension.C_BRAKE));
        }
        b bVar = this.M;
        Rect rect = (Rect) bVar.e.get(Integer.valueOf(i));
        if (rect != null || (rect = bVar.a(z1)) != null) {
            return B1(i, rect);
        }
        w511.i("Not found rect for span size");
        return null;
    }

    public final Rect B1(int i, Rect rect) {
        int i2 = rect.left;
        Orientation orientation = Orientation.HORIZONTAL;
        int N1 = N1(i2, i, orientation);
        int N12 = N1(rect.right, i, orientation);
        int i3 = rect.top;
        Orientation orientation2 = Orientation.VERTICAL;
        Rect rect2 = new Rect(N1, N1(i3, i, orientation2), N12, N1(rect.bottom, i, orientation2));
        this.O.put(Integer.valueOf(i), rect2);
        return rect2;
    }

    public final void C1(r0 r0Var) {
        int i = this.L;
        int i2 = (this.J == Orientation.VERTICAL ? this.I : this.H) + i;
        int K1 = K1(i - G1());
        int K12 = K1(i2);
        if (K1 > K12) {
            return;
        }
        while (true) {
            Set set = (Set) this.M.d.get(Integer.valueOf(K1));
            if (set != null) {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    if (X(intValue) == null) {
                        J1(intValue, Direction.END, r0Var);
                    }
                }
            }
            if (K1 == K12) {
                return;
            } else {
                K1++;
            }
        }
    }

    public final void D1(r0 r0Var) {
        b6w l = y6i0.l(y6i0.n(K1(this.L - G1()), K1(((this.J == Orientation.VERTICAL ? this.I : this.H) + this.L) - G1())));
        int i = l.a;
        int i2 = l.b;
        int i3 = l.c;
        if ((i3 <= 0 || i > i2) && (i3 >= 0 || i2 > i)) {
            return;
        }
        while (true) {
            Iterable iterable = (Set) this.M.d.get(Integer.valueOf(i));
            if (iterable == null) {
                iterable = EmptySet.a;
            }
            Iterator it = kotlin.collections.a.q0(iterable).iterator();
            while (it.hasNext()) {
                int intValue = ((Number) it.next()).intValue();
                if (X(intValue) == null) {
                    J1(intValue, Direction.START, r0Var);
                }
            }
            if (i == i2) {
                return;
            } else {
                i += i3;
            }
        }
    }

    public final kl3 E1(int i) {
        kl3 a;
        fnt0 fnt0Var = this.U;
        return (fnt0Var == null || (a = fnt0Var.a(i)) == null) ? this.W : a;
    }

    public final int F1() {
        int paddingTop;
        int paddingBottom;
        if (this.J == Orientation.VERTICAL) {
            paddingTop = this.H - getPaddingLeft();
            paddingBottom = getPaddingRight();
        } else {
            paddingTop = this.I - getPaddingTop();
            paddingBottom = getPaddingBottom();
        }
        return (paddingTop - paddingBottom) / this.V;
    }

    public final int G1() {
        return this.J == Orientation.VERTICAL ? getPaddingTop() : getPaddingLeft();
    }

    public final int H1(int i) {
        int i2 = this.P.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.Q.get(i, -1);
        if (i3 != -1) {
            return i3;
        }
        int i4 = this.R.get(i, -1);
        return i4 != -1 ? i4 : F1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean I() {
        return this.J == Orientation.HORIZONTAL;
    }

    public final int I1() {
        int paddingLeft;
        int paddingRight;
        if (this.J == Orientation.VERTICAL) {
            paddingLeft = this.I - getPaddingTop();
            paddingRight = getPaddingBottom();
        } else {
            paddingLeft = this.H - getPaddingLeft();
            paddingRight = getPaddingRight();
        }
        return paddingLeft - paddingRight;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean J() {
        return this.J == Orientation.VERTICAL;
    }

    public final void J1(int i, Direction direction, r0 r0Var) {
        View e = r0Var.e(i);
        if (direction == Direction.END) {
            F(e);
        } else {
            G(0, e, false);
        }
        Integer valueOf = Integer.valueOf(i);
        LinkedHashMap linkedHashMap = this.O;
        Rect rect = (Rect) linkedHashMap.get(valueOf);
        if (rect == null) {
            rect = A1(i);
        }
        Rect rect2 = new Rect();
        m(e, rect2);
        int width = (rect.width() - rect2.left) - rect2.right;
        int height = (rect.height() - rect2.top) - rect2.bottom;
        ViewGroup.LayoutParams layoutParams = e.getLayoutParams();
        layoutParams.width = width;
        kl3 E1 = E1(i);
        boolean z = (E1 instanceof ent0) || (E1 instanceof dnt0);
        if (z) {
            layoutParams.height = -2;
        } else {
            layoutParams.height = height;
        }
        D0(width, height, e);
        Orientation orientation = this.J;
        if (z) {
            cnt0 z1 = z1(E1(i));
            b bVar = this.M;
            Rect rect3 = (Rect) bVar.e.get(Integer.valueOf(i));
            if (rect3 == null && (rect3 = bVar.a(z1)) == null) {
                w511.i("Not found rect for span size");
                return;
            }
            int i2 = orientation == Orientation.HORIZONTAL ? rect3.left : rect3.top;
            if (E1(i) instanceof dnt0) {
                SparseIntArray sparseIntArray = this.R;
                if (e.getMeasuredHeight() > sparseIntArray.get(i2, -1)) {
                    sparseIntArray.put(i2, e.getMeasuredHeight());
                }
            } else {
                this.Q.put(i2, e.getMeasuredHeight());
            }
            A1(i);
        }
        Rect rect4 = (Rect) linkedHashMap.get(Integer.valueOf(i));
        if (rect4 != null) {
            int i3 = this.L;
            int G1 = G1();
            boolean z2 = E1(i).a;
            Orientation orientation2 = Orientation.VERTICAL;
            int i4 = rect4.left;
            if (orientation != orientation2) {
                RecyclerView.e.B0((i4 - i3) + G1, getPaddingTop() + rect4.top, (rect4.right - i3) + G1, getPaddingTop() + rect4.bottom, e);
            } else {
                int i5 = this.N;
                RecyclerView.e.B0(i4 + (z2 ? getPaddingLeft() + i5 : getPaddingLeft()), (rect4.top - i3) + G1, rect4.right + (z2 ? getPaddingLeft() + i5 : getPaddingLeft()), (rect4.bottom - i3) + G1, e);
            }
        }
    }

    public final int K1(int i) {
        int i2 = 0;
        if (i <= 0) {
            return 0;
        }
        int i3 = -1;
        while (i2 <= i) {
            i3++;
            i2 += H1(i3);
        }
        return i3;
    }

    public final Rect L1(int i) {
        Rect rect = (Rect) this.O.get(Integer.valueOf(i));
        if (rect != null) {
            return rect;
        }
        Rect rect2 = (Rect) this.M.e.get(Integer.valueOf(i));
        if (rect2 == null) {
            return null;
        }
        return B1(i, rect2);
    }

    public final void M1(Direction direction, r0 r0Var) {
        Direction direction2 = Direction.END;
        Orientation orientation = this.J;
        if (direction == direction2) {
            int d0 = d0();
            int G1 = G1();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < d0; i++) {
                View c0 = c0(i);
                if ((orientation == Orientation.VERTICAL ? h0(c0) : m0(c0)) < G1) {
                    arrayList.add(c0);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                e1((View) it.next(), r0Var);
            }
            return;
        }
        int d02 = d0();
        Orientation orientation2 = Orientation.VERTICAL;
        int paddingBottom = (orientation == orientation2 ? this.I : this.H) + (orientation == orientation2 ? getPaddingBottom() : getPaddingRight());
        ArrayList arrayList2 = new ArrayList();
        b6w l = y6i0.l(y6i0.n(0, d02));
        int i2 = l.a;
        int i3 = l.b;
        int i4 = l.c;
        if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
            while (true) {
                View c02 = c0(i2);
                if ((orientation == Orientation.VERTICAL ? n0(c02) : j0(c02)) > paddingBottom) {
                    arrayList2.add(c02);
                }
                if (i2 == i3) {
                    break;
                } else {
                    i2 += i4;
                }
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            e1((View) it2.next(), r0Var);
        }
    }

    public final int N1(int i, int i2, Orientation orientation) {
        if (orientation != this.J) {
            return this.S.get(i2) * i;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < i; i4++) {
            i3 += H1(i4);
        }
        return i3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int O(RecyclerView.k kVar) {
        if (this.J == Orientation.HORIZONTAL) {
            return (this.H - getPaddingLeft()) - getPaddingRight();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int P(RecyclerView.k kVar) {
        if (this.J == Orientation.HORIZONTAL) {
            return this.L;
        }
        return 0;
    }

    public final int P1(int i) {
        int O1 = O1(this, this.M.b()) - I1();
        if (O1 <= 0) {
            O1 = 0;
        }
        int i2 = this.L - i;
        this.L = i2;
        if (i2 < 0) {
            i += i2;
            this.L = 0;
        }
        int i3 = this.L;
        if (i3 > O1) {
            i -= O1 - i3;
            this.L = O1;
        }
        if (this.J == Orientation.VERTICAL) {
            F0(i);
            return i;
        }
        E0(i);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int Q(RecyclerView.k kVar) {
        if (this.J == Orientation.HORIZONTAL) {
            return O1(this, this.M.b());
        }
        return 0;
    }

    public final void Q1(int i) {
        if (i < 1) {
            throw new InvalidMaxSpansException(oyr.j(i, "Invalid layout spans: ", ". Span size must be at least 1."));
        }
        this.V = i;
        Orientation orientation = Orientation.VERTICAL;
        Orientation orientation2 = this.J;
        int i2 = orientation2 == orientation ? i : 1;
        if (orientation2 != Orientation.HORIZONTAL) {
            i = 1;
        }
        this.Z = new cnt0(i2, i, false);
        i1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int R(RecyclerView.k kVar) {
        if (this.J == Orientation.VERTICAL) {
            return (this.I - getPaddingBottom()) - getPaddingTop();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int S(RecyclerView.k kVar) {
        if (this.J == Orientation.VERTICAL) {
            return this.L;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int T(RecyclerView.k kVar) {
        if (this.J == Orientation.VERTICAL) {
            return O1(this, this.M.b());
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void U0(r0 r0Var, RecyclerView.k kVar) {
        boolean z;
        int F1;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        SparseIntArray sparseIntArray;
        int i;
        Object obj;
        Object obj2;
        SparseIntArray sparseIntArray2;
        int i2;
        Orientation orientation;
        b bVar = this.M;
        bVar.d();
        LinkedHashMap linkedHashMap3 = bVar.d;
        LinkedHashMap linkedHashMap4 = bVar.e;
        SparseIntArray sparseIntArray3 = this.P;
        sparseIntArray3.clear();
        int b = kVar.b();
        int i3 = 0;
        while (i3 < b) {
            kl3 E1 = E1(i3);
            cnt0 z1 = z1(E1);
            final Rect rect = (Rect) linkedHashMap4.get(Integer.valueOf(i3));
            if (rect == null) {
                rect = bVar.a(z1);
            }
            if (rect == null) {
                linkedHashMap = linkedHashMap3;
                linkedHashMap2 = linkedHashMap4;
                sparseIntArray = sparseIntArray3;
                i = b;
            } else {
                Orientation orientation2 = Orientation.HORIZONTAL;
                Orientation orientation3 = this.J;
                int i4 = orientation3 == orientation2 ? rect.left : rect.top;
                if (E1 instanceof bnt0) {
                    sparseIntArray3.put(i4, ((bnt0) E1).b);
                    z = true;
                } else {
                    z = false;
                }
                boolean z2 = E1 instanceof ent0;
                final int i5 = 1;
                SparseIntArray sparseIntArray4 = this.Q;
                if (!z2) {
                    sparseIntArray4.delete(i4);
                } else if (sparseIntArray4.get(i3, -1) == -1) {
                    View e = r0Var.e(i3);
                    D0(0, 0, e);
                    sparseIntArray4.put(i3, e.getMeasuredHeight());
                }
                if (!(E1 instanceof dnt0)) {
                    this.R.delete(i4);
                }
                if (!E1.a) {
                    F1 = F1();
                } else if (orientation3 == Orientation.VERTICAL) {
                    int i6 = this.H;
                    int paddingLeft = getPaddingLeft();
                    int i7 = this.N;
                    F1 = ((i6 - (paddingLeft + i7)) - (getPaddingRight() + i7)) / this.V;
                } else {
                    F1 = (this.I - getPaddingTop()) - getPaddingBottom();
                }
                this.S.put(i3, F1);
                Orientation orientation4 = bVar.b;
                Orientation orientation5 = Orientation.VERTICAL;
                int i8 = orientation4 == orientation5 ? rect.top : rect.left;
                Set set = (Set) linkedHashMap3.get(Integer.valueOf(i8));
                Set M0 = set != null ? kotlin.collections.a.M0(set) : new LinkedHashSet();
                M0.add(Integer.valueOf(i3));
                linkedHashMap3.put(Integer.valueOf(i8), M0);
                int i9 = (orientation4 == orientation5 ? rect.bottom : rect.right) - 1;
                Set set2 = (Set) linkedHashMap3.get(Integer.valueOf(i9));
                Set M02 = set2 != null ? kotlin.collections.a.M0(set2) : new LinkedHashSet();
                M02.add(Integer.valueOf(i3));
                linkedHashMap3.put(Integer.valueOf(i9), M02);
                linkedHashMap4.put(Integer.valueOf(i3), rect);
                ArrayList arrayList = bVar.f;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    Rect rect2 = (Rect) next;
                    if (b.c(rect2, rect) || Rect.intersects(rect2, rect)) {
                        arrayList2.add(next);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    Rect rect3 = (Rect) it2.next();
                    if (!b.c(rect3, rect) || rect.contains(rect3)) {
                        arrayList.remove(rect3);
                        LinkedHashMap linkedHashMap5 = linkedHashMap3;
                        LinkedHashMap linkedHashMap6 = linkedHashMap4;
                        if (rect3.left < rect.left) {
                            sparseIntArray2 = sparseIntArray3;
                            i2 = b;
                            orientation = orientation4;
                            arrayList3.add(new Rect(rect3.left, rect3.top, rect.left, rect3.bottom));
                        } else {
                            sparseIntArray2 = sparseIntArray3;
                            i2 = b;
                            orientation = orientation4;
                        }
                        if (rect3.right > rect.right) {
                            arrayList3.add(new Rect(rect.right, rect3.top, rect3.right, rect3.bottom));
                        }
                        if (rect3.top < rect.top) {
                            arrayList3.add(new Rect(rect3.left, rect3.top, rect3.right, rect.top));
                        }
                        if (rect3.bottom > rect.bottom) {
                            arrayList3.add(new Rect(rect3.left, rect.bottom, rect3.right, rect3.bottom));
                        }
                        linkedHashMap3 = linkedHashMap5;
                        linkedHashMap4 = linkedHashMap6;
                        sparseIntArray3 = sparseIntArray2;
                        b = i2;
                        orientation4 = orientation;
                    } else {
                        arrayList4.add(rect3);
                    }
                }
                linkedHashMap = linkedHashMap3;
                linkedHashMap2 = linkedHashMap4;
                sparseIntArray = sparseIntArray3;
                i = b;
                Orientation orientation6 = orientation4;
                Iterator it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    Rect rect4 = (Rect) it3.next();
                    Iterator it4 = arrayList4.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it4.next();
                        Rect rect5 = (Rect) obj;
                        if (!jl40.l(rect5, rect4) && rect5.contains(rect4)) {
                            break;
                        }
                    }
                    if (obj == null) {
                        Iterator it5 = arrayList3.iterator();
                        while (true) {
                            if (!it5.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it5.next();
                            Rect rect6 = (Rect) obj2;
                            if (!jl40.l(rect6, rect4) && rect6.contains(rect4)) {
                                break;
                            }
                        }
                        if (obj2 == null) {
                            arrayList.add(rect4);
                        }
                    }
                }
                xcc.q(arrayList, bVar.c);
                if (z) {
                    int i10 = a.a[orientation6.ordinal()];
                    if (i10 == 1) {
                        final int i11 = 0;
                        ycc.w(arrayList, new tls() { // from class: iji0
                            @Override // defpackage.tls
                            public final Object invoke(Object obj3) {
                                int i12 = i11;
                                Rect rect7 = rect;
                                Rect rect8 = (Rect) obj3;
                                switch (i12) {
                                    case 0:
                                        return Boolean.valueOf(rect8.bottom <= rect7.top);
                                    default:
                                        return Boolean.valueOf(rect8.right <= rect7.left);
                                }
                            }
                        }, true);
                    } else {
                        if (i10 != 2) {
                            w511.b();
                            return;
                        }
                        ycc.w(arrayList, new tls() { // from class: iji0
                            @Override // defpackage.tls
                            public final Object invoke(Object obj3) {
                                int i12 = i5;
                                Rect rect7 = rect;
                                Rect rect8 = (Rect) obj3;
                                switch (i12) {
                                    case 0:
                                        return Boolean.valueOf(rect8.bottom <= rect7.top);
                                    default:
                                        return Boolean.valueOf(rect8.right <= rect7.left);
                                }
                            }
                        }, true);
                    }
                } else {
                    continue;
                }
            }
            i3++;
            linkedHashMap3 = linkedHashMap;
            linkedHashMap4 = linkedHashMap2;
            sparseIntArray3 = sparseIntArray;
            b = i;
        }
        LinkedHashMap linkedHashMap7 = linkedHashMap3;
        Integer num = this.T;
        if (getItemCount() != 0 && num != null) {
            LinkedHashMap linkedHashMap8 = new LinkedHashMap();
            for (Map.Entry entry : linkedHashMap7.entrySet()) {
                if (((Set) entry.getValue()).contains(num)) {
                    linkedHashMap8.put(entry.getKey(), entry.getValue());
                }
            }
            Integer num2 = (Integer) kotlin.collections.a.Q(linkedHashMap8.keySet());
            if (num2 != null) {
                this.L = O1(this, num2.intValue());
            }
            this.T = null;
        }
        this.O.clear();
        U(r0Var);
        Direction direction = Direction.END;
        C1(r0Var);
        M1(direction, r0Var);
        int max = this.L - Math.max(0, O1(this, bVar.b()) - I1());
        d6w n = y6i0.n(0, d0());
        ArrayList arrayList5 = new ArrayList(tcc.n(n, 10));
        c6w it6 = n.iterator();
        while (it6.c) {
            arrayList5.add(Integer.valueOf(((RecyclerView.LayoutParams) c0(it6.nextInt()).getLayoutParams()).getViewLayoutPosition()));
        }
        boolean contains = arrayList5.contains(Integer.valueOf(getItemCount() - 1));
        if (getItemCount() != 0) {
            if (!((d0() == 0 ? 0 : ((RecyclerView.LayoutParams) c0(0).getLayoutParams()).getViewLayoutPosition()) == 0 && contains) && max > 0) {
                P1(max);
                if (max > 0) {
                    D1(r0Var);
                } else {
                    C1(r0Var);
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void W0(Parcelable parcelable) {
        xby.d.getClass();
        SavedState savedState = parcelable instanceof SavedState ? (SavedState) parcelable : null;
        if (savedState != null) {
            l1(savedState.getFirstVisibleItem());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final Parcelable X0() {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.LayoutParams Y() {
        return new RecyclerView.LayoutParams(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h0(View view) {
        int b0 = ((Rect) this.O.get(Integer.valueOf(RecyclerView.e.r0(view)))).bottom + RecyclerView.e.b0(view) + RecyclerView.e.v0(view);
        return this.J == Orientation.VERTICAL ? b0 - (this.L - G1()) : b0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int j0(View view) {
        int o0 = ((Rect) this.O.get(Integer.valueOf(RecyclerView.e.r0(view)))).left + RecyclerView.e.o0(view);
        return this.J == Orientation.HORIZONTAL ? o0 - this.L : o0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int k0(View view) {
        return ((Rect) this.O.get(Integer.valueOf(RecyclerView.e.r0(view)))).height();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int k1(int i, r0 r0Var, RecyclerView.k kVar) {
        if (i == 0) {
            return 0;
        }
        int P1 = P1(-i);
        if (P1 != 0) {
            Direction direction = i > 0 ? Direction.END : Direction.START;
            M1(direction, r0Var);
            if (direction == Direction.END) {
                C1(r0Var);
            } else {
                D1(r0Var);
            }
        }
        return -P1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int l0(View view) {
        return ((Rect) this.O.get(Integer.valueOf(RecyclerView.e.r0(view)))).width();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void l1(int i) {
        this.T = Integer.valueOf(i);
        i1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int m0(View view) {
        int t0 = ((Rect) this.O.get(Integer.valueOf(RecyclerView.e.r0(view)))).right + RecyclerView.e.t0(view) + RecyclerView.e.o0(view);
        return this.J == Orientation.HORIZONTAL ? t0 - (this.L - G1()) : t0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int m1(int i, r0 r0Var, RecyclerView.k kVar) {
        if (i == 0) {
            return 0;
        }
        int P1 = P1(-i);
        if (P1 != 0) {
            Direction direction = i > 0 ? Direction.END : Direction.START;
            M1(direction, r0Var);
            if (direction == Direction.END) {
                C1(r0Var);
            } else {
                D1(r0Var);
            }
        }
        return -P1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int n0(View view) {
        int v0 = ((Rect) this.O.get(Integer.valueOf(RecyclerView.e.r0(view)))).top + RecyclerView.e.v0(view);
        return this.J == Orientation.VERTICAL ? v0 - this.L : v0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    /* renamed from: x0, reason: from getter */
    public final boolean getK() {
        return this.K;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void x1(RecyclerView recyclerView, RecyclerView.k kVar, int i) {
        Rect L1 = L1(i);
        if (L1 == null) {
            return;
        }
        if (this.J == Orientation.HORIZONTAL) {
            recyclerView.smoothScrollBy(L1.left - this.L, 0);
        } else {
            recyclerView.smoothScrollBy(0, L1.top - this.L);
        }
    }

    public final cnt0 z1(kl3 kl3Var) {
        if (kl3Var instanceof cnt0) {
            return (cnt0) kl3Var;
        }
        if (kl3Var instanceof bnt0) {
            cnt0 cnt0Var = this.Z;
            if (cnt0Var != null) {
                return cnt0Var;
            }
            return null;
        }
        if (kl3Var instanceof ent0) {
            return new cnt0(this.V, 1, false);
        }
        if (kl3Var instanceof dnt0) {
            return new cnt0(3, 1, false);
        }
        w511.b();
        return null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SpannedGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, r2 == null ? Orientation.VERTICAL : r2);
        Orientation orientation;
        RecyclerView.e.a s0 = RecyclerView.e.s0(context, attributeSet, i, i2);
        c cVar = Orientation.Companion;
        int i3 = s0.a;
        cVar.getClass();
        Orientation[] values = Orientation.values();
        int length = values.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                orientation = null;
                break;
            }
            orientation = values[i4];
            if (orientation.id == i3) {
                break;
            } else {
                i4++;
            }
        }
        Q1(s0.b);
    }
}
