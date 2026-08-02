package com.squareup.cash.blockers.views;

import app.cash.broadway.ui.Ui;
import com.squareup.cash.blockers.viewmodels.FileBlockerViewEvent;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final /* synthetic */ class FileBlockerView$$ExternalSyntheticLambda0 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ FileBlockerView f$0;

    public /* synthetic */ FileBlockerView$$ExternalSyntheticLambda0(FileBlockerView fileBlockerView, int i) {
        this.$r8$classId = i;
        this.f$0 = fileBlockerView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        FileBlockerView fileBlockerView = this.f$0;
        switch (i) {
            case 0:
                return fileBlockerView.getTakePhotoButtons().primary;
            default:
                Ui.EventReceiver eventReceiver = fileBlockerView.eventReceiver;
                if (eventReceiver != null) {
                    eventReceiver.sendEvent(FileBlockerViewEvent.NavigationAction.HelpClick.INSTANCE);
                    return Unit.INSTANCE;
                }
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
        }
    }
}
