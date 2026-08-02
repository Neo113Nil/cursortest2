package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

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
public final /* synthetic */ class m1 extends ezc implements pyc {
    public static final m1 a = new m1(3, leu.class, "createView", "createView(Landroid/content/Context;II)Landroid/view/View;", 1);

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        context.getClass();
        return (intValue == 0 && intValue2 == 0) ? (View.class.equals(TextView.class) || View.class.equals(AppCompatTextView.class)) ? new AppCompatTextView(context) : View.class.equals(Button.class) ? new Button(context) : (View.class.equals(ImageView.class) || View.class.equals(AppCompatImageView.class)) ? new AppCompatImageView(context) : (View.class.equals(EditText.class) || View.class.equals(kr0.class)) ? new kr0(context) : View.class.equals(Spinner.class) ? new Spinner(context) : (View.class.equals(ImageButton.class) || View.class.equals(AppCompatImageButton.class)) ? new AppCompatImageButton(context) : (View.class.equals(CheckBox.class) || View.class.equals(lq0.class)) ? new lq0(context) : (View.class.equals(RadioButton.class) || View.class.equals(pr0.class)) ? new pr0(context) : View.class.equals(RadioGroup.class) ? new RadioGroup(context) : View.class.equals(CheckedTextView.class) ? new CheckedTextView(context) : View.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context) : View.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context) : (View.class.equals(RatingBar.class) || View.class.equals(qr0.class)) ? new qr0(context) : (View.class.equals(SeekBar.class) || View.class.equals(sr0.class)) ? new sr0(context) : View.class.equals(ProgressBar.class) ? new ProgressBar(context) : View.class.equals(Space.class) ? new Space(context) : View.class.equals(RecyclerView.class) ? new RecyclerView(context) : View.class.equals(View.class) ? new View(context) : View.class.equals(Toolbar.class) ? new Toolbar(context) : View.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context) : View.class.equals(SwitchCompat.class) ? new SwitchMaterial(context) : nmt.b(context, View.class) : View.class.equals(TextView.class) ? new TextView(context, null, intValue, intValue2) : View.class.equals(AppCompatTextView.class) ? new AppCompatTextView(context, null, intValue) : View.class.equals(Button.class) ? new Button(context, null, intValue, intValue2) : View.class.equals(ImageView.class) ? new ImageView(context, null, intValue, intValue2) : View.class.equals(AppCompatImageView.class) ? new AppCompatImageView(context, null, intValue) : View.class.equals(EditText.class) ? new EditText(context, null, intValue, intValue2) : View.class.equals(kr0.class) ? new kr0(context, null, intValue) : View.class.equals(Spinner.class) ? new Spinner(context, null, intValue, intValue2) : View.class.equals(ImageButton.class) ? new ImageButton(context, null, intValue, intValue2) : View.class.equals(AppCompatImageButton.class) ? new AppCompatImageButton(context, null, intValue) : View.class.equals(CheckBox.class) ? new CheckBox(context, null, intValue, intValue2) : View.class.equals(lq0.class) ? new lq0(context, null, intValue) : View.class.equals(RadioButton.class) ? new RadioButton(context, null, intValue, intValue2) : View.class.equals(pr0.class) ? new pr0(context, null, intValue) : View.class.equals(CheckedTextView.class) ? new CheckedTextView(context, null, intValue, intValue2) : View.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context, null, intValue, intValue2) : View.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context, null, intValue, intValue2) : View.class.equals(RatingBar.class) ? new RatingBar(context, null, intValue, intValue2) : View.class.equals(qr0.class) ? new qr0(context, null, intValue) : View.class.equals(SeekBar.class) ? new SeekBar(context, null, intValue, intValue2) : View.class.equals(sr0.class) ? new sr0(context, null, intValue) : View.class.equals(ProgressBar.class) ? new ProgressBar(context, null, intValue, intValue2) : View.class.equals(Space.class) ? new Space(context, null, intValue, intValue2) : View.class.equals(RecyclerView.class) ? new RecyclerView(context, null, intValue) : View.class.equals(Toolbar.class) ? new Toolbar(context, null, intValue) : View.class.equals(View.class) ? new View(context, null, intValue, intValue2) : View.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context, null, intValue) : View.class.equals(SwitchCompat.class) ? new SwitchMaterial(context, null, intValue) : View.class.equals(SlotView.class) ? new SlotView(context, null, intValue, intValue2) : nmt.a(View.class, context, intValue, intValue2);
    }
}
