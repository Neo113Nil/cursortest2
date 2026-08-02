package com.squareup.cash.payments.presenters;

import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInputElement;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInputProperties;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInputSticker;
import com.squareup.cash.mosaic.personalization.api.v2.PersonalizationInputText;
import com.squareup.cash.payments.viewmodels.Element;
import com.squareup.cash.payments.viewmodels.ListProperty;
import com.squareup.cash.payments.viewmodels.Size;
import com.squareup.cash.payments.viewmodels.Sticker;
import com.squareup.cash.payments.viewmodels.Text;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import okio.ByteString;

/* loaded from: classes6.dex */
public abstract class PersonalizationUtilKt {
    public static final ArrayList toUniversalElements(List list, Size size) {
        PersonalizationInputElement personalizationInputElement;
        list.getClass();
        size.getClass();
        float f = size.height;
        float f2 = size.width;
        List<Element> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (Element element : list2) {
            if (element instanceof Text) {
                Text text = (Text) element;
                ListProperty listProperty = text.properties;
                float f3 = f2 / 2.0f;
                float f4 = f / 2.0f;
                personalizationInputElement = new PersonalizationInputElement(new PersonalizationInputProperties(Integer.valueOf((int) (((listProperty.center().x - f3) / f3) * 100.0f)), Integer.valueOf((int) (((f4 - listProperty.center().y) / f4) * 100.0f)), Integer.valueOf((int) listProperty.position.z), Float.valueOf(listProperty.rotation.rotation), Float.valueOf(listProperty.zoom.scale)), new PersonalizationInputElement.Element.Text(new PersonalizationInputText(text.value, ByteString.EMPTY)));
            } else {
                if (!(element instanceof Sticker)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                Sticker sticker = (Sticker) element;
                ListProperty listProperty2 = sticker.properties;
                float f5 = f2 / 2.0f;
                float f6 = f / 2.0f;
                personalizationInputElement = new PersonalizationInputElement(new PersonalizationInputProperties(Integer.valueOf((int) (((listProperty2.center().x - f5) / f5) * 100.0f)), Integer.valueOf((int) (((f6 - listProperty2.center().y) / f6) * 100.0f)), Integer.valueOf((int) listProperty2.position.z), Float.valueOf(listProperty2.rotation.rotation), Float.valueOf(listProperty2.zoom.scale)), new PersonalizationInputElement.Element.Sticker(new PersonalizationInputSticker(sticker.remoteId, ByteString.EMPTY)));
            }
            arrayList.add(personalizationInputElement);
        }
        return arrayList;
    }
}
