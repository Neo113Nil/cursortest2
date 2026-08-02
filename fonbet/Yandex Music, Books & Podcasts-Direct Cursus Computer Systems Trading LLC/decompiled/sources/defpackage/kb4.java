package defpackage;

import android.graphics.Rect;
import android.view.View;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class kb4 {
    public final /* synthetic */ int a;
    public View b;
    public boolean c;

    public kb4(sb4 sb4Var, View view, Rect rect, Rect rect2, Rect rect3, boolean z) {
        this.a = 1;
        this.c = z;
        this.b = view;
    }

    public void a(View view) {
        switch (this.a) {
            case 0:
                CharSequence contentDescription = view.getContentDescription();
                contentDescription.getClass();
                if (!StringsKt.U(contentDescription) && this.c) {
                    view.setVisibility(view.getVisibility() == 4 ? 0 : 4);
                    view.postDelayed(new qf0(10, this, view), 500L);
                    break;
                } else {
                    view.setVisibility(4);
                    break;
                }
            default:
                CharSequence contentDescription2 = view.getContentDescription();
                contentDescription2.getClass();
                if (!StringsKt.U(contentDescription2) && this.c) {
                    view.setVisibility(view.getVisibility() == 4 ? 0 : 4);
                    view.postDelayed(new jt6(8, this, view), 500L);
                    break;
                } else {
                    view.setVisibility(4);
                    break;
                }
                break;
        }
    }

    public /* synthetic */ kb4(int i) {
        this.a = i;
    }
}
