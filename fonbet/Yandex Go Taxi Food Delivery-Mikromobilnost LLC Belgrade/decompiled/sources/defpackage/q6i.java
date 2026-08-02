package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.BarcodeOrientationDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.BarcodeTypeDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.details.ContentTextAlignmentDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class q6i {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[ContentTextAlignmentDto.values().length];
        try {
            iArr[ContentTextAlignmentDto.LEAD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ContentTextAlignmentDto.CENTER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ContentTextAlignmentDto.TRAIL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[BarcodeOrientationDto.values().length];
        try {
            iArr2[BarcodeOrientationDto.VERTICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[BarcodeOrientationDto.HORIZONTAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
        int[] iArr3 = new int[BarcodeTypeDto.values().length];
        try {
            iArr3[BarcodeTypeDto.LINEAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[BarcodeTypeDto.QR.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        c = iArr3;
    }
}
