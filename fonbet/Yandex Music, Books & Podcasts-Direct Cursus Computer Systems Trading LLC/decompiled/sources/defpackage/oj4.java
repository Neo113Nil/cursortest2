package defpackage;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.chip.Chip;
import com.yandex.passport.internal.ui.sloth.webcard.e1;
import de.hdodenhof.circleimageview.CircleImageView;

/* loaded from: classes3.dex */
public final class oj4 extends ViewOutlineProvider {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oj4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.a) {
            case 0:
                qj4 qj4Var = ((Chip) this.b).e;
                if (qj4Var == null) {
                    outline.setAlpha(0.0f);
                    break;
                } else {
                    qj4Var.getOutline(outline);
                    break;
                }
            case 1:
                CircleImageView circleImageView = (CircleImageView) this.b;
                if (!circleImageView.t) {
                    Rect rect = new Rect();
                    circleImageView.b.roundOut(rect);
                    outline.setRoundRect(rect, rect.width() / 2.0f);
                    break;
                } else {
                    ViewOutlineProvider.BACKGROUND.getOutline(view, outline);
                    break;
                }
            case 2:
                view.getClass();
                outline.getClass();
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ((e1) this.b).g.a);
                break;
            default:
                view.getClass();
                outline.getClass();
                Drawable drawable = (Drawable) this.b;
                if (drawable != null) {
                    drawable.getOutline(outline);
                    break;
                }
                break;
        }
    }
}
