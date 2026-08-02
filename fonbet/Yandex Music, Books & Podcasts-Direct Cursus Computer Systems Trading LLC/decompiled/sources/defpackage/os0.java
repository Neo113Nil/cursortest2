package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public final class os0 extends ns0 {
    public final /* synthetic */ AppCompatTextView g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public os0(AppCompatTextView appCompatTextView) {
        super(appCompatTextView);
        this.g = appCompatTextView;
    }

    @Override // defpackage.sld, defpackage.ms0
    public final void s(int i, float f) {
        super/*android.widget.TextView*/.setLineHeight(i, f);
    }
}
