package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.animation.e;
import androidx.compose.animation.i;
import androidx.compose.animation.k;
import androidx.compose.ui.semantics.f;
import com.yandex.go.places.impl.ui.common.chip.ChipView;
import com.ybsdk.feature.transfer.internal.screens.targets.presentation.TransferTargetsFragment;
import com.ybsdk.rconfig.configs.TransfersDashboardBottomSheetConfig;
import com.ybsdk.rconfig.configs.TransfersDashboardQrButton;
import com.ybsdk.widgets.common.g;
import kotlin.Result;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes13.dex */
public final /* synthetic */ class zp01 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ zp01(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        g render$lambda$13$lambda$12;
        rbv entity$lambda$0;
        rbv entity$lambda$02;
        int i = this.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                n70 n70Var = (n70) obj;
                n70Var.W(new ns3(n70Var, 22));
                return zy11Var;
            case 1:
                return Boolean.valueOf(((tq01) obj).d());
            case 2:
                return new pbv((dcv) new ccv(txg0.ybsdk_ic_yb_placeholder), (dcv) null, (tev) rev.o, (vfv) h2b1.G, (String) obj, false);
            case 3:
                return new pbv((String) obj, (ccv) null, rev.o, (dcv) null, (vfv) null, 58);
            case 4:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                lob1.e(listItemComponent);
                return listItemComponent;
            case 5:
                zs01 zs01Var = new zs01((ListItemComponent) obj);
                aiy aiyVar = aiy.a;
                zs01Var.S = aiyVar;
                zs01Var.T = aiyVar;
                return zs01Var;
            case 6:
                Object value = ((Result) obj).getValue();
                if (value instanceof Result.Failure) {
                    value = null;
                }
                iyd0 iyd0Var = (iyd0) value;
                return Boolean.valueOf((iyd0Var != null ? (ayp0) iyd0Var.a : null) instanceof zxp0);
            case 7:
                render$lambda$13$lambda$12 = TransferTargetsFragment.render$lambda$13$lambda$12((g) obj);
                return render$lambda$13$lambda$12;
            case 8:
                ViewGroup viewGroup = (ViewGroup) obj;
                ListItemComponent listItemComponent2 = qdj0.o(LayoutInflater.from(viewGroup.getContext()), viewGroup).b;
                int u = tje.u(16, listItemComponent2.getContext());
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -2);
                marginLayoutParams.setMargins(u, 0, u, 0);
                listItemComponent2.setLayoutParams(marginLayoutParams);
                listItemComponent2.setLeadFrameMinimumWidth(tje.u(56, listItemComponent2.getContext()));
                return listItemComponent2;
            case 9:
                ViewGroup viewGroup2 = (ViewGroup) obj;
                return qdj0.o(LayoutInflater.from(viewGroup2.getContext()), viewGroup2).b;
            case 10:
                entity$lambda$0 = TransfersDashboardBottomSheetConfig.toEntity$lambda$0((String) obj);
                return entity$lambda$0;
            case 11:
                entity$lambda$02 = TransfersDashboardQrButton.toEntity$lambda$0((String) obj);
                return entity$lambda$02;
            case 12:
                ldf ldfVar = ubn.c;
                ldf ldfVar2 = ubn.a;
                i iVar = new i(k.e(new ck11(300, 96, ldfVar2), 2).a(k.p(new ck11(300, 96, ldfVar2), new zp01(14))), k.f(sb2.K(160, 0, ldfVar, 2), 2).a(k.u(sb2.K(160, 0, ldfVar, 2), new zp01(15))));
                ujs0 ujs0Var = new ujs0(false, new dj5(ldfVar2, 1));
                ((e) obj).getClass();
                iVar.d = ujs0Var;
                return iVar;
            case 13:
                return (String) obj;
            case 14:
                return Integer.valueOf(((Integer) obj).intValue() / 3);
            case 15:
                return Integer.valueOf((-((Integer) obj).intValue()) / 6);
            case 16:
                return zy11Var;
            case 17:
                ((ImageView) obj).setImageIcon(null);
                return zy11Var;
            case 18:
                ((ImageView) obj).setImageIcon(null);
                return zy11Var;
            case 19:
                return zy11Var;
            case 20:
                return zy11Var;
            case 21:
                return zy11Var;
            case 22:
                return zy11Var;
            case 23:
                return zy11Var;
            case 24:
                return zy11Var;
            case 25:
                ListItemComponent listItemComponent3 = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                lob1.e(listItemComponent3);
                lob1.d(listItemComponent3);
                return listItemComponent3;
            case 26:
                return new m0o((ListItemComponent) obj, 2);
            case 27:
                u6y u6yVar = (u6y) obj;
                wed.a.getClass();
                u6y.b(u6yVar, null, wed.b, 3);
                u6y.b(u6yVar, null, wed.c, 3);
                u6y.b(u6yVar, null, wed.d, 3);
                return zy11Var;
            case 28:
                f.d((mnq0) obj);
                return zy11Var;
            default:
                return new ChipView(((ViewGroup) obj).getContext());
        }
    }
}
