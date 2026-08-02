package com.yandex.passport.common.ui;

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
import com.yandex.passport.common.ui.view.LottieAnimationViewBuilder;
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
public final /* synthetic */ class d extends ezc implements pyc {
    public static final d a = new d(3, leu.class, "createView", "createView(Landroid/content/Context;II)Landroid/view/View;", 1);

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        context.getClass();
        if (intValue == 0 && intValue2 == 0) {
            return (LottieAnimationViewBuilder) ((LottieAnimationViewBuilder.class.equals(TextView.class) || LottieAnimationViewBuilder.class.equals(AppCompatTextView.class)) ? new AppCompatTextView(context) : LottieAnimationViewBuilder.class.equals(Button.class) ? new Button(context) : (LottieAnimationViewBuilder.class.equals(ImageView.class) || LottieAnimationViewBuilder.class.equals(AppCompatImageView.class)) ? new AppCompatImageView(context) : (LottieAnimationViewBuilder.class.equals(EditText.class) || LottieAnimationViewBuilder.class.equals(kr0.class)) ? new kr0(context) : LottieAnimationViewBuilder.class.equals(Spinner.class) ? new Spinner(context) : (LottieAnimationViewBuilder.class.equals(ImageButton.class) || LottieAnimationViewBuilder.class.equals(AppCompatImageButton.class)) ? new AppCompatImageButton(context) : (LottieAnimationViewBuilder.class.equals(CheckBox.class) || LottieAnimationViewBuilder.class.equals(lq0.class)) ? new lq0(context) : (LottieAnimationViewBuilder.class.equals(RadioButton.class) || LottieAnimationViewBuilder.class.equals(pr0.class)) ? new pr0(context) : LottieAnimationViewBuilder.class.equals(RadioGroup.class) ? new RadioGroup(context) : LottieAnimationViewBuilder.class.equals(CheckedTextView.class) ? new CheckedTextView(context) : LottieAnimationViewBuilder.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context) : LottieAnimationViewBuilder.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context) : (LottieAnimationViewBuilder.class.equals(RatingBar.class) || LottieAnimationViewBuilder.class.equals(qr0.class)) ? new qr0(context) : (LottieAnimationViewBuilder.class.equals(SeekBar.class) || LottieAnimationViewBuilder.class.equals(sr0.class)) ? new sr0(context) : LottieAnimationViewBuilder.class.equals(ProgressBar.class) ? new ProgressBar(context) : LottieAnimationViewBuilder.class.equals(Space.class) ? new Space(context) : LottieAnimationViewBuilder.class.equals(RecyclerView.class) ? new RecyclerView(context) : LottieAnimationViewBuilder.class.equals(View.class) ? new View(context) : LottieAnimationViewBuilder.class.equals(Toolbar.class) ? new Toolbar(context) : LottieAnimationViewBuilder.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context) : LottieAnimationViewBuilder.class.equals(SwitchCompat.class) ? new SwitchMaterial(context) : nmt.b(context, LottieAnimationViewBuilder.class));
        }
        return (LottieAnimationViewBuilder) (LottieAnimationViewBuilder.class.equals(TextView.class) ? new TextView(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(AppCompatTextView.class) ? new AppCompatTextView(context, null, intValue) : LottieAnimationViewBuilder.class.equals(Button.class) ? new Button(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(ImageView.class) ? new ImageView(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(AppCompatImageView.class) ? new AppCompatImageView(context, null, intValue) : LottieAnimationViewBuilder.class.equals(EditText.class) ? new EditText(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(kr0.class) ? new kr0(context, null, intValue) : LottieAnimationViewBuilder.class.equals(Spinner.class) ? new Spinner(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(ImageButton.class) ? new ImageButton(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(AppCompatImageButton.class) ? new AppCompatImageButton(context, null, intValue) : LottieAnimationViewBuilder.class.equals(CheckBox.class) ? new CheckBox(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(lq0.class) ? new lq0(context, null, intValue) : LottieAnimationViewBuilder.class.equals(RadioButton.class) ? new RadioButton(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(pr0.class) ? new pr0(context, null, intValue) : LottieAnimationViewBuilder.class.equals(CheckedTextView.class) ? new CheckedTextView(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(RatingBar.class) ? new RatingBar(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(qr0.class) ? new qr0(context, null, intValue) : LottieAnimationViewBuilder.class.equals(SeekBar.class) ? new SeekBar(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(sr0.class) ? new sr0(context, null, intValue) : LottieAnimationViewBuilder.class.equals(ProgressBar.class) ? new ProgressBar(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(Space.class) ? new Space(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(RecyclerView.class) ? new RecyclerView(context, null, intValue) : LottieAnimationViewBuilder.class.equals(Toolbar.class) ? new Toolbar(context, null, intValue) : LottieAnimationViewBuilder.class.equals(View.class) ? new View(context, null, intValue, intValue2) : LottieAnimationViewBuilder.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context, null, intValue) : LottieAnimationViewBuilder.class.equals(SwitchCompat.class) ? new SwitchMaterial(context, null, intValue) : LottieAnimationViewBuilder.class.equals(SlotView.class) ? new SlotView(context, null, intValue, intValue2) : nmt.a(LottieAnimationViewBuilder.class, context, intValue, intValue2));
    }
}
