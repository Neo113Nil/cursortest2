package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard;

import defpackage.k4o;
import kotlin.Metadata;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/logistics/sdk/tracking/impl/ui/widgets/neuro_postcard/NeuroPostcardButtonModel$ButtonStyleModel", "", "Lru/yandex/taxi/logistics/sdk/tracking/impl/ui/widgets/neuro_postcard/NeuroPostcardButtonModel$ButtonStyleModel;", "MAIN", "FLOATING", "MINOR", MetaDataField.SCREEN_FIELD}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class NeuroPostcardButtonModel$ButtonStyleModel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ NeuroPostcardButtonModel$ButtonStyleModel[] $VALUES;
    public static final NeuroPostcardButtonModel$ButtonStyleModel FLOATING;
    public static final NeuroPostcardButtonModel$ButtonStyleModel MAIN;
    public static final NeuroPostcardButtonModel$ButtonStyleModel MINOR;

    static {
        NeuroPostcardButtonModel$ButtonStyleModel neuroPostcardButtonModel$ButtonStyleModel = new NeuroPostcardButtonModel$ButtonStyleModel("MAIN", 0);
        MAIN = neuroPostcardButtonModel$ButtonStyleModel;
        NeuroPostcardButtonModel$ButtonStyleModel neuroPostcardButtonModel$ButtonStyleModel2 = new NeuroPostcardButtonModel$ButtonStyleModel("FLOATING", 1);
        FLOATING = neuroPostcardButtonModel$ButtonStyleModel2;
        NeuroPostcardButtonModel$ButtonStyleModel neuroPostcardButtonModel$ButtonStyleModel3 = new NeuroPostcardButtonModel$ButtonStyleModel("MINOR", 2);
        MINOR = neuroPostcardButtonModel$ButtonStyleModel3;
        NeuroPostcardButtonModel$ButtonStyleModel[] neuroPostcardButtonModel$ButtonStyleModelArr = {neuroPostcardButtonModel$ButtonStyleModel, neuroPostcardButtonModel$ButtonStyleModel2, neuroPostcardButtonModel$ButtonStyleModel3};
        $VALUES = neuroPostcardButtonModel$ButtonStyleModelArr;
        $ENTRIES = kotlin.enums.a.a(neuroPostcardButtonModel$ButtonStyleModelArr);
    }

    public static NeuroPostcardButtonModel$ButtonStyleModel valueOf(String str) {
        return (NeuroPostcardButtonModel$ButtonStyleModel) Enum.valueOf(NeuroPostcardButtonModel$ButtonStyleModel.class, str);
    }

    public static NeuroPostcardButtonModel$ButtonStyleModel[] values() {
        return (NeuroPostcardButtonModel$ButtonStyleModel[]) $VALUES.clone();
    }
}
