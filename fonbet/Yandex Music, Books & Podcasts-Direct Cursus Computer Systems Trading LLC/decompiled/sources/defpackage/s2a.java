package defpackage;

import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import ru.yandex.music.R;

/* loaded from: classes5.dex */
public final /* synthetic */ class s2a implements DialogInterface.OnShowListener {
    @Override // android.content.DialogInterface.OnShowListener
    public final void onShow(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        View findViewById = ((ze3) dialogInterface).findViewById(R.id.design_bottom_sheet);
        BottomSheetBehavior from = findViewById != null ? BottomSheetBehavior.from(findViewById) : null;
        if (from != null) {
            from.setState(3);
        }
    }
}
