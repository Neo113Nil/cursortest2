package N0;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import x0.C0376a;

/* loaded from: classes.dex */
public final class a implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f633b;

    public /* synthetic */ a(int i, Object obj) {
        this.f632a = i;
        this.f633b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C0376a c0376a;
        switch (this.f632a) {
            case 0:
                A0.a aVar = (A0.a) this.f633b;
                ImageView imageView = aVar.f655n;
                if (imageView.getVisibility() != 0 || (c0376a = aVar.f644F) == null) {
                    return;
                }
                Rect rect = new Rect();
                imageView.getDrawingRect(rect);
                c0376a.setBounds(rect);
                c0376a.h(imageView, null);
                return;
            default:
                ((BottomAppBar$Behavior) this.f633b).getClass();
                throw null;
        }
    }
}
