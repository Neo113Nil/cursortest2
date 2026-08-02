package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.passport.R;
import com.yandex.passport.internal.ui.bouncer.roundabout.c0;
import com.yandex.passport.internal.ui.bouncer.roundabout.e;

/* loaded from: classes3.dex */
public final class vrq extends b6 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vrq(Context context, int i) {
        super(context, 10);
        this.d = i;
    }

    @Override // defpackage.b6
    public final View z(hdu hduVar) {
        switch (this.d) {
            case 0:
                zjq zjqVar = new zjq(hduVar.getCtx(), null, 0, 6, null);
                zjqVar.setVisibility(8);
                return zjqVar;
            case 1:
                qvc qvcVar = new qvc(ezf.a0(hduVar.getCtx(), 0), 0, 0);
                if (hduVar instanceof rof) {
                    ((rof) hduVar).j(qvcVar);
                }
                qvcVar.setBackgroundColor(0);
                return qvcVar;
            case 2:
                View view = (View) e.a.invoke(ezf.a0(hduVar.getCtx(), 0), 0, 0);
                if (hduVar instanceof rof) {
                    ((rof) hduVar).j(view);
                }
                return (ImageView) view;
            default:
                View view2 = (View) c0.a.invoke(ezf.a0(hduVar.getCtx(), 0), 0, 0);
                if (hduVar instanceof rof) {
                    ((rof) hduVar).j(view2);
                }
                TextView textView = (TextView) view2;
                textView.setTextSize(24.0f);
                ldg.K(textView, R.color.passport_roundabout_text_primary);
                ldg.J(textView, ru.yandex.music.R.font.ya_bold);
                textView.setText(R.string.passport_accounts);
                return textView;
        }
    }
}
