package ru.yandex.taxi.design;

import android.content.Context;
import android.util.AttributeSet;
import com.yandex.go.design.view.GoView;
import defpackage.bdc;
import defpackage.cdc;
import defpackage.dg4;
import defpackage.hg4;
import defpackage.kdc;
import defpackage.s8o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\b\b\u0001\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\b\b\u0001\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/yandex/taxi/design/DividerWithColorView;", "Lcom/yandex/go/design/view/GoView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "colorInt", "Lzy11;", "updateColorInt", "(I)V", "color", "updateColorAttr", "Lkdc;", "updateColor", "(Lkdc;)V", "dividerColor", "()I", "design_components"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public class DividerWithColorView extends GoView {
    public /* synthetic */ DividerWithColorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final int dividerColor() {
        hg4 background = background();
        dg4 dg4Var = background instanceof dg4 ? (dg4) background : null;
        kdc kdcVar = dg4Var != null ? dg4Var.a : null;
        if (kdcVar != null) {
            return s8o.m(kdcVar, getContext());
        }
        return 0;
    }

    public final void updateColor(kdc color) {
        updateBackground(new dg4(color));
    }

    public final void updateColorAttr(int color) {
        updateColor(new bdc(color));
    }

    public final void updateColorInt(int colorInt) {
        updateColor(new cdc(colorInt));
    }

    public DividerWithColorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DividerWithColorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
    }

    public DividerWithColorView(Context context) {
        this(context, null, 0, 6, null);
    }
}
