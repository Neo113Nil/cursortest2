package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.PopupType$TextHintPopup$ArrowDirection;
import ru.yandex.taxi.logistics.sdk.dto.libraries.extendedtemplate.definitions.AttributedTextDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.FormLayoutDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.FormLayoutOverrideDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.PopupDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.PopupTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.ScrollTagDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.TextHintPopupDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgets.SectionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formwidgetsactions.ShowPolicyDto;

/* loaded from: classes5.dex */
public final class y5s {
    public final o4s a;
    public final jwh b;
    public final gd3 c;

    public y5s(o4s o4sVar, jwh jwhVar, gd3 gd3Var) {
        this.a = o4sVar;
        this.b = jwhVar;
        this.c = gd3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.util.ArrayList] */
    public final t3s a(FormLayoutOverrideDto formLayoutOverrideDto) {
        ArrayList arrayList;
        ArrayList arrayList2;
        oae0 oae0Var;
        PopupType$TextHintPopup$ArrowDirection popupType$TextHintPopup$ArrowDirection;
        if (!(formLayoutOverrideDto instanceof FormLayoutOverrideDto.FormLayoutOverride_FormDto)) {
            if (formLayoutOverrideDto instanceof FormLayoutOverrideDto.Unknown_FormLayoutOverrideDto) {
                this.b.a.o("Delivery.OrderForm.Failed.LayoutOverrideTypeError", null, new LinkedHashMap());
                return null;
            }
            w511.b();
            return null;
        }
        pv8 pv8Var = (pv8) this.a;
        pv8Var.getClass();
        FormLayoutDto formLayoutDto = ((FormLayoutOverrideDto.FormLayoutOverride_FormDto) formLayoutOverrideDto).b;
        SectionDto headerSection = formLayoutDto.getHeaderSection();
        List h = scc.h(headerSection != null ? pv8Var.h(headerSection) : null);
        List<SectionDto> sections = formLayoutDto.getSections();
        List list = EmptyList.a;
        if (sections != null) {
            List<SectionDto> list2 = sections;
            arrayList = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(pv8Var.h((SectionDto) it.next()));
            }
        } else {
            arrayList = list;
        }
        SectionDto bottomSection = formLayoutDto.getBottomSection();
        List h2 = scc.h(bottomSection != null ? pv8Var.h(bottomSection) : null);
        List<ScrollTagDto> scrollTags = formLayoutDto.getScrollTags();
        if (scrollTags != null) {
            List<ScrollTagDto> list3 = scrollTags;
            ArrayList arrayList3 = new ArrayList(tcc.n(list3, 10));
            for (ScrollTagDto scrollTagDto : list3) {
                arrayList3.add(new pip0(scrollTagDto.getTitle(), scrollTagDto.getRelatedWidgetId()));
            }
            arrayList2 = arrayList3;
        } else {
            arrayList2 = list;
        }
        List<PopupDto> popups = formLayoutDto.getPopups();
        if (popups != null) {
            List<PopupDto> list4 = popups;
            list = new ArrayList(tcc.n(list4, 10));
            for (PopupDto popupDto : list4) {
                String id = popupDto.getId();
                String relatedPresentationId = popupDto.getRelatedPresentationId();
                PopupTypeDto type = popupDto.getType();
                if (type instanceof PopupTypeDto.PopupType_TextHintPopupDto) {
                    TextHintPopupDto textHintPopupDto = ((PopupTypeDto.PopupType_TextHintPopupDto) type).b;
                    gd3 gd3Var = pv8Var.a;
                    AttributedTextDto text = textHintPopupDto.getText();
                    gd3Var.getClass();
                    FormattedText b = gd3.b(text);
                    String backgroundColor = textHintPopupDto.getBackgroundColor();
                    int i = ov8.a[textHintPopupDto.getArrowDirection().ordinal()];
                    if (i == 1) {
                        popupType$TextHintPopup$ArrowDirection = PopupType$TextHintPopup$ArrowDirection.TOP;
                    } else if (i == 2) {
                        popupType$TextHintPopup$ArrowDirection = PopupType$TextHintPopup$ArrowDirection.BOTTOM;
                    } else if (i == 3) {
                        popupType$TextHintPopup$ArrowDirection = PopupType$TextHintPopup$ArrowDirection.LEFT;
                    } else {
                        if (i != 4) {
                            w511.b();
                            return null;
                        }
                        popupType$TextHintPopup$ArrowDirection = PopupType$TextHintPopup$ArrowDirection.RIGHT;
                    }
                    PopupType$TextHintPopup$ArrowDirection popupType$TextHintPopup$ArrowDirection2 = popupType$TextHintPopup$ArrowDirection;
                    ShowPolicyDto showPolicy = textHintPopupDto.getShowPolicy();
                    oae0Var = new nae0(b, backgroundColor, popupType$TextHintPopup$ArrowDirection2, showPolicy != null ? pv8.Q(showPolicy) : null, textHintPopupDto.isDismissable());
                } else {
                    if (!(type instanceof PopupTypeDto.Unknown_PopupTypeDto)) {
                        w511.b();
                        return null;
                    }
                    oae0Var = msb1.P;
                }
                list.add(new m9e0(id, relatedPresentationId, oae0Var));
            }
        }
        return new t3s(h, arrayList, h2, arrayList2, list, new x2s(formLayoutDto.getMetricaLabel(), formLayoutDto.getMeta()), formLayoutDto.getBackgroundColor(), formLayoutDto.getSpacingHeight());
    }
}
