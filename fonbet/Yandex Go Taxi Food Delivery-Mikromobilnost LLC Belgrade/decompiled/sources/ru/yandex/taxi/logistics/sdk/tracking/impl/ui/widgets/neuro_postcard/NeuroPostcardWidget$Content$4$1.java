package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.neuro_postcard;

import defpackage.g460;
import defpackage.h460;
import defpackage.i460;
import defpackage.j360;
import defpackage.j460;
import defpackage.k460;
import defpackage.tls;
import defpackage.v4r0;
import defpackage.w511;
import defpackage.zy11;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.logistics.sdk.tracking.impl.data.NeuroPostcardShownStagesRepository;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class NeuroPostcardWidget$Content$4$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        NeuroPostcardShownStagesRepository.PostcardStage postcardStage;
        k460 k460Var = (k460) obj;
        j360 j360Var = (j360) this.receiver;
        NeuroPostcardShownStagesRepository neuroPostcardShownStagesRepository = j360Var.i;
        String str = j360Var.a;
        LinkedHashMap linkedHashMap = neuroPostcardShownStagesRepository.a;
        Set set = (Set) linkedHashMap.get(str);
        if (set == null) {
            set = EmptySet.a;
        }
        if (k460Var.equals(i460.a)) {
            postcardStage = NeuroPostcardShownStagesRepository.PostcardStage.INITIAL;
        } else if (k460Var instanceof h460) {
            postcardStage = NeuroPostcardShownStagesRepository.PostcardStage.EDITING;
        } else if (k460Var instanceof j460) {
            postcardStage = NeuroPostcardShownStagesRepository.PostcardStage.SENDING;
        } else {
            if (!(k460Var instanceof g460)) {
                w511.b();
                return null;
            }
            postcardStage = NeuroPostcardShownStagesRepository.PostcardStage.COMPLETED;
        }
        linkedHashMap.put(str, v4r0.i(set, postcardStage));
        return zy11.a;
    }
}
