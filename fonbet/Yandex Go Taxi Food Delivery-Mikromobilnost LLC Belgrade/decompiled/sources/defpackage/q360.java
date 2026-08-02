package defpackage;

import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroPostcardButtonDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargoc2c.definitions.neuropostcard.NeuroTextInputStopWordRuleDto;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class q360 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[NeuroPostcardButtonDto.StyleDto.values().length];
        try {
            iArr[NeuroPostcardButtonDto.StyleDto.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[NeuroPostcardButtonDto.StyleDto.FLOATING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[NeuroPostcardButtonDto.StyleDto.MINOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[NeuroPostcardButtonDto.SizeDto.values().length];
        try {
            iArr2[NeuroPostcardButtonDto.SizeDto.S.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[NeuroPostcardButtonDto.SizeDto.M.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[NeuroPostcardButtonDto.SizeDto.L.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[NeuroTextInputStopWordRuleDto.RuleTypeDto.values().length];
        try {
            iArr3[NeuroTextInputStopWordRuleDto.RuleTypeDto.PREFIX.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[NeuroTextInputStopWordRuleDto.RuleTypeDto.SUBSTRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[NeuroTextInputStopWordRuleDto.RuleTypeDto.WORD.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        c = iArr3;
    }
}
