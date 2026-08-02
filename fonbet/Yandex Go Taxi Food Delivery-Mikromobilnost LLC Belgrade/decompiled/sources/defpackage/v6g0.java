package defpackage;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.navigation.cicerone.androidx.FragmentScreen;
import com.ybsdk.core.navigation.cicerone.androidx.TransitionPolicyType;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.qr.api.QrReaderScreenType;
import com.ybsdk.feature.qr.internal.screens.container.QrContainerItem;
import com.ybsdk.feature.qr.internal.screens.container.QrContainerScreenParams;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderFragment;
import com.ybsdk.feature.qr.internal.screens.reader.presentation.QrReaderScreenParams;
import com.ybsdk.feature.webview.api.WebViewScreenParams;
import com.ybsdk.rconfig.b;
import com.ybsdk.rconfig.configs.QrGenerationFeatureData;
import com.ybsdk.widgets.common.ErrorView$State$PrimaryButtonGravity;
import com.ybsdk.widgets.common.segmented.SegmentedControlView;
import com.ybsdk.widgets.common.segmented.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes3.dex */
public final class v6g0 implements ev31 {
    public final mfg0 a;
    public final hgg0 b;
    public final jdg0 c;
    public final sue0 w;
    public final ff8 x;
    public final j3h y;

    public v6g0(mfg0 mfg0Var, hgg0 hgg0Var, jdg0 jdg0Var, sue0 sue0Var, ff8 ff8Var, j3h j3hVar) {
        this.a = mfg0Var;
        this.b = hgg0Var;
        this.c = jdg0Var;
        this.w = sue0Var;
        this.x = ff8Var;
        this.y = j3hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v7, types: [hee] */
    /* JADX WARN: Type inference failed for: r7v2, types: [hee] */
    @Override // defpackage.ev31
    public final Object q(Object obj) {
        rr51 rr51Var;
        o6g0 o6g0Var = (o6g0) obj;
        List list = o6g0Var.a;
        int i = o6g0Var.c;
        SegmentedControlView.ItemDesign selectedDesign = ((QrContainerItem) list.get(i)).getSelectedDesign();
        SegmentedControlView.ItemDesign unselectedDesign = ((QrContainerItem) list.get(i)).getUnselectedDesign();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            tm90 tm90Var = null;
            if (!it.hasNext()) {
                um90 um90Var = (um90) this.w.b;
                nm90 nm90Var = o6g0Var.d;
                if (um90Var.a.A() && nm90Var.b) {
                    u8j0 u8j0Var = nm90Var.a;
                    if (u8j0Var instanceof t8j0) {
                        tm90Var = new sm90(0);
                    } else {
                        boolean z = u8j0Var instanceof s8j0;
                        rm90 rm90Var = rm90.a;
                        if (!z) {
                            if (!(u8j0Var instanceof r8j0)) {
                                w511.b();
                                return null;
                            }
                            hm90 hm90Var = (hm90) u8j0Var.a();
                            if (hm90Var != null && (rr51Var = hm90Var.a) != null) {
                                tm90Var = new qm90(rr51Var);
                            }
                        }
                        tm90Var = rm90Var;
                    }
                }
                return new t6g0(arrayList, i, tm90Var);
            }
            Object next = it.next();
            int i3 = i2 + 1;
            if (i2 < 0) {
                scc.m();
                throw null;
            }
            QrContainerItem qrContainerItem = (QrContainerItem) next;
            boolean z2 = i2 == i;
            SegmentedControlView.ItemDesign itemDesign = z2 ? selectedDesign : unselectedDesign;
            QrContainerScreenParams qrContainerScreenParams = o6g0Var.b;
            int i4 = u6g0.a[qrContainerItem.ordinal()];
            if (i4 == 1) {
                qa60 qa60Var = this.x.a;
            } else if (i4 == 2) {
                QrReaderScreenParams qrReaderScreenParams = new QrReaderScreenParams(false, "QR_CONTAINER_TAB", QrReaderScreenType.Old.INSTANCE, qrContainerScreenParams.getAgreementId(), null, qrContainerScreenParams.getAutopaymentId());
                this.a.getClass();
                tm90Var = new hee(new FragmentScreen("QrReaderScreen", false, qrReaderScreenParams, TransitionPolicyType.POPUP, qoi0.a(QrReaderFragment.class), OpenScreenRequirement.WithUid.INSTANCE, 2, null), new a(z2 ? unr0.h(Text.Companion, dzh0.ybsdk_qr_payment_qr_scanner_segment_control) : null, new nbv(hyg0.ybsdk_ic_qr_scan, null), itemDesign));
            } else {
                if (i4 != 3) {
                    w511.b();
                    return null;
                }
                b bVar = (b) ((y4a0) this.c).c;
                String qrGenerationUrl = ((QrGenerationFeatureData) bVar.d(bVar.i.p).getData()).getQrGenerationUrl();
                List c = ((l3h) this.y).c(qrGenerationUrl);
                Screen screen = c != null ? (Screen) kotlin.collections.a.R(c) : null;
                FragmentScreen fragmentScreen = screen instanceof FragmentScreen ? (FragmentScreen) screen : null;
                if (fragmentScreen == null) {
                    fragmentScreen = ((com.ybsdk.feature.webview.internal.a) ((e7g0) this.b).a).e(new WebViewScreenParams(qrGenerationUrl, false, null, null, null, null, null, ErrorView$State$PrimaryButtonGravity.CENTER, true, HProv.PP_DELETE_SAVED_PASSWD, null));
                }
                tm90Var = new hee(fragmentScreen, new a(z2 ? unr0.h(Text.Companion, dzh0.ybsdk_qr_payment_reverse_qr_segment_control) : null, new nbv(hyg0.ybsdk_ic_qr_tab, null), itemDesign));
            }
            if (tm90Var != null) {
                arrayList.add(tm90Var);
            }
            i2 = i3;
        }
    }
}
