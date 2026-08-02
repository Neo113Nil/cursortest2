package defpackage;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class keu extends oj0 {
    public final View A;
    public final cyi B;
    public joo C;
    public Function1 D;
    public Function1 E;
    public Function1 F;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public keu(@NotNull Context context, @NotNull Function1<? super Context, View> function1, tr5 tr5Var, koo kooVar, int i, @NotNull uzj uzjVar) {
        super(context, tr5Var, i, r4, r5, uzjVar);
        View view = (View) function1.invoke(context);
        cyi cyiVar = new cyi();
        this.A = view;
        this.B = cyiVar;
        setClipChildren(false);
        String valueOf = String.valueOf(i);
        Object e = kooVar != null ? kooVar.e(valueOf) : null;
        SparseArray<Parcelable> sparseArray = e instanceof SparseArray ? (SparseArray) e : null;
        if (sparseArray != null) {
            view.restoreHierarchyState(sparseArray);
        }
        if (kooVar != null) {
            setSavableRegistryEntry(kooVar.a(valueOf, new jeu(this, 0)));
        }
        d5 d5Var = d5.L;
        this.D = d5Var;
        this.E = d5Var;
        this.F = d5Var;
    }

    public static final void m(keu keuVar) {
        keuVar.setSavableRegistryEntry(null);
    }

    private final void setSavableRegistryEntry(joo jooVar) {
        joo jooVar2 = this.C;
        if (jooVar2 != null) {
            ((lum) jooVar2).l0();
        }
        this.C = jooVar;
    }

    @NotNull
    public final cyi getDispatcher() {
        return this.B;
    }

    @NotNull
    public final Function1<View, Unit> getReleaseBlock() {
        return this.F;
    }

    @NotNull
    public final Function1<View, Unit> getResetBlock() {
        return this.E;
    }

    public /* bridge */ /* synthetic */ z5 getSubCompositionView() {
        return null;
    }

    @NotNull
    public final Function1<View, Unit> getUpdateBlock() {
        return this.D;
    }

    public final void setReleaseBlock(@NotNull Function1<View, Unit> function1) {
        this.F = function1;
        setRelease(new jeu(this, 1));
    }

    public final void setResetBlock(@NotNull Function1<View, Unit> function1) {
        this.E = function1;
        setReset(new jeu(this, 2));
    }

    public final void setUpdateBlock(@NotNull Function1<View, Unit> function1) {
        this.D = function1;
        setUpdate(new jeu(this, 3));
    }

    @NotNull
    public View getViewRoot() {
        return this;
    }

    public /* synthetic */ keu(Context context, Function1 function1, tr5 tr5Var, koo kooVar, int i, uzj uzjVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, function1, (i2 & 4) != 0 ? null : tr5Var, kooVar, i, uzjVar);
    }
}
