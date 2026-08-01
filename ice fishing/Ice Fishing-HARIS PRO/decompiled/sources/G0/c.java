package G0;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;

/* loaded from: classes.dex */
public final class c extends ViewOutlineProvider {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Chip f281a;

    public c(Chip chip) {
        this.f281a = chip;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        f fVar = this.f281a.e;
        if (fVar != null) {
            fVar.getOutline(outline);
        } else {
            outline.setAlpha(RecyclerView.f2111C0);
        }
    }
}
