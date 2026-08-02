package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.ContactSelectorRemoteCoreWidget$ContactPositionModel;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class xbe {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ContactSelectorRemoteCoreWidget$ContactPositionModel.values().length];
        try {
            iArr[ContactSelectorRemoteCoreWidget$ContactPositionModel.TITLE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ContactSelectorRemoteCoreWidget$ContactPositionModel.SUBTITLE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ContactSelectorRemoteCoreWidget$ContactPositionModel.TRAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
