package defpackage;

import android.R;
import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class if7 implements ja8 {
    public final ViewGroup a;
    public final gc8 b;
    public final sf7 c;
    public final ky9 d;
    public final c1t e;
    public g06 f;
    public iz7 g;
    public PopupWindow h;
    public final qf7 i;

    public if7(ViewGroup viewGroup, gc8 gc8Var, sf7 sf7Var, ky9 ky9Var) {
        this.a = viewGroup;
        this.b = gc8Var;
        this.c = sf7Var;
        this.d = ky9Var;
        this.e = new c1t(viewGroup);
        az6 az6Var = new az6(6, this);
        sf7Var.g.add(az6Var);
        az6Var.invoke(sf7Var.d(sf7Var.m));
        this.i = new qf7(0, sf7Var, az6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x057c  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0577  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0517  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02b0  */
    /* JADX WARN: Type inference failed for: r4v21, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v32, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [android.view.ViewGroup$MarginLayoutParams] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final if7 if7Var, pf7 pf7Var) {
        LinearLayout linearLayout;
        int i;
        g06 g06Var;
        LinearLayout linearLayout2;
        View view;
        g06 g06Var2;
        LinearLayout linearLayout3;
        LinearLayout linearLayout4;
        String str;
        iz7 iz7Var;
        LinearLayout linearLayout5;
        View view2;
        sf7 sf7Var = if7Var.c;
        ViewGroup viewGroup = if7Var.a;
        final int i2 = 0;
        final int i3 = 1;
        if (pf7Var instanceof mf7) {
            g06 g06Var3 = if7Var.f;
            if (g06Var3 != null) {
                viewGroup.removeView((LinearLayout) g06Var3.d);
            }
            if7Var.f = null;
            iz7 iz7Var2 = if7Var.g;
            if (iz7Var2 != null && (linearLayout5 = (LinearLayout) iz7Var2.l) != null) {
                if (viewGroup.getChildCount() > 0) {
                    view2 = viewGroup.getChildAt(0);
                    if (view2 == null) {
                        rj7.m();
                        return;
                    }
                    int i4 = 1;
                    while (i4 < viewGroup.getChildCount()) {
                        int i5 = i4 + 1;
                        View childAt = viewGroup.getChildAt(i4);
                        if (childAt == null) {
                            rj7.m();
                            return;
                        } else {
                            i4 = i5;
                            view2 = childAt;
                        }
                    }
                } else {
                    view2 = null;
                }
                if (Intrinsics.d(view2, linearLayout5)) {
                    str = "";
                    iz7Var = if7Var.g;
                    if (iz7Var != null) {
                        mf7 mf7Var = (mf7) pf7Var;
                        qjo runtimeStore$div_release = sf7Var.b.getRuntimeStore$div_release();
                        Map f = runtimeStore$div_release.f();
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        String str2 = str;
                        linkedHashMap.put(str2, runtimeStore$div_release.a().a.d);
                        for (Map.Entry entry : f.entrySet()) {
                            linkedHashMap.put((String) entry.getKey(), ((d0c) entry.getValue()).a.d);
                        }
                        ((AppCompatTextView) iz7Var.h).setText(mf7Var.a);
                        uxt uxtVar = (uxt) iz7Var.c;
                        ?? r4 = uxtVar.d;
                        LinkedHashMap linkedHashMap2 = uxtVar.b;
                        if (!linkedHashMap.isEmpty()) {
                            Iterator it = linkedHashMap.entrySet().iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                }
                                Map.Entry entry2 = (Map.Entry) it.next();
                                if (!Intrinsics.d(r4.get(entry2.getKey()), entry2.getValue())) {
                                    Set A0 = CollectionsKt.A0(uxtVar.d.values());
                                    uxtVar.d = linkedHashMap;
                                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                                        if (!A0.contains((oxt) entry3.getValue())) {
                                            linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                                        }
                                    }
                                    for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                                        String str3 = (String) entry4.getKey();
                                        oxt oxtVar = (oxt) entry4.getValue();
                                        List f2 = oxtVar.f();
                                        ArrayList arrayList = new ArrayList(v75.o(f2, 10));
                                        Iterator it2 = f2.iterator();
                                        while (it2.hasNext()) {
                                            arrayList.add(((kxt) it2.next()).c());
                                        }
                                        oxtVar.m(arrayList, new gcp(26, uxtVar, str3));
                                    }
                                    linkedHashMap2.clear();
                                    for (Map.Entry entry5 : uxtVar.d.entrySet()) {
                                        String str4 = (String) entry5.getKey();
                                        for (kxt kxtVar : ((oxt) entry5.getValue()).f()) {
                                            linkedHashMap2.put(new Pair(str4, kxtVar.c()), kxtVar);
                                        }
                                    }
                                    uxtVar.a();
                                }
                            }
                        }
                        jp0 jp0Var = mf7Var.b;
                        AppCompatTextView appCompatTextView = (AppCompatTextView) iz7Var.g;
                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) iz7Var.f;
                        kr0 kr0Var = (kr0) iz7Var.i;
                        SwitchCompat switchCompat = (SwitchCompat) iz7Var.d;
                        LinearLayout linearLayout6 = (LinearLayout) iz7Var.k;
                        String str5 = (String) jp0Var.d;
                        String str6 = (String) jp0Var.f;
                        String str7 = (String) jp0Var.b;
                        boolean z = jp0Var.a;
                        linearLayout6.setVisibility(0);
                        switchCompat.setText("Hot Reload");
                        switchCompat.setChecked(z);
                        switchCompat.setOnCheckedChangeListener(new mj4(2, jp0Var));
                        ((AppCompatTextView) iz7Var.e).setText("Hot Reload");
                        appCompatTextView2.setText(str7);
                        appCompatTextView2.setVisibility(0);
                        if (!String.valueOf(kr0Var.getText()).equals(str6)) {
                            kr0Var.setText(str6);
                        }
                        kr0Var.addTextChangedListener(new lb4(5, jp0Var));
                        ((LinearLayout) iz7Var.j).setVisibility(z ? 0 : 8);
                        appCompatTextView.setVisibility(str5 != null ? 0 : 8);
                        String str8 = str5 == null ? str2 : str5;
                        SpannableString spannableString = new SpannableString(str8);
                        spannableString.setSpan(new ip5(jp0Var), 0, str8.length(), 33);
                        appCompatTextView.setText(spannableString);
                    }
                } else {
                    viewGroup.removeView(linearLayout5);
                    if7Var.g = null;
                }
            }
            Context context = viewGroup.getContext();
            sf7Var.getClass();
            o57 o57Var = new o57(1, sf7Var.b, gc8.class, "logError", "logError(Ljava/lang/Throwable;)V", 0, 1);
            hf7 hf7Var = new hf7(if7Var, 1);
            hf7 hf7Var2 = new hf7(if7Var, 2);
            final iz7 iz7Var3 = new iz7();
            iz7Var3.a = hf7Var;
            iz7Var3.b = hf7Var2;
            uxt uxtVar2 = new uxt(o57Var);
            iz7Var3.c = uxtVar2;
            vxt vxtVar = new vxt(context, uxtVar2);
            LinearLayout linearLayout7 = new LinearLayout(context);
            linearLayout7.setPadding(0, 0, bg3.x(8, context.getResources().getDisplayMetrics()), 0);
            linearLayout7.setOrientation(1);
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.ic_menu_close_clear_cancel);
            imageView.setOnClickListener(new View.OnClickListener() { // from class: hz7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i2) {
                        case 0:
                            ((hf7) iz7Var3.a).invoke();
                            break;
                        default:
                            ((hf7) iz7Var3.b).invoke();
                            break;
                    }
                }
            });
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageResource(R.drawable.ic_menu_save);
            imageView2.setOnClickListener(new View.OnClickListener() { // from class: hz7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view3) {
                    switch (i3) {
                        case 0:
                            ((hf7) iz7Var3.a).invoke();
                            break;
                        default:
                            ((hf7) iz7Var3.b).invoke();
                            break;
                    }
                }
            });
            linearLayout7.addView(imageView, new LinearLayout.LayoutParams(-2, -2));
            linearLayout7.addView(imageView2, new LinearLayout.LayoutParams(-2, -2));
            SwitchCompat switchCompat2 = new SwitchCompat(context);
            switchCompat2.setTextColor(-1);
            switchCompat2.setThumbTextPadding(bg3.x(8, context.getResources().getDisplayMetrics()));
            iz7Var3.d = switchCompat2;
            AppCompatTextView appCompatTextView3 = new AppCompatTextView(context);
            appCompatTextView3.setTextColor(-1);
            appCompatTextView3.setTextSize(14.0f);
            appCompatTextView3.setGravity(3);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.weight = 1.0f;
            appCompatTextView3.setLayoutParams(layoutParams);
            iz7Var3.e = appCompatTextView3;
            AppCompatTextView appCompatTextView4 = new AppCompatTextView(context);
            appCompatTextView4.setTextColor(-3355444);
            appCompatTextView4.setTextSize(12.0f);
            appCompatTextView4.setGravity(3);
            iz7Var3.f = appCompatTextView4;
            kr0 kr0Var2 = new kr0(context);
            kr0Var2.setTextColor(-1);
            kr0Var2.setTextSize(12.0f);
            kr0Var2.setHintTextColor(-3355444);
            kr0Var2.setHint("server address");
            iz7Var3.i = kr0Var2;
            AppCompatTextView appCompatTextView5 = new AppCompatTextView(context);
            appCompatTextView5.setTextColor(-16776961);
            appCompatTextView5.setTextSize(12.0f);
            appCompatTextView5.setGravity(3);
            appCompatTextView5.setMovementMethod(LinkMovementMethod.getInstance());
            appCompatTextView5.setVisibility(8);
            iz7Var3.g = appCompatTextView5;
            AppCompatTextView appCompatTextView6 = new AppCompatTextView(context);
            appCompatTextView6.setTextColor(-3355444);
            appCompatTextView6.setTextSize(12.0f);
            appCompatTextView6.setGravity(3);
            appCompatTextView6.setText("Listening at:");
            LinearLayout linearLayout8 = new LinearLayout(context);
            linearLayout8.setOrientation(0);
            linearLayout8.addView(appCompatTextView6);
            linearLayout8.addView(kr0Var2, new ViewGroup.LayoutParams(-2, -2));
            iz7Var3.j = linearLayout8;
            LinearLayout linearLayout9 = new LinearLayout(context);
            linearLayout9.setOrientation(1);
            linearLayout9.setVisibility(8);
            str = "";
            linearLayout9.addView(switchCompat2, new ViewGroup.LayoutParams(-1, -2));
            linearLayout9.addView(linearLayout8);
            linearLayout9.addView(appCompatTextView4);
            linearLayout9.addView(appCompatTextView5);
            iz7Var3.k = linearLayout9;
            AppCompatTextView appCompatTextView7 = new AppCompatTextView(context);
            appCompatTextView7.setTextColor(-1);
            appCompatTextView7.setGravity(3);
            iz7Var3.h = appCompatTextView7;
            LinearLayout linearLayout10 = new LinearLayout(context);
            linearLayout10.setOrientation(1);
            linearLayout10.addView(linearLayout9, new ViewGroup.LayoutParams(-1, -2));
            linearLayout10.addView(appCompatTextView7);
            LinearLayout linearLayout11 = new LinearLayout(context);
            linearLayout11.setOrientation(0);
            linearLayout11.addView(linearLayout7, new LinearLayout.LayoutParams(bg3.x(32, linearLayout11.getRootView().getResources().getDisplayMetrics()), -2));
            linearLayout11.addView(linearLayout10, new LinearLayout.LayoutParams(-1, -2));
            LinearLayout linearLayout12 = new LinearLayout(context);
            int x = bg3.x(8, linearLayout12.getResources().getDisplayMetrics());
            linearLayout12.setPadding(x, x, x, x);
            linearLayout12.setOrientation(1);
            linearLayout12.setBackgroundColor(Color.argb(186, 0, 0, 0));
            linearLayout12.setElevation(linearLayout12.getResources().getDimension(ru.yandex.music.R.dimen.div_shadow_elevation));
            linearLayout12.addView(linearLayout11, new LinearLayout.LayoutParams(-1, -2));
            linearLayout12.addView(vxtVar, new LinearLayout.LayoutParams(-1, -2));
            iz7Var3.l = linearLayout12;
            LinearLayout linearLayout13 = (LinearLayout) iz7Var3.l;
            int x2 = bg3.x(150, viewGroup.getContext().getResources().getDisplayMetrics());
            if (viewGroup.getWidth() < x2 || viewGroup.getHeight() < x2) {
                PopupWindow popupWindow = new PopupWindow((View) linearLayout13, -1, -2, true);
                popupWindow.setOutsideTouchable(true);
                popupWindow.showAsDropDown(viewGroup, 0, -viewGroup.getHeight());
                popupWindow.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: gf7
                    @Override // android.widget.PopupWindow.OnDismissListener
                    public final void onDismiss() {
                        sf7 sf7Var2 = if7.this.c;
                        sf7Var2.c(pdr.a(sf7Var2.m, false, false, null, null, null, 30));
                    }
                });
                if7Var.h = popupWindow;
            } else {
                viewGroup.addView(linearLayout13, new ViewGroup.MarginLayoutParams(-1, -1));
            }
            if7Var.g = iz7Var3;
            iz7Var = if7Var.g;
            if (iz7Var != null) {
            }
        } else if (pf7Var instanceof of7) {
            if7Var.b();
            g06 g06Var4 = if7Var.f;
            if (g06Var4 != null && (linearLayout2 = (LinearLayout) g06Var4.d) != null) {
                if (viewGroup.getChildCount() > 0) {
                    view = viewGroup.getChildAt(0);
                    if (view == null) {
                        rj7.m();
                        return;
                    }
                    int i6 = 1;
                    while (i6 < viewGroup.getChildCount()) {
                        int i7 = i6 + 1;
                        View childAt2 = viewGroup.getChildAt(i6);
                        if (childAt2 == null) {
                            rj7.m();
                            return;
                        } else {
                            i6 = i7;
                            view = childAt2;
                        }
                    }
                } else {
                    view = null;
                }
                if (Intrinsics.d(view, linearLayout2)) {
                    i = 0;
                    g06Var = if7Var.f;
                    if (g06Var != null) {
                        of7 of7Var = (of7) pf7Var;
                        AppCompatTextView appCompatTextView8 = (AppCompatTextView) g06Var.b;
                        appCompatTextView8.setText(of7Var.a);
                        appCompatTextView8.setBackgroundResource(of7Var.c);
                        AppCompatTextView appCompatTextView9 = (AppCompatTextView) g06Var.c;
                        String str9 = of7Var.b;
                        appCompatTextView9.setText(str9 == null ? "" : str9);
                        appCompatTextView9.setVisibility((str9 == null || str9.length() == 0) ? 8 : i);
                    }
                } else {
                    viewGroup.removeView(linearLayout2);
                    if7Var.f = null;
                }
            }
            i = 0;
            g06 g06Var5 = new g06(viewGroup.getContext(), if7Var.d, new hf7(if7Var, 0));
            viewGroup.addView((LinearLayout) g06Var5.d, new ViewGroup.MarginLayoutParams(-1, -1));
            if7Var.f = g06Var5;
            g06Var = if7Var.f;
            if (g06Var != null) {
            }
        } else if (Intrinsics.d(pf7Var, nf7.a)) {
            g06 g06Var6 = if7Var.f;
            if (g06Var6 != null) {
                viewGroup.removeView((LinearLayout) g06Var6.d);
            }
            linearLayout = null;
            if7Var.f = null;
            if7Var.b();
            c1t c1tVar = if7Var.e;
            g06Var2 = if7Var.f;
            if (g06Var2 != null || (linearLayout4 = (LinearLayout) g06Var2.d) == null) {
                iz7 iz7Var4 = if7Var.g;
                linearLayout3 = iz7Var4 == null ? (LinearLayout) iz7Var4.l : linearLayout;
            } else {
                linearLayout3 = linearLayout4;
            }
            c1tVar.f = linearLayout3;
            if (linearLayout3 == null) {
                ViewGroup.LayoutParams layoutParams2 = linearLayout3.getLayoutParams();
                ?? r8 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : linearLayout;
                if (r8 == 0) {
                    return;
                }
                int i8 = ((ViewGroup.MarginLayoutParams) r8).topMargin;
                int i9 = c1tVar.b;
                if (i8 == i9) {
                    return;
                }
                ((ViewGroup.MarginLayoutParams) r8).topMargin = i9;
                linearLayout3.requestLayout();
                return;
            }
            return;
        }
        linearLayout = null;
        c1t c1tVar2 = if7Var.e;
        g06Var2 = if7Var.f;
        if (g06Var2 != null) {
        }
        iz7 iz7Var42 = if7Var.g;
        if (iz7Var42 == null) {
        }
        c1tVar2.f = linearLayout3;
        if (linearLayout3 == null) {
        }
    }

    public final void b() {
        iz7 iz7Var = this.g;
        if (iz7Var != null) {
            PopupWindow popupWindow = this.h;
            if (popupWindow == null || !popupWindow.isShowing()) {
                this.a.removeView((LinearLayout) iz7Var.l);
            } else {
                PopupWindow popupWindow2 = this.h;
                if (popupWindow2 != null) {
                    popupWindow2.dismiss();
                }
                this.h = null;
            }
        }
        this.g = null;
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        this.i.close();
        g06 g06Var = this.f;
        if (g06Var != null) {
            this.a.removeView((LinearLayout) g06Var.d);
        }
        c1t c1tVar = this.e;
        ((ViewGroup) c1tVar.c).removeOnAttachStateChangeListener((jb) c1tVar.e);
        c1tVar.f = null;
        b();
    }
}
