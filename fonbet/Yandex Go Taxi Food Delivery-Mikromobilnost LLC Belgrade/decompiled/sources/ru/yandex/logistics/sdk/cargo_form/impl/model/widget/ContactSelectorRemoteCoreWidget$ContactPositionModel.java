package ru.yandex.logistics.sdk.cargo_form.impl.model.widget;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/logistics/sdk/cargo_form/impl/model/widget/ContactSelectorRemoteCoreWidget$ContactPositionModel", "", "Lru/yandex/logistics/sdk/cargo_form/impl/model/widget/ContactSelectorRemoteCoreWidget$ContactPositionModel;", "TITLE", "SUBTITLE", "TRAIL", "sdk-delivery-cargo-form"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ContactSelectorRemoteCoreWidget$ContactPositionModel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ContactSelectorRemoteCoreWidget$ContactPositionModel[] $VALUES;
    public static final ContactSelectorRemoteCoreWidget$ContactPositionModel SUBTITLE;
    public static final ContactSelectorRemoteCoreWidget$ContactPositionModel TITLE;
    public static final ContactSelectorRemoteCoreWidget$ContactPositionModel TRAIL;

    static {
        ContactSelectorRemoteCoreWidget$ContactPositionModel contactSelectorRemoteCoreWidget$ContactPositionModel = new ContactSelectorRemoteCoreWidget$ContactPositionModel("TITLE", 0);
        TITLE = contactSelectorRemoteCoreWidget$ContactPositionModel;
        ContactSelectorRemoteCoreWidget$ContactPositionModel contactSelectorRemoteCoreWidget$ContactPositionModel2 = new ContactSelectorRemoteCoreWidget$ContactPositionModel("SUBTITLE", 1);
        SUBTITLE = contactSelectorRemoteCoreWidget$ContactPositionModel2;
        ContactSelectorRemoteCoreWidget$ContactPositionModel contactSelectorRemoteCoreWidget$ContactPositionModel3 = new ContactSelectorRemoteCoreWidget$ContactPositionModel("TRAIL", 2);
        TRAIL = contactSelectorRemoteCoreWidget$ContactPositionModel3;
        ContactSelectorRemoteCoreWidget$ContactPositionModel[] contactSelectorRemoteCoreWidget$ContactPositionModelArr = {contactSelectorRemoteCoreWidget$ContactPositionModel, contactSelectorRemoteCoreWidget$ContactPositionModel2, contactSelectorRemoteCoreWidget$ContactPositionModel3};
        $VALUES = contactSelectorRemoteCoreWidget$ContactPositionModelArr;
        $ENTRIES = a.a(contactSelectorRemoteCoreWidget$ContactPositionModelArr);
    }

    public static ContactSelectorRemoteCoreWidget$ContactPositionModel valueOf(String str) {
        return (ContactSelectorRemoteCoreWidget$ContactPositionModel) Enum.valueOf(ContactSelectorRemoteCoreWidget$ContactPositionModel.class, str);
    }

    public static ContactSelectorRemoteCoreWidget$ContactPositionModel[] values() {
        return (ContactSelectorRemoteCoreWidget$ContactPositionModel[]) $VALUES.clone();
    }
}
