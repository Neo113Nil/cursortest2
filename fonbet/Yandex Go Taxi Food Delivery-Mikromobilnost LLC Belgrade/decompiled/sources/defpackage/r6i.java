package defpackage;

import com.yandex.delivery.mapper.model.state.DeliveryStateItem$Barcode$BarcodeOrientation;
import com.yandex.delivery.mapper.model.state.DeliveryStateItem$Barcode$BarcodeType;
import com.yandex.delivery.mapper.model.state.DeliveryStateItem$TextWidget$Alignment;
import com.yandex.delivery.mapper.model.state.DeliveryStateItem$TextWidget$Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.PhotoInfoDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentIconItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.contentbaseitems.ContentTextItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.BarcodeDataDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.BarcodeTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.ContentActionButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.ContentBarcodeItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.ContentDetailsItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.ContentItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.ContentListItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.ContentPhotosItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.ContentPostcardItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.ContentSectionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.ContentSectionHeaderDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.ContentSlotDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.ContentTextAlignmentDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.ContentTextWidgetItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.DetailsSectionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.DetailsSectionItemAccordionDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.DetailsSectionItemDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.DetailsSectionItemSubtitleDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.InsetsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.PayloadDto;
import ru.yandex.taxi.logistics.sdk.ui_models.common.YaTextOverflow;

/* loaded from: classes5.dex */
public final class r6i {
    public final iv90 a;
    public final l7x0 b;
    public final lv4 c;
    public final mus0 d;
    public final qc20 e;

    public r6i(iv90 iv90Var, l7x0 l7x0Var, lv4 lv4Var, mus0 mus0Var, qc20 qc20Var) {
        this.a = iv90Var;
        this.b = l7x0Var;
        this.c = lv4Var;
        this.d = mus0Var;
        this.e = qc20Var;
    }

    public static DeliveryStateItem$TextWidget$Alignment b(ContentTextAlignmentDto contentTextAlignmentDto) {
        int i = contentTextAlignmentDto == null ? -1 : q6i.a[contentTextAlignmentDto.ordinal()];
        return i != 1 ? i != 2 ? i != 3 ? DeliveryStateItem$TextWidget$Alignment.LEAD : DeliveryStateItem$TextWidget$Alignment.TRAIL : DeliveryStateItem$TextWidget$Alignment.CENTER : DeliveryStateItem$TextWidget$Alignment.LEAD;
    }

