package defpackage;

import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes.dex */
public class ns0 extends sld {
    public final /* synthetic */ AppCompatTextView f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns0(AppCompatTextView appCompatTextView) {
        super(6, appCompatTextView);
        this.f = appCompatTextView;
    }

    @Override // defpackage.sld, defpackage.ms0
    public final void B(int i) {
        super/*android.widget.TextView*/.setFirstBaselineToTopHeight(i);
    }

    @Override // defpackage.sld, defpackage.ms0
    public final void d(int i) {
        super/*android.widget.TextView*/.setLastBaselineToBottomHeight(i);
    }
}
