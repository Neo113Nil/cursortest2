package c0;

import android.text.InputFilter;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class g extends com.bumptech.glide.d {

    /* renamed from: d, reason: collision with root package name */
    public final f f5636d;

    public g(TextView textView) {
        this.f5636d = new f(textView);
    }

    @Override // com.bumptech.glide.d
    public final void E(boolean z6) {
        if (androidx.emoji2.text.j.f4740k != null) {
            this.f5636d.E(z6);
        }
    }

    @Override // com.bumptech.glide.d
    public final void F(boolean z6) {
        boolean z9 = androidx.emoji2.text.j.f4740k != null;
        f fVar = this.f5636d;
        if (z9) {
            fVar.F(z6);
        } else {
            fVar.f5635f = z6;
        }
    }

    @Override // com.bumptech.glide.d
    public final InputFilter[] s(InputFilter[] inputFilterArr) {
        return !(androidx.emoji2.text.j.f4740k != null) ? inputFilterArr : this.f5636d.s(inputFilterArr);
    }
}
