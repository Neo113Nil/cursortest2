package com.yandex.passport.internal.ui.bouncer.roundabout.items;

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
import com.yandex.passport.internal.badges.MaxLinesChipGroup;
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
public final /* synthetic */ class k extends ezc implements pyc {
    public static final k a = new k(3, leu.class, "createView", "createView(Landroid/content/Context;II)Landroid/view/View;", 1);

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        context.getClass();
        if (intValue == 0 && intValue2 == 0) {
            return (MaxLinesChipGroup) ((MaxLinesChipGroup.class.equals(TextView.class) || MaxLinesChipGroup.class.equals(AppCompatTextView.class)) ? new AppCompatTextView(context) : MaxLinesChipGroup.class.equals(Button.class) ? new Button(context) : (MaxLinesChipGroup.class.equals(ImageView.class) || MaxLinesChipGroup.class.equals(AppCompatImageView.class)) ? new AppCompatImageView(context) : (MaxLinesChipGroup.class.equals(EditText.class) || MaxLinesChipGroup.class.equals(kr0.class)) ? new kr0(context) : MaxLinesChipGroup.class.equals(Spinner.class) ? new Spinner(context) : (MaxLinesChipGroup.class.equals(ImageButton.class) || MaxLinesChipGroup.class.equals(AppCompatImageButton.class)) ? new AppCompatImageButton(context) : (MaxLinesChipGroup.class.equals(CheckBox.class) || MaxLinesChipGroup.class.equals(lq0.class)) ? new lq0(context) : (MaxLinesChipGroup.class.equals(RadioButton.class) || MaxLinesChipGroup.class.equals(pr0.class)) ? new pr0(context) : MaxLinesChipGroup.class.equals(RadioGroup.class) ? new RadioGroup(context) : MaxLinesChipGroup.class.equals(CheckedTextView.class) ? new CheckedTextView(context) : MaxLinesChipGroup.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context) : MaxLinesChipGroup.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context) : (MaxLinesChipGroup.class.equals(RatingBar.class) || MaxLinesChipGroup.class.equals(qr0.class)) ? new qr0(context) : (MaxLinesChipGroup.class.equals(SeekBar.class) || MaxLinesChipGroup.class.equals(sr0.class)) ? new sr0(context) : MaxLinesChipGroup.class.equals(ProgressBar.class) ? new ProgressBar(context) : MaxLinesChipGroup.class.equals(Space.class) ? new Space(context) : MaxLinesChipGroup.class.equals(RecyclerView.class) ? new RecyclerView(context) : MaxLinesChipGroup.class.equals(View.class) ? new View(context) : MaxLinesChipGroup.class.equals(Toolbar.class) ? new Toolbar(context) : MaxLinesChipGroup.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context) : MaxLinesChipGroup.class.equals(SwitchCompat.class) ? new SwitchMaterial(context) : nmt.b(context, MaxLinesChipGroup.class));
        }
        return (MaxLinesChipGroup) (MaxLinesChipGroup.class.equals(TextView.class) ? new TextView(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(AppCompatTextView.class) ? new AppCompatTextView(context, null, intValue) : MaxLinesChipGroup.class.equals(Button.class) ? new Button(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(ImageView.class) ? new ImageView(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(AppCompatImageView.class) ? new AppCompatImageView(context, null, intValue) : MaxLinesChipGroup.class.equals(EditText.class) ? new EditText(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(kr0.class) ? new kr0(context, null, intValue) : MaxLinesChipGroup.class.equals(Spinner.class) ? new Spinner(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(ImageButton.class) ? new ImageButton(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(AppCompatImageButton.class) ? new AppCompatImageButton(context, null, intValue) : MaxLinesChipGroup.class.equals(CheckBox.class) ? new CheckBox(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(lq0.class) ? new lq0(context, null, intValue) : MaxLinesChipGroup.class.equals(RadioButton.class) ? new RadioButton(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(pr0.class) ? new pr0(context, null, intValue) : MaxLinesChipGroup.class.equals(CheckedTextView.class) ? new CheckedTextView(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(RatingBar.class) ? new RatingBar(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(qr0.class) ? new qr0(context, null, intValue) : MaxLinesChipGroup.class.equals(SeekBar.class) ? new SeekBar(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(sr0.class) ? new sr0(context, null, intValue) : MaxLinesChipGroup.class.equals(ProgressBar.class) ? new ProgressBar(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(Space.class) ? new Space(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(RecyclerView.class) ? new RecyclerView(context, null, intValue) : MaxLinesChipGroup.class.equals(Toolbar.class) ? new Toolbar(context, null, intValue) : MaxLinesChipGroup.class.equals(View.class) ? new View(context, null, intValue, intValue2) : MaxLinesChipGroup.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context, null, intValue) : MaxLinesChipGroup.class.equals(SwitchCompat.class) ? new SwitchMaterial(context, null, intValue) : MaxLinesChipGroup.class.equals(SlotView.class) ? new SlotView(context, null, intValue, intValue2) : nmt.a(MaxLinesChipGroup.class, context, intValue, intValue2));
    }
}
