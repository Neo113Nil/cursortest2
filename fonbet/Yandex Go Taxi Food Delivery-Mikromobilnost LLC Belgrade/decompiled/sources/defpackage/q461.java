package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.view.QrReaderErrorView;
import com.ybsdk.widgets.common.YbButtonView;

/* loaded from: classes3.dex */
public final class q461 implements zo31 {
    public final QrReaderErrorView a;
    public final TextView b;
    public final ImageView c;
    public final YbButtonView d;
    public final TextView e;

    public q461(QrReaderErrorView qrReaderErrorView, TextView textView, ImageView imageView, YbButtonView ybButtonView, TextView textView2) {
        this.a = qrReaderErrorView;
        this.b = textView;
        this.c = imageView;
        this.d = ybButtonView;
        this.e = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
