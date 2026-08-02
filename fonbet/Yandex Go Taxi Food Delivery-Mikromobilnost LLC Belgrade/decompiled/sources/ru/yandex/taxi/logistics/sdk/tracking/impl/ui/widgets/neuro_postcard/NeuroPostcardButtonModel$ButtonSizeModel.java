package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard;

import defpackage.k4o;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/logistics/sdk/tracking/impl/ui/widgets/neuro_postcard/NeuroPostcardButtonModel$ButtonSizeModel", "", "Lru/yandex/taxi/logistics/sdk/tracking/impl/ui/widgets/neuro_postcard/NeuroPostcardButtonModel$ButtonSizeModel;", "S", "M", "L", MetaDataField.SCREEN_FIELD}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NeuroPostcardButtonModel$ButtonSizeModel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NeuroPostcardButtonModel$ButtonSizeModel[] $VALUES;
    public static final NeuroPostcardButtonModel$ButtonSizeModel L;
    public static final NeuroPostcardButtonModel$ButtonSizeModel M;
    public static final NeuroPostcardButtonModel$ButtonSizeModel S;

    static {
        NeuroPostcardButtonModel$ButtonSizeModel neuroPostcardButtonModel$ButtonSizeModel = new NeuroPostcardButtonModel$ButtonSizeModel("S", 0);
        S = neuroPostcardButtonModel$ButtonSizeModel;
        NeuroPostcardButtonModel$ButtonSizeModel neuroPostcardButtonModel$ButtonSizeModel2 = new NeuroPostcardButtonModel$ButtonSizeModel("M", 1);
        M = neuroPostcardButtonModel$ButtonSizeModel2;
        NeuroPostcardButtonModel$ButtonSizeModel neuroPostcardButtonModel$ButtonSizeModel3 = new NeuroPostcardButtonModel$ButtonSizeModel("L", 2);
        L = neuroPostcardButtonModel$ButtonSizeModel3;
        NeuroPostcardButtonModel$ButtonSizeModel[] neuroPostcardButtonModel$ButtonSizeModelArr = {neuroPostcardButtonModel$ButtonSizeModel, neuroPostcardButtonModel$ButtonSizeModel2, neuroPostcardButtonModel$ButtonSizeModel3};
        $VALUES = neuroPostcardButtonModel$ButtonSizeModelArr;
        $ENTRIES = kotlin.enums.a.a(neuroPostcardButtonModel$ButtonSizeModelArr);
    }

    public static NeuroPostcardButtonModel$ButtonSizeModel valueOf(String str) {
        return (NeuroPostcardButtonModel$ButtonSizeModel) Enum.valueOf(NeuroPostcardButtonModel$ButtonSizeModel.class, str);
    }

    public static NeuroPostcardButtonModel$ButtonSizeModel[] values() {
        return (NeuroPostcardButtonModel$ButtonSizeModel[]) $VALUES.clone();
    }
}
