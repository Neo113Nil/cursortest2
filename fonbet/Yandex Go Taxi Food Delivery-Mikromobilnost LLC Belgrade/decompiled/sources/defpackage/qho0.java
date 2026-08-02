package defpackage;

import android.view.View;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.scooters.presentation.feedback.comment.ScootersPhotoRemoveButton;
import ru.yandex.taxi.widget.progress.SpinnerProgressBar;

/* loaded from: classes6.dex */
public final class qho0 implements zo31 {
    public final ScootersPhotoRemoveButton a;
    public final GoImageView b;
    public final SpinnerProgressBar c;

    public qho0(ScootersPhotoRemoveButton scootersPhotoRemoveButton, GoImageView goImageView, SpinnerProgressBar spinnerProgressBar) {
        this.a = scootersPhotoRemoveButton;
        this.b = goImageView;
        this.c = spinnerProgressBar;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
