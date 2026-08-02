package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.i;
import com.connectsdk.service.webos.lgcast.common.utils.StringUtil;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.a;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public class hdh<S> extends i {
    public a A;
    public boolean B;
    public CharSequence C;
    public CharSequence D;
    public final LinkedHashSet g;
    public final LinkedHashSet h;
    public int i;
    public fsk j;
    public cs3 k;
    public adh l;
    public int m;
    public CharSequence n;
    public boolean o;
    public int p;
    public int q;
    public CharSequence r;
    public int s;
    public CharSequence t;
    public int u;
    public CharSequence v;
    public int w;
    public CharSequence x;
    public TextView y;
    public CheckableImageButton z;

    public hdh() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.g = new LinkedHashSet();
        this.h = new LinkedHashSet();
    }

    public static boolean A(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(ngg.E(context, adh.class.getCanonicalName(), R.attr.materialCalendarStyle).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    public static int z(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar b = fut.b();
        b.set(5, 1);
        Calendar a = fut.a(b);
        a.get(2);
        a.get(1);
        int maximum = a.getMaximum(7);
        a.getActualMaximum(5);
        a.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.i = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.k = (cs3) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.m = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.n = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.p = bundle.getInt("INPUT_MODE_KEY");
        this.q = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.r = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.s = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.t = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.u = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.v = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.w = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.x = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.n;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.m);
        }
        this.C = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), StringUtil.LF);
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.D = charSequence;
    }

    @Override // androidx.fragment.app.i
    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        requireContext();
        int i = this.i;
        if (i == 0) {
            y();
            throw null;
        }
        Dialog dialog = new Dialog(requireContext, i);
        Context context = dialog.getContext();
        this.o = A(context, android.R.attr.windowFullscreen);
        this.A = new a(context, null, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, vdn.z, R.attr.materialCalendarStyle, R.style.Widget_MaterialComponents_MaterialCalendar);
        int color = obtainStyledAttributes.getColor(1, 0);
        obtainStyledAttributes.recycle();
        this.A.n(context);
        this.A.r(ColorStateList.valueOf(color));
        this.A.q(dialog.getWindow().getDecorView().getElevation());
        return dialog;
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(this.o ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = inflate.getContext();
        if (this.o) {
            inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(z(context), -2));
        } else {
            inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(z(context), -1));
        }
        ((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.z = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.y = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.z.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.z;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, y2x.w(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], y2x.w(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.z.setChecked(this.p != 0);
        wdu.q(this.z, null);
        CheckableImageButton checkableImageButton2 = this.z;
        this.z.setContentDescription(this.p == 1 ? checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton2.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
        this.z.setOnClickListener(new ol(23, this));
        y();
        throw null;
    }

    @Override // androidx.fragment.app.i, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.i);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        cs3 cs3Var = this.k;
        bs3 bs3Var = new bs3();
        int i = bs3.b;
        int i2 = bs3.b;
        long j = cs3Var.a.f;
        long j2 = cs3Var.b.f;
        bs3Var.a = Long.valueOf(cs3Var.d.f);
        int i3 = cs3Var.e;
        vd7 vd7Var = cs3Var.c;
        adh adhVar = this.l;
        sdi sdiVar = adhVar == null ? null : adhVar.j;
        if (sdiVar != null) {
            bs3Var.a = Long.valueOf(sdiVar.f);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", vd7Var);
        sdi b = sdi.b(j);
        sdi b2 = sdi.b(j2);
        vd7 vd7Var2 = (vd7) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = bs3Var.a;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new cs3(b, b2, vd7Var2, l == null ? null : sdi.b(l.longValue()), i3));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.m);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.n);
        bundle.putInt("INPUT_MODE_KEY", this.p);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.q);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.r);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.s);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.t);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.u);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.v);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.w);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.x);
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.o) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.A);
            if (!this.B) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                ColorStateList n = mi.n(findViewById.getBackground());
                Integer valueOf = n != null ? Integer.valueOf(n.getDefaultColor()) : null;
                boolean z = false;
                boolean z2 = valueOf == null || valueOf.intValue() == 0;
                int O = qgg.O(window.getContext(), android.R.attr.colorBackground, -16777216);
                if (z2) {
                    valueOf = Integer.valueOf(O);
                }
                q5g.I(window, false);
                window.getContext();
                Context context = window.getContext();
                int i = Build.VERSION.SDK_INT;
                int l = i < 27 ? aa5.l(qgg.O(context, android.R.attr.navigationBarColor, -16777216), 128) : 0;
                window.setStatusBarColor(0);
                window.setNavigationBarColor(l);
                boolean z3 = qgg.U(0) || qgg.U(valueOf.intValue());
                knn knnVar = new knn(window.getDecorView());
                (i >= 35 ? new oqv(window, knnVar) : i >= 30 ? new nqv(window, knnVar) : i >= 26 ? new mqv(window, knnVar) : new lqv(window, knnVar)).k0(z3);
                boolean U = qgg.U(O);
                if (qgg.U(l) || (l == 0 && U)) {
                    z = true;
                }
                knn knnVar2 = new knn(window.getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                (i2 >= 35 ? new oqv(window, knnVar2) : i2 >= 30 ? new nqv(window, knnVar2) : i2 >= 26 ? new mqv(window, knnVar2) : new lqv(window, knnVar2)).j0(z);
                bh3 bh3Var = new bh3(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingLeft(), findViewById.getPaddingTop(), findViewById.getPaddingRight());
                WeakHashMap weakHashMap = wdu.a;
                ndu.n(findViewById, bh3Var);
                this.B = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.A, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new yne(requireDialog(), rect));
        }
        requireContext();
        int i3 = this.i;
        if (i3 == 0) {
            y();
            throw null;
        }
        y();
        cs3 cs3Var = this.k;
        adh adhVar = new adh();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i3);
        bundle.putParcelable("GRID_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", cs3Var);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putParcelable("CURRENT_MONTH_KEY", cs3Var.d);
        adhVar.setArguments(bundle);
        this.l = adhVar;
        fsk fskVar = adhVar;
        if (this.p == 1) {
            y();
            cs3 cs3Var2 = this.k;
            fsk qdhVar = new qdh();
            Bundle bundle2 = new Bundle();
            bundle2.putInt("THEME_RES_ID_KEY", i3);
            bundle2.putParcelable("DATE_SELECTOR_KEY", null);
            bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", cs3Var2);
            qdhVar.setArguments(bundle2);
            fskVar = qdhVar;
        }
        this.j = fskVar;
        this.y.setText((this.p == 1 && getResources().getConfiguration().orientation == 2) ? this.D : this.C);
        y();
        getContext();
        throw null;
    }

    @Override // androidx.fragment.app.i, androidx.fragment.app.o
    public final void onStop() {
        this.j.g.clear();
        super.onStop();
    }

    public final void y() {
    }
}
