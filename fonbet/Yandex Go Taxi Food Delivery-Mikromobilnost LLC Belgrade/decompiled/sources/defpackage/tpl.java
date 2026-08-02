package defpackage;

import android.widget.ImageView;
import com.yandex.div.legacy.BackgroundImageDrawable;
import com.yandex.div.legacy.view.DivView;

/* loaded from: classes11.dex */
public final class tpl extends l9y {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tpl(DivView divView, Object obj, int i) {
        super(divView);
        this.b = i;
        this.c = obj;
    }

    @Override // defpackage.k9v
    public final void e(ad7 ad7Var) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((BackgroundImageDrawable) obj).setOriginalBitmap(ad7Var.a);
                break;
            case 1:
                ((BackgroundImageDrawable) obj).setOriginalBitmap(ad7Var.a);
                break;
            default:
                ((ImageView) obj).setImageBitmap(ad7Var.a);
                break;
        }
    }
}