    public final p6i a(List list) {
        Iterator it;
        Iterator it2;
        int i;
        boolean z;
        Object obj;
        o4b1 jv4Var;
        DeliveryStateItem$Barcode$BarcodeType deliveryStateItem$Barcode$BarcodeType;
        DeliveryStateItem$Barcode$BarcodeOrientation deliveryStateItem$Barcode$BarcodeOrientation;
        Object lriVar;
        Iterator it3;
        Iterator it4;
        ContentDetailsItemDto contentDetailsItemDto;
        o1q0 o1q0Var;
        Iterator it5;
        fj fjVar;
        List list2 = list == null ? EmptyList.a : list;
        int i2 = 10;
        ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
        Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            ContentSectionDto contentSectionDto = (ContentSectionDto) it6.next();
            ListBuilder a = rcc.a();
            ContentSectionHeaderDto header = contentSectionDto.getHeader();
            iv90 iv90Var = this.a;
            if (header != null) {
                String title = header.getTitle();
                PayloadDto trailPayload = header.getTrailPayload();
                a.add(new ori(title, trailPayload != null ? iv90Var.a(trailPayload) : null, false));
            }
            Iterator it7 = contentSectionDto.getItems().iterator();
            while (it7.hasNext()) {
                ContentItemDto contentItemDto = (ContentItemDto) it7.next();
                boolean z2 = contentItemDto instanceof ContentItemDto.ContentItem_DetailsDto;
                qc20 qc20Var = this.e;
                if (z2) {
                    ContentDetailsItemDto contentDetailsItemDto2 = ((ContentItemDto.ContentItem_DetailsDto) contentItemDto).b;
                    ContentIconItemDto leadIcon = contentDetailsItemDto2.getLeadIcon();
                    jk51 x = leadIcon != null ? qc20Var.x(leadIcon) : null;
                    zp1 z3 = qc20.z(qc20Var, contentDetailsItemDto2.getTitle());
                    ContentTextItemDto subtitle = contentDetailsItemDto2.getSubtitle();
                    zp1 z4 = subtitle != null ? qc20.z(qc20Var, subtitle) : null;
                    List<DetailsSectionDto> sections = contentDetailsItemDto2.getSections();
                    ArrayList arrayList2 = new ArrayList(tcc.n(sections, i2));
                    for (DetailsSectionDto detailsSectionDto : sections) {
                        String title2 = detailsSectionDto.getTitle();
                        List<DetailsSectionItemDto> items = detailsSectionDto.getItems();
                        Iterator it8 = it6;
                        ArrayList arrayList3 = new ArrayList(tcc.n(items, i2));
                        Iterator it9 = items.iterator();
                        while (it9.hasNext()) {
                            DetailsSectionItemDto detailsSectionItemDto = (DetailsSectionItemDto) it9.next();
                            if (detailsSectionItemDto instanceof DetailsSectionItemDto.DetailsSectionItem_AccordionDto) {
                                DetailsSectionItemAccordionDto detailsSectionItemAccordionDto = ((DetailsSectionItemDto.DetailsSectionItem_AccordionDto) detailsSectionItemDto).b;
                                String title3 = detailsSectionItemAccordionDto.getTitle();
                                List<DetailsSectionItemAccordionDto.ItemsDto> items2 = detailsSectionItemAccordionDto.getItems();
                                it3 = it9;
                                it4 = it7;
                                contentDetailsItemDto = contentDetailsItemDto2;
                                ArrayList arrayList4 = new ArrayList(tcc.n(items2, 10));
                                Iterator it10 = items2.iterator();
                                while (it10.hasNext()) {
                                    DetailsSectionItemAccordionDto.ItemsDto itemsDto = (DetailsSectionItemAccordionDto.ItemsDto) it10.next();
                                    if (itemsDto instanceof DetailsSectionItemAccordionDto.ItemsDto.Items_SubtitleDto) {
                                        DetailsSectionItemSubtitleDto detailsSectionItemSubtitleDto = ((DetailsSectionItemAccordionDto.ItemsDto.Items_SubtitleDto) itemsDto).b;
                                        it5 = it10;
                                        fjVar = new dj(detailsSectionItemSubtitleDto.getTitle(), detailsSectionItemSubtitleDto.getSubtitle());
                                    } else {
                                        it5 = it10;
                                        boolean z5 = itemsDto instanceof DetailsSectionItemAccordionDto.ItemsDto.Items_SmallTitleDto;
                                        fjVar = ej.a;
                                        if (!z5 && !(itemsDto instanceof DetailsSectionItemAccordionDto.ItemsDto.Items_TextDto) && !(itemsDto instanceof DetailsSectionItemAccordionDto.ItemsDto.Unknown_ItemsDto)) {
                                            w511.b();
                                            return null;
                                        }
                                    }
                                    arrayList4.add(fjVar);
                                    it10 = it5;
                                }
                                o1q0Var = new l1q0(title3, arrayList4);
                            } else {
                                it3 = it9;
                                it4 = it7;
                                contentDetailsItemDto = contentDetailsItemDto2;
                                if (detailsSectionItemDto instanceof DetailsSectionItemDto.DetailsSectionItem_SubtitleDto) {
                                    DetailsSectionItemSubtitleDto detailsSectionItemSubtitleDto2 = ((DetailsSectionItemDto.DetailsSectionItem_SubtitleDto) detailsSectionItemDto).b;
                                    String title4 = detailsSectionItemSubtitleDto2.getTitle();
                                    String subtitle2 = detailsSectionItemSubtitleDto2.getSubtitle();
                                    PayloadDto trailPayload2 = detailsSectionItemSubtitleDto2.getTrailPayload();
                                    o1q0Var = new m1q0(title4, subtitle2, trailPayload2 != null ? iv90Var.a(trailPayload2) : null);
                                } else {
                                    boolean z6 = detailsSectionItemDto instanceof DetailsSectionItemDto.DetailsSectionItem_SmallTitleDto;
                                    o1q0Var = n1q0.a;
                                    if (!z6 && !(detailsSectionItemDto instanceof DetailsSectionItemDto.DetailsSectionItem_TextDto) && !(detailsSectionItemDto instanceof DetailsSectionItemDto.Unknown_DetailsSectionItemDto)) {
                                        w511.b();
                                        return null;
                                    }
                                }
                            }
                            arrayList3.add(o1q0Var);
                            it9 = it3;
                            contentDetailsItemDto2 = contentDetailsItemDto;
                            it7 = it4;
                        }
                        arrayList2.add(new d9j(title2, arrayList3));
                        it6 = it8;
                        i2 = 10;
                    }
                    it = it6;
                    it2 = it7;
                    obj = new jri(x, z3, z4, arrayList2, contentDetailsItemDto2.getMetricaLabel());
                } else {
                    it = it6;
                    it2 = it7;
                    if (contentItemDto instanceof ContentItemDto.ContentItem_HeaderDto) {
                        obj = new kri(qc20.z(qc20Var, ((ContentItemDto.ContentItem_HeaderDto) contentItemDto).b.getTitle()));
                    } else {
                        if (contentItemDto instanceof ContentItemDto.ContentItem_TextWidgetDto) {
                            ContentTextWidgetItemDto contentTextWidgetItemDto = ((ContentItemDto.ContentItem_TextWidgetDto) contentItemDto).b;
                            DeliveryStateItem$TextWidget$Type deliveryStateItem$TextWidget$Type = (contentTextWidgetItemDto.getExternalInsets() == null && contentTextWidgetItemDto.getInternalInsets() == null) ? DeliveryStateItem$TextWidget$Type.FIXED : DeliveryStateItem$TextWidget$Type.EXPANDABLE;
                            ContentTextItemDto title5 = contentTextWidgetItemDto.getTitle();
                            YaTextOverflow yaTextOverflow = YaTextOverflow.Ellipsis;
                            qc20Var.getClass();
                            zp1 y = qc20.y(title5, yaTextOverflow);
                            ContentTextItemDto subtitle3 = contentTextWidgetItemDto.getSubtitle();
                            zp1 z7 = subtitle3 != null ? qc20.z(qc20Var, subtitle3) : null;
                            DeliveryStateItem$TextWidget$Alignment b = b(contentTextWidgetItemDto.getTitleAlignment());
                            DeliveryStateItem$TextWidget$Alignment b2 = b(contentTextWidgetItemDto.getSubtitleAlignment());
                            Integer minHeight = contentTextWidgetItemDto.getMinHeight();
                            InsetsDto externalInsets = contentTextWidgetItemDto.getExternalInsets();
                            f2w f2wVar = externalInsets != null ? new f2w(externalInsets.getLeft(), externalInsets.getTop(), externalInsets.getRight(), externalInsets.getBottom()) : null;
                            InsetsDto internalInsets = contentTextWidgetItemDto.getInternalInsets();
                            f2w f2wVar2 = internalInsets != null ? new f2w(internalInsets.getLeft(), internalInsets.getTop(), internalInsets.getRight(), internalInsets.getBottom()) : null;
                            PayloadDto action = contentTextWidgetItemDto.getAction();
                            lriVar = new sri(y, z7, b, b2, minHeight, f2wVar, f2wVar2, deliveryStateItem$TextWidget$Type, action != null ? iv90Var.a(action) : null, false, contentTextWidgetItemDto.getMetricaLabel());
                        } else if (contentItemDto instanceof ContentItemDto.ContentItem_ListItemDto) {
                            ContentListItemDto contentListItemDto = ((ContentItemDto.ContentItem_ListItemDto) contentItemDto).b;
                            ContentIconItemDto leadIcon2 = contentListItemDto.getLeadIcon();
                            jk51 x2 = leadIcon2 != null ? qc20Var.x(leadIcon2) : null;
                            zp1 z8 = qc20.z(qc20Var, contentListItemDto.getTitle());
                            ContentTextItemDto subtitle4 = contentListItemDto.getSubtitle();
                            zp1 z9 = subtitle4 != null ? qc20.z(qc20Var, subtitle4) : null;
                            PayloadDto generalPayload = contentListItemDto.getGeneralPayload();
                            gv90 a2 = generalPayload != null ? iv90Var.a(generalPayload) : null;
                            ContentTextItemDto trailText = contentListItemDto.getTrailText();
                            zp1 z10 = trailText != null ? qc20.z(qc20Var, trailText) : null;
                            ContentTextItemDto trailSubtitle = contentListItemDto.getTrailSubtitle();
                            zp1 z11 = trailSubtitle != null ? qc20.z(qc20Var, trailSubtitle) : null;
                            PayloadDto trailPayload3 = contentListItemDto.getTrailPayload();
                            gv90 a3 = trailPayload3 != null ? iv90Var.a(trailPayload3) : null;
                            Boolean shimmering = contentListItemDto.getShimmering();
                            lriVar = new lri(x2, z8, z9, a2, z10, z11, null, a3, shimmering != null ? shimmering.booleanValue() : false, contentListItemDto.getMetricaLabel());
                        } else if (contentItemDto instanceof ContentItemDto.ContentItem_PostcardDto) {
                            ContentPostcardItemDto contentPostcardItemDto = ((ContentItemDto.ContentItem_PostcardDto) contentItemDto).b;
                            obj = new nri(contentPostcardItemDto.getPostcard().getCellTitle(), contentPostcardItemDto.getPostcard().getUserMessage(), contentPostcardItemDto.getPostcard().getContent().getUrl());
                        } else if (contentItemDto instanceof ContentItemDto.ContentItem_BarcodeDto) {
                            ContentBarcodeItemDto contentBarcodeItemDto = ((ContentItemDto.ContentItem_BarcodeDto) contentItemDto).b;
                            BarcodeDataDto barcode = contentBarcodeItemDto.getBarcode();
                            this.c.getClass();
                            if (barcode instanceof BarcodeDataDto.Unknown_BarcodeDataDto) {
                                jv4Var = kv4.a;
                            } else {
                                if (!(barcode instanceof BarcodeDataDto.BarcodeData_BarcodeStringDto)) {
                                    w511.b();
                                    return null;
                                }
                                jv4Var = new jv4(((BarcodeDataDto.BarcodeData_BarcodeStringDto) barcode).b.getBarcode());
                            }
                            String subtitle5 = contentBarcodeItemDto.getSubtitle();
                            String trailImageTag = contentBarcodeItemDto.getTrailImageTag();
                            String a4 = trailImageTag != null ? this.b.a(trailImageTag) : null;
                            BarcodeTypeDto barcodeType = contentBarcodeItemDto.getBarcodeType();
                            int i3 = barcodeType == null ? -1 : q6i.c[barcodeType.ordinal()];
                            if (i3 == -1 || i3 == 1) {
                                deliveryStateItem$Barcode$BarcodeType = DeliveryStateItem$Barcode$BarcodeType.LINEAR;
                            } else {
                                if (i3 != 2) {
                                    w511.b();
                                    return null;
                                }
                                deliveryStateItem$Barcode$BarcodeType = DeliveryStateItem$Barcode$BarcodeType.QR;
                            }
                            DeliveryStateItem$Barcode$BarcodeType deliveryStateItem$Barcode$BarcodeType2 = deliveryStateItem$Barcode$BarcodeType;
                            int i4 = q6i.b[contentBarcodeItemDto.getOrientation().ordinal()];
                            if (i4 == 1) {
                                deliveryStateItem$Barcode$BarcodeOrientation = DeliveryStateItem$Barcode$BarcodeOrientation.VERTICAL;
                            } else {
                                if (i4 != 2) {
                                    w511.b();
                                    return null;
                                }
                                deliveryStateItem$Barcode$BarcodeOrientation = DeliveryStateItem$Barcode$BarcodeOrientation.HORIZONTAL;
                            }
                            DeliveryStateItem$Barcode$BarcodeOrientation deliveryStateItem$Barcode$BarcodeOrientation2 = deliveryStateItem$Barcode$BarcodeOrientation;
                            PayloadDto action2 = contentBarcodeItemDto.getAction();
                            obj = new iri(jv4Var, subtitle5, a4, deliveryStateItem$Barcode$BarcodeType2, deliveryStateItem$Barcode$BarcodeOrientation2, action2 != null ? iv90Var.a(action2) : null);
                        } else {
                            if (contentItemDto instanceof ContentItemDto.ContentItem_PhotosDto) {
                                ContentPhotosItemDto contentPhotosItemDto = ((ContentItemDto.ContentItem_PhotosDto) contentItemDto).b;
                                List<PhotoInfoDto> photos = contentPhotosItemDto.getPhotos();
                                i = 10;
                                ArrayList arrayList5 = new ArrayList(tcc.n(photos, 10));
                                for (PhotoInfoDto photoInfoDto : photos) {
                                    arrayList5.add(new nkb0(photoInfoDto.getPath(), photoInfoDto.getDownloadUrl()));
                                }
                                PayloadDto action3 = contentPhotosItemDto.getAction();
                                obj = new mri(arrayList5, action3 != null ? iv90Var.a(action3) : null, false, contentPhotosItemDto.getMetricaLabel());
                                z = false;
                            } else {
                                i = 10;
                                if (contentItemDto instanceof ContentItemDto.ContentItem_SeparatorDto) {
                                    obj = pri.a;
                                } else if (contentItemDto instanceof ContentItemDto.ContentItem_ActionButtonDto) {
                                    ContentActionButtonDto contentActionButtonDto = ((ContentItemDto.ContentItem_ActionButtonDto) contentItemDto).b;
                                    ContentTextItemDto title6 = contentActionButtonDto.getTitle();
                                    YaTextOverflow yaTextOverflow2 = YaTextOverflow.Ellipsis;
                                    qc20Var.getClass();
                                    zp1 y2 = qc20.y(title6, yaTextOverflow2);
                                    ContentTextItemDto subtitle6 = contentActionButtonDto.getSubtitle();
                                    zp1 y3 = subtitle6 != null ? qc20.y(subtitle6, yaTextOverflow2) : null;
                                    String backgroundColor = contentActionButtonDto.getBackgroundColor();
                                    PayloadDto actionPayload = contentActionButtonDto.getActionPayload();
                                    obj = new hri(y2, y3, backgroundColor, actionPayload != null ? iv90Var.a(actionPayload) : null, contentActionButtonDto.getMetricaLabel());
                                } else if (contentItemDto instanceof ContentItemDto.ContentItem_SpacerDto) {
                                    obj = new rri(((ContentItemDto.ContentItem_SpacerDto) contentItemDto).b.getHeight());
                                } else if (contentItemDto instanceof ContentItemDto.ContentItem_SlotDto) {
                                    ContentSlotDto contentSlotDto = ((ContentItemDto.ContentItem_SlotDto) contentItemDto).b;
                                    z = false;
                                    obj = new qri(contentSlotDto.getId(), mus0.a(this.d, contentSlotDto.getSlot()), false);
                                } else {
                                    z = false;
                                    if (!(contentItemDto instanceof ContentItemDto.Unknown_ContentItemDto)) {
                                        w511.b();
                                        return null;
                                    }
                                    obj = tri.a;
                                }
                                z = false;
                            }
                            a.add(obj);
                            i2 = i;
                            it6 = it;
                            it7 = it2;
                        }
                        obj = lriVar;
                    }
                }
                z = false;
                i = 10;
                a.add(obj);
                i2 = i;
                it6 = it;
                it7 = it2;
            }
            arrayList.add(new esi(a.j()));
            i2 = i2;
            it6 = it6;
        }
        return new p6i(arrayList);
    }
}
