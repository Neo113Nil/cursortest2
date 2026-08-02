package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.runtime.internal.a;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.yandex.go.scooters.payments.api.data.ScootersPaymentMethod;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes11.dex */
public abstract class r3b1 {
    /* JADX WARN: Removed duplicated region for block: B:28:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, w3b1 w3b1Var, ehr0 ehr0Var, jt1 jt1Var, a aVar, fid fidVar, int i, int i2) {
        int i3;
        ehr0 ehr0Var2;
        jt1 jt1Var2;
        a aVar2;
        jt1 jt1Var3;
        ehr0 ehr0Var3;
        aii0 v;
        long j;
        int i4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1786660780);
        if ((i & 6) == 0) {
            i3 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= btsVar.k(w3b1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                ehr0Var2 = ehr0Var;
                if (btsVar.k(ehr0Var)) {
                    i4 = 256;
                    i3 |= i4;
                }
            } else {
                ehr0Var2 = ehr0Var;
            }
            i4 = 128;
            i3 |= i4;
        } else {
            ehr0Var2 = ehr0Var;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            jt1Var2 = jt1Var;
            i3 |= btsVar.k(jt1Var2) ? 2048 : 1024;
            if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
                i3 |= btsVar.e(aVar) ? 16384 : 8192;
            }
            int i6 = 1;
            if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
                aVar2 = aVar;
                btsVar.Y();
                jt1Var3 = jt1Var2;
                ehr0Var3 = ehr0Var2;
            } else {
                btsVar.a0();
                if ((i & 1) == 0 || btsVar.C()) {
                    if ((i2 & 4) != 0) {
                        ehr0Var2 = ((YandexShapes) btsVar.m(qm51.a)).b();
                        i3 &= -897;
                    }
                    if (i5 != 0) {
                        ehr0Var3 = ehr0Var2;
                        jt1Var3 = x4c.y;
                        btsVar.u();
                        if (w3b1Var != null) {
                            btsVar.e0(1005917363);
                            tcb1.b(f530Var, 0L, ehr0Var3, jt1Var3, aVar, btsVar, i3 & 65422, 2);
                            btsVar.t(false);
                        } else if (w3b1Var instanceof xhc) {
                            btsVar.e0(1118863785);
                            tcb1.b(f530Var, ((xhc) w3b1Var).a, ehr0Var3, jt1Var3, aVar, btsVar, i3 & 65422, 0);
                            btsVar.t(false);
                        } else if (w3b1Var instanceof siy) {
                            btsVar.e0(1005931770);
                            aVar2 = aVar;
                            xab1.a(null, null, wwg.S(-2115782274, true, new vg0(w3b1Var, f530Var, ehr0Var3, jt1Var3, aVar, 2), btsVar), btsVar, HProv.ALG_TYPE_SECURECHANNEL, 7);
                            btsVar.t(false);
                            btsVar = btsVar;
                            ehr0Var3 = ehr0Var3;
                            jt1Var3 = jt1Var3;
                        } else {
                            aVar2 = aVar;
                            ehr0 ehr0Var4 = ehr0Var3;
                            jt1 jt1Var4 = jt1Var3;
                            if (!(w3b1Var instanceof k8v)) {
                                throw unr0.y(1005917749, btsVar, false);
                            }
                            btsVar.e0(1119667832);
                            ldc ldcVar = ((k8v) w3b1Var).g;
                            if (ldcVar == null) {
                                btsVar.e0(1005953120);
                                j = ((el51) btsVar.m(gl51.a)).g();
                                btsVar.t(false);
                            } else {
                                btsVar.e0(1005951911);
                                btsVar.t(false);
                                j = ldcVar.a;
                            }
                            btsVar = btsVar;
                            ehr0Var3 = ehr0Var4;
                            jt1Var3 = jt1Var4;
                            tcb1.b(f530Var, j, ehr0Var3, jt1Var3, wwg.S(1931269607, true, new o4z0(w3b1Var, aVar2, i6), btsVar), btsVar, (i3 & 14) | HProv.ALG_CLASS_DATA_ENCRYPT | (i3 & 896) | (i3 & 7168), 0);
                            btsVar.t(false);
                        }
                        aVar2 = aVar;
                    }
                } else {
                    btsVar.Y();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                }
                jt1Var3 = jt1Var2;
                ehr0Var3 = ehr0Var2;
                btsVar.u();
                if (w3b1Var != null) {
                }
                aVar2 = aVar;
            }
            v = btsVar.v();
            if (v == null) {
                v.d = new xg0(f530Var, w3b1Var, ehr0Var3, jt1Var3, aVar2, i, i2, 2);
                return;
            }
            return;
        }
        jt1Var2 = jt1Var;
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
        }
        int i62 = 1;
        if (btsVar.V(i3 & 1, (i3 & 9363) == 9362)) {
        }
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static void b(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static ImageView.ScaleType c(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static void d(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public static void e(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = hasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static final List f(m6a0 m6a0Var) {
        ScootersPaymentMethod scootersPaymentMethod;
        if (m6a0Var == null) {
            return EmptyList.a;
        }
        switch (tgo0.a[m6a0Var.a.ordinal()]) {
            case 1:
                scootersPaymentMethod = new ScootersPaymentMethod(510, "mobile_payment", null, null, null, null, null, null, null);
                break;
            case 2:
                scootersPaymentMethod = new ScootersPaymentMethod(506, "corp", null, m6a0Var.b, null, null, null, null, null);
                break;
            case 3:
                scootersPaymentMethod = new ScootersPaymentMethod(502, "nequi_token", null, null, m6a0Var.b, null, null, null, null);
                break;
            case 4:
                scootersPaymentMethod = new ScootersPaymentMethod(478, "kaspi", null, null, null, m6a0Var.b, null, null, null);
                break;
            case 5:
                scootersPaymentMethod = new ScootersPaymentMethod(446, "click_wallet", null, null, null, null, m6a0Var.b, null, null);
                break;
            case 6:
                scootersPaymentMethod = new ScootersPaymentMethod(382, "easypaisa_wallet", null, null, null, null, null, m6a0Var.b, null);
                break;
            case 7:
                scootersPaymentMethod = new ScootersPaymentMethod(254, "jazzcash_wallet", null, null, null, null, null, null, m6a0Var.b);
                break;
            default:
                scootersPaymentMethod = new ScootersPaymentMethod(508, "card", m6a0Var.b, null, null, null, null, null, null);
                break;
        }
        ArrayList i = scc.i(scootersPaymentMethod);
        if (m6a0Var.c != null) {
            i.add(new ScootersPaymentMethod(510, "yandex_account", null, null, null, null, null, null, null));
        }
        return i;
    }

    public static void g(CheckableImageButton checkableImageButton, CharSequence charSequence) {
        if (!checkableImageButton.isFocusable()) {
            charSequence = null;
        }
        checkableImageButton.setTooltipText(charSequence);
    }
}
