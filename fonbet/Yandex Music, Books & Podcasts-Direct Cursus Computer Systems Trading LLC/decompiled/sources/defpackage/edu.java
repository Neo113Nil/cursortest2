package defpackage;

import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.adu;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ledu;", "Ladu;", "VB", "Landroidx/fragment/app/o;", "<init>", "()V", "paymentsdk_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public abstract class edu<VB extends adu> extends o {
    public adu g;

    @Override // androidx.fragment.app.o
    public void onDestroyView() {
        super.onDestroyView();
        this.g = null;
    }

    public final adu x() {
        adu aduVar = this.g;
        if (aduVar != null) {
            return aduVar;
        }
        jj4.j("Binding is not initialized");
        return null;
    }
}
