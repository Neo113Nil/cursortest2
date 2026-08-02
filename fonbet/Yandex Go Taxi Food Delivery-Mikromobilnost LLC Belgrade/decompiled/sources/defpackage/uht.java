package defpackage;

import android.net.Uri;
import android.widget.ImageView;
import com.bumptech.glide.RequestManager;

/* loaded from: classes2.dex */
public final class uht implements gtk {
    public final i3y a;

    public uht(i3y i3yVar) {
        this.a = i3yVar;
    }

    @Override // defpackage.gtk
    public final hxy loadImage(String str, btk btkVar) {
        Uri parse = Uri.parse(str);
        RequestManager requestManager = (RequestManager) this.a.getValue();
        p5j0 H = ((p5j0) ((p5j0) requestManager.asBitmap().J(parse).v(false)).e(exj.b)).H(new tht(btkVar, new pht(1, parse), 0));
        iax0 rhtVar = new rht();
        H.F(rhtVar, null, H, ph91.a);
        return new qht(1, requestManager, rhtVar);
    }

    @Override // defpackage.gtk
    public final hxy loadImageBytes(String str, btk btkVar) {
        Uri parse = Uri.parse(str);
        RequestManager requestManager = (RequestManager) this.a.getValue();
        p5j0 H = requestManager.asGif().J(parse).H(new tht(btkVar, new pht(0, parse), 0));
        iax0 rhtVar = new rht();
        H.F(rhtVar, null, H, ph91.a);
        return new qht(0, requestManager, rhtVar);
    }

    @Override // defpackage.gtk
    public final hxy loadImage(String str, ImageView imageView) {
        throw new IllegalStateException("Must not be used");
    }
}
