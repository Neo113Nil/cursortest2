package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;
import defpackage.fdh;
import defpackage.iq0;
import defpackage.lch;
import defpackage.ldh;
import defpackage.lq0;
import defpackage.pr0;
import defpackage.ws0;

/* loaded from: classes3.dex */
public class MaterialComponentsViewInflater extends ws0 {
    @Override // defpackage.ws0
    public final iq0 a(Context context, AttributeSet attributeSet) {
        return new lch(context, attributeSet);
    }

    @Override // defpackage.ws0
    public final AppCompatButton b(Context context, AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // defpackage.ws0
    public final lq0 c(Context context, AttributeSet attributeSet) {
        return new fdh(context, attributeSet);
    }

    @Override // defpackage.ws0
    public final pr0 d(Context context, AttributeSet attributeSet) {
        return new ldh(context, attributeSet);
    }

    @Override // defpackage.ws0
    public final AppCompatTextView e(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }
}
