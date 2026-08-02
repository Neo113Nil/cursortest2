package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.go.flex.common.actions.dto.SelectContactAction;
import com.yandex.go.flex.common.actions.dto.e;
import com.yandex.go.flex.common.actions.dto.f;
import com.yandex.go.payments.porttech.domain.SelectPaymentMethodRequest;
import com.yandex.go.payments.porttech.domain.b;
import com.yandex.go.shortcuts.dto.request.Seen;
import com.yandex.go.shortcuts.dto.request.Status;
import com.yandex.go.shortcuts.dto.response.SectionTypedHeader;
import com.yandex.go.shortcuts.dto.response.g2;
import com.yandex.go.shortcuts.dto.response.j2;
import com.yandex.go.shortcuts.dto.response.m2;
import com.yandex.go.shortcuts.impl.view.adapter.s;
import com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.contacts.ContactsFragment;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.j0;
import ru.yandex.taxi.communications.model.widgets.ArrowActionType;
import ru.yandex.taxi.contacts.SelectedFrom;
import ru.yandex.taxi.settings.api.dto.settings.types.SectionItemActionType;
import ru.yandex.taxi.settings.api.dto.settings.types.SectionStyle;

/* loaded from: classes5.dex */
public final /* synthetic */ class w0q0 implements sls {
    public final /* synthetic */ int a;

    public /* synthetic */ w0q0(int i) {
        this.a = i;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 zy11Var;
        zy11 zy11Var2;
        zy11 zy11Var3;
        zy11 zy11Var4;
        zy11 zy11Var5;
        switch (this.a) {
            case 0:
                y0q0 y0q0Var = z0q0.Companion;
                return SectionStyle.Companion.serializer();
            case 1:
                y0q0 y0q0Var2 = z0q0.Companion;
                return new p53(ml10.a, 0);
            case 2:
                return vez0.g("ru.yandex.taxi.settings.api.dto.settings.types.SectionItemActionType", SectionItemActionType.values(), new String[]{"setting", null}, new Annotation[][]{null, null});
            case 3:
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 4:
                return new o4o("flex.engine.section.SectionOperation.UpdateSectionsOperation", v2q0.INSTANCE, new Annotation[0]);
            case 5:
                return vez0.g("ru.yandex.taxi.settings.api.dto.settings.types.SectionStyle", SectionStyle.values(), new String[]{"default", "bordered", null}, new Annotation[][]{null, null, null});
            case 6:
                g2 g2Var = SectionTypedHeader.Companion;
                return SectionTypedHeader.HeaderType.Companion.serializer();
            case 7:
                return vez0.g("com.yandex.go.shortcuts.dto.response.SectionTypedHeader.HeaderType", SectionTypedHeader.HeaderType.values(), new String[]{"list_item"}, new Annotation[][]{null});
            case 8:
                j2 j2Var = SectionTypedHeader.Lead.Companion;
                return SectionTypedHeader.Lead.LeadType.Companion.serializer();
            case 9:
                j2 j2Var2 = SectionTypedHeader.Lead.Companion;
                return SectionTypedHeader.Lead.AppearanceType.Companion.serializer();
            case 10:
                return vez0.g("com.yandex.go.shortcuts.dto.response.SectionTypedHeader.Lead.AppearanceType", SectionTypedHeader.Lead.AppearanceType.values(), new String[]{Constants.NORMAL, "icon_only"}, new Annotation[][]{null, null});
            case 11:
                return vez0.g("com.yandex.go.shortcuts.dto.response.SectionTypedHeader.Lead.LeadType", SectionTypedHeader.Lead.LeadType.values(), new String[]{"app_title"}, new Annotation[][]{null});
            case 12:
                m2 m2Var = SectionTypedHeader.Trail.Companion;
                return SectionTypedHeader.Trail.TrailType.Companion.serializer();
            case 13:
                return vez0.g("com.yandex.go.shortcuts.dto.response.SectionTypedHeader.Trail.TrailType", SectionTypedHeader.Trail.TrailType.values(), new String[]{"subtitle"}, new Annotation[][]{null});
            case 14:
                List list = s.e0;
                return zy11.a;
            case 15:
                com.yandex.go.shortcuts.dto.request.s sVar = Seen.Companion;
                return Status.Companion.serializer();
            case 16:
                aaq0 aaq0Var = baq0.Companion;
                return ArrowActionType.Companion.serializer();
            case 17:
                aaq0 aaq0Var2 = baq0.Companion;
                return new p53(x3b0.a, 0);
            case 18:
                e eVar = SelectContactAction.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 19:
                e eVar2 = SelectContactAction.Companion;
                return new oke(qoi0.a(kr.class), null, new KSerializer[0]);
            case 20:
                f fVar = SelectContactAction.ModalConfig.Companion;
                return new p53(qke.n(vez0.g("com.yandex.go.flex.common.actions.dto.SelectContactAction.ModalOptions", SelectContactAction.ModalOptions.values(), new String[]{"add_user_contact"}, new Annotation[][]{null})), 0);
            case 21:
                zy11Var = zy11.a;
                return zy11Var;
            case 22:
                zy11Var2 = zy11.a;
                return zy11Var2;
            case 23:
                zy11Var3 = zy11.a;
                return zy11Var3;
            case 24:
                zy11Var4 = zy11.a;
                return zy11Var4;
            case 25:
                zy11Var5 = zy11.a;
                return zy11Var5;
            case 26:
                b bVar = SelectPaymentMethodRequest.Companion;
                return new p53(e6m.a, 0);
            case 27:
                return new o4o("ru.yandex.taxi.common_models.net.map_object.SelectShuttleStopPoint", j0.INSTANCE, new Annotation[0]);
            case 28:
                agq0 agq0Var = bgq0.Companion;
                return SelectedFrom.Companion.serializer();
            default:
                return vez0.g("ru.yandex.taxi.contacts.SelectedFrom", SelectedFrom.values(), new String[]{ContactsFragment.WEBVIEW_NAME, "last_contacts", "manual", "standalone", "suggest"}, new Annotation[][]{null, null, null, null, null});
        }
    }
}
