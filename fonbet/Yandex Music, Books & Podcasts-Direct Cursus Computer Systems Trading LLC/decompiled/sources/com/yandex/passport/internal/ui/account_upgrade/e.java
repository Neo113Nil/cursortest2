package com.yandex.passport.internal.ui.account_upgrade;

import android.content.Context;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Space;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.lightside.slab.SlotView;
import defpackage.ezc;
import defpackage.kr0;
import defpackage.leu;
import defpackage.lq0;
import defpackage.nmt;
import defpackage.pr0;
import defpackage.pyc;
import defpackage.qr0;
import defpackage.sr0;

/* loaded from: classes4.dex */
public final /* synthetic */ class e extends ezc implements pyc {
    public static final e a = new e(3, leu.class, "createView", "createView(Landroid/content/Context;II)Landroid/view/View;", 1);

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        context.getClass();
        if (intValue == 0 && intValue2 == 0) {
            return (com.yandex.passport.common.ui.view.d) ((com.yandex.passport.common.ui.view.d.class.equals(TextView.class) || com.yandex.passport.common.ui.view.d.class.equals(AppCompatTextView.class)) ? new AppCompatTextView(context) : com.yandex.passport.common.ui.view.d.class.equals(Button.class) ? new Button(context) : (com.yandex.passport.common.ui.view.d.class.equals(ImageView.class) || com.yandex.passport.common.ui.view.d.class.equals(AppCompatImageView.class)) ? new AppCompatImageView(context) : (com.yandex.passport.common.ui.view.d.class.equals(EditText.class) || com.yandex.passport.common.ui.view.d.class.equals(kr0.class)) ? new kr0(context) : com.yandex.passport.common.ui.view.d.class.equals(Spinner.class) ? new Spinner(context) : (com.yandex.passport.common.ui.view.d.class.equals(ImageButton.class) || com.yandex.passport.common.ui.view.d.class.equals(AppCompatImageButton.class)) ? new AppCompatImageButton(context) : (com.yandex.passport.common.ui.view.d.class.equals(CheckBox.class) || com.yandex.passport.common.ui.view.d.class.equals(lq0.class)) ? new lq0(context) : (com.yandex.passport.common.ui.view.d.class.equals(RadioButton.class) || com.yandex.passport.common.ui.view.d.class.equals(pr0.class)) ? new pr0(context) : com.yandex.passport.common.ui.view.d.class.equals(RadioGroup.class) ? new RadioGroup(context) : com.yandex.passport.common.ui.view.d.class.equals(CheckedTextView.class) ? new CheckedTextView(context) : com.yandex.passport.common.ui.view.d.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context) : com.yandex.passport.common.ui.view.d.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context) : (com.yandex.passport.common.ui.view.d.class.equals(RatingBar.class) || com.yandex.passport.common.ui.view.d.class.equals(qr0.class)) ? new qr0(context) : (com.yandex.passport.common.ui.view.d.class.equals(SeekBar.class) || com.yandex.passport.common.ui.view.d.class.equals(sr0.class)) ? new sr0(context) : com.yandex.passport.common.ui.view.d.class.equals(ProgressBar.class) ? new ProgressBar(context) : com.yandex.passport.common.ui.view.d.class.equals(Space.class) ? new Space(context) : com.yandex.passport.common.ui.view.d.class.equals(RecyclerView.class) ? new RecyclerView(context) : com.yandex.passport.common.ui.view.d.class.equals(View.class) ? new View(context) : com.yandex.passport.common.ui.view.d.class.equals(Toolbar.class) ? new Toolbar(context) : com.yandex.passport.common.ui.view.d.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context) : com.yandex.passport.common.ui.view.d.class.equals(SwitchCompat.class) ? new SwitchMaterial(context) : nmt.b(context, com.yandex.passport.common.ui.view.d.class));
        }
        return (com.yandex.passport.common.ui.view.d) (com.yandex.passport.common.ui.view.d.class.equals(TextView.class) ? new TextView(context, null, intValue, intValue2) : com.yandex.passport.common.ui.view.d.class.equals(AppCompatTextView.class) ? new AppCompatTextView(context, null, intValue) : com.yandex.passport.common.ui.view.d.class.equals(Button.class) ? new Button(context, null, intValue, intValue2) : com.yandex.passport.common.ui.view.d.class.equals(ImageView.class) ? new ImageView(context, null, intValue, intValue2) : com.yandex.passport.common.ui.view.d.class.equals(AppCompatImageView.class) ? new AppCompatImageView(context, null, intValue) : com.yandex.passport.common.ui.view.d.class.equals(EditText.class) ? new EditText(context, null, intValue, intValue2) : com.yandex.passport.common.ui.view.d.class.equals(kr0.class) ? new kr0(context, null, intValue) : com.yandex.passport.common.ui.view.d.class.equals(Spinner.class) ? new Spinner(context, null, intValue, intValue2) : com.yandex.passport.common.ui.view.d.class.equals(ImageButton.class) ? new ImageButton(context, null, intValue, intValue2) : com.yandex.passport.common.ui.view.d.class.equals(AppCompatImageButton.class) ? new AppCompatImageButton(context, null, intValue) : com.yandex.passport.common.ui.view.d.class.equals(CheckBox.class) ? new CheckBox(context, null, intValue, intValue2) : com.yandex.passport.common.ui.view.d.class.equals(lq0.class) ? new lq0(context, null, intValue) : com.yandex.passport.common.ui.view.d.class.equals(RadioButton.class) ? new RadioButton(context, null, intValue, intValue2) : com.yandex.passport.common.ui.view.d.class.equals(pr0.class) ? new pr0(context, null, intValue) : com.yandex.passport.common.ui.view.d.class.equals(CheckedTextView.class) ? new CheckedTextView(context, null, intValue, intValue2) : com.yandex.passport.common.ui.view.d.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context, null, intValue, intValue2) : com.yandex.passport.common.ui.view.d.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context, null, intValue, intValue2) : com.yandex.passport.common.ui.view.d.class.equals(RatingBar.class) ? new RatingBar(context, null, intValue, intValue2) : com.yandex.passport.common.ui.view.d.class.equals(qr0.class) ? new qr0(context, null, intValue) : com.yandex.passport.common.ui.view.d.class.equals(SeekBar.class) ? new SeekBar(context, null, intValue, intValue2) : com.yandex.passport.common.ui.view.d.class.equals(sr0.class) ? new sr0(context, null, intValue) : com.yandex.passport.common.ui.view.d.class.equals(ProgressBar.class) ? new ProgressBar(context, null, intValue, intValue2) : com.yandex.passport.common.ui.view.d.class.equals(Space.class) ? new Space(context, null, intValue, intValue2) : com.yandex.passport.common.ui.view.d.class.equals(RecyclerView.class) ? new RecyclerView(context, null, intValue) : com.yandex.passport.common.ui.view.d.class.equals(Toolbar.class) ? new Toolbar(context, null, intValue) : com.yandex.passport.common.ui.view.d.class.equals(View.class) ? new View(context, null, intValue, intValue2) : com.yandex.passport.common.ui.view.d.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context, null, intValue) : com.yandex.passport.common.ui.view.d.class.equals(SwitchCompat.class) ? new SwitchMaterial(context, null, intValue) : com.yandex.passport.common.ui.view.d.class.equals(SlotView.class) ? new SlotView(context, null, intValue, intValue2) : nmt.a(com.yandex.passport.common.ui.view.d.class, context, intValue, intValue2));
    }
}
