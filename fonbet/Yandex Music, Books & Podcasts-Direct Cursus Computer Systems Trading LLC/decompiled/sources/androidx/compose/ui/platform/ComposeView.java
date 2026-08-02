package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.hq5;
import defpackage.oq5;
import defpackage.szf;
import defpackage.x6k;
import defpackage.z5;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class ComposeView extends z5 {
    public final x6k i;
    public boolean j;

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public CharSequence getAccessibilityClassName() {
        return "androidx.compose.ui.platform.ComposeView";
    }

    @Override // defpackage.z5
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.j;
    }

    @Override // defpackage.z5
    public final void j(int i, hq5 hq5Var) {
        oq5 oq5Var = (oq5) hq5Var;
        oq5Var.Z(420213850);
        Function2 function2 = (Function2) this.i.getValue();
        if (function2 == null) {
            oq5Var.Z(358356153);
        } else {
            oq5Var.Z(150107208);
            function2.invoke(oq5Var, 0);
        }
        oq5Var.p(false);
        oq5Var.p(false);
    }

    public final void setContent(@NotNull Function2<? super hq5, ? super Integer, Unit> function2) {
        this.j = true;
        this.i.setValue(function2);
        if (isAttachedToWindow()) {
            l();
        }
    }

    public ComposeView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComposeView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    public ComposeView(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.i = szf.g0(null);
    }
}
