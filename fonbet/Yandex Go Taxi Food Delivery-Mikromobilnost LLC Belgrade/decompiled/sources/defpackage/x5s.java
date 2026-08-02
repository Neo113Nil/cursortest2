package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.form.FormOverrideDto;
import ru.yandex.taxi.logistics.sdk.dto.services.deliverygocheckout.definitions.formcommon.FormEventTypeDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class x5s {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[FormOverrideDto.FormThemeDto.values().length];
        try {
            iArr[FormOverrideDto.FormThemeDto.ULTIMA.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FormOverrideDto.FormThemeDto.DEFAULT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[FormEventTypeDto.values().length];
        try {
            iArr2[FormEventTypeDto.CLOSED.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[FormEventTypeDto.APP_ENTERED_BACKGROUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
    }
}
