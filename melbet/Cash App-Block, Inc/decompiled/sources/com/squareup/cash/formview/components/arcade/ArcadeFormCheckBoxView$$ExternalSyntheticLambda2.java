package com.squareup.cash.formview.components.arcade;

import com.squareup.cash.formview.components.FormRequirement;
import com.squareup.protos.franklin.api.FormBlocker;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final /* synthetic */ class ArcadeFormCheckBoxView$$ExternalSyntheticLambda2 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ArcadeFormCheckBoxView f$0;

    public /* synthetic */ ArcadeFormCheckBoxView$$ExternalSyntheticLambda2(ArcadeFormCheckBoxView arcadeFormCheckBoxView, int i) {
        this.$r8$classId = i;
        this.f$0 = arcadeFormCheckBoxView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        ArcadeFormCheckBoxView arcadeFormCheckBoxView = this.f$0;
        switch (i) {
            case 0:
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                FormBlocker.Element.CheckBoxElement checkBoxElement = arcadeFormCheckBoxView.element;
                boolean areEqual = Intrinsics.areEqual(checkBoxElement.is_required, Boolean.TRUE);
                boolean isEmpty = checkBoxElement.fulfills_requirements.isEmpty();
                if (areEqual || !isEmpty) {
                    if (areEqual) {
                        createListBuilder.add(new FormRequirement(arcadeFormCheckBoxView.isChecked$1(), null));
                    }
                    Iterator<T> it = checkBoxElement.fulfills_requirements.iterator();
                    while (it.hasNext()) {
                        createListBuilder.add(new FormRequirement(arcadeFormCheckBoxView.isChecked$1(), (String) it.next()));
                    }
                }
                return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
            default:
                arcadeFormCheckBoxView.isChecked$delegate.setValue(Boolean.valueOf(!arcadeFormCheckBoxView.isChecked$1()));
                return Unit.INSTANCE;
        }
    }
}
