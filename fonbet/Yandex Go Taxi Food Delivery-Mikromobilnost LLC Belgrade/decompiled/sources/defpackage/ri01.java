package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.entities.AgreementImageEntity;
import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.version2.internal.screens.main.domain.entities.SuggestEntity$BehaviourEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.main.presentation.TransferMainState$Success$OpenScenario;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.pull.Status;
import com.ybsdk.feature.transfer.version2.internal.screens.phone.receivername.TransferReceiverNameFragment;
import com.ybsdk.widgets.common.OperationProgressView;
import com.ybsdk.widgets.common.YbButtonView;
import com.ybsdk.widgets.common.g;
import com.ybsdk.widgets.common.l;

/* loaded from: classes3.dex */
public final /* synthetic */ class ri01 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ ri01(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        gu01 eu01Var;
        ThemedImageUrlEntity headerImage;
        String title;
        g viewBinding$lambda$4$lambda$1;
        int i = 21;
        switch (this.a) {
            case 0:
                return new pbv((dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (tev) rev.o, (vfv) h2b1.G, (String) obj, false);
            case 1:
                n70 n70Var = (n70) obj;
                n70Var.W(new ns3(n70Var, i));
                return zy11.a;
            case 2:
                y4v0 y4v0Var = (y4v0) obj;
                SuggestEntity$BehaviourEntity suggestEntity$BehaviourEntity = y4v0Var.c;
                int i2 = mj01.d[suggestEntity$BehaviourEntity.ordinal()];
                if (i2 == 1) {
                    return y4v0Var.a.getAmount().toPlainString();
                }
                if (i2 == 2) {
                    return suggestEntity$BehaviourEntity.name();
                }
                w511.b();
                return null;
            case 3:
                return new pbv((dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (tev) rev.p, (vfv) h2b1.G, (String) obj, false);
            case 4:
                return new pbv((String) obj, new ccv(vxg0.ybsdk_ic_circle_gray), rev.n, new ccv(vxg0.ybsdk_ic_circle_gray), (vfv) null, 48);
            case 5:
                return new pbv((dcv) null, (dcv) null, (tev) rev.n, (vfv) h2b1.G, (String) obj, false);
            case 6:
                return new pbv((dcv) null, (dcv) null, (tev) rev.n, (vfv) h2b1.G, (String) obj, false);
            case 7:
                return wk01.b((wk01) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, "", false, null, null, null, null, null, null, null, -16777217, 15);
            case 8:
                return wk01.b((wk01) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, null, false, null, null, null, null, null, null, null, -1025, 15);
            case 9:
                return wk01.b((wk01) obj, null, null, null, null, null, null, null, null, null, null, null, null, r501.c, false, false, null, null, false, null, false, null, null, null, null, null, null, null, -65537, 15);
            case 10:
                return wk01.b((wk01) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, null, false, null, null, null, null, null, null, null, -161, 15);
            case 11:
                return wk01.b((wk01) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, TransferMainState$Success$OpenScenario.NONE, false, null, false, null, null, null, null, null, null, null, -2097153, 15);
            case 12:
                return wk01.b((wk01) obj, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, null, null, false, null, false, null, null, null, null, null, null, null, -1025, 15);
            case 13:
                return wk01.b((wk01) obj, null, null, null, null, null, wfz.y, null, null, null, null, null, null, null, false, false, null, null, false, null, false, null, null, null, null, null, null, null, -129, 15);
            case 14:
                return new pbv((String) obj, new ccv(vxg0.ybsdk_account_placeholder_gray), rev.n, new ccv(vxg0.ybsdk_account_placeholder_gray), (vfv) null, 48);
            case 15:
                return new pbv((dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (tev) rev.o, (vfv) h2b1.G, (String) obj, false);
            case 16:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 17:
                return new pbv((String) obj, (ccv) null, rev.j, (dcv) null, (vfv) null, 58);
            case 18:
                return new pbv((String) obj, (ccv) null, rev.j, (dcv) null, (vfv) null, 58);
            case 19:
                km01 km01Var = (km01) obj;
                Status status = km01Var.d;
                Status status2 = Status.CONFIRMED;
                c910 c910Var = km01Var.c;
                b910 b910Var = status != status2 ? c910Var.b : c910Var.c;
                ThemedImageUrlEntity themedImageUrlEntity = b910Var.b;
                int i3 = jm01.a[status.ordinal()];
                if (i3 == 1 || i3 == 2) {
                    b910 b910Var2 = c910Var.b;
                    fl1 fl1Var = c910Var.a;
                    PageHeaderEntity pageHeaderEntity = b910Var2.a;
                    Text.Constant constant = (pageHeaderEntity == null || (title = pageHeaderEntity.getTitle()) == null) ? null : new Text.Constant(title);
                    boolean z = km01Var.b.size() > 1;
                    Text.Constant i4 = g8e.i(Text.Companion, fl1Var.b);
                    Text.Constant constant2 = new Text.Constant(fl1Var.c);
                    AgreementImageEntity agreementImageEntity = fl1Var.d;
                    eu01Var = new eu01(constant, z, (agreementImageEntity == null || (headerImage = agreementImageEntity.getHeaderImage()) == null) ? null : job1.f(headerImage, new ri01(i)), i4, constant2, new ntz0(0), 64);
                } else {
                    if (i3 != 3) {
                        w511.b();
                        return null;
                    }
                    eu01Var = new fu01(Text.Empty.INSTANCE, new ntz0(0));
                }
                rbv c = fob1.c(themedImageUrlEntity.getLightUrl(), themedImageUrlEntity.getDarkUrl(), new ri01(20));
                if (c == null) {
                    c = new nbv(txg0.ybsdk_ic_yb_placeholder, null);
                }
                return new em01(eu01Var, c, status == status2 ? new l(OperationProgressView.StatusIcon.SUCCESS) : null, b910Var.c, b910Var.d, new YbButtonView.a(b910Var.e.getText(), null, null, null, null, null, null, false, status == Status.CONFIRMING_PROGRESS, null, 3070), b910Var.f);
            case 20:
                return new pbv((dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (tev) rev.f, (vfv) h2b1.G, (String) obj, false);
            case 21:
                return new pbv((String) obj, new ccv(vxg0.ybsdk_account_placeholder_gray), rev.f, (dcv) null, (vfv) null, 56);
            case 22:
                return lm01.a((lm01) obj, null, null, 27);
            case 23:
                return new pbv((String) obj, (ccv) null, rev.j, (dcv) null, (vfv) null, 58);
            case 24:
                return new pbv((dcv) new ccv(txg0.ybsdk_ic_bank_placeholder_without_background), (dcv) new ccv(txg0.ybsdk_ic_bank_placeholder_without_background), (tev) rev.o, (vfv) h2b1.G, (String) obj, false);
            case 25:
                return new pbv((String) obj, (ccv) null, rev.k, (dcv) null, (vfv) null, 58);
            case 26:
                return new pbv((String) obj, new ccv(txg0.ybsdk_ic_yandex_logo_sqare_16), rev.n, new ccv(txg0.ybsdk_ic_yandex_logo_sqare_16), (vfv) null, 48);
            case 27:
                return new pbv((String) obj, (ccv) null, rev.e, (dcv) null, (vfv) null, 58);
            case 28:
                viewBinding$lambda$4$lambda$1 = TransferReceiverNameFragment.getViewBinding$lambda$4$lambda$1((g) obj);
                return viewBinding$lambda$4$lambda$1;
            default:
                return ((pex0) obj).l;
        }
    }
}
