package defpackage;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.MultiAutoCompleteTextView;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.switchmaterial.SwitchMaterial;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class al6 extends CoordinatorLayout implements rof {
    public final /* synthetic */ sof y;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public al6(@NotNull Context context) {
        this(context, (CoordinatorLayout.class.equals(TextView.class) || CoordinatorLayout.class.equals(AppCompatTextView.class)) ? R.attr.textViewStyle : CoordinatorLayout.class.equals(Button.class) ? R.attr.buttonStyle : CoordinatorLayout.class.equals(EditText.class) ? R.attr.editTextStyle : CoordinatorLayout.class.equals(kr0.class) ? ru.yandex.music.R.attr.editTextStyle : CoordinatorLayout.class.equals(Spinner.class) ? R.attr.spinnerStyle : CoordinatorLayout.class.equals(ImageButton.class) ? R.attr.imageButtonStyle : CoordinatorLayout.class.equals(AppCompatImageButton.class) ? ru.yandex.music.R.attr.imageButtonStyle : CoordinatorLayout.class.equals(CheckBox.class) ? R.attr.checkboxStyle : CoordinatorLayout.class.equals(lq0.class) ? ru.yandex.music.R.attr.checkboxStyle : CoordinatorLayout.class.equals(RadioButton.class) ? R.attr.radioButtonStyle : CoordinatorLayout.class.equals(pr0.class) ? ru.yandex.music.R.attr.radioButtonStyle : CoordinatorLayout.class.equals(CheckedTextView.class) ? R.attr.checkedTextViewStyle : (CoordinatorLayout.class.equals(AutoCompleteTextView.class) || CoordinatorLayout.class.equals(MultiAutoCompleteTextView.class)) ? 16842859 : CoordinatorLayout.class.equals(RatingBar.class) ? R.attr.ratingBarStyle : CoordinatorLayout.class.equals(qr0.class) ? ru.yandex.music.R.attr.ratingBarStyle : CoordinatorLayout.class.equals(SeekBar.class) ? R.attr.seekBarStyle : CoordinatorLayout.class.equals(sr0.class) ? ru.yandex.music.R.attr.seekBarStyle : CoordinatorLayout.class.equals(ProgressBar.class) ? R.attr.progressBarStyle : CoordinatorLayout.class.equals(RecyclerView.class) ? ru.yandex.music.R.attr.recyclerViewStyle : CoordinatorLayout.class.equals(CoordinatorLayout.class) ? ru.yandex.music.R.attr.coordinatorLayoutStyle : CoordinatorLayout.class.equals(Toolbar.class) ? ru.yandex.music.R.attr.toolbarStyle : CoordinatorLayout.class.equals(FloatingActionButton.class) ? ru.yandex.music.R.attr.floatingActionButtonStyle : (CoordinatorLayout.class.equals(SwitchCompat.class) || CoordinatorLayout.class.equals(SwitchMaterial.class)) ? odn.switchStyle : 0, 0);
        context.getClass();
    }

    @Override // defpackage.hdu
    @NotNull
    public Context getCtx() {
        Context context = getContext();
        context.getClass();
        return context;
    }

    @Override // defpackage.rof
    public final void j(View view) {
        view.getClass();
        this.y.j(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al6(@NotNull Context context, int i, int i2) {
        super(context, null, i);
        context.getClass();
        sof sofVar = new sof(context, zk6.a);
        this.y = sofVar;
        sofVar.c = this;
    }
}
