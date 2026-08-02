package com.lightside.slab;

import android.content.Context;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.bxq;
import defpackage.orq;
import defpackage.prq;
import defpackage.w40;
import defpackage.xq0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u0002B3\b\u0007\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/lightside/slab/SlotView;", "Landroid/view/View;", "Lbxq;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "getView", "()Landroid/view/View;", "view", "slab_release"}, k = 1, mv = {2, 2, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes3.dex */
public final class SlotView extends View implements bxq {
    public boolean a;
    public w40 b;

    public /* synthetic */ SlotView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    @Override // defpackage.bxq
    public final prq a(orq orqVar) {
        orqVar.getClass();
        if (this.a) {
            xq0.q("Check failed.");
            return null;
        }
        if (getParent() == null) {
            xq0.q("Required value was null.");
            return null;
        }
        View n = orqVar.n(this);
        this.a = true;
        prq prqVar = new prq(orqVar, n);
        w40 w40Var = this.b;
        if (w40Var != null) {
            w40Var.invoke(orqVar, n, prqVar);
        }
        this.b = null;
        return prqVar;
    }

    @NotNull
    public View getView() {
        if (this.a) {
            xq0.q("Check failed.");
            return null;
        }
        if (getParent() != null) {
            return this;
        }
        xq0.q("Required value was null.");
        return null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        super.onRestoreInstanceState(AbsSavedState.EMPTY_STATE);
    }

    public SlotView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public SlotView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public SlotView(Context context) {
        this(context, null, 0, 0, 14, null);
    }

    public SlotView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i);
        setWillNotDraw(true);
    }
}
