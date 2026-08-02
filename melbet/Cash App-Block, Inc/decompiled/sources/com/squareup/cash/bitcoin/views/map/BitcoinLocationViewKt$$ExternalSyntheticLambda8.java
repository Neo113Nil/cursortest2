package com.squareup.cash.bitcoin.views.map;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.LinkAnnotation;
import androidx.compose.ui.text.LinkInteractionListener;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinLocationViewKt$$ExternalSyntheticLambda8 implements LinkInteractionListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState f$0;

    public /* synthetic */ BitcoinLocationViewKt$$ExternalSyntheticLambda8(int i, MutableState mutableState) {
        this.$r8$classId = i;
        this.f$0 = mutableState;
    }

    @Override // androidx.compose.ui.text.LinkInteractionListener
    public final void onClick(LinkAnnotation linkAnnotation) {
        int i = this.$r8$classId;
        MutableState mutableState = this.f$0;
        switch (i) {
            case 0:
                linkAnnotation.getClass();
                mutableState.setValue(Boolean.FALSE);
                break;
            default:
                linkAnnotation.getClass();
                mutableState.setValue(Boolean.TRUE);
                break;
        }
    }
}
