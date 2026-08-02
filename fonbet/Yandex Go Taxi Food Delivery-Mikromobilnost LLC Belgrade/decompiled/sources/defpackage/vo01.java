package defpackage;

import com.yandex.go.transfer_requirement.experiment.TransferRequirementExperiment;
import com.yandex.go.transfer_requirement.transferapi.TransferErrorDto;

/* loaded from: classes14.dex */
public abstract /* synthetic */ class vo01 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[TransferRequirementExperiment.Card.ServiceSectionDto.LuggageUiType.values().length];
        try {
            iArr[TransferRequirementExperiment.Card.ServiceSectionDto.LuggageUiType.SWITCHER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[TransferRequirementExperiment.Card.ServiceSectionDto.LuggageUiType.COUNT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[TransferErrorDto.TransferDraftErrorCode.values().length];
        try {
            iArr2[TransferErrorDto.TransferDraftErrorCode.TRANSFER_NOT_FOUND.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TransferErrorDto.TransferDraftErrorCode.TRIP_NOT_FOUND.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[TransferErrorDto.TransferDraftErrorCode.BAD_REQUEST.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[TransferErrorDto.TransferDraftErrorCode.EXPLICIT_GREETING.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[TransferErrorDto.TransferDraftErrorCode.NOT_RETRYABLE_ERROR.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[TransferErrorDto.TransferDraftErrorCode.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        b = iArr2;
    }
}
