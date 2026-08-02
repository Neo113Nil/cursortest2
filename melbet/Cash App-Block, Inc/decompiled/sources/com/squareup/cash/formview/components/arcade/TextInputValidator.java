package com.squareup.cash.formview.components.arcade;

import com.squareup.protos.franklin.api.FormBlocker;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes6.dex */
public final class TextInputValidator {
    public final ArrayList templateConfigs;

    public TextInputValidator(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(new TemplateConfig((FormBlocker.Element.TextInputElement.Validation) list.get(i)));
        }
        this.templateConfigs = arrayList;
    }
}
