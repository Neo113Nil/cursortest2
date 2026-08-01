package B0;

import android.graphics.Typeface;
import android.view.View;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f35b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ View f36c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f37d;

    public b(TextView textView, Typeface typeface, int i) {
        this.f36c = textView;
        this.f37d = typeface;
        this.f35b = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f34a) {
            case 0:
                ((BottomSheetBehavior) this.f37d).K(this.f36c, this.f35b, false);
                break;
            default:
                ((TextView) this.f36c).setTypeface((Typeface) this.f37d, this.f35b);
                break;
        }
    }

    public b(BottomSheetBehavior bottomSheetBehavior, View view, int i) {
        this.f37d = bottomSheetBehavior;
        this.f36c = view;
        this.f35b = i;
    }
}
