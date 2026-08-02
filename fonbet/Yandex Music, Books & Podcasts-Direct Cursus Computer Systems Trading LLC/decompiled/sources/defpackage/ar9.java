package defpackage;

import android.text.Spanned;
import android.widget.TextView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class ar9 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ TextView s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ar9(TextView textView, int i) {
        super(1);
        this.r = i;
        this.s = textView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                this.s.setText((Spanned) obj, TextView.BufferType.NORMAL);
                break;
            default:
                this.s.setTextColor(((Number) obj).intValue());
                break;
        }
        return Unit.a;
    }
}
