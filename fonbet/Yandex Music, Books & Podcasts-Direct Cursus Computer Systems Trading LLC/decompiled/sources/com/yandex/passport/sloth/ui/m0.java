package com.yandex.passport.sloth.ui;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
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
public final /* synthetic */ class m0 extends ezc implements pyc {
    public static final m0 a = new m0(3, leu.class, "createView", "createView(Landroid/content/Context;II)Landroid/view/View;", 1);

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Context context = (Context) obj;
        int intValue = ((Number) obj2).intValue();
        int intValue2 = ((Number) obj3).intValue();
        context.getClass();
        if (intValue == 0 && intValue2 == 0) {
            return (WebView) ((WebView.class.equals(TextView.class) || WebView.class.equals(AppCompatTextView.class)) ? new AppCompatTextView(context) : WebView.class.equals(Button.class) ? new Button(context) : (WebView.class.equals(ImageView.class) || WebView.class.equals(AppCompatImageView.class)) ? new AppCompatImageView(context) : (WebView.class.equals(EditText.class) || WebView.class.equals(kr0.class)) ? new kr0(context) : WebView.class.equals(Spinner.class) ? new Spinner(context) : (WebView.class.equals(ImageButton.class) || WebView.class.equals(AppCompatImageButton.class)) ? new AppCompatImageButton(context) : (WebView.class.equals(CheckBox.class) || WebView.class.equals(lq0.class)) ? new lq0(context) : (WebView.class.equals(RadioButton.class) || WebView.class.equals(pr0.class)) ? new pr0(context) : WebView.class.equals(RadioGroup.class) ? new RadioGroup(context) : WebView.class.equals(CheckedTextView.class) ? new CheckedTextView(context) : WebView.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context) : WebView.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context) : (WebView.class.equals(RatingBar.class) || WebView.class.equals(qr0.class)) ? new qr0(context) : (WebView.class.equals(SeekBar.class) || WebView.class.equals(sr0.class)) ? new sr0(context) : WebView.class.equals(ProgressBar.class) ? new ProgressBar(context) : WebView.class.equals(Space.class) ? new Space(context) : WebView.class.equals(RecyclerView.class) ? new RecyclerView(context) : WebView.class.equals(View.class) ? new View(context) : WebView.class.equals(Toolbar.class) ? new Toolbar(context) : WebView.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context) : WebView.class.equals(SwitchCompat.class) ? new SwitchMaterial(context) : nmt.b(context, WebView.class));
        }
        return (WebView) (WebView.class.equals(TextView.class) ? new TextView(context, null, intValue, intValue2) : WebView.class.equals(AppCompatTextView.class) ? new AppCompatTextView(context, null, intValue) : WebView.class.equals(Button.class) ? new Button(context, null, intValue, intValue2) : WebView.class.equals(ImageView.class) ? new ImageView(context, null, intValue, intValue2) : WebView.class.equals(AppCompatImageView.class) ? new AppCompatImageView(context, null, intValue) : WebView.class.equals(EditText.class) ? new EditText(context, null, intValue, intValue2) : WebView.class.equals(kr0.class) ? new kr0(context, null, intValue) : WebView.class.equals(Spinner.class) ? new Spinner(context, null, intValue, intValue2) : WebView.class.equals(ImageButton.class) ? new ImageButton(context, null, intValue, intValue2) : WebView.class.equals(AppCompatImageButton.class) ? new AppCompatImageButton(context, null, intValue) : WebView.class.equals(CheckBox.class) ? new CheckBox(context, null, intValue, intValue2) : WebView.class.equals(lq0.class) ? new lq0(context, null, intValue) : WebView.class.equals(RadioButton.class) ? new RadioButton(context, null, intValue, intValue2) : WebView.class.equals(pr0.class) ? new pr0(context, null, intValue) : WebView.class.equals(CheckedTextView.class) ? new CheckedTextView(context, null, intValue, intValue2) : WebView.class.equals(AutoCompleteTextView.class) ? new AutoCompleteTextView(context, null, intValue, intValue2) : WebView.class.equals(MultiAutoCompleteTextView.class) ? new MultiAutoCompleteTextView(context, null, intValue, intValue2) : WebView.class.equals(RatingBar.class) ? new RatingBar(context, null, intValue, intValue2) : WebView.class.equals(qr0.class) ? new qr0(context, null, intValue) : WebView.class.equals(SeekBar.class) ? new SeekBar(context, null, intValue, intValue2) : WebView.class.equals(sr0.class) ? new sr0(context, null, intValue) : WebView.class.equals(ProgressBar.class) ? new ProgressBar(context, null, intValue, intValue2) : WebView.class.equals(Space.class) ? new Space(context, null, intValue, intValue2) : WebView.class.equals(RecyclerView.class) ? new RecyclerView(context, null, intValue) : WebView.class.equals(Toolbar.class) ? new Toolbar(context, null, intValue) : WebView.class.equals(View.class) ? new View(context, null, intValue, intValue2) : WebView.class.equals(FloatingActionButton.class) ? new FloatingActionButton(context, null, intValue) : WebView.class.equals(SwitchCompat.class) ? new SwitchMaterial(context, null, intValue) : WebView.class.equals(SlotView.class) ? new SlotView(context, null, intValue, intValue2) : nmt.a(WebView.class, context, intValue, intValue2));
    }
}
