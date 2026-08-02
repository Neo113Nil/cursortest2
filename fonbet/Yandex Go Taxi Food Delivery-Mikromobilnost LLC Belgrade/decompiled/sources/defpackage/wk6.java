package defpackage;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.f;
import com.yandex.go.inapp_calls.api.defaultoutgoingcall.DefaultOutgoingCallType;
import com.yandex.go.inapp_calls.interactor.permissions.a;
import com.yandex.go.navigator.map_interactions.parkings.ui.ToggleButtonsUiAction;
import com.yandex.go.permission.b;
import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.card.internal.presentation.carddetails.CardDetailsFragment;
import com.ybsdk.feature.settings.api.SettingsTheme;
import com.ybsdk.feature.transfer.version2.internal.screens.budget.domain.entities.BudgetGetStatusEntity$Status;
import com.ybsdk.widgets.common.YbButtonView;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlin.Pair;
import kotlin.Result;
import kotlinx.serialization.json.JsonObject$Companion;
import kotlinx.serialization.json.c;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemCheckComponent;
import ru.yandex.taxi.design.ListItemComponent;

/* loaded from: classes10.dex */
public final /* synthetic */ class wk6 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ wk6(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ep6 ep6Var;
        ActionButtonEntity actionButtonEntity;
        ThemedImageUrlEntity themedImageUrlEntity;
        String str;
        String str2;
        zy11 zy11Var;
        stz0 viewBinding$lambda$27$lambda$26$lambda$24;
        int i = this.a;
        int i2 = 2;
        zy11 zy11Var2 = zy11.a;
        switch (i) {
            case 0:
                r1b0 r1b0Var = (r1b0) obj;
                a7u0 a7u0Var = AndroidCompositionLocals_androidKt.b;
                r1b0Var.getClass();
                if (((Context) uh6.L(r1b0Var, a7u0Var)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return yk6.b;
                }
                vk6.a.getClass();
                return uk6.c;
            case 1:
                dp6 dp6Var = (dp6) obj;
                q8u0 q8u0Var = dp6Var.a;
                qp6 qp6Var = dp6Var.b;
                BudgetGetStatusEntity$Status budgetGetStatusEntity$Status = qp6Var.a;
                q8u0 q8u0Var2 = qp6Var.b;
                int i3 = zo6.a[budgetGetStatusEntity$Status.ordinal()];
                if (i3 != 1 && i3 != 2) {
                    int i4 = 3;
                    if (i3 != 3) {
                        if (i3 != 4) {
                            w511.b();
                            return null;
                        }
                        Text.Constant i5 = g8e.i(Text.Companion, q8u0Var.b);
                        Text.Constant constant = new Text.Constant(q8u0Var.c);
                        ThemedImageUrlEntity themedImageUrlEntity2 = q8u0Var.a;
                        rbv f = themedImageUrlEntity2 != null ? job1.f(themedImageUrlEntity2, new wk6(i4)) : null;
                        ActionButtonEntity actionButtonEntity2 = q8u0Var.d;
                        ep6Var = new ep6(i5, constant, f, actionButtonEntity2 != null ? new YbButtonView.a(actionButtonEntity2.getText(), null, null, null, null, null, null, false, false, null, 4094) : null, false);
                        return ep6Var;
                    }
                }
                ep6Var = new ep6((q8u0Var2 == null || (str2 = q8u0Var2.b) == null) ? Text.Empty.INSTANCE : new Text.Constant(str2), (q8u0Var2 == null || (str = q8u0Var2.c) == null) ? Text.Empty.INSTANCE : new Text.Constant(str), (q8u0Var2 == null || (themedImageUrlEntity = q8u0Var2.a) == null) ? null : job1.f(themedImageUrlEntity, new wk6(i2)), (q8u0Var2 == null || (actionButtonEntity = q8u0Var2.d) == null) ? null : new YbButtonView.a(actionButtonEntity.getText(), null, null, null, null, null, null, false, false, null, 4094), budgetGetStatusEntity$Status == BudgetGetStatusEntity$Status.IN_PROGRESS);
                return ep6Var;
            case 2:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 3:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 4:
                return new pbv((String) obj, (ccv) null, rev.j, (dcv) null, (vfv) null, 58);
            case 5:
                throw null;
            case 6:
                return zy11Var2;
            case 7:
                f.p((mnq0) obj, 0);
                return zy11Var2;
            case 8:
                f.p((mnq0) obj, 0);
                return zy11Var2;
            case 9:
                ButtonComponent buttonComponent = new ButtonComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                buttonComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return buttonComponent;
            case 10:
                ButtonComponent buttonComponent2 = new ButtonComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                buttonComponent2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                int o = (int) uh6.o(8.0f);
                xw31.F(buttonComponent2, Integer.valueOf(o), Integer.valueOf(o), Integer.valueOf(o), Integer.valueOf(o));
                buttonComponent2.setTextIconTint(true);
                return buttonComponent2;
            case 11:
                ListItemCheckComponent listItemCheckComponent = new ListItemCheckComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemCheckComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                return listItemCheckComponent;
            case 12:
                return new v47((ListItemCheckComponent) obj);
            case 13:
                h0c h0cVar = (h0c) obj;
                JsonObject$Companion jsonObject$Companion = c.Companion;
                h0cVar.a(Constants.KEY_DATA, jsonObject$Companion.serializer().getDescriptor(), (r3 & 8) == 0);
                h0cVar.a("error", jsonObject$Companion.serializer().getDescriptor(), (r3 & 8) == 0);
                return zy11Var2;
            case 14:
                ukv ukvVar = (ukv) obj;
                hkv hkvVar = ukvVar.a;
                com.yandex.go.inapp_calls.navigation.f fVar = ukvVar.b;
                njv njvVar = fVar.K;
                a aVar = fVar.I;
                boolean a = ((b) aVar.a).a(14);
                njvVar.getClass();
                njvVar.k("CallSelection", "SelectInApp", new Pair(new ic90("has_permissions"), Boolean.valueOf(a)));
                njv njvVar2 = fVar.K;
                boolean z = fVar.O.d.getValue() != DefaultOutgoingCallType.ALWAYS_ASK;
                boolean a2 = ((b) aVar.a).a(14);
                fkv fkvVar = hkvVar.a;
                njvVar2.c(fkvVar != null ? fkvVar.a : null, hkvVar.d.b, false, z, a2, true);
                com.yandex.go.inapp_calls.navigation.f.P(fVar, hkvVar);
                return zy11Var2;
            case 15:
                ukv ukvVar2 = (ukv) obj;
                com.yandex.go.inapp_calls.navigation.f fVar2 = ukvVar2.b;
                fVar2.K.k("CallSelection", "SelectPhone", new Pair[0]);
                njv njvVar3 = fVar2.K;
                boolean z2 = fVar2.O.d.getValue() != DefaultOutgoingCallType.ALWAYS_ASK;
                boolean a3 = ((b) fVar2.I.a).a(14);
                hkv hkvVar2 = ukvVar2.a;
                fkv fkvVar2 = hkvVar2.a;
                njvVar3.c(fkvVar2 != null ? fkvVar2.a : null, hkvVar2.d.b, false, z2, a3, false);
                fVar2.r(new jiu(23));
                return zy11Var2;
            case 16:
                ((acx) obj).a = true;
                return zy11Var2;
            case 17:
                SparseIntArray sparseIntArray = pn7.n;
                return Boolean.TRUE;
            case 18:
                qam qamVar = (qam) obj;
                qam.z(qamVar, ldc.f, (cjs0.c(qamVar.c()) - qamVar.w0(4.0f)) / 2.0f, 0L, 0.0f, new jvu0(0, 0, 30, qamVar.w0(4.0f), 0.0f), 0, 108);
                return zy11Var2;
            case 19:
                ep70 ep70Var = (ep70) obj;
                ep70Var.a.p0(ep70Var.b);
                return zy11Var2;
            case 20:
                hp70 hp70Var = (hp70) obj;
                hp70Var.a.C1.f = false;
                hp70Var.b.k();
                return zy11Var2;
            case 21:
                f.d((mnq0) obj);
                return zy11Var2;
            case 22:
                f.d((mnq0) obj);
                return zy11Var2;
            case 23:
                ((sy60) obj).a();
                return zy11Var2;
            case 24:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                listItemComponent.setMinimumHeight(tje.u(56, listItemComponent.getContext()));
                listItemComponent.setLeadTint(qje.t(xng0.line, listItemComponent.getContext()));
                listItemComponent.setTrailTint(qje.t(xng0.line, listItemComponent.getContext()));
                listItemComponent.setSubTitleEllipsizeMode(1);
                listItemComponent.setSubtitleMaxLines(2);
                listItemComponent.setSubtitleTextSizePx((int) tje.b0(listItemComponent.getContext(), 13.0f));
                listItemComponent.setSubtitleTypeface(0);
                listItemComponent.setTitleEllipsizeMode(1);
                listItemComponent.setTitleMaxLines(1);
                listItemComponent.setTitleTextSizePx((int) tje.b0(listItemComponent.getContext(), 16.0f));
                listItemComponent.setTitleTypeface(0);
                listItemComponent.setTrailMode(2);
                return listItemComponent;
            case 25:
                int i6 = c68.a[((ToggleButtonsUiAction) obj).ordinal()];
                if (i6 == 1 || i6 == 2) {
                    return zy11Var2;
                }
                w511.b();
                return null;
            case 26:
                Object value = ((Result) obj).getValue();
                return Boolean.valueOf((value instanceof Result.Failure ? null : value) instanceof zxp0);
            case 27:
                return new pbv((String) obj, (ccv) null, rev.f, (dcv) null, (vfv) null, 58);
            case 28:
                zy11Var = CardDetailsFragment.settingsAdapter$lambda$1((SettingsTheme) obj);
                return zy11Var;
            default:
                viewBinding$lambda$27$lambda$26$lambda$24 = CardDetailsFragment.getViewBinding$lambda$27$lambda$26$lambda$24((stz0) obj);
                return viewBinding$lambda$27$lambda$26$lambda$24;
        }
    }
}
