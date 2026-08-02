package defpackage;

import android.text.StaticLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class rs0 extends qs0 {
    @Override // defpackage.qs0, defpackage.ss0
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // defpackage.ss0
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
