package com.miteksystems.misnap.controller.a;

import com.miteksystems.misnap.core.Frame;
import com.miteksystems.misnap.core.UserAction;
import com.miteksystems.misnap.face.MiSnapFaceAnalyzer;

/* loaded from: classes4.dex */
public final class v implements z {
    @Override // com.miteksystems.misnap.controller.a.z
    public final /* synthetic */ UserAction a(Frame frame, MiSnapFaceAnalyzer.Result.Processed processed) {
        frame.getClass();
        return UserAction.Face.PRESS_MANUAL_BUTTON.INSTANCE;
    }

    @Override // com.miteksystems.misnap.controller.a.z
    public final /* synthetic */ void a() {
    }
}
