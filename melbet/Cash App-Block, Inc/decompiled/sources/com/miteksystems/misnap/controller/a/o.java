package com.miteksystems.misnap.controller.a;

import com.miteksystems.misnap.core.UserAction;
import com.miteksystems.misnap.face.MiSnapFaceAnalyzer;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class o extends b0 {
    public final MiSnapFaceAnalyzer.Result.Processed.FaceIqasResult b;
    public final ArrayList c;
    public final int[][] d;
    public final boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(UserAction userAction, MiSnapFaceAnalyzer.Result.Processed.FaceIqasResult faceIqasResult, ArrayList arrayList, int[][] iArr, boolean z) {
        super(userAction);
        userAction.getClass();
        iArr.getClass();
        this.b = faceIqasResult;
        this.c = arrayList;
        this.d = iArr;
        this.e = z;
    }
}
