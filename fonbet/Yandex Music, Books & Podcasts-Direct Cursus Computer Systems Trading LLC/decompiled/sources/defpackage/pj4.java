package defpackage;

import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class pj4 extends kzb {
    public final /* synthetic */ int q = 0;
    public final /* synthetic */ TextView r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj4(qes qesVar) {
        super(qesVar);
        this.r = qesVar;
    }

    public uce A(int i) {
        ArrayList arrayList = ((qes) this.r).w;
        if (i != -1 && arrayList.size() != 0 && i < arrayList.size() && i >= 0) {
            return (uce) arrayList.get(i);
        }
        return null;
    }

    @Override // defpackage.kzb
    public final int o(float f, float f2) {
        RectF closeIconTouchBounds;
        int i = this.q;
        int i2 = 0;
        TextView textView = this.r;
        switch (i) {
            case 0:
                Chip chip = (Chip) textView;
                Rect rect = Chip.x;
                if (!chip.d()) {
                    return 0;
                }
                closeIconTouchBounds = chip.getCloseIconTouchBounds();
                return closeIconTouchBounds.contains(f, f2) ? 1 : 0;
            default:
                RectF rectF = new RectF();
                Iterator it = ((qes) textView).w.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        u75.n();
                        throw null;
                    }
                    rectF.set(((uce) next).g);
                    rectF.offset(r2.getPaddingLeft(), r2.getPaddingTop());
                    if (rectF.contains(f, f2)) {
                        return i2;
                    }
                    i2 = i3;
                }
                return -1;
        }
    }

    @Override // defpackage.kzb
    public final void p(ArrayList arrayList) {
        qj4 qj4Var;
        int i = this.q;
        int i2 = 0;
        TextView textView = this.r;
        switch (i) {
            case 0:
                arrayList.add(0);
                Chip chip = (Chip) textView;
                Rect rect = Chip.x;
                if (!chip.d() || (qj4Var = chip.e) == null || !qj4Var.A0 || chip.h == null) {
                    return;
                }
                arrayList.add(1);
                return;
            default:
                Iterator it = ((qes) textView).w.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        u75.n();
                        throw null;
                    }
                    arrayList.add(Integer.valueOf(i2));
                    i2 = i3;
                }
                return;
        }
    }

    @Override // defpackage.kzb
    public final boolean u(int i, int i2, Bundle bundle) {
        es6 es6Var;
        os7 os7Var;
        switch (this.q) {
            case 0:
                Chip chip = (Chip) this.r;
                boolean z = false;
                if (i2 != 16) {
                    return false;
                }
                if (i == 0) {
                    return chip.performClick();
                }
                if (i != 1) {
                    return false;
                }
                chip.playSoundEffect(0);
                View.OnClickListener onClickListener = chip.h;
                if (onClickListener != null) {
                    onClickListener.onClick(chip);
                    z = true;
                }
                if (!chip.t) {
                    return z;
                }
                chip.s.z(1, 1);
                return z;
            default:
                uce A = A(i);
                if (A == null || (es6Var = A.e) == null || (os7Var = (os7) es6Var.c) == null || i2 != 16) {
                    return false;
                }
                ((gc8) os7Var.b).getDiv2Component$div_release().t().a((e23) os7Var.c, (TextView) os7Var.d, (List) os7Var.e);
                return true;
        }
    }

    @Override // defpackage.kzb
    public void v(vb vbVar) {
        switch (this.q) {
            case 0:
                Chip chip = (Chip) this.r;
                qj4 qj4Var = chip.e;
                vbVar.l(qj4Var != null && qj4Var.G0);
                vbVar.o(chip.isClickable());
                vbVar.n(chip.getAccessibilityClassName());
                vbVar.y(chip.getText());
                break;
        }
    }

    @Override // defpackage.kzb
    public final void w(int i, vb vbVar) {
        String str;
        Rect closeIconTouchBoundsInt;
        String str2;
        int i2 = this.q;
        str = "";
        TextView textView = this.r;
        switch (i2) {
            case 0:
                Chip chip = (Chip) textView;
                if (i != 1) {
                    vbVar.r("");
                    vbVar.k(Chip.x);
                    break;
                } else {
                    CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
                    if (closeIconContentDescription != null) {
                        vbVar.r(closeIconContentDescription);
                    } else {
                        CharSequence text = chip.getText();
                        vbVar.r(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
                    }
                    closeIconTouchBoundsInt = chip.getCloseIconTouchBoundsInt();
                    vbVar.k(closeIconTouchBoundsInt);
                    vbVar.b(qb.e);
                    vbVar.a.setEnabled(chip.isEnabled());
                    vbVar.n(Button.class.getName());
                    break;
                }
            default:
                qes qesVar = (qes) textView;
                uce A = A(i);
                if (A != null) {
                    es6 es6Var = A.e;
                    if (es6Var != null && (str2 = (String) es6Var.a) != null) {
                        str = str2;
                    }
                    vbVar.n(str);
                    vbVar.a.setPackageName(qesVar.getContext().getPackageName());
                    Rect rect = new Rect();
                    RectF rectF = A.g;
                    rect.set(eeh.b(rectF.left), eeh.b(rectF.top), eeh.b(rectF.right), eeh.b(rectF.bottom));
                    rect.offset(qesVar.getPaddingLeft(), qesVar.getPaddingTop());
                    vbVar.r(es6Var != null ? (String) es6Var.b : null);
                    if ((es6Var != null ? (os7) es6Var.c : null) == null) {
                        vbVar.o(false);
                    } else {
                        vbVar.o(true);
                        vbVar.a(16);
                    }
                    vbVar.k(rect);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.kzb
    public void x(int i, boolean z) {
        switch (this.q) {
            case 0:
                Chip chip = (Chip) this.r;
                if (i == 1) {
                    chip.n = z;
                }
                qj4 qj4Var = chip.e;
                boolean z2 = chip.n;
                boolean z3 = false;
                if (qj4Var.B0 != null) {
                    z3 = qj4Var.a0(z2 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : qj4.v1);
                }
                if (z3) {
                    chip.refreshDrawableState();
                    break;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj4(Chip chip, Chip chip2) {
        super(chip2);
        this.r = chip;
    }
}
