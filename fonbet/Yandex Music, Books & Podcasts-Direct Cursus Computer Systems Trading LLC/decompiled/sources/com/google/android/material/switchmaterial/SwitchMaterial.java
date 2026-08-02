package com.google.android.material.switchmaterial;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SwitchCompat;
import defpackage.bcx;
import defpackage.bg3;
import defpackage.qgg;
import defpackage.u2b;
import defpackage.vdn;

/* loaded from: classes3.dex */
public class SwitchMaterial extends SwitchCompat {
    public static final int[][] G0 = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
    public final u2b C0;
    public ColorStateList D0;
    public ColorStateList E0;
    public boolean F0;

    public SwitchMaterial(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(bg3.p0(context, attributeSet, i, ru.yandex.music.R.style.Widget_MaterialComponents_CompoundButton_Switch), attributeSet, i);
        Context context2 = getContext();
        this.C0 = new u2b(context2);
        bcx.t(context2, attributeSet, i, ru.yandex.music.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        int[] iArr = vdn.S;
        bcx.u(context2, attributeSet, iArr, i, ru.yandex.music.R.style.Widget_MaterialComponents_CompoundButton_Switch, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, ru.yandex.music.R.style.Widget_MaterialComponents_CompoundButton_Switch);
        this.F0 = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.D0 == null) {
            int N = qgg.N(ru.yandex.music.R.attr.colorSurface, this);
            int N2 = qgg.N(ru.yandex.music.R.attr.colorControlActivated, this);
            float dimension = getResources().getDimension(ru.yandex.music.R.dimen.mtrl_switch_thumb_elevation);
            u2b u2bVar = this.C0;
            if (u2bVar.a) {
                float f = 0.0f;
                for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
                    f += ((View) parent).getElevation();
                }
                dimension += f;
            }
            int a = u2bVar.a(N, dimension);
            this.D0 = new ColorStateList(G0, new int[]{qgg.W(N, 1.0f, N2), a, qgg.W(N, 0.38f, N2), a});
        }
        return this.D0;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.E0 == null) {
            int N = qgg.N(ru.yandex.music.R.attr.colorSurface, this);
            int N2 = qgg.N(ru.yandex.music.R.attr.colorControlActivated, this);
            int N3 = qgg.N(ru.yandex.music.R.attr.colorOnSurface, this);
            this.E0 = new ColorStateList(G0, new int[]{qgg.W(N, 0.54f, N2), qgg.W(N, 0.32f, N3), qgg.W(N, 0.12f, N2), qgg.W(N, 0.12f, N3)});
        }
        return this.E0;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.F0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.F0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.F0 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        } else {
            setThumbTintList(null);
            setTrackTintList(null);
        }
    }

    public SwitchMaterial(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ru.yandex.music.R.attr.switchStyle);
    }

    public SwitchMaterial(@NonNull Context context) {
        this(context, null);
    }
}
