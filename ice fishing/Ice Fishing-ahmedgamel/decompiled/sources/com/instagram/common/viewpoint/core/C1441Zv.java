package com.instagram.common.viewpoint.core;

import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.Zv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1441Zv extends LinearLayout {
    public static final int A03 = (int) (XX.A02 * 40.0f);
    public static final int A04 = (int) (XX.A02 * 20.0f);
    public static final int A05 = (int) (XX.A02 * 10.0f);
    public final C1154Ok A00;
    public final C1860gi A01;
    public final InterfaceC1425Zf A02;

    public C1441Zv(C1860gi c1860gi, C1154Ok c1154Ok, InterfaceC1425Zf interfaceC1425Zf, YM ym) {
        this(c1860gi, c1154Ok, interfaceC1425Zf, null, ym);
    }

    public C1441Zv(C1860gi c1860gi, C1154Ok c1154Ok, InterfaceC1425Zf interfaceC1425Zf, String str, YM ym) {
        super(c1860gi);
        this.A01 = c1860gi;
        this.A00 = c1154Ok;
        this.A02 = interfaceC1425Zf;
        setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        if (!TextUtils.isEmpty(str)) {
            View headerView = A01(str);
            headerView.setPadding(0, 0, 0, 0);
            View view = new View(getContext());
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, 1));
            YB.A0N(view, -10459280);
            addView(headerView, layoutParams);
            addView(view);
        }
        if (!TextUtils.isEmpty(this.A00.A03())) {
            View A00 = A00(ym, this.A00.A03());
            A00.setPadding(0, A05, 0, A05);
            addView(A00, layoutParams);
        }
        C1447a1 A032 = A03();
        A032.setPadding(0, A05, 0, 0);
        addView(A032, layoutParams);
    }

    private View A00(YM ym, String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        imageView.setImageBitmap(YN.A01(ym));
        TextView textView = new TextView(getContext());
        YB.A0a(textView, true, 14);
        textView.setTextColor(-10459280);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        textView.setText(str);
        textView.setPadding(A05, 0, 0, 0);
        textView.setFocusable(true);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, layoutParams);
        linearLayout.addView(textView, layoutParams2);
        return linearLayout;
    }

    private View A01(String str) {
        ImageView imageView = new ImageView(getContext());
        imageView.setColorFilter(-10459280);
        imageView.setImageBitmap(YN.A01(YM.BACK_ARROW));
        imageView.setPadding(0, A05, A05 * 2, A05);
        LinearLayout.LayoutParams titleParams = new LinearLayout.LayoutParams(A03, A03);
        imageView.setOnClickListener(new ViewOnClickListenerC1439Zt(this));
        TextView textView = new TextView(getContext());
        textView.setGravity(17);
        textView.setText(str);
        YB.A0a(textView, true, 16);
        textView.setTextColor(-14934495);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, A03, 0);
        layoutParams.gravity = 17;
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(0);
        linearLayout.addView(imageView, titleParams);
        linearLayout.addView(textView, layoutParams);
        return linearLayout;
    }

    private C1447a1 A03() {
        C1447a1 c1447a1 = new C1447a1(this.A01);
        for (C1154Ok c1154Ok : this.A00.A05()) {
            C1427Zh c1427Zh = new C1427Zh(this.A01);
            c1427Zh.setData(c1154Ok.A04(), null);
            c1427Zh.setOnClickListener(new ViewOnClickListenerC1440Zu(this, c1427Zh, c1154Ok));
            c1447a1.addView(c1427Zh);
        }
        return c1447a1;
    }
}
