package com.yandex.passport.internal.ui.bouncer.loading;

import android.content.Context;
import android.view.KeyEvent;
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
public final /* synthetic */ class k extends ezc implements pyc {
    public static final k a = new k(3, leu.class, "createView", "createView(Landroid/content/Context;II)Landroid/view/View;", 1);

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        KeyEvent.Callback a2;
        KeyEvent.Callback slotView;
        Context context = (Context) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        context.getClass();
        if (intValue == 0 && intValue2 == 0) {
            return (TextView) ((TextView.class.equals(TextView.class) || TextView.class.equals(AppCompatTextView.class)) ? new AppCompatTextView(context) : TextView.class.equals(Button.class) ? new Button(context) : (TextView.class.equals(ImageView.class) || TextView.class.equals(AppCompatImageView.class)) ? new AppCompatImageView(context) : (TextView.class.equals(EditText.class) || TextView.class.equals(kr0.class)) ? new kr0(context) : TextView.class.equals(Spinner.class) ? new Spinner(context) : (TextView.class.equals(ImageButton.class) || TextView.class.equals(AppCompatImageButton.class)) ? new AppCompatImageButton(context) : (TextView.class.equals(CheckBox.class) || TextView.class.equals(lq0.class)) ? new lq0(context) : (TextView.class.equals(RadioButton.class) || TextView.class.equals(pr0.class)) ? new pr0(context) : TextView.class.equals(RadioGroup.class) ? new RadioGroup(context) : TextView.class.equals(CheckedTextView.class) ? new CheckedTextView(context) : TextView.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context) : TextView.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context) : (TextView.class.equals(RatingBar.class) || TextView.class.equals(qr0.class)) ? new qr0(context) : (TextView.class.equals(SeekBar.class) || TextView.class.equals(sr0.class)) ? new sr0(context) : TextView.class.equals(ProgressBar.class) ? new ProgressBar(context) : TextView.class.equals(Space.class) ? new Space(context) : TextView.class.equals(RecyclerView.class) ? new RecyclerView(context) : TextView.class.equals(View.class) ? new View(context) : TextView.class.equals(Toolbar.class) ? new Toolbar(context) : TextView.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context) : TextView.class.equals(SwitchCompat.class) ? new SwitchMaterial(context) : nmt.b(context, TextView.class));
        }
        if (TextView.class.equals(TextView.class)) {
            a2 = new TextView(context, null, intValue, intValue2);
        } else {
            if (TextView.class.equals(AppCompatTextView.class)) {
                slotView = new AppCompatTextView(context, null, intValue);
            } else if (TextView.class.equals(Button.class)) {
                slotView = new Button(context, null, intValue, intValue2);
            } else if (TextView.class.equals(ImageView.class)) {
                slotView = new ImageView(context, null, intValue, intValue2);
            } else if (TextView.class.equals(AppCompatImageView.class)) {
                slotView = new AppCompatImageView(context, null, intValue);
            } else if (TextView.class.equals(EditText.class)) {
                slotView = new EditText(context, null, intValue, intValue2);
            } else if (TextView.class.equals(kr0.class)) {
                slotView = new kr0(context, null, intValue);
            } else if (TextView.class.equals(Spinner.class)) {
                slotView = new Spinner(context, null, intValue, intValue2);
            } else if (TextView.class.equals(ImageButton.class)) {
                slotView = new ImageButton(context, null, intValue, intValue2);
            } else if (TextView.class.equals(AppCompatImageButton.class)) {
                slotView = new AppCompatImageButton(context, null, intValue);
            } else if (TextView.class.equals(CheckBox.class)) {
                slotView = new CheckBox(context, null, intValue, intValue2);
            } else if (TextView.class.equals(lq0.class)) {
                slotView = new lq0(context, null, intValue);
            } else if (TextView.class.equals(RadioButton.class)) {
                slotView = new RadioButton(context, null, intValue, intValue2);
            } else if (TextView.class.equals(pr0.class)) {
                slotView = new pr0(context, null, intValue);
            } else if (TextView.class.equals(CheckedTextView.class)) {
                slotView = new CheckedTextView(context, null, intValue, intValue2);
            } else if (TextView.class.equals(AutoCompleteTextView.class)) {
                slotView = new AutoCompleteTextView(context, null, intValue, intValue2);
            } else if (TextView.class.equals(MultiAutoCompleteTextView.class)) {
                slotView = new MultiAutoCompleteTextView(context, null, intValue, intValue2);
            } else if (TextView.class.equals(RatingBar.class)) {
                slotView = new RatingBar(context, null, intValue, intValue2);
            } else if (TextView.class.equals(qr0.class)) {
                slotView = new qr0(context, null, intValue);
            } else if (TextView.class.equals(SeekBar.class)) {
                slotView = new SeekBar(context, null, intValue, intValue2);
            } else if (TextView.class.equals(sr0.class)) {
                slotView = new sr0(context, null, intValue);
            } else if (TextView.class.equals(ProgressBar.class)) {
                slotView = new ProgressBar(context, null, intValue, intValue2);
            } else if (TextView.class.equals(Space.class)) {
                slotView = new Space(context, null, intValue, intValue2);
            } else if (TextView.class.equals(RecyclerView.class)) {
                slotView = new RecyclerView(context, null, intValue);
            } else if (TextView.class.equals(Toolbar.class)) {
                slotView = new Toolbar(context, null, intValue);
            } else if (TextView.class.equals(View.class)) {
                slotView = new View(context, null, intValue, intValue2);
            } else if (TextView.class.equals(FloatingActionButton.class)) {
                slotView = new FloatingActionButton(context, null, intValue);
            } else if (TextView.class.equals(SwitchCompat.class)) {
                slotView = new SwitchMaterial(context, null, intValue);
            } else if (TextView.class.equals(SlotView.class)) {
                slotView = new SlotView(context, null, intValue, intValue2);
            } else {
                a2 = nmt.a(TextView.class, context, intValue, intValue2);
            }
            a2 = slotView;
        }
        return (TextView) a2;
    }
}
