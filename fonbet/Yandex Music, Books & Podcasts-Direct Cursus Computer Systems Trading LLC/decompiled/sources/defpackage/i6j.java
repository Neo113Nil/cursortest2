package defpackage;

import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.o;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Li6j;", "Landroidx/fragment/app/o;", "<init>", "()V", "nfcscanner_release"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes4.dex */
public final class i6j extends o {
    public final ybf g;
    public oxa h;
    public x5j i;

    public i6j() {
        grb grbVar = grb.B0;
        arf a = btf.a(bwf.c, new ypb(25, new ypb(24, this)));
        this.g = new ybf(ern.a(j6j.class), new sy6(a, 18), grbVar, new sy6(a, 19));
    }

    @Override // androidx.fragment.app.o
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getLifecycle().a(x());
        b6j x = x();
        if (!x.e) {
            x.e = true;
            NfcAdapter nfcAdapter = x.f;
            if (nfcAdapter != null) {
                nfcAdapter.enableReaderMode(x.d, x.k, 131, cxb.J());
            }
        }
        x97.y(wyf.F(getLifecycle()), ca8.a, null, new h6j(this, null, 1), 2);
    }

    @Override // androidx.fragment.app.o
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.fragment_nfc_scanner, viewGroup, false);
        int i = R.id.nfc_bottom_text;
        if (((TextView) dag.v(R.id.nfc_bottom_text, inflate)) != null) {
            i = R.id.nfc_icon;
            if (((ImageView) dag.v(R.id.nfc_icon, inflate)) != null) {
                i = R.id.nfc_top_txt;
                if (((TextView) dag.v(R.id.nfc_top_txt, inflate)) != null) {
                    LinearLayout linearLayout = (LinearLayout) inflate;
                    this.h = new oxa(4, linearLayout);
                    return linearLayout;
                }
            }
        }
        jj4.j("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // androidx.fragment.app.o
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        dzf viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        qyf F = wyf.F(viewLifecycleOwner.getLifecycle());
        dq7 dq7Var = ca8.a;
        x97.y(F, j5h.a, null, new h6j(this, null, 0), 2);
    }

    public final b6j x() {
        j6j j6jVar = (j6j) this.g.getValue();
        x5j x5jVar = this.i;
        if (x5jVar == null) {
            Intrinsics.j("callbacks");
            throw null;
        }
        b6j b6jVar = j6jVar.k;
        if (b6jVar != null) {
            return b6jVar;
        }
        b6j b6jVar2 = new b6j(x5jVar);
        j6jVar.k = b6jVar2;
        return b6jVar2;
    }
}
